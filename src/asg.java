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

public class asg extends asd implements agf, asj, wd {
   static final Logger h = LogUtils.getLogger();
   private static final int i = -1;
   private static final int j = 4096;
   private static final int k = 80;
   private static final wp l = wp.c("multiplayer.disconnect.chat_validation_failed");
   private static final wp m = wp.c("chat.disabled.invalid_command_signature").a(n.m);
   private static final int n = 1000;
   public are f;
   public final asb g;
   private int o;
   private int p = -1;
   private final azz q = new azz(20, 200);
   private final azz r = new azz(20, 1480);
   private double s;
   private double t;
   private double u;
   private double v;
   private double w;
   private double x;
   @Nullable
   private bva y;
   private double z;
   private double A;
   private double B;
   private double C;
   private double D;
   private double E;
   @Nullable
   private fbx F;
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
   private xg P;
   private xj.b Q;
   private final wy R = new wy(20);
   private final xc S = xc.a();
   private final ayn T;
   private boolean U;

   public asg(MinecraftServer $$0, vi $$1, are $$2, art $$3) {
      super($$0, $$1, $$3);
      this.g = new asb($$1.e());
      this.f = $$2;
      $$2.f = this;
      $$2.Z().a();
      this.Q = xj.b.unsigned($$2.cF(), $$0::aA);
      this.T = new ayn($$0);
   }

   @Override
   public void d() {
      if (this.p > -1) {
         this.b(new abp(this.p));
         this.p = -1;
      }

      this.l();
      this.f.K = this.f.dz();
      this.f.L = this.f.dB();
      this.f.M = this.f.dF();
      this.f.i();
      this.f.a(this.s, this.t, this.u, this.f.dK(), this.f.dM());
      this.o++;
      this.N = this.M;
      if (this.I && !this.f.fT() && !this.f.bY() && !this.f.eF()) {
         if (++this.J > this.a((bva)this.f)) {
            h.warn("{} was kicked for floating too long!", this.f.al().getString());
            this.a(wp.c("multiplayer.disconnect.flying"));
            return;
         }
      } else {
         this.I = false;
         this.J = 0;
      }

      this.y = this.f.de();
      if (this.y != this.f && this.y.cV() == this.f) {
         this.z = this.y.dz();
         this.A = this.y.dB();
         this.B = this.y.dF();
         this.C = this.y.dz();
         this.D = this.y.dB();
         this.E = this.y.dF();
         if (this.K && this.y.cV() == this.f) {
            if (++this.L > this.a(this.y)) {
               h.warn("{} was kicked for floating a vehicle too long!", this.f.al().getString());
               this.a(wp.c("multiplayer.disconnect.flying"));
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
      if (this.f.N() > 0L && this.d.ap() > 0 && af.c() - this.f.N() > (long)this.d.ap() * 1000L * 60L) {
         this.a(wp.c("multiplayer.disconnect.idling"));
      }
   }

   private int a(bva $$0) {
      double $$1 = $$0.be();
      if ($$1 < 1.0E-5F) {
         return Integer.MAX_VALUE;
      } else {
         double $$2 = 0.08 / $$1;
         return ayz.c(80.0 * Math.max($$2, 1.0));
      }
   }

   @Override
   public void l() {
      this.s = this.f.dz();
      this.t = this.f.dB();
      this.u = this.f.dF();
      this.v = this.f.dz();
      this.w = this.f.dB();
      this.x = this.f.dF();
   }

   @Override
   public boolean c() {
      return this.e.i() && !this.U;
   }

   @Override
   public boolean a(yw<?> $$0) {
      return super.a($$0) ? true : this.U && this.e.i() && $$0 instanceof agt;
   }

   @Override
   protected GameProfile i() {
      return this.f.gk();
   }

   private <T, R> CompletableFuture<R> a(T $$0, BiFunction<asm, T, CompletableFuture<R>> $$1) {
      return $$1.apply(this.f.Z(), $$0).thenApply($$0x -> {
         if (!this.c()) {
            h.debug("Ignoring packet due to disconnection");
            throw new CancellationException("disconnected");
         } else {
            return (R)$$0x;
         }
      });
   }

   private CompletableFuture<arw> a(String $$0) {
      return this.a($$0, asm::a);
   }

   private CompletableFuture<List<arw>> a(List<String> $$0) {
      return this.a($$0, asm::a);
   }

   @Override
   public void a(ahn $$0) {
      yz.a($$0, this, this.f.y());
      this.f.a($$0.b());
   }

   private static boolean b(double $$0, double $$1, double $$2, float $$3, float $$4) {
      return Double.isNaN($$0) || Double.isNaN($$1) || Double.isNaN($$2) || !Floats.isFinite($$4) || !Floats.isFinite($$3);
   }

   private static double a(double $$0) {
      return ayz.a($$0, -3.0E7, 3.0E7);
   }

   private static double b(double $$0) {
      return ayz.a($$0, -2.0E7, 2.0E7);
   }

   @Override
   public void a(ahf $$0) {
      yz.a($$0, this, this.f.y());
      if (b($$0.b().a(), $$0.b().b(), $$0.b().c(), $$0.e(), $$0.f())) {
         this.a(wp.c("multiplayer.disconnect.invalid_vehicle_movement"));
      } else if (!this.p() && this.f.gL()) {
         bva $$1 = this.f.de();
         if ($$1 != this.f && $$1.cV() == this.f && $$1 == this.y) {
            ard $$2 = this.f.y();
            double $$3 = $$1.dz();
            double $$4 = $$1.dB();
            double $$5 = $$1.dF();
            double $$6 = a($$0.b().a());
            double $$7 = b($$0.b().b());
            double $$8 = a($$0.b().c());
            float $$9 = ayz.h($$0.e());
            float $$10 = ayz.h($$0.f());
            double $$11 = $$6 - this.z;
            double $$12 = $$7 - this.A;
            double $$13 = $$8 - this.B;
            double $$14 = $$1.dx().h();
            double $$15 = $$11 * $$11 + $$12 * $$12 + $$13 * $$13;
            if ($$15 - $$14 > 100.0 && !this.h()) {
               h.warn("{} (vehicle of {}) moved too quickly! {},{},{}", new Object[]{$$1.al().getString(), this.f.al().getString(), $$11, $$12, $$13});
               this.b(adh.a($$1));
               return;
            }

            boolean $$16 = $$2.a($$1, $$1.cQ().h(0.0625));
            $$11 = $$6 - this.C;
            $$12 = $$7 - this.D;
            $$13 = $$8 - this.E;
            boolean $$17 = $$1.R;
            if ($$1 instanceof bvy $$18 && $$18.d_()) {
               $$18.k();
            }

            $$1.a(bwc.b, new fbx($$11, $$12, $$13));
            $$11 = $$6 - $$1.dz();
            $$12 = $$7 - $$1.dB();
            if ($$12 > -0.5 || $$12 < 0.5) {
               $$12 = 0.0;
            }

            $$13 = $$8 - $$1.dF();
            $$15 = $$11 * $$11 + $$12 * $$12 + $$13 * $$13;
            boolean $$20 = false;
            if ($$15 > 0.0625) {
               $$20 = true;
               h.warn("{} (vehicle of {}) moved wrongly! {}", new Object[]{$$1.al().getString(), this.f.al().getString(), Math.sqrt($$15)});
            }

            $$1.a($$6, $$7, $$8, $$9, $$10);
            boolean $$21 = $$2.a($$1, $$1.cQ().h(0.0625));
            if ($$16 && ($$20 || !$$21)) {
               $$1.a($$3, $$4, $$5, $$9, $$10);
               this.b(adh.a($$1));
               return;
            }

            this.f.y().m().a(this.f);
            $$1.b(new fbx($$3, $$4, $$5), $$1.ds());
            fbx $$22 = new fbx($$1.dz() - $$3, $$1.dB() - $$4, $$1.dF() - $$5);
            this.a($$22);
            $$1.a($$0.g(), $$22);
            $$1.a($$22.d, $$22.e, $$22.f, $$0.g());
            this.f.b($$22.d, $$22.e, $$22.f);
            this.K = $$12 >= -0.03125 && !$$17 && !this.d.ad() && !$$1.bc() && this.b($$1);
            this.C = $$1.dz();
            this.D = $$1.dB();
            this.E = $$1.dF();
         }
      }
   }

   private boolean b(bva $$0) {
      return $$0.dU().a($$0.cQ().g(0.0625).b(0.0, -0.55, 0.0)).allMatch(dxp.a::l);
   }

   @Override
   public void a(agh $$0) {
      yz.a($$0, this, this.f.y());
      if ($$0.b() == this.G) {
         if (this.F == null) {
            this.a(wp.c("multiplayer.disconnect.invalid_player_movement"));
            return;
         }

         this.f.a(this.F.d, this.F.e, this.F.f, this.f.dK(), this.f.dM());
         this.v = this.F.d;
         this.w = this.F.e;
         this.x = this.F.f;
         this.f.R();
         this.F = null;
      }
   }

   @Override
   public void a(aho $$0) {
      yz.a($$0, this, this.f.y());
      this.f.v(true);
   }

   @Override
   public void a(ahq $$0) {
      yz.a($$0, this, this.f.y());
      dcc.d $$1 = this.d.aI().a($$0.b());
      if ($$1 != null) {
         this.f.J().d($$1.b().a());
      }
   }

   @Override
   public void a(aht $$0) {
      yz.a($$0, this, this.f.y());
      this.f.bQ.a($$0.b(), $$0.e());
   }

   @Override
   public void a(ahp $$0) {
      yz.a($$0, this, this.f.y());
      this.f.J().a($$0.b(), $$0.e(), $$0.f());
   }

   @Override
   public void a(ahs $$0) {
      yz.a($$0, this, this.f.y());
      if ($$0.e() == ahs.a.a) {
         aku $$1 = Objects.requireNonNull($$0.f());
         ai $$2 = this.d.aD().a($$1);
         if ($$2 != null) {
            this.f.S().a($$2);
         }
      }
   }

   @Override
   public void a(ags $$0) {
      yz.a($$0, this, this.f.y());
      StringReader $$1 = new StringReader($$0.e());
      if ($$1.canRead() && $$1.peek() == '/') {
         $$1.skip();
      }

      ParseResults<ex> $$2 = this.d.aG().a().parse($$1, this.f.A());
      this.d.aG().a().getCompletionSuggestions($$2).thenAccept($$1x -> {
         Suggestions $$2x = $$1x.getList().size() <= 1000 ? $$1x : new Suggestions($$1x.getRange(), $$1x.getList().subList(0, 1000));
         this.b(new acc($$0.b(), $$2x));
      });
   }

   @Override
   public void a(ahx $$0) {
      yz.a($$0, this, this.f.y());
      if (!this.d.q()) {
         this.f.a(wp.c("advMode.notEnabled"));
      } else if (!this.f.gI()) {
         this.f.a(wp.c("advMode.notAllowed"));
      } else {
         dga $$1 = null;
         dvc $$2 = null;
         ji $$3 = $$0.b();
         dus $$4 = this.f.dU().c_($$3);
         if ($$4 instanceof dvc) {
            $$2 = (dvc)$$4;
            $$1 = $$2.b();
         }

         String $$5 = $$0.e();
         boolean $$6 = $$0.f();
         if ($$1 != null) {
            dvc.a $$7 = $$2.s();
            dxq $$8 = this.f.dU().a_($$3);
            jn $$9 = $$8.c(dln.b);

            dxq $$10 = switch ($$0.i()) {
               case a -> dkg.lj.m();
               case b -> dkg.li.m();
               default -> dkg.gi.m();
            };
            dxq $$11 = $$10.b(dln.b, $$9).b(dln.c, Boolean.valueOf($$0.g()));
            if ($$11 != $$8) {
               this.f.dU().a($$3, $$11, 2);
               $$4.c($$11);
               this.f.dU().m($$3).a($$4);
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
            if (!azw.b($$5)) {
               this.f.a(wp.a("advMode.setCommand.success", $$5));
            }
         }
      }
   }

   @Override
   public void a(ahy $$0) {
      yz.a($$0, this, this.f.y());
      if (!this.d.q()) {
         this.f.a(wp.c("advMode.notEnabled"));
      } else if (!this.f.gI()) {
         this.f.a(wp.c("advMode.notAllowed"));
      } else {
         dga $$1 = $$0.a(this.f.dU());
         if ($$1 != null) {
            $$1.a($$0.b());
            $$1.a($$0.e());
            if (!$$0.e()) {
               $$1.c(null);
            }

            $$1.f();
            this.f.a(wp.a("advMode.setCommand.success", $$0.b()));
         }
      }
   }

   @Override
   public void a(ahh $$0) {
      ard $$1 = this.f.y();
      yz.a($$0, this, $$1);
      ji $$2 = $$0.b();
      if (this.f.a($$2, 1.0)) {
         if ($$1.p($$2)) {
            dxq $$3 = $$1.a_($$2);
            boolean $$4 = this.f.fX() && $$0.e();
            cxh $$5 = $$3.a((dhc)$$1, $$2, $$4);
            if (!$$5.f()) {
               if ($$4) {
                  a($$3, $$1, $$2, $$5);
               }

               this.a($$5);
            }
         }
      }
   }

   private static void a(dxq $$0, ard $$1, ji $$2, cxh $$3) {
      dus $$4 = $$0.x() ? $$1.c_($$2) : null;
      if ($$4 != null) {
         tq $$5 = $$4.e($$1.F_());
         $$4.a($$5);
         cvo.a($$3, $$4.p(), $$5);
         $$3.b($$4.q());
      }
   }

   @Override
   public void a(ahi $$0) {
      ard $$1 = this.f.y();
      yz.a($$0, this, $$1);
      bva $$2 = $$1.b($$0.b());
      if ($$2 != null && this.f.b($$2, 3.0)) {
         cxh $$3 = $$2.dH();
         if ($$3 != null && !$$3.f()) {
            this.a($$3);
         }
      }
   }

   private void a(cxh $$0) {
      if ($$0.a(this.f.dU().K())) {
         cpq $$1 = this.f.gl();
         int $$2 = $$1.c($$0);
         if ($$2 != -1) {
            if (cpq.d($$2)) {
               $$1.j = $$2;
            } else {
               $$1.c($$2);
            }
         } else if (this.f.fX()) {
            $$1.b($$0);
         }

         this.f.f.b(new afa($$1.j));
         this.f.bP.d();
      }
   }

   @Override
   public void a(ahr $$0) {
      yz.a($$0, this, this.f.y());
      if (this.f.bQ instanceof csz $$1) {
         if (!$$1.b(this.f)) {
            h.debug("Player {} interacted with invalid menu {}", this.f, $$1);
            return;
         }

         $$1.a($$0.b());
      }
   }

   @Override
   public void a(ahv $$0) {
      yz.a($$0, this, this.f.y());
      if (this.f.bQ instanceof ctb $$1) {
         if (!this.f.bQ.b(this.f)) {
            h.debug("Player {} interacted with invalid menu {}", this.f, this.f.bQ);
            return;
         }

         $$1.a($$0.b(), $$0.e());
      }
   }

   @Override
   public void a(aib $$0) {
      yz.a($$0, this, this.f.y());
      if (this.f.gI()) {
         ji $$1 = $$0.b();
         dxq $$2 = this.f.dU().a_($$1);
         if (this.f.dU().c_($$1) instanceof dwk $$4) {
            $$4.a($$0.f());
            $$4.a($$0.g());
            $$4.a($$0.h());
            $$4.a($$0.i());
            $$4.a($$0.j());
            $$4.a($$0.k());
            $$4.b($$0.l());
            $$4.a($$0.m());
            $$4.b($$0.n());
            $$4.e($$0.o());
            $$4.f($$0.p());
            $$4.a($$0.q());
            $$4.a($$0.r());
            if ($$4.d()) {
               String $$5 = $$4.c();
               if ($$0.e() == dwk.a.b) {
                  if ($$4.A()) {
                     this.f.a(wp.a("structure_block.save_success", $$5), false);
                  } else {
                     this.f.a(wp.a("structure_block.save_failure", $$5), false);
                  }
               } else if ($$0.e() == dwk.a.c) {
                  if (!$$4.C()) {
                     this.f.a(wp.a("structure_block.load_not_found", $$5), false);
                  } else if ($$4.a(this.f.y())) {
                     this.f.a(wp.a("structure_block.load_success", $$5), false);
                  } else {
                     this.f.a(wp.a("structure_block.load_prepare", $$5), false);
                  }
               } else if ($$0.e() == dwk.a.d) {
                  if ($$4.z()) {
                     this.f.a(wp.a("structure_block.size_success", $$5), false);
                  } else {
                     this.f.a(wp.c("structure_block.size_failure"), false);
                  }
               }
            } else {
               this.f.a(wp.a("structure_block.invalid_structure_name", $$0.g()), false);
            }

            $$4.e();
            this.f.dU().a($$1, $$2, $$2, 3);
         }
      }
   }

   @Override
   public void a(aia $$0) {
      yz.a($$0, this, this.f.y());
      if (this.f.gI()) {
         ji $$1 = $$0.b();
         dxq $$2 = this.f.dU().a_($$1);
         if (this.f.dU().c_($$1) instanceof dvv $$4) {
            $$4.a($$0.e());
            $$4.b($$0.f());
            $$4.a(akt.a(mc.aZ, $$0.g()));
            $$4.a($$0.h());
            $$4.a($$0.i());
            $$4.a($$0.k());
            $$4.b($$0.j());
            $$4.e();
            this.f.dU().a($$1, $$2, $$2, 3);
         }
      }
   }

   @Override
   public void a(ahc $$0) {
      yz.a($$0, this, this.f.y());
      if (this.f.gI()) {
         ji $$1 = $$0.b();
         if (this.f.dU().c_($$1) instanceof dvv $$3) {
            $$3.a(this.f.y(), $$0.e(), $$0.f());
         }
      }
   }

   @Override
   public void a(ahu $$0) {
      yz.a($$0, this, this.f.y());
      int $$1 = $$0.b();
      if (this.f.bQ instanceof cuh $$2) {
         if (!$$2.b(this.f)) {
            h.debug("Player {} interacted with invalid menu {}", this.f, $$2);
            return;
         }

         $$2.e($$1);
         $$2.h($$1);
      }
   }

   @Override
   public void a(agz $$0) {
      int $$1 = $$0.b();
      if (cpq.d($$1) || $$1 == 40) {
         List<String> $$2 = Lists.newArrayList();
         Optional<String> $$3 = $$0.f();
         $$3.ifPresent($$2::add);
         $$2.addAll($$0.e());
         Consumer<List<arw>> $$4 = $$3.isPresent() ? $$1x -> this.a((arw)$$1x.get(0), $$1x.subList(1, $$1x.size()), $$1) : $$1x -> this.a($$1x, $$1);
         this.a($$2).thenAcceptAsync($$4, this.d);
      }
   }

   private void a(List<arw> $$0, int $$1) {
      cxh $$2 = this.f.gl().a($$1);
      if ($$2.b(kv.U)) {
         List<arv<String>> $$3 = $$0.stream().map(this::a).toList();
         $$2.b(kv.U, new dan($$3));
      }
   }

   private void a(arw $$0, List<arw> $$1, int $$2) {
      cxh $$3 = this.f.gl().a($$2);
      if ($$3.b(kv.U)) {
         cxh $$4 = $$3.a((dgy)cxl.va);
         $$4.d(kv.U);
         List<arv<wp>> $$5 = $$1.stream().map($$0x -> this.a($$0x).a(wp::b)).toList();
         $$4.b(kv.V, new dao(this.a($$0), this.f.al().getString(), 0, $$5, true));
         this.f.gl().a($$2, $$4);
      }
   }

   private arv<String> a(arw $$0) {
      return this.f.aa() ? arv.a($$0.b()) : arv.a($$0);
   }

   @Override
   public void a(aha $$0) {
      yz.a($$0, this, this.f.y());
      if (this.f.s(2)) {
         bva $$1 = this.f.dU().a($$0.e());
         if ($$1 != null) {
            tq $$2 = $$1.f(new tq());
            this.f.f.b(new afr($$0.b(), $$2));
         }
      }
   }

   @Override
   public void a(agx $$0) {
      yz.a($$0, this, this.f.y());
      if (!this.f.U_() && $$0.e() == this.f.bQ.l) {
         if (this.f.bQ instanceof ctm $$1 && $$1.m() instanceof dvg $$2) {
            $$2.a($$0.b(), $$0.f());
         }
      }
   }

   @Override
   public void a(agi $$0) {
      yz.a($$0, this, this.f.y());
      if (this.f.s(2)) {
         dus $$1 = this.f.dU().c_($$0.e());
         tq $$2 = $$1 != null ? $$1.d(this.f.dW()) : null;
         this.f.f.b(new afr($$0.b(), $$2));
      }
   }

   @Override
   public void a(ahe $$0) {
      yz.a($$0, this, this.f.y());
      if (b($$0.a(0.0), $$0.b(0.0), $$0.c(0.0), $$0.a(0.0F), $$0.b(0.0F))) {
         this.a(wp.c("multiplayer.disconnect.invalid_player_movement"));
      } else {
         ard $$1 = this.f.y();
         if (!this.f.k) {
            if (this.o == 0) {
               this.l();
            }

            if (this.f.gL()) {
               float $$2 = ayz.h($$0.a(this.f.dK()));
               float $$3 = ayz.h($$0.b(this.f.dM()));
               if (this.p()) {
                  this.f.c($$2, $$3);
               } else {
                  double $$4 = a($$0.a(this.f.dz()));
                  double $$5 = b($$0.b(this.f.dB()));
                  double $$6 = a($$0.c(this.f.dF()));
                  if (this.f.bY()) {
                     this.f.a(this.f.dz(), this.f.dB(), this.f.dF(), $$2, $$3);
                     this.f.y().m().a(this.f);
                  } else {
                     double $$7 = this.f.dz();
                     double $$8 = this.f.dB();
                     double $$9 = this.f.dF();
                     double $$10 = $$4 - this.s;
                     double $$11 = $$5 - this.t;
                     double $$12 = $$6 - this.u;
                     double $$13 = this.f.dx().h();
                     double $$14 = $$10 * $$10 + $$11 * $$11 + $$12 * $$12;
                     if (this.f.fT()) {
                        if ($$14 > 1.0) {
                           this.a(this.f.dz(), this.f.dB(), this.f.dF(), $$2, $$3);
                        }
                     } else {
                        boolean $$15 = this.f.fL();
                        if ($$1.u().i()) {
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
                                 this.a(this.f.dz(), this.f.dB(), this.f.dF(), this.f.dK(), this.f.dM());
                                 return;
                              }
                           }
                        }

                        fbs $$18 = this.f.cQ();
                        $$10 = $$4 - this.v;
                        $$11 = $$5 - this.w;
                        $$12 = $$6 - this.x;
                        boolean $$19 = $$11 > 0.0;
                        if (this.f.aJ() && !$$0.b() && $$19) {
                           this.f.s();
                        }

                        boolean $$20 = this.f.R;
                        this.f.a(bwc.b, new fbx($$10, $$11, $$12));
                        $$10 = $$4 - this.f.dz();
                        $$11 = $$5 - this.f.dB();
                        if ($$11 > -0.5 || $$11 < 0.5) {
                           $$11 = 0.0;
                        }

                        $$12 = $$6 - this.f.dF();
                        $$14 = $$10 * $$10 + $$11 * $$11 + $$12 * $$12;
                        boolean $$22 = false;
                        if (!this.f.Q() && $$14 > 0.0625 && !this.f.fT() && !this.f.h.e() && this.f.h.b() != dgw.d) {
                           $$22 = true;
                           h.warn("{} moved wrongly!", this.f.al().getString());
                        }

                        if (this.f.ad || this.f.fT() || (!$$22 || !$$1.a(this.f, $$18)) && !this.a($$1, $$18, $$4, $$5, $$6)) {
                           this.f.a($$4, $$5, $$6, $$2, $$3);
                           boolean $$23 = this.f.fx();
                           this.I = $$11 >= -0.03125
                              && !$$20
                              && this.f.h.b() != dgw.d
                              && !this.d.ad()
                              && !this.f.gm().c
                              && !this.f.b(bug.y)
                              && !$$15
                              && !$$23
                              && this.b(this.f);
                           this.f.y().m().a(this.f);
                           fbx $$24 = new fbx(this.f.dz() - $$7, this.f.dB() - $$8, this.f.dF() - $$9);
                           this.f.a($$0.b(), $$0.e(), $$24);
                           this.f.a($$24.d, $$24.e, $$24.f, $$0.b());
                           this.f.b(new fbx($$7, $$8, $$9), this.f.ds());
                           this.a($$24);
                           if ($$19) {
                              this.f.k();
                           }

                           if ($$0.b() || this.f.ee() || this.f.d_() || this.f.U_() || $$15 || $$23) {
                              this.f.gQ();
                           }

                           this.f.b(this.f.dz() - $$7, this.f.dB() - $$8, this.f.dF() - $$9);
                           this.v = this.f.dz();
                           this.w = this.f.dB();
                           this.x = this.f.dF();
                        } else {
                           this.a($$7, $$8, $$9, $$2, $$3);
                           this.f.a(this.f.dz() - $$7, this.f.dB() - $$8, this.f.dF() - $$9, $$0.b());
                        }
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
         dgv $$1 = this.f.y().O();
         return $$1.b(dgv.t) ? false : !$$0 || !$$1.b(dgv.u);
      }
   }

   private boolean p() {
      if (this.F != null) {
         if (this.o - this.H > 20) {
            this.H = this.o;
            this.a(this.F.d, this.F.e, this.F.f, this.f.dK(), this.f.dM());
         }

         return true;
      } else {
         this.H = this.o;
         return false;
      }
   }

   private boolean a(dhc $$0, fbs $$1, double $$2, double $$3, double $$4) {
      fbs $$5 = this.f.cQ().d($$2 - this.f.dz(), $$3 - this.f.dB(), $$4 - this.f.dF());
      Iterable<fcr> $$6 = $$0.d(this.f, $$5.h(1.0E-5F));
      fcr $$7 = fco.a($$1.h(1.0E-5F));

      for (fcr $$8 : $$6) {
         if (!fco.c($$8, $$7, fcb.i)) {
            return true;
         }
      }

      return false;
   }

   public void a(double $$0, double $$1, double $$2, float $$3, float $$4) {
      this.a(new bwl(new fbx($$0, $$1, $$2), fbx.c, $$3, $$4), Collections.emptySet());
   }

   public void a(bwl $$0, Set<bwm> $$1) {
      this.H = this.o;
      if (++this.G == Integer.MAX_VALUE) {
         this.G = 0;
      }

      this.f.a($$0, $$1);
      this.F = this.f.ds();
      this.f.f.b(adu.a(this.G, $$0, $$1));
   }

   @Override
   public void a(ahl $$0) {
      yz.a($$0, this, this.f.y());
      if (this.f.gL()) {
         ji $$1 = $$0.b();
         this.f.H();
         ahl.a $$2 = $$0.f();
         switch ($$2) {
            case g:
               if (!this.f.U_()) {
                  cxh $$3 = this.f.b(bsx.b);
                  this.f.a(bsx.b, this.f.b(bsx.a));
                  this.f.a(bsx.a, $$3);
                  this.f.fH();
               }

               return;
            case e:
               if (!this.f.U_()) {
                  this.f.a(false);
               }

               return;
            case d:
               if (!this.f.U_()) {
                  this.f.a(true);
               }

               return;
            case f:
               this.f.fG();
               return;
            case a:
            case b:
            case c:
               this.f.h.a($$1, $$2, $$0.e(), this.f.dU().ao(), $$0.g());
               this.f.f.a($$0.g());
               return;
            default:
               throw new IllegalArgumentException("Invalid player action");
         }
      }
   }

   private static boolean a(are $$0, cxh $$1) {
      if ($$1.f()) {
         return false;
      } else {
         cxd $$2 = $$1.h();
         return ($$2 instanceof cvo || $$2 instanceof cvu) && !$$0.gH().a($$1);
      }
   }

   @Override
   public void a(aif $$0) {
      yz.a($$0, this, this.f.y());
      if (this.f.gL()) {
         this.f.f.a($$0.f());
         ard $$1 = this.f.y();
         bsx $$2 = $$0.b();
         cxh $$3 = this.f.b($$2);
         if ($$3.a($$1.K())) {
            fbt $$4 = $$0.e();
            fbx $$5 = $$4.g();
            ji $$6 = $$4.b();
            if (this.f.a($$6, 1.0)) {
               fbx $$7 = $$5.d(fbx.b($$6));
               double $$8 = 1.0000001;
               if (Math.abs($$7.a()) < 1.0000001 && Math.abs($$7.b()) < 1.0000001 && Math.abs($$7.c()) < 1.0000001) {
                  jn $$9 = $$4.c();
                  this.f.H();
                  int $$10 = this.f.dU().ao();
                  if ($$6.v() <= $$10) {
                     if (this.F == null && $$1.a(this.f, $$6)) {
                        bsy $$11 = this.f.h.a(this.f, $$1, $$3, $$2, $$4);
                        if ($$11.a()) {
                           ap.P.a(this.f, $$4.b(), $$3.v());
                        }

                        if ($$9 == jn.b && !$$11.a() && $$6.v() >= $$10 && a(this.f, $$3)) {
                           wp $$12 = wp.a("build.tooHigh", $$10).a(n.m);
                           this.f.b($$12, true);
                        } else if ($$11 instanceof bsy.d $$13 && $$13.e() == bsy.e.c) {
                           this.f.a($$2, true);
                        }
                     }
                  } else {
                     wp $$14 = wp.a("build.tooHigh", $$10).a(n.m);
                     this.f.b($$14, true);
                  }

                  this.f.f.b(new abt($$1, $$6));
                  this.f.f.b(new abt($$1, $$6.a($$9)));
               } else {
                  h.warn("Rejecting UseItemOnPacket from {}: Location {} too far away from hit block {}.", new Object[]{this.f.gk().getName(), $$5, $$6});
               }
            }
         }
      }
   }

   @Override
   public void a(aig $$0) {
      yz.a($$0, this, this.f.y());
      if (this.f.gL()) {
         this.a($$0.e());
         ard $$1 = this.f.y();
         bsx $$2 = $$0.b();
         cxh $$3 = this.f.b($$2);
         this.f.H();
         if (!$$3.f() && $$3.a($$1.K())) {
            float $$4 = ayz.h($$0.f());
            float $$5 = ayz.h($$0.g());
            if ($$5 != this.f.dM() || $$4 != this.f.dK()) {
               this.f.c($$4, $$5);
            }

            if (this.f.h.a(this.f, $$1, $$3, $$2) instanceof bsy.d $$7 && $$7.e() == bsy.e.c) {
               this.f.a($$2, true);
            }
         }
      }
   }

   @Override
   public void a(aie $$0) {
      yz.a($$0, this, this.f.y());
      if (this.f.U_()) {
         for (ard $$1 : this.d.L()) {
            bva $$2 = $$0.a($$1);
            if ($$2 != null) {
               this.f.a($$1, $$2.dz(), $$2.dB(), $$2.dF(), Set.of(), $$2.dK(), $$2.dM(), true);
               return;
            }
         }
      }
   }

   @Override
   public void a(ahg $$0) {
      yz.a($$0, this, this.f.y());
      if (this.f.dk() instanceof cro $$2) {
         $$2.a($$0.b(), $$0.e());
      }
   }

   @Override
   public void a(vk $$0) {
      h.info("{} lost connection: {}", this.f.al().getString(), $$0.a().getString());
      this.q();
      super.a($$0);
   }

   private void q() {
      this.T.close();
      this.d.av();
      this.d.ag().a(wp.a("multiplayer.player.left", this.f.m_()).a(n.o), false);
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
   public void a(ahw $$0) {
      yz.a($$0, this, this.f.y());
      if ($$0.b() >= 0 && $$0.b() < cpq.g()) {
         if (this.f.gl().j != $$0.b() && this.f.fC() == bsx.a) {
            this.f.fH();
         }

         this.f.gl().j = $$0.b();
         this.f.H();
      } else {
         h.warn("{} tried to set an invalid carried item", this.f.al().getString());
      }
   }

   @Override
   public void a(agn $$0) {
      Optional<ww> $$1 = this.a($$0.h());
      if (!$$1.isEmpty()) {
         this.a($$0.b(), () -> {
            xf $$2;
            try {
               $$2 = this.a($$0, $$1.get());
            } catch (xj.a var6) {
               this.a(var6);
               return;
            }

            CompletableFuture<arw> $$5 = this.a($$2.c());
            wp $$6 = this.d.bk().decorate(this.f, $$2.d());
            this.T.append($$5, $$2x -> {
               xf $$3 = $$2.a($$6).a($$2x.e());
               this.b($$3);
            });
         });
      }
   }

   @Override
   public void a(agl $$0) {
      this.a($$0.b(), () -> {
         this.b($$0.b());
         this.r();
      });
   }

   private void b(String $$0) {
      ParseResults<ex> $$1 = this.c($$0);
      if (this.d.aA() && xh.a($$1)) {
         h.error("Received unsigned command packet from {}, but the command requires signable arguments: {}", this.f.gk().getName(), $$0);
         this.f.a(m);
      } else {
         this.d.aG().a($$1, $$0);
      }
   }

   @Override
   public void a(agm $$0) {
      Optional<ww> $$1 = this.a($$0.h());
      if (!$$1.isEmpty()) {
         this.a($$0.b(), () -> {
            this.a($$0, $$1.get());
            this.r();
         });
      }
   }

   private void a(agm $$0, ww $$1) {
      ParseResults<ex> $$2 = this.c($$0.b());

      Map<String, xf> $$3;
      try {
         $$3 = this.a($$0, xh.b($$2), $$1);
      } catch (xj.a var6) {
         this.a(var6);
         return;
      }

      ev $$6 = new ev.a($$3);
      $$2 = ey.a($$2, $$1x -> $$1x.a($$6, this.T));
      this.d.aG().a($$2, $$0.b());
   }

   private void a(xj.a $$0) {
      h.warn("Failed to update secure chat state for {}: '{}'", this.f.gk().getName(), $$0.a().getString());
      this.f.a($$0.a().f().a(n.m));
   }

   private <S> Map<String, xf> a(agm $$0, xh<S> $$1, ww $$2) throws xj.a {
      List<fe.a> $$3 = $$0.g().a();
      List<xh.a<S>> $$4 = $$1.a();
      if ($$3.isEmpty()) {
         return this.b($$4);
      } else {
         Map<String, xf> $$5 = new Object2ObjectOpenHashMap();

         for (fe.a $$6 : $$3) {
            xh.a<S> $$7 = $$1.a($$6.a());
            if ($$7 == null) {
               this.Q.setChainBroken();
               throw a($$0.b(), $$3, $$4);
            }

            xi $$8 = new xi($$7.c(), $$0.e(), $$0.f(), $$2);
            $$5.put($$7.a(), this.Q.unpack($$6.b(), $$8));
         }

         for (xh.a<S> $$9 : $$4) {
            if (!$$5.containsKey($$9.a())) {
               throw a($$0.b(), $$3, $$4);
            }
         }

         return $$5;
      }
   }

   private <S> Map<String, xf> b(List<xh.a<S>> $$0) throws xj.a {
      Map<String, xf> $$1 = new HashMap<>();

      for (xh.a<S> $$2 : $$0) {
         xi $$3 = xi.a($$2.c());
         $$1.put($$2.a(), this.Q.unpack(null, $$3));
      }

      return $$1;
   }

   private static <S> xj.a a(String $$0, List<fe.a> $$1, List<xh.a<S>> $$2) {
      String $$3 = $$1.stream().map(fe.a::a).collect(Collectors.joining(", "));
      String $$4 = $$2.stream().map(xh.a::a).collect(Collectors.joining(", "));
      h.error("Signed command mismatch between server and client ('{}'): got [{}] from client, but expected [{}]", new Object[]{$$0, $$3, $$4});
      return new xj.a(m);
   }

   private ParseResults<ex> c(String $$0) {
      CommandDispatcher<ex> $$1 = this.d.aG().a();
      return $$1.parse($$0, this.f.A());
   }

   private void a(String $$0, Runnable $$1) {
      if (d($$0)) {
         this.a(wp.c("multiplayer.disconnect.illegal_characters"));
      } else if (this.f.E() == cpo.c) {
         this.b(new afp(wp.c("chat.disabled.options").a(n.m), false));
      } else {
         this.f.H();
         this.d.execute($$1);
      }
   }

   private Optional<ww> a(ww.b $$0) {
      synchronized (this.R) {
         Optional<ww> $$1 = this.R.a($$0);
         if ($$1.isEmpty()) {
            h.warn("Failed to validate message acknowledgements from {}", this.f.al().getString());
            this.a(l);
         }

         return $$1;
      }
   }

   private static boolean d(String $$0) {
      for (int $$1 = 0; $$1 < $$0.length(); $$1++) {
         if (!azw.a($$0.charAt($$1))) {
            return true;
         }
      }

      return false;
   }

   private xf a(agn $$0, ww $$1) throws xj.a {
      xi $$2 = new xi($$0.b(), $$0.e(), $$0.f(), $$1);
      return this.Q.unpack($$0.g(), $$2);
   }

   private void b(xf $$0) {
      this.d.ag().a($$0, this.f, wl.a(wl.e, this.f));
      this.r();
   }

   private void r() {
      this.q.a();
      if (!this.q.c() && !this.d.ag().f(this.f.gk()) && !this.d.a(this.f.gk())) {
         this.a(wp.c("disconnect.spam"));
      }
   }

   @Override
   public void a(agk $$0) {
      synchronized (this.R) {
         if (!this.R.a($$0.b())) {
            h.warn("Failed to validate message acknowledgements from {}", this.f.al().getString());
            this.a(l);
         }
      }
   }

   @Override
   public void a(aid $$0) {
      yz.a($$0, this, this.f.y());
      this.f.H();
      this.f.a($$0.b());
   }

   @Override
   public void a(ahm $$0) {
      yz.a($$0, this, this.f.y());
      if (this.f.gL()) {
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
               if (this.f.fT()) {
                  this.f.a(false, true);
                  this.F = this.f.ds();
               }
               break;
            case f:
               if (this.f.dk() instanceof bwi $$1) {
                  int $$2 = $$0.f();
                  if ($$1.a() && $$2 > 0) {
                     $$1.c($$2);
                  }
               }
               break;
            case g:
               if (this.f.dk() instanceof bwi $$3) {
                  $$3.b();
               }
               break;
            case h:
               if (this.f.dj() instanceof bvq $$4) {
                  $$4.b(this.f);
               }
               break;
            case i:
               if (!this.f.gs()) {
                  this.f.fo();
               }
               break;
            default:
               throw new IllegalArgumentException("Invalid client command!");
         }
      }
   }

   public void a(xf $$0) {
      xb $$1 = $$0.l();
      if ($$1 != null) {
         this.S.a($$0.m(), $$0.l());
         int $$2;
         synchronized (this.R) {
            this.R.a($$1);
            $$2 = this.R.a();
         }

         if ($$2 > 4096) {
            this.a(wp.c("multiplayer.disconnect.too_many_pending_chats"));
         }
      }
   }

   public void a(xf $$0, wl.a $$1) {
      this.b(new adn($$0.k().c(), $$0.k().b(), $$0.l(), $$0.m().a(this.S), $$0.n(), $$0.o(), $$1));
      this.a($$0);
   }

   public void a(wp $$0, wl.a $$1) {
      this.b(new acn($$0, $$1));
   }

   public SocketAddress m() {
      return this.e.d();
   }

   public void n() {
      this.U = true;
      this.q();
      this.b(afn.a);
      this.e.a(aba.d);
   }

   @Override
   public void a(ajn $$0) {
      this.e.a(new ajk($$0.b()));
   }

   @Override
   public void a(ahb $$0) {
      yz.a($$0, this, this.f.y());
      if (this.f.gL()) {
         final ard $$1 = this.f.y();
         final bva $$2 = $$0.a($$1);
         this.f.H();
         this.f.g($$0.b());
         if ($$2 != null) {
            if (!$$1.A_().a($$2.du())) {
               return;
            }

            fbs $$3 = $$2.cQ();
            if (this.f.a($$3, 3.0)) {
               $$0.a(new ahb.c() {
                  private void a(bsx $$0, asg.a $$1x) {
                     cxh $$2 = asg.this.f.b($$0);
                     if ($$2.a($$1.K())) {
                        cxh $$3 = $$2.v();
                        if ($$1.run(asg.this.f, $$2, $$0) instanceof bsy.d $$5) {
                           cxh $$6 = $$5.c() ? $$3 : cxh.k;
                           ap.T.a(asg.this.f, $$6, $$2);
                           if ($$5.e() == bsy.e.c) {
                              asg.this.f.a($$0, true);
                           }
                        }
                     }
                  }

                  @Override
                  public void a(bsx $$0) {
                     this.a($$0, cpr::a);
                  }

                  @Override
                  public void a(bsx $$0, fbx $$1x) {
                     this.a($$0, ($$1xxx, $$2xx, $$3) -> $$2xx.a($$1xxx, $$1, $$3));
                  }

                  @Override
                  public void a() {
                     label23:
                     if (!($$2 instanceof clw) && !($$2 instanceof bvn) && $$2 != asg.this.f) {
                        if ($$2 instanceof cpy $$0 && !$$0.cA()) {
                           break label23;
                        }

                        cxh $$1 = asg.this.f.b(bsx.a);
                        if (!$$1.a($$1.K())) {
                           return;
                        }

                        asg.this.f.e($$2);
                        return;
                     }

                     asg.this.a(wp.c("multiplayer.disconnect.invalid_entity_attacked"));
                     asg.h.warn("Player {} tried to attack an invalid entity", asg.this.f.al().getString());
                  }
               });
            }
         }
      }
   }

   @Override
   public void a(agq $$0) {
      yz.a($$0, this, this.f.y());
      this.f.H();
      agq.a $$1 = $$0.b();
      switch ($$1) {
         case a:
            if (this.f.k) {
               this.f.k = false;
               this.f = this.d.ag().a(this.f, true, bva.d.e);
               this.l();
               ap.w.a(this.f, dgz.k, dgz.i);
            } else {
               if (this.f.eE() > 0.0F) {
                  return;
               }

               this.f = this.d.ag().a(this.f, false, bva.d.a);
               this.l();
               if (this.d.r_()) {
                  this.f.a(dgw.d);
                  this.f.y().O().a(dgv.r).a(false, this.d);
               }
            }
            break;
         case b:
            this.f.I().a(this.f);
      }
   }

   @Override
   public void a(agw $$0) {
      yz.a($$0, this, this.f.y());
      this.f.q();
   }

   @Override
   public void a(agv $$0) {
      yz.a($$0, this, this.f.y());
      this.f.H();
      if (this.f.bQ.l == $$0.b()) {
         if (this.f.U_()) {
            this.f.bQ.b();
         } else if (!this.f.bQ.b(this.f)) {
            h.debug("Player {} interacted with invalid menu {}", this.f, this.f.bQ);
         } else {
            int $$1 = $$0.e();
            if (!this.f.bQ.a($$1)) {
               h.debug("Player {} clicked invalid slot index: {}, available slots: {}", new Object[]{this.f.al(), $$1, this.f.bQ.k.size()});
            } else {
               boolean $$2 = $$0.j() != this.f.bQ.j();
               this.f.bQ.h();
               this.f.bQ.a($$1, $$0.f(), $$0.i(), this.f);
               ObjectIterator var4 = Int2ObjectMaps.fastIterable($$0.h()).iterator();

               while (var4.hasNext()) {
                  Entry<cxh> $$3 = (Entry<cxh>)var4.next();
                  this.f.bQ.b($$3.getIntKey(), (cxh)$$3.getValue());
               }

               this.f.bQ.a($$0.g());
               this.f.bQ.i();
               if ($$2) {
                  this.f.bQ.e();
               } else {
                  this.f.bQ.d();
               }
            }
         }
      }
   }

   @Override
   public void a(ahj $$0) {
      yz.a($$0, this, this.f.y());
      this.f.H();
      if (!this.f.U_() && this.f.bQ.l == $$0.b()) {
         if (!this.f.bQ.b(this.f)) {
            h.debug("Player {} interacted with invalid menu {}", this.f, this.f.bQ);
         } else {
            dcc.d $$1 = this.d.aI().a($$0.e());
            if ($$1 != null) {
               dca<?> $$2 = $$1.b();
               if (this.f.J().b($$2.a())) {
                  if (this.f.bQ instanceof cul $$3) {
                     if ($$2.b().ao_().c()) {
                        h.debug("Player {} tried to place impossible recipe {}", this.f, $$2.a().a());
                        return;
                     }

                     cul.a $$4 = $$3.a($$0.f(), this.f.b(), $$2, this.f.y(), this.f.gl());
                     if ($$4 == cul.a.b) {
                        this.f.f.b(new adl(this.f.bQ.l, $$1.a().b()));
                     }
                  }
               }
            }
         }
      }
   }

   @Override
   public void a(agu $$0) {
      yz.a($$0, this, this.f.y());
      this.f.H();
      if (this.f.bQ.l == $$0.b() && !this.f.U_()) {
         if (!this.f.bQ.b(this.f)) {
            h.debug("Player {} interacted with invalid menu {}", this.f, this.f.bQ);
         } else {
            boolean $$1 = this.f.bQ.a(this.f, $$0.e());
            if ($$1) {
               this.f.bQ.d();
            }
         }
      }
   }

   @Override
   public void a(ahz $$0) {
      yz.a($$0, this, this.f.y());
      if (this.f.fX()) {
         boolean $$1 = $$0.b() < 0;
         cxh $$2 = $$0.e();
         if (!$$2.a(this.f.dU().K())) {
            return;
         }

         boolean $$3 = $$0.b() >= 1 && $$0.b() <= 45;
         boolean $$4 = $$2.f() || $$2.M() <= $$2.k();
         if ($$3 && $$4) {
            this.f.bP.b($$0.b()).e($$2);
            this.f.bP.a($$0.b(), $$2);
            this.f.bP.d();
         } else if ($$1 && $$4) {
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
   public void a(aic $$0) {
      List<String> $$1 = Stream.of($$0.f()).map(n::a).collect(Collectors.toList());
      this.a($$1).thenAcceptAsync($$1x -> this.a($$0, $$1x), this.d);
   }

   private void a(aic $$0, List<arw> $$1) {
      this.f.H();
      ard $$2 = this.f.y();
      ji $$3 = $$0.b();
      if ($$2.B($$3)) {
         if (!($$2.c_($$3) instanceof dwf $$5)) {
            return;
         }

         $$5.a(this.f, $$0.e(), $$1);
      }
   }

   @Override
   public void a(ahk $$0) {
      yz.a($$0, this, this.f.y());
      this.f.gm().b = $$0.b() && this.f.gm().c;
   }

   @Override
   public void a(zq $$0) {
      yz.a($$0, this, this.f.y());
      boolean $$1 = this.f.a(cps.g);
      this.f.a($$0.b());
      if (this.f.a(cps.g) != $$1) {
         this.d.ag().a(new ads(ads.a.h, this.f));
      }
   }

   @Override
   public void a(agj $$0) {
      yz.a($$0, this, this.f.y());
      if (this.f.s(2) || this.h()) {
         this.d.a($$0.b(), false);
      }
   }

   @Override
   public void a(ahd $$0) {
      yz.a($$0, this, this.f.y());
      if (this.f.s(2) || this.h()) {
         this.d.b($$0.b());
      }
   }

   @Override
   public void a(ago $$0) {
      yz.a($$0, this, this.f.y());
      xg.a $$1 = $$0.b();
      cpu.a $$2 = this.P != null ? this.P.d().b() : null;
      cpu.a $$3 = $$1.b();
      if (!Objects.equals($$2, $$3)) {
         if ($$2 != null && $$3.b().isBefore($$2.b())) {
            this.a(cpu.a);
         } else {
            try {
               azm $$4 = this.d.ar();
               if ($$4 == null) {
                  h.warn("Ignoring chat session from {} due to missing Services public key", this.f.gk().getName());
                  return;
               }

               this.a($$1.a(this.f.gk(), $$4));
            } catch (cpu.b var6) {
               h.error("Failed to validate profile key: {}", var6.getMessage());
               this.a(var6.a());
            }
         }
      }
   }

   @Override
   public void a(agt $$0) {
      if (!this.U) {
         throw new IllegalStateException("Client acknowledged config, but none was requested");
      } else {
         this.e.a(aba.b, new ase(this.d, this.e, this.a(this.f.C())));
      }
   }

   @Override
   public void a(agp $$0) {
      yz.a($$0, this, this.f.y());
      this.g.a($$0.b());
   }

   @Override
   public void a(agy $$0) {
      yz.a($$0, this, this.f.y());
      this.d.a(this.f, $$0.b());
   }

   private void a(xg $$0) {
      this.P = $$0;
      this.Q = $$0.a(this.f.cF());
      this.T.append(() -> {
         this.f.a($$0);
         this.d.ag().a(new ads(EnumSet.of(ads.a.b), List.of(this.f)));
      });
   }

   @Override
   public void a(zr $$0) {
   }

   @Override
   public void a(agr $$0) {
      yz.a($$0, this, this.f.y());
      if (!this.O) {
         this.f.a(fbx.c);
      }

      this.O = false;
   }

   private void a(fbx $$0) {
      if ($$0.h() > 1.0E-5F) {
         this.f.H();
      }

      this.f.a($$0);
      this.O = true;
   }

   @Override
   public are o() {
      return this.f;
   }

   @FunctionalInterface
   interface a {
      bsy run(are var1, bva var2, bsx var3);
   }
}
