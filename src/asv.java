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

public class asv extends ass implements agr, asy, wo {
   static final Logger h = LogUtils.getLogger();
   private static final int i = -1;
   private static final int j = 4096;
   private static final int k = 80;
   private static final xa l = xa.c("multiplayer.disconnect.chat_validation_failed");
   private static final xa m = xa.c("chat.disabled.invalid_command_signature").a(o.m);
   private static final int n = 1000;
   public art f;
   public final asq g;
   private int o;
   private int p = -1;
   private final baq q = new baq(20, 200);
   private final baq r = new baq(20, 1480);
   private double s;
   private double t;
   private double u;
   private double v;
   private double w;
   private double x;
   @Nullable
   private bwt y;
   private double z;
   private double A;
   private double B;
   private double C;
   private double D;
   private double E;
   @Nullable
   private ffq F;
   private int G;
   private int H;
   private boolean I;
   private int J;
   private boolean K;
   private int L;
   private int M;
   private int N;
   private boolean O;
   @Nullable
   private xr P;
   private xu.b Q;
   private final xj R = new xj(20);
   private final xn S = xn.a();
   private final azc T;
   private boolean U;

   public asv(MinecraftServer $$0, vt $$1, art $$2, asi $$3) {
      super($$0, $$1, $$3);
      this.g = new asq($$1.e());
      this.f = $$2;
      $$2.f = this;
      $$2.W().a();
      this.Q = xu.b.unsigned($$2.cG(), $$0::aA);
      this.T = new azc($$0);
   }

   @Override
   public void d() {
      if (this.p > -1) {
         this.b(new aca(this.p));
         this.p = -1;
      }

      this.l();
      this.f.K = this.f.dA();
      this.f.L = this.f.dC();
      this.f.M = this.f.dG();
      this.f.i();
      this.f.a(this.s, this.t, this.u, this.f.dL(), this.f.dN());
      this.o++;
      this.N = this.M;
      if (this.I && !this.f.fR() && !this.f.bY() && !this.f.eH()) {
         if (++this.J > this.a((bwt)this.f)) {
            h.warn("{} was kicked for floating too long!", this.f.ai().getString());
            this.a(xa.c("multiplayer.disconnect.flying"));
            return;
         }
      } else {
         this.I = false;
         this.J = 0;
      }

      this.y = this.f.df();
      if (this.y != this.f && this.y.cW() == this.f) {
         this.z = this.y.dA();
         this.A = this.y.dC();
         this.B = this.y.dG();
         this.C = this.y.dA();
         this.D = this.y.dC();
         this.E = this.y.dG();
         if (this.K && this.y.cW() == this.f) {
            if (++this.L > this.a(this.y)) {
               h.warn("{} was kicked for floating a vehicle too long!", this.f.ai().getString());
               this.a(xa.c("multiplayer.disconnect.flying"));
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
      this.q.b();
      this.r.b();
      if (this.f.N() > 0L && this.d.ap() > 0 && ag.c() - this.f.N() > (long)this.d.ap() * 1000L * 60L) {
         this.a(xa.c("multiplayer.disconnect.idling"));
      }
   }

   private int a(bwt $$0) {
      double $$1 = $$0.bd();
      if ($$1 < 1.0E-5F) {
         return Integer.MAX_VALUE;
      } else {
         double $$2 = 0.08 / $$1;
         return azo.c(80.0 * Math.max($$2, 1.0));
      }
   }

   @Override
   public void l() {
      this.s = this.f.dA();
      this.t = this.f.dC();
      this.u = this.f.dG();
      this.v = this.f.dA();
      this.w = this.f.dC();
      this.x = this.f.dG();
   }

   @Override
   public boolean c() {
      return this.e.i() && !this.U;
   }

   @Override
   public boolean a(zh<?> $$0) {
      return super.a($$0) ? true : this.U && this.e.i() && $$0 instanceof ahf;
   }

   @Override
   protected GameProfile i() {
      return this.f.gi();
   }

   private <T, R> CompletableFuture<R> a(T $$0, BiFunction<atb, T, CompletableFuture<R>> $$1) {
      return $$1.apply(this.f.W(), $$0).thenApply($$0x -> {
         if (!this.c()) {
            h.debug("Ignoring packet due to disconnection");
            throw new CancellationException("disconnected");
         } else {
            return (R)$$0x;
         }
      });
   }

   private CompletableFuture<asl> a(String $$0) {
      return this.a($$0, atb::a);
   }

   private CompletableFuture<List<asl>> a(List<String> $$0) {
      return this.a($$0, atb::a);
   }

   @Override
   public void a(ahz $$0) {
      zk.a($$0, this, this.f.y());
      this.f.a($$0.b());
   }

   private static boolean b(double $$0, double $$1, double $$2, float $$3, float $$4) {
      return Double.isNaN($$0) || Double.isNaN($$1) || Double.isNaN($$2) || !Floats.isFinite($$4) || !Floats.isFinite($$3);
   }

   private static double a(double $$0) {
      return azo.a($$0, -3.0E7, 3.0E7);
   }

   private static double b(double $$0) {
      return azo.a($$0, -2.0E7, 2.0E7);
   }

   @Override
   public void a(ahr $$0) {
      zk.a($$0, this, this.f.y());
      if (b($$0.b().a(), $$0.b().b(), $$0.b().c(), $$0.e(), $$0.f())) {
         this.a(xa.c("multiplayer.disconnect.invalid_vehicle_movement"));
      } else if (!this.p() && this.f.gJ()) {
         bwt $$1 = this.f.df();
         if ($$1 != this.f && $$1.cW() == this.f && $$1 == this.y) {
            ars $$2 = this.f.y();
            double $$3 = $$1.dA();
            double $$4 = $$1.dC();
            double $$5 = $$1.dG();
            double $$6 = a($$0.b().a());
            double $$7 = b($$0.b().b());
            double $$8 = a($$0.b().c());
            float $$9 = azo.h($$0.e());
            float $$10 = azo.h($$0.f());
            double $$11 = $$6 - this.z;
            double $$12 = $$7 - this.A;
            double $$13 = $$8 - this.B;
            double $$14 = $$1.dy().h();
            double $$15 = $$11 * $$11 + $$12 * $$12 + $$13 * $$13;
            if ($$15 - $$14 > 100.0 && !this.h()) {
               h.warn("{} (vehicle of {}) moved too quickly! {},{},{}", new Object[]{$$1.ai().getString(), this.f.ai().getString(), $$11, $$12, $$13});
               this.b(ads.a($$1));
               return;
            }

            boolean $$16 = $$2.a($$1, $$1.cR().h(0.0625));
            $$11 = $$6 - this.C;
            $$12 = $$7 - this.D;
            $$13 = $$8 - this.E;
            boolean $$17 = $$1.R;
            if ($$1 instanceof bxu $$18 && $$18.d_()) {
               $$18.k();
            }

            $$1.a(bxy.b, new ffq($$11, $$12, $$13));
            $$11 = $$6 - $$1.dA();
            $$12 = $$7 - $$1.dC();
            if ($$12 > -0.5 || $$12 < 0.5) {
               $$12 = 0.0;
            }

            $$13 = $$8 - $$1.dG();
            $$15 = $$11 * $$11 + $$12 * $$12 + $$13 * $$13;
            boolean $$20 = false;
            if ($$15 > 0.0625) {
               $$20 = true;
               h.warn("{} (vehicle of {}) moved wrongly! {}", new Object[]{$$1.ai().getString(), this.f.ai().getString(), Math.sqrt($$15)});
            }

            $$1.a($$6, $$7, $$8, $$9, $$10);
            boolean $$21 = $$2.a($$1, $$1.cR().h(0.0625));
            if ($$16 && ($$20 || !$$21)) {
               $$1.a($$3, $$4, $$5, $$9, $$10);
               this.b(ads.a($$1));
               $$1.aJ();
               return;
            }

            this.f.y().m().a(this.f);
            ffq $$22 = new ffq($$1.dA() - $$3, $$1.dC() - $$4, $$1.dG() - $$5);
            this.a($$22);
            $$1.a($$0.g(), $$22);
            $$1.a($$22.d, $$22.e, $$22.f, $$0.g());
            this.f.a($$22.d, $$22.e, $$22.f);
            this.K = $$12 >= -0.03125 && !$$17 && !this.d.ad() && !$$1.bb() && this.b($$1);
            this.C = $$1.dA();
            this.D = $$1.dC();
            this.E = $$1.dG();
         }
      }
   }

   private boolean b(bwt $$0) {
      return $$0.dV().a($$0.cR().g(0.0625).b(0.0, -0.55, 0.0)).allMatch(ebd.a::l);
   }

   @Override
   public void a(agt $$0) {
      zk.a($$0, this, this.f.y());
      if ($$0.b() == this.G) {
         if (this.F == null) {
            this.a(xa.c("multiplayer.disconnect.invalid_player_movement"));
            return;
         }

         this.f.a(this.F.d, this.F.e, this.F.f, this.f.dL(), this.f.dN());
         this.v = this.F.d;
         this.w = this.F.e;
         this.x = this.F.f;
         this.f.R();
         this.F = null;
      }
   }

   @Override
   public void a(aia $$0) {
      zk.a($$0, this, this.f.y());
      this.f.v(true);
   }

   @Override
   public void a(aic $$0) {
      zk.a($$0, this, this.f.y());
      dew.d $$1 = this.d.aI().a($$0.b());
      if ($$1 != null) {
         this.f.J().d($$1.b().a());
      }
   }

   @Override
   public void a(aif $$0) {
      zk.a($$0, this, this.f.y());
      this.f.bR.a($$0.b(), $$0.e());
   }

   @Override
   public void a(aib $$0) {
      zk.a($$0, this, this.f.y());
      this.f.J().a($$0.b(), $$0.e(), $$0.f());
   }

   @Override
   public void a(aie $$0) {
      zk.a($$0, this, this.f.y());
      if ($$0.e() == aie.a.a) {
         ali $$1 = Objects.requireNonNull($$0.f());
         aj $$2 = this.d.aD().a($$1);
         if ($$2 != null) {
            this.f.S().a($$2);
         }
      }
   }

   @Override
   public void a(ahe $$0) {
      zk.a($$0, this, this.f.y());
      StringReader $$1 = new StringReader($$0.e());
      if ($$1.canRead() && $$1.peek() == '/') {
         $$1.skip();
      }

      ParseResults<ej> $$2 = this.d.aG().a().parse($$1, this.f.A());
      this.d.aG().a().getCompletionSuggestions($$2).thenAccept($$1x -> {
         Suggestions $$2x = $$1x.getList().size() <= 1000 ? $$1x : new Suggestions($$1x.getRange(), $$1x.getList().subList(0, 1000));
         this.b(new acn($$0.b(), $$2x));
      });
   }

   @Override
   public void a(aij $$0) {
      zk.a($$0, this, this.f.y());
      if (!this.d.q()) {
         this.f.a(xa.c("advMode.notEnabled"));
      } else if (!this.f.gG()) {
         this.f.a(xa.c("advMode.notAllowed"));
      } else {
         diw $$1 = null;
         dyn $$2 = null;
         iv $$3 = $$0.b();
         dyc $$4 = this.f.dV().c_($$3);
         if ($$4 instanceof dyn) {
            $$2 = (dyn)$$4;
            $$1 = $$2.a();
         }

         String $$5 = $$0.e();
         boolean $$6 = $$0.f();
         if ($$1 != null) {
            dyn.a $$7 = $$2.s();
            ebe $$8 = this.f.dV().a_($$3);
            jb $$9 = $$8.c(dom.b);

            ebe $$10 = switch ($$0.i()) {
               case a -> dne.ln.m();
               case b -> dne.lm.m();
               default -> dne.gm.m();
            };
            ebe $$11 = $$10.b(dom.b, $$9).b(dom.c, Boolean.valueOf($$0.g()));
            if ($$11 != $$8) {
               this.f.dV().a($$3, $$11, 2);
               $$4.c($$11);
               this.f.dV().m($$3).a($$4);
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
            if (!ban.b($$5)) {
               this.f.a(xa.a("advMode.setCommand.success", $$5));
            }
         }
      }
   }

   @Override
   public void a(aik $$0) {
      zk.a($$0, this, this.f.y());
      if (!this.d.q()) {
         this.f.a(xa.c("advMode.notEnabled"));
      } else if (!this.f.gG()) {
         this.f.a(xa.c("advMode.notAllowed"));
      } else {
         diw $$1 = $$0.a(this.f.dV());
         if ($$1 != null) {
            $$1.a($$0.b());
            $$1.a($$0.e());
            if (!$$0.e()) {
               $$1.c(null);
            }

            $$1.f();
            this.f.a(xa.a("advMode.setCommand.success", $$0.b()));
         }
      }
   }

   @Override
   public void a(aht $$0) {
      ars $$1 = this.f.y();
      zk.a($$0, this, $$1);
      iv $$2 = $$0.b();
      if (this.f.a($$2, 1.0)) {
         if ($$1.p($$2)) {
            ebe $$3 = $$1.a_($$2);
            boolean $$4 = this.f.fV() && $$0.e();
            czy $$5 = $$3.a((dka)$$1, $$2, $$4);
            if (!$$5.f()) {
               if ($$4) {
                  a($$3, $$1, $$2, $$5);
               }

               this.a($$5);
            }
         }
      }
   }

   private static void a(ebe $$0, ars $$1, iv $$2, czy $$3) {
      dyc $$4 = $$0.x() ? $$1.c_($$2) : null;
      if ($$4 != null) {
         tz $$5 = $$4.e($$1.J_());
         $$4.a($$5);
         cyg.a($$3, $$4.p(), $$5);
         $$3.b($$4.q());
      }
   }

   @Override
   public void a(ahu $$0) {
      ars $$1 = this.f.y();
      zk.a($$0, this, $$1);
      bwt $$2 = $$1.b($$0.b());
      if ($$2 != null && this.f.b($$2, 3.0)) {
         czy $$3 = $$2.dI();
         if ($$3 != null && !$$3.f()) {
            this.a($$3);
         }
      }
   }

   private void a(czy $$0) {
      if ($$0.a(this.f.dV().K())) {
         crw $$1 = this.f.gj();
         int $$2 = $$1.d($$0);
         if ($$2 != -1) {
            if (crw.e($$2)) {
               $$1.c($$2);
            } else {
               $$1.d($$2);
            }
         } else if (this.f.fV()) {
            $$1.c($$0);
         }

         this.f.f.b(new afl($$1.f()));
         this.f.bQ.d();
      }
   }

   @Override
   public void a(aid $$0) {
      zk.a($$0, this, this.f.y());
      if (this.f.bR instanceof cvt $$1) {
         if (!$$1.b(this.f)) {
            h.debug("Player {} interacted with invalid menu {}", this.f, $$1);
            return;
         }

         $$1.a($$0.b());
      }
   }

   @Override
   public void a(aih $$0) {
      zk.a($$0, this, this.f.y());
      if (this.f.bR instanceof cvv $$1) {
         if (!this.f.bR.b(this.f)) {
            h.debug("Player {} interacted with invalid menu {}", this.f, this.f.bR);
            return;
         }

         $$1.a($$0.b(), $$0.e());
      }
   }

   @Override
   public void a(ain $$0) {
      zk.a($$0, this, this.f.y());
      if (this.f.gG()) {
         iv $$1 = $$0.b();
         ebe $$2 = this.f.dV().a_($$1);
         if (this.f.dV().c_($$1) instanceof dzv $$4) {
            $$4.a($$0.f());
            $$4.a($$0.g());
            $$4.a($$0.h());
            $$4.a($$0.i());
            $$4.a($$0.j());
            $$4.a($$0.k());
            $$4.b($$0.l());
            $$4.a($$0.m());
            $$4.b($$0.n());
            $$4.e($$0.o());
            $$4.f($$0.p());
            $$4.a($$0.q());
            $$4.a($$0.r());
            if ($$4.f()) {
               String $$5 = $$4.d();
               if ($$0.e() == dzv.a.b) {
                  if ($$4.B()) {
                     this.f.a(xa.a("structure_block.save_success", $$5), false);
                  } else {
                     this.f.a(xa.a("structure_block.save_failure", $$5), false);
                  }
               } else if ($$0.e() == dzv.a.c) {
                  if (!$$4.D()) {
                     this.f.a(xa.a("structure_block.load_not_found", $$5), false);
                  } else if ($$4.a(this.f.y())) {
                     this.f.a(xa.a("structure_block.load_success", $$5), false);
                  } else {
                     this.f.a(xa.a("structure_block.load_prepare", $$5), false);
                  }
               } else if ($$0.e() == dzv.a.d) {
                  if ($$4.A()) {
                     this.f.a(xa.a("structure_block.size_success", $$5), false);
                  } else {
                     this.f.a(xa.c("structure_block.size_failure"), false);
                  }
               }
            } else {
               this.f.a(xa.a("structure_block.invalid_structure_name", $$0.g()), false);
            }

            $$4.e();
            this.f.dV().a($$1, $$2, $$2, 3);
         }
      }
   }

   @Override
   public void a(aio $$0) {
      zk.a($$0, this, this.f.y());
      if (this.f.gG()) {
         iv $$1 = $$0.b();
         ebe $$2 = this.f.dV().a_($$1);
         if (this.f.dV().c_($$1) instanceof dzw $$4) {
            $$4.a($$0.e());
            $$4.a($$0.f());
            $$4.e();
            this.f.dV().a($$1, $$2, $$4.m(), 3);
         }
      }
   }

   @Override
   public void a(ais $$0) {
      zk.a($$0, this, this.f.y());
      iv $$1 = $$0.b();
      if (this.f.gG() && this.f.dV().c_($$1) instanceof dzx $$2) {
         if ($$0.e() != ais.a.b && $$0.e() != ais.a.a) {
            $$2.a($$0.f());
            if ($$0.e() == ais.a.d) {
               $$2.a(this.f::a);
            } else if ($$0.e() == ais.a.e) {
               $$2.b(this.f::a);
            } else if ($$0.e() == ais.a.f) {
               $$2.c(this.f::a);
            } else if ($$0.e() == ais.a.g) {
               $$2.d(this.f::a);
            }

            ebe $$10 = this.f.dV().a_($$1);
            this.f.dV().a($$1, dne.a.m(), $$10, 3);
         } else {
            js<sr> $$4 = this.f.dX().f(mh.bh);
            Optional<jf.c<sr>> $$5 = $$0.f().a().flatMap($$4::a);
            xa $$6;
            if ($$5.isPresent()) {
               $$6 = $$5.get().a().c();
            } else {
               $$6 = xa.c("test_instance.description.no_test").a(o.m);
            }

            Optional<ka> $$8;
            if ($$0.e() == ais.a.b) {
               $$8 = $$0.f().a().flatMap($$0x -> dzx.a(this.f.y(), $$0x));
            } else {
               $$8 = Optional.empty();
            }

            this.e.a(new agf($$6, $$8));
         }
      }
   }

   @Override
   public void a(aim $$0) {
      zk.a($$0, this, this.f.y());
      if (this.f.gG()) {
         iv $$1 = $$0.b();
         ebe $$2 = this.f.dV().a_($$1);
         if (this.f.dV().c_($$1) instanceof dzg $$4) {
            $$4.a($$0.e());
            $$4.b($$0.f());
            $$4.a(alh.a(mh.bf, $$0.g()));
            $$4.a($$0.h());
            $$4.a($$0.i());
            $$4.a($$0.k());
            $$4.b($$0.j());
            $$4.e();
            this.f.dV().a($$1, $$2, $$2, 3);
         }
      }
   }

   @Override
   public void a(aho $$0) {
      zk.a($$0, this, this.f.y());
      if (this.f.gG()) {
         iv $$1 = $$0.b();
         if (this.f.dV().c_($$1) instanceof dzg $$3) {
            $$3.a(this.f.y(), $$0.e(), $$0.f());
         }
      }
   }

   @Override
   public void a(aig $$0) {
      zk.a($$0, this, this.f.y());
      int $$1 = $$0.b();
      if (this.f.bR instanceof cxb $$2) {
         if (!$$2.b(this.f)) {
            h.debug("Player {} interacted with invalid menu {}", this.f, $$2);
            return;
         }

         $$2.e($$1);
         $$2.h($$1);
      }
   }

   @Override
   public void a(ahl $$0) {
      int $$1 = $$0.b();
      if (crw.e($$1) || $$1 == 40) {
         List<String> $$2 = Lists.newArrayList();
         Optional<String> $$3 = $$0.f();
         $$3.ifPresent($$2::add);
         $$2.addAll($$0.e());
         Consumer<List<asl>> $$4 = $$3.isPresent() ? $$1x -> this.a((asl)$$1x.get(0), $$1x.subList(1, $$1x.size()), $$1) : $$1x -> this.a($$1x, $$1);
         this.a($$2).thenAcceptAsync($$4, this.d);
      }
   }

   private void a(List<asl> $$0, int $$1) {
      czy $$2 = this.f.gj().a($$1);
      if ($$2.c(kk.U)) {
         List<ask<String>> $$3 = $$0.stream().map(this::a).toList();
         $$2.b(kk.U, new ddh($$3));
      }
   }

   private void a(asl $$0, List<asl> $$1, int $$2) {
      czy $$3 = this.f.gj().a($$2);
      if ($$3.c(kk.U)) {
         czy $$4 = $$3.a((djw)dac.vj);
         $$4.e(kk.U);
         List<ask<xa>> $$5 = $$1.stream().map($$0x -> this.a($$0x).a(xa::b)).toList();
         $$4.b(kk.V, new ddi(this.a($$0), this.f.ai().getString(), 0, $$5, true));
         this.f.gj().a($$2, $$4);
      }
   }

   private ask<String> a(asl $$0) {
      return this.f.X() ? ask.a($$0.b()) : ask.a($$0);
   }

   @Override
   public void a(ahm $$0) {
      zk.a($$0, this, this.f.y());
      if (this.f.s(2)) {
         bwt $$1 = this.f.dV().a($$0.e());
         if ($$1 != null) {
            tz $$2 = $$1.h(new tz());
            this.f.f.b(new agc($$0.b(), $$2));
         }
      }
   }

   @Override
   public void a(ahj $$0) {
      zk.a($$0, this, this.f.y());
      if (!this.f.Z_() && $$0.e() == this.f.bR.l) {
         if (this.f.bR instanceof cwg $$1 && $$1.m() instanceof dyr $$2) {
            $$2.a($$0.b(), $$0.f());
         }
      }
   }

   @Override
   public void a(agu $$0) {
      zk.a($$0, this, this.f.y());
      if (this.f.s(2)) {
         dyc $$1 = this.f.dV().c_($$0.e());
         tz $$2 = $$1 != null ? $$1.d(this.f.dX()) : null;
         this.f.f.b(new agc($$0.b(), $$2));
      }
   }

   @Override
   public void a(ahq $$0) {
      zk.a($$0, this, this.f.y());
      if (b($$0.a(0.0), $$0.b(0.0), $$0.c(0.0), $$0.a(0.0F), $$0.b(0.0F))) {
         this.a(xa.c("multiplayer.disconnect.invalid_player_movement"));
      } else {
         ars $$1 = this.f.y();
         if (!this.f.k) {
            if (this.o == 0) {
               this.l();
            }

            if (this.f.gJ()) {
               float $$2 = azo.h($$0.a(this.f.dL()));
               float $$3 = azo.h($$0.b(this.f.dN()));
               if (this.p()) {
                  this.f.c($$2, $$3);
               } else {
                  double $$4 = a($$0.a(this.f.dA()));
                  double $$5 = b($$0.b(this.f.dC()));
                  double $$6 = a($$0.c(this.f.dG()));
                  if (this.f.bY()) {
                     this.f.a(this.f.dA(), this.f.dC(), this.f.dG(), $$2, $$3);
                     this.f.y().m().a(this.f);
                  } else {
                     double $$7 = this.f.dA();
                     double $$8 = this.f.dC();
                     double $$9 = this.f.dG();
                     double $$10 = $$4 - this.s;
                     double $$11 = $$5 - this.t;
                     double $$12 = $$6 - this.u;
                     double $$13 = this.f.dy().h();
                     double $$14 = $$10 * $$10 + $$11 * $$11 + $$12 * $$12;
                     if (this.f.fR()) {
                        if ($$14 > 1.0) {
                           this.a(this.f.dA(), this.f.dC(), this.f.dG(), $$2, $$3);
                        }
                     } else {
                        boolean $$15 = this.f.fJ();
                        if ($$1.u().i()) {
                           this.M++;
                           int $$16 = this.M - this.N;
                           if ($$16 > 5) {
                              h.debug("{} is sending move packets too frequently ({} packets since last tick)", this.f.ai().getString(), $$16);
                              $$16 = 1;
                           }

                           if (this.a($$15)) {
                              float $$17 = $$15 ? 300.0F : 100.0F;
                              if ($$14 - $$13 > (double)($$17 * (float)$$16)) {
                                 h.warn("{} moved too quickly! {},{},{}", new Object[]{this.f.ai().getString(), $$10, $$11, $$12});
                                 this.a(this.f.dA(), this.f.dC(), this.f.dG(), this.f.dL(), this.f.dN());
                                 return;
                              }
                           }
                        }

                        ffl $$18 = this.f.cR();
                        $$10 = $$4 - this.v;
                        $$11 = $$5 - this.w;
                        $$12 = $$6 - this.x;
                        boolean $$19 = $$11 > 0.0;
                        if (this.f.aH() && !$$0.b() && $$19) {
                           this.f.s();
                        }

                        boolean $$20 = this.f.R;
                        this.f.a(bxy.b, new ffq($$10, $$11, $$12));
                        $$10 = $$4 - this.f.dA();
                        $$11 = $$5 - this.f.dC();
                        if ($$11 > -0.5 || $$11 < 0.5) {
                           $$11 = 0.0;
                        }

                        $$12 = $$6 - this.f.dG();
                        $$14 = $$10 * $$10 + $$11 * $$11 + $$12 * $$12;
                        boolean $$22 = false;
                        if (!this.f.Q() && $$14 > 0.0625 && !this.f.fR() && !this.f.h.e() && this.f.h.b() != dju.d) {
                           $$22 = true;
                           h.warn("{} moved wrongly!", this.f.ai().getString());
                        }

                        if (this.f.ad || this.f.fR() || (!$$22 || !$$1.a(this.f, $$18)) && !this.a($$1, $$18, $$4, $$5, $$6)) {
                           this.f.a($$4, $$5, $$6, $$2, $$3);
                           boolean $$23 = this.f.fv();
                           this.I = $$11 >= -0.03125
                              && !$$20
                              && this.f.h.b() != dju.d
                              && !this.d.ad()
                              && !this.f.gk().c
                              && !this.f.b(bvz.y)
                              && !$$15
                              && !$$23
                              && this.b(this.f);
                           this.f.y().m().a(this.f);
                           ffq $$24 = new ffq(this.f.dA() - $$7, this.f.dC() - $$8, this.f.dG() - $$9);
                           this.f.a($$0.b(), $$0.e(), $$24);
                           this.f.a($$24.d, $$24.e, $$24.f, $$0.b());
                           this.a($$24);
                           if ($$19) {
                              this.f.k();
                           }

                           if ($$0.b() || this.f.eg() || this.f.d_() || this.f.Z_() || $$15 || $$23) {
                              this.f.gO();
                           }

                           this.f.a(this.f.dA() - $$7, this.f.dC() - $$8, this.f.dG() - $$9);
                           this.v = this.f.dA();
                           this.w = this.f.dC();
                           this.x = this.f.dG();
                        } else {
                           this.a($$7, $$8, $$9, $$2, $$3);
                           this.f.a(this.f.dA() - $$7, this.f.dC() - $$8, this.f.dG() - $$9, $$0.b());
                           this.f.aJ();
                        }
                     }
                  }
               }
            }
         }
      }
   }

   private boolean a(boolean $$0) {
      if (this.h()) {
         return false;
      } else if (this.f.Q()) {
         return false;
      } else {
         djt $$1 = this.f.y().O();
         return $$1.c(djt.u) ? false : !$$0 || !$$1.c(djt.v);
      }
   }

   private boolean p() {
      if (this.F != null) {
         if (this.o - this.H > 20) {
            this.H = this.o;
            this.a(this.F.d, this.F.e, this.F.f, this.f.dL(), this.f.dN());
         }

         return true;
      } else {
         this.H = this.o;
         return false;
      }
   }

   private boolean a(dka $$0, ffl $$1, double $$2, double $$3, double $$4) {
      ffl $$5 = this.f.cR().d($$2 - this.f.dA(), $$3 - this.f.dC(), $$4 - this.f.dG());
      Iterable<fgk> $$6 = $$0.d(this.f, $$5.h(1.0E-5F));
      fgk $$7 = fgh.a($$1.h(1.0E-5F));

      for (fgk $$8 : $$6) {
         if (!fgh.c($$8, $$7, ffu.i)) {
            return true;
         }
      }

      return false;
   }

   public void a(double $$0, double $$1, double $$2, float $$3, float $$4) {
      this.a(new byh(new ffq($$0, $$1, $$2), ffq.c, $$3, $$4), Collections.emptySet());
   }

   public void a(byh $$0, Set<byi> $$1) {
      this.H = this.o;
      if (++this.G == Integer.MAX_VALUE) {
         this.G = 0;
      }

      this.f.a($$0, $$1);
      this.F = this.f.dt();
      this.f.f.b(aef.a(this.G, $$0, $$1));
   }

   @Override
   public void a(ahx $$0) {
      zk.a($$0, this, this.f.y());
      if (this.f.gJ()) {
         iv $$1 = $$0.b();
         this.f.H();
         ahx.a $$2 = $$0.f();
         switch ($$2) {
            case g:
               if (!this.f.Z_()) {
                  czy $$3 = this.f.b(buq.b);
                  this.f.a(buq.b, this.f.b(buq.a));
                  this.f.a(buq.a, $$3);
                  this.f.fF();
               }

               return;
            case e:
               if (!this.f.Z_()) {
                  this.f.a(false);
               }

               return;
            case d:
               if (!this.f.Z_()) {
                  this.f.a(true);
               }

               return;
            case f:
               this.f.fE();
               return;
            case a:
            case b:
            case c:
               this.f.h.a($$1, $$2, $$0.e(), this.f.dV().ao(), $$0.g());
               this.f.f.a($$0.g());
               return;
            default:
               throw new IllegalArgumentException("Invalid player action");
         }
      }
   }

   private static boolean a(art $$0, czy $$1) {
      if ($$1.f()) {
         return false;
      } else {
         czu $$2 = $$1.h();
         return ($$2 instanceof cyg || $$2 instanceof cym) && !$$0.gF().a($$1);
      }
   }

   @Override
   public void a(ait $$0) {
      zk.a($$0, this, this.f.y());
      if (this.f.gJ()) {
         this.f.f.a($$0.f());
         ars $$1 = this.f.y();
         buq $$2 = $$0.b();
         czy $$3 = this.f.b($$2);
         if ($$3.a($$1.K())) {
            ffm $$4 = $$0.e();
            ffq $$5 = $$4.g();
            iv $$6 = $$4.b();
            if (this.f.a($$6, 1.0)) {
               ffq $$7 = $$5.d(ffq.b($$6));
               double $$8 = 1.0000001;
               if (Math.abs($$7.a()) < 1.0000001 && Math.abs($$7.b()) < 1.0000001 && Math.abs($$7.c()) < 1.0000001) {
                  jb $$9 = $$4.c();
                  this.f.H();
                  int $$10 = this.f.dV().ao();
                  if ($$6.v() <= $$10) {
                     if (this.F == null && $$1.a(this.f, $$6)) {
                        bur $$11 = this.f.h.a(this.f, $$1, $$3, $$2, $$4);
                        if ($$11.a()) {
                           aq.P.a(this.f, $$4.b(), $$3.v());
                        }

                        if ($$9 == jb.b && !$$11.a() && $$6.v() >= $$10 && a(this.f, $$3)) {
                           xa $$12 = xa.a("build.tooHigh", $$10).a(o.m);
                           this.f.b($$12, true);
                        } else if ($$11 instanceof bur.d $$13 && $$13.e() == bur.e.c) {
                           this.f.a($$2, true);
                        }
                     }
                  } else {
                     xa $$14 = xa.a("build.tooHigh", $$10).a(o.m);
                     this.f.b($$14, true);
                  }

                  this.f.f.b(new ace($$1, $$6));
                  this.f.f.b(new ace($$1, $$6.a($$9)));
               } else {
                  h.warn("Rejecting UseItemOnPacket from {}: Location {} too far away from hit block {}.", new Object[]{this.f.gi().getName(), $$5, $$6});
               }
            }
         }
      }
   }

   @Override
   public void a(aiu $$0) {
      zk.a($$0, this, this.f.y());
      if (this.f.gJ()) {
         this.a($$0.e());
         ars $$1 = this.f.y();
         buq $$2 = $$0.b();
         czy $$3 = this.f.b($$2);
         this.f.H();
         if (!$$3.f() && $$3.a($$1.K())) {
            float $$4 = azo.h($$0.f());
            float $$5 = azo.h($$0.g());
            if ($$5 != this.f.dN() || $$4 != this.f.dL()) {
               this.f.c($$4, $$5);
            }

            if (this.f.h.a(this.f, $$1, $$3, $$2) instanceof bur.d $$7 && $$7.e() == bur.e.c) {
               this.f.a($$2, true);
            }
         }
      }
   }

   @Override
   public void a(air $$0) {
      zk.a($$0, this, this.f.y());
      if (this.f.Z_()) {
         for (ars $$1 : this.d.L()) {
            bwt $$2 = $$0.a($$1);
            if ($$2 != null) {
               this.f.a($$1, $$2.dA(), $$2.dC(), $$2.dG(), Set.of(), $$2.dL(), $$2.dN(), true);
               return;
            }
         }
      }
   }

   @Override
   public void a(ahs $$0) {
      zk.a($$0, this, this.f.y());
      if (this.f.dl() instanceof cui $$2) {
         $$2.a($$0.b(), $$0.e());
      }
   }

   @Override
   public void a(vv $$0) {
      h.info("{} lost connection: {}", this.f.ai().getString(), $$0.a().getString());
      this.q();
      super.a($$0);
   }

   private void q() {
      this.T.close();
      this.d.av();
      this.d.ag().a(xa.a("multiplayer.player.left", this.f.m_()).a(o.o), false);
      this.f.t();
      this.d.ag().c(this.f);
      this.f.W().b();
   }

   public void a(int $$0) {
      if ($$0 < 0) {
         throw new IllegalArgumentException("Expected packet sequence nr >= 0");
      } else {
         this.p = Math.max($$0, this.p);
      }
   }

   @Override
   public void a(aii $$0) {
      zk.a($$0, this, this.f.y());
      if ($$0.b() >= 0 && $$0.b() < crw.h()) {
         if (this.f.gj().f() != $$0.b() && this.f.fA() == buq.a) {
            this.f.fF();
         }

         this.f.gj().c($$0.b());
         this.f.H();
      } else {
         h.warn("{} tried to set an invalid carried item", this.f.ai().getString());
      }
   }

   @Override
   public void a(agz $$0) {
      Optional<xh> $$1 = this.a($$0.h());
      if (!$$1.isEmpty()) {
         this.a($$0.b(), () -> {
            xq $$2;
            try {
               $$2 = this.a($$0, $$1.get());
            } catch (xu.a var6) {
               this.a(var6);
               return;
            }

            CompletableFuture<asl> $$5 = this.a($$2.c());
            xa $$6 = this.d.bk().decorate(this.f, $$2.d());
            this.T.append($$5, $$2x -> {
               xq $$3 = $$2.a($$6).a($$2x.e());
               this.b($$3);
            });
         });
      }
   }

   @Override
   public void a(agx $$0) {
      this.a($$0.b(), () -> {
         this.b($$0.b());
         this.r();
      });
   }

   private void b(String $$0) {
      ParseResults<ej> $$1 = this.c($$0);
      if (this.d.aA() && xs.a($$1)) {
         h.error("Received unsigned command packet from {}, but the command requires signable arguments: {}", this.f.gi().getName(), $$0);
         this.f.a(m);
      } else {
         this.d.aG().a($$1, $$0);
      }
   }

   @Override
   public void a(agy $$0) {
      Optional<xh> $$1 = this.a($$0.h());
      if (!$$1.isEmpty()) {
         this.a($$0.b(), () -> {
            this.a($$0, $$1.get());
            this.r();
         });
      }
   }

   private void a(agy $$0, xh $$1) {
      ParseResults<ej> $$2 = this.c($$0.b());

      Map<String, xq> $$3;
      try {
         $$3 = this.a($$0, xs.b($$2), $$1);
      } catch (xu.a var6) {
         this.a(var6);
         return;
      }

      eh $$6 = new eh.a($$3);
      $$2 = ek.a($$2, $$1x -> $$1x.a($$6, this.T));
      this.d.aG().a($$2, $$0.b());
   }

   private void a(xu.a $$0) {
      h.warn("Failed to update secure chat state for {}: '{}'", this.f.gi().getName(), $$0.a().getString());
      this.f.a($$0.a().f().a(o.m));
   }

   private <S> Map<String, xq> a(agy $$0, xs<S> $$1, xh $$2) throws xu.a {
      List<eq.a> $$3 = $$0.g().a();
      List<xs.a<S>> $$4 = $$1.a();
      if ($$3.isEmpty()) {
         return this.b($$4);
      } else {
         Map<String, xq> $$5 = new Object2ObjectOpenHashMap();

         for (eq.a $$6 : $$3) {
            xs.a<S> $$7 = $$1.a($$6.a());
            if ($$7 == null) {
               this.Q.setChainBroken();
               throw a($$0.b(), $$3, $$4);
            }

            xt $$8 = new xt($$7.c(), $$0.e(), $$0.f(), $$2);
            $$5.put($$7.a(), this.Q.unpack($$6.b(), $$8));
         }

         for (xs.a<S> $$9 : $$4) {
            if (!$$5.containsKey($$9.a())) {
               throw a($$0.b(), $$3, $$4);
            }
         }

         return $$5;
      }
   }

   private <S> Map<String, xq> b(List<xs.a<S>> $$0) throws xu.a {
      Map<String, xq> $$1 = new HashMap<>();

      for (xs.a<S> $$2 : $$0) {
         xt $$3 = xt.a($$2.c());
         $$1.put($$2.a(), this.Q.unpack(null, $$3));
      }

      return $$1;
   }

   private static <S> xu.a a(String $$0, List<eq.a> $$1, List<xs.a<S>> $$2) {
      String $$3 = $$1.stream().map(eq.a::a).collect(Collectors.joining(", "));
      String $$4 = $$2.stream().map(xs.a::a).collect(Collectors.joining(", "));
      h.error("Signed command mismatch between server and client ('{}'): got [{}] from client, but expected [{}]", new Object[]{$$0, $$3, $$4});
      return new xu.a(m);
   }

   private ParseResults<ej> c(String $$0) {
      CommandDispatcher<ej> $$1 = this.d.aG().a();
      return $$1.parse($$0, this.f.A());
   }

   private void a(String $$0, Runnable $$1) {
      if (d($$0)) {
         this.a(xa.c("multiplayer.disconnect.illegal_characters"));
      } else if (this.f.E() == cru.c) {
         this.b(new aga(xa.c("chat.disabled.options").a(o.m), false));
      } else {
         this.f.H();
         this.d.execute($$1);
      }
   }

   private Optional<xh> a(xh.b $$0) {
      synchronized (this.R) {
         Optional<xh> $$1 = this.R.a($$0);
         if ($$1.isEmpty()) {
            h.warn("Failed to validate message acknowledgements from {}", this.f.ai().getString());
            this.a(l);
         }

         return $$1;
      }
   }

   private static boolean d(String $$0) {
      for (int $$1 = 0; $$1 < $$0.length(); $$1++) {
         if (!ban.a($$0.charAt($$1))) {
            return true;
         }
      }

      return false;
   }

   private xq a(agz $$0, xh $$1) throws xu.a {
      xt $$2 = new xt($$0.b(), $$0.e(), $$0.f(), $$1);
      return this.Q.unpack($$0.g(), $$2);
   }

   private void b(xq $$0) {
      this.d.ag().a($$0, this.f, ww.a(ww.e, this.f));
      this.r();
   }

   private void r() {
      this.q.a();
      if (!this.q.c() && !this.d.ag().f(this.f.gi()) && !this.d.a(this.f.gi())) {
         this.a(xa.c("disconnect.spam"));
      }
   }

   @Override
   public void a(agw $$0) {
      synchronized (this.R) {
         if (!this.R.a($$0.b())) {
            h.warn("Failed to validate message acknowledgements from {}", this.f.ai().getString());
            this.a(l);
         }
      }
   }

   @Override
   public void a(aiq $$0) {
      zk.a($$0, this, this.f.y());
      this.f.H();
      this.f.a($$0.b());
   }

   @Override
   public void a(ahy $$0) {
      zk.a($$0, this, this.f.y());
      if (this.f.gJ()) {
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
               if (this.f.fR()) {
                  this.f.a(false, true);
                  this.F = this.f.dt();
               }
               break;
            case f:
               if (this.f.dl() instanceof bye $$1) {
                  int $$2 = $$0.f();
                  if ($$1.a() && $$2 > 0) {
                     $$1.c($$2);
                  }
               }
               break;
            case g:
               if (this.f.dl() instanceof bye $$3) {
                  $$3.b();
               }
               break;
            case h:
               if (this.f.dk() instanceof bxk $$4) {
                  $$4.b(this.f);
               }
               break;
            case i:
               if (!this.f.gq()) {
                  this.f.fm();
               }
               break;
            default:
               throw new IllegalArgumentException("Invalid client command!");
         }
      }
   }

   public void a(xq $$0) {
      xm $$1 = $$0.l();
      if ($$1 != null) {
         this.S.a($$0.m(), $$0.l());
         int $$2;
         synchronized (this.R) {
            this.R.a($$1);
            $$2 = this.R.a();
         }

         if ($$2 > 4096) {
            this.a(xa.c("multiplayer.disconnect.too_many_pending_chats"));
         }
      }
   }

   public void a(xq $$0, ww.a $$1) {
      this.b(new ady($$0.k().c(), $$0.k().b(), $$0.l(), $$0.m().a(this.S), $$0.n(), $$0.o(), $$1));
      this.a($$0);
   }

   public void a(xa $$0, ww.a $$1) {
      this.b(new acy($$0, $$1));
   }

   public SocketAddress m() {
      return this.e.d();
   }

   public void n() {
      this.U = true;
      this.q();
      this.b(afy.a);
      this.e.a(abl.d);
   }

   @Override
   public void a(akb $$0) {
      this.e.a(new ajy($$0.b()));
   }

   @Override
   public void a(ahn $$0) {
      zk.a($$0, this, this.f.y());
      if (this.f.gJ()) {
         final ars $$1 = this.f.y();
         final bwt $$2 = $$0.a($$1);
         this.f.H();
         this.f.g($$0.b());
         if ($$2 != null) {
            if (!$$1.E_().a($$2.dv())) {
               return;
            }

            ffl $$3 = $$2.cR();
            if (this.f.a($$3, 3.0)) {
               $$0.a(new ahn.c() {
                  private void a(buq $$0, asv.a $$1x) {
                     czy $$2 = asv.this.f.b($$0);
                     if ($$2.a($$1.K())) {
                        czy $$3 = $$2.v();
                        if ($$1.run(asv.this.f, $$2, $$0) instanceof bur.d $$5) {
                           czy $$6 = $$5.c() ? $$3 : czy.k;
                           aq.T.a(asv.this.f, $$6, $$2);
                           if ($$5.e() == bur.e.c) {
                              asv.this.f.a($$0, true);
                           }
                        }
                     }
                  }

                  @Override
                  public void a(buq $$0) {
                     this.a($$0, crx::a);
                  }

                  @Override
                  public void a(buq $$0, ffq $$1x) {
                     this.a($$0, ($$1xxx, $$2xx, $$3) -> $$2xx.a($$1xxx, $$1, $$3));
                  }

                  @Override
                  public void a() {
                     label23:
                     if (!($$2 instanceof coc) && !($$2 instanceof bxh) && $$2 != asv.this.f) {
                        if ($$2 instanceof csf $$0 && !$$0.cB()) {
                           break label23;
                        }

                        czy $$1 = asv.this.f.b(buq.a);
                        if (!$$1.a($$1.K())) {
                           return;
                        }

                        asv.this.f.e($$2);
                        return;
                     }

                     asv.this.a(xa.c("multiplayer.disconnect.invalid_entity_attacked"));
                     asv.h.warn("Player {} tried to attack an invalid entity", asv.this.f.ai().getString());
                  }
               });
            }
         }
      }
   }

   @Override
   public void a(ahc $$0) {
      zk.a($$0, this, this.f.y());
      this.f.H();
      ahc.a $$1 = $$0.b();
      switch ($$1) {
         case a:
            if (this.f.k) {
               this.f.k = false;
               this.f = this.d.ag().a(this.f, true, bwt.d.e);
               this.l();
               aq.w.a(this.f, djx.k, djx.i);
            } else {
               if (this.f.eG() > 0.0F) {
                  return;
               }

               this.f = this.d.ag().a(this.f, false, bwt.d.a);
               this.l();
               if (this.d.v_()) {
                  this.f.a(dju.d);
                  this.f.y().O().b(djt.s).a(false, this.d);
               }
            }
            break;
         case b:
            this.f.I().a(this.f);
      }
   }

   @Override
   public void a(ahi $$0) {
      zk.a($$0, this, this.f.y());
      this.f.q();
   }

   @Override
   public void a(ahh $$0) {
      zk.a($$0, this, this.f.y());
      this.f.H();
      if (this.f.bR.l == $$0.b()) {
         if (this.f.Z_()) {
            this.f.bR.b();
         } else if (!this.f.bR.b(this.f)) {
            h.debug("Player {} interacted with invalid menu {}", this.f, this.f.bR);
         } else {
            int $$1 = $$0.e();
            if (!this.f.bR.a($$1)) {
               h.debug("Player {} clicked invalid slot index: {}, available slots: {}", new Object[]{this.f.ai(), $$1, this.f.bR.k.size()});
            } else {
               boolean $$2 = $$0.j() != this.f.bR.j();
               this.f.bR.h();
               this.f.bR.a($$1, $$0.f(), $$0.i(), this.f);
               ObjectIterator var4 = Int2ObjectMaps.fastIterable($$0.h()).iterator();

               while (var4.hasNext()) {
                  Entry<czy> $$3 = (Entry<czy>)var4.next();
                  this.f.bR.b($$3.getIntKey(), (czy)$$3.getValue());
               }

               this.f.bR.a($$0.g());
               this.f.bR.i();
               if ($$2) {
                  this.f.bR.e();
               } else {
                  this.f.bR.d();
               }
            }
         }
      }
   }

   @Override
   public void a(ahv $$0) {
      zk.a($$0, this, this.f.y());
      this.f.H();
      if (!this.f.Z_() && this.f.bR.l == $$0.b()) {
         if (!this.f.bR.b(this.f)) {
            h.debug("Player {} interacted with invalid menu {}", this.f, this.f.bR);
         } else {
            dew.d $$1 = this.d.aI().a($$0.e());
            if ($$1 != null) {
               deu<?> $$2 = $$1.b();
               if (this.f.J().b($$2.a())) {
                  if (this.f.bR instanceof cxf $$3) {
                     if ($$2.b().ap_().c()) {
                        h.debug("Player {} tried to place impossible recipe {}", this.f, $$2.a().a());
                        return;
                     }

                     cxf.a $$4 = $$3.a($$0.f(), this.f.b(), $$2, this.f.y(), this.f.gj());
                     if ($$4 == cxf.a.b) {
                        this.f.f.b(new adw(this.f.bR.l, $$1.a().b()));
                     }
                  }
               }
            }
         }
      }
   }

   @Override
   public void a(ahg $$0) {
      zk.a($$0, this, this.f.y());
      this.f.H();
      if (this.f.bR.l == $$0.b() && !this.f.Z_()) {
         if (!this.f.bR.b(this.f)) {
            h.debug("Player {} interacted with invalid menu {}", this.f, this.f.bR);
         } else {
            boolean $$1 = this.f.bR.a(this.f, $$0.e());
            if ($$1) {
               this.f.bR.d();
            }
         }
      }
   }

   @Override
   public void a(ail $$0) {
      zk.a($$0, this, this.f.y());
      if (this.f.fV()) {
         boolean $$1 = $$0.b() < 0;
         czy $$2 = $$0.e();
         if (!$$2.a(this.f.dV().K())) {
            return;
         }

         boolean $$3 = $$0.b() >= 1 && $$0.b() <= 45;
         boolean $$4 = $$2.f() || $$2.M() <= $$2.k();
         if ($$3 && $$4) {
            this.f.bQ.b($$0.b()).e($$2);
            this.f.bQ.a($$0.b(), $$2);
            this.f.bQ.d();
         } else if ($$1 && $$4) {
            if (this.r.c()) {
               this.r.a();
               this.f.a($$2, true);
            } else {
               h.warn("Player {} was dropping items too fast in creative mode, ignoring.", this.f.ai().getString());
            }
         }
      }
   }

   @Override
   public void a(aip $$0) {
      List<String> $$1 = Stream.of($$0.f()).map(o::a).collect(Collectors.toList());
      this.a($$1).thenAcceptAsync($$1x -> this.a($$0, $$1x), this.d);
   }

   private void a(aip $$0, List<asl> $$1) {
      this.f.H();
      ars $$2 = this.f.y();
      iv $$3 = $$0.b();
      if ($$2.C($$3)) {
         if (!($$2.c_($$3) instanceof dzq $$5)) {
            return;
         }

         $$5.a(this.f, $$0.e(), $$1);
      }
   }

   @Override
   public void a(ahw $$0) {
      zk.a($$0, this, this.f.y());
      this.f.gk().b = $$0.b() && this.f.gk().c;
   }

   @Override
   public void a(aab $$0) {
      zk.a($$0, this, this.f.y());
      boolean $$1 = this.f.a(crz.g);
      this.f.a($$0.b());
      if (this.f.a(crz.g) != $$1) {
         this.d.ag().a(new aed(aed.a.h, this.f));
      }
   }

   @Override
   public void a(agv $$0) {
      zk.a($$0, this, this.f.y());
      if (this.f.s(2) || this.h()) {
         this.d.a($$0.b(), false);
      }
   }

   @Override
   public void a(ahp $$0) {
      zk.a($$0, this, this.f.y());
      if (this.f.s(2) || this.h()) {
         this.d.b($$0.b());
      }
   }

   @Override
   public void a(aha $$0) {
      zk.a($$0, this, this.f.y());
      xr.a $$1 = $$0.b();
      csb.a $$2 = this.P != null ? this.P.d().b() : null;
      csb.a $$3 = $$1.b();
      if (!Objects.equals($$2, $$3)) {
         if ($$2 != null && $$3.b().isBefore($$2.b())) {
            this.a(csb.a);
         } else {
            try {
               bad $$4 = this.d.ar();
               if ($$4 == null) {
                  h.warn("Ignoring chat session from {} due to missing Services public key", this.f.gi().getName());
                  return;
               }

               this.a($$1.a(this.f.gi(), $$4));
            } catch (csb.b var6) {
               h.error("Failed to validate profile key: {}", var6.getMessage());
               this.a(var6.a());
            }
         }
      }
   }

   @Override
   public void a(ahf $$0) {
      if (!this.U) {
         throw new IllegalStateException("Client acknowledged config, but none was requested");
      } else {
         this.e.a(abl.b, new ast(this.d, this.e, this.a(this.f.C())));
      }
   }

   @Override
   public void a(ahb $$0) {
      zk.a($$0, this, this.f.y());
      this.g.a($$0.b());
   }

   @Override
   public void a(ahk $$0) {
      zk.a($$0, this, this.f.y());
      this.d.a(this.f, $$0.b());
   }

   private void a(xr $$0) {
      this.P = $$0;
      this.Q = $$0.a(this.f.cG());
      this.T.append(() -> {
         this.f.a($$0);
         this.d.ag().a(new aed(EnumSet.of(aed.a.b), List.of(this.f)));
      });
   }

   @Override
   public void a(aac $$0) {
   }

   @Override
   public void a(ahd $$0) {
      zk.a($$0, this, this.f.y());
      if (!this.O) {
         this.f.a(ffq.c);
      }

      this.O = false;
   }

   private void a(ffq $$0) {
      if ($$0.h() > 1.0E-5F) {
         this.f.H();
      }

      this.f.a($$0);
      this.O = true;
   }

   @Override
   public art o() {
      return this.f;
   }

   @FunctionalInterface
   interface a {
      bur run(art var1, bwt var2, buq var3);
   }
}
