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

public class ate extends atb implements agz.a, aha, ath, wu {
   static final Logger h = LogUtils.getLogger();
   private static final int i = -1;
   private static final int j = 4096;
   private static final int k = 80;
   private static final xg l = xg.c("multiplayer.disconnect.chat_validation_failed");
   private static final xg m = xg.c("chat.disabled.invalid_command_signature").a(o.m);
   private static final int n = 1000;
   public asc f;
   public final asz g;
   private int o;
   private int p = -1;
   private final bbb q = new bbb(20, 200);
   private final bbb r = new bbb(20, 1480);
   private double s;
   private double t;
   private double u;
   private double v;
   private double w;
   private double x;
   @Nullable
   private bxe y;
   private double z;
   private double A;
   private double B;
   private double C;
   private double D;
   private double E;
   @Nullable
   private fgc F;
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
   private xx P;
   private ya.b Q;
   private final xp R = new xp(20);
   private int S;
   private final xt T = xt.a();
   private final azm U;
   private boolean V;

   public ate(MinecraftServer $$0, vv $$1, asc $$2, asr $$3) {
      super($$0, $$1, $$3);
      this.g = new asz($$1.e());
      this.f = $$2;
      $$2.f = this;
      $$2.W().a();
      this.Q = ya.b.unsigned($$2.cG(), $$0::aA);
      this.U = new azm($$0);
   }

   @Override
   public void d() {
      if (this.p > -1) {
         this.b(new acj(this.p));
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
         if (++this.J > this.a((bxe)this.f)) {
            h.warn("{} was kicked for floating too long!", this.f.ai().getString());
            this.a(xg.c("multiplayer.disconnect.flying"));
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
               this.a(xg.c("multiplayer.disconnect.flying"));
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
         this.a(xg.c("multiplayer.disconnect.idling"));
      }
   }

   private int a(bxe $$0) {
      double $$1 = $$0.bd();
      if ($$1 < 1.0E-5F) {
         return Integer.MAX_VALUE;
      } else {
         double $$2 = 0.08 / $$1;
         return azz.c(80.0 * Math.max($$2, 1.0));
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
      return this.e.i() && !this.V;
   }

   @Override
   public boolean a(zo<?> $$0) {
      return super.a($$0) ? true : this.V && this.e.i() && $$0 instanceof aho;
   }

   @Override
   protected GameProfile i() {
      return this.f.gi();
   }

   private <T, R> CompletableFuture<R> a(T $$0, BiFunction<atk, T, CompletableFuture<R>> $$1) {
      return $$1.apply(this.f.W(), $$0).thenApply($$0x -> {
         if (!this.c()) {
            h.debug("Ignoring packet due to disconnection");
            throw new CancellationException("disconnected");
         } else {
            return (R)$$0x;
         }
      });
   }

   private CompletableFuture<asu> a(String $$0) {
      return this.a($$0, atk::a);
   }

   private CompletableFuture<List<asu>> a(List<String> $$0) {
      return this.a($$0, atk::a);
   }

   @Override
   public void a(aii $$0) {
      zr.a($$0, this, this.f.y());
      this.f.a($$0.b());
   }

   private static boolean b(double $$0, double $$1, double $$2, float $$3, float $$4) {
      return Double.isNaN($$0) || Double.isNaN($$1) || Double.isNaN($$2) || !Floats.isFinite($$4) || !Floats.isFinite($$3);
   }

   private static double a(double $$0) {
      return azz.a($$0, -3.0E7, 3.0E7);
   }

   private static double b(double $$0) {
      return azz.a($$0, -2.0E7, 2.0E7);
   }

   @Override
   public void a(aia $$0) {
      zr.a($$0, this, this.f.y());
      if (b($$0.b().a(), $$0.b().b(), $$0.b().c(), $$0.e(), $$0.f())) {
         this.a(xg.c("multiplayer.disconnect.invalid_vehicle_movement"));
      } else if (!this.p() && this.f.gJ()) {
         bxe $$1 = this.f.df();
         if ($$1 != this.f && $$1.cW() == this.f && $$1 == this.y) {
            asb $$2 = this.f.y();
            double $$3 = $$1.dA();
            double $$4 = $$1.dC();
            double $$5 = $$1.dG();
            double $$6 = a($$0.b().a());
            double $$7 = b($$0.b().b());
            double $$8 = a($$0.b().c());
            float $$9 = azz.h($$0.e());
            float $$10 = azz.h($$0.f());
            double $$11 = $$6 - this.z;
            double $$12 = $$7 - this.A;
            double $$13 = $$8 - this.B;
            double $$14 = $$1.dy().h();
            double $$15 = $$11 * $$11 + $$12 * $$12 + $$13 * $$13;
            if ($$15 - $$14 > 100.0 && !this.h()) {
               h.warn("{} (vehicle of {}) moved too quickly! {},{},{}", new Object[]{$$1.ai().getString(), this.f.ai().getString(), $$11, $$12, $$13});
               this.b(aeb.a($$1));
               return;
            }

            boolean $$16 = $$2.a($$1, $$1.cR().h(0.0625));
            $$11 = $$6 - this.C;
            $$12 = $$7 - this.D;
            $$13 = $$8 - this.E;
            boolean $$17 = $$1.R;
            if ($$1 instanceof byf $$18 && $$18.d_()) {
               $$18.k();
            }

            $$1.a(byj.b, new fgc($$11, $$12, $$13));
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
               this.b(aeb.a($$1));
               $$1.aJ();
               return;
            }

            this.f.y().m().a(this.f);
            fgc $$22 = new fgc($$1.dA() - $$3, $$1.dC() - $$4, $$1.dG() - $$5);
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

   private boolean b(bxe $$0) {
      return $$0.dV().a($$0.cR().g(0.0625).b(0.0, -0.55, 0.0)).allMatch(ebp.a::l);
   }

   @Override
   public void a(ahc $$0) {
      zr.a($$0, this, this.f.y());
      if ($$0.b() == this.G) {
         if (this.F == null) {
            this.a(xg.c("multiplayer.disconnect.invalid_player_movement"));
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
   public void a(aij $$0) {
      zr.a($$0, this, this.f.y());
      this.f.v(true);
   }

   @Override
   public void a(ail $$0) {
      zr.a($$0, this, this.f.y());
      dfi.d $$1 = this.d.aI().a($$0.b());
      if ($$1 != null) {
         this.f.J().d($$1.b().a());
      }
   }

   @Override
   public void a(aio $$0) {
      zr.a($$0, this, this.f.y());
      this.f.bR.a($$0.b(), $$0.e());
   }

   @Override
   public void a(aik $$0) {
      zr.a($$0, this, this.f.y());
      this.f.J().a($$0.b(), $$0.e(), $$0.f());
   }

   @Override
   public void a(ain $$0) {
      zr.a($$0, this, this.f.y());
      if ($$0.e() == ain.a.a) {
         alr $$1 = Objects.requireNonNull($$0.f());
         aj $$2 = this.d.aD().a($$1);
         if ($$2 != null) {
            this.f.S().a($$2);
         }
      }
   }

   @Override
   public void a(ahn $$0) {
      zr.a($$0, this, this.f.y());
      StringReader $$1 = new StringReader($$0.e());
      if ($$1.canRead() && $$1.peek() == '/') {
         $$1.skip();
      }

      ParseResults<ek> $$2 = this.d.aG().a().parse($$1, this.f.A());
      this.d.aG().a().getCompletionSuggestions($$2).thenAccept($$1x -> {
         Suggestions $$2x = $$1x.getList().size() <= 1000 ? $$1x : new Suggestions($$1x.getRange(), $$1x.getList().subList(0, 1000));
         this.b(new acw($$0.b(), $$2x));
      });
   }

   @Override
   public void a(ais $$0) {
      zr.a($$0, this, this.f.y());
      if (!this.d.q()) {
         this.f.a(xg.c("advMode.notEnabled"));
      } else if (!this.f.gG()) {
         this.f.a(xg.c("advMode.notAllowed"));
      } else {
         dji $$1 = null;
         dyz $$2 = null;
         iw $$3 = $$0.b();
         dyo $$4 = this.f.dV().c_($$3);
         if ($$4 instanceof dyz) {
            $$2 = (dyz)$$4;
            $$1 = $$2.a();
         }

         String $$5 = $$0.e();
         boolean $$6 = $$0.f();
         if ($$1 != null) {
            dyz.a $$7 = $$2.s();
            ebq $$8 = this.f.dV().a_($$3);
            jc $$9 = $$8.c(doy.b);

            ebq $$10 = switch ($$0.i()) {
               case a -> dnq.ln.m();
               case b -> dnq.lm.m();
               default -> dnq.gm.m();
            };
            ebq $$11 = $$10.b(doy.b, $$9).b(doy.c, Boolean.valueOf($$0.g()));
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
            if (!bay.b($$5)) {
               this.f.a(xg.a("advMode.setCommand.success", $$5));
            }
         }
      }
   }

   @Override
   public void a(ait $$0) {
      zr.a($$0, this, this.f.y());
      if (!this.d.q()) {
         this.f.a(xg.c("advMode.notEnabled"));
      } else if (!this.f.gG()) {
         this.f.a(xg.c("advMode.notAllowed"));
      } else {
         dji $$1 = $$0.a(this.f.dV());
         if ($$1 != null) {
            $$1.a($$0.b());
            $$1.a($$0.e());
            if (!$$0.e()) {
               $$1.c(null);
            }

            $$1.f();
            this.f.a(xg.a("advMode.setCommand.success", $$0.b()));
         }
      }
   }

   @Override
   public void a(aic $$0) {
      asb $$1 = this.f.y();
      zr.a($$0, this, $$1);
      iw $$2 = $$0.b();
      if (this.f.a($$2, 1.0)) {
         if ($$1.p($$2)) {
            ebq $$3 = $$1.a_($$2);
            boolean $$4 = this.f.fV() && $$0.e();
            dak $$5 = $$3.a((dkm)$$1, $$2, $$4);
            if (!$$5.f()) {
               if ($$4) {
                  a($$3, $$1, $$2, $$5);
               }

               this.a($$5);
            }
         }
      }
   }

   private static void a(ebq $$0, asb $$1, iw $$2, dak $$3) {
      dyo $$4 = $$0.x() ? $$1.c_($$2) : null;
      if ($$4 != null) {
         ua $$5 = $$4.e($$1.J_());
         $$4.a($$5);
         cys.a($$3, $$4.p(), $$5);
         $$3.b($$4.q());
      }
   }

   @Override
   public void a(aid $$0) {
      asb $$1 = this.f.y();
      zr.a($$0, this, $$1);
      bxe $$2 = $$1.b($$0.b());
      if ($$2 != null && this.f.b($$2, 3.0)) {
         dak $$3 = $$2.dI();
         if ($$3 != null && !$$3.f()) {
            this.a($$3);
         }
      }
   }

   private void a(dak $$0) {
      if ($$0.a(this.f.dV().K())) {
         csh $$1 = this.f.gj();
         int $$2 = $$1.d($$0);
         if ($$2 != -1) {
            if (csh.e($$2)) {
               $$1.c($$2);
            } else {
               $$1.d($$2);
            }
         } else if (this.f.fV()) {
            $$1.c($$0);
         }

         this.f.f.b(new afu($$1.f()));
         this.f.bQ.d();
      }
   }

   @Override
   public void a(aim $$0) {
      zr.a($$0, this, this.f.y());
      if (this.f.bR instanceof cwe $$1) {
         if (!$$1.b(this.f)) {
            h.debug("Player {} interacted with invalid menu {}", this.f, $$1);
            return;
         }

         $$1.a($$0.b());
      }
   }

   @Override
   public void a(aiq $$0) {
      zr.a($$0, this, this.f.y());
      if (this.f.bR instanceof cwg $$1) {
         if (!this.f.bR.b(this.f)) {
            h.debug("Player {} interacted with invalid menu {}", this.f, this.f.bR);
            return;
         }

         $$1.a($$0.b(), $$0.e());
      }
   }

   @Override
   public void a(aiw $$0) {
      zr.a($$0, this, this.f.y());
      if (this.f.gG()) {
         iw $$1 = $$0.b();
         ebq $$2 = this.f.dV().a_($$1);
         if (this.f.dV().c_($$1) instanceof eah $$4) {
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
               if ($$0.e() == eah.a.b) {
                  if ($$4.B()) {
                     this.f.a(xg.a("structure_block.save_success", $$5), false);
                  } else {
                     this.f.a(xg.a("structure_block.save_failure", $$5), false);
                  }
               } else if ($$0.e() == eah.a.c) {
                  if (!$$4.D()) {
                     this.f.a(xg.a("structure_block.load_not_found", $$5), false);
                  } else if ($$4.a(this.f.y())) {
                     this.f.a(xg.a("structure_block.load_success", $$5), false);
                  } else {
                     this.f.a(xg.a("structure_block.load_prepare", $$5), false);
                  }
               } else if ($$0.e() == eah.a.d) {
                  if ($$4.A()) {
                     this.f.a(xg.a("structure_block.size_success", $$5), false);
                  } else {
                     this.f.a(xg.c("structure_block.size_failure"), false);
                  }
               }
            } else {
               this.f.a(xg.a("structure_block.invalid_structure_name", $$0.g()), false);
            }

            $$4.e();
            this.f.dV().a($$1, $$2, $$2, 3);
         }
      }
   }

   @Override
   public void a(aix $$0) {
      zr.a($$0, this, this.f.y());
      if (this.f.gG()) {
         iw $$1 = $$0.b();
         ebq $$2 = this.f.dV().a_($$1);
         if (this.f.dV().c_($$1) instanceof eai $$4) {
            $$4.a($$0.e());
            $$4.a($$0.f());
            $$4.e();
            this.f.dV().a($$1, $$2, $$4.m(), 3);
         }
      }
   }

   @Override
   public void a(ajb $$0) {
      zr.a($$0, this, this.f.y());
      iw $$1 = $$0.b();
      if (this.f.gG() && this.f.dV().c_($$1) instanceof eaj $$2) {
         if ($$0.e() != ajb.a.b && $$0.e() != ajb.a.a) {
            $$2.a($$0.f());
            if ($$0.e() == ajb.a.d) {
               $$2.a(this.f::a);
            } else if ($$0.e() == ajb.a.e) {
               $$2.b(this.f::a);
            } else if ($$0.e() == ajb.a.f) {
               $$2.c(this.f::a);
            } else if ($$0.e() == ajb.a.g) {
               $$2.d(this.f::a);
            }

            ebq $$10 = this.f.dV().a_($$1);
            this.f.dV().a($$1, dnq.a.m(), $$10, 3);
         } else {
            jt<ss> $$4 = this.f.dX().f(mi.bh);
            Optional<jg.c<ss>> $$5 = $$0.f().a().flatMap($$4::a);
            xg $$6;
            if ($$5.isPresent()) {
               $$6 = $$5.get().a().c();
            } else {
               $$6 = xg.c("test_instance.description.no_test").a(o.m);
            }

            Optional<kb> $$8;
            if ($$0.e() == ajb.a.b) {
               $$8 = $$0.f().a().flatMap($$0x -> eaj.a(this.f.y(), $$0x));
            } else {
               $$8 = Optional.empty();
            }

            this.e.a(new ago($$6, $$8));
         }
      }
   }

   @Override
   public void a(aiv $$0) {
      zr.a($$0, this, this.f.y());
      if (this.f.gG()) {
         iw $$1 = $$0.b();
         ebq $$2 = this.f.dV().a_($$1);
         if (this.f.dV().c_($$1) instanceof dzs $$4) {
            $$4.a($$0.e());
            $$4.b($$0.f());
            $$4.a(alq.a(mi.bf, $$0.g()));
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
   public void a(ahx $$0) {
      zr.a($$0, this, this.f.y());
      if (this.f.gG()) {
         iw $$1 = $$0.b();
         if (this.f.dV().c_($$1) instanceof dzs $$3) {
            $$3.a(this.f.y(), $$0.e(), $$0.f());
         }
      }
   }

   @Override
   public void a(aip $$0) {
      zr.a($$0, this, this.f.y());
      int $$1 = $$0.b();
      if (this.f.bR instanceof cxm $$2) {
         if (!$$2.b(this.f)) {
            h.debug("Player {} interacted with invalid menu {}", this.f, $$2);
            return;
         }

         $$2.e($$1);
         $$2.h($$1);
      }
   }

   @Override
   public void a(ahu $$0) {
      int $$1 = $$0.b();
      if (csh.e($$1) || $$1 == 40) {
         List<String> $$2 = Lists.newArrayList();
         Optional<String> $$3 = $$0.f();
         $$3.ifPresent($$2::add);
         $$2.addAll($$0.e());
         Consumer<List<asu>> $$4 = $$3.isPresent() ? $$1x -> this.a((asu)$$1x.get(0), $$1x.subList(1, $$1x.size()), $$1) : $$1x -> this.a($$1x, $$1);
         this.a($$2).thenAcceptAsync($$4, this.d);
      }
   }

   private void a(List<asu> $$0, int $$1) {
      dak $$2 = this.f.gj().a($$1);
      if ($$2.c(kl.U)) {
         List<ast<String>> $$3 = $$0.stream().map(this::a).toList();
         $$2.b(kl.U, new ddt($$3));
      }
   }

   private void a(asu $$0, List<asu> $$1, int $$2) {
      dak $$3 = this.f.gj().a($$2);
      if ($$3.c(kl.U)) {
         dak $$4 = $$3.a((dki)dao.vj);
         $$4.e(kl.U);
         List<ast<xg>> $$5 = $$1.stream().map($$0x -> this.a($$0x).a(xg::b)).toList();
         $$4.b(kl.V, new ddu(this.a($$0), this.f.ai().getString(), 0, $$5, true));
         this.f.gj().a($$2, $$4);
      }
   }

   private ast<String> a(asu $$0) {
      return this.f.X() ? ast.a($$0.b()) : ast.a($$0);
   }

   @Override
   public void a(ahv $$0) {
      zr.a($$0, this, this.f.y());
      if (this.f.s(2)) {
         bxe $$1 = this.f.dV().a($$0.e());
         if ($$1 != null) {
            ua $$2 = $$1.h(new ua());
            this.f.f.b(new agl($$0.b(), $$2));
         }
      }
   }

   @Override
   public void a(ahs $$0) {
      zr.a($$0, this, this.f.y());
      if (!this.f.aa_() && $$0.e() == this.f.bR.l) {
         if (this.f.bR instanceof cwr $$1 && $$1.m() instanceof dzd $$2) {
            $$2.a($$0.b(), $$0.f());
         }
      }
   }

   @Override
   public void a(ahd $$0) {
      zr.a($$0, this, this.f.y());
      if (this.f.s(2)) {
         dyo $$1 = this.f.dV().c_($$0.e());
         ua $$2 = $$1 != null ? $$1.d(this.f.dX()) : null;
         this.f.f.b(new agl($$0.b(), $$2));
      }
   }

   @Override
   public void a(ahz $$0) {
      zr.a($$0, this, this.f.y());
      if (b($$0.a(0.0), $$0.b(0.0), $$0.c(0.0), $$0.a(0.0F), $$0.b(0.0F))) {
         this.a(xg.c("multiplayer.disconnect.invalid_player_movement"));
      } else {
         asb $$1 = this.f.y();
         if (!this.f.k) {
            if (this.o == 0) {
               this.l();
            }

            if (this.f.gJ()) {
               float $$2 = azz.h($$0.a(this.f.dL()));
               float $$3 = azz.h($$0.b(this.f.dN()));
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

                        ffx $$18 = this.f.cR();
                        $$10 = $$4 - this.v;
                        $$11 = $$5 - this.w;
                        $$12 = $$6 - this.x;
                        boolean $$19 = $$11 > 0.0;
                        if (this.f.aH() && !$$0.b() && $$19) {
                           this.f.s();
                        }

                        boolean $$20 = this.f.R;
                        this.f.a(byj.b, new fgc($$10, $$11, $$12));
                        $$10 = $$4 - this.f.dA();
                        $$11 = $$5 - this.f.dC();
                        if ($$11 > -0.5 || $$11 < 0.5) {
                           $$11 = 0.0;
                        }

                        $$12 = $$6 - this.f.dG();
                        $$14 = $$10 * $$10 + $$11 * $$11 + $$12 * $$12;
                        boolean $$22 = false;
                        if (!this.f.Q() && $$14 > 0.0625 && !this.f.fR() && !this.f.h.e() && this.f.h.b() != dkg.d) {
                           $$22 = true;
                           h.warn("{} moved wrongly!", this.f.ai().getString());
                        }

                        if (this.f.ad || this.f.fR() || (!$$22 || !$$1.a(this.f, $$18)) && !this.a($$1, $$18, $$4, $$5, $$6)) {
                           this.f.a($$4, $$5, $$6, $$2, $$3);
                           boolean $$23 = this.f.fv();
                           this.I = $$11 >= -0.03125
                              && !$$20
                              && this.f.h.b() != dkg.d
                              && !this.d.ad()
                              && !this.f.gk().c
                              && !this.f.b(bwk.y)
                              && !$$15
                              && !$$23
                              && this.b(this.f);
                           this.f.y().m().a(this.f);
                           fgc $$24 = new fgc(this.f.dA() - $$7, this.f.dC() - $$8, this.f.dG() - $$9);
                           this.f.a($$0.b(), $$0.e(), $$24);
                           this.f.a($$24.d, $$24.e, $$24.f, $$0.b());
                           this.a($$24);
                           if ($$19) {
                              this.f.k();
                           }

                           if ($$0.b() || this.f.eg() || this.f.d_() || this.f.aa_() || $$15 || $$23) {
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
         dkf $$1 = this.f.y().O();
         return $$1.c(dkf.u) ? false : !$$0 || !$$1.c(dkf.v);
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

   private boolean a(dkm $$0, ffx $$1, double $$2, double $$3, double $$4) {
      ffx $$5 = this.f.cR().d($$2 - this.f.dA(), $$3 - this.f.dC(), $$4 - this.f.dG());
      Iterable<fgw> $$6 = $$0.d(this.f, $$5.h(1.0E-5F));
      fgw $$7 = fgt.a($$1.h(1.0E-5F));

      for (fgw $$8 : $$6) {
         if (!fgt.c($$8, $$7, fgg.i)) {
            return true;
         }
      }

      return false;
   }

   public void a(double $$0, double $$1, double $$2, float $$3, float $$4) {
      this.a(new bys(new fgc($$0, $$1, $$2), fgc.c, $$3, $$4), Collections.emptySet());
   }

   public void a(bys $$0, Set<byt> $$1) {
      this.H = this.o;
      if (++this.G == Integer.MAX_VALUE) {
         this.G = 0;
      }

      this.f.a($$0, $$1);
      this.F = this.f.dt();
      this.f.f.b(aeo.a(this.G, $$0, $$1));
   }

   @Override
   public void a(aig $$0) {
      zr.a($$0, this, this.f.y());
      if (this.f.gJ()) {
         iw $$1 = $$0.b();
         this.f.H();
         aig.a $$2 = $$0.f();
         switch ($$2) {
            case g:
               if (!this.f.aa_()) {
                  dak $$3 = this.f.b(bvb.b);
                  this.f.a(bvb.b, this.f.b(bvb.a));
                  this.f.a(bvb.a, $$3);
                  this.f.fF();
               }

               return;
            case e:
               if (!this.f.aa_()) {
                  this.f.a(false);
               }

               return;
            case d:
               if (!this.f.aa_()) {
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

   private static boolean a(asc $$0, dak $$1) {
      if ($$1.f()) {
         return false;
      } else {
         dag $$2 = $$1.h();
         return ($$2 instanceof cys || $$2 instanceof cyy) && !$$0.gF().a($$1);
      }
   }

   @Override
   public void a(ajc $$0) {
      zr.a($$0, this, this.f.y());
      if (this.f.gJ()) {
         this.f.f.a($$0.f());
         asb $$1 = this.f.y();
         bvb $$2 = $$0.b();
         dak $$3 = this.f.b($$2);
         if ($$3.a($$1.K())) {
            ffy $$4 = $$0.e();
            fgc $$5 = $$4.g();
            iw $$6 = $$4.b();
            if (this.f.a($$6, 1.0)) {
               fgc $$7 = $$5.d(fgc.b($$6));
               double $$8 = 1.0000001;
               if (Math.abs($$7.a()) < 1.0000001 && Math.abs($$7.b()) < 1.0000001 && Math.abs($$7.c()) < 1.0000001) {
                  jc $$9 = $$4.c();
                  this.f.H();
                  int $$10 = this.f.dV().ao();
                  if ($$6.v() <= $$10) {
                     if (this.F == null && $$1.a(this.f, $$6)) {
                        bvc $$11 = this.f.h.a(this.f, $$1, $$3, $$2, $$4);
                        if ($$11.a()) {
                           aq.P.a(this.f, $$4.b(), $$3.v());
                        }

                        if ($$9 == jc.b && !$$11.a() && $$6.v() >= $$10 && a(this.f, $$3)) {
                           xg $$12 = xg.a("build.tooHigh", $$10).a(o.m);
                           this.f.b($$12, true);
                        } else if ($$11 instanceof bvc.d $$13 && $$13.e() == bvc.e.c) {
                           this.f.a($$2, true);
                        }
                     }
                  } else {
                     xg $$14 = xg.a("build.tooHigh", $$10).a(o.m);
                     this.f.b($$14, true);
                  }

                  this.f.f.b(new acn($$1, $$6));
                  this.f.f.b(new acn($$1, $$6.a($$9)));
               } else {
                  h.warn("Rejecting UseItemOnPacket from {}: Location {} too far away from hit block {}.", new Object[]{this.f.gi().getName(), $$5, $$6});
               }
            }
         }
      }
   }

   @Override
   public void a(ajd $$0) {
      zr.a($$0, this, this.f.y());
      if (this.f.gJ()) {
         this.a($$0.e());
         asb $$1 = this.f.y();
         bvb $$2 = $$0.b();
         dak $$3 = this.f.b($$2);
         this.f.H();
         if (!$$3.f() && $$3.a($$1.K())) {
            float $$4 = azz.h($$0.f());
            float $$5 = azz.h($$0.g());
            if ($$5 != this.f.dN() || $$4 != this.f.dL()) {
               this.f.c($$4, $$5);
            }

            if (this.f.h.a(this.f, $$1, $$3, $$2) instanceof bvc.d $$7 && $$7.e() == bvc.e.c) {
               this.f.a($$2, true);
            }
         }
      }
   }

   @Override
   public void a(aja $$0) {
      zr.a($$0, this, this.f.y());
      if (this.f.aa_()) {
         for (asb $$1 : this.d.L()) {
            bxe $$2 = $$0.a($$1);
            if ($$2 != null) {
               this.f.a($$1, $$2.dA(), $$2.dC(), $$2.dG(), Set.of(), $$2.dL(), $$2.dN(), true);
               return;
            }
         }
      }
   }

   @Override
   public void a(aib $$0) {
      zr.a($$0, this, this.f.y());
      if (this.f.dl() instanceof cut $$2) {
         $$2.a($$0.b(), $$0.e());
      }
   }

   @Override
   public void a(vx $$0) {
      h.info("{} lost connection: {}", this.f.ai().getString(), $$0.a().getString());
      this.q();
      super.a($$0);
   }

   private void q() {
      this.U.close();
      this.d.av();
      this.d.ag().a(xg.a("multiplayer.player.left", this.f.m_()).a(o.o), false);
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
   public void a(air $$0) {
      zr.a($$0, this, this.f.y());
      if ($$0.b() >= 0 && $$0.b() < csh.h()) {
         if (this.f.gj().f() != $$0.b() && this.f.fA() == bvb.a) {
            this.f.fF();
         }

         this.f.gj().c($$0.b());
         this.f.H();
      } else {
         h.warn("{} tried to set an invalid carried item", this.f.ai().getString());
      }
   }

   @Override
   public void a(ahi $$0) {
      Optional<xn> $$1 = this.a($$0.h());
      if (!$$1.isEmpty()) {
         this.a($$0.b(), () -> {
            xw $$2;
            try {
               $$2 = this.a($$0, $$1.get());
            } catch (ya.a var6) {
               this.a(var6);
               return;
            }

            CompletableFuture<asu> $$5 = this.a($$2.c());
            xg $$6 = this.d.bk().decorate(this.f, $$2.d());
            this.U.append($$5, $$2x -> {
               xw $$3 = $$2.a($$6).a($$2x.e());
               this.a($$3);
            });
         });
      }
   }

   @Override
   public void a(ahg $$0) {
      this.a($$0.b(), () -> {
         this.b($$0.b());
         this.r();
      });
   }

   private void b(String $$0) {
      ParseResults<ek> $$1 = this.c($$0);
      if (this.d.aA() && xy.a($$1)) {
         h.error("Received unsigned command packet from {}, but the command requires signable arguments: {}", this.f.gi().getName(), $$0);
         this.f.a(m);
      } else {
         this.d.aG().a($$1, $$0);
      }
   }

   @Override
   public void a(ahh $$0) {
      Optional<xn> $$1 = this.a($$0.h());
      if (!$$1.isEmpty()) {
         this.a($$0.b(), () -> {
            this.a($$0, $$1.get());
            this.r();
         });
      }
   }

   private void a(ahh $$0, xn $$1) {
      ParseResults<ek> $$2 = this.c($$0.b());

      Map<String, xw> $$3;
      try {
         $$3 = this.a($$0, xy.b($$2), $$1);
      } catch (ya.a var6) {
         this.a(var6);
         return;
      }

      ei $$6 = new ei.a($$3);
      $$2 = el.a($$2, $$1x -> $$1x.a($$6, this.U));
      this.d.aG().a($$2, $$0.b());
   }

   private void a(ya.a $$0) {
      h.warn("Failed to update secure chat state for {}: '{}'", this.f.gi().getName(), $$0.a().getString());
      this.f.a($$0.a().f().a(o.m));
   }

   private <S> Map<String, xw> a(ahh $$0, xy<S> $$1, xn $$2) throws ya.a {
      List<er.a> $$3 = $$0.g().a();
      List<xy.a<S>> $$4 = $$1.a();
      if ($$3.isEmpty()) {
         return this.b($$4);
      } else {
         Map<String, xw> $$5 = new Object2ObjectOpenHashMap();

         for (er.a $$6 : $$3) {
            xy.a<S> $$7 = $$1.a($$6.a());
            if ($$7 == null) {
               this.Q.setChainBroken();
               throw a($$0.b(), $$3, $$4);
            }

            xz $$8 = new xz($$7.c(), $$0.e(), $$0.f(), $$2);
            $$5.put($$7.a(), this.Q.unpack($$6.b(), $$8));
         }

         for (xy.a<S> $$9 : $$4) {
            if (!$$5.containsKey($$9.a())) {
               throw a($$0.b(), $$3, $$4);
            }
         }

         return $$5;
      }
   }

   private <S> Map<String, xw> b(List<xy.a<S>> $$0) throws ya.a {
      Map<String, xw> $$1 = new HashMap<>();

      for (xy.a<S> $$2 : $$0) {
         xz $$3 = xz.a($$2.c());
         $$1.put($$2.a(), this.Q.unpack(null, $$3));
      }

      return $$1;
   }

   private static <S> ya.a a(String $$0, List<er.a> $$1, List<xy.a<S>> $$2) {
      String $$3 = $$1.stream().map(er.a::a).collect(Collectors.joining(", "));
      String $$4 = $$2.stream().map(xy.a::a).collect(Collectors.joining(", "));
      h.error("Signed command mismatch between server and client ('{}'): got [{}] from client, but expected [{}]", new Object[]{$$0, $$3, $$4});
      return new ya.a(m);
   }

   private ParseResults<ek> c(String $$0) {
      CommandDispatcher<ek> $$1 = this.d.aG().a();
      return $$1.parse($$0, this.f.A());
   }

   private void a(String $$0, Runnable $$1) {
      if (d($$0)) {
         this.a(xg.c("multiplayer.disconnect.illegal_characters"));
      } else if (this.f.E() == csf.c) {
         this.b(new agj(xg.c("chat.disabled.options").a(o.m), false));
      } else {
         this.f.H();
         this.d.execute($$1);
      }
   }

   private Optional<xn> a(xn.b $$0) {
      synchronized (this.R) {
         Optional var10000;
         try {
            xn $$1 = this.R.a($$0);
            var10000 = Optional.of($$1);
         } catch (xp.a var5) {
            h.error("Failed to validate message acknowledgements from {}: {}", this.f.ai().getString(), var5.getMessage());
            this.a(l);
            return Optional.empty();
         }

         return var10000;
      }
   }

   private static boolean d(String $$0) {
      for (int $$1 = 0; $$1 < $$0.length(); $$1++) {
         if (!bay.a($$0.charAt($$1))) {
            return true;
         }
      }

      return false;
   }

   private xw a(ahi $$0, xn $$1) throws ya.a {
      xz $$2 = new xz($$0.b(), $$0.e(), $$0.f(), $$1);
      return this.Q.unpack($$0.g(), $$2);
   }

   private void a(xw $$0) {
      this.d.ag().a($$0, this.f, xc.a(xc.e, this.f));
      this.r();
   }

   private void r() {
      this.q.a();
      if (!this.q.c() && !this.d.ag().f(this.f.gi()) && !this.d.a(this.f.gi())) {
         this.a(xg.c("disconnect.spam"));
      }
   }

   @Override
   public void a(ahf $$0) {
      synchronized (this.R) {
         try {
            this.R.a($$0.b());
         } catch (xp.a var5) {
            h.error("Failed to validate message acknowledgement offset from {}: {}", this.f.ai().getString(), var5.getMessage());
            this.a(l);
         }
      }
   }

   @Override
   public void a(aiz $$0) {
      zr.a($$0, this, this.f.y());
      this.f.H();
      this.f.a($$0.b());
   }

   @Override
   public void a(aih $$0) {
      zr.a($$0, this, this.f.y());
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
               if (this.f.dl() instanceof byp $$1) {
                  int $$2 = $$0.f();
                  if ($$1.a() && $$2 > 0) {
                     $$1.c($$2);
                  }
               }
               break;
            case g:
               if (this.f.dl() instanceof byp $$3) {
                  $$3.b();
               }
               break;
            case h:
               if (this.f.dk() instanceof bxv $$4) {
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

   public void a(xw $$0, xc.a $$1) {
      this.b(new aeh(this.S++, $$0.k().c(), $$0.k().b(), $$0.l(), $$0.m().a(this.T), $$0.n(), $$0.o(), $$1));
      xs $$2 = $$0.l();
      if ($$2 != null) {
         this.T.a($$0.m(), $$0.l());
         int $$3;
         synchronized (this.R) {
            this.R.a($$2);
            $$3 = this.R.a();
         }

         if ($$3 > 4096) {
            this.a(xg.c("multiplayer.disconnect.too_many_pending_chats"));
         }
      }
   }

   public void a(xg $$0, xc.a $$1) {
      this.b(new adh($$0, $$1));
   }

   public SocketAddress m() {
      return this.e.d();
   }

   public void n() {
      this.V = true;
      this.q();
      this.b(agh.a);
      this.e.a(abu.d);
   }

   @Override
   public void a(akk $$0) {
      this.e.a(new akh($$0.b()));
   }

   @Override
   public void a(ahw $$0) {
      zr.a($$0, this, this.f.y());
      if (this.f.gJ()) {
         final asb $$1 = this.f.y();
         final bxe $$2 = $$0.a($$1);
         this.f.H();
         this.f.g($$0.b());
         if ($$2 != null) {
            if (!$$1.E_().a($$2.dv())) {
               return;
            }

            ffx $$3 = $$2.cR();
            if (this.f.a($$3, 3.0)) {
               $$0.a(new ahw.c() {
                  private void a(bvb $$0, ate.a $$1x) {
                     dak $$2 = ate.this.f.b($$0);
                     if ($$2.a($$1.K())) {
                        dak $$3 = $$2.v();
                        if ($$1.run(ate.this.f, $$2, $$0) instanceof bvc.d $$5) {
                           dak $$6 = $$5.c() ? $$3 : dak.l;
                           aq.T.a(ate.this.f, $$6, $$2);
                           if ($$5.e() == bvc.e.c) {
                              ate.this.f.a($$0, true);
                           }
                        }
                     }
                  }

                  @Override
                  public void a(bvb $$0) {
                     this.a($$0, csi::a);
                  }

                  @Override
                  public void a(bvb $$0, fgc $$1x) {
                     this.a($$0, ($$1xxx, $$2xx, $$3) -> $$2xx.a($$1xxx, $$1, $$3));
                  }

                  @Override
                  public void a() {
                     label23:
                     if (!($$2 instanceof coo) && !($$2 instanceof bxs) && $$2 != ate.this.f) {
                        if ($$2 instanceof csq $$0 && !$$0.cB()) {
                           break label23;
                        }

                        dak $$1 = ate.this.f.b(bvb.a);
                        if (!$$1.a($$1.K())) {
                           return;
                        }

                        ate.this.f.e($$2);
                        return;
                     }

                     ate.this.a(xg.c("multiplayer.disconnect.invalid_entity_attacked"));
                     ate.h.warn("Player {} tried to attack an invalid entity", ate.this.f.ai().getString());
                  }
               });
            }
         }
      }
   }

   @Override
   public void a(ahl $$0) {
      zr.a($$0, this, this.f.y());
      this.f.H();
      ahl.a $$1 = $$0.b();
      switch ($$1) {
         case a:
            if (this.f.k) {
               this.f.k = false;
               this.f = this.d.ag().a(this.f, true, bxe.d.e);
               this.l();
               aq.w.a(this.f, dkj.k, dkj.i);
            } else {
               if (this.f.eG() > 0.0F) {
                  return;
               }

               this.f = this.d.ag().a(this.f, false, bxe.d.a);
               this.l();
               if (this.d.v_()) {
                  this.f.a(dkg.d);
                  this.f.y().O().b(dkf.s).a(false, this.d);
               }
            }
            break;
         case b:
            this.f.I().a(this.f);
      }
   }

   @Override
   public void a(ahr $$0) {
      zr.a($$0, this, this.f.y());
      this.f.q();
   }

   @Override
   public void a(ahq $$0) {
      zr.a($$0, this, this.f.y());
      this.f.H();
      if (this.f.bR.l == $$0.b()) {
         if (this.f.aa_()) {
            this.f.bR.b();
         } else if (!this.f.bR.b(this.f)) {
            h.debug("Player {} interacted with invalid menu {}", this.f, this.f.bR);
         } else {
            int $$1 = $$0.f();
            if (!this.f.bR.a($$1)) {
               h.debug("Player {} clicked invalid slot index: {}, available slots: {}", new Object[]{this.f.ai(), $$1, this.f.bR.k.size()});
            } else {
               boolean $$2 = $$0.e() != this.f.bR.j();
               this.f.bR.h();
               this.f.bR.a($$1, $$0.g(), $$0.h(), this.f);
               ObjectIterator var4 = Int2ObjectMaps.fastIterable($$0.i()).iterator();

               while (var4.hasNext()) {
                  Entry<wb> $$3 = (Entry<wb>)var4.next();
                  this.f.bR.a($$3.getIntKey(), (wb)$$3.getValue());
               }

               this.f.bR.a($$0.j());
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
   public void a(aie $$0) {
      zr.a($$0, this, this.f.y());
      this.f.H();
      if (!this.f.aa_() && this.f.bR.l == $$0.b()) {
         if (!this.f.bR.b(this.f)) {
            h.debug("Player {} interacted with invalid menu {}", this.f, this.f.bR);
         } else {
            dfi.d $$1 = this.d.aI().a($$0.e());
            if ($$1 != null) {
               dfg<?> $$2 = $$1.b();
               if (this.f.J().b($$2.a())) {
                  if (this.f.bR instanceof cxq $$3) {
                     if ($$2.b().aq_().c()) {
                        h.debug("Player {} tried to place impossible recipe {}", this.f, $$2.a().a());
                        return;
                     }

                     cxq.a $$4 = $$3.a($$0.f(), this.f.b(), $$2, this.f.y(), this.f.gj());
                     if ($$4 == cxq.a.b) {
                        this.f.f.b(new aef(this.f.bR.l, $$1.a().b()));
                     }
                  }
               }
            }
         }
      }
   }

   @Override
   public void a(ahp $$0) {
      zr.a($$0, this, this.f.y());
      this.f.H();
      if (this.f.bR.l == $$0.b() && !this.f.aa_()) {
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
   public void a(aiu $$0) {
      zr.a($$0, this, this.f.y());
      if (this.f.fV()) {
         boolean $$1 = $$0.b() < 0;
         dak $$2 = $$0.e();
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
   public void a(aiy $$0) {
      List<String> $$1 = Stream.of($$0.f()).map(o::a).collect(Collectors.toList());
      this.a($$1).thenAcceptAsync($$1x -> this.a($$0, $$1x), this.d);
   }

   private void a(aiy $$0, List<asu> $$1) {
      this.f.H();
      asb $$2 = this.f.y();
      iw $$3 = $$0.b();
      if ($$2.C($$3)) {
         if (!($$2.c_($$3) instanceof eac $$5)) {
            return;
         }

         $$5.a(this.f, $$0.e(), $$1);
      }
   }

   @Override
   public void a(aif $$0) {
      zr.a($$0, this, this.f.y());
      this.f.gk().b = $$0.b() && this.f.gk().c;
   }

   @Override
   public void a(aak $$0) {
      zr.a($$0, this, this.f.y());
      boolean $$1 = this.f.a(csk.g);
      this.f.a($$0.b());
      if (this.f.a(csk.g) != $$1) {
         this.d.ag().a(new aem(aem.a.h, this.f));
      }
   }

   @Override
   public void a(ahe $$0) {
      zr.a($$0, this, this.f.y());
      if (this.f.s(2) || this.h()) {
         this.d.a($$0.b(), false);
      }
   }

   @Override
   public void a(ahy $$0) {
      zr.a($$0, this, this.f.y());
      if (this.f.s(2) || this.h()) {
         this.d.b($$0.b());
      }
   }

   @Override
   public void a(ahj $$0) {
      zr.a($$0, this, this.f.y());
      xx.a $$1 = $$0.b();
      csm.a $$2 = this.P != null ? this.P.d().b() : null;
      csm.a $$3 = $$1.b();
      if (!Objects.equals($$2, $$3)) {
         if ($$2 != null && $$3.b().isBefore($$2.b())) {
            this.a(csm.a);
         } else {
            try {
               bao $$4 = this.d.ar();
               if ($$4 == null) {
                  h.warn("Ignoring chat session from {} due to missing Services public key", this.f.gi().getName());
                  return;
               }

               this.a($$1.a(this.f.gi(), $$4));
            } catch (csm.b var6) {
               h.error("Failed to validate profile key: {}", var6.getMessage());
               this.a(var6.a());
            }
         }
      }
   }

   @Override
   public void a(aho $$0) {
      if (!this.V) {
         throw new IllegalStateException("Client acknowledged config, but none was requested");
      } else {
         this.e.a(abu.b, new atc(this.d, this.e, this.a(this.f.C())));
      }
   }

   @Override
   public void a(ahk $$0) {
      zr.a($$0, this, this.f.y());
      this.g.a($$0.b());
   }

   @Override
   public void a(aht $$0) {
      zr.a($$0, this, this.f.y());
      this.d.a(this.f, $$0.b());
   }

   private void a(xx $$0) {
      this.P = $$0;
      this.Q = $$0.a(this.f.cG());
      this.U.append(() -> {
         this.f.a($$0);
         this.d.ag().a(new aem(EnumSet.of(aem.a.b), List.of(this.f)));
      });
   }

   @Override
   public void a(aal $$0) {
   }

   @Override
   public void a(ahm $$0) {
      zr.a($$0, this, this.f.y());
      if (!this.O) {
         this.f.a(fgc.c);
      }

      this.O = false;
   }

   private void a(fgc $$0) {
      if ($$0.h() > 1.0E-5F) {
         this.f.H();
      }

      this.f.a($$0);
      this.O = true;
   }

   @Override
   public boolean a() {
      return this.f.fV();
   }

   @Override
   public asc o() {
      return this.f;
   }

   @FunctionalInterface
   interface a {
      bvc run(asc var1, bxe var2, bvb var3);
   }
}
