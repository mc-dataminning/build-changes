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

public class ass extends asp implements agw, asv, wx {
   static final Logger h = LogUtils.getLogger();
   private static final int i = -1;
   private static final int j = 4096;
   private static final int k = 80;
   private static final xj l = xj.c("multiplayer.disconnect.chat_validation_failed");
   private static final xj m = xj.c("chat.disabled.invalid_command_signature").a(n.m);
   private static final int n = 1000;
   public arq f;
   public final asn g;
   private int o;
   private int p = -1;
   private final bam q = new bam(20, 200);
   private final bam r = new bam(20, 1480);
   private double s;
   private double t;
   private double u;
   private double v;
   private double w;
   private double x;
   @Nullable
   private bul y;
   private double z;
   private double A;
   private double B;
   private double C;
   private double D;
   private double E;
   @Nullable
   private ezy F;
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
   private ya P;
   private yd.b Q;
   private final xs R = new xs(20);
   private final xw S = xw.a();
   private final aza T;
   private boolean U;

   public ass(MinecraftServer $$0, wd $$1, arq $$2, asf $$3) {
      super($$0, $$1, $$3);
      this.g = new asn($$1.e());
      this.f = $$2;
      $$2.f = this;
      $$2.Z().a();
      this.Q = yd.b.unsigned($$2.cG(), $$0::aA);
      this.T = new aza($$0);
   }

   @Override
   public void d() {
      if (this.p > -1) {
         this.b(new ack(this.p));
         this.p = -1;
      }

      this.l();
      this.f.K = this.f.dA();
      this.f.L = this.f.dC();
      this.f.M = this.f.dG();
      this.f.i();
      this.f.a(this.s, this.t, this.u, this.f.dL(), this.f.dN());
      this.o++;
      this.N = this.M;
      if (this.I && !this.f.fP() && !this.f.bZ() && !this.f.eE()) {
         if (++this.J > this.a((bul)this.f)) {
            h.warn("{} was kicked for floating too long!", this.f.al().getString());
            this.a(xj.c("multiplayer.disconnect.flying"));
            return;
         }
      } else {
         this.I = false;
         this.J = 0;
      }

      this.y = this.f.dg();
      if (this.y != this.f && this.y.cX() == this.f) {
         this.z = this.y.dA();
         this.A = this.y.dC();
         this.B = this.y.dG();
         this.C = this.y.dA();
         this.D = this.y.dC();
         this.E = this.y.dG();
         if (this.K && this.y.cX() == this.f) {
            if (++this.L > this.a(this.y)) {
               h.warn("{} was kicked for floating a vehicle too long!", this.f.al().getString());
               this.a(xj.c("multiplayer.disconnect.flying"));
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
         this.a(xj.c("multiplayer.disconnect.idling"));
      }
   }

   private int a(bul $$0) {
      double $$1 = $$0.be();
      if ($$1 < 1.0E-5F) {
         return Integer.MAX_VALUE;
      } else {
         double $$2 = 0.08 / $$1;
         return azm.c(80.0 * Math.max($$2, 1.0));
      }
   }

   @Override
   public void l() {
      this.s = this.f.dA();
      this.t = this.f.dC();
      this.u = this.f.dG();
      this.v = this.f.dA();
      this.w = this.f.dC();
      this.x = this.f.dG();
   }

   @Override
   public boolean c() {
      return this.e.i() && !this.U;
   }

   @Override
   public boolean a(zq<?> $$0) {
      return super.a($$0) ? true : this.U && this.e.i() && $$0 instanceof ahk;
   }

   @Override
   protected GameProfile i() {
      return this.f.gf();
   }

   private <T, R> CompletableFuture<R> a(T $$0, BiFunction<asy, T, CompletableFuture<R>> $$1) {
      return $$1.apply(this.f.Z(), $$0).thenApply($$0x -> {
         if (!this.c()) {
            h.debug("Ignoring packet due to disconnection");
            throw new CancellationException("disconnected");
         } else {
            return (R)$$0x;
         }
      });
   }

   private CompletableFuture<asi> a(String $$0) {
      return this.a($$0, asy::a);
   }

   private CompletableFuture<List<asi>> a(List<String> $$0) {
      return this.a($$0, asy::a);
   }

   @Override
   public void a(aid $$0) {
      zt.a($$0, this, this.f.y());
      this.f.a($$0.b());
   }

   private static boolean b(double $$0, double $$1, double $$2, float $$3, float $$4) {
      return Double.isNaN($$0) || Double.isNaN($$1) || Double.isNaN($$2) || !Floats.isFinite($$4) || !Floats.isFinite($$3);
   }

   private static double a(double $$0) {
      return azm.a($$0, -3.0E7, 3.0E7);
   }

   private static double b(double $$0) {
      return azm.a($$0, -2.0E7, 2.0E7);
   }

   @Override
   public void a(ahw $$0) {
      zt.a($$0, this, this.f.y());
      if (b($$0.b(), $$0.e(), $$0.f(), $$0.g(), $$0.h())) {
         this.a(xj.c("multiplayer.disconnect.invalid_vehicle_movement"));
      } else if (!this.p()) {
         bul $$1 = this.f.dg();
         if ($$1 != this.f && $$1.cX() == this.f && $$1 == this.y) {
            arp $$2 = this.f.y();
            double $$3 = $$1.dA();
            double $$4 = $$1.dC();
            double $$5 = $$1.dG();
            double $$6 = a($$0.b());
            double $$7 = b($$0.e());
            double $$8 = a($$0.f());
            float $$9 = azm.h($$0.g());
            float $$10 = azm.h($$0.h());
            double $$11 = $$6 - this.z;
            double $$12 = $$7 - this.A;
            double $$13 = $$8 - this.B;
            double $$14 = $$1.dy().h();
            double $$15 = $$11 * $$11 + $$12 * $$12 + $$13 * $$13;
            if ($$15 - $$14 > 100.0 && !this.h()) {
               h.warn("{} (vehicle of {}) moved too quickly! {},{},{}", new Object[]{$$1.al().getString(), this.f.al().getString(), $$11, $$12, $$13});
               this.b(new aeb($$1));
               return;
            }

            boolean $$16 = $$2.a($$1, $$1.cR().h(0.0625));
            $$11 = $$6 - this.C;
            $$12 = $$7 - this.D - 1.0E-6;
            $$13 = $$8 - this.E;
            boolean $$17 = $$1.R;
            if ($$1 instanceof bvh $$18 && $$18.p_()) {
               $$18.k();
            }

            $$1.a(bvl.b, new ezy($$11, $$12, $$13));
            $$11 = $$6 - $$1.dA();
            $$12 = $$7 - $$1.dC();
            if ($$12 > -0.5 || $$12 < 0.5) {
               $$12 = 0.0;
            }

            $$13 = $$8 - $$1.dG();
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
               this.b(new aeb($$1));
               return;
            }

            this.f.y().m().a(this.f);
            ezy $$22 = new ezy($$1.dA() - $$3, $$1.dC() - $$4, $$1.dG() - $$5);
            this.a($$22);
            this.f.b($$22.d, $$22.e, $$22.f);
            this.K = $$12 >= -0.03125 && !$$17 && !this.d.ad() && !$$1.bc() && this.b($$1);
            this.C = $$1.dA();
            this.D = $$1.dC();
            this.E = $$1.dG();
         }
      }
   }

   private boolean b(bul $$0) {
      return $$0.dV().a($$0.cR().g(0.0625).b(0.0, -0.55, 0.0)).allMatch(dvu.a::l);
   }

   @Override
   public void a(agy $$0) {
      zt.a($$0, this, this.f.y());
      if ($$0.b() == this.G) {
         if (this.F == null) {
            this.a(xj.c("multiplayer.disconnect.invalid_player_movement"));
            return;
         }

         this.f.a(this.F.d, this.F.e, this.F.f, this.f.dL(), this.f.dN());
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
   public void a(aif $$0) {
      zt.a($$0, this, this.f.y());
      this.d.aI().a($$0.b()).ifPresent(this.f.J()::e);
   }

   @Override
   public void a(aii $$0) {
      this.f.cc.a($$0.b(), $$0.e());
   }

   @Override
   public void a(aie $$0) {
      zt.a($$0, this, this.f.y());
      this.f.J().a($$0.b(), $$0.e(), $$0.f());
   }

   @Override
   public void a(aih $$0) {
      zt.a($$0, this, this.f.y());
      if ($$0.e() == aih.a.a) {
         alj $$1 = Objects.requireNonNull($$0.f());
         ah $$2 = this.d.aD().a($$1);
         if ($$2 != null) {
            this.f.S().a($$2);
         }
      }
   }

   @Override
   public void a(ahj $$0) {
      zt.a($$0, this, this.f.y());
      StringReader $$1 = new StringReader($$0.e());
      if ($$1.canRead() && $$1.peek() == '/') {
         $$1.skip();
      }

      ParseResults<ew> $$2 = this.d.aG().a().parse($$1, this.f.A());
      this.d.aG().a().getCompletionSuggestions($$2).thenAccept($$1x -> {
         Suggestions $$2x = $$1x.getList().size() <= 1000 ? $$1x : new Suggestions($$1x.getRange(), $$1x.getList().subList(0, 1000));
         this.b(new acx($$0.b(), $$2x));
      });
   }

   @Override
   public void a(aim $$0) {
      zt.a($$0, this, this.f.y());
      if (!this.d.q()) {
         this.f.a(xj.c("advMode.notEnabled"));
      } else if (!this.f.gE()) {
         this.f.a(xj.c("advMode.notAllowed"));
      } else {
         dem $$1 = null;
         dti $$2 = null;
         jh $$3 = $$0.b();
         dsy $$4 = this.f.dV().c_($$3);
         if ($$4 instanceof dti) {
            $$2 = (dti)$$4;
            $$1 = $$2.b();
         }

         String $$5 = $$0.e();
         boolean $$6 = $$0.f();
         if ($$1 != null) {
            dti.a $$7 = $$2.t();
            dvv $$8 = this.f.dV().a_($$3);
            jm $$9 = $$8.c(djz.b);

            dvv $$10 = switch ($$0.i()) {
               case a -> dis.kH.m();
               case b -> dis.kG.m();
               default -> dis.fN.m();
            };
            dvv $$11 = $$10.b(djz.b, $$9).b(djz.c, Boolean.valueOf($$0.g()));
            if ($$11 != $$8) {
               this.f.dV().a($$3, $$11, 2);
               $$4.c($$11);
               this.f.dV().m($$3).a($$4);
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
            if (!baj.b($$5)) {
               this.f.a(xj.a("advMode.setCommand.success", $$5));
            }
         }
      }
   }

   @Override
   public void a(ain $$0) {
      zt.a($$0, this, this.f.y());
      if (!this.d.q()) {
         this.f.a(xj.c("advMode.notEnabled"));
      } else if (!this.f.gE()) {
         this.f.a(xj.c("advMode.notAllowed"));
      } else {
         dem $$1 = $$0.a(this.f.dV());
         if ($$1 != null) {
            $$1.a($$0.b());
            $$1.a($$0.e());
            if (!$$0.e()) {
               $$1.c(null);
            }

            $$1.f();
            this.f.a(xj.a("advMode.setCommand.success", $$0.b()));
         }
      }
   }

   @Override
   public void a(ahy $$0) {
      zt.a($$0, this, this.f.y());
      this.f.gg().c($$0.b());
      int $$1 = this.f.gg().j;
      this.f.f.b(this.f.gg().f($$1));
      this.f.f.b(this.f.gg().f($$0.b()));
      this.f.f.b(new afr($$1));
   }

   @Override
   public void a(aig $$0) {
      zt.a($$0, this, this.f.y());
      if (this.f.cc instanceof csc $$1) {
         if (!$$1.b(this.f)) {
            h.debug("Player {} interacted with invalid menu {}", this.f, $$1);
            return;
         }

         $$1.a($$0.b());
      }
   }

   @Override
   public void a(aik $$0) {
      zt.a($$0, this, this.f.y());
      if (this.f.cc instanceof cse $$1) {
         if (!this.f.cc.b(this.f)) {
            h.debug("Player {} interacted with invalid menu {}", this.f, this.f.cc);
            return;
         }

         $$1.a($$0.b(), $$0.e());
      }
   }

   @Override
   public void a(aiq $$0) {
      zt.a($$0, this, this.f.y());
      if (this.f.gE()) {
         jh $$1 = $$0.b();
         dvv $$2 = this.f.dV().a_($$1);
         if (this.f.dV().c_($$1) instanceof dup $$4) {
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
               if ($$0.e() == dup.a.b) {
                  if ($$4.A()) {
                     this.f.a(xj.a("structure_block.save_success", $$5), false);
                  } else {
                     this.f.a(xj.a("structure_block.save_failure", $$5), false);
                  }
               } else if ($$0.e() == dup.a.c) {
                  if (!$$4.C()) {
                     this.f.a(xj.a("structure_block.load_not_found", $$5), false);
                  } else if ($$4.a(this.f.y())) {
                     this.f.a(xj.a("structure_block.load_success", $$5), false);
                  } else {
                     this.f.a(xj.a("structure_block.load_prepare", $$5), false);
                  }
               } else if ($$0.e() == dup.a.d) {
                  if ($$4.z()) {
                     this.f.a(xj.a("structure_block.size_success", $$5), false);
                  } else {
                     this.f.a(xj.c("structure_block.size_failure"), false);
                  }
               }
            } else {
               this.f.a(xj.a("structure_block.invalid_structure_name", $$0.g()), false);
            }

            $$4.e();
            this.f.dV().a($$1, $$2, $$2, 3);
         }
      }
   }

   @Override
   public void a(aip $$0) {
      zt.a($$0, this, this.f.y());
      if (this.f.gE()) {
         jh $$1 = $$0.b();
         dvv $$2 = this.f.dV().a_($$1);
         if (this.f.dV().c_($$1) instanceof dua $$4) {
            $$4.a($$0.e());
            $$4.b($$0.f());
            $$4.a(ali.a(ma.aV, $$0.g()));
            $$4.a($$0.h());
            $$4.a($$0.i());
            $$4.a($$0.k());
            $$4.b($$0.j());
            $$4.e();
            this.f.dV().a($$1, $$2, $$2, 3);
         }
      }
   }

   @Override
   public void a(aht $$0) {
      zt.a($$0, this, this.f.y());
      if (this.f.gE()) {
         jh $$1 = $$0.b();
         if (this.f.dV().c_($$1) instanceof dua $$3) {
            $$3.a(this.f.y(), $$0.e(), $$0.f());
         }
      }
   }

   @Override
   public void a(aij $$0) {
      zt.a($$0, this, this.f.y());
      int $$1 = $$0.b();
      if (this.f.cc instanceof ctk $$2) {
         if (!$$2.b(this.f)) {
            h.debug("Player {} interacted with invalid menu {}", this.f, $$2);
            return;
         }

         $$2.e($$1);
         $$2.h($$1);
      }
   }

   @Override
   public void a(ahq $$0) {
      int $$1 = $$0.b();
      if (cot.d($$1) || $$1 == 40) {
         List<String> $$2 = Lists.newArrayList();
         Optional<String> $$3 = $$0.f();
         $$3.ifPresent($$2::add);
         $$2.addAll($$0.e());
         Consumer<List<asi>> $$4 = $$3.isPresent() ? $$1x -> this.a((asi)$$1x.get(0), $$1x.subList(1, $$1x.size()), $$1) : $$1x -> this.a($$1x, $$1);
         this.a($$2).thenAcceptAsync($$4, this.d);
      }
   }

   private void a(List<asi> $$0, int $$1) {
      cwm $$2 = this.f.gg().a($$1);
      if ($$2.b(ku.S)) {
         List<ash<String>> $$3 = $$0.stream().map(this::a).toList();
         $$2.b(ku.S, new czt($$3));
      }
   }

   private void a(asi $$0, List<asi> $$1, int $$2) {
      cwm $$3 = this.f.gg().a($$2);
      if ($$3.b(ku.S)) {
         cwm $$4 = $$3.a((dfl)cwq.ur);
         $$4.c(ku.S);
         List<ash<xj>> $$5 = $$1.stream().map($$0x -> this.a($$0x).a(xj::b)).toList();
         $$4.b(ku.T, new czu(this.a($$0), this.f.al().getString(), 0, $$5, true));
         this.f.gg().a($$2, $$4);
      }
   }

   private ash<String> a(asi $$0) {
      return this.f.aa() ? ash.a($$0.b()) : ash.a($$0);
   }

   @Override
   public void a(ahr $$0) {
      zt.a($$0, this, this.f.y());
      if (this.f.s(2)) {
         bul $$1 = this.f.dV().a($$0.e());
         if ($$1 != null) {
            ul $$2 = $$1.f(new ul());
            this.f.f.b(new agi($$0.b(), $$2));
         }
      }
   }

   @Override
   public void a(aho $$0) {
      zt.a($$0, this, this.f.y());
      if (!this.f.Y_() && $$0.e() == this.f.cc.l) {
         if (this.f.cc instanceof csp $$1 && $$1.m() instanceof dtm $$2) {
            $$2.a($$0.b(), $$0.f());
         }
      }
   }

   @Override
   public void a(agz $$0) {
      zt.a($$0, this, this.f.y());
      if (this.f.s(2)) {
         dsy $$1 = this.f.dV().c_($$0.e());
         ul $$2 = $$1 != null ? $$1.d(this.f.dX()) : null;
         this.f.f.b(new agi($$0.b(), $$2));
      }
   }

   @Override
   public void a(ahv $$0) {
      zt.a($$0, this, this.f.y());
      if (b($$0.a(0.0), $$0.b(0.0), $$0.c(0.0), $$0.a(0.0F), $$0.b(0.0F))) {
         this.a(xj.c("multiplayer.disconnect.invalid_player_movement"));
      } else {
         arp $$1 = this.f.y();
         if (!this.f.k) {
            if (this.o == 0) {
               this.l();
            }

            if (!this.p()) {
               double $$2 = a($$0.a(this.f.dA()));
               double $$3 = b($$0.b(this.f.dC()));
               double $$4 = a($$0.c(this.f.dG()));
               float $$5 = azm.h($$0.a(this.f.dL()));
               float $$6 = azm.h($$0.b(this.f.dN()));
               if (this.f.bZ()) {
                  this.f.a(this.f.dA(), this.f.dC(), this.f.dG(), $$5, $$6);
                  this.f.y().m().a(this.f);
               } else {
                  double $$7 = this.f.dA();
                  double $$8 = this.f.dC();
                  double $$9 = this.f.dG();
                  double $$10 = $$2 - this.s;
                  double $$11 = $$3 - this.t;
                  double $$12 = $$4 - this.u;
                  double $$13 = this.f.dy().h();
                  double $$14 = $$10 * $$10 + $$11 * $$11 + $$12 * $$12;
                  if (this.f.fP()) {
                     if ($$14 > 1.0) {
                        this.a(this.f.dA(), this.f.dC(), this.f.dG(), $$5, $$6);
                     }
                  } else {
                     boolean $$15 = this.f.fH();
                     if ($$1.t().i()) {
                        this.M++;
                        int $$16 = this.M - this.N;
                        if ($$16 > 5) {
                           h.debug("{} is sending move packets too frequently ({} packets since last tick)", this.f.al().getString(), $$16);
                           $$16 = 1;
                        }

                        if (!this.f.Q() && (!this.f.y().N().b(dfi.t) || !$$15)) {
                           float $$17 = $$15 ? 300.0F : 100.0F;
                           if ($$14 - $$13 > (double)($$17 * (float)$$16) && !this.h()) {
                              h.warn("{} moved too quickly! {},{},{}", new Object[]{this.f.al().getString(), $$10, $$11, $$12});
                              this.a(this.f.dA(), this.f.dC(), this.f.dG(), this.f.dL(), this.f.dN());
                              return;
                           }
                        }
                     }

                     ezt $$18 = this.f.cR();
                     $$10 = $$2 - this.v;
                     $$11 = $$3 - this.w;
                     $$12 = $$4 - this.x;
                     boolean $$19 = $$11 > 0.0;
                     if (this.f.aJ() && !$$0.b() && $$19) {
                        this.f.s();
                     }

                     boolean $$20 = this.f.R;
                     this.f.a(bvl.b, new ezy($$10, $$11, $$12));
                     $$10 = $$2 - this.f.dA();
                     $$11 = $$3 - this.f.dC();
                     if ($$11 > -0.5 || $$11 < 0.5) {
                        $$11 = 0.0;
                     }

                     $$12 = $$4 - this.f.dG();
                     $$14 = $$10 * $$10 + $$11 * $$11 + $$12 * $$12;
                     boolean $$22 = false;
                     if (!this.f.Q() && $$14 > 0.0625 && !this.f.fP() && !this.f.h.e() && this.f.h.b() != dfj.d) {
                        $$22 = true;
                        h.warn("{} moved wrongly!", this.f.al().getString());
                     }

                     if (this.f.ad || this.f.fP() || (!$$22 || !$$1.a(this.f, $$18)) && !this.a($$1, $$18, $$2, $$3, $$4)) {
                        this.f.a($$2, $$3, $$4, $$5, $$6);
                        boolean $$23 = this.f.ft();
                        this.I = $$11 >= -0.03125
                           && !$$20
                           && this.f.h.b() != dfj.d
                           && !this.d.ad()
                           && !this.f.gh().c
                           && !this.f.b(bts.y)
                           && !$$15
                           && !$$23
                           && this.b(this.f);
                        this.f.y().m().a(this.f);
                        ezy $$24 = new ezy(this.f.dA() - $$7, this.f.dC() - $$8, this.f.dG() - $$9);
                        this.f.a($$0.b(), $$0.e(), $$24);
                        this.f.a(this.f.dA() - $$7, this.f.dC() - $$8, this.f.dG() - $$9, $$0.b());
                        if (!this.f.Y_()) {
                           this.f.b(new ezy($$7, $$8, $$9), this.f.dt());
                        }

                        this.a($$24);
                        if ($$19) {
                           this.f.k();
                        }

                        if ($$0.b() || this.f.ef() || this.f.p_() || this.f.Y_() || $$15 || $$23) {
                           this.f.gK();
                        }

                        this.f.b(this.f.dA() - $$7, this.f.dC() - $$8, this.f.dG() - $$9);
                        this.v = this.f.dA();
                        this.w = this.f.dC();
                        this.x = this.f.dG();
                     } else {
                        this.a($$7, $$8, $$9, $$5, $$6);
                        this.f.a(this.f.dA() - $$7, this.f.dC() - $$8, this.f.dG() - $$9, $$0.b());
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
            this.a(this.F.d, this.F.e, this.F.f, this.f.dL(), this.f.dN());
         }

         return true;
      } else {
         this.H = this.o;
         return false;
      }
   }

   private boolean a(dfp $$0, ezt $$1, double $$2, double $$3, double $$4) {
      ezt $$5 = this.f.cR().d($$2 - this.f.dA(), $$3 - this.f.dC(), $$4 - this.f.dG());
      Iterable<fas> $$6 = $$0.d(this.f, $$5.h(1.0E-5F));
      fas $$7 = fap.a($$1.h(1.0E-5F));

      for (fas $$8 : $$6) {
         if (!fap.c($$8, $$7, fac.i)) {
            return true;
         }
      }

      return false;
   }

   public void a(double $$0, double $$1, double $$2, float $$3, float $$4) {
      this.a(new bvu(new ezy($$0, $$1, $$2), ezy.c, $$3, $$4), Collections.emptySet());
   }

   public void a(bvu $$0, Set<bvv> $$1) {
      this.H = this.o;
      if (++this.G == Integer.MAX_VALUE) {
         this.G = 0;
      }

      this.f.a($$0, $$1);
      this.F = this.f.dt();
      this.f.f.b(aeo.a(this.G, $$0, $$1));
   }

   @Override
   public void a(aib $$0) {
      zt.a($$0, this, this.f.y());
      jh $$1 = $$0.b();
      this.f.H();
      aib.a $$2 = $$0.f();
      switch ($$2) {
         case g:
            if (!this.f.Y_()) {
               cwm $$3 = this.f.b(bsj.b);
               this.f.a(bsj.b, this.f.b(bsj.a));
               this.f.a(bsj.a, $$3);
               this.f.fD();
            }

            return;
         case e:
            if (!this.f.Y_()) {
               this.f.a(false);
            }

            return;
         case d:
            if (!this.f.Y_()) {
               this.f.a(true);
            }

            return;
         case f:
            this.f.fC();
            return;
         case a:
         case b:
         case c:
            this.f.h.a($$1, $$2, $$0.e(), this.f.dV().al(), $$0.g());
            this.f.f.a($$0.g());
            return;
         default:
            throw new IllegalArgumentException("Invalid player action");
      }
   }

   private static boolean a(arq $$0, cwm $$1) {
      if ($$1.f()) {
         return false;
      } else {
         cwi $$2 = $$1.h();
         return ($$2 instanceof cus || $$2 instanceof cuy) && !$$0.gC().a($$1);
      }
   }

   @Override
   public void a(aiu $$0) {
      zt.a($$0, this, this.f.y());
      this.f.f.a($$0.f());
      arp $$1 = this.f.y();
      bsj $$2 = $$0.b();
      cwm $$3 = this.f.b($$2);
      if ($$3.a($$1.J())) {
         ezu $$4 = $$0.e();
         ezy $$5 = $$4.g();
         jh $$6 = $$4.b();
         if (this.f.a($$6, 1.0)) {
            ezy $$7 = $$5.d(ezy.b($$6));
            double $$8 = 1.0000001;
            if (Math.abs($$7.a()) < 1.0000001 && Math.abs($$7.b()) < 1.0000001 && Math.abs($$7.c()) < 1.0000001) {
               jm $$9 = $$4.c();
               this.f.H();
               int $$10 = this.f.dV().al();
               if ($$6.v() <= $$10) {
                  if (this.F == null && $$1.a(this.f, $$6)) {
                     bsk $$11 = this.f.h.a(this.f, $$1, $$3, $$2, $$4);
                     if ($$11.a()) {
                        ao.P.a(this.f, $$4.b(), $$3.v());
                     }

                     if ($$9 == jm.b && !$$11.a() && $$6.v() >= $$10 && a(this.f, $$3)) {
                        xj $$12 = xj.a("build.tooHigh", $$10).a(n.m);
                        this.f.b($$12, true);
                     } else if ($$11 instanceof bsk.d $$13 && $$13.e() == bsk.e.c) {
                        this.f.a($$2, true);
                     }
                  }
               } else {
                  xj $$14 = xj.a("build.tooHigh", $$10).a(n.m);
                  this.f.b($$14, true);
               }

               this.f.f.b(new aco($$1, $$6));
               this.f.f.b(new aco($$1, $$6.a($$9)));
            } else {
               h.warn("Rejecting UseItemOnPacket from {}: Location {} too far away from hit block {}.", new Object[]{this.f.gf().getName(), $$5, $$6});
            }
         }
      }
   }

   @Override
   public void a(aiv $$0) {
      zt.a($$0, this, this.f.y());
      this.a($$0.e());
      arp $$1 = this.f.y();
      bsj $$2 = $$0.b();
      cwm $$3 = this.f.b($$2);
      this.f.H();
      if (!$$3.f() && $$3.a($$1.J())) {
         float $$4 = azm.h($$0.f());
         float $$5 = azm.h($$0.g());
         if ($$5 != this.f.dN() || $$4 != this.f.dL()) {
            this.f.b($$4, $$5);
         }

         if (this.f.h.a(this.f, $$1, $$3, $$2) instanceof bsk.d $$7 && $$7.e() == bsk.e.c) {
            this.f.a($$2, true);
         }
      }
   }

   @Override
   public void a(ait $$0) {
      zt.a($$0, this, this.f.y());
      if (this.f.Y_()) {
         for (arp $$1 : this.d.L()) {
            bul $$2 = $$0.a($$1);
            if ($$2 != null) {
               this.f.a($$1, $$2.dA(), $$2.dC(), $$2.dG(), Set.of(), $$2.dL(), $$2.dN(), true);
               return;
            }
         }
      }
   }

   @Override
   public void a(ahx $$0) {
      zt.a($$0, this, this.f.y());
      if (this.f.dl() instanceof cqr $$2) {
         $$2.b($$0.b(), $$0.e());
      }
   }

   @Override
   public void a(wf $$0) {
      h.info("{} lost connection: {}", this.f.al().getString(), $$0.a().getString());
      this.q();
      super.a($$0);
   }

   private void q() {
      this.T.close();
      this.d.av();
      this.d.ag().a(xj.a("multiplayer.player.left", this.f.o_()).a(n.o), false);
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
   public void a(ail $$0) {
      zt.a($$0, this, this.f.y());
      if ($$0.b() >= 0 && $$0.b() < cot.g()) {
         if (this.f.gg().j != $$0.b() && this.f.fy() == bsj.a) {
            this.f.fD();
         }

         this.f.gg().j = $$0.b();
         this.f.H();
      } else {
         h.warn("{} tried to set an invalid carried item", this.f.al().getString());
      }
   }

   @Override
   public void a(ahe $$0) {
      Optional<xq> $$1 = this.a($$0.h());
      if (!$$1.isEmpty()) {
         this.a($$0.b(), () -> {
            xz $$2;
            try {
               $$2 = this.a($$0, $$1.get());
            } catch (yd.a var6) {
               this.a(var6);
               return;
            }

            CompletableFuture<asi> $$5 = this.a($$2.c());
            xj $$6 = this.d.bk().decorate(this.f, $$2.d());
            this.T.append($$5, $$2x -> {
               xz $$3 = $$2.a($$6).a($$2x.e());
               this.b($$3);
            });
         });
      }
   }

   @Override
   public void a(ahc $$0) {
      this.a($$0.b(), () -> {
         this.b($$0.b());
         this.r();
      });
   }

   private void b(String $$0) {
      ParseResults<ew> $$1 = this.c($$0);
      if (this.d.aA() && yb.a($$1)) {
         h.error("Received unsigned command packet from {}, but the command requires signable arguments: {}", this.f.gf().getName(), $$0);
         this.f.a(m);
      } else {
         this.d.aG().a($$1, $$0);
      }
   }

   @Override
   public void a(ahd $$0) {
      Optional<xq> $$1 = this.a($$0.h());
      if (!$$1.isEmpty()) {
         this.a($$0.b(), () -> {
            this.a($$0, $$1.get());
            this.r();
         });
      }
   }

   private void a(ahd $$0, xq $$1) {
      ParseResults<ew> $$2 = this.c($$0.b());

      Map<String, xz> $$3;
      try {
         $$3 = this.a($$0, yb.b($$2), $$1);
      } catch (yd.a var6) {
         this.a(var6);
         return;
      }

      eu $$6 = new eu.a($$3);
      $$2 = ex.a($$2, $$1x -> $$1x.a($$6, this.T));
      this.d.aG().a($$2, $$0.b());
   }

   private void a(yd.a $$0) {
      h.warn("Failed to update secure chat state for {}: '{}'", this.f.gf().getName(), $$0.a().getString());
      this.f.a($$0.a().f().a(n.m));
   }

   private <S> Map<String, xz> a(ahd $$0, yb<S> $$1, xq $$2) throws yd.a {
      List<fd.a> $$3 = $$0.g().a();
      List<yb.a<S>> $$4 = $$1.a();
      if ($$3.isEmpty()) {
         return this.b($$4);
      } else {
         Map<String, xz> $$5 = new Object2ObjectOpenHashMap();

         for (fd.a $$6 : $$3) {
            yb.a<S> $$7 = $$1.a($$6.a());
            if ($$7 == null) {
               this.Q.setChainBroken();
               throw a($$0.b(), $$3, $$4);
            }

            yc $$8 = new yc($$7.c(), $$0.e(), $$0.f(), $$2);
            $$5.put($$7.a(), this.Q.unpack($$6.b(), $$8));
         }

         for (yb.a<S> $$9 : $$4) {
            if (!$$5.containsKey($$9.a())) {
               throw a($$0.b(), $$3, $$4);
            }
         }

         return $$5;
      }
   }

   private <S> Map<String, xz> b(List<yb.a<S>> $$0) throws yd.a {
      Map<String, xz> $$1 = new HashMap<>();

      for (yb.a<S> $$2 : $$0) {
         yc $$3 = yc.a($$2.c());
         $$1.put($$2.a(), this.Q.unpack(null, $$3));
      }

      return $$1;
   }

   private static <S> yd.a a(String $$0, List<fd.a> $$1, List<yb.a<S>> $$2) {
      String $$3 = $$1.stream().map(fd.a::a).collect(Collectors.joining(", "));
      String $$4 = $$2.stream().map(yb.a::a).collect(Collectors.joining(", "));
      h.error("Signed command mismatch between server and client ('{}'): got [{}] from client, but expected [{}]", new Object[]{$$0, $$3, $$4});
      return new yd.a(m);
   }

   private ParseResults<ew> c(String $$0) {
      CommandDispatcher<ew> $$1 = this.d.aG().a();
      return $$1.parse($$0, this.f.A());
   }

   private void a(String $$0, Runnable $$1) {
      if (d($$0)) {
         this.a(xj.c("multiplayer.disconnect.illegal_characters"));
      } else if (this.f.E() == cor.c) {
         this.b(new agg(xj.c("chat.disabled.options").a(n.m), false));
      } else {
         this.f.H();
         this.d.execute($$1);
      }
   }

   private Optional<xq> a(xq.b $$0) {
      synchronized (this.R) {
         Optional<xq> $$1 = this.R.a($$0);
         if ($$1.isEmpty()) {
            h.warn("Failed to validate message acknowledgements from {}", this.f.al().getString());
            this.a(l);
         }

         return $$1;
      }
   }

   private static boolean d(String $$0) {
      for (int $$1 = 0; $$1 < $$0.length(); $$1++) {
         if (!baj.a($$0.charAt($$1))) {
            return true;
         }
      }

      return false;
   }

   private xz a(ahe $$0, xq $$1) throws yd.a {
      yc $$2 = new yc($$0.b(), $$0.e(), $$0.f(), $$1);
      return this.Q.unpack($$0.g(), $$2);
   }

   private void b(xz $$0) {
      this.d.ag().a($$0, this.f, xf.a(xf.e, this.f));
      this.r();
   }

   private void r() {
      this.q.a();
      if (!this.q.c() && !this.d.ag().f(this.f.gf()) && !this.d.a(this.f.gf())) {
         this.a(xj.c("disconnect.spam"));
      }
   }

   @Override
   public void a(ahb $$0) {
      synchronized (this.R) {
         if (!this.R.a($$0.b())) {
            h.warn("Failed to validate message acknowledgements from {}", this.f.al().getString());
            this.a(l);
         }
      }
   }

   @Override
   public void a(ais $$0) {
      zt.a($$0, this, this.f.y());
      this.f.H();
      this.f.a($$0.b());
   }

   @Override
   public void a(aic $$0) {
      zt.a($$0, this, this.f.y());
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
            if (this.f.fP()) {
               this.f.a(false, true);
               this.F = this.f.dt();
            }
            break;
         case f:
            if (this.f.dl() instanceof bvr $$1) {
               int $$2 = $$0.f();
               if ($$1.a() && $$2 > 0) {
                  $$1.c($$2);
               }
            }
            break;
         case g:
            if (this.f.dl() instanceof bvr $$3) {
               $$3.b();
            }
            break;
         case h:
            if (this.f.dk() instanceof bva $$4) {
               $$4.b(this.f);
            }
            break;
         case i:
            if (!this.f.gm()) {
               this.f.go();
            }
            break;
         default:
            throw new IllegalArgumentException("Invalid client command!");
      }
   }

   public void a(xz $$0) {
      xv $$1 = $$0.l();
      if ($$1 != null) {
         this.S.a($$0.m(), $$0.l());
         int $$2;
         synchronized (this.R) {
            this.R.a($$1);
            $$2 = this.R.a();
         }

         if ($$2 > 4096) {
            this.a(xj.c("multiplayer.disconnect.too_many_pending_chats"));
         }
      }
   }

   public void a(xz $$0, xf.a $$1) {
      this.b(new aeh($$0.k().c(), $$0.k().b(), $$0.l(), $$0.m().a(this.S), $$0.n(), $$0.o(), $$1));
      this.a($$0);
   }

   public void a(xj $$0, xf.a $$1) {
      this.b(new adi($$0, $$1));
   }

   public SocketAddress m() {
      return this.e.d();
   }

   public void n() {
      this.U = true;
      this.q();
      this.b(age.a);
      this.e.a(abu.d);
   }

   @Override
   public void a(akc $$0) {
      this.e.a(new ajz($$0.b()));
   }

   @Override
   public void a(ahs $$0) {
      zt.a($$0, this, this.f.y());
      final arp $$1 = this.f.y();
      final bul $$2 = $$0.a($$1);
      this.f.H();
      this.f.g($$0.b());
      if ($$2 != null) {
         if (!$$1.E_().a($$2.dv())) {
            return;
         }

         ezt $$3 = $$2.cR();
         if (this.f.a($$3, 3.0)) {
            $$0.a(new ahs.c() {
               private void a(bsj $$0, ass.a $$1x) {
                  cwm $$2 = ass.this.f.b($$0);
                  if ($$2.a($$1.J())) {
                     cwm $$3 = $$2.v();
                     if ($$1.run(ass.this.f, $$2, $$0) instanceof bsk.d $$5) {
                        cwm $$6 = $$5.c() ? $$3 : cwm.k;
                        ao.T.a(ass.this.f, $$6, $$2);
                        if ($$5.e() == bsk.e.c) {
                           ass.this.f.a($$0, true);
                        }
                     }
                  }
               }

               @Override
               public void a(bsj $$0) {
                  this.a($$0, cou::a);
               }

               @Override
               public void a(bsj $$0, ezy $$1x) {
                  this.a($$0, ($$1xxx, $$2xx, $$3) -> $$2xx.a($$1xxx, $$1, $$3));
               }

               @Override
               public void a() {
                  label23:
                  if (!($$2 instanceof clc) && !($$2 instanceof bux) && $$2 != ass.this.f) {
                     if ($$2 instanceof cpb $$0 && !$$0.cB()) {
                        break label23;
                     }

                     cwm $$1 = ass.this.f.b(bsj.a);
                     if (!$$1.a($$1.J())) {
                        return;
                     }

                     ass.this.f.e($$2);
                     return;
                  }

                  ass.this.a(xj.c("multiplayer.disconnect.invalid_entity_attacked"));
                  ass.h.warn("Player {} tried to attack an invalid entity", ass.this.f.al().getString());
               }
            });
         }
      }
   }

   @Override
   public void a(ahh $$0) {
      zt.a($$0, this, this.f.y());
      this.f.H();
      ahh.a $$1 = $$0.b();
      switch ($$1) {
         case a:
            if (this.f.k) {
               this.f.k = false;
               this.f = this.d.ag().a(this.f, true, bul.c.e);
               this.l();
               ao.w.a(this.f, dfm.k, dfm.i);
            } else {
               if (this.f.eD() > 0.0F) {
                  return;
               }

               this.f = this.d.ag().a(this.f, false, bul.c.a);
               this.l();
               if (this.d.v_()) {
                  this.f.a(dfj.d);
                  this.f.y().N().a(dfi.r).a(false, this.d);
               }
            }
            break;
         case b:
            this.f.I().a(this.f);
      }
   }

   @Override
   public void a(ahn $$0) {
      zt.a($$0, this, this.f.y());
      this.f.q();
   }

   @Override
   public void a(ahm $$0) {
      zt.a($$0, this, this.f.y());
      this.f.H();
      if (this.f.cc.l == $$0.b()) {
         if (this.f.Y_()) {
            this.f.cc.b();
         } else if (!this.f.cc.b(this.f)) {
            h.debug("Player {} interacted with invalid menu {}", this.f, this.f.cc);
         } else {
            int $$1 = $$0.e();
            if (!this.f.cc.a($$1)) {
               h.debug("Player {} clicked invalid slot index: {}, available slots: {}", new Object[]{this.f.al(), $$1, this.f.cc.k.size()});
            } else {
               boolean $$2 = $$0.j() != this.f.cc.j();
               this.f.cc.h();
               this.f.cc.a($$1, $$0.f(), $$0.i(), this.f);
               ObjectIterator var4 = Int2ObjectMaps.fastIterable($$0.h()).iterator();

               while (var4.hasNext()) {
                  Entry<cwm> $$3 = (Entry<cwm>)var4.next();
                  this.f.cc.b($$3.getIntKey(), (cwm)$$3.getValue());
               }

               this.f.cc.a($$0.g());
               this.f.cc.i();
               if ($$2) {
                  this.f.cc.e();
               } else {
                  this.f.cc.d();
               }
            }
         }
      }
   }

   @Override
   public void a(ahz $$0) {
      zt.a($$0, this, this.f.y());
      this.f.H();
      if (!this.f.Y_() && this.f.cc.l == $$0.b()) {
         if (!this.f.cc.b(this.f)) {
            h.debug("Player {} interacted with invalid menu {}", this.f, this.f.cc);
         } else if (this.f.J().b($$0.e())) {
            if (this.f.cc instanceof cto $$1) {
               this.d.aI().a($$0.e()).ifPresent($$2 -> {
                  if ($$2.b().a().c()) {
                     h.debug("Player {} tried to place impossible recipe {}", this.f, $$2.a());
                  } else {
                     cto.a $$3 = $$1.a($$0.f(), this.f.b(), (dbc<?>)$$2, this.f.gg());
                     if ($$3 == cto.a.b) {
                        this.f.f.b(new aef(this.f.cc.l, (dbc<?>)$$2));
                     }
                  }
               });
            }
         }
      }
   }

   @Override
   public void a(ahl $$0) {
      zt.a($$0, this, this.f.y());
      this.f.H();
      if (this.f.cc.l == $$0.b() && !this.f.Y_()) {
         if (!this.f.cc.b(this.f)) {
            h.debug("Player {} interacted with invalid menu {}", this.f, this.f.cc);
         } else {
            boolean $$1 = this.f.cc.a(this.f, $$0.e());
            if ($$1) {
               this.f.cc.d();
            }
         }
      }
   }

   @Override
   public void a(aio $$0) {
      zt.a($$0, this, this.f.y());
      if (this.f.h.e()) {
         boolean $$1 = $$0.b() < 0;
         cwm $$2 = $$0.e();
         if (!$$2.a(this.f.dV().J())) {
            return;
         }

         cyv $$3 = $$2.a(ku.Y, cyv.a);
         if ($$3.a("x") && $$3.a("y") && $$3.a("z")) {
            jh $$4 = dsy.b($$3.d());
            if (this.f.dV().p($$4)) {
               dsy $$5 = this.f.dV().c_($$4);
               if ($$5 != null) {
                  $$5.a($$2, this.f.dV().J_());
               }
            }
         }

         boolean $$6 = $$0.b() >= 1 && $$0.b() <= 45;
         boolean $$7 = $$2.f() || $$2.L() <= $$2.k();
         if ($$6 && $$7) {
            this.f.cb.b($$0.b()).e($$2);
            this.f.cb.a($$0.b(), $$2);
            this.f.cb.d();
         } else if ($$1 && $$7) {
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
   public void a(air $$0) {
      List<String> $$1 = Stream.of($$0.f()).map(n::a).collect(Collectors.toList());
      this.a($$1).thenAcceptAsync($$1x -> this.a($$0, $$1x), this.d);
   }

   private void a(air $$0, List<asi> $$1) {
      this.f.H();
      arp $$2 = this.f.y();
      jh $$3 = $$0.b();
      if ($$2.B($$3)) {
         if (!($$2.c_($$3) instanceof duk $$5)) {
            return;
         }

         $$5.a(this.f, $$0.e(), $$1);
      }
   }

   @Override
   public void a(aia $$0) {
      zt.a($$0, this, this.f.y());
      this.f.gh().b = $$0.b() && this.f.gh().c;
   }

   @Override
   public void a(aak $$0) {
      zt.a($$0, this, this.f.y());
      this.f.a($$0.b());
   }

   @Override
   public void a(aha $$0) {
      zt.a($$0, this, this.f.y());
      if (this.f.s(2) || this.h()) {
         this.d.a($$0.b(), false);
      }
   }

   @Override
   public void a(ahu $$0) {
      zt.a($$0, this, this.f.y());
      if (this.f.s(2) || this.h()) {
         this.d.b($$0.b());
      }
   }

   @Override
   public void a(ahf $$0) {
      zt.a($$0, this, this.f.y());
      ya.a $$1 = $$0.b();
      cox.a $$2 = this.P != null ? this.P.d().b() : null;
      cox.a $$3 = $$1.b();
      if (!Objects.equals($$2, $$3)) {
         if ($$2 != null && $$3.b().isBefore($$2.b())) {
            this.a(cox.a);
         } else {
            try {
               azz $$4 = this.d.ar();
               if ($$4 == null) {
                  h.warn("Ignoring chat session from {} due to missing Services public key", this.f.gf().getName());
                  return;
               }

               this.a($$1.a(this.f.gf(), $$4));
            } catch (cox.b var6) {
               h.error("Failed to validate profile key: {}", var6.getMessage());
               this.a(var6.a());
            }
         }
      }
   }

   @Override
   public void a(ahk $$0) {
      if (!this.U) {
         throw new IllegalStateException("Client acknowledged config, but none was requested");
      } else {
         this.e.a(abu.b, new asq(this.d, this.e, this.a(this.f.C())));
      }
   }

   @Override
   public void a(ahg $$0) {
      zt.a($$0, this, this.f.y());
      this.g.a($$0.b());
   }

   @Override
   public void a(ahp $$0) {
      zt.a($$0, this, this.f.y());
      this.d.a(this.f, $$0.b());
   }

   private void a(ya $$0) {
      this.P = $$0;
      this.Q = $$0.a(this.f.cG());
      this.T.append(() -> {
         this.f.a($$0);
         this.d.ag().a(new aem(EnumSet.of(aem.a.b), List.of(this.f)));
      });
   }

   @Override
   public void a(aal $$0) {
   }

   @Override
   public void a(ahi $$0) {
      zt.a($$0, this, this.f.y());
      if (!this.O) {
         this.f.a(ezy.c);
      }

      this.O = false;
   }

   private void a(ezy $$0) {
      this.f.a($$0);
      this.f.H();
      this.O = true;
   }

   @Override
   public arq o() {
      return this.f;
   }

   @FunctionalInterface
   interface a {
      bsk run(arq var1, bul var2, bsj var3);
   }
}
