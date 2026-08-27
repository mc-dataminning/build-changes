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

public class arh extends are implements afz, ark, wi {
   static final Logger g = LogUtils.getLogger();
   private static final int h = -1;
   private static final int i = 4096;
   private static final int j = 80;
   private static final wu k = wu.c("multiplayer.disconnect.chat_validation_failed");
   private static final int l = 1000;
   public aqi e;
   public final ard f;
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
   private brh w;
   private double x;
   private double y;
   private double z;
   private double A;
   private double B;
   private double C;
   @Nullable
   private etp D;
   private int E;
   private int F;
   private boolean G;
   private int H;
   private boolean I;
   private int J;
   private int K;
   private int L;
   @Nullable
   private xl M;
   private xo.b N;
   private final xd O = new xd(20);
   private final xh P = xh.a();
   private final axn Q;
   private boolean R;

   public arh(MinecraftServer $$0, vs $$1, aqi $$2, aqw $$3) {
      super($$0, $$1, $$3);
      this.f = new ard($$1.e());
      this.e = $$2;
      $$2.d = this;
      $$2.X().a();
      this.N = xo.b.unsigned($$2.cx(), $$0::aB);
      this.Q = new axn($$0);
   }

   @Override
   public void e() {
      if (this.n > -1) {
         this.b(new abr(this.n));
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
         if (++this.H > this.a((brh)this.e)) {
            g.warn("{} was kicked for floating too long!", this.e.ad().getString());
            this.b(wu.c("multiplayer.disconnect.flying"));
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
               this.b(wu.c("multiplayer.disconnect.flying"));
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
         this.b(wu.c("multiplayer.disconnect.idling"));
      }
   }

   private int a(brh $$0) {
      double $$1 = $$0.aX();
      if ($$1 < 1.0E-5F) {
         return Integer.MAX_VALUE;
      } else {
         double $$2 = 0.08 / $$1;
         return axz.c(80.0 * Math.max($$2, 1.0));
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
   public boolean a(zb<?> $$0) {
      return super.a($$0) ? true : this.R && this.d.i() && $$0 instanceof agl;
   }

   @Override
   protected GameProfile j() {
      return this.e.fZ();
   }

   private <T, R> CompletableFuture<R> a(T $$0, BiFunction<arm, T, CompletableFuture<R>> $$1) {
      return $$1.apply(this.e.X(), $$0).thenApply($$0x -> {
         if (!this.c()) {
            g.debug("Ignoring packet due to disconnection");
            throw new CancellationException("disconnected");
         } else {
            return (R)$$0x;
         }
      });
   }

   private CompletableFuture<aqz> a(String $$0) {
      return this.a($$0, arm::a);
   }

   private CompletableFuture<List<aqz>> a(List<String> $$0) {
      return this.a($$0, arm::a);
   }

   @Override
   public void a(ahe $$0) {
      ze.a($$0, this, this.e.z());
      this.e.a($$0.b(), $$0.e(), $$0.f(), $$0.g());
   }

   private static boolean b(double $$0, double $$1, double $$2, float $$3, float $$4) {
      return Double.isNaN($$0) || Double.isNaN($$1) || Double.isNaN($$2) || !Floats.isFinite($$4) || !Floats.isFinite($$3);
   }

   private static double a(double $$0) {
      return axz.a($$0, -3.0E7, 3.0E7);
   }

   private static double b(double $$0) {
      return axz.a($$0, -2.0E7, 2.0E7);
   }

   @Override
   public void a(agx $$0) {
      ze.a($$0, this, this.e.z());
      if (b($$0.b(), $$0.e(), $$0.f(), $$0.g(), $$0.h())) {
         this.b(wu.c("multiplayer.disconnect.invalid_vehicle_movement"));
      } else {
         brh $$1 = this.e.cX();
         if ($$1 != this.e && $$1.cO() == this.e && $$1 == this.w) {
            aqh $$2 = this.e.z();
            double $$3 = $$1.ds();
            double $$4 = $$1.du();
            double $$5 = $$1.dy();
            double $$6 = a($$0.b());
            double $$7 = b($$0.e());
            double $$8 = a($$0.f());
            float $$9 = axz.g($$0.g());
            float $$10 = axz.g($$0.h());
            double $$11 = $$6 - this.x;
            double $$12 = $$7 - this.y;
            double $$13 = $$8 - this.z;
            double $$14 = $$1.dq().g();
            double $$15 = $$11 * $$11 + $$12 * $$12 + $$13 * $$13;
            if ($$15 - $$14 > 100.0 && !this.i()) {
               g.warn("{} (vehicle of {}) moved too quickly! {},{},{}", new Object[]{$$1.ad().getString(), this.e.ad().getString(), $$11, $$12, $$13});
               this.b(new adh($$1));
               return;
            }

            boolean $$16 = $$2.a($$1, $$1.cI().h(0.0625));
            $$11 = $$6 - this.A;
            $$12 = $$7 - this.B - 1.0E-6;
            $$13 = $$8 - this.C;
            boolean $$17 = $$1.S;
            if ($$1 instanceof bsa $$18 && $$18.q_()) {
               $$18.n();
            }

            $$1.a(bsf.b, new etp($$11, $$12, $$13));
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
               this.b(new adh($$1));
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

   private boolean b(brh $$0) {
      return $$0.dN().a($$0.cI().g(0.0625).b(0.0, -0.55, 0.0)).allMatch(dqg.a::i);
   }

   @Override
   public void a(agb $$0) {
      ze.a($$0, this, this.e.z());
      if ($$0.b() == this.E) {
         if (this.D == null) {
            this.b(wu.c("multiplayer.disconnect.invalid_player_movement"));
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
   public void a(ahg $$0) {
      ze.a($$0, this, this.e.z());
      this.c.aJ().a($$0.b()).ifPresent(this.e.I()::e);
   }

   @Override
   public void a(ahf $$0) {
      ze.a($$0, this, this.e.z());
      this.e.I().a($$0.b(), $$0.e(), $$0.f());
   }

   @Override
   public void a(ahi $$0) {
      ze.a($$0, this, this.e.z());
      if ($$0.e() == ahi.a.a) {
         akh $$1 = Objects.requireNonNull($$0.f());
         af $$2 = this.c.aE().a($$1);
         if ($$2 != null) {
            this.e.Q().a($$2);
         }
      }
   }

   @Override
   public void a(agk $$0) {
      ze.a($$0, this, this.e.z());
      StringReader $$1 = new StringReader($$0.e());
      if ($$1.canRead() && $$1.peek() == '/') {
         $$1.skip();
      }

      ParseResults<ed> $$2 = this.c.aH().a().parse($$1, this.e.de());
      this.c.aH().a().getCompletionSuggestions($$2).thenAccept($$1x -> {
         Suggestions $$2x = $$1x.getList().size() <= 1000 ? $$1x : new Suggestions($$1x.getRange(), $$1x.getList().subList(0, 1000));
         this.b(new ace($$0.b(), $$2x));
      });
   }

   @Override
   public void a(ahm $$0) {
      ze.a($$0, this, this.e.z());
      if (!this.c.q()) {
         this.e.a(wu.c("advMode.notEnabled"));
      } else if (!this.e.gx()) {
         this.e.a(wu.c("advMode.notAllowed"));
      } else {
         cze $$1 = null;
         dnw $$2 = null;
         in $$3 = $$0.b();
         dnm $$4 = this.e.dN().c_($$3);
         if ($$4 instanceof dnw) {
            $$2 = (dnw)$$4;
            $$1 = $$2.b();
         }

         String $$5 = $$0.e();
         boolean $$6 = $$0.f();
         if ($$1 != null) {
            dnw.a $$7 = $$2.l();
            dqh $$8 = this.e.dN().a_($$3);
            is $$9 = $$8.c(den.b);

            dqh $$13 = (switch ($$0.i()) {
               case a -> ddg.kH.n();
               case b -> ddg.kG.n();
               default -> ddg.fN.n();
            }).a(den.b, $$9).a(den.c, Boolean.valueOf($$0.g()));
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
            if (!ayu.b($$5)) {
               this.e.a(wu.a("advMode.setCommand.success", $$5));
            }
         }
      }
   }

   @Override
   public void a(ahn $$0) {
      ze.a($$0, this, this.e.z());
      if (!this.c.q()) {
         this.e.a(wu.c("advMode.notEnabled"));
      } else if (!this.e.gx()) {
         this.e.a(wu.c("advMode.notAllowed"));
      } else {
         cze $$1 = $$0.a(this.e.dN());
         if ($$1 != null) {
            $$1.a($$0.b());
            $$1.a($$0.e());
            if (!$$0.e()) {
               $$1.c(null);
            }

            $$1.f();
            this.e.a(wu.a("advMode.setCommand.success", $$0.b()));
         }
      }
   }

   @Override
   public void a(agz $$0) {
      ze.a($$0, this, this.e.z());
      this.e.ga().c($$0.b());
      this.e.d.b(new acj(-2, 0, this.e.ga().k, this.e.ga().a(this.e.ga().k)));
      this.e.d.b(new acj(-2, 0, $$0.b(), this.e.ga().a($$0.b())));
      this.e.d.b(new ael(this.e.ga().k));
   }

   @Override
   public void a(ahh $$0) {
      ze.a($$0, this, this.e.z());
      if (this.e.cc instanceof cof $$1) {
         if (!$$1.a(this.e)) {
            g.debug("Player {} interacted with invalid menu {}", this.e, $$1);
            return;
         }

         $$1.a($$0.b());
      }
   }

   @Override
   public void a(ahk $$0) {
      ze.a($$0, this, this.e.z());
      if (this.e.cc instanceof cog $$1) {
         if (!this.e.cc.a(this.e)) {
            g.debug("Player {} interacted with invalid menu {}", this.e, this.e.cc);
            return;
         }

         $$1.a($$0.b(), $$0.e());
      }
   }

   @Override
   public void a(ahq $$0) {
      ze.a($$0, this, this.e.z());
      if (this.e.gx()) {
         in $$1 = $$0.b();
         dqh $$2 = this.e.dN().a_($$1);
         if (this.e.dN().c_($$1) instanceof dpb $$4) {
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
               if ($$0.e() == dpb.a.b) {
                  if ($$4.z()) {
                     this.e.a(wu.a("structure_block.save_success", $$5), false);
                  } else {
                     this.e.a(wu.a("structure_block.save_failure", $$5), false);
                  }
               } else if ($$0.e() == dpb.a.c) {
                  if (!$$4.B()) {
                     this.e.a(wu.a("structure_block.load_not_found", $$5), false);
                  } else if ($$4.a(this.e.z())) {
                     this.e.a(wu.a("structure_block.load_success", $$5), false);
                  } else {
                     this.e.a(wu.a("structure_block.load_prepare", $$5), false);
                  }
               } else if ($$0.e() == dpb.a.d) {
                  if ($$4.y()) {
                     this.e.a(wu.a("structure_block.size_success", $$5), false);
                  } else {
                     this.e.a(wu.c("structure_block.size_failure"), false);
                  }
               }
            } else {
               this.e.a(wu.a("structure_block.invalid_structure_name", $$0.g()), false);
            }

            $$4.e();
            this.e.dN().a($$1, $$2, $$2, 3);
         }
      }
   }

   @Override
   public void a(ahp $$0) {
      ze.a($$0, this, this.e.z());
      if (this.e.gx()) {
         in $$1 = $$0.b();
         dqh $$2 = this.e.dN().a_($$1);
         if (this.e.dN().c_($$1) instanceof dom $$4) {
            $$4.a($$0.e());
            $$4.b($$0.f());
            $$4.a(akg.a(le.aM, $$0.g()));
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
   public void a(agu $$0) {
      ze.a($$0, this, this.e.z());
      if (this.e.gx()) {
         in $$1 = $$0.b();
         if (this.e.dN().c_($$1) instanceof dom $$3) {
            $$3.a(this.e.z(), $$0.e(), $$0.f());
         }
      }
   }

   @Override
   public void a(ahj $$0) {
      ze.a($$0, this, this.e.z());
      int $$1 = $$0.b();
      if (this.e.cc instanceof cpn $$2) {
         if (!$$2.a(this.e)) {
            g.debug("Player {} interacted with invalid menu {}", this.e, $$2);
            return;
         }

         $$2.e($$1);
         $$2.h($$1);
      }
   }

   @Override
   public void a(agr $$0) {
      int $$1 = $$0.b();
      if (clg.d($$1) || $$1 == 40) {
         List<String> $$2 = Lists.newArrayList();
         Optional<String> $$3 = $$0.f();
         $$3.ifPresent($$2::add);
         $$0.e().stream().limit(100L).forEach($$2::add);
         Consumer<List<aqz>> $$4 = $$3.isPresent() ? $$1x -> this.a((aqz)$$1x.get(0), $$1x.subList(1, $$1x.size()), $$1) : $$1x -> this.a($$1x, $$1);
         this.a($$2).thenAcceptAsync($$4, this.c);
      }
   }

   private void a(List<aqz> $$0, int $$1) {
      csz $$2 = this.e.ga().a($$1);
      if ($$2.a(ctc.tZ)) {
         List<aqy<String>> $$3 = $$0.stream().map(this::a).toList();
         $$2.b(ka.G, new cwf($$3));
      }
   }

   private void a(aqz $$0, List<aqz> $$1, int $$2) {
      csz $$3 = this.e.ga().a($$2);
      if ($$3.a(ctc.tZ)) {
         csz $$4 = $$3.a(ctc.ua, 1);
         $$4.c(ka.G);
         List<aqy<wu>> $$5 = $$1.stream().map($$0x -> this.a($$0x).a(wu::b)).toList();
         $$4.b(ka.H, new cwg(this.a($$0), this.e.ad().getString(), 0, $$5, true));
         this.e.ga().a($$2, $$4);
      }
   }

   private aqy<String> a(aqz $$0) {
      return this.e.Y() ? aqy.a($$0.b()) : aqy.a($$0);
   }

   @Override
   public void a(ags $$0) {
      ze.a($$0, this, this.e.z());
      if (this.e.m(2)) {
         brh $$1 = this.e.dN().a($$0.e());
         if ($$1 != null) {
            ua $$2 = $$1.f(new ua());
            this.e.d.b(new afl($$0.b(), $$2));
         }
      }
   }

   @Override
   public void a(agp $$0) {
      ze.a($$0, this, this.e.z());
      if (!this.e.N_() && $$0.e() == this.e.cc.j) {
         if (this.e.cc instanceof cos $$1 && $$1.m() instanceof doa $$2) {
            $$2.a($$0.b(), $$0.f());
         }
      }
   }

   @Override
   public void a(agc $$0) {
      ze.a($$0, this, this.e.z());
      if (this.e.m(2)) {
         dnm $$1 = this.e.dN().c_($$0.e());
         ua $$2 = $$1 != null ? $$1.d(this.e.dP()) : null;
         this.e.d.b(new afl($$0.b(), $$2));
      }
   }

   @Override
   public void a(agw $$0) {
      ze.a($$0, this, this.e.z());
      if (b($$0.a(0.0), $$0.b(0.0), $$0.c(0.0), $$0.a(0.0F), $$0.b(0.0F))) {
         this.b(wu.c("multiplayer.disconnect.invalid_player_movement"));
      } else {
         aqh $$1 = this.e.z();
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
               float $$5 = axz.g($$0.a(this.e.dD()));
               float $$6 = axz.g($$0.b(this.e.dF()));
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

                        if (!this.e.O() && (!this.e.dN().aa().b(czz.t) || !$$15)) {
                           float $$17 = $$15 ? 300.0F : 100.0F;
                           if ($$14 - $$13 > (double)($$17 * (float)$$16) && !this.i()) {
                              g.warn("{} moved too quickly! {},{},{}", new Object[]{this.e.ad().getString(), $$10, $$11, $$12});
                              this.a(this.e.ds(), this.e.du(), this.e.dy(), this.e.dD(), this.e.dF());
                              return;
                           }
                        }
                     }

                     etk $$18 = this.e.cI();
                     $$10 = $$2 - this.t;
                     $$11 = $$3 - this.u;
                     $$12 = $$4 - this.v;
                     boolean $$19 = $$11 > 0.0;
                     if (this.e.aC() && !$$0.b() && $$19) {
                        this.e.fh();
                     }

                     boolean $$20 = this.e.S;
                     this.e.a(bsf.b, new etp($$10, $$11, $$12));
                     $$10 = $$2 - this.e.ds();
                     $$11 = $$3 - this.e.du();
                     if ($$11 > -0.5 || $$11 < 0.5) {
                        $$11 = 0.0;
                     }

                     $$12 = $$4 - this.e.dy();
                     $$14 = $$10 * $$10 + $$11 * $$11 + $$12 * $$12;
                     boolean $$22 = false;
                     if (!this.e.O() && $$14 > 0.0625 && !this.e.fJ() && !this.e.f.e() && this.e.f.b() != daa.d) {
                        $$22 = true;
                        g.warn("{} moved wrongly!", this.e.ad().getString());
                     }

                     if (this.e.ag || this.e.fJ() || (!$$22 || !$$1.a(this.e, $$18)) && !this.a($$1, $$18, $$2, $$3, $$4)) {
                        this.e.a($$2, $$3, $$4, $$5, $$6);
                        boolean $$23 = this.e.fp();
                        this.G = $$11 >= -0.03125
                           && !$$20
                           && this.e.f.b() != daa.d
                           && !this.c.ae()
                           && !this.e.gb().c
                           && !this.e.b(bqv.y)
                           && !$$15
                           && !$$23
                           && this.b(this.e);
                        this.e.z().l().a(this.e);
                        this.e.a(this.e.ds() - $$7, this.e.du() - $$8, this.e.dy() - $$9, $$0.b());
                        this.e.a($$0.b(), new etp(this.e.ds() - $$7, this.e.du() - $$8, this.e.dy() - $$9));
                        if ($$19) {
                           this.e.n();
                        }

                        if ($$0.b() || this.e.bg() || this.e.q_() || this.e.N_() || $$15 || $$23) {
                           this.e.gC();
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

   private boolean a(dag $$0, etk $$1, double $$2, double $$3, double $$4) {
      etk $$5 = this.e.cI().d($$2 - this.e.ds(), $$3 - this.e.du(), $$4 - this.e.dy());
      Iterable<eui> $$6 = $$0.d(this.e, $$5.h(1.0E-5F));
      eui $$7 = euf.a($$1.h(1.0E-5F));

      for (eui $$8 : $$6) {
         if (!euf.c($$8, $$7, ett.i)) {
            return true;
         }
      }

      return false;
   }

   public void a(double $$0, double $$1, double $$2, float $$3, float $$4) {
      this.a($$0, $$1, $$2, $$3, $$4, Collections.emptySet());
   }

   public void a(double $$0, double $$1, double $$2, float $$3, float $$4, Set<bsn> $$5) {
      double $$6 = $$5.contains(bsn.a) ? this.e.ds() : 0.0;
      double $$7 = $$5.contains(bsn.b) ? this.e.du() : 0.0;
      double $$8 = $$5.contains(bsn.c) ? this.e.dy() : 0.0;
      float $$9 = $$5.contains(bsn.d) ? this.e.dD() : 0.0F;
      float $$10 = $$5.contains(bsn.e) ? this.e.dF() : 0.0F;
      this.D = new etp($$0, $$1, $$2);
      if (++this.E == Integer.MAX_VALUE) {
         this.E = 0;
      }

      this.F = this.m;
      this.e.gC();
      this.e.a($$0, $$1, $$2, $$3, $$4);
      this.e.d.b(new adu($$0 - $$6, $$1 - $$7, $$2 - $$8, $$3 - $$9, $$4 - $$10, $$5, this.E));
   }

   @Override
   public void a(ahc $$0) {
      ze.a($$0, this, this.e.z());
      in $$1 = $$0.b();
      this.e.G();
      ahc.a $$2 = $$0.f();
      switch ($$2) {
         case g:
            if (!this.e.N_()) {
               csz $$3 = this.e.b(bpl.b);
               this.e.a(bpl.b, this.e.b(bpl.a));
               this.e.a(bpl.a, $$3);
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

   private static boolean a(aqi $$0, csz $$1) {
      if ($$1.d()) {
         return false;
      } else {
         csu $$2 = $$1.f();
         return ($$2 instanceof cqx || $$2 instanceof crf) && !$$0.gv().a($$2);
      }
   }

   @Override
   public void a(ahu $$0) {
      ze.a($$0, this, this.e.z());
      this.e.d.a($$0.f());
      aqh $$1 = this.e.z();
      bpl $$2 = $$0.b();
      csz $$3 = this.e.b($$2);
      if ($$3.a($$1.J())) {
         etl $$4 = $$0.e();
         etp $$5 = $$4.e();
         in $$6 = $$4.a();
         if (this.e.a($$6, 1.0)) {
            etp $$7 = $$5.d(etp.b($$6));
            double $$8 = 1.0000001;
            if (Math.abs($$7.a()) < 1.0000001 && Math.abs($$7.b()) < 1.0000001 && Math.abs($$7.c()) < 1.0000001) {
               is $$9 = $$4.b();
               this.e.G();
               int $$10 = this.e.dN().al();
               if ($$6.v() < $$10) {
                  if (this.D == null && $$1.a(this.e, $$6)) {
                     bpm $$11 = this.e.f.a(this.e, $$1, $$3, $$2, $$4);
                     if ($$11.a()) {
                        am.P.a(this.e, $$4.a(), $$3.r());
                     }

                     if ($$9 == is.b && !$$11.a() && $$6.v() >= $$10 - 1 && a(this.e, $$3)) {
                        wu $$12 = wu.a("build.tooHigh", $$10 - 1).a(n.m);
                        this.e.b($$12, true);
                     } else if ($$11.b()) {
                        this.e.a($$2, true);
                     }
                  }
               } else {
                  wu $$13 = wu.a("build.tooHigh", $$10 - 1).a(n.m);
                  this.e.b($$13, true);
               }

               this.e.d.b(new abv($$1, $$6));
               this.e.d.b(new abv($$1, $$6.a($$9)));
            } else {
               g.warn("Rejecting UseItemOnPacket from {}: Location {} too far away from hit block {}.", new Object[]{this.e.fZ().getName(), $$5, $$6});
            }
         }
      }
   }

   @Override
   public void a(ahv $$0) {
      ze.a($$0, this, this.e.z());
      this.a($$0.e());
      aqh $$1 = this.e.z();
      bpl $$2 = $$0.b();
      csz $$3 = this.e.b($$2);
      this.e.G();
      if (!$$3.d() && $$3.a($$1.J())) {
         bpm $$4 = this.e.f.a(this.e, $$1, $$3, $$2);
         if ($$4.b()) {
            this.e.a($$2, true);
         }
      }
   }

   @Override
   public void a(aht $$0) {
      ze.a($$0, this, this.e.z());
      if (this.e.N_()) {
         for (aqh $$1 : this.c.K()) {
            brh $$2 = $$0.a($$1);
            if ($$2 != null) {
               this.e.a($$1, $$2.ds(), $$2.du(), $$2.dy(), $$2.dD(), $$2.dF());
               return;
            }
         }
      }
   }

   @Override
   public void a(agy $$0) {
      ze.a($$0, this, this.e.z());
      if (this.e.db() instanceof cne $$2) {
         $$2.a($$0.b(), $$0.e());
      }
   }

   @Override
   public void a(wu $$0) {
      g.info("{} lost connection: {}", this.e.ad().getString(), $$0.getString());
      this.q();
      super.a($$0);
   }

   private void q() {
      this.Q.close();
      this.c.aw();
      this.c.ah().a(wu.a("multiplayer.player.left", this.e.O_()).a(n.o), false);
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
   public void a(ahl $$0) {
      ze.a($$0, this, this.e.z());
      if ($$0.b() >= 0 && $$0.b() < clg.g()) {
         if (this.e.ga().k != $$0.b() && this.e.fu() == bpl.a) {
            this.e.fz();
         }

         this.e.ga().k = $$0.b();
         this.e.G();
      } else {
         g.warn("{} tried to set an invalid carried item", this.e.ad().getString());
      }
   }

   @Override
   public void a(agg $$0) {
      if (c($$0.b())) {
         this.b(wu.c("multiplayer.disconnect.illegal_characters"));
      } else {
         Optional<xb> $$1 = this.a($$0.h());
         if ($$1.isPresent()) {
            this.c.execute(() -> {
               xk $$2;
               try {
                  $$2 = this.a($$0, $$1.get());
               } catch (xo.a var6) {
                  this.a(var6);
                  return;
               }

               CompletableFuture<aqz> $$5 = this.a($$2.c());
               wu $$6 = this.c.bm().decorate(this.e, $$2.d());
               this.Q.append($$5, $$2x -> {
                  xk $$3 = $$2.a($$6).a($$2x.e());
                  this.b($$3);
               });
            });
         }
      }
   }

   @Override
   public void a(agf $$0) {
      if (c($$0.b())) {
         this.b(wu.c("multiplayer.disconnect.illegal_characters"));
      } else {
         Optional<xb> $$1 = this.a($$0.h());
         if ($$1.isPresent()) {
            this.c.execute(() -> {
               this.a($$0, $$1.get());
               this.r();
            });
         }
      }
   }

   private void a(agf $$0, xb $$1) {
      ParseResults<ed> $$2 = this.b($$0.b());

      Map<String, xk> $$3;
      try {
         $$3 = this.a($$0, xm.a($$2), $$1);
      } catch (xo.a var6) {
         this.a(var6);
         return;
      }

      eb $$6 = new eb.a($$3);
      $$2 = ee.a($$2, $$1x -> $$1x.a($$6, this.Q));
      this.c.aH().a($$2, $$0.b());
   }

   private void a(xo.a $$0) {
      g.warn("Failed to update secure chat state for {}: '{}'", this.e.fZ().getName(), $$0.b().getString());
      if ($$0.a()) {
         this.b($$0.b());
      } else {
         this.e.a($$0.b().f().a(n.m));
      }
   }

   private Map<String, xk> a(agf $$0, xm<?> $$1, xb $$2) throws xo.a {
      Map<String, xk> $$3 = new Object2ObjectOpenHashMap();

      for (xm.a<?> $$4 : $$1.a()) {
         xg $$5 = $$0.g().a($$4.a());
         xn $$6 = new xn($$4.c(), $$0.e(), $$0.f(), $$2);
         $$3.put($$4.a(), this.N.unpack($$5, $$6));
      }

      return $$3;
   }

   private ParseResults<ed> b(String $$0) {
      CommandDispatcher<ed> $$1 = this.c.aH().a();
      return $$1.parse($$0, this.e.de());
   }

   private Optional<xb> a(xb.b $$0) {
      Optional<xb> $$1 = this.b($$0);
      if (this.e.D() == clf.c) {
         this.b(new afj(wu.c("chat.disabled.options").a(n.m), false));
         return Optional.empty();
      } else {
         this.e.G();
         return $$1;
      }
   }

   private Optional<xb> b(xb.b $$0) {
      synchronized (this.O) {
         Optional<xb> $$1 = this.O.a($$0);
         if ($$1.isEmpty()) {
            g.warn("Failed to validate message acknowledgements from {}", this.e.ad().getString());
            this.b(k);
         }

         return $$1;
      }
   }

   private static boolean c(String $$0) {
      for (int $$1 = 0; $$1 < $$0.length(); $$1++) {
         if (!ayu.a($$0.charAt($$1))) {
            return true;
         }
      }

      return false;
   }

   private xk a(agg $$0, xb $$1) throws xo.a {
      xn $$2 = new xn($$0.b(), $$0.e(), $$0.f(), $$1);
      return this.N.unpack($$0.g(), $$2);
   }

   private void b(xk $$0) {
      this.c.ah().a($$0, this.e, wq.a(wq.c, this.e));
      this.r();
   }

   private void r() {
      this.o += 20;
      if (this.o > 200 && !this.c.ah().f(this.e.fZ())) {
         this.b(wu.c("disconnect.spam"));
      }
   }

   @Override
   public void a(age $$0) {
      synchronized (this.O) {
         if (!this.O.a($$0.b())) {
            g.warn("Failed to validate message acknowledgements from {}", this.e.ad().getString());
            this.b(k);
         }
      }
   }

   @Override
   public void a(ahs $$0) {
      ze.a($$0, this, this.e.z());
      this.e.G();
      this.e.a($$0.b());
   }

   @Override
   public void a(ahd $$0) {
      ze.a($$0, this, this.e.z());
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
            if (this.e.db() instanceof bsk $$1) {
               int $$2 = $$0.f();
               if ($$1.a() && $$2 > 0) {
                  $$1.c($$2);
               }
            }
            break;
         case g:
            if (this.e.db() instanceof bsk $$3) {
               $$3.b();
            }
            break;
         case h:
            if (this.e.da() instanceof brt $$4) {
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

   public void a(xk $$0) {
      xg $$1 = $$0.l();
      if ($$1 != null) {
         this.P.a($$0.m(), $$0.l());
         int $$2;
         synchronized (this.O) {
            this.O.a($$1);
            $$2 = this.O.a();
         }

         if ($$2 > 4096) {
            this.b(wu.c("multiplayer.disconnect.too_many_pending_chats"));
         }
      }
   }

   public void a(xk $$0, wq.a $$1) {
      this.b(new adn($$0.k().c(), $$0.k().b(), $$0.l(), $$0.m().a(this.P), $$0.n(), $$0.o(), $$1));
      this.a($$0);
   }

   public void a(wu $$0, wq.a $$1) {
      this.b(new acp($$0, $$1));
   }

   public SocketAddress n() {
      return this.d.d();
   }

   public void o() {
      this.R = true;
      this.q();
      this.b(afh.a);
      this.d.a(abb.b);
   }

   @Override
   public void a(ajc $$0) {
      this.d.a(new aiz($$0.b()));
   }

   @Override
   public void a(agt $$0) {
      ze.a($$0, this, this.e.z());
      final aqh $$1 = this.e.z();
      final brh $$2 = $$0.a($$1);
      this.e.G();
      this.e.g($$0.b());
      if ($$2 != null) {
         if (!$$1.C_().a($$2.dn())) {
            return;
         }

         etk $$3 = $$2.cI();
         if (this.e.a($$3, 1.0)) {
            $$0.a(new agt.c() {
               private void a(bpl $$0, arh.a $$1x) {
                  csz $$2 = arh.this.e.b($$0);
                  if ($$2.a($$1.J())) {
                     csz $$3 = $$2.r();
                     bpm $$4 = $$1.run(arh.this.e, $$2, $$0);
                     if ($$4.a()) {
                        am.T.a(arh.this.e, $$3, $$2);
                        if ($$4.b()) {
                           arh.this.e.a($$0, true);
                        }
                     }
                  }
               }

               @Override
               public void a(bpl $$0) {
                  this.a($$0, clh::a);
               }

               @Override
               public void a(bpl $$0, etp $$1x) {
                  this.a($$0, ($$1xxx, $$2xx, $$3) -> $$2xx.a($$1xxx, $$1, $$3));
               }

               @Override
               public void a() {
                  if (!($$2 instanceof chr) && !($$2 instanceof brq) && !($$2 instanceof cln) && $$2 != arh.this.e) {
                     csz $$0 = arh.this.e.b(bpl.a);
                     if ($$0.a($$1.J())) {
                        arh.this.e.e($$2);
                     }
                  } else {
                     arh.this.b(wu.c("multiplayer.disconnect.invalid_entity_attacked"));
                     arh.g.warn("Player {} tried to attack an invalid entity", arh.this.e.ad().getString());
                  }
               }
            });
         }
      }
   }

   @Override
   public void a(agj $$0) {
      ze.a($$0, this, this.e.z());
      this.e.G();
      agj.a $$1 = $$0.b();
      switch ($$1) {
         case a:
            if (this.e.h) {
               this.e.h = false;
               this.e = this.c.ah().a(this.e, true);
               am.w.a(this.e, dad.j, dad.h);
            } else {
               if (this.e.ey() > 0.0F) {
                  return;
               }

               this.e = this.c.ah().a(this.e, false);
               if (this.c.j()) {
                  this.e.a(daa.d);
                  this.e.dN().aa().a(czz.r).a(false, this.c);
               }
            }
            break;
         case b:
            this.e.H().a(this.e);
      }
   }

   @Override
   public void a(ago $$0) {
      ze.a($$0, this, this.e.z());
      this.e.s();
   }

   @Override
   public void a(agn $$0) {
      ze.a($$0, this, this.e.z());
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
                  Entry<csz> $$3 = (Entry<csz>)var4.next();
                  this.e.cc.b($$3.getIntKey(), (csz)$$3.getValue());
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
   public void a(aha $$0) {
      ze.a($$0, this, this.e.z());
      this.e.G();
      if (!this.e.N_() && this.e.cc.j == $$0.b() && this.e.cc instanceof cpr) {
         if (!this.e.cc.a(this.e)) {
            g.debug("Player {} interacted with invalid menu {}", this.e, this.e.cc);
         } else {
            this.c.aJ().a($$0.e()).ifPresent($$1 -> ((cpr)this.e.cc).a($$0.f(), (cxf<?>)$$1, this.e));
         }
      }
   }

   @Override
   public void a(agm $$0) {
      ze.a($$0, this, this.e.z());
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
   public void a(aho $$0) {
      ze.a($$0, this, this.e.z());
      if (this.e.f.e()) {
         boolean $$1 = $$0.b() < 0;
         csz $$2 = $$0.e();
         if (!$$2.a(this.e.dN().J())) {
            return;
         }

         cvm $$3 = $$2.a(ka.M, cvm.a);
         if ($$3.a("x") && $$3.a("y") && $$3.a("z")) {
            in $$4 = dnm.b($$3.d());
            if (this.e.dN().p($$4)) {
               dnm $$5 = this.e.dN().c_($$4);
               if ($$5 != null) {
                  $$5.a($$2, this.e.dN().H_());
               }
            }
         }

         boolean $$6 = $$0.b() >= 1 && $$0.b() <= 45;
         boolean $$7 = $$2.d() || $$2.m() >= 0 && $$2.G() <= $$2.i() && !$$2.d();
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
   public void a(ahr $$0) {
      List<String> $$1 = Stream.of($$0.f()).map(n::a).collect(Collectors.toList());
      this.a($$1).thenAcceptAsync($$1x -> this.a($$0, $$1x), this.c);
   }

   private void a(ahr $$0, List<aqz> $$1) {
      this.e.G();
      aqh $$2 = this.e.z();
      in $$3 = $$0.b();
      if ($$2.B($$3)) {
         if (!($$2.c_($$3) instanceof dow $$5)) {
            return;
         }

         $$5.a(this.e, $$0.e(), $$1);
      }
   }

   @Override
   public void a(ahb $$0) {
      ze.a($$0, this, this.e.z());
      this.e.gb().b = $$0.b() && this.e.gb().c;
   }

   @Override
   public void a(zt $$0) {
      ze.a($$0, this, this.e.z());
      this.e.a($$0.b());
   }

   @Override
   public void a(agd $$0) {
      ze.a($$0, this, this.e.z());
      if (this.e.m(2) || this.i()) {
         this.c.a($$0.b(), false);
      }
   }

   @Override
   public void a(agv $$0) {
      ze.a($$0, this, this.e.z());
      if (this.e.m(2) || this.i()) {
         this.c.b($$0.b());
      }
   }

   @Override
   public void a(agh $$0) {
      ze.a($$0, this, this.e.z());
      xl.a $$1 = $$0.b();
      clk.a $$2 = this.M != null ? this.M.d().b() : null;
      clk.a $$3 = $$1.b();
      if (!Objects.equals($$2, $$3)) {
         if ($$2 != null && $$3.b().isBefore($$2.b())) {
            this.b(clk.a);
         } else {
            try {
               ayl $$4 = this.c.as();
               if ($$4 == null) {
                  g.warn("Ignoring chat session from {} due to missing Services public key", this.e.fZ().getName());
                  return;
               }

               this.a($$1.a(this.e.fZ(), $$4));
            } catch (clk.b var6) {
               g.error("Failed to validate profile key: {}", var6.getMessage());
               this.b(var6.b());
            }
         }
      }
   }

   @Override
   public void a(agl $$0) {
      if (!this.R) {
         throw new IllegalStateException("Client acknowledged config, but none was requested");
      } else {
         this.d.a(abb.a, new arf(this.c, this.d, this.a(this.e.B())));
      }
   }

   @Override
   public void a(agi $$0) {
      ze.a($$0, this, this.e.z());
      this.f.a($$0.b());
   }

   @Override
   public void a(agq $$0) {
      ze.a($$0, this, this.e.z());
      this.c.a(this.e, $$0.b());
   }

   private void a(xl $$0) {
      this.M = $$0;
      this.N = $$0.a(this.e.cx());
      this.Q.append(() -> {
         this.e.a($$0);
         this.c.ah().a(new ads(EnumSet.of(ads.a.b), List.of(this.e)));
      });
   }

   @Override
   public void a(zu $$0) {
   }

   @Override
   public aqi p() {
      return this.e;
   }

   @FunctionalInterface
   interface a {
      bpm run(aqi var1, brh var2, bpl var3);
   }
}
