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
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class aod extends aoa implements adk, aog, uv {
   static final Logger f = LogUtils.getLogger();
   private static final int g = -1;
   private static final int h = 4096;
   private static final vg i = vg.c("multiplayer.disconnect.chat_validation_failed");
   public anf d;
   public final anz e;
   private int j;
   private int k = -1;
   private int l;
   private int m;
   private double n;
   private double o;
   private double p;
   private double q;
   private double r;
   private double s;
   @Nullable
   private blw t;
   private double u;
   private double v;
   private double w;
   private double x;
   private double y;
   private double z;
   @Nullable
   private emc A;
   private int B;
   private int C;
   private boolean D;
   private int E;
   private boolean F;
   private int G;
   private int H;
   private int I;
   @Nullable
   private vx J;
   private wa.b K;
   private final vp L = new vp(20);
   private final vt M = vt.a();
   private final aud N;
   private boolean O;

   public aod(MinecraftServer $$0, uh $$1, anf $$2, ant $$3) {
      super($$0, $$1, $$3);
      this.e = new anz($$1.g());
      $$1.a(this);
      this.d = $$2;
      $$2.c = this;
      $$2.X().a();
      this.K = wa.b.unsigned($$2.cw(), $$0::ay);
      this.N = new aud($$0);
   }

   @Override
   public void e() {
      if (this.k > -1) {
         this.b(new zg(this.k));
         this.k = -1;
      }

      this.m();
      this.d.K = this.d.dq();
      this.d.L = this.d.ds();
      this.d.M = this.d.dw();
      this.d.m();
      this.d.a(this.n, this.o, this.p, this.d.dB(), this.d.dD());
      this.j++;
      this.I = this.H;
      if (this.D && !this.d.fD() && !this.d.bO() && !this.d.ew()) {
         if (++this.E > 80) {
            f.warn("{} was kicked for floating too long!", this.d.ad().getString());
            this.b(vg.c("multiplayer.disconnect.flying"));
            return;
         }
      } else {
         this.D = false;
         this.E = 0;
      }

      this.t = this.d.cW();
      if (this.t != this.d && this.t.cN() == this.d) {
         this.u = this.t.dq();
         this.v = this.t.ds();
         this.w = this.t.dw();
         this.x = this.t.dq();
         this.y = this.t.ds();
         this.z = this.t.dw();
         if (this.F && this.d.cW().cN() == this.d) {
            if (++this.G > 80) {
               f.warn("{} was kicked for floating a vehicle too long!", this.d.ad().getString());
               this.b(vg.c("multiplayer.disconnect.flying"));
               return;
            }
         } else {
            this.F = false;
            this.G = 0;
         }
      } else {
         this.t = null;
         this.F = false;
         this.G = 0;
      }

      this.f();
      if (this.l > 0) {
         this.l--;
      }

      if (this.m > 0) {
         this.m--;
      }

      if (this.d.M() > 0L && this.b.an() > 0 && ac.b() - this.d.M() > (long)this.b.an() * 1000L * 60L) {
         this.b(vg.c("multiplayer.disconnect.idling"));
      }
   }

   public void m() {
      this.n = this.d.dq();
      this.o = this.d.ds();
      this.p = this.d.dw();
      this.q = this.d.dq();
      this.r = this.d.ds();
      this.s = this.d.dw();
   }

   @Override
   public boolean c() {
      return this.c.k() && !this.O;
   }

   @Override
   public boolean a(xg<?> $$0) {
      return super.a($$0) ? true : this.O && this.c.k() && $$0 instanceof adx;
   }

   @Override
   protected GameProfile j() {
      return this.d.fR();
   }

   private <T, R> CompletableFuture<R> a(T $$0, BiFunction<aoi, T, CompletableFuture<R>> $$1) {
      return $$1.apply(this.d.X(), $$0).thenApply($$0x -> {
         if (!this.c()) {
            f.debug("Ignoring packet due to disconnection");
            throw new CancellationException("disconnected");
         } else {
            return (R)$$0x;
         }
      });
   }

   private CompletableFuture<anv> a(String $$0) {
      return this.a($$0, aoi::a);
   }

   private CompletableFuture<List<anv>> a(List<String> $$0) {
      return this.a($$0, aoi::a);
   }

   @Override
   public void a(aep $$0) {
      xi.a($$0, this, this.d.z());
      this.d.a($$0.a(), $$0.d(), $$0.e(), $$0.f());
   }

   private static boolean b(double $$0, double $$1, double $$2, float $$3, float $$4) {
      return Double.isNaN($$0) || Double.isNaN($$1) || Double.isNaN($$2) || !Floats.isFinite($$4) || !Floats.isFinite($$3);
   }

   private static double a(double $$0) {
      return aup.a($$0, -3.0E7, 3.0E7);
   }

   private static double b(double $$0) {
      return aup.a($$0, -2.0E7, 2.0E7);
   }

   @Override
   public void a(aei $$0) {
      xi.a($$0, this, this.d.z());
      if (b($$0.a(), $$0.d(), $$0.e(), $$0.f(), $$0.g())) {
         this.b(vg.c("multiplayer.disconnect.invalid_vehicle_movement"));
      } else {
         blw $$1 = this.d.cW();
         if ($$1 != this.d && $$1.cN() == this.d && $$1 == this.t) {
            ane $$2 = this.d.z();
            double $$3 = $$1.dq();
            double $$4 = $$1.ds();
            double $$5 = $$1.dw();
            double $$6 = a($$0.a());
            double $$7 = b($$0.d());
            double $$8 = a($$0.e());
            float $$9 = aup.g($$0.f());
            float $$10 = aup.g($$0.g());
            double $$11 = $$6 - this.u;
            double $$12 = $$7 - this.v;
            double $$13 = $$8 - this.w;
            double $$14 = $$1.do().g();
            double $$15 = $$11 * $$11 + $$12 * $$12 + $$13 * $$13;
            if ($$15 - $$14 > 100.0 && !this.i()) {
               f.warn("{} (vehicle of {}) moved too quickly! {},{},{}", new Object[]{$$1.ad().getString(), this.d.ad().getString(), $$11, $$12, $$13});
               this.b(new aau($$1));
               return;
            }

            boolean $$16 = $$2.a($$1, $$1.cH().h(0.0625));
            $$11 = $$6 - this.x;
            $$12 = $$7 - this.y - 1.0E-6;
            $$13 = $$8 - this.z;
            boolean $$17 = $$1.R;
            if ($$1 instanceof bmo $$18 && $$18.e_()) {
               $$18.n();
            }

            $$1.a(bmu.b, new emc($$11, $$12, $$13));
            $$11 = $$6 - $$1.dq();
            $$12 = $$7 - $$1.ds();
            if ($$12 > -0.5 || $$12 < 0.5) {
               $$12 = 0.0;
            }

            $$13 = $$8 - $$1.dw();
            $$15 = $$11 * $$11 + $$12 * $$12 + $$13 * $$13;
            boolean $$20 = false;
            if ($$15 > 0.0625) {
               $$20 = true;
               f.warn("{} (vehicle of {}) moved wrongly! {}", new Object[]{$$1.ad().getString(), this.d.ad().getString(), Math.sqrt($$15)});
            }

            $$1.a($$6, $$7, $$8, $$9, $$10);
            boolean $$21 = $$2.a($$1, $$1.cH().h(0.0625));
            if ($$16 && ($$20 || !$$21)) {
               $$1.a($$3, $$4, $$5, $$9, $$10);
               this.b(new aau($$1));
               return;
            }

            this.d.z().l().a(this.d);
            this.d.b(this.d.dq() - $$3, this.d.ds() - $$4, this.d.dw() - $$5);
            this.F = $$12 >= -0.03125 && !$$17 && !this.b.ab() && !$$1.aV() && this.a($$1);
            this.x = $$1.dq();
            this.y = $$1.ds();
            this.z = $$1.dw();
         }
      }
   }

   private boolean a(blw $$0) {
      return $$0.dL().a($$0.cH().g(0.0625).b(0.0, -0.55, 0.0)).allMatch(djo.a::i);
   }

   @Override
   public void a(adn $$0) {
      xi.a($$0, this, this.d.z());
      if ($$0.a() == this.B) {
         if (this.A == null) {
            this.b(vg.c("multiplayer.disconnect.invalid_player_movement"));
            return;
         }

         this.d.a(this.A.c, this.A.d, this.A.e, this.d.dB(), this.d.dD());
         this.q = this.A.c;
         this.r = this.A.d;
         this.s = this.A.e;
         if (this.d.O()) {
            this.d.P();
         }

         this.A = null;
      }
   }

   @Override
   public void a(aer $$0) {
      xi.a($$0, this, this.d.z());
      this.b.aG().a($$0.a()).ifPresent(this.d.I()::e);
   }

   @Override
   public void a(aeq $$0) {
      xi.a($$0, this, this.d.z());
      this.d.I().a($$0.a(), $$0.d(), $$0.e());
   }

   @Override
   public void a(aet $$0) {
      xi.a($$0, this, this.d.z());
      if ($$0.d() == aet.a.a) {
         ahh $$1 = Objects.requireNonNull($$0.e());
         af $$2 = this.b.aB().a($$1);
         if ($$2 != null) {
            this.d.Q().a($$2);
         }
      }
   }

   @Override
   public void a(adw $$0) {
      xi.a($$0, this, this.d.z());
      StringReader $$1 = new StringReader($$0.d());
      if ($$1.canRead() && $$1.peek() == '/') {
         $$1.skip();
      }

      ParseResults<ds> $$2 = this.b.aE().a().parse($$1, this.d.dd());
      this.b.aE().a().getCompletionSuggestions($$2).thenAccept($$1x -> this.b(new zs($$0.a(), $$1x)));
   }

   @Override
   public void a(aex $$0) {
      xi.a($$0, this, this.d.z());
      if (!this.b.o()) {
         this.d.a(vg.c("advMode.notEnabled"));
      } else if (!this.d.gp()) {
         this.d.a(vg.c("advMode.notAllowed"));
      } else {
         csy $$1 = null;
         dhn $$2 = null;
         hx $$3 = $$0.a();
         dhd $$4 = this.d.dL().c_($$3);
         if ($$4 instanceof dhn) {
            $$2 = (dhn)$$4;
            $$1 = $$2.c();
         }

         String $$5 = $$0.d();
         boolean $$6 = $$0.e();
         if ($$1 != null) {
            dhn.a $$7 = $$2.m();
            djp $$8 = this.d.dL().a_($$3);
            ic $$9 = $$8.c(cyh.b);

            djp $$13 = (switch ($$0.h()) {
               case a -> cxa.kH.o();
               case b -> cxa.kG.o();
               default -> cxa.fN.o();
            }).a(cyh.b, $$9).a(cyh.c, Boolean.valueOf($$0.f()));
            if ($$13 != $$8) {
               this.d.dL().a($$3, $$13, 2);
               $$4.b($$13);
               this.d.dL().m($$3).a($$4);
            }

            $$1.a($$5);
            $$1.a($$6);
            if (!$$6) {
               $$1.c(null);
            }

            $$2.b($$0.g());
            if ($$7 != $$0.h()) {
               $$2.g();
            }

            $$1.f();
            if (!avm.b($$5)) {
               this.d.a(vg.a("advMode.setCommand.success", $$5));
            }
         }
      }
   }

   @Override
   public void a(aey $$0) {
      xi.a($$0, this, this.d.z());
      if (!this.b.o()) {
         this.d.a(vg.c("advMode.notEnabled"));
      } else if (!this.d.gp()) {
         this.d.a(vg.c("advMode.notAllowed"));
      } else {
         csy $$1 = $$0.a(this.d.dL());
         if ($$1 != null) {
            $$1.a($$0.a());
            $$1.a($$0.d());
            if (!$$0.d()) {
               $$1.c(null);
            }

            $$1.f();
            this.d.a(vg.a("advMode.setCommand.success", $$0.a()));
         }
      }
   }

   @Override
   public void a(aek $$0) {
      xi.a($$0, this, this.d.z());
      this.d.fS().c($$0.a());
      this.d.c.b(new zx(-2, 0, this.d.fS().l, this.d.fS().a(this.d.fS().l)));
      this.d.c.b(new zx(-2, 0, $$0.a(), this.d.fS().a($$0.a())));
      this.d.c.b(new aby(this.d.fS().l));
   }

   @Override
   public void a(aes $$0) {
      xi.a($$0, this, this.d.z());
      if (this.d.bW instanceof cil $$1) {
         if (!$$1.a(this.d)) {
            f.debug("Player {} interacted with invalid menu {}", this.d, $$1);
            return;
         }

         $$1.a($$0.a());
      }
   }

   @Override
   public void a(aev $$0) {
      xi.a($$0, this, this.d.z());
      if (this.d.bW instanceof cim $$1) {
         if (!this.d.bW.a(this.d)) {
            f.debug("Player {} interacted with invalid menu {}", this.d, this.d.bW);
            return;
         }

         $$1.a($$0.a(), $$0.d());
      }
   }

   @Override
   public void a(afb $$0) {
      xi.a($$0, this, this.d.z());
      if (this.d.gp()) {
         hx $$1 = $$0.a();
         djp $$2 = this.d.dL().a_($$1);
         if (this.d.dL().c_($$1) instanceof dir $$4) {
            $$4.a($$0.e());
            $$4.a($$0.f());
            $$4.a($$0.g());
            $$4.a($$0.h());
            $$4.a($$0.i());
            $$4.a($$0.j());
            $$4.b($$0.k());
            $$4.a($$0.l());
            $$4.d($$0.m());
            $$4.e($$0.n());
            $$4.a($$0.o());
            $$4.a($$0.p());
            if ($$4.f()) {
               String $$5 = $$4.d();
               if ($$0.d() == dir.a.b) {
                  if ($$4.C()) {
                     this.d.a(vg.a("structure_block.save_success", $$5), false);
                  } else {
                     this.d.a(vg.a("structure_block.save_failure", $$5), false);
                  }
               } else if ($$0.d() == dir.a.c) {
                  if (!$$4.E()) {
                     this.d.a(vg.a("structure_block.load_not_found", $$5), false);
                  } else if ($$4.a(this.d.z())) {
                     this.d.a(vg.a("structure_block.load_success", $$5), false);
                  } else {
                     this.d.a(vg.a("structure_block.load_prepare", $$5), false);
                  }
               } else if ($$0.d() == dir.a.d) {
                  if ($$4.B()) {
                     this.d.a(vg.a("structure_block.size_success", $$5), false);
                  } else {
                     this.d.a(vg.c("structure_block.size_failure"), false);
                  }
               }
            } else {
               this.d.a(vg.a("structure_block.invalid_structure_name", $$0.f()), false);
            }

            $$4.e();
            this.d.dL().a($$1, $$2, $$2, 3);
         }
      }
   }

   @Override
   public void a(afa $$0) {
      xi.a($$0, this, this.d.z());
      if (this.d.gp()) {
         hx $$1 = $$0.a();
         djp $$2 = this.d.dL().a_($$1);
         if (this.d.dL().c_($$1) instanceof did $$4) {
            $$4.a($$0.d());
            $$4.b($$0.e());
            $$4.a(ahg.a(ke.aG, $$0.f()));
            $$4.a($$0.g());
            $$4.a($$0.h());
            $$4.a($$0.j());
            $$4.b($$0.i());
            $$4.e();
            this.d.dL().a($$1, $$2, $$2, 3);
         }
      }
   }

   @Override
   public void a(aef $$0) {
      xi.a($$0, this, this.d.z());
      if (this.d.gp()) {
         hx $$1 = $$0.a();
         if (this.d.dL().c_($$1) instanceof did $$3) {
            $$3.a(this.d.z(), $$0.d(), $$0.e());
         }
      }
   }

   @Override
   public void a(aeu $$0) {
      xi.a($$0, this, this.d.z());
      int $$1 = $$0.a();
      if (this.d.bW instanceof cjs $$2) {
         if (!$$2.a(this.d)) {
            f.debug("Player {} interacted with invalid menu {}", this.d, $$2);
            return;
         }

         $$2.e($$1);
         $$2.h($$1);
      }
   }

   @Override
   public void a(aec $$0) {
      int $$1 = $$0.e();
      if (cfp.d($$1) || $$1 == 40) {
         List<String> $$2 = Lists.newArrayList();
         Optional<String> $$3 = $$0.d();
         $$3.ifPresent($$2::add);
         $$0.a().stream().limit(100L).forEach($$2::add);
         Consumer<List<anv>> $$4 = $$3.isPresent() ? $$1x -> this.a((anv)$$1x.get(0), $$1x.subList(1, $$1x.size()), $$1) : $$1x -> this.a($$1x, $$1);
         this.a($$2).thenAcceptAsync($$4, this.b);
      }
   }

   private void a(List<anv> $$0, int $$1) {
      cng $$2 = this.d.fS().a($$1);
      if ($$2.a(cnj.tW)) {
         this.a($$0, UnaryOperator.identity(), $$2);
      }
   }

   private void a(anv $$0, List<anv> $$1, int $$2) {
      cng $$3 = this.d.fS().a($$2);
      if ($$3.a(cnj.tW)) {
         cng $$4 = new cng(cnj.tX);
         so $$5 = $$3.v();
         if ($$5 != null) {
            $$4.c($$5.h());
         }

         $$4.a("author", tj.a(this.d.ad().getString()));
         if (this.d.Y()) {
            $$4.a("title", tj.a($$0.b()));
         } else {
            $$4.a("filtered_title", tj.a($$0.b()));
            $$4.a("title", tj.a($$0.d()));
         }

         this.a($$1, $$0x -> vg.a.a(vg.b($$0x)), $$4);
         this.d.fS().a($$2, $$4);
      }
   }

   private void a(List<anv> $$0, UnaryOperator<String> $$1, cng $$2) {
      su $$3 = new su();
      if (this.d.Y()) {
         $$0.stream().map($$1x -> tj.a($$1.apply($$1x.b()))).forEach($$3::add);
      } else {
         so $$4 = new so();
         int $$5 = 0;

         for (int $$6 = $$0.size(); $$5 < $$6; $$5++) {
            anv $$7 = $$0.get($$5);
            String $$8 = $$7.d();
            $$3.add(tj.a($$1.apply($$8)));
            if ($$7.c()) {
               $$4.a(String.valueOf($$5), $$1.apply($$7.b()));
            }
         }

         if (!$$4.g()) {
            $$2.a("filtered_pages", $$4);
         }
      }

      $$2.a("pages", $$3);
   }

   @Override
   public void a(aed $$0) {
      xi.a($$0, this, this.d.z());
      if (this.d.l(2)) {
         blw $$1 = this.d.dL().a($$0.d());
         if ($$1 != null) {
            so $$2 = $$1.f(new so());
            this.d.c.b(new acy($$0.a(), $$2));
         }
      }
   }

   @Override
   public void a(aeb $$0) {
      xi.a($$0, this, this.d.z());
      if (!this.d.P_() && $$0.d() == this.d.bW.j) {
         if (this.d.bW instanceof cix $$1 && $$1.m() instanceof dhr $$2) {
            $$2.a($$0.a(), $$0.e());
         }
      }
   }

   @Override
   public void a(ado $$0) {
      xi.a($$0, this, this.d.z());
      if (this.d.l(2)) {
         dhd $$1 = this.d.dL().c_($$0.d());
         so $$2 = $$1 != null ? $$1.q() : null;
         this.d.c.b(new acy($$0.a(), $$2));
      }
   }

   @Override
   public void a(aeh $$0) {
      xi.a($$0, this, this.d.z());
      if (b($$0.a(0.0), $$0.b(0.0), $$0.c(0.0), $$0.a(0.0F), $$0.b(0.0F))) {
         this.b(vg.c("multiplayer.disconnect.invalid_player_movement"));
      } else {
         ane $$1 = this.d.z();
         if (!this.d.f) {
            if (this.j == 0) {
               this.m();
            }

            if (this.A != null) {
               if (this.j - this.C > 20) {
                  this.C = this.j;
                  this.a(this.A.c, this.A.d, this.A.e, this.d.dB(), this.d.dD());
               }
            } else {
               this.C = this.j;
               double $$2 = a($$0.a(this.d.dq()));
               double $$3 = b($$0.b(this.d.ds()));
               double $$4 = a($$0.c(this.d.dw()));
               float $$5 = aup.g($$0.a(this.d.dB()));
               float $$6 = aup.g($$0.b(this.d.dD()));
               if (this.d.bO()) {
                  this.d.a(this.d.dq(), this.d.ds(), this.d.dw(), $$5, $$6);
                  this.d.z().l().a(this.d);
               } else {
                  double $$7 = this.d.dq();
                  double $$8 = this.d.ds();
                  double $$9 = this.d.dw();
                  double $$10 = $$2 - this.n;
                  double $$11 = $$3 - this.o;
                  double $$12 = $$4 - this.p;
                  double $$13 = this.d.do().g();
                  double $$14 = $$10 * $$10 + $$11 * $$11 + $$12 * $$12;
                  if (this.d.fD()) {
                     if ($$14 > 1.0) {
                        this.a(this.d.dq(), this.d.ds(), this.d.dw(), $$5, $$6);
                     }
                  } else {
                     if ($$1.s().i()) {
                        this.H++;
                        int $$15 = this.H - this.I;
                        if ($$15 > 5) {
                           f.debug("{} is sending move packets too frequently ({} packets since last tick)", this.d.ad().getString(), $$15);
                           $$15 = 1;
                        }

                        if (!this.d.O() && (!this.d.dL().Z().b(ctt.t) || !this.d.fw())) {
                           float $$16 = this.d.fw() ? 300.0F : 100.0F;
                           if ($$14 - $$13 > (double)($$16 * (float)$$15) && !this.i()) {
                              f.warn("{} moved too quickly! {},{},{}", new Object[]{this.d.ad().getString(), $$10, $$11, $$12});
                              this.a(this.d.dq(), this.d.ds(), this.d.dw(), this.d.dB(), this.d.dD());
                              return;
                           }
                        }
                     }

                     elx $$17 = this.d.cH();
                     $$10 = $$2 - this.q;
                     $$11 = $$3 - this.r;
                     $$12 = $$4 - this.s;
                     boolean $$18 = $$11 > 0.0;
                     if (this.d.aC() && !$$0.a() && $$18) {
                        this.d.fb();
                     }

                     boolean $$19 = this.d.R;
                     this.d.a(bmu.b, new emc($$10, $$11, $$12));
                     $$10 = $$2 - this.d.dq();
                     $$11 = $$3 - this.d.ds();
                     if ($$11 > -0.5 || $$11 < 0.5) {
                        $$11 = 0.0;
                     }

                     $$12 = $$4 - this.d.dw();
                     $$14 = $$10 * $$10 + $$11 * $$11 + $$12 * $$12;
                     boolean $$21 = false;
                     if (!this.d.O() && $$14 > 0.0625 && !this.d.fD() && !this.d.e.e() && this.d.e.b() != ctu.d) {
                        $$21 = true;
                        f.warn("{} moved wrongly!", this.d.ad().getString());
                     }

                     if (this.d.af || this.d.fD() || (!$$21 || !$$1.a(this.d, $$17)) && !this.a($$1, $$17, $$2, $$3, $$4)) {
                        this.d.a($$2, $$3, $$4, $$5, $$6);
                        this.D = $$11 >= -0.03125
                           && !$$19
                           && this.d.e.b() != ctu.d
                           && !this.b.ab()
                           && !this.d.fT().c
                           && !this.d.a(bll.y)
                           && !this.d.fw()
                           && !this.d.fj()
                           && this.a((blw)this.d);
                        this.d.z().l().a(this.d);
                        this.d.a(this.d.dq() - $$7, this.d.ds() - $$8, this.d.dw() - $$9, $$0.a());
                        this.d.a($$0.a(), new emc(this.d.dq() - $$7, this.d.ds() - $$8, this.d.dw() - $$9));
                        if ($$18) {
                           this.d.n();
                        }

                        this.d.b(this.d.dq() - $$7, this.d.ds() - $$8, this.d.dw() - $$9);
                        this.q = this.d.dq();
                        this.r = this.d.ds();
                        this.s = this.d.dw();
                     } else {
                        this.a($$7, $$8, $$9, $$5, $$6);
                        this.d.a(this.d.dq() - $$7, this.d.ds() - $$8, this.d.dw() - $$9, $$0.a());
                     }
                  }
               }
            }
         }
      }
   }

   private boolean a(cua $$0, elx $$1, double $$2, double $$3, double $$4) {
      elx $$5 = this.d.cH().d($$2 - this.d.dq(), $$3 - this.d.ds(), $$4 - this.d.dw());
      Iterable<emv> $$6 = $$0.d(this.d, $$5.h(1.0E-5F));
      emv $$7 = ems.a($$1.h(1.0E-5F));

      for (emv $$8 : $$6) {
         if (!ems.c($$8, $$7, emg.i)) {
            return true;
         }
      }

      return false;
   }

   public void a(double $$0, double $$1, double $$2, float $$3, float $$4) {
      this.a($$0, $$1, $$2, $$3, $$4, Collections.emptySet());
   }

   public void a(double $$0, double $$1, double $$2, float $$3, float $$4, Set<bnc> $$5) {
      double $$6 = $$5.contains(bnc.a) ? this.d.dq() : 0.0;
      double $$7 = $$5.contains(bnc.b) ? this.d.ds() : 0.0;
      double $$8 = $$5.contains(bnc.c) ? this.d.dw() : 0.0;
      float $$9 = $$5.contains(bnc.d) ? this.d.dB() : 0.0F;
      float $$10 = $$5.contains(bnc.e) ? this.d.dD() : 0.0F;
      this.A = new emc($$0, $$1, $$2);
      if (++this.B == Integer.MAX_VALUE) {
         this.B = 0;
      }

      this.C = this.j;
      this.d.a($$0, $$1, $$2, $$3, $$4);
      this.d.c.b(new abh($$0 - $$6, $$1 - $$7, $$2 - $$8, $$3 - $$9, $$4 - $$10, $$5, this.B));
   }

   @Override
   public void a(aen $$0) {
      xi.a($$0, this, this.d.z());
      hx $$1 = $$0.a();
      this.d.G();
      aen.a $$2 = $$0.e();
      switch ($$2) {
         case g:
            if (!this.d.P_()) {
               cng $$3 = this.d.b(bkb.b);
               this.d.a(bkb.b, this.d.b(bkb.a));
               this.d.a(bkb.a, $$3);
               this.d.ft();
            }

            return;
         case e:
            if (!this.d.P_()) {
               this.d.a(false);
            }

            return;
         case d:
            if (!this.d.P_()) {
               this.d.a(true);
            }

            return;
         case f:
            this.d.fs();
            return;
         case a:
         case b:
         case c:
            this.d.e.a($$1, $$2, $$0.d(), this.d.dL().al(), $$0.f());
            this.d.c.a($$0.f());
            return;
         default:
            throw new IllegalArgumentException("Invalid player action");
      }
   }

   private static boolean a(anf $$0, cng $$1) {
      if ($$1.b()) {
         return false;
      } else {
         cnb $$2 = $$1.d();
         return ($$2 instanceof cla || $$2 instanceof cli) && !$$0.gn().a($$2);
      }
   }

   @Override
   public void a(aff $$0) {
      xi.a($$0, this, this.d.z());
      this.d.c.a($$0.e());
      ane $$1 = this.d.z();
      bkb $$2 = $$0.a();
      cng $$3 = this.d.b($$2);
      if ($$3.a($$1.I())) {
         ely $$4 = $$0.d();
         emc $$5 = $$4.e();
         hx $$6 = $$4.a();
         if (this.d.d($$6)) {
            emc $$7 = $$5.d(emc.b($$6));
            double $$8 = 1.0000001;
            if (Math.abs($$7.a()) < 1.0000001 && Math.abs($$7.b()) < 1.0000001 && Math.abs($$7.c()) < 1.0000001) {
               ic $$9 = $$4.b();
               this.d.G();
               int $$10 = this.d.dL().al();
               if ($$6.v() < $$10) {
                  if (this.A == null && $$1.a(this.d, $$6)) {
                     bkc $$11 = this.d.e.a(this.d, $$1, $$3, $$2, $$4);
                     if ($$9 == ic.b && !$$11.a() && $$6.v() >= $$10 - 1 && a(this.d, $$3)) {
                        vg $$12 = vg.a("build.tooHigh", $$10 - 1).a(n.m);
                        this.d.b($$12, true);
                     } else if ($$11.b()) {
                        this.d.a($$2, true);
                     }
                  }
               } else {
                  vg $$13 = vg.a("build.tooHigh", $$10 - 1).a(n.m);
                  this.d.b($$13, true);
               }

               this.d.c.b(new zk($$1, $$6));
               this.d.c.b(new zk($$1, $$6.a($$9)));
            } else {
               f.warn("Rejecting UseItemOnPacket from {}: Location {} too far away from hit block {}.", new Object[]{this.d.fR().getName(), $$5, $$6});
            }
         }
      }
   }

   @Override
   public void a(afg $$0) {
      xi.a($$0, this, this.d.z());
      this.a($$0.d());
      ane $$1 = this.d.z();
      bkb $$2 = $$0.a();
      cng $$3 = this.d.b($$2);
      this.d.G();
      if (!$$3.b() && $$3.a($$1.I())) {
         bkc $$4 = this.d.e.a(this.d, $$1, $$3, $$2);
         if ($$4.b()) {
            this.d.a($$2, true);
         }
      }
   }

   @Override
   public void a(afe $$0) {
      xi.a($$0, this, this.d.z());
      if (this.d.P_()) {
         for (ane $$1 : this.b.H()) {
            blw $$2 = $$0.a($$1);
            if ($$2 != null) {
               this.d.a($$1, $$2.dq(), $$2.ds(), $$2.dw(), $$2.dB(), $$2.dD());
               return;
            }
         }
      }
   }

   @Override
   public void a(aej $$0) {
      xi.a($$0, this, this.d.z());
      if (this.d.da() instanceof chk $$2) {
         $$2.a($$0.a(), $$0.d());
      }
   }

   @Override
   public void a(vg $$0) {
      f.info("{} lost connection: {}", this.d.ad().getString(), $$0.getString());
      this.q();
      super.a($$0);
   }

   private void q() {
      this.N.close();
      this.b.at();
      this.b.ae().a(vg.a("multiplayer.player.left", this.d.Q_()).a(n.o), false);
      this.d.u();
      this.b.ae().c(this.d);
      this.d.X().b();
   }

   public void a(int $$0) {
      if ($$0 < 0) {
         throw new IllegalArgumentException("Expected packet sequence nr >= 0");
      } else {
         this.k = Math.max($$0, this.k);
      }
   }

   @Override
   public void a(aew $$0) {
      xi.a($$0, this, this.d.z());
      if ($$0.a() >= 0 && $$0.a() < cfp.g()) {
         if (this.d.fS().l != $$0.a() && this.d.fo() == bkb.a) {
            this.d.ft();
         }

         this.d.fS().l = $$0.a();
         this.d.G();
      } else {
         f.warn("{} tried to set an invalid carried item", this.d.ad().getString());
      }
   }

   @Override
   public void a(ads $$0) {
      if (c($$0.a())) {
         this.b(vg.c("multiplayer.disconnect.illegal_characters"));
      } else {
         Optional<vn> $$1 = this.a($$0.g());
         if ($$1.isPresent()) {
            this.b.g(() -> {
               vw $$2;
               try {
                  $$2 = this.a($$0, $$1.get());
               } catch (wa.a var6) {
                  this.a(var6);
                  return;
               }

               CompletableFuture<anv> $$5 = this.a($$2.c());
               vg $$6 = this.b.bi().decorate(this.d, $$2.d());
               this.N.append($$5, $$2x -> {
                  vw $$3 = $$2.a($$6).a($$2x.e());
                  this.b($$3);
               });
            });
         }
      }
   }

   @Override
   public void a(adr $$0) {
      if (c($$0.a())) {
         this.b(vg.c("multiplayer.disconnect.illegal_characters"));
      } else {
         Optional<vn> $$1 = this.a($$0.g());
         if ($$1.isPresent()) {
            this.b.g(() -> {
               this.a($$0, $$1.get());
               this.r();
            });
         }
      }
   }

   private void a(adr $$0, vn $$1) {
      ParseResults<ds> $$2 = this.b($$0.a());

      Map<String, vw> $$3;
      try {
         $$3 = this.a($$0, vy.a($$2), $$1);
      } catch (wa.a var6) {
         this.a(var6);
         return;
      }

      dq $$6 = new dq.a($$3);
      $$2 = dt.a($$2, $$1x -> $$1x.a($$6, this.N));
      this.b.aE().a($$2, $$0.a());
   }

   private void a(wa.a $$0) {
      f.warn("Failed to update secure chat state for {}: '{}'", this.d.fR().getName(), $$0.b().getString());
      if ($$0.a()) {
         this.b($$0.b());
      } else {
         this.d.a($$0.b().f().a(n.m));
      }
   }

   private Map<String, vw> a(adr $$0, vy<?> $$1, vn $$2) throws wa.a {
      Map<String, vw> $$3 = new Object2ObjectOpenHashMap();

      for (vy.a<?> $$4 : $$1.a()) {
         vs $$5 = $$0.f().a($$4.a());
         vz $$6 = new vz($$4.c(), $$0.d(), $$0.e(), $$2);
         $$3.put($$4.a(), this.K.unpack($$5, $$6));
      }

      return $$3;
   }

   private ParseResults<ds> b(String $$0) {
      CommandDispatcher<ds> $$1 = this.b.aE().a();
      return $$1.parse($$0, this.d.dd());
   }

   private Optional<vn> a(vn.b $$0) {
      Optional<vn> $$1 = this.b($$0);
      if (this.d.D() == cfo.c) {
         this.b(new acw(vg.c("chat.disabled.options").a(n.m), false));
         return Optional.empty();
      } else {
         this.d.G();
         return $$1;
      }
   }

   private Optional<vn> b(vn.b $$0) {
      synchronized (this.L) {
         Optional<vn> $$1 = this.L.a($$0);
         if ($$1.isEmpty()) {
            f.warn("Failed to validate message acknowledgements from {}", this.d.ad().getString());
            this.b(i);
         }

         return $$1;
      }
   }

   private static boolean c(String $$0) {
      for (int $$1 = 0; $$1 < $$0.length(); $$1++) {
         if (!aa.a($$0.charAt($$1))) {
            return true;
         }
      }

      return false;
   }

   private vw a(ads $$0, vn $$1) throws wa.a {
      vz $$2 = new vz($$0.a(), $$0.d(), $$0.e(), $$1);
      return this.K.unpack($$0.f(), $$2);
   }

   private void b(vw $$0) {
      this.b.ae().a($$0, this.d, vc.a(vc.c, this.d));
      this.r();
   }

   private void r() {
      this.l += 20;
      if (this.l > 200 && !this.b.ae().f(this.d.fR())) {
         this.b(vg.c("disconnect.spam"));
      }
   }

   @Override
   public void a(adq $$0) {
      synchronized (this.L) {
         if (!this.L.a($$0.a())) {
            f.warn("Failed to validate message acknowledgements from {}", this.d.ad().getString());
            this.b(i);
         }
      }
   }

   @Override
   public void a(afd $$0) {
      xi.a($$0, this, this.d.z());
      this.d.G();
      this.d.a($$0.a());
   }

   @Override
   public void a(aeo $$0) {
      xi.a($$0, this, this.d.z());
      this.d.G();
      switch ($$0.d()) {
         case a:
            this.d.f(true);
            break;
         case b:
            this.d.f(false);
            break;
         case d:
            this.d.g(true);
            break;
         case e:
            this.d.g(false);
            break;
         case c:
            if (this.d.fD()) {
               this.d.a(false, true);
               this.A = this.d.dj();
            }
            break;
         case f:
            if (this.d.da() instanceof bmz $$1) {
               int $$2 = $$0.e();
               if ($$1.a() && $$2 > 0) {
                  $$1.c($$2);
               }
            }
            break;
         case g:
            if (this.d.da() instanceof bmz $$3) {
               $$3.b();
            }
            break;
         case h:
            if (this.d.cZ() instanceof bmh $$4) {
               $$4.b(this.d);
            }
            break;
         case i:
            if (!this.d.fX()) {
               this.d.fZ();
            }
            break;
         default:
            throw new IllegalArgumentException("Invalid client command!");
      }
   }

   public void a(vw $$0) {
      vs $$1 = $$0.l();
      if ($$1 != null) {
         this.M.a($$0.m(), $$0.l());
         int $$2;
         synchronized (this.L) {
            this.L.a($$1);
            $$2 = this.L.a();
         }

         if ($$2 > 4096) {
            this.b(vg.c("multiplayer.disconnect.too_many_pending_chats"));
         }
      }
   }

   public void a(vw $$0, vc.a $$1) {
      this.b(new aba($$0.k().c(), $$0.k().b(), $$0.l(), $$0.m().a(this.M), $$0.n(), $$0.o(), $$1.a(this.d.dL().I_())));
      this.a($$0);
   }

   public void a(vg $$0, vc.a $$1) {
      this.b(new aac($$0, $$1.a(this.d.dL().I_())));
   }

   public SocketAddress n() {
      return this.c.f();
   }

   public void o() {
      this.O = true;
      this.q();
      this.b(new acu());
   }

   @Override
   public void a(agk $$0) {
      this.c.a(new agg($$0.a()));
   }

   @Override
   public void a(aee $$0) {
      xi.a($$0, this, this.d.z());
      final ane $$1 = this.d.z();
      final blw $$2 = $$0.a($$1);
      this.d.G();
      this.d.f($$0.a());
      if ($$2 != null) {
         if (!$$1.D_().a($$2.dl())) {
            return;
         }

         elx $$3 = $$2.cH();
         if (this.d.a($$3)) {
            $$0.a(new aee.c() {
               private void a(bkb $$0, aod.a $$1x) {
                  cng $$2 = aod.this.d.b($$0);
                  if ($$2.a($$1.I())) {
                     cng $$3 = $$2.p();
                     bkc $$4 = $$1.run(aod.this.d, $$2, $$0);
                     if ($$4.a()) {
                        am.R.a(aod.this.d, $$3, $$2);
                        if ($$4.b()) {
                           aod.this.d.a($$0, true);
                        }
                     }
                  }
               }

               @Override
               public void a(bkb $$0) {
                  this.a($$0, cfq::a);
               }

               @Override
               public void a(bkb $$0, emc $$1x) {
                  this.a($$0, ($$1xxx, $$2xx, $$3) -> $$2xx.a($$1xxx, $$1, $$3));
               }

               @Override
               public void a() {
                  if (!($$2 instanceof ccb) && !($$2 instanceof bme) && !($$2 instanceof cfw) && $$2 != aod.this.d) {
                     cng $$0 = aod.this.d.b(bkb.a);
                     if ($$0.a($$1.I())) {
                        aod.this.d.d($$2);
                     }
                  } else {
                     aod.this.b(vg.c("multiplayer.disconnect.invalid_entity_attacked"));
                     aod.f.warn("Player {} tried to attack an invalid entity", aod.this.d.ad().getString());
                  }
               }
            });
         }
      }
   }

   @Override
   public void a(adv $$0) {
      xi.a($$0, this, this.d.z());
      this.d.G();
      adv.a $$1 = $$0.a();
      switch ($$1) {
         case a:
            if (this.d.f) {
               this.d.f = false;
               this.d = this.b.ae().a(this.d, true);
               am.w.a(this.d, ctx.j, ctx.h);
            } else {
               if (this.d.ev() > 0.0F) {
                  return;
               }

               this.d = this.b.ae().a(this.d, false);
               if (this.b.h()) {
                  this.d.a(ctu.d);
                  this.d.dL().Z().a(ctt.r).a(false, this.b);
               }
            }
            break;
         case b:
            this.d.H().a(this.d);
      }
   }

   @Override
   public void a(aea $$0) {
      xi.a($$0, this, this.d.z());
      this.d.s();
   }

   @Override
   public void a(adz $$0) {
      xi.a($$0, this, this.d.z());
      this.d.G();
      if (this.d.bW.j == $$0.a()) {
         if (this.d.P_()) {
            this.d.bW.b();
         } else if (!this.d.bW.a(this.d)) {
            f.debug("Player {} interacted with invalid menu {}", this.d, this.d.bW);
         } else {
            int $$1 = $$0.d();
            if (!this.d.bW.a($$1)) {
               f.debug("Player {} clicked invalid slot index: {}, available slots: {}", new Object[]{this.d.ad(), $$1, this.d.bW.i.size()});
            } else {
               boolean $$2 = $$0.i() != this.d.bW.j();
               this.d.bW.h();
               this.d.bW.a($$1, $$0.e(), $$0.h(), this.d);
               ObjectIterator var4 = Int2ObjectMaps.fastIterable($$0.g()).iterator();

               while (var4.hasNext()) {
                  Entry<cng> $$3 = (Entry<cng>)var4.next();
                  this.d.bW.b($$3.getIntKey(), (cng)$$3.getValue());
               }

               this.d.bW.a($$0.f());
               this.d.bW.i();
               if ($$2) {
                  this.d.bW.e();
               } else {
                  this.d.bW.d();
               }
            }
         }
      }
   }

   @Override
   public void a(ael $$0) {
      xi.a($$0, this, this.d.z());
      this.d.G();
      if (!this.d.P_() && this.d.bW.j == $$0.a() && this.d.bW instanceof cjw) {
         if (!this.d.bW.a(this.d)) {
            f.debug("Player {} interacted with invalid menu {}", this.d, this.d.bW);
         } else {
            this.b.aG().a($$0.d()).ifPresent($$1 -> ((cjw)this.d.bW).a($$0.e(), (cqm<?>)$$1, this.d));
         }
      }
   }

   @Override
   public void a(ady $$0) {
      xi.a($$0, this, this.d.z());
      this.d.G();
      if (this.d.bW.j == $$0.a() && !this.d.P_()) {
         if (!this.d.bW.a(this.d)) {
            f.debug("Player {} interacted with invalid menu {}", this.d, this.d.bW);
         } else {
            boolean $$1 = this.d.bW.b(this.d, $$0.d());
            if ($$1) {
               this.d.bW.d();
            }
         }
      }
   }

   @Override
   public void a(aez $$0) {
      xi.a($$0, this, this.d.z());
      if (this.d.e.e()) {
         boolean $$1 = $$0.a() < 0;
         cng $$2 = $$0.d();
         if (!$$2.a(this.d.dL().I())) {
            return;
         }

         so $$3 = cla.a($$2);
         if (!$$2.b() && $$3 != null && $$3.e("x") && $$3.e("y") && $$3.e("z")) {
            hx $$4 = dhd.c($$3);
            if (this.d.dL().p($$4)) {
               dhd $$5 = this.d.dL().c_($$4);
               if ($$5 != null) {
                  $$5.e($$2);
               }
            }
         }

         boolean $$6 = $$0.a() >= 1 && $$0.a() <= 45;
         boolean $$7 = $$2.b() || $$2.k() >= 0 && $$2.L() <= 64 && !$$2.b();
         if ($$6 && $$7) {
            this.d.bV.b($$0.a()).e($$2);
            this.d.bV.d();
         } else if ($$1 && $$7 && this.m < 200) {
            this.m += 20;
            this.d.a($$2, true);
         }
      }
   }

   @Override
   public void a(afc $$0) {
      List<String> $$1 = Stream.of($$0.e()).map(n::a).collect(Collectors.toList());
      this.a($$1).thenAcceptAsync($$1x -> this.a($$0, $$1x), this.b);
   }

   private void a(afc $$0, List<anv> $$1) {
      this.d.G();
      ane $$2 = this.d.z();
      hx $$3 = $$0.a();
      if ($$2.B($$3)) {
         if (!($$2.c_($$3) instanceof dim $$5)) {
            return;
         }

         $$5.a(this.d, $$0.d(), $$1);
      }
   }

   @Override
   public void a(aem $$0) {
      xi.a($$0, this, this.d.z());
      this.d.fT().b = $$0.a() && this.d.fT().c;
   }

   @Override
   public void a(xs $$0) {
      xi.a($$0, this, this.d.z());
      this.d.a($$0.a());
   }

   @Override
   public void a(adp $$0) {
      xi.a($$0, this, this.d.z());
      if (this.d.l(2) || this.i()) {
         this.b.a($$0.a(), false);
      }
   }

   @Override
   public void a(aeg $$0) {
      xi.a($$0, this, this.d.z());
      if (this.d.l(2) || this.i()) {
         this.b.b($$0.a());
      }
   }

   @Override
   public void a(adt $$0) {
      xi.a($$0, this, this.d.z());
      vx.a $$1 = $$0.a();
      cft.a $$2 = this.J != null ? this.J.d().b() : null;
      cft.a $$3 = $$1.b();
      if (!Objects.equals($$2, $$3)) {
         if ($$2 != null && $$3.b().isBefore($$2.b())) {
            this.b(cft.a);
         } else {
            try {
               avd $$4 = this.b.ap();
               if ($$4 == null) {
                  f.warn("Ignoring chat session from {} due to missing Services public key", this.d.fR().getName());
                  return;
               }

               this.a($$1.a(this.d.fR(), $$4));
            } catch (cft.b var6) {
               f.error("Failed to validate profile key: {}", var6.getMessage());
               this.b(var6.b());
            }
         }
      }
   }

   @Override
   public void a(adx $$0) {
      if (!this.O) {
         throw new IllegalStateException("Client acknowledged config, but none was requested");
      } else {
         this.c.a(new aob(this.b, this.c, this.a(this.d.B())));
      }
   }

   @Override
   public void a(adu $$0) {
      xi.a($$0, this, this.d.z());
      this.e.a($$0.a());
   }

   private void a(vx $$0) {
      this.J = $$0;
      this.K = $$0.a(this.d.cw());
      this.N.append(() -> {
         this.d.a($$0);
         this.b.ae().a(new abf(EnumSet.of(abf.a.b), List.of(this.d)));
      });
   }

   @Override
   public anf p() {
      return this.d;
   }

   @FunctionalInterface
   interface a {
      bkc run(anf var1, blw var2, bkb var3);
   }
}
