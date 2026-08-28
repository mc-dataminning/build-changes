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

public class ata extends asx implements ahb, atd, wy {
   static final Logger h = LogUtils.getLogger();
   private static final int i = -1;
   private static final int j = 4096;
   private static final int k = 80;
   private static final xk l = xk.c("multiplayer.disconnect.chat_validation_failed");
   private static final xk m = xk.c("chat.disabled.invalid_command_signature").a(n.m);
   private static final int n = 1000;
   public ary f;
   public final asv g;
   private int o;
   private int p = -1;
   private final bau q = new bau(20, 200);
   private final bau r = new bau(20, 1480);
   private double s;
   private double t;
   private double u;
   private double v;
   private double w;
   private double x;
   @Nullable
   private bvb y;
   private double z;
   private double A;
   private double B;
   private double C;
   private double D;
   private double E;
   @Nullable
   private fbr F;
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
   private yb P;
   private ye.b Q;
   private final xt R = new xt(20);
   private final xx S = xx.a();
   private final azi T;
   private boolean U;

   public ata(MinecraftServer $$0, we $$1, ary $$2, asn $$3) {
      super($$0, $$1, $$3);
      this.g = new asv($$1.e());
      this.f = $$2;
      $$2.f = this;
      $$2.Z().a();
      this.Q = ye.b.unsigned($$2.cG(), $$0::aA);
      this.T = new azi($$0);
   }

   @Override
   public void d() {
      if (this.p > -1) {
         this.b(new acl(this.p));
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
         if (++this.J > this.a((bvb)this.f)) {
            h.warn("{} was kicked for floating too long!", this.f.al().getString());
            this.a(xk.c("multiplayer.disconnect.flying"));
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
               this.a(xk.c("multiplayer.disconnect.flying"));
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
         this.a(xk.c("multiplayer.disconnect.idling"));
      }
   }

   private int a(bvb $$0) {
      double $$1 = $$0.be();
      if ($$1 < 1.0E-5F) {
         return Integer.MAX_VALUE;
      } else {
         double $$2 = 0.08 / $$1;
         return azu.c(80.0 * Math.max($$2, 1.0));
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
   public boolean a(zr<?> $$0) {
      return super.a($$0) ? true : this.U && this.e.i() && $$0 instanceof ahp;
   }

   @Override
   protected GameProfile i() {
      return this.f.gh();
   }

   private <T, R> CompletableFuture<R> a(T $$0, BiFunction<atg, T, CompletableFuture<R>> $$1) {
      return $$1.apply(this.f.Z(), $$0).thenApply($$0x -> {
         if (!this.c()) {
            h.debug("Ignoring packet due to disconnection");
            throw new CancellationException("disconnected");
         } else {
            return (R)$$0x;
         }
      });
   }

   private CompletableFuture<asq> a(String $$0) {
      return this.a($$0, atg::a);
   }

   private CompletableFuture<List<asq>> a(List<String> $$0) {
      return this.a($$0, atg::a);
   }

   @Override
   public void a(aij $$0) {
      zu.a($$0, this, this.f.y());
      this.f.a($$0.b());
   }

   private static boolean b(double $$0, double $$1, double $$2, float $$3, float $$4) {
      return Double.isNaN($$0) || Double.isNaN($$1) || Double.isNaN($$2) || !Floats.isFinite($$4) || !Floats.isFinite($$3);
   }

   private static double a(double $$0) {
      return azu.a($$0, -3.0E7, 3.0E7);
   }

   private static double b(double $$0) {
      return azu.a($$0, -2.0E7, 2.0E7);
   }

   @Override
   public void a(aib $$0) {
      zu.a($$0, this, this.f.y());
      if (b($$0.b(), $$0.e(), $$0.f(), $$0.g(), $$0.h())) {
         this.a(xk.c("multiplayer.disconnect.invalid_vehicle_movement"));
      } else if (!this.p()) {
         bvb $$1 = this.f.dg();
         if ($$1 != this.f && $$1.cX() == this.f && $$1 == this.y) {
            arx $$2 = this.f.y();
            double $$3 = $$1.dB();
            double $$4 = $$1.dD();
            double $$5 = $$1.dH();
            double $$6 = a($$0.b());
            double $$7 = b($$0.e());
            double $$8 = a($$0.f());
            float $$9 = azu.h($$0.g());
            float $$10 = azu.h($$0.h());
            double $$11 = $$6 - this.z;
            double $$12 = $$7 - this.A;
            double $$13 = $$8 - this.B;
            double $$14 = $$1.dz().h();
            double $$15 = $$11 * $$11 + $$12 * $$12 + $$13 * $$13;
            if ($$15 - $$14 > 100.0 && !this.h()) {
               h.warn("{} (vehicle of {}) moved too quickly! {},{},{}", new Object[]{$$1.al().getString(), this.f.al().getString(), $$11, $$12, $$13});
               this.b(new aed($$1));
               return;
            }

            boolean $$16 = $$2.a($$1, $$1.cR().h(0.0625));
            $$11 = $$6 - this.C;
            $$12 = $$7 - this.D - 1.0E-6;
            $$13 = $$8 - this.E;
            boolean $$17 = $$1.R;
            if ($$1 instanceof bvx $$18 && $$18.q_()) {
               $$18.k();
            }

            $$1.a(bwb.b, new fbr($$11, $$12, $$13));
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
               this.b(new aed($$1));
               return;
            }

            this.f.y().m().a(this.f);
            $$1.b(new fbr($$3, $$4, $$5), $$1.du());
            fbr $$22 = new fbr($$1.dB() - $$3, $$1.dD() - $$4, $$1.dH() - $$5);
            this.a($$22);
            this.f.b($$22.d, $$22.e, $$22.f);
            this.K = $$12 >= -0.03125 && !$$17 && !this.d.ad() && !$$1.bc() && this.b($$1);
            this.C = $$1.dB();
            this.D = $$1.dD();
            this.E = $$1.dH();
         }
      }
   }

   private boolean b(bvb $$0) {
      return $$0.dW().a($$0.cR().g(0.0625).b(0.0, -0.55, 0.0)).allMatch(dxn.a::l);
   }

   @Override
   public void a(ahd $$0) {
      zu.a($$0, this, this.f.y());
      if ($$0.b() == this.G) {
         if (this.F == null) {
            this.a(xk.c("multiplayer.disconnect.invalid_player_movement"));
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
   public void a(ail $$0) {
      zu.a($$0, this, this.f.y());
      dcc.d $$1 = this.d.aI().a($$0.b());
      if ($$1 != null) {
         this.f.J().d($$1.b().a());
      }
   }

   @Override
   public void a(aio $$0) {
      this.f.cd.a($$0.b(), $$0.e());
   }

   @Override
   public void a(aik $$0) {
      zu.a($$0, this, this.f.y());
      this.f.J().a($$0.b(), $$0.e(), $$0.f());
   }

   @Override
   public void a(ain $$0) {
      zu.a($$0, this, this.f.y());
      if ($$0.e() == ain.a.a) {
         alp $$1 = Objects.requireNonNull($$0.f());
         ah $$2 = this.d.aD().a($$1);
         if ($$2 != null) {
            this.f.S().a($$2);
         }
      }
   }

   @Override
   public void a(aho $$0) {
      zu.a($$0, this, this.f.y());
      StringReader $$1 = new StringReader($$0.e());
      if ($$1.canRead() && $$1.peek() == '/') {
         $$1.skip();
      }

      ParseResults<ew> $$2 = this.d.aG().a().parse($$1, this.f.A());
      this.d.aG().a().getCompletionSuggestions($$2).thenAccept($$1x -> {
         Suggestions $$2x = $$1x.getList().size() <= 1000 ? $$1x : new Suggestions($$1x.getRange(), $$1x.getList().subList(0, 1000));
         this.b(new acy($$0.b(), $$2x));
      });
   }

   @Override
   public void a(ais $$0) {
      zu.a($$0, this, this.f.y());
      if (!this.d.q()) {
         this.f.a(xk.c("advMode.notEnabled"));
      } else if (!this.f.gG()) {
         this.f.a(xk.c("advMode.notAllowed"));
      } else {
         dfz $$1 = null;
         dva $$2 = null;
         jh $$3 = $$0.b();
         duq $$4 = this.f.dW().c_($$3);
         if ($$4 instanceof dva) {
            $$2 = (dva)$$4;
            $$1 = $$2.b();
         }

         String $$5 = $$0.e();
         boolean $$6 = $$0.f();
         if ($$1 != null) {
            dva.a $$7 = $$2.s();
            dxo $$8 = this.f.dW().a_($$3);
            jm $$9 = $$8.c(dlm.b);

            dxo $$10 = switch ($$0.i()) {
               case a -> dkf.lj.m();
               case b -> dkf.li.m();
               default -> dkf.gi.m();
            };
            dxo $$11 = $$10.b(dlm.b, $$9).b(dlm.c, Boolean.valueOf($$0.g()));
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
            if (!bar.b($$5)) {
               this.f.a(xk.a("advMode.setCommand.success", $$5));
            }
         }
      }
   }

   @Override
   public void a(ait $$0) {
      zu.a($$0, this, this.f.y());
      if (!this.d.q()) {
         this.f.a(xk.c("advMode.notEnabled"));
      } else if (!this.f.gG()) {
         this.f.a(xk.c("advMode.notAllowed"));
      } else {
         dfz $$1 = $$0.a(this.f.dW());
         if ($$1 != null) {
            $$1.a($$0.b());
            $$1.a($$0.e());
            if (!$$0.e()) {
               $$1.c(null);
            }

            $$1.f();
            this.f.a(xk.a("advMode.setCommand.success", $$0.b()));
         }
      }
   }

   @Override
   public void a(aid $$0) {
      arx $$1 = this.f.y();
      zu.a($$0, this, $$1);
      jh $$2 = $$0.b();
      if (this.f.a($$2, 1.0)) {
         if ($$1.p($$2)) {
            dxo $$3 = $$1.a_($$2);
            cxg $$4 = $$3.b($$1, $$2);
            if (!$$4.f()) {
               if (this.f.fV() && $$0.e()) {
                  a($$3, $$1, $$2, $$4);
               }

               this.a($$4);
            }
         }
      }
   }

   private static void a(dxo $$0, arx $$1, jh $$2, cxg $$3) {
      duq $$4 = $$0.x() ? $$1.c_($$2) : null;
      if ($$4 != null) {
         um $$5 = $$4.e($$1.K_());
         $$4.a($$5);
         cvm.a($$3, $$4.p(), $$5);
         $$3.b($$4.q());
      }
   }

   @Override
   public void a(aie $$0) {
      arx $$1 = this.f.y();
      zu.a($$0, this, $$1);
      bvb $$2 = $$1.a($$0.b());
      if ($$2 != null && this.f.b($$2, 3.0)) {
         cxg $$3 = $$2.dJ();
         if ($$3 != null && !$$3.f()) {
            this.a($$3);
         }
      }
   }

   private void a(cxg $$0) {
      if ($$0.a(this.f.dW().K())) {
         cpn $$1 = this.f.gi();
         int $$2 = $$1.c($$0);
         if ($$2 != -1) {
            if (cpn.d($$2)) {
               $$1.j = $$2;
            } else {
               $$1.c($$2);
            }
         } else if (this.f.fV()) {
            $$1.b($$0);
         }

         this.f.f.b(new afw($$1.j));
         this.f.cc.d();
      }
   }

   @Override
   public void a(aim $$0) {
      zu.a($$0, this, this.f.y());
      if (this.f.cd instanceof csw $$1) {
         if (!$$1.b(this.f)) {
            h.debug("Player {} interacted with invalid menu {}", this.f, $$1);
            return;
         }

         $$1.a($$0.b());
      }
   }

   @Override
   public void a(aiq $$0) {
      zu.a($$0, this, this.f.y());
      if (this.f.cd instanceof csy $$1) {
         if (!this.f.cd.b(this.f)) {
            h.debug("Player {} interacted with invalid menu {}", this.f, this.f.cd);
            return;
         }

         $$1.a($$0.b(), $$0.e());
      }
   }

   @Override
   public void a(aiw $$0) {
      zu.a($$0, this, this.f.y());
      if (this.f.gG()) {
         jh $$1 = $$0.b();
         dxo $$2 = this.f.dW().a_($$1);
         if (this.f.dW().c_($$1) instanceof dwi $$4) {
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
               if ($$0.e() == dwi.a.b) {
                  if ($$4.z()) {
                     this.f.a(xk.a("structure_block.save_success", $$5), false);
                  } else {
                     this.f.a(xk.a("structure_block.save_failure", $$5), false);
                  }
               } else if ($$0.e() == dwi.a.c) {
                  if (!$$4.B()) {
                     this.f.a(xk.a("structure_block.load_not_found", $$5), false);
                  } else if ($$4.a(this.f.y())) {
                     this.f.a(xk.a("structure_block.load_success", $$5), false);
                  } else {
                     this.f.a(xk.a("structure_block.load_prepare", $$5), false);
                  }
               } else if ($$0.e() == dwi.a.d) {
                  if ($$4.y()) {
                     this.f.a(xk.a("structure_block.size_success", $$5), false);
                  } else {
                     this.f.a(xk.c("structure_block.size_failure"), false);
                  }
               }
            } else {
               this.f.a(xk.a("structure_block.invalid_structure_name", $$0.g()), false);
            }

            $$4.e();
            this.f.dW().a($$1, $$2, $$2, 3);
         }
      }
   }

   @Override
   public void a(aiv $$0) {
      zu.a($$0, this, this.f.y());
      if (this.f.gG()) {
         jh $$1 = $$0.b();
         dxo $$2 = this.f.dW().a_($$1);
         if (this.f.dW().c_($$1) instanceof dvt $$4) {
            $$4.a($$0.e());
            $$4.b($$0.f());
            $$4.a(alo.a(mb.aX, $$0.g()));
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
   public void a(ahy $$0) {
      zu.a($$0, this, this.f.y());
      if (this.f.gG()) {
         jh $$1 = $$0.b();
         if (this.f.dW().c_($$1) instanceof dvt $$3) {
            $$3.a(this.f.y(), $$0.e(), $$0.f());
         }
      }
   }

   @Override
   public void a(aip $$0) {
      zu.a($$0, this, this.f.y());
      int $$1 = $$0.b();
      if (this.f.cd instanceof cue $$2) {
         if (!$$2.b(this.f)) {
            h.debug("Player {} interacted with invalid menu {}", this.f, $$2);
            return;
         }

         $$2.e($$1);
         $$2.h($$1);
      }
   }

   @Override
   public void a(ahv $$0) {
      int $$1 = $$0.b();
      if (cpn.d($$1) || $$1 == 40) {
         List<String> $$2 = Lists.newArrayList();
         Optional<String> $$3 = $$0.f();
         $$3.ifPresent($$2::add);
         $$2.addAll($$0.e());
         Consumer<List<asq>> $$4 = $$3.isPresent() ? $$1x -> this.a((asq)$$1x.get(0), $$1x.subList(1, $$1x.size()), $$1) : $$1x -> this.a($$1x, $$1);
         this.a($$2).thenAcceptAsync($$4, this.d);
      }
   }

   private void a(List<asq> $$0, int $$1) {
      cxg $$2 = this.f.gi().a($$1);
      if ($$2.b(ku.S)) {
         List<asp<String>> $$3 = $$0.stream().map(this::a).toList();
         $$2.b(ku.S, new dan($$3));
      }
   }

   private void a(asq $$0, List<asq> $$1, int $$2) {
      cxg $$3 = this.f.gi().a($$2);
      if ($$3.b(ku.S)) {
         cxg $$4 = $$3.a((dgy)cxk.uY);
         $$4.c(ku.S);
         List<asp<xk>> $$5 = $$1.stream().map($$0x -> this.a($$0x).a(xk::b)).toList();
         $$4.b(ku.T, new dao(this.a($$0), this.f.al().getString(), 0, $$5, true));
         this.f.gi().a($$2, $$4);
      }
   }

   private asp<String> a(asq $$0) {
      return this.f.aa() ? asp.a($$0.b()) : asp.a($$0);
   }

   @Override
   public void a(ahw $$0) {
      zu.a($$0, this, this.f.y());
      if (this.f.s(2)) {
         bvb $$1 = this.f.dW().a($$0.e());
         if ($$1 != null) {
            um $$2 = $$1.f(new um());
            this.f.f.b(new agn($$0.b(), $$2));
         }
      }
   }

   @Override
   public void a(aht $$0) {
      zu.a($$0, this, this.f.y());
      if (!this.f.aa_() && $$0.e() == this.f.cd.l) {
         if (this.f.cd instanceof ctj $$1 && $$1.m() instanceof dve $$2) {
            $$2.a($$0.b(), $$0.f());
         }
      }
   }

   @Override
   public void a(ahe $$0) {
      zu.a($$0, this, this.f.y());
      if (this.f.s(2)) {
         duq $$1 = this.f.dW().c_($$0.e());
         um $$2 = $$1 != null ? $$1.d(this.f.dY()) : null;
         this.f.f.b(new agn($$0.b(), $$2));
      }
   }

   @Override
   public void a(aia $$0) {
      zu.a($$0, this, this.f.y());
      if (b($$0.a(0.0), $$0.b(0.0), $$0.c(0.0), $$0.a(0.0F), $$0.b(0.0F))) {
         this.a(xk.c("multiplayer.disconnect.invalid_player_movement"));
      } else {
         arx $$1 = this.f.y();
         if (!this.f.k) {
            if (this.o == 0) {
               this.l();
            }

            if (!this.p()) {
               double $$2 = a($$0.a(this.f.dB()));
               double $$3 = b($$0.b(this.f.dD()));
               double $$4 = a($$0.c(this.f.dH()));
               float $$5 = azu.h($$0.a(this.f.dM()));
               float $$6 = azu.h($$0.b(this.f.dO()));
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
                              this.a(this.f.dB(), this.f.dD(), this.f.dH(), this.f.dM(), this.f.dO());
                              return;
                           }
                        }
                     }

                     fbm $$18 = this.f.cR();
                     $$10 = $$2 - this.v;
                     $$11 = $$3 - this.w;
                     $$12 = $$4 - this.x;
                     boolean $$19 = $$11 > 0.0;
                     if (this.f.aJ() && !$$0.b() && $$19) {
                        this.f.s();
                     }

                     boolean $$20 = this.f.R;
                     this.f.a(bwb.b, new fbr($$10, $$11, $$12));
                     $$10 = $$2 - this.f.dB();
                     $$11 = $$3 - this.f.dD();
                     if ($$11 > -0.5 || $$11 < 0.5) {
                        $$11 = 0.0;
                     }

                     $$12 = $$4 - this.f.dH();
                     $$14 = $$10 * $$10 + $$11 * $$11 + $$12 * $$12;
                     boolean $$22 = false;
                     if (!this.f.Q() && $$14 > 0.0625 && !this.f.fR() && !this.f.h.e() && this.f.h.b() != dgw.d) {
                        $$22 = true;
                        h.warn("{} moved wrongly!", this.f.al().getString());
                     }

                     if (this.f.ad || this.f.fR() || (!$$22 || !$$1.a(this.f, $$18)) && !this.a($$1, $$18, $$2, $$3, $$4)) {
                        this.f.a($$2, $$3, $$4, $$5, $$6);
                        boolean $$23 = this.f.fv();
                        this.I = $$11 >= -0.03125
                           && !$$20
                           && this.f.h.b() != dgw.d
                           && !this.d.ad()
                           && !this.f.gj().c
                           && !this.f.b(bui.y)
                           && !$$15
                           && !$$23
                           && this.b(this.f);
                        this.f.y().m().a(this.f);
                        fbr $$24 = new fbr(this.f.dB() - $$7, this.f.dD() - $$8, this.f.dH() - $$9);
                        this.f.a($$0.b(), $$0.e(), $$24);
                        this.f.a(this.f.dB() - $$7, this.f.dD() - $$8, this.f.dH() - $$9, $$0.b());
                        this.f.b(new fbr($$7, $$8, $$9), this.f.du());
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
         dgv $$1 = this.f.y().O();
         return $$1.b(dgv.t) ? false : !$$0 || !$$1.b(dgv.u);
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

   private boolean a(dhc $$0, fbm $$1, double $$2, double $$3, double $$4) {
      fbm $$5 = this.f.cR().d($$2 - this.f.dB(), $$3 - this.f.dD(), $$4 - this.f.dH());
      Iterable<fcl> $$6 = $$0.d(this.f, $$5.h(1.0E-5F));
      fcl $$7 = fci.a($$1.h(1.0E-5F));

      for (fcl $$8 : $$6) {
         if (!fci.c($$8, $$7, fbv.i)) {
            return true;
         }
      }

      return false;
   }

   public void a(double $$0, double $$1, double $$2, float $$3, float $$4) {
      this.a(new bwk(new fbr($$0, $$1, $$2), fbr.c, $$3, $$4), Collections.emptySet());
   }

   public void a(bwk $$0, Set<bwl> $$1) {
      this.H = this.o;
      if (++this.G == Integer.MAX_VALUE) {
         this.G = 0;
      }

      this.f.a($$0, $$1);
      this.F = this.f.du();
      this.f.f.b(aeq.a(this.G, $$0, $$1));
   }

   @Override
   public void a(aih $$0) {
      zu.a($$0, this, this.f.y());
      jh $$1 = $$0.b();
      this.f.H();
      aih.a $$2 = $$0.f();
      switch ($$2) {
         case g:
            if (!this.f.aa_()) {
               cxg $$3 = this.f.b(bsz.b);
               this.f.a(bsz.b, this.f.b(bsz.a));
               this.f.a(bsz.a, $$3);
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
            this.f.h.a($$1, $$2, $$0.e(), this.f.dW().an(), $$0.g());
            this.f.f.a($$0.g());
            return;
         default:
            throw new IllegalArgumentException("Invalid player action");
      }
   }

   private static boolean a(ary $$0, cxg $$1) {
      if ($$1.f()) {
         return false;
      } else {
         cxc $$2 = $$1.h();
         return ($$2 instanceof cvm || $$2 instanceof cvs) && !$$0.gE().a($$1);
      }
   }

   @Override
   public void a(aja $$0) {
      zu.a($$0, this, this.f.y());
      this.f.f.a($$0.f());
      arx $$1 = this.f.y();
      bsz $$2 = $$0.b();
      cxg $$3 = this.f.b($$2);
      if ($$3.a($$1.K())) {
         fbn $$4 = $$0.e();
         fbr $$5 = $$4.g();
         jh $$6 = $$4.b();
         if (this.f.a($$6, 1.0)) {
            fbr $$7 = $$5.d(fbr.b($$6));
            double $$8 = 1.0000001;
            if (Math.abs($$7.a()) < 1.0000001 && Math.abs($$7.b()) < 1.0000001 && Math.abs($$7.c()) < 1.0000001) {
               jm $$9 = $$4.c();
               this.f.H();
               int $$10 = this.f.dW().an();
               if ($$6.v() <= $$10) {
                  if (this.F == null && $$1.a(this.f, $$6)) {
                     bta $$11 = this.f.h.a(this.f, $$1, $$3, $$2, $$4);
                     if ($$11.a()) {
                        ao.P.a(this.f, $$4.b(), $$3.v());
                     }

                     if ($$9 == jm.b && !$$11.a() && $$6.v() >= $$10 && a(this.f, $$3)) {
                        xk $$12 = xk.a("build.tooHigh", $$10).a(n.m);
                        this.f.b($$12, true);
                     } else if ($$11 instanceof bta.d $$13 && $$13.e() == bta.e.c) {
                        this.f.a($$2, true);
                     }
                  }
               } else {
                  xk $$14 = xk.a("build.tooHigh", $$10).a(n.m);
                  this.f.b($$14, true);
               }

               this.f.f.b(new acp($$1, $$6));
               this.f.f.b(new acp($$1, $$6.a($$9)));
            } else {
               h.warn("Rejecting UseItemOnPacket from {}: Location {} too far away from hit block {}.", new Object[]{this.f.gh().getName(), $$5, $$6});
            }
         }
      }
   }

   @Override
   public void a(ajb $$0) {
      zu.a($$0, this, this.f.y());
      this.a($$0.e());
      arx $$1 = this.f.y();
      bsz $$2 = $$0.b();
      cxg $$3 = this.f.b($$2);
      this.f.H();
      if (!$$3.f() && $$3.a($$1.K())) {
         float $$4 = azu.h($$0.f());
         float $$5 = azu.h($$0.g());
         if ($$5 != this.f.dO() || $$4 != this.f.dM()) {
            this.f.c($$4, $$5);
         }

         if (this.f.h.a(this.f, $$1, $$3, $$2) instanceof bta.d $$7 && $$7.e() == bta.e.c) {
            this.f.a($$2, true);
         }
      }
   }

   @Override
   public void a(aiz $$0) {
      zu.a($$0, this, this.f.y());
      if (this.f.aa_()) {
         for (arx $$1 : this.d.L()) {
            bvb $$2 = $$0.a($$1);
            if ($$2 != null) {
               this.f.a($$1, $$2.dB(), $$2.dD(), $$2.dH(), Set.of(), $$2.dM(), $$2.dO(), true);
               return;
            }
         }
      }
   }

   @Override
   public void a(aic $$0) {
      zu.a($$0, this, this.f.y());
      if (this.f.dm() instanceof crl $$2) {
         $$2.b($$0.b(), $$0.e());
      }
   }

   @Override
   public void a(wg $$0) {
      h.info("{} lost connection: {}", this.f.al().getString(), $$0.a().getString());
      this.q();
      super.a($$0);
   }

   private void q() {
      this.T.close();
      this.d.av();
      this.d.ag().a(xk.a("multiplayer.player.left", this.f.p_()).a(n.o), false);
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
   public void a(air $$0) {
      zu.a($$0, this, this.f.y());
      if ($$0.b() >= 0 && $$0.b() < cpn.g()) {
         if (this.f.gi().j != $$0.b() && this.f.fA() == bsz.a) {
            this.f.fF();
         }

         this.f.gi().j = $$0.b();
         this.f.H();
      } else {
         h.warn("{} tried to set an invalid carried item", this.f.al().getString());
      }
   }

   @Override
   public void a(ahj $$0) {
      Optional<xr> $$1 = this.a($$0.h());
      if (!$$1.isEmpty()) {
         this.a($$0.b(), () -> {
            ya $$2;
            try {
               $$2 = this.a($$0, $$1.get());
            } catch (ye.a var6) {
               this.a(var6);
               return;
            }

            CompletableFuture<asq> $$5 = this.a($$2.c());
            xk $$6 = this.d.bk().decorate(this.f, $$2.d());
            this.T.append($$5, $$2x -> {
               ya $$3 = $$2.a($$6).a($$2x.e());
               this.b($$3);
            });
         });
      }
   }

   @Override
   public void a(ahh $$0) {
      this.a($$0.b(), () -> {
         this.b($$0.b());
         this.r();
      });
   }

   private void b(String $$0) {
      ParseResults<ew> $$1 = this.c($$0);
      if (this.d.aA() && yc.a($$1)) {
         h.error("Received unsigned command packet from {}, but the command requires signable arguments: {}", this.f.gh().getName(), $$0);
         this.f.a(m);
      } else {
         this.d.aG().a($$1, $$0);
      }
   }

   @Override
   public void a(ahi $$0) {
      Optional<xr> $$1 = this.a($$0.h());
      if (!$$1.isEmpty()) {
         this.a($$0.b(), () -> {
            this.a($$0, $$1.get());
            this.r();
         });
      }
   }

   private void a(ahi $$0, xr $$1) {
      ParseResults<ew> $$2 = this.c($$0.b());

      Map<String, ya> $$3;
      try {
         $$3 = this.a($$0, yc.b($$2), $$1);
      } catch (ye.a var6) {
         this.a(var6);
         return;
      }

      eu $$6 = new eu.a($$3);
      $$2 = ex.a($$2, $$1x -> $$1x.a($$6, this.T));
      this.d.aG().a($$2, $$0.b());
   }

   private void a(ye.a $$0) {
      h.warn("Failed to update secure chat state for {}: '{}'", this.f.gh().getName(), $$0.a().getString());
      this.f.a($$0.a().f().a(n.m));
   }

   private <S> Map<String, ya> a(ahi $$0, yc<S> $$1, xr $$2) throws ye.a {
      List<fd.a> $$3 = $$0.g().a();
      List<yc.a<S>> $$4 = $$1.a();
      if ($$3.isEmpty()) {
         return this.b($$4);
      } else {
         Map<String, ya> $$5 = new Object2ObjectOpenHashMap();

         for (fd.a $$6 : $$3) {
            yc.a<S> $$7 = $$1.a($$6.a());
            if ($$7 == null) {
               this.Q.setChainBroken();
               throw a($$0.b(), $$3, $$4);
            }

            yd $$8 = new yd($$7.c(), $$0.e(), $$0.f(), $$2);
            $$5.put($$7.a(), this.Q.unpack($$6.b(), $$8));
         }

         for (yc.a<S> $$9 : $$4) {
            if (!$$5.containsKey($$9.a())) {
               throw a($$0.b(), $$3, $$4);
            }
         }

         return $$5;
      }
   }

   private <S> Map<String, ya> b(List<yc.a<S>> $$0) throws ye.a {
      Map<String, ya> $$1 = new HashMap<>();

      for (yc.a<S> $$2 : $$0) {
         yd $$3 = yd.a($$2.c());
         $$1.put($$2.a(), this.Q.unpack(null, $$3));
      }

      return $$1;
   }

   private static <S> ye.a a(String $$0, List<fd.a> $$1, List<yc.a<S>> $$2) {
      String $$3 = $$1.stream().map(fd.a::a).collect(Collectors.joining(", "));
      String $$4 = $$2.stream().map(yc.a::a).collect(Collectors.joining(", "));
      h.error("Signed command mismatch between server and client ('{}'): got [{}] from client, but expected [{}]", new Object[]{$$0, $$3, $$4});
      return new ye.a(m);
   }

   private ParseResults<ew> c(String $$0) {
      CommandDispatcher<ew> $$1 = this.d.aG().a();
      return $$1.parse($$0, this.f.A());
   }

   private void a(String $$0, Runnable $$1) {
      if (d($$0)) {
         this.a(xk.c("multiplayer.disconnect.illegal_characters"));
      } else if (this.f.E() == cpl.c) {
         this.b(new agl(xk.c("chat.disabled.options").a(n.m), false));
      } else {
         this.f.H();
         this.d.execute($$1);
      }
   }

   private Optional<xr> a(xr.b $$0) {
      synchronized (this.R) {
         Optional<xr> $$1 = this.R.a($$0);
         if ($$1.isEmpty()) {
            h.warn("Failed to validate message acknowledgements from {}", this.f.al().getString());
            this.a(l);
         }

         return $$1;
      }
   }

   private static boolean d(String $$0) {
      for (int $$1 = 0; $$1 < $$0.length(); $$1++) {
         if (!bar.a($$0.charAt($$1))) {
            return true;
         }
      }

      return false;
   }

   private ya a(ahj $$0, xr $$1) throws ye.a {
      yd $$2 = new yd($$0.b(), $$0.e(), $$0.f(), $$1);
      return this.Q.unpack($$0.g(), $$2);
   }

   private void b(ya $$0) {
      this.d.ag().a($$0, this.f, xg.a(xg.e, this.f));
      this.r();
   }

   private void r() {
      this.q.a();
      if (!this.q.c() && !this.d.ag().f(this.f.gh()) && !this.d.a(this.f.gh())) {
         this.a(xk.c("disconnect.spam"));
      }
   }

   @Override
   public void a(ahg $$0) {
      synchronized (this.R) {
         if (!this.R.a($$0.b())) {
            h.warn("Failed to validate message acknowledgements from {}", this.f.al().getString());
            this.a(l);
         }
      }
   }

   @Override
   public void a(aiy $$0) {
      zu.a($$0, this, this.f.y());
      this.f.H();
      this.f.a($$0.b());
   }

   @Override
   public void a(aii $$0) {
      zu.a($$0, this, this.f.y());
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
            if (this.f.dm() instanceof bwh $$1) {
               int $$2 = $$0.f();
               if ($$1.a() && $$2 > 0) {
                  $$1.c($$2);
               }
            }
            break;
         case g:
            if (this.f.dm() instanceof bwh $$3) {
               $$3.b();
            }
            break;
         case h:
            if (this.f.dl() instanceof bvq $$4) {
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

   public void a(ya $$0) {
      xw $$1 = $$0.l();
      if ($$1 != null) {
         this.S.a($$0.m(), $$0.l());
         int $$2;
         synchronized (this.R) {
            this.R.a($$1);
            $$2 = this.R.a();
         }

         if ($$2 > 4096) {
            this.a(xk.c("multiplayer.disconnect.too_many_pending_chats"));
         }
      }
   }

   public void a(ya $$0, xg.a $$1) {
      this.b(new aej($$0.k().c(), $$0.k().b(), $$0.l(), $$0.m().a(this.S), $$0.n(), $$0.o(), $$1));
      this.a($$0);
   }

   public void a(xk $$0, xg.a $$1) {
      this.b(new adj($$0, $$1));
   }

   public SocketAddress m() {
      return this.e.d();
   }

   public void n() {
      this.U = true;
      this.q();
      this.b(agj.a);
      this.e.a(abv.d);
   }

   @Override
   public void a(aki $$0) {
      this.e.a(new akf($$0.b()));
   }

   @Override
   public void a(ahx $$0) {
      zu.a($$0, this, this.f.y());
      final arx $$1 = this.f.y();
      final bvb $$2 = $$0.a($$1);
      this.f.H();
      this.f.g($$0.b());
      if ($$2 != null) {
         if (!$$1.F_().a($$2.dw())) {
            return;
         }

         fbm $$3 = $$2.cR();
         if (this.f.a($$3, 3.0)) {
            $$0.a(new ahx.c() {
               private void a(bsz $$0, ata.a $$1x) {
                  cxg $$2 = ata.this.f.b($$0);
                  if ($$2.a($$1.K())) {
                     cxg $$3 = $$2.v();
                     if ($$1.run(ata.this.f, $$2, $$0) instanceof bta.d $$5) {
                        cxg $$6 = $$5.c() ? $$3 : cxg.j;
                        ao.T.a(ata.this.f, $$6, $$2);
                        if ($$5.e() == bta.e.c) {
                           ata.this.f.a($$0, true);
                        }
                     }
                  }
               }

               @Override
               public void a(bsz $$0) {
                  this.a($$0, cpo::a);
               }

               @Override
               public void a(bsz $$0, fbr $$1x) {
                  this.a($$0, ($$1xxx, $$2xx, $$3) -> $$2xx.a($$1xxx, $$1, $$3));
               }

               @Override
               public void a() {
                  label23:
                  if (!($$2 instanceof cls) && !($$2 instanceof bvn) && $$2 != ata.this.f) {
                     if ($$2 instanceof cpv $$0 && !$$0.cB()) {
                        break label23;
                     }

                     cxg $$1 = ata.this.f.b(bsz.a);
                     if (!$$1.a($$1.K())) {
                        return;
                     }

                     ata.this.f.e($$2);
                     return;
                  }

                  ata.this.a(xk.c("multiplayer.disconnect.invalid_entity_attacked"));
                  ata.h.warn("Player {} tried to attack an invalid entity", ata.this.f.al().getString());
               }
            });
         }
      }
   }

   @Override
   public void a(ahm $$0) {
      zu.a($$0, this, this.f.y());
      this.f.H();
      ahm.a $$1 = $$0.b();
      switch ($$1) {
         case a:
            if (this.f.k) {
               this.f.k = false;
               this.f = this.d.ag().a(this.f, true, bvb.d.e);
               this.l();
               ao.w.a(this.f, dgz.k, dgz.i);
            } else {
               if (this.f.eE() > 0.0F) {
                  return;
               }

               this.f = this.d.ag().a(this.f, false, bvb.d.a);
               this.l();
               if (this.d.w_()) {
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
   public void a(ahs $$0) {
      zu.a($$0, this, this.f.y());
      this.f.q();
   }

   @Override
   public void a(ahr $$0) {
      zu.a($$0, this, this.f.y());
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
                  Entry<cxg> $$3 = (Entry<cxg>)var4.next();
                  this.f.cd.b($$3.getIntKey(), (cxg)$$3.getValue());
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
   public void a(aif $$0) {
      zu.a($$0, this, this.f.y());
      this.f.H();
      if (!this.f.aa_() && this.f.cd.l == $$0.b()) {
         if (!this.f.cd.b(this.f)) {
            h.debug("Player {} interacted with invalid menu {}", this.f, this.f.cd);
         } else {
            dcc.d $$1 = this.d.aI().a($$0.e());
            if ($$1 != null) {
               dca<?> $$2 = $$1.b();
               if (this.f.J().b($$2.a())) {
                  if (this.f.cd instanceof cui $$3) {
                     if ($$2.b().ap_().d()) {
                        h.debug("Player {} tried to place impossible recipe {}", this.f, $$2.a().a());
                        return;
                     }

                     cui.a $$4 = $$3.a($$0.f(), this.f.b(), $$2, this.f.y(), this.f.gi());
                     if ($$4 == cui.a.b) {
                        this.f.f.b(new aeh(this.f.cd.l, $$1.a().b()));
                     }
                  }
               }
            }
         }
      }
   }

   @Override
   public void a(ahq $$0) {
      zu.a($$0, this, this.f.y());
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
   public void a(aiu $$0) {
      zu.a($$0, this, this.f.y());
      if (this.f.h.e()) {
         boolean $$1 = $$0.b() < 0;
         cxg $$2 = $$0.e();
         if (!$$2.a(this.f.dW().K())) {
            return;
         }

         boolean $$3 = $$0.b() >= 1 && $$0.b() <= 45;
         boolean $$4 = $$2.f() || $$2.M() <= $$2.k();
         if ($$3 && $$4) {
            this.f.cc.b($$0.b()).e($$2);
            this.f.cc.a($$0.b(), $$2);
            this.f.cc.d();
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
   public void a(aix $$0) {
      List<String> $$1 = Stream.of($$0.f()).map(n::a).collect(Collectors.toList());
      this.a($$1).thenAcceptAsync($$1x -> this.a($$0, $$1x), this.d);
   }

   private void a(aix $$0, List<asq> $$1) {
      this.f.H();
      arx $$2 = this.f.y();
      jh $$3 = $$0.b();
      if ($$2.B($$3)) {
         if (!($$2.c_($$3) instanceof dwd $$5)) {
            return;
         }

         $$5.a(this.f, $$0.e(), $$1);
      }
   }

   @Override
   public void a(aig $$0) {
      zu.a($$0, this, this.f.y());
      this.f.gj().b = $$0.b() && this.f.gj().c;
   }

   @Override
   public void a(aal $$0) {
      zu.a($$0, this, this.f.y());
      boolean $$1 = this.f.a(cpp.g);
      this.f.a($$0.b());
      if (this.f.a(cpp.g) != $$1) {
         this.d.ag().a(new aeo(aeo.a.h, this.f));
      }
   }

   @Override
   public void a(ahf $$0) {
      zu.a($$0, this, this.f.y());
      if (this.f.s(2) || this.h()) {
         this.d.a($$0.b(), false);
      }
   }

   @Override
   public void a(ahz $$0) {
      zu.a($$0, this, this.f.y());
      if (this.f.s(2) || this.h()) {
         this.d.b($$0.b());
      }
   }

   @Override
   public void a(ahk $$0) {
      zu.a($$0, this, this.f.y());
      yb.a $$1 = $$0.b();
      cpr.a $$2 = this.P != null ? this.P.d().b() : null;
      cpr.a $$3 = $$1.b();
      if (!Objects.equals($$2, $$3)) {
         if ($$2 != null && $$3.b().isBefore($$2.b())) {
            this.a(cpr.a);
         } else {
            try {
               bah $$4 = this.d.ar();
               if ($$4 == null) {
                  h.warn("Ignoring chat session from {} due to missing Services public key", this.f.gh().getName());
                  return;
               }

               this.a($$1.a(this.f.gh(), $$4));
            } catch (cpr.b var6) {
               h.error("Failed to validate profile key: {}", var6.getMessage());
               this.a(var6.a());
            }
         }
      }
   }

   @Override
   public void a(ahp $$0) {
      if (!this.U) {
         throw new IllegalStateException("Client acknowledged config, but none was requested");
      } else {
         this.e.a(abv.b, new asy(this.d, this.e, this.a(this.f.C())));
      }
   }

   @Override
   public void a(ahl $$0) {
      zu.a($$0, this, this.f.y());
      this.g.a($$0.b());
   }

   @Override
   public void a(ahu $$0) {
      zu.a($$0, this, this.f.y());
      this.d.a(this.f, $$0.b());
   }

   private void a(yb $$0) {
      this.P = $$0;
      this.Q = $$0.a(this.f.cG());
      this.T.append(() -> {
         this.f.a($$0);
         this.d.ag().a(new aeo(EnumSet.of(aeo.a.b), List.of(this.f)));
      });
   }

   @Override
   public void a(aam $$0) {
   }

   @Override
   public void a(ahn $$0) {
      zu.a($$0, this, this.f.y());
      if (!this.O) {
         this.f.a(fbr.c);
      }

      this.O = false;
   }

   private void a(fbr $$0) {
      if ($$0.h() > 1.0E-5F) {
         this.f.H();
      }

      this.f.a($$0);
      this.O = true;
   }

   @Override
   public ary o() {
      return this.f;
   }

   @FunctionalInterface
   interface a {
      bta run(ary var1, bvb var2, bsz var3);
   }
}
