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

public class aru extends arr implements agi, arx, wn {
   static final Logger h = LogUtils.getLogger();
   private static final int i = -1;
   private static final int j = 4096;
   private static final int k = 80;
   private static final wz l = wz.c("multiplayer.disconnect.chat_validation_failed");
   private static final wz m = wz.c("chat.disabled.invalid_command_signature").a(n.m);
   private static final int n = 1000;
   public aqv f;
   public final arq g;
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
   private bsr y;
   private double z;
   private double A;
   private double B;
   private double C;
   private double D;
   private double E;
   @Nullable
   private exa F;
   private int G;
   private int H;
   private boolean I;
   private int J;
   private boolean K;
   private int L;
   private int M;
   private int N;
   @Nullable
   private xq O;
   private xt.b P;
   private final xi Q = new xi(20);
   private final xm R = xm.a();
   private final ayc S;
   private boolean T;

   public aru(MinecraftServer $$0, vt $$1, aqv $$2, arj $$3) {
      super($$0, $$1, $$3);
      this.g = new arq($$1.e());
      this.f = $$2;
      $$2.c = this;
      $$2.Y().a();
      this.P = xt.b.unsigned($$2.cA(), $$0::aB);
      this.S = new ayc($$0);
   }

   @Override
   public void d() {
      if (this.p > -1) {
         this.b(new abz(this.p));
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
      if (this.I && !this.f.fI() && !this.f.bS() && !this.f.ey()) {
         if (++this.J > this.a((bsr)this.f)) {
            h.warn("{} was kicked for floating too long!", this.f.ah().getString());
            this.a(wz.c("multiplayer.disconnect.flying"));
            return;
         }
      } else {
         this.I = false;
         this.J = 0;
      }

      this.y = this.f.da();
      if (this.y != this.f && this.y.cR() == this.f) {
         this.z = this.y.du();
         this.A = this.y.dw();
         this.B = this.y.dA();
         this.C = this.y.du();
         this.D = this.y.dw();
         this.E = this.y.dA();
         if (this.K && this.y.cR() == this.f) {
            if (++this.L > this.a(this.y)) {
               h.warn("{} was kicked for floating a vehicle too long!", this.f.ah().getString());
               this.a(wz.c("multiplayer.disconnect.flying"));
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

      if (this.f.N() > 0L && this.d.aq() > 0 && ad.c() - this.f.N() > (long)this.d.aq() * 1000L * 60L) {
         this.a(wz.c("multiplayer.disconnect.idling"));
      }
   }

   private int a(bsr $$0) {
      double $$1 = $$0.ba();
      if ($$1 < 1.0E-5F) {
         return Integer.MAX_VALUE;
      } else {
         double $$2 = 0.08 / $$1;
         return ayo.c(80.0 * Math.max($$2, 1.0));
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
   public boolean a(zg<?> $$0) {
      return super.a($$0) ? true : this.T && this.e.i() && $$0 instanceof agv;
   }

   @Override
   protected GameProfile i() {
      return this.f.fY();
   }

   private <T, R> CompletableFuture<R> a(T $$0, BiFunction<arz, T, CompletableFuture<R>> $$1) {
      return $$1.apply(this.f.Y(), $$0).thenApply($$0x -> {
         if (!this.c()) {
            h.debug("Ignoring packet due to disconnection");
            throw new CancellationException("disconnected");
         } else {
            return (R)$$0x;
         }
      });
   }

   private CompletableFuture<arm> a(String $$0) {
      return this.a($$0, arz::a);
   }

   private CompletableFuture<List<arm>> a(List<String> $$0) {
      return this.a($$0, arz::a);
   }

   @Override
   public void a(aho $$0) {
      zj.a($$0, this, this.f.A());
      this.f.a($$0.b(), $$0.e(), $$0.f(), $$0.g());
   }

   private static boolean b(double $$0, double $$1, double $$2, float $$3, float $$4) {
      return Double.isNaN($$0) || Double.isNaN($$1) || Double.isNaN($$2) || !Floats.isFinite($$4) || !Floats.isFinite($$3);
   }

   private static double a(double $$0) {
      return ayo.a($$0, -3.0E7, 3.0E7);
   }

   private static double b(double $$0) {
      return ayo.a($$0, -2.0E7, 2.0E7);
   }

   @Override
   public void a(ahh $$0) {
      zj.a($$0, this, this.f.A());
      if (b($$0.b(), $$0.e(), $$0.f(), $$0.g(), $$0.h())) {
         this.a(wz.c("multiplayer.disconnect.invalid_vehicle_movement"));
      } else if (!this.p()) {
         bsr $$1 = this.f.da();
         if ($$1 != this.f && $$1.cR() == this.f && $$1 == this.y) {
            aqu $$2 = this.f.A();
            double $$3 = $$1.du();
            double $$4 = $$1.dw();
            double $$5 = $$1.dA();
            double $$6 = a($$0.b());
            double $$7 = b($$0.e());
            double $$8 = a($$0.f());
            float $$9 = ayo.g($$0.g());
            float $$10 = ayo.g($$0.h());
            double $$11 = $$6 - this.z;
            double $$12 = $$7 - this.A;
            double $$13 = $$8 - this.B;
            double $$14 = $$1.ds().g();
            double $$15 = $$11 * $$11 + $$12 * $$12 + $$13 * $$13;
            if ($$15 - $$14 > 100.0 && !this.h()) {
               h.warn("{} (vehicle of {}) moved too quickly! {},{},{}", new Object[]{$$1.ah().getString(), this.f.ah().getString(), $$11, $$12, $$13});
               this.b(new adp($$1));
               return;
            }

            boolean $$16 = $$2.a($$1, $$1.cL().h(0.0625));
            $$11 = $$6 - this.C;
            $$12 = $$7 - this.D - 1.0E-6;
            $$13 = $$8 - this.E;
            boolean $$17 = $$1.S;
            if ($$1 instanceof btn $$18 && $$18.p_()) {
               $$18.n();
            }

            $$1.a(bts.b, new exa($$11, $$12, $$13));
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
               h.warn("{} (vehicle of {}) moved wrongly! {}", new Object[]{$$1.ah().getString(), this.f.ah().getString(), Math.sqrt($$15)});
            }

            $$1.a($$6, $$7, $$8, $$9, $$10);
            boolean $$21 = $$2.a($$1, $$1.cL().h(0.0625));
            if ($$16 && ($$20 || !$$21)) {
               $$1.a($$3, $$4, $$5, $$9, $$10);
               this.b(new adp($$1));
               return;
            }

            this.f.A().l().a(this.f);
            exa $$22 = new exa($$1.du() - $$3, $$1.dw() - $$4, $$1.dA() - $$5);
            this.f.b($$22);
            this.f.b($$22.c, $$22.d, $$22.e);
            this.K = $$12 >= -0.03125 && !$$17 && !this.d.ae() && !$$1.aY() && this.b($$1);
            this.C = $$1.du();
            this.D = $$1.dw();
            this.E = $$1.dA();
         }
      }
   }

   private boolean b(bsr $$0) {
      return $$0.dP().a($$0.cL().g(0.0625).b(0.0, -0.55, 0.0)).allMatch(dtb.a::i);
   }

   @Override
   public void a(agk $$0) {
      zj.a($$0, this, this.f.A());
      if ($$0.b() == this.G) {
         if (this.F == null) {
            this.a(wz.c("multiplayer.disconnect.invalid_player_movement"));
            return;
         }

         this.f.a(this.F.c, this.F.d, this.F.e, this.f.dF(), this.f.dH());
         this.v = this.F.c;
         this.w = this.F.d;
         this.x = this.F.e;
         if (this.f.P()) {
            this.f.Q();
         }

         this.F = null;
      }
   }

   @Override
   public void a(ahq $$0) {
      zj.a($$0, this, this.f.A());
      this.d.aJ().a($$0.b()).ifPresent(this.f.J()::e);
   }

   @Override
   public void a(ahp $$0) {
      zj.a($$0, this, this.f.A());
      this.f.J().a($$0.b(), $$0.e(), $$0.f());
   }

   @Override
   public void a(ahs $$0) {
      zj.a($$0, this, this.f.A());
      if ($$0.e() == ahs.a.a) {
         akr $$1 = Objects.requireNonNull($$0.f());
         ag $$2 = this.d.aE().a($$1);
         if ($$2 != null) {
            this.f.R().a($$2);
         }
      }
   }

   @Override
   public void a(agu $$0) {
      zj.a($$0, this, this.f.A());
      StringReader $$1 = new StringReader($$0.e());
      if ($$1.canRead() && $$1.peek() == '/') {
         $$1.skip();
      }

      ParseResults<et> $$2 = this.d.aH().a().parse($$1, this.f.dh());
      this.d.aH().a().getCompletionSuggestions($$2).thenAccept($$1x -> {
         Suggestions $$2x = $$1x.getList().size() <= 1000 ? $$1x : new Suggestions($$1x.getRange(), $$1x.getList().subList(0, 1000));
         this.b(new acm($$0.b(), $$2x));
      });
   }

   @Override
   public void a(ahw $$0) {
      zj.a($$0, this, this.f.A());
      if (!this.d.q()) {
         this.f.a(wz.c("advMode.notEnabled"));
      } else if (!this.f.gw()) {
         this.f.a(wz.c("advMode.notAllowed"));
      } else {
         dbx $$1 = null;
         dqr $$2 = null;
         jd $$3 = $$0.b();
         dqh $$4 = this.f.dP().c_($$3);
         if ($$4 instanceof dqr) {
            $$2 = (dqr)$$4;
            $$1 = $$2.b();
         }

         String $$5 = $$0.e();
         boolean $$6 = $$0.f();
         if ($$1 != null) {
            dqr.a $$7 = $$2.l();
            dtc $$8 = this.f.dP().a_($$3);
            ji $$9 = $$8.c(dhh.b);

            dtc $$10 = switch ($$0.i()) {
               case a -> dga.kH.o();
               case b -> dga.kG.o();
               default -> dga.fN.o();
            };
            dtc $$11 = $$10.a(dhh.b, $$9).a(dhh.c, Boolean.valueOf($$0.g()));
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
            if (!azl.b($$5)) {
               this.f.a(wz.a("advMode.setCommand.success", $$5));
            }
         }
      }
   }

   @Override
   public void a(ahx $$0) {
      zj.a($$0, this, this.f.A());
      if (!this.d.q()) {
         this.f.a(wz.c("advMode.notEnabled"));
      } else if (!this.f.gw()) {
         this.f.a(wz.c("advMode.notAllowed"));
      } else {
         dbx $$1 = $$0.a(this.f.dP());
         if ($$1 != null) {
            $$1.a($$0.b());
            $$1.a($$0.e());
            if (!$$0.e()) {
               $$1.c(null);
            }

            $$1.f();
            this.f.a(wz.a("advMode.setCommand.success", $$0.b()));
         }
      }
   }

   @Override
   public void a(ahj $$0) {
      zj.a($$0, this, this.f.A());
      this.f.fZ().c($$0.b());
      this.f.c.b(new acr(-2, 0, this.f.fZ().k, this.f.fZ().a(this.f.fZ().k)));
      this.f.c.b(new acr(-2, 0, $$0.b(), this.f.fZ().a($$0.b())));
      this.f.c.b(new aeu(this.f.fZ().k));
   }

   @Override
   public void a(ahr $$0) {
      zj.a($$0, this, this.f.A());
      if (this.f.cd instanceof cpw $$1) {
         if (!$$1.b(this.f)) {
            h.debug("Player {} interacted with invalid menu {}", this.f, $$1);
            return;
         }

         $$1.a($$0.b());
      }
   }

   @Override
   public void a(ahu $$0) {
      zj.a($$0, this, this.f.A());
      if (this.f.cd instanceof cpy $$1) {
         if (!this.f.cd.b(this.f)) {
            h.debug("Player {} interacted with invalid menu {}", this.f, this.f.cd);
            return;
         }

         $$1.a($$0.b(), $$0.e());
      }
   }

   @Override
   public void a(aia $$0) {
      zj.a($$0, this, this.f.A());
      if (this.f.gw()) {
         jd $$1 = $$0.b();
         dtc $$2 = this.f.dP().a_($$1);
         if (this.f.dP().c_($$1) instanceof drx $$4) {
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
               if ($$0.e() == drx.a.b) {
                  if ($$4.A()) {
                     this.f.a(wz.a("structure_block.save_success", $$5), false);
                  } else {
                     this.f.a(wz.a("structure_block.save_failure", $$5), false);
                  }
               } else if ($$0.e() == drx.a.c) {
                  if (!$$4.C()) {
                     this.f.a(wz.a("structure_block.load_not_found", $$5), false);
                  } else if ($$4.a(this.f.A())) {
                     this.f.a(wz.a("structure_block.load_success", $$5), false);
                  } else {
                     this.f.a(wz.a("structure_block.load_prepare", $$5), false);
                  }
               } else if ($$0.e() == drx.a.d) {
                  if ($$4.z()) {
                     this.f.a(wz.a("structure_block.size_success", $$5), false);
                  } else {
                     this.f.a(wz.c("structure_block.size_failure"), false);
                  }
               }
            } else {
               this.f.a(wz.a("structure_block.invalid_structure_name", $$0.g()), false);
            }

            $$4.e();
            this.f.dP().a($$1, $$2, $$2, 3);
         }
      }
   }

   @Override
   public void a(ahz $$0) {
      zj.a($$0, this, this.f.A());
      if (this.f.gw()) {
         jd $$1 = $$0.b();
         dtc $$2 = this.f.dP().a_($$1);
         if (this.f.dP().c_($$1) instanceof dri $$4) {
            $$4.a($$0.e());
            $$4.b($$0.f());
            $$4.a(akq.a(lu.aU, $$0.g()));
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
   public void a(ahe $$0) {
      zj.a($$0, this, this.f.A());
      if (this.f.gw()) {
         jd $$1 = $$0.b();
         if (this.f.dP().c_($$1) instanceof dri $$3) {
            $$3.a(this.f.A(), $$0.e(), $$0.f());
         }
      }
   }

   @Override
   public void a(aht $$0) {
      zj.a($$0, this, this.f.A());
      int $$1 = $$0.b();
      if (this.f.cd instanceof cre $$2) {
         if (!$$2.b(this.f)) {
            h.debug("Player {} interacted with invalid menu {}", this.f, $$2);
            return;
         }

         $$2.e($$1);
         $$2.h($$1);
      }
   }

   @Override
   public void a(ahb $$0) {
      int $$1 = $$0.b();
      if (cmw.d($$1) || $$1 == 40) {
         List<String> $$2 = Lists.newArrayList();
         Optional<String> $$3 = $$0.f();
         $$3.ifPresent($$2::add);
         $$0.e().stream().limit(100L).forEach($$2::add);
         Consumer<List<arm>> $$4 = $$3.isPresent() ? $$1x -> this.a((arm)$$1x.get(0), $$1x.subList(1, $$1x.size()), $$1) : $$1x -> this.a($$1x, $$1);
         this.a($$2).thenAcceptAsync($$4, this.d);
      }
   }

   private void a(List<arm> $$0, int $$1) {
      cuq $$2 = this.f.fZ().a($$1);
      if ($$2.a(cut.tZ)) {
         List<arl<String>> $$3 = $$0.stream().map(this::a).toList();
         $$2.b(kq.I, new cya($$3));
      }
   }

   private void a(arm $$0, List<arm> $$1, int $$2) {
      cuq $$3 = this.f.fZ().a($$2);
      if ($$3.a(cut.tZ)) {
         cuq $$4 = $$3.a((dcv)cut.ua);
         $$4.c(kq.I);
         List<arl<wz>> $$5 = $$1.stream().map($$0x -> this.a($$0x).a(wz::b)).toList();
         $$4.b(kq.J, new cyb(this.a($$0), this.f.ah().getString(), 0, $$5, true));
         this.f.fZ().a($$2, $$4);
      }
   }

   private arl<String> a(arm $$0) {
      return this.f.Z() ? arl.a($$0.b()) : arl.a($$0);
   }

   @Override
   public void a(ahc $$0) {
      zj.a($$0, this, this.f.A());
      if (this.f.l(2)) {
         bsr $$1 = this.f.dP().a($$0.e());
         if ($$1 != null) {
            ub $$2 = $$1.f(new ub());
            this.f.c.b(new afu($$0.b(), $$2));
         }
      }
   }

   @Override
   public void a(agz $$0) {
      zj.a($$0, this, this.f.A());
      if (!this.f.R_() && $$0.e() == this.f.cd.j) {
         if (this.f.cd instanceof cqj $$1 && $$1.m() instanceof dqv $$2) {
            $$2.a($$0.b(), $$0.f());
         }
      }
   }

   @Override
   public void a(agl $$0) {
      zj.a($$0, this, this.f.A());
      if (this.f.l(2)) {
         dqh $$1 = this.f.dP().c_($$0.e());
         ub $$2 = $$1 != null ? $$1.d(this.f.dR()) : null;
         this.f.c.b(new afu($$0.b(), $$2));
      }
   }

   @Override
   public void a(ahg $$0) {
      zj.a($$0, this, this.f.A());
      if (b($$0.a(0.0), $$0.b(0.0), $$0.c(0.0), $$0.a(0.0F), $$0.b(0.0F))) {
         this.a(wz.c("multiplayer.disconnect.invalid_player_movement"));
      } else {
         aqu $$1 = this.f.A();
         if (!this.f.h) {
            if (this.o == 0) {
               this.l();
            }

            if (!this.p()) {
               double $$2 = a($$0.a(this.f.du()));
               double $$3 = b($$0.b(this.f.dw()));
               double $$4 = a($$0.c(this.f.dA()));
               float $$5 = ayo.g($$0.a(this.f.dF()));
               float $$6 = ayo.g($$0.b(this.f.dH()));
               if (this.f.bS()) {
                  this.f.a(this.f.du(), this.f.dw(), this.f.dA(), $$5, $$6);
                  this.f.A().l().a(this.f);
               } else {
                  double $$7 = this.f.du();
                  double $$8 = this.f.dw();
                  double $$9 = this.f.dA();
                  double $$10 = $$2 - this.s;
                  double $$11 = $$3 - this.t;
                  double $$12 = $$4 - this.u;
                  double $$13 = this.f.ds().g();
                  double $$14 = $$10 * $$10 + $$11 * $$11 + $$12 * $$12;
                  if (this.f.fI()) {
                     if ($$14 > 1.0) {
                        this.a(this.f.du(), this.f.dw(), this.f.dA(), $$5, $$6);
                     }
                  } else {
                     boolean $$15 = this.f.fB();
                     if ($$1.s().i()) {
                        this.M++;
                        int $$16 = this.M - this.N;
                        if ($$16 > 5) {
                           h.debug("{} is sending move packets too frequently ({} packets since last tick)", this.f.ah().getString(), $$16);
                           $$16 = 1;
                        }

                        if (!this.f.P() && (!this.f.dP().ab().b(dcs.t) || !$$15)) {
                           float $$17 = $$15 ? 300.0F : 100.0F;
                           if ($$14 - $$13 > (double)($$17 * (float)$$16) && !this.h()) {
                              h.warn("{} moved too quickly! {},{},{}", new Object[]{this.f.ah().getString(), $$10, $$11, $$12});
                              this.a(this.f.du(), this.f.dw(), this.f.dA(), this.f.dF(), this.f.dH());
                              return;
                           }
                        }
                     }

                     ewv $$18 = this.f.cL();
                     $$10 = $$2 - this.v;
                     $$11 = $$3 - this.w;
                     $$12 = $$4 - this.x;
                     boolean $$19 = $$11 > 0.0;
                     if (this.f.aF() && !$$0.b() && $$19) {
                        this.f.fg();
                     }

                     boolean $$20 = this.f.S;
                     this.f.a(bts.b, new exa($$10, $$11, $$12));
                     $$10 = $$2 - this.f.du();
                     $$11 = $$3 - this.f.dw();
                     if ($$11 > -0.5 || $$11 < 0.5) {
                        $$11 = 0.0;
                     }

                     $$12 = $$4 - this.f.dA();
                     $$14 = $$10 * $$10 + $$11 * $$11 + $$12 * $$12;
                     boolean $$22 = false;
                     if (!this.f.P() && $$14 > 0.0625 && !this.f.fI() && !this.f.e.e() && this.f.e.b() != dct.d) {
                        $$22 = true;
                        h.warn("{} moved wrongly!", this.f.ah().getString());
                     }

                     if (this.f.ag || this.f.fI() || (!$$22 || !$$1.a(this.f, $$18)) && !this.a($$1, $$18, $$2, $$3, $$4)) {
                        this.f.a($$2, $$3, $$4, $$5, $$6);
                        boolean $$23 = this.f.fo();
                        this.I = $$11 >= -0.03125
                           && !$$20
                           && this.f.e.b() != dct.d
                           && !this.d.ae()
                           && !this.f.ga().c
                           && !this.f.b(bsb.y)
                           && !$$15
                           && !$$23
                           && this.b(this.f);
                        this.f.A().l().a(this.f);
                        this.f.a(this.f.du() - $$7, this.f.dw() - $$8, this.f.dA() - $$9, $$0.b());
                        exa $$24 = new exa(this.f.du() - $$7, this.f.dw() - $$8, this.f.dA() - $$9);
                        this.f.a($$0.b(), $$24);
                        this.f.b($$24);
                        if ($$19) {
                           this.f.n();
                        }

                        if ($$0.b() || this.f.dY() || this.f.p_() || this.f.R_() || $$15 || $$23) {
                           this.f.gB();
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

   private boolean p() {
      if (this.F != null) {
         if (this.o - this.H > 20) {
            this.H = this.o;
            this.a(this.F.c, this.F.d, this.F.e, this.f.dF(), this.f.dH());
         }

         return true;
      } else {
         this.H = this.o;
         return false;
      }
   }

   private boolean a(dcz $$0, ewv $$1, double $$2, double $$3, double $$4) {
      ewv $$5 = this.f.cL().d($$2 - this.f.du(), $$3 - this.f.dw(), $$4 - this.f.dA());
      Iterable<ext> $$6 = $$0.d(this.f, $$5.h(1.0E-5F));
      ext $$7 = exq.a($$1.h(1.0E-5F));

      for (ext $$8 : $$6) {
         if (!exq.c($$8, $$7, exe.i)) {
            return true;
         }
      }

      return false;
   }

   public void a(double $$0, double $$1, double $$2, float $$3, float $$4) {
      this.a($$0, $$1, $$2, $$3, $$4, Collections.emptySet());
   }

   public void a(double $$0, double $$1, double $$2, float $$3, float $$4, Set<buc> $$5) {
      double $$6 = $$5.contains(buc.a) ? this.f.du() : 0.0;
      double $$7 = $$5.contains(buc.b) ? this.f.dw() : 0.0;
      double $$8 = $$5.contains(buc.c) ? this.f.dA() : 0.0;
      float $$9 = $$5.contains(buc.d) ? this.f.dF() : 0.0F;
      float $$10 = $$5.contains(buc.e) ? this.f.dH() : 0.0F;
      this.F = new exa($$0, $$1, $$2);
      if (++this.G == Integer.MAX_VALUE) {
         this.G = 0;
      }

      this.H = this.o;
      this.f.gC();
      this.f.a($$0, $$1, $$2, $$3, $$4);
      this.f.c.b(new aec($$0 - $$6, $$1 - $$7, $$2 - $$8, $$3 - $$9, $$4 - $$10, $$5, this.G));
   }

   @Override
   public void a(ahm $$0) {
      zj.a($$0, this, this.f.A());
      jd $$1 = $$0.b();
      this.f.H();
      ahm.a $$2 = $$0.f();
      switch ($$2) {
         case g:
            if (!this.f.R_()) {
               cuq $$3 = this.f.b(bqq.b);
               this.f.a(bqq.b, this.f.b(bqq.a));
               this.f.a(bqq.a, $$3);
               this.f.fy();
            }

            return;
         case e:
            if (!this.f.R_()) {
               this.f.a(false);
            }

            return;
         case d:
            if (!this.f.R_()) {
               this.f.a(true);
            }

            return;
         case f:
            this.f.fx();
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

   private static boolean a(aqv $$0, cuq $$1) {
      if ($$1.e()) {
         return false;
      } else {
         cul $$2 = $$1.g();
         return ($$2 instanceof cso || $$2 instanceof csv) && !$$0.gu().a($$2);
      }
   }

   @Override
   public void a(aie $$0) {
      zj.a($$0, this, this.f.A());
      this.f.c.a($$0.f());
      aqu $$1 = this.f.A();
      bqq $$2 = $$0.b();
      cuq $$3 = this.f.b($$2);
      if ($$3.a($$1.J())) {
         eww $$4 = $$0.e();
         exa $$5 = $$4.e();
         jd $$6 = $$4.a();
         if (this.f.a($$6, 1.0)) {
            exa $$7 = $$5.d(exa.b($$6));
            double $$8 = 1.0000001;
            if (Math.abs($$7.a()) < 1.0000001 && Math.abs($$7.b()) < 1.0000001 && Math.abs($$7.c()) < 1.0000001) {
               ji $$9 = $$4.b();
               this.f.H();
               int $$10 = this.f.dP().am();
               if ($$6.v() < $$10) {
                  if (this.F == null && $$1.a(this.f, $$6)) {
                     bqr $$11 = this.f.e.a(this.f, $$1, $$3, $$2, $$4);
                     if ($$11.a()) {
                        an.P.a(this.f, $$4.a(), $$3.s());
                     }

                     if ($$9 == ji.b && !$$11.a() && $$6.v() >= $$10 - 1 && a(this.f, $$3)) {
                        wz $$12 = wz.a("build.tooHigh", $$10 - 1).a(n.m);
                        this.f.b($$12, true);
                     } else if ($$11.b()) {
                        this.f.a($$2, true);
                     }
                  }
               } else {
                  wz $$13 = wz.a("build.tooHigh", $$10 - 1).a(n.m);
                  this.f.b($$13, true);
               }

               this.f.c.b(new acd($$1, $$6));
               this.f.c.b(new acd($$1, $$6.a($$9)));
            } else {
               h.warn("Rejecting UseItemOnPacket from {}: Location {} too far away from hit block {}.", new Object[]{this.f.fY().getName(), $$5, $$6});
            }
         }
      }
   }

   @Override
   public void a(aif $$0) {
      zj.a($$0, this, this.f.A());
      this.a($$0.e());
      aqu $$1 = this.f.A();
      bqq $$2 = $$0.b();
      cuq $$3 = this.f.b($$2);
      this.f.H();
      if (!$$3.e() && $$3.a($$1.J())) {
         float $$4 = ayo.g($$0.f());
         float $$5 = ayo.g($$0.g());
         if ($$5 != this.f.dH() || $$4 != this.f.dF()) {
            this.f.b($$4, $$5);
         }

         bqr $$6 = this.f.e.a(this.f, $$1, $$3, $$2);
         if ($$6.b()) {
            this.f.a($$2, true);
         }
      }
   }

   @Override
   public void a(aid $$0) {
      zj.a($$0, this, this.f.A());
      if (this.f.R_()) {
         for (aqu $$1 : this.d.K()) {
            bsr $$2 = $$0.a($$1);
            if ($$2 != null) {
               this.f.a($$1, $$2.du(), $$2.dw(), $$2.dA(), $$2.dF(), $$2.dH());
               return;
            }
         }
      }
   }

   @Override
   public void a(ahi $$0) {
      zj.a($$0, this, this.f.A());
      if (this.f.de() instanceof cov $$2) {
         $$2.b($$0.b(), $$0.e());
      }
   }

   @Override
   public void a(vv $$0) {
      h.info("{} lost connection: {}", this.f.ah().getString(), $$0.a().getString());
      this.q();
      super.a($$0);
   }

   private void q() {
      this.S.close();
      this.d.aw();
      this.d.ah().a(wz.a("multiplayer.player.left", this.f.S_()).a(n.o), false);
      this.f.v();
      this.d.ah().c(this.f);
      this.f.Y().b();
   }

   public void a(int $$0) {
      if ($$0 < 0) {
         throw new IllegalArgumentException("Expected packet sequence nr >= 0");
      } else {
         this.p = Math.max($$0, this.p);
      }
   }

   @Override
   public void a(ahv $$0) {
      zj.a($$0, this, this.f.A());
      if ($$0.b() >= 0 && $$0.b() < cmw.g()) {
         if (this.f.fZ().k != $$0.b() && this.f.ft() == bqq.a) {
            this.f.fy();
         }

         this.f.fZ().k = $$0.b();
         this.f.H();
      } else {
         h.warn("{} tried to set an invalid carried item", this.f.ah().getString());
      }
   }

   @Override
   public void a(agq $$0) {
      Optional<xg> $$1 = this.a($$0.h());
      if (!$$1.isEmpty()) {
         this.a($$0.b(), () -> {
            xp $$2;
            try {
               $$2 = this.a($$0, $$1.get());
            } catch (xt.a var6) {
               this.a(var6);
               return;
            }

            CompletableFuture<arm> $$5 = this.a($$2.c());
            wz $$6 = this.d.bm().decorate(this.f, $$2.d());
            this.S.append($$5, $$2x -> {
               xp $$3 = $$2.a($$6).a($$2x.e());
               this.b($$3);
            });
         });
      }
   }

   @Override
   public void a(ago $$0) {
      this.a($$0.b(), () -> {
         this.b($$0.b());
         this.r();
      });
   }

   private void b(String $$0) {
      ParseResults<et> $$1 = this.c($$0);
      if (this.d.aB() && xr.a($$1)) {
         h.error("Received unsigned command packet from {}, but the command requires signable arguments: {}", this.f.fY().getName(), $$0);
         this.f.a(m);
      } else {
         this.d.aH().a($$1, $$0);
      }
   }

   @Override
   public void a(agp $$0) {
      Optional<xg> $$1 = this.a($$0.h());
      if (!$$1.isEmpty()) {
         this.a($$0.b(), () -> {
            this.a($$0, $$1.get());
            this.r();
         });
      }
   }

   private void a(agp $$0, xg $$1) {
      ParseResults<et> $$2 = this.c($$0.b());

      Map<String, xp> $$3;
      try {
         $$3 = this.a($$0, xr.b($$2), $$1);
      } catch (xt.a var6) {
         this.a(var6);
         return;
      }

      er $$6 = new er.a($$3);
      $$2 = eu.a($$2, $$1x -> $$1x.a($$6, this.S));
      this.d.aH().a($$2, $$0.b());
   }

   private void a(xt.a $$0) {
      h.warn("Failed to update secure chat state for {}: '{}'", this.f.fY().getName(), $$0.a().getString());
      this.f.a($$0.a().f().a(n.m));
   }

   private <S> Map<String, xp> a(agp $$0, xr<S> $$1, xg $$2) throws xt.a {
      List<fa.a> $$3 = $$0.g().a();
      List<xr.a<S>> $$4 = $$1.a();
      if ($$3.isEmpty()) {
         return this.b($$4);
      } else {
         Map<String, xp> $$5 = new Object2ObjectOpenHashMap();

         for (fa.a $$6 : $$3) {
            xr.a<S> $$7 = $$1.a($$6.a());
            if ($$7 == null) {
               this.P.setChainBroken();
               throw a($$0.b(), $$3, $$4);
            }

            xs $$8 = new xs($$7.c(), $$0.e(), $$0.f(), $$2);
            $$5.put($$7.a(), this.P.unpack($$6.b(), $$8));
         }

         for (xr.a<S> $$9 : $$4) {
            if (!$$5.containsKey($$9.a())) {
               throw a($$0.b(), $$3, $$4);
            }
         }

         return $$5;
      }
   }

   private <S> Map<String, xp> b(List<xr.a<S>> $$0) throws xt.a {
      Map<String, xp> $$1 = new HashMap<>();

      for (xr.a<S> $$2 : $$0) {
         xs $$3 = xs.a($$2.c());
         $$1.put($$2.a(), this.P.unpack(null, $$3));
      }

      return $$1;
   }

   private static <S> xt.a a(String $$0, List<fa.a> $$1, List<xr.a<S>> $$2) {
      String $$3 = $$1.stream().map(fa.a::a).collect(Collectors.joining(", "));
      String $$4 = $$2.stream().map(xr.a::a).collect(Collectors.joining(", "));
      h.error("Signed command mismatch between server and client ('{}'): got [{}] from client, but expected [{}]", new Object[]{$$0, $$3, $$4});
      return new xt.a(m);
   }

   private ParseResults<et> c(String $$0) {
      CommandDispatcher<et> $$1 = this.d.aH().a();
      return $$1.parse($$0, this.f.dh());
   }

   private void a(String $$0, Runnable $$1) {
      if (d($$0)) {
         this.a(wz.c("multiplayer.disconnect.illegal_characters"));
      } else if (this.f.E() == cmv.c) {
         this.b(new afs(wz.c("chat.disabled.options").a(n.m), false));
      } else {
         this.f.H();
         this.d.execute($$1);
      }
   }

   private Optional<xg> a(xg.b $$0) {
      synchronized (this.Q) {
         Optional<xg> $$1 = this.Q.a($$0);
         if ($$1.isEmpty()) {
            h.warn("Failed to validate message acknowledgements from {}", this.f.ah().getString());
            this.a(l);
         }

         return $$1;
      }
   }

   private static boolean d(String $$0) {
      for (int $$1 = 0; $$1 < $$0.length(); $$1++) {
         if (!azl.a($$0.charAt($$1))) {
            return true;
         }
      }

      return false;
   }

   private xp a(agq $$0, xg $$1) throws xt.a {
      xs $$2 = new xs($$0.b(), $$0.e(), $$0.f(), $$1);
      return this.P.unpack($$0.g(), $$2);
   }

   private void b(xp $$0) {
      this.d.ah().a($$0, this.f, wv.a(wv.e, this.f));
      this.r();
   }

   private void r() {
      this.q += 20;
      if (this.q > 200 && !this.d.ah().f(this.f.fY()) && !this.d.a(this.f.fY())) {
         this.a(wz.c("disconnect.spam"));
      }
   }

   @Override
   public void a(agn $$0) {
      synchronized (this.Q) {
         if (!this.Q.a($$0.b())) {
            h.warn("Failed to validate message acknowledgements from {}", this.f.ah().getString());
            this.a(l);
         }
      }
   }

   @Override
   public void a(aic $$0) {
      zj.a($$0, this, this.f.A());
      this.f.H();
      this.f.a($$0.b());
   }

   @Override
   public void a(ahn $$0) {
      zj.a($$0, this, this.f.A());
      this.f.H();
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
            if (this.f.fI()) {
               this.f.a(false, true);
               this.F = this.f.dn();
            }
            break;
         case f:
            if (this.f.de() instanceof bty $$1) {
               int $$2 = $$0.f();
               if ($$1.a() && $$2 > 0) {
                  $$1.c($$2);
               }
            }
            break;
         case g:
            if (this.f.de() instanceof bty $$3) {
               $$3.b();
            }
            break;
         case h:
            if (this.f.dd() instanceof btf $$4) {
               $$4.b(this.f);
            }
            break;
         case i:
            if (!this.f.ge()) {
               this.f.gg();
            }
            break;
         default:
            throw new IllegalArgumentException("Invalid client command!");
      }
   }

   public void a(xp $$0) {
      xl $$1 = $$0.l();
      if ($$1 != null) {
         this.R.a($$0.m(), $$0.l());
         int $$2;
         synchronized (this.Q) {
            this.Q.a($$1);
            $$2 = this.Q.a();
         }

         if ($$2 > 4096) {
            this.a(wz.c("multiplayer.disconnect.too_many_pending_chats"));
         }
      }
   }

   public void a(xp $$0, wv.a $$1) {
      this.b(new adv($$0.k().c(), $$0.k().b(), $$0.l(), $$0.m().a(this.R), $$0.n(), $$0.o(), $$1));
      this.a($$0);
   }

   public void a(wz $$0, wv.a $$1) {
      this.b(new acx($$0, $$1));
   }

   public SocketAddress m() {
      return this.e.d();
   }

   public void n() {
      this.T = true;
      this.q();
      this.b(afq.a);
      this.e.a(abj.d);
   }

   @Override
   public void a(ajm $$0) {
      this.e.a(new ajj($$0.b()));
   }

   @Override
   public void a(ahd $$0) {
      zj.a($$0, this, this.f.A());
      final aqu $$1 = this.f.A();
      final bsr $$2 = $$0.a($$1);
      this.f.H();
      this.f.g($$0.b());
      if ($$2 != null) {
         if (!$$1.C_().a($$2.dp())) {
            return;
         }

         ewv $$3 = $$2.cL();
         if (this.f.a($$3, 1.0)) {
            $$0.a(new ahd.c() {
               private void a(bqq $$0, aru.a $$1x) {
                  cuq $$2 = aru.this.f.b($$0);
                  if ($$2.a($$1.J())) {
                     cuq $$3 = $$2.s();
                     bqr $$4 = $$1.run(aru.this.f, $$2, $$0);
                     if ($$4.a()) {
                        an.T.a(aru.this.f, $$4.c() ? $$3 : cuq.l, $$2);
                        if ($$4.b()) {
                           aru.this.f.a($$0, true);
                        }
                     }
                  }
               }

               @Override
               public void a(bqq $$0) {
                  this.a($$0, cmx::a);
               }

               @Override
               public void a(bqq $$0, exa $$1x) {
                  this.a($$0, ($$1xxx, $$2xx, $$3) -> $$2xx.a($$1xxx, $$1, $$3));
               }

               @Override
               public void a() {
                  label23:
                  if (!($$2 instanceof cjh) && !($$2 instanceof btc) && $$2 != aru.this.f) {
                     if ($$2 instanceof cnd $$0 && !$$0.cu()) {
                        break label23;
                     }

                     cuq $$1 = aru.this.f.b(bqq.a);
                     if (!$$1.a($$1.J())) {
                        return;
                     }

                     aru.this.f.e($$2);
                     return;
                  }

                  aru.this.a(wz.c("multiplayer.disconnect.invalid_entity_attacked"));
                  aru.h.warn("Player {} tried to attack an invalid entity", aru.this.f.ah().getString());
               }
            });
         }
      }
   }

   @Override
   public void a(agt $$0) {
      zj.a($$0, this, this.f.A());
      this.f.H();
      agt.a $$1 = $$0.b();
      switch ($$1) {
         case a:
            if (this.f.h) {
               this.f.h = false;
               this.f = this.d.ah().a(this.f, true, bsr.c.e);
               an.w.a(this.f, dcw.j, dcw.h);
            } else {
               if (this.f.ex() > 0.0F) {
                  return;
               }

               this.f = this.d.ah().a(this.f, false, bsr.c.a);
               if (this.d.j()) {
                  this.f.a(dct.d);
                  this.f.dP().ab().a(dcs.r).a(false, this.d);
               }
            }
            break;
         case b:
            this.f.I().a(this.f);
      }
   }

   @Override
   public void a(agy $$0) {
      zj.a($$0, this, this.f.A());
      this.f.t();
   }

   @Override
   public void a(agx $$0) {
      zj.a($$0, this, this.f.A());
      this.f.H();
      if (this.f.cd.j == $$0.b()) {
         if (this.f.R_()) {
            this.f.cd.b();
         } else if (!this.f.cd.b(this.f)) {
            h.debug("Player {} interacted with invalid menu {}", this.f, this.f.cd);
         } else {
            int $$1 = $$0.e();
            if (!this.f.cd.a($$1)) {
               h.debug("Player {} clicked invalid slot index: {}, available slots: {}", new Object[]{this.f.ah(), $$1, this.f.cd.i.size()});
            } else {
               boolean $$2 = $$0.j() != this.f.cd.j();
               this.f.cd.h();
               this.f.cd.a($$1, $$0.f(), $$0.i(), this.f);
               ObjectIterator var4 = Int2ObjectMaps.fastIterable($$0.h()).iterator();

               while (var4.hasNext()) {
                  Entry<cuq> $$3 = (Entry<cuq>)var4.next();
                  this.f.cd.b($$3.getIntKey(), (cuq)$$3.getValue());
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
   public void a(ahk $$0) {
      zj.a($$0, this, this.f.A());
      this.f.H();
      if (!this.f.R_() && this.f.cd.j == $$0.b() && this.f.cd instanceof cri) {
         if (!this.f.cd.b(this.f)) {
            h.debug("Player {} interacted with invalid menu {}", this.f, this.f.cd);
         } else {
            this.d.aJ().a($$0.e()).ifPresent($$1 -> ((cri)this.f.cd).a($$0.f(), (czb<?>)$$1, this.f));
         }
      }
   }

   @Override
   public void a(agw $$0) {
      zj.a($$0, this, this.f.A());
      this.f.H();
      if (this.f.cd.j == $$0.b() && !this.f.R_()) {
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
   public void a(ahy $$0) {
      zj.a($$0, this, this.f.A());
      if (this.f.e.e()) {
         boolean $$1 = $$0.b() < 0;
         cuq $$2 = $$0.e();
         if (!$$2.a(this.f.dP().J())) {
            return;
         }

         cxh $$3 = $$2.a(kq.O, cxh.a);
         if ($$3.a("x") && $$3.a("y") && $$3.a("z")) {
            jd $$4 = dqh.b($$3.d());
            if (this.f.dP().p($$4)) {
               dqh $$5 = this.f.dP().c_($$4);
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
   public void a(aib $$0) {
      List<String> $$1 = Stream.of($$0.f()).map(n::a).collect(Collectors.toList());
      this.a($$1).thenAcceptAsync($$1x -> this.a($$0, $$1x), this.d);
   }

   private void a(aib $$0, List<arm> $$1) {
      this.f.H();
      aqu $$2 = this.f.A();
      jd $$3 = $$0.b();
      if ($$2.B($$3)) {
         if (!($$2.c_($$3) instanceof drs $$5)) {
            return;
         }

         $$5.a(this.f, $$0.e(), $$1);
      }
   }

   @Override
   public void a(ahl $$0) {
      zj.a($$0, this, this.f.A());
      this.f.ga().b = $$0.b() && this.f.ga().c;
   }

   @Override
   public void a(aaa $$0) {
      zj.a($$0, this, this.f.A());
      this.f.a($$0.b());
   }

   @Override
   public void a(agm $$0) {
      zj.a($$0, this, this.f.A());
      if (this.f.l(2) || this.h()) {
         this.d.a($$0.b(), false);
      }
   }

   @Override
   public void a(ahf $$0) {
      zj.a($$0, this, this.f.A());
      if (this.f.l(2) || this.h()) {
         this.d.b($$0.b());
      }
   }

   @Override
   public void a(agr $$0) {
      zj.a($$0, this, this.f.A());
      xq.a $$1 = $$0.b();
      cna.a $$2 = this.O != null ? this.O.d().b() : null;
      cna.a $$3 = $$1.b();
      if (!Objects.equals($$2, $$3)) {
         if ($$2 != null && $$3.b().isBefore($$2.b())) {
            this.a(cna.a);
         } else {
            try {
               azb $$4 = this.d.as();
               if ($$4 == null) {
                  h.warn("Ignoring chat session from {} due to missing Services public key", this.f.fY().getName());
                  return;
               }

               this.a($$1.a(this.f.fY(), $$4));
            } catch (cna.b var6) {
               h.error("Failed to validate profile key: {}", var6.getMessage());
               this.a(var6.a());
            }
         }
      }
   }

   @Override
   public void a(agv $$0) {
      if (!this.T) {
         throw new IllegalStateException("Client acknowledged config, but none was requested");
      } else {
         this.e.a(abj.b, new ars(this.d, this.e, this.a(this.f.C())));
      }
   }

   @Override
   public void a(ags $$0) {
      zj.a($$0, this, this.f.A());
      this.g.a($$0.b());
   }

   @Override
   public void a(aha $$0) {
      zj.a($$0, this, this.f.A());
      this.d.a(this.f, $$0.b());
   }

   private void a(xq $$0) {
      this.O = $$0;
      this.P = $$0.a(this.f.cA());
      this.S.append(() -> {
         this.f.a($$0);
         this.d.ah().a(new aea(EnumSet.of(aea.a.b), List.of(this.f)));
      });
   }

   @Override
   public void a(aab $$0) {
   }

   @Override
   public aqv o() {
      return this.f;
   }

   @FunctionalInterface
   interface a {
      bqr run(aqv var1, bsr var2, bqq var3);
   }
}
