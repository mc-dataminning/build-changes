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

public class apu extends apr implements aes, apx, ve {
   static final Logger g = LogUtils.getLogger();
   private static final int h = -1;
   private static final int i = 4096;
   private static final vq j = vq.c("multiplayer.disconnect.chat_validation_failed");
   public aow e;
   public final apq f;
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
   private bno u;
   private double v;
   private double w;
   private double x;
   private double y;
   private double z;
   private double A;
   @Nullable
   private ens B;
   private int C;
   private int D;
   private boolean E;
   private int F;
   private boolean G;
   private int H;
   private int I;
   private int J;
   @Nullable
   private wh K;
   private wk.b L;
   private final vz M = new vz(20);
   private final wd N = wd.a();
   private final avv O;
   private boolean P;

   public apu(MinecraftServer $$0, uo $$1, aow $$2, apk $$3) {
      super($$0, $$1, $$3);
      this.f = new apq($$1.e());
      $$1.a(aer.a.bind(vb.a($$0.aZ())), this);
      this.e = $$2;
      $$2.d = this;
      $$2.X().a();
      this.L = wk.b.unsigned($$2.cw(), $$0::ay);
      this.O = new avv($$0);
   }

   @Override
   public void e() {
      if (this.l > -1) {
         this.b(new aal(this.l));
         this.l = -1;
      }

      this.m();
      this.e.J = this.e.dr();
      this.e.K = this.e.dt();
      this.e.L = this.e.dx();
      this.e.m();
      this.e.a(this.o, this.p, this.q, this.e.dC(), this.e.dE());
      this.k++;
      this.J = this.I;
      if (this.E && !this.e.fD() && !this.e.bO() && !this.e.ex()) {
         if (++this.F > 80) {
            g.warn("{} was kicked for floating too long!", this.e.ad().getString());
            this.b(vq.c("multiplayer.disconnect.flying"));
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
               this.b(vq.c("multiplayer.disconnect.flying"));
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

      if (this.e.M() > 0L && this.c.an() > 0 && ac.b() - this.e.M() > (long)this.c.an() * 1000L * 60L) {
         this.b(vq.c("multiplayer.disconnect.idling"));
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
      return this.d.i() && !this.P;
   }

   @Override
   public boolean a(xx<?> $$0) {
      return super.a($$0) ? true : this.P && this.d.i() && $$0 instanceof afe;
   }

   @Override
   protected GameProfile j() {
      return this.e.fS();
   }

   private <T, R> CompletableFuture<R> a(T $$0, BiFunction<apz, T, CompletableFuture<R>> $$1) {
      return $$1.apply(this.e.X(), $$0).thenApply($$0x -> {
         if (!this.c()) {
            g.debug("Ignoring packet due to disconnection");
            throw new CancellationException("disconnected");
         } else {
            return (R)$$0x;
         }
      });
   }

   private CompletableFuture<apm> a(String $$0) {
      return this.a($$0, apz::a);
   }

   private CompletableFuture<List<apm>> a(List<String> $$0) {
      return this.a($$0, apz::a);
   }

   @Override
   public void a(afw $$0) {
      ya.a($$0, this, this.e.z());
      this.e.a($$0.b(), $$0.e(), $$0.f(), $$0.g());
   }

   private static boolean b(double $$0, double $$1, double $$2, float $$3, float $$4) {
      return Double.isNaN($$0) || Double.isNaN($$1) || Double.isNaN($$2) || !Floats.isFinite($$4) || !Floats.isFinite($$3);
   }

   private static double a(double $$0) {
      return awh.a($$0, -3.0E7, 3.0E7);
   }

   private static double b(double $$0) {
      return awh.a($$0, -2.0E7, 2.0E7);
   }

   @Override
   public void a(afp $$0) {
      ya.a($$0, this, this.e.z());
      if (b($$0.b(), $$0.e(), $$0.f(), $$0.g(), $$0.h())) {
         this.b(vq.c("multiplayer.disconnect.invalid_vehicle_movement"));
      } else {
         bno $$1 = this.e.cW();
         if ($$1 != this.e && $$1.cN() == this.e && $$1 == this.u) {
            aov $$2 = this.e.z();
            double $$3 = $$1.dr();
            double $$4 = $$1.dt();
            double $$5 = $$1.dx();
            double $$6 = a($$0.b());
            double $$7 = b($$0.e());
            double $$8 = a($$0.f());
            float $$9 = awh.g($$0.g());
            float $$10 = awh.g($$0.h());
            double $$11 = $$6 - this.v;
            double $$12 = $$7 - this.w;
            double $$13 = $$8 - this.x;
            double $$14 = $$1.dp().g();
            double $$15 = $$11 * $$11 + $$12 * $$12 + $$13 * $$13;
            if ($$15 - $$14 > 100.0 && !this.i()) {
               g.warn("{} (vehicle of {}) moved too quickly! {},{},{}", new Object[]{$$1.ad().getString(), this.e.ad().getString(), $$11, $$12, $$13});
               this.b(new aca($$1));
               return;
            }

            boolean $$16 = $$2.a($$1, $$1.cH().h(0.0625));
            $$11 = $$6 - this.y;
            $$12 = $$7 - this.z - 1.0E-6;
            $$13 = $$8 - this.A;
            boolean $$17 = $$1.Q;
            if ($$1 instanceof bog $$18 && $$18.e_()) {
               $$18.n();
            }

            $$1.a(bol.b, new ens($$11, $$12, $$13));
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
               this.b(new aca($$1));
               return;
            }

            this.e.z().l().a(this.e);
            this.e.b(this.e.dr() - $$3, this.e.dt() - $$4, this.e.dx() - $$5);
            this.G = $$12 >= -0.03125 && !$$17 && !this.c.ab() && !$$1.aV() && this.a($$1);
            this.y = $$1.dr();
            this.z = $$1.dt();
            this.A = $$1.dx();
         }
      }
   }

   private boolean a(bno $$0) {
      return $$0.dM().a($$0.cH().g(0.0625).b(0.0, -0.55, 0.0)).allMatch(dle.a::i);
   }

   @Override
   public void a(aeu $$0) {
      ya.a($$0, this, this.e.z());
      if ($$0.b() == this.C) {
         if (this.B == null) {
            this.b(vq.c("multiplayer.disconnect.invalid_player_movement"));
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
   public void a(afy $$0) {
      ya.a($$0, this, this.e.z());
      this.c.aG().a($$0.b()).ifPresent(this.e.I()::e);
   }

   @Override
   public void a(afx $$0) {
      ya.a($$0, this, this.e.z());
      this.e.I().a($$0.b(), $$0.e(), $$0.f());
   }

   @Override
   public void a(aga $$0) {
      ya.a($$0, this, this.e.z());
      if ($$0.e() == aga.a.a) {
         aiy $$1 = Objects.requireNonNull($$0.f());
         af $$2 = this.c.aB().a($$1);
         if ($$2 != null) {
            this.e.Q().a($$2);
         }
      }
   }

   @Override
   public void a(afd $$0) {
      ya.a($$0, this, this.e.z());
      StringReader $$1 = new StringReader($$0.e());
      if ($$1.canRead() && $$1.peek() == '/') {
         $$1.skip();
      }

      ParseResults<du> $$2 = this.c.aE().a().parse($$1, this.e.dd());
      this.c.aE().a().getCompletionSuggestions($$2).thenAccept($$1x -> this.b(new aay($$0.b(), $$1x)));
   }

   @Override
   public void a(age $$0) {
      ya.a($$0, this, this.e.z());
      if (!this.c.o()) {
         this.e.a(vq.c("advMode.notEnabled"));
      } else if (!this.e.gq()) {
         this.e.a(vq.c("advMode.notAllowed"));
      } else {
         cuo $$1 = null;
         djd $$2 = null;
         hz $$3 = $$0.b();
         dit $$4 = this.e.dM().c_($$3);
         if ($$4 instanceof djd) {
            $$2 = (djd)$$4;
            $$1 = $$2.c();
         }

         String $$5 = $$0.e();
         boolean $$6 = $$0.f();
         if ($$1 != null) {
            djd.a $$7 = $$2.m();
            dlf $$8 = this.e.dM().a_($$3);
            ie $$9 = $$8.c(czx.b);

            dlf $$13 = (switch ($$0.i()) {
               case a -> cyq.kH.o();
               case b -> cyq.kG.o();
               default -> cyq.fN.o();
            }).a(czx.b, $$9).a(czx.c, Boolean.valueOf($$0.g()));
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
               $$2.g();
            }

            $$1.f();
            if (!axd.b($$5)) {
               this.e.a(vq.a("advMode.setCommand.success", $$5));
            }
         }
      }
   }

   @Override
   public void a(agf $$0) {
      ya.a($$0, this, this.e.z());
      if (!this.c.o()) {
         this.e.a(vq.c("advMode.notEnabled"));
      } else if (!this.e.gq()) {
         this.e.a(vq.c("advMode.notAllowed"));
      } else {
         cuo $$1 = $$0.a(this.e.dM());
         if ($$1 != null) {
            $$1.a($$0.b());
            $$1.a($$0.e());
            if (!$$0.e()) {
               $$1.c(null);
            }

            $$1.f();
            this.e.a(vq.a("advMode.setCommand.success", $$0.b()));
         }
      }
   }

   @Override
   public void a(afr $$0) {
      ya.a($$0, this, this.e.z());
      this.e.fT().c($$0.b());
      this.e.d.b(new abd(-2, 0, this.e.fT().l, this.e.fT().a(this.e.fT().l)));
      this.e.d.b(new abd(-2, 0, $$0.b(), this.e.fT().a($$0.b())));
      this.e.d.b(new ade(this.e.fT().l));
   }

   @Override
   public void a(afz $$0) {
      ya.a($$0, this, this.e.z());
      if (this.e.bW instanceof ckd $$1) {
         if (!$$1.a(this.e)) {
            g.debug("Player {} interacted with invalid menu {}", this.e, $$1);
            return;
         }

         $$1.a($$0.b());
      }
   }

   @Override
   public void a(agc $$0) {
      ya.a($$0, this, this.e.z());
      if (this.e.bW instanceof cke $$1) {
         if (!this.e.bW.a(this.e)) {
            g.debug("Player {} interacted with invalid menu {}", this.e, this.e.bW);
            return;
         }

         $$1.a($$0.b(), $$0.e());
      }
   }

   @Override
   public void a(agi $$0) {
      ya.a($$0, this, this.e.z());
      if (this.e.gq()) {
         hz $$1 = $$0.b();
         dlf $$2 = this.e.dM().a_($$1);
         if (this.e.dM().c_($$1) instanceof dkh $$4) {
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
            if ($$4.f()) {
               String $$5 = $$4.d();
               if ($$0.e() == dkh.a.b) {
                  if ($$4.C()) {
                     this.e.a(vq.a("structure_block.save_success", $$5), false);
                  } else {
                     this.e.a(vq.a("structure_block.save_failure", $$5), false);
                  }
               } else if ($$0.e() == dkh.a.c) {
                  if (!$$4.E()) {
                     this.e.a(vq.a("structure_block.load_not_found", $$5), false);
                  } else if ($$4.a(this.e.z())) {
                     this.e.a(vq.a("structure_block.load_success", $$5), false);
                  } else {
                     this.e.a(vq.a("structure_block.load_prepare", $$5), false);
                  }
               } else if ($$0.e() == dkh.a.d) {
                  if ($$4.B()) {
                     this.e.a(vq.a("structure_block.size_success", $$5), false);
                  } else {
                     this.e.a(vq.c("structure_block.size_failure"), false);
                  }
               }
            } else {
               this.e.a(vq.a("structure_block.invalid_structure_name", $$0.g()), false);
            }

            $$4.e();
            this.e.dM().a($$1, $$2, $$2, 3);
         }
      }
   }

   @Override
   public void a(agh $$0) {
      ya.a($$0, this, this.e.z());
      if (this.e.gq()) {
         hz $$1 = $$0.b();
         dlf $$2 = this.e.dM().a_($$1);
         if (this.e.dM().c_($$1) instanceof djt $$4) {
            $$4.a($$0.e());
            $$4.b($$0.f());
            $$4.a(aix.a(kg.aG, $$0.g()));
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
   public void a(afm $$0) {
      ya.a($$0, this, this.e.z());
      if (this.e.gq()) {
         hz $$1 = $$0.b();
         if (this.e.dM().c_($$1) instanceof djt $$3) {
            $$3.a(this.e.z(), $$0.e(), $$0.f());
         }
      }
   }

   @Override
   public void a(agb $$0) {
      ya.a($$0, this, this.e.z());
      int $$1 = $$0.b();
      if (this.e.bW instanceof clk $$2) {
         if (!$$2.a(this.e)) {
            g.debug("Player {} interacted with invalid menu {}", this.e, $$2);
            return;
         }

         $$2.e($$1);
         $$2.h($$1);
      }
   }

   @Override
   public void a(afj $$0) {
      int $$1 = $$0.f();
      if (chg.d($$1) || $$1 == 40) {
         List<String> $$2 = Lists.newArrayList();
         Optional<String> $$3 = $$0.e();
         $$3.ifPresent($$2::add);
         $$0.b().stream().limit(100L).forEach($$2::add);
         Consumer<List<apm>> $$4 = $$3.isPresent() ? $$1x -> this.a((apm)$$1x.get(0), $$1x.subList(1, $$1x.size()), $$1) : $$1x -> this.a($$1x, $$1);
         this.a($$2).thenAcceptAsync($$4, this.c);
      }
   }

   private void a(List<apm> $$0, int $$1) {
      coz $$2 = this.e.fT().a($$1);
      if ($$2.a(cpc.tW)) {
         this.a($$0, UnaryOperator.identity(), $$2);
      }
   }

   private void a(apm $$0, List<apm> $$1, int $$2) {
      coz $$3 = this.e.fT().a($$2);
      if ($$3.a(cpc.tW)) {
         coz $$4 = new coz(cpc.tX);
         sw $$5 = $$3.w();
         if ($$5 != null) {
            $$4.c($$5.h());
         }

         $$4.a("author", tr.a(this.e.ad().getString()));
         if (this.e.Y()) {
            $$4.a("title", tr.a($$0.b()));
         } else {
            $$4.a("filtered_title", tr.a($$0.b()));
            $$4.a("title", tr.a($$0.d()));
         }

         this.a($$1, $$0x -> vq.a.a(vq.b($$0x)), $$4);
         this.e.fT().a($$2, $$4);
      }
   }

   private void a(List<apm> $$0, UnaryOperator<String> $$1, coz $$2) {
      tc $$3 = new tc();
      if (this.e.Y()) {
         $$0.stream().map($$1x -> tr.a($$1.apply($$1x.b()))).forEach($$3::add);
      } else {
         sw $$4 = new sw();
         int $$5 = 0;

         for (int $$6 = $$0.size(); $$5 < $$6; $$5++) {
            apm $$7 = $$0.get($$5);
            String $$8 = $$7.d();
            $$3.add(tr.a($$1.apply($$8)));
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
   public void a(afk $$0) {
      ya.a($$0, this, this.e.z());
      if (this.e.m(2)) {
         bno $$1 = this.e.dM().a($$0.e());
         if ($$1 != null) {
            sw $$2 = $$1.f(new sw());
            this.e.d.b(new aee($$0.b(), $$2));
         }
      }
   }

   @Override
   public void a(afi $$0) {
      ya.a($$0, this, this.e.z());
      if (!this.e.P_() && $$0.e() == this.e.bW.j) {
         if (this.e.bW instanceof ckp $$1 && $$1.m() instanceof djh $$2) {
            $$2.a($$0.b(), $$0.f());
         }
      }
   }

   @Override
   public void a(aev $$0) {
      ya.a($$0, this, this.e.z());
      if (this.e.m(2)) {
         dit $$1 = this.e.dM().c_($$0.e());
         sw $$2 = $$1 != null ? $$1.q() : null;
         this.e.d.b(new aee($$0.b(), $$2));
      }
   }

   @Override
   public void a(afo $$0) {
      ya.a($$0, this, this.e.z());
      if (b($$0.a(0.0), $$0.b(0.0), $$0.c(0.0), $$0.a(0.0F), $$0.b(0.0F))) {
         this.b(vq.c("multiplayer.disconnect.invalid_player_movement"));
      } else {
         aov $$1 = this.e.z();
         if (!this.e.g) {
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
               float $$5 = awh.g($$0.a(this.e.dC()));
               float $$6 = awh.g($$0.b(this.e.dE()));
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

                        if (!this.e.O() && (!this.e.dM().Z().b(cvj.t) || !this.e.fw())) {
                           float $$16 = this.e.fw() ? 300.0F : 100.0F;
                           if ($$14 - $$13 > (double)($$16 * (float)$$15) && !this.i()) {
                              g.warn("{} moved too quickly! {},{},{}", new Object[]{this.e.ad().getString(), $$10, $$11, $$12});
                              this.a(this.e.dr(), this.e.dt(), this.e.dx(), this.e.dC(), this.e.dE());
                              return;
                           }
                        }
                     }

                     enn $$17 = this.e.cH();
                     $$10 = $$2 - this.r;
                     $$11 = $$3 - this.s;
                     $$12 = $$4 - this.t;
                     boolean $$18 = $$11 > 0.0;
                     if (this.e.aC() && !$$0.b() && $$18) {
                        this.e.fb();
                     }

                     boolean $$19 = this.e.Q;
                     this.e.a(bol.b, new ens($$10, $$11, $$12));
                     $$10 = $$2 - this.e.dr();
                     $$11 = $$3 - this.e.dt();
                     if ($$11 > -0.5 || $$11 < 0.5) {
                        $$11 = 0.0;
                     }

                     $$12 = $$4 - this.e.dx();
                     $$14 = $$10 * $$10 + $$11 * $$11 + $$12 * $$12;
                     boolean $$21 = false;
                     if (!this.e.O() && $$14 > 0.0625 && !this.e.fD() && !this.e.f.e() && this.e.f.b() != cvk.d) {
                        $$21 = true;
                        g.warn("{} moved wrongly!", this.e.ad().getString());
                     }

                     if (this.e.ae || this.e.fD() || (!$$21 || !$$1.a(this.e, $$17)) && !this.a($$1, $$17, $$2, $$3, $$4)) {
                        this.e.a($$2, $$3, $$4, $$5, $$6);
                        this.E = $$11 >= -0.03125
                           && !$$19
                           && this.e.f.b() != cvk.d
                           && !this.c.ab()
                           && !this.e.fU().c
                           && !this.e.a(bnd.y)
                           && !this.e.fw()
                           && !this.e.fj()
                           && this.a((bno)this.e);
                        this.e.z().l().a(this.e);
                        this.e.a(this.e.dr() - $$7, this.e.dt() - $$8, this.e.dx() - $$9, $$0.b());
                        this.e.a($$0.b(), new ens(this.e.dr() - $$7, this.e.dt() - $$8, this.e.dx() - $$9));
                        if ($$18) {
                           this.e.n();
                        }

                        this.e.b(this.e.dr() - $$7, this.e.dt() - $$8, this.e.dx() - $$9);
                        this.r = this.e.dr();
                        this.s = this.e.dt();
                        this.t = this.e.dx();
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

   private boolean a(cvq $$0, enn $$1, double $$2, double $$3, double $$4) {
      enn $$5 = this.e.cH().d($$2 - this.e.dr(), $$3 - this.e.dt(), $$4 - this.e.dx());
      Iterable<eol> $$6 = $$0.d(this.e, $$5.h(1.0E-5F));
      eol $$7 = eoi.a($$1.h(1.0E-5F));

      for (eol $$8 : $$6) {
         if (!eoi.c($$8, $$7, enw.i)) {
            return true;
         }
      }

      return false;
   }

   public void a(double $$0, double $$1, double $$2, float $$3, float $$4) {
      this.a($$0, $$1, $$2, $$3, $$4, Collections.emptySet());
   }

   public void a(double $$0, double $$1, double $$2, float $$3, float $$4, Set<bot> $$5) {
      double $$6 = $$5.contains(bot.a) ? this.e.dr() : 0.0;
      double $$7 = $$5.contains(bot.b) ? this.e.dt() : 0.0;
      double $$8 = $$5.contains(bot.c) ? this.e.dx() : 0.0;
      float $$9 = $$5.contains(bot.d) ? this.e.dC() : 0.0F;
      float $$10 = $$5.contains(bot.e) ? this.e.dE() : 0.0F;
      this.B = new ens($$0, $$1, $$2);
      if (++this.C == Integer.MAX_VALUE) {
         this.C = 0;
      }

      this.D = this.k;
      this.e.a($$0, $$1, $$2, $$3, $$4);
      this.e.d.b(new acn($$0 - $$6, $$1 - $$7, $$2 - $$8, $$3 - $$9, $$4 - $$10, $$5, this.C));
   }

   @Override
   public void a(afu $$0) {
      ya.a($$0, this, this.e.z());
      hz $$1 = $$0.b();
      this.e.G();
      afu.a $$2 = $$0.f();
      switch ($$2) {
         case g:
            if (!this.e.P_()) {
               coz $$3 = this.e.b(blt.b);
               this.e.a(blt.b, this.e.b(blt.a));
               this.e.a(blt.a, $$3);
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
            this.e.f.a($$1, $$2, $$0.e(), this.e.dM().al(), $$0.g());
            this.e.d.a($$0.g());
            return;
         default:
            throw new IllegalArgumentException("Invalid player action");
      }
   }

   private static boolean a(aow $$0, coz $$1) {
      if ($$1.b()) {
         return false;
      } else {
         cou $$2 = $$1.d();
         return ($$2 instanceof cms || $$2 instanceof cna) && !$$0.go().a($$2);
      }
   }

   @Override
   public void a(agm $$0) {
      ya.a($$0, this, this.e.z());
      this.e.d.a($$0.f());
      aov $$1 = this.e.z();
      blt $$2 = $$0.b();
      coz $$3 = this.e.b($$2);
      if ($$3.a($$1.I())) {
         eno $$4 = $$0.e();
         ens $$5 = $$4.e();
         hz $$6 = $$4.a();
         if (this.e.a($$6, 1.0)) {
            ens $$7 = $$5.d(ens.b($$6));
            double $$8 = 1.0000001;
            if (Math.abs($$7.a()) < 1.0000001 && Math.abs($$7.b()) < 1.0000001 && Math.abs($$7.c()) < 1.0000001) {
               ie $$9 = $$4.b();
               this.e.G();
               int $$10 = this.e.dM().al();
               if ($$6.v() < $$10) {
                  if (this.B == null && $$1.a(this.e, $$6)) {
                     blu $$11 = this.e.f.a(this.e, $$1, $$3, $$2, $$4);
                     if ($$11.a()) {
                        am.P.a(this.e, $$4.a(), $$3.q());
                     }

                     if ($$9 == ie.b && !$$11.a() && $$6.v() >= $$10 - 1 && a(this.e, $$3)) {
                        vq $$12 = vq.a("build.tooHigh", $$10 - 1).a(n.m);
                        this.e.b($$12, true);
                     } else if ($$11.b()) {
                        this.e.a($$2, true);
                     }
                  }
               } else {
                  vq $$13 = vq.a("build.tooHigh", $$10 - 1).a(n.m);
                  this.e.b($$13, true);
               }

               this.e.d.b(new aap($$1, $$6));
               this.e.d.b(new aap($$1, $$6.a($$9)));
            } else {
               g.warn("Rejecting UseItemOnPacket from {}: Location {} too far away from hit block {}.", new Object[]{this.e.fS().getName(), $$5, $$6});
            }
         }
      }
   }

   @Override
   public void a(agn $$0) {
      ya.a($$0, this, this.e.z());
      this.a($$0.e());
      aov $$1 = this.e.z();
      blt $$2 = $$0.b();
      coz $$3 = this.e.b($$2);
      this.e.G();
      if (!$$3.b() && $$3.a($$1.I())) {
         blu $$4 = this.e.f.a(this.e, $$1, $$3, $$2);
         if ($$4.b()) {
            this.e.a($$2, true);
         }
      }
   }

   @Override
   public void a(agl $$0) {
      ya.a($$0, this, this.e.z());
      if (this.e.P_()) {
         for (aov $$1 : this.c.H()) {
            bno $$2 = $$0.a($$1);
            if ($$2 != null) {
               this.e.a($$1, $$2.dr(), $$2.dt(), $$2.dx(), $$2.dC(), $$2.dE());
               return;
            }
         }
      }
   }

   @Override
   public void a(afq $$0) {
      ya.a($$0, this, this.e.z());
      if (this.e.da() instanceof cjc $$2) {
         $$2.a($$0.b(), $$0.e());
      }
   }

   @Override
   public void a(vq $$0) {
      g.info("{} lost connection: {}", this.e.ad().getString(), $$0.getString());
      this.q();
      super.a($$0);
   }

   private void q() {
      this.O.close();
      this.c.at();
      this.c.ae().a(vq.a("multiplayer.player.left", this.e.Q_()).a(n.o), false);
      this.e.u();
      this.c.ae().c(this.e);
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
   public void a(agd $$0) {
      ya.a($$0, this, this.e.z());
      if ($$0.b() >= 0 && $$0.b() < chg.g()) {
         if (this.e.fT().l != $$0.b() && this.e.fo() == blt.a) {
            this.e.ft();
         }

         this.e.fT().l = $$0.b();
         this.e.G();
      } else {
         g.warn("{} tried to set an invalid carried item", this.e.ad().getString());
      }
   }

   @Override
   public void a(aez $$0) {
      if (c($$0.b())) {
         this.b(vq.c("multiplayer.disconnect.illegal_characters"));
      } else {
         Optional<vx> $$1 = this.a($$0.h());
         if ($$1.isPresent()) {
            this.c.g(() -> {
               wg $$2;
               try {
                  $$2 = this.a($$0, $$1.get());
               } catch (wk.a var6) {
                  this.a(var6);
                  return;
               }

               CompletableFuture<apm> $$5 = this.a($$2.c());
               vq $$6 = this.c.bi().decorate(this.e, $$2.d());
               this.O.append($$5, $$2x -> {
                  wg $$3 = $$2.a($$6).a($$2x.e());
                  this.b($$3);
               });
            });
         }
      }
   }

   @Override
   public void a(aey $$0) {
      if (c($$0.b())) {
         this.b(vq.c("multiplayer.disconnect.illegal_characters"));
      } else {
         Optional<vx> $$1 = this.a($$0.h());
         if ($$1.isPresent()) {
            this.c.g(() -> {
               this.a($$0, $$1.get());
               this.r();
            });
         }
      }
   }

   private void a(aey $$0, vx $$1) {
      ParseResults<du> $$2 = this.b($$0.b());

      Map<String, wg> $$3;
      try {
         $$3 = this.a($$0, wi.a($$2), $$1);
      } catch (wk.a var6) {
         this.a(var6);
         return;
      }

      ds $$6 = new ds.a($$3);
      $$2 = dv.a($$2, $$1x -> $$1x.a($$6, this.O));
      this.c.aE().a($$2, $$0.b());
   }

   private void a(wk.a $$0) {
      g.warn("Failed to update secure chat state for {}: '{}'", this.e.fS().getName(), $$0.b().getString());
      if ($$0.a()) {
         this.b($$0.b());
      } else {
         this.e.a($$0.b().f().a(n.m));
      }
   }

   private Map<String, wg> a(aey $$0, wi<?> $$1, vx $$2) throws wk.a {
      Map<String, wg> $$3 = new Object2ObjectOpenHashMap();

      for (wi.a<?> $$4 : $$1.a()) {
         wc $$5 = $$0.g().a($$4.a());
         wj $$6 = new wj($$4.c(), $$0.e(), $$0.f(), $$2);
         $$3.put($$4.a(), this.L.unpack($$5, $$6));
      }

      return $$3;
   }

   private ParseResults<du> b(String $$0) {
      CommandDispatcher<du> $$1 = this.c.aE().a();
      return $$1.parse($$0, this.e.dd());
   }

   private Optional<vx> a(vx.b $$0) {
      Optional<vx> $$1 = this.b($$0);
      if (this.e.D() == chf.c) {
         this.b(new aec(vq.c("chat.disabled.options").a(n.m), false));
         return Optional.empty();
      } else {
         this.e.G();
         return $$1;
      }
   }

   private Optional<vx> b(vx.b $$0) {
      synchronized (this.M) {
         Optional<vx> $$1 = this.M.a($$0);
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

   private wg a(aez $$0, vx $$1) throws wk.a {
      wj $$2 = new wj($$0.b(), $$0.e(), $$0.f(), $$1);
      return this.L.unpack($$0.g(), $$2);
   }

   private void b(wg $$0) {
      this.c.ae().a($$0, this.e, vm.a(vm.c, this.e));
      this.r();
   }

   private void r() {
      this.m += 20;
      if (this.m > 200 && !this.c.ae().f(this.e.fS())) {
         this.b(vq.c("disconnect.spam"));
      }
   }

   @Override
   public void a(aex $$0) {
      synchronized (this.M) {
         if (!this.M.a($$0.b())) {
            g.warn("Failed to validate message acknowledgements from {}", this.e.ad().getString());
            this.b(j);
         }
      }
   }

   @Override
   public void a(agk $$0) {
      ya.a($$0, this, this.e.z());
      this.e.G();
      this.e.a($$0.b());
   }

   @Override
   public void a(afv $$0) {
      ya.a($$0, this, this.e.z());
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
            if (this.e.fD()) {
               this.e.a(false, true);
               this.B = this.e.dk();
            }
            break;
         case f:
            if (this.e.da() instanceof boq $$1) {
               int $$2 = $$0.f();
               if ($$1.a() && $$2 > 0) {
                  $$1.c($$2);
               }
            }
            break;
         case g:
            if (this.e.da() instanceof boq $$3) {
               $$3.b();
            }
            break;
         case h:
            if (this.e.cZ() instanceof bnz $$4) {
               $$4.b(this.e);
            }
            break;
         case i:
            if (!this.e.fY()) {
               this.e.ga();
            }
            break;
         default:
            throw new IllegalArgumentException("Invalid client command!");
      }
   }

   public void a(wg $$0) {
      wc $$1 = $$0.l();
      if ($$1 != null) {
         this.N.a($$0.m(), $$0.l());
         int $$2;
         synchronized (this.M) {
            this.M.a($$1);
            $$2 = this.M.a();
         }

         if ($$2 > 4096) {
            this.b(vq.c("multiplayer.disconnect.too_many_pending_chats"));
         }
      }
   }

   public void a(wg $$0, vm.a $$1) {
      this.b(new acg($$0.k().c(), $$0.k().b(), $$0.l(), $$0.m().a(this.N), $$0.n(), $$0.o(), $$1.a(this.e.dM().I_())));
      this.a($$0);
   }

   public void a(vq $$0, vm.a $$1) {
      this.b(new abi($$0, $$1.a(this.e.dM().I_())));
   }

   public SocketAddress n() {
      return this.d.d();
   }

   public void o() {
      this.P = true;
      this.q();
      this.b(aea.a);
      this.d.a(zw.b);
   }

   @Override
   public void a(ahu $$0) {
      this.d.a(new ahr($$0.b()));
   }

   @Override
   public void a(afl $$0) {
      ya.a($$0, this, this.e.z());
      final aov $$1 = this.e.z();
      final bno $$2 = $$0.a($$1);
      this.e.G();
      this.e.f($$0.b());
      if ($$2 != null) {
         if (!$$1.D_().a($$2.dm())) {
            return;
         }

         enn $$3 = $$2.cH();
         if (this.e.a($$3, 1.0)) {
            $$0.a(new afl.c() {
               private void a(blt $$0, apu.a $$1x) {
                  coz $$2 = apu.this.e.b($$0);
                  if ($$2.a($$1.I())) {
                     coz $$3 = $$2.q();
                     blu $$4 = $$1.run(apu.this.e, $$2, $$0);
                     if ($$4.a()) {
                        am.T.a(apu.this.e, $$3, $$2);
                        if ($$4.b()) {
                           apu.this.e.a($$0, true);
                        }
                     }
                  }
               }

               @Override
               public void a(blt $$0) {
                  this.a($$0, chh::a);
               }

               @Override
               public void a(blt $$0, ens $$1x) {
                  this.a($$0, ($$1xxx, $$2xx, $$3) -> $$2xx.a($$1xxx, $$1, $$3));
               }

               @Override
               public void a() {
                  if (!($$2 instanceof cds) && !($$2 instanceof bnw) && !($$2 instanceof chn) && $$2 != apu.this.e) {
                     coz $$0 = apu.this.e.b(blt.a);
                     if ($$0.a($$1.I())) {
                        apu.this.e.d($$2);
                     }
                  } else {
                     apu.this.b(vq.c("multiplayer.disconnect.invalid_entity_attacked"));
                     apu.g.warn("Player {} tried to attack an invalid entity", apu.this.e.ad().getString());
                  }
               }
            });
         }
      }
   }

   @Override
   public void a(afc $$0) {
      ya.a($$0, this, this.e.z());
      this.e.G();
      afc.a $$1 = $$0.b();
      switch ($$1) {
         case a:
            if (this.e.g) {
               this.e.g = false;
               this.e = this.c.ae().a(this.e, true);
               am.w.a(this.e, cvn.j, cvn.h);
            } else {
               if (this.e.ew() > 0.0F) {
                  return;
               }

               this.e = this.c.ae().a(this.e, false);
               if (this.c.h()) {
                  this.e.a(cvk.d);
                  this.e.dM().Z().a(cvj.r).a(false, this.c);
               }
            }
            break;
         case b:
            this.e.H().a(this.e);
      }
   }

   @Override
   public void a(afh $$0) {
      ya.a($$0, this, this.e.z());
      this.e.s();
   }

   @Override
   public void a(afg $$0) {
      ya.a($$0, this, this.e.z());
      this.e.G();
      if (this.e.bW.j == $$0.b()) {
         if (this.e.P_()) {
            this.e.bW.b();
         } else if (!this.e.bW.a(this.e)) {
            g.debug("Player {} interacted with invalid menu {}", this.e, this.e.bW);
         } else {
            int $$1 = $$0.e();
            if (!this.e.bW.a($$1)) {
               g.debug("Player {} clicked invalid slot index: {}, available slots: {}", new Object[]{this.e.ad(), $$1, this.e.bW.i.size()});
            } else {
               boolean $$2 = $$0.j() != this.e.bW.j();
               this.e.bW.h();
               this.e.bW.a($$1, $$0.f(), $$0.i(), this.e);
               ObjectIterator var4 = Int2ObjectMaps.fastIterable($$0.h()).iterator();

               while (var4.hasNext()) {
                  Entry<coz> $$3 = (Entry<coz>)var4.next();
                  this.e.bW.b($$3.getIntKey(), (coz)$$3.getValue());
               }

               this.e.bW.a($$0.g());
               this.e.bW.i();
               if ($$2) {
                  this.e.bW.e();
               } else {
                  this.e.bW.d();
               }
            }
         }
      }
   }

   @Override
   public void a(afs $$0) {
      ya.a($$0, this, this.e.z());
      this.e.G();
      if (!this.e.P_() && this.e.bW.j == $$0.b() && this.e.bW instanceof clo) {
         if (!this.e.bW.a(this.e)) {
            g.debug("Player {} interacted with invalid menu {}", this.e, this.e.bW);
         } else {
            this.c.aG().a($$0.e()).ifPresent($$1 -> ((clo)this.e.bW).a($$0.f(), (csd<?>)$$1, this.e));
         }
      }
   }

   @Override
   public void a(aff $$0) {
      ya.a($$0, this, this.e.z());
      this.e.G();
      if (this.e.bW.j == $$0.b() && !this.e.P_()) {
         if (!this.e.bW.a(this.e)) {
            g.debug("Player {} interacted with invalid menu {}", this.e, this.e.bW);
         } else {
            boolean $$1 = this.e.bW.b(this.e, $$0.e());
            if ($$1) {
               this.e.bW.d();
            }
         }
      }
   }

   @Override
   public void a(agg $$0) {
      ya.a($$0, this, this.e.z());
      if (this.e.f.e()) {
         boolean $$1 = $$0.b() < 0;
         coz $$2 = $$0.e();
         if (!$$2.a(this.e.dM().I())) {
            return;
         }

         sw $$3 = cms.a($$2);
         if (!$$2.b() && $$3 != null && $$3.e("x") && $$3.e("y") && $$3.e("z")) {
            hz $$4 = dit.c($$3);
            if (this.e.dM().p($$4)) {
               dit $$5 = this.e.dM().c_($$4);
               if ($$5 != null) {
                  $$5.e($$2);
               }
            }
         }

         boolean $$6 = $$0.b() >= 1 && $$0.b() <= 45;
         boolean $$7 = $$2.b() || $$2.l() >= 0 && $$2.M() <= 64 && !$$2.b();
         if ($$6 && $$7) {
            this.e.bV.b($$0.b()).e($$2);
            this.e.bV.d();
         } else if ($$1 && $$7 && this.n < 200) {
            this.n += 20;
            this.e.a($$2, true);
         }
      }
   }

   @Override
   public void a(agj $$0) {
      List<String> $$1 = Stream.of($$0.f()).map(n::a).collect(Collectors.toList());
      this.a($$1).thenAcceptAsync($$1x -> this.a($$0, $$1x), this.c);
   }

   private void a(agj $$0, List<apm> $$1) {
      this.e.G();
      aov $$2 = this.e.z();
      hz $$3 = $$0.b();
      if ($$2.B($$3)) {
         if (!($$2.c_($$3) instanceof dkc $$5)) {
            return;
         }

         $$5.a(this.e, $$0.e(), $$1);
      }
   }

   @Override
   public void a(aft $$0) {
      ya.a($$0, this, this.e.z());
      this.e.fU().b = $$0.b() && this.e.fU().c;
   }

   @Override
   public void a(yp $$0) {
      ya.a($$0, this, this.e.z());
      this.e.a($$0.b());
   }

   @Override
   public void a(aew $$0) {
      ya.a($$0, this, this.e.z());
      if (this.e.m(2) || this.i()) {
         this.c.a($$0.b(), false);
      }
   }

   @Override
   public void a(afn $$0) {
      ya.a($$0, this, this.e.z());
      if (this.e.m(2) || this.i()) {
         this.c.b($$0.b());
      }
   }

   @Override
   public void a(afa $$0) {
      ya.a($$0, this, this.e.z());
      wh.a $$1 = $$0.b();
      chk.a $$2 = this.K != null ? this.K.d().b() : null;
      chk.a $$3 = $$1.b();
      if (!Objects.equals($$2, $$3)) {
         if ($$2 != null && $$3.b().isBefore($$2.b())) {
            this.b(chk.a);
         } else {
            try {
               awu $$4 = this.c.ap();
               if ($$4 == null) {
                  g.warn("Ignoring chat session from {} due to missing Services public key", this.e.fS().getName());
                  return;
               }

               this.a($$1.a(this.e.fS(), $$4));
            } catch (chk.b var6) {
               g.error("Failed to validate profile key: {}", var6.getMessage());
               this.b(var6.b());
            }
         }
      }
   }

   @Override
   public void a(afe $$0) {
      if (!this.P) {
         throw new IllegalStateException("Client acknowledged config, but none was requested");
      } else {
         this.d.a(zw.a, new aps(this.c, this.d, this.a(this.e.B())));
      }
   }

   @Override
   public void a(afb $$0) {
      ya.a($$0, this, this.e.z());
      this.f.a($$0.b());
   }

   private void a(wh $$0) {
      this.K = $$0;
      this.L = $$0.a(this.e.cw());
      this.O.append(() -> {
         this.e.a($$0);
         this.c.ae().a(new acl(EnumSet.of(acl.a.b), List.of(this.e)));
      });
   }

   @Override
   public aow p() {
      return this.e;
   }

   @FunctionalInterface
   interface a {
      blu run(aow var1, bno var2, blt var3);
   }
}
