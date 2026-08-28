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

public class atk extends ath implements ahm, atn, xj {
   static final Logger h = LogUtils.getLogger();
   private static final int i = -1;
   private static final int j = 4096;
   private static final int k = 80;
   private static final xv l = xv.c("multiplayer.disconnect.chat_validation_failed");
   private static final xv m = xv.c("chat.disabled.invalid_command_signature").a(n.m);
   private static final int n = 1000;
   public asi f;
   public final atf g;
   private int o;
   private int p = -1;
   private final bbe q = new bbe(20, 200);
   private final bbe r = new bbe(20, 1480);
   private double s;
   private double t;
   private double u;
   private double v;
   private double w;
   private double x;
   @Nullable
   private bvk y;
   private double z;
   private double A;
   private double B;
   private double C;
   private double D;
   private double E;
   @Nullable
   private fby F;
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
   private ym P;
   private yp.b Q;
   private final ye R = new ye(20);
   private final yi S = yi.a();
   private final azs T;
   private boolean U;

   public atk(MinecraftServer $$0, wp $$1, asi $$2, asx $$3) {
      super($$0, $$1, $$3);
      this.g = new atf($$1.e());
      this.f = $$2;
      $$2.f = this;
      $$2.Z().a();
      this.Q = yp.b.unsigned($$2.cG(), $$0::aA);
      this.T = new azs($$0);
   }

   @Override
   public void d() {
      if (this.p > -1) {
         this.b(new acw(this.p));
         this.p = -1;
      }

      this.l();
      this.f.K = this.f.dB();
      this.f.L = this.f.dD();
      this.f.M = this.f.dH();
      this.f.i();
      this.f.a(this.s, this.t, this.u, this.f.dM(), this.f.dO());
      this.o++;
      this.N = this.M;
      if (this.I && !this.f.fR() && !this.f.bZ() && !this.f.eF()) {
         if (++this.J > this.a((bvk)this.f)) {
            h.warn("{} was kicked for floating too long!", this.f.al().getString());
            this.a(xv.c("multiplayer.disconnect.flying"));
            return;
         }
      } else {
         this.I = false;
         this.J = 0;
      }

      this.y = this.f.dg();
      if (this.y != this.f && this.y.cX() == this.f) {
         this.z = this.y.dB();
         this.A = this.y.dD();
         this.B = this.y.dH();
         this.C = this.y.dB();
         this.D = this.y.dD();
         this.E = this.y.dH();
         if (this.K && this.y.cX() == this.f) {
            if (++this.L > this.a(this.y)) {
               h.warn("{} was kicked for floating a vehicle too long!", this.f.al().getString());
               this.a(xv.c("multiplayer.disconnect.flying"));
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
      this.q.b();
      this.r.b();
      if (this.f.N() > 0L && this.d.ap() > 0 && ae.c() - this.f.N() > (long)this.d.ap() * 1000L * 60L) {
         this.a(xv.c("multiplayer.disconnect.idling"));
      }
   }

   private int a(bvk $$0) {
      double $$1 = $$0.be();
      if ($$1 < 1.0E-5F) {
         return Integer.MAX_VALUE;
      } else {
         double $$2 = 0.08 / $$1;
         return bae.c(80.0 * Math.max($$2, 1.0));
      }
   }

   @Override
   public void l() {
      this.s = this.f.dB();
      this.t = this.f.dD();
      this.u = this.f.dH();
      this.v = this.f.dB();
      this.w = this.f.dD();
      this.x = this.f.dH();
   }

   @Override
   public boolean c() {
      return this.e.i() && !this.U;
   }

   @Override
   public boolean a(aac<?> $$0) {
      return super.a($$0) ? true : this.U && this.e.i() && $$0 instanceof aia;
   }

   @Override
   protected GameProfile i() {
      return this.f.gh();
   }

   private <T, R> CompletableFuture<R> a(T $$0, BiFunction<atq, T, CompletableFuture<R>> $$1) {
      return $$1.apply(this.f.Z(), $$0).thenApply($$0x -> {
         if (!this.c()) {
            h.debug("Ignoring packet due to disconnection");
            throw new CancellationException("disconnected");
         } else {
            return (R)$$0x;
         }
      });
   }

   private CompletableFuture<ata> a(String $$0) {
      return this.a($$0, atq::a);
   }

   private CompletableFuture<List<ata>> a(List<String> $$0) {
      return this.a($$0, atq::a);
   }

   @Override
   public void a(ait $$0) {
      aaf.a($$0, this, this.f.y());
      this.f.a($$0.b());
   }

   private static boolean b(double $$0, double $$1, double $$2, float $$3, float $$4) {
      return Double.isNaN($$0) || Double.isNaN($$1) || Double.isNaN($$2) || !Floats.isFinite($$4) || !Floats.isFinite($$3);
   }

   private static double a(double $$0) {
      return bae.a($$0, -3.0E7, 3.0E7);
   }

   private static double b(double $$0) {
      return bae.a($$0, -2.0E7, 2.0E7);
   }

   @Override
   public void a(aim $$0) {
      aaf.a($$0, this, this.f.y());
      if (b($$0.b(), $$0.e(), $$0.f(), $$0.g(), $$0.h())) {
         this.a(xv.c("multiplayer.disconnect.invalid_vehicle_movement"));
      } else if (!this.p()) {
         bvk $$1 = this.f.dg();
         if ($$1 != this.f && $$1.cX() == this.f && $$1 == this.y) {
            ash $$2 = this.f.y();
            double $$3 = $$1.dB();
            double $$4 = $$1.dD();
            double $$5 = $$1.dH();
            double $$6 = a($$0.b());
            double $$7 = b($$0.e());
            double $$8 = a($$0.f());
            float $$9 = bae.h($$0.g());
            float $$10 = bae.h($$0.h());
            double $$11 = $$6 - this.z;
            double $$12 = $$7 - this.A;
            double $$13 = $$8 - this.B;
            double $$14 = $$1.dz().h();
            double $$15 = $$11 * $$11 + $$12 * $$12 + $$13 * $$13;
            if ($$15 - $$14 > 100.0 && !this.h()) {
               h.warn("{} (vehicle of {}) moved too quickly! {},{},{}", new Object[]{$$1.al().getString(), this.f.al().getString(), $$11, $$12, $$13});
               this.b(new aeo($$1));
               return;
            }

            boolean $$16 = $$2.a($$1, $$1.cR().h(0.0625));
            $$11 = $$6 - this.C;
            $$12 = $$7 - this.D - 1.0E-6;
            $$13 = $$8 - this.E;
            boolean $$17 = $$1.R;
            if ($$1 instanceof bwg $$18 && $$18.q_()) {
               $$18.k();
            }

            $$1.a(bwk.b, new fby($$11, $$12, $$13));
            $$11 = $$6 - $$1.dB();
            $$12 = $$7 - $$1.dD();
            if ($$12 > -0.5 || $$12 < 0.5) {
               $$12 = 0.0;
            }

            $$13 = $$8 - $$1.dH();
            $$15 = $$11 * $$11 + $$12 * $$12 + $$13 * $$13;
            boolean $$20 = false;
            if ($$15 > 0.0625) {
               $$20 = true;
               h.warn("{} (vehicle of {}) moved wrongly! {}", new Object[]{$$1.al().getString(), this.f.al().getString(), Math.sqrt($$15)});
            }

            $$1.a($$6, $$7, $$8, $$9, $$10);
            boolean $$21 = $$2.a($$1, $$1.cR().h(0.0625));
            if ($$16 && ($$20 || !$$21)) {
               $$1.a($$3, $$4, $$5, $$9, $$10);
               this.b(new aeo($$1));
               return;
            }

            this.f.y().m().a(this.f);
            $$1.b(new fby($$3, $$4, $$5), $$1.du());
            fby $$22 = new fby($$1.dB() - $$3, $$1.dD() - $$4, $$1.dH() - $$5);
            this.a($$22);
            this.f.b($$22.d, $$22.e, $$22.f);
            this.K = $$12 >= -0.03125 && !$$17 && !this.d.ad() && !$$1.bc() && this.b($$1);
            this.C = $$1.dB();
            this.D = $$1.dD();
            this.E = $$1.dH();
         }
      }
   }

   private boolean b(bvk $$0) {
      return $$0.dW().a($$0.cR().g(0.0625).b(0.0, -0.55, 0.0)).allMatch(dxu.a::l);
   }

   @Override
   public void a(aho $$0) {
      aaf.a($$0, this, this.f.y());
      if ($$0.b() == this.G) {
         if (this.F == null) {
            this.a(xv.c("multiplayer.disconnect.invalid_player_movement"));
            return;
         }

         this.f.a(this.F.d, this.F.e, this.F.f, this.f.dM(), this.f.dO());
         this.v = this.F.d;
         this.w = this.F.e;
         this.x = this.F.f;
         if (this.f.Q()) {
            this.f.R();
         }

         this.F = null;
      }
   }

   @Override
   public void a(aiv $$0) {
      aaf.a($$0, this, this.f.y());
      dcl.d $$1 = this.d.aI().a($$0.b());
      if ($$1 != null) {
         this.f.J().d($$1.b().a());
      }
   }

   @Override
   public void a(aiy $$0) {
      this.f.cd.a($$0.b(), $$0.e());
   }

   @Override
   public void a(aiu $$0) {
      aaf.a($$0, this, this.f.y());
      this.f.J().a($$0.b(), $$0.e(), $$0.f());
   }

   @Override
   public void a(aix $$0) {
      aaf.a($$0, this, this.f.y());
      if ($$0.e() == aix.a.a) {
         alz $$1 = Objects.requireNonNull($$0.f());
         ah $$2 = this.d.aD().a($$1);
         if ($$2 != null) {
            this.f.S().a($$2);
         }
      }
   }

   @Override
   public void a(ahz $$0) {
      aaf.a($$0, this, this.f.y());
      StringReader $$1 = new StringReader($$0.e());
      if ($$1.canRead() && $$1.peek() == '/') {
         $$1.skip();
      }

      ParseResults<ew> $$2 = this.d.aG().a().parse($$1, this.f.A());
      this.d.aG().a().getCompletionSuggestions($$2).thenAccept($$1x -> {
         Suggestions $$2x = $$1x.getList().size() <= 1000 ? $$1x : new Suggestions($$1x.getRange(), $$1x.getList().subList(0, 1000));
         this.b(new adj($$0.b(), $$2x));
      });
   }

   @Override
   public void a(ajc $$0) {
      aaf.a($$0, this, this.f.y());
      if (!this.d.q()) {
         this.f.a(xv.c("advMode.notEnabled"));
      } else if (!this.f.gG()) {
         this.f.a(xv.c("advMode.notAllowed"));
      } else {
         dgi $$1 = null;
         dvh $$2 = null;
         jh $$3 = $$0.b();
         dux $$4 = this.f.dW().c_($$3);
         if ($$4 instanceof dvh) {
            $$2 = (dvh)$$4;
            $$1 = $$2.b();
         }

         String $$5 = $$0.e();
         boolean $$6 = $$0.f();
         if ($$1 != null) {
            dvh.a $$7 = $$2.t();
            dxv $$8 = this.f.dW().a_($$3);
            jm $$9 = $$8.c(dlw.b);

            dxv $$10 = switch ($$0.i()) {
               case a -> dko.lc.m();
               case b -> dko.lb.m();
               default -> dko.gb.m();
            };
            dxv $$11 = $$10.b(dlw.b, $$9).b(dlw.c, Boolean.valueOf($$0.g()));
            if ($$11 != $$8) {
               this.f.dW().a($$3, $$11, 2);
               $$4.c($$11);
               this.f.dW().m($$3).a($$4);
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
            if (!bbb.b($$5)) {
               this.f.a(xv.a("advMode.setCommand.success", $$5));
            }
         }
      }
   }

   @Override
   public void a(ajd $$0) {
      aaf.a($$0, this, this.f.y());
      if (!this.d.q()) {
         this.f.a(xv.c("advMode.notEnabled"));
      } else if (!this.f.gG()) {
         this.f.a(xv.c("advMode.notAllowed"));
      } else {
         dgi $$1 = $$0.a(this.f.dW());
         if ($$1 != null) {
            $$1.a($$0.b());
            $$1.a($$0.e());
            if (!$$0.e()) {
               $$1.c(null);
            }

            $$1.f();
            this.f.a(xv.a("advMode.setCommand.success", $$0.b()));
         }
      }
   }

   @Override
   public void a(aio $$0) {
      aaf.a($$0, this, this.f.y());
      this.f.gi().c($$0.b());
      int $$1 = this.f.gi().j;
      this.f.f.b(this.f.gi().f($$1));
      this.f.f.b(this.f.gi().f($$0.b()));
      this.f.f.b(new agh($$1));
   }

   @Override
   public void a(aiw $$0) {
      aaf.a($$0, this, this.f.y());
      if (this.f.cd instanceof ctf $$1) {
         if (!$$1.b(this.f)) {
            h.debug("Player {} interacted with invalid menu {}", this.f, $$1);
            return;
         }

         $$1.a($$0.b());
      }
   }

   @Override
   public void a(aja $$0) {
      aaf.a($$0, this, this.f.y());
      if (this.f.cd instanceof cth $$1) {
         if (!this.f.cd.b(this.f)) {
            h.debug("Player {} interacted with invalid menu {}", this.f, this.f.cd);
            return;
         }

         $$1.a($$0.b(), $$0.e());
      }
   }

   @Override
   public void a(ajg $$0) {
      aaf.a($$0, this, this.f.y());
      if (this.f.gG()) {
         jh $$1 = $$0.b();
         dxv $$2 = this.f.dW().a_($$1);
         if (this.f.dW().c_($$1) instanceof dwp $$4) {
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
               if ($$0.e() == dwp.a.b) {
                  if ($$4.A()) {
                     this.f.a(xv.a("structure_block.save_success", $$5), false);
                  } else {
                     this.f.a(xv.a("structure_block.save_failure", $$5), false);
                  }
               } else if ($$0.e() == dwp.a.c) {
                  if (!$$4.C()) {
                     this.f.a(xv.a("structure_block.load_not_found", $$5), false);
                  } else if ($$4.a(this.f.y())) {
                     this.f.a(xv.a("structure_block.load_success", $$5), false);
                  } else {
                     this.f.a(xv.a("structure_block.load_prepare", $$5), false);
                  }
               } else if ($$0.e() == dwp.a.d) {
                  if ($$4.z()) {
                     this.f.a(xv.a("structure_block.size_success", $$5), false);
                  } else {
                     this.f.a(xv.c("structure_block.size_failure"), false);
                  }
               }
            } else {
               this.f.a(xv.a("structure_block.invalid_structure_name", $$0.g()), false);
            }

            $$4.e();
            this.f.dW().a($$1, $$2, $$2, 3);
         }
      }
   }

   @Override
   public void a(ajf $$0) {
      aaf.a($$0, this, this.f.y());
      if (this.f.gG()) {
         jh $$1 = $$0.b();
         dxv $$2 = this.f.dW().a_($$1);
         if (this.f.dW().c_($$1) instanceof dwa $$4) {
            $$4.a($$0.e());
            $$4.b($$0.f());
            $$4.a(aly.a(mb.aX, $$0.g()));
            $$4.a($$0.h());
            $$4.a($$0.i());
            $$4.a($$0.k());
            $$4.b($$0.j());
            $$4.e();
            this.f.dW().a($$1, $$2, $$2, 3);
         }
      }
   }

   @Override
   public void a(aij $$0) {
      aaf.a($$0, this, this.f.y());
      if (this.f.gG()) {
         jh $$1 = $$0.b();
         if (this.f.dW().c_($$1) instanceof dwa $$3) {
            $$3.a(this.f.y(), $$0.e(), $$0.f());
         }
      }
   }

   @Override
   public void a(aiz $$0) {
      aaf.a($$0, this, this.f.y());
      int $$1 = $$0.b();
      if (this.f.cd instanceof cun $$2) {
         if (!$$2.b(this.f)) {
            h.debug("Player {} interacted with invalid menu {}", this.f, $$2);
            return;
         }

         $$2.e($$1);
         $$2.h($$1);
      }
   }

   @Override
   public void a(aig $$0) {
      int $$1 = $$0.b();
      if (cpw.d($$1) || $$1 == 40) {
         List<String> $$2 = Lists.newArrayList();
         Optional<String> $$3 = $$0.f();
         $$3.ifPresent($$2::add);
         $$2.addAll($$0.e());
         Consumer<List<ata>> $$4 = $$3.isPresent() ? $$1x -> this.a((ata)$$1x.get(0), $$1x.subList(1, $$1x.size()), $$1) : $$1x -> this.a($$1x, $$1);
         this.a($$2).thenAcceptAsync($$4, this.d);
      }
   }

   private void a(List<ata> $$0, int $$1) {
      cxp $$2 = this.f.gi().a($$1);
      if ($$2.b(ku.S)) {
         List<asz<String>> $$3 = $$0.stream().map(this::a).toList();
         $$2.b(ku.S, new daw($$3));
      }
   }

   private void a(ata $$0, List<ata> $$1, int $$2) {
      cxp $$3 = this.f.gi().a($$2);
      if ($$3.b(ku.S)) {
         cxp $$4 = $$3.a((dhh)cxt.uP);
         $$4.c(ku.S);
         List<asz<xv>> $$5 = $$1.stream().map($$0x -> this.a($$0x).a(xv::b)).toList();
         $$4.b(ku.T, new dax(this.a($$0), this.f.al().getString(), 0, $$5, true));
         this.f.gi().a($$2, $$4);
      }
   }

   private asz<String> a(ata $$0) {
      return this.f.aa() ? asz.a($$0.b()) : asz.a($$0);
   }

   @Override
   public void a(aih $$0) {
      aaf.a($$0, this, this.f.y());
      if (this.f.s(2)) {
         bvk $$1 = this.f.dW().a($$0.e());
         if ($$1 != null) {
            ux $$2 = $$1.f(new ux());
            this.f.f.b(new agy($$0.b(), $$2));
         }
      }
   }

   @Override
   public void a(aie $$0) {
      aaf.a($$0, this, this.f.y());
      if (!this.f.aa_() && $$0.e() == this.f.cd.l) {
         if (this.f.cd instanceof cts $$1 && $$1.m() instanceof dvl $$2) {
            $$2.a($$0.b(), $$0.f());
         }
      }
   }

   @Override
   public void a(ahp $$0) {
      aaf.a($$0, this, this.f.y());
      if (this.f.s(2)) {
         dux $$1 = this.f.dW().c_($$0.e());
         ux $$2 = $$1 != null ? $$1.d(this.f.dY()) : null;
         this.f.f.b(new agy($$0.b(), $$2));
      }
   }

   @Override
   public void a(ail $$0) {
      aaf.a($$0, this, this.f.y());
      if (b($$0.a(0.0), $$0.b(0.0), $$0.c(0.0), $$0.a(0.0F), $$0.b(0.0F))) {
         this.a(xv.c("multiplayer.disconnect.invalid_player_movement"));
      } else {
         ash $$1 = this.f.y();
         if (!this.f.k) {
            if (this.o == 0) {
               this.l();
            }

            if (!this.p()) {
               double $$2 = a($$0.a(this.f.dB()));
               double $$3 = b($$0.b(this.f.dD()));
               double $$4 = a($$0.c(this.f.dH()));
               float $$5 = bae.h($$0.a(this.f.dM()));
               float $$6 = bae.h($$0.b(this.f.dO()));
               if (this.f.bZ()) {
                  this.f.a(this.f.dB(), this.f.dD(), this.f.dH(), $$5, $$6);
                  this.f.y().m().a(this.f);
               } else {
                  double $$7 = this.f.dB();
                  double $$8 = this.f.dD();
                  double $$9 = this.f.dH();
                  double $$10 = $$2 - this.s;
                  double $$11 = $$3 - this.t;
                  double $$12 = $$4 - this.u;
                  double $$13 = this.f.dz().h();
                  double $$14 = $$10 * $$10 + $$11 * $$11 + $$12 * $$12;
                  if (this.f.fR()) {
                     if ($$14 > 1.0) {
                        this.a(this.f.dB(), this.f.dD(), this.f.dH(), $$5, $$6);
                     }
                  } else {
                     boolean $$15 = this.f.fJ();
                     if ($$1.t().i()) {
                        this.M++;
                        int $$16 = this.M - this.N;
                        if ($$16 > 5) {
                           h.debug("{} is sending move packets too frequently ({} packets since last tick)", this.f.al().getString(), $$16);
                           $$16 = 1;
                        }

                        if (this.a($$15)) {
                           float $$17 = $$15 ? 300.0F : 100.0F;
                           if ($$14 - $$13 > (double)($$17 * (float)$$16)) {
                              h.warn("{} moved too quickly! {},{},{}", new Object[]{this.f.al().getString(), $$10, $$11, $$12});
                              this.a(this.f.dB(), this.f.dD(), this.f.dH(), this.f.dM(), this.f.dO());
                              return;
                           }
                        }
                     }

                     fbt $$18 = this.f.cR();
                     $$10 = $$2 - this.v;
                     $$11 = $$3 - this.w;
                     $$12 = $$4 - this.x;
                     boolean $$19 = $$11 > 0.0;
                     if (this.f.aJ() && !$$0.b() && $$19) {
                        this.f.s();
                     }

                     boolean $$20 = this.f.R;
                     this.f.a(bwk.b, new fby($$10, $$11, $$12));
                     $$10 = $$2 - this.f.dB();
                     $$11 = $$3 - this.f.dD();
                     if ($$11 > -0.5 || $$11 < 0.5) {
                        $$11 = 0.0;
                     }

                     $$12 = $$4 - this.f.dH();
                     $$14 = $$10 * $$10 + $$11 * $$11 + $$12 * $$12;
                     boolean $$22 = false;
                     if (!this.f.Q() && $$14 > 0.0625 && !this.f.fR() && !this.f.h.e() && this.f.h.b() != dhf.d) {
                        $$22 = true;
                        h.warn("{} moved wrongly!", this.f.al().getString());
                     }

                     if (this.f.ad || this.f.fR() || (!$$22 || !$$1.a(this.f, $$18)) && !this.a($$1, $$18, $$2, $$3, $$4)) {
                        this.f.a($$2, $$3, $$4, $$5, $$6);
                        boolean $$23 = this.f.fv();
                        this.I = $$11 >= -0.03125
                           && !$$20
                           && this.f.h.b() != dhf.d
                           && !this.d.ad()
                           && !this.f.gj().c
                           && !this.f.b(bur.y)
                           && !$$15
                           && !$$23
                           && this.b(this.f);
                        this.f.y().m().a(this.f);
                        fby $$24 = new fby(this.f.dB() - $$7, this.f.dD() - $$8, this.f.dH() - $$9);
                        this.f.a($$0.b(), $$0.e(), $$24);
                        this.f.a(this.f.dB() - $$7, this.f.dD() - $$8, this.f.dH() - $$9, $$0.b());
                        this.f.b(new fby($$7, $$8, $$9), this.f.du());
                        this.a($$24);
                        if ($$19) {
                           this.f.k();
                        }

                        if ($$0.b() || this.f.eg() || this.f.q_() || this.f.aa_() || $$15 || $$23) {
                           this.f.gM();
                        }

                        this.f.b(this.f.dB() - $$7, this.f.dD() - $$8, this.f.dH() - $$9);
                        this.v = this.f.dB();
                        this.w = this.f.dD();
                        this.x = this.f.dH();
                     } else {
                        this.a($$7, $$8, $$9, $$5, $$6);
                        this.f.a(this.f.dB() - $$7, this.f.dD() - $$8, this.f.dH() - $$9, $$0.b());
                     }
                  }
               }
            }
         }
      }
   }

   private boolean a(boolean $$0) {
      if (this.h()) {
         return false;
      } else if (this.f.Q()) {
         return false;
      } else {
         dhe $$1 = this.f.y().N();
         return $$1.b(dhe.t) ? false : !$$0 || !$$1.b(dhe.u);
      }
   }

   private boolean p() {
      if (this.F != null) {
         if (this.o - this.H > 20) {
            this.H = this.o;
            this.a(this.F.d, this.F.e, this.F.f, this.f.dM(), this.f.dO());
         }

         return true;
      } else {
         this.H = this.o;
         return false;
      }
   }

   private boolean a(dhl $$0, fbt $$1, double $$2, double $$3, double $$4) {
      fbt $$5 = this.f.cR().d($$2 - this.f.dB(), $$3 - this.f.dD(), $$4 - this.f.dH());
      Iterable<fcs> $$6 = $$0.d(this.f, $$5.h(1.0E-5F));
      fcs $$7 = fcp.a($$1.h(1.0E-5F));

      for (fcs $$8 : $$6) {
         if (!fcp.c($$8, $$7, fcc.i)) {
            return true;
         }
      }

      return false;
   }

   public void a(double $$0, double $$1, double $$2, float $$3, float $$4) {
      this.a(new bwt(new fby($$0, $$1, $$2), fby.c, $$3, $$4), Collections.emptySet());
   }

   public void a(bwt $$0, Set<bwu> $$1) {
      this.H = this.o;
      if (++this.G == Integer.MAX_VALUE) {
         this.G = 0;
      }

      this.f.a($$0, $$1);
      this.F = this.f.du();
      this.f.f.b(afb.a(this.G, $$0, $$1));
   }

   @Override
   public void a(air $$0) {
      aaf.a($$0, this, this.f.y());
      jh $$1 = $$0.b();
      this.f.H();
      air.a $$2 = $$0.f();
      switch ($$2) {
         case g:
            if (!this.f.aa_()) {
               cxp $$3 = this.f.b(bti.b);
               this.f.a(bti.b, this.f.b(bti.a));
               this.f.a(bti.a, $$3);
               this.f.fF();
            }

            return;
         case e:
            if (!this.f.aa_()) {
               this.f.a(false);
            }

            return;
         case d:
            if (!this.f.aa_()) {
               this.f.a(true);
            }

            return;
         case f:
            this.f.fE();
            return;
         case a:
         case b:
         case c:
            this.f.h.a($$1, $$2, $$0.e(), this.f.dW().am(), $$0.g());
            this.f.f.a($$0.g());
            return;
         default:
            throw new IllegalArgumentException("Invalid player action");
      }
   }

   private static boolean a(asi $$0, cxp $$1) {
      if ($$1.f()) {
         return false;
      } else {
         cxl $$2 = $$1.h();
         return ($$2 instanceof cvv || $$2 instanceof cwb) && !$$0.gE().a($$1);
      }
   }

   @Override
   public void a(ajk $$0) {
      aaf.a($$0, this, this.f.y());
      this.f.f.a($$0.f());
      ash $$1 = this.f.y();
      bti $$2 = $$0.b();
      cxp $$3 = this.f.b($$2);
      if ($$3.a($$1.J())) {
         fbu $$4 = $$0.e();
         fby $$5 = $$4.g();
         jh $$6 = $$4.b();
         if (this.f.a($$6, 1.0)) {
            fby $$7 = $$5.d(fby.b($$6));
            double $$8 = 1.0000001;
            if (Math.abs($$7.a()) < 1.0000001 && Math.abs($$7.b()) < 1.0000001 && Math.abs($$7.c()) < 1.0000001) {
               jm $$9 = $$4.c();
               this.f.H();
               int $$10 = this.f.dW().am();
               if ($$6.v() <= $$10) {
                  if (this.F == null && $$1.a(this.f, $$6)) {
                     btj $$11 = this.f.h.a(this.f, $$1, $$3, $$2, $$4);
                     if ($$11.a()) {
                        ao.P.a(this.f, $$4.b(), $$3.v());
                     }

                     if ($$9 == jm.b && !$$11.a() && $$6.v() >= $$10 && a(this.f, $$3)) {
                        xv $$12 = xv.a("build.tooHigh", $$10).a(n.m);
                        this.f.b($$12, true);
                     } else if ($$11 instanceof btj.d $$13 && $$13.e() == btj.e.c) {
                        this.f.a($$2, true);
                     }
                  }
               } else {
                  xv $$14 = xv.a("build.tooHigh", $$10).a(n.m);
                  this.f.b($$14, true);
               }

               this.f.f.b(new ada($$1, $$6));
               this.f.f.b(new ada($$1, $$6.a($$9)));
            } else {
               h.warn("Rejecting UseItemOnPacket from {}: Location {} too far away from hit block {}.", new Object[]{this.f.gh().getName(), $$5, $$6});
            }
         }
      }
   }

   @Override
   public void a(ajl $$0) {
      aaf.a($$0, this, this.f.y());
      this.a($$0.e());
      ash $$1 = this.f.y();
      bti $$2 = $$0.b();
      cxp $$3 = this.f.b($$2);
      this.f.H();
      if (!$$3.f() && $$3.a($$1.J())) {
         float $$4 = bae.h($$0.f());
         float $$5 = bae.h($$0.g());
         if ($$5 != this.f.dO() || $$4 != this.f.dM()) {
            this.f.c($$4, $$5);
         }

         if (this.f.h.a(this.f, $$1, $$3, $$2) instanceof btj.d $$7 && $$7.e() == btj.e.c) {
            this.f.a($$2, true);
         }
      }
   }

   @Override
   public void a(ajj $$0) {
      aaf.a($$0, this, this.f.y());
      if (this.f.aa_()) {
         for (ash $$1 : this.d.L()) {
            bvk $$2 = $$0.a($$1);
            if ($$2 != null) {
               this.f.a($$1, $$2.dB(), $$2.dD(), $$2.dH(), Set.of(), $$2.dM(), $$2.dO(), true);
               return;
            }
         }
      }
   }

   @Override
   public void a(ain $$0) {
      aaf.a($$0, this, this.f.y());
      if (this.f.dm() instanceof cru $$2) {
         $$2.b($$0.b(), $$0.e());
      }
   }

   @Override
   public void a(wr $$0) {
      h.info("{} lost connection: {}", this.f.al().getString(), $$0.a().getString());
      this.q();
      super.a($$0);
   }

   private void q() {
      this.T.close();
      this.d.av();
      this.d.ag().a(xv.a("multiplayer.player.left", this.f.p_()).a(n.o), false);
      this.f.t();
      this.d.ag().c(this.f);
      this.f.Z().b();
   }

   public void a(int $$0) {
      if ($$0 < 0) {
         throw new IllegalArgumentException("Expected packet sequence nr >= 0");
      } else {
         this.p = Math.max($$0, this.p);
      }
   }

   @Override
   public void a(ajb $$0) {
      aaf.a($$0, this, this.f.y());
      if ($$0.b() >= 0 && $$0.b() < cpw.g()) {
         if (this.f.gi().j != $$0.b() && this.f.fA() == bti.a) {
            this.f.fF();
         }

         this.f.gi().j = $$0.b();
         this.f.H();
      } else {
         h.warn("{} tried to set an invalid carried item", this.f.al().getString());
      }
   }

   @Override
   public void a(ahu $$0) {
      Optional<yc> $$1 = this.a($$0.h());
      if (!$$1.isEmpty()) {
         this.a($$0.b(), () -> {
            yl $$2;
            try {
               $$2 = this.a($$0, $$1.get());
            } catch (yp.a var6) {
               this.a(var6);
               return;
            }

            CompletableFuture<ata> $$5 = this.a($$2.c());
            xv $$6 = this.d.bk().decorate(this.f, $$2.d());
            this.T.append($$5, $$2x -> {
               yl $$3 = $$2.a($$6).a($$2x.e());
               this.b($$3);
            });
         });
      }
   }

   @Override
   public void a(ahs $$0) {
      this.a($$0.b(), () -> {
         this.b($$0.b());
         this.r();
      });
   }

   private void b(String $$0) {
      ParseResults<ew> $$1 = this.c($$0);
      if (this.d.aA() && yn.a($$1)) {
         h.error("Received unsigned command packet from {}, but the command requires signable arguments: {}", this.f.gh().getName(), $$0);
         this.f.a(m);
      } else {
         this.d.aG().a($$1, $$0);
      }
   }

   @Override
   public void a(aht $$0) {
      Optional<yc> $$1 = this.a($$0.h());
      if (!$$1.isEmpty()) {
         this.a($$0.b(), () -> {
            this.a($$0, $$1.get());
            this.r();
         });
      }
   }

   private void a(aht $$0, yc $$1) {
      ParseResults<ew> $$2 = this.c($$0.b());

      Map<String, yl> $$3;
      try {
         $$3 = this.a($$0, yn.b($$2), $$1);
      } catch (yp.a var6) {
         this.a(var6);
         return;
      }

      eu $$6 = new eu.a($$3);
      $$2 = ex.a($$2, $$1x -> $$1x.a($$6, this.T));
      this.d.aG().a($$2, $$0.b());
   }

   private void a(yp.a $$0) {
      h.warn("Failed to update secure chat state for {}: '{}'", this.f.gh().getName(), $$0.a().getString());
      this.f.a($$0.a().f().a(n.m));
   }

   private <S> Map<String, yl> a(aht $$0, yn<S> $$1, yc $$2) throws yp.a {
      List<fd.a> $$3 = $$0.g().a();
      List<yn.a<S>> $$4 = $$1.a();
      if ($$3.isEmpty()) {
         return this.b($$4);
      } else {
         Map<String, yl> $$5 = new Object2ObjectOpenHashMap();

         for (fd.a $$6 : $$3) {
            yn.a<S> $$7 = $$1.a($$6.a());
            if ($$7 == null) {
               this.Q.setChainBroken();
               throw a($$0.b(), $$3, $$4);
            }

            yo $$8 = new yo($$7.c(), $$0.e(), $$0.f(), $$2);
            $$5.put($$7.a(), this.Q.unpack($$6.b(), $$8));
         }

         for (yn.a<S> $$9 : $$4) {
            if (!$$5.containsKey($$9.a())) {
               throw a($$0.b(), $$3, $$4);
            }
         }

         return $$5;
      }
   }

   private <S> Map<String, yl> b(List<yn.a<S>> $$0) throws yp.a {
      Map<String, yl> $$1 = new HashMap<>();

      for (yn.a<S> $$2 : $$0) {
         yo $$3 = yo.a($$2.c());
         $$1.put($$2.a(), this.Q.unpack(null, $$3));
      }

      return $$1;
   }

   private static <S> yp.a a(String $$0, List<fd.a> $$1, List<yn.a<S>> $$2) {
      String $$3 = $$1.stream().map(fd.a::a).collect(Collectors.joining(", "));
      String $$4 = $$2.stream().map(yn.a::a).collect(Collectors.joining(", "));
      h.error("Signed command mismatch between server and client ('{}'): got [{}] from client, but expected [{}]", new Object[]{$$0, $$3, $$4});
      return new yp.a(m);
   }

   private ParseResults<ew> c(String $$0) {
      CommandDispatcher<ew> $$1 = this.d.aG().a();
      return $$1.parse($$0, this.f.A());
   }

   private void a(String $$0, Runnable $$1) {
      if (d($$0)) {
         this.a(xv.c("multiplayer.disconnect.illegal_characters"));
      } else if (this.f.E() == cpu.c) {
         this.b(new agw(xv.c("chat.disabled.options").a(n.m), false));
      } else {
         this.f.H();
         this.d.execute($$1);
      }
   }

   private Optional<yc> a(yc.b $$0) {
      synchronized (this.R) {
         Optional<yc> $$1 = this.R.a($$0);
         if ($$1.isEmpty()) {
            h.warn("Failed to validate message acknowledgements from {}", this.f.al().getString());
            this.a(l);
         }

         return $$1;
      }
   }

   private static boolean d(String $$0) {
      for (int $$1 = 0; $$1 < $$0.length(); $$1++) {
         if (!bbb.a($$0.charAt($$1))) {
            return true;
         }
      }

      return false;
   }

   private yl a(ahu $$0, yc $$1) throws yp.a {
      yo $$2 = new yo($$0.b(), $$0.e(), $$0.f(), $$1);
      return this.Q.unpack($$0.g(), $$2);
   }

   private void b(yl $$0) {
      this.d.ag().a($$0, this.f, xr.a(xr.e, this.f));
      this.r();
   }

   private void r() {
      this.q.a();
      if (!this.q.c() && !this.d.ag().f(this.f.gh()) && !this.d.a(this.f.gh())) {
         this.a(xv.c("disconnect.spam"));
      }
   }

   @Override
   public void a(ahr $$0) {
      synchronized (this.R) {
         if (!this.R.a($$0.b())) {
            h.warn("Failed to validate message acknowledgements from {}", this.f.al().getString());
            this.a(l);
         }
      }
   }

   @Override
   public void a(aji $$0) {
      aaf.a($$0, this, this.f.y());
      this.f.H();
      this.f.a($$0.b());
   }

   @Override
   public void a(ais $$0) {
      aaf.a($$0, this, this.f.y());
      this.f.H();
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
            if (this.f.fR()) {
               this.f.a(false, true);
               this.F = this.f.du();
            }
            break;
         case f:
            if (this.f.dm() instanceof bwq $$1) {
               int $$2 = $$0.f();
               if ($$1.a() && $$2 > 0) {
                  $$1.c($$2);
               }
            }
            break;
         case g:
            if (this.f.dm() instanceof bwq $$3) {
               $$3.b();
            }
            break;
         case h:
            if (this.f.dl() instanceof bvz $$4) {
               $$4.b(this.f);
            }
            break;
         case i:
            if (!this.f.go()) {
               this.f.gq();
            }
            break;
         default:
            throw new IllegalArgumentException("Invalid client command!");
      }
   }

   public void a(yl $$0) {
      yh $$1 = $$0.l();
      if ($$1 != null) {
         this.S.a($$0.m(), $$0.l());
         int $$2;
         synchronized (this.R) {
            this.R.a($$1);
            $$2 = this.R.a();
         }

         if ($$2 > 4096) {
            this.a(xv.c("multiplayer.disconnect.too_many_pending_chats"));
         }
      }
   }

   public void a(yl $$0, xr.a $$1) {
      this.b(new aeu($$0.k().c(), $$0.k().b(), $$0.l(), $$0.m().a(this.S), $$0.n(), $$0.o(), $$1));
      this.a($$0);
   }

   public void a(xv $$0, xr.a $$1) {
      this.b(new adu($$0, $$1));
   }

   public SocketAddress m() {
      return this.e.d();
   }

   public void n() {
      this.U = true;
      this.q();
      this.b(agu.a);
      this.e.a(acg.d);
   }

   @Override
   public void a(aks $$0) {
      this.e.a(new akp($$0.b()));
   }

   @Override
   public void a(aii $$0) {
      aaf.a($$0, this, this.f.y());
      final ash $$1 = this.f.y();
      final bvk $$2 = $$0.a($$1);
      this.f.H();
      this.f.g($$0.b());
      if ($$2 != null) {
         if (!$$1.F_().a($$2.dw())) {
            return;
         }

         fbt $$3 = $$2.cR();
         if (this.f.a($$3, 3.0)) {
            $$0.a(new aii.c() {
               private void a(bti $$0, atk.a $$1x) {
                  cxp $$2 = atk.this.f.b($$0);
                  if ($$2.a($$1.J())) {
                     cxp $$3 = $$2.v();
                     if ($$1.run(atk.this.f, $$2, $$0) instanceof btj.d $$5) {
                        cxp $$6 = $$5.c() ? $$3 : cxp.j;
                        ao.T.a(atk.this.f, $$6, $$2);
                        if ($$5.e() == btj.e.c) {
                           atk.this.f.a($$0, true);
                        }
                     }
                  }
               }

               @Override
               public void a(bti $$0) {
                  this.a($$0, cpx::a);
               }

               @Override
               public void a(bti $$0, fby $$1x) {
                  this.a($$0, ($$1xxx, $$2xx, $$3) -> $$2xx.a($$1xxx, $$1, $$3));
               }

               @Override
               public void a() {
                  label23:
                  if (!($$2 instanceof cmb) && !($$2 instanceof bvw) && $$2 != atk.this.f) {
                     if ($$2 instanceof cqe $$0 && !$$0.cB()) {
                        break label23;
                     }

                     cxp $$1 = atk.this.f.b(bti.a);
                     if (!$$1.a($$1.J())) {
                        return;
                     }

                     atk.this.f.e($$2);
                     return;
                  }

                  atk.this.a(xv.c("multiplayer.disconnect.invalid_entity_attacked"));
                  atk.h.warn("Player {} tried to attack an invalid entity", atk.this.f.al().getString());
               }
            });
         }
      }
   }

   @Override
   public void a(ahx $$0) {
      aaf.a($$0, this, this.f.y());
      this.f.H();
      ahx.a $$1 = $$0.b();
      switch ($$1) {
         case a:
            if (this.f.k) {
               this.f.k = false;
               this.f = this.d.ag().a(this.f, true, bvk.d.e);
               this.l();
               ao.w.a(this.f, dhi.k, dhi.i);
            } else {
               if (this.f.eE() > 0.0F) {
                  return;
               }

               this.f = this.d.ag().a(this.f, false, bvk.d.a);
               this.l();
               if (this.d.w_()) {
                  this.f.a(dhf.d);
                  this.f.y().N().a(dhe.r).a(false, this.d);
               }
            }
            break;
         case b:
            this.f.I().a(this.f);
      }
   }

   @Override
   public void a(aid $$0) {
      aaf.a($$0, this, this.f.y());
      this.f.q();
   }

   @Override
   public void a(aic $$0) {
      aaf.a($$0, this, this.f.y());
      this.f.H();
      if (this.f.cd.l == $$0.b()) {
         if (this.f.aa_()) {
            this.f.cd.b();
         } else if (!this.f.cd.b(this.f)) {
            h.debug("Player {} interacted with invalid menu {}", this.f, this.f.cd);
         } else {
            int $$1 = $$0.e();
            if (!this.f.cd.a($$1)) {
               h.debug("Player {} clicked invalid slot index: {}, available slots: {}", new Object[]{this.f.al(), $$1, this.f.cd.k.size()});
            } else {
               boolean $$2 = $$0.j() != this.f.cd.j();
               this.f.cd.h();
               this.f.cd.a($$1, $$0.f(), $$0.i(), this.f);
               ObjectIterator var4 = Int2ObjectMaps.fastIterable($$0.h()).iterator();

               while (var4.hasNext()) {
                  Entry<cxp> $$3 = (Entry<cxp>)var4.next();
                  this.f.cd.b($$3.getIntKey(), (cxp)$$3.getValue());
               }

               this.f.cd.a($$0.g());
               this.f.cd.i();
               if ($$2) {
                  this.f.cd.e();
               } else {
                  this.f.cd.d();
               }
            }
         }
      }
   }

   @Override
   public void a(aip $$0) {
      aaf.a($$0, this, this.f.y());
      this.f.H();
      if (!this.f.aa_() && this.f.cd.l == $$0.b()) {
         if (!this.f.cd.b(this.f)) {
            h.debug("Player {} interacted with invalid menu {}", this.f, this.f.cd);
         } else {
            dcl.d $$1 = this.d.aI().a($$0.e());
            if ($$1 != null) {
               dcj<?> $$2 = $$1.b();
               if (this.f.J().b($$2.a())) {
                  if (this.f.cd instanceof cur $$3) {
                     if ($$2.b().ap_().d()) {
                        h.debug("Player {} tried to place impossible recipe {}", this.f, $$2.a().a());
                        return;
                     }

                     cur.a $$4 = $$3.a($$0.f(), this.f.b(), $$2, this.f.y(), this.f.gi());
                     if ($$4 == cur.a.b) {
                        this.f.f.b(new aes(this.f.cd.l, $$1.a().b()));
                     }
                  }
               }
            }
         }
      }
   }

   @Override
   public void a(aib $$0) {
      aaf.a($$0, this, this.f.y());
      this.f.H();
      if (this.f.cd.l == $$0.b() && !this.f.aa_()) {
         if (!this.f.cd.b(this.f)) {
            h.debug("Player {} interacted with invalid menu {}", this.f, this.f.cd);
         } else {
            boolean $$1 = this.f.cd.a(this.f, $$0.e());
            if ($$1) {
               this.f.cd.d();
            }
         }
      }
   }

   @Override
   public void a(aje $$0) {
      aaf.a($$0, this, this.f.y());
      if (this.f.h.e()) {
         boolean $$1 = $$0.b() < 0;
         cxp $$2 = $$0.e();
         cxp $$3 = $$2.v();
         if (!$$2.a(this.f.dW().J())) {
            return;
         }

         czy $$4 = $$2.a(ku.Y, czy.a);
         if ($$4.a("x") && $$4.a("y") && $$4.a("z")) {
            jh $$5 = dux.b($$4.d());
            if (this.f.dW().p($$5)) {
               dux $$6 = this.f.dW().c_($$5);
               if ($$6 != null) {
                  $$6.a($$2, this.f.dW().K_());
               }
            }
         }

         boolean $$7 = $$0.b() >= 1 && $$0.b() <= 45;
         boolean $$8 = $$2.f() || $$2.L() <= $$2.k();
         if ($$7 && $$8) {
            this.f.cc.b($$0.b()).e($$2);
            this.f.cc.a($$0.b(), $$3);
            this.f.cc.d();
         } else if ($$1 && $$8) {
            if (this.r.c()) {
               this.r.a();
               this.f.a($$2, true);
            } else {
               h.warn("Player {} was dropping items too fast in creative mode, ignoring.", this.f.al().getString());
            }
         }
      }
   }

   @Override
   public void a(ajh $$0) {
      List<String> $$1 = Stream.of($$0.f()).map(n::a).collect(Collectors.toList());
      this.a($$1).thenAcceptAsync($$1x -> this.a($$0, $$1x), this.d);
   }

   private void a(ajh $$0, List<ata> $$1) {
      this.f.H();
      ash $$2 = this.f.y();
      jh $$3 = $$0.b();
      if ($$2.B($$3)) {
         if (!($$2.c_($$3) instanceof dwk $$5)) {
            return;
         }

         $$5.a(this.f, $$0.e(), $$1);
      }
   }

   @Override
   public void a(aiq $$0) {
      aaf.a($$0, this, this.f.y());
      this.f.gj().b = $$0.b() && this.f.gj().c;
   }

   @Override
   public void a(aaw $$0) {
      aaf.a($$0, this, this.f.y());
      this.f.a($$0.b());
   }

   @Override
   public void a(ahq $$0) {
      aaf.a($$0, this, this.f.y());
      if (this.f.s(2) || this.h()) {
         this.d.a($$0.b(), false);
      }
   }

   @Override
   public void a(aik $$0) {
      aaf.a($$0, this, this.f.y());
      if (this.f.s(2) || this.h()) {
         this.d.b($$0.b());
      }
   }

   @Override
   public void a(ahv $$0) {
      aaf.a($$0, this, this.f.y());
      ym.a $$1 = $$0.b();
      cqa.a $$2 = this.P != null ? this.P.d().b() : null;
      cqa.a $$3 = $$1.b();
      if (!Objects.equals($$2, $$3)) {
         if ($$2 != null && $$3.b().isBefore($$2.b())) {
            this.a(cqa.a);
         } else {
            try {
               bar $$4 = this.d.ar();
               if ($$4 == null) {
                  h.warn("Ignoring chat session from {} due to missing Services public key", this.f.gh().getName());
                  return;
               }

               this.a($$1.a(this.f.gh(), $$4));
            } catch (cqa.b var6) {
               h.error("Failed to validate profile key: {}", var6.getMessage());
               this.a(var6.a());
            }
         }
      }
   }

   @Override
   public void a(aia $$0) {
      if (!this.U) {
         throw new IllegalStateException("Client acknowledged config, but none was requested");
      } else {
         this.e.a(acg.b, new ati(this.d, this.e, this.a(this.f.C())));
      }
   }

   @Override
   public void a(ahw $$0) {
      aaf.a($$0, this, this.f.y());
      this.g.a($$0.b());
   }

   @Override
   public void a(aif $$0) {
      aaf.a($$0, this, this.f.y());
      this.d.a(this.f, $$0.b());
   }

   private void a(ym $$0) {
      this.P = $$0;
      this.Q = $$0.a(this.f.cG());
      this.T.append(() -> {
         this.f.a($$0);
         this.d.ag().a(new aez(EnumSet.of(aez.a.b), List.of(this.f)));
      });
   }

   @Override
   public void a(aax $$0) {
   }

   @Override
   public void a(ahy $$0) {
      aaf.a($$0, this, this.f.y());
      if (!this.O) {
         this.f.a(fby.c);
      }

      this.O = false;
   }

   private void a(fby $$0) {
      if ($$0.h() > 1.0E-5F) {
         this.f.H();
      }

      this.f.a($$0);
      this.O = true;
   }

   @Override
   public asi o() {
      return this.f;
   }

   @FunctionalInterface
   interface a {
      btj run(asi var1, bvk var2, bti var3);
   }
}
