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
import java.util.HashMap;
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

public class asl extends asi implements agr, aso, ws {
   static final Logger h = LogUtils.getLogger();
   private static final int i = -1;
   private static final int j = 4096;
   private static final int k = 80;
   private static final xe l = xe.c("multiplayer.disconnect.chat_validation_failed");
   private static final xe m = xe.c("chat.disabled.invalid_command_signature").a(n.m);
   private static final int n = 1000;
   public ark f;
   public final asg g;
   private int o;
   private int p = -1;
   private int q;
   private int r;
   private double s;
   private double t;
   private double u;
   private double v;
   private double w;
   private double x;
   @Nullable
   private btr y;
   private double z;
   private double A;
   private double B;
   private double C;
   private double D;
   private double E;
   @Nullable
   private eyw F;
   private int G;
   private int H;
   private boolean I;
   private int J;
   private boolean K;
   private int L;
   private int M;
   private int N;
   private boolean O;
   @Nullable
   private xv P;
   private xy.b Q;
   private final xn R = new xn(20);
   private final xr S = xr.a();
   private final ayt T;
   private boolean U;

   public asl(MinecraftServer $$0, vy $$1, ark $$2, ary $$3) {
      super($$0, $$1, $$3);
      this.g = new asg($$1.e());
      this.f = $$2;
      $$2.c = this;
      $$2.aa().a();
      this.Q = xy.b.unsigned($$2.cD(), $$0::aA);
      this.T = new ayt($$0);
   }

   @Override
   public void d() {
      if (this.p > -1) {
         this.b(new acf(this.p));
         this.p = -1;
      }

      this.l();
      this.f.L = this.f.dx();
      this.f.M = this.f.dz();
      this.f.N = this.f.dD();
      this.f.m();
      this.f.a(this.s, this.t, this.u, this.f.dI(), this.f.dK());
      this.o++;
      this.N = this.M;
      if (this.I && !this.f.fN() && !this.f.bW() && !this.f.eC()) {
         if (++this.J > this.a((btr)this.f)) {
            h.warn("{} was kicked for floating too long!", this.f.aj().getString());
            this.a(xe.c("multiplayer.disconnect.flying"));
            return;
         }
      } else {
         this.I = false;
         this.J = 0;
      }

      this.y = this.f.dd();
      if (this.y != this.f && this.y.cU() == this.f) {
         this.z = this.y.dx();
         this.A = this.y.dz();
         this.B = this.y.dD();
         this.C = this.y.dx();
         this.D = this.y.dz();
         this.E = this.y.dD();
         if (this.K && this.y.cU() == this.f) {
            if (++this.L > this.a(this.y)) {
               h.warn("{} was kicked for floating a vehicle too long!", this.f.aj().getString());
               this.a(xe.c("multiplayer.disconnect.flying"));
               return;
            }
         } else {
            this.K = false;
            this.L = 0;
         }
      } else {
         this.y = null;
         this.K = false;
         this.L = 0;
      }

      this.e();
      if (this.q > 0) {
         this.q--;
      }

      if (this.r > 0) {
         this.r--;
      }

      if (this.f.O() > 0L && this.d.ap() > 0 && ad.c() - this.f.O() > (long)this.d.ap() * 1000L * 60L) {
         this.a(xe.c("multiplayer.disconnect.idling"));
      }
   }

   private int a(btr $$0) {
      double $$1 = $$0.bd();
      if ($$1 < 1.0E-5F) {
         return Integer.MAX_VALUE;
      } else {
         double $$2 = 0.08 / $$1;
         return azf.c(80.0 * Math.max($$2, 1.0));
      }
   }

   @Override
   public void l() {
      this.s = this.f.dx();
      this.t = this.f.dz();
      this.u = this.f.dD();
      this.v = this.f.dx();
      this.w = this.f.dz();
      this.x = this.f.dD();
   }

   @Override
   public boolean c() {
      return this.e.i() && !this.U;
   }

   @Override
   public boolean a(zl<?> $$0) {
      return super.a($$0) ? true : this.U && this.e.i() && $$0 instanceof ahf;
   }

   @Override
   protected GameProfile i() {
      return this.f.gc();
   }

   private <T, R> CompletableFuture<R> a(T $$0, BiFunction<asr, T, CompletableFuture<R>> $$1) {
      return $$1.apply(this.f.aa(), $$0).thenApply($$0x -> {
         if (!this.c()) {
            h.debug("Ignoring packet due to disconnection");
            throw new CancellationException("disconnected");
         } else {
            return (R)$$0x;
         }
      });
   }

   private CompletableFuture<asb> a(String $$0) {
      return this.a($$0, asr::a);
   }

   private CompletableFuture<List<asb>> a(List<String> $$0) {
      return this.a($$0, asr::a);
   }

   @Override
   public void a(ahy $$0) {
      if (this.f.bW() && this.f.dg() instanceof cpv $$1 && ((double)$$0.b() != 0.0 || (double)$$0.e() != 0.0)) {
         $$1.a(this.f, new eyw((double)$$0.b(), 0.0, (double)$$0.e()));
      }
   }

   private static boolean b(double $$0, double $$1, double $$2, float $$3, float $$4) {
      return Double.isNaN($$0) || Double.isNaN($$1) || Double.isNaN($$2) || !Floats.isFinite($$4) || !Floats.isFinite($$3);
   }

   private static double a(double $$0) {
      return azf.a($$0, -3.0E7, 3.0E7);
   }

   private static double b(double $$0) {
      return azf.a($$0, -2.0E7, 2.0E7);
   }

   @Override
   public void a(ahr $$0) {
      zo.a($$0, this, this.f.B());
      if (b($$0.b(), $$0.e(), $$0.f(), $$0.g(), $$0.h())) {
         this.a(xe.c("multiplayer.disconnect.invalid_vehicle_movement"));
      } else if (!this.p()) {
         btr $$1 = this.f.dd();
         if ($$1 != this.f && $$1.cU() == this.f && $$1 == this.y) {
            arj $$2 = this.f.B();
            double $$3 = $$1.dx();
            double $$4 = $$1.dz();
            double $$5 = $$1.dD();
            double $$6 = a($$0.b());
            double $$7 = b($$0.e());
            double $$8 = a($$0.f());
            float $$9 = azf.h($$0.g());
            float $$10 = azf.h($$0.h());
            double $$11 = $$6 - this.z;
            double $$12 = $$7 - this.A;
            double $$13 = $$8 - this.B;
            double $$14 = $$1.dv().h();
            double $$15 = $$11 * $$11 + $$12 * $$12 + $$13 * $$13;
            if ($$15 - $$14 > 100.0 && !this.h()) {
               h.warn("{} (vehicle of {}) moved too quickly! {},{},{}", new Object[]{$$1.aj().getString(), this.f.aj().getString(), $$11, $$12, $$13});
               this.b(new adw($$1));
               return;
            }

            boolean $$16 = $$2.a($$1, $$1.cO().h(0.0625));
            $$11 = $$6 - this.C;
            $$12 = $$7 - this.D - 1.0E-6;
            $$13 = $$8 - this.E;
            boolean $$17 = $$1.S;
            if ($$1 instanceof bun $$18 && $$18.q_()) {
               $$18.n();
            }

            $$1.a(bur.b, new eyw($$11, $$12, $$13));
            $$11 = $$6 - $$1.dx();
            $$12 = $$7 - $$1.dz();
            if ($$12 > -0.5 || $$12 < 0.5) {
               $$12 = 0.0;
            }

            $$13 = $$8 - $$1.dD();
            $$15 = $$11 * $$11 + $$12 * $$12 + $$13 * $$13;
            boolean $$20 = false;
            if ($$15 > 0.0625) {
               $$20 = true;
               h.warn("{} (vehicle of {}) moved wrongly! {}", new Object[]{$$1.aj().getString(), this.f.aj().getString(), Math.sqrt($$15)});
            }

            $$1.a($$6, $$7, $$8, $$9, $$10);
            boolean $$21 = $$2.a($$1, $$1.cO().h(0.0625));
            if ($$16 && ($$20 || !$$21)) {
               $$1.a($$3, $$4, $$5, $$9, $$10);
               this.b(new adw($$1));
               return;
            }

            this.f.B().l().a(this.f);
            eyw $$22 = new eyw($$1.dx() - $$3, $$1.dz() - $$4, $$1.dD() - $$5);
            this.a($$22);
            this.f.b($$22.d, $$22.e, $$22.f);
            this.K = $$12 >= -0.03125 && !$$17 && !this.d.ad() && !$$1.bb() && this.b($$1);
            this.C = $$1.dx();
            this.D = $$1.dz();
            this.E = $$1.dD();
         }
      }
   }

   private boolean b(btr $$0) {
      return $$0.dS().a($$0.cO().g(0.0625).b(0.0, -0.55, 0.0)).allMatch(dur.a::l);
   }

   @Override
   public void a(agt $$0) {
      zo.a($$0, this, this.f.B());
      if ($$0.b() == this.G) {
         if (this.F == null) {
            this.a(xe.c("multiplayer.disconnect.invalid_player_movement"));
            return;
         }

         this.f.a(this.F.d, this.F.e, this.F.f, this.f.dI(), this.f.dK());
         this.v = this.F.d;
         this.w = this.F.e;
         this.x = this.F.f;
         if (this.f.R()) {
            this.f.S();
         }

         this.F = null;
      }
   }

   @Override
   public void a(aia $$0) {
      zo.a($$0, this, this.f.B());
      this.d.aI().a($$0.b()).ifPresent(this.f.K()::e);
   }

   @Override
   public void a(aid $$0) {
      this.f.bZ.a($$0.b(), $$0.e());
   }

   @Override
   public void a(ahz $$0) {
      zo.a($$0, this, this.f.B());
      this.f.K().a($$0.b(), $$0.e(), $$0.f());
   }

   @Override
   public void a(aic $$0) {
      zo.a($$0, this, this.f.B());
      if ($$0.e() == aic.a.a) {
         ale $$1 = Objects.requireNonNull($$0.f());
         ag $$2 = this.d.aD().a($$1);
         if ($$2 != null) {
            this.f.T().a($$2);
         }
      }
   }

   @Override
   public void a(ahe $$0) {
      zo.a($$0, this, this.f.B());
      StringReader $$1 = new StringReader($$0.e());
      if ($$1.canRead() && $$1.peek() == '/') {
         $$1.skip();
      }

      ParseResults<eu> $$2 = this.d.aG().a().parse($$1, this.f.dk());
      this.d.aG().a().getCompletionSuggestions($$2).thenAccept($$1x -> {
         Suggestions $$2x = $$1x.getList().size() <= 1000 ? $$1x : new Suggestions($$1x.getRange(), $$1x.getList().subList(0, 1000));
         this.b(new acs($$0.b(), $$2x));
      });
   }

   @Override
   public void a(aih $$0) {
      zo.a($$0, this, this.f.B());
      if (!this.d.q()) {
         this.f.a(xe.c("advMode.notEnabled"));
      } else if (!this.f.gA()) {
         this.f.a(xe.c("advMode.notAllowed"));
      } else {
         ddj $$1 = null;
         dsf $$2 = null;
         jf $$3 = $$0.b();
         drv $$4 = this.f.dS().c_($$3);
         if ($$4 instanceof dsf) {
            $$2 = (dsf)$$4;
            $$1 = $$2.b();
         }

         String $$5 = $$0.e();
         boolean $$6 = $$0.f();
         if ($$1 != null) {
            dsf.a $$7 = $$2.t();
            dus $$8 = this.f.dS().a_($$3);
            jk $$9 = $$8.c(div.b);

            dus $$10 = switch ($$0.i()) {
               case a -> dho.kH.n();
               case b -> dho.kG.n();
               default -> dho.fN.n();
            };
            dus $$11 = $$10.b(div.b, $$9).b(div.c, Boolean.valueOf($$0.g()));
            if ($$11 != $$8) {
               this.f.dS().a($$3, $$11, 2);
               $$4.c($$11);
               this.f.dS().m($$3).a($$4);
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
            if (!bac.b($$5)) {
               this.f.a(xe.a("advMode.setCommand.success", $$5));
            }
         }
      }
   }

   @Override
   public void a(aii $$0) {
      zo.a($$0, this, this.f.B());
      if (!this.d.q()) {
         this.f.a(xe.c("advMode.notEnabled"));
      } else if (!this.f.gA()) {
         this.f.a(xe.c("advMode.notAllowed"));
      } else {
         ddj $$1 = $$0.a(this.f.dS());
         if ($$1 != null) {
            $$1.a($$0.b());
            $$1.a($$0.e());
            if (!$$0.e()) {
               $$1.c(null);
            }

            $$1.f();
            this.f.a(xe.a("advMode.setCommand.success", $$0.b()));
         }
      }
   }

   @Override
   public void a(aht $$0) {
      zo.a($$0, this, this.f.B());
      this.f.gd().c($$0.b());
      int $$1 = this.f.gd().j;
      this.f.c.b(this.f.gd().f($$1));
      this.f.c.b(this.f.gd().f($$0.b()));
      this.f.c.b(new afm($$1));
   }

   @Override
   public void a(aib $$0) {
      zo.a($$0, this, this.f.B());
      if (this.f.bZ instanceof crc $$1) {
         if (!$$1.b(this.f)) {
            h.debug("Player {} interacted with invalid menu {}", this.f, $$1);
            return;
         }

         $$1.a($$0.b());
      }
   }

   @Override
   public void a(aif $$0) {
      zo.a($$0, this, this.f.B());
      if (this.f.bZ instanceof cre $$1) {
         if (!this.f.bZ.b(this.f)) {
            h.debug("Player {} interacted with invalid menu {}", this.f, this.f.bZ);
            return;
         }

         $$1.a($$0.b(), $$0.e());
      }
   }

   @Override
   public void a(ail $$0) {
      zo.a($$0, this, this.f.B());
      if (this.f.gA()) {
         jf $$1 = $$0.b();
         dus $$2 = this.f.dS().a_($$1);
         if (this.f.dS().c_($$1) instanceof dtm $$4) {
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
               if ($$0.e() == dtm.a.b) {
                  if ($$4.A()) {
                     this.f.a(xe.a("structure_block.save_success", $$5), false);
                  } else {
                     this.f.a(xe.a("structure_block.save_failure", $$5), false);
                  }
               } else if ($$0.e() == dtm.a.c) {
                  if (!$$4.C()) {
                     this.f.a(xe.a("structure_block.load_not_found", $$5), false);
                  } else if ($$4.a(this.f.B())) {
                     this.f.a(xe.a("structure_block.load_success", $$5), false);
                  } else {
                     this.f.a(xe.a("structure_block.load_prepare", $$5), false);
                  }
               } else if ($$0.e() == dtm.a.d) {
                  if ($$4.z()) {
                     this.f.a(xe.a("structure_block.size_success", $$5), false);
                  } else {
                     this.f.a(xe.c("structure_block.size_failure"), false);
                  }
               }
            } else {
               this.f.a(xe.a("structure_block.invalid_structure_name", $$0.g()), false);
            }

            $$4.e();
            this.f.dS().a($$1, $$2, $$2, 3);
         }
      }
   }

   @Override
   public void a(aik $$0) {
      zo.a($$0, this, this.f.B());
      if (this.f.gA()) {
         jf $$1 = $$0.b();
         dus $$2 = this.f.dS().a_($$1);
         if (this.f.dS().c_($$1) instanceof dsx $$4) {
            $$4.a($$0.e());
            $$4.b($$0.f());
            $$4.a(ald.a(lw.aW, $$0.g()));
            $$4.a($$0.h());
            $$4.a($$0.i());
            $$4.a($$0.k());
            $$4.b($$0.j());
            $$4.e();
            this.f.dS().a($$1, $$2, $$2, 3);
         }
      }
   }

   @Override
   public void a(aho $$0) {
      zo.a($$0, this, this.f.B());
      if (this.f.gA()) {
         jf $$1 = $$0.b();
         if (this.f.dS().c_($$1) instanceof dsx $$3) {
            $$3.a(this.f.B(), $$0.e(), $$0.f());
         }
      }
   }

   @Override
   public void a(aie $$0) {
      zo.a($$0, this, this.f.B());
      int $$1 = $$0.b();
      if (this.f.bZ instanceof csk $$2) {
         if (!$$2.b(this.f)) {
            h.debug("Player {} interacted with invalid menu {}", this.f, $$2);
            return;
         }

         $$2.e($$1);
         $$2.h($$1);
      }
   }

   @Override
   public void a(ahl $$0) {
      int $$1 = $$0.b();
      if (cnw.d($$1) || $$1 == 40) {
         List<String> $$2 = Lists.newArrayList();
         Optional<String> $$3 = $$0.f();
         $$3.ifPresent($$2::add);
         $$2.addAll($$0.e());
         Consumer<List<asb>> $$4 = $$3.isPresent() ? $$1x -> this.a((asb)$$1x.get(0), $$1x.subList(1, $$1x.size()), $$1) : $$1x -> this.a($$1x, $$1);
         this.a($$2).thenAcceptAsync($$4, this.d);
      }
   }

   private void a(List<asb> $$0, int $$1) {
      cvs $$2 = this.f.gd().a($$1);
      if ($$2.a(cvw.ua)) {
         List<asa<String>> $$3 = $$0.stream().map(this::a).toList();
         $$2.b(ks.N, new czd($$3));
      }
   }

   private void a(asb $$0, List<asb> $$1, int $$2) {
      cvs $$3 = this.f.gd().a($$2);
      if ($$3.a(cvw.ua)) {
         cvs $$4 = $$3.a((dei)cvw.ub);
         $$4.c(ks.N);
         List<asa<xe>> $$5 = $$1.stream().map($$0x -> this.a($$0x).a(xe::b)).toList();
         $$4.b(ks.O, new cze(this.a($$0), this.f.aj().getString(), 0, $$5, true));
         this.f.gd().a($$2, $$4);
      }
   }

   private asa<String> a(asb $$0) {
      return this.f.ab() ? asa.a($$0.b()) : asa.a($$0);
   }

   @Override
   public void a(ahm $$0) {
      zo.a($$0, this, this.f.B());
      if (this.f.l(2)) {
         btr $$1 = this.f.dS().a($$0.e());
         if ($$1 != null) {
            ug $$2 = $$1.f(new ug());
            this.f.c.b(new agd($$0.b(), $$2));
         }
      }
   }

   @Override
   public void a(ahj $$0) {
      zo.a($$0, this, this.f.B());
      if (!this.f.Q_() && $$0.e() == this.f.bZ.l) {
         if (this.f.bZ instanceof crp $$1 && $$1.m() instanceof dsj $$2) {
            $$2.a($$0.b(), $$0.f());
         }
      }
   }

   @Override
   public void a(agu $$0) {
      zo.a($$0, this, this.f.B());
      if (this.f.l(2)) {
         drv $$1 = this.f.dS().c_($$0.e());
         ug $$2 = $$1 != null ? $$1.d(this.f.dU()) : null;
         this.f.c.b(new agd($$0.b(), $$2));
      }
   }

   @Override
   public void a(ahq $$0) {
      zo.a($$0, this, this.f.B());
      if (b($$0.a(0.0), $$0.b(0.0), $$0.c(0.0), $$0.a(0.0F), $$0.b(0.0F))) {
         this.a(xe.c("multiplayer.disconnect.invalid_player_movement"));
      } else {
         arj $$1 = this.f.B();
         if (!this.f.h) {
            if (this.o == 0) {
               this.l();
            }

            if (!this.p()) {
               double $$2 = a($$0.a(this.f.dx()));
               double $$3 = b($$0.b(this.f.dz()));
               double $$4 = a($$0.c(this.f.dD()));
               float $$5 = azf.h($$0.a(this.f.dI()));
               float $$6 = azf.h($$0.b(this.f.dK()));
               if (this.f.bW()) {
                  this.f.a(this.f.dx(), this.f.dz(), this.f.dD(), $$5, $$6);
                  this.f.B().l().a(this.f);
               } else {
                  double $$7 = this.f.dx();
                  double $$8 = this.f.dz();
                  double $$9 = this.f.dD();
                  double $$10 = $$2 - this.s;
                  double $$11 = $$3 - this.t;
                  double $$12 = $$4 - this.u;
                  double $$13 = this.f.dv().h();
                  double $$14 = $$10 * $$10 + $$11 * $$11 + $$12 * $$12;
                  if (this.f.fN()) {
                     if ($$14 > 1.0) {
                        this.a(this.f.dx(), this.f.dz(), this.f.dD(), $$5, $$6);
                     }
                  } else {
                     boolean $$15 = this.f.fF();
                     if ($$1.s().i()) {
                        this.M++;
                        int $$16 = this.M - this.N;
                        if ($$16 > 5) {
                           h.debug("{} is sending move packets too frequently ({} packets since last tick)", this.f.aj().getString(), $$16);
                           $$16 = 1;
                        }

                        if (!this.f.R() && (!this.f.dS().ac().b(def.t) || !$$15)) {
                           float $$17 = $$15 ? 300.0F : 100.0F;
                           if ($$14 - $$13 > (double)($$17 * (float)$$16) && !this.h()) {
                              h.warn("{} moved too quickly! {},{},{}", new Object[]{this.f.aj().getString(), $$10, $$11, $$12});
                              this.a(this.f.dx(), this.f.dz(), this.f.dD(), this.f.dI(), this.f.dK());
                              return;
                           }
                        }
                     }

                     eyr $$18 = this.f.cO();
                     $$10 = $$2 - this.v;
                     $$11 = $$3 - this.w;
                     $$12 = $$4 - this.x;
                     boolean $$19 = $$11 > 0.0;
                     if (this.f.aH() && !$$0.b() && $$19) {
                        this.f.v();
                     }

                     boolean $$20 = this.f.S;
                     this.f.a(bur.b, new eyw($$10, $$11, $$12));
                     $$10 = $$2 - this.f.dx();
                     $$11 = $$3 - this.f.dz();
                     if ($$11 > -0.5 || $$11 < 0.5) {
                        $$11 = 0.0;
                     }

                     $$12 = $$4 - this.f.dD();
                     $$14 = $$10 * $$10 + $$11 * $$11 + $$12 * $$12;
                     boolean $$22 = false;
                     if (!this.f.R() && $$14 > 0.0625 && !this.f.fN() && !this.f.e.e() && this.f.e.b() != deg.d) {
                        $$22 = true;
                        h.warn("{} moved wrongly!", this.f.aj().getString());
                     }

                     if (this.f.ae || this.f.fN() || (!$$22 || !$$1.a(this.f, $$18)) && !this.a($$1, $$18, $$2, $$3, $$4)) {
                        this.f.a($$2, $$3, $$4, $$5, $$6);
                        boolean $$23 = this.f.fr();
                        this.I = $$11 >= -0.03125
                           && !$$20
                           && this.f.e.b() != deg.d
                           && !this.d.ad()
                           && !this.f.ge().c
                           && !this.f.b(bta.y)
                           && !$$15
                           && !$$23
                           && this.b(this.f);
                        this.f.B().l().a(this.f);
                        eyw $$24 = new eyw(this.f.dx() - $$7, this.f.dz() - $$8, this.f.dD() - $$9);
                        this.f.a($$0.b(), $$0.e(), $$24);
                        this.f.a(this.f.dx() - $$7, this.f.dz() - $$8, this.f.dD() - $$9, $$0.b());
                        this.a($$24);
                        if ($$19) {
                           this.f.n();
                        }

                        if ($$0.b() || this.f.ec() || this.f.q_() || this.f.Q_() || $$15 || $$23) {
                           this.f.gG();
                        }

                        this.f.b(this.f.dx() - $$7, this.f.dz() - $$8, this.f.dD() - $$9);
                        this.v = this.f.dx();
                        this.w = this.f.dz();
                        this.x = this.f.dD();
                     } else {
                        this.a($$7, $$8, $$9, $$5, $$6);
                        this.f.a(this.f.dx() - $$7, this.f.dz() - $$8, this.f.dD() - $$9, $$0.b());
                     }
                  }
               }
            }
         }
      }
   }

   private boolean p() {
      if (this.F != null) {
         if (this.o - this.H > 20) {
            this.H = this.o;
            this.a(this.F.d, this.F.e, this.F.f, this.f.dI(), this.f.dK());
         }

         return true;
      } else {
         this.H = this.o;
         return false;
      }
   }

   private boolean a(dem $$0, eyr $$1, double $$2, double $$3, double $$4) {
      eyr $$5 = this.f.cO().d($$2 - this.f.dx(), $$3 - this.f.dz(), $$4 - this.f.dD());
      Iterable<ezq> $$6 = $$0.d(this.f, $$5.h(1.0E-5F));
      ezq $$7 = ezn.a($$1.h(1.0E-5F));

      for (ezq $$8 : $$6) {
         if (!ezn.c($$8, $$7, eza.i)) {
            return true;
         }
      }

      return false;
   }

   public void a(double $$0, double $$1, double $$2, float $$3, float $$4) {
      this.a($$0, $$1, $$2, $$3, $$4, Collections.emptySet());
   }

   public void a(double $$0, double $$1, double $$2, float $$3, float $$4, Set<bva> $$5) {
      double $$6 = $$5.contains(bva.a) ? this.f.dx() : 0.0;
      double $$7 = $$5.contains(bva.b) ? this.f.dz() : 0.0;
      double $$8 = $$5.contains(bva.c) ? this.f.dD() : 0.0;
      float $$9 = $$5.contains(bva.d) ? this.f.dI() : 0.0F;
      float $$10 = $$5.contains(bva.e) ? this.f.dK() : 0.0F;
      this.F = new eyw($$0, $$1, $$2);
      if (++this.G == Integer.MAX_VALUE) {
         this.G = 0;
      }

      this.H = this.o;
      this.f.a($$0, $$1, $$2, $$3, $$4);
      this.f.c.b(new aej($$0 - $$6, $$1 - $$7, $$2 - $$8, $$3 - $$9, $$4 - $$10, $$5, this.G));
   }

   @Override
   public void a(ahw $$0) {
      zo.a($$0, this, this.f.B());
      jf $$1 = $$0.b();
      this.f.I();
      ahw.a $$2 = $$0.f();
      switch ($$2) {
         case g:
            if (!this.f.Q_()) {
               cvs $$3 = this.f.b(brr.b);
               this.f.a(brr.b, this.f.b(brr.a));
               this.f.a(brr.a, $$3);
               this.f.fB();
            }

            return;
         case e:
            if (!this.f.Q_()) {
               this.f.a(false);
            }

            return;
         case d:
            if (!this.f.Q_()) {
               this.f.a(true);
            }

            return;
         case f:
            this.f.fA();
            return;
         case a:
         case b:
         case c:
            this.f.e.a($$1, $$2, $$0.e(), this.f.dS().an(), $$0.g());
            this.f.c.a($$0.g());
            return;
         default:
            throw new IllegalArgumentException("Invalid player action");
      }
   }

   private static boolean a(ark $$0, cvs $$1) {
      if ($$1.f()) {
         return false;
      } else {
         cvn $$2 = $$1.h();
         return ($$2 instanceof ctu || $$2 instanceof cua) && !$$0.gy().a($$1);
      }
   }

   @Override
   public void a(aip $$0) {
      zo.a($$0, this, this.f.B());
      this.f.c.a($$0.f());
      arj $$1 = this.f.B();
      brr $$2 = $$0.b();
      cvs $$3 = this.f.b($$2);
      if ($$3.a($$1.J())) {
         eys $$4 = $$0.e();
         eyw $$5 = $$4.g();
         jf $$6 = $$4.b();
         if (this.f.a($$6, 1.0)) {
            eyw $$7 = $$5.d(eyw.b($$6));
            double $$8 = 1.0000001;
            if (Math.abs($$7.a()) < 1.0000001 && Math.abs($$7.b()) < 1.0000001 && Math.abs($$7.c()) < 1.0000001) {
               jk $$9 = $$4.c();
               this.f.I();
               int $$10 = this.f.dS().an();
               if ($$6.v() <= $$10) {
                  if (this.F == null && $$1.a(this.f, $$6)) {
                     brs $$11 = this.f.e.a(this.f, $$1, $$3, $$2, $$4);
                     if ($$11.a()) {
                        an.P.a(this.f, $$4.b(), $$3.u());
                     }

                     if ($$9 == jk.b && !$$11.a() && $$6.v() >= $$10 && a(this.f, $$3)) {
                        xe $$12 = xe.a("build.tooHigh", $$10).a(n.m);
                        this.f.b($$12, true);
                     } else if ($$11 instanceof brs.d $$13 && $$13.e() == brs.e.c) {
                        this.f.a($$2, true);
                     }
                  }
               } else {
                  xe $$14 = xe.a("build.tooHigh", $$10).a(n.m);
                  this.f.b($$14, true);
               }

               this.f.c.b(new acj($$1, $$6));
               this.f.c.b(new acj($$1, $$6.a($$9)));
            } else {
               h.warn("Rejecting UseItemOnPacket from {}: Location {} too far away from hit block {}.", new Object[]{this.f.gc().getName(), $$5, $$6});
            }
         }
      }
   }

   @Override
   public void a(aiq $$0) {
      zo.a($$0, this, this.f.B());
      this.a($$0.e());
      arj $$1 = this.f.B();
      brr $$2 = $$0.b();
      cvs $$3 = this.f.b($$2);
      this.f.I();
      if (!$$3.f() && $$3.a($$1.J())) {
         float $$4 = azf.h($$0.f());
         float $$5 = azf.h($$0.g());
         if ($$5 != this.f.dK() || $$4 != this.f.dI()) {
            this.f.b($$4, $$5);
         }

         if (this.f.e.a(this.f, $$1, $$3, $$2) instanceof brs.d $$7 && $$7.e() == brs.e.c) {
            this.f.a($$2, true);
         }
      }
   }

   @Override
   public void a(aio $$0) {
      zo.a($$0, this, this.f.B());
      if (this.f.Q_()) {
         for (arj $$1 : this.d.L()) {
            btr $$2 = $$0.a($$1);
            if ($$2 != null) {
               this.f.a($$1, $$2.dx(), $$2.dz(), $$2.dD(), $$2.dI(), $$2.dK(), true);
               return;
            }
         }
      }
   }

   @Override
   public void a(ahs $$0) {
      zo.a($$0, this, this.f.B());
      if (this.f.dh() instanceof cpx $$2) {
         $$2.b($$0.b(), $$0.e());
      }
   }

   @Override
   public void a(wa $$0) {
      h.info("{} lost connection: {}", this.f.aj().getString(), $$0.a().getString());
      this.q();
      super.a($$0);
   }

   private void q() {
      this.T.close();
      this.d.av();
      this.d.ag().a(xe.a("multiplayer.player.left", this.f.R_()).a(n.o), false);
      this.f.w();
      this.d.ag().c(this.f);
      this.f.aa().b();
   }

   public void a(int $$0) {
      if ($$0 < 0) {
         throw new IllegalArgumentException("Expected packet sequence nr >= 0");
      } else {
         this.p = Math.max($$0, this.p);
      }
   }

   @Override
   public void a(aig $$0) {
      zo.a($$0, this, this.f.B());
      if ($$0.b() >= 0 && $$0.b() < cnw.g()) {
         if (this.f.gd().j != $$0.b() && this.f.fw() == brr.a) {
            this.f.fB();
         }

         this.f.gd().j = $$0.b();
         this.f.I();
      } else {
         h.warn("{} tried to set an invalid carried item", this.f.aj().getString());
      }
   }

   @Override
   public void a(agz $$0) {
      Optional<xl> $$1 = this.a($$0.h());
      if (!$$1.isEmpty()) {
         this.a($$0.b(), () -> {
            xu $$2;
            try {
               $$2 = this.a($$0, $$1.get());
            } catch (xy.a var6) {
               this.a(var6);
               return;
            }

            CompletableFuture<asb> $$5 = this.a($$2.c());
            xe $$6 = this.d.bl().decorate(this.f, $$2.d());
            this.T.append($$5, $$2x -> {
               xu $$3 = $$2.a($$6).a($$2x.e());
               this.b($$3);
            });
         });
      }
   }

   @Override
   public void a(agx $$0) {
      this.a($$0.b(), () -> {
         this.b($$0.b());
         this.r();
      });
   }

   private void b(String $$0) {
      ParseResults<eu> $$1 = this.c($$0);
      if (this.d.aA() && xw.a($$1)) {
         h.error("Received unsigned command packet from {}, but the command requires signable arguments: {}", this.f.gc().getName(), $$0);
         this.f.a(m);
      } else {
         this.d.aG().a($$1, $$0);
      }
   }

   @Override
   public void a(agy $$0) {
      Optional<xl> $$1 = this.a($$0.h());
      if (!$$1.isEmpty()) {
         this.a($$0.b(), () -> {
            this.a($$0, $$1.get());
            this.r();
         });
      }
   }

   private void a(agy $$0, xl $$1) {
      ParseResults<eu> $$2 = this.c($$0.b());

      Map<String, xu> $$3;
      try {
         $$3 = this.a($$0, xw.b($$2), $$1);
      } catch (xy.a var6) {
         this.a(var6);
         return;
      }

      es $$6 = new es.a($$3);
      $$2 = ev.a($$2, $$1x -> $$1x.a($$6, this.T));
      this.d.aG().a($$2, $$0.b());
   }

   private void a(xy.a $$0) {
      h.warn("Failed to update secure chat state for {}: '{}'", this.f.gc().getName(), $$0.a().getString());
      this.f.a($$0.a().f().a(n.m));
   }

   private <S> Map<String, xu> a(agy $$0, xw<S> $$1, xl $$2) throws xy.a {
      List<fb.a> $$3 = $$0.g().a();
      List<xw.a<S>> $$4 = $$1.a();
      if ($$3.isEmpty()) {
         return this.b($$4);
      } else {
         Map<String, xu> $$5 = new Object2ObjectOpenHashMap();

         for (fb.a $$6 : $$3) {
            xw.a<S> $$7 = $$1.a($$6.a());
            if ($$7 == null) {
               this.Q.setChainBroken();
               throw a($$0.b(), $$3, $$4);
            }

            xx $$8 = new xx($$7.c(), $$0.e(), $$0.f(), $$2);
            $$5.put($$7.a(), this.Q.unpack($$6.b(), $$8));
         }

         for (xw.a<S> $$9 : $$4) {
            if (!$$5.containsKey($$9.a())) {
               throw a($$0.b(), $$3, $$4);
            }
         }

         return $$5;
      }
   }

   private <S> Map<String, xu> b(List<xw.a<S>> $$0) throws xy.a {
      Map<String, xu> $$1 = new HashMap<>();

      for (xw.a<S> $$2 : $$0) {
         xx $$3 = xx.a($$2.c());
         $$1.put($$2.a(), this.Q.unpack(null, $$3));
      }

      return $$1;
   }

   private static <S> xy.a a(String $$0, List<fb.a> $$1, List<xw.a<S>> $$2) {
      String $$3 = $$1.stream().map(fb.a::a).collect(Collectors.joining(", "));
      String $$4 = $$2.stream().map(xw.a::a).collect(Collectors.joining(", "));
      h.error("Signed command mismatch between server and client ('{}'): got [{}] from client, but expected [{}]", new Object[]{$$0, $$3, $$4});
      return new xy.a(m);
   }

   private ParseResults<eu> c(String $$0) {
      CommandDispatcher<eu> $$1 = this.d.aG().a();
      return $$1.parse($$0, this.f.dk());
   }

   private void a(String $$0, Runnable $$1) {
      if (d($$0)) {
         this.a(xe.c("multiplayer.disconnect.illegal_characters"));
      } else if (this.f.F() == cnv.c) {
         this.b(new agb(xe.c("chat.disabled.options").a(n.m), false));
      } else {
         this.f.I();
         this.d.execute($$1);
      }
   }

   private Optional<xl> a(xl.b $$0) {
      synchronized (this.R) {
         Optional<xl> $$1 = this.R.a($$0);
         if ($$1.isEmpty()) {
            h.warn("Failed to validate message acknowledgements from {}", this.f.aj().getString());
            this.a(l);
         }

         return $$1;
      }
   }

   private static boolean d(String $$0) {
      for (int $$1 = 0; $$1 < $$0.length(); $$1++) {
         if (!bac.a($$0.charAt($$1))) {
            return true;
         }
      }

      return false;
   }

   private xu a(agz $$0, xl $$1) throws xy.a {
      xx $$2 = new xx($$0.b(), $$0.e(), $$0.f(), $$1);
      return this.Q.unpack($$0.g(), $$2);
   }

   private void b(xu $$0) {
      this.d.ag().a($$0, this.f, xa.a(xa.e, this.f));
      this.r();
   }

   private void r() {
      this.q += 20;
      if (this.q > 200 && !this.d.ag().f(this.f.gc()) && !this.d.a(this.f.gc())) {
         this.a(xe.c("disconnect.spam"));
      }
   }

   @Override
   public void a(agw $$0) {
      synchronized (this.R) {
         if (!this.R.a($$0.b())) {
            h.warn("Failed to validate message acknowledgements from {}", this.f.aj().getString());
            this.a(l);
         }
      }
   }

   @Override
   public void a(ain $$0) {
      zo.a($$0, this, this.f.B());
      this.f.I();
      this.f.a($$0.b());
   }

   @Override
   public void a(ahx $$0) {
      zo.a($$0, this, this.f.B());
      this.f.I();
      switch ($$0.e()) {
         case a:
            this.f.g(true);
            break;
         case b:
            this.f.g(false);
            break;
         case d:
            this.f.h(true);
            break;
         case e:
            this.f.h(false);
            break;
         case c:
            if (this.f.fN()) {
               this.f.a(false, true);
               this.F = this.f.dq();
            }
            break;
         case f:
            if (this.f.dh() instanceof bux $$1) {
               int $$2 = $$0.f();
               if ($$1.a() && $$2 > 0) {
                  $$1.c($$2);
               }
            }
            break;
         case g:
            if (this.f.dh() instanceof bux $$3) {
               $$3.b();
            }
            break;
         case h:
            if (this.f.dg() instanceof bug $$4) {
               $$4.b(this.f);
            }
            break;
         case i:
            if (!this.f.gi()) {
               this.f.gk();
            }
            break;
         default:
            throw new IllegalArgumentException("Invalid client command!");
      }
   }

   public void a(xu $$0) {
      xq $$1 = $$0.l();
      if ($$1 != null) {
         this.S.a($$0.m(), $$0.l());
         int $$2;
         synchronized (this.R) {
            this.R.a($$1);
            $$2 = this.R.a();
         }

         if ($$2 > 4096) {
            this.a(xe.c("multiplayer.disconnect.too_many_pending_chats"));
         }
      }
   }

   public void a(xu $$0, xa.a $$1) {
      this.b(new aec($$0.k().c(), $$0.k().b(), $$0.l(), $$0.m().a(this.S), $$0.n(), $$0.o(), $$1));
      this.a($$0);
   }

   public void a(xe $$0, xa.a $$1) {
      this.b(new add($$0, $$1));
   }

   public SocketAddress m() {
      return this.e.d();
   }

   public void n() {
      this.U = true;
      this.q();
      this.b(afz.a);
      this.e.a(abp.d);
   }

   @Override
   public void a(ajx $$0) {
      this.e.a(new aju($$0.b()));
   }

   @Override
   public void a(ahn $$0) {
      zo.a($$0, this, this.f.B());
      final arj $$1 = this.f.B();
      final btr $$2 = $$0.a($$1);
      this.f.I();
      this.f.g($$0.b());
      if ($$2 != null) {
         if (!$$1.B_().a($$2.ds())) {
            return;
         }

         eyr $$3 = $$2.cO();
         if (this.f.a($$3, 1.0)) {
            $$0.a(new ahn.c() {
               private void a(brr $$0, asl.a $$1x) {
                  cvs $$2 = asl.this.f.b($$0);
                  if ($$2.a($$1.J())) {
                     cvs $$3 = $$2.u();
                     if ($$1.run(asl.this.f, $$2, $$0) instanceof brs.d $$5) {
                        cvs $$6 = $$5.c() ? $$3 : cvs.k;
                        an.T.a(asl.this.f, $$6, $$2);
                        if ($$5.e() == brs.e.c) {
                           asl.this.f.a($$0, true);
                        }
                     }
                  }
               }

               @Override
               public void a(brr $$0) {
                  this.a($$0, cnx::a);
               }

               @Override
               public void a(brr $$0, eyw $$1x) {
                  this.a($$0, ($$1xxx, $$2xx, $$3) -> $$2xx.a($$1xxx, $$1, $$3));
               }

               @Override
               public void a() {
                  label23:
                  if (!($$2 instanceof ckh) && !($$2 instanceof bud) && $$2 != asl.this.f) {
                     if ($$2 instanceof coe $$0 && !$$0.cy()) {
                        break label23;
                     }

                     cvs $$1 = asl.this.f.b(brr.a);
                     if (!$$1.a($$1.J())) {
                        return;
                     }

                     asl.this.f.e($$2);
                     return;
                  }

                  asl.this.a(xe.c("multiplayer.disconnect.invalid_entity_attacked"));
                  asl.h.warn("Player {} tried to attack an invalid entity", asl.this.f.aj().getString());
               }
            });
         }
      }
   }

   @Override
   public void a(ahc $$0) {
      zo.a($$0, this, this.f.B());
      this.f.I();
      ahc.a $$1 = $$0.b();
      switch ($$1) {
         case a:
            if (this.f.h) {
               this.f.h = false;
               this.f = this.d.ag().a(this.f, true, btr.c.e);
               an.w.a(this.f, dej.j, dej.h);
            } else {
               if (this.f.eB() > 0.0F) {
                  return;
               }

               this.f = this.d.ag().a(this.f, false, btr.c.a);
               if (this.d.j()) {
                  this.f.a(deg.d);
                  this.f.dS().ac().a(def.r).a(false, this.d);
               }
            }
            break;
         case b:
            this.f.J().a(this.f);
      }
   }

   @Override
   public void a(ahi $$0) {
      zo.a($$0, this, this.f.B());
      this.f.t();
   }

   @Override
   public void a(ahh $$0) {
      zo.a($$0, this, this.f.B());
      this.f.I();
      if (this.f.bZ.l == $$0.b()) {
         if (this.f.Q_()) {
            this.f.bZ.b();
         } else if (!this.f.bZ.b(this.f)) {
            h.debug("Player {} interacted with invalid menu {}", this.f, this.f.bZ);
         } else {
            int $$1 = $$0.e();
            if (!this.f.bZ.a($$1)) {
               h.debug("Player {} clicked invalid slot index: {}, available slots: {}", new Object[]{this.f.aj(), $$1, this.f.bZ.k.size()});
            } else {
               boolean $$2 = $$0.j() != this.f.bZ.j();
               this.f.bZ.h();
               this.f.bZ.a($$1, $$0.f(), $$0.i(), this.f);
               ObjectIterator var4 = Int2ObjectMaps.fastIterable($$0.h()).iterator();

               while (var4.hasNext()) {
                  Entry<cvs> $$3 = (Entry<cvs>)var4.next();
                  this.f.bZ.b($$3.getIntKey(), (cvs)$$3.getValue());
               }

               this.f.bZ.a($$0.g());
               this.f.bZ.i();
               if ($$2) {
                  this.f.bZ.e();
               } else {
                  this.f.bZ.d();
               }
            }
         }
      }
   }

   @Override
   public void a(ahu $$0) {
      zo.a($$0, this, this.f.B());
      this.f.I();
      if (!this.f.Q_() && this.f.bZ.l == $$0.b()) {
         if (!this.f.bZ.b(this.f)) {
            h.debug("Player {} interacted with invalid menu {}", this.f, this.f.bZ);
         } else if (this.f.K().b($$0.e())) {
            if (this.f.bZ instanceof cso $$1) {
               this.d.aI().a($$0.e()).ifPresent($$2 -> {
                  if ($$2.b().a().c()) {
                     h.debug("Player {} tried to place impossible recipe {}", this.f, $$2.a());
                  } else {
                     cso.a $$3 = $$1.a($$0.f(), this.f.f(), (dam<?>)$$2, this.f.gd());
                     if ($$3 == cso.a.b) {
                        this.f.c.b(new aea(this.f.bZ.l, (dam<?>)$$2));
                     }
                  }
               });
            }
         }
      }
   }

   @Override
   public void a(ahg $$0) {
      zo.a($$0, this, this.f.B());
      this.f.I();
      if (this.f.bZ.l == $$0.b() && !this.f.Q_()) {
         if (!this.f.bZ.b(this.f)) {
            h.debug("Player {} interacted with invalid menu {}", this.f, this.f.bZ);
         } else {
            boolean $$1 = this.f.bZ.a(this.f, $$0.e());
            if ($$1) {
               this.f.bZ.d();
            }
         }
      }
   }

   @Override
   public void a(aij $$0) {
      zo.a($$0, this, this.f.B());
      if (this.f.e.e()) {
         boolean $$1 = $$0.b() < 0;
         cvs $$2 = $$0.e();
         if (!$$2.a(this.f.dS().J())) {
            return;
         }

         cyh $$3 = $$2.a(ks.T, cyh.a);
         if ($$3.a("x") && $$3.a("y") && $$3.a("z")) {
            jf $$4 = drv.b($$3.d());
            if (this.f.dS().p($$4)) {
               drv $$5 = this.f.dS().c_($$4);
               if ($$5 != null) {
                  $$5.a($$2, this.f.dS().G_());
               }
            }
         }

         boolean $$6 = $$0.b() >= 1 && $$0.b() <= 45;
         boolean $$7 = $$2.f() || $$2.K() <= $$2.k();
         if ($$6 && $$7) {
            this.f.bY.b($$0.b()).e($$2);
            this.f.bY.d();
         } else if ($$1 && $$7 && this.r < 200) {
            this.r += 20;
            this.f.a($$2, true);
         }
      }
   }

   @Override
   public void a(aim $$0) {
      List<String> $$1 = Stream.of($$0.f()).map(n::a).collect(Collectors.toList());
      this.a($$1).thenAcceptAsync($$1x -> this.a($$0, $$1x), this.d);
   }

   private void a(aim $$0, List<asb> $$1) {
      this.f.I();
      arj $$2 = this.f.B();
      jf $$3 = $$0.b();
      if ($$2.B($$3)) {
         if (!($$2.c_($$3) instanceof dth $$5)) {
            return;
         }

         $$5.a(this.f, $$0.e(), $$1);
      }
   }

   @Override
   public void a(ahv $$0) {
      zo.a($$0, this, this.f.B());
      this.f.ge().b = $$0.b() && this.f.ge().c;
   }

   @Override
   public void a(aaf $$0) {
      zo.a($$0, this, this.f.B());
      this.f.a($$0.b());
   }

   @Override
   public void a(agv $$0) {
      zo.a($$0, this, this.f.B());
      if (this.f.l(2) || this.h()) {
         this.d.a($$0.b(), false);
      }
   }

   @Override
   public void a(ahp $$0) {
      zo.a($$0, this, this.f.B());
      if (this.f.l(2) || this.h()) {
         this.d.b($$0.b());
      }
   }

   @Override
   public void a(aha $$0) {
      zo.a($$0, this, this.f.B());
      xv.a $$1 = $$0.b();
      coa.a $$2 = this.P != null ? this.P.d().b() : null;
      coa.a $$3 = $$1.b();
      if (!Objects.equals($$2, $$3)) {
         if ($$2 != null && $$3.b().isBefore($$2.b())) {
            this.a(coa.a);
         } else {
            try {
               azs $$4 = this.d.ar();
               if ($$4 == null) {
                  h.warn("Ignoring chat session from {} due to missing Services public key", this.f.gc().getName());
                  return;
               }

               this.a($$1.a(this.f.gc(), $$4));
            } catch (coa.b var6) {
               h.error("Failed to validate profile key: {}", var6.getMessage());
               this.a(var6.a());
            }
         }
      }
   }

   @Override
   public void a(ahf $$0) {
      if (!this.U) {
         throw new IllegalStateException("Client acknowledged config, but none was requested");
      } else {
         this.e.a(abp.b, new asj(this.d, this.e, this.a(this.f.D())));
      }
   }

   @Override
   public void a(ahb $$0) {
      zo.a($$0, this, this.f.B());
      this.g.a($$0.b());
   }

   @Override
   public void a(ahk $$0) {
      zo.a($$0, this, this.f.B());
      this.d.a(this.f, $$0.b());
   }

   private void a(xv $$0) {
      this.P = $$0;
      this.Q = $$0.a(this.f.cD());
      this.T.append(() -> {
         this.f.a($$0);
         this.d.ag().a(new aeh(EnumSet.of(aeh.a.b), List.of(this.f)));
      });
   }

   @Override
   public void a(aag $$0) {
   }

   @Override
   public void a(ahd $$0) {
      zo.a($$0, this, this.f.B());
      if (!this.O) {
         this.f.a(eyw.c);
      }

      this.O = false;
   }

   private void a(eyw $$0) {
      this.f.a($$0);
      this.f.I();
      this.O = true;
   }

   @Override
   public ark o() {
      return this.f;
   }

   @FunctionalInterface
   interface a {
      brs run(ark var1, btr var2, brr var3);
   }
}
