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
import java.util.HashMap;
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
import org.slf4j.Logger;

public class ark extends arh implements agb, arn, wi {
   static final Logger h = LogUtils.getLogger();
   private static final int i = -1;
   private static final int j = 4096;
   private static final int k = 80;
   private static final wu l = wu.c("multiplayer.disconnect.chat_validation_failed");
   private static final wu m = wu.c("chat.disabled.invalid_command_signature").a(n.m);
   private static final int n = 1000;
   public aql f;
   public final arg g;
   private int o;
   private int p = -1;
   private int q;
   private int r;
   private double s;
   private double t;
   private double u;
   private double v;
   private double w;
   private double x;
   @Nullable
   private bsd y;
   private double z;
   private double A;
   private double B;
   private double C;
   private double D;
   private double E;
   @Nullable
   private evz F;
   private int G;
   private int H;
   private boolean I;
   private int J;
   private boolean K;
   private int L;
   private int M;
   private int N;
   @Nullable
   private xl O;
   private xo.b P;
   private final xd Q = new xd(20);
   private final xh R = xh.a();
   private final axs S;
   private boolean T;

   public ark(MinecraftServer $$0, vp $$1, aql $$2, aqz $$3) {
      super($$0, $$1, $$3);
      this.g = new arg($$1.e());
      this.f = $$2;
      $$2.c = this;
      $$2.X().a();
      this.P = xo.b.unsigned($$2.cz(), $$0::aB);
      this.S = new axs($$0);
   }

   @Override
   public void d() {
      if (this.p > -1) {
         this.b(new abs(this.p));
         this.p = -1;
      }

      this.l();
      this.f.L = this.f.du();
      this.f.M = this.f.dw();
      this.f.N = this.f.dA();
      this.f.m();
      this.f.a(this.s, this.t, this.u, this.f.dF(), this.f.dH());
      this.o++;
      this.N = this.M;
      if (this.I && !this.f.fH() && !this.f.bR() && !this.f.ex()) {
         if (++this.J > this.a((bsd)this.f)) {
            h.warn("{} was kicked for floating too long!", this.f.af().getString());
            this.b(wu.c("multiplayer.disconnect.flying"));
            return;
         }
      } else {
         this.I = false;
         this.J = 0;
      }

      this.y = this.f.cZ();
      if (this.y != this.f && this.y.cQ() == this.f) {
         this.z = this.y.du();
         this.A = this.y.dw();
         this.B = this.y.dA();
         this.C = this.y.du();
         this.D = this.y.dw();
         this.E = this.y.dA();
         if (this.K && this.y.cQ() == this.f) {
            if (++this.L > this.a(this.y)) {
               h.warn("{} was kicked for floating a vehicle too long!", this.f.af().getString());
               this.b(wu.c("multiplayer.disconnect.flying"));
               return;
            }
         } else {
            this.K = false;
            this.L = 0;
         }
      } else {
         this.y = null;
         this.K = false;
         this.L = 0;
      }

      this.e();
      if (this.q > 0) {
         this.q--;
      }

      if (this.r > 0) {
         this.r--;
      }

      if (this.f.M() > 0L && this.d.aq() > 0 && ac.c() - this.f.M() > (long)this.d.aq() * 1000L * 60L) {
         this.b(wu.c("multiplayer.disconnect.idling"));
      }
   }

   private int a(bsd $$0) {
      double $$1 = $$0.aZ();
      if ($$1 < 1.0E-5F) {
         return Integer.MAX_VALUE;
      } else {
         double $$2 = 0.08 / $$1;
         return aye.c(80.0 * Math.max($$2, 1.0));
      }
   }

   @Override
   public void l() {
      this.s = this.f.du();
      this.t = this.f.dw();
      this.u = this.f.dA();
      this.v = this.f.du();
      this.w = this.f.dw();
      this.x = this.f.dA();
   }

   @Override
   public boolean c() {
      return this.e.i() && !this.T;
   }

   @Override
   public boolean a(zb<?> $$0) {
      return super.a($$0) ? true : this.T && this.e.i() && $$0 instanceof ago;
   }

   @Override
   protected GameProfile i() {
      return this.f.fX();
   }

   private <T, R> CompletableFuture<R> a(T $$0, BiFunction<arp, T, CompletableFuture<R>> $$1) {
      return $$1.apply(this.f.X(), $$0).thenApply($$0x -> {
         if (!this.c()) {
            h.debug("Ignoring packet due to disconnection");
            throw new CancellationException("disconnected");
         } else {
            return (R)$$0x;
         }
      });
   }

   private CompletableFuture<arc> a(String $$0) {
      return this.a($$0, arp::a);
   }

   private CompletableFuture<List<arc>> a(List<String> $$0) {
      return this.a($$0, arp::a);
   }

   @Override
   public void a(ahh $$0) {
      ze.a($$0, this, this.f.z());
      this.f.a($$0.b(), $$0.e(), $$0.f(), $$0.g());
   }

   private static boolean b(double $$0, double $$1, double $$2, float $$3, float $$4) {
      return Double.isNaN($$0) || Double.isNaN($$1) || Double.isNaN($$2) || !Floats.isFinite($$4) || !Floats.isFinite($$3);
   }

   private static double a(double $$0) {
      return aye.a($$0, -3.0E7, 3.0E7);
   }

   private static double b(double $$0) {
      return aye.a($$0, -2.0E7, 2.0E7);
   }

   @Override
   public void a(aha $$0) {
      ze.a($$0, this, this.f.z());
      if (b($$0.b(), $$0.e(), $$0.f(), $$0.g(), $$0.h())) {
         this.b(wu.c("multiplayer.disconnect.invalid_vehicle_movement"));
      } else {
         bsd $$1 = this.f.cZ();
         if ($$1 != this.f && $$1.cQ() == this.f && $$1 == this.y) {
            aqk $$2 = this.f.z();
            double $$3 = $$1.du();
            double $$4 = $$1.dw();
            double $$5 = $$1.dA();
            double $$6 = a($$0.b());
            double $$7 = b($$0.e());
            double $$8 = a($$0.f());
            float $$9 = aye.g($$0.g());
            float $$10 = aye.g($$0.h());
            double $$11 = $$6 - this.z;
            double $$12 = $$7 - this.A;
            double $$13 = $$8 - this.B;
            double $$14 = $$1.ds().g();
            double $$15 = $$11 * $$11 + $$12 * $$12 + $$13 * $$13;
            if ($$15 - $$14 > 100.0 && !this.h()) {
               h.warn("{} (vehicle of {}) moved too quickly! {},{},{}", new Object[]{$$1.af().getString(), this.f.af().getString(), $$11, $$12, $$13});
               this.b(new adi($$1));
               return;
            }

            boolean $$16 = $$2.a($$1, $$1.cK().h(0.0625));
            $$11 = $$6 - this.C;
            $$12 = $$7 - this.D - 1.0E-6;
            $$13 = $$8 - this.E;
            boolean $$17 = $$1.S;
            if ($$1 instanceof bsy $$18 && $$18.q_()) {
               $$18.n();
            }

            $$1.a(btd.b, new evz($$11, $$12, $$13));
            $$11 = $$6 - $$1.du();
            $$12 = $$7 - $$1.dw();
            if ($$12 > -0.5 || $$12 < 0.5) {
               $$12 = 0.0;
            }

            $$13 = $$8 - $$1.dA();
            $$15 = $$11 * $$11 + $$12 * $$12 + $$13 * $$13;
            boolean $$20 = false;
            if ($$15 > 0.0625) {
               $$20 = true;
               h.warn("{} (vehicle of {}) moved wrongly! {}", new Object[]{$$1.af().getString(), this.f.af().getString(), Math.sqrt($$15)});
            }

            $$1.a($$6, $$7, $$8, $$9, $$10);
            boolean $$21 = $$2.a($$1, $$1.cK().h(0.0625));
            if ($$16 && ($$20 || !$$21)) {
               $$1.a($$3, $$4, $$5, $$9, $$10);
               this.b(new adi($$1));
               return;
            }

            this.f.z().l().a(this.f);
            this.f.b(this.f.du() - $$3, this.f.dw() - $$4, this.f.dA() - $$5);
            this.K = $$12 >= -0.03125 && !$$17 && !this.d.ae() && !$$1.aX() && this.b($$1);
            this.C = $$1.du();
            this.D = $$1.dw();
            this.E = $$1.dA();
         }
      }
   }

   private boolean b(bsd $$0) {
      return $$0.dP().a($$0.cK().g(0.0625).b(0.0, -0.55, 0.0)).allMatch(dsg.a::i);
   }

   @Override
   public void a(agd $$0) {
      ze.a($$0, this, this.f.z());
      if ($$0.b() == this.G) {
         if (this.F == null) {
            this.b(wu.c("multiplayer.disconnect.invalid_player_movement"));
            return;
         }

         this.f.a(this.F.c, this.F.d, this.F.e, this.f.dF(), this.f.dH());
         this.v = this.F.c;
         this.w = this.F.d;
         this.x = this.F.e;
         if (this.f.O()) {
            this.f.P();
         }

         this.F = null;
      }
   }

   @Override
   public void a(ahj $$0) {
      ze.a($$0, this, this.f.z());
      this.d.aJ().a($$0.b()).ifPresent(this.f.I()::e);
   }

   @Override
   public void a(ahi $$0) {
      ze.a($$0, this, this.f.z());
      this.f.I().a($$0.b(), $$0.e(), $$0.f());
   }

   @Override
   public void a(ahl $$0) {
      ze.a($$0, this, this.f.z());
      if ($$0.e() == ahl.a.a) {
         akk $$1 = Objects.requireNonNull($$0.f());
         af $$2 = this.d.aE().a($$1);
         if ($$2 != null) {
            this.f.Q().a($$2);
         }
      }
   }

   @Override
   public void a(agn $$0) {
      ze.a($$0, this, this.f.z());
      StringReader $$1 = new StringReader($$0.e());
      if ($$1.canRead() && $$1.peek() == '/') {
         $$1.skip();
      }

      ParseResults<eq> $$2 = this.d.aH().a().parse($$1, this.f.dg());
      this.d.aH().a().getCompletionSuggestions($$2).thenAccept($$1x -> {
         Suggestions $$2x = $$1x.getList().size() <= 1000 ? $$1x : new Suggestions($$1x.getRange(), $$1x.getList().subList(0, 1000));
         this.b(new acf($$0.b(), $$2x));
      });
   }

   @Override
   public void a(ahp $$0) {
      ze.a($$0, this, this.f.z());
      if (!this.d.q()) {
         this.f.a(wu.c("advMode.notEnabled"));
      } else if (!this.f.gv()) {
         this.f.a(wu.c("advMode.notAllowed"));
      } else {
         dbe $$1 = null;
         dpx $$2 = null;
         ja $$3 = $$0.b();
         dpn $$4 = this.f.dP().c_($$3);
         if ($$4 instanceof dpx) {
            $$2 = (dpx)$$4;
            $$1 = $$2.b();
         }

         String $$5 = $$0.e();
         boolean $$6 = $$0.f();
         if ($$1 != null) {
            dpx.a $$7 = $$2.l();
            dsh $$8 = this.f.dP().a_($$3);
            jf $$9 = $$8.c(dgo.b);

            dsh $$10 = switch ($$0.i()) {
               case a -> dfh.kH.o();
               case b -> dfh.kG.o();
               default -> dfh.fN.o();
            };
            dsh $$11 = $$10.a(dgo.b, $$9).a(dgo.c, Boolean.valueOf($$0.g()));
            if ($$11 != $$8) {
               this.f.dP().a($$3, $$11, 2);
               $$4.b($$11);
               this.f.dP().m($$3).a($$4);
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
            if (!aza.b($$5)) {
               this.f.a(wu.a("advMode.setCommand.success", $$5));
            }
         }
      }
   }

   @Override
   public void a(ahq $$0) {
      ze.a($$0, this, this.f.z());
      if (!this.d.q()) {
         this.f.a(wu.c("advMode.notEnabled"));
      } else if (!this.f.gv()) {
         this.f.a(wu.c("advMode.notAllowed"));
      } else {
         dbe $$1 = $$0.a(this.f.dP());
         if ($$1 != null) {
            $$1.a($$0.b());
            $$1.a($$0.e());
            if (!$$0.e()) {
               $$1.c(null);
            }

            $$1.f();
            this.f.a(wu.a("advMode.setCommand.success", $$0.b()));
         }
      }
   }

   @Override
   public void a(ahc $$0) {
      ze.a($$0, this, this.f.z());
      this.f.fY().c($$0.b());
      this.f.c.b(new ack(-2, 0, this.f.fY().k, this.f.fY().a(this.f.fY().k)));
      this.f.c.b(new ack(-2, 0, $$0.b(), this.f.fY().a($$0.b())));
      this.f.c.b(new aen(this.f.fY().k));
   }

   @Override
   public void a(ahk $$0) {
      ze.a($$0, this, this.f.z());
      if (this.f.cd instanceof cpg $$1) {
         if (!$$1.b(this.f)) {
            h.debug("Player {} interacted with invalid menu {}", this.f, $$1);
            return;
         }

         $$1.a($$0.b());
      }
   }

   @Override
   public void a(ahn $$0) {
      ze.a($$0, this, this.f.z());
      if (this.f.cd instanceof cpi $$1) {
         if (!this.f.cd.b(this.f)) {
            h.debug("Player {} interacted with invalid menu {}", this.f, this.f.cd);
            return;
         }

         $$1.a($$0.b(), $$0.e());
      }
   }

   @Override
   public void a(aht $$0) {
      ze.a($$0, this, this.f.z());
      if (this.f.gv()) {
         ja $$1 = $$0.b();
         dsh $$2 = this.f.dP().a_($$1);
         if (this.f.dP().c_($$1) instanceof drc $$4) {
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
               if ($$0.e() == drc.a.b) {
                  if ($$4.A()) {
                     this.f.a(wu.a("structure_block.save_success", $$5), false);
                  } else {
                     this.f.a(wu.a("structure_block.save_failure", $$5), false);
                  }
               } else if ($$0.e() == drc.a.c) {
                  if (!$$4.C()) {
                     this.f.a(wu.a("structure_block.load_not_found", $$5), false);
                  } else if ($$4.a(this.f.z())) {
                     this.f.a(wu.a("structure_block.load_success", $$5), false);
                  } else {
                     this.f.a(wu.a("structure_block.load_prepare", $$5), false);
                  }
               } else if ($$0.e() == drc.a.d) {
                  if ($$4.z()) {
                     this.f.a(wu.a("structure_block.size_success", $$5), false);
                  } else {
                     this.f.a(wu.c("structure_block.size_failure"), false);
                  }
               }
            } else {
               this.f.a(wu.a("structure_block.invalid_structure_name", $$0.g()), false);
            }

            $$4.e();
            this.f.dP().a($$1, $$2, $$2, 3);
         }
      }
   }

   @Override
   public void a(ahs $$0) {
      ze.a($$0, this, this.f.z());
      if (this.f.gv()) {
         ja $$1 = $$0.b();
         dsh $$2 = this.f.dP().a_($$1);
         if (this.f.dP().c_($$1) instanceof dqn $$4) {
            $$4.a($$0.e());
            $$4.b($$0.f());
            $$4.a(akj.a(lr.aT, $$0.g()));
            $$4.a($$0.h());
            $$4.a($$0.i());
            $$4.a($$0.k());
            $$4.b($$0.j());
            $$4.e();
            this.f.dP().a($$1, $$2, $$2, 3);
         }
      }
   }

   @Override
   public void a(agx $$0) {
      ze.a($$0, this, this.f.z());
      if (this.f.gv()) {
         ja $$1 = $$0.b();
         if (this.f.dP().c_($$1) instanceof dqn $$3) {
            $$3.a(this.f.z(), $$0.e(), $$0.f());
         }
      }
   }

   @Override
   public void a(ahm $$0) {
      ze.a($$0, this, this.f.z());
      int $$1 = $$0.b();
      if (this.f.cd instanceof cqo $$2) {
         if (!$$2.b(this.f)) {
            h.debug("Player {} interacted with invalid menu {}", this.f, $$2);
            return;
         }

         $$2.e($$1);
         $$2.h($$1);
      }
   }

   @Override
   public void a(agu $$0) {
      int $$1 = $$0.b();
      if (cmg.d($$1) || $$1 == 40) {
         List<String> $$2 = Lists.newArrayList();
         Optional<String> $$3 = $$0.f();
         $$3.ifPresent($$2::add);
         $$0.e().stream().limit(100L).forEach($$2::add);
         Consumer<List<arc>> $$4 = $$3.isPresent() ? $$1x -> this.a((arc)$$1x.get(0), $$1x.subList(1, $$1x.size()), $$1) : $$1x -> this.a($$1x, $$1);
         this.a($$2).thenAcceptAsync($$4, this.d);
      }
   }

   private void a(List<arc> $$0, int $$1) {
      cua $$2 = this.f.fY().a($$1);
      if ($$2.a(cud.tZ)) {
         List<arb<String>> $$3 = $$0.stream().map(this::a).toList();
         $$2.b(kn.I, new cxh($$3));
      }
   }

   private void a(arc $$0, List<arc> $$1, int $$2) {
      cua $$3 = this.f.fY().a($$2);
      if ($$3.a(cud.tZ)) {
         cua $$4 = $$3.a(cud.ua, 1);
         $$4.c(kn.I);
         List<arb<wu>> $$5 = $$1.stream().map($$0x -> this.a($$0x).a(wu::b)).toList();
         $$4.b(kn.J, new cxi(this.a($$0), this.f.af().getString(), 0, $$5, true));
         this.f.fY().a($$2, $$4);
      }
   }

   private arb<String> a(arc $$0) {
      return this.f.Y() ? arb.a($$0.b()) : arb.a($$0);
   }

   @Override
   public void a(agv $$0) {
      ze.a($$0, this, this.f.z());
      if (this.f.l(2)) {
         bsd $$1 = this.f.dP().a($$0.e());
         if ($$1 != null) {
            tx $$2 = $$1.f(new tx());
            this.f.c.b(new afn($$0.b(), $$2));
         }
      }
   }

   @Override
   public void a(ags $$0) {
      ze.a($$0, this, this.f.z());
      if (!this.f.N_() && $$0.e() == this.f.cd.j) {
         if (this.f.cd instanceof cpt $$1 && $$1.m() instanceof dqb $$2) {
            $$2.a($$0.b(), $$0.f());
         }
      }
   }

   @Override
   public void a(age $$0) {
      ze.a($$0, this, this.f.z());
      if (this.f.l(2)) {
         dpn $$1 = this.f.dP().c_($$0.e());
         tx $$2 = $$1 != null ? $$1.d(this.f.dR()) : null;
         this.f.c.b(new afn($$0.b(), $$2));
      }
   }

   @Override
   public void a(agz $$0) {
      ze.a($$0, this, this.f.z());
      if (b($$0.a(0.0), $$0.b(0.0), $$0.c(0.0), $$0.a(0.0F), $$0.b(0.0F))) {
         this.b(wu.c("multiplayer.disconnect.invalid_player_movement"));
      } else {
         aqk $$1 = this.f.z();
         if (!this.f.g) {
            if (this.o == 0) {
               this.l();
            }

            if (this.F != null) {
               if (this.o - this.H > 20) {
                  this.H = this.o;
                  this.a(this.F.c, this.F.d, this.F.e, this.f.dF(), this.f.dH());
               }
            } else {
               this.H = this.o;
               double $$2 = a($$0.a(this.f.du()));
               double $$3 = b($$0.b(this.f.dw()));
               double $$4 = a($$0.c(this.f.dA()));
               float $$5 = aye.g($$0.a(this.f.dF()));
               float $$6 = aye.g($$0.b(this.f.dH()));
               if (this.f.bR()) {
                  this.f.a(this.f.du(), this.f.dw(), this.f.dA(), $$5, $$6);
                  this.f.z().l().a(this.f);
               } else {
                  double $$7 = this.f.du();
                  double $$8 = this.f.dw();
                  double $$9 = this.f.dA();
                  double $$10 = $$2 - this.s;
                  double $$11 = $$3 - this.t;
                  double $$12 = $$4 - this.u;
                  double $$13 = this.f.ds().g();
                  double $$14 = $$10 * $$10 + $$11 * $$11 + $$12 * $$12;
                  if (this.f.fH()) {
                     if ($$14 > 1.0) {
                        this.a(this.f.du(), this.f.dw(), this.f.dA(), $$5, $$6);
                     }
                  } else {
                     boolean $$15 = this.f.fA();
                     if ($$1.s().i()) {
                        this.M++;
                        int $$16 = this.M - this.N;
                        if ($$16 > 5) {
                           h.debug("{} is sending move packets too frequently ({} packets since last tick)", this.f.af().getString(), $$16);
                           $$16 = 1;
                        }

                        if (!this.f.O() && (!this.f.dP().ab().b(dbz.t) || !$$15)) {
                           float $$17 = $$15 ? 300.0F : 100.0F;
                           if ($$14 - $$13 > (double)($$17 * (float)$$16) && !this.h()) {
                              h.warn("{} moved too quickly! {},{},{}", new Object[]{this.f.af().getString(), $$10, $$11, $$12});
                              this.a(this.f.du(), this.f.dw(), this.f.dA(), this.f.dF(), this.f.dH());
                              return;
                           }
                        }
                     }

                     evu $$18 = this.f.cK();
                     $$10 = $$2 - this.v;
                     $$11 = $$3 - this.w;
                     $$12 = $$4 - this.x;
                     boolean $$19 = $$11 > 0.0;
                     if (this.f.aE() && !$$0.b() && $$19) {
                        this.f.ff();
                     }

                     boolean $$20 = this.f.S;
                     this.f.a(btd.b, new evz($$10, $$11, $$12));
                     $$10 = $$2 - this.f.du();
                     $$11 = $$3 - this.f.dw();
                     if ($$11 > -0.5 || $$11 < 0.5) {
                        $$11 = 0.0;
                     }

                     $$12 = $$4 - this.f.dA();
                     $$14 = $$10 * $$10 + $$11 * $$11 + $$12 * $$12;
                     boolean $$22 = false;
                     if (!this.f.O() && $$14 > 0.0625 && !this.f.fH() && !this.f.e.e() && this.f.e.b() != dca.d) {
                        $$22 = true;
                        h.warn("{} moved wrongly!", this.f.af().getString());
                     }

                     if (this.f.ag || this.f.fH() || (!$$22 || !$$1.a(this.f, $$18)) && !this.a($$1, $$18, $$2, $$3, $$4)) {
                        this.f.a($$2, $$3, $$4, $$5, $$6);
                        boolean $$23 = this.f.fn();
                        this.I = $$11 >= -0.03125
                           && !$$20
                           && this.f.e.b() != dca.d
                           && !this.d.ae()
                           && !this.f.fZ().c
                           && !this.f.b(brn.y)
                           && !$$15
                           && !$$23
                           && this.b(this.f);
                        this.f.z().l().a(this.f);
                        this.f.a(this.f.du() - $$7, this.f.dw() - $$8, this.f.dA() - $$9, $$0.b());
                        this.f.a($$0.b(), new evz(this.f.du() - $$7, this.f.dw() - $$8, this.f.dA() - $$9));
                        if ($$19) {
                           this.f.n();
                        }

                        if ($$0.b() || this.f.dX() || this.f.q_() || this.f.N_() || $$15 || $$23) {
                           this.f.gA();
                        }

                        this.f.b(this.f.du() - $$7, this.f.dw() - $$8, this.f.dA() - $$9);
                        this.v = this.f.du();
                        this.w = this.f.dw();
                        this.x = this.f.dA();
                     } else {
                        this.a($$7, $$8, $$9, $$5, $$6);
                        this.f.a(this.f.du() - $$7, this.f.dw() - $$8, this.f.dA() - $$9, $$0.b());
                     }
                  }
               }
            }
         }
      }
   }

   private boolean a(dcg $$0, evu $$1, double $$2, double $$3, double $$4) {
      evu $$5 = this.f.cK().d($$2 - this.f.du(), $$3 - this.f.dw(), $$4 - this.f.dA());
      Iterable<ews> $$6 = $$0.d(this.f, $$5.h(1.0E-5F));
      ews $$7 = ewp.a($$1.h(1.0E-5F));

      for (ews $$8 : $$6) {
         if (!ewp.c($$8, $$7, ewd.i)) {
            return true;
         }
      }

      return false;
   }

   public void a(double $$0, double $$1, double $$2, float $$3, float $$4) {
      this.a($$0, $$1, $$2, $$3, $$4, Collections.emptySet());
   }

   public void a(double $$0, double $$1, double $$2, float $$3, float $$4, Set<btm> $$5) {
      double $$6 = $$5.contains(btm.a) ? this.f.du() : 0.0;
      double $$7 = $$5.contains(btm.b) ? this.f.dw() : 0.0;
      double $$8 = $$5.contains(btm.c) ? this.f.dA() : 0.0;
      float $$9 = $$5.contains(btm.d) ? this.f.dF() : 0.0F;
      float $$10 = $$5.contains(btm.e) ? this.f.dH() : 0.0F;
      this.F = new evz($$0, $$1, $$2);
      if (++this.G == Integer.MAX_VALUE) {
         this.G = 0;
      }

      this.H = this.o;
      this.f.gA();
      this.f.a($$0, $$1, $$2, $$3, $$4);
      this.f.c.b(new adv($$0 - $$6, $$1 - $$7, $$2 - $$8, $$3 - $$9, $$4 - $$10, $$5, this.G));
   }

   @Override
   public void a(ahf $$0) {
      ze.a($$0, this, this.f.z());
      ja $$1 = $$0.b();
      this.f.G();
      ahf.a $$2 = $$0.f();
      switch ($$2) {
         case g:
            if (!this.f.N_()) {
               cua $$3 = this.f.b(bqc.b);
               this.f.a(bqc.b, this.f.b(bqc.a));
               this.f.a(bqc.a, $$3);
               this.f.fx();
            }

            return;
         case e:
            if (!this.f.N_()) {
               this.f.a(false);
            }

            return;
         case d:
            if (!this.f.N_()) {
               this.f.a(true);
            }

            return;
         case f:
            this.f.fw();
            return;
         case a:
         case b:
         case c:
            this.f.e.a($$1, $$2, $$0.e(), this.f.dP().am(), $$0.g());
            this.f.c.a($$0.g());
            return;
         default:
            throw new IllegalArgumentException("Invalid player action");
      }
   }

   private static boolean a(aql $$0, cua $$1) {
      if ($$1.e()) {
         return false;
      } else {
         ctv $$2 = $$1.g();
         return ($$2 instanceof cry || $$2 instanceof csg) && !$$0.gt().a($$2);
      }
   }

   @Override
   public void a(ahx $$0) {
      ze.a($$0, this, this.f.z());
      this.f.c.a($$0.f());
      aqk $$1 = this.f.z();
      bqc $$2 = $$0.b();
      cua $$3 = this.f.b($$2);
      if ($$3.a($$1.J())) {
         evv $$4 = $$0.e();
         evz $$5 = $$4.e();
         ja $$6 = $$4.a();
         if (this.f.a($$6, 1.0)) {
            evz $$7 = $$5.d(evz.b($$6));
            double $$8 = 1.0000001;
            if (Math.abs($$7.a()) < 1.0000001 && Math.abs($$7.b()) < 1.0000001 && Math.abs($$7.c()) < 1.0000001) {
               jf $$9 = $$4.b();
               this.f.G();
               int $$10 = this.f.dP().am();
               if ($$6.v() < $$10) {
                  if (this.F == null && $$1.a(this.f, $$6)) {
                     bqd $$11 = this.f.e.a(this.f, $$1, $$3, $$2, $$4);
                     if ($$11.a()) {
                        am.P.a(this.f, $$4.a(), $$3.s());
                     }

                     if ($$9 == jf.b && !$$11.a() && $$6.v() >= $$10 - 1 && a(this.f, $$3)) {
                        wu $$12 = wu.a("build.tooHigh", $$10 - 1).a(n.m);
                        this.f.b($$12, true);
                     } else if ($$11.b()) {
                        this.f.a($$2, true);
                     }
                  }
               } else {
                  wu $$13 = wu.a("build.tooHigh", $$10 - 1).a(n.m);
                  this.f.b($$13, true);
               }

               this.f.c.b(new abw($$1, $$6));
               this.f.c.b(new abw($$1, $$6.a($$9)));
            } else {
               h.warn("Rejecting UseItemOnPacket from {}: Location {} too far away from hit block {}.", new Object[]{this.f.fX().getName(), $$5, $$6});
            }
         }
      }
   }

   @Override
   public void a(ahy $$0) {
      ze.a($$0, this, this.f.z());
      this.a($$0.e());
      aqk $$1 = this.f.z();
      bqc $$2 = $$0.b();
      cua $$3 = this.f.b($$2);
      this.f.G();
      if (!$$3.e() && $$3.a($$1.J())) {
         bqd $$4 = this.f.e.a(this.f, $$1, $$3, $$2);
         if ($$4.b()) {
            this.f.a($$2, true);
         }
      }
   }

   @Override
   public void a(ahw $$0) {
      ze.a($$0, this, this.f.z());
      if (this.f.N_()) {
         for (aqk $$1 : this.d.K()) {
            bsd $$2 = $$0.a($$1);
            if ($$2 != null) {
               this.f.a($$1, $$2.du(), $$2.dw(), $$2.dA(), $$2.dF(), $$2.dH());
               return;
            }
         }
      }
   }

   @Override
   public void a(ahb $$0) {
      ze.a($$0, this, this.f.z());
      if (this.f.dd() instanceof coe $$2) {
         $$2.a($$0.b(), $$0.e());
      }
   }

   @Override
   public void a(wu $$0) {
      h.info("{} lost connection: {}", this.f.af().getString(), $$0.getString());
      this.p();
      super.a($$0);
   }

   private void p() {
      this.S.close();
      this.d.aw();
      this.d.ah().a(wu.a("multiplayer.player.left", this.f.O_()).a(n.o), false);
      this.f.u();
      this.d.ah().c(this.f);
      this.f.X().b();
   }

   public void a(int $$0) {
      if ($$0 < 0) {
         throw new IllegalArgumentException("Expected packet sequence nr >= 0");
      } else {
         this.p = Math.max($$0, this.p);
      }
   }

   @Override
   public void a(aho $$0) {
      ze.a($$0, this, this.f.z());
      if ($$0.b() >= 0 && $$0.b() < cmg.g()) {
         if (this.f.fY().k != $$0.b() && this.f.fs() == bqc.a) {
            this.f.fx();
         }

         this.f.fY().k = $$0.b();
         this.f.G();
      } else {
         h.warn("{} tried to set an invalid carried item", this.f.af().getString());
      }
   }

   @Override
   public void a(agj $$0) {
      Optional<xb> $$1 = this.a($$0.h());
      if (!$$1.isEmpty()) {
         this.a($$0.b(), () -> {
            xk $$2;
            try {
               $$2 = this.a($$0, $$1.get());
            } catch (xo.a var6) {
               this.a(var6);
               return;
            }

            CompletableFuture<arc> $$5 = this.a($$2.c());
            wu $$6 = this.d.bm().decorate(this.f, $$2.d());
            this.S.append($$5, $$2x -> {
               xk $$3 = $$2.a($$6).a($$2x.e());
               this.b($$3);
            });
         });
      }
   }

   @Override
   public void a(agh $$0) {
      this.a($$0.b(), () -> {
         this.b($$0.b());
         this.q();
      });
   }

   private void b(String $$0) {
      ParseResults<eq> $$1 = this.c($$0);
      if (this.d.aB() && xm.a($$1)) {
         h.error("Received unsigned command packet from {}, but the command requires signable arguments: {}", this.f.fX().getName(), $$0);
         this.f.a(m);
      } else {
         this.d.aH().a($$1, $$0);
      }
   }

   @Override
   public void a(agi $$0) {
      Optional<xb> $$1 = this.a($$0.h());
      if (!$$1.isEmpty()) {
         this.a($$0.b(), () -> {
            this.a($$0, $$1.get());
            this.q();
         });
      }
   }

   private void a(agi $$0, xb $$1) {
      ParseResults<eq> $$2 = this.c($$0.b());

      Map<String, xk> $$3;
      try {
         $$3 = this.a($$0, xm.b($$2), $$1);
      } catch (xo.a var6) {
         this.a(var6);
         return;
      }

      eo $$6 = new eo.a($$3);
      $$2 = er.a($$2, $$1x -> $$1x.a($$6, this.S));
      this.d.aH().a($$2, $$0.b());
   }

   private void a(xo.a $$0) {
      h.warn("Failed to update secure chat state for {}: '{}'", this.f.fX().getName(), $$0.a().getString());
      this.f.a($$0.a().f().a(n.m));
   }

   private <S> Map<String, xk> a(agi $$0, xm<S> $$1, xb $$2) throws xo.a {
      List<ex.a> $$3 = $$0.g().a();
      List<xm.a<S>> $$4 = $$1.a();
      if ($$3.isEmpty()) {
         return this.b($$4);
      } else {
         Map<String, xk> $$5 = new Object2ObjectOpenHashMap();

         for (ex.a $$6 : $$3) {
            xm.a<S> $$7 = $$1.a($$6.a());
            if ($$7 == null) {
               this.P.setChainBroken();
               throw a($$0.b(), $$3, $$4);
            }

            xn $$8 = new xn($$7.c(), $$0.e(), $$0.f(), $$2);
            $$5.put($$7.a(), this.P.unpack($$6.b(), $$8));
         }

         for (xm.a<S> $$9 : $$4) {
            if (!$$5.containsKey($$9.a())) {
               throw a($$0.b(), $$3, $$4);
            }
         }

         return $$5;
      }
   }

   private <S> Map<String, xk> b(List<xm.a<S>> $$0) throws xo.a {
      Map<String, xk> $$1 = new HashMap<>();

      for (xm.a<S> $$2 : $$0) {
         xn $$3 = xn.a($$2.c());
         $$1.put($$2.a(), this.P.unpack(null, $$3));
      }

      return $$1;
   }

   private static <S> xo.a a(String $$0, List<ex.a> $$1, List<xm.a<S>> $$2) {
      String $$3 = $$1.stream().map(ex.a::a).collect(Collectors.joining(", "));
      String $$4 = $$2.stream().map(xm.a::a).collect(Collectors.joining(", "));
      h.error("Signed command mismatch between server and client ('{}'): got [{}] from client, but expected [{}]", new Object[]{$$0, $$3, $$4});
      return new xo.a(m);
   }

   private ParseResults<eq> c(String $$0) {
      CommandDispatcher<eq> $$1 = this.d.aH().a();
      return $$1.parse($$0, this.f.dg());
   }

   private void a(String $$0, Runnable $$1) {
      if (d($$0)) {
         this.b(wu.c("multiplayer.disconnect.illegal_characters"));
      } else if (this.f.D() == cmf.c) {
         this.b(new afl(wu.c("chat.disabled.options").a(n.m), false));
      } else {
         this.f.G();
         this.d.execute($$1);
      }
   }

   private Optional<xb> a(xb.b $$0) {
      synchronized (this.Q) {
         Optional<xb> $$1 = this.Q.a($$0);
         if ($$1.isEmpty()) {
            h.warn("Failed to validate message acknowledgements from {}", this.f.af().getString());
            this.b(l);
         }

         return $$1;
      }
   }

   private static boolean d(String $$0) {
      for (int $$1 = 0; $$1 < $$0.length(); $$1++) {
         if (!aza.a($$0.charAt($$1))) {
            return true;
         }
      }

      return false;
   }

   private xk a(agj $$0, xb $$1) throws xo.a {
      xn $$2 = new xn($$0.b(), $$0.e(), $$0.f(), $$1);
      return this.P.unpack($$0.g(), $$2);
   }

   private void b(xk $$0) {
      this.d.ah().a($$0, this.f, wq.a(wq.c, this.f));
      this.q();
   }

   private void q() {
      this.q += 20;
      if (this.q > 200 && !this.d.ah().f(this.f.fX())) {
         this.b(wu.c("disconnect.spam"));
      }
   }

   @Override
   public void a(agg $$0) {
      synchronized (this.Q) {
         if (!this.Q.a($$0.b())) {
            h.warn("Failed to validate message acknowledgements from {}", this.f.af().getString());
            this.b(l);
         }
      }
   }

   @Override
   public void a(ahv $$0) {
      ze.a($$0, this, this.f.z());
      this.f.G();
      this.f.a($$0.b());
   }

   @Override
   public void a(ahg $$0) {
      ze.a($$0, this, this.f.z());
      this.f.G();
      switch ($$0.e()) {
         case a:
            this.f.g(true);
            break;
         case b:
            this.f.g(false);
            break;
         case d:
            this.f.h(true);
            break;
         case e:
            this.f.h(false);
            break;
         case c:
            if (this.f.fH()) {
               this.f.a(false, true);
               this.F = this.f.dn();
            }
            break;
         case f:
            if (this.f.dd() instanceof btj $$1) {
               int $$2 = $$0.f();
               if ($$1.a() && $$2 > 0) {
                  $$1.c($$2);
               }
            }
            break;
         case g:
            if (this.f.dd() instanceof btj $$3) {
               $$3.b();
            }
            break;
         case h:
            if (this.f.dc() instanceof bsr $$4) {
               $$4.b(this.f);
            }
            break;
         case i:
            if (!this.f.gd()) {
               this.f.gf();
            }
            break;
         default:
            throw new IllegalArgumentException("Invalid client command!");
      }
   }

   public void a(xk $$0) {
      xg $$1 = $$0.l();
      if ($$1 != null) {
         this.R.a($$0.m(), $$0.l());
         int $$2;
         synchronized (this.Q) {
            this.Q.a($$1);
            $$2 = this.Q.a();
         }

         if ($$2 > 4096) {
            this.b(wu.c("multiplayer.disconnect.too_many_pending_chats"));
         }
      }
   }

   public void a(xk $$0, wq.a $$1) {
      this.b(new ado($$0.k().c(), $$0.k().b(), $$0.l(), $$0.m().a(this.R), $$0.n(), $$0.o(), $$1));
      this.a($$0);
   }

   public void a(wu $$0, wq.a $$1) {
      this.b(new acq($$0, $$1));
   }

   public SocketAddress m() {
      return this.e.d();
   }

   public void n() {
      this.T = true;
      this.p();
      this.b(afj.a);
      this.e.a(abc.b);
   }

   @Override
   public void a(ajf $$0) {
      this.e.a(new ajc($$0.b()));
   }

   @Override
   public void a(agw $$0) {
      ze.a($$0, this, this.f.z());
      final aqk $$1 = this.f.z();
      final bsd $$2 = $$0.a($$1);
      this.f.G();
      this.f.g($$0.b());
      if ($$2 != null) {
         if (!$$1.C_().a($$2.dp())) {
            return;
         }

         evu $$3 = $$2.cK();
         if (this.f.a($$3, 1.0)) {
            $$0.a(new agw.c() {
               private void a(bqc $$0, ark.a $$1x) {
                  cua $$2 = ark.this.f.b($$0);
                  if ($$2.a($$1.J())) {
                     cua $$3 = $$2.s();
                     bqd $$4 = $$1.run(ark.this.f, $$2, $$0);
                     if ($$4.a()) {
                        am.T.a(ark.this.f, $$4.c() ? $$3 : cua.l, $$2);
                        if ($$4.b()) {
                           ark.this.f.a($$0, true);
                        }
                     }
                  }
               }

               @Override
               public void a(bqc $$0) {
                  this.a($$0, cmh::a);
               }

               @Override
               public void a(bqc $$0, evz $$1x) {
                  this.a($$0, ($$1xxx, $$2xx, $$3) -> $$2xx.a($$1xxx, $$1, $$3));
               }

               @Override
               public void a() {
                  label23:
                  if (!($$2 instanceof cir) && !($$2 instanceof bso) && $$2 != ark.this.f) {
                     if ($$2 instanceof cmn $$0 && !$$0.ct()) {
                        break label23;
                     }

                     cua $$1 = ark.this.f.b(bqc.a);
                     if (!$$1.a($$1.J())) {
                        return;
                     }

                     ark.this.f.e($$2);
                     return;
                  }

                  ark.this.b(wu.c("multiplayer.disconnect.invalid_entity_attacked"));
                  ark.h.warn("Player {} tried to attack an invalid entity", ark.this.f.af().getString());
               }
            });
         }
      }
   }

   @Override
   public void a(agm $$0) {
      ze.a($$0, this, this.f.z());
      this.f.G();
      agm.a $$1 = $$0.b();
      switch ($$1) {
         case a:
            if (this.f.g) {
               this.f.g = false;
               this.f = this.d.ah().a(this.f, true);
               am.w.a(this.f, dcd.j, dcd.h);
            } else {
               if (this.f.ew() > 0.0F) {
                  return;
               }

               this.f = this.d.ah().a(this.f, false);
               if (this.d.j()) {
                  this.f.a(dca.d);
                  this.f.dP().ab().a(dbz.r).a(false, this.d);
               }
            }
            break;
         case b:
            this.f.H().a(this.f);
      }
   }

   @Override
   public void a(agr $$0) {
      ze.a($$0, this, this.f.z());
      this.f.s();
   }

   @Override
   public void a(agq $$0) {
      ze.a($$0, this, this.f.z());
      this.f.G();
      if (this.f.cd.j == $$0.b()) {
         if (this.f.N_()) {
            this.f.cd.b();
         } else if (!this.f.cd.b(this.f)) {
            h.debug("Player {} interacted with invalid menu {}", this.f, this.f.cd);
         } else {
            int $$1 = $$0.e();
            if (!this.f.cd.a($$1)) {
               h.debug("Player {} clicked invalid slot index: {}, available slots: {}", new Object[]{this.f.af(), $$1, this.f.cd.i.size()});
            } else {
               boolean $$2 = $$0.j() != this.f.cd.j();
               this.f.cd.h();
               this.f.cd.a($$1, $$0.f(), $$0.i(), this.f);
               ObjectIterator var4 = Int2ObjectMaps.fastIterable($$0.h()).iterator();

               while (var4.hasNext()) {
                  Entry<cua> $$3 = (Entry<cua>)var4.next();
                  this.f.cd.b($$3.getIntKey(), (cua)$$3.getValue());
               }

               this.f.cd.a($$0.g());
               this.f.cd.i();
               if ($$2) {
                  this.f.cd.e();
               } else {
                  this.f.cd.d();
               }
            }
         }
      }
   }

   @Override
   public void a(ahd $$0) {
      ze.a($$0, this, this.f.z());
      this.f.G();
      if (!this.f.N_() && this.f.cd.j == $$0.b() && this.f.cd instanceof cqs) {
         if (!this.f.cd.b(this.f)) {
            h.debug("Player {} interacted with invalid menu {}", this.f, this.f.cd);
         } else {
            this.d.aJ().a($$0.e()).ifPresent($$1 -> ((cqs)this.f.cd).a($$0.f(), (cyi<?>)$$1, this.f));
         }
      }
   }

   @Override
   public void a(agp $$0) {
      ze.a($$0, this, this.f.z());
      this.f.G();
      if (this.f.cd.j == $$0.b() && !this.f.N_()) {
         if (!this.f.cd.b(this.f)) {
            h.debug("Player {} interacted with invalid menu {}", this.f, this.f.cd);
         } else {
            boolean $$1 = this.f.cd.a(this.f, $$0.e());
            if ($$1) {
               this.f.cd.d();
            }
         }
      }
   }

   @Override
   public void a(ahr $$0) {
      ze.a($$0, this, this.f.z());
      if (this.f.e.e()) {
         boolean $$1 = $$0.b() < 0;
         cua $$2 = $$0.e();
         if (!$$2.a(this.f.dP().J())) {
            return;
         }

         cwo $$3 = $$2.a(kn.O, cwo.a);
         if ($$3.a("x") && $$3.a("y") && $$3.a("z")) {
            ja $$4 = dpn.b($$3.d());
            if (this.f.dP().p($$4)) {
               dpn $$5 = this.f.dP().c_($$4);
               if ($$5 != null) {
                  $$5.a($$2, this.f.dP().H_());
               }
            }
         }

         boolean $$6 = $$0.b() >= 1 && $$0.b() <= 45;
         boolean $$7 = $$2.e() || $$2.H() <= $$2.j();
         if ($$6 && $$7) {
            this.f.cc.b($$0.b()).e($$2);
            this.f.cc.d();
         } else if ($$1 && $$7 && this.r < 200) {
            this.r += 20;
            this.f.a($$2, true);
         }
      }
   }

   @Override
   public void a(ahu $$0) {
      List<String> $$1 = Stream.of($$0.f()).map(n::a).collect(Collectors.toList());
      this.a($$1).thenAcceptAsync($$1x -> this.a($$0, $$1x), this.d);
   }

   private void a(ahu $$0, List<arc> $$1) {
      this.f.G();
      aqk $$2 = this.f.z();
      ja $$3 = $$0.b();
      if ($$2.B($$3)) {
         if (!($$2.c_($$3) instanceof dqx $$5)) {
            return;
         }

         $$5.a(this.f, $$0.e(), $$1);
      }
   }

   @Override
   public void a(ahe $$0) {
      ze.a($$0, this, this.f.z());
      this.f.fZ().b = $$0.b() && this.f.fZ().c;
   }

   @Override
   public void a(zt $$0) {
      ze.a($$0, this, this.f.z());
      this.f.a($$0.b());
   }

   @Override
   public void a(agf $$0) {
      ze.a($$0, this, this.f.z());
      if (this.f.l(2) || this.h()) {
         this.d.a($$0.b(), false);
      }
   }

   @Override
   public void a(agy $$0) {
      ze.a($$0, this, this.f.z());
      if (this.f.l(2) || this.h()) {
         this.d.b($$0.b());
      }
   }

   @Override
   public void a(agk $$0) {
      ze.a($$0, this, this.f.z());
      xl.a $$1 = $$0.b();
      cmk.a $$2 = this.O != null ? this.O.d().b() : null;
      cmk.a $$3 = $$1.b();
      if (!Objects.equals($$2, $$3)) {
         if ($$2 != null && $$3.b().isBefore($$2.b())) {
            this.b(cmk.a);
         } else {
            try {
               ayr $$4 = this.d.as();
               if ($$4 == null) {
                  h.warn("Ignoring chat session from {} due to missing Services public key", this.f.fX().getName());
                  return;
               }

               this.a($$1.a(this.f.fX(), $$4));
            } catch (cmk.b var6) {
               h.error("Failed to validate profile key: {}", var6.getMessage());
               this.b(var6.a());
            }
         }
      }
   }

   @Override
   public void a(ago $$0) {
      if (!this.T) {
         throw new IllegalStateException("Client acknowledged config, but none was requested");
      } else {
         this.e.a(abc.a, new ari(this.d, this.e, this.a(this.f.B())));
      }
   }

   @Override
   public void a(agl $$0) {
      ze.a($$0, this, this.f.z());
      this.g.a($$0.b());
   }

   @Override
   public void a(agt $$0) {
      ze.a($$0, this, this.f.z());
      this.d.a(this.f, $$0.b());
   }

   private void a(xl $$0) {
      this.O = $$0;
      this.P = $$0.a(this.f.cz());
      this.S.append(() -> {
         this.f.a($$0);
         this.d.ah().a(new adt(EnumSet.of(adt.a.b), List.of(this.f)));
      });
   }

   @Override
   public void a(zu $$0) {
   }

   @Override
   public aql o() {
      return this.f;
   }

   @FunctionalInterface
   interface a {
      bqd run(aql var1, bsd var2, bqc var3);
   }
}
