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
import org.slf4j.Logger;

public class are extends arb implements afx, arh, wg {
   static final Logger g = LogUtils.getLogger();
   private static final int h = -1;
   private static final int i = 4096;
   private static final int j = 80;
   private static final ws k = ws.c("multiplayer.disconnect.chat_validation_failed");
   private static final int l = 1000;
   public aqf e;
   public final ara f;
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
   private bql w;
   private double x;
   private double y;
   private double z;
   private double A;
   private double B;
   private double C;
   @Nullable
   private etf D;
   private int E;
   private int F;
   private boolean G;
   private int H;
   private boolean I;
   private int J;
   private int K;
   private int L;
   @Nullable
   private xj M;
   private xm.b N;
   private final xb O = new xb(20);
   private final xf P = xf.a();
   private final axk Q;
   private boolean R;

   public are(MinecraftServer $$0, vq $$1, aqf $$2, aqt $$3) {
      super($$0, $$1, $$3);
      this.f = new ara($$1.e());
      this.e = $$2;
      $$2.d = this;
      $$2.X().a();
      this.N = xm.b.unsigned($$2.cx(), $$0::aB);
      this.Q = new axk($$0);
   }

   @Override
   public void e() {
      if (this.n > -1) {
         this.b(new abp(this.n));
         this.n = -1;
      }

      this.m();
      this.e.L = this.e.ds();
      this.e.M = this.e.du();
      this.e.N = this.e.dy();
      this.e.m();
      this.e.a(this.q, this.r, this.s, this.e.dD(), this.e.dF());
      this.m++;
      this.L = this.K;
      if (this.G && !this.e.fJ() && !this.e.bP() && !this.e.ez()) {
         if (++this.H > this.a((bql)this.e)) {
            g.warn("{} was kicked for floating too long!", this.e.ad().getString());
            this.b(ws.c("multiplayer.disconnect.flying"));
            return;
         }
      } else {
         this.G = false;
         this.H = 0;
      }

      this.w = this.e.cX();
      if (this.w != this.e && this.w.cO() == this.e) {
         this.x = this.w.ds();
         this.y = this.w.du();
         this.z = this.w.dy();
         this.A = this.w.ds();
         this.B = this.w.du();
         this.C = this.w.dy();
         if (this.I && this.w.cO() == this.e) {
            if (++this.J > this.a(this.w)) {
               g.warn("{} was kicked for floating a vehicle too long!", this.e.ad().getString());
               this.b(ws.c("multiplayer.disconnect.flying"));
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

      if (this.e.M() > 0L && this.c.aq() > 0 && ac.b() - this.e.M() > (long)this.c.aq() * 1000L * 60L) {
         this.b(ws.c("multiplayer.disconnect.idling"));
      }
   }

   private int a(bql $$0) {
      double $$1 = $$0.aX();
      if ($$1 < 1.0E-5F) {
         return Integer.MAX_VALUE;
      } else {
         double $$2 = 0.08 / $$1;
         return axw.c(80.0 * Math.max($$2, 1.0));
      }
   }

   public void m() {
      this.q = this.e.ds();
      this.r = this.e.du();
      this.s = this.e.dy();
      this.t = this.e.ds();
      this.u = this.e.du();
      this.v = this.e.dy();
   }

   @Override
   public boolean c() {
      return this.d.i() && !this.R;
   }

   @Override
   public boolean a(yz<?> $$0) {
      return super.a($$0) ? true : this.R && this.d.i() && $$0 instanceof agj;
   }

   @Override
   protected GameProfile j() {
      return this.e.fZ();
   }

   private <T, R> CompletableFuture<R> a(T $$0, BiFunction<arj, T, CompletableFuture<R>> $$1) {
      return $$1.apply(this.e.X(), $$0).thenApply($$0x -> {
         if (!this.c()) {
            g.debug("Ignoring packet due to disconnection");
            throw new CancellationException("disconnected");
         } else {
            return (R)$$0x;
         }
      });
   }

   private CompletableFuture<aqw> a(String $$0) {
      return this.a($$0, arj::a);
   }

   private CompletableFuture<List<aqw>> a(List<String> $$0) {
      return this.a($$0, arj::a);
   }

   @Override
   public void a(ahc $$0) {
      zc.a($$0, this, this.e.z());
      this.e.a($$0.b(), $$0.e(), $$0.f(), $$0.g());
   }

   private static boolean b(double $$0, double $$1, double $$2, float $$3, float $$4) {
      return Double.isNaN($$0) || Double.isNaN($$1) || Double.isNaN($$2) || !Floats.isFinite($$4) || !Floats.isFinite($$3);
   }

   private static double a(double $$0) {
      return axw.a($$0, -3.0E7, 3.0E7);
   }

   private static double b(double $$0) {
      return axw.a($$0, -2.0E7, 2.0E7);
   }

   @Override
   public void a(agv $$0) {
      zc.a($$0, this, this.e.z());
      if (b($$0.b(), $$0.e(), $$0.f(), $$0.g(), $$0.h())) {
         this.b(ws.c("multiplayer.disconnect.invalid_vehicle_movement"));
      } else {
         bql $$1 = this.e.cX();
         if ($$1 != this.e && $$1.cO() == this.e && $$1 == this.w) {
            aqe $$2 = this.e.z();
            double $$3 = $$1.ds();
            double $$4 = $$1.du();
            double $$5 = $$1.dy();
            double $$6 = a($$0.b());
            double $$7 = b($$0.e());
            double $$8 = a($$0.f());
            float $$9 = axw.g($$0.g());
            float $$10 = axw.g($$0.h());
            double $$11 = $$6 - this.x;
            double $$12 = $$7 - this.y;
            double $$13 = $$8 - this.z;
            double $$14 = $$1.dq().g();
            double $$15 = $$11 * $$11 + $$12 * $$12 + $$13 * $$13;
            if ($$15 - $$14 > 100.0 && !this.i()) {
               g.warn("{} (vehicle of {}) moved too quickly! {},{},{}", new Object[]{$$1.ad().getString(), this.e.ad().getString(), $$11, $$12, $$13});
               this.b(new adf($$1));
               return;
            }

            boolean $$16 = $$2.a($$1, $$1.cI().h(0.0625));
            $$11 = $$6 - this.A;
            $$12 = $$7 - this.B - 1.0E-6;
            $$13 = $$8 - this.C;
            boolean $$17 = $$1.S;
            if ($$1 instanceof bre $$18 && $$18.q_()) {
               $$18.n();
            }

            $$1.a(brj.b, new etf($$11, $$12, $$13));
            $$11 = $$6 - $$1.ds();
            $$12 = $$7 - $$1.du();
            if ($$12 > -0.5 || $$12 < 0.5) {
               $$12 = 0.0;
            }

            $$13 = $$8 - $$1.dy();
            $$15 = $$11 * $$11 + $$12 * $$12 + $$13 * $$13;
            boolean $$20 = false;
            if ($$15 > 0.0625) {
               $$20 = true;
               g.warn("{} (vehicle of {}) moved wrongly! {}", new Object[]{$$1.ad().getString(), this.e.ad().getString(), Math.sqrt($$15)});
            }

            $$1.a($$6, $$7, $$8, $$9, $$10);
            boolean $$21 = $$2.a($$1, $$1.cI().h(0.0625));
            if ($$16 && ($$20 || !$$21)) {
               $$1.a($$3, $$4, $$5, $$9, $$10);
               this.b(new adf($$1));
               return;
            }

            this.e.z().l().a(this.e);
            this.e.b(this.e.ds() - $$3, this.e.du() - $$4, this.e.dy() - $$5);
            this.I = $$12 >= -0.03125 && !$$17 && !this.c.ae() && !$$1.aV() && this.b($$1);
            this.A = $$1.ds();
            this.B = $$1.du();
            this.C = $$1.dy();
         }
      }
   }

   private boolean b(bql $$0) {
      return $$0.dN().a($$0.cI().g(0.0625).b(0.0, -0.55, 0.0)).allMatch(dpx.a::i);
   }

   @Override
   public void a(afz $$0) {
      zc.a($$0, this, this.e.z());
      if ($$0.b() == this.E) {
         if (this.D == null) {
            this.b(ws.c("multiplayer.disconnect.invalid_player_movement"));
            return;
         }

         this.e.a(this.D.c, this.D.d, this.D.e, this.e.dD(), this.e.dF());
         this.t = this.D.c;
         this.u = this.D.d;
         this.v = this.D.e;
         if (this.e.O()) {
            this.e.P();
         }

         this.D = null;
      }
   }

   @Override
   public void a(ahe $$0) {
      zc.a($$0, this, this.e.z());
      this.c.aJ().a($$0.b()).ifPresent(this.e.I()::e);
   }

   @Override
   public void a(ahd $$0) {
      zc.a($$0, this, this.e.z());
      this.e.I().a($$0.b(), $$0.e(), $$0.f());
   }

   @Override
   public void a(ahg $$0) {
      zc.a($$0, this, this.e.z());
      if ($$0.e() == ahg.a.a) {
         akf $$1 = Objects.requireNonNull($$0.f());
         af $$2 = this.c.aE().a($$1);
         if ($$2 != null) {
            this.e.Q().a($$2);
         }
      }
   }

   @Override
   public void a(agi $$0) {
      zc.a($$0, this, this.e.z());
      StringReader $$1 = new StringReader($$0.e());
      if ($$1.canRead() && $$1.peek() == '/') {
         $$1.skip();
      }

      ParseResults<ec> $$2 = this.c.aH().a().parse($$1, this.e.de());
      this.c.aH().a().getCompletionSuggestions($$2).thenAccept($$1x -> {
         Suggestions $$2x = $$1x.getList().size() <= 1000 ? $$1x : new Suggestions($$1x.getRange(), $$1x.getList().subList(0, 1000));
         this.b(new acc($$0.b(), $$2x));
      });
   }

   @Override
   public void a(ahk $$0) {
      zc.a($$0, this, this.e.z());
      if (!this.c.q()) {
         this.e.a(ws.c("advMode.notEnabled"));
      } else if (!this.e.gx()) {
         this.e.a(ws.c("advMode.notAllowed"));
      } else {
         cyv $$1 = null;
         dnn $$2 = null;
         im $$3 = $$0.b();
         dnd $$4 = this.e.dN().c_($$3);
         if ($$4 instanceof dnn) {
            $$2 = (dnn)$$4;
            $$1 = $$2.b();
         }

         String $$5 = $$0.e();
         boolean $$6 = $$0.f();
         if ($$1 != null) {
            dnn.a $$7 = $$2.l();
            dpy $$8 = this.e.dN().a_($$3);
            ir $$9 = $$8.c(dee.b);

            dpy $$13 = (switch ($$0.i()) {
               case a -> dcx.kH.n();
               case b -> dcx.kG.n();
               default -> dcx.fN.n();
            }).a(dee.b, $$9).a(dee.c, Boolean.valueOf($$0.g()));
            if ($$13 != $$8) {
               this.e.dN().a($$3, $$13, 2);
               $$4.b($$13);
               this.e.dN().m($$3).a($$4);
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
            if (!ayr.b($$5)) {
               this.e.a(ws.a("advMode.setCommand.success", $$5));
            }
         }
      }
   }

   @Override
   public void a(ahl $$0) {
      zc.a($$0, this, this.e.z());
      if (!this.c.q()) {
         this.e.a(ws.c("advMode.notEnabled"));
      } else if (!this.e.gx()) {
         this.e.a(ws.c("advMode.notAllowed"));
      } else {
         cyv $$1 = $$0.a(this.e.dN());
         if ($$1 != null) {
            $$1.a($$0.b());
            $$1.a($$0.e());
            if (!$$0.e()) {
               $$1.c(null);
            }

            $$1.f();
            this.e.a(ws.a("advMode.setCommand.success", $$0.b()));
         }
      }
   }

   @Override
   public void a(agx $$0) {
      zc.a($$0, this, this.e.z());
      this.e.ga().c($$0.b());
      this.e.d.b(new ach(-2, 0, this.e.ga().l, this.e.ga().a(this.e.ga().l)));
      this.e.d.b(new ach(-2, 0, $$0.b(), this.e.ga().a($$0.b())));
      this.e.d.b(new aej(this.e.ga().l));
   }

   @Override
   public void a(ahf $$0) {
      zc.a($$0, this, this.e.z());
      if (this.e.cc instanceof cnj $$1) {
         if (!$$1.a(this.e)) {
            g.debug("Player {} interacted with invalid menu {}", this.e, $$1);
            return;
         }

         $$1.a($$0.b());
      }
   }

   @Override
   public void a(ahi $$0) {
      zc.a($$0, this, this.e.z());
      if (this.e.cc instanceof cnk $$1) {
         if (!this.e.cc.a(this.e)) {
            g.debug("Player {} interacted with invalid menu {}", this.e, this.e.cc);
            return;
         }

         $$1.a($$0.b(), $$0.e());
      }
   }

   @Override
   public void a(aho $$0) {
      zc.a($$0, this, this.e.z());
      if (this.e.gx()) {
         im $$1 = $$0.b();
         dpy $$2 = this.e.dN().a_($$1);
         if (this.e.dN().c_($$1) instanceof dos $$4) {
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
               if ($$0.e() == dos.a.b) {
                  if ($$4.z()) {
                     this.e.a(ws.a("structure_block.save_success", $$5), false);
                  } else {
                     this.e.a(ws.a("structure_block.save_failure", $$5), false);
                  }
               } else if ($$0.e() == dos.a.c) {
                  if (!$$4.B()) {
                     this.e.a(ws.a("structure_block.load_not_found", $$5), false);
                  } else if ($$4.a(this.e.z())) {
                     this.e.a(ws.a("structure_block.load_success", $$5), false);
                  } else {
                     this.e.a(ws.a("structure_block.load_prepare", $$5), false);
                  }
               } else if ($$0.e() == dos.a.d) {
                  if ($$4.y()) {
                     this.e.a(ws.a("structure_block.size_success", $$5), false);
                  } else {
                     this.e.a(ws.c("structure_block.size_failure"), false);
                  }
               }
            } else {
               this.e.a(ws.a("structure_block.invalid_structure_name", $$0.g()), false);
            }

            $$4.e();
            this.e.dN().a($$1, $$2, $$2, 3);
         }
      }
   }

   @Override
   public void a(ahn $$0) {
      zc.a($$0, this, this.e.z());
      if (this.e.gx()) {
         im $$1 = $$0.b();
         dpy $$2 = this.e.dN().a_($$1);
         if (this.e.dN().c_($$1) instanceof dod $$4) {
            $$4.a($$0.e());
            $$4.b($$0.f());
            $$4.a(ake.a(ld.aL, $$0.g()));
            $$4.a($$0.h());
            $$4.a($$0.i());
            $$4.a($$0.k());
            $$4.b($$0.j());
            $$4.e();
            this.e.dN().a($$1, $$2, $$2, 3);
         }
      }
   }

   @Override
   public void a(ags $$0) {
      zc.a($$0, this, this.e.z());
      if (this.e.gx()) {
         im $$1 = $$0.b();
         if (this.e.dN().c_($$1) instanceof dod $$3) {
            $$3.a(this.e.z(), $$0.e(), $$0.f());
         }
      }
   }

   @Override
   public void a(ahh $$0) {
      zc.a($$0, this, this.e.z());
      int $$1 = $$0.b();
      if (this.e.cc instanceof cor $$2) {
         if (!$$2.a(this.e)) {
            g.debug("Player {} interacted with invalid menu {}", this.e, $$2);
            return;
         }

         $$2.e($$1);
         $$2.h($$1);
      }
   }

   @Override
   public void a(agp $$0) {
      int $$1 = $$0.b();
      if (ckk.d($$1) || $$1 == 40) {
         List<String> $$2 = Lists.newArrayList();
         Optional<String> $$3 = $$0.f();
         $$3.ifPresent($$2::add);
         $$0.e().stream().limit(100L).forEach($$2::add);
         Consumer<List<aqw>> $$4 = $$3.isPresent() ? $$1x -> this.a((aqw)$$1x.get(0), $$1x.subList(1, $$1x.size()), $$1) : $$1x -> this.a($$1x, $$1);
         this.a($$2).thenAcceptAsync($$4, this.c);
      }
   }

   private void a(List<aqw> $$0, int $$1) {
      csd $$2 = this.e.ga().a($$1);
      if ($$2.a(csg.tZ)) {
         List<aqv<String>> $$3 = $$0.stream().map(this::a).toList();
         $$2.b(jz.z, new cvi($$3));
      }
   }

   private void a(aqw $$0, List<aqw> $$1, int $$2) {
      csd $$3 = this.e.ga().a($$2);
      if ($$3.a(csg.tZ)) {
         csd $$4 = $$3.a(csg.ua, 1);
         $$4.c(jz.z);
         List<aqv<ws>> $$5 = $$1.stream().map($$0x -> this.a($$0x).a(ws::b)).toList();
         $$4.b(jz.A, new cvj(this.a($$0), this.e.ad().getString(), 0, $$5, true));
         this.e.ga().a($$2, $$4);
      }
   }

   private aqv<String> a(aqw $$0) {
      return this.e.Y() ? aqv.a($$0.b()) : aqv.a($$0);
   }

   @Override
   public void a(agq $$0) {
      zc.a($$0, this, this.e.z());
      if (this.e.m(2)) {
         bql $$1 = this.e.dN().a($$0.e());
         if ($$1 != null) {
            ty $$2 = $$1.f(new ty());
            this.e.d.b(new afj($$0.b(), $$2));
         }
      }
   }

   @Override
   public void a(agn $$0) {
      zc.a($$0, this, this.e.z());
      if (!this.e.N_() && $$0.e() == this.e.cc.j) {
         if (this.e.cc instanceof cnv $$1 && $$1.m() instanceof dnr $$2) {
            $$2.a($$0.b(), $$0.f());
         }
      }
   }

   @Override
   public void a(aga $$0) {
      zc.a($$0, this, this.e.z());
      if (this.e.m(2)) {
         dnd $$1 = this.e.dN().c_($$0.e());
         ty $$2 = $$1 != null ? $$1.d(this.e.dP()) : null;
         this.e.d.b(new afj($$0.b(), $$2));
      }
   }

   @Override
   public void a(agu $$0) {
      zc.a($$0, this, this.e.z());
      if (b($$0.a(0.0), $$0.b(0.0), $$0.c(0.0), $$0.a(0.0F), $$0.b(0.0F))) {
         this.b(ws.c("multiplayer.disconnect.invalid_player_movement"));
      } else {
         aqe $$1 = this.e.z();
         if (!this.e.h) {
            if (this.m == 0) {
               this.m();
            }

            if (this.D != null) {
               if (this.m - this.F > 20) {
                  this.F = this.m;
                  this.a(this.D.c, this.D.d, this.D.e, this.e.dD(), this.e.dF());
               }
            } else {
               this.F = this.m;
               double $$2 = a($$0.a(this.e.ds()));
               double $$3 = b($$0.b(this.e.du()));
               double $$4 = a($$0.c(this.e.dy()));
               float $$5 = axw.g($$0.a(this.e.dD()));
               float $$6 = axw.g($$0.b(this.e.dF()));
               if (this.e.bP()) {
                  this.e.a(this.e.ds(), this.e.du(), this.e.dy(), $$5, $$6);
                  this.e.z().l().a(this.e);
               } else {
                  double $$7 = this.e.ds();
                  double $$8 = this.e.du();
                  double $$9 = this.e.dy();
                  double $$10 = $$2 - this.q;
                  double $$11 = $$3 - this.r;
                  double $$12 = $$4 - this.s;
                  double $$13 = this.e.dq().g();
                  double $$14 = $$10 * $$10 + $$11 * $$11 + $$12 * $$12;
                  if (this.e.fJ()) {
                     if ($$14 > 1.0) {
                        this.a(this.e.ds(), this.e.du(), this.e.dy(), $$5, $$6);
                     }
                  } else {
                     boolean $$15 = this.e.fC();
                     if ($$1.s().i()) {
                        this.K++;
                        int $$16 = this.K - this.L;
                        if ($$16 > 5) {
                           g.debug("{} is sending move packets too frequently ({} packets since last tick)", this.e.ad().getString(), $$16);
                           $$16 = 1;
                        }

                        if (!this.e.O() && (!this.e.dN().aa().b(czq.t) || !$$15)) {
                           float $$17 = $$15 ? 300.0F : 100.0F;
                           if ($$14 - $$13 > (double)($$17 * (float)$$16) && !this.i()) {
                              g.warn("{} moved too quickly! {},{},{}", new Object[]{this.e.ad().getString(), $$10, $$11, $$12});
                              this.a(this.e.ds(), this.e.du(), this.e.dy(), this.e.dD(), this.e.dF());
                              return;
                           }
                        }
                     }

                     eta $$18 = this.e.cI();
                     $$10 = $$2 - this.t;
                     $$11 = $$3 - this.u;
                     $$12 = $$4 - this.v;
                     boolean $$19 = $$11 > 0.0;
                     if (this.e.aC() && !$$0.b() && $$19) {
                        this.e.fh();
                     }

                     boolean $$20 = this.e.S;
                     this.e.a(brj.b, new etf($$10, $$11, $$12));
                     $$10 = $$2 - this.e.ds();
                     $$11 = $$3 - this.e.du();
                     if ($$11 > -0.5 || $$11 < 0.5) {
                        $$11 = 0.0;
                     }

                     $$12 = $$4 - this.e.dy();
                     $$14 = $$10 * $$10 + $$11 * $$11 + $$12 * $$12;
                     boolean $$22 = false;
                     if (!this.e.O() && $$14 > 0.0625 && !this.e.fJ() && !this.e.f.e() && this.e.f.b() != czr.d) {
                        $$22 = true;
                        g.warn("{} moved wrongly!", this.e.ad().getString());
                     }

                     if (this.e.ag || this.e.fJ() || (!$$22 || !$$1.a(this.e, $$18)) && !this.a($$1, $$18, $$2, $$3, $$4)) {
                        this.e.a($$2, $$3, $$4, $$5, $$6);
                        boolean $$23 = this.e.fp();
                        this.G = $$11 >= -0.03125
                           && !$$20
                           && this.e.f.b() != czr.d
                           && !this.c.ae()
                           && !this.e.gb().c
                           && !this.e.b(bpz.y)
                           && !$$15
                           && !$$23
                           && this.b(this.e);
                        this.e.z().l().a(this.e);
                        this.e.a(this.e.ds() - $$7, this.e.du() - $$8, this.e.dy() - $$9, $$0.b());
                        this.e.a($$0.b(), new etf(this.e.ds() - $$7, this.e.du() - $$8, this.e.dy() - $$9));
                        if ($$19) {
                           this.e.n();
                        }

                        if ($$0.b() || this.e.bg() || this.e.q_() || this.e.N_() || this.e.f() || $$15 || $$23) {
                           this.e.cw = null;
                        }

                        this.e.b(this.e.ds() - $$7, this.e.du() - $$8, this.e.dy() - $$9);
                        this.t = this.e.ds();
                        this.u = this.e.du();
                        this.v = this.e.dy();
                     } else {
                        this.a($$7, $$8, $$9, $$5, $$6);
                        this.e.a(this.e.ds() - $$7, this.e.du() - $$8, this.e.dy() - $$9, $$0.b());
                     }
                  }
               }
            }
         }
      }
   }

   private boolean a(czx $$0, eta $$1, double $$2, double $$3, double $$4) {
      eta $$5 = this.e.cI().d($$2 - this.e.ds(), $$3 - this.e.du(), $$4 - this.e.dy());
      Iterable<ety> $$6 = $$0.d(this.e, $$5.h(1.0E-5F));
      ety $$7 = etv.a($$1.h(1.0E-5F));

      for (ety $$8 : $$6) {
         if (!etv.c($$8, $$7, etj.i)) {
            return true;
         }
      }

      return false;
   }

   public void a(double $$0, double $$1, double $$2, float $$3, float $$4) {
      this.a($$0, $$1, $$2, $$3, $$4, Collections.emptySet());
   }

   public void a(double $$0, double $$1, double $$2, float $$3, float $$4, Set<brr> $$5) {
      double $$6 = $$5.contains(brr.a) ? this.e.ds() : 0.0;
      double $$7 = $$5.contains(brr.b) ? this.e.du() : 0.0;
      double $$8 = $$5.contains(brr.c) ? this.e.dy() : 0.0;
      float $$9 = $$5.contains(brr.d) ? this.e.dD() : 0.0F;
      float $$10 = $$5.contains(brr.e) ? this.e.dF() : 0.0F;
      this.D = new etf($$0, $$1, $$2);
      if (++this.E == Integer.MAX_VALUE) {
         this.E = 0;
      }

      this.F = this.m;
      this.e.cw = null;
      this.e.a($$0, $$1, $$2, $$3, $$4);
      this.e.d.b(new ads($$0 - $$6, $$1 - $$7, $$2 - $$8, $$3 - $$9, $$4 - $$10, $$5, this.E));
   }

   @Override
   public void a(aha $$0) {
      zc.a($$0, this, this.e.z());
      im $$1 = $$0.b();
      this.e.G();
      aha.a $$2 = $$0.f();
      switch ($$2) {
         case g:
            if (!this.e.N_()) {
               csd $$3 = this.e.b(bop.b);
               this.e.a(bop.b, this.e.b(bop.a));
               this.e.a(bop.a, $$3);
               this.e.fz();
            }

            return;
         case e:
            if (!this.e.N_()) {
               this.e.a(false);
            }

            return;
         case d:
            if (!this.e.N_()) {
               this.e.a(true);
            }

            return;
         case f:
            this.e.fy();
            return;
         case a:
         case b:
         case c:
            this.e.f.a($$1, $$2, $$0.e(), this.e.dN().al(), $$0.g());
            this.e.d.a($$0.g());
            return;
         default:
            throw new IllegalArgumentException("Invalid player action");
      }
   }

   private static boolean a(aqf $$0, csd $$1) {
      if ($$1.d()) {
         return false;
      } else {
         cry $$2 = $$1.f();
         return ($$2 instanceof cqb || $$2 instanceof cqj) && !$$0.gv().a($$2);
      }
   }

   @Override
   public void a(ahs $$0) {
      zc.a($$0, this, this.e.z());
      this.e.d.a($$0.f());
      aqe $$1 = this.e.z();
      bop $$2 = $$0.b();
      csd $$3 = this.e.b($$2);
      if ($$3.a($$1.J())) {
         etb $$4 = $$0.e();
         etf $$5 = $$4.e();
         im $$6 = $$4.a();
         if (this.e.a($$6, 1.0)) {
            etf $$7 = $$5.d(etf.b($$6));
            double $$8 = 1.0000001;
            if (Math.abs($$7.a()) < 1.0000001 && Math.abs($$7.b()) < 1.0000001 && Math.abs($$7.c()) < 1.0000001) {
               ir $$9 = $$4.b();
               this.e.G();
               int $$10 = this.e.dN().al();
               if ($$6.v() < $$10) {
                  if (this.D == null && $$1.a(this.e, $$6)) {
                     boq $$11 = this.e.f.a(this.e, $$1, $$3, $$2, $$4);
                     if ($$11.a()) {
                        am.P.a(this.e, $$4.a(), $$3.r());
                     }

                     if ($$9 == ir.b && !$$11.a() && $$6.v() >= $$10 - 1 && a(this.e, $$3)) {
                        ws $$12 = ws.a("build.tooHigh", $$10 - 1).a(n.m);
                        this.e.b($$12, true);
                     } else if ($$11.b()) {
                        this.e.a($$2, true);
                     }
                  }
               } else {
                  ws $$13 = ws.a("build.tooHigh", $$10 - 1).a(n.m);
                  this.e.b($$13, true);
               }

               this.e.d.b(new abt($$1, $$6));
               this.e.d.b(new abt($$1, $$6.a($$9)));
            } else {
               g.warn("Rejecting UseItemOnPacket from {}: Location {} too far away from hit block {}.", new Object[]{this.e.fZ().getName(), $$5, $$6});
            }
         }
      }
   }

   @Override
   public void a(aht $$0) {
      zc.a($$0, this, this.e.z());
      this.a($$0.e());
      aqe $$1 = this.e.z();
      bop $$2 = $$0.b();
      csd $$3 = this.e.b($$2);
      this.e.G();
      if (!$$3.d() && $$3.a($$1.J())) {
         boq $$4 = this.e.f.a(this.e, $$1, $$3, $$2);
         if ($$4.b()) {
            this.e.a($$2, true);
         }
      }
   }

   @Override
   public void a(ahr $$0) {
      zc.a($$0, this, this.e.z());
      if (this.e.N_()) {
         for (aqe $$1 : this.c.K()) {
            bql $$2 = $$0.a($$1);
            if ($$2 != null) {
               this.e.a($$1, $$2.ds(), $$2.du(), $$2.dy(), $$2.dD(), $$2.dF());
               return;
            }
         }
      }
   }

   @Override
   public void a(agw $$0) {
      zc.a($$0, this, this.e.z());
      if (this.e.db() instanceof cmi $$2) {
         $$2.a($$0.b(), $$0.e());
      }
   }

   @Override
   public void a(ws $$0) {
      g.info("{} lost connection: {}", this.e.ad().getString(), $$0.getString());
      this.q();
      super.a($$0);
   }

   private void q() {
      this.Q.close();
      this.c.aw();
      this.c.ah().a(ws.a("multiplayer.player.left", this.e.O_()).a(n.o), false);
      this.e.u();
      this.c.ah().c(this.e);
      this.e.X().b();
   }

   public void a(int $$0) {
      if ($$0 < 0) {
         throw new IllegalArgumentException("Expected packet sequence nr >= 0");
      } else {
         this.n = Math.max($$0, this.n);
      }
   }

   @Override
   public void a(ahj $$0) {
      zc.a($$0, this, this.e.z());
      if ($$0.b() >= 0 && $$0.b() < ckk.g()) {
         if (this.e.ga().l != $$0.b() && this.e.fu() == bop.a) {
            this.e.fz();
         }

         this.e.ga().l = $$0.b();
         this.e.G();
      } else {
         g.warn("{} tried to set an invalid carried item", this.e.ad().getString());
      }
   }

   @Override
   public void a(age $$0) {
      if (c($$0.b())) {
         this.b(ws.c("multiplayer.disconnect.illegal_characters"));
      } else {
         Optional<wz> $$1 = this.a($$0.h());
         if ($$1.isPresent()) {
            this.c.execute(() -> {
               xi $$2;
               try {
                  $$2 = this.a($$0, $$1.get());
               } catch (xm.a var6) {
                  this.a(var6);
                  return;
               }

               CompletableFuture<aqw> $$5 = this.a($$2.c());
               ws $$6 = this.c.bm().decorate(this.e, $$2.d());
               this.Q.append($$5, $$2x -> {
                  xi $$3 = $$2.a($$6).a($$2x.e());
                  this.b($$3);
               });
            });
         }
      }
   }

   @Override
   public void a(agd $$0) {
      if (c($$0.b())) {
         this.b(ws.c("multiplayer.disconnect.illegal_characters"));
      } else {
         Optional<wz> $$1 = this.a($$0.h());
         if ($$1.isPresent()) {
            this.c.execute(() -> {
               this.a($$0, $$1.get());
               this.r();
            });
         }
      }
   }

   private void a(agd $$0, wz $$1) {
      ParseResults<ec> $$2 = this.b($$0.b());

      Map<String, xi> $$3;
      try {
         $$3 = this.a($$0, xk.a($$2), $$1);
      } catch (xm.a var6) {
         this.a(var6);
         return;
      }

      ea $$6 = new ea.a($$3);
      $$2 = ed.a($$2, $$1x -> $$1x.a($$6, this.Q));
      this.c.aH().a($$2, $$0.b());
   }

   private void a(xm.a $$0) {
      g.warn("Failed to update secure chat state for {}: '{}'", this.e.fZ().getName(), $$0.b().getString());
      if ($$0.a()) {
         this.b($$0.b());
      } else {
         this.e.a($$0.b().f().a(n.m));
      }
   }

   private Map<String, xi> a(agd $$0, xk<?> $$1, wz $$2) throws xm.a {
      Map<String, xi> $$3 = new Object2ObjectOpenHashMap();

      for (xk.a<?> $$4 : $$1.a()) {
         xe $$5 = $$0.g().a($$4.a());
         xl $$6 = new xl($$4.c(), $$0.e(), $$0.f(), $$2);
         $$3.put($$4.a(), this.N.unpack($$5, $$6));
      }

      return $$3;
   }

   private ParseResults<ec> b(String $$0) {
      CommandDispatcher<ec> $$1 = this.c.aH().a();
      return $$1.parse($$0, this.e.de());
   }

   private Optional<wz> a(wz.b $$0) {
      Optional<wz> $$1 = this.b($$0);
      if (this.e.D() == ckj.c) {
         this.b(new afh(ws.c("chat.disabled.options").a(n.m), false));
         return Optional.empty();
      } else {
         this.e.G();
         return $$1;
      }
   }

   private Optional<wz> b(wz.b $$0) {
      synchronized (this.O) {
         Optional<wz> $$1 = this.O.a($$0);
         if ($$1.isEmpty()) {
            g.warn("Failed to validate message acknowledgements from {}", this.e.ad().getString());
            this.b(k);
         }

         return $$1;
      }
   }

   private static boolean c(String $$0) {
      for (int $$1 = 0; $$1 < $$0.length(); $$1++) {
         if (!ayr.a($$0.charAt($$1))) {
            return true;
         }
      }

      return false;
   }

   private xi a(age $$0, wz $$1) throws xm.a {
      xl $$2 = new xl($$0.b(), $$0.e(), $$0.f(), $$1);
      return this.N.unpack($$0.g(), $$2);
   }

   private void b(xi $$0) {
      this.c.ah().a($$0, this.e, wo.a(wo.c, this.e));
      this.r();
   }

   private void r() {
      this.o += 20;
      if (this.o > 200 && !this.c.ah().f(this.e.fZ())) {
         this.b(ws.c("disconnect.spam"));
      }
   }

   @Override
   public void a(agc $$0) {
      synchronized (this.O) {
         if (!this.O.a($$0.b())) {
            g.warn("Failed to validate message acknowledgements from {}", this.e.ad().getString());
            this.b(k);
         }
      }
   }

   @Override
   public void a(ahq $$0) {
      zc.a($$0, this, this.e.z());
      this.e.G();
      this.e.a($$0.b());
   }

   @Override
   public void a(ahb $$0) {
      zc.a($$0, this, this.e.z());
      this.e.G();
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
            if (this.e.fJ()) {
               this.e.a(false, true);
               this.D = this.e.dl();
            }
            break;
         case f:
            if (this.e.db() instanceof bro $$1) {
               int $$2 = $$0.f();
               if ($$1.a() && $$2 > 0) {
                  $$1.c($$2);
               }
            }
            break;
         case g:
            if (this.e.db() instanceof bro $$3) {
               $$3.b();
            }
            break;
         case h:
            if (this.e.da() instanceof bqx $$4) {
               $$4.b(this.e);
            }
            break;
         case i:
            if (!this.e.gf()) {
               this.e.gh();
            }
            break;
         default:
            throw new IllegalArgumentException("Invalid client command!");
      }
   }

   public void a(xi $$0) {
      xe $$1 = $$0.l();
      if ($$1 != null) {
         this.P.a($$0.m(), $$0.l());
         int $$2;
         synchronized (this.O) {
            this.O.a($$1);
            $$2 = this.O.a();
         }

         if ($$2 > 4096) {
            this.b(ws.c("multiplayer.disconnect.too_many_pending_chats"));
         }
      }
   }

   public void a(xi $$0, wo.a $$1) {
      this.b(new adl($$0.k().c(), $$0.k().b(), $$0.l(), $$0.m().a(this.P), $$0.n(), $$0.o(), $$1));
      this.a($$0);
   }

   public void a(ws $$0, wo.a $$1) {
      this.b(new acn($$0, $$1));
   }

   public SocketAddress n() {
      return this.d.d();
   }

   public void o() {
      this.R = true;
      this.q();
      this.b(aff.a);
      this.d.a(aaz.b);
   }

   @Override
   public void a(aja $$0) {
      this.d.a(new aix($$0.b()));
   }

   @Override
   public void a(agr $$0) {
      zc.a($$0, this, this.e.z());
      final aqe $$1 = this.e.z();
      final bql $$2 = $$0.a($$1);
      this.e.G();
      this.e.g($$0.b());
      if ($$2 != null) {
         if (!$$1.C_().a($$2.dn())) {
            return;
         }

         eta $$3 = $$2.cI();
         if (this.e.a($$3, 1.0)) {
            $$0.a(new agr.c() {
               private void a(bop $$0, are.a $$1x) {
                  csd $$2 = are.this.e.b($$0);
                  if ($$2.a($$1.J())) {
                     csd $$3 = $$2.r();
                     boq $$4 = $$1.run(are.this.e, $$2, $$0);
                     if ($$4.a()) {
                        am.T.a(are.this.e, $$3, $$2);
                        if ($$4.b()) {
                           are.this.e.a($$0, true);
                        }
                     }
                  }
               }

               @Override
               public void a(bop $$0) {
                  this.a($$0, ckl::a);
               }

               @Override
               public void a(bop $$0, etf $$1x) {
                  this.a($$0, ($$1xxx, $$2xx, $$3) -> $$2xx.a($$1xxx, $$1, $$3));
               }

               @Override
               public void a() {
                  if (!($$2 instanceof cgv) && !($$2 instanceof bqu) && !($$2 instanceof ckr) && $$2 != are.this.e) {
                     csd $$0 = are.this.e.b(bop.a);
                     if ($$0.a($$1.J())) {
                        are.this.e.e($$2);
                     }
                  } else {
                     are.this.b(ws.c("multiplayer.disconnect.invalid_entity_attacked"));
                     are.g.warn("Player {} tried to attack an invalid entity", are.this.e.ad().getString());
                  }
               }
            });
         }
      }
   }

   @Override
   public void a(agh $$0) {
      zc.a($$0, this, this.e.z());
      this.e.G();
      agh.a $$1 = $$0.b();
      switch ($$1) {
         case a:
            if (this.e.h) {
               this.e.h = false;
               this.e = this.c.ah().a(this.e, true);
               am.w.a(this.e, czu.j, czu.h);
            } else {
               if (this.e.ey() > 0.0F) {
                  return;
               }

               this.e = this.c.ah().a(this.e, false);
               if (this.c.j()) {
                  this.e.a(czr.d);
                  this.e.dN().aa().a(czq.r).a(false, this.c);
               }
            }
            break;
         case b:
            this.e.H().a(this.e);
      }
   }

   @Override
   public void a(agm $$0) {
      zc.a($$0, this, this.e.z());
      this.e.s();
   }

   @Override
   public void a(agl $$0) {
      zc.a($$0, this, this.e.z());
      this.e.G();
      if (this.e.cc.j == $$0.b()) {
         if (this.e.N_()) {
            this.e.cc.b();
         } else if (!this.e.cc.a(this.e)) {
            g.debug("Player {} interacted with invalid menu {}", this.e, this.e.cc);
         } else {
            int $$1 = $$0.e();
            if (!this.e.cc.a($$1)) {
               g.debug("Player {} clicked invalid slot index: {}, available slots: {}", new Object[]{this.e.ad(), $$1, this.e.cc.i.size()});
            } else {
               boolean $$2 = $$0.j() != this.e.cc.j();
               this.e.cc.h();
               this.e.cc.a($$1, $$0.f(), $$0.i(), this.e);
               ObjectIterator var4 = Int2ObjectMaps.fastIterable($$0.h()).iterator();

               while (var4.hasNext()) {
                  Entry<csd> $$3 = (Entry<csd>)var4.next();
                  this.e.cc.b($$3.getIntKey(), (csd)$$3.getValue());
               }

               this.e.cc.a($$0.g());
               this.e.cc.i();
               if ($$2) {
                  this.e.cc.e();
               } else {
                  this.e.cc.d();
               }
            }
         }
      }
   }

   @Override
   public void a(agy $$0) {
      zc.a($$0, this, this.e.z());
      this.e.G();
      if (!this.e.N_() && this.e.cc.j == $$0.b() && this.e.cc instanceof cov) {
         if (!this.e.cc.a(this.e)) {
            g.debug("Player {} interacted with invalid menu {}", this.e, this.e.cc);
         } else {
            this.c.aJ().a($$0.e()).ifPresent($$1 -> ((cov)this.e.cc).a($$0.f(), (cwi<?>)$$1, this.e));
         }
      }
   }

   @Override
   public void a(agk $$0) {
      zc.a($$0, this, this.e.z());
      this.e.G();
      if (this.e.cc.j == $$0.b() && !this.e.N_()) {
         if (!this.e.cc.a(this.e)) {
            g.debug("Player {} interacted with invalid menu {}", this.e, this.e.cc);
         } else {
            boolean $$1 = this.e.cc.b(this.e, $$0.e());
            if ($$1) {
               this.e.cc.d();
            }
         }
      }
   }

   @Override
   public void a(ahm $$0) {
      zc.a($$0, this, this.e.z());
      if (this.e.f.e()) {
         boolean $$1 = $$0.b() < 0;
         csd $$2 = $$0.e();
         if (!$$2.a(this.e.dN().J())) {
            return;
         }

         cuq $$3 = $$2.a(jz.F, cuq.a);
         if ($$3.a("x") && $$3.a("y") && $$3.a("z")) {
            im $$4 = dnd.b($$3.d());
            if (this.e.dN().p($$4)) {
               dnd $$5 = this.e.dN().c_($$4);
               if ($$5 != null) {
                  $$5.a($$2, this.e.dN().H_());
               }
            }
         }

         boolean $$6 = $$0.b() >= 1 && $$0.b() <= 45;
         boolean $$7 = $$2.d() || $$2.m() >= 0 && $$2.G() <= 64 && !$$2.d();
         if ($$6 && $$7) {
            this.e.cb.b($$0.b()).e($$2);
            this.e.cb.d();
         } else if ($$1 && $$7 && this.p < 200) {
            this.p += 20;
            this.e.a($$2, true);
         }
      }
   }

   @Override
   public void a(ahp $$0) {
      List<String> $$1 = Stream.of($$0.f()).map(n::a).collect(Collectors.toList());
      this.a($$1).thenAcceptAsync($$1x -> this.a($$0, $$1x), this.c);
   }

   private void a(ahp $$0, List<aqw> $$1) {
      this.e.G();
      aqe $$2 = this.e.z();
      im $$3 = $$0.b();
      if ($$2.B($$3)) {
         if (!($$2.c_($$3) instanceof don $$5)) {
            return;
         }

         $$5.a(this.e, $$0.e(), $$1);
      }
   }

   @Override
   public void a(agz $$0) {
      zc.a($$0, this, this.e.z());
      this.e.gb().b = $$0.b() && this.e.gb().c;
   }

   @Override
   public void a(zr $$0) {
      zc.a($$0, this, this.e.z());
      this.e.a($$0.b());
   }

   @Override
   public void a(agb $$0) {
      zc.a($$0, this, this.e.z());
      if (this.e.m(2) || this.i()) {
         this.c.a($$0.b(), false);
      }
   }

   @Override
   public void a(agt $$0) {
      zc.a($$0, this, this.e.z());
      if (this.e.m(2) || this.i()) {
         this.c.b($$0.b());
      }
   }

   @Override
   public void a(agf $$0) {
      zc.a($$0, this, this.e.z());
      xj.a $$1 = $$0.b();
      cko.a $$2 = this.M != null ? this.M.d().b() : null;
      cko.a $$3 = $$1.b();
      if (!Objects.equals($$2, $$3)) {
         if ($$2 != null && $$3.b().isBefore($$2.b())) {
            this.b(cko.a);
         } else {
            try {
               ayi $$4 = this.c.as();
               if ($$4 == null) {
                  g.warn("Ignoring chat session from {} due to missing Services public key", this.e.fZ().getName());
                  return;
               }

               this.a($$1.a(this.e.fZ(), $$4));
            } catch (cko.b var6) {
               g.error("Failed to validate profile key: {}", var6.getMessage());
               this.b(var6.b());
            }
         }
      }
   }

   @Override
   public void a(agj $$0) {
      if (!this.R) {
         throw new IllegalStateException("Client acknowledged config, but none was requested");
      } else {
         this.d.a(aaz.a, new arc(this.c, this.d, this.a(this.e.B())));
      }
   }

   @Override
   public void a(agg $$0) {
      zc.a($$0, this, this.e.z());
      this.f.a($$0.b());
   }

   @Override
   public void a(ago $$0) {
      zc.a($$0, this, this.e.z());
      this.c.a(this.e, $$0.b());
   }

   private void a(xj $$0) {
      this.M = $$0;
      this.N = $$0.a(this.e.cx());
      this.Q.append(() -> {
         this.e.a($$0);
         this.c.ah().a(new adq(EnumSet.of(adq.a.b), List.of(this.e)));
      });
   }

   @Override
   public void a(zs $$0) {
   }

   @Override
   public aqf p() {
      return this.e;
   }

   @FunctionalInterface
   interface a {
      boq run(aqf var1, bql var2, bop var3);
   }
}
