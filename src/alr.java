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
import java.time.Instant;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class alr extends alo implements abe, alu, tc {
   static final Logger g = LogUtils.getLogger();
   public static final double d = ary.k(6.0);
   private static final int h = -1;
   private static final int i = 4096;
   private static final tn j = tn.c("multiplayer.disconnect.chat_validation_failed");
   public akt e;
   public final aln f;
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
   private bis u;
   private double v;
   private double w;
   private double x;
   private double y;
   private double z;
   private double A;
   @Nullable
   private ehp B;
   private int C;
   private int D;
   private boolean E;
   private int F;
   private boolean G;
   private int H;
   private int I;
   private int J;
   private final AtomicReference<Instant> K = new AtomicReference<>(Instant.EPOCH);
   @Nullable
   private ud L;
   private ug.b M;
   private final tv N = new tv(20);
   private final tz O = tz.a();
   private final arn P;
   private boolean Q;

   public alr(MinecraftServer $$0, so $$1, akt $$2, alh $$3) {
      super($$0, $$1, $$3);
      this.f = new aln($$1.g());
      $$1.a(this);
      this.e = $$2;
      $$2.c = this;
      $$2.V().a();
      this.M = $$0.aw() ? ug.b.a : ug.b.unsigned($$2.cv());
      this.P = new arn($$0);
   }

   @Override
   public void e() {
      if (this.l > -1) {
         this.b(new xd(this.l));
         this.l = -1;
      }

      this.m();
      this.e.K = this.e.dq();
      this.e.L = this.e.ds();
      this.e.M = this.e.dw();
      this.e.m();
      this.e.a(this.o, this.p, this.q, this.e.dB(), this.e.dD());
      this.k++;
      this.J = this.I;
      if (this.E && !this.e.fC() && !this.e.bN() && !this.e.ev()) {
         if (++this.F > 80) {
            g.warn("{} was kicked for floating too long!", this.e.ab().getString());
            this.b(tn.c("multiplayer.disconnect.flying"));
            return;
         }
      } else {
         this.E = false;
         this.F = 0;
      }

      this.u = this.e.cV();
      if (this.u != this.e && this.u.cN() == this.e) {
         this.v = this.u.dq();
         this.w = this.u.ds();
         this.x = this.u.dw();
         this.y = this.u.dq();
         this.z = this.u.ds();
         this.A = this.u.dw();
         if (this.G && this.e.cV().cN() == this.e) {
            if (++this.H > 80) {
               g.warn("{} was kicked for floating a vehicle too long!", this.e.ab().getString());
               this.b(tn.c("multiplayer.disconnect.flying"));
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

      if (this.e.K() > 0L && this.b.al() > 0 && ac.b() - this.e.K() > (long)this.b.al() * 1000L * 60L) {
         this.b(tn.c("multiplayer.disconnect.idling"));
      }
   }

   public void m() {
      this.o = this.e.dq();
      this.p = this.e.ds();
      this.q = this.e.dw();
      this.r = this.e.dq();
      this.s = this.e.ds();
      this.t = this.e.dw();
   }

   @Override
   public boolean c() {
      return this.c.k() && !this.Q;
   }

   @Override
   public boolean a(vf<?> $$0) {
      return super.a($$0) ? true : this.Q && this.c.k() && $$0 instanceof abr;
   }

   @Override
   protected GameProfile j() {
      return this.e.fQ();
   }

   private <T, R> CompletableFuture<R> a(T $$0, BiFunction<alw, T, CompletableFuture<R>> $$1) {
      return $$1.apply(this.e.V(), $$0).thenApply($$0x -> {
         if (!this.c()) {
            g.debug("Ignoring packet due to disconnection");
            throw new CancellationException("disconnected");
         } else {
            return (R)$$0x;
         }
      });
   }

   private CompletableFuture<alj> a(String $$0) {
      return this.a($$0, alw::a);
   }

   private CompletableFuture<List<alj>> a(List<String> $$0) {
      return this.a($$0, alw::a);
   }

   @Override
   public void a(aci $$0) {
      vh.a($$0, this, this.e.x());
      this.e.a($$0.a(), $$0.d(), $$0.e(), $$0.f());
   }

   private static boolean b(double $$0, double $$1, double $$2, float $$3, float $$4) {
      return Double.isNaN($$0) || Double.isNaN($$1) || Double.isNaN($$2) || !Floats.isFinite($$4) || !Floats.isFinite($$3);
   }

   private static double a(double $$0) {
      return ary.a($$0, -3.0E7, 3.0E7);
   }

   private static double b(double $$0) {
      return ary.a($$0, -2.0E7, 2.0E7);
   }

   @Override
   public void a(acb $$0) {
      vh.a($$0, this, this.e.x());
      if (b($$0.a(), $$0.d(), $$0.e(), $$0.f(), $$0.g())) {
         this.b(tn.c("multiplayer.disconnect.invalid_vehicle_movement"));
      } else {
         bis $$1 = this.e.cV();
         if ($$1 != this.e && $$1.cN() == this.e && $$1 == this.u) {
            aks $$2 = this.e.x();
            double $$3 = $$1.dq();
            double $$4 = $$1.ds();
            double $$5 = $$1.dw();
            double $$6 = a($$0.a());
            double $$7 = b($$0.d());
            double $$8 = a($$0.e());
            float $$9 = ary.g($$0.f());
            float $$10 = ary.g($$0.g());
            double $$11 = $$6 - this.v;
            double $$12 = $$7 - this.w;
            double $$13 = $$8 - this.x;
            double $$14 = $$1.do().g();
            double $$15 = $$11 * $$11 + $$12 * $$12 + $$13 * $$13;
            if ($$15 - $$14 > 100.0 && !this.i()) {
               g.warn("{} (vehicle of {}) moved too quickly! {},{},{}", new Object[]{$$1.ab().getString(), this.e.ab().getString(), $$11, $$12, $$13});
               this.b(new yr($$1));
               return;
            }

            boolean $$16 = $$2.a($$1, $$1.cG().h(0.0625));
            $$11 = $$6 - this.y;
            $$12 = $$7 - this.z - 1.0E-6;
            $$13 = $$8 - this.A;
            boolean $$17 = $$1.R;
            if ($$1 instanceof bji $$18 && $$18.c_()) {
               $$18.n();
            }

            $$1.a(bjo.b, new ehp($$11, $$12, $$13));
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
               g.warn("{} (vehicle of {}) moved wrongly! {}", new Object[]{$$1.ab().getString(), this.e.ab().getString(), Math.sqrt($$15)});
            }

            $$1.a($$6, $$7, $$8, $$9, $$10);
            boolean $$21 = $$2.a($$1, $$1.cG().h(0.0625));
            if ($$16 && ($$20 || !$$21)) {
               $$1.a($$3, $$4, $$5, $$9, $$10);
               this.b(new yr($$1));
               return;
            }

            this.e.x().k().a(this.e);
            this.e.r(this.e.dq() - $$3, this.e.ds() - $$4, this.e.dw() - $$5);
            this.G = $$12 >= -0.03125 && !$$17 && !this.b.Z() && !$$1.aT() && this.a($$1);
            this.y = $$1.dq();
            this.z = $$1.ds();
            this.A = $$1.dw();
         }
      }
   }

   private boolean a(bis $$0) {
      return $$0.dL().a($$0.cG().g(0.0625).b(0.0, -0.55, 0.0)).allMatch(dfk.a::i);
   }

   @Override
   public void a(abh $$0) {
      vh.a($$0, this, this.e.x());
      if ($$0.a() == this.C) {
         if (this.B == null) {
            this.b(tn.c("multiplayer.disconnect.invalid_player_movement"));
            return;
         }

         this.e.a(this.B.c, this.B.d, this.B.e, this.e.dB(), this.e.dD());
         this.r = this.B.c;
         this.s = this.B.d;
         this.t = this.B.e;
         if (this.e.M()) {
            this.e.N();
         }

         this.B = null;
      }
   }

   @Override
   public void a(ack $$0) {
      vh.a($$0, this, this.e.x());
      this.b.aE().a($$0.a()).ifPresent(this.e.G()::e);
   }

   @Override
   public void a(acj $$0) {
      vh.a($$0, this, this.e.x());
      this.e.G().a($$0.a(), $$0.d(), $$0.e());
   }

   @Override
   public void a(acm $$0) {
      vh.a($$0, this, this.e.x());
      if ($$0.d() == acm.a.a) {
         aey $$1 = Objects.requireNonNull($$0.e());
         af $$2 = this.b.az().a($$1);
         if ($$2 != null) {
            this.e.O().a($$2);
         }
      }
   }

   @Override
   public void a(abq $$0) {
      vh.a($$0, this, this.e.x());
      StringReader $$1 = new StringReader($$0.d());
      if ($$1.canRead() && $$1.peek() == '/') {
         $$1.skip();
      }

      ParseResults<dt> $$2 = this.b.aC().a().parse($$1, this.e.dc());
      this.b.aC().a().getCompletionSuggestions($$2).thenAccept($$1x -> this.b(new xp($$0.a(), $$1x)));
   }

   @Override
   public void a(acq $$0) {
      vh.a($$0, this, this.e.x());
      if (!this.b.o()) {
         this.e.a(tn.c("advMode.notEnabled"));
      } else if (!this.e.go()) {
         this.e.a(tn.c("advMode.notAllowed"));
      } else {
         coy $$1 = null;
         ddh $$2 = null;
         gw $$3 = $$0.a();
         dcx $$4 = this.e.dL().c_($$3);
         if ($$4 instanceof ddh) {
            $$2 = (ddh)$$4;
            $$1 = $$2.c();
         }

         String $$5 = $$0.d();
         boolean $$6 = $$0.e();
         if ($$1 != null) {
            ddh.a $$7 = $$2.v();
            dfl $$8 = this.e.dL().a_($$3);
            hc $$9 = $$8.c(cue.a);

            dfl $$13 = (switch ($$0.h()) {
               case a -> csy.kH.n();
               case b -> csy.kG.n();
               default -> csy.fN.n();
            }).a(cue.a, $$9).a(cue.b, Boolean.valueOf($$0.f()));
            if ($$13 != $$8) {
               this.e.dL().a($$3, $$13, 2);
               $$4.b($$13);
               this.e.dL().l($$3).a($$4);
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
            if (!ass.b($$5)) {
               this.e.a(tn.a("advMode.setCommand.success", $$5));
            }
         }
      }
   }

   @Override
   public void a(acr $$0) {
      vh.a($$0, this, this.e.x());
      if (!this.b.o()) {
         this.e.a(tn.c("advMode.notEnabled"));
      } else if (!this.e.go()) {
         this.e.a(tn.c("advMode.notAllowed"));
      } else {
         coy $$1 = $$0.a(this.e.dL());
         if ($$1 != null) {
            $$1.a($$0.a());
            $$1.a($$0.d());
            if (!$$0.d()) {
               $$1.c(null);
            }

            $$1.f();
            this.e.a(tn.a("advMode.setCommand.success", $$0.a()));
         }
      }
   }

   @Override
   public void a(acd $$0) {
      vh.a($$0, this, this.e.x());
      this.e.fR().c($$0.a());
      this.e.c.b(new xu(-2, 0, this.e.fR().l, this.e.fR().a(this.e.fR().l)));
      this.e.c.b(new xu(-2, 0, $$0.a(), this.e.fR().a($$0.a())));
      this.e.c.b(new zu(this.e.fR().l));
   }

   @Override
   public void a(acl $$0) {
      vh.a($$0, this, this.e.x());
      if (this.e.bS instanceof cep $$1) {
         if (!$$1.a(this.e)) {
            g.debug("Player {} interacted with invalid menu {}", this.e, $$1);
            return;
         }

         $$1.a($$0.a());
      }
   }

   @Override
   public void a(aco $$0) {
      vh.a($$0, this, this.e.x());
      if (this.e.bS instanceof ceq $$1) {
         if (!this.e.bS.a(this.e)) {
            g.debug("Player {} interacted with invalid menu {}", this.e, this.e.bS);
            return;
         }

         $$1.a($$0.a(), $$0.d());
      }
   }

   @Override
   public void a(acu $$0) {
      vh.a($$0, this, this.e.x());
      if (this.e.go()) {
         gw $$1 = $$0.a();
         dfl $$2 = this.e.dL().a_($$1);
         if (this.e.dL().c_($$1) instanceof dek $$4) {
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
            if ($$4.g()) {
               String $$5 = $$4.d();
               if ($$0.d() == dek.a.b) {
                  if ($$4.D()) {
                     this.e.a(tn.a("structure_block.save_success", $$5), false);
                  } else {
                     this.e.a(tn.a("structure_block.save_failure", $$5), false);
                  }
               } else if ($$0.d() == dek.a.c) {
                  if (!$$4.F()) {
                     this.e.a(tn.a("structure_block.load_not_found", $$5), false);
                  } else if ($$4.a(this.e.x())) {
                     this.e.a(tn.a("structure_block.load_success", $$5), false);
                  } else {
                     this.e.a(tn.a("structure_block.load_prepare", $$5), false);
                  }
               } else if ($$0.d() == dek.a.d) {
                  if ($$4.C()) {
                     this.e.a(tn.a("structure_block.size_success", $$5), false);
                  } else {
                     this.e.a(tn.c("structure_block.size_failure"), false);
                  }
               }
            } else {
               this.e.a(tn.a("structure_block.invalid_structure_name", $$0.f()), false);
            }

            $$4.e();
            this.e.dL().a($$1, $$2, $$2, 3);
         }
      }
   }

   @Override
   public void a(act $$0) {
      vh.a($$0, this, this.e.x());
      if (this.e.go()) {
         gw $$1 = $$0.a();
         dfl $$2 = this.e.dL().a_($$1);
         if (this.e.dL().c_($$1) instanceof ddw $$4) {
            $$4.a($$0.d());
            $$4.b($$0.e());
            $$4.a(aex.a(je.aC, $$0.f()));
            $$4.a($$0.g());
            $$4.a($$0.h());
            $$4.e();
            this.e.dL().a($$1, $$2, $$2, 3);
         }
      }
   }

   @Override
   public void a(aby $$0) {
      vh.a($$0, this, this.e.x());
      if (this.e.go()) {
         gw $$1 = $$0.a();
         if (this.e.dL().c_($$1) instanceof ddw $$3) {
            $$3.a(this.e.x(), $$0.d(), $$0.e());
         }
      }
   }

   @Override
   public void a(acn $$0) {
      vh.a($$0, this, this.e.x());
      int $$1 = $$0.a();
      if (this.e.bS instanceof cfu $$2) {
         if (!$$2.a(this.e)) {
            g.debug("Player {} interacted with invalid menu {}", this.e, $$2);
            return;
         }

         $$2.e($$1);
         $$2.h($$1);
      }
   }

   @Override
   public void a(abv $$0) {
      int $$1 = $$0.e();
      if (cbv.d($$1) || $$1 == 40) {
         List<String> $$2 = Lists.newArrayList();
         Optional<String> $$3 = $$0.d();
         $$3.ifPresent($$2::add);
         $$0.a().stream().limit(100L).forEach($$2::add);
         Consumer<List<alj>> $$4 = $$3.isPresent() ? $$1x -> this.a((alj)$$1x.get(0), $$1x.subList(1, $$1x.size()), $$1) : $$1x -> this.a($$1x, $$1);
         this.a($$2).thenAcceptAsync($$4, this.b);
      }
   }

   private void a(List<alj> $$0, int $$1) {
      cjh $$2 = this.e.fR().a($$1);
      if ($$2.a(cjk.tg)) {
         this.a($$0, UnaryOperator.identity(), $$2);
      }
   }

   private void a(alj $$0, List<alj> $$1, int $$2) {
      cjh $$3 = this.e.fR().a($$2);
      if ($$3.a(cjk.tg)) {
         cjh $$4 = new cjh(cjk.th);
         qy $$5 = $$3.v();
         if ($$5 != null) {
            $$4.c($$5.h());
         }

         $$4.a("author", rq.a(this.e.ab().getString()));
         if (this.e.W()) {
            $$4.a("title", rq.a($$0.b()));
         } else {
            $$4.a("filtered_title", rq.a($$0.b()));
            $$4.a("title", rq.a($$0.d()));
         }

         this.a($$1, $$0x -> tn.a.a(tn.b($$0x)), $$4);
         this.e.fR().a($$2, $$4);
      }
   }

   private void a(List<alj> $$0, UnaryOperator<String> $$1, cjh $$2) {
      re $$3 = new re();
      if (this.e.W()) {
         $$0.stream().map($$1x -> rq.a($$1.apply($$1x.b()))).forEach($$3::add);
      } else {
         qy $$4 = new qy();
         int $$5 = 0;

         for (int $$6 = $$0.size(); $$5 < $$6; $$5++) {
            alj $$7 = $$0.get($$5);
            String $$8 = $$7.d();
            $$3.add(rq.a($$1.apply($$8)));
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
   public void a(abw $$0) {
      vh.a($$0, this, this.e.x());
      if (this.e.l(2)) {
         bis $$1 = this.e.dL().a($$0.d());
         if ($$1 != null) {
            qy $$2 = $$1.f(new qy());
            this.e.c.b(new aau($$0.a(), $$2));
         }
      }
   }

   @Override
   public void a(abi $$0) {
      vh.a($$0, this, this.e.x());
      if (this.e.l(2)) {
         dcx $$1 = this.e.dL().c_($$0.d());
         qy $$2 = $$1 != null ? $$1.o() : null;
         this.e.c.b(new aau($$0.a(), $$2));
      }
   }

   @Override
   public void a(aca $$0) {
      vh.a($$0, this, this.e.x());
      if (b($$0.a(0.0), $$0.b(0.0), $$0.c(0.0), $$0.a(0.0F), $$0.b(0.0F))) {
         this.b(tn.c("multiplayer.disconnect.invalid_player_movement"));
      } else {
         aks $$1 = this.e.x();
         if (!this.e.f) {
            if (this.k == 0) {
               this.m();
            }

            if (this.B != null) {
               if (this.k - this.D > 20) {
                  this.D = this.k;
                  this.a(this.B.c, this.B.d, this.B.e, this.e.dB(), this.e.dD());
               }
            } else {
               this.D = this.k;
               double $$2 = a($$0.a(this.e.dq()));
               double $$3 = b($$0.b(this.e.ds()));
               double $$4 = a($$0.c(this.e.dw()));
               float $$5 = ary.g($$0.a(this.e.dB()));
               float $$6 = ary.g($$0.b(this.e.dD()));
               if (this.e.bN()) {
                  this.e.a(this.e.dq(), this.e.ds(), this.e.dw(), $$5, $$6);
                  this.e.x().k().a(this.e);
               } else {
                  double $$7 = this.e.dq();
                  double $$8 = this.e.ds();
                  double $$9 = this.e.dw();
                  double $$10 = $$2 - this.o;
                  double $$11 = $$3 - this.p;
                  double $$12 = $$4 - this.q;
                  double $$13 = this.e.do().g();
                  double $$14 = $$10 * $$10 + $$11 * $$11 + $$12 * $$12;
                  if (this.e.fC()) {
                     if ($$14 > 1.0) {
                        this.a(this.e.dq(), this.e.ds(), this.e.dw(), $$5, $$6);
                     }
                  } else {
                     this.I++;
                     int $$15 = this.I - this.J;
                     if ($$15 > 5) {
                        g.debug("{} is sending move packets too frequently ({} packets since last tick)", this.e.ab().getString(), $$15);
                        $$15 = 1;
                     }

                     if (!this.e.M() && (!this.e.dL().X().b(cpt.s) || !this.e.fv())) {
                        float $$16 = this.e.fv() ? 300.0F : 100.0F;
                        if ($$14 - $$13 > (double)($$16 * (float)$$15) && !this.i()) {
                           g.warn("{} moved too quickly! {},{},{}", new Object[]{this.e.ab().getString(), $$10, $$11, $$12});
                           this.a(this.e.dq(), this.e.ds(), this.e.dw(), this.e.dB(), this.e.dD());
                           return;
                        }
                     }

                     ehk $$17 = this.e.cG();
                     $$10 = $$2 - this.r;
                     $$11 = $$3 - this.s;
                     $$12 = $$4 - this.t;
                     boolean $$18 = $$11 > 0.0;
                     if (this.e.aA() && !$$0.a() && $$18) {
                        this.e.fa();
                     }

                     boolean $$19 = this.e.R;
                     this.e.a(bjo.b, new ehp($$10, $$11, $$12));
                     $$10 = $$2 - this.e.dq();
                     $$11 = $$3 - this.e.ds();
                     if ($$11 > -0.5 || $$11 < 0.5) {
                        $$11 = 0.0;
                     }

                     $$12 = $$4 - this.e.dw();
                     $$14 = $$10 * $$10 + $$11 * $$11 + $$12 * $$12;
                     boolean $$21 = false;
                     if (!this.e.M() && $$14 > 0.0625 && !this.e.fC() && !this.e.e.e() && this.e.e.b() != cpu.d) {
                        $$21 = true;
                        g.warn("{} moved wrongly!", this.e.ab().getString());
                     }

                     if (this.e.af || this.e.fC() || (!$$21 || !$$1.a(this.e, $$17)) && !this.a($$1, $$17, $$2, $$3, $$4)) {
                        this.e.a($$2, $$3, $$4, $$5, $$6);
                        this.E = $$11 >= -0.03125
                           && !$$19
                           && this.e.e.b() != cpu.d
                           && !this.b.Z()
                           && !this.e.fS().c
                           && !this.e.a(bih.y)
                           && !this.e.fv()
                           && !this.e.fi()
                           && this.a((bis)this.e);
                        this.e.x().k().a(this.e);
                        this.e.a(this.e.dq() - $$7, this.e.ds() - $$8, this.e.dw() - $$9, $$0.a());
                        this.e.a($$0.a(), new ehp(this.e.dq() - $$7, this.e.ds() - $$8, this.e.dw() - $$9));
                        if ($$18) {
                           this.e.n();
                        }

                        this.e.r(this.e.dq() - $$7, this.e.ds() - $$8, this.e.dw() - $$9);
                        this.r = this.e.dq();
                        this.s = this.e.ds();
                        this.t = this.e.dw();
                     } else {
                        this.a($$7, $$8, $$9, $$5, $$6);
                        this.e.a(this.e.dq() - $$7, this.e.ds() - $$8, this.e.dw() - $$9, $$0.a());
                     }
                  }
               }
            }
         }
      }
   }

   private boolean a(cqa $$0, ehk $$1, double $$2, double $$3, double $$4) {
      ehk $$5 = this.e.cG().d($$2 - this.e.dq(), $$3 - this.e.ds(), $$4 - this.e.dw());
      Iterable<eii> $$6 = $$0.d(this.e, $$5.h(1.0E-5F));
      eii $$7 = eif.a($$1.h(1.0E-5F));

      for (eii $$8 : $$6) {
         if (!eif.c($$8, $$7, eht.i)) {
            return true;
         }
      }

      return false;
   }

   public void a(double $$0, double $$1, double $$2, float $$3, float $$4) {
      this.a($$0, $$1, $$2, $$3, $$4, Collections.emptySet());
   }

   public void a(double $$0, double $$1, double $$2, float $$3, float $$4, Set<bjw> $$5) {
      double $$6 = $$5.contains(bjw.a) ? this.e.dq() : 0.0;
      double $$7 = $$5.contains(bjw.b) ? this.e.ds() : 0.0;
      double $$8 = $$5.contains(bjw.c) ? this.e.dw() : 0.0;
      float $$9 = $$5.contains(bjw.d) ? this.e.dB() : 0.0F;
      float $$10 = $$5.contains(bjw.e) ? this.e.dD() : 0.0F;
      this.B = new ehp($$0, $$1, $$2);
      if (++this.C == Integer.MAX_VALUE) {
         this.C = 0;
      }

      this.D = this.k;
      this.e.a($$0, $$1, $$2, $$3, $$4);
      this.e.c.b(new ze($$0 - $$6, $$1 - $$7, $$2 - $$8, $$3 - $$9, $$4 - $$10, $$5, this.C));
   }

   @Override
   public void a(acg $$0) {
      vh.a($$0, this, this.e.x());
      gw $$1 = $$0.a();
      this.e.E();
      acg.a $$2 = $$0.e();
      switch ($$2) {
         case g:
            if (!this.e.M_()) {
               cjh $$3 = this.e.b(bgz.b);
               this.e.a(bgz.b, this.e.b(bgz.a));
               this.e.a(bgz.a, $$3);
               this.e.fs();
            }

            return;
         case e:
            if (!this.e.M_()) {
               this.e.a(false);
            }

            return;
         case d:
            if (!this.e.M_()) {
               this.e.a(true);
            }

            return;
         case f:
            this.e.fr();
            return;
         case a:
         case b:
         case c:
            this.e.e.a($$1, $$2, $$0.d(), this.e.dL().aj(), $$0.f());
            this.e.c.a($$0.f());
            return;
         default:
            throw new IllegalArgumentException("Invalid player action");
      }
   }

   private static boolean a(akt $$0, cjh $$1) {
      if ($$1.b()) {
         return false;
      } else {
         cjc $$2 = $$1.d();
         return ($$2 instanceof cha || $$2 instanceof chi) && !$$0.gm().a($$2);
      }
   }

   @Override
   public void a(acy $$0) {
      vh.a($$0, this, this.e.x());
      this.e.c.a($$0.e());
      aks $$1 = this.e.x();
      bgz $$2 = $$0.a();
      cjh $$3 = this.e.b($$2);
      if ($$3.a($$1.G())) {
         ehl $$4 = $$0.d();
         ehp $$5 = $$4.e();
         gw $$6 = $$4.a();
         ehp $$7 = ehp.b($$6);
         if (!(this.e.bp().g($$7) > d)) {
            ehp $$8 = $$5.d($$7);
            double $$9 = 1.0000001;
            if (Math.abs($$8.a()) < 1.0000001 && Math.abs($$8.b()) < 1.0000001 && Math.abs($$8.c()) < 1.0000001) {
               hc $$10 = $$4.b();
               this.e.E();
               int $$11 = this.e.dL().aj();
               if ($$6.v() < $$11) {
                  if (this.B == null && this.e.i((double)$$6.u() + 0.5, (double)$$6.v() + 0.5, (double)$$6.w() + 0.5) < 64.0 && $$1.a(this.e, $$6)) {
                     bha $$12 = this.e.e.a(this.e, $$1, $$3, $$2, $$4);
                     if ($$10 == hc.b && !$$12.a() && $$6.v() >= $$11 - 1 && a(this.e, $$3)) {
                        tn $$13 = tn.a("build.tooHigh", $$11 - 1).a(n.m);
                        this.e.b($$13, true);
                     } else if ($$12.b()) {
                        this.e.a($$2, true);
                     }
                  }
               } else {
                  tn $$14 = tn.a("build.tooHigh", $$11 - 1).a(n.m);
                  this.e.b($$14, true);
               }

               this.e.c.b(new xh($$1, $$6));
               this.e.c.b(new xh($$1, $$6.a($$10)));
            } else {
               g.warn("Rejecting UseItemOnPacket from {}: Location {} too far away from hit block {}.", new Object[]{this.e.fQ().getName(), $$5, $$6});
            }
         }
      }
   }

   @Override
   public void a(acz $$0) {
      vh.a($$0, this, this.e.x());
      this.a($$0.d());
      aks $$1 = this.e.x();
      bgz $$2 = $$0.a();
      cjh $$3 = this.e.b($$2);
      this.e.E();
      if (!$$3.b() && $$3.a($$1.G())) {
         bha $$4 = this.e.e.a(this.e, $$1, $$3, $$2);
         if ($$4.b()) {
            this.e.a($$2, true);
         }
      }
   }

   @Override
   public void a(acx $$0) {
      vh.a($$0, this, this.e.x());
      if (this.e.M_()) {
         for (aks $$1 : this.b.F()) {
            bis $$2 = $$0.a($$1);
            if ($$2 != null) {
               this.e.a($$1, $$2.dq(), $$2.ds(), $$2.dw(), $$2.dB(), $$2.dD());
               return;
            }
         }
      }
   }

   @Override
   public void a(acc $$0) {
      vh.a($$0, this, this.e.x());
      if (this.e.cZ() instanceof cdp $$2) {
         $$2.a($$0.a(), $$0.d());
      }
   }

   @Override
   public void a(tn $$0) {
      g.info("{} lost connection: {}", this.e.ab().getString(), $$0.getString());
      this.q();
      super.a($$0);
   }

   private void q() {
      this.P.close();
      this.b.ar();
      this.b.ac().a(tn.a("multiplayer.player.left", this.e.N_()).a(n.o), false);
      this.e.s();
      this.b.ac().c(this.e);
      this.e.V().b();
   }

   public void a(int $$0) {
      if ($$0 < 0) {
         throw new IllegalArgumentException("Expected packet sequence nr >= 0");
      } else {
         this.l = Math.max($$0, this.l);
      }
   }

   @Override
   public void a(acp $$0) {
      vh.a($$0, this, this.e.x());
      if ($$0.a() >= 0 && $$0.a() < cbv.g()) {
         if (this.e.fR().l != $$0.a() && this.e.fn() == bgz.a) {
            this.e.fs();
         }

         this.e.fR().l = $$0.a();
         this.e.E();
      } else {
         g.warn("{} tried to set an invalid carried item", this.e.ab().getString());
      }
   }

   @Override
   public void a(abm $$0) {
      if (c($$0.a())) {
         this.b(tn.c("multiplayer.disconnect.illegal_characters"));
      } else {
         Optional<tt> $$1 = this.a($$0.a(), $$0.d(), $$0.g());
         if ($$1.isPresent()) {
            this.b.g(() -> {
               uc $$2;
               try {
                  $$2 = this.a($$0, $$1.get());
               } catch (ug.a var6) {
                  this.a(var6);
                  return;
               }

               CompletableFuture<alj> $$5 = this.a($$2.b());
               tn $$6 = this.b.bd().decorate(this.e, $$2.c());
               this.P.append($$3 -> $$5.thenAcceptAsync($$2x -> {
                     uc $$3x = $$2.a($$6).a($$2x.e());
                     this.b($$3x);
                  }, $$3));
            });
         }
      }
   }

   @Override
   public void a(abl $$0) {
      if (c($$0.a())) {
         this.b(tn.c("multiplayer.disconnect.illegal_characters"));
      } else {
         Optional<tt> $$1 = this.a($$0.a(), $$0.d(), $$0.g());
         if ($$1.isPresent()) {
            this.b.g(() -> {
               this.a($$0, $$1.get());
               this.r();
            });
         }
      }
   }

   private void a(abl $$0, tt $$1) {
      ParseResults<dt> $$2 = this.b($$0.a());

      Map<String, uc> $$3;
      try {
         $$3 = this.a($$0, ue.a($$2), $$1);
      } catch (ug.a var6) {
         this.a(var6);
         return;
      }

      dr $$6 = new dr.a($$3);
      $$2 = du.a($$2, $$1x -> $$1x.a($$6, this.P));
      this.b.aC().a($$2, $$0.a());
   }

   private void a(ug.a $$0) {
      if ($$0.a()) {
         this.b($$0.b());
      } else {
         this.e.a($$0.b().e().a(n.m));
      }
   }

   private Map<String, uc> a(abl $$0, ue<?> $$1, tt $$2) throws ug.a {
      Map<String, uc> $$3 = new Object2ObjectOpenHashMap();

      for (ue.a<?> $$4 : $$1.a()) {
         ty $$5 = $$0.f().a($$4.a());
         uf $$6 = new uf($$4.c(), $$0.d(), $$0.e(), $$2);
         $$3.put($$4.a(), this.M.unpack($$5, $$6));
      }

      return $$3;
   }

   private ParseResults<dt> b(String $$0) {
      CommandDispatcher<dt> $$1 = this.b.aC().a();
      return $$1.parse($$0, this.e.dc());
   }

   private Optional<tt> a(String $$0, Instant $$1, tt.b $$2) {
      if (!this.a($$1)) {
         g.warn("{} sent out-of-order chat: '{}'", this.e.ab().getString(), $$0);
         this.b(tn.c("multiplayer.disconnect.out_of_order_chat"));
         return Optional.empty();
      } else {
         Optional<tt> $$3 = this.a($$2);
         if (this.e.B() == cbu.c) {
            this.b(new aas(tn.c("chat.disabled.options").a(n.m), false));
            return Optional.empty();
         } else {
            this.e.E();
            return $$3;
         }
      }
   }

   private Optional<tt> a(tt.b $$0) {
      synchronized (this.N) {
         Optional<tt> $$1 = this.N.a($$0);
         if ($$1.isEmpty()) {
            g.warn("Failed to validate message acknowledgements from {}", this.e.ab().getString());
            this.b(j);
         }

         return $$1;
      }
   }

   private boolean a(Instant $$0) {
      Instant $$1;
      do {
         $$1 = this.K.get();
         if ($$0.isBefore($$1)) {
            return false;
         }
      } while (!this.K.compareAndSet($$1, $$0));

      return true;
   }

   private static boolean c(String $$0) {
      for (int $$1 = 0; $$1 < $$0.length(); $$1++) {
         if (!aa.a($$0.charAt($$1))) {
            return true;
         }
      }

      return false;
   }

   private uc a(abm $$0, tt $$1) throws ug.a {
      uf $$2 = new uf($$0.a(), $$0.d(), $$0.e(), $$1);
      return this.M.unpack($$0.f(), $$2);
   }

   private void b(uc $$0) {
      this.b.ac().a($$0, this.e, tj.a(tj.c, this.e));
      this.r();
   }

   private void r() {
      this.m += 20;
      if (this.m > 200 && !this.b.ac().f(this.e.fQ())) {
         this.b(tn.c("disconnect.spam"));
      }
   }

   @Override
   public void a(abk $$0) {
      synchronized (this.N) {
         if (!this.N.a($$0.a())) {
            g.warn("Failed to validate message acknowledgements from {}", this.e.ab().getString());
            this.b(j);
         }
      }
   }

   @Override
   public void a(acw $$0) {
      vh.a($$0, this, this.e.x());
      this.e.E();
      this.e.a($$0.a());
   }

   @Override
   public void a(ach $$0) {
      vh.a($$0, this, this.e.x());
      this.e.E();
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
            if (this.e.fC()) {
               this.e.a(false, true);
               this.B = this.e.dj();
            }
            break;
         case f:
            if (this.e.cZ() instanceof bjt $$1) {
               int $$2 = $$0.e();
               if ($$1.a() && $$2 > 0) {
                  $$1.c($$2);
               }
            }
            break;
         case g:
            if (this.e.cZ() instanceof bjt $$3) {
               $$3.b();
            }
            break;
         case h:
            if (this.e.cY() instanceof bjb $$4) {
               $$4.b(this.e);
            }
            break;
         case i:
            if (!this.e.fW()) {
               this.e.fY();
            }
            break;
         default:
            throw new IllegalArgumentException("Invalid client command!");
      }
   }

   public void a(uc $$0) {
      ty $$1 = $$0.k();
      if ($$1 != null) {
         this.O.a($$0);
         int $$2;
         synchronized (this.N) {
            this.N.a($$1);
            $$2 = this.N.a();
         }

         if ($$2 > 4096) {
            this.b(tn.c("multiplayer.disconnect.too_many_pending_chats"));
         }
      }
   }

   public void a(uc $$0, tj.a $$1) {
      this.b(new yx($$0.j().c(), $$0.j().b(), $$0.k(), $$0.l().a(this.O), $$0.m(), $$0.n(), $$1.a(this.e.dL().G_())));
      this.a($$0);
   }

   public void a(tn $$0, tj.a $$1) {
      this.b(new xz($$0, $$1.a(this.e.dL().G_())));
   }

   public SocketAddress n() {
      return this.c.f();
   }

   public void o() {
      this.Q = true;
      this.q();
      this.b(new aaq());
   }

   @Override
   public void a(aed $$0) {
      this.c.a(new adz($$0.a()));
   }

   @Override
   public void a(abx $$0) {
      vh.a($$0, this, this.e.x());
      final aks $$1 = this.e.x();
      final bis $$2 = $$0.a($$1);
      this.e.E();
      this.e.f($$0.a());
      if ($$2 != null) {
         if (!$$1.B_().a($$2.dl())) {
            return;
         }

         ehk $$3 = $$2.cG();
         if ($$3.e(this.e.bp()) < d) {
            $$0.a(new abx.c() {
               private void a(bgz $$0, alr.a $$1x) {
                  cjh $$2 = alr.this.e.b($$0);
                  if ($$2.a($$1.G())) {
                     cjh $$3 = $$2.p();
                     bha $$4 = $$1.run(alr.this.e, $$2, $$0);
                     if ($$4.a()) {
                        al.Q.a(alr.this.e, $$3, $$2);
                        if ($$4.b()) {
                           alr.this.e.a($$0, true);
                        }
                     }
                  }
               }

               @Override
               public void a(bgz $$0) {
                  this.a($$0, cbw::a);
               }

               @Override
               public void a(bgz $$0, ehp $$1x) {
                  this.a($$0, ($$1xxx, $$2xx, $$3) -> $$2xx.a($$1xxx, $$1, $$3));
               }

               @Override
               public void a() {
                  if (!($$2 instanceof byp) && !($$2 instanceof biy) && !($$2 instanceof ccc) && $$2 != alr.this.e) {
                     cjh $$0 = alr.this.e.b(bgz.a);
                     if ($$0.a($$1.G())) {
                        alr.this.e.d($$2);
                     }
                  } else {
                     alr.this.b(tn.c("multiplayer.disconnect.invalid_entity_attacked"));
                     alr.g.warn("Player {} tried to attack an invalid entity", alr.this.e.ab().getString());
                  }
               }
            });
         }
      }
   }

   @Override
   public void a(abp $$0) {
      vh.a($$0, this, this.e.x());
      this.e.E();
      abp.a $$1 = $$0.a();
      switch ($$1) {
         case a:
            if (this.e.f) {
               this.e.f = false;
               this.e = this.b.ac().a(this.e, true);
               al.v.a(this.e, cpx.j, cpx.h);
            } else {
               if (this.e.eu() > 0.0F) {
                  return;
               }

               this.e = this.b.ac().a(this.e, false);
               if (this.b.h()) {
                  this.e.a(cpu.d);
                  this.e.dL().X().a(cpt.q).a(false, this.b);
               }
            }
            break;
         case b:
            this.e.F().a(this.e);
      }
   }

   @Override
   public void a(abu $$0) {
      vh.a($$0, this, this.e.x());
      this.e.r();
   }

   @Override
   public void a(abt $$0) {
      vh.a($$0, this, this.e.x());
      this.e.E();
      if (this.e.bS.j == $$0.a()) {
         if (this.e.M_()) {
            this.e.bS.b();
         } else if (!this.e.bS.a(this.e)) {
            g.debug("Player {} interacted with invalid menu {}", this.e, this.e.bS);
         } else {
            int $$1 = $$0.d();
            if (!this.e.bS.a($$1)) {
               g.debug("Player {} clicked invalid slot index: {}, available slots: {}", new Object[]{this.e.ab(), $$1, this.e.bS.i.size()});
            } else {
               boolean $$2 = $$0.i() != this.e.bS.j();
               this.e.bS.h();
               this.e.bS.a($$1, $$0.e(), $$0.h(), this.e);
               ObjectIterator var4 = Int2ObjectMaps.fastIterable($$0.g()).iterator();

               while (var4.hasNext()) {
                  Entry<cjh> $$3 = (Entry<cjh>)var4.next();
                  this.e.bS.b($$3.getIntKey(), (cjh)$$3.getValue());
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
   public void a(ace $$0) {
      vh.a($$0, this, this.e.x());
      this.e.E();
      if (!this.e.M_() && this.e.bS.j == $$0.a() && this.e.bS instanceof cfx) {
         if (!this.e.bS.a(this.e)) {
            g.debug("Player {} interacted with invalid menu {}", this.e, this.e.bS);
         } else {
            this.b.aE().a($$0.d()).ifPresent($$1 -> ((cfx)this.e.bS).a($$0.e(), (cmm<?>)$$1, this.e));
         }
      }
   }

   @Override
   public void a(abs $$0) {
      vh.a($$0, this, this.e.x());
      this.e.E();
      if (this.e.bS.j == $$0.a() && !this.e.M_()) {
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
   public void a(acs $$0) {
      vh.a($$0, this, this.e.x());
      if (this.e.e.e()) {
         boolean $$1 = $$0.a() < 0;
         cjh $$2 = $$0.d();
         if (!$$2.a(this.e.dL().G())) {
            return;
         }

         qy $$3 = cha.a($$2);
         if (!$$2.b() && $$3 != null && $$3.e("x") && $$3.e("y") && $$3.e("z")) {
            gw $$4 = dcx.c($$3);
            if (this.e.dL().o($$4)) {
               dcx $$5 = this.e.dL().c_($$4);
               if ($$5 != null) {
                  $$5.e($$2);
               }
            }
         }

         boolean $$6 = $$0.a() >= 1 && $$0.a() <= 45;
         boolean $$7 = $$2.b() || $$2.k() >= 0 && $$2.L() <= 64 && !$$2.b();
         if ($$6 && $$7) {
            this.e.bR.b($$0.a()).d($$2);
            this.e.bR.d();
         } else if ($$1 && $$7 && this.n < 200) {
            this.n += 20;
            this.e.a($$2, true);
         }
      }
   }

   @Override
   public void a(acv $$0) {
      List<String> $$1 = Stream.of($$0.e()).map(n::a).collect(Collectors.toList());
      this.a($$1).thenAcceptAsync($$1x -> this.a($$0, $$1x), this.b);
   }

   private void a(acv $$0, List<alj> $$1) {
      this.e.E();
      aks $$2 = this.e.x();
      gw $$3 = $$0.a();
      if ($$2.A($$3)) {
         if (!($$2.c_($$3) instanceof def $$5)) {
            return;
         }

         $$5.a(this.e, $$0.d(), $$1);
      }
   }

   @Override
   public void a(acf $$0) {
      vh.a($$0, this, this.e.x());
      this.e.fS().b = $$0.a() && this.e.fS().c;
   }

   @Override
   public void a(vq $$0) {
      vh.a($$0, this, this.e.x());
      this.e.a($$0.a());
   }

   @Override
   public void a(abj $$0) {
      vh.a($$0, this, this.e.x());
      if (this.e.l(2) || this.i()) {
         this.b.a($$0.a(), false);
      }
   }

   @Override
   public void a(abz $$0) {
      vh.a($$0, this, this.e.x());
      if (this.e.l(2) || this.i()) {
         this.b.b($$0.a());
      }
   }

   @Override
   public void a(abn $$0) {
      vh.a($$0, this, this.e.x());
      ud.a $$1 = $$0.a();
      cbz.a $$2 = this.L != null ? this.L.d().b() : null;
      cbz.a $$3 = $$1.b();
      if (!Objects.equals($$2, $$3)) {
         if ($$2 != null && $$3.b().isBefore($$2.b())) {
            this.b(cbz.a);
         } else {
            try {
               asj $$4 = this.b.an();
               if ($$4 == null) {
                  g.warn("Ignoring chat session from {} due to missing Services public key", this.e.fQ().getName());
                  return;
               }

               this.a($$1.a(this.e.fQ(), $$4));
            } catch (cbz.b var6) {
               g.error("Failed to validate profile key: {}", var6.getMessage());
               this.b(var6.b());
            }
         }
      }
   }

   @Override
   public void a(abr $$0) {
      if (!this.Q) {
         throw new IllegalStateException("Client acknowledged config, but none was requested");
      } else {
         this.c.a(new alp(this.b, this.c, this.a(this.e.z())));
      }
   }

   @Override
   public void a(abo $$0) {
      vh.a($$0, this, this.e.x());
      this.f.a($$0.a());
   }

   private void a(ud $$0) {
      this.L = $$0;
      this.M = $$0.a(this.e.cv());
      this.P.append($$1 -> {
         this.e.a($$0);
         this.b.ac().a(new zc(EnumSet.of(zc.a.b), List.of(this.e)));
         return CompletableFuture.completedFuture(null);
      });
   }

   @Override
   public akt p() {
      return this.e;
   }

   @FunctionalInterface
   interface a {
      bha run(akt var1, bis var2, bgz var3);
   }
}
