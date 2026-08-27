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

public class apz extends apw implements aev, aqc, vg {
   static final Logger g = LogUtils.getLogger();
   private static final int h = -1;
   private static final int i = 4096;
   private static final vs j = vs.c("multiplayer.disconnect.chat_validation_failed");
   public apb e;
   public final apv f;
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
   private bof u;
   private double v;
   private double w;
   private double x;
   private double y;
   private double z;
   private double A;
   @Nullable
   private eov B;
   private int C;
   private int D;
   private boolean E;
   private int F;
   private boolean G;
   private int H;
   private int I;
   private int J;
   @Nullable
   private wj K;
   private wm.b L;
   private final wb M = new wb(20);
   private final wf N = wf.a();
   private final awa O;
   private boolean P;

   public apz(MinecraftServer $$0, uq $$1, apb $$2, app $$3) {
      super($$0, $$1, $$3);
      this.f = new apv($$1.e());
      this.e = $$2;
      $$2.d = this;
      $$2.X().a();
      this.L = wm.b.unsigned($$2.ct(), $$0::aB);
      this.O = new awa($$0);
   }

   @Override
   public void e() {
      if (this.l > -1) {
         this.b(new aan(this.l));
         this.l = -1;
      }

      this.m();
      this.e.J = this.e.do();
      this.e.K = this.e.dq();
      this.e.L = this.e.du();
      this.e.m();
      this.e.a(this.o, this.p, this.q, this.e.dz(), this.e.dB());
      this.k++;
      this.J = this.I;
      if (this.E && !this.e.fF() && !this.e.bL() && !this.e.ev()) {
         if (++this.F > 80) {
            g.warn("{} was kicked for floating too long!", this.e.ad().getString());
            this.b(vs.c("multiplayer.disconnect.flying"));
            return;
         }
      } else {
         this.E = false;
         this.F = 0;
      }

      this.u = this.e.cT();
      if (this.u != this.e && this.u.cK() == this.e) {
         this.v = this.u.do();
         this.w = this.u.dq();
         this.x = this.u.du();
         this.y = this.u.do();
         this.z = this.u.dq();
         this.A = this.u.du();
         if (this.G && this.e.cT().cK() == this.e) {
            if (++this.H > 80) {
               g.warn("{} was kicked for floating a vehicle too long!", this.e.ad().getString());
               this.b(vs.c("multiplayer.disconnect.flying"));
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

      if (this.e.M() > 0L && this.c.aq() > 0 && ac.b() - this.e.M() > (long)this.c.aq() * 1000L * 60L) {
         this.b(vs.c("multiplayer.disconnect.idling"));
      }
   }

   public void m() {
      this.o = this.e.do();
      this.p = this.e.dq();
      this.q = this.e.du();
      this.r = this.e.do();
      this.s = this.e.dq();
      this.t = this.e.du();
   }

   @Override
   public boolean c() {
      return this.d.i() && !this.P;
   }

   @Override
   public boolean a(xz<?> $$0) {
      return super.a($$0) ? true : this.P && this.d.i() && $$0 instanceof afh;
   }

   @Override
   protected GameProfile j() {
      return this.e.fU();
   }

   private <T, R> CompletableFuture<R> a(T $$0, BiFunction<aqe, T, CompletableFuture<R>> $$1) {
      return $$1.apply(this.e.X(), $$0).thenApply($$0x -> {
         if (!this.c()) {
            g.debug("Ignoring packet due to disconnection");
            throw new CancellationException("disconnected");
         } else {
            return (R)$$0x;
         }
      });
   }

   private CompletableFuture<apr> a(String $$0) {
      return this.a($$0, aqe::a);
   }

   private CompletableFuture<List<apr>> a(List<String> $$0) {
      return this.a($$0, aqe::a);
   }

   @Override
   public void a(aga $$0) {
      yc.a($$0, this, this.e.z());
      this.e.a($$0.b(), $$0.e(), $$0.f(), $$0.g());
   }

   private static boolean b(double $$0, double $$1, double $$2, float $$3, float $$4) {
      return Double.isNaN($$0) || Double.isNaN($$1) || Double.isNaN($$2) || !Floats.isFinite($$4) || !Floats.isFinite($$3);
   }

   private static double a(double $$0) {
      return awm.a($$0, -3.0E7, 3.0E7);
   }

   private static double b(double $$0) {
      return awm.a($$0, -2.0E7, 2.0E7);
   }

   @Override
   public void a(aft $$0) {
      yc.a($$0, this, this.e.z());
      if (b($$0.b(), $$0.e(), $$0.f(), $$0.g(), $$0.h())) {
         this.b(vs.c("multiplayer.disconnect.invalid_vehicle_movement"));
      } else {
         bof $$1 = this.e.cT();
         if ($$1 != this.e && $$1.cK() == this.e && $$1 == this.u) {
            apa $$2 = this.e.z();
            double $$3 = $$1.do();
            double $$4 = $$1.dq();
            double $$5 = $$1.du();
            double $$6 = a($$0.b());
            double $$7 = b($$0.e());
            double $$8 = a($$0.f());
            float $$9 = awm.g($$0.g());
            float $$10 = awm.g($$0.h());
            double $$11 = $$6 - this.v;
            double $$12 = $$7 - this.w;
            double $$13 = $$8 - this.x;
            double $$14 = $$1.dm().g();
            double $$15 = $$11 * $$11 + $$12 * $$12 + $$13 * $$13;
            if ($$15 - $$14 > 100.0 && !this.i()) {
               g.warn("{} (vehicle of {}) moved too quickly! {},{},{}", new Object[]{$$1.ad().getString(), this.e.ad().getString(), $$11, $$12, $$13});
               this.b(new acd($$1));
               return;
            }

            boolean $$16 = $$2.a($$1, $$1.cE().h(0.0625));
            $$11 = $$6 - this.y;
            $$12 = $$7 - this.z - 1.0E-6;
            $$13 = $$8 - this.A;
            boolean $$17 = $$1.Q;
            if ($$1 instanceof box $$18 && $$18.e_()) {
               $$18.n();
            }

            $$1.a(bpc.b, new eov($$11, $$12, $$13));
            $$11 = $$6 - $$1.do();
            $$12 = $$7 - $$1.dq();
            if ($$12 > -0.5 || $$12 < 0.5) {
               $$12 = 0.0;
            }

            $$13 = $$8 - $$1.du();
            $$15 = $$11 * $$11 + $$12 * $$12 + $$13 * $$13;
            boolean $$20 = false;
            if ($$15 > 0.0625) {
               $$20 = true;
               g.warn("{} (vehicle of {}) moved wrongly! {}", new Object[]{$$1.ad().getString(), this.e.ad().getString(), Math.sqrt($$15)});
            }

            $$1.a($$6, $$7, $$8, $$9, $$10);
            boolean $$21 = $$2.a($$1, $$1.cE().h(0.0625));
            if ($$16 && ($$20 || !$$21)) {
               $$1.a($$3, $$4, $$5, $$9, $$10);
               this.b(new acd($$1));
               return;
            }

            this.e.z().l().a(this.e);
            this.e.b(this.e.do() - $$3, this.e.dq() - $$4, this.e.du() - $$5);
            this.G = $$12 >= -0.03125 && !$$17 && !this.c.ae() && !$$1.aV() && this.a($$1);
            this.y = $$1.do();
            this.z = $$1.dq();
            this.A = $$1.du();
         }
      }
   }

   private boolean a(bof $$0) {
      return $$0.dJ().a($$0.cE().g(0.0625).b(0.0, -0.55, 0.0)).allMatch(dmd.a::i);
   }

   @Override
   public void a(aex $$0) {
      yc.a($$0, this, this.e.z());
      if ($$0.b() == this.C) {
         if (this.B == null) {
            this.b(vs.c("multiplayer.disconnect.invalid_player_movement"));
            return;
         }

         this.e.a(this.B.c, this.B.d, this.B.e, this.e.dz(), this.e.dB());
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
   public void a(agc $$0) {
      yc.a($$0, this, this.e.z());
      this.c.aJ().a($$0.b()).ifPresent(this.e.I()::e);
   }

   @Override
   public void a(agb $$0) {
      yc.a($$0, this, this.e.z());
      this.e.I().a($$0.b(), $$0.e(), $$0.f());
   }

   @Override
   public void a(age $$0) {
      yc.a($$0, this, this.e.z());
      if ($$0.e() == age.a.a) {
         ajc $$1 = Objects.requireNonNull($$0.f());
         af $$2 = this.c.aE().a($$1);
         if ($$2 != null) {
            this.e.Q().a($$2);
         }
      }
   }

   @Override
   public void a(afg $$0) {
      yc.a($$0, this, this.e.z());
      StringReader $$1 = new StringReader($$0.e());
      if ($$1.canRead() && $$1.peek() == '/') {
         $$1.skip();
      }

      ParseResults<du> $$2 = this.c.aH().a().parse($$1, this.e.da());
      this.c.aH().a().getCompletionSuggestions($$2).thenAccept($$1x -> this.b(new aba($$0.b(), $$1x)));
   }

   @Override
   public void a(agi $$0) {
      yc.a($$0, this, this.e.z());
      if (!this.c.q()) {
         this.e.a(vs.c("advMode.notEnabled"));
      } else if (!this.e.gs()) {
         this.e.a(vs.c("advMode.notAllowed"));
      } else {
         cvf $$1 = null;
         djv $$2 = null;
         ib $$3 = $$0.b();
         djl $$4 = this.e.dJ().c_($$3);
         if ($$4 instanceof djv) {
            $$2 = (djv)$$4;
            $$1 = $$2.b();
         }

         String $$5 = $$0.e();
         boolean $$6 = $$0.f();
         if ($$1 != null) {
            djv.a $$7 = $$2.l();
            dme $$8 = this.e.dJ().a_($$3);
            ih $$9 = $$8.c(dao.b);

            dme $$13 = (switch ($$0.i()) {
               case a -> czh.kH.o();
               case b -> czh.kG.o();
               default -> czh.fN.o();
            }).a(dao.b, $$9).a(dao.c, Boolean.valueOf($$0.g()));
            if ($$13 != $$8) {
               this.e.dJ().a($$3, $$13, 2);
               $$4.b($$13);
               this.e.dJ().m($$3).a($$4);
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
            if (!axh.b($$5)) {
               this.e.a(vs.a("advMode.setCommand.success", $$5));
            }
         }
      }
   }

   @Override
   public void a(agj $$0) {
      yc.a($$0, this, this.e.z());
      if (!this.c.q()) {
         this.e.a(vs.c("advMode.notEnabled"));
      } else if (!this.e.gs()) {
         this.e.a(vs.c("advMode.notAllowed"));
      } else {
         cvf $$1 = $$0.a(this.e.dJ());
         if ($$1 != null) {
            $$1.a($$0.b());
            $$1.a($$0.e());
            if (!$$0.e()) {
               $$1.c(null);
            }

            $$1.f();
            this.e.a(vs.a("advMode.setCommand.success", $$0.b()));
         }
      }
   }

   @Override
   public void a(afv $$0) {
      yc.a($$0, this, this.e.z());
      this.e.fV().c($$0.b());
      this.e.d.b(new abf(-2, 0, this.e.fV().l, this.e.fV().a(this.e.fV().l)));
      this.e.d.b(new abf(-2, 0, $$0.b(), this.e.fV().a($$0.b())));
      this.e.d.b(new adh(this.e.fV().l));
   }

   @Override
   public void a(agd $$0) {
      yc.a($$0, this, this.e.z());
      if (this.e.bX instanceof ckw $$1) {
         if (!$$1.a(this.e)) {
            g.debug("Player {} interacted with invalid menu {}", this.e, $$1);
            return;
         }

         $$1.a($$0.b());
      }
   }

   @Override
   public void a(agg $$0) {
      yc.a($$0, this, this.e.z());
      if (this.e.bX instanceof ckx $$1) {
         if (!this.e.bX.a(this.e)) {
            g.debug("Player {} interacted with invalid menu {}", this.e, this.e.bX);
            return;
         }

         $$1.a($$0.b(), $$0.e());
      }
   }

   @Override
   public void a(agm $$0) {
      yc.a($$0, this, this.e.z());
      if (this.e.gs()) {
         ib $$1 = $$0.b();
         dme $$2 = this.e.dJ().a_($$1);
         if (this.e.dJ().c_($$1) instanceof dkz $$4) {
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
               if ($$0.e() == dkz.a.b) {
                  if ($$4.y()) {
                     this.e.a(vs.a("structure_block.save_success", $$5), false);
                  } else {
                     this.e.a(vs.a("structure_block.save_failure", $$5), false);
                  }
               } else if ($$0.e() == dkz.a.c) {
                  if (!$$4.A()) {
                     this.e.a(vs.a("structure_block.load_not_found", $$5), false);
                  } else if ($$4.a(this.e.z())) {
                     this.e.a(vs.a("structure_block.load_success", $$5), false);
                  } else {
                     this.e.a(vs.a("structure_block.load_prepare", $$5), false);
                  }
               } else if ($$0.e() == dkz.a.d) {
                  if ($$4.x()) {
                     this.e.a(vs.a("structure_block.size_success", $$5), false);
                  } else {
                     this.e.a(vs.c("structure_block.size_failure"), false);
                  }
               }
            } else {
               this.e.a(vs.a("structure_block.invalid_structure_name", $$0.g()), false);
            }

            $$4.e();
            this.e.dJ().a($$1, $$2, $$2, 3);
         }
      }
   }

   @Override
   public void a(agl $$0) {
      yc.a($$0, this, this.e.z());
      if (this.e.gs()) {
         ib $$1 = $$0.b();
         dme $$2 = this.e.dJ().a_($$1);
         if (this.e.dJ().c_($$1) instanceof dkl $$4) {
            $$4.a($$0.e());
            $$4.b($$0.f());
            $$4.a(ajb.a(ki.aH, $$0.g()));
            $$4.a($$0.h());
            $$4.a($$0.i());
            $$4.a($$0.k());
            $$4.b($$0.j());
            $$4.e();
            this.e.dJ().a($$1, $$2, $$2, 3);
         }
      }
   }

   @Override
   public void a(afq $$0) {
      yc.a($$0, this, this.e.z());
      if (this.e.gs()) {
         ib $$1 = $$0.b();
         if (this.e.dJ().c_($$1) instanceof dkl $$3) {
            $$3.a(this.e.z(), $$0.e(), $$0.f());
         }
      }
   }

   @Override
   public void a(agf $$0) {
      yc.a($$0, this, this.e.z());
      int $$1 = $$0.b();
      if (this.e.bX instanceof cmd $$2) {
         if (!$$2.a(this.e)) {
            g.debug("Player {} interacted with invalid menu {}", this.e, $$2);
            return;
         }

         $$2.e($$1);
         $$2.h($$1);
      }
   }

   @Override
   public void a(afn $$0) {
      int $$1 = $$0.b();
      if (chz.d($$1) || $$1 == 40) {
         List<String> $$2 = Lists.newArrayList();
         Optional<String> $$3 = $$0.f();
         $$3.ifPresent($$2::add);
         $$0.e().stream().limit(100L).forEach($$2::add);
         Consumer<List<apr>> $$4 = $$3.isPresent() ? $$1x -> this.a((apr)$$1x.get(0), $$1x.subList(1, $$1x.size()), $$1) : $$1x -> this.a($$1x, $$1);
         this.a($$2).thenAcceptAsync($$4, this.c);
      }
   }

   private void a(List<apr> $$0, int $$1) {
      cpq $$2 = this.e.fV().a($$1);
      if ($$2.a(cpt.tW)) {
         this.a($$0, UnaryOperator.identity(), $$2);
      }
   }

   private void a(apr $$0, List<apr> $$1, int $$2) {
      cpq $$3 = this.e.fV().a($$2);
      if ($$3.a(cpt.tW)) {
         cpq $$4 = $$3.a(cpt.tX, 1);
         $$4.a("author", tt.a(this.e.ad().getString()));
         if (this.e.Y()) {
            $$4.a("title", tt.a($$0.b()));
         } else {
            $$4.a("filtered_title", tt.a($$0.b()));
            $$4.a("title", tt.a($$0.d()));
         }

         this.a($$1, $$0x -> vs.a.a(vs.b($$0x)), $$4);
         this.e.fV().a($$2, $$4);
      }
   }

   private void a(List<apr> $$0, UnaryOperator<String> $$1, cpq $$2) {
      te $$3 = new te();
      if (this.e.Y()) {
         $$0.stream().map($$1x -> tt.a($$1.apply($$1x.b()))).forEach($$3::add);
      } else {
         sy $$4 = new sy();
         int $$5 = 0;

         for (int $$6 = $$0.size(); $$5 < $$6; $$5++) {
            apr $$7 = $$0.get($$5);
            String $$8 = $$7.d();
            $$3.add(tt.a($$1.apply($$8)));
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
   public void a(afo $$0) {
      yc.a($$0, this, this.e.z());
      if (this.e.m(2)) {
         bof $$1 = this.e.dJ().a($$0.e());
         if ($$1 != null) {
            sy $$2 = $$1.f(new sy());
            this.e.d.b(new aeh($$0.b(), $$2));
         }
      }
   }

   @Override
   public void a(afl $$0) {
      yc.a($$0, this, this.e.z());
      if (!this.e.P_() && $$0.e() == this.e.bX.j) {
         if (this.e.bX instanceof cli $$1 && $$1.m() instanceof djz $$2) {
            $$2.a($$0.b(), $$0.f());
         }
      }
   }

   @Override
   public void a(aey $$0) {
      yc.a($$0, this, this.e.z());
      if (this.e.m(2)) {
         djl $$1 = this.e.dJ().c_($$0.e());
         sy $$2 = $$1 != null ? $$1.d(this.e.dL()) : null;
         this.e.d.b(new aeh($$0.b(), $$2));
      }
   }

   @Override
   public void a(afs $$0) {
      yc.a($$0, this, this.e.z());
      if (b($$0.a(0.0), $$0.b(0.0), $$0.c(0.0), $$0.a(0.0F), $$0.b(0.0F))) {
         this.b(vs.c("multiplayer.disconnect.invalid_player_movement"));
      } else {
         apa $$1 = this.e.z();
         if (!this.e.g) {
            if (this.k == 0) {
               this.m();
            }

            if (this.B != null) {
               if (this.k - this.D > 20) {
                  this.D = this.k;
                  this.a(this.B.c, this.B.d, this.B.e, this.e.dz(), this.e.dB());
               }
            } else {
               this.D = this.k;
               double $$2 = a($$0.a(this.e.do()));
               double $$3 = b($$0.b(this.e.dq()));
               double $$4 = a($$0.c(this.e.du()));
               float $$5 = awm.g($$0.a(this.e.dz()));
               float $$6 = awm.g($$0.b(this.e.dB()));
               if (this.e.bL()) {
                  this.e.a(this.e.do(), this.e.dq(), this.e.du(), $$5, $$6);
                  this.e.z().l().a(this.e);
               } else {
                  double $$7 = this.e.do();
                  double $$8 = this.e.dq();
                  double $$9 = this.e.du();
                  double $$10 = $$2 - this.o;
                  double $$11 = $$3 - this.p;
                  double $$12 = $$4 - this.q;
                  double $$13 = this.e.dm().g();
                  double $$14 = $$10 * $$10 + $$11 * $$11 + $$12 * $$12;
                  if (this.e.fF()) {
                     if ($$14 > 1.0) {
                        this.a(this.e.do(), this.e.dq(), this.e.du(), $$5, $$6);
                     }
                  } else {
                     if ($$1.s().i()) {
                        this.I++;
                        int $$15 = this.I - this.J;
                        if ($$15 > 5) {
                           g.debug("{} is sending move packets too frequently ({} packets since last tick)", this.e.ad().getString(), $$15);
                           $$15 = 1;
                        }

                        if (!this.e.O() && (!this.e.dJ().Z().b(cwa.t) || !this.e.fy())) {
                           float $$16 = this.e.fy() ? 300.0F : 100.0F;
                           if ($$14 - $$13 > (double)($$16 * (float)$$15) && !this.i()) {
                              g.warn("{} moved too quickly! {},{},{}", new Object[]{this.e.ad().getString(), $$10, $$11, $$12});
                              this.a(this.e.do(), this.e.dq(), this.e.du(), this.e.dz(), this.e.dB());
                              return;
                           }
                        }
                     }

                     eoq $$17 = this.e.cE();
                     $$10 = $$2 - this.r;
                     $$11 = $$3 - this.s;
                     $$12 = $$4 - this.t;
                     boolean $$18 = $$11 > 0.0;
                     if (this.e.aC() && !$$0.b() && $$18) {
                        this.e.fd();
                     }

                     boolean $$19 = this.e.Q;
                     this.e.a(bpc.b, new eov($$10, $$11, $$12));
                     $$10 = $$2 - this.e.do();
                     $$11 = $$3 - this.e.dq();
                     if ($$11 > -0.5 || $$11 < 0.5) {
                        $$11 = 0.0;
                     }

                     $$12 = $$4 - this.e.du();
                     $$14 = $$10 * $$10 + $$11 * $$11 + $$12 * $$12;
                     boolean $$21 = false;
                     if (!this.e.O() && $$14 > 0.0625 && !this.e.fF() && !this.e.f.e() && this.e.f.b() != cwb.d) {
                        $$21 = true;
                        g.warn("{} moved wrongly!", this.e.ad().getString());
                     }

                     if (this.e.ae || this.e.fF() || (!$$21 || !$$1.a(this.e, $$17)) && !this.a($$1, $$17, $$2, $$3, $$4)) {
                        this.e.a($$2, $$3, $$4, $$5, $$6);
                        this.E = $$11 >= -0.03125
                           && !$$19
                           && this.e.f.b() != cwb.d
                           && !this.c.ae()
                           && !this.e.fW().c
                           && !this.e.a(bnu.y)
                           && !this.e.fy()
                           && !this.e.fl()
                           && this.a((bof)this.e);
                        this.e.z().l().a(this.e);
                        this.e.a(this.e.do() - $$7, this.e.dq() - $$8, this.e.du() - $$9, $$0.b());
                        this.e.a($$0.b(), new eov(this.e.do() - $$7, this.e.dq() - $$8, this.e.du() - $$9));
                        if ($$18) {
                           this.e.n();
                        }

                        this.e.b(this.e.do() - $$7, this.e.dq() - $$8, this.e.du() - $$9);
                        this.r = this.e.do();
                        this.s = this.e.dq();
                        this.t = this.e.du();
                     } else {
                        this.a($$7, $$8, $$9, $$5, $$6);
                        this.e.a(this.e.do() - $$7, this.e.dq() - $$8, this.e.du() - $$9, $$0.b());
                     }
                  }
               }
            }
         }
      }
   }

   private boolean a(cwh $$0, eoq $$1, double $$2, double $$3, double $$4) {
      eoq $$5 = this.e.cE().d($$2 - this.e.do(), $$3 - this.e.dq(), $$4 - this.e.du());
      Iterable<epo> $$6 = $$0.d(this.e, $$5.h(1.0E-5F));
      epo $$7 = epl.a($$1.h(1.0E-5F));

      for (epo $$8 : $$6) {
         if (!epl.c($$8, $$7, eoz.i)) {
            return true;
         }
      }

      return false;
   }

   public void a(double $$0, double $$1, double $$2, float $$3, float $$4) {
      this.a($$0, $$1, $$2, $$3, $$4, Collections.emptySet());
   }

   public void a(double $$0, double $$1, double $$2, float $$3, float $$4, Set<bpk> $$5) {
      double $$6 = $$5.contains(bpk.a) ? this.e.do() : 0.0;
      double $$7 = $$5.contains(bpk.b) ? this.e.dq() : 0.0;
      double $$8 = $$5.contains(bpk.c) ? this.e.du() : 0.0;
      float $$9 = $$5.contains(bpk.d) ? this.e.dz() : 0.0F;
      float $$10 = $$5.contains(bpk.e) ? this.e.dB() : 0.0F;
      this.B = new eov($$0, $$1, $$2);
      if (++this.C == Integer.MAX_VALUE) {
         this.C = 0;
      }

      this.D = this.k;
      this.e.a($$0, $$1, $$2, $$3, $$4);
      this.e.d.b(new acq($$0 - $$6, $$1 - $$7, $$2 - $$8, $$3 - $$9, $$4 - $$10, $$5, this.C));
   }

   @Override
   public void a(afy $$0) {
      yc.a($$0, this, this.e.z());
      ib $$1 = $$0.b();
      this.e.G();
      afy.a $$2 = $$0.f();
      switch ($$2) {
         case g:
            if (!this.e.P_()) {
               cpq $$3 = this.e.b(bmk.b);
               this.e.a(bmk.b, this.e.b(bmk.a));
               this.e.a(bmk.a, $$3);
               this.e.fv();
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
            this.e.fu();
            return;
         case a:
         case b:
         case c:
            this.e.f.a($$1, $$2, $$0.e(), this.e.dJ().ak(), $$0.g());
            this.e.d.a($$0.g());
            return;
         default:
            throw new IllegalArgumentException("Invalid player action");
      }
   }

   private static boolean a(apb $$0, cpq $$1) {
      if ($$1.b()) {
         return false;
      } else {
         cpl $$2 = $$1.d();
         return ($$2 instanceof cnl || $$2 instanceof cnt) && !$$0.gq().a($$2);
      }
   }

   @Override
   public void a(agq $$0) {
      yc.a($$0, this, this.e.z());
      this.e.d.a($$0.f());
      apa $$1 = this.e.z();
      bmk $$2 = $$0.b();
      cpq $$3 = this.e.b($$2);
      if ($$3.a($$1.I())) {
         eor $$4 = $$0.e();
         eov $$5 = $$4.e();
         ib $$6 = $$4.a();
         if (this.e.a($$6, 1.0)) {
            eov $$7 = $$5.d(eov.b($$6));
            double $$8 = 1.0000001;
            if (Math.abs($$7.a()) < 1.0000001 && Math.abs($$7.b()) < 1.0000001 && Math.abs($$7.c()) < 1.0000001) {
               ih $$9 = $$4.b();
               this.e.G();
               int $$10 = this.e.dJ().ak();
               if ($$6.v() < $$10) {
                  if (this.B == null && $$1.a(this.e, $$6)) {
                     bml $$11 = this.e.f.a(this.e, $$1, $$3, $$2, $$4);
                     if ($$11.a()) {
                        am.P.a(this.e, $$4.a(), $$3.q());
                     }

                     if ($$9 == ih.b && !$$11.a() && $$6.v() >= $$10 - 1 && a(this.e, $$3)) {
                        vs $$12 = vs.a("build.tooHigh", $$10 - 1).a(n.m);
                        this.e.b($$12, true);
                     } else if ($$11.b()) {
                        this.e.a($$2, true);
                     }
                  }
               } else {
                  vs $$13 = vs.a("build.tooHigh", $$10 - 1).a(n.m);
                  this.e.b($$13, true);
               }

               this.e.d.b(new aar($$1, $$6));
               this.e.d.b(new aar($$1, $$6.a($$9)));
            } else {
               g.warn("Rejecting UseItemOnPacket from {}: Location {} too far away from hit block {}.", new Object[]{this.e.fU().getName(), $$5, $$6});
            }
         }
      }
   }

   @Override
   public void a(agr $$0) {
      yc.a($$0, this, this.e.z());
      this.a($$0.e());
      apa $$1 = this.e.z();
      bmk $$2 = $$0.b();
      cpq $$3 = this.e.b($$2);
      this.e.G();
      if (!$$3.b() && $$3.a($$1.I())) {
         bml $$4 = this.e.f.a(this.e, $$1, $$3, $$2);
         if ($$4.b()) {
            this.e.a($$2, true);
         }
      }
   }

   @Override
   public void a(agp $$0) {
      yc.a($$0, this, this.e.z());
      if (this.e.P_()) {
         for (apa $$1 : this.c.K()) {
            bof $$2 = $$0.a($$1);
            if ($$2 != null) {
               this.e.a($$1, $$2.do(), $$2.dq(), $$2.du(), $$2.dz(), $$2.dB());
               return;
            }
         }
      }
   }

   @Override
   public void a(afu $$0) {
      yc.a($$0, this, this.e.z());
      if (this.e.cX() instanceof cjv $$2) {
         $$2.a($$0.b(), $$0.e());
      }
   }

   @Override
   public void a(vs $$0) {
      g.info("{} lost connection: {}", this.e.ad().getString(), $$0.getString());
      this.q();
      super.a($$0);
   }

   private void q() {
      this.O.close();
      this.c.aw();
      this.c.ah().a(vs.a("multiplayer.player.left", this.e.Q_()).a(n.o), false);
      this.e.u();
      this.c.ah().c(this.e);
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
   public void a(agh $$0) {
      yc.a($$0, this, this.e.z());
      if ($$0.b() >= 0 && $$0.b() < chz.g()) {
         if (this.e.fV().l != $$0.b() && this.e.fq() == bmk.a) {
            this.e.fv();
         }

         this.e.fV().l = $$0.b();
         this.e.G();
      } else {
         g.warn("{} tried to set an invalid carried item", this.e.ad().getString());
      }
   }

   @Override
   public void a(afc $$0) {
      if (c($$0.b())) {
         this.b(vs.c("multiplayer.disconnect.illegal_characters"));
      } else {
         Optional<vz> $$1 = this.a($$0.h());
         if ($$1.isPresent()) {
            this.c.g(() -> {
               wi $$2;
               try {
                  $$2 = this.a($$0, $$1.get());
               } catch (wm.a var6) {
                  this.a(var6);
                  return;
               }

               CompletableFuture<apr> $$5 = this.a($$2.c());
               vs $$6 = this.c.bm().decorate(this.e, $$2.d());
               this.O.append($$5, $$2x -> {
                  wi $$3 = $$2.a($$6).a($$2x.e());
                  this.b($$3);
               });
            });
         }
      }
   }

   @Override
   public void a(afb $$0) {
      if (c($$0.b())) {
         this.b(vs.c("multiplayer.disconnect.illegal_characters"));
      } else {
         Optional<vz> $$1 = this.a($$0.h());
         if ($$1.isPresent()) {
            this.c.g(() -> {
               this.a($$0, $$1.get());
               this.r();
            });
         }
      }
   }

   private void a(afb $$0, vz $$1) {
      ParseResults<du> $$2 = this.b($$0.b());

      Map<String, wi> $$3;
      try {
         $$3 = this.a($$0, wk.a($$2), $$1);
      } catch (wm.a var6) {
         this.a(var6);
         return;
      }

      ds $$6 = new ds.a($$3);
      $$2 = dv.a($$2, $$1x -> $$1x.a($$6, this.O));
      this.c.aH().a($$2, $$0.b());
   }

   private void a(wm.a $$0) {
      g.warn("Failed to update secure chat state for {}: '{}'", this.e.fU().getName(), $$0.b().getString());
      if ($$0.a()) {
         this.b($$0.b());
      } else {
         this.e.a($$0.b().f().a(n.m));
      }
   }

   private Map<String, wi> a(afb $$0, wk<?> $$1, vz $$2) throws wm.a {
      Map<String, wi> $$3 = new Object2ObjectOpenHashMap();

      for (wk.a<?> $$4 : $$1.a()) {
         we $$5 = $$0.g().a($$4.a());
         wl $$6 = new wl($$4.c(), $$0.e(), $$0.f(), $$2);
         $$3.put($$4.a(), this.L.unpack($$5, $$6));
      }

      return $$3;
   }

   private ParseResults<du> b(String $$0) {
      CommandDispatcher<du> $$1 = this.c.aH().a();
      return $$1.parse($$0, this.e.da());
   }

   private Optional<vz> a(vz.b $$0) {
      Optional<vz> $$1 = this.b($$0);
      if (this.e.D() == chy.c) {
         this.b(new aef(vs.c("chat.disabled.options").a(n.m), false));
         return Optional.empty();
      } else {
         this.e.G();
         return $$1;
      }
   }

   private Optional<vz> b(vz.b $$0) {
      synchronized (this.M) {
         Optional<vz> $$1 = this.M.a($$0);
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

   private wi a(afc $$0, vz $$1) throws wm.a {
      wl $$2 = new wl($$0.b(), $$0.e(), $$0.f(), $$1);
      return this.L.unpack($$0.g(), $$2);
   }

   private void b(wi $$0) {
      this.c.ah().a($$0, this.e, vo.a(vo.c, this.e));
      this.r();
   }

   private void r() {
      this.m += 20;
      if (this.m > 200 && !this.c.ah().f(this.e.fU())) {
         this.b(vs.c("disconnect.spam"));
      }
   }

   @Override
   public void a(afa $$0) {
      synchronized (this.M) {
         if (!this.M.a($$0.b())) {
            g.warn("Failed to validate message acknowledgements from {}", this.e.ad().getString());
            this.b(j);
         }
      }
   }

   @Override
   public void a(ago $$0) {
      yc.a($$0, this, this.e.z());
      this.e.G();
      this.e.a($$0.b());
   }

   @Override
   public void a(afz $$0) {
      yc.a($$0, this, this.e.z());
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
            if (this.e.fF()) {
               this.e.a(false, true);
               this.B = this.e.dh();
            }
            break;
         case f:
            if (this.e.cX() instanceof bph $$1) {
               int $$2 = $$0.f();
               if ($$1.a() && $$2 > 0) {
                  $$1.c($$2);
               }
            }
            break;
         case g:
            if (this.e.cX() instanceof bph $$3) {
               $$3.b();
            }
            break;
         case h:
            if (this.e.cW() instanceof boq $$4) {
               $$4.b(this.e);
            }
            break;
         case i:
            if (!this.e.ga()) {
               this.e.gc();
            }
            break;
         default:
            throw new IllegalArgumentException("Invalid client command!");
      }
   }

   public void a(wi $$0) {
      we $$1 = $$0.l();
      if ($$1 != null) {
         this.N.a($$0.m(), $$0.l());
         int $$2;
         synchronized (this.M) {
            this.M.a($$1);
            $$2 = this.M.a();
         }

         if ($$2 > 4096) {
            this.b(vs.c("multiplayer.disconnect.too_many_pending_chats"));
         }
      }
   }

   public void a(wi $$0, vo.a $$1) {
      this.b(new acj($$0.k().c(), $$0.k().b(), $$0.l(), $$0.m().a(this.N), $$0.n(), $$0.o(), $$1));
      this.a($$0);
   }

   public void a(vs $$0, vo.a $$1) {
      this.b(new abl($$0, $$1));
   }

   public SocketAddress n() {
      return this.d.d();
   }

   public void o() {
      this.P = true;
      this.q();
      this.b(aed.a);
      this.d.a(zy.b);
   }

   @Override
   public void a(ahy $$0) {
      this.d.a(new ahv($$0.b()));
   }

   @Override
   public void a(afp $$0) {
      yc.a($$0, this, this.e.z());
      final apa $$1 = this.e.z();
      final bof $$2 = $$0.a($$1);
      this.e.G();
      this.e.f($$0.b());
      if ($$2 != null) {
         if (!$$1.D_().a($$2.dj())) {
            return;
         }

         eoq $$3 = $$2.cE();
         if (this.e.a($$3, 1.0)) {
            $$0.a(new afp.c() {
               private void a(bmk $$0, apz.a $$1x) {
                  cpq $$2 = apz.this.e.b($$0);
                  if ($$2.a($$1.I())) {
                     cpq $$3 = $$2.q();
                     bml $$4 = $$1.run(apz.this.e, $$2, $$0);
                     if ($$4.a()) {
                        am.T.a(apz.this.e, $$3, $$2);
                        if ($$4.b()) {
                           apz.this.e.a($$0, true);
                        }
                     }
                  }
               }

               @Override
               public void a(bmk $$0) {
                  this.a($$0, cia::a);
               }

               @Override
               public void a(bmk $$0, eov $$1x) {
                  this.a($$0, ($$1xxx, $$2xx, $$3) -> $$2xx.a($$1xxx, $$1, $$3));
               }

               @Override
               public void a() {
                  if (!($$2 instanceof cel) && !($$2 instanceof bon) && !($$2 instanceof cig) && $$2 != apz.this.e) {
                     cpq $$0 = apz.this.e.b(bmk.a);
                     if ($$0.a($$1.I())) {
                        apz.this.e.d($$2);
                     }
                  } else {
                     apz.this.b(vs.c("multiplayer.disconnect.invalid_entity_attacked"));
                     apz.g.warn("Player {} tried to attack an invalid entity", apz.this.e.ad().getString());
                  }
               }
            });
         }
      }
   }

   @Override
   public void a(aff $$0) {
      yc.a($$0, this, this.e.z());
      this.e.G();
      aff.a $$1 = $$0.b();
      switch ($$1) {
         case a:
            if (this.e.g) {
               this.e.g = false;
               this.e = this.c.ah().a(this.e, true);
               am.w.a(this.e, cwe.j, cwe.h);
            } else {
               if (this.e.eu() > 0.0F) {
                  return;
               }

               this.e = this.c.ah().a(this.e, false);
               if (this.c.j()) {
                  this.e.a(cwb.d);
                  this.e.dJ().Z().a(cwa.r).a(false, this.c);
               }
            }
            break;
         case b:
            this.e.H().a(this.e);
      }
   }

   @Override
   public void a(afk $$0) {
      yc.a($$0, this, this.e.z());
      this.e.s();
   }

   @Override
   public void a(afj $$0) {
      yc.a($$0, this, this.e.z());
      this.e.G();
      if (this.e.bX.j == $$0.b()) {
         if (this.e.P_()) {
            this.e.bX.b();
         } else if (!this.e.bX.a(this.e)) {
            g.debug("Player {} interacted with invalid menu {}", this.e, this.e.bX);
         } else {
            int $$1 = $$0.e();
            if (!this.e.bX.a($$1)) {
               g.debug("Player {} clicked invalid slot index: {}, available slots: {}", new Object[]{this.e.ad(), $$1, this.e.bX.i.size()});
            } else {
               boolean $$2 = $$0.j() != this.e.bX.j();
               this.e.bX.h();
               this.e.bX.a($$1, $$0.f(), $$0.i(), this.e);
               ObjectIterator var4 = Int2ObjectMaps.fastIterable($$0.h()).iterator();

               while (var4.hasNext()) {
                  Entry<cpq> $$3 = (Entry<cpq>)var4.next();
                  this.e.bX.b($$3.getIntKey(), (cpq)$$3.getValue());
               }

               this.e.bX.a($$0.g());
               this.e.bX.i();
               if ($$2) {
                  this.e.bX.e();
               } else {
                  this.e.bX.d();
               }
            }
         }
      }
   }

   @Override
   public void a(afw $$0) {
      yc.a($$0, this, this.e.z());
      this.e.G();
      if (!this.e.P_() && this.e.bX.j == $$0.b() && this.e.bX instanceof cmh) {
         if (!this.e.bX.a(this.e)) {
            g.debug("Player {} interacted with invalid menu {}", this.e, this.e.bX);
         } else {
            this.c.aJ().a($$0.e()).ifPresent($$1 -> ((cmh)this.e.bX).a($$0.f(), (csu<?>)$$1, this.e));
         }
      }
   }

   @Override
   public void a(afi $$0) {
      yc.a($$0, this, this.e.z());
      this.e.G();
      if (this.e.bX.j == $$0.b() && !this.e.P_()) {
         if (!this.e.bX.a(this.e)) {
            g.debug("Player {} interacted with invalid menu {}", this.e, this.e.bX);
         } else {
            boolean $$1 = this.e.bX.b(this.e, $$0.e());
            if ($$1) {
               this.e.bX.d();
            }
         }
      }
   }

   @Override
   public void a(agk $$0) {
      yc.a($$0, this, this.e.z());
      if (this.e.f.e()) {
         boolean $$1 = $$0.b() < 0;
         cpq $$2 = $$0.e();
         if (!$$2.a(this.e.dJ().I())) {
            return;
         }

         sy $$3 = cnl.a($$2);
         if (!$$2.b() && $$3 != null && $$3.e("x") && $$3.e("y") && $$3.e("z")) {
            ib $$4 = djl.a($$3);
            if (this.e.dJ().p($$4)) {
               djl $$5 = this.e.dJ().c_($$4);
               if ($$5 != null) {
                  $$5.a($$2, this.e.dJ().I_());
               }
            }
         }

         boolean $$6 = $$0.b() >= 1 && $$0.b() <= 45;
         boolean $$7 = $$2.b() || $$2.l() >= 0 && $$2.M() <= 64 && !$$2.b();
         if ($$6 && $$7) {
            this.e.bW.b($$0.b()).e($$2);
            this.e.bW.d();
         } else if ($$1 && $$7 && this.n < 200) {
            this.n += 20;
            this.e.a($$2, true);
         }
      }
   }

   @Override
   public void a(agn $$0) {
      List<String> $$1 = Stream.of($$0.f()).map(n::a).collect(Collectors.toList());
      this.a($$1).thenAcceptAsync($$1x -> this.a($$0, $$1x), this.c);
   }

   private void a(agn $$0, List<apr> $$1) {
      this.e.G();
      apa $$2 = this.e.z();
      ib $$3 = $$0.b();
      if ($$2.B($$3)) {
         if (!($$2.c_($$3) instanceof dku $$5)) {
            return;
         }

         $$5.a(this.e, $$0.e(), $$1);
      }
   }

   @Override
   public void a(afx $$0) {
      yc.a($$0, this, this.e.z());
      this.e.fW().b = $$0.b() && this.e.fW().c;
   }

   @Override
   public void a(yr $$0) {
      yc.a($$0, this, this.e.z());
      this.e.a($$0.b());
   }

   @Override
   public void a(aez $$0) {
      yc.a($$0, this, this.e.z());
      if (this.e.m(2) || this.i()) {
         this.c.a($$0.b(), false);
      }
   }

   @Override
   public void a(afr $$0) {
      yc.a($$0, this, this.e.z());
      if (this.e.m(2) || this.i()) {
         this.c.b($$0.b());
      }
   }

   @Override
   public void a(afd $$0) {
      yc.a($$0, this, this.e.z());
      wj.a $$1 = $$0.b();
      cid.a $$2 = this.K != null ? this.K.d().b() : null;
      cid.a $$3 = $$1.b();
      if (!Objects.equals($$2, $$3)) {
         if ($$2 != null && $$3.b().isBefore($$2.b())) {
            this.b(cid.a);
         } else {
            try {
               awy $$4 = this.c.as();
               if ($$4 == null) {
                  g.warn("Ignoring chat session from {} due to missing Services public key", this.e.fU().getName());
                  return;
               }

               this.a($$1.a(this.e.fU(), $$4));
            } catch (cid.b var6) {
               g.error("Failed to validate profile key: {}", var6.getMessage());
               this.b(var6.b());
            }
         }
      }
   }

   @Override
   public void a(afh $$0) {
      if (!this.P) {
         throw new IllegalStateException("Client acknowledged config, but none was requested");
      } else {
         this.d.a(zy.a, new apx(this.c, this.d, this.a(this.e.B())));
      }
   }

   @Override
   public void a(afe $$0) {
      yc.a($$0, this, this.e.z());
      this.f.a($$0.b());
   }

   @Override
   public void a(afm $$0) {
      yc.a($$0, this, this.e.z());
      this.c.a(this.e, $$0.b());
   }

   private void a(wj $$0) {
      this.K = $$0;
      this.L = $$0.a(this.e.ct());
      this.O.append(() -> {
         this.e.a($$0);
         this.c.ah().a(new aco(EnumSet.of(aco.a.b), List.of(this.e)));
      });
   }

   @Override
   public apb p() {
      return this.e;
   }

   @FunctionalInterface
   interface a {
      bml run(apb var1, bof var2, bmk var3);
   }
}
