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

public class aoc extends anz implements adj, aof, uu {
   static final Logger g = LogUtils.getLogger();
   public static final double d = auo.k(6.0);
   private static final int h = -1;
   private static final int i = 4096;
   private static final vf j = vf.c("multiplayer.disconnect.chat_validation_failed");
   public ane e;
   public final any f;
   private int k;
   private int l = -1;
   private int m;
   private int n;
   private double o;
   private double p;
   private double q;
   private double r;
   private double s;
   private double t;
   @Nullable
   private blv u;
   private double v;
   private double w;
   private double x;
   private double y;
   private double z;
   private double A;
   @Nullable
   private elt B;
   private int C;
   private int D;
   private boolean E;
   private int F;
   private boolean G;
   private int H;
   private int I;
   private int J;
   @Nullable
   private vw K;
   private vz.b L;
   private final vo M = new vo(20);
   private final vs N = vs.a();
   private final auc O;
   private boolean P;

   public aoc(MinecraftServer $$0, ug $$1, ane $$2, ans $$3) {
      super($$0, $$1, $$3);
      this.f = new any($$1.g());
      $$1.a(this);
      this.e = $$2;
      $$2.c = this;
      $$2.X().a();
      this.L = vz.b.unsigned($$2.cw(), $$0::ay);
      this.O = new auc($$0);
   }

   @Override
   public void e() {
      if (this.l > -1) {
         this.b(new zf(this.l));
         this.l = -1;
      }

      this.m();
      this.e.K = this.e.dr();
      this.e.L = this.e.dt();
      this.e.M = this.e.dx();
      this.e.m();
      this.e.a(this.o, this.p, this.q, this.e.dC(), this.e.dE());
      this.k++;
      this.J = this.I;
      if (this.E && !this.e.fD() && !this.e.bO() && !this.e.ew()) {
         if (++this.F > 80) {
            g.warn("{} was kicked for floating too long!", this.e.ad().getString());
            this.b(vf.c("multiplayer.disconnect.flying"));
            return;
         }
      } else {
         this.E = false;
         this.F = 0;
      }

      this.u = this.e.cW();
      if (this.u != this.e && this.u.cN() == this.e) {
         this.v = this.u.dr();
         this.w = this.u.dt();
         this.x = this.u.dx();
         this.y = this.u.dr();
         this.z = this.u.dt();
         this.A = this.u.dx();
         if (this.G && this.e.cW().cN() == this.e) {
            if (++this.H > 80) {
               g.warn("{} was kicked for floating a vehicle too long!", this.e.ad().getString());
               this.b(vf.c("multiplayer.disconnect.flying"));
               return;
            }
         } else {
            this.G = false;
            this.H = 0;
         }
      } else {
         this.u = null;
         this.G = false;
         this.H = 0;
      }

      this.f();
      if (this.m > 0) {
         this.m--;
      }

      if (this.n > 0) {
         this.n--;
      }

      if (this.e.M() > 0L && this.b.an() > 0 && ac.b() - this.e.M() > (long)this.b.an() * 1000L * 60L) {
         this.b(vf.c("multiplayer.disconnect.idling"));
      }
   }

   public void m() {
      this.o = this.e.dr();
      this.p = this.e.dt();
      this.q = this.e.dx();
      this.r = this.e.dr();
      this.s = this.e.dt();
      this.t = this.e.dx();
   }

   @Override
   public boolean c() {
      return this.c.k() && !this.P;
   }

   @Override
   public boolean a(xf<?> $$0) {
      return super.a($$0) ? true : this.P && this.c.k() && $$0 instanceof adw;
   }

   @Override
   protected GameProfile j() {
      return this.e.fR();
   }

   private <T, R> CompletableFuture<R> a(T $$0, BiFunction<aoh, T, CompletableFuture<R>> $$1) {
      return $$1.apply(this.e.X(), $$0).thenApply($$0x -> {
         if (!this.c()) {
            g.debug("Ignoring packet due to disconnection");
            throw new CancellationException("disconnected");
         } else {
            return (R)$$0x;
         }
      });
   }

   private CompletableFuture<anu> a(String $$0) {
      return this.a($$0, aoh::a);
   }

   private CompletableFuture<List<anu>> a(List<String> $$0) {
      return this.a($$0, aoh::a);
   }

   @Override
   public void a(aeo $$0) {
      xh.a($$0, this, this.e.z());
      this.e.a($$0.a(), $$0.d(), $$0.e(), $$0.f());
   }

   private static boolean b(double $$0, double $$1, double $$2, float $$3, float $$4) {
      return Double.isNaN($$0) || Double.isNaN($$1) || Double.isNaN($$2) || !Floats.isFinite($$4) || !Floats.isFinite($$3);
   }

   private static double a(double $$0) {
      return auo.a($$0, -3.0E7, 3.0E7);
   }

   private static double b(double $$0) {
      return auo.a($$0, -2.0E7, 2.0E7);
   }

   @Override
   public void a(aeh $$0) {
      xh.a($$0, this, this.e.z());
      if (b($$0.a(), $$0.d(), $$0.e(), $$0.f(), $$0.g())) {
         this.b(vf.c("multiplayer.disconnect.invalid_vehicle_movement"));
      } else {
         blv $$1 = this.e.cW();
         if ($$1 != this.e && $$1.cN() == this.e && $$1 == this.u) {
            and $$2 = this.e.z();
            double $$3 = $$1.dr();
            double $$4 = $$1.dt();
            double $$5 = $$1.dx();
            double $$6 = a($$0.a());
            double $$7 = b($$0.d());
            double $$8 = a($$0.e());
            float $$9 = auo.g($$0.f());
            float $$10 = auo.g($$0.g());
            double $$11 = $$6 - this.v;
            double $$12 = $$7 - this.w;
            double $$13 = $$8 - this.x;
            double $$14 = $$1.dp().g();
            double $$15 = $$11 * $$11 + $$12 * $$12 + $$13 * $$13;
            if ($$15 - $$14 > 100.0 && !this.i()) {
               g.warn("{} (vehicle of {}) moved too quickly! {},{},{}", new Object[]{$$1.ad().getString(), this.e.ad().getString(), $$11, $$12, $$13});
               this.b(new aat($$1));
               return;
            }

            boolean $$16 = $$2.a($$1, $$1.cH().h(0.0625));
            $$11 = $$6 - this.y;
            $$12 = $$7 - this.z - 1.0E-6;
            $$13 = $$8 - this.A;
            boolean $$17 = $$1.R;
            if ($$1 instanceof bml $$18 && $$18.e_()) {
               $$18.n();
            }

            $$1.a(bmr.b, new elt($$11, $$12, $$13));
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
               this.b(new aat($$1));
               return;
            }

            this.e.z().l().a(this.e);
            this.e.b(this.e.dr() - $$3, this.e.dt() - $$4, this.e.dx() - $$5);
            this.G = $$12 >= -0.03125 && !$$17 && !this.b.ab() && !$$1.aV() && this.a($$1);
            this.y = $$1.dr();
            this.z = $$1.dt();
            this.A = $$1.dx();
         }
      }
   }

   private boolean a(blv $$0) {
      return $$0.dM().a($$0.cH().g(0.0625).b(0.0, -0.55, 0.0)).allMatch(djg.a::i);
   }

   @Override
   public void a(adm $$0) {
      xh.a($$0, this, this.e.z());
      if ($$0.a() == this.C) {
         if (this.B == null) {
            this.b(vf.c("multiplayer.disconnect.invalid_player_movement"));
            return;
         }

         this.e.a(this.B.c, this.B.d, this.B.e, this.e.dC(), this.e.dE());
         this.r = this.B.c;
         this.s = this.B.d;
         this.t = this.B.e;
         if (this.e.O()) {
            this.e.P();
         }

         this.B = null;
      }
   }

   @Override
   public void a(aeq $$0) {
      xh.a($$0, this, this.e.z());
      this.b.aG().a($$0.a()).ifPresent(this.e.I()::e);
   }

   @Override
   public void a(aep $$0) {
      xh.a($$0, this, this.e.z());
      this.e.I().a($$0.a(), $$0.d(), $$0.e());
   }

   @Override
   public void a(aes $$0) {
      xh.a($$0, this, this.e.z());
      if ($$0.d() == aes.a.a) {
         ahg $$1 = Objects.requireNonNull($$0.e());
         af $$2 = this.b.aB().a($$1);
         if ($$2 != null) {
            this.e.Q().a($$2);
         }
      }
   }

   @Override
   public void a(adv $$0) {
      xh.a($$0, this, this.e.z());
      StringReader $$1 = new StringReader($$0.d());
      if ($$1.canRead() && $$1.peek() == '/') {
         $$1.skip();
      }

      ParseResults<ds> $$2 = this.b.aE().a().parse($$1, this.e.dd());
      this.b.aE().a().getCompletionSuggestions($$2).thenAccept($$1x -> this.b(new zr($$0.a(), $$1x)));
   }

   @Override
   public void a(aew $$0) {
      xh.a($$0, this, this.e.z());
      if (!this.b.o()) {
         this.e.a(vf.c("advMode.notEnabled"));
      } else if (!this.e.gp()) {
         this.e.a(vf.c("advMode.notAllowed"));
      } else {
         csq $$1 = null;
         dhf $$2 = null;
         hx $$3 = $$0.a();
         dgv $$4 = this.e.dM().c_($$3);
         if ($$4 instanceof dhf) {
            $$2 = (dhf)$$4;
            $$1 = $$2.c();
         }

         String $$5 = $$0.d();
         boolean $$6 = $$0.e();
         if ($$1 != null) {
            dhf.a $$7 = $$2.m();
            djh $$8 = this.e.dM().a_($$3);
            ic $$9 = $$8.c(cxz.b);

            djh $$13 = (switch ($$0.h()) {
               case a -> cws.kH.o();
               case b -> cws.kG.o();
               default -> cws.fN.o();
            }).a(cxz.b, $$9).a(cxz.c, Boolean.valueOf($$0.f()));
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

            $$2.b($$0.g());
            if ($$7 != $$0.h()) {
               $$2.g();
            }

            $$1.f();
            if (!avl.b($$5)) {
               this.e.a(vf.a("advMode.setCommand.success", $$5));
            }
         }
      }
   }

   @Override
   public void a(aex $$0) {
      xh.a($$0, this, this.e.z());
      if (!this.b.o()) {
         this.e.a(vf.c("advMode.notEnabled"));
      } else if (!this.e.gp()) {
         this.e.a(vf.c("advMode.notAllowed"));
      } else {
         csq $$1 = $$0.a(this.e.dM());
         if ($$1 != null) {
            $$1.a($$0.a());
            $$1.a($$0.d());
            if (!$$0.d()) {
               $$1.c(null);
            }

            $$1.f();
            this.e.a(vf.a("advMode.setCommand.success", $$0.a()));
         }
      }
   }

   @Override
   public void a(aej $$0) {
      xh.a($$0, this, this.e.z());
      this.e.fS().c($$0.a());
      this.e.c.b(new zw(-2, 0, this.e.fS().l, this.e.fS().a(this.e.fS().l)));
      this.e.c.b(new zw(-2, 0, $$0.a(), this.e.fS().a($$0.a())));
      this.e.c.b(new abx(this.e.fS().l));
   }

   @Override
   public void a(aer $$0) {
      xh.a($$0, this, this.e.z());
      if (this.e.bS instanceof cid $$1) {
         if (!$$1.a(this.e)) {
            g.debug("Player {} interacted with invalid menu {}", this.e, $$1);
            return;
         }

         $$1.a($$0.a());
      }
   }

   @Override
   public void a(aeu $$0) {
      xh.a($$0, this, this.e.z());
      if (this.e.bS instanceof cie $$1) {
         if (!this.e.bS.a(this.e)) {
            g.debug("Player {} interacted with invalid menu {}", this.e, this.e.bS);
            return;
         }

         $$1.a($$0.a(), $$0.d());
      }
   }

   @Override
   public void a(afa $$0) {
      xh.a($$0, this, this.e.z());
      if (this.e.gp()) {
         hx $$1 = $$0.a();
         djh $$2 = this.e.dM().a_($$1);
         if (this.e.dM().c_($$1) instanceof dij $$4) {
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
               if ($$0.d() == dij.a.b) {
                  if ($$4.C()) {
                     this.e.a(vf.a("structure_block.save_success", $$5), false);
                  } else {
                     this.e.a(vf.a("structure_block.save_failure", $$5), false);
                  }
               } else if ($$0.d() == dij.a.c) {
                  if (!$$4.E()) {
                     this.e.a(vf.a("structure_block.load_not_found", $$5), false);
                  } else if ($$4.a(this.e.z())) {
                     this.e.a(vf.a("structure_block.load_success", $$5), false);
                  } else {
                     this.e.a(vf.a("structure_block.load_prepare", $$5), false);
                  }
               } else if ($$0.d() == dij.a.d) {
                  if ($$4.B()) {
                     this.e.a(vf.a("structure_block.size_success", $$5), false);
                  } else {
                     this.e.a(vf.c("structure_block.size_failure"), false);
                  }
               }
            } else {
               this.e.a(vf.a("structure_block.invalid_structure_name", $$0.f()), false);
            }

            $$4.e();
            this.e.dM().a($$1, $$2, $$2, 3);
         }
      }
   }

   @Override
   public void a(aez $$0) {
      xh.a($$0, this, this.e.z());
      if (this.e.gp()) {
         hx $$1 = $$0.a();
         djh $$2 = this.e.dM().a_($$1);
         if (this.e.dM().c_($$1) instanceof dhv $$4) {
            $$4.a($$0.d());
            $$4.b($$0.e());
            $$4.a(ahf.a(ke.aG, $$0.f()));
            $$4.a($$0.g());
            $$4.a($$0.h());
            $$4.a($$0.j());
            $$4.b($$0.i());
            $$4.e();
            this.e.dM().a($$1, $$2, $$2, 3);
         }
      }
   }

   @Override
   public void a(aee $$0) {
      xh.a($$0, this, this.e.z());
      if (this.e.gp()) {
         hx $$1 = $$0.a();
         if (this.e.dM().c_($$1) instanceof dhv $$3) {
            $$3.a(this.e.z(), $$0.d(), $$0.e());
         }
      }
   }

   @Override
   public void a(aet $$0) {
      xh.a($$0, this, this.e.z());
      int $$1 = $$0.a();
      if (this.e.bS instanceof cjk $$2) {
         if (!$$2.a(this.e)) {
            g.debug("Player {} interacted with invalid menu {}", this.e, $$2);
            return;
         }

         $$2.e($$1);
         $$2.h($$1);
      }
   }

   @Override
   public void a(aeb $$0) {
      int $$1 = $$0.e();
      if (cfh.d($$1) || $$1 == 40) {
         List<String> $$2 = Lists.newArrayList();
         Optional<String> $$3 = $$0.d();
         $$3.ifPresent($$2::add);
         $$0.a().stream().limit(100L).forEach($$2::add);
         Consumer<List<anu>> $$4 = $$3.isPresent() ? $$1x -> this.a((anu)$$1x.get(0), $$1x.subList(1, $$1x.size()), $$1) : $$1x -> this.a($$1x, $$1);
         this.a($$2).thenAcceptAsync($$4, this.b);
      }
   }

   private void a(List<anu> $$0, int $$1) {
      cmy $$2 = this.e.fS().a($$1);
      if ($$2.a(cnb.tT)) {
         this.a($$0, UnaryOperator.identity(), $$2);
      }
   }

   private void a(anu $$0, List<anu> $$1, int $$2) {
      cmy $$3 = this.e.fS().a($$2);
      if ($$3.a(cnb.tT)) {
         cmy $$4 = new cmy(cnb.tU);
         sn $$5 = $$3.v();
         if ($$5 != null) {
            $$4.c($$5.h());
         }

         $$4.a("author", ti.a(this.e.ad().getString()));
         if (this.e.Y()) {
            $$4.a("title", ti.a($$0.b()));
         } else {
            $$4.a("filtered_title", ti.a($$0.b()));
            $$4.a("title", ti.a($$0.d()));
         }

         this.a($$1, $$0x -> vf.a.a(vf.b($$0x)), $$4);
         this.e.fS().a($$2, $$4);
      }
   }

   private void a(List<anu> $$0, UnaryOperator<String> $$1, cmy $$2) {
      st $$3 = new st();
      if (this.e.Y()) {
         $$0.stream().map($$1x -> ti.a($$1.apply($$1x.b()))).forEach($$3::add);
      } else {
         sn $$4 = new sn();
         int $$5 = 0;

         for (int $$6 = $$0.size(); $$5 < $$6; $$5++) {
            anu $$7 = $$0.get($$5);
            String $$8 = $$7.d();
            $$3.add(ti.a($$1.apply($$8)));
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
   public void a(aec $$0) {
      xh.a($$0, this, this.e.z());
      if (this.e.l(2)) {
         blv $$1 = this.e.dM().a($$0.d());
         if ($$1 != null) {
            sn $$2 = $$1.f(new sn());
            this.e.c.b(new acx($$0.a(), $$2));
         }
      }
   }

   @Override
   public void a(aea $$0) {
      xh.a($$0, this, this.e.z());
      if (!this.e.P_() && $$0.d() == this.e.bS.j) {
         if (this.e.bS instanceof cip $$1 && $$1.m() instanceof dhj $$2) {
            $$2.a($$0.a(), $$0.e());
         }
      }
   }

   @Override
   public void a(adn $$0) {
      xh.a($$0, this, this.e.z());
      if (this.e.l(2)) {
         dgv $$1 = this.e.dM().c_($$0.d());
         sn $$2 = $$1 != null ? $$1.q() : null;
         this.e.c.b(new acx($$0.a(), $$2));
      }
   }

   @Override
   public void a(aeg $$0) {
      xh.a($$0, this, this.e.z());
      if (b($$0.a(0.0), $$0.b(0.0), $$0.c(0.0), $$0.a(0.0F), $$0.b(0.0F))) {
         this.b(vf.c("multiplayer.disconnect.invalid_player_movement"));
      } else {
         and $$1 = this.e.z();
         if (!this.e.f) {
            if (this.k == 0) {
               this.m();
            }

            if (this.B != null) {
               if (this.k - this.D > 20) {
                  this.D = this.k;
                  this.a(this.B.c, this.B.d, this.B.e, this.e.dC(), this.e.dE());
               }
            } else {
               this.D = this.k;
               double $$2 = a($$0.a(this.e.dr()));
               double $$3 = b($$0.b(this.e.dt()));
               double $$4 = a($$0.c(this.e.dx()));
               float $$5 = auo.g($$0.a(this.e.dC()));
               float $$6 = auo.g($$0.b(this.e.dE()));
               if (this.e.bO()) {
                  this.e.a(this.e.dr(), this.e.dt(), this.e.dx(), $$5, $$6);
                  this.e.z().l().a(this.e);
               } else {
                  double $$7 = this.e.dr();
                  double $$8 = this.e.dt();
                  double $$9 = this.e.dx();
                  double $$10 = $$2 - this.o;
                  double $$11 = $$3 - this.p;
                  double $$12 = $$4 - this.q;
                  double $$13 = this.e.dp().g();
                  double $$14 = $$10 * $$10 + $$11 * $$11 + $$12 * $$12;
                  if (this.e.fD()) {
                     if ($$14 > 1.0) {
                        this.a(this.e.dr(), this.e.dt(), this.e.dx(), $$5, $$6);
                     }
                  } else {
                     if ($$1.s().i()) {
                        this.I++;
                        int $$15 = this.I - this.J;
                        if ($$15 > 5) {
                           g.debug("{} is sending move packets too frequently ({} packets since last tick)", this.e.ad().getString(), $$15);
                           $$15 = 1;
                        }

                        if (!this.e.O() && (!this.e.dM().Z().b(ctl.t) || !this.e.fw())) {
                           float $$16 = this.e.fw() ? 300.0F : 100.0F;
                           if ($$14 - $$13 > (double)($$16 * (float)$$15) && !this.i()) {
                              g.warn("{} moved too quickly! {},{},{}", new Object[]{this.e.ad().getString(), $$10, $$11, $$12});
                              this.a(this.e.dr(), this.e.dt(), this.e.dx(), this.e.dC(), this.e.dE());
                              return;
                           }
                        }
                     }

                     elo $$17 = this.e.cH();
                     $$10 = $$2 - this.r;
                     $$11 = $$3 - this.s;
                     $$12 = $$4 - this.t;
                     boolean $$18 = $$11 > 0.0;
                     if (this.e.aC() && !$$0.a() && $$18) {
                        this.e.fb();
                     }

                     boolean $$19 = this.e.R;
                     this.e.a(bmr.b, new elt($$10, $$11, $$12));
                     $$10 = $$2 - this.e.dr();
                     $$11 = $$3 - this.e.dt();
                     if ($$11 > -0.5 || $$11 < 0.5) {
                        $$11 = 0.0;
                     }

                     $$12 = $$4 - this.e.dx();
                     $$14 = $$10 * $$10 + $$11 * $$11 + $$12 * $$12;
                     boolean $$21 = false;
                     if (!this.e.O() && $$14 > 0.0625 && !this.e.fD() && !this.e.e.e() && this.e.e.b() != ctm.d) {
                        $$21 = true;
                        g.warn("{} moved wrongly!", this.e.ad().getString());
                     }

                     if (this.e.af || this.e.fD() || (!$$21 || !$$1.a(this.e, $$17)) && !this.a($$1, $$17, $$2, $$3, $$4)) {
                        this.e.a($$2, $$3, $$4, $$5, $$6);
                        this.E = $$11 >= -0.03125
                           && !$$19
                           && this.e.e.b() != ctm.d
                           && !this.b.ab()
                           && !this.e.fT().c
                           && !this.e.a(blk.y)
                           && !this.e.fw()
                           && !this.e.fj()
                           && this.a((blv)this.e);
                        this.e.z().l().a(this.e);
                        this.e.a(this.e.dr() - $$7, this.e.dt() - $$8, this.e.dx() - $$9, $$0.a());
                        this.e.a($$0.a(), new elt(this.e.dr() - $$7, this.e.dt() - $$8, this.e.dx() - $$9));
                        if ($$18) {
                           this.e.n();
                        }

                        this.e.b(this.e.dr() - $$7, this.e.dt() - $$8, this.e.dx() - $$9);
                        this.r = this.e.dr();
                        this.s = this.e.dt();
                        this.t = this.e.dx();
                     } else {
                        this.a($$7, $$8, $$9, $$5, $$6);
                        this.e.a(this.e.dr() - $$7, this.e.dt() - $$8, this.e.dx() - $$9, $$0.a());
                     }
                  }
               }
            }
         }
      }
   }

   private boolean a(cts $$0, elo $$1, double $$2, double $$3, double $$4) {
      elo $$5 = this.e.cH().d($$2 - this.e.dr(), $$3 - this.e.dt(), $$4 - this.e.dx());
      Iterable<emm> $$6 = $$0.d(this.e, $$5.h(1.0E-5F));
      emm $$7 = emj.a($$1.h(1.0E-5F));

      for (emm $$8 : $$6) {
         if (!emj.c($$8, $$7, elx.i)) {
            return true;
         }
      }

      return false;
   }

   public void a(double $$0, double $$1, double $$2, float $$3, float $$4) {
      this.a($$0, $$1, $$2, $$3, $$4, Collections.emptySet());
   }

   public void a(double $$0, double $$1, double $$2, float $$3, float $$4, Set<bmz> $$5) {
      double $$6 = $$5.contains(bmz.a) ? this.e.dr() : 0.0;
      double $$7 = $$5.contains(bmz.b) ? this.e.dt() : 0.0;
      double $$8 = $$5.contains(bmz.c) ? this.e.dx() : 0.0;
      float $$9 = $$5.contains(bmz.d) ? this.e.dC() : 0.0F;
      float $$10 = $$5.contains(bmz.e) ? this.e.dE() : 0.0F;
      this.B = new elt($$0, $$1, $$2);
      if (++this.C == Integer.MAX_VALUE) {
         this.C = 0;
      }

      this.D = this.k;
      this.e.a($$0, $$1, $$2, $$3, $$4);
      this.e.c.b(new abg($$0 - $$6, $$1 - $$7, $$2 - $$8, $$3 - $$9, $$4 - $$10, $$5, this.C));
   }

   @Override
   public void a(aem $$0) {
      xh.a($$0, this, this.e.z());
      hx $$1 = $$0.a();
      this.e.G();
      aem.a $$2 = $$0.e();
      switch ($$2) {
         case g:
            if (!this.e.P_()) {
               cmy $$3 = this.e.b(bka.b);
               this.e.a(bka.b, this.e.b(bka.a));
               this.e.a(bka.a, $$3);
               this.e.ft();
            }

            return;
         case e:
            if (!this.e.P_()) {
               this.e.a(false);
            }

            return;
         case d:
            if (!this.e.P_()) {
               this.e.a(true);
            }

            return;
         case f:
            this.e.fs();
            return;
         case a:
         case b:
         case c:
            this.e.e.a($$1, $$2, $$0.d(), this.e.dM().al(), $$0.f());
            this.e.c.a($$0.f());
            return;
         default:
            throw new IllegalArgumentException("Invalid player action");
      }
   }

   private static boolean a(ane $$0, cmy $$1) {
      if ($$1.b()) {
         return false;
      } else {
         cmt $$2 = $$1.d();
         return ($$2 instanceof ckr || $$2 instanceof ckz) && !$$0.gn().a($$2);
      }
   }

   @Override
   public void a(afe $$0) {
      xh.a($$0, this, this.e.z());
      this.e.c.a($$0.e());
      and $$1 = this.e.z();
      bka $$2 = $$0.a();
      cmy $$3 = this.e.b($$2);
      if ($$3.a($$1.I())) {
         elp $$4 = $$0.d();
         elt $$5 = $$4.e();
         hx $$6 = $$4.a();
         elt $$7 = elt.b($$6);
         if (!(this.e.br().g($$7) > d)) {
            elt $$8 = $$5.d($$7);
            double $$9 = 1.0000001;
            if (Math.abs($$8.a()) < 1.0000001 && Math.abs($$8.b()) < 1.0000001 && Math.abs($$8.c()) < 1.0000001) {
               ic $$10 = $$4.b();
               this.e.G();
               int $$11 = this.e.dM().al();
               if ($$6.v() < $$11) {
                  if (this.B == null && this.e.i((double)$$6.u() + 0.5, (double)$$6.v() + 0.5, (double)$$6.w() + 0.5) < 64.0 && $$1.a(this.e, $$6)) {
                     bkb $$12 = this.e.e.a(this.e, $$1, $$3, $$2, $$4);
                     if ($$10 == ic.b && !$$12.a() && $$6.v() >= $$11 - 1 && a(this.e, $$3)) {
                        vf $$13 = vf.a("build.tooHigh", $$11 - 1).a(n.m);
                        this.e.b($$13, true);
                     } else if ($$12.b()) {
                        this.e.a($$2, true);
                     }
                  }
               } else {
                  vf $$14 = vf.a("build.tooHigh", $$11 - 1).a(n.m);
                  this.e.b($$14, true);
               }

               this.e.c.b(new zj($$1, $$6));
               this.e.c.b(new zj($$1, $$6.a($$10)));
            } else {
               g.warn("Rejecting UseItemOnPacket from {}: Location {} too far away from hit block {}.", new Object[]{this.e.fR().getName(), $$5, $$6});
            }
         }
      }
   }

   @Override
   public void a(aff $$0) {
      xh.a($$0, this, this.e.z());
      this.a($$0.d());
      and $$1 = this.e.z();
      bka $$2 = $$0.a();
      cmy $$3 = this.e.b($$2);
      this.e.G();
      if (!$$3.b() && $$3.a($$1.I())) {
         bkb $$4 = this.e.e.a(this.e, $$1, $$3, $$2);
         if ($$4.b()) {
            this.e.a($$2, true);
         }
      }
   }

   @Override
   public void a(afd $$0) {
      xh.a($$0, this, this.e.z());
      if (this.e.P_()) {
         for (and $$1 : this.b.H()) {
            blv $$2 = $$0.a($$1);
            if ($$2 != null) {
               this.e.a($$1, $$2.dr(), $$2.dt(), $$2.dx(), $$2.dC(), $$2.dE());
               return;
            }
         }
      }
   }

   @Override
   public void a(aei $$0) {
      xh.a($$0, this, this.e.z());
      if (this.e.da() instanceof chc $$2) {
         $$2.a($$0.a(), $$0.d());
      }
   }

   @Override
   public void a(vf $$0) {
      g.info("{} lost connection: {}", this.e.ad().getString(), $$0.getString());
      this.q();
      super.a($$0);
   }

   private void q() {
      this.O.close();
      this.b.at();
      this.b.ae().a(vf.a("multiplayer.player.left", this.e.Q_()).a(n.o), false);
      this.e.u();
      this.b.ae().c(this.e);
      this.e.X().b();
   }

   public void a(int $$0) {
      if ($$0 < 0) {
         throw new IllegalArgumentException("Expected packet sequence nr >= 0");
      } else {
         this.l = Math.max($$0, this.l);
      }
   }

   @Override
   public void a(aev $$0) {
      xh.a($$0, this, this.e.z());
      if ($$0.a() >= 0 && $$0.a() < cfh.g()) {
         if (this.e.fS().l != $$0.a() && this.e.fo() == bka.a) {
            this.e.ft();
         }

         this.e.fS().l = $$0.a();
         this.e.G();
      } else {
         g.warn("{} tried to set an invalid carried item", this.e.ad().getString());
      }
   }

   @Override
   public void a(adr $$0) {
      if (c($$0.a())) {
         this.b(vf.c("multiplayer.disconnect.illegal_characters"));
      } else {
         Optional<vm> $$1 = this.a($$0.g());
         if ($$1.isPresent()) {
            this.b.g(() -> {
               vv $$2;
               try {
                  $$2 = this.a($$0, $$1.get());
               } catch (vz.a var6) {
                  this.a(var6);
                  return;
               }

               CompletableFuture<anu> $$5 = this.a($$2.c());
               vf $$6 = this.b.bi().decorate(this.e, $$2.d());
               this.O.append($$5, $$2x -> {
                  vv $$3 = $$2.a($$6).a($$2x.e());
                  this.b($$3);
               });
            });
         }
      }
   }

   @Override
   public void a(adq $$0) {
      if (c($$0.a())) {
         this.b(vf.c("multiplayer.disconnect.illegal_characters"));
      } else {
         Optional<vm> $$1 = this.a($$0.g());
         if ($$1.isPresent()) {
            this.b.g(() -> {
               this.a($$0, $$1.get());
               this.r();
            });
         }
      }
   }

   private void a(adq $$0, vm $$1) {
      ParseResults<ds> $$2 = this.b($$0.a());

      Map<String, vv> $$3;
      try {
         $$3 = this.a($$0, vx.a($$2), $$1);
      } catch (vz.a var6) {
         this.a(var6);
         return;
      }

      dq $$6 = new dq.a($$3);
      $$2 = dt.a($$2, $$1x -> $$1x.a($$6, this.O));
      this.b.aE().a($$2, $$0.a());
   }

   private void a(vz.a $$0) {
      g.warn("Failed to update secure chat state for {}: '{}'", this.e.fR().getName(), $$0.b().getString());
      if ($$0.a()) {
         this.b($$0.b());
      } else {
         this.e.a($$0.b().f().a(n.m));
      }
   }

   private Map<String, vv> a(adq $$0, vx<?> $$1, vm $$2) throws vz.a {
      Map<String, vv> $$3 = new Object2ObjectOpenHashMap();

      for (vx.a<?> $$4 : $$1.a()) {
         vr $$5 = $$0.f().a($$4.a());
         vy $$6 = new vy($$4.c(), $$0.d(), $$0.e(), $$2);
         $$3.put($$4.a(), this.L.unpack($$5, $$6));
      }

      return $$3;
   }

   private ParseResults<ds> b(String $$0) {
      CommandDispatcher<ds> $$1 = this.b.aE().a();
      return $$1.parse($$0, this.e.dd());
   }

   private Optional<vm> a(vm.b $$0) {
      Optional<vm> $$1 = this.b($$0);
      if (this.e.D() == cfg.c) {
         this.b(new acv(vf.c("chat.disabled.options").a(n.m), false));
         return Optional.empty();
      } else {
         this.e.G();
         return $$1;
      }
   }

   private Optional<vm> b(vm.b $$0) {
      synchronized (this.M) {
         Optional<vm> $$1 = this.M.a($$0);
         if ($$1.isEmpty()) {
            g.warn("Failed to validate message acknowledgements from {}", this.e.ad().getString());
            this.b(j);
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

   private vv a(adr $$0, vm $$1) throws vz.a {
      vy $$2 = new vy($$0.a(), $$0.d(), $$0.e(), $$1);
      return this.L.unpack($$0.f(), $$2);
   }

   private void b(vv $$0) {
      this.b.ae().a($$0, this.e, vb.a(vb.c, this.e));
      this.r();
   }

   private void r() {
      this.m += 20;
      if (this.m > 200 && !this.b.ae().f(this.e.fR())) {
         this.b(vf.c("disconnect.spam"));
      }
   }

   @Override
   public void a(adp $$0) {
      synchronized (this.M) {
         if (!this.M.a($$0.a())) {
            g.warn("Failed to validate message acknowledgements from {}", this.e.ad().getString());
            this.b(j);
         }
      }
   }

   @Override
   public void a(afc $$0) {
      xh.a($$0, this, this.e.z());
      this.e.G();
      this.e.a($$0.a());
   }

   @Override
   public void a(aen $$0) {
      xh.a($$0, this, this.e.z());
      this.e.G();
      switch ($$0.d()) {
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
            if (this.e.fD()) {
               this.e.a(false, true);
               this.B = this.e.dk();
            }
            break;
         case f:
            if (this.e.da() instanceof bmw $$1) {
               int $$2 = $$0.e();
               if ($$1.a() && $$2 > 0) {
                  $$1.c($$2);
               }
            }
            break;
         case g:
            if (this.e.da() instanceof bmw $$3) {
               $$3.b();
            }
            break;
         case h:
            if (this.e.cZ() instanceof bme $$4) {
               $$4.b(this.e);
            }
            break;
         case i:
            if (!this.e.fX()) {
               this.e.fZ();
            }
            break;
         default:
            throw new IllegalArgumentException("Invalid client command!");
      }
   }

   public void a(vv $$0) {
      vr $$1 = $$0.l();
      if ($$1 != null) {
         this.N.a($$0.m(), $$0.l());
         int $$2;
         synchronized (this.M) {
            this.M.a($$1);
            $$2 = this.M.a();
         }

         if ($$2 > 4096) {
            this.b(vf.c("multiplayer.disconnect.too_many_pending_chats"));
         }
      }
   }

   public void a(vv $$0, vb.a $$1) {
      this.b(new aaz($$0.k().c(), $$0.k().b(), $$0.l(), $$0.m().a(this.N), $$0.n(), $$0.o(), $$1.a(this.e.dM().I_())));
      this.a($$0);
   }

   public void a(vf $$0, vb.a $$1) {
      this.b(new aab($$0, $$1.a(this.e.dM().I_())));
   }

   public SocketAddress n() {
      return this.c.f();
   }

   public void o() {
      this.P = true;
      this.q();
      this.b(new act());
   }

   @Override
   public void a(agj $$0) {
      this.c.a(new agf($$0.a()));
   }

   @Override
   public void a(aed $$0) {
      xh.a($$0, this, this.e.z());
      final and $$1 = this.e.z();
      final blv $$2 = $$0.a($$1);
      this.e.G();
      this.e.f($$0.a());
      if ($$2 != null) {
         if (!$$1.D_().a($$2.dm())) {
            return;
         }

         elo $$3 = $$2.cH();
         if ($$3.e(this.e.br()) < d) {
            $$0.a(new aed.c() {
               private void a(bka $$0, aoc.a $$1x) {
                  cmy $$2 = aoc.this.e.b($$0);
                  if ($$2.a($$1.I())) {
                     cmy $$3 = $$2.p();
                     bkb $$4 = $$1.run(aoc.this.e, $$2, $$0);
                     if ($$4.a()) {
                        am.R.a(aoc.this.e, $$3, $$2);
                        if ($$4.b()) {
                           aoc.this.e.a($$0, true);
                        }
                     }
                  }
               }

               @Override
               public void a(bka $$0) {
                  this.a($$0, cfi::a);
               }

               @Override
               public void a(bka $$0, elt $$1x) {
                  this.a($$0, ($$1xxx, $$2xx, $$3) -> $$2xx.a($$1xxx, $$1, $$3));
               }

               @Override
               public void a() {
                  if (!($$2 instanceof cbu) && !($$2 instanceof bmb) && !($$2 instanceof cfo) && $$2 != aoc.this.e) {
                     cmy $$0 = aoc.this.e.b(bka.a);
                     if ($$0.a($$1.I())) {
                        aoc.this.e.d($$2);
                     }
                  } else {
                     aoc.this.b(vf.c("multiplayer.disconnect.invalid_entity_attacked"));
                     aoc.g.warn("Player {} tried to attack an invalid entity", aoc.this.e.ad().getString());
                  }
               }
            });
         }
      }
   }

   @Override
   public void a(adu $$0) {
      xh.a($$0, this, this.e.z());
      this.e.G();
      adu.a $$1 = $$0.a();
      switch ($$1) {
         case a:
            if (this.e.f) {
               this.e.f = false;
               this.e = this.b.ae().a(this.e, true);
               am.w.a(this.e, ctp.j, ctp.h);
            } else {
               if (this.e.ev() > 0.0F) {
                  return;
               }

               this.e = this.b.ae().a(this.e, false);
               if (this.b.h()) {
                  this.e.a(ctm.d);
                  this.e.dM().Z().a(ctl.r).a(false, this.b);
               }
            }
            break;
         case b:
            this.e.H().a(this.e);
      }
   }

   @Override
   public void a(adz $$0) {
      xh.a($$0, this, this.e.z());
      this.e.s();
   }

   @Override
   public void a(ady $$0) {
      xh.a($$0, this, this.e.z());
      this.e.G();
      if (this.e.bS.j == $$0.a()) {
         if (this.e.P_()) {
            this.e.bS.b();
         } else if (!this.e.bS.a(this.e)) {
            g.debug("Player {} interacted with invalid menu {}", this.e, this.e.bS);
         } else {
            int $$1 = $$0.d();
            if (!this.e.bS.a($$1)) {
               g.debug("Player {} clicked invalid slot index: {}, available slots: {}", new Object[]{this.e.ad(), $$1, this.e.bS.i.size()});
            } else {
               boolean $$2 = $$0.i() != this.e.bS.j();
               this.e.bS.h();
               this.e.bS.a($$1, $$0.e(), $$0.h(), this.e);
               ObjectIterator var4 = Int2ObjectMaps.fastIterable($$0.g()).iterator();

               while (var4.hasNext()) {
                  Entry<cmy> $$3 = (Entry<cmy>)var4.next();
                  this.e.bS.b($$3.getIntKey(), (cmy)$$3.getValue());
               }

               this.e.bS.a($$0.f());
               this.e.bS.i();
               if ($$2) {
                  this.e.bS.e();
               } else {
                  this.e.bS.d();
               }
            }
         }
      }
   }

   @Override
   public void a(aek $$0) {
      xh.a($$0, this, this.e.z());
      this.e.G();
      if (!this.e.P_() && this.e.bS.j == $$0.a() && this.e.bS instanceof cjo) {
         if (!this.e.bS.a(this.e)) {
            g.debug("Player {} interacted with invalid menu {}", this.e, this.e.bS);
         } else {
            this.b.aG().a($$0.d()).ifPresent($$1 -> ((cjo)this.e.bS).a($$0.e(), (cqe<?>)$$1, this.e));
         }
      }
   }

   @Override
   public void a(adx $$0) {
      xh.a($$0, this, this.e.z());
      this.e.G();
      if (this.e.bS.j == $$0.a() && !this.e.P_()) {
         if (!this.e.bS.a(this.e)) {
            g.debug("Player {} interacted with invalid menu {}", this.e, this.e.bS);
         } else {
            boolean $$1 = this.e.bS.b(this.e, $$0.d());
            if ($$1) {
               this.e.bS.d();
            }
         }
      }
   }

   @Override
   public void a(aey $$0) {
      xh.a($$0, this, this.e.z());
      if (this.e.e.e()) {
         boolean $$1 = $$0.a() < 0;
         cmy $$2 = $$0.d();
         if (!$$2.a(this.e.dM().I())) {
            return;
         }

         sn $$3 = ckr.a($$2);
         if (!$$2.b() && $$3 != null && $$3.e("x") && $$3.e("y") && $$3.e("z")) {
            hx $$4 = dgv.c($$3);
            if (this.e.dM().p($$4)) {
               dgv $$5 = this.e.dM().c_($$4);
               if ($$5 != null) {
                  $$5.e($$2);
               }
            }
         }

         boolean $$6 = $$0.a() >= 1 && $$0.a() <= 45;
         boolean $$7 = $$2.b() || $$2.k() >= 0 && $$2.L() <= 64 && !$$2.b();
         if ($$6 && $$7) {
            this.e.bR.b($$0.a()).e($$2);
            this.e.bR.d();
         } else if ($$1 && $$7 && this.n < 200) {
            this.n += 20;
            this.e.a($$2, true);
         }
      }
   }

   @Override
   public void a(afb $$0) {
      List<String> $$1 = Stream.of($$0.e()).map(n::a).collect(Collectors.toList());
      this.a($$1).thenAcceptAsync($$1x -> this.a($$0, $$1x), this.b);
   }

   private void a(afb $$0, List<anu> $$1) {
      this.e.G();
      and $$2 = this.e.z();
      hx $$3 = $$0.a();
      if ($$2.B($$3)) {
         if (!($$2.c_($$3) instanceof die $$5)) {
            return;
         }

         $$5.a(this.e, $$0.d(), $$1);
      }
   }

   @Override
   public void a(ael $$0) {
      xh.a($$0, this, this.e.z());
      this.e.fT().b = $$0.a() && this.e.fT().c;
   }

   @Override
   public void a(xr $$0) {
      xh.a($$0, this, this.e.z());
      this.e.a($$0.a());
   }

   @Override
   public void a(ado $$0) {
      xh.a($$0, this, this.e.z());
      if (this.e.l(2) || this.i()) {
         this.b.a($$0.a(), false);
      }
   }

   @Override
   public void a(aef $$0) {
      xh.a($$0, this, this.e.z());
      if (this.e.l(2) || this.i()) {
         this.b.b($$0.a());
      }
   }

   @Override
   public void a(ads $$0) {
      xh.a($$0, this, this.e.z());
      vw.a $$1 = $$0.a();
      cfl.a $$2 = this.K != null ? this.K.d().b() : null;
      cfl.a $$3 = $$1.b();
      if (!Objects.equals($$2, $$3)) {
         if ($$2 != null && $$3.b().isBefore($$2.b())) {
            this.b(cfl.a);
         } else {
            try {
               avc $$4 = this.b.ap();
               if ($$4 == null) {
                  g.warn("Ignoring chat session from {} due to missing Services public key", this.e.fR().getName());
                  return;
               }

               this.a($$1.a(this.e.fR(), $$4));
            } catch (cfl.b var6) {
               g.error("Failed to validate profile key: {}", var6.getMessage());
               this.b(var6.b());
            }
         }
      }
   }

   @Override
   public void a(adw $$0) {
      if (!this.P) {
         throw new IllegalStateException("Client acknowledged config, but none was requested");
      } else {
         this.c.a(new aoa(this.b, this.c, this.a(this.e.B())));
      }
   }

   @Override
   public void a(adt $$0) {
      xh.a($$0, this, this.e.z());
      this.f.a($$0.a());
   }

   private void a(vw $$0) {
      this.K = $$0;
      this.L = $$0.a(this.e.cw());
      this.O.append(() -> {
         this.e.a($$0);
         this.b.ae().a(new abe(EnumSet.of(abe.a.b), List.of(this.e)));
      });
   }

   @Override
   public ane p() {
      return this.e;
   }

   @FunctionalInterface
   interface a {
      bkb run(ane var1, blv var2, bka var3);
   }
}
