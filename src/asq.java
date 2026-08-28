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

public class asq extends asn implements agm, ast, wj {
   static final Logger h = LogUtils.getLogger();
   private static final int i = -1;
   private static final int j = 4096;
   private static final int k = 80;
   private static final wv l = wv.c("multiplayer.disconnect.chat_validation_failed");
   private static final wv m = wv.c("chat.disabled.invalid_command_signature").a(n.m);
   private static final int n = 1000;
   public aro f;
   public final asl g;
   private int o;
   private int p = -1;
   private final bak q = new bak(20, 200);
   private final bak r = new bak(20, 1480);
   private double s;
   private double t;
   private double u;
   private double v;
   private double w;
   private double x;
   @Nullable
   private bvs y;
   private double z;
   private double A;
   private double B;
   private double C;
   private double D;
   private double E;
   @Nullable
   private fcu F;
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
   private xm P;
   private xp.b Q;
   private final xe R = new xe(20);
   private final xi S = xi.a();
   private final ayy T;
   private boolean U;

   public asq(MinecraftServer $$0, vo $$1, aro $$2, asd $$3) {
      super($$0, $$1, $$3);
      this.g = new asl($$1.e());
      this.f = $$2;
      $$2.f = this;
      $$2.Z().a();
      this.Q = xp.b.unsigned($$2.cG(), $$0::aA);
      this.T = new ayy($$0);
   }

   @Override
   public void d() {
      if (this.p > -1) {
         this.b(new abv(this.p));
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
      if (this.I && !this.f.fQ() && !this.f.bZ() && !this.f.eG()) {
         if (++this.J > this.a((bvs)this.f)) {
            h.warn("{} was kicked for floating too long!", this.f.al().getString());
            this.a(wv.c("multiplayer.disconnect.flying"));
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
               h.warn("{} was kicked for floating a vehicle too long!", this.f.al().getString());
               this.a(wv.c("multiplayer.disconnect.flying"));
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
      if (this.f.N() > 0L && this.d.ap() > 0 && af.c() - this.f.N() > (long)this.d.ap() * 1000L * 60L) {
         this.a(wv.c("multiplayer.disconnect.idling"));
      }
   }

   private int a(bvs $$0) {
      double $$1 = $$0.be();
      if ($$1 < 1.0E-5F) {
         return Integer.MAX_VALUE;
      } else {
         double $$2 = 0.08 / $$1;
         return azk.c(80.0 * Math.max($$2, 1.0));
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
   public boolean a(zc<?> $$0) {
      return super.a($$0) ? true : this.U && this.e.i() && $$0 instanceof aha;
   }

   @Override
   protected GameProfile i() {
      return this.f.gh();
   }

   private <T, R> CompletableFuture<R> a(T $$0, BiFunction<asw, T, CompletableFuture<R>> $$1) {
      return $$1.apply(this.f.Z(), $$0).thenApply($$0x -> {
         if (!this.c()) {
            h.debug("Ignoring packet due to disconnection");
            throw new CancellationException("disconnected");
         } else {
            return (R)$$0x;
         }
      });
   }

   private CompletableFuture<asg> a(String $$0) {
      return this.a($$0, asw::a);
   }

   private CompletableFuture<List<asg>> a(List<String> $$0) {
      return this.a($$0, asw::a);
   }

   @Override
   public void a(ahu $$0) {
      zf.a($$0, this, this.f.y());
      this.f.a($$0.b());
   }

   private static boolean b(double $$0, double $$1, double $$2, float $$3, float $$4) {
      return Double.isNaN($$0) || Double.isNaN($$1) || Double.isNaN($$2) || !Floats.isFinite($$4) || !Floats.isFinite($$3);
   }

   private static double a(double $$0) {
      return azk.a($$0, -3.0E7, 3.0E7);
   }

   private static double b(double $$0) {
      return azk.a($$0, -2.0E7, 2.0E7);
   }

   @Override
   public void a(ahm $$0) {
      zf.a($$0, this, this.f.y());
      if (b($$0.b().a(), $$0.b().b(), $$0.b().c(), $$0.e(), $$0.f())) {
         this.a(wv.c("multiplayer.disconnect.invalid_vehicle_movement"));
      } else if (!this.p() && this.f.gI()) {
         bvs $$1 = this.f.df();
         if ($$1 != this.f && $$1.cW() == this.f && $$1 == this.y) {
            arn $$2 = this.f.y();
            double $$3 = $$1.dA();
            double $$4 = $$1.dC();
            double $$5 = $$1.dG();
            double $$6 = a($$0.b().a());
            double $$7 = b($$0.b().b());
            double $$8 = a($$0.b().c());
            float $$9 = azk.h($$0.e());
            float $$10 = azk.h($$0.f());
            double $$11 = $$6 - this.z;
            double $$12 = $$7 - this.A;
            double $$13 = $$8 - this.B;
            double $$14 = $$1.dy().h();
            double $$15 = $$11 * $$11 + $$12 * $$12 + $$13 * $$13;
            if ($$15 - $$14 > 100.0 && !this.h()) {
               h.warn("{} (vehicle of {}) moved too quickly! {},{},{}", new Object[]{$$1.al().getString(), this.f.al().getString(), $$11, $$12, $$13});
               this.b(adn.a($$1));
               return;
            }

            boolean $$16 = $$2.a($$1, $$1.cR().h(0.0625));
            $$11 = $$6 - this.C;
            $$12 = $$7 - this.D;
            $$13 = $$8 - this.E;
            boolean $$17 = $$1.R;
            if ($$1 instanceof bwr $$18 && $$18.d_()) {
               $$18.k();
            }

            $$1.a(bwv.b, new fcu($$11, $$12, $$13));
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
               h.warn("{} (vehicle of {}) moved wrongly! {}", new Object[]{$$1.al().getString(), this.f.al().getString(), Math.sqrt($$15)});
            }

            $$1.a($$6, $$7, $$8, $$9, $$10);
            boolean $$21 = $$2.a($$1, $$1.cR().h(0.0625));
            if ($$16 && ($$20 || !$$21)) {
               $$1.a($$3, $$4, $$5, $$9, $$10);
               this.b(adn.a($$1));
               return;
            }

            this.f.y().m().a(this.f);
            $$1.b(new fcu($$3, $$4, $$5), $$1.dt());
            fcu $$22 = new fcu($$1.dA() - $$3, $$1.dC() - $$4, $$1.dG() - $$5);
            this.a($$22);
            $$1.a($$0.g(), $$22);
            $$1.a($$22.d, $$22.e, $$22.f, $$0.g());
            this.f.b($$22.d, $$22.e, $$22.f);
            this.K = $$12 >= -0.03125 && !$$17 && !this.d.ad() && !$$1.bc() && this.b($$1);
            this.C = $$1.dA();
            this.D = $$1.dC();
            this.E = $$1.dG();
         }
      }
   }

   private boolean b(bvs $$0) {
      return $$0.dV().a($$0.cR().g(0.0625).b(0.0, -0.55, 0.0)).allMatch(dyl.a::l);
   }

   @Override
   public void a(ago $$0) {
      zf.a($$0, this, this.f.y());
      if ($$0.b() == this.G) {
         if (this.F == null) {
            this.a(wv.c("multiplayer.disconnect.invalid_player_movement"));
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
   public void a(ahv $$0) {
      zf.a($$0, this, this.f.y());
      this.f.v(true);
   }

   @Override
   public void a(ahx $$0) {
      zf.a($$0, this, this.f.y());
      dcs.d $$1 = this.d.aI().a($$0.b());
      if ($$1 != null) {
         this.f.J().d($$1.b().a());
      }
   }

   @Override
   public void a(aia $$0) {
      zf.a($$0, this, this.f.y());
      this.f.bP.a($$0.b(), $$0.e());
   }

   @Override
   public void a(ahw $$0) {
      zf.a($$0, this, this.f.y());
      this.f.J().a($$0.b(), $$0.e(), $$0.f());
   }

   @Override
   public void a(ahz $$0) {
      zf.a($$0, this, this.f.y());
      if ($$0.e() == ahz.a.a) {
         ald $$1 = Objects.requireNonNull($$0.f());
         ai $$2 = this.d.aD().a($$1);
         if ($$2 != null) {
            this.f.S().a($$2);
         }
      }
   }

   @Override
   public void a(agz $$0) {
      zf.a($$0, this, this.f.y());
      StringReader $$1 = new StringReader($$0.e());
      if ($$1.canRead() && $$1.peek() == '/') {
         $$1.skip();
      }

      ParseResults<ex> $$2 = this.d.aG().a().parse($$1, this.f.A());
      this.d.aG().a().getCompletionSuggestions($$2).thenAccept($$1x -> {
         Suggestions $$2x = $$1x.getList().size() <= 1000 ? $$1x : new Suggestions($$1x.getRange(), $$1x.getList().subList(0, 1000));
         this.b(new aci($$0.b(), $$2x));
      });
   }

   @Override
   public void a(aie $$0) {
      zf.a($$0, this, this.f.y());
      if (!this.d.q()) {
         this.f.a(wv.c("advMode.notEnabled"));
      } else if (!this.f.gF()) {
         this.f.a(wv.c("advMode.notAllowed"));
      } else {
         dgq $$1 = null;
         dvw $$2 = null;
         jj $$3 = $$0.b();
         dvl $$4 = this.f.dV().c_($$3);
         if ($$4 instanceof dvw) {
            $$2 = (dvw)$$4;
            $$1 = $$2.a();
         }

         String $$5 = $$0.e();
         boolean $$6 = $$0.f();
         if ($$1 != null) {
            dvw.a $$7 = $$2.s();
            dym $$8 = this.f.dV().a_($$3);
            jo $$9 = $$8.c(dmd.b);

            dym $$10 = switch ($$0.i()) {
               case a -> dkw.lj.m();
               case b -> dkw.li.m();
               default -> dkw.gi.m();
            };
            dym $$11 = $$10.b(dmd.b, $$9).b(dmd.c, Boolean.valueOf($$0.g()));
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
            if (!bah.b($$5)) {
               this.f.a(wv.a("advMode.setCommand.success", $$5));
            }
         }
      }
   }

   @Override
   public void a(aif $$0) {
      zf.a($$0, this, this.f.y());
      if (!this.d.q()) {
         this.f.a(wv.c("advMode.notEnabled"));
      } else if (!this.f.gF()) {
         this.f.a(wv.c("advMode.notAllowed"));
      } else {
         dgq $$1 = $$0.a(this.f.dV());
         if ($$1 != null) {
            $$1.a($$0.b());
            $$1.a($$0.e());
            if (!$$0.e()) {
               $$1.c(null);
            }

            $$1.f();
            this.f.a(wv.a("advMode.setCommand.success", $$0.b()));
         }
      }
   }

   @Override
   public void a(aho $$0) {
      arn $$1 = this.f.y();
      zf.a($$0, this, $$1);
      jj $$2 = $$0.b();
      if (this.f.a($$2, 1.0)) {
         if ($$1.p($$2)) {
            dym $$3 = $$1.a_($$2);
            boolean $$4 = this.f.fU() && $$0.e();
            cxy $$5 = $$3.a((dhs)$$1, $$2, $$4);
            if (!$$5.f()) {
               if ($$4) {
                  a($$3, $$1, $$2, $$5);
               }

               this.a($$5);
            }
         }
      }
   }

   private static void a(dym $$0, arn $$1, jj $$2, cxy $$3) {
      dvl $$4 = $$0.x() ? $$1.c_($$2) : null;
      if ($$4 != null) {
         tw $$5 = $$4.e($$1.F_());
         $$4.a($$5);
         cwf.a($$3, $$4.p(), $$5);
         $$3.b($$4.q());
      }
   }

   @Override
   public void a(ahp $$0) {
      arn $$1 = this.f.y();
      zf.a($$0, this, $$1);
      bvs $$2 = $$1.b($$0.b());
      if ($$2 != null && this.f.b($$2, 3.0)) {
         cxy $$3 = $$2.dI();
         if ($$3 != null && !$$3.f()) {
            this.a($$3);
         }
      }
   }

   private void a(cxy $$0) {
      if ($$0.a(this.f.dV().K())) {
         cqh $$1 = this.f.gi();
         int $$2 = $$1.c($$0);
         if ($$2 != -1) {
            if (cqh.d($$2)) {
               $$1.j = $$2;
            } else {
               $$1.c($$2);
            }
         } else if (this.f.fU()) {
            $$1.b($$0);
         }

         this.f.f.b(new afg($$1.j));
         this.f.bO.d();
      }
   }

   @Override
   public void a(ahy $$0) {
      zf.a($$0, this, this.f.y());
      if (this.f.bP instanceof ctq $$1) {
         if (!$$1.b(this.f)) {
            h.debug("Player {} interacted with invalid menu {}", this.f, $$1);
            return;
         }

         $$1.a($$0.b());
      }
   }

   @Override
   public void a(aic $$0) {
      zf.a($$0, this, this.f.y());
      if (this.f.bP instanceof cts $$1) {
         if (!this.f.bP.b(this.f)) {
            h.debug("Player {} interacted with invalid menu {}", this.f, this.f.bP);
            return;
         }

         $$1.a($$0.b(), $$0.e());
      }
   }

   @Override
   public void a(aii $$0) {
      zf.a($$0, this, this.f.y());
      if (this.f.gF()) {
         jj $$1 = $$0.b();
         dym $$2 = this.f.dV().a_($$1);
         if (this.f.dV().c_($$1) instanceof dxe $$4) {
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
               if ($$0.e() == dxe.a.b) {
                  if ($$4.B()) {
                     this.f.a(wv.a("structure_block.save_success", $$5), false);
                  } else {
                     this.f.a(wv.a("structure_block.save_failure", $$5), false);
                  }
               } else if ($$0.e() == dxe.a.c) {
                  if (!$$4.D()) {
                     this.f.a(wv.a("structure_block.load_not_found", $$5), false);
                  } else if ($$4.a(this.f.y())) {
                     this.f.a(wv.a("structure_block.load_success", $$5), false);
                  } else {
                     this.f.a(wv.a("structure_block.load_prepare", $$5), false);
                  }
               } else if ($$0.e() == dxe.a.d) {
                  if ($$4.A()) {
                     this.f.a(wv.a("structure_block.size_success", $$5), false);
                  } else {
                     this.f.a(wv.c("structure_block.size_failure"), false);
                  }
               }
            } else {
               this.f.a(wv.a("structure_block.invalid_structure_name", $$0.g()), false);
            }

            $$4.e();
            this.f.dV().a($$1, $$2, $$2, 3);
         }
      }
   }

   @Override
   public void a(aij $$0) {
      zf.a($$0, this, this.f.y());
      if (this.f.gF()) {
         jj $$1 = $$0.b();
         dym $$2 = this.f.dV().a_($$1);
         if (this.f.dV().c_($$1) instanceof dxf $$4) {
            $$4.a($$0.e());
            $$4.a($$0.f());
            $$4.e();
            this.f.dV().a($$1, $$2, $$4.m(), 3);
         }
      }
   }

   @Override
   public void a(ain $$0) {
      zf.a($$0, this, this.f.y());
      jj $$1 = $$0.b();
      if (this.f.gF() && this.f.dV().c_($$1) instanceof dxg $$2) {
         if ($$0.e() != ain.a.b && $$0.e() != ain.a.a) {
            $$2.a($$0.f());
            if ($$0.e() == ain.a.d) {
               $$2.a(this.f::a);
            } else if ($$0.e() == ain.a.e) {
               $$2.b(this.f::a);
            } else if ($$0.e() == ain.a.f) {
               $$2.c(this.f::a);
            } else if ($$0.e() == ain.a.g) {
               $$2.d(this.f::a);
            }

            dym $$10 = this.f.dV().a_($$1);
            this.f.dV().a($$1, dkw.a.m(), $$10, 3);
         } else {
            kf<sp> $$4 = this.f.dX().f(me.bf);
            Optional<js.c<sp>> $$5 = $$0.f().a().flatMap($$4::a);
            wv $$6;
            if ($$5.isPresent()) {
               $$6 = $$5.get().a().c();
            } else {
               $$6 = wv.c("test_instance.description.no_test").a(n.m);
            }

            Optional<kn> $$8;
            if ($$0.e() == ain.a.b) {
               $$8 = $$0.f().a().flatMap($$0x -> dxg.a(this.f.y(), $$0x));
            } else {
               $$8 = Optional.empty();
            }

            this.e.a(new aga($$6, $$8));
         }
      }
   }

   @Override
   public void a(aih $$0) {
      zf.a($$0, this, this.f.y());
      if (this.f.gF()) {
         jj $$1 = $$0.b();
         dym $$2 = this.f.dV().a_($$1);
         if (this.f.dV().c_($$1) instanceof dwp $$4) {
            $$4.a($$0.e());
            $$4.b($$0.f());
            $$4.a(alc.a(me.bc, $$0.g()));
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
   public void a(ahj $$0) {
      zf.a($$0, this, this.f.y());
      if (this.f.gF()) {
         jj $$1 = $$0.b();
         if (this.f.dV().c_($$1) instanceof dwp $$3) {
            $$3.a(this.f.y(), $$0.e(), $$0.f());
         }
      }
   }

   @Override
   public void a(aib $$0) {
      zf.a($$0, this, this.f.y());
      int $$1 = $$0.b();
      if (this.f.bP instanceof cuy $$2) {
         if (!$$2.b(this.f)) {
            h.debug("Player {} interacted with invalid menu {}", this.f, $$2);
            return;
         }

         $$2.e($$1);
         $$2.h($$1);
      }
   }

   @Override
   public void a(ahg $$0) {
      int $$1 = $$0.b();
      if (cqh.d($$1) || $$1 == 40) {
         List<String> $$2 = Lists.newArrayList();
         Optional<String> $$3 = $$0.f();
         $$3.ifPresent($$2::add);
         $$2.addAll($$0.e());
         Consumer<List<asg>> $$4 = $$3.isPresent() ? $$1x -> this.a((asg)$$1x.get(0), $$1x.subList(1, $$1x.size()), $$1) : $$1x -> this.a($$1x, $$1);
         this.a($$2).thenAcceptAsync($$4, this.d);
      }
   }

   private void a(List<asg> $$0, int $$1) {
      cxy $$2 = this.f.gi().a($$1);
      if ($$2.c(kx.U)) {
         List<asf<String>> $$3 = $$0.stream().map(this::a).toList();
         $$2.b(kx.U, new dbd($$3));
      }
   }

   private void a(asg $$0, List<asg> $$1, int $$2) {
      cxy $$3 = this.f.gi().a($$2);
      if ($$3.c(kx.U)) {
         cxy $$4 = $$3.a((dho)cyc.vc);
         $$4.e(kx.U);
         List<asf<wv>> $$5 = $$1.stream().map($$0x -> this.a($$0x).a(wv::b)).toList();
         $$4.b(kx.V, new dbe(this.a($$0), this.f.al().getString(), 0, $$5, true));
         this.f.gi().a($$2, $$4);
      }
   }

   private asf<String> a(asg $$0) {
      return this.f.aa() ? asf.a($$0.b()) : asf.a($$0);
   }

   @Override
   public void a(ahh $$0) {
      zf.a($$0, this, this.f.y());
      if (this.f.s(2)) {
         bvs $$1 = this.f.dV().a($$0.e());
         if ($$1 != null) {
            tw $$2 = $$1.f(new tw());
            this.f.f.b(new afx($$0.b(), $$2));
         }
      }
   }

   @Override
   public void a(ahe $$0) {
      zf.a($$0, this, this.f.y());
      if (!this.f.U_() && $$0.e() == this.f.bP.l) {
         if (this.f.bP instanceof cud $$1 && $$1.m() instanceof dwa $$2) {
            $$2.a($$0.b(), $$0.f());
         }
      }
   }

   @Override
   public void a(agp $$0) {
      zf.a($$0, this, this.f.y());
      if (this.f.s(2)) {
         dvl $$1 = this.f.dV().c_($$0.e());
         tw $$2 = $$1 != null ? $$1.d(this.f.dX()) : null;
         this.f.f.b(new afx($$0.b(), $$2));
      }
   }

   @Override
   public void a(ahl $$0) {
      zf.a($$0, this, this.f.y());
      if (b($$0.a(0.0), $$0.b(0.0), $$0.c(0.0), $$0.a(0.0F), $$0.b(0.0F))) {
         this.a(wv.c("multiplayer.disconnect.invalid_player_movement"));
      } else {
         arn $$1 = this.f.y();
         if (!this.f.k) {
            if (this.o == 0) {
               this.l();
            }

            if (this.f.gI()) {
               float $$2 = azk.h($$0.a(this.f.dL()));
               float $$3 = azk.h($$0.b(this.f.dN()));
               if (this.p()) {
                  this.f.c($$2, $$3);
               } else {
                  double $$4 = a($$0.a(this.f.dA()));
                  double $$5 = b($$0.b(this.f.dC()));
                  double $$6 = a($$0.c(this.f.dG()));
                  if (this.f.bZ()) {
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
                     if (this.f.fQ()) {
                        if ($$14 > 1.0) {
                           this.a(this.f.dA(), this.f.dC(), this.f.dG(), $$2, $$3);
                        }
                     } else {
                        boolean $$15 = this.f.fI();
                        if ($$1.u().i()) {
                           this.M++;
                           int $$16 = this.M - this.N;
                           if ($$16 > 5) {
                              h.debug("{} is sending move packets too frequently ({} packets since last tick)", this.f.al().getString(), $$16);
                              $$16 = 1;
                           }

                           if (this.a($$15)) {
                              float $$17 = $$15 ? 300.0F : 100.0F;
                              if ($$14 - $$13 > (double)($$17 * (float)$$16)) {
                                 h.warn("{} moved too quickly! {},{},{}", new Object[]{this.f.al().getString(), $$10, $$11, $$12});
                                 this.a(this.f.dA(), this.f.dC(), this.f.dG(), this.f.dL(), this.f.dN());
                                 return;
                              }
                           }
                        }

                        fcp $$18 = this.f.cR();
                        $$10 = $$4 - this.v;
                        $$11 = $$5 - this.w;
                        $$12 = $$6 - this.x;
                        boolean $$19 = $$11 > 0.0;
                        if (this.f.aJ() && !$$0.b() && $$19) {
                           this.f.s();
                        }

                        boolean $$20 = this.f.R;
                        this.f.a(bwv.b, new fcu($$10, $$11, $$12));
                        $$10 = $$4 - this.f.dA();
                        $$11 = $$5 - this.f.dC();
                        if ($$11 > -0.5 || $$11 < 0.5) {
                           $$11 = 0.0;
                        }

                        $$12 = $$6 - this.f.dG();
                        $$14 = $$10 * $$10 + $$11 * $$11 + $$12 * $$12;
                        boolean $$22 = false;
                        if (!this.f.Q() && $$14 > 0.0625 && !this.f.fQ() && !this.f.h.e() && this.f.h.b() != dhm.d) {
                           $$22 = true;
                           h.warn("{} moved wrongly!", this.f.al().getString());
                        }

                        if (this.f.ad || this.f.fQ() || (!$$22 || !$$1.a(this.f, $$18)) && !this.a($$1, $$18, $$4, $$5, $$6)) {
                           this.f.a($$4, $$5, $$6, $$2, $$3);
                           boolean $$23 = this.f.fu();
                           this.I = $$11 >= -0.03125
                              && !$$20
                              && this.f.h.b() != dhm.d
                              && !this.d.ad()
                              && !this.f.gj().c
                              && !this.f.b(buy.y)
                              && !$$15
                              && !$$23
                              && this.b(this.f);
                           this.f.y().m().a(this.f);
                           fcu $$24 = new fcu(this.f.dA() - $$7, this.f.dC() - $$8, this.f.dG() - $$9);
                           this.f.a($$0.b(), $$0.e(), $$24);
                           this.f.a($$24.d, $$24.e, $$24.f, $$0.b());
                           this.f.b(new fcu($$7, $$8, $$9), this.f.dt());
                           this.a($$24);
                           if ($$19) {
                              this.f.k();
                           }

                           if ($$0.b() || this.f.ef() || this.f.d_() || this.f.U_() || $$15 || $$23) {
                              this.f.gN();
                           }

                           this.f.b(this.f.dA() - $$7, this.f.dC() - $$8, this.f.dG() - $$9);
                           this.v = this.f.dA();
                           this.w = this.f.dC();
                           this.x = this.f.dG();
                        } else {
                           this.a($$7, $$8, $$9, $$2, $$3);
                           this.f.a(this.f.dA() - $$7, this.f.dC() - $$8, this.f.dG() - $$9, $$0.b());
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
         dhl $$1 = this.f.y().O();
         return $$1.c(dhl.t) ? false : !$$0 || !$$1.c(dhl.u);
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

   private boolean a(dhs $$0, fcp $$1, double $$2, double $$3, double $$4) {
      fcp $$5 = this.f.cR().d($$2 - this.f.dA(), $$3 - this.f.dC(), $$4 - this.f.dG());
      Iterable<fdo> $$6 = $$0.d(this.f, $$5.h(1.0E-5F));
      fdo $$7 = fdl.a($$1.h(1.0E-5F));

      for (fdo $$8 : $$6) {
         if (!fdl.c($$8, $$7, fcy.i)) {
            return true;
         }
      }

      return false;
   }

   public void a(double $$0, double $$1, double $$2, float $$3, float $$4) {
      this.a(new bxe(new fcu($$0, $$1, $$2), fcu.c, $$3, $$4), Collections.emptySet());
   }

   public void a(bxe $$0, Set<bxf> $$1) {
      this.H = this.o;
      if (++this.G == Integer.MAX_VALUE) {
         this.G = 0;
      }

      this.f.a($$0, $$1);
      this.F = this.f.dt();
      this.f.f.b(aea.a(this.G, $$0, $$1));
   }

   @Override
   public void a(ahs $$0) {
      zf.a($$0, this, this.f.y());
      if (this.f.gI()) {
         jj $$1 = $$0.b();
         this.f.H();
         ahs.a $$2 = $$0.f();
         switch ($$2) {
            case g:
               if (!this.f.U_()) {
                  cxy $$3 = this.f.b(btp.b);
                  this.f.a(btp.b, this.f.b(btp.a));
                  this.f.a(btp.a, $$3);
                  this.f.fE();
               }

               return;
            case e:
               if (!this.f.U_()) {
                  this.f.a(false);
               }

               return;
            case d:
               if (!this.f.U_()) {
                  this.f.a(true);
               }

               return;
            case f:
               this.f.fD();
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

   private static boolean a(aro $$0, cxy $$1) {
      if ($$1.f()) {
         return false;
      } else {
         cxu $$2 = $$1.h();
         return ($$2 instanceof cwf || $$2 instanceof cwl) && !$$0.gE().a($$1);
      }
   }

   @Override
   public void a(aio $$0) {
      zf.a($$0, this, this.f.y());
      if (this.f.gI()) {
         this.f.f.a($$0.f());
         arn $$1 = this.f.y();
         btp $$2 = $$0.b();
         cxy $$3 = this.f.b($$2);
         if ($$3.a($$1.K())) {
            fcq $$4 = $$0.e();
            fcu $$5 = $$4.g();
            jj $$6 = $$4.b();
            if (this.f.a($$6, 1.0)) {
               fcu $$7 = $$5.d(fcu.b($$6));
               double $$8 = 1.0000001;
               if (Math.abs($$7.a()) < 1.0000001 && Math.abs($$7.b()) < 1.0000001 && Math.abs($$7.c()) < 1.0000001) {
                  jo $$9 = $$4.c();
                  this.f.H();
                  int $$10 = this.f.dV().ao();
                  if ($$6.v() <= $$10) {
                     if (this.F == null && $$1.a(this.f, $$6)) {
                        btq $$11 = this.f.h.a(this.f, $$1, $$3, $$2, $$4);
                        if ($$11.a()) {
                           ap.P.a(this.f, $$4.b(), $$3.v());
                        }

                        if ($$9 == jo.b && !$$11.a() && $$6.v() >= $$10 && a(this.f, $$3)) {
                           wv $$12 = wv.a("build.tooHigh", $$10).a(n.m);
                           this.f.b($$12, true);
                        } else if ($$11 instanceof btq.d $$13 && $$13.e() == btq.e.c) {
                           this.f.a($$2, true);
                        }
                     }
                  } else {
                     wv $$14 = wv.a("build.tooHigh", $$10).a(n.m);
                     this.f.b($$14, true);
                  }

                  this.f.f.b(new abz($$1, $$6));
                  this.f.f.b(new abz($$1, $$6.a($$9)));
               } else {
                  h.warn("Rejecting UseItemOnPacket from {}: Location {} too far away from hit block {}.", new Object[]{this.f.gh().getName(), $$5, $$6});
               }
            }
         }
      }
   }

   @Override
   public void a(aip $$0) {
      zf.a($$0, this, this.f.y());
      if (this.f.gI()) {
         this.a($$0.e());
         arn $$1 = this.f.y();
         btp $$2 = $$0.b();
         cxy $$3 = this.f.b($$2);
         this.f.H();
         if (!$$3.f() && $$3.a($$1.K())) {
            float $$4 = azk.h($$0.f());
            float $$5 = azk.h($$0.g());
            if ($$5 != this.f.dN() || $$4 != this.f.dL()) {
               this.f.c($$4, $$5);
            }

            if (this.f.h.a(this.f, $$1, $$3, $$2) instanceof btq.d $$7 && $$7.e() == btq.e.c) {
               this.f.a($$2, true);
            }
         }
      }
   }

   @Override
   public void a(aim $$0) {
      zf.a($$0, this, this.f.y());
      if (this.f.U_()) {
         for (arn $$1 : this.d.L()) {
            bvs $$2 = $$0.a($$1);
            if ($$2 != null) {
               this.f.a($$1, $$2.dA(), $$2.dC(), $$2.dG(), Set.of(), $$2.dL(), $$2.dN(), true);
               return;
            }
         }
      }
   }

   @Override
   public void a(ahn $$0) {
      zf.a($$0, this, this.f.y());
      if (this.f.dl() instanceof csf $$2) {
         $$2.a($$0.b(), $$0.e());
      }
   }

   @Override
   public void a(vq $$0) {
      h.info("{} lost connection: {}", this.f.al().getString(), $$0.a().getString());
      this.q();
      super.a($$0);
   }

   private void q() {
      this.T.close();
      this.d.av();
      this.d.ag().a(wv.a("multiplayer.player.left", this.f.m_()).a(n.o), false);
      this.f.t();
      this.d.ag().c(this.f);
      this.f.Z().b();
   }

   public void a(int $$0) {
      if ($$0 < 0) {
         throw new IllegalArgumentException("Expected packet sequence nr >= 0");
      } else {
         this.p = Math.max($$0, this.p);
      }
   }

   @Override
   public void a(aid $$0) {
      zf.a($$0, this, this.f.y());
      if ($$0.b() >= 0 && $$0.b() < cqh.g()) {
         if (this.f.gi().j != $$0.b() && this.f.fz() == btp.a) {
            this.f.fE();
         }

         this.f.gi().j = $$0.b();
         this.f.H();
      } else {
         h.warn("{} tried to set an invalid carried item", this.f.al().getString());
      }
   }

   @Override
   public void a(agu $$0) {
      Optional<xc> $$1 = this.a($$0.h());
      if (!$$1.isEmpty()) {
         this.a($$0.b(), () -> {
            xl $$2;
            try {
               $$2 = this.a($$0, $$1.get());
            } catch (xp.a var6) {
               this.a(var6);
               return;
            }

            CompletableFuture<asg> $$5 = this.a($$2.c());
            wv $$6 = this.d.bk().decorate(this.f, $$2.d());
            this.T.append($$5, $$2x -> {
               xl $$3 = $$2.a($$6).a($$2x.e());
               this.b($$3);
            });
         });
      }
   }

   @Override
   public void a(ags $$0) {
      this.a($$0.b(), () -> {
         this.b($$0.b());
         this.r();
      });
   }

   private void b(String $$0) {
      ParseResults<ex> $$1 = this.c($$0);
      if (this.d.aA() && xn.a($$1)) {
         h.error("Received unsigned command packet from {}, but the command requires signable arguments: {}", this.f.gh().getName(), $$0);
         this.f.a(m);
      } else {
         this.d.aG().a($$1, $$0);
      }
   }

   @Override
   public void a(agt $$0) {
      Optional<xc> $$1 = this.a($$0.h());
      if (!$$1.isEmpty()) {
         this.a($$0.b(), () -> {
            this.a($$0, $$1.get());
            this.r();
         });
      }
   }

   private void a(agt $$0, xc $$1) {
      ParseResults<ex> $$2 = this.c($$0.b());

      Map<String, xl> $$3;
      try {
         $$3 = this.a($$0, xn.b($$2), $$1);
      } catch (xp.a var6) {
         this.a(var6);
         return;
      }

      ev $$6 = new ev.a($$3);
      $$2 = ey.a($$2, $$1x -> $$1x.a($$6, this.T));
      this.d.aG().a($$2, $$0.b());
   }

   private void a(xp.a $$0) {
      h.warn("Failed to update secure chat state for {}: '{}'", this.f.gh().getName(), $$0.a().getString());
      this.f.a($$0.a().f().a(n.m));
   }

   private <S> Map<String, xl> a(agt $$0, xn<S> $$1, xc $$2) throws xp.a {
      List<fe.a> $$3 = $$0.g().a();
      List<xn.a<S>> $$4 = $$1.a();
      if ($$3.isEmpty()) {
         return this.b($$4);
      } else {
         Map<String, xl> $$5 = new Object2ObjectOpenHashMap();

         for (fe.a $$6 : $$3) {
            xn.a<S> $$7 = $$1.a($$6.a());
            if ($$7 == null) {
               this.Q.setChainBroken();
               throw a($$0.b(), $$3, $$4);
            }

            xo $$8 = new xo($$7.c(), $$0.e(), $$0.f(), $$2);
            $$5.put($$7.a(), this.Q.unpack($$6.b(), $$8));
         }

         for (xn.a<S> $$9 : $$4) {
            if (!$$5.containsKey($$9.a())) {
               throw a($$0.b(), $$3, $$4);
            }
         }

         return $$5;
      }
   }

   private <S> Map<String, xl> b(List<xn.a<S>> $$0) throws xp.a {
      Map<String, xl> $$1 = new HashMap<>();

      for (xn.a<S> $$2 : $$0) {
         xo $$3 = xo.a($$2.c());
         $$1.put($$2.a(), this.Q.unpack(null, $$3));
      }

      return $$1;
   }

   private static <S> xp.a a(String $$0, List<fe.a> $$1, List<xn.a<S>> $$2) {
      String $$3 = $$1.stream().map(fe.a::a).collect(Collectors.joining(", "));
      String $$4 = $$2.stream().map(xn.a::a).collect(Collectors.joining(", "));
      h.error("Signed command mismatch between server and client ('{}'): got [{}] from client, but expected [{}]", new Object[]{$$0, $$3, $$4});
      return new xp.a(m);
   }

   private ParseResults<ex> c(String $$0) {
      CommandDispatcher<ex> $$1 = this.d.aG().a();
      return $$1.parse($$0, this.f.A());
   }

   private void a(String $$0, Runnable $$1) {
      if (d($$0)) {
         this.a(wv.c("multiplayer.disconnect.illegal_characters"));
      } else if (this.f.E() == cqf.c) {
         this.b(new afv(wv.c("chat.disabled.options").a(n.m), false));
      } else {
         this.f.H();
         this.d.execute($$1);
      }
   }

   private Optional<xc> a(xc.b $$0) {
      synchronized (this.R) {
         Optional<xc> $$1 = this.R.a($$0);
         if ($$1.isEmpty()) {
            h.warn("Failed to validate message acknowledgements from {}", this.f.al().getString());
            this.a(l);
         }

         return $$1;
      }
   }

   private static boolean d(String $$0) {
      for (int $$1 = 0; $$1 < $$0.length(); $$1++) {
         if (!bah.a($$0.charAt($$1))) {
            return true;
         }
      }

      return false;
   }

   private xl a(agu $$0, xc $$1) throws xp.a {
      xo $$2 = new xo($$0.b(), $$0.e(), $$0.f(), $$1);
      return this.Q.unpack($$0.g(), $$2);
   }

   private void b(xl $$0) {
      this.d.ag().a($$0, this.f, wr.a(wr.e, this.f));
      this.r();
   }

   private void r() {
      this.q.a();
      if (!this.q.c() && !this.d.ag().f(this.f.gh()) && !this.d.a(this.f.gh())) {
         this.a(wv.c("disconnect.spam"));
      }
   }

   @Override
   public void a(agr $$0) {
      synchronized (this.R) {
         if (!this.R.a($$0.b())) {
            h.warn("Failed to validate message acknowledgements from {}", this.f.al().getString());
            this.a(l);
         }
      }
   }

   @Override
   public void a(ail $$0) {
      zf.a($$0, this, this.f.y());
      this.f.H();
      this.f.a($$0.b());
   }

   @Override
   public void a(aht $$0) {
      zf.a($$0, this, this.f.y());
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
                  this.F = this.f.dt();
               }
               break;
            case f:
               if (this.f.dl() instanceof bxb $$1) {
                  int $$2 = $$0.f();
                  if ($$1.a() && $$2 > 0) {
                     $$1.c($$2);
                  }
               }
               break;
            case g:
               if (this.f.dl() instanceof bxb $$3) {
                  $$3.b();
               }
               break;
            case h:
               if (this.f.dk() instanceof bwj $$4) {
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

   public void a(xl $$0) {
      xh $$1 = $$0.l();
      if ($$1 != null) {
         this.S.a($$0.m(), $$0.l());
         int $$2;
         synchronized (this.R) {
            this.R.a($$1);
            $$2 = this.R.a();
         }

         if ($$2 > 4096) {
            this.a(wv.c("multiplayer.disconnect.too_many_pending_chats"));
         }
      }
   }

   public void a(xl $$0, wr.a $$1) {
      this.b(new adt($$0.k().c(), $$0.k().b(), $$0.l(), $$0.m().a(this.S), $$0.n(), $$0.o(), $$1));
      this.a($$0);
   }

   public void a(wv $$0, wr.a $$1) {
      this.b(new act($$0, $$1));
   }

   public SocketAddress m() {
      return this.e.d();
   }

   public void n() {
      this.U = true;
      this.q();
      this.b(aft.a);
      this.e.a(abg.d);
   }

   @Override
   public void a(ajw $$0) {
      this.e.a(new ajt($$0.b()));
   }

   @Override
   public void a(ahi $$0) {
      zf.a($$0, this, this.f.y());
      if (this.f.gI()) {
         final arn $$1 = this.f.y();
         final bvs $$2 = $$0.a($$1);
         this.f.H();
         this.f.g($$0.b());
         if ($$2 != null) {
            if (!$$1.A_().a($$2.dv())) {
               return;
            }

            fcp $$3 = $$2.cR();
            if (this.f.a($$3, 3.0)) {
               $$0.a(new ahi.c() {
                  private void a(btp $$0, asq.a $$1x) {
                     cxy $$2 = asq.this.f.b($$0);
                     if ($$2.a($$1.K())) {
                        cxy $$3 = $$2.v();
                        if ($$1.run(asq.this.f, $$2, $$0) instanceof btq.d $$5) {
                           cxy $$6 = $$5.c() ? $$3 : cxy.k;
                           ap.T.a(asq.this.f, $$6, $$2);
                           if ($$5.e() == btq.e.c) {
                              asq.this.f.a($$0, true);
                           }
                        }
                     }
                  }

                  @Override
                  public void a(btp $$0) {
                     this.a($$0, cqi::a);
                  }

                  @Override
                  public void a(btp $$0, fcu $$1x) {
                     this.a($$0, ($$1xxx, $$2xx, $$3) -> $$2xx.a($$1xxx, $$1, $$3));
                  }

                  @Override
                  public void a() {
                     label23:
                     if (!($$2 instanceof cmn) && !($$2 instanceof bwg) && $$2 != asq.this.f) {
                        if ($$2 instanceof cqp $$0 && !$$0.cB()) {
                           break label23;
                        }

                        cxy $$1 = asq.this.f.b(btp.a);
                        if (!$$1.a($$1.K())) {
                           return;
                        }

                        asq.this.f.e($$2);
                        return;
                     }

                     asq.this.a(wv.c("multiplayer.disconnect.invalid_entity_attacked"));
                     asq.h.warn("Player {} tried to attack an invalid entity", asq.this.f.al().getString());
                  }
               });
            }
         }
      }
   }

   @Override
   public void a(agx $$0) {
      zf.a($$0, this, this.f.y());
      this.f.H();
      agx.a $$1 = $$0.b();
      switch ($$1) {
         case a:
            if (this.f.k) {
               this.f.k = false;
               this.f = this.d.ag().a(this.f, true, bvs.e.e);
               this.l();
               ap.w.a(this.f, dhp.k, dhp.i);
            } else {
               if (this.f.eF() > 0.0F) {
                  return;
               }

               this.f = this.d.ag().a(this.f, false, bvs.e.a);
               this.l();
               if (this.d.r_()) {
                  this.f.a(dhm.d);
                  this.f.y().O().b(dhl.r).a(false, this.d);
               }
            }
            break;
         case b:
            this.f.I().a(this.f);
      }
   }

   @Override
   public void a(ahd $$0) {
      zf.a($$0, this, this.f.y());
      this.f.q();
   }

   @Override
   public void a(ahc $$0) {
      zf.a($$0, this, this.f.y());
      this.f.H();
      if (this.f.bP.l == $$0.b()) {
         if (this.f.U_()) {
            this.f.bP.b();
         } else if (!this.f.bP.b(this.f)) {
            h.debug("Player {} interacted with invalid menu {}", this.f, this.f.bP);
         } else {
            int $$1 = $$0.e();
            if (!this.f.bP.a($$1)) {
               h.debug("Player {} clicked invalid slot index: {}, available slots: {}", new Object[]{this.f.al(), $$1, this.f.bP.k.size()});
            } else {
               boolean $$2 = $$0.j() != this.f.bP.j();
               this.f.bP.h();
               this.f.bP.a($$1, $$0.f(), $$0.i(), this.f);
               ObjectIterator var4 = Int2ObjectMaps.fastIterable($$0.h()).iterator();

               while (var4.hasNext()) {
                  Entry<cxy> $$3 = (Entry<cxy>)var4.next();
                  this.f.bP.b($$3.getIntKey(), (cxy)$$3.getValue());
               }

               this.f.bP.a($$0.g());
               this.f.bP.i();
               if ($$2) {
                  this.f.bP.e();
               } else {
                  this.f.bP.d();
               }
            }
         }
      }
   }

   @Override
   public void a(ahq $$0) {
      zf.a($$0, this, this.f.y());
      this.f.H();
      if (!this.f.U_() && this.f.bP.l == $$0.b()) {
         if (!this.f.bP.b(this.f)) {
            h.debug("Player {} interacted with invalid menu {}", this.f, this.f.bP);
         } else {
            dcs.d $$1 = this.d.aI().a($$0.e());
            if ($$1 != null) {
               dcq<?> $$2 = $$1.b();
               if (this.f.J().b($$2.a())) {
                  if (this.f.bP instanceof cvc $$3) {
                     if ($$2.b().ak_().c()) {
                        h.debug("Player {} tried to place impossible recipe {}", this.f, $$2.a().a());
                        return;
                     }

                     cvc.a $$4 = $$3.a($$0.f(), this.f.b(), $$2, this.f.y(), this.f.gi());
                     if ($$4 == cvc.a.b) {
                        this.f.f.b(new adr(this.f.bP.l, $$1.a().b()));
                     }
                  }
               }
            }
         }
      }
   }

   @Override
   public void a(ahb $$0) {
      zf.a($$0, this, this.f.y());
      this.f.H();
      if (this.f.bP.l == $$0.b() && !this.f.U_()) {
         if (!this.f.bP.b(this.f)) {
            h.debug("Player {} interacted with invalid menu {}", this.f, this.f.bP);
         } else {
            boolean $$1 = this.f.bP.a(this.f, $$0.e());
            if ($$1) {
               this.f.bP.d();
            }
         }
      }
   }

   @Override
   public void a(aig $$0) {
      zf.a($$0, this, this.f.y());
      if (this.f.fU()) {
         boolean $$1 = $$0.b() < 0;
         cxy $$2 = $$0.e();
         if (!$$2.a(this.f.dV().K())) {
            return;
         }

         boolean $$3 = $$0.b() >= 1 && $$0.b() <= 45;
         boolean $$4 = $$2.f() || $$2.M() <= $$2.k();
         if ($$3 && $$4) {
            this.f.bO.b($$0.b()).e($$2);
            this.f.bO.a($$0.b(), $$2);
            this.f.bO.d();
         } else if ($$1 && $$4) {
            if (this.r.c()) {
               this.r.a();
               this.f.a($$2, true);
            } else {
               h.warn("Player {} was dropping items too fast in creative mode, ignoring.", this.f.al().getString());
            }
         }
      }
   }

   @Override
   public void a(aik $$0) {
      List<String> $$1 = Stream.of($$0.f()).map(n::a).collect(Collectors.toList());
      this.a($$1).thenAcceptAsync($$1x -> this.a($$0, $$1x), this.d);
   }

   private void a(aik $$0, List<asg> $$1) {
      this.f.H();
      arn $$2 = this.f.y();
      jj $$3 = $$0.b();
      if ($$2.B($$3)) {
         if (!($$2.c_($$3) instanceof dwz $$5)) {
            return;
         }

         $$5.a(this.f, $$0.e(), $$1);
      }
   }

   @Override
   public void a(ahr $$0) {
      zf.a($$0, this, this.f.y());
      this.f.gj().b = $$0.b() && this.f.gj().c;
   }

   @Override
   public void a(zw $$0) {
      zf.a($$0, this, this.f.y());
      boolean $$1 = this.f.a(cqj.g);
      this.f.a($$0.b());
      if (this.f.a(cqj.g) != $$1) {
         this.d.ag().a(new ady(ady.a.h, this.f));
      }
   }

   @Override
   public void a(agq $$0) {
      zf.a($$0, this, this.f.y());
      if (this.f.s(2) || this.h()) {
         this.d.a($$0.b(), false);
      }
   }

   @Override
   public void a(ahk $$0) {
      zf.a($$0, this, this.f.y());
      if (this.f.s(2) || this.h()) {
         this.d.b($$0.b());
      }
   }

   @Override
   public void a(agv $$0) {
      zf.a($$0, this, this.f.y());
      xm.a $$1 = $$0.b();
      cql.a $$2 = this.P != null ? this.P.d().b() : null;
      cql.a $$3 = $$1.b();
      if (!Objects.equals($$2, $$3)) {
         if ($$2 != null && $$3.b().isBefore($$2.b())) {
            this.a(cql.a);
         } else {
            try {
               azx $$4 = this.d.ar();
               if ($$4 == null) {
                  h.warn("Ignoring chat session from {} due to missing Services public key", this.f.gh().getName());
                  return;
               }

               this.a($$1.a(this.f.gh(), $$4));
            } catch (cql.b var6) {
               h.error("Failed to validate profile key: {}", var6.getMessage());
               this.a(var6.a());
            }
         }
      }
   }

   @Override
   public void a(aha $$0) {
      if (!this.U) {
         throw new IllegalStateException("Client acknowledged config, but none was requested");
      } else {
         this.e.a(abg.b, new aso(this.d, this.e, this.a(this.f.C())));
      }
   }

   @Override
   public void a(agw $$0) {
      zf.a($$0, this, this.f.y());
      this.g.a($$0.b());
   }

   @Override
   public void a(ahf $$0) {
      zf.a($$0, this, this.f.y());
      this.d.a(this.f, $$0.b());
   }

   private void a(xm $$0) {
      this.P = $$0;
      this.Q = $$0.a(this.f.cG());
      this.T.append(() -> {
         this.f.a($$0);
         this.d.ag().a(new ady(EnumSet.of(ady.a.b), List.of(this.f)));
      });
   }

   @Override
   public void a(zx $$0) {
   }

   @Override
   public void a(agy $$0) {
      zf.a($$0, this, this.f.y());
      if (!this.O) {
         this.f.a(fcu.c);
      }

      this.O = false;
   }

   private void a(fcu $$0) {
      if ($$0.h() > 1.0E-5F) {
         this.f.H();
      }

      this.f.a($$0);
      this.O = true;
   }

   @Override
   public aro o() {
      return this.f;
   }

   @FunctionalInterface
   interface a {
      btq run(aro var1, bvs var2, btp var3);
   }
}
