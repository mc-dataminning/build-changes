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

public class aqe extends aqb implements aez, aqh, vi {
   static final Logger g = LogUtils.getLogger();
   private static final int h = -1;
   private static final int i = 4096;
   private static final int j = 80;
   private static final vu k = vu.c("multiplayer.disconnect.chat_validation_failed");
   public apg e;
   public final aqa f;
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
   private bow v;
   private double w;
   private double x;
   private double y;
   private double z;
   private double A;
   private double B;
   @Nullable
   private epr C;
   private int D;
   private int E;
   private boolean F;
   private int G;
   private boolean H;
   private int I;
   private int J;
   private int K;
   @Nullable
   private wl L;
   private wo.b M;
   private final wd N = new wd(20);
   private final wh O = wh.a();
   private final awk P;
   private boolean Q;

   public aqe(MinecraftServer $$0, us $$1, apg $$2, apu $$3) {
      super($$0, $$1, $$3);
      this.f = new aqa($$1.e());
      this.e = $$2;
      $$2.d = this;
      $$2.X().a();
      this.M = wo.b.unsigned($$2.cw(), $$0::aB);
      this.P = new awk($$0);
   }

   @Override
   public void e() {
      if (this.m > -1) {
         this.b(new aar(this.m));
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
         if (++this.G > this.a((bow)this.e)) {
            g.warn("{} was kicked for floating too long!", this.e.ad().getString());
            this.b(vu.c("multiplayer.disconnect.flying"));
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
               this.b(vu.c("multiplayer.disconnect.flying"));
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
         this.b(vu.c("multiplayer.disconnect.idling"));
      }
   }

   private int a(bow $$0) {
      double $$1 = 0.08 / $$0.aX();
      return aww.c(80.0 * Math.max($$1, 1.0));
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
   public boolean a(yb<?> $$0) {
      return super.a($$0) ? true : this.Q && this.d.i() && $$0 instanceof afl;
   }

   @Override
   protected GameProfile j() {
      return this.e.fY();
   }

   private <T, R> CompletableFuture<R> a(T $$0, BiFunction<aqj, T, CompletableFuture<R>> $$1) {
      return $$1.apply(this.e.X(), $$0).thenApply($$0x -> {
         if (!this.c()) {
            g.debug("Ignoring packet due to disconnection");
            throw new CancellationException("disconnected");
         } else {
            return (R)$$0x;
         }
      });
   }

   private CompletableFuture<apw> a(String $$0) {
      return this.a($$0, aqj::a);
   }

   private CompletableFuture<List<apw>> a(List<String> $$0) {
      return this.a($$0, aqj::a);
   }

   @Override
   public void a(age $$0) {
      ye.a($$0, this, this.e.z());
      this.e.a($$0.b(), $$0.e(), $$0.f(), $$0.g());
   }

   private static boolean b(double $$0, double $$1, double $$2, float $$3, float $$4) {
      return Double.isNaN($$0) || Double.isNaN($$1) || Double.isNaN($$2) || !Floats.isFinite($$4) || !Floats.isFinite($$3);
   }

   private static double a(double $$0) {
      return aww.a($$0, -3.0E7, 3.0E7);
   }

   private static double b(double $$0) {
      return aww.a($$0, -2.0E7, 2.0E7);
   }

   @Override
   public void a(afx $$0) {
      ye.a($$0, this, this.e.z());
      if (b($$0.b(), $$0.e(), $$0.f(), $$0.g(), $$0.h())) {
         this.b(vu.c("multiplayer.disconnect.invalid_vehicle_movement"));
      } else {
         bow $$1 = this.e.cW();
         if ($$1 != this.e && $$1.cN() == this.e && $$1 == this.v) {
            apf $$2 = this.e.z();
            double $$3 = $$1.dr();
            double $$4 = $$1.dt();
            double $$5 = $$1.dx();
            double $$6 = a($$0.b());
            double $$7 = b($$0.e());
            double $$8 = a($$0.f());
            float $$9 = aww.g($$0.g());
            float $$10 = aww.g($$0.h());
            double $$11 = $$6 - this.w;
            double $$12 = $$7 - this.x;
            double $$13 = $$8 - this.y;
            double $$14 = $$1.dp().g();
            double $$15 = $$11 * $$11 + $$12 * $$12 + $$13 * $$13;
            if ($$15 - $$14 > 100.0 && !this.i()) {
               g.warn("{} (vehicle of {}) moved too quickly! {},{},{}", new Object[]{$$1.ad().getString(), this.e.ad().getString(), $$11, $$12, $$13});
               this.b(new ach($$1));
               return;
            }

            boolean $$16 = $$2.a($$1, $$1.cH().h(0.0625));
            $$11 = $$6 - this.z;
            $$12 = $$7 - this.A - 1.0E-6;
            $$13 = $$8 - this.B;
            boolean $$17 = $$1.R;
            if ($$1 instanceof bpo $$18 && $$18.p_()) {
               $$18.n();
            }

            $$1.a(bpt.b, new epr($$11, $$12, $$13));
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
               this.b(new ach($$1));
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

   private boolean b(bow $$0) {
      return $$0.dM().a($$0.cH().g(0.0625).b(0.0, -0.55, 0.0)).allMatch(dmy.a::i);
   }

   @Override
   public void a(afb $$0) {
      ye.a($$0, this, this.e.z());
      if ($$0.b() == this.D) {
         if (this.C == null) {
            this.b(vu.c("multiplayer.disconnect.invalid_player_movement"));
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
   public void a(agg $$0) {
      ye.a($$0, this, this.e.z());
      this.c.aJ().a($$0.b()).ifPresent(this.e.I()::e);
   }

   @Override
   public void a(agf $$0) {
      ye.a($$0, this, this.e.z());
      this.e.I().a($$0.b(), $$0.e(), $$0.f());
   }

   @Override
   public void a(agi $$0) {
      ye.a($$0, this, this.e.z());
      if ($$0.e() == agi.a.a) {
         ajh $$1 = Objects.requireNonNull($$0.f());
         af $$2 = this.c.aE().a($$1);
         if ($$2 != null) {
            this.e.Q().a($$2);
         }
      }
   }

   @Override
   public void a(afk $$0) {
      ye.a($$0, this, this.e.z());
      StringReader $$1 = new StringReader($$0.e());
      if ($$1.canRead() && $$1.peek() == '/') {
         $$1.skip();
      }

      ParseResults<du> $$2 = this.c.aH().a().parse($$1, this.e.dd());
      this.c.aH().a().getCompletionSuggestions($$2).thenAccept($$1x -> this.b(new abe($$0.b(), $$1x)));
   }

   @Override
   public void a(agm $$0) {
      ye.a($$0, this, this.e.z());
      if (!this.c.q()) {
         this.e.a(vu.c("advMode.notEnabled"));
      } else if (!this.e.gw()) {
         this.e.a(vu.c("advMode.notAllowed"));
      } else {
         cwa $$1 = null;
         dkq $$2 = null;
         ib $$3 = $$0.b();
         dkg $$4 = this.e.dM().c_($$3);
         if ($$4 instanceof dkq) {
            $$2 = (dkq)$$4;
            $$1 = $$2.b();
         }

         String $$5 = $$0.e();
         boolean $$6 = $$0.f();
         if ($$1 != null) {
            dkq.a $$7 = $$2.l();
            dmz $$8 = this.e.dM().a_($$3);
            ih $$9 = $$8.c(dbj.b);

            dmz $$13 = (switch ($$0.i()) {
               case a -> dac.kH.o();
               case b -> dac.kG.o();
               default -> dac.fN.o();
            }).a(dbj.b, $$9).a(dbj.c, Boolean.valueOf($$0.g()));
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
            if (!axr.b($$5)) {
               this.e.a(vu.a("advMode.setCommand.success", $$5));
            }
         }
      }
   }

   @Override
   public void a(agn $$0) {
      ye.a($$0, this, this.e.z());
      if (!this.c.q()) {
         this.e.a(vu.c("advMode.notEnabled"));
      } else if (!this.e.gw()) {
         this.e.a(vu.c("advMode.notAllowed"));
      } else {
         cwa $$1 = $$0.a(this.e.dM());
         if ($$1 != null) {
            $$1.a($$0.b());
            $$1.a($$0.e());
            if (!$$0.e()) {
               $$1.c(null);
            }

            $$1.f();
            this.e.a(vu.a("advMode.setCommand.success", $$0.b()));
         }
      }
   }

   @Override
   public void a(afz $$0) {
      ye.a($$0, this, this.e.z());
      this.e.fZ().c($$0.b());
      this.e.d.b(new abj(-2, 0, this.e.fZ().l, this.e.fZ().a(this.e.fZ().l)));
      this.e.d.b(new abj(-2, 0, $$0.b(), this.e.fZ().a($$0.b())));
      this.e.d.b(new adl(this.e.fZ().l));
   }

   @Override
   public void a(agh $$0) {
      ye.a($$0, this, this.e.z());
      if (this.e.bZ instanceof clq $$1) {
         if (!$$1.a(this.e)) {
            g.debug("Player {} interacted with invalid menu {}", this.e, $$1);
            return;
         }

         $$1.a($$0.b());
      }
   }

   @Override
   public void a(agk $$0) {
      ye.a($$0, this, this.e.z());
      if (this.e.bZ instanceof clr $$1) {
         if (!this.e.bZ.a(this.e)) {
            g.debug("Player {} interacted with invalid menu {}", this.e, this.e.bZ);
            return;
         }

         $$1.a($$0.b(), $$0.e());
      }
   }

   @Override
   public void a(agq $$0) {
      ye.a($$0, this, this.e.z());
      if (this.e.gw()) {
         ib $$1 = $$0.b();
         dmz $$2 = this.e.dM().a_($$1);
         if (this.e.dM().c_($$1) instanceof dlu $$4) {
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
               if ($$0.e() == dlu.a.b) {
                  if ($$4.y()) {
                     this.e.a(vu.a("structure_block.save_success", $$5), false);
                  } else {
                     this.e.a(vu.a("structure_block.save_failure", $$5), false);
                  }
               } else if ($$0.e() == dlu.a.c) {
                  if (!$$4.A()) {
                     this.e.a(vu.a("structure_block.load_not_found", $$5), false);
                  } else if ($$4.a(this.e.z())) {
                     this.e.a(vu.a("structure_block.load_success", $$5), false);
                  } else {
                     this.e.a(vu.a("structure_block.load_prepare", $$5), false);
                  }
               } else if ($$0.e() == dlu.a.d) {
                  if ($$4.x()) {
                     this.e.a(vu.a("structure_block.size_success", $$5), false);
                  } else {
                     this.e.a(vu.c("structure_block.size_failure"), false);
                  }
               }
            } else {
               this.e.a(vu.a("structure_block.invalid_structure_name", $$0.g()), false);
            }

            $$4.e();
            this.e.dM().a($$1, $$2, $$2, 3);
         }
      }
   }

   @Override
   public void a(agp $$0) {
      ye.a($$0, this, this.e.z());
      if (this.e.gw()) {
         ib $$1 = $$0.b();
         dmz $$2 = this.e.dM().a_($$1);
         if (this.e.dM().c_($$1) instanceof dlg $$4) {
            $$4.a($$0.e());
            $$4.b($$0.f());
            $$4.a(ajg.a(kj.aH, $$0.g()));
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
   public void a(afu $$0) {
      ye.a($$0, this, this.e.z());
      if (this.e.gw()) {
         ib $$1 = $$0.b();
         if (this.e.dM().c_($$1) instanceof dlg $$3) {
            $$3.a(this.e.z(), $$0.e(), $$0.f());
         }
      }
   }

   @Override
   public void a(agj $$0) {
      ye.a($$0, this, this.e.z());
      int $$1 = $$0.b();
      if (this.e.bZ instanceof cmx $$2) {
         if (!$$2.a(this.e)) {
            g.debug("Player {} interacted with invalid menu {}", this.e, $$2);
            return;
         }

         $$2.e($$1);
         $$2.h($$1);
      }
   }

   @Override
   public void a(afr $$0) {
      int $$1 = $$0.b();
      if (cir.d($$1) || $$1 == 40) {
         List<String> $$2 = Lists.newArrayList();
         Optional<String> $$3 = $$0.f();
         $$3.ifPresent($$2::add);
         $$0.e().stream().limit(100L).forEach($$2::add);
         Consumer<List<apw>> $$4 = $$3.isPresent() ? $$1x -> this.a((apw)$$1x.get(0), $$1x.subList(1, $$1x.size()), $$1) : $$1x -> this.a($$1x, $$1);
         this.a($$2).thenAcceptAsync($$4, this.c);
      }
   }

   private void a(List<apw> $$0, int $$1) {
      cqk $$2 = this.e.fZ().a($$1);
      if ($$2.a(cqn.tX)) {
         this.a($$0, UnaryOperator.identity(), $$2);
      }
   }

   private void a(apw $$0, List<apw> $$1, int $$2) {
      cqk $$3 = this.e.fZ().a($$2);
      if ($$3.a(cqn.tX)) {
         cqk $$4 = $$3.a(cqn.tY, 1);
         $$4.a("author", tv.a(this.e.ad().getString()));
         if (this.e.Y()) {
            $$4.a("title", tv.a($$0.b()));
         } else {
            $$4.a("filtered_title", tv.a($$0.b()));
            $$4.a("title", tv.a($$0.d()));
         }

         this.a($$1, $$0x -> vu.a.a(vu.b($$0x)), $$4);
         this.e.fZ().a($$2, $$4);
      }
   }

   private void a(List<apw> $$0, UnaryOperator<String> $$1, cqk $$2) {
      tg $$3 = new tg();
      if (this.e.Y()) {
         $$0.stream().map($$1x -> tv.a($$1.apply($$1x.b()))).forEach($$3::add);
      } else {
         ta $$4 = new ta();
         int $$5 = 0;

         for (int $$6 = $$0.size(); $$5 < $$6; $$5++) {
            apw $$7 = $$0.get($$5);
            String $$8 = $$7.d();
            $$3.add(tv.a($$1.apply($$8)));
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
   public void a(afs $$0) {
      ye.a($$0, this, this.e.z());
      if (this.e.m(2)) {
         bow $$1 = this.e.dM().a($$0.e());
         if ($$1 != null) {
            ta $$2 = $$1.f(new ta());
            this.e.d.b(new ael($$0.b(), $$2));
         }
      }
   }

   @Override
   public void a(afp $$0) {
      ye.a($$0, this, this.e.z());
      if (!this.e.N_() && $$0.e() == this.e.bZ.j) {
         if (this.e.bZ instanceof cmc $$1 && $$1.m() instanceof dku $$2) {
            $$2.a($$0.b(), $$0.f());
         }
      }
   }

   @Override
   public void a(afc $$0) {
      ye.a($$0, this, this.e.z());
      if (this.e.m(2)) {
         dkg $$1 = this.e.dM().c_($$0.e());
         ta $$2 = $$1 != null ? $$1.d(this.e.dO()) : null;
         this.e.d.b(new ael($$0.b(), $$2));
      }
   }

   @Override
   public void a(afw $$0) {
      ye.a($$0, this, this.e.z());
      if (b($$0.a(0.0), $$0.b(0.0), $$0.c(0.0), $$0.a(0.0F), $$0.b(0.0F))) {
         this.b(vu.c("multiplayer.disconnect.invalid_player_movement"));
      } else {
         apf $$1 = this.e.z();
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
               float $$5 = aww.g($$0.a(this.e.dC()));
               float $$6 = aww.g($$0.b(this.e.dE()));
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
                     if ($$1.s().i()) {
                        this.J++;
                        int $$15 = this.J - this.K;
                        if ($$15 > 5) {
                           g.debug("{} is sending move packets too frequently ({} packets since last tick)", this.e.ad().getString(), $$15);
                           $$15 = 1;
                        }

                        if (!this.e.O() && (!this.e.dM().Z().b(cwv.t) || !this.e.fB())) {
                           float $$16 = this.e.fB() ? 300.0F : 100.0F;
                           if ($$14 - $$13 > (double)($$16 * (float)$$15) && !this.i()) {
                              g.warn("{} moved too quickly! {},{},{}", new Object[]{this.e.ad().getString(), $$10, $$11, $$12});
                              this.a(this.e.dr(), this.e.dt(), this.e.dx(), this.e.dC(), this.e.dE());
                              return;
                           }
                        }
                     }

                     epm $$17 = this.e.cH();
                     $$10 = $$2 - this.s;
                     $$11 = $$3 - this.t;
                     $$12 = $$4 - this.u;
                     boolean $$18 = $$11 > 0.0;
                     if (this.e.aC() && !$$0.b() && $$18) {
                        this.e.fg();
                     }

                     boolean $$19 = this.e.R;
                     this.e.a(bpt.b, new epr($$10, $$11, $$12));
                     $$10 = $$2 - this.e.dr();
                     $$11 = $$3 - this.e.dt();
                     if ($$11 > -0.5 || $$11 < 0.5) {
                        $$11 = 0.0;
                     }

                     $$12 = $$4 - this.e.dx();
                     $$14 = $$10 * $$10 + $$11 * $$11 + $$12 * $$12;
                     boolean $$21 = false;
                     if (!this.e.O() && $$14 > 0.0625 && !this.e.fI() && !this.e.f.e() && this.e.f.b() != cww.d) {
                        $$21 = true;
                        g.warn("{} moved wrongly!", this.e.ad().getString());
                     }

                     if (this.e.af || this.e.fI() || (!$$21 || !$$1.a(this.e, $$17)) && !this.a($$1, $$17, $$2, $$3, $$4)) {
                        this.e.a($$2, $$3, $$4, $$5, $$6);
                        this.F = $$11 >= -0.03125
                           && !$$19
                           && this.e.f.b() != cww.d
                           && !this.c.ae()
                           && !this.e.ga().c
                           && !this.e.a(bol.y)
                           && !this.e.fB()
                           && !this.e.fo()
                           && this.b(this.e);
                        this.e.z().l().a(this.e);
                        this.e.a(this.e.dr() - $$7, this.e.dt() - $$8, this.e.dx() - $$9, $$0.b());
                        this.e.a($$0.b(), new epr(this.e.dr() - $$7, this.e.dt() - $$8, this.e.dx() - $$9));
                        if ($$18) {
                           this.e.n();
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

   private boolean a(cxc $$0, epm $$1, double $$2, double $$3, double $$4) {
      epm $$5 = this.e.cH().d($$2 - this.e.dr(), $$3 - this.e.dt(), $$4 - this.e.dx());
      Iterable<eqk> $$6 = $$0.d(this.e, $$5.h(1.0E-5F));
      eqk $$7 = eqh.a($$1.h(1.0E-5F));

      for (eqk $$8 : $$6) {
         if (!eqh.c($$8, $$7, epv.i)) {
            return true;
         }
      }

      return false;
   }

   public void a(double $$0, double $$1, double $$2, float $$3, float $$4) {
      this.a($$0, $$1, $$2, $$3, $$4, Collections.emptySet());
   }

   public void a(double $$0, double $$1, double $$2, float $$3, float $$4, Set<bqb> $$5) {
      double $$6 = $$5.contains(bqb.a) ? this.e.dr() : 0.0;
      double $$7 = $$5.contains(bqb.b) ? this.e.dt() : 0.0;
      double $$8 = $$5.contains(bqb.c) ? this.e.dx() : 0.0;
      float $$9 = $$5.contains(bqb.d) ? this.e.dC() : 0.0F;
      float $$10 = $$5.contains(bqb.e) ? this.e.dE() : 0.0F;
      this.C = new epr($$0, $$1, $$2);
      if (++this.D == Integer.MAX_VALUE) {
         this.D = 0;
      }

      this.E = this.l;
      this.e.ct = null;
      this.e.a($$0, $$1, $$2, $$3, $$4);
      this.e.d.b(new acu($$0 - $$6, $$1 - $$7, $$2 - $$8, $$3 - $$9, $$4 - $$10, $$5, this.D));
   }

   @Override
   public void a(agc $$0) {
      ye.a($$0, this, this.e.z());
      ib $$1 = $$0.b();
      this.e.G();
      agc.a $$2 = $$0.f();
      switch ($$2) {
         case g:
            if (!this.e.N_()) {
               cqk $$3 = this.e.b(bnb.b);
               this.e.a(bnb.b, this.e.b(bnb.a));
               this.e.a(bnb.a, $$3);
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
            this.e.f.a($$1, $$2, $$0.e(), this.e.dM().ak(), $$0.g());
            this.e.d.a($$0.g());
            return;
         default:
            throw new IllegalArgumentException("Invalid player action");
      }
   }

   private static boolean a(apg $$0, cqk $$1) {
      if ($$1.b()) {
         return false;
      } else {
         cqf $$2 = $$1.d();
         return ($$2 instanceof cof || $$2 instanceof coo) && !$$0.gu().a($$2);
      }
   }

   @Override
   public void a(agu $$0) {
      ye.a($$0, this, this.e.z());
      this.e.d.a($$0.f());
      apf $$1 = this.e.z();
      bnb $$2 = $$0.b();
      cqk $$3 = this.e.b($$2);
      if ($$3.a($$1.I())) {
         epn $$4 = $$0.e();
         epr $$5 = $$4.e();
         ib $$6 = $$4.a();
         if (this.e.a($$6, 1.0)) {
            epr $$7 = $$5.d(epr.b($$6));
            double $$8 = 1.0000001;
            if (Math.abs($$7.a()) < 1.0000001 && Math.abs($$7.b()) < 1.0000001 && Math.abs($$7.c()) < 1.0000001) {
               ih $$9 = $$4.b();
               this.e.G();
               int $$10 = this.e.dM().ak();
               if ($$6.v() < $$10) {
                  if (this.C == null && $$1.a(this.e, $$6)) {
                     bnc $$11 = this.e.f.a(this.e, $$1, $$3, $$2, $$4);
                     if ($$11.a()) {
                        am.P.a(this.e, $$4.a(), $$3.q());
                     }

                     if ($$9 == ih.b && !$$11.a() && $$6.v() >= $$10 - 1 && a(this.e, $$3)) {
                        vu $$12 = vu.a("build.tooHigh", $$10 - 1).a(n.m);
                        this.e.b($$12, true);
                     } else if ($$11.b()) {
                        this.e.a($$2, true);
                     }
                  }
               } else {
                  vu $$13 = vu.a("build.tooHigh", $$10 - 1).a(n.m);
                  this.e.b($$13, true);
               }

               this.e.d.b(new aav($$1, $$6));
               this.e.d.b(new aav($$1, $$6.a($$9)));
            } else {
               g.warn("Rejecting UseItemOnPacket from {}: Location {} too far away from hit block {}.", new Object[]{this.e.fY().getName(), $$5, $$6});
            }
         }
      }
   }

   @Override
   public void a(agv $$0) {
      ye.a($$0, this, this.e.z());
      this.a($$0.e());
      apf $$1 = this.e.z();
      bnb $$2 = $$0.b();
      cqk $$3 = this.e.b($$2);
      this.e.G();
      if (!$$3.b() && $$3.a($$1.I())) {
         bnc $$4 = this.e.f.a(this.e, $$1, $$3, $$2);
         if ($$4.b()) {
            this.e.a($$2, true);
         }
      }
   }

   @Override
   public void a(agt $$0) {
      ye.a($$0, this, this.e.z());
      if (this.e.N_()) {
         for (apf $$1 : this.c.K()) {
            bow $$2 = $$0.a($$1);
            if ($$2 != null) {
               this.e.a($$1, $$2.dr(), $$2.dt(), $$2.dx(), $$2.dC(), $$2.dE());
               return;
            }
         }
      }
   }

   @Override
   public void a(afy $$0) {
      ye.a($$0, this, this.e.z());
      if (this.e.da() instanceof ckp $$2) {
         $$2.a($$0.b(), $$0.e());
      }
   }

   @Override
   public void a(vu $$0) {
      g.info("{} lost connection: {}", this.e.ad().getString(), $$0.getString());
      this.q();
      super.a($$0);
   }

   private void q() {
      this.P.close();
      this.c.aw();
      this.c.ah().a(vu.a("multiplayer.player.left", this.e.O_()).a(n.o), false);
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
   public void a(agl $$0) {
      ye.a($$0, this, this.e.z());
      if ($$0.b() >= 0 && $$0.b() < cir.g()) {
         if (this.e.fZ().l != $$0.b() && this.e.ft() == bnb.a) {
            this.e.fy();
         }

         this.e.fZ().l = $$0.b();
         this.e.G();
      } else {
         g.warn("{} tried to set an invalid carried item", this.e.ad().getString());
      }
   }

   @Override
   public void a(afg $$0) {
      if (c($$0.b())) {
         this.b(vu.c("multiplayer.disconnect.illegal_characters"));
      } else {
         Optional<wb> $$1 = this.a($$0.h());
         if ($$1.isPresent()) {
            this.c.execute(() -> {
               wk $$2;
               try {
                  $$2 = this.a($$0, $$1.get());
               } catch (wo.a var6) {
                  this.a(var6);
                  return;
               }

               CompletableFuture<apw> $$5 = this.a($$2.c());
               vu $$6 = this.c.bm().decorate(this.e, $$2.d());
               this.P.append($$5, $$2x -> {
                  wk $$3 = $$2.a($$6).a($$2x.e());
                  this.b($$3);
               });
            });
         }
      }
   }

   @Override
   public void a(aff $$0) {
      if (c($$0.b())) {
         this.b(vu.c("multiplayer.disconnect.illegal_characters"));
      } else {
         Optional<wb> $$1 = this.a($$0.h());
         if ($$1.isPresent()) {
            this.c.execute(() -> {
               this.a($$0, $$1.get());
               this.r();
            });
         }
      }
   }

   private void a(aff $$0, wb $$1) {
      ParseResults<du> $$2 = this.b($$0.b());

      Map<String, wk> $$3;
      try {
         $$3 = this.a($$0, wm.a($$2), $$1);
      } catch (wo.a var6) {
         this.a(var6);
         return;
      }

      ds $$6 = new ds.a($$3);
      $$2 = dv.a($$2, $$1x -> $$1x.a($$6, this.P));
      this.c.aH().a($$2, $$0.b());
   }

   private void a(wo.a $$0) {
      g.warn("Failed to update secure chat state for {}: '{}'", this.e.fY().getName(), $$0.b().getString());
      if ($$0.a()) {
         this.b($$0.b());
      } else {
         this.e.a($$0.b().f().a(n.m));
      }
   }

   private Map<String, wk> a(aff $$0, wm<?> $$1, wb $$2) throws wo.a {
      Map<String, wk> $$3 = new Object2ObjectOpenHashMap();

      for (wm.a<?> $$4 : $$1.a()) {
         wg $$5 = $$0.g().a($$4.a());
         wn $$6 = new wn($$4.c(), $$0.e(), $$0.f(), $$2);
         $$3.put($$4.a(), this.M.unpack($$5, $$6));
      }

      return $$3;
   }

   private ParseResults<du> b(String $$0) {
      CommandDispatcher<du> $$1 = this.c.aH().a();
      return $$1.parse($$0, this.e.dd());
   }

   private Optional<wb> a(wb.b $$0) {
      Optional<wb> $$1 = this.b($$0);
      if (this.e.D() == ciq.c) {
         this.b(new aej(vu.c("chat.disabled.options").a(n.m), false));
         return Optional.empty();
      } else {
         this.e.G();
         return $$1;
      }
   }

   private Optional<wb> b(wb.b $$0) {
      synchronized (this.N) {
         Optional<wb> $$1 = this.N.a($$0);
         if ($$1.isEmpty()) {
            g.warn("Failed to validate message acknowledgements from {}", this.e.ad().getString());
            this.b(k);
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

   private wk a(afg $$0, wb $$1) throws wo.a {
      wn $$2 = new wn($$0.b(), $$0.e(), $$0.f(), $$1);
      return this.M.unpack($$0.g(), $$2);
   }

   private void b(wk $$0) {
      this.c.ah().a($$0, this.e, vq.a(vq.c, this.e));
      this.r();
   }

   private void r() {
      this.n += 20;
      if (this.n > 200 && !this.c.ah().f(this.e.fY())) {
         this.b(vu.c("disconnect.spam"));
      }
   }

   @Override
   public void a(afe $$0) {
      synchronized (this.N) {
         if (!this.N.a($$0.b())) {
            g.warn("Failed to validate message acknowledgements from {}", this.e.ad().getString());
            this.b(k);
         }
      }
   }

   @Override
   public void a(ags $$0) {
      ye.a($$0, this, this.e.z());
      this.e.G();
      this.e.a($$0.b());
   }

   @Override
   public void a(agd $$0) {
      ye.a($$0, this, this.e.z());
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
            if (this.e.da() instanceof bpy $$1) {
               int $$2 = $$0.f();
               if ($$1.a() && $$2 > 0) {
                  $$1.c($$2);
               }
            }
            break;
         case g:
            if (this.e.da() instanceof bpy $$3) {
               $$3.b();
            }
            break;
         case h:
            if (this.e.cZ() instanceof bph $$4) {
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

   public void a(wk $$0) {
      wg $$1 = $$0.l();
      if ($$1 != null) {
         this.O.a($$0.m(), $$0.l());
         int $$2;
         synchronized (this.N) {
            this.N.a($$1);
            $$2 = this.N.a();
         }

         if ($$2 > 4096) {
            this.b(vu.c("multiplayer.disconnect.too_many_pending_chats"));
         }
      }
   }

   public void a(wk $$0, vq.a $$1) {
      this.b(new acn($$0.k().c(), $$0.k().b(), $$0.l(), $$0.m().a(this.O), $$0.n(), $$0.o(), $$1));
      this.a($$0);
   }

   public void a(vu $$0, vq.a $$1) {
      this.b(new abp($$0, $$1));
   }

   public SocketAddress n() {
      return this.d.d();
   }

   public void o() {
      this.Q = true;
      this.q();
      this.b(aeh.a);
      this.d.a(aab.b);
   }

   @Override
   public void a(aic $$0) {
      this.d.a(new ahz($$0.b()));
   }

   @Override
   public void a(aft $$0) {
      ye.a($$0, this, this.e.z());
      final apf $$1 = this.e.z();
      final bow $$2 = $$0.a($$1);
      this.e.G();
      this.e.f($$0.b());
      if ($$2 != null) {
         if (!$$1.C_().a($$2.dm())) {
            return;
         }

         epm $$3 = $$2.cH();
         if (this.e.a($$3, 1.0)) {
            $$0.a(new aft.c() {
               private void a(bnb $$0, aqe.a $$1x) {
                  cqk $$2 = aqe.this.e.b($$0);
                  if ($$2.a($$1.I())) {
                     cqk $$3 = $$2.q();
                     bnc $$4 = $$1.run(aqe.this.e, $$2, $$0);
                     if ($$4.a()) {
                        am.T.a(aqe.this.e, $$3, $$2);
                        if ($$4.b()) {
                           aqe.this.e.a($$0, true);
                        }
                     }
                  }
               }

               @Override
               public void a(bnb $$0) {
                  this.a($$0, cis::a);
               }

               @Override
               public void a(bnb $$0, epr $$1x) {
                  this.a($$0, ($$1xxx, $$2xx, $$3) -> $$2xx.a($$1xxx, $$1, $$3));
               }

               @Override
               public void a() {
                  if (!($$2 instanceof cfd) && !($$2 instanceof bpe) && !($$2 instanceof ciy) && $$2 != aqe.this.e) {
                     cqk $$0 = aqe.this.e.b(bnb.a);
                     if ($$0.a($$1.I())) {
                        aqe.this.e.e($$2);
                     }
                  } else {
                     aqe.this.b(vu.c("multiplayer.disconnect.invalid_entity_attacked"));
                     aqe.g.warn("Player {} tried to attack an invalid entity", aqe.this.e.ad().getString());
                  }
               }
            });
         }
      }
   }

   @Override
   public void a(afj $$0) {
      ye.a($$0, this, this.e.z());
      this.e.G();
      afj.a $$1 = $$0.b();
      switch ($$1) {
         case a:
            if (this.e.g) {
               this.e.g = false;
               this.e = this.c.ah().a(this.e, true);
               am.w.a(this.e, cwz.j, cwz.h);
            } else {
               if (this.e.ex() > 0.0F) {
                  return;
               }

               this.e = this.c.ah().a(this.e, false);
               if (this.c.j()) {
                  this.e.a(cww.d);
                  this.e.dM().Z().a(cwv.r).a(false, this.c);
               }
            }
            break;
         case b:
            this.e.H().a(this.e);
      }
   }

   @Override
   public void a(afo $$0) {
      ye.a($$0, this, this.e.z());
      this.e.s();
   }

   @Override
   public void a(afn $$0) {
      ye.a($$0, this, this.e.z());
      this.e.G();
      if (this.e.bZ.j == $$0.b()) {
         if (this.e.N_()) {
            this.e.bZ.b();
         } else if (!this.e.bZ.a(this.e)) {
            g.debug("Player {} interacted with invalid menu {}", this.e, this.e.bZ);
         } else {
            int $$1 = $$0.e();
            if (!this.e.bZ.a($$1)) {
               g.debug("Player {} clicked invalid slot index: {}, available slots: {}", new Object[]{this.e.ad(), $$1, this.e.bZ.i.size()});
            } else {
               boolean $$2 = $$0.j() != this.e.bZ.j();
               this.e.bZ.h();
               this.e.bZ.a($$1, $$0.f(), $$0.i(), this.e);
               ObjectIterator var4 = Int2ObjectMaps.fastIterable($$0.h()).iterator();

               while (var4.hasNext()) {
                  Entry<cqk> $$3 = (Entry<cqk>)var4.next();
                  this.e.bZ.b($$3.getIntKey(), (cqk)$$3.getValue());
               }

               this.e.bZ.a($$0.g());
               this.e.bZ.i();
               if ($$2) {
                  this.e.bZ.e();
               } else {
                  this.e.bZ.d();
               }
            }
         }
      }
   }

   @Override
   public void a(aga $$0) {
      ye.a($$0, this, this.e.z());
      this.e.G();
      if (!this.e.N_() && this.e.bZ.j == $$0.b() && this.e.bZ instanceof cnb) {
         if (!this.e.bZ.a(this.e)) {
            g.debug("Player {} interacted with invalid menu {}", this.e, this.e.bZ);
         } else {
            this.c.aJ().a($$0.e()).ifPresent($$1 -> ((cnb)this.e.bZ).a($$0.f(), (ctp<?>)$$1, this.e));
         }
      }
   }

   @Override
   public void a(afm $$0) {
      ye.a($$0, this, this.e.z());
      this.e.G();
      if (this.e.bZ.j == $$0.b() && !this.e.N_()) {
         if (!this.e.bZ.a(this.e)) {
            g.debug("Player {} interacted with invalid menu {}", this.e, this.e.bZ);
         } else {
            boolean $$1 = this.e.bZ.b(this.e, $$0.e());
            if ($$1) {
               this.e.bZ.d();
            }
         }
      }
   }

   @Override
   public void a(ago $$0) {
      ye.a($$0, this, this.e.z());
      if (this.e.f.e()) {
         boolean $$1 = $$0.b() < 0;
         cqk $$2 = $$0.e();
         if (!$$2.a(this.e.dM().I())) {
            return;
         }

         ta $$3 = cof.a($$2);
         if (!$$2.b() && $$3 != null && $$3.e("x") && $$3.e("y") && $$3.e("z")) {
            ib $$4 = dkg.a($$3);
            if (this.e.dM().p($$4)) {
               dkg $$5 = this.e.dM().c_($$4);
               if ($$5 != null) {
                  $$5.a($$2, this.e.dM().H_());
               }
            }
         }

         boolean $$6 = $$0.b() >= 1 && $$0.b() <= 45;
         boolean $$7 = $$2.b() || $$2.l() >= 0 && $$2.M() <= 64 && !$$2.b();
         if ($$6 && $$7) {
            this.e.bY.b($$0.b()).e($$2);
            this.e.bY.d();
         } else if ($$1 && $$7 && this.o < 200) {
            this.o += 20;
            this.e.a($$2, true);
         }
      }
   }

   @Override
   public void a(agr $$0) {
      List<String> $$1 = Stream.of($$0.f()).map(n::a).collect(Collectors.toList());
      this.a($$1).thenAcceptAsync($$1x -> this.a($$0, $$1x), this.c);
   }

   private void a(agr $$0, List<apw> $$1) {
      this.e.G();
      apf $$2 = this.e.z();
      ib $$3 = $$0.b();
      if ($$2.B($$3)) {
         if (!($$2.c_($$3) instanceof dlp $$5)) {
            return;
         }

         $$5.a(this.e, $$0.e(), $$1);
      }
   }

   @Override
   public void a(agb $$0) {
      ye.a($$0, this, this.e.z());
      this.e.ga().b = $$0.b() && this.e.ga().c;
      if (this.e.ga().b) {
         this.e.ct = null;
      }
   }

   @Override
   public void a(yt $$0) {
      ye.a($$0, this, this.e.z());
      this.e.a($$0.b());
   }

   @Override
   public void a(afd $$0) {
      ye.a($$0, this, this.e.z());
      if (this.e.m(2) || this.i()) {
         this.c.a($$0.b(), false);
      }
   }

   @Override
   public void a(afv $$0) {
      ye.a($$0, this, this.e.z());
      if (this.e.m(2) || this.i()) {
         this.c.b($$0.b());
      }
   }

   @Override
   public void a(afh $$0) {
      ye.a($$0, this, this.e.z());
      wl.a $$1 = $$0.b();
      civ.a $$2 = this.L != null ? this.L.d().b() : null;
      civ.a $$3 = $$1.b();
      if (!Objects.equals($$2, $$3)) {
         if ($$2 != null && $$3.b().isBefore($$2.b())) {
            this.b(civ.a);
         } else {
            try {
               axi $$4 = this.c.as();
               if ($$4 == null) {
                  g.warn("Ignoring chat session from {} due to missing Services public key", this.e.fY().getName());
                  return;
               }

               this.a($$1.a(this.e.fY(), $$4));
            } catch (civ.b var6) {
               g.error("Failed to validate profile key: {}", var6.getMessage());
               this.b(var6.b());
            }
         }
      }
   }

   @Override
   public void a(afl $$0) {
      if (!this.Q) {
         throw new IllegalStateException("Client acknowledged config, but none was requested");
      } else {
         this.d.a(aab.a, new aqc(this.c, this.d, this.a(this.e.B())));
      }
   }

   @Override
   public void a(afi $$0) {
      ye.a($$0, this, this.e.z());
      this.f.a($$0.b());
   }

   @Override
   public void a(afq $$0) {
      ye.a($$0, this, this.e.z());
      this.c.a(this.e, $$0.b());
   }

   private void a(wl $$0) {
      this.L = $$0;
      this.M = $$0.a(this.e.cw());
      this.P.append(() -> {
         this.e.a($$0);
         this.c.ah().a(new acs(EnumSet.of(acs.a.b), List.of(this.e)));
      });
   }

   @Override
   public apg p() {
      return this.e;
   }

   @FunctionalInterface
   interface a {
      bnc run(apg var1, bow var2, bnb var3);
   }
}
