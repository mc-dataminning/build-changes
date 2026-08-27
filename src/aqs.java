import com.google.common.collect.Lists;
import com.google.common.primitives.Floats;
import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.ParseResults;
import com.mojang.brigadier.StringReader;
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

public class aqs extends aqp implements afl, aqv, vu {
   static final Logger g = LogUtils.getLogger();
   private static final int h = -1;
   private static final int i = 4096;
   private static final int j = 80;
   private static final wg k = wg.c("multiplayer.disconnect.chat_validation_failed");
   public apt e;
   public final aqo f;
   private int l;
   private int m = -1;
   private int n;
   private int o;
   private double p;
   private double q;
   private double r;
   private double s;
   private double t;
   private double u;
   @Nullable
   private bpv v;
   private double w;
   private double x;
   private double y;
   private double z;
   private double A;
   private double B;
   @Nullable
   private esa C;
   private int D;
   private int E;
   private boolean F;
   private int G;
   private boolean H;
   private int I;
   private int J;
   private int K;
   @Nullable
   private wx L;
   private xa.b M;
   private final wp N = new wp(20);
   private final wt O = wt.a();
   private final awy P;
   private boolean Q;

   public aqs(MinecraftServer $$0, ve $$1, apt $$2, aqh $$3) {
      super($$0, $$1, $$3);
      this.f = new aqo($$1.e());
      this.e = $$2;
      $$2.d = this;
      $$2.X().a();
      this.M = xa.b.unsigned($$2.cw(), $$0::aB);
      this.P = new awy($$0);
   }

   @Override
   public void e() {
      if (this.m > -1) {
         this.b(new abd(this.m));
         this.m = -1;
      }

      this.m();
      this.e.K = this.e.dr();
      this.e.L = this.e.dt();
      this.e.M = this.e.dx();
      this.e.m();
      this.e.a(this.p, this.q, this.r, this.e.dC(), this.e.dE());
      this.l++;
      this.K = this.J;
      if (this.F && !this.e.fI() && !this.e.bO() && !this.e.ey()) {
         if (++this.G > this.a((bpv)this.e)) {
            g.warn("{} was kicked for floating too long!", this.e.ad().getString());
            this.b(wg.c("multiplayer.disconnect.flying"));
            return;
         }
      } else {
         this.F = false;
         this.G = 0;
      }

      this.v = this.e.cW();
      if (this.v != this.e && this.v.cN() == this.e) {
         this.w = this.v.dr();
         this.x = this.v.dt();
         this.y = this.v.dx();
         this.z = this.v.dr();
         this.A = this.v.dt();
         this.B = this.v.dx();
         if (this.H && this.v.cN() == this.e) {
            if (++this.I > this.a(this.v)) {
               g.warn("{} was kicked for floating a vehicle too long!", this.e.ad().getString());
               this.b(wg.c("multiplayer.disconnect.flying"));
               return;
            }
         } else {
            this.H = false;
            this.I = 0;
         }
      } else {
         this.v = null;
         this.H = false;
         this.I = 0;
      }

      this.f();
      if (this.n > 0) {
         this.n--;
      }

      if (this.o > 0) {
         this.o--;
      }

      if (this.e.M() > 0L && this.c.aq() > 0 && ac.b() - this.e.M() > (long)this.c.aq() * 1000L * 60L) {
         this.b(wg.c("multiplayer.disconnect.idling"));
      }
   }

   private int a(bpv $$0) {
      double $$1 = 0.08 / $$0.aX();
      return axk.c(80.0 * Math.max($$1, 1.0));
   }

   public void m() {
      this.p = this.e.dr();
      this.q = this.e.dt();
      this.r = this.e.dx();
      this.s = this.e.dr();
      this.t = this.e.dt();
      this.u = this.e.dx();
   }

   @Override
   public boolean c() {
      return this.d.i() && !this.Q;
   }

   @Override
   public boolean a(yn<?> $$0) {
      return super.a($$0) ? true : this.Q && this.d.i() && $$0 instanceof afx;
   }

   @Override
   protected GameProfile j() {
      return this.e.fY();
   }

   private <T, R> CompletableFuture<R> a(T $$0, BiFunction<aqx, T, CompletableFuture<R>> $$1) {
      return $$1.apply(this.e.X(), $$0).thenApply($$0x -> {
         if (!this.c()) {
            g.debug("Ignoring packet due to disconnection");
            throw new CancellationException("disconnected");
         } else {
            return (R)$$0x;
         }
      });
   }

   private CompletableFuture<aqk> a(String $$0) {
      return this.a($$0, aqx::a);
   }

   private CompletableFuture<List<aqk>> a(List<String> $$0) {
      return this.a($$0, aqx::a);
   }

   @Override
   public void a(agq $$0) {
      yq.a($$0, this, this.e.z());
      this.e.a($$0.b(), $$0.e(), $$0.f(), $$0.g());
   }

   private static boolean b(double $$0, double $$1, double $$2, float $$3, float $$4) {
      return Double.isNaN($$0) || Double.isNaN($$1) || Double.isNaN($$2) || !Floats.isFinite($$4) || !Floats.isFinite($$3);
   }

   private static double a(double $$0) {
      return axk.a($$0, -3.0E7, 3.0E7);
   }

   private static double b(double $$0) {
      return axk.a($$0, -2.0E7, 2.0E7);
   }

   @Override
   public void a(agj $$0) {
      yq.a($$0, this, this.e.z());
      if (b($$0.b(), $$0.e(), $$0.f(), $$0.g(), $$0.h())) {
         this.b(wg.c("multiplayer.disconnect.invalid_vehicle_movement"));
      } else {
         bpv $$1 = this.e.cW();
         if ($$1 != this.e && $$1.cN() == this.e && $$1 == this.v) {
            aps $$2 = this.e.z();
            double $$3 = $$1.dr();
            double $$4 = $$1.dt();
            double $$5 = $$1.dx();
            double $$6 = a($$0.b());
            double $$7 = b($$0.e());
            double $$8 = a($$0.f());
            float $$9 = axk.g($$0.g());
            float $$10 = axk.g($$0.h());
            double $$11 = $$6 - this.w;
            double $$12 = $$7 - this.x;
            double $$13 = $$8 - this.y;
            double $$14 = $$1.dp().g();
            double $$15 = $$11 * $$11 + $$12 * $$12 + $$13 * $$13;
            if ($$15 - $$14 > 100.0 && !this.i()) {
               g.warn("{} (vehicle of {}) moved too quickly! {},{},{}", new Object[]{$$1.ad().getString(), this.e.ad().getString(), $$11, $$12, $$13});
               this.b(new act($$1));
               return;
            }

            boolean $$16 = $$2.a($$1, $$1.cH().h(0.0625));
            $$11 = $$6 - this.z;
            $$12 = $$7 - this.A - 1.0E-6;
            $$13 = $$8 - this.B;
            boolean $$17 = $$1.R;
            if ($$1 instanceof bqo $$18 && $$18.q_()) {
               $$18.n();
            }

            $$1.a(bqt.b, new esa($$11, $$12, $$13));
            $$11 = $$6 - $$1.dr();
            $$12 = $$7 - $$1.dt();
            if ($$12 > -0.5 || $$12 < 0.5) {
               $$12 = 0.0;
            }

            $$13 = $$8 - $$1.dx();
            $$15 = $$11 * $$11 + $$12 * $$12 + $$13 * $$13;
            boolean $$20 = false;
            if ($$15 > 0.0625) {
               $$20 = true;
               g.warn("{} (vehicle of {}) moved wrongly! {}", new Object[]{$$1.ad().getString(), this.e.ad().getString(), Math.sqrt($$15)});
            }

            $$1.a($$6, $$7, $$8, $$9, $$10);
            boolean $$21 = $$2.a($$1, $$1.cH().h(0.0625));
            if ($$16 && ($$20 || !$$21)) {
               $$1.a($$3, $$4, $$5, $$9, $$10);
               this.b(new act($$1));
               return;
            }

            this.e.z().l().a(this.e);
            this.e.b(this.e.dr() - $$3, this.e.dt() - $$4, this.e.dx() - $$5);
            this.H = $$12 >= -0.03125 && !$$17 && !this.c.ae() && !$$1.aV() && this.b($$1);
            this.z = $$1.dr();
            this.A = $$1.dt();
            this.B = $$1.dx();
         }
      }
   }

   private boolean b(bpv $$0) {
      return $$0.dM().a($$0.cH().g(0.0625).b(0.0, -0.55, 0.0)).allMatch(doy.a::i);
   }

   @Override
   public void a(afn $$0) {
      yq.a($$0, this, this.e.z());
      if ($$0.b() == this.D) {
         if (this.C == null) {
            this.b(wg.c("multiplayer.disconnect.invalid_player_movement"));
            return;
         }

         this.e.a(this.C.c, this.C.d, this.C.e, this.e.dC(), this.e.dE());
         this.s = this.C.c;
         this.t = this.C.d;
         this.u = this.C.e;
         if (this.e.O()) {
            this.e.P();
         }

         this.C = null;
      }
   }

   @Override
   public void a(ags $$0) {
      yq.a($$0, this, this.e.z());
      this.c.aJ().a($$0.b()).ifPresent(this.e.I()::e);
   }

   @Override
   public void a(agr $$0) {
      yq.a($$0, this, this.e.z());
      this.e.I().a($$0.b(), $$0.e(), $$0.f());
   }

   @Override
   public void a(agu $$0) {
      yq.a($$0, this, this.e.z());
      if ($$0.e() == agu.a.a) {
         ajt $$1 = Objects.requireNonNull($$0.f());
         af $$2 = this.c.aE().a($$1);
         if ($$2 != null) {
            this.e.Q().a($$2);
         }
      }
   }

   @Override
   public void a(afw $$0) {
      yq.a($$0, this, this.e.z());
      StringReader $$1 = new StringReader($$0.e());
      if ($$1.canRead() && $$1.peek() == '/') {
         $$1.skip();
      }

      ParseResults<du> $$2 = this.c.aH().a().parse($$1, this.e.dd());
      this.c.aH().a().getCompletionSuggestions($$2).thenAccept($$1x -> this.b(new abq($$0.b(), $$1x)));
   }

   @Override
   public void a(agy $$0) {
      yq.a($$0, this, this.e.z());
      if (!this.c.q()) {
         this.e.a(wg.c("advMode.notEnabled"));
      } else if (!this.e.gw()) {
         this.e.a(wg.c("advMode.notAllowed"));
      } else {
         cxy $$1 = null;
         dmp $$2 = null;
         ib $$3 = $$0.b();
         dmf $$4 = this.e.dM().c_($$3);
         if ($$4 instanceof dmp) {
            $$2 = (dmp)$$4;
            $$1 = $$2.b();
         }

         String $$5 = $$0.e();
         boolean $$6 = $$0.f();
         if ($$1 != null) {
            dmp.a $$7 = $$2.l();
            doz $$8 = this.e.dM().a_($$3);
            ih $$9 = $$8.c(ddh.b);

            doz $$13 = (switch ($$0.i()) {
               case a -> dca.kH.n();
               case b -> dca.kG.n();
               default -> dca.fN.n();
            }).a(ddh.b, $$9).a(ddh.c, Boolean.valueOf($$0.g()));
            if ($$13 != $$8) {
               this.e.dM().a($$3, $$13, 2);
               $$4.b($$13);
               this.e.dM().m($$3).a($$4);
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
            if (!ayf.b($$5)) {
               this.e.a(wg.a("advMode.setCommand.success", $$5));
            }
         }
      }
   }

   @Override
   public void a(agz $$0) {
      yq.a($$0, this, this.e.z());
      if (!this.c.q()) {
         this.e.a(wg.c("advMode.notEnabled"));
      } else if (!this.e.gw()) {
         this.e.a(wg.c("advMode.notAllowed"));
      } else {
         cxy $$1 = $$0.a(this.e.dM());
         if ($$1 != null) {
            $$1.a($$0.b());
            $$1.a($$0.e());
            if (!$$0.e()) {
               $$1.c(null);
            }

            $$1.f();
            this.e.a(wg.a("advMode.setCommand.success", $$0.b()));
         }
      }
   }

   @Override
   public void a(agl $$0) {
      yq.a($$0, this, this.e.z());
      this.e.fZ().c($$0.b());
      this.e.d.b(new abv(-2, 0, this.e.fZ().l, this.e.fZ().a(this.e.fZ().l)));
      this.e.d.b(new abv(-2, 0, $$0.b(), this.e.fZ().a($$0.b())));
      this.e.d.b(new adx(this.e.fZ().l));
   }

   @Override
   public void a(agt $$0) {
      yq.a($$0, this, this.e.z());
      if (this.e.bY instanceof cmr $$1) {
         if (!$$1.a(this.e)) {
            g.debug("Player {} interacted with invalid menu {}", this.e, $$1);
            return;
         }

         $$1.a($$0.b());
      }
   }

   @Override
   public void a(agw $$0) {
      yq.a($$0, this, this.e.z());
      if (this.e.bY instanceof cms $$1) {
         if (!this.e.bY.a(this.e)) {
            g.debug("Player {} interacted with invalid menu {}", this.e, this.e.bY);
            return;
         }

         $$1.a($$0.b(), $$0.e());
      }
   }

   @Override
   public void a(ahc $$0) {
      yq.a($$0, this, this.e.z());
      if (this.e.gw()) {
         ib $$1 = $$0.b();
         doz $$2 = this.e.dM().a_($$1);
         if (this.e.dM().c_($$1) instanceof dnu $$4) {
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
               if ($$0.e() == dnu.a.b) {
                  if ($$4.z()) {
                     this.e.a(wg.a("structure_block.save_success", $$5), false);
                  } else {
                     this.e.a(wg.a("structure_block.save_failure", $$5), false);
                  }
               } else if ($$0.e() == dnu.a.c) {
                  if (!$$4.B()) {
                     this.e.a(wg.a("structure_block.load_not_found", $$5), false);
                  } else if ($$4.a(this.e.z())) {
                     this.e.a(wg.a("structure_block.load_success", $$5), false);
                  } else {
                     this.e.a(wg.a("structure_block.load_prepare", $$5), false);
                  }
               } else if ($$0.e() == dnu.a.d) {
                  if ($$4.y()) {
                     this.e.a(wg.a("structure_block.size_success", $$5), false);
                  } else {
                     this.e.a(wg.c("structure_block.size_failure"), false);
                  }
               }
            } else {
               this.e.a(wg.a("structure_block.invalid_structure_name", $$0.g()), false);
            }

            $$4.e();
            this.e.dM().a($$1, $$2, $$2, 3);
         }
      }
   }

   @Override
   public void a(ahb $$0) {
      yq.a($$0, this, this.e.z());
      if (this.e.gw()) {
         ib $$1 = $$0.b();
         doz $$2 = this.e.dM().a_($$1);
         if (this.e.dM().c_($$1) instanceof dnf $$4) {
            $$4.a($$0.e());
            $$4.b($$0.f());
            $$4.a(ajs.a(ks.aI, $$0.g()));
            $$4.a($$0.h());
            $$4.a($$0.i());
            $$4.a($$0.k());
            $$4.b($$0.j());
            $$4.e();
            this.e.dM().a($$1, $$2, $$2, 3);
         }
      }
   }

   @Override
   public void a(agg $$0) {
      yq.a($$0, this, this.e.z());
      if (this.e.gw()) {
         ib $$1 = $$0.b();
         if (this.e.dM().c_($$1) instanceof dnf $$3) {
            $$3.a(this.e.z(), $$0.e(), $$0.f());
         }
      }
   }

   @Override
   public void a(agv $$0) {
      yq.a($$0, this, this.e.z());
      int $$1 = $$0.b();
      if (this.e.bY instanceof cny $$2) {
         if (!$$2.a(this.e)) {
            g.debug("Player {} interacted with invalid menu {}", this.e, $$2);
            return;
         }

         $$2.e($$1);
         $$2.h($$1);
      }
   }

   @Override
   public void a(agd $$0) {
      int $$1 = $$0.b();
      if (cjs.d($$1) || $$1 == 40) {
         List<String> $$2 = Lists.newArrayList();
         Optional<String> $$3 = $$0.f();
         $$3.ifPresent($$2::add);
         $$0.e().stream().limit(100L).forEach($$2::add);
         Consumer<List<aqk>> $$4 = $$3.isPresent() ? $$1x -> this.a((aqk)$$1x.get(0), $$1x.subList(1, $$1x.size()), $$1) : $$1x -> this.a($$1x, $$1);
         this.a($$2).thenAcceptAsync($$4, this.c);
      }
   }

   private void a(List<aqk> $$0, int $$1) {
      crj $$2 = this.e.fZ().a($$1);
      if ($$2.a(crm.tY)) {
         List<aqj<String>> $$3 = $$0.stream().map(this::a).toList();
         $$2.b(jp.z, new cul($$3));
      }
   }

   private void a(aqk $$0, List<aqk> $$1, int $$2) {
      crj $$3 = this.e.fZ().a($$2);
      if ($$3.a(crm.tY)) {
         crj $$4 = $$3.a(crm.tZ, 1);
         $$4.c(jp.z);
         List<aqj<wg>> $$5 = $$1.stream().map($$0x -> this.a($$0x).a(wg::b)).toList();
         $$4.b(jp.A, new cum(this.a($$0), this.e.ad().getString(), 0, $$5, true));
         this.e.fZ().a($$2, $$4);
      }
   }

   private aqj<String> a(aqk $$0) {
      return this.e.Y() ? aqj.a($$0.b()) : aqj.a($$0);
   }

   @Override
   public void a(age $$0) {
      yq.a($$0, this, this.e.z());
      if (this.e.m(2)) {
         bpv $$1 = this.e.dM().a($$0.e());
         if ($$1 != null) {
            tm $$2 = $$1.f(new tm());
            this.e.d.b(new aex($$0.b(), $$2));
         }
      }
   }

   @Override
   public void a(agb $$0) {
      yq.a($$0, this, this.e.z());
      if (!this.e.N_() && $$0.e() == this.e.bY.j) {
         if (this.e.bY instanceof cnd $$1 && $$1.m() instanceof dmt $$2) {
            $$2.a($$0.b(), $$0.f());
         }
      }
   }

   @Override
   public void a(afo $$0) {
      yq.a($$0, this, this.e.z());
      if (this.e.m(2)) {
         dmf $$1 = this.e.dM().c_($$0.e());
         tm $$2 = $$1 != null ? $$1.d(this.e.dO()) : null;
         this.e.d.b(new aex($$0.b(), $$2));
      }
   }

   @Override
   public void a(agi $$0) {
      yq.a($$0, this, this.e.z());
      if (b($$0.a(0.0), $$0.b(0.0), $$0.c(0.0), $$0.a(0.0F), $$0.b(0.0F))) {
         this.b(wg.c("multiplayer.disconnect.invalid_player_movement"));
      } else {
         aps $$1 = this.e.z();
         if (!this.e.g) {
            if (this.l == 0) {
               this.m();
            }

            if (this.C != null) {
               if (this.l - this.E > 20) {
                  this.E = this.l;
                  this.a(this.C.c, this.C.d, this.C.e, this.e.dC(), this.e.dE());
               }
            } else {
               this.E = this.l;
               double $$2 = a($$0.a(this.e.dr()));
               double $$3 = b($$0.b(this.e.dt()));
               double $$4 = a($$0.c(this.e.dx()));
               float $$5 = axk.g($$0.a(this.e.dC()));
               float $$6 = axk.g($$0.b(this.e.dE()));
               if (this.e.bO()) {
                  this.e.a(this.e.dr(), this.e.dt(), this.e.dx(), $$5, $$6);
                  this.e.z().l().a(this.e);
               } else {
                  double $$7 = this.e.dr();
                  double $$8 = this.e.dt();
                  double $$9 = this.e.dx();
                  double $$10 = $$2 - this.p;
                  double $$11 = $$3 - this.q;
                  double $$12 = $$4 - this.r;
                  double $$13 = this.e.dp().g();
                  double $$14 = $$10 * $$10 + $$11 * $$11 + $$12 * $$12;
                  if (this.e.fI()) {
                     if ($$14 > 1.0) {
                        this.a(this.e.dr(), this.e.dt(), this.e.dx(), $$5, $$6);
                     }
                  } else {
                     boolean $$15 = this.e.fB();
                     if ($$1.s().i()) {
                        this.J++;
                        int $$16 = this.J - this.K;
                        if ($$16 > 5) {
                           g.debug("{} is sending move packets too frequently ({} packets since last tick)", this.e.ad().getString(), $$16);
                           $$16 = 1;
                        }

                        if (!this.e.O() && (!this.e.dM().aa().b(cyt.t) || !$$15)) {
                           float $$17 = $$15 ? 300.0F : 100.0F;
                           if ($$14 - $$13 > (double)($$17 * (float)$$16) && !this.i()) {
                              g.warn("{} moved too quickly! {},{},{}", new Object[]{this.e.ad().getString(), $$10, $$11, $$12});
                              this.a(this.e.dr(), this.e.dt(), this.e.dx(), this.e.dC(), this.e.dE());
                              return;
                           }
                        }
                     }

                     erv $$18 = this.e.cH();
                     $$10 = $$2 - this.s;
                     $$11 = $$3 - this.t;
                     $$12 = $$4 - this.u;
                     boolean $$19 = $$11 > 0.0;
                     if (this.e.aC() && !$$0.b() && $$19) {
                        this.e.fg();
                     }

                     boolean $$20 = this.e.R;
                     this.e.a(bqt.b, new esa($$10, $$11, $$12));
                     $$10 = $$2 - this.e.dr();
                     $$11 = $$3 - this.e.dt();
                     if ($$11 > -0.5 || $$11 < 0.5) {
                        $$11 = 0.0;
                     }

                     $$12 = $$4 - this.e.dx();
                     $$14 = $$10 * $$10 + $$11 * $$11 + $$12 * $$12;
                     boolean $$22 = false;
                     if (!this.e.O() && $$14 > 0.0625 && !this.e.fI() && !this.e.f.e() && this.e.f.b() != cyu.d) {
                        $$22 = true;
                        g.warn("{} moved wrongly!", this.e.ad().getString());
                     }

                     if (this.e.af || this.e.fI() || (!$$22 || !$$1.a(this.e, $$18)) && !this.a($$1, $$18, $$2, $$3, $$4)) {
                        this.e.a($$2, $$3, $$4, $$5, $$6);
                        boolean $$23 = this.e.fo();
                        this.F = $$11 >= -0.03125
                           && !$$20
                           && this.e.f.b() != cyu.d
                           && !this.c.ae()
                           && !this.e.ga().c
                           && !this.e.b(bpj.y)
                           && !$$15
                           && !$$23
                           && this.b(this.e);
                        this.e.z().l().a(this.e);
                        this.e.a(this.e.dr() - $$7, this.e.dt() - $$8, this.e.dx() - $$9, $$0.b());
                        this.e.a($$0.b(), new esa(this.e.dr() - $$7, this.e.dt() - $$8, this.e.dx() - $$9));
                        if ($$19) {
                           this.e.n();
                        }

                        if ($$0.b() || this.e.bg() || this.e.q_() || this.e.N_() || this.e.f() || $$15 || $$23) {
                           this.e.cs = null;
                        }

                        this.e.b(this.e.dr() - $$7, this.e.dt() - $$8, this.e.dx() - $$9);
                        this.s = this.e.dr();
                        this.t = this.e.dt();
                        this.u = this.e.dx();
                     } else {
                        this.a($$7, $$8, $$9, $$5, $$6);
                        this.e.a(this.e.dr() - $$7, this.e.dt() - $$8, this.e.dx() - $$9, $$0.b());
                     }
                  }
               }
            }
         }
      }
   }

   private boolean a(cza $$0, erv $$1, double $$2, double $$3, double $$4) {
      erv $$5 = this.e.cH().d($$2 - this.e.dr(), $$3 - this.e.dt(), $$4 - this.e.dx());
      Iterable<est> $$6 = $$0.d(this.e, $$5.h(1.0E-5F));
      est $$7 = esq.a($$1.h(1.0E-5F));

      for (est $$8 : $$6) {
         if (!esq.c($$8, $$7, ese.i)) {
            return true;
         }
      }

      return false;
   }

   public void a(double $$0, double $$1, double $$2, float $$3, float $$4) {
      this.a($$0, $$1, $$2, $$3, $$4, Collections.emptySet());
   }

   public void a(double $$0, double $$1, double $$2, float $$3, float $$4, Set<brb> $$5) {
      double $$6 = $$5.contains(brb.a) ? this.e.dr() : 0.0;
      double $$7 = $$5.contains(brb.b) ? this.e.dt() : 0.0;
      double $$8 = $$5.contains(brb.c) ? this.e.dx() : 0.0;
      float $$9 = $$5.contains(brb.d) ? this.e.dC() : 0.0F;
      float $$10 = $$5.contains(brb.e) ? this.e.dE() : 0.0F;
      this.C = new esa($$0, $$1, $$2);
      if (++this.D == Integer.MAX_VALUE) {
         this.D = 0;
      }

      this.E = this.l;
      this.e.cs = null;
      this.e.a($$0, $$1, $$2, $$3, $$4);
      this.e.d.b(new adg($$0 - $$6, $$1 - $$7, $$2 - $$8, $$3 - $$9, $$4 - $$10, $$5, this.D));
   }

   @Override
   public void a(ago $$0) {
      yq.a($$0, this, this.e.z());
      ib $$1 = $$0.b();
      this.e.G();
      ago.a $$2 = $$0.f();
      switch ($$2) {
         case g:
            if (!this.e.N_()) {
               crj $$3 = this.e.b(bnz.b);
               this.e.a(bnz.b, this.e.b(bnz.a));
               this.e.a(bnz.a, $$3);
               this.e.fy();
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
            this.e.fx();
            return;
         case a:
         case b:
         case c:
            this.e.f.a($$1, $$2, $$0.e(), this.e.dM().al(), $$0.g());
            this.e.d.a($$0.g());
            return;
         default:
            throw new IllegalArgumentException("Invalid player action");
      }
   }

   private static boolean a(apt $$0, crj $$1) {
      if ($$1.d()) {
         return false;
      } else {
         cre $$2 = $$1.f();
         return ($$2 instanceof cph || $$2 instanceof cpp) && !$$0.gu().a($$2);
      }
   }

   @Override
   public void a(ahg $$0) {
      yq.a($$0, this, this.e.z());
      this.e.d.a($$0.f());
      aps $$1 = this.e.z();
      bnz $$2 = $$0.b();
      crj $$3 = this.e.b($$2);
      if ($$3.a($$1.J())) {
         erw $$4 = $$0.e();
         esa $$5 = $$4.e();
         ib $$6 = $$4.a();
         if (this.e.a($$6, 1.0)) {
            esa $$7 = $$5.d(esa.b($$6));
            double $$8 = 1.0000001;
            if (Math.abs($$7.a()) < 1.0000001 && Math.abs($$7.b()) < 1.0000001 && Math.abs($$7.c()) < 1.0000001) {
               ih $$9 = $$4.b();
               this.e.G();
               int $$10 = this.e.dM().al();
               if ($$6.v() < $$10) {
                  if (this.C == null && $$1.a(this.e, $$6)) {
                     boa $$11 = this.e.f.a(this.e, $$1, $$3, $$2, $$4);
                     if ($$11.a()) {
                        am.P.a(this.e, $$4.a(), $$3.r());
                     }

                     if ($$9 == ih.b && !$$11.a() && $$6.v() >= $$10 - 1 && a(this.e, $$3)) {
                        wg $$12 = wg.a("build.tooHigh", $$10 - 1).a(n.m);
                        this.e.b($$12, true);
                     } else if ($$11.b()) {
                        this.e.a($$2, true);
                     }
                  }
               } else {
                  wg $$13 = wg.a("build.tooHigh", $$10 - 1).a(n.m);
                  this.e.b($$13, true);
               }

               this.e.d.b(new abh($$1, $$6));
               this.e.d.b(new abh($$1, $$6.a($$9)));
            } else {
               g.warn("Rejecting UseItemOnPacket from {}: Location {} too far away from hit block {}.", new Object[]{this.e.fY().getName(), $$5, $$6});
            }
         }
      }
   }

   @Override
   public void a(ahh $$0) {
      yq.a($$0, this, this.e.z());
      this.a($$0.e());
      aps $$1 = this.e.z();
      bnz $$2 = $$0.b();
      crj $$3 = this.e.b($$2);
      this.e.G();
      if (!$$3.d() && $$3.a($$1.J())) {
         boa $$4 = this.e.f.a(this.e, $$1, $$3, $$2);
         if ($$4.b()) {
            this.e.a($$2, true);
         }
      }
   }

   @Override
   public void a(ahf $$0) {
      yq.a($$0, this, this.e.z());
      if (this.e.N_()) {
         for (aps $$1 : this.c.K()) {
            bpv $$2 = $$0.a($$1);
            if ($$2 != null) {
               this.e.a($$1, $$2.dr(), $$2.dt(), $$2.dx(), $$2.dC(), $$2.dE());
               return;
            }
         }
      }
   }

   @Override
   public void a(agk $$0) {
      yq.a($$0, this, this.e.z());
      if (this.e.da() instanceof clq $$2) {
         $$2.a($$0.b(), $$0.e());
      }
   }

   @Override
   public void a(wg $$0) {
      g.info("{} lost connection: {}", this.e.ad().getString(), $$0.getString());
      this.q();
      super.a($$0);
   }

   private void q() {
      this.P.close();
      this.c.aw();
      this.c.ah().a(wg.a("multiplayer.player.left", this.e.O_()).a(n.o), false);
      this.e.u();
      this.c.ah().c(this.e);
      this.e.X().b();
   }

   public void a(int $$0) {
      if ($$0 < 0) {
         throw new IllegalArgumentException("Expected packet sequence nr >= 0");
      } else {
         this.m = Math.max($$0, this.m);
      }
   }

   @Override
   public void a(agx $$0) {
      yq.a($$0, this, this.e.z());
      if ($$0.b() >= 0 && $$0.b() < cjs.g()) {
         if (this.e.fZ().l != $$0.b() && this.e.ft() == bnz.a) {
            this.e.fy();
         }

         this.e.fZ().l = $$0.b();
         this.e.G();
      } else {
         g.warn("{} tried to set an invalid carried item", this.e.ad().getString());
      }
   }

   @Override
   public void a(afs $$0) {
      if (c($$0.b())) {
         this.b(wg.c("multiplayer.disconnect.illegal_characters"));
      } else {
         Optional<wn> $$1 = this.a($$0.h());
         if ($$1.isPresent()) {
            this.c.execute(() -> {
               ww $$2;
               try {
                  $$2 = this.a($$0, $$1.get());
               } catch (xa.a var6) {
                  this.a(var6);
                  return;
               }

               CompletableFuture<aqk> $$5 = this.a($$2.c());
               wg $$6 = this.c.bm().decorate(this.e, $$2.d());
               this.P.append($$5, $$2x -> {
                  ww $$3 = $$2.a($$6).a($$2x.e());
                  this.b($$3);
               });
            });
         }
      }
   }

   @Override
   public void a(afr $$0) {
      if (c($$0.b())) {
         this.b(wg.c("multiplayer.disconnect.illegal_characters"));
      } else {
         Optional<wn> $$1 = this.a($$0.h());
         if ($$1.isPresent()) {
            this.c.execute(() -> {
               this.a($$0, $$1.get());
               this.r();
            });
         }
      }
   }

   private void a(afr $$0, wn $$1) {
      ParseResults<du> $$2 = this.b($$0.b());

      Map<String, ww> $$3;
      try {
         $$3 = this.a($$0, wy.a($$2), $$1);
      } catch (xa.a var6) {
         this.a(var6);
         return;
      }

      ds $$6 = new ds.a($$3);
      $$2 = dv.a($$2, $$1x -> $$1x.a($$6, this.P));
      this.c.aH().a($$2, $$0.b());
   }

   private void a(xa.a $$0) {
      g.warn("Failed to update secure chat state for {}: '{}'", this.e.fY().getName(), $$0.b().getString());
      if ($$0.a()) {
         this.b($$0.b());
      } else {
         this.e.a($$0.b().f().a(n.m));
      }
   }

   private Map<String, ww> a(afr $$0, wy<?> $$1, wn $$2) throws xa.a {
      Map<String, ww> $$3 = new Object2ObjectOpenHashMap();

      for (wy.a<?> $$4 : $$1.a()) {
         ws $$5 = $$0.g().a($$4.a());
         wz $$6 = new wz($$4.c(), $$0.e(), $$0.f(), $$2);
         $$3.put($$4.a(), this.M.unpack($$5, $$6));
      }

      return $$3;
   }

   private ParseResults<du> b(String $$0) {
      CommandDispatcher<du> $$1 = this.c.aH().a();
      return $$1.parse($$0, this.e.dd());
   }

   private Optional<wn> a(wn.b $$0) {
      Optional<wn> $$1 = this.b($$0);
      if (this.e.D() == cjr.c) {
         this.b(new aev(wg.c("chat.disabled.options").a(n.m), false));
         return Optional.empty();
      } else {
         this.e.G();
         return $$1;
      }
   }

   private Optional<wn> b(wn.b $$0) {
      synchronized (this.N) {
         Optional<wn> $$1 = this.N.a($$0);
         if ($$1.isEmpty()) {
            g.warn("Failed to validate message acknowledgements from {}", this.e.ad().getString());
            this.b(k);
         }

         return $$1;
      }
   }

   private static boolean c(String $$0) {
      for (int $$1 = 0; $$1 < $$0.length(); $$1++) {
         if (!ayf.a($$0.charAt($$1))) {
            return true;
         }
      }

      return false;
   }

   private ww a(afs $$0, wn $$1) throws xa.a {
      wz $$2 = new wz($$0.b(), $$0.e(), $$0.f(), $$1);
      return this.M.unpack($$0.g(), $$2);
   }

   private void b(ww $$0) {
      this.c.ah().a($$0, this.e, wc.a(wc.c, this.e));
      this.r();
   }

   private void r() {
      this.n += 20;
      if (this.n > 200 && !this.c.ah().f(this.e.fY())) {
         this.b(wg.c("disconnect.spam"));
      }
   }

   @Override
   public void a(afq $$0) {
      synchronized (this.N) {
         if (!this.N.a($$0.b())) {
            g.warn("Failed to validate message acknowledgements from {}", this.e.ad().getString());
            this.b(k);
         }
      }
   }

   @Override
   public void a(ahe $$0) {
      yq.a($$0, this, this.e.z());
      this.e.G();
      this.e.a($$0.b());
   }

   @Override
   public void a(agp $$0) {
      yq.a($$0, this, this.e.z());
      this.e.G();
      switch ($$0.e()) {
         case a:
            this.e.f(true);
            break;
         case b:
            this.e.f(false);
            break;
         case d:
            this.e.g(true);
            break;
         case e:
            this.e.g(false);
            break;
         case c:
            if (this.e.fI()) {
               this.e.a(false, true);
               this.C = this.e.dk();
            }
            break;
         case f:
            if (this.e.da() instanceof bqy $$1) {
               int $$2 = $$0.f();
               if ($$1.a() && $$2 > 0) {
                  $$1.c($$2);
               }
            }
            break;
         case g:
            if (this.e.da() instanceof bqy $$3) {
               $$3.b();
            }
            break;
         case h:
            if (this.e.cZ() instanceof bqh $$4) {
               $$4.b(this.e);
            }
            break;
         case i:
            if (!this.e.ge()) {
               this.e.gg();
            }
            break;
         default:
            throw new IllegalArgumentException("Invalid client command!");
      }
   }

   public void a(ww $$0) {
      ws $$1 = $$0.l();
      if ($$1 != null) {
         this.O.a($$0.m(), $$0.l());
         int $$2;
         synchronized (this.N) {
            this.N.a($$1);
            $$2 = this.N.a();
         }

         if ($$2 > 4096) {
            this.b(wg.c("multiplayer.disconnect.too_many_pending_chats"));
         }
      }
   }

   public void a(ww $$0, wc.a $$1) {
      this.b(new acz($$0.k().c(), $$0.k().b(), $$0.l(), $$0.m().a(this.O), $$0.n(), $$0.o(), $$1));
      this.a($$0);
   }

   public void a(wg $$0, wc.a $$1) {
      this.b(new acb($$0, $$1));
   }

   public SocketAddress n() {
      return this.d.d();
   }

   public void o() {
      this.Q = true;
      this.q();
      this.b(aet.a);
      this.d.a(aan.b);
   }

   @Override
   public void a(aio $$0) {
      this.d.a(new ail($$0.b()));
   }

   @Override
   public void a(agf $$0) {
      yq.a($$0, this, this.e.z());
      final aps $$1 = this.e.z();
      final bpv $$2 = $$0.a($$1);
      this.e.G();
      this.e.f($$0.b());
      if ($$2 != null) {
         if (!$$1.C_().a($$2.dm())) {
            return;
         }

         erv $$3 = $$2.cH();
         if (this.e.a($$3, 1.0)) {
            $$0.a(new agf.c() {
               private void a(bnz $$0, aqs.a $$1x) {
                  crj $$2 = aqs.this.e.b($$0);
                  if ($$2.a($$1.J())) {
                     crj $$3 = $$2.r();
                     boa $$4 = $$1.run(aqs.this.e, $$2, $$0);
                     if ($$4.a()) {
                        am.T.a(aqs.this.e, $$3, $$2);
                        if ($$4.b()) {
                           aqs.this.e.a($$0, true);
                        }
                     }
                  }
               }

               @Override
               public void a(bnz $$0) {
                  this.a($$0, cjt::a);
               }

               @Override
               public void a(bnz $$0, esa $$1x) {
                  this.a($$0, ($$1xxx, $$2xx, $$3) -> $$2xx.a($$1xxx, $$1, $$3));
               }

               @Override
               public void a() {
                  if (!($$2 instanceof cgd) && !($$2 instanceof bqe) && !($$2 instanceof cjz) && $$2 != aqs.this.e) {
                     crj $$0 = aqs.this.e.b(bnz.a);
                     if ($$0.a($$1.J())) {
                        aqs.this.e.e($$2);
                     }
                  } else {
                     aqs.this.b(wg.c("multiplayer.disconnect.invalid_entity_attacked"));
                     aqs.g.warn("Player {} tried to attack an invalid entity", aqs.this.e.ad().getString());
                  }
               }
            });
         }
      }
   }

   @Override
   public void a(afv $$0) {
      yq.a($$0, this, this.e.z());
      this.e.G();
      afv.a $$1 = $$0.b();
      switch ($$1) {
         case a:
            if (this.e.g) {
               this.e.g = false;
               this.e = this.c.ah().a(this.e, true);
               am.w.a(this.e, cyx.j, cyx.h);
            } else {
               if (this.e.ex() > 0.0F) {
                  return;
               }

               this.e = this.c.ah().a(this.e, false);
               if (this.c.j()) {
                  this.e.a(cyu.d);
                  this.e.dM().aa().a(cyt.r).a(false, this.c);
               }
            }
            break;
         case b:
            this.e.H().a(this.e);
      }
   }

   @Override
   public void a(aga $$0) {
      yq.a($$0, this, this.e.z());
      this.e.s();
   }

   @Override
   public void a(afz $$0) {
      yq.a($$0, this, this.e.z());
      this.e.G();
      if (this.e.bY.j == $$0.b()) {
         if (this.e.N_()) {
            this.e.bY.b();
         } else if (!this.e.bY.a(this.e)) {
            g.debug("Player {} interacted with invalid menu {}", this.e, this.e.bY);
         } else {
            int $$1 = $$0.e();
            if (!this.e.bY.a($$1)) {
               g.debug("Player {} clicked invalid slot index: {}, available slots: {}", new Object[]{this.e.ad(), $$1, this.e.bY.i.size()});
            } else {
               boolean $$2 = $$0.j() != this.e.bY.j();
               this.e.bY.h();
               this.e.bY.a($$1, $$0.f(), $$0.i(), this.e);
               ObjectIterator var4 = Int2ObjectMaps.fastIterable($$0.h()).iterator();

               while (var4.hasNext()) {
                  Entry<crj> $$3 = (Entry<crj>)var4.next();
                  this.e.bY.b($$3.getIntKey(), (crj)$$3.getValue());
               }

               this.e.bY.a($$0.g());
               this.e.bY.i();
               if ($$2) {
                  this.e.bY.e();
               } else {
                  this.e.bY.d();
               }
            }
         }
      }
   }

   @Override
   public void a(agm $$0) {
      yq.a($$0, this, this.e.z());
      this.e.G();
      if (!this.e.N_() && this.e.bY.j == $$0.b() && this.e.bY instanceof coc) {
         if (!this.e.bY.a(this.e)) {
            g.debug("Player {} interacted with invalid menu {}", this.e, this.e.bY);
         } else {
            this.c.aJ().a($$0.e()).ifPresent($$1 -> ((coc)this.e.bY).a($$0.f(), (cvl<?>)$$1, this.e));
         }
      }
   }

   @Override
   public void a(afy $$0) {
      yq.a($$0, this, this.e.z());
      this.e.G();
      if (this.e.bY.j == $$0.b() && !this.e.N_()) {
         if (!this.e.bY.a(this.e)) {
            g.debug("Player {} interacted with invalid menu {}", this.e, this.e.bY);
         } else {
            boolean $$1 = this.e.bY.b(this.e, $$0.e());
            if ($$1) {
               this.e.bY.d();
            }
         }
      }
   }

   @Override
   public void a(aha $$0) {
      yq.a($$0, this, this.e.z());
      if (this.e.f.e()) {
         boolean $$1 = $$0.b() < 0;
         crj $$2 = $$0.e();
         if (!$$2.a(this.e.dM().J())) {
            return;
         }

         ctt $$3 = $$2.a(jp.F, ctt.a);
         if ($$3.a("x") && $$3.a("y") && $$3.a("z")) {
            ib $$4 = dmf.b($$3.d());
            if (this.e.dM().p($$4)) {
               dmf $$5 = this.e.dM().c_($$4);
               if ($$5 != null) {
                  $$5.a($$2, this.e.dM().H_());
               }
            }
         }

         boolean $$6 = $$0.b() >= 1 && $$0.b() <= 45;
         boolean $$7 = $$2.d() || $$2.m() >= 0 && $$2.G() <= 64 && !$$2.d();
         if ($$6 && $$7) {
            this.e.bX.b($$0.b()).e($$2);
            this.e.bX.d();
         } else if ($$1 && $$7 && this.o < 200) {
            this.o += 20;
            this.e.a($$2, true);
         }
      }
   }

   @Override
   public void a(ahd $$0) {
      List<String> $$1 = Stream.of($$0.f()).map(n::a).collect(Collectors.toList());
      this.a($$1).thenAcceptAsync($$1x -> this.a($$0, $$1x), this.c);
   }

   private void a(ahd $$0, List<aqk> $$1) {
      this.e.G();
      aps $$2 = this.e.z();
      ib $$3 = $$0.b();
      if ($$2.B($$3)) {
         if (!($$2.c_($$3) instanceof dnp $$5)) {
            return;
         }

         $$5.a(this.e, $$0.e(), $$1);
      }
   }

   @Override
   public void a(agn $$0) {
      yq.a($$0, this, this.e.z());
      this.e.ga().b = $$0.b() && this.e.ga().c;
   }

   @Override
   public void a(zf $$0) {
      yq.a($$0, this, this.e.z());
      this.e.a($$0.b());
   }

   @Override
   public void a(afp $$0) {
      yq.a($$0, this, this.e.z());
      if (this.e.m(2) || this.i()) {
         this.c.a($$0.b(), false);
      }
   }

   @Override
   public void a(agh $$0) {
      yq.a($$0, this, this.e.z());
      if (this.e.m(2) || this.i()) {
         this.c.b($$0.b());
      }
   }

   @Override
   public void a(aft $$0) {
      yq.a($$0, this, this.e.z());
      wx.a $$1 = $$0.b();
      cjw.a $$2 = this.L != null ? this.L.d().b() : null;
      cjw.a $$3 = $$1.b();
      if (!Objects.equals($$2, $$3)) {
         if ($$2 != null && $$3.b().isBefore($$2.b())) {
            this.b(cjw.a);
         } else {
            try {
               axw $$4 = this.c.as();
               if ($$4 == null) {
                  g.warn("Ignoring chat session from {} due to missing Services public key", this.e.fY().getName());
                  return;
               }

               this.a($$1.a(this.e.fY(), $$4));
            } catch (cjw.b var6) {
               g.error("Failed to validate profile key: {}", var6.getMessage());
               this.b(var6.b());
            }
         }
      }
   }

   @Override
   public void a(afx $$0) {
      if (!this.Q) {
         throw new IllegalStateException("Client acknowledged config, but none was requested");
      } else {
         this.d.a(aan.a, new aqq(this.c, this.d, this.a(this.e.B())));
      }
   }

   @Override
   public void a(afu $$0) {
      yq.a($$0, this, this.e.z());
      this.f.a($$0.b());
   }

   @Override
   public void a(agc $$0) {
      yq.a($$0, this, this.e.z());
      this.c.a(this.e, $$0.b());
   }

   private void a(wx $$0) {
      this.L = $$0;
      this.M = $$0.a(this.e.cw());
      this.P.append(() -> {
         this.e.a($$0);
         this.c.ah().a(new ade(EnumSet.of(ade.a.b), List.of(this.e)));
      });
   }

   @Override
   public apt p() {
      return this.e;
   }

   @FunctionalInterface
   interface a {
      boa run(apt var1, bpv var2, bnz var3);
   }
}
