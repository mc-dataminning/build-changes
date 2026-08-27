import com.google.common.collect.Lists;
import com.google.common.primitives.Floats;
import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.ParseResults;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap.Entry;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.net.SocketAddress;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;

public class art extends arq implements agl, arw, ws {
   static final Logger g = LogUtils.getLogger();
   private static final int h = -1;
   private static final int i = 4096;
   private static final int j = 80;
   private static final xe k = xe.c("multiplayer.disconnect.chat_validation_failed");
   private static final int l = 1000;
   public aqu e;
   public final arp f;
   private int m;
   private int n = -1;
   private int o;
   private int p;
   private double q;
   private double r;
   private double s;
   private double t;
   private double u;
   private double v;
   @Nullable
   private brv w;
   private double x;
   private double y;
   private double z;
   private double A;
   private double B;
   private double C;
   @Nullable
   private ewu D;
   private int E;
   private int F;
   private boolean G;
   private int H;
   private boolean I;
   private int J;
   private int K;
   private int L;
   @Nullable
   private xv M;
   private xy.b N;
   private final xn O = new xn(20);
   private final xr P = xr.a();
   private final aya Q;
   private boolean R;

   public art(MinecraftServer $$0, wc $$1, aqu $$2, ari $$3) {
      super($$0, $$1, $$3);
      this.f = new arp($$1.e());
      this.e = $$2;
      $$2.d = this;
      $$2.Z().a();
      this.N = xy.b.unsigned($$2.cE(), $$0::aB);
      this.Q = new aya($$0);
   }

   @Override
   public void e() {
      if (this.n > -1) {
         this.b(new acc(this.n));
         this.n = -1;
      }

      this.m();
      this.e.M = this.e.dz();
      this.e.N = this.e.dB();
      this.e.O = this.e.dF();
      this.e.m();
      this.e.a(this.q, this.r, this.s, this.e.dK(), this.e.dM());
      this.m++;
      this.L = this.K;
      if (this.G && !this.e.fU() && !this.e.bW() && !this.e.eJ()) {
         if (++this.H > this.a((brv)this.e)) {
            g.warn("{} was kicked for floating too long!", this.e.af().getString());
            this.b(xe.c("multiplayer.disconnect.flying"));
            return;
         }
      } else {
         this.G = false;
         this.H = 0;
      }

      this.w = this.e.de();
      if (this.w != this.e && this.w.cV() == this.e) {
         this.x = this.w.dz();
         this.y = this.w.dB();
         this.z = this.w.dF();
         this.A = this.w.dz();
         this.B = this.w.dB();
         this.C = this.w.dF();
         if (this.I && this.w.cV() == this.e) {
            if (++this.J > this.a(this.w)) {
               g.warn("{} was kicked for floating a vehicle too long!", this.e.af().getString());
               this.b(xe.c("multiplayer.disconnect.flying"));
               return;
            }
         } else {
            this.I = false;
            this.J = 0;
         }
      } else {
         this.w = null;
         this.I = false;
         this.J = 0;
      }

      this.f();
      if (this.o > 0) {
         this.o--;
      }

      if (this.p > 0) {
         this.p--;
      }

      if (this.e.O() > 0L && this.c.aq() > 0 && ad.b() - this.e.O() > (long)this.c.aq() * 1000L * 60L) {
         this.b(xe.c("multiplayer.disconnect.idling"));
      }
   }

   private int a(brv $$0) {
      double $$1 = $$0.bd();
      if ($$1 < 1.0E-5F) {
         return Integer.MAX_VALUE;
      } else {
         double $$2 = 0.08 / $$1;
         return aym.c(80.0 * Math.max($$2, 1.0));
      }
   }

   public void m() {
      this.q = this.e.dz();
      this.r = this.e.dB();
      this.s = this.e.dF();
      this.t = this.e.dz();
      this.u = this.e.dB();
      this.v = this.e.dF();
   }

   @Override
   public boolean c() {
      return this.d.i() && !this.R;
   }

   @Override
   public boolean a(zl<?> $$0) {
      return super.a($$0) ? true : this.R && this.d.i() && $$0 instanceof agx;
   }

   @Override
   protected GameProfile j() {
      return this.e.gk();
   }

   private <T, R> CompletableFuture<R> a(T $$0, BiFunction<ary, T, CompletableFuture<R>> $$1) {
      return $$1.apply(this.e.Z(), $$0).thenApply($$0x -> {
         if (!this.c()) {
            g.debug("Ignoring packet due to disconnection");
            throw new CancellationException("disconnected");
         } else {
            return (R)$$0x;
         }
      });
   }

   private CompletableFuture<arl> a(String $$0) {
      return this.a($$0, ary::a);
   }

   private CompletableFuture<List<arl>> a(List<String> $$0) {
      return this.a($$0, ary::a);
   }

   @Override
   public void a(ahq $$0) {
      zo.a($$0, this, this.e.B());
      this.e.a($$0.b(), $$0.e(), $$0.f(), $$0.g());
   }

   private static boolean b(double $$0, double $$1, double $$2, float $$3, float $$4) {
      return Double.isNaN($$0) || Double.isNaN($$1) || Double.isNaN($$2) || !Floats.isFinite($$4) || !Floats.isFinite($$3);
   }

   private static double a(double $$0) {
      return aym.a($$0, -3.0E7, 3.0E7);
   }

   private static double b(double $$0) {
      return aym.a($$0, -2.0E7, 2.0E7);
   }

   @Override
   public void a(ahj $$0) {
      zo.a($$0, this, this.e.B());
      if (b($$0.b(), $$0.e(), $$0.f(), $$0.g(), $$0.h())) {
         this.b(xe.c("multiplayer.disconnect.invalid_vehicle_movement"));
      } else {
         brv $$1 = this.e.de();
         if ($$1 != this.e && $$1.cV() == this.e && $$1 == this.w) {
            aqt $$2 = this.e.B();
            double $$3 = $$1.dz();
            double $$4 = $$1.dB();
            double $$5 = $$1.dF();
            double $$6 = a($$0.b());
            double $$7 = b($$0.e());
            double $$8 = a($$0.f());
            float $$9 = aym.g($$0.g());
            float $$10 = aym.g($$0.h());
            double $$11 = $$6 - this.x;
            double $$12 = $$7 - this.y;
            double $$13 = $$8 - this.z;
            double $$14 = $$1.dx().g();
            double $$15 = $$11 * $$11 + $$12 * $$12 + $$13 * $$13;
            if ($$15 - $$14 > 100.0 && !this.i() && !$$1.aR()) {
               g.warn("{} (vehicle of {}) moved too quickly! {},{},{}", new Object[]{$$1.af().getString(), this.e.af().getString(), $$11, $$12, $$13});
               this.b(new ads($$1));
               return;
            }

            boolean $$16 = $$2.b($$1, $$1.cP().h(0.0625));
            $$11 = $$6 - this.A;
            $$12 = $$7 - this.B - 1.0E-6;
            $$13 = $$8 - this.C;
            boolean $$17 = $$1.T;
            if ($$1 instanceof bso $$18 && $$18.p_()) {
               $$18.n();
            }

            try {
               $$1.J = true;
               $$1.a(bst.b, new ewu($$11, $$12, $$13));
            } finally {
               $$1.J = false;
            }

            $$11 = $$6 - $$1.dz();
            $$12 = $$7 - $$1.dB();
            if ($$12 > -0.5 || $$12 < 0.5) {
               $$12 = 0.0;
            }

            $$13 = $$8 - $$1.dF();
            $$15 = $$11 * $$11 + $$12 * $$12 + $$13 * $$13;
            boolean $$20 = false;
            if ($$15 > 0.0625) {
               $$20 = true;
               g.warn("{} (vehicle of {}) moved wrongly! {}", new Object[]{$$1.af().getString(), this.e.af().getString(), Math.sqrt($$15)});
            }

            $$1.a($$6, $$7, $$8, $$9, $$10);
            boolean $$21 = $$2.b($$1, $$1.cP().h(0.0625));
            if ($$16 && ($$20 || !$$21)) {
               $$1.a($$3, $$4, $$5, $$9, $$10);
               this.b(new ads($$1));
               return;
            }

            this.e.B().l().a(this.e);
            this.e.b(this.e.dz() - $$3, this.e.dB() - $$4, this.e.dF() - $$5);
            this.I = q();
            this.A = $$1.dz();
            this.B = $$1.dB();
            this.C = $$1.dF();
         }
      }
   }

   private boolean b(brv $$0) {
      return $$0.dU().a($$0.cP().g(0.0625).b(0.0, -0.55, 0.0)).allMatch(dtb.a::i);
   }

   @Override
   public void a(agn $$0) {
      zo.a($$0, this, this.e.B());
      if ($$0.b() == this.E) {
         if (this.D == null) {
            this.b(xe.c("multiplayer.disconnect.invalid_player_movement"));
            return;
         }

         this.e.a(this.D.c, this.D.d, this.D.e, this.e.dK(), this.e.dM());
         this.t = this.D.c;
         this.u = this.D.d;
         this.v = this.D.e;
         if (this.e.Q()) {
            this.e.R();
         }

         this.D = null;
      }
   }

   @Override
   public void a(ahs $$0) {
      zo.a($$0, this, this.e.B());
      this.c.aJ().a($$0.b()).ifPresent(this.e.K()::e);
   }

   @Override
   public void a(ahr $$0) {
      zo.a($$0, this, this.e.B());
      this.e.K().a($$0.b(), $$0.e(), $$0.f());
   }

   @Override
   public void a(ahu $$0) {
      zo.a($$0, this, this.e.B());
      if ($$0.e() == ahu.a.a) {
         akt $$1 = Objects.requireNonNull($$0.f());
         ag $$2 = this.c.aE().a($$1);
         if ($$2 != null) {
            this.e.S().a($$2);
         }
      }
   }

   @Override
   public void a(agw $$0) {
      zo.a($$0, this, this.e.B());
      StringReader $$1 = new StringReader($$0.e());
      if ($$1.canRead() && $$1.peek() == '/') {
         $$1.skip();
      }

      ParseResults<eh> $$2 = this.c.aH().a().parse($$1, this.e.dl());
      this.c.aH().a().getCompletionSuggestions($$2).thenAccept($$1x -> {
         Suggestions $$2x = $$1x.getList().size() <= 1000 ? $$1x : new Suggestions($$1x.getRange(), $$1x.getList().subList(0, 1000));
         this.b(new acp($$0.b(), $$2x));
      });
   }

   @Override
   public void a(ahy $$0) {
      zo.a($$0, this, this.e.B());
      if (!this.c.q()) {
         this.e.a(xe.c("advMode.notEnabled"));
      } else if (!this.e.gK()) {
         this.e.a(xe.c("advMode.notAllowed"));
      } else {
         dbb $$1 = null;
         dqm $$2 = null;
         ir $$3 = $$0.b();
         dqc $$4 = this.e.dU().c_($$3);
         if ($$4 instanceof dqm) {
            $$2 = (dqm)$$4;
            $$1 = $$2.b();
         }

         String $$5 = $$0.e();
         boolean $$6 = $$0.f();
         if ($$1 != null) {
            dqm.a $$7 = $$2.l();
            dtc $$8 = this.e.dU().a_($$3);
            iw $$9 = $$8.c(dgl.b);

            dtc $$13 = (switch ($$0.i()) {
               case a -> dfe.lF.n();
               case b -> dfe.lE.n();
               default -> dfe.gG.n();
            }).a(dgl.b, $$9).a(dgl.c, Boolean.valueOf($$0.g()));
            if ($$13 != $$8) {
               this.e.dU().a($$3, $$13, 2);
               $$4.b($$13);
               this.e.dU().m($$3).a($$4);
            }

            $$1.a($$5);
            $$1.a($$6);
            if (!$$6) {
               $$1.c(null);
            }

            $$2.b($$0.h());
            if ($$7 != $$0.i()) {
               $$2.f();
            }

            $$1.f();
            if (!azh.b($$5)) {
               this.e.a(xe.a("advMode.setCommand.success", $$5));
            }
         }
      }
   }

   @Override
   public void a(ahz $$0) {
      zo.a($$0, this, this.e.B());
      if (!this.c.q()) {
         this.e.a(xe.c("advMode.notEnabled"));
      } else if (!this.e.gK()) {
         this.e.a(xe.c("advMode.notAllowed"));
      } else {
         dbb $$1 = $$0.a(this.e.dU());
         if ($$1 != null) {
            $$1.a($$0.b());
            $$1.a($$0.e());
            if (!$$0.e()) {
               $$1.c(null);
            }

            $$1.f();
            this.e.a(xe.a("advMode.setCommand.success", $$0.b()));
         }
      }
   }

   @Override
   public void a(ahl $$0) {
      zo.a($$0, this, this.e.B());
      this.e.gl().c($$0.b());
      this.e.d.b(new acu(-2, 0, this.e.gl().k, this.e.gl().a(this.e.gl().k)));
      this.e.d.b(new acu(-2, 0, $$0.b(), this.e.gl().a($$0.b())));
      this.e.d.b(new aew(this.e.gl().k));
   }

   @Override
   public void a(aht $$0) {
      zo.a($$0, this, this.e.B());
      if (this.e.cq instanceof cpi $$1) {
         if (!$$1.a(this.e)) {
            g.debug("Player {} interacted with invalid menu {}", this.e, $$1);
            return;
         }

         $$1.a($$0.b());
      }
   }

   @Override
   public void a(ahw $$0) {
      zo.a($$0, this, this.e.B());
      if (this.e.cq instanceof cpj $$1) {
         if (!this.e.cq.a(this.e)) {
            g.debug("Player {} interacted with invalid menu {}", this.e, this.e.cq);
            return;
         }

         $$1.a($$0.b(), $$0.e());
      }
   }

   @Override
   public void a(aic $$0) {
      zo.a($$0, this, this.e.B());
      if (this.e.gK()) {
         ir $$1 = $$0.b();
         dtc $$2 = this.e.dU().a_($$1);
         if (this.e.dU().c_($$1) instanceof drw $$4) {
            $$4.a($$0.f());
            $$4.a($$0.g());
            $$4.a($$0.h());
            $$4.a($$0.i());
            $$4.a($$0.j());
            $$4.a($$0.k());
            $$4.b($$0.l());
            $$4.a($$0.m());
            $$4.d($$0.n());
            $$4.e($$0.o());
            $$4.a($$0.p());
            $$4.a($$0.q());
            if ($$4.d()) {
               String $$5 = $$4.c();
               if ($$0.e() == drw.a.b) {
                  if ($$4.z()) {
                     this.e.a(xe.a("structure_block.save_success", $$5), false);
                  } else {
                     this.e.a(xe.a("structure_block.save_failure", $$5), false);
                  }
               } else if ($$0.e() == drw.a.c) {
                  if (!$$4.B()) {
                     this.e.a(xe.a("structure_block.load_not_found", $$5), false);
                  } else if ($$4.a(this.e.B())) {
                     this.e.a(xe.a("structure_block.load_success", $$5), false);
                  } else {
                     this.e.a(xe.a("structure_block.load_prepare", $$5), false);
                  }
               } else if ($$0.e() == drw.a.d) {
                  if ($$4.y()) {
                     this.e.a(xe.a("structure_block.size_success", $$5), false);
                  } else {
                     this.e.a(xe.c("structure_block.size_failure"), false);
                  }
               }
            } else {
               this.e.a(xe.a("structure_block.invalid_structure_name", $$0.g()), false);
            }

            $$4.e();
            this.e.dU().a($$1, $$2, $$2, 3);
         }
      }
   }

   @Override
   public void a(aib $$0) {
      zo.a($$0, this, this.e.B());
      if (this.e.gK()) {
         ir $$1 = $$0.b();
         dtc $$2 = this.e.dU().a_($$1);
         if (this.e.dU().c_($$1) instanceof dre $$4) {
            $$4.a($$0.e());
            $$4.b($$0.f());
            $$4.a(aks.a(li.aM, $$0.g()));
            $$4.a($$0.h());
            $$4.a($$0.i());
            $$4.a($$0.k());
            $$4.b($$0.j());
            $$4.e();
            this.e.dU().a($$1, $$2, $$2, 3);
         }
      }
   }

   @Override
   public void a(ahg $$0) {
      zo.a($$0, this, this.e.B());
      if (this.e.gK()) {
         ir $$1 = $$0.b();
         if (this.e.dU().c_($$1) instanceof dre $$3) {
            $$3.a(this.e.B(), $$0.e(), $$0.f());
         }
      }
   }

   @Override
   public void a(ahv $$0) {
      zo.a($$0, this, this.e.B());
      int $$1 = $$0.b();
      if (this.e.cq instanceof cqq $$2) {
         if (!$$2.a(this.e)) {
            g.debug("Player {} interacted with invalid menu {}", this.e, $$2);
            return;
         }

         $$2.e($$1);
         $$2.h($$1);
      }
   }

   @Override
   public void a(ahd $$0) {
      int $$1 = $$0.b();
      if (clx.d($$1) || $$1 == 40) {
         List<String> $$2 = Lists.newArrayList();
         Optional<String> $$3 = $$0.f();
         $$3.ifPresent($$2::add);
         $$0.e().stream().limit(100L).forEach($$2::add);
         Consumer<List<arl>> $$4 = $$3.isPresent() ? $$1x -> this.a((arl)$$1x.get(0), $$1x.subList(1, $$1x.size()), $$1) : $$1x -> this.a($$1x, $$1);
         this.a($$2).thenAcceptAsync($$4, this.c);
      }
   }

   private void a(List<arl> $$0, int $$1) {
      cuh $$2 = this.e.gl().a($$1);
      if ($$2.a(cuk.vB)) {
         List<ark<String>> $$3 = $$0.stream().map(this::a).toList();
         $$2.b(ke.G, new cxz($$3));
      }
   }

   private void a(arl $$0, List<arl> $$1, int $$2) {
      cuh $$3 = this.e.gl().a($$2);
      if ($$3.a(cuk.vB)) {
         cuh $$4 = $$3.a(cuk.vC, 1);
         $$4.c(ke.G);
         List<ark<xe>> $$5 = $$1.stream().map($$0x -> this.a($$0x).a(xe::b)).toList();
         $$4.b(ke.H, new cya(this.a($$0), this.e.af().getString(), 0, $$5, true));
         this.e.gl().a($$2, $$4);
      }
   }

   private ark<String> a(arl $$0) {
      return this.e.aa() ? ark.a($$0.b()) : ark.a($$0);
   }

   @Override
   public void a(ahe $$0) {
      zo.a($$0, this, this.e.B());
      if (this.e.m(2)) {
         brv $$1 = this.e.dU().a($$0.e());
         if ($$1 != null) {
            uk $$2 = $$1.f(new uk());
            this.e.d.b(new afx($$0.b(), $$2));
         }
      }
   }

   @Override
   public void a(ahb $$0) {
      zo.a($$0, this, this.e.B());
      if (!this.e.O_() && $$0.e() == this.e.cq.j) {
         if (this.e.cq instanceof cpu $$1 && $$1.m() instanceof dqq $$2) {
            $$2.a($$0.b(), $$0.f());
         }
      }
   }

   @Override
   public void a(ago $$0) {
      zo.a($$0, this, this.e.B());
      if (this.e.m(2)) {
         dqc $$1 = this.e.dU().c_($$0.e());
         uk $$2 = $$1 != null ? $$1.d(this.e.dY()) : null;
         this.e.d.b(new afx($$0.b(), $$2));
      }
   }

   @Override
   public void a(ahi $$0) {
      zo.a($$0, this, this.e.B());
      if (b($$0.a(0.0), $$0.b(0.0), $$0.c(0.0), $$0.a(0.0F), $$0.b(0.0F))) {
         this.b(xe.c("multiplayer.disconnect.invalid_player_movement"));
      } else {
         aqt $$1 = this.e.B();
         if (!this.e.h) {
            if (this.m == 0) {
               this.m();
            }

            if (this.D != null) {
               if (this.m - this.F > 20) {
                  this.F = this.m;
                  this.a(this.D.c, this.D.d, this.D.e, this.e.dK(), this.e.dM());
               }
            } else {
               this.F = this.m;
               double $$2 = a($$0.a(this.e.dz()));
               double $$3 = b($$0.b(this.e.dB()));
               double $$4 = a($$0.c(this.e.dF()));
               float $$5 = aym.g($$0.a(this.e.dK()));
               float $$6 = aym.g($$0.b(this.e.dM()));
               if (this.e.bW()) {
                  this.e.a(this.e.dz(), this.e.dB(), this.e.dF(), $$5, $$6);
                  this.e.B().l().a(this.e);
               } else {
                  double $$7 = this.e.dz();
                  double $$8 = this.e.dB();
                  double $$9 = this.e.dF();
                  double $$10 = $$2 - this.q;
                  double $$11 = $$3 - this.r;
                  double $$12 = $$4 - this.s;
                  double $$13 = this.e.dx().g();
                  double $$14 = $$10 * $$10 + $$11 * $$11 + $$12 * $$12;
                  if (this.e.fU()) {
                     if ($$14 > 1.0) {
                        this.a(this.e.dz(), this.e.dB(), this.e.dF(), $$5, $$6);
                     }
                  } else {
                     boolean $$15 = this.e.fN();
                     if ($$1.s().i()) {
                        this.K++;
                        int $$16 = this.K - this.L;
                        if ($$16 > 5) {
                           g.debug("{} is sending move packets too frequently ({} packets since last tick)", this.e.af().getString(), $$16);
                           $$16 = 1;
                        }

                        if (!this.e.Q() && !this.e.aR() && this.e.cK == null && (!this.e.dU().ab().b(dbw.t) || !$$15)) {
                           float $$17 = $$15 ? 300.0F : 100.0F;
                           if ($$14 - $$13 > (double)($$17 * (float)$$16) && !this.i()) {
                              g.warn("{} moved too quickly! {},{},{}", new Object[]{this.e.af().getString(), $$10, $$11, $$12});
                              this.a(this.e.dz(), this.e.dB(), this.e.dF(), this.e.dK(), this.e.dM());
                              return;
                           }
                        }
                     }

                     ewp $$18 = this.e.cP();
                     $$10 = $$2 - this.t;
                     $$11 = $$3 - this.u;
                     $$12 = $$4 - this.v;
                     boolean $$19 = $$11 > 0.0;
                     if (this.e.aE() && !$$0.b() && $$19) {
                        this.e.fs();
                     }

                     boolean $$20 = this.e.T;

                     try {
                        this.e.J = true;
                        this.e.a(bst.b, new ewu($$10, $$11, $$12));
                     } finally {
                        this.e.J = false;
                     }

                     $$10 = $$2 - this.e.dz();
                     $$11 = $$3 - this.e.dB();
                     if ($$11 > -0.5 || $$11 < 0.5) {
                        $$11 = 0.0;
                     }

                     $$12 = $$4 - this.e.dF();
                     $$14 = $$10 * $$10 + $$11 * $$11 + $$12 * $$12;
                     boolean $$22 = false;
                     if (!this.e.Q() && $$14 > 0.0625 && !this.e.fU() && !this.e.f.e() && this.e.f.b() != dbx.d) {
                        $$22 = true;
                        g.warn("{} moved wrongly!", this.e.af().getString());
                     }

                     if (this.e.ah || this.e.fU() || (!$$22 || !$$1.b(this.e, $$18)) && !this.a($$1, $$18, $$2, $$3, $$4)) {
                        this.e.a($$2, $$3, $$4, $$5, $$6);
                        boolean $$23 = this.e.fA();
                        this.G = q();
                        this.e.B().l().a(this.e);
                        this.e.a(this.e.dz() - $$7, this.e.dB() - $$8, this.e.dF() - $$9, $$0.b());
                        this.e.a($$0.b(), new ewu(this.e.dz() - $$7, this.e.dB() - $$8, this.e.dF() - $$9));
                        if ($$19) {
                           this.e.n();
                        }

                        if ($$0.b() || this.e.bm() || this.e.p_() || this.e.O_() || $$15 || $$23) {
                           this.e.gP();
                        }

                        this.e.b(this.e.dz() - $$7, this.e.dB() - $$8, this.e.dF() - $$9);
                        this.t = this.e.dz();
                        this.u = this.e.dB();
                        this.v = this.e.dF();
                     } else {
                        this.a($$7, $$8, $$9, $$5, $$6);
                        this.e.a(this.e.dz() - $$7, this.e.dB() - $$8, this.e.dF() - $$9, $$0.b());
                     }
                  }
               }
            }
         }
      }
   }

   private static boolean q() {
      return false;
   }

   private boolean a(dcd $$0, ewp $$1, double $$2, double $$3, double $$4) {
      ewp $$5 = this.e.cP().d($$2 - this.e.dz(), $$3 - this.e.dB(), $$4 - this.e.dF());
      Iterable<exn> $$6 = $$0.d(this.e, $$5.h(1.0E-5F));
      exn $$7 = exk.a($$1.h(1.0E-5F));

      for (exn $$8 : $$6) {
         if (!exk.c($$8, $$7, ewy.i)) {
            return true;
         }
      }

      return false;
   }

   public void a(double $$0, double $$1, double $$2, float $$3, float $$4) {
      this.a($$0, $$1, $$2, $$3, $$4, Collections.emptySet());
   }

   public void a(double $$0, double $$1, double $$2, float $$3, float $$4, Set<btb> $$5) {
      double $$6 = $$5.contains(btb.a) ? this.e.dz() : 0.0;
      double $$7 = $$5.contains(btb.b) ? this.e.dB() : 0.0;
      double $$8 = $$5.contains(btb.c) ? this.e.dF() : 0.0;
      float $$9 = $$5.contains(btb.d) ? this.e.dK() : 0.0F;
      float $$10 = $$5.contains(btb.e) ? this.e.dM() : 0.0F;
      this.D = new ewu($$0, $$1, $$2);
      if (++this.E == Integer.MAX_VALUE) {
         this.E = 0;
      }

      this.F = this.m;
      this.e.gP();
      this.e.a($$0, $$1, $$2, $$3, $$4);
      this.e.d.b(new aef($$0 - $$6, $$1 - $$7, $$2 - $$8, $$3 - $$9, $$4 - $$10, $$5, this.E));
   }

   @Override
   public void a(aho $$0) {
      zo.a($$0, this, this.e.B());
      ir $$1 = $$0.b();
      this.e.I();
      aho.a $$2 = $$0.f();
      switch ($$2) {
         case g:
            if (!this.e.O_()) {
               cuh $$3 = this.e.b(bpz.b);
               this.e.a(bpz.b, this.e.b(bpz.a));
               this.e.a(bpz.a, $$3);
               this.e.fK();
            }

            return;
         case e:
            if (!this.e.O_()) {
               this.e.a(false);
            }

            return;
         case d:
            if (!this.e.O_()) {
               this.e.a(true);
            }

            return;
         case f:
            this.e.fJ();
            return;
         case a:
         case b:
         case c:
            this.e.f.a($$1, $$2, $$0.e(), this.e.dU().am(), $$0.g());
            this.e.d.a($$0.g());
            return;
         default:
            throw new IllegalArgumentException("Invalid player action");
      }
   }

   private static boolean a(aqu $$0, cuh $$1) {
      if ($$1.d()) {
         return false;
      } else {
         cuc $$2 = $$1.f();
         return ($$2 instanceof csc || $$2 instanceof csk) && !$$0.gI().a($$2);
      }
   }

   @Override
   public void a(aig $$0) {
      zo.a($$0, this, this.e.B());
      this.e.d.a($$0.f());
      aqt $$1 = this.e.B();
      bpz $$2 = $$0.b();
      cuh $$3 = this.e.b($$2);
      if ($$3.a($$1.K())) {
         ewq $$4 = $$0.e();
         ewu $$5 = $$4.e();
         ir $$6 = $$4.a();
         if (this.e.a($$6, 1.0)) {
            ewu $$7 = $$5.d(ewu.b($$6));
            double $$8 = 1.0000001;
            if (Math.abs($$7.a()) < 1.0000001 && Math.abs($$7.b()) < 1.0000001 && Math.abs($$7.c()) < 1.0000001) {
               iw $$9 = $$4.b();
               this.e.I();
               int $$10 = this.e.dU().am();
               if ($$6.v() < $$10) {
                  if (this.D == null && $$1.a(this.e, $$6)) {
                     bqa $$11 = this.e.f.a(this.e, $$1, $$3, $$2, $$4);
                     if ($$11.a()) {
                        an.P.a(this.e, $$4.a(), $$3.r());
                     }

                     if ($$9 == iw.b && !$$11.a() && $$6.v() >= $$10 - 1 && a(this.e, $$3)) {
                        xe $$12 = xe.a("build.tooHigh", $$10 - 1).a(n.m);
                        this.e.b($$12, true);
                     } else if ($$11.b()) {
                        this.e.a($$2, true);
                     }
                  }
               } else {
                  xe $$13 = xe.a("build.tooHigh", $$10 - 1).a(n.m);
                  this.e.b($$13, true);
               }

               this.e.d.b(new acg($$1, $$6));
               this.e.d.b(new acg($$1, $$6.a($$9)));
            } else {
               g.warn("Rejecting UseItemOnPacket from {}: Location {} too far away from hit block {}.", new Object[]{this.e.gk().getName(), $$5, $$6});
            }
         }
      }
   }

   @Override
   public void a(aih $$0) {
      zo.a($$0, this, this.e.B());
      this.a($$0.e());
      aqt $$1 = this.e.B();
      bpz $$2 = $$0.b();
      cuh $$3 = this.e.b($$2);
      this.e.I();
      if (!$$3.d() && $$3.a($$1.K())) {
         bqa $$4 = this.e.f.a(this.e, $$1, $$3, $$2);
         if ($$4.b()) {
            this.e.a($$2, true);
         }
      }
   }

   @Override
   public void a(aif $$0) {
      zo.a($$0, this, this.e.B());
      if (this.e.O_()) {
         for (aqt $$1 : this.c.K()) {
            brv $$2 = $$0.a($$1);
            if ($$2 != null) {
               this.e.a($$1, $$2.dz(), $$2.dB(), $$2.dF(), $$2.dK(), $$2.dM());
               return;
            }
         }
      }
   }

   @Override
   public void a(ahk $$0) {
      zo.a($$0, this, this.e.B());
      if (this.e.di() instanceof cny $$2) {
         $$2.a($$0.b(), $$0.e());
      }
   }

   @Override
   public void a(xe $$0) {
      g.info("{} lost connection: {}", this.e.af().getString(), $$0.getString());
      this.r();
      super.a($$0);
   }

   private void r() {
      this.Q.close();
      this.c.aw();
      this.c.ah().a(xe.a("multiplayer.player.left", this.e.P_()).a(n.o), false);
      this.e.w();
      this.c.ah().c(this.e);
      this.e.Z().b();
   }

   public void a(int $$0) {
      if ($$0 < 0) {
         throw new IllegalArgumentException("Expected packet sequence nr >= 0");
      } else {
         this.n = Math.max($$0, this.n);
      }
   }

   @Override
   public void a(ahx $$0) {
      zo.a($$0, this, this.e.B());
      if ($$0.b() >= 0 && $$0.b() < clx.g()) {
         if (this.e.gl().k != $$0.b() && this.e.fF() == bpz.a) {
            this.e.fK();
         }

         this.e.gl().k = $$0.b();
         this.e.I();
      } else {
         g.warn("{} tried to set an invalid carried item", this.e.af().getString());
      }
   }

   @Override
   public void a(ags $$0) {
      if (c($$0.b())) {
         this.b(xe.c("multiplayer.disconnect.illegal_characters"));
      } else {
         Optional<xl> $$1 = this.a($$0.h());
         if ($$1.isPresent()) {
            this.c.execute(() -> {
               int $$2 = StringUtils.countMatches($$0.b(), "potato");
               if ($$2 > 0) {
                  this.e.a(avz.aH, $$2);
                  an.al.a(this.e);
               }

               xu $$3;
               try {
                  $$3 = this.a($$0, $$1.get());
               } catch (xy.a var7) {
                  this.a(var7);
                  return;
               }

               CompletableFuture<arl> $$6 = this.a($$3.c());
               xe $$7 = this.c.bm().decorate(this.e, $$3.d());
               this.Q.append($$6, $$2x -> {
                  xu $$3x = $$3.a($$7).a($$2x.e());
                  this.b($$3x);
               });
            });
         }
      }
   }

   @Override
   public void a(agr $$0) {
      if (c($$0.b())) {
         this.b(xe.c("multiplayer.disconnect.illegal_characters"));
      } else {
         Optional<xl> $$1 = this.a($$0.h());
         if ($$1.isPresent()) {
            this.c.execute(() -> {
               this.a($$0, $$1.get());
               this.s();
            });
         }
      }
   }

   private void a(agr $$0, xl $$1) {
      ParseResults<eh> $$2 = this.b($$0.b());

      Map<String, xu> $$3;
      try {
         $$3 = this.a($$0, xw.a($$2), $$1);
      } catch (xy.a var6) {
         this.a(var6);
         return;
      }

      ef $$6 = new ef.a($$3);
      $$2 = ei.a($$2, $$1x -> $$1x.a($$6, this.Q));
      this.c.aH().a($$2, $$0.b());
   }

   private void a(xy.a $$0) {
      g.warn("Failed to update secure chat state for {}: '{}'", this.e.gk().getName(), $$0.b().getString());
      if ($$0.a()) {
         this.b($$0.b());
      } else {
         this.e.a($$0.b().f().a(n.m));
      }
   }

   private Map<String, xu> a(agr $$0, xw<?> $$1, xl $$2) throws xy.a {
      Map<String, xu> $$3 = new Object2ObjectOpenHashMap();

      for (xw.a<?> $$4 : $$1.a()) {
         xq $$5 = $$0.g().a($$4.a());
         xx $$6 = new xx($$4.c(), $$0.e(), $$0.f(), $$2);
         $$3.put($$4.a(), this.N.unpack($$5, $$6));
      }

      return $$3;
   }

   private ParseResults<eh> b(String $$0) {
      CommandDispatcher<eh> $$1 = this.c.aH().a();
      return $$1.parse($$0, this.e.dl());
   }

   private Optional<xl> a(xl.b $$0) {
      Optional<xl> $$1 = this.b($$0);
      if (this.e.F() == clw.c) {
         this.b(new afv(xe.c("chat.disabled.options").a(n.m), false));
         return Optional.empty();
      } else {
         this.e.I();
         return $$1;
      }
   }

   private Optional<xl> b(xl.b $$0) {
      synchronized (this.O) {
         Optional<xl> $$1 = this.O.a($$0);
         if ($$1.isEmpty()) {
            g.warn("Failed to validate message acknowledgements from {}", this.e.af().getString());
            this.b(k);
         }

         return $$1;
      }
   }

   private static boolean c(String $$0) {
      for (int $$1 = 0; $$1 < $$0.length(); $$1++) {
         if (!azh.a($$0.charAt($$1))) {
            return true;
         }
      }

      return false;
   }

   private xu a(ags $$0, xl $$1) throws xy.a {
      xx $$2 = new xx($$0.b(), $$0.e(), $$0.f(), $$1);
      return this.N.unpack($$0.g(), $$2);
   }

   private void b(xu $$0) {
      this.c.ah().a($$0, this.e, xa.a(xa.c, this.e));
      this.s();
   }

   private void s() {
      this.o += 20;
      if (this.o > 200 && !this.c.ah().f(this.e.gk())) {
         this.b(xe.c("disconnect.spam"));
      }
   }

   @Override
   public void a(agq $$0) {
      synchronized (this.O) {
         if (!this.O.a($$0.b())) {
            g.warn("Failed to validate message acknowledgements from {}", this.e.af().getString());
            this.b(k);
         }
      }
   }

   @Override
   public void a(aie $$0) {
      zo.a($$0, this, this.e.B());
      this.e.I();
      this.e.a($$0.b());
   }

   @Override
   public void a(ahp $$0) {
      zo.a($$0, this, this.e.B());
      this.e.I();
      switch ($$0.e()) {
         case a:
            this.e.g(true);
            break;
         case b:
            this.e.g(false);
            break;
         case d:
            this.e.h(true);
            break;
         case e:
            this.e.h(false);
            break;
         case c:
            if (this.e.fU()) {
               this.e.a(false, true);
               this.D = this.e.ds();
            }
            break;
         case f:
            if (this.e.di() instanceof bsy $$1) {
               int $$2 = $$0.f();
               if ($$1.a() && $$2 > 0) {
                  $$1.c($$2);
               }
            }
            break;
         case g:
            if (this.e.di() instanceof bsy $$3) {
               $$3.b();
            }
            break;
         case h:
            if (this.e.dh() instanceof bsh $$4) {
               $$4.b(this.e);
            }
            break;
         case i:
            if (!this.e.gs()) {
               this.e.gu();
            }
            break;
         default:
            throw new IllegalArgumentException("Invalid client command!");
      }
   }

   public void a(xu $$0) {
      xq $$1 = $$0.l();
      if ($$1 != null) {
         this.P.a($$0.m(), $$0.l());
         int $$2;
         synchronized (this.O) {
            this.O.a($$1);
            $$2 = this.O.a();
         }

         if ($$2 > 4096) {
            this.b(xe.c("multiplayer.disconnect.too_many_pending_chats"));
         }
      }
   }

   public void a(xu $$0, xa.a $$1) {
      this.b(new ady($$0.k().c(), $$0.k().b(), $$0.l(), $$0.m().a(this.P), $$0.n(), $$0.o(), $$1));
      this.a($$0);
   }

   public void a(xe $$0, xa.a $$1) {
      this.b(new ada($$0, $$1));
   }

   public SocketAddress n() {
      return this.d.d();
   }

   public void o() {
      this.R = true;
      this.r();
      this.b(aft.a);
      this.d.a(abl.b);
   }

   @Override
   public void a(ajo $$0) {
      this.d.a(new ajl($$0.b()));
   }

   @Override
   public void a(ahf $$0) {
      zo.a($$0, this, this.e.B());
      final aqt $$1 = this.e.B();
      final brv $$2 = $$0.a($$1);
      this.e.I();
      this.e.g($$0.b());
      if ($$2 != null) {
         if (!$$1.D_().a($$2.du())) {
            return;
         }

         ewp $$3 = $$2.cP();
         if (this.e.a($$3, 1.0)) {
            $$0.a(new ahf.c() {
               private void a(bpz $$0, art.a $$1x) {
                  cuh $$2 = art.this.e.b($$0);
                  if ($$2.a($$1.K())) {
                     cuh $$3 = $$2.r();
                     bqa $$4 = $$1.run(art.this.e, $$2, $$0);
                     if ($$4.a()) {
                        an.T.a(art.this.e, $$3, $$2);
                        if ($$4.b()) {
                           art.this.e.a($$0, true);
                        }
                     }
                  }
               }

               @Override
               public void a(bpz $$0) {
                  this.a($$0, cly::a);
               }

               @Override
               public void a(bpz $$0, ewu $$1x) {
                  this.a($$0, ($$1xxx, $$2xx, $$3) -> $$2xx.a($$1xxx, $$1, $$3));
               }

               @Override
               public void a() {
                  if (!($$2 instanceof cig) && !($$2 instanceof bse) && !($$2 instanceof cme) && $$2 != art.this.e) {
                     cuh $$0 = art.this.e.b(bpz.a);
                     if ($$0.a($$1.K())) {
                        art.this.e.e($$2);
                     }
                  } else {
                     art.this.b(xe.c("multiplayer.disconnect.invalid_entity_attacked"));
                     art.g.warn("Player {} tried to attack an invalid entity", art.this.e.af().getString());
                  }
               }
            });
         }
      }
   }

   @Override
   public void a(agv $$0) {
      zo.a($$0, this, this.e.B());
      this.e.I();
      agv.a $$1 = $$0.b();
      switch ($$1) {
         case a:
            if (this.e.h) {
               this.e.h = false;
               this.e = this.c.ah().a(this.e, true);
               an.w.a(this.e, dca.j, dca.h);
            } else {
               if (this.e.eI() > 0.0F) {
                  return;
               }

               this.e = this.c.ah().a(this.e, false);
               if (this.c.j()) {
                  this.e.a(dbx.d);
                  this.e.dU().ab().a(dbw.r).a(false, this.c);
               }
            }
            break;
         case b:
            this.e = this.c.ah().d(this.e);
            an.w.a(this.e, dca.k, dca.h);
            break;
         case c:
            this.e.J().a(this.e);
      }
   }

   @Override
   public void a(aha $$0) {
      zo.a($$0, this, this.e.B());
      this.e.u();
   }

   @Override
   public void a(agz $$0) {
      zo.a($$0, this, this.e.B());
      this.e.I();
      if (this.e.cq.j == $$0.b()) {
         if (this.e.O_()) {
            this.e.cq.b();
         } else if (!this.e.cq.a(this.e)) {
            g.debug("Player {} interacted with invalid menu {}", this.e, this.e.cq);
         } else {
            int $$1 = $$0.e();
            if (!this.e.cq.a($$1)) {
               g.debug("Player {} clicked invalid slot index: {}, available slots: {}", new Object[]{this.e.af(), $$1, this.e.cq.i.size()});
            } else {
               boolean $$2 = $$0.j() != this.e.cq.j();
               this.e.cq.h();
               this.e.cq.a($$1, $$0.f(), $$0.i(), this.e);
               ObjectIterator var4 = Int2ObjectMaps.fastIterable($$0.h()).iterator();

               while (var4.hasNext()) {
                  Entry<cuh> $$3 = (Entry<cuh>)var4.next();
                  this.e.cq.b($$3.getIntKey(), (cuh)$$3.getValue());
               }

               this.e.cq.a($$0.g());
               this.e.cq.i();
               if ($$2) {
                  this.e.cq.e();
               } else {
                  this.e.cq.d();
               }
            }
         }
      }
   }

   @Override
   public void a(ahm $$0) {
      zo.a($$0, this, this.e.B());
      this.e.I();
      if (!this.e.O_() && this.e.cq.j == $$0.b() && this.e.cq instanceof cqw) {
         if (!this.e.cq.a(this.e)) {
            g.debug("Player {} interacted with invalid menu {}", this.e, this.e.cq);
         } else {
            this.c.aJ().a($$0.e()).ifPresent($$1 -> ((cqw)this.e.cq).a($$0.f(), (czc<?>)$$1, this.e));
         }
      }
   }

   @Override
   public void a(agy $$0) {
      zo.a($$0, this, this.e.B());
      this.e.I();
      if (this.e.cq.j == $$0.b() && !this.e.O_()) {
         if (!this.e.cq.a(this.e)) {
            g.debug("Player {} interacted with invalid menu {}", this.e, this.e.cq);
         } else {
            boolean $$1 = this.e.cq.b(this.e, $$0.e());
            if ($$1) {
               this.e.cq.d();
            }
         }
      }
   }

   @Override
   public void a(aia $$0) {
      zo.a($$0, this, this.e.B());
      if (this.e.f.e()) {
         boolean $$1 = $$0.b() < 0;
         cuh $$2 = $$0.e();
         if (!$$2.a(this.e.dU().K())) {
            return;
         }

         cxf $$3 = $$2.a(ke.O, cxf.a);
         if ($$3.a("x") && $$3.a("y") && $$3.a("z")) {
            ir $$4 = dqc.b($$3.d());
            if (this.e.dU().p($$4)) {
               dqc $$5 = this.e.dU().c_($$4);
               if ($$5 != null) {
                  $$5.a($$2, this.e.dU().I_());
               }
            }
         }

         boolean $$6 = $$0.b() >= 1 && $$0.b() <= 45;
         boolean $$7 = $$2.d() || $$2.m() >= 0 && $$2.G() <= $$2.i() && !$$2.d();
         if ($$6 && $$7) {
            this.e.cp.b($$0.b()).e($$2);
            this.e.cp.d();
         } else if ($$1 && $$7 && this.p < 200) {
            this.p += 20;
            this.e.a($$2, true);
         }
      }
   }

   @Override
   public void a(aid $$0) {
      List<String> $$1 = Stream.of($$0.f()).map(n::a).collect(Collectors.toList());
      this.a($$1).thenAcceptAsync($$1x -> this.a($$0, $$1x), this.c);
   }

   private void a(aid $$0, List<arl> $$1) {
      this.e.I();
      aqt $$2 = this.e.B();
      ir $$3 = $$0.b();
      if ($$2.B($$3)) {
         if (!($$2.c_($$3) instanceof drr $$5)) {
            return;
         }

         $$5.a(this.e, $$0.e(), $$1);
      }
   }

   @Override
   public void a(ahn $$0) {
      zo.a($$0, this, this.e.B());
      this.e.gm().b = $$0.b() && this.e.gm().c;
   }

   @Override
   public void a(aad $$0) {
      zo.a($$0, this, this.e.B());
      this.e.a($$0.b());
   }

   @Override
   public void a(agp $$0) {
      zo.a($$0, this, this.e.B());
      if (this.e.m(2) || this.i()) {
         this.c.a($$0.b(), false);
      }
   }

   @Override
   public void a(ahh $$0) {
      zo.a($$0, this, this.e.B());
      if (this.e.m(2) || this.i()) {
         this.c.b($$0.b());
      }
   }

   @Override
   public void a(agt $$0) {
      zo.a($$0, this, this.e.B());
      xv.a $$1 = $$0.b();
      cmb.a $$2 = this.M != null ? this.M.d().b() : null;
      cmb.a $$3 = $$1.b();
      if (!Objects.equals($$2, $$3)) {
         if ($$2 != null && $$3.b().isBefore($$2.b())) {
            this.b(cmb.a);
         } else {
            try {
               ayy $$4 = this.c.as();
               if ($$4 == null) {
                  g.warn("Ignoring chat session from {} due to missing Services public key", this.e.gk().getName());
                  return;
               }

               this.a($$1.a(this.e.gk(), $$4));
            } catch (cmb.b var6) {
               g.error("Failed to validate profile key: {}", var6.getMessage());
               this.b(var6.b());
            }
         }
      }
   }

   @Override
   public void a(agx $$0) {
      if (!this.R) {
         throw new IllegalStateException("Client acknowledged config, but none was requested");
      } else {
         this.d.a(abl.a, new arr(this.c, this.d, this.a(this.e.D())));
      }
   }

   @Override
   public void a(agu $$0) {
      zo.a($$0, this, this.e.B());
      this.f.a($$0.b());
   }

   @Override
   public void a(ahc $$0) {
      zo.a($$0, this, this.e.B());
      this.c.a(this.e, $$0.b());
   }

   private void a(xv $$0) {
      this.M = $$0;
      this.N = $$0.a(this.e.cE());
      this.Q.append(() -> {
         this.e.a($$0);
         this.c.ah().a(new aed(EnumSet.of(aed.a.b), List.of(this.e)));
      });
   }

   @Override
   public void a(aae $$0) {
   }

   @Override
   public aqu p() {
      return this.e;
   }

   @FunctionalInterface
   interface a {
      bqa run(aqu var1, brv var2, bpz var3);
   }
}
