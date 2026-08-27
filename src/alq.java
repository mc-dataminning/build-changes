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

public class alq extends aln implements abd, alt, ta {
   static final Logger g = LogUtils.getLogger();
   public static final double d = arx.k(6.0);
   private static final int h = -1;
   private static final int i = 4096;
   private static final tl j = tl.c("multiplayer.disconnect.chat_validation_failed");
   public aks e;
   public final alm f;
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
   private biq u;
   private double v;
   private double w;
   private double x;
   private double y;
   private double z;
   private double A;
   @Nullable
   private ehn B;
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
   private ub L;
   private ue.b M;
   private final tt N = new tt(20);
   private final tx O = tx.a();
   private final arm P;
   private boolean Q;

   public alq(MinecraftServer $$0, sm $$1, aks $$2, alg $$3) {
      super($$0, $$1, $$3);
      this.f = new alm($$1.g());
      $$1.a(this);
      this.e = $$2;
      $$2.c = this;
      $$2.W().a();
      this.M = $$0.aw() ? ue.b.a : ue.b.unsigned($$2.cw());
      this.P = new arm($$0);
   }

   @Override
   public void e() {
      if (this.l > -1) {
         this.b(new xc(this.l));
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
      if (this.E && !this.e.fC() && !this.e.bO() && !this.e.ev()) {
         if (++this.F > 80) {
            g.warn("{} was kicked for floating too long!", this.e.ac().getString());
            this.b(tl.c("multiplayer.disconnect.flying"));
            return;
         }
      } else {
         this.E = false;
         this.F = 0;
      }

      this.u = this.e.cW();
      if (this.u != this.e && this.u.cO() == this.e) {
         this.v = this.u.dq();
         this.w = this.u.ds();
         this.x = this.u.dw();
         this.y = this.u.dq();
         this.z = this.u.ds();
         this.A = this.u.dw();
         if (this.G && this.e.cW().cO() == this.e) {
            if (++this.H > 80) {
               g.warn("{} was kicked for floating a vehicle too long!", this.e.ac().getString());
               this.b(tl.c("multiplayer.disconnect.flying"));
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
         this.b(tl.c("multiplayer.disconnect.idling"));
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
   public boolean a(vd<?> $$0) {
      return super.a($$0) ? true : this.Q && this.c.k() && $$0 instanceof abq;
   }

   @Override
   protected GameProfile j() {
      return this.e.fQ();
   }

   private <T, R> CompletableFuture<R> a(T $$0, BiFunction<alv, T, CompletableFuture<R>> $$1) {
      return $$1.apply(this.e.W(), $$0).thenApply($$0x -> {
         if (!this.c()) {
            g.debug("Ignoring packet due to disconnection");
            throw new CancellationException("disconnected");
         } else {
            return (R)$$0x;
         }
      });
   }

   private CompletableFuture<ali> a(String $$0) {
      return this.a($$0, alv::a);
   }

   private CompletableFuture<List<ali>> a(List<String> $$0) {
      return this.a($$0, alv::a);
   }

   @Override
   public void a(ach $$0) {
      vf.a($$0, this, this.e.x());
      this.e.a($$0.a(), $$0.d(), $$0.e(), $$0.f());
   }

   private static boolean b(double $$0, double $$1, double $$2, float $$3, float $$4) {
      return Double.isNaN($$0) || Double.isNaN($$1) || Double.isNaN($$2) || !Floats.isFinite($$4) || !Floats.isFinite($$3);
   }

   private static double a(double $$0) {
      return arx.a($$0, -3.0E7, 3.0E7);
   }

   private static double b(double $$0) {
      return arx.a($$0, -2.0E7, 2.0E7);
   }

   @Override
   public void a(aca $$0) {
      vf.a($$0, this, this.e.x());
      if (b($$0.a(), $$0.d(), $$0.e(), $$0.f(), $$0.g())) {
         this.b(tl.c("multiplayer.disconnect.invalid_vehicle_movement"));
      } else {
         biq $$1 = this.e.cW();
         if ($$1 != this.e && $$1.cO() == this.e && $$1 == this.u) {
            akr $$2 = this.e.x();
            double $$3 = $$1.dq();
            double $$4 = $$1.ds();
            double $$5 = $$1.dw();
            double $$6 = a($$0.a());
            double $$7 = b($$0.d());
            double $$8 = a($$0.e());
            float $$9 = arx.g($$0.f());
            float $$10 = arx.g($$0.g());
            double $$11 = $$6 - this.v;
            double $$12 = $$7 - this.w;
            double $$13 = $$8 - this.x;
            double $$14 = $$1.do().g();
            double $$15 = $$11 * $$11 + $$12 * $$12 + $$13 * $$13;
            if ($$15 - $$14 > 100.0 && !this.i()) {
               g.warn("{} (vehicle of {}) moved too quickly! {},{},{}", new Object[]{$$1.ac().getString(), this.e.ac().getString(), $$11, $$12, $$13});
               this.b(new yq($$1));
               return;
            }

            boolean $$16 = $$2.a($$1, $$1.cH().h(0.0625));
            $$11 = $$6 - this.y;
            $$12 = $$7 - this.z - 1.0E-6;
            $$13 = $$8 - this.A;
            boolean $$17 = $$1.R;
            if ($$1 instanceof bjg $$18 && $$18.c_()) {
               $$18.n();
            }

            $$1.a(bjm.b, new ehn($$11, $$12, $$13));
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
               g.warn("{} (vehicle of {}) moved wrongly! {}", new Object[]{$$1.ac().getString(), this.e.ac().getString(), Math.sqrt($$15)});
            }

            $$1.a($$6, $$7, $$8, $$9, $$10);
            boolean $$21 = $$2.a($$1, $$1.cH().h(0.0625));
            if ($$16 && ($$20 || !$$21)) {
               $$1.a($$3, $$4, $$5, $$9, $$10);
               this.b(new yq($$1));
               return;
            }

            this.e.x().k().a(this.e);
            this.e.r(this.e.dq() - $$3, this.e.ds() - $$4, this.e.dw() - $$5);
            this.G = $$12 >= -0.03125 && !$$17 && !this.b.Z() && !$$1.aU() && this.a($$1);
            this.y = $$1.dq();
            this.z = $$1.ds();
            this.A = $$1.dw();
         }
      }
   }

   private boolean a(biq $$0) {
      return $$0.dL().a($$0.cH().g(0.0625).b(0.0, -0.55, 0.0)).allMatch(dfi.a::i);
   }

   @Override
   public void a(abg $$0) {
      vf.a($$0, this, this.e.x());
      if ($$0.a() == this.C) {
         if (this.B == null) {
            this.b(tl.c("multiplayer.disconnect.invalid_player_movement"));
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
   public void a(acj $$0) {
      vf.a($$0, this, this.e.x());
      this.b.aE().a($$0.a()).ifPresent(this.e.G()::e);
   }

   @Override
   public void a(aci $$0) {
      vf.a($$0, this, this.e.x());
      this.e.G().a($$0.a(), $$0.d(), $$0.e());
   }

   @Override
   public void a(acl $$0) {
      vf.a($$0, this, this.e.x());
      if ($$0.d() == acl.a.a) {
         aex $$1 = Objects.requireNonNull($$0.e());
         af $$2 = this.b.az().a($$1);
         if ($$2 != null) {
            this.e.O().a($$2);
         }
      }
   }

   @Override
   public void a(abp $$0) {
      vf.a($$0, this, this.e.x());
      StringReader $$1 = new StringReader($$0.d());
      if ($$1.canRead() && $$1.peek() == '/') {
         $$1.skip();
      }

      ParseResults<dt> $$2 = this.b.aC().a().parse($$1, this.e.dd());
      this.b.aC().a().getCompletionSuggestions($$2).thenAccept($$1x -> this.b(new xo($$0.a(), $$1x)));
   }

   @Override
   public void a(acp $$0) {
      vf.a($$0, this, this.e.x());
      if (!this.b.o()) {
         this.e.a(tl.c("advMode.notEnabled"));
      } else if (!this.e.go()) {
         this.e.a(tl.c("advMode.notAllowed"));
      } else {
         cow $$1 = null;
         ddf $$2 = null;
         gw $$3 = $$0.a();
         dcv $$4 = this.e.dL().c_($$3);
         if ($$4 instanceof ddf) {
            $$2 = (ddf)$$4;
            $$1 = $$2.c();
         }

         String $$5 = $$0.d();
         boolean $$6 = $$0.e();
         if ($$1 != null) {
            ddf.a $$7 = $$2.v();
            dfj $$8 = this.e.dL().a_($$3);
            hc $$9 = $$8.c(cuc.a);

            dfj $$13 = (switch ($$0.h()) {
               case a -> csw.kH.n();
               case b -> csw.kG.n();
               default -> csw.fN.n();
            }).a(cuc.a, $$9).a(cuc.b, Boolean.valueOf($$0.f()));
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
            if (!asq.b($$5)) {
               this.e.a(tl.a("advMode.setCommand.success", $$5));
            }
         }
      }
   }

   @Override
   public void a(acq $$0) {
      vf.a($$0, this, this.e.x());
      if (!this.b.o()) {
         this.e.a(tl.c("advMode.notEnabled"));
      } else if (!this.e.go()) {
         this.e.a(tl.c("advMode.notAllowed"));
      } else {
         cow $$1 = $$0.a(this.e.dL());
         if ($$1 != null) {
            $$1.a($$0.a());
            $$1.a($$0.d());
            if (!$$0.d()) {
               $$1.c(null);
            }

            $$1.f();
            this.e.a(tl.a("advMode.setCommand.success", $$0.a()));
         }
      }
   }

   @Override
   public void a(acc $$0) {
      vf.a($$0, this, this.e.x());
      this.e.fR().c($$0.a());
      this.e.c.b(new xt(-2, 0, this.e.fR().l, this.e.fR().a(this.e.fR().l)));
      this.e.c.b(new xt(-2, 0, $$0.a(), this.e.fR().a($$0.a())));
      this.e.c.b(new zt(this.e.fR().l));
   }

   @Override
   public void a(ack $$0) {
      vf.a($$0, this, this.e.x());
      if (this.e.bS instanceof cen $$1) {
         if (!$$1.a(this.e)) {
            g.debug("Player {} interacted with invalid menu {}", this.e, $$1);
            return;
         }

         $$1.a($$0.a());
      }
   }

   @Override
   public void a(acn $$0) {
      vf.a($$0, this, this.e.x());
      if (this.e.bS instanceof ceo $$1) {
         if (!this.e.bS.a(this.e)) {
            g.debug("Player {} interacted with invalid menu {}", this.e, this.e.bS);
            return;
         }

         $$1.a($$0.a(), $$0.d());
      }
   }

   @Override
   public void a(act $$0) {
      vf.a($$0, this, this.e.x());
      if (this.e.go()) {
         gw $$1 = $$0.a();
         dfj $$2 = this.e.dL().a_($$1);
         if (this.e.dL().c_($$1) instanceof dei $$4) {
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
               if ($$0.d() == dei.a.b) {
                  if ($$4.D()) {
                     this.e.a(tl.a("structure_block.save_success", $$5), false);
                  } else {
                     this.e.a(tl.a("structure_block.save_failure", $$5), false);
                  }
               } else if ($$0.d() == dei.a.c) {
                  if (!$$4.F()) {
                     this.e.a(tl.a("structure_block.load_not_found", $$5), false);
                  } else if ($$4.a(this.e.x())) {
                     this.e.a(tl.a("structure_block.load_success", $$5), false);
                  } else {
                     this.e.a(tl.a("structure_block.load_prepare", $$5), false);
                  }
               } else if ($$0.d() == dei.a.d) {
                  if ($$4.C()) {
                     this.e.a(tl.a("structure_block.size_success", $$5), false);
                  } else {
                     this.e.a(tl.c("structure_block.size_failure"), false);
                  }
               }
            } else {
               this.e.a(tl.a("structure_block.invalid_structure_name", $$0.f()), false);
            }

            $$4.e();
            this.e.dL().a($$1, $$2, $$2, 3);
         }
      }
   }

   @Override
   public void a(acs $$0) {
      vf.a($$0, this, this.e.x());
      if (this.e.go()) {
         gw $$1 = $$0.a();
         dfj $$2 = this.e.dL().a_($$1);
         if (this.e.dL().c_($$1) instanceof ddu $$4) {
            $$4.a($$0.d());
            $$4.b($$0.e());
            $$4.a(aew.a(je.aC, $$0.f()));
            $$4.a($$0.g());
            $$4.a($$0.h());
            $$4.e();
            this.e.dL().a($$1, $$2, $$2, 3);
         }
      }
   }

   @Override
   public void a(abx $$0) {
      vf.a($$0, this, this.e.x());
      if (this.e.go()) {
         gw $$1 = $$0.a();
         if (this.e.dL().c_($$1) instanceof ddu $$3) {
            $$3.a(this.e.x(), $$0.d(), $$0.e());
         }
      }
   }

   @Override
   public void a(acm $$0) {
      vf.a($$0, this, this.e.x());
      int $$1 = $$0.a();
      if (this.e.bS instanceof cfs $$2) {
         if (!$$2.a(this.e)) {
            g.debug("Player {} interacted with invalid menu {}", this.e, $$2);
            return;
         }

         $$2.e($$1);
         $$2.h($$1);
      }
   }

   @Override
   public void a(abu $$0) {
      int $$1 = $$0.e();
      if (cbt.d($$1) || $$1 == 40) {
         List<String> $$2 = Lists.newArrayList();
         Optional<String> $$3 = $$0.d();
         $$3.ifPresent($$2::add);
         $$0.a().stream().limit(100L).forEach($$2::add);
         Consumer<List<ali>> $$4 = $$3.isPresent() ? $$1x -> this.a((ali)$$1x.get(0), $$1x.subList(1, $$1x.size()), $$1) : $$1x -> this.a($$1x, $$1);
         this.a($$2).thenAcceptAsync($$4, this.b);
      }
   }

   private void a(List<ali> $$0, int $$1) {
      cjf $$2 = this.e.fR().a($$1);
      if ($$2.a(cji.tg)) {
         this.a($$0, UnaryOperator.identity(), $$2);
      }
   }

   private void a(ali $$0, List<ali> $$1, int $$2) {
      cjf $$3 = this.e.fR().a($$2);
      if ($$3.a(cji.tg)) {
         cjf $$4 = new cjf(cji.th);
         qx $$5 = $$3.v();
         if ($$5 != null) {
            $$4.c($$5.h());
         }

         $$4.a("author", ro.a(this.e.ac().getString()));
         if (this.e.X()) {
            $$4.a("title", ro.a($$0.b()));
         } else {
            $$4.a("filtered_title", ro.a($$0.b()));
            $$4.a("title", ro.a($$0.d()));
         }

         this.a($$1, $$0x -> tl.a.a(tl.b($$0x)), $$4);
         this.e.fR().a($$2, $$4);
      }
   }

   private void a(List<ali> $$0, UnaryOperator<String> $$1, cjf $$2) {
      rd $$3 = new rd();
      if (this.e.X()) {
         $$0.stream().map($$1x -> ro.a($$1.apply($$1x.b()))).forEach($$3::add);
      } else {
         qx $$4 = new qx();
         int $$5 = 0;

         for (int $$6 = $$0.size(); $$5 < $$6; $$5++) {
            ali $$7 = $$0.get($$5);
            String $$8 = $$7.d();
            $$3.add(ro.a($$1.apply($$8)));
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
   public void a(abv $$0) {
      vf.a($$0, this, this.e.x());
      if (this.e.l(2)) {
         biq $$1 = this.e.dL().a($$0.d());
         if ($$1 != null) {
            qx $$2 = $$1.f(new qx());
            this.e.c.b(new aat($$0.a(), $$2));
         }
      }
   }

   @Override
   public void a(abh $$0) {
      vf.a($$0, this, this.e.x());
      if (this.e.l(2)) {
         dcv $$1 = this.e.dL().c_($$0.d());
         qx $$2 = $$1 != null ? $$1.o() : null;
         this.e.c.b(new aat($$0.a(), $$2));
      }
   }

   @Override
   public void a(abz $$0) {
      vf.a($$0, this, this.e.x());
      if (b($$0.a(0.0), $$0.b(0.0), $$0.c(0.0), $$0.a(0.0F), $$0.b(0.0F))) {
         this.b(tl.c("multiplayer.disconnect.invalid_player_movement"));
      } else {
         akr $$1 = this.e.x();
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
               float $$5 = arx.g($$0.a(this.e.dB()));
               float $$6 = arx.g($$0.b(this.e.dD()));
               if (this.e.bO()) {
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
                        g.debug("{} is sending move packets too frequently ({} packets since last tick)", this.e.ac().getString(), $$15);
                        $$15 = 1;
                     }

                     if (!this.e.M() && (!this.e.dL().X().b(cpr.s) || !this.e.fv())) {
                        float $$16 = this.e.fv() ? 300.0F : 100.0F;
                        if ($$14 - $$13 > (double)($$16 * (float)$$15) && !this.i()) {
                           g.warn("{} moved too quickly! {},{},{}", new Object[]{this.e.ac().getString(), $$10, $$11, $$12});
                           this.a(this.e.dq(), this.e.ds(), this.e.dw(), this.e.dB(), this.e.dD());
                           return;
                        }
                     }

                     ehi $$17 = this.e.cH();
                     $$10 = $$2 - this.r;
                     $$11 = $$3 - this.s;
                     $$12 = $$4 - this.t;
                     boolean $$18 = $$11 > 0.0;
                     if (this.e.aB() && !$$0.a() && $$18) {
                        this.e.fa();
                     }

                     boolean $$19 = this.e.R;
                     this.e.a(bjm.b, new ehn($$10, $$11, $$12));
                     $$10 = $$2 - this.e.dq();
                     $$11 = $$3 - this.e.ds();
                     if ($$11 > -0.5 || $$11 < 0.5) {
                        $$11 = 0.0;
                     }

                     $$12 = $$4 - this.e.dw();
                     $$14 = $$10 * $$10 + $$11 * $$11 + $$12 * $$12;
                     boolean $$21 = false;
                     if (!this.e.M() && $$14 > 0.0625 && !this.e.fC() && !this.e.e.e() && this.e.e.b() != cps.d) {
                        $$21 = true;
                        g.warn("{} moved wrongly!", this.e.ac().getString());
                     }

                     if (this.e.af || this.e.fC() || (!$$21 || !$$1.a(this.e, $$17)) && !this.a($$1, $$17, $$2, $$3, $$4)) {
                        this.e.a($$2, $$3, $$4, $$5, $$6);
                        this.E = $$11 >= -0.03125
                           && !$$19
                           && this.e.e.b() != cps.d
                           && !this.b.Z()
                           && !this.e.fS().c
                           && !this.e.a(bif.y)
                           && !this.e.fv()
                           && !this.e.fi()
                           && this.a((biq)this.e);
                        this.e.x().k().a(this.e);
                        this.e.a(this.e.dq() - $$7, this.e.ds() - $$8, this.e.dw() - $$9, $$0.a());
                        this.e.a($$0.a(), new ehn(this.e.dq() - $$7, this.e.ds() - $$8, this.e.dw() - $$9));
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

   private boolean a(cpy $$0, ehi $$1, double $$2, double $$3, double $$4) {
      ehi $$5 = this.e.cH().d($$2 - this.e.dq(), $$3 - this.e.ds(), $$4 - this.e.dw());
      Iterable<eig> $$6 = $$0.d(this.e, $$5.h(1.0E-5F));
      eig $$7 = eid.a($$1.h(1.0E-5F));

      for (eig $$8 : $$6) {
         if (!eid.c($$8, $$7, ehr.i)) {
            return true;
         }
      }

      return false;
   }

   public void a(double $$0, double $$1, double $$2, float $$3, float $$4) {
      this.a($$0, $$1, $$2, $$3, $$4, Collections.emptySet());
   }

   public void a(double $$0, double $$1, double $$2, float $$3, float $$4, Set<bju> $$5) {
      double $$6 = $$5.contains(bju.a) ? this.e.dq() : 0.0;
      double $$7 = $$5.contains(bju.b) ? this.e.ds() : 0.0;
      double $$8 = $$5.contains(bju.c) ? this.e.dw() : 0.0;
      float $$9 = $$5.contains(bju.d) ? this.e.dB() : 0.0F;
      float $$10 = $$5.contains(bju.e) ? this.e.dD() : 0.0F;
      this.B = new ehn($$0, $$1, $$2);
      if (++this.C == Integer.MAX_VALUE) {
         this.C = 0;
      }

      this.D = this.k;
      this.e.a($$0, $$1, $$2, $$3, $$4);
      this.e.c.b(new zd($$0 - $$6, $$1 - $$7, $$2 - $$8, $$3 - $$9, $$4 - $$10, $$5, this.C));
   }

   @Override
   public void a(acf $$0) {
      vf.a($$0, this, this.e.x());
      gw $$1 = $$0.a();
      this.e.E();
      acf.a $$2 = $$0.e();
      switch ($$2) {
         case g:
            if (!this.e.M_()) {
               cjf $$3 = this.e.b(bgx.b);
               this.e.a(bgx.b, this.e.b(bgx.a));
               this.e.a(bgx.a, $$3);
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

   private static boolean a(aks $$0, cjf $$1) {
      if ($$1.b()) {
         return false;
      } else {
         cja $$2 = $$1.d();
         return ($$2 instanceof cgy || $$2 instanceof chg) && !$$0.gm().a($$2);
      }
   }

   @Override
   public void a(acx $$0) {
      vf.a($$0, this, this.e.x());
      this.e.c.a($$0.e());
      akr $$1 = this.e.x();
      bgx $$2 = $$0.a();
      cjf $$3 = this.e.b($$2);
      if ($$3.a($$1.G())) {
         ehj $$4 = $$0.d();
         ehn $$5 = $$4.e();
         gw $$6 = $$4.a();
         ehn $$7 = ehn.b($$6);
         if (!(this.e.bq().g($$7) > d)) {
            ehn $$8 = $$5.d($$7);
            double $$9 = 1.0000001;
            if (Math.abs($$8.a()) < 1.0000001 && Math.abs($$8.b()) < 1.0000001 && Math.abs($$8.c()) < 1.0000001) {
               hc $$10 = $$4.b();
               this.e.E();
               int $$11 = this.e.dL().aj();
               if ($$6.v() < $$11) {
                  if (this.B == null && this.e.i((double)$$6.u() + 0.5, (double)$$6.v() + 0.5, (double)$$6.w() + 0.5) < 64.0 && $$1.a(this.e, $$6)) {
                     bgy $$12 = this.e.e.a(this.e, $$1, $$3, $$2, $$4);
                     if ($$10 == hc.b && !$$12.a() && $$6.v() >= $$11 - 1 && a(this.e, $$3)) {
                        tl $$13 = tl.a("build.tooHigh", $$11 - 1).a(n.m);
                        this.e.b($$13, true);
                     } else if ($$12.b()) {
                        this.e.a($$2, true);
                     }
                  }
               } else {
                  tl $$14 = tl.a("build.tooHigh", $$11 - 1).a(n.m);
                  this.e.b($$14, true);
               }

               this.e.c.b(new xg($$1, $$6));
               this.e.c.b(new xg($$1, $$6.a($$10)));
            } else {
               g.warn("Rejecting UseItemOnPacket from {}: Location {} too far away from hit block {}.", new Object[]{this.e.fQ().getName(), $$5, $$6});
            }
         }
      }
   }

   @Override
   public void a(acy $$0) {
      vf.a($$0, this, this.e.x());
      this.a($$0.d());
      akr $$1 = this.e.x();
      bgx $$2 = $$0.a();
      cjf $$3 = this.e.b($$2);
      this.e.E();
      if (!$$3.b() && $$3.a($$1.G())) {
         bgy $$4 = this.e.e.a(this.e, $$1, $$3, $$2);
         if ($$4.b()) {
            this.e.a($$2, true);
         }
      }
   }

   @Override
   public void a(acw $$0) {
      vf.a($$0, this, this.e.x());
      if (this.e.M_()) {
         for (akr $$1 : this.b.F()) {
            biq $$2 = $$0.a($$1);
            if ($$2 != null) {
               this.e.a($$1, $$2.dq(), $$2.ds(), $$2.dw(), $$2.dB(), $$2.dD());
               return;
            }
         }
      }
   }

   @Override
   public void a(acb $$0) {
      vf.a($$0, this, this.e.x());
      if (this.e.da() instanceof cdn $$2) {
         $$2.a($$0.a(), $$0.d());
      }
   }

   @Override
   public void a(tl $$0) {
      g.info("{} lost connection: {}", this.e.ac().getString(), $$0.getString());
      this.q();
      super.a($$0);
   }

   private void q() {
      this.P.close();
      this.b.ar();
      this.b.ac().a(tl.a("multiplayer.player.left", this.e.N_()).a(n.o), false);
      this.e.s();
      this.b.ac().c(this.e);
      this.e.W().b();
   }

   public void a(int $$0) {
      if ($$0 < 0) {
         throw new IllegalArgumentException("Expected packet sequence nr >= 0");
      } else {
         this.l = Math.max($$0, this.l);
      }
   }

   @Override
   public void a(aco $$0) {
      vf.a($$0, this, this.e.x());
      if ($$0.a() >= 0 && $$0.a() < cbt.g()) {
         if (this.e.fR().l != $$0.a() && this.e.fn() == bgx.a) {
            this.e.fs();
         }

         this.e.fR().l = $$0.a();
         this.e.E();
      } else {
         g.warn("{} tried to set an invalid carried item", this.e.ac().getString());
      }
   }

   @Override
   public void a(abl $$0) {
      if (c($$0.a())) {
         this.b(tl.c("multiplayer.disconnect.illegal_characters"));
      } else {
         Optional<tr> $$1 = this.a($$0.a(), $$0.d(), $$0.g());
         if ($$1.isPresent()) {
            this.b.g(() -> {
               ua $$2;
               try {
                  $$2 = this.a($$0, $$1.get());
               } catch (ue.a var6) {
                  this.a(var6);
                  return;
               }

               CompletableFuture<ali> $$5 = this.a($$2.b());
               tl $$6 = this.b.bd().decorate(this.e, $$2.c());
               this.P.append($$3 -> $$5.thenAcceptAsync($$2x -> {
                     ua $$3x = $$2.a($$6).a($$2x.e());
                     this.b($$3x);
                  }, $$3));
            });
         }
      }
   }

   @Override
   public void a(abk $$0) {
      if (c($$0.a())) {
         this.b(tl.c("multiplayer.disconnect.illegal_characters"));
      } else {
         Optional<tr> $$1 = this.a($$0.a(), $$0.d(), $$0.g());
         if ($$1.isPresent()) {
            this.b.g(() -> {
               this.a($$0, $$1.get());
               this.r();
            });
         }
      }
   }

   private void a(abk $$0, tr $$1) {
      ParseResults<dt> $$2 = this.b($$0.a());

      Map<String, ua> $$3;
      try {
         $$3 = this.a($$0, uc.a($$2), $$1);
      } catch (ue.a var6) {
         this.a(var6);
         return;
      }

      dr $$6 = new dr.a($$3);
      $$2 = du.a($$2, $$1x -> $$1x.a($$6, this.P));
      this.b.aC().a($$2, $$0.a());
   }

   private void a(ue.a $$0) {
      if ($$0.a()) {
         this.b($$0.b());
      } else {
         this.e.a($$0.b().e().a(n.m));
      }
   }

   private Map<String, ua> a(abk $$0, uc<?> $$1, tr $$2) throws ue.a {
      Map<String, ua> $$3 = new Object2ObjectOpenHashMap();

      for (uc.a<?> $$4 : $$1.a()) {
         tw $$5 = $$0.f().a($$4.a());
         ud $$6 = new ud($$4.c(), $$0.d(), $$0.e(), $$2);
         $$3.put($$4.a(), this.M.unpack($$5, $$6));
      }

      return $$3;
   }

   private ParseResults<dt> b(String $$0) {
      CommandDispatcher<dt> $$1 = this.b.aC().a();
      return $$1.parse($$0, this.e.dd());
   }

   private Optional<tr> a(String $$0, Instant $$1, tr.b $$2) {
      if (!this.a($$1)) {
         g.warn("{} sent out-of-order chat: '{}'", this.e.ac().getString(), $$0);
         this.b(tl.c("multiplayer.disconnect.out_of_order_chat"));
         return Optional.empty();
      } else {
         Optional<tr> $$3 = this.a($$2);
         if (this.e.B() == cbs.c) {
            this.b(new aar(tl.c("chat.disabled.options").a(n.m), false));
            return Optional.empty();
         } else {
            this.e.E();
            return $$3;
         }
      }
   }

   private Optional<tr> a(tr.b $$0) {
      synchronized (this.N) {
         Optional<tr> $$1 = this.N.a($$0);
         if ($$1.isEmpty()) {
            g.warn("Failed to validate message acknowledgements from {}", this.e.ac().getString());
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

   private ua a(abl $$0, tr $$1) throws ue.a {
      ud $$2 = new ud($$0.a(), $$0.d(), $$0.e(), $$1);
      return this.M.unpack($$0.f(), $$2);
   }

   private void b(ua $$0) {
      this.b.ac().a($$0, this.e, th.a(th.c, this.e));
      this.r();
   }

   private void r() {
      this.m += 20;
      if (this.m > 200 && !this.b.ac().f(this.e.fQ())) {
         this.b(tl.c("disconnect.spam"));
      }
   }

   @Override
   public void a(abj $$0) {
      synchronized (this.N) {
         if (!this.N.a($$0.a())) {
            g.warn("Failed to validate message acknowledgements from {}", this.e.ac().getString());
            this.b(j);
         }
      }
   }

   @Override
   public void a(acv $$0) {
      vf.a($$0, this, this.e.x());
      this.e.E();
      this.e.a($$0.a());
   }

   @Override
   public void a(acg $$0) {
      vf.a($$0, this, this.e.x());
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
            if (this.e.da() instanceof bjr $$1) {
               int $$2 = $$0.e();
               if ($$1.a() && $$2 > 0) {
                  $$1.c($$2);
               }
            }
            break;
         case g:
            if (this.e.da() instanceof bjr $$3) {
               $$3.b();
            }
            break;
         case h:
            if (this.e.cZ() instanceof biz $$4) {
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

   public void a(ua $$0) {
      tw $$1 = $$0.k();
      if ($$1 != null) {
         this.O.a($$0);
         int $$2;
         synchronized (this.N) {
            this.N.a($$1);
            $$2 = this.N.a();
         }

         if ($$2 > 4096) {
            this.b(tl.c("multiplayer.disconnect.too_many_pending_chats"));
         }
      }
   }

   public void a(ua $$0, th.a $$1) {
      this.b(new yw($$0.j().c(), $$0.j().b(), $$0.k(), $$0.l().a(this.O), $$0.m(), $$0.n(), $$1.a(this.e.dL().G_())));
      this.a($$0);
   }

   public void a(tl $$0, th.a $$1) {
      this.b(new xy($$0, $$1.a(this.e.dL().G_())));
   }

   public SocketAddress n() {
      return this.c.f();
   }

   public void o() {
      this.Q = true;
      this.q();
      this.b(new aap());
   }

   @Override
   public void a(aec $$0) {
      this.c.a(new ady($$0.a()));
   }

   @Override
   public void a(abw $$0) {
      vf.a($$0, this, this.e.x());
      final akr $$1 = this.e.x();
      final biq $$2 = $$0.a($$1);
      this.e.E();
      this.e.f($$0.a());
      if ($$2 != null) {
         if (!$$1.B_().a($$2.dl())) {
            return;
         }

         ehi $$3 = $$2.cH();
         if ($$3.e(this.e.bq()) < d) {
            $$0.a(new abw.c() {
               private void a(bgx $$0, alq.a $$1x) {
                  cjf $$2 = alq.this.e.b($$0);
                  if ($$2.a($$1.G())) {
                     cjf $$3 = $$2.p();
                     bgy $$4 = $$1.run(alq.this.e, $$2, $$0);
                     if ($$4.a()) {
                        al.Q.a(alq.this.e, $$3, $$2);
                        if ($$4.b()) {
                           alq.this.e.a($$0, true);
                        }
                     }
                  }
               }

               @Override
               public void a(bgx $$0) {
                  this.a($$0, cbu::a);
               }

               @Override
               public void a(bgx $$0, ehn $$1x) {
                  this.a($$0, ($$1xxx, $$2xx, $$3) -> $$2xx.a($$1xxx, $$1, $$3));
               }

               @Override
               public void a() {
                  if (!($$2 instanceof byn) && !($$2 instanceof biw) && !($$2 instanceof cca) && $$2 != alq.this.e) {
                     cjf $$0 = alq.this.e.b(bgx.a);
                     if ($$0.a($$1.G())) {
                        alq.this.e.d($$2);
                     }
                  } else {
                     alq.this.b(tl.c("multiplayer.disconnect.invalid_entity_attacked"));
                     alq.g.warn("Player {} tried to attack an invalid entity", alq.this.e.ac().getString());
                  }
               }
            });
         }
      }
   }

   @Override
   public void a(abo $$0) {
      vf.a($$0, this, this.e.x());
      this.e.E();
      abo.a $$1 = $$0.a();
      switch ($$1) {
         case a:
            if (this.e.f) {
               this.e.f = false;
               this.e = this.b.ac().a(this.e, true);
               al.v.a(this.e, cpv.j, cpv.h);
            } else {
               if (this.e.eu() > 0.0F) {
                  return;
               }

               this.e = this.b.ac().a(this.e, false);
               if (this.b.h()) {
                  this.e.a(cps.d);
                  this.e.dL().X().a(cpr.q).a(false, this.b);
               }
            }
            break;
         case b:
            this.e.F().a(this.e);
      }
   }

   @Override
   public void a(abt $$0) {
      vf.a($$0, this, this.e.x());
      this.e.r();
   }

   @Override
   public void a(abs $$0) {
      vf.a($$0, this, this.e.x());
      this.e.E();
      if (this.e.bS.j == $$0.a()) {
         if (this.e.M_()) {
            this.e.bS.b();
         } else if (!this.e.bS.a(this.e)) {
            g.debug("Player {} interacted with invalid menu {}", this.e, this.e.bS);
         } else {
            int $$1 = $$0.d();
            if (!this.e.bS.a($$1)) {
               g.debug("Player {} clicked invalid slot index: {}, available slots: {}", new Object[]{this.e.ac(), $$1, this.e.bS.i.size()});
            } else {
               boolean $$2 = $$0.i() != this.e.bS.j();
               this.e.bS.h();
               this.e.bS.a($$1, $$0.e(), $$0.h(), this.e);
               ObjectIterator var4 = Int2ObjectMaps.fastIterable($$0.g()).iterator();

               while (var4.hasNext()) {
                  Entry<cjf> $$3 = (Entry<cjf>)var4.next();
                  this.e.bS.b($$3.getIntKey(), (cjf)$$3.getValue());
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
   public void a(acd $$0) {
      vf.a($$0, this, this.e.x());
      this.e.E();
      if (!this.e.M_() && this.e.bS.j == $$0.a() && this.e.bS instanceof cfv) {
         if (!this.e.bS.a(this.e)) {
            g.debug("Player {} interacted with invalid menu {}", this.e, this.e.bS);
         } else {
            this.b.aE().a($$0.d()).ifPresent($$1 -> ((cfv)this.e.bS).a($$0.e(), (cmk<?>)$$1, this.e));
         }
      }
   }

   @Override
   public void a(abr $$0) {
      vf.a($$0, this, this.e.x());
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
   public void a(acr $$0) {
      vf.a($$0, this, this.e.x());
      if (this.e.e.e()) {
         boolean $$1 = $$0.a() < 0;
         cjf $$2 = $$0.d();
         if (!$$2.a(this.e.dL().G())) {
            return;
         }

         qx $$3 = cgy.a($$2);
         if (!$$2.b() && $$3 != null && $$3.e("x") && $$3.e("y") && $$3.e("z")) {
            gw $$4 = dcv.c($$3);
            if (this.e.dL().o($$4)) {
               dcv $$5 = this.e.dL().c_($$4);
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
   public void a(acu $$0) {
      List<String> $$1 = Stream.of($$0.e()).map(n::a).collect(Collectors.toList());
      this.a($$1).thenAcceptAsync($$1x -> this.a($$0, $$1x), this.b);
   }

   private void a(acu $$0, List<ali> $$1) {
      this.e.E();
      akr $$2 = this.e.x();
      gw $$3 = $$0.a();
      if ($$2.A($$3)) {
         if (!($$2.c_($$3) instanceof ded $$5)) {
            return;
         }

         $$5.a(this.e, $$0.d(), $$1);
      }
   }

   @Override
   public void a(ace $$0) {
      vf.a($$0, this, this.e.x());
      this.e.fS().b = $$0.a() && this.e.fS().c;
   }

   @Override
   public void a(vo $$0) {
      vf.a($$0, this, this.e.x());
      this.e.a($$0.a());
   }

   @Override
   public void a(abi $$0) {
      vf.a($$0, this, this.e.x());
      if (this.e.l(2) || this.i()) {
         this.b.a($$0.a(), false);
      }
   }

   @Override
   public void a(aby $$0) {
      vf.a($$0, this, this.e.x());
      if (this.e.l(2) || this.i()) {
         this.b.b($$0.a());
      }
   }

   @Override
   public void a(abm $$0) {
      vf.a($$0, this, this.e.x());
      ub.a $$1 = $$0.a();
      cbx.a $$2 = this.L != null ? this.L.d().b() : null;
      cbx.a $$3 = $$1.b();
      if (!Objects.equals($$2, $$3)) {
         if ($$2 != null && $$3.b().isBefore($$2.b())) {
            this.b(cbx.a);
         } else {
            try {
               ash $$4 = this.b.an();
               if ($$4 == null) {
                  g.warn("Ignoring chat session from {} due to missing Services public key", this.e.fQ().getName());
                  return;
               }

               this.a($$1.a(this.e.fQ(), $$4));
            } catch (cbx.b var6) {
               g.error("Failed to validate profile key: {}", var6.getMessage());
               this.b(var6.b());
            }
         }
      }
   }

   @Override
   public void a(abq $$0) {
      if (!this.Q) {
         throw new IllegalStateException("Client acknowledged config, but none was requested");
      } else {
         this.c.a(new alo(this.b, this.c, this.a(this.e.z())));
      }
   }

   @Override
   public void a(abn $$0) {
      vf.a($$0, this, this.e.x());
      this.f.a($$0.a());
   }

   private void a(ub $$0) {
      this.L = $$0;
      this.M = $$0.a(this.e.cw());
      this.P.append($$1 -> {
         this.e.a($$0);
         this.b.ac().a(new zb(EnumSet.of(zb.a.b), List.of(this.e)));
         return CompletableFuture.completedFuture(null);
      });
   }

   @Override
   public aks p() {
      return this.e;
   }

   @FunctionalInterface
   interface a {
      bgy run(aks var1, biq var2, bgx var3);
   }
}
