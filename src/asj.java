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

public class asj extends asg implements agq, asm, wr {
   static final Logger h = LogUtils.getLogger();
   private static final int i = -1;
   private static final int j = 4096;
   private static final int k = 80;
   private static final xd l = xd.c("multiplayer.disconnect.chat_validation_failed");
   private static final xd m = xd.c("chat.disabled.invalid_command_signature").a(n.m);
   private static final int n = 1000;
   public ari f;
   public final ase g;
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
   private bto y;
   private double z;
   private double A;
   private double B;
   private double C;
   private double D;
   private double E;
   @Nullable
   private eys F;
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
   private xu P;
   private xx.b Q;
   private final xm R = new xm(20);
   private final xq S = xq.a();
   private final ayr T;
   private boolean U;

   public asj(MinecraftServer $$0, vx $$1, ari $$2, arw $$3) {
      super($$0, $$1, $$3);
      this.g = new ase($$1.e());
      this.f = $$2;
      $$2.c = this;
      $$2.aa().a();
      this.Q = xx.b.unsigned($$2.cD(), $$0::aA);
      this.T = new ayr($$0);
   }

   @Override
   public void d() {
      if (this.p > -1) {
         this.b(new ace(this.p));
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
      if (this.I && !this.f.fM() && !this.f.bW() && !this.f.eB()) {
         if (++this.J > this.a((bto)this.f)) {
            h.warn("{} was kicked for floating too long!", this.f.aj().getString());
            this.a(xd.c("multiplayer.disconnect.flying"));
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
               this.a(xd.c("multiplayer.disconnect.flying"));
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
         this.a(xd.c("multiplayer.disconnect.idling"));
      }
   }

   private int a(bto $$0) {
      double $$1 = $$0.bd();
      if ($$1 < 1.0E-5F) {
         return Integer.MAX_VALUE;
      } else {
         double $$2 = 0.08 / $$1;
         return azd.c(80.0 * Math.max($$2, 1.0));
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
   public boolean a(zk<?> $$0) {
      return super.a($$0) ? true : this.U && this.e.i() && $$0 instanceof ahe;
   }

   @Override
   protected GameProfile i() {
      return this.f.gb();
   }

   private <T, R> CompletableFuture<R> a(T $$0, BiFunction<asp, T, CompletableFuture<R>> $$1) {
      return $$1.apply(this.f.aa(), $$0).thenApply($$0x -> {
         if (!this.c()) {
            h.debug("Ignoring packet due to disconnection");
            throw new CancellationException("disconnected");
         } else {
            return (R)$$0x;
         }
      });
   }

   private CompletableFuture<arz> a(String $$0) {
      return this.a($$0, asp::a);
   }

   private CompletableFuture<List<arz>> a(List<String> $$0) {
      return this.a($$0, asp::a);
   }

   @Override
   public void a(ahx $$0) {
      if (this.f.bW() && this.f.dg() instanceof cps $$1 && ((double)$$0.b() != 0.0 || (double)$$0.e() != 0.0)) {
         $$1.a(this.f, new eys((double)$$0.b(), 0.0, (double)$$0.e()));
      }
   }

   private static boolean b(double $$0, double $$1, double $$2, float $$3, float $$4) {
      return Double.isNaN($$0) || Double.isNaN($$1) || Double.isNaN($$2) || !Floats.isFinite($$4) || !Floats.isFinite($$3);
   }

   private static double a(double $$0) {
      return azd.a($$0, -3.0E7, 3.0E7);
   }

   private static double b(double $$0) {
      return azd.a($$0, -2.0E7, 2.0E7);
   }

   @Override
   public void a(ahq $$0) {
      zn.a($$0, this, this.f.B());
      if (b($$0.b(), $$0.e(), $$0.f(), $$0.g(), $$0.h())) {
         this.a(xd.c("multiplayer.disconnect.invalid_vehicle_movement"));
      } else if (!this.p()) {
         bto $$1 = this.f.dd();
         if ($$1 != this.f && $$1.cU() == this.f && $$1 == this.y) {
            arh $$2 = this.f.B();
            double $$3 = $$1.dx();
            double $$4 = $$1.dz();
            double $$5 = $$1.dD();
            double $$6 = a($$0.b());
            double $$7 = b($$0.e());
            double $$8 = a($$0.f());
            float $$9 = azd.g($$0.g());
            float $$10 = azd.g($$0.h());
            double $$11 = $$6 - this.z;
            double $$12 = $$7 - this.A;
            double $$13 = $$8 - this.B;
            double $$14 = $$1.dv().h();
            double $$15 = $$11 * $$11 + $$12 * $$12 + $$13 * $$13;
            if ($$15 - $$14 > 100.0 && !this.h()) {
               h.warn("{} (vehicle of {}) moved too quickly! {},{},{}", new Object[]{$$1.aj().getString(), this.f.aj().getString(), $$11, $$12, $$13});
               this.b(new adv($$1));
               return;
            }

            boolean $$16 = $$2.a($$1, $$1.cO().h(0.0625));
            $$11 = $$6 - this.C;
            $$12 = $$7 - this.D - 1.0E-6;
            $$13 = $$8 - this.E;
            boolean $$17 = $$1.S;
            if ($$1 instanceof buk $$18 && $$18.p_()) {
               $$18.n();
            }

            $$1.a(buo.b, new eys($$11, $$12, $$13));
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
               this.b(new adv($$1));
               return;
            }

            this.f.B().l().a(this.f);
            eys $$22 = new eys($$1.dx() - $$3, $$1.dz() - $$4, $$1.dD() - $$5);
            this.a($$22);
            this.f.b($$22.d, $$22.e, $$22.f);
            this.K = $$12 >= -0.03125 && !$$17 && !this.d.ad() && !$$1.bb() && this.b($$1);
            this.C = $$1.dx();
            this.D = $$1.dz();
            this.E = $$1.dD();
         }
      }
   }

   private boolean b(bto $$0) {
      return $$0.dS().a($$0.cO().g(0.0625).b(0.0, -0.55, 0.0)).allMatch(dun.a::l);
   }

   @Override
   public void a(ags $$0) {
      zn.a($$0, this, this.f.B());
      if ($$0.b() == this.G) {
         if (this.F == null) {
            this.a(xd.c("multiplayer.disconnect.invalid_player_movement"));
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
   public void a(ahz $$0) {
      zn.a($$0, this, this.f.B());
      this.d.aI().a($$0.b()).ifPresent(this.f.K()::e);
   }

   @Override
   public void a(aic $$0) {
      this.f.bZ.a($$0.b(), $$0.e());
   }

   @Override
   public void a(ahy $$0) {
      zn.a($$0, this, this.f.B());
      this.f.K().a($$0.b(), $$0.e(), $$0.f());
   }

   @Override
   public void a(aib $$0) {
      zn.a($$0, this, this.f.B());
      if ($$0.e() == aib.a.a) {
         alc $$1 = Objects.requireNonNull($$0.f());
         ag $$2 = this.d.aD().a($$1);
         if ($$2 != null) {
            this.f.T().a($$2);
         }
      }
   }

   @Override
   public void a(ahd $$0) {
      zn.a($$0, this, this.f.B());
      StringReader $$1 = new StringReader($$0.e());
      if ($$1.canRead() && $$1.peek() == '/') {
         $$1.skip();
      }

      ParseResults<et> $$2 = this.d.aG().a().parse($$1, this.f.dk());
      this.d.aG().a().getCompletionSuggestions($$2).thenAccept($$1x -> {
         Suggestions $$2x = $$1x.getList().size() <= 1000 ? $$1x : new Suggestions($$1x.getRange(), $$1x.getList().subList(0, 1000));
         this.b(new acr($$0.b(), $$2x));
      });
   }

   @Override
   public void a(aig $$0) {
      zn.a($$0, this, this.f.B());
      if (!this.d.q()) {
         this.f.a(xd.c("advMode.notEnabled"));
      } else if (!this.f.gz()) {
         this.f.a(xd.c("advMode.notAllowed"));
      } else {
         ddg $$1 = null;
         dsc $$2 = null;
         je $$3 = $$0.b();
         drs $$4 = this.f.dS().c_($$3);
         if ($$4 instanceof dsc) {
            $$2 = (dsc)$$4;
            $$1 = $$2.b();
         }

         String $$5 = $$0.e();
         boolean $$6 = $$0.f();
         if ($$1 != null) {
            dsc.a $$7 = $$2.t();
            duo $$8 = this.f.dS().a_($$3);
            jj $$9 = $$8.c(dis.b);

            duo $$10 = switch ($$0.i()) {
               case a -> dhl.kH.o();
               case b -> dhl.kG.o();
               default -> dhl.fN.o();
            };
            duo $$11 = $$10.b(dis.b, $$9).b(dis.c, Boolean.valueOf($$0.g()));
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
            if (!baa.b($$5)) {
               this.f.a(xd.a("advMode.setCommand.success", $$5));
            }
         }
      }
   }

   @Override
   public void a(aih $$0) {
      zn.a($$0, this, this.f.B());
      if (!this.d.q()) {
         this.f.a(xd.c("advMode.notEnabled"));
      } else if (!this.f.gz()) {
         this.f.a(xd.c("advMode.notAllowed"));
      } else {
         ddg $$1 = $$0.a(this.f.dS());
         if ($$1 != null) {
            $$1.a($$0.b());
            $$1.a($$0.e());
            if (!$$0.e()) {
               $$1.c(null);
            }

            $$1.f();
            this.f.a(xd.a("advMode.setCommand.success", $$0.b()));
         }
      }
   }

   @Override
   public void a(ahs $$0) {
      zn.a($$0, this, this.f.B());
      this.f.gc().c($$0.b());
      int $$1 = this.f.gc().j;
      this.f.c.b(this.f.gc().f($$1));
      this.f.c.b(this.f.gc().f($$0.b()));
      this.f.c.b(new afl($$1));
   }

   @Override
   public void a(aia $$0) {
      zn.a($$0, this, this.f.B());
      if (this.f.bZ instanceof cqz $$1) {
         if (!$$1.b(this.f)) {
            h.debug("Player {} interacted with invalid menu {}", this.f, $$1);
            return;
         }

         $$1.a($$0.b());
      }
   }

   @Override
   public void a(aie $$0) {
      zn.a($$0, this, this.f.B());
      if (this.f.bZ instanceof crb $$1) {
         if (!this.f.bZ.b(this.f)) {
            h.debug("Player {} interacted with invalid menu {}", this.f, this.f.bZ);
            return;
         }

         $$1.a($$0.b(), $$0.e());
      }
   }

   @Override
   public void a(aik $$0) {
      zn.a($$0, this, this.f.B());
      if (this.f.gz()) {
         je $$1 = $$0.b();
         duo $$2 = this.f.dS().a_($$1);
         if (this.f.dS().c_($$1) instanceof dtj $$4) {
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
               if ($$0.e() == dtj.a.b) {
                  if ($$4.A()) {
                     this.f.a(xd.a("structure_block.save_success", $$5), false);
                  } else {
                     this.f.a(xd.a("structure_block.save_failure", $$5), false);
                  }
               } else if ($$0.e() == dtj.a.c) {
                  if (!$$4.C()) {
                     this.f.a(xd.a("structure_block.load_not_found", $$5), false);
                  } else if ($$4.a(this.f.B())) {
                     this.f.a(xd.a("structure_block.load_success", $$5), false);
                  } else {
                     this.f.a(xd.a("structure_block.load_prepare", $$5), false);
                  }
               } else if ($$0.e() == dtj.a.d) {
                  if ($$4.z()) {
                     this.f.a(xd.a("structure_block.size_success", $$5), false);
                  } else {
                     this.f.a(xd.c("structure_block.size_failure"), false);
                  }
               }
            } else {
               this.f.a(xd.a("structure_block.invalid_structure_name", $$0.g()), false);
            }

            $$4.e();
            this.f.dS().a($$1, $$2, $$2, 3);
         }
      }
   }

   @Override
   public void a(aij $$0) {
      zn.a($$0, this, this.f.B());
      if (this.f.gz()) {
         je $$1 = $$0.b();
         duo $$2 = this.f.dS().a_($$1);
         if (this.f.dS().c_($$1) instanceof dsu $$4) {
            $$4.a($$0.e());
            $$4.b($$0.f());
            $$4.a(alb.a(lv.aV, $$0.g()));
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
   public void a(ahn $$0) {
      zn.a($$0, this, this.f.B());
      if (this.f.gz()) {
         je $$1 = $$0.b();
         if (this.f.dS().c_($$1) instanceof dsu $$3) {
            $$3.a(this.f.B(), $$0.e(), $$0.f());
         }
      }
   }

   @Override
   public void a(aid $$0) {
      zn.a($$0, this, this.f.B());
      int $$1 = $$0.b();
      if (this.f.bZ instanceof csh $$2) {
         if (!$$2.b(this.f)) {
            h.debug("Player {} interacted with invalid menu {}", this.f, $$2);
            return;
         }

         $$2.e($$1);
         $$2.h($$1);
      }
   }

   @Override
   public void a(ahk $$0) {
      int $$1 = $$0.b();
      if (cnt.d($$1) || $$1 == 40) {
         List<String> $$2 = Lists.newArrayList();
         Optional<String> $$3 = $$0.f();
         $$3.ifPresent($$2::add);
         $$2.addAll($$0.e());
         Consumer<List<arz>> $$4 = $$3.isPresent() ? $$1x -> this.a((arz)$$1x.get(0), $$1x.subList(1, $$1x.size()), $$1) : $$1x -> this.a($$1x, $$1);
         this.a($$2).thenAcceptAsync($$4, this.d);
      }
   }

   private void a(List<arz> $$0, int $$1) {
      cvp $$2 = this.f.gc().a($$1);
      if ($$2.a(cvt.ua)) {
         List<ary<String>> $$3 = $$0.stream().map(this::a).toList();
         $$2.b(kr.N, new cza($$3));
      }
   }

   private void a(arz $$0, List<arz> $$1, int $$2) {
      cvp $$3 = this.f.gc().a($$2);
      if ($$3.a(cvt.ua)) {
         cvp $$4 = $$3.a((def)cvt.ub);
         $$4.c(kr.N);
         List<ary<xd>> $$5 = $$1.stream().map($$0x -> this.a($$0x).a(xd::b)).toList();
         $$4.b(kr.O, new czb(this.a($$0), this.f.aj().getString(), 0, $$5, true));
         this.f.gc().a($$2, $$4);
      }
   }

   private ary<String> a(arz $$0) {
      return this.f.ab() ? ary.a($$0.b()) : ary.a($$0);
   }

   @Override
   public void a(ahl $$0) {
      zn.a($$0, this, this.f.B());
      if (this.f.l(2)) {
         bto $$1 = this.f.dS().a($$0.e());
         if ($$1 != null) {
            uf $$2 = $$1.f(new uf());
            this.f.c.b(new agc($$0.b(), $$2));
         }
      }
   }

   @Override
   public void a(ahi $$0) {
      zn.a($$0, this, this.f.B());
      if (!this.f.P_() && $$0.e() == this.f.bZ.l) {
         if (this.f.bZ instanceof crm $$1 && $$1.m() instanceof dsg $$2) {
            $$2.a($$0.b(), $$0.f());
         }
      }
   }

   @Override
   public void a(agt $$0) {
      zn.a($$0, this, this.f.B());
      if (this.f.l(2)) {
         drs $$1 = this.f.dS().c_($$0.e());
         uf $$2 = $$1 != null ? $$1.d(this.f.dU()) : null;
         this.f.c.b(new agc($$0.b(), $$2));
      }
   }

   @Override
   public void a(ahp $$0) {
      zn.a($$0, this, this.f.B());
      if (b($$0.a(0.0), $$0.b(0.0), $$0.c(0.0), $$0.a(0.0F), $$0.b(0.0F))) {
         this.a(xd.c("multiplayer.disconnect.invalid_player_movement"));
      } else {
         arh $$1 = this.f.B();
         if (!this.f.h) {
            if (this.o == 0) {
               this.l();
            }

            if (!this.p()) {
               double $$2 = a($$0.a(this.f.dx()));
               double $$3 = b($$0.b(this.f.dz()));
               double $$4 = a($$0.c(this.f.dD()));
               float $$5 = azd.g($$0.a(this.f.dI()));
               float $$6 = azd.g($$0.b(this.f.dK()));
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
                  if (this.f.fM()) {
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

                        if (!this.f.R() && (!this.f.dS().ac().b(dec.t) || !$$15)) {
                           float $$17 = $$15 ? 300.0F : 100.0F;
                           if ($$14 - $$13 > (double)($$17 * (float)$$16) && !this.h()) {
                              h.warn("{} moved too quickly! {},{},{}", new Object[]{this.f.aj().getString(), $$10, $$11, $$12});
                              this.a(this.f.dx(), this.f.dz(), this.f.dD(), this.f.dI(), this.f.dK());
                              return;
                           }
                        }
                     }

                     eyn $$18 = this.f.cO();
                     $$10 = $$2 - this.v;
                     $$11 = $$3 - this.w;
                     $$12 = $$4 - this.x;
                     boolean $$19 = $$11 > 0.0;
                     if (this.f.aH() && !$$0.b() && $$19) {
                        this.f.v();
                     }

                     boolean $$20 = this.f.S;
                     this.f.a(buo.b, new eys($$10, $$11, $$12));
                     $$10 = $$2 - this.f.dx();
                     $$11 = $$3 - this.f.dz();
                     if ($$11 > -0.5 || $$11 < 0.5) {
                        $$11 = 0.0;
                     }

                     $$12 = $$4 - this.f.dD();
                     $$14 = $$10 * $$10 + $$11 * $$11 + $$12 * $$12;
                     boolean $$22 = false;
                     if (!this.f.R() && $$14 > 0.0625 && !this.f.fM() && !this.f.e.e() && this.f.e.b() != ded.d) {
                        $$22 = true;
                        h.warn("{} moved wrongly!", this.f.aj().getString());
                     }

                     if (this.f.ae || this.f.fM() || (!$$22 || !$$1.a(this.f, $$18)) && !this.a($$1, $$18, $$2, $$3, $$4)) {
                        this.f.a($$2, $$3, $$4, $$5, $$6);
                        boolean $$23 = this.f.fr();
                        this.I = $$11 >= -0.03125
                           && !$$20
                           && this.f.e.b() != ded.d
                           && !this.d.ad()
                           && !this.f.gd().c
                           && !this.f.b(bsx.y)
                           && !$$15
                           && !$$23
                           && this.b(this.f);
                        this.f.B().l().a(this.f);
                        eys $$24 = new eys(this.f.dx() - $$7, this.f.dz() - $$8, this.f.dD() - $$9);
                        this.f.a($$0.b(), $$0.e(), $$24);
                        this.f.a(this.f.dx() - $$7, this.f.dz() - $$8, this.f.dD() - $$9, $$0.b());
                        this.a($$24);
                        if ($$19) {
                           this.f.n();
                        }

                        if ($$0.b() || this.f.eb() || this.f.p_() || this.f.P_() || $$15 || $$23) {
                           this.f.gF();
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

   private boolean a(dej $$0, eyn $$1, double $$2, double $$3, double $$4) {
      eyn $$5 = this.f.cO().d($$2 - this.f.dx(), $$3 - this.f.dz(), $$4 - this.f.dD());
      Iterable<ezm> $$6 = $$0.d(this.f, $$5.h(1.0E-5F));
      ezm $$7 = ezj.a($$1.h(1.0E-5F));

      for (ezm $$8 : $$6) {
         if (!ezj.c($$8, $$7, eyw.i)) {
            return true;
         }
      }

      return false;
   }

   public void a(double $$0, double $$1, double $$2, float $$3, float $$4) {
      this.a($$0, $$1, $$2, $$3, $$4, Collections.emptySet());
   }

   public void a(double $$0, double $$1, double $$2, float $$3, float $$4, Set<bux> $$5) {
      double $$6 = $$5.contains(bux.a) ? this.f.dx() : 0.0;
      double $$7 = $$5.contains(bux.b) ? this.f.dz() : 0.0;
      double $$8 = $$5.contains(bux.c) ? this.f.dD() : 0.0;
      float $$9 = $$5.contains(bux.d) ? this.f.dI() : 0.0F;
      float $$10 = $$5.contains(bux.e) ? this.f.dK() : 0.0F;
      this.F = new eys($$0, $$1, $$2);
      if (++this.G == Integer.MAX_VALUE) {
         this.G = 0;
      }

      this.H = this.o;
      this.f.a($$0, $$1, $$2, $$3, $$4);
      this.f.c.b(new aei($$0 - $$6, $$1 - $$7, $$2 - $$8, $$3 - $$9, $$4 - $$10, $$5, this.G));
   }

   @Override
   public void a(ahv $$0) {
      zn.a($$0, this, this.f.B());
      je $$1 = $$0.b();
      this.f.I();
      ahv.a $$2 = $$0.f();
      switch ($$2) {
         case g:
            if (!this.f.P_()) {
               cvp $$3 = this.f.b(bro.b);
               this.f.a(bro.b, this.f.b(bro.a));
               this.f.a(bro.a, $$3);
               this.f.fB();
            }

            return;
         case e:
            if (!this.f.P_()) {
               this.f.a(false);
            }

            return;
         case d:
            if (!this.f.P_()) {
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

   private static boolean a(ari $$0, cvp $$1) {
      if ($$1.f()) {
         return false;
      } else {
         cvk $$2 = $$1.h();
         return ($$2 instanceof ctr || $$2 instanceof ctx) && !$$0.gx().a($$1);
      }
   }

   @Override
   public void a(aio $$0) {
      zn.a($$0, this, this.f.B());
      this.f.c.a($$0.f());
      arh $$1 = this.f.B();
      bro $$2 = $$0.b();
      cvp $$3 = this.f.b($$2);
      if ($$3.a($$1.J())) {
         eyo $$4 = $$0.e();
         eys $$5 = $$4.g();
         je $$6 = $$4.b();
         if (this.f.a($$6, 1.0)) {
            eys $$7 = $$5.d(eys.b($$6));
            double $$8 = 1.0000001;
            if (Math.abs($$7.a()) < 1.0000001 && Math.abs($$7.b()) < 1.0000001 && Math.abs($$7.c()) < 1.0000001) {
               jj $$9 = $$4.c();
               this.f.I();
               int $$10 = this.f.dS().an();
               if ($$6.v() <= $$10) {
                  if (this.F == null && $$1.a(this.f, $$6)) {
                     brp $$11 = this.f.e.a(this.f, $$1, $$3, $$2, $$4);
                     if ($$11.a()) {
                        an.P.a(this.f, $$4.b(), $$3.u());
                     }

                     if ($$9 == jj.b && !$$11.a() && $$6.v() >= $$10 && a(this.f, $$3)) {
                        xd $$12 = xd.a("build.tooHigh", $$10).a(n.m);
                        this.f.b($$12, true);
                     } else if ($$11 instanceof brp.d $$13 && $$13.e() == brp.e.c) {
                        this.f.a($$2, true);
                     }
                  }
               } else {
                  xd $$14 = xd.a("build.tooHigh", $$10).a(n.m);
                  this.f.b($$14, true);
               }

               this.f.c.b(new aci($$1, $$6));
               this.f.c.b(new aci($$1, $$6.a($$9)));
            } else {
               h.warn("Rejecting UseItemOnPacket from {}: Location {} too far away from hit block {}.", new Object[]{this.f.gb().getName(), $$5, $$6});
            }
         }
      }
   }

   @Override
   public void a(aip $$0) {
      zn.a($$0, this, this.f.B());
      this.a($$0.e());
      arh $$1 = this.f.B();
      bro $$2 = $$0.b();
      cvp $$3 = this.f.b($$2);
      this.f.I();
      if (!$$3.f() && $$3.a($$1.J())) {
         float $$4 = azd.g($$0.f());
         float $$5 = azd.g($$0.g());
         if ($$5 != this.f.dK() || $$4 != this.f.dI()) {
            this.f.b($$4, $$5);
         }

         if (this.f.e.a(this.f, $$1, $$3, $$2) instanceof brp.d $$7 && $$7.e() == brp.e.c) {
            this.f.a($$2, true);
         }
      }
   }

   @Override
   public void a(ain $$0) {
      zn.a($$0, this, this.f.B());
      if (this.f.P_()) {
         for (arh $$1 : this.d.L()) {
            bto $$2 = $$0.a($$1);
            if ($$2 != null) {
               this.f.a($$1, $$2.dx(), $$2.dz(), $$2.dD(), $$2.dI(), $$2.dK(), true);
               return;
            }
         }
      }
   }

   @Override
   public void a(ahr $$0) {
      zn.a($$0, this, this.f.B());
      if (this.f.dh() instanceof cpu $$2) {
         $$2.b($$0.b(), $$0.e());
      }
   }

   @Override
   public void a(vz $$0) {
      h.info("{} lost connection: {}", this.f.aj().getString(), $$0.a().getString());
      this.q();
      super.a($$0);
   }

   private void q() {
      this.T.close();
      this.d.av();
      this.d.ag().a(xd.a("multiplayer.player.left", this.f.Q_()).a(n.o), false);
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
   public void a(aif $$0) {
      zn.a($$0, this, this.f.B());
      if ($$0.b() >= 0 && $$0.b() < cnt.g()) {
         if (this.f.gc().j != $$0.b() && this.f.fw() == bro.a) {
            this.f.fB();
         }

         this.f.gc().j = $$0.b();
         this.f.I();
      } else {
         h.warn("{} tried to set an invalid carried item", this.f.aj().getString());
      }
   }

   @Override
   public void a(agy $$0) {
      Optional<xk> $$1 = this.a($$0.h());
      if (!$$1.isEmpty()) {
         this.a($$0.b(), () -> {
            xt $$2;
            try {
               $$2 = this.a($$0, $$1.get());
            } catch (xx.a var6) {
               this.a(var6);
               return;
            }

            CompletableFuture<arz> $$5 = this.a($$2.c());
            xd $$6 = this.d.bl().decorate(this.f, $$2.d());
            this.T.append($$5, $$2x -> {
               xt $$3 = $$2.a($$6).a($$2x.e());
               this.b($$3);
            });
         });
      }
   }

   @Override
   public void a(agw $$0) {
      this.a($$0.b(), () -> {
         this.b($$0.b());
         this.r();
      });
   }

   private void b(String $$0) {
      ParseResults<et> $$1 = this.c($$0);
      if (this.d.aA() && xv.a($$1)) {
         h.error("Received unsigned command packet from {}, but the command requires signable arguments: {}", this.f.gb().getName(), $$0);
         this.f.a(m);
      } else {
         this.d.aG().a($$1, $$0);
      }
   }

   @Override
   public void a(agx $$0) {
      Optional<xk> $$1 = this.a($$0.h());
      if (!$$1.isEmpty()) {
         this.a($$0.b(), () -> {
            this.a($$0, $$1.get());
            this.r();
         });
      }
   }

   private void a(agx $$0, xk $$1) {
      ParseResults<et> $$2 = this.c($$0.b());

      Map<String, xt> $$3;
      try {
         $$3 = this.a($$0, xv.b($$2), $$1);
      } catch (xx.a var6) {
         this.a(var6);
         return;
      }

      er $$6 = new er.a($$3);
      $$2 = eu.a($$2, $$1x -> $$1x.a($$6, this.T));
      this.d.aG().a($$2, $$0.b());
   }

   private void a(xx.a $$0) {
      h.warn("Failed to update secure chat state for {}: '{}'", this.f.gb().getName(), $$0.a().getString());
      this.f.a($$0.a().f().a(n.m));
   }

   private <S> Map<String, xt> a(agx $$0, xv<S> $$1, xk $$2) throws xx.a {
      List<fa.a> $$3 = $$0.g().a();
      List<xv.a<S>> $$4 = $$1.a();
      if ($$3.isEmpty()) {
         return this.b($$4);
      } else {
         Map<String, xt> $$5 = new Object2ObjectOpenHashMap();

         for (fa.a $$6 : $$3) {
            xv.a<S> $$7 = $$1.a($$6.a());
            if ($$7 == null) {
               this.Q.setChainBroken();
               throw a($$0.b(), $$3, $$4);
            }

            xw $$8 = new xw($$7.c(), $$0.e(), $$0.f(), $$2);
            $$5.put($$7.a(), this.Q.unpack($$6.b(), $$8));
         }

         for (xv.a<S> $$9 : $$4) {
            if (!$$5.containsKey($$9.a())) {
               throw a($$0.b(), $$3, $$4);
            }
         }

         return $$5;
      }
   }

   private <S> Map<String, xt> b(List<xv.a<S>> $$0) throws xx.a {
      Map<String, xt> $$1 = new HashMap<>();

      for (xv.a<S> $$2 : $$0) {
         xw $$3 = xw.a($$2.c());
         $$1.put($$2.a(), this.Q.unpack(null, $$3));
      }

      return $$1;
   }

   private static <S> xx.a a(String $$0, List<fa.a> $$1, List<xv.a<S>> $$2) {
      String $$3 = $$1.stream().map(fa.a::a).collect(Collectors.joining(", "));
      String $$4 = $$2.stream().map(xv.a::a).collect(Collectors.joining(", "));
      h.error("Signed command mismatch between server and client ('{}'): got [{}] from client, but expected [{}]", new Object[]{$$0, $$3, $$4});
      return new xx.a(m);
   }

   private ParseResults<et> c(String $$0) {
      CommandDispatcher<et> $$1 = this.d.aG().a();
      return $$1.parse($$0, this.f.dk());
   }

   private void a(String $$0, Runnable $$1) {
      if (d($$0)) {
         this.a(xd.c("multiplayer.disconnect.illegal_characters"));
      } else if (this.f.F() == cns.c) {
         this.b(new aga(xd.c("chat.disabled.options").a(n.m), false));
      } else {
         this.f.I();
         this.d.execute($$1);
      }
   }

   private Optional<xk> a(xk.b $$0) {
      synchronized (this.R) {
         Optional<xk> $$1 = this.R.a($$0);
         if ($$1.isEmpty()) {
            h.warn("Failed to validate message acknowledgements from {}", this.f.aj().getString());
            this.a(l);
         }

         return $$1;
      }
   }

   private static boolean d(String $$0) {
      for (int $$1 = 0; $$1 < $$0.length(); $$1++) {
         if (!baa.a($$0.charAt($$1))) {
            return true;
         }
      }

      return false;
   }

   private xt a(agy $$0, xk $$1) throws xx.a {
      xw $$2 = new xw($$0.b(), $$0.e(), $$0.f(), $$1);
      return this.Q.unpack($$0.g(), $$2);
   }

   private void b(xt $$0) {
      this.d.ag().a($$0, this.f, wz.a(wz.e, this.f));
      this.r();
   }

   private void r() {
      this.q += 20;
      if (this.q > 200 && !this.d.ag().f(this.f.gb()) && !this.d.a(this.f.gb())) {
         this.a(xd.c("disconnect.spam"));
      }
   }

   @Override
   public void a(agv $$0) {
      synchronized (this.R) {
         if (!this.R.a($$0.b())) {
            h.warn("Failed to validate message acknowledgements from {}", this.f.aj().getString());
            this.a(l);
         }
      }
   }

   @Override
   public void a(aim $$0) {
      zn.a($$0, this, this.f.B());
      this.f.I();
      this.f.a($$0.b());
   }

   @Override
   public void a(ahw $$0) {
      zn.a($$0, this, this.f.B());
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
            if (this.f.fM()) {
               this.f.a(false, true);
               this.F = this.f.dq();
            }
            break;
         case f:
            if (this.f.dh() instanceof buu $$1) {
               int $$2 = $$0.f();
               if ($$1.a() && $$2 > 0) {
                  $$1.c($$2);
               }
            }
            break;
         case g:
            if (this.f.dh() instanceof buu $$3) {
               $$3.b();
            }
            break;
         case h:
            if (this.f.dg() instanceof bud $$4) {
               $$4.b(this.f);
            }
            break;
         case i:
            if (!this.f.gh()) {
               this.f.gj();
            }
            break;
         default:
            throw new IllegalArgumentException("Invalid client command!");
      }
   }

   public void a(xt $$0) {
      xp $$1 = $$0.l();
      if ($$1 != null) {
         this.S.a($$0.m(), $$0.l());
         int $$2;
         synchronized (this.R) {
            this.R.a($$1);
            $$2 = this.R.a();
         }

         if ($$2 > 4096) {
            this.a(xd.c("multiplayer.disconnect.too_many_pending_chats"));
         }
      }
   }

   public void a(xt $$0, wz.a $$1) {
      this.b(new aeb($$0.k().c(), $$0.k().b(), $$0.l(), $$0.m().a(this.S), $$0.n(), $$0.o(), $$1));
      this.a($$0);
   }

   public void a(xd $$0, wz.a $$1) {
      this.b(new adc($$0, $$1));
   }

   public SocketAddress m() {
      return this.e.d();
   }

   public void n() {
      this.U = true;
      this.q();
      this.b(afy.a);
      this.e.a(abo.d);
   }

   @Override
   public void a(ajw $$0) {
      this.e.a(new ajt($$0.b()));
   }

   @Override
   public void a(ahm $$0) {
      zn.a($$0, this, this.f.B());
      final arh $$1 = this.f.B();
      final bto $$2 = $$0.a($$1);
      this.f.I();
      this.f.g($$0.b());
      if ($$2 != null) {
         if (!$$1.A_().a($$2.ds())) {
            return;
         }

         eyn $$3 = $$2.cO();
         if (this.f.a($$3, 1.0)) {
            $$0.a(new ahm.c() {
               private void a(bro $$0, asj.a $$1x) {
                  cvp $$2 = asj.this.f.b($$0);
                  if ($$2.a($$1.J())) {
                     cvp $$3 = $$2.u();
                     if ($$1.run(asj.this.f, $$2, $$0) instanceof brp.d $$5) {
                        cvp $$6 = $$5.c() ? $$3 : cvp.k;
                        an.T.a(asj.this.f, $$6, $$2);
                        if ($$5.e() == brp.e.c) {
                           asj.this.f.a($$0, true);
                        }
                     }
                  }
               }

               @Override
               public void a(bro $$0) {
                  this.a($$0, cnu::a);
               }

               @Override
               public void a(bro $$0, eys $$1x) {
                  this.a($$0, ($$1xxx, $$2xx, $$3) -> $$2xx.a($$1xxx, $$1, $$3));
               }

               @Override
               public void a() {
                  label23:
                  if (!($$2 instanceof cke) && !($$2 instanceof bua) && $$2 != asj.this.f) {
                     if ($$2 instanceof cob $$0 && !$$0.cy()) {
                        break label23;
                     }

                     cvp $$1 = asj.this.f.b(bro.a);
                     if (!$$1.a($$1.J())) {
                        return;
                     }

                     asj.this.f.e($$2);
                     return;
                  }

                  asj.this.a(xd.c("multiplayer.disconnect.invalid_entity_attacked"));
                  asj.h.warn("Player {} tried to attack an invalid entity", asj.this.f.aj().getString());
               }
            });
         }
      }
   }

   @Override
   public void a(ahb $$0) {
      zn.a($$0, this, this.f.B());
      this.f.I();
      ahb.a $$1 = $$0.b();
      switch ($$1) {
         case a:
            if (this.f.h) {
               this.f.h = false;
               this.f = this.d.ag().a(this.f, true, bto.c.e);
               an.w.a(this.f, deg.j, deg.h);
            } else {
               if (this.f.eA() > 0.0F) {
                  return;
               }

               this.f = this.d.ag().a(this.f, false, bto.c.a);
               if (this.d.j()) {
                  this.f.a(ded.d);
                  this.f.dS().ac().a(dec.r).a(false, this.d);
               }
            }
            break;
         case b:
            this.f.J().a(this.f);
      }
   }

   @Override
   public void a(ahh $$0) {
      zn.a($$0, this, this.f.B());
      this.f.t();
   }

   @Override
   public void a(ahg $$0) {
      zn.a($$0, this, this.f.B());
      this.f.I();
      if (this.f.bZ.l == $$0.b()) {
         if (this.f.P_()) {
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
                  Entry<cvp> $$3 = (Entry<cvp>)var4.next();
                  this.f.bZ.b($$3.getIntKey(), (cvp)$$3.getValue());
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
   public void a(aht $$0) {
      zn.a($$0, this, this.f.B());
      this.f.I();
      if (!this.f.P_() && this.f.bZ.l == $$0.b()) {
         if (!this.f.bZ.b(this.f)) {
            h.debug("Player {} interacted with invalid menu {}", this.f, this.f.bZ);
         } else if (this.f.K().b($$0.e())) {
            if (this.f.bZ instanceof csl $$1) {
               this.d.aI().a($$0.e()).ifPresent($$2 -> {
                  if ($$2.b().a().c()) {
                     h.debug("Player {} tried to place impossible recipe {}", this.f, $$2.a());
                  } else {
                     csl.a $$3 = $$1.a($$0.f(), this.f.f(), (daj<?>)$$2, this.f.gc());
                     if ($$3 == csl.a.b) {
                        this.f.c.b(new adz(this.f.bZ.l, (daj<?>)$$2));
                     }
                  }
               });
            }
         }
      }
   }

   @Override
   public void a(ahf $$0) {
      zn.a($$0, this, this.f.B());
      this.f.I();
      if (this.f.bZ.l == $$0.b() && !this.f.P_()) {
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
   public void a(aii $$0) {
      zn.a($$0, this, this.f.B());
      if (this.f.e.e()) {
         boolean $$1 = $$0.b() < 0;
         cvp $$2 = $$0.e();
         if (!$$2.a(this.f.dS().J())) {
            return;
         }

         cye $$3 = $$2.a(kr.T, cye.a);
         if ($$3.a("x") && $$3.a("y") && $$3.a("z")) {
            je $$4 = drs.b($$3.d());
            if (this.f.dS().p($$4)) {
               drs $$5 = this.f.dS().c_($$4);
               if ($$5 != null) {
                  $$5.a($$2, this.f.dS().F_());
               }
            }
         }

         boolean $$6 = $$0.b() >= 1 && $$0.b() <= 45;
         boolean $$7 = $$2.f() || $$2.J() <= $$2.k();
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
   public void a(ail $$0) {
      List<String> $$1 = Stream.of($$0.f()).map(n::a).collect(Collectors.toList());
      this.a($$1).thenAcceptAsync($$1x -> this.a($$0, $$1x), this.d);
   }

   private void a(ail $$0, List<arz> $$1) {
      this.f.I();
      arh $$2 = this.f.B();
      je $$3 = $$0.b();
      if ($$2.B($$3)) {
         if (!($$2.c_($$3) instanceof dte $$5)) {
            return;
         }

         $$5.a(this.f, $$0.e(), $$1);
      }
   }

   @Override
   public void a(ahu $$0) {
      zn.a($$0, this, this.f.B());
      this.f.gd().b = $$0.b() && this.f.gd().c;
   }

   @Override
   public void a(aae $$0) {
      zn.a($$0, this, this.f.B());
      this.f.a($$0.b());
   }

   @Override
   public void a(agu $$0) {
      zn.a($$0, this, this.f.B());
      if (this.f.l(2) || this.h()) {
         this.d.a($$0.b(), false);
      }
   }

   @Override
   public void a(aho $$0) {
      zn.a($$0, this, this.f.B());
      if (this.f.l(2) || this.h()) {
         this.d.b($$0.b());
      }
   }

   @Override
   public void a(agz $$0) {
      zn.a($$0, this, this.f.B());
      xu.a $$1 = $$0.b();
      cnx.a $$2 = this.P != null ? this.P.d().b() : null;
      cnx.a $$3 = $$1.b();
      if (!Objects.equals($$2, $$3)) {
         if ($$2 != null && $$3.b().isBefore($$2.b())) {
            this.a(cnx.a);
         } else {
            try {
               azq $$4 = this.d.ar();
               if ($$4 == null) {
                  h.warn("Ignoring chat session from {} due to missing Services public key", this.f.gb().getName());
                  return;
               }

               this.a($$1.a(this.f.gb(), $$4));
            } catch (cnx.b var6) {
               h.error("Failed to validate profile key: {}", var6.getMessage());
               this.a(var6.a());
            }
         }
      }
   }

   @Override
   public void a(ahe $$0) {
      if (!this.U) {
         throw new IllegalStateException("Client acknowledged config, but none was requested");
      } else {
         this.e.a(abo.b, new ash(this.d, this.e, this.a(this.f.D())));
      }
   }

   @Override
   public void a(aha $$0) {
      zn.a($$0, this, this.f.B());
      this.g.a($$0.b());
   }

   @Override
   public void a(ahj $$0) {
      zn.a($$0, this, this.f.B());
      this.d.a(this.f, $$0.b());
   }

   private void a(xu $$0) {
      this.P = $$0;
      this.Q = $$0.a(this.f.cD());
      this.T.append(() -> {
         this.f.a($$0);
         this.d.ag().a(new aeg(EnumSet.of(aeg.a.b), List.of(this.f)));
      });
   }

   @Override
   public void a(aaf $$0) {
   }

   @Override
   public void a(ahc $$0) {
      zn.a($$0, this, this.f.B());
      if (!this.O) {
         this.f.a(eys.c);
      }

      this.O = false;
   }

   private void a(eys $$0) {
      this.f.a($$0);
      this.f.I();
      this.O = true;
   }

   @Override
   public ari o() {
      return this.f;
   }

   @FunctionalInterface
   interface a {
      brp run(ari var1, bto var2, bro var3);
   }
}
