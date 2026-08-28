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

public class ast extends asq implements agp, asw, wm {
   static final Logger h = LogUtils.getLogger();
   private static final int i = -1;
   private static final int j = 4096;
   private static final int k = 80;
   private static final wy l = wy.c("multiplayer.disconnect.chat_validation_failed");
   private static final wy m = wy.c("chat.disabled.invalid_command_signature").a(o.m);
   private static final int n = 1000;
   public arr f;
   public final aso g;
   private int o;
   private int p = -1;
   private final bao q = new bao(20, 200);
   private final bao r = new bao(20, 1480);
   private double s;
   private double t;
   private double u;
   private double v;
   private double w;
   private double x;
   @Nullable
   private bwi y;
   private double z;
   private double A;
   private double B;
   private double C;
   private double D;
   private double E;
   @Nullable
   private ffc F;
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
   private xp P;
   private xs.b Q;
   private final xh R = new xh(20);
   private final xl S = xl.a();
   private final aza T;
   private boolean U;

   public ast(MinecraftServer $$0, vr $$1, arr $$2, asg $$3) {
      super($$0, $$1, $$3);
      this.g = new aso($$1.e());
      this.f = $$2;
      $$2.f = this;
      $$2.W().a();
      this.Q = xs.b.unsigned($$2.cF(), $$0::aA);
      this.T = new aza($$0);
   }

   @Override
   public void d() {
      if (this.p > -1) {
         this.b(new aby(this.p));
         this.p = -1;
      }

      this.l();
      this.f.K = this.f.dz();
      this.f.L = this.f.dB();
      this.f.M = this.f.dF();
      this.f.i();
      this.f.a(this.s, this.t, this.u, this.f.dK(), this.f.dM());
      this.o++;
      this.N = this.M;
      if (this.I && !this.f.fQ() && !this.f.bX() && !this.f.eG()) {
         if (++this.J > this.a((bwi)this.f)) {
            h.warn("{} was kicked for floating too long!", this.f.ai().getString());
            this.a(wy.c("multiplayer.disconnect.flying"));
            return;
         }
      } else {
         this.I = false;
         this.J = 0;
      }

      this.y = this.f.de();
      if (this.y != this.f && this.y.cV() == this.f) {
         this.z = this.y.dz();
         this.A = this.y.dB();
         this.B = this.y.dF();
         this.C = this.y.dz();
         this.D = this.y.dB();
         this.E = this.y.dF();
         if (this.K && this.y.cV() == this.f) {
            if (++this.L > this.a(this.y)) {
               h.warn("{} was kicked for floating a vehicle too long!", this.f.ai().getString());
               this.a(wy.c("multiplayer.disconnect.flying"));
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
         this.a(wy.c("multiplayer.disconnect.idling"));
      }
   }

   private int a(bwi $$0) {
      double $$1 = $$0.bc();
      if ($$1 < 1.0E-5F) {
         return Integer.MAX_VALUE;
      } else {
         double $$2 = 0.08 / $$1;
         return azm.c(80.0 * Math.max($$2, 1.0));
      }
   }

   @Override
   public void l() {
      this.s = this.f.dz();
      this.t = this.f.dB();
      this.u = this.f.dF();
      this.v = this.f.dz();
      this.w = this.f.dB();
      this.x = this.f.dF();
   }

   @Override
   public boolean c() {
      return this.e.i() && !this.U;
   }

   @Override
   public boolean a(zf<?> $$0) {
      return super.a($$0) ? true : this.U && this.e.i() && $$0 instanceof ahd;
   }

   @Override
   protected GameProfile i() {
      return this.f.gh();
   }

   private <T, R> CompletableFuture<R> a(T $$0, BiFunction<asz, T, CompletableFuture<R>> $$1) {
      return $$1.apply(this.f.W(), $$0).thenApply($$0x -> {
         if (!this.c()) {
            h.debug("Ignoring packet due to disconnection");
            throw new CancellationException("disconnected");
         } else {
            return (R)$$0x;
         }
      });
   }

   private CompletableFuture<asj> a(String $$0) {
      return this.a($$0, asz::a);
   }

   private CompletableFuture<List<asj>> a(List<String> $$0) {
      return this.a($$0, asz::a);
   }

   @Override
   public void a(ahx $$0) {
      zi.a($$0, this, this.f.y());
      this.f.a($$0.b());
   }

   private static boolean b(double $$0, double $$1, double $$2, float $$3, float $$4) {
      return Double.isNaN($$0) || Double.isNaN($$1) || Double.isNaN($$2) || !Floats.isFinite($$4) || !Floats.isFinite($$3);
   }

   private static double a(double $$0) {
      return azm.a($$0, -3.0E7, 3.0E7);
   }

   private static double b(double $$0) {
      return azm.a($$0, -2.0E7, 2.0E7);
   }

   @Override
   public void a(ahp $$0) {
      zi.a($$0, this, this.f.y());
      if (b($$0.b().a(), $$0.b().b(), $$0.b().c(), $$0.e(), $$0.f())) {
         this.a(wy.c("multiplayer.disconnect.invalid_vehicle_movement"));
      } else if (!this.p() && this.f.gI()) {
         bwi $$1 = this.f.de();
         if ($$1 != this.f && $$1.cV() == this.f && $$1 == this.y) {
            arq $$2 = this.f.y();
            double $$3 = $$1.dz();
            double $$4 = $$1.dB();
            double $$5 = $$1.dF();
            double $$6 = a($$0.b().a());
            double $$7 = b($$0.b().b());
            double $$8 = a($$0.b().c());
            float $$9 = azm.h($$0.e());
            float $$10 = azm.h($$0.f());
            double $$11 = $$6 - this.z;
            double $$12 = $$7 - this.A;
            double $$13 = $$8 - this.B;
            double $$14 = $$1.dx().h();
            double $$15 = $$11 * $$11 + $$12 * $$12 + $$13 * $$13;
            if ($$15 - $$14 > 100.0 && !this.h()) {
               h.warn("{} (vehicle of {}) moved too quickly! {},{},{}", new Object[]{$$1.ai().getString(), this.f.ai().getString(), $$11, $$12, $$13});
               this.b(adq.a($$1));
               return;
            }

            boolean $$16 = $$2.a($$1, $$1.cQ().h(0.0625));
            $$11 = $$6 - this.C;
            $$12 = $$7 - this.D;
            $$13 = $$8 - this.E;
            boolean $$17 = $$1.R;
            if ($$1 instanceof bxj $$18 && $$18.d_()) {
               $$18.k();
            }

            $$1.a(bxn.b, new ffc($$11, $$12, $$13));
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
               h.warn("{} (vehicle of {}) moved wrongly! {}", new Object[]{$$1.ai().getString(), this.f.ai().getString(), Math.sqrt($$15)});
            }

            $$1.a($$6, $$7, $$8, $$9, $$10);
            boolean $$21 = $$2.a($$1, $$1.cQ().h(0.0625));
            if ($$16 && ($$20 || !$$21)) {
               $$1.a($$3, $$4, $$5, $$9, $$10);
               this.b(adq.a($$1));
               return;
            }

            this.f.y().m().a(this.f);
            $$1.b(new ffc($$3, $$4, $$5), $$1.ds());
            ffc $$22 = new ffc($$1.dz() - $$3, $$1.dB() - $$4, $$1.dF() - $$5);
            this.a($$22);
            $$1.a($$0.g(), $$22);
            $$1.a($$22.d, $$22.e, $$22.f, $$0.g());
            this.f.a($$22.d, $$22.e, $$22.f);
            this.K = $$12 >= -0.03125 && !$$17 && !this.d.ad() && !$$1.ba() && this.b($$1);
            this.C = $$1.dz();
            this.D = $$1.dB();
            this.E = $$1.dF();
         }
      }
   }

   private boolean b(bwi $$0) {
      return $$0.dU().a($$0.cQ().g(0.0625).b(0.0, -0.55, 0.0)).allMatch(eas.a::l);
   }

   @Override
   public void a(agr $$0) {
      zi.a($$0, this, this.f.y());
      if ($$0.b() == this.G) {
         if (this.F == null) {
            this.a(wy.c("multiplayer.disconnect.invalid_player_movement"));
            return;
         }

         this.f.a(this.F.d, this.F.e, this.F.f, this.f.dK(), this.f.dM());
         this.v = this.F.d;
         this.w = this.F.e;
         this.x = this.F.f;
         this.f.R();
         this.F = null;
      }
   }

   @Override
   public void a(ahy $$0) {
      zi.a($$0, this, this.f.y());
      this.f.v(true);
   }

   @Override
   public void a(aia $$0) {
      zi.a($$0, this, this.f.y());
      del.d $$1 = this.d.aI().a($$0.b());
      if ($$1 != null) {
         this.f.J().d($$1.b().a());
      }
   }

   @Override
   public void a(aid $$0) {
      zi.a($$0, this, this.f.y());
      this.f.bR.a($$0.b(), $$0.e());
   }

   @Override
   public void a(ahz $$0) {
      zi.a($$0, this, this.f.y());
      this.f.J().a($$0.b(), $$0.e(), $$0.f());
   }

   @Override
   public void a(aic $$0) {
      zi.a($$0, this, this.f.y());
      if ($$0.e() == aic.a.a) {
         alg $$1 = Objects.requireNonNull($$0.f());
         aj $$2 = this.d.aD().a($$1);
         if ($$2 != null) {
            this.f.S().a($$2);
         }
      }
   }

   @Override
   public void a(ahc $$0) {
      zi.a($$0, this, this.f.y());
      StringReader $$1 = new StringReader($$0.e());
      if ($$1.canRead() && $$1.peek() == '/') {
         $$1.skip();
      }

      ParseResults<ej> $$2 = this.d.aG().a().parse($$1, this.f.A());
      this.d.aG().a().getCompletionSuggestions($$2).thenAccept($$1x -> {
         Suggestions $$2x = $$1x.getList().size() <= 1000 ? $$1x : new Suggestions($$1x.getRange(), $$1x.getList().subList(0, 1000));
         this.b(new acl($$0.b(), $$2x));
      });
   }

   @Override
   public void a(aih $$0) {
      zi.a($$0, this, this.f.y());
      if (!this.d.q()) {
         this.f.a(wy.c("advMode.notEnabled"));
      } else if (!this.f.gF()) {
         this.f.a(wy.c("advMode.notAllowed"));
      } else {
         dil $$1 = null;
         dyc $$2 = null;
         iv $$3 = $$0.b();
         dxr $$4 = this.f.dU().c_($$3);
         if ($$4 instanceof dyc) {
            $$2 = (dyc)$$4;
            $$1 = $$2.a();
         }

         String $$5 = $$0.e();
         boolean $$6 = $$0.f();
         if ($$1 != null) {
            dyc.a $$7 = $$2.s();
            eat $$8 = this.f.dU().a_($$3);
            jb $$9 = $$8.c(dob.b);

            eat $$10 = switch ($$0.i()) {
               case a -> dmt.ln.m();
               case b -> dmt.lm.m();
               default -> dmt.gm.m();
            };
            eat $$11 = $$10.b(dob.b, $$9).b(dob.c, Boolean.valueOf($$0.g()));
            if ($$11 != $$8) {
               this.f.dU().a($$3, $$11, 2);
               $$4.c($$11);
               this.f.dU().m($$3).a($$4);
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
            if (!bal.b($$5)) {
               this.f.a(wy.a("advMode.setCommand.success", $$5));
            }
         }
      }
   }

   @Override
   public void a(aii $$0) {
      zi.a($$0, this, this.f.y());
      if (!this.d.q()) {
         this.f.a(wy.c("advMode.notEnabled"));
      } else if (!this.f.gF()) {
         this.f.a(wy.c("advMode.notAllowed"));
      } else {
         dil $$1 = $$0.a(this.f.dU());
         if ($$1 != null) {
            $$1.a($$0.b());
            $$1.a($$0.e());
            if (!$$0.e()) {
               $$1.c(null);
            }

            $$1.f();
            this.f.a(wy.a("advMode.setCommand.success", $$0.b()));
         }
      }
   }

   @Override
   public void a(ahr $$0) {
      arq $$1 = this.f.y();
      zi.a($$0, this, $$1);
      iv $$2 = $$0.b();
      if (this.f.a($$2, 1.0)) {
         if ($$1.p($$2)) {
            eat $$3 = $$1.a_($$2);
            boolean $$4 = this.f.fU() && $$0.e();
            czn $$5 = $$3.a((djp)$$1, $$2, $$4);
            if (!$$5.f()) {
               if ($$4) {
                  a($$3, $$1, $$2, $$5);
               }

               this.a($$5);
            }
         }
      }
   }

   private static void a(eat $$0, arq $$1, iv $$2, czn $$3) {
      dxr $$4 = $$0.x() ? $$1.c_($$2) : null;
      if ($$4 != null) {
         tz $$5 = $$4.e($$1.F_());
         $$4.a($$5);
         cxv.a($$3, $$4.p(), $$5);
         $$3.b($$4.q());
      }
   }

   @Override
   public void a(ahs $$0) {
      arq $$1 = this.f.y();
      zi.a($$0, this, $$1);
      bwi $$2 = $$1.b($$0.b());
      if ($$2 != null && this.f.b($$2, 3.0)) {
         czn $$3 = $$2.dH();
         if ($$3 != null && !$$3.f()) {
            this.a($$3);
         }
      }
   }

   private void a(czn $$0) {
      if ($$0.a(this.f.dU().K())) {
         crl $$1 = this.f.gi();
         int $$2 = $$1.d($$0);
         if ($$2 != -1) {
            if (crl.e($$2)) {
               $$1.c($$2);
            } else {
               $$1.d($$2);
            }
         } else if (this.f.fU()) {
            $$1.c($$0);
         }

         this.f.f.b(new afj($$1.f()));
         this.f.bQ.d();
      }
   }

   @Override
   public void a(aib $$0) {
      zi.a($$0, this, this.f.y());
      if (this.f.bR instanceof cvi $$1) {
         if (!$$1.b(this.f)) {
            h.debug("Player {} interacted with invalid menu {}", this.f, $$1);
            return;
         }

         $$1.a($$0.b());
      }
   }

   @Override
   public void a(aif $$0) {
      zi.a($$0, this, this.f.y());
      if (this.f.bR instanceof cvk $$1) {
         if (!this.f.bR.b(this.f)) {
            h.debug("Player {} interacted with invalid menu {}", this.f, this.f.bR);
            return;
         }

         $$1.a($$0.b(), $$0.e());
      }
   }

   @Override
   public void a(ail $$0) {
      zi.a($$0, this, this.f.y());
      if (this.f.gF()) {
         iv $$1 = $$0.b();
         eat $$2 = this.f.dU().a_($$1);
         if (this.f.dU().c_($$1) instanceof dzk $$4) {
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
               if ($$0.e() == dzk.a.b) {
                  if ($$4.B()) {
                     this.f.a(wy.a("structure_block.save_success", $$5), false);
                  } else {
                     this.f.a(wy.a("structure_block.save_failure", $$5), false);
                  }
               } else if ($$0.e() == dzk.a.c) {
                  if (!$$4.D()) {
                     this.f.a(wy.a("structure_block.load_not_found", $$5), false);
                  } else if ($$4.a(this.f.y())) {
                     this.f.a(wy.a("structure_block.load_success", $$5), false);
                  } else {
                     this.f.a(wy.a("structure_block.load_prepare", $$5), false);
                  }
               } else if ($$0.e() == dzk.a.d) {
                  if ($$4.A()) {
                     this.f.a(wy.a("structure_block.size_success", $$5), false);
                  } else {
                     this.f.a(wy.c("structure_block.size_failure"), false);
                  }
               }
            } else {
               this.f.a(wy.a("structure_block.invalid_structure_name", $$0.g()), false);
            }

            $$4.e();
            this.f.dU().a($$1, $$2, $$2, 3);
         }
      }
   }

   @Override
   public void a(aim $$0) {
      zi.a($$0, this, this.f.y());
      if (this.f.gF()) {
         iv $$1 = $$0.b();
         eat $$2 = this.f.dU().a_($$1);
         if (this.f.dU().c_($$1) instanceof dzl $$4) {
            $$4.a($$0.e());
            $$4.a($$0.f());
            $$4.e();
            this.f.dU().a($$1, $$2, $$4.m(), 3);
         }
      }
   }

   @Override
   public void a(aiq $$0) {
      zi.a($$0, this, this.f.y());
      iv $$1 = $$0.b();
      if (this.f.gF() && this.f.dU().c_($$1) instanceof dzm $$2) {
         if ($$0.e() != aiq.a.b && $$0.e() != aiq.a.a) {
            $$2.a($$0.f());
            if ($$0.e() == aiq.a.d) {
               $$2.a(this.f::a);
            } else if ($$0.e() == aiq.a.e) {
               $$2.b(this.f::a);
            } else if ($$0.e() == aiq.a.f) {
               $$2.c(this.f::a);
            } else if ($$0.e() == aiq.a.g) {
               $$2.d(this.f::a);
            }

            eat $$10 = this.f.dU().a_($$1);
            this.f.dU().a($$1, dmt.a.m(), $$10, 3);
         } else {
            js<sr> $$4 = this.f.dW().f(mh.bh);
            Optional<jf.c<sr>> $$5 = $$0.f().a().flatMap($$4::a);
            wy $$6;
            if ($$5.isPresent()) {
               $$6 = $$5.get().a().c();
            } else {
               $$6 = wy.c("test_instance.description.no_test").a(o.m);
            }

            Optional<ka> $$8;
            if ($$0.e() == aiq.a.b) {
               $$8 = $$0.f().a().flatMap($$0x -> dzm.a(this.f.y(), $$0x));
            } else {
               $$8 = Optional.empty();
            }

            this.e.a(new agd($$6, $$8));
         }
      }
   }

   @Override
   public void a(aik $$0) {
      zi.a($$0, this, this.f.y());
      if (this.f.gF()) {
         iv $$1 = $$0.b();
         eat $$2 = this.f.dU().a_($$1);
         if (this.f.dU().c_($$1) instanceof dyv $$4) {
            $$4.a($$0.e());
            $$4.b($$0.f());
            $$4.a(alf.a(mh.bf, $$0.g()));
            $$4.a($$0.h());
            $$4.a($$0.i());
            $$4.a($$0.k());
            $$4.b($$0.j());
            $$4.e();
            this.f.dU().a($$1, $$2, $$2, 3);
         }
      }
   }

   @Override
   public void a(ahm $$0) {
      zi.a($$0, this, this.f.y());
      if (this.f.gF()) {
         iv $$1 = $$0.b();
         if (this.f.dU().c_($$1) instanceof dyv $$3) {
            $$3.a(this.f.y(), $$0.e(), $$0.f());
         }
      }
   }

   @Override
   public void a(aie $$0) {
      zi.a($$0, this, this.f.y());
      int $$1 = $$0.b();
      if (this.f.bR instanceof cwq $$2) {
         if (!$$2.b(this.f)) {
            h.debug("Player {} interacted with invalid menu {}", this.f, $$2);
            return;
         }

         $$2.e($$1);
         $$2.h($$1);
      }
   }

   @Override
   public void a(ahj $$0) {
      int $$1 = $$0.b();
      if (crl.e($$1) || $$1 == 40) {
         List<String> $$2 = Lists.newArrayList();
         Optional<String> $$3 = $$0.f();
         $$3.ifPresent($$2::add);
         $$2.addAll($$0.e());
         Consumer<List<asj>> $$4 = $$3.isPresent() ? $$1x -> this.a((asj)$$1x.get(0), $$1x.subList(1, $$1x.size()), $$1) : $$1x -> this.a($$1x, $$1);
         this.a($$2).thenAcceptAsync($$4, this.d);
      }
   }

   private void a(List<asj> $$0, int $$1) {
      czn $$2 = this.f.gi().a($$1);
      if ($$2.c(kk.U)) {
         List<asi<String>> $$3 = $$0.stream().map(this::a).toList();
         $$2.b(kk.U, new dcw($$3));
      }
   }

   private void a(asj $$0, List<asj> $$1, int $$2) {
      czn $$3 = this.f.gi().a($$2);
      if ($$3.c(kk.U)) {
         czn $$4 = $$3.a((djl)czr.vj);
         $$4.e(kk.U);
         List<asi<wy>> $$5 = $$1.stream().map($$0x -> this.a($$0x).a(wy::b)).toList();
         $$4.b(kk.V, new dcx(this.a($$0), this.f.ai().getString(), 0, $$5, true));
         this.f.gi().a($$2, $$4);
      }
   }

   private asi<String> a(asj $$0) {
      return this.f.X() ? asi.a($$0.b()) : asi.a($$0);
   }

   @Override
   public void a(ahk $$0) {
      zi.a($$0, this, this.f.y());
      if (this.f.s(2)) {
         bwi $$1 = this.f.dU().a($$0.e());
         if ($$1 != null) {
            tz $$2 = $$1.f(new tz());
            this.f.f.b(new aga($$0.b(), $$2));
         }
      }
   }

   @Override
   public void a(ahh $$0) {
      zi.a($$0, this, this.f.y());
      if (!this.f.V_() && $$0.e() == this.f.bR.l) {
         if (this.f.bR instanceof cvv $$1 && $$1.m() instanceof dyg $$2) {
            $$2.a($$0.b(), $$0.f());
         }
      }
   }

   @Override
   public void a(ags $$0) {
      zi.a($$0, this, this.f.y());
      if (this.f.s(2)) {
         dxr $$1 = this.f.dU().c_($$0.e());
         tz $$2 = $$1 != null ? $$1.d(this.f.dW()) : null;
         this.f.f.b(new aga($$0.b(), $$2));
      }
   }

   @Override
   public void a(aho $$0) {
      zi.a($$0, this, this.f.y());
      if (b($$0.a(0.0), $$0.b(0.0), $$0.c(0.0), $$0.a(0.0F), $$0.b(0.0F))) {
         this.a(wy.c("multiplayer.disconnect.invalid_player_movement"));
      } else {
         arq $$1 = this.f.y();
         if (!this.f.k) {
            if (this.o == 0) {
               this.l();
            }

            if (this.f.gI()) {
               float $$2 = azm.h($$0.a(this.f.dK()));
               float $$3 = azm.h($$0.b(this.f.dM()));
               if (this.p()) {
                  this.f.c($$2, $$3);
               } else {
                  double $$4 = a($$0.a(this.f.dz()));
                  double $$5 = b($$0.b(this.f.dB()));
                  double $$6 = a($$0.c(this.f.dF()));
                  if (this.f.bX()) {
                     this.f.a(this.f.dz(), this.f.dB(), this.f.dF(), $$2, $$3);
                     this.f.y().m().a(this.f);
                  } else {
                     double $$7 = this.f.dz();
                     double $$8 = this.f.dB();
                     double $$9 = this.f.dF();
                     double $$10 = $$4 - this.s;
                     double $$11 = $$5 - this.t;
                     double $$12 = $$6 - this.u;
                     double $$13 = this.f.dx().h();
                     double $$14 = $$10 * $$10 + $$11 * $$11 + $$12 * $$12;
                     if (this.f.fQ()) {
                        if ($$14 > 1.0) {
                           this.a(this.f.dz(), this.f.dB(), this.f.dF(), $$2, $$3);
                        }
                     } else {
                        boolean $$15 = this.f.fI();
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
                                 this.a(this.f.dz(), this.f.dB(), this.f.dF(), this.f.dK(), this.f.dM());
                                 return;
                              }
                           }
                        }

                        fex $$18 = this.f.cQ();
                        $$10 = $$4 - this.v;
                        $$11 = $$5 - this.w;
                        $$12 = $$6 - this.x;
                        boolean $$19 = $$11 > 0.0;
                        if (this.f.aH() && !$$0.b() && $$19) {
                           this.f.s();
                        }

                        boolean $$20 = this.f.R;
                        this.f.a(bxn.b, new ffc($$10, $$11, $$12));
                        $$10 = $$4 - this.f.dz();
                        $$11 = $$5 - this.f.dB();
                        if ($$11 > -0.5 || $$11 < 0.5) {
                           $$11 = 0.0;
                        }

                        $$12 = $$6 - this.f.dF();
                        $$14 = $$10 * $$10 + $$11 * $$11 + $$12 * $$12;
                        boolean $$22 = false;
                        if (!this.f.Q() && $$14 > 0.0625 && !this.f.fQ() && !this.f.h.e() && this.f.h.b() != djj.d) {
                           $$22 = true;
                           h.warn("{} moved wrongly!", this.f.ai().getString());
                        }

                        if (this.f.ad || this.f.fQ() || (!$$22 || !$$1.a(this.f, $$18)) && !this.a($$1, $$18, $$4, $$5, $$6)) {
                           this.f.a($$4, $$5, $$6, $$2, $$3);
                           boolean $$23 = this.f.fu();
                           this.I = $$11 >= -0.03125
                              && !$$20
                              && this.f.h.b() != djj.d
                              && !this.d.ad()
                              && !this.f.gj().c
                              && !this.f.b(bvo.y)
                              && !$$15
                              && !$$23
                              && this.b(this.f);
                           this.f.y().m().a(this.f);
                           ffc $$24 = new ffc(this.f.dz() - $$7, this.f.dB() - $$8, this.f.dF() - $$9);
                           this.f.a($$0.b(), $$0.e(), $$24);
                           this.f.a($$24.d, $$24.e, $$24.f, $$0.b());
                           this.f.b(new ffc($$7, $$8, $$9), this.f.ds());
                           this.a($$24);
                           if ($$19) {
                              this.f.k();
                           }

                           if ($$0.b() || this.f.ef() || this.f.d_() || this.f.V_() || $$15 || $$23) {
                              this.f.gN();
                           }

                           this.f.a(this.f.dz() - $$7, this.f.dB() - $$8, this.f.dF() - $$9);
                           this.v = this.f.dz();
                           this.w = this.f.dB();
                           this.x = this.f.dF();
                        } else {
                           this.a($$7, $$8, $$9, $$2, $$3);
                           this.f.a(this.f.dz() - $$7, this.f.dB() - $$8, this.f.dF() - $$9, $$0.b());
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
         dji $$1 = this.f.y().O();
         return $$1.c(dji.u) ? false : !$$0 || !$$1.c(dji.v);
      }
   }

   private boolean p() {
      if (this.F != null) {
         if (this.o - this.H > 20) {
            this.H = this.o;
            this.a(this.F.d, this.F.e, this.F.f, this.f.dK(), this.f.dM());
         }

         return true;
      } else {
         this.H = this.o;
         return false;
      }
   }

   private boolean a(djp $$0, fex $$1, double $$2, double $$3, double $$4) {
      fex $$5 = this.f.cQ().d($$2 - this.f.dz(), $$3 - this.f.dB(), $$4 - this.f.dF());
      Iterable<ffw> $$6 = $$0.d(this.f, $$5.h(1.0E-5F));
      ffw $$7 = fft.a($$1.h(1.0E-5F));

      for (ffw $$8 : $$6) {
         if (!fft.c($$8, $$7, ffg.i)) {
            return true;
         }
      }

      return false;
   }

   public void a(double $$0, double $$1, double $$2, float $$3, float $$4) {
      this.a(new bxw(new ffc($$0, $$1, $$2), ffc.c, $$3, $$4), Collections.emptySet());
   }

   public void a(bxw $$0, Set<bxx> $$1) {
      this.H = this.o;
      if (++this.G == Integer.MAX_VALUE) {
         this.G = 0;
      }

      this.f.a($$0, $$1);
      this.F = this.f.ds();
      this.f.f.b(aed.a(this.G, $$0, $$1));
   }

   @Override
   public void a(ahv $$0) {
      zi.a($$0, this, this.f.y());
      if (this.f.gI()) {
         iv $$1 = $$0.b();
         this.f.H();
         ahv.a $$2 = $$0.f();
         switch ($$2) {
            case g:
               if (!this.f.V_()) {
                  czn $$3 = this.f.b(buf.b);
                  this.f.a(buf.b, this.f.b(buf.a));
                  this.f.a(buf.a, $$3);
                  this.f.fE();
               }

               return;
            case e:
               if (!this.f.V_()) {
                  this.f.a(false);
               }

               return;
            case d:
               if (!this.f.V_()) {
                  this.f.a(true);
               }

               return;
            case f:
               this.f.fD();
               return;
            case a:
            case b:
            case c:
               this.f.h.a($$1, $$2, $$0.e(), this.f.dU().ao(), $$0.g());
               this.f.f.a($$0.g());
               return;
            default:
               throw new IllegalArgumentException("Invalid player action");
         }
      }
   }

   private static boolean a(arr $$0, czn $$1) {
      if ($$1.f()) {
         return false;
      } else {
         czj $$2 = $$1.h();
         return ($$2 instanceof cxv || $$2 instanceof cyb) && !$$0.gE().a($$1);
      }
   }

   @Override
   public void a(air $$0) {
      zi.a($$0, this, this.f.y());
      if (this.f.gI()) {
         this.f.f.a($$0.f());
         arq $$1 = this.f.y();
         buf $$2 = $$0.b();
         czn $$3 = this.f.b($$2);
         if ($$3.a($$1.K())) {
            fey $$4 = $$0.e();
            ffc $$5 = $$4.g();
            iv $$6 = $$4.b();
            if (this.f.a($$6, 1.0)) {
               ffc $$7 = $$5.d(ffc.b($$6));
               double $$8 = 1.0000001;
               if (Math.abs($$7.a()) < 1.0000001 && Math.abs($$7.b()) < 1.0000001 && Math.abs($$7.c()) < 1.0000001) {
                  jb $$9 = $$4.c();
                  this.f.H();
                  int $$10 = this.f.dU().ao();
                  if ($$6.v() <= $$10) {
                     if (this.F == null && $$1.a(this.f, $$6)) {
                        bug $$11 = this.f.h.a(this.f, $$1, $$3, $$2, $$4);
                        if ($$11.a()) {
                           aq.P.a(this.f, $$4.b(), $$3.v());
                        }

                        if ($$9 == jb.b && !$$11.a() && $$6.v() >= $$10 && a(this.f, $$3)) {
                           wy $$12 = wy.a("build.tooHigh", $$10).a(o.m);
                           this.f.b($$12, true);
                        } else if ($$11 instanceof bug.d $$13 && $$13.e() == bug.e.c) {
                           this.f.a($$2, true);
                        }
                     }
                  } else {
                     wy $$14 = wy.a("build.tooHigh", $$10).a(o.m);
                     this.f.b($$14, true);
                  }

                  this.f.f.b(new acc($$1, $$6));
                  this.f.f.b(new acc($$1, $$6.a($$9)));
               } else {
                  h.warn("Rejecting UseItemOnPacket from {}: Location {} too far away from hit block {}.", new Object[]{this.f.gh().getName(), $$5, $$6});
               }
            }
         }
      }
   }

   @Override
   public void a(ais $$0) {
      zi.a($$0, this, this.f.y());
      if (this.f.gI()) {
         this.a($$0.e());
         arq $$1 = this.f.y();
         buf $$2 = $$0.b();
         czn $$3 = this.f.b($$2);
         this.f.H();
         if (!$$3.f() && $$3.a($$1.K())) {
            float $$4 = azm.h($$0.f());
            float $$5 = azm.h($$0.g());
            if ($$5 != this.f.dM() || $$4 != this.f.dK()) {
               this.f.c($$4, $$5);
            }

            if (this.f.h.a(this.f, $$1, $$3, $$2) instanceof bug.d $$7 && $$7.e() == bug.e.c) {
               this.f.a($$2, true);
            }
         }
      }
   }

   @Override
   public void a(aip $$0) {
      zi.a($$0, this, this.f.y());
      if (this.f.V_()) {
         for (arq $$1 : this.d.L()) {
            bwi $$2 = $$0.a($$1);
            if ($$2 != null) {
               this.f.a($$1, $$2.dz(), $$2.dB(), $$2.dF(), Set.of(), $$2.dK(), $$2.dM(), true);
               return;
            }
         }
      }
   }

   @Override
   public void a(ahq $$0) {
      zi.a($$0, this, this.f.y());
      if (this.f.dk() instanceof ctx $$2) {
         $$2.a($$0.b(), $$0.e());
      }
   }

   @Override
   public void a(vt $$0) {
      h.info("{} lost connection: {}", this.f.ai().getString(), $$0.a().getString());
      this.q();
      super.a($$0);
   }

   private void q() {
      this.T.close();
      this.d.av();
      this.d.ag().a(wy.a("multiplayer.player.left", this.f.m_()).a(o.o), false);
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
   public void a(aig $$0) {
      zi.a($$0, this, this.f.y());
      if ($$0.b() >= 0 && $$0.b() < crl.h()) {
         if (this.f.gi().f() != $$0.b() && this.f.fz() == buf.a) {
            this.f.fE();
         }

         this.f.gi().c($$0.b());
         this.f.H();
      } else {
         h.warn("{} tried to set an invalid carried item", this.f.ai().getString());
      }
   }

   @Override
   public void a(agx $$0) {
      Optional<xf> $$1 = this.a($$0.h());
      if (!$$1.isEmpty()) {
         this.a($$0.b(), () -> {
            xo $$2;
            try {
               $$2 = this.a($$0, $$1.get());
            } catch (xs.a var6) {
               this.a(var6);
               return;
            }

            CompletableFuture<asj> $$5 = this.a($$2.c());
            wy $$6 = this.d.bk().decorate(this.f, $$2.d());
            this.T.append($$5, $$2x -> {
               xo $$3 = $$2.a($$6).a($$2x.e());
               this.b($$3);
            });
         });
      }
   }

   @Override
   public void a(agv $$0) {
      this.a($$0.b(), () -> {
         this.b($$0.b());
         this.r();
      });
   }

   private void b(String $$0) {
      ParseResults<ej> $$1 = this.c($$0);
      if (this.d.aA() && xq.a($$1)) {
         h.error("Received unsigned command packet from {}, but the command requires signable arguments: {}", this.f.gh().getName(), $$0);
         this.f.a(m);
      } else {
         this.d.aG().a($$1, $$0);
      }
   }

   @Override
   public void a(agw $$0) {
      Optional<xf> $$1 = this.a($$0.h());
      if (!$$1.isEmpty()) {
         this.a($$0.b(), () -> {
            this.a($$0, $$1.get());
            this.r();
         });
      }
   }

   private void a(agw $$0, xf $$1) {
      ParseResults<ej> $$2 = this.c($$0.b());

      Map<String, xo> $$3;
      try {
         $$3 = this.a($$0, xq.b($$2), $$1);
      } catch (xs.a var6) {
         this.a(var6);
         return;
      }

      eh $$6 = new eh.a($$3);
      $$2 = ek.a($$2, $$1x -> $$1x.a($$6, this.T));
      this.d.aG().a($$2, $$0.b());
   }

   private void a(xs.a $$0) {
      h.warn("Failed to update secure chat state for {}: '{}'", this.f.gh().getName(), $$0.a().getString());
      this.f.a($$0.a().f().a(o.m));
   }

   private <S> Map<String, xo> a(agw $$0, xq<S> $$1, xf $$2) throws xs.a {
      List<eq.a> $$3 = $$0.g().a();
      List<xq.a<S>> $$4 = $$1.a();
      if ($$3.isEmpty()) {
         return this.b($$4);
      } else {
         Map<String, xo> $$5 = new Object2ObjectOpenHashMap();

         for (eq.a $$6 : $$3) {
            xq.a<S> $$7 = $$1.a($$6.a());
            if ($$7 == null) {
               this.Q.setChainBroken();
               throw a($$0.b(), $$3, $$4);
            }

            xr $$8 = new xr($$7.c(), $$0.e(), $$0.f(), $$2);
            $$5.put($$7.a(), this.Q.unpack($$6.b(), $$8));
         }

         for (xq.a<S> $$9 : $$4) {
            if (!$$5.containsKey($$9.a())) {
               throw a($$0.b(), $$3, $$4);
            }
         }

         return $$5;
      }
   }

   private <S> Map<String, xo> b(List<xq.a<S>> $$0) throws xs.a {
      Map<String, xo> $$1 = new HashMap<>();

      for (xq.a<S> $$2 : $$0) {
         xr $$3 = xr.a($$2.c());
         $$1.put($$2.a(), this.Q.unpack(null, $$3));
      }

      return $$1;
   }

   private static <S> xs.a a(String $$0, List<eq.a> $$1, List<xq.a<S>> $$2) {
      String $$3 = $$1.stream().map(eq.a::a).collect(Collectors.joining(", "));
      String $$4 = $$2.stream().map(xq.a::a).collect(Collectors.joining(", "));
      h.error("Signed command mismatch between server and client ('{}'): got [{}] from client, but expected [{}]", new Object[]{$$0, $$3, $$4});
      return new xs.a(m);
   }

   private ParseResults<ej> c(String $$0) {
      CommandDispatcher<ej> $$1 = this.d.aG().a();
      return $$1.parse($$0, this.f.A());
   }

   private void a(String $$0, Runnable $$1) {
      if (d($$0)) {
         this.a(wy.c("multiplayer.disconnect.illegal_characters"));
      } else if (this.f.E() == crj.c) {
         this.b(new afy(wy.c("chat.disabled.options").a(o.m), false));
      } else {
         this.f.H();
         this.d.execute($$1);
      }
   }

   private Optional<xf> a(xf.b $$0) {
      synchronized (this.R) {
         Optional<xf> $$1 = this.R.a($$0);
         if ($$1.isEmpty()) {
            h.warn("Failed to validate message acknowledgements from {}", this.f.ai().getString());
            this.a(l);
         }

         return $$1;
      }
   }

   private static boolean d(String $$0) {
      for (int $$1 = 0; $$1 < $$0.length(); $$1++) {
         if (!bal.a($$0.charAt($$1))) {
            return true;
         }
      }

      return false;
   }

   private xo a(agx $$0, xf $$1) throws xs.a {
      xr $$2 = new xr($$0.b(), $$0.e(), $$0.f(), $$1);
      return this.Q.unpack($$0.g(), $$2);
   }

   private void b(xo $$0) {
      this.d.ag().a($$0, this.f, wu.a(wu.e, this.f));
      this.r();
   }

   private void r() {
      this.q.a();
      if (!this.q.c() && !this.d.ag().f(this.f.gh()) && !this.d.a(this.f.gh())) {
         this.a(wy.c("disconnect.spam"));
      }
   }

   @Override
   public void a(agu $$0) {
      synchronized (this.R) {
         if (!this.R.a($$0.b())) {
            h.warn("Failed to validate message acknowledgements from {}", this.f.ai().getString());
            this.a(l);
         }
      }
   }

   @Override
   public void a(aio $$0) {
      zi.a($$0, this, this.f.y());
      this.f.H();
      this.f.a($$0.b());
   }

   @Override
   public void a(ahw $$0) {
      zi.a($$0, this, this.f.y());
      if (this.f.gI()) {
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
               if (this.f.fQ()) {
                  this.f.a(false, true);
                  this.F = this.f.ds();
               }
               break;
            case f:
               if (this.f.dk() instanceof bxt $$1) {
                  int $$2 = $$0.f();
                  if ($$1.a() && $$2 > 0) {
                     $$1.c($$2);
                  }
               }
               break;
            case g:
               if (this.f.dk() instanceof bxt $$3) {
                  $$3.b();
               }
               break;
            case h:
               if (this.f.dj() instanceof bwz $$4) {
                  $$4.b(this.f);
               }
               break;
            case i:
               if (!this.f.gp()) {
                  this.f.fl();
               }
               break;
            default:
               throw new IllegalArgumentException("Invalid client command!");
         }
      }
   }

   public void a(xo $$0) {
      xk $$1 = $$0.l();
      if ($$1 != null) {
         this.S.a($$0.m(), $$0.l());
         int $$2;
         synchronized (this.R) {
            this.R.a($$1);
            $$2 = this.R.a();
         }

         if ($$2 > 4096) {
            this.a(wy.c("multiplayer.disconnect.too_many_pending_chats"));
         }
      }
   }

   public void a(xo $$0, wu.a $$1) {
      this.b(new adw($$0.k().c(), $$0.k().b(), $$0.l(), $$0.m().a(this.S), $$0.n(), $$0.o(), $$1));
      this.a($$0);
   }

   public void a(wy $$0, wu.a $$1) {
      this.b(new acw($$0, $$1));
   }

   public SocketAddress m() {
      return this.e.d();
   }

   public void n() {
      this.U = true;
      this.q();
      this.b(afw.a);
      this.e.a(abj.d);
   }

   @Override
   public void a(ajz $$0) {
      this.e.a(new ajw($$0.b()));
   }

   @Override
   public void a(ahl $$0) {
      zi.a($$0, this, this.f.y());
      if (this.f.gI()) {
         final arq $$1 = this.f.y();
         final bwi $$2 = $$0.a($$1);
         this.f.H();
         this.f.g($$0.b());
         if ($$2 != null) {
            if (!$$1.A_().a($$2.du())) {
               return;
            }

            fex $$3 = $$2.cQ();
            if (this.f.a($$3, 3.0)) {
               $$0.a(new ahl.c() {
                  private void a(buf $$0, ast.a $$1x) {
                     czn $$2 = ast.this.f.b($$0);
                     if ($$2.a($$1.K())) {
                        czn $$3 = $$2.v();
                        if ($$1.run(ast.this.f, $$2, $$0) instanceof bug.d $$5) {
                           czn $$6 = $$5.c() ? $$3 : czn.k;
                           aq.T.a(ast.this.f, $$6, $$2);
                           if ($$5.e() == bug.e.c) {
                              ast.this.f.a($$0, true);
                           }
                        }
                     }
                  }

                  @Override
                  public void a(buf $$0) {
                     this.a($$0, crm::a);
                  }

                  @Override
                  public void a(buf $$0, ffc $$1x) {
                     this.a($$0, ($$1xxx, $$2xx, $$3) -> $$2xx.a($$1xxx, $$1, $$3));
                  }

                  @Override
                  public void a() {
                     label23:
                     if (!($$2 instanceof cnr) && !($$2 instanceof bww) && $$2 != ast.this.f) {
                        if ($$2 instanceof cru $$0 && !$$0.cA()) {
                           break label23;
                        }

                        czn $$1 = ast.this.f.b(buf.a);
                        if (!$$1.a($$1.K())) {
                           return;
                        }

                        ast.this.f.e($$2);
                        return;
                     }

                     ast.this.a(wy.c("multiplayer.disconnect.invalid_entity_attacked"));
                     ast.h.warn("Player {} tried to attack an invalid entity", ast.this.f.ai().getString());
                  }
               });
            }
         }
      }
   }

   @Override
   public void a(aha $$0) {
      zi.a($$0, this, this.f.y());
      this.f.H();
      aha.a $$1 = $$0.b();
      switch ($$1) {
         case a:
            if (this.f.k) {
               this.f.k = false;
               this.f = this.d.ag().a(this.f, true, bwi.d.e);
               this.l();
               aq.w.a(this.f, djm.k, djm.i);
            } else {
               if (this.f.eF() > 0.0F) {
                  return;
               }

               this.f = this.d.ag().a(this.f, false, bwi.d.a);
               this.l();
               if (this.d.r_()) {
                  this.f.a(djj.d);
                  this.f.y().O().b(dji.s).a(false, this.d);
               }
            }
            break;
         case b:
            this.f.I().a(this.f);
      }
   }

   @Override
   public void a(ahg $$0) {
      zi.a($$0, this, this.f.y());
      this.f.q();
   }

   @Override
   public void a(ahf $$0) {
      zi.a($$0, this, this.f.y());
      this.f.H();
      if (this.f.bR.l == $$0.b()) {
         if (this.f.V_()) {
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
                  Entry<czn> $$3 = (Entry<czn>)var4.next();
                  this.f.bR.b($$3.getIntKey(), (czn)$$3.getValue());
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
   public void a(aht $$0) {
      zi.a($$0, this, this.f.y());
      this.f.H();
      if (!this.f.V_() && this.f.bR.l == $$0.b()) {
         if (!this.f.bR.b(this.f)) {
            h.debug("Player {} interacted with invalid menu {}", this.f, this.f.bR);
         } else {
            del.d $$1 = this.d.aI().a($$0.e());
            if ($$1 != null) {
               dej<?> $$2 = $$1.b();
               if (this.f.J().b($$2.a())) {
                  if (this.f.bR instanceof cwu $$3) {
                     if ($$2.b().al_().c()) {
                        h.debug("Player {} tried to place impossible recipe {}", this.f, $$2.a().a());
                        return;
                     }

                     cwu.a $$4 = $$3.a($$0.f(), this.f.b(), $$2, this.f.y(), this.f.gi());
                     if ($$4 == cwu.a.b) {
                        this.f.f.b(new adu(this.f.bR.l, $$1.a().b()));
                     }
                  }
               }
            }
         }
      }
   }

   @Override
   public void a(ahe $$0) {
      zi.a($$0, this, this.f.y());
      this.f.H();
      if (this.f.bR.l == $$0.b() && !this.f.V_()) {
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
   public void a(aij $$0) {
      zi.a($$0, this, this.f.y());
      if (this.f.fU()) {
         boolean $$1 = $$0.b() < 0;
         czn $$2 = $$0.e();
         if (!$$2.a(this.f.dU().K())) {
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
   public void a(ain $$0) {
      List<String> $$1 = Stream.of($$0.f()).map(o::a).collect(Collectors.toList());
      this.a($$1).thenAcceptAsync($$1x -> this.a($$0, $$1x), this.d);
   }

   private void a(ain $$0, List<asj> $$1) {
      this.f.H();
      arq $$2 = this.f.y();
      iv $$3 = $$0.b();
      if ($$2.C($$3)) {
         if (!($$2.c_($$3) instanceof dzf $$5)) {
            return;
         }

         $$5.a(this.f, $$0.e(), $$1);
      }
   }

   @Override
   public void a(ahu $$0) {
      zi.a($$0, this, this.f.y());
      this.f.gj().b = $$0.b() && this.f.gj().c;
   }

   @Override
   public void a(zz $$0) {
      zi.a($$0, this, this.f.y());
      boolean $$1 = this.f.a(cro.g);
      this.f.a($$0.b());
      if (this.f.a(cro.g) != $$1) {
         this.d.ag().a(new aeb(aeb.a.h, this.f));
      }
   }

   @Override
   public void a(agt $$0) {
      zi.a($$0, this, this.f.y());
      if (this.f.s(2) || this.h()) {
         this.d.a($$0.b(), false);
      }
   }

   @Override
   public void a(ahn $$0) {
      zi.a($$0, this, this.f.y());
      if (this.f.s(2) || this.h()) {
         this.d.b($$0.b());
      }
   }

   @Override
   public void a(agy $$0) {
      zi.a($$0, this, this.f.y());
      xp.a $$1 = $$0.b();
      crq.a $$2 = this.P != null ? this.P.d().b() : null;
      crq.a $$3 = $$1.b();
      if (!Objects.equals($$2, $$3)) {
         if ($$2 != null && $$3.b().isBefore($$2.b())) {
            this.a(crq.a);
         } else {
            try {
               bab $$4 = this.d.ar();
               if ($$4 == null) {
                  h.warn("Ignoring chat session from {} due to missing Services public key", this.f.gh().getName());
                  return;
               }

               this.a($$1.a(this.f.gh(), $$4));
            } catch (crq.b var6) {
               h.error("Failed to validate profile key: {}", var6.getMessage());
               this.a(var6.a());
            }
         }
      }
   }

   @Override
   public void a(ahd $$0) {
      if (!this.U) {
         throw new IllegalStateException("Client acknowledged config, but none was requested");
      } else {
         this.e.a(abj.b, new asr(this.d, this.e, this.a(this.f.C())));
      }
   }

   @Override
   public void a(agz $$0) {
      zi.a($$0, this, this.f.y());
      this.g.a($$0.b());
   }

   @Override
   public void a(ahi $$0) {
      zi.a($$0, this, this.f.y());
      this.d.a(this.f, $$0.b());
   }

   private void a(xp $$0) {
      this.P = $$0;
      this.Q = $$0.a(this.f.cF());
      this.T.append(() -> {
         this.f.a($$0);
         this.d.ag().a(new aeb(EnumSet.of(aeb.a.b), List.of(this.f)));
      });
   }

   @Override
   public void a(aaa $$0) {
   }

   @Override
   public void a(ahb $$0) {
      zi.a($$0, this, this.f.y());
      if (!this.O) {
         this.f.a(ffc.c);
      }

      this.O = false;
   }

   private void a(ffc $$0) {
      if ($$0.h() > 1.0E-5F) {
         this.f.H();
      }

      this.f.a($$0);
      this.O = true;
   }

   @Override
   public arr o() {
      return this.f;
   }

   @FunctionalInterface
   interface a {
      bug run(arr var1, bwi var2, buf var3);
   }
}
