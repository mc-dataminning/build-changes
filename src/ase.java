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

public class ase extends asb implements agv, ash, xc {
   static final Logger h = LogUtils.getLogger();
   private static final int i = -1;
   private static final int j = 4096;
   private static final int k = 80;
   private static final xo l = xo.c("multiplayer.disconnect.chat_validation_failed");
   private static final xo m = xo.c("chat.disabled.invalid_command_signature").a(n.m);
   private static final int n = 1000;
   public arf f;
   public final asa g;
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
   private bss y;
   private double z;
   private double A;
   private double B;
   private double C;
   private double D;
   private double E;
   @Nullable
   private evp F;
   private int G;
   private int H;
   private boolean I;
   private int J;
   private boolean K;
   private int L;
   private int M;
   private int N;
   @Nullable
   private yf O;
   private yi.b P;
   private final xx Q = new xx(20);
   private final yb R = yb.a();
   private final ayl S;
   private boolean T;

   public ase(MinecraftServer $$0, wj $$1, arf $$2, art $$3) {
      super($$0, $$1, $$3);
      this.g = new asa($$1.e());
      this.f = $$2;
      $$2.c = this;
      $$2.X().a();
      this.P = yi.b.unsigned($$2.cz(), $$0::aB);
      this.S = new ayl($$0);
   }

   @Override
   public void d() {
      if (this.p > -1) {
         this.b(new acm(this.p));
         this.p = -1;
      }

      this.l();
      this.f.L = this.f.du();
      this.f.M = this.f.dw();
      this.f.N = this.f.dA();
      this.f.m();
      this.f.a(this.s, this.t, this.u, this.f.dF(), this.f.dH());
      this.o++;
      this.N = this.M;
      if (this.I && !this.f.fL() && !this.f.bR() && !this.f.eB()) {
         if (++this.J > this.a((bss)this.f)) {
            h.warn("{} was kicked for floating too long!", this.f.af().getString());
            this.b(xo.c("multiplayer.disconnect.flying"));
            return;
         }
      } else {
         this.I = false;
         this.J = 0;
      }

      this.y = this.f.cZ();
      if (this.y != this.f && this.y.cQ() == this.f) {
         this.z = this.y.du();
         this.A = this.y.dw();
         this.B = this.y.dA();
         this.C = this.y.du();
         this.D = this.y.dw();
         this.E = this.y.dA();
         if (this.K && this.y.cQ() == this.f) {
            if (++this.L > this.a(this.y)) {
               h.warn("{} was kicked for floating a vehicle too long!", this.f.af().getString());
               this.b(xo.c("multiplayer.disconnect.flying"));
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

      if (this.f.M() > 0L && this.d.aq() > 0 && ac.c() - this.f.M() > (long)this.d.aq() * 1000L * 60L) {
         this.b(xo.c("multiplayer.disconnect.idling"));
      }
   }

   private int a(bss $$0) {
      double $$1 = $$0.aZ();
      if ($$1 < 1.0E-5F) {
         return Integer.MAX_VALUE;
      } else {
         double $$2 = 0.08 / $$1;
         return ayx.c(80.0 * Math.max($$2, 1.0));
      }
   }

   @Override
   public void l() {
      this.s = this.f.du();
      this.t = this.f.dw();
      this.u = this.f.dA();
      this.v = this.f.du();
      this.w = this.f.dw();
      this.x = this.f.dA();
   }

   @Override
   public boolean c() {
      return this.e.i() && !this.T;
   }

   @Override
   public boolean a(zv<?> $$0) {
      return super.a($$0) ? true : this.T && this.e.i() && $$0 instanceof ahi;
   }

   @Override
   protected GameProfile i() {
      return this.f.gb();
   }

   private <T, R> CompletableFuture<R> a(T $$0, BiFunction<asj, T, CompletableFuture<R>> $$1) {
      return $$1.apply(this.f.X(), $$0).thenApply($$0x -> {
         if (!this.c()) {
            h.debug("Ignoring packet due to disconnection");
            throw new CancellationException("disconnected");
         } else {
            return (R)$$0x;
         }
      });
   }

   private CompletableFuture<arw> a(String $$0) {
      return this.a($$0, asj::a);
   }

   private CompletableFuture<List<arw>> a(List<String> $$0) {
      return this.a($$0, asj::a);
   }

   @Override
   public void a(aib $$0) {
      zy.a($$0, this, this.f.z());
      this.f.a($$0.b(), $$0.e(), $$0.f(), $$0.g());
   }

   private static boolean b(double $$0, double $$1, double $$2, float $$3, float $$4) {
      return Double.isNaN($$0) || Double.isNaN($$1) || Double.isNaN($$2) || !Floats.isFinite($$4) || !Floats.isFinite($$3);
   }

   private static double a(double $$0) {
      return ayx.a($$0, -3.0E7, 3.0E7);
   }

   private static double b(double $$0) {
      return ayx.a($$0, -2.0E7, 2.0E7);
   }

   @Override
   public void a(ahu $$0) {
      zy.a($$0, this, this.f.z());
      if (b($$0.b(), $$0.e(), $$0.f(), $$0.g(), $$0.h())) {
         this.b(xo.c("multiplayer.disconnect.invalid_vehicle_movement"));
      } else {
         bss $$1 = this.f.cZ();
         if ($$1 != this.f && $$1.cQ() == this.f && $$1 == this.y) {
            are $$2 = this.f.z();
            double $$3 = $$1.du();
            double $$4 = $$1.dw();
            double $$5 = $$1.dA();
            double $$6 = a($$0.b());
            double $$7 = b($$0.e());
            double $$8 = a($$0.f());
            float $$9 = ayx.g($$0.g());
            float $$10 = ayx.g($$0.h());
            double $$11 = $$6 - this.z;
            double $$12 = $$7 - this.A;
            double $$13 = $$8 - this.B;
            double $$14 = $$1.ds().g();
            double $$15 = $$11 * $$11 + $$12 * $$12 + $$13 * $$13;
            if ($$15 - $$14 > 100.0 && !this.h()) {
               h.warn("{} (vehicle of {}) moved too quickly! {},{},{}", new Object[]{$$1.af().getString(), this.f.af().getString(), $$11, $$12, $$13});
               this.b(new aec($$1));
               return;
            }

            boolean $$16 = $$2.a($$1, $$1.cK().h(0.0625));
            $$11 = $$6 - this.C;
            $$12 = $$7 - this.D - 1.0E-6;
            $$13 = $$8 - this.E;
            boolean $$17 = $$1.S;
            if ($$1 instanceof btn $$18 && $$18.q_()) {
               $$18.n();
            }

            $$1.a(bts.b, new evp($$11, $$12, $$13));
            $$11 = $$6 - $$1.du();
            $$12 = $$7 - $$1.dw();
            if ($$12 > -0.5 || $$12 < 0.5) {
               $$12 = 0.0;
            }

            $$13 = $$8 - $$1.dA();
            $$15 = $$11 * $$11 + $$12 * $$12 + $$13 * $$13;
            boolean $$20 = false;
            if ($$15 > 0.0625) {
               $$20 = true;
               h.warn("{} (vehicle of {}) moved wrongly! {}", new Object[]{$$1.af().getString(), this.f.af().getString(), Math.sqrt($$15)});
            }

            $$1.a($$6, $$7, $$8, $$9, $$10);
            boolean $$21 = $$2.a($$1, $$1.cK().h(0.0625));
            if ($$16 && ($$20 || !$$21)) {
               $$1.a($$3, $$4, $$5, $$9, $$10);
               this.b(new aec($$1));
               return;
            }

            this.f.z().l().a(this.f);
            this.f.b(this.f.du() - $$3, this.f.dw() - $$4, this.f.dA() - $$5);
            this.K = $$12 >= -0.03125 && !$$17 && !this.d.ae() && !$$1.aX() && this.b($$1);
            this.C = $$1.du();
            this.D = $$1.dw();
            this.E = $$1.dA();
         }
      }
   }

   private boolean b(bss $$0) {
      return $$0.dP().a($$0.cK().g(0.0625).b(0.0, -0.55, 0.0)).allMatch(drz.a::i);
   }

   @Override
   public void a(agx $$0) {
      zy.a($$0, this, this.f.z());
      if ($$0.b() == this.G) {
         if (this.F == null) {
            this.b(xo.c("multiplayer.disconnect.invalid_player_movement"));
            return;
         }

         this.f.a(this.F.c, this.F.d, this.F.e, this.f.dF(), this.f.dH());
         this.v = this.F.c;
         this.w = this.F.d;
         this.x = this.F.e;
         if (this.f.O()) {
            this.f.P();
         }

         this.F = null;
      }
   }

   @Override
   public void a(aid $$0) {
      zy.a($$0, this, this.f.z());
      this.d.aJ().a($$0.b()).ifPresent(this.f.I()::e);
   }

   @Override
   public void a(aic $$0) {
      zy.a($$0, this, this.f.z());
      this.f.I().a($$0.b(), $$0.e(), $$0.f());
   }

   @Override
   public void a(aif $$0) {
      zy.a($$0, this, this.f.z());
      if ($$0.e() == aif.a.a) {
         ale $$1 = Objects.requireNonNull($$0.f());
         af $$2 = this.d.aE().a($$1);
         if ($$2 != null) {
            this.f.Q().a($$2);
         }
      }
   }

   @Override
   public void a(ahh $$0) {
      zy.a($$0, this, this.f.z());
      StringReader $$1 = new StringReader($$0.e());
      if ($$1.canRead() && $$1.peek() == '/') {
         $$1.skip();
      }

      ParseResults<ep> $$2 = this.d.aH().a().parse($$1, this.f.dg());
      this.d.aH().a().getCompletionSuggestions($$2).thenAccept($$1x -> {
         Suggestions $$2x = $$1x.getList().size() <= 1000 ? $$1x : new Suggestions($$1x.getRange(), $$1x.getList().subList(0, 1000));
         this.b(new acz($$0.b(), $$2x));
      });
   }

   @Override
   public void a(aij $$0) {
      zy.a($$0, this, this.f.z());
      if (!this.d.q()) {
         this.f.a(xo.c("advMode.notEnabled"));
      } else if (!this.f.gz()) {
         this.f.a(xo.c("advMode.notAllowed"));
      } else {
         dax $$1 = null;
         dpp $$2 = null;
         iz $$3 = $$0.b();
         dpf $$4 = this.f.dP().c_($$3);
         if ($$4 instanceof dpp) {
            $$2 = (dpp)$$4;
            $$1 = $$2.b();
         }

         String $$5 = $$0.e();
         boolean $$6 = $$0.f();
         if ($$1 != null) {
            dpp.a $$7 = $$2.l();
            dsa $$8 = this.f.dP().a_($$3);
            je $$9 = $$8.c(dgg.b);

            dsa $$10 = switch ($$0.i()) {
               case a -> dez.kH.o();
               case b -> dez.kG.o();
               default -> dez.fN.o();
            };
            dsa $$11 = $$10.a(dgg.b, $$9).a(dgg.c, Boolean.valueOf($$0.g()));
            if ($$11 != $$8) {
               this.f.dP().a($$3, $$11, 2);
               $$4.b($$11);
               this.f.dP().m($$3).a($$4);
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
            if (!azt.b($$5)) {
               this.f.a(xo.a("advMode.setCommand.success", $$5));
            }
         }
      }
   }

   @Override
   public void a(aik $$0) {
      zy.a($$0, this, this.f.z());
      if (!this.d.q()) {
         this.f.a(xo.c("advMode.notEnabled"));
      } else if (!this.f.gz()) {
         this.f.a(xo.c("advMode.notAllowed"));
      } else {
         dax $$1 = $$0.a(this.f.dP());
         if ($$1 != null) {
            $$1.a($$0.b());
            $$1.a($$0.e());
            if (!$$0.e()) {
               $$1.c(null);
            }

            $$1.f();
            this.f.a(xo.a("advMode.setCommand.success", $$0.b()));
         }
      }
   }

   @Override
   public void a(ahw $$0) {
      zy.a($$0, this, this.f.z());
      this.f.gc().c($$0.b());
      this.f.c.b(new ade(-2, 0, this.f.gc().k, this.f.gc().a(this.f.gc().k)));
      this.f.c.b(new ade(-2, 0, $$0.b(), this.f.gc().a($$0.b())));
      this.f.c.b(new afh(this.f.gc().k));
   }

   @Override
   public void a(aie $$0) {
      zy.a($$0, this, this.f.z());
      if (this.f.cb instanceof cpu $$1) {
         if (!$$1.a(this.f)) {
            h.debug("Player {} interacted with invalid menu {}", this.f, $$1);
            return;
         }

         $$1.a($$0.b());
      }
   }

   @Override
   public void a(aih $$0) {
      zy.a($$0, this, this.f.z());
      if (this.f.cb instanceof cpv $$1) {
         if (!this.f.cb.a(this.f)) {
            h.debug("Player {} interacted with invalid menu {}", this.f, this.f.cb);
            return;
         }

         $$1.a($$0.b(), $$0.e());
      }
   }

   @Override
   public void a(ain $$0) {
      zy.a($$0, this, this.f.z());
      if (this.f.gz()) {
         iz $$1 = $$0.b();
         dsa $$2 = this.f.dP().a_($$1);
         if (this.f.dP().c_($$1) instanceof dqu $$4) {
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
               if ($$0.e() == dqu.a.b) {
                  if ($$4.A()) {
                     this.f.a(xo.a("structure_block.save_success", $$5), false);
                  } else {
                     this.f.a(xo.a("structure_block.save_failure", $$5), false);
                  }
               } else if ($$0.e() == dqu.a.c) {
                  if (!$$4.C()) {
                     this.f.a(xo.a("structure_block.load_not_found", $$5), false);
                  } else if ($$4.a(this.f.z())) {
                     this.f.a(xo.a("structure_block.load_success", $$5), false);
                  } else {
                     this.f.a(xo.a("structure_block.load_prepare", $$5), false);
                  }
               } else if ($$0.e() == dqu.a.d) {
                  if ($$4.z()) {
                     this.f.a(xo.a("structure_block.size_success", $$5), false);
                  } else {
                     this.f.a(xo.c("structure_block.size_failure"), false);
                  }
               }
            } else {
               this.f.a(xo.a("structure_block.invalid_structure_name", $$0.g()), false);
            }

            $$4.e();
            this.f.dP().a($$1, $$2, $$2, 3);
         }
      }
   }

   @Override
   public void a(aim $$0) {
      zy.a($$0, this, this.f.z());
      if (this.f.gz()) {
         iz $$1 = $$0.b();
         dsa $$2 = this.f.dP().a_($$1);
         if (this.f.dP().c_($$1) instanceof dqf $$4) {
            $$4.a($$0.e());
            $$4.b($$0.f());
            $$4.a(ald.a(lq.aM, $$0.g()));
            $$4.a($$0.h());
            $$4.a($$0.i());
            $$4.a($$0.k());
            $$4.b($$0.j());
            $$4.e();
            this.f.dP().a($$1, $$2, $$2, 3);
         }
      }
   }

   @Override
   public void a(ahr $$0) {
      zy.a($$0, this, this.f.z());
      if (this.f.gz()) {
         iz $$1 = $$0.b();
         if (this.f.dP().c_($$1) instanceof dqf $$3) {
            $$3.a(this.f.z(), $$0.e(), $$0.f());
         }
      }
   }

   @Override
   public void a(aig $$0) {
      zy.a($$0, this, this.f.z());
      int $$1 = $$0.b();
      if (this.f.cb instanceof crb $$2) {
         if (!$$2.a(this.f)) {
            h.debug("Player {} interacted with invalid menu {}", this.f, $$2);
            return;
         }

         $$2.e($$1);
         $$2.h($$1);
      }
   }

   @Override
   public void a(aho $$0) {
      int $$1 = $$0.b();
      if (cmu.d($$1) || $$1 == 40) {
         List<String> $$2 = Lists.newArrayList();
         Optional<String> $$3 = $$0.f();
         $$3.ifPresent($$2::add);
         $$0.e().stream().limit(100L).forEach($$2::add);
         Consumer<List<arw>> $$4 = $$3.isPresent() ? $$1x -> this.a((arw)$$1x.get(0), $$1x.subList(1, $$1x.size()), $$1) : $$1x -> this.a($$1x, $$1);
         this.a($$2).thenAcceptAsync($$4, this.d);
      }
   }

   private void a(List<arw> $$0, int $$1) {
      cun $$2 = this.f.gc().a($$1);
      if ($$2.a(cuq.tZ)) {
         List<arv<String>> $$3 = $$0.stream().map(this::a).toList();
         $$2.b(km.H, new cxv($$3));
      }
   }

   private void a(arw $$0, List<arw> $$1, int $$2) {
      cun $$3 = this.f.gc().a($$2);
      if ($$3.a(cuq.tZ)) {
         cun $$4 = $$3.a(cuq.ua, 1);
         $$4.c(km.H);
         List<arv<xo>> $$5 = $$1.stream().map($$0x -> this.a($$0x).a(xo::b)).toList();
         $$4.b(km.I, new cxw(this.a($$0), this.f.af().getString(), 0, $$5, true));
         this.f.gc().a($$2, $$4);
      }
   }

   private arv<String> a(arw $$0) {
      return this.f.Y() ? arv.a($$0.b()) : arv.a($$0);
   }

   @Override
   public void a(ahp $$0) {
      zy.a($$0, this, this.f.z());
      if (this.f.m(2)) {
         bss $$1 = this.f.dP().a($$0.e());
         if ($$1 != null) {
            ur $$2 = $$1.f(new ur());
            this.f.c.b(new agh($$0.b(), $$2));
         }
      }
   }

   @Override
   public void a(ahm $$0) {
      zy.a($$0, this, this.f.z());
      if (!this.f.N_() && $$0.e() == this.f.cb.j) {
         if (this.f.cb instanceof cqg $$1 && $$1.m() instanceof dpt $$2) {
            $$2.a($$0.b(), $$0.f());
         }
      }
   }

   @Override
   public void a(agy $$0) {
      zy.a($$0, this, this.f.z());
      if (this.f.m(2)) {
         dpf $$1 = this.f.dP().c_($$0.e());
         ur $$2 = $$1 != null ? $$1.d(this.f.dR()) : null;
         this.f.c.b(new agh($$0.b(), $$2));
      }
   }

   @Override
   public void a(aht $$0) {
      zy.a($$0, this, this.f.z());
      if (b($$0.a(0.0), $$0.b(0.0), $$0.c(0.0), $$0.a(0.0F), $$0.b(0.0F))) {
         this.b(xo.c("multiplayer.disconnect.invalid_player_movement"));
      } else {
         are $$1 = this.f.z();
         if (!this.f.g) {
            if (this.o == 0) {
               this.l();
            }

            if (this.F != null) {
               if (this.o - this.H > 20) {
                  this.H = this.o;
                  this.a(this.F.c, this.F.d, this.F.e, this.f.dF(), this.f.dH());
               }
            } else {
               this.H = this.o;
               double $$2 = a($$0.a(this.f.du()));
               double $$3 = b($$0.b(this.f.dw()));
               double $$4 = a($$0.c(this.f.dA()));
               float $$5 = ayx.g($$0.a(this.f.dF()));
               float $$6 = ayx.g($$0.b(this.f.dH()));
               if (this.f.bR()) {
                  this.f.a(this.f.du(), this.f.dw(), this.f.dA(), $$5, $$6);
                  this.f.z().l().a(this.f);
               } else {
                  double $$7 = this.f.du();
                  double $$8 = this.f.dw();
                  double $$9 = this.f.dA();
                  double $$10 = $$2 - this.s;
                  double $$11 = $$3 - this.t;
                  double $$12 = $$4 - this.u;
                  double $$13 = this.f.ds().g();
                  double $$14 = $$10 * $$10 + $$11 * $$11 + $$12 * $$12;
                  if (this.f.fL()) {
                     if ($$14 > 1.0) {
                        this.a(this.f.du(), this.f.dw(), this.f.dA(), $$5, $$6);
                     }
                  } else {
                     boolean $$15 = this.f.fE();
                     if ($$1.s().i()) {
                        this.M++;
                        int $$16 = this.M - this.N;
                        if ($$16 > 5) {
                           h.debug("{} is sending move packets too frequently ({} packets since last tick)", this.f.af().getString(), $$16);
                           $$16 = 1;
                        }

                        if (!this.f.O() && (!this.f.dP().ab().b(dbs.t) || !$$15)) {
                           float $$17 = $$15 ? 300.0F : 100.0F;
                           if ($$14 - $$13 > (double)($$17 * (float)$$16) && !this.h()) {
                              h.warn("{} moved too quickly! {},{},{}", new Object[]{this.f.af().getString(), $$10, $$11, $$12});
                              this.a(this.f.du(), this.f.dw(), this.f.dA(), this.f.dF(), this.f.dH());
                              return;
                           }
                        }
                     }

                     evk $$18 = this.f.cK();
                     $$10 = $$2 - this.v;
                     $$11 = $$3 - this.w;
                     $$12 = $$4 - this.x;
                     boolean $$19 = $$11 > 0.0;
                     if (this.f.aE() && !$$0.b() && $$19) {
                        this.f.fj();
                     }

                     boolean $$20 = this.f.S;
                     this.f.a(bts.b, new evp($$10, $$11, $$12));
                     $$10 = $$2 - this.f.du();
                     $$11 = $$3 - this.f.dw();
                     if ($$11 > -0.5 || $$11 < 0.5) {
                        $$11 = 0.0;
                     }

                     $$12 = $$4 - this.f.dA();
                     $$14 = $$10 * $$10 + $$11 * $$11 + $$12 * $$12;
                     boolean $$22 = false;
                     if (!this.f.O() && $$14 > 0.0625 && !this.f.fL() && !this.f.e.e() && this.f.e.b() != dbt.d) {
                        $$22 = true;
                        h.warn("{} moved wrongly!", this.f.af().getString());
                     }

                     if (this.f.ag || this.f.fL() || (!$$22 || !$$1.a(this.f, $$18)) && !this.a($$1, $$18, $$2, $$3, $$4)) {
                        this.f.a($$2, $$3, $$4, $$5, $$6);
                        boolean $$23 = this.f.fr();
                        this.I = $$11 >= -0.03125
                           && !$$20
                           && this.f.e.b() != dbt.d
                           && !this.d.ae()
                           && !this.f.gd().c
                           && !this.f.b(bsc.y)
                           && !$$15
                           && !$$23
                           && this.b(this.f);
                        this.f.z().l().a(this.f);
                        this.f.a(this.f.du() - $$7, this.f.dw() - $$8, this.f.dA() - $$9, $$0.b());
                        this.f.a($$0.b(), new evp(this.f.du() - $$7, this.f.dw() - $$8, this.f.dA() - $$9));
                        if ($$19) {
                           this.f.n();
                        }

                        if ($$0.b() || this.f.bi() || this.f.q_() || this.f.N_() || $$15 || $$23) {
                           this.f.gE();
                        }

                        this.f.b(this.f.du() - $$7, this.f.dw() - $$8, this.f.dA() - $$9);
                        this.v = this.f.du();
                        this.w = this.f.dw();
                        this.x = this.f.dA();
                     } else {
                        this.a($$7, $$8, $$9, $$5, $$6);
                        this.f.a(this.f.du() - $$7, this.f.dw() - $$8, this.f.dA() - $$9, $$0.b());
                     }
                  }
               }
            }
         }
      }
   }

   private boolean a(dbz $$0, evk $$1, double $$2, double $$3, double $$4) {
      evk $$5 = this.f.cK().d($$2 - this.f.du(), $$3 - this.f.dw(), $$4 - this.f.dA());
      Iterable<ewi> $$6 = $$0.d(this.f, $$5.h(1.0E-5F));
      ewi $$7 = ewf.a($$1.h(1.0E-5F));

      for (ewi $$8 : $$6) {
         if (!ewf.c($$8, $$7, evt.i)) {
            return true;
         }
      }

      return false;
   }

   public void a(double $$0, double $$1, double $$2, float $$3, float $$4) {
      this.a($$0, $$1, $$2, $$3, $$4, Collections.emptySet());
   }

   public void a(double $$0, double $$1, double $$2, float $$3, float $$4, Set<bub> $$5) {
      double $$6 = $$5.contains(bub.a) ? this.f.du() : 0.0;
      double $$7 = $$5.contains(bub.b) ? this.f.dw() : 0.0;
      double $$8 = $$5.contains(bub.c) ? this.f.dA() : 0.0;
      float $$9 = $$5.contains(bub.d) ? this.f.dF() : 0.0F;
      float $$10 = $$5.contains(bub.e) ? this.f.dH() : 0.0F;
      this.F = new evp($$0, $$1, $$2);
      if (++this.G == Integer.MAX_VALUE) {
         this.G = 0;
      }

      this.H = this.o;
      this.f.gE();
      this.f.a($$0, $$1, $$2, $$3, $$4);
      this.f.c.b(new aep($$0 - $$6, $$1 - $$7, $$2 - $$8, $$3 - $$9, $$4 - $$10, $$5, this.G));
   }

   @Override
   public void a(ahz $$0) {
      zy.a($$0, this, this.f.z());
      iz $$1 = $$0.b();
      this.f.G();
      ahz.a $$2 = $$0.f();
      switch ($$2) {
         case g:
            if (!this.f.N_()) {
               cun $$3 = this.f.b(bqr.b);
               this.f.a(bqr.b, this.f.b(bqr.a));
               this.f.a(bqr.a, $$3);
               this.f.fB();
            }

            return;
         case e:
            if (!this.f.N_()) {
               this.f.a(false);
            }

            return;
         case d:
            if (!this.f.N_()) {
               this.f.a(true);
            }

            return;
         case f:
            this.f.fA();
            return;
         case a:
         case b:
         case c:
            this.f.e.a($$1, $$2, $$0.e(), this.f.dP().am(), $$0.g());
            this.f.c.a($$0.g());
            return;
         default:
            throw new IllegalArgumentException("Invalid player action");
      }
   }

   private static boolean a(arf $$0, cun $$1) {
      if ($$1.e()) {
         return false;
      } else {
         cui $$2 = $$1.g();
         return ($$2 instanceof csl || $$2 instanceof cst) && !$$0.gx().a($$2);
      }
   }

   @Override
   public void a(air $$0) {
      zy.a($$0, this, this.f.z());
      this.f.c.a($$0.f());
      are $$1 = this.f.z();
      bqr $$2 = $$0.b();
      cun $$3 = this.f.b($$2);
      if ($$3.a($$1.J())) {
         evl $$4 = $$0.e();
         evp $$5 = $$4.e();
         iz $$6 = $$4.a();
         if (this.f.a($$6, 1.0)) {
            evp $$7 = $$5.d(evp.b($$6));
            double $$8 = 1.0000001;
            if (Math.abs($$7.a()) < 1.0000001 && Math.abs($$7.b()) < 1.0000001 && Math.abs($$7.c()) < 1.0000001) {
               je $$9 = $$4.b();
               this.f.G();
               int $$10 = this.f.dP().am();
               if ($$6.v() < $$10) {
                  if (this.F == null && $$1.a(this.f, $$6)) {
                     bqs $$11 = this.f.e.a(this.f, $$1, $$3, $$2, $$4);
                     if ($$11.a()) {
                        am.P.a(this.f, $$4.a(), $$3.s());
                     }

                     if ($$9 == je.b && !$$11.a() && $$6.v() >= $$10 - 1 && a(this.f, $$3)) {
                        xo $$12 = xo.a("build.tooHigh", $$10 - 1).a(n.m);
                        this.f.b($$12, true);
                     } else if ($$11.b()) {
                        this.f.a($$2, true);
                     }
                  }
               } else {
                  xo $$13 = xo.a("build.tooHigh", $$10 - 1).a(n.m);
                  this.f.b($$13, true);
               }

               this.f.c.b(new acq($$1, $$6));
               this.f.c.b(new acq($$1, $$6.a($$9)));
            } else {
               h.warn("Rejecting UseItemOnPacket from {}: Location {} too far away from hit block {}.", new Object[]{this.f.gb().getName(), $$5, $$6});
            }
         }
      }
   }

   @Override
   public void a(ais $$0) {
      zy.a($$0, this, this.f.z());
      this.a($$0.e());
      are $$1 = this.f.z();
      bqr $$2 = $$0.b();
      cun $$3 = this.f.b($$2);
      this.f.G();
      if (!$$3.e() && $$3.a($$1.J())) {
         bqs $$4 = this.f.e.a(this.f, $$1, $$3, $$2);
         if ($$4.b()) {
            this.f.a($$2, true);
         }
      }
   }

   @Override
   public void a(aiq $$0) {
      zy.a($$0, this, this.f.z());
      if (this.f.N_()) {
         for (are $$1 : this.d.K()) {
            bss $$2 = $$0.a($$1);
            if ($$2 != null) {
               this.f.a($$1, $$2.du(), $$2.dw(), $$2.dA(), $$2.dF(), $$2.dH());
               return;
            }
         }
      }
   }

   @Override
   public void a(ahv $$0) {
      zy.a($$0, this, this.f.z());
      if (this.f.dd() instanceof cot $$2) {
         $$2.a($$0.b(), $$0.e());
      }
   }

   @Override
   public void a(xo $$0) {
      h.info("{} lost connection: {}", this.f.af().getString(), $$0.getString());
      this.p();
      super.a($$0);
   }

   private void p() {
      this.S.close();
      this.d.aw();
      this.d.ah().a(xo.a("multiplayer.player.left", this.f.O_()).a(n.o), false);
      this.f.u();
      this.d.ah().c(this.f);
      this.f.X().b();
   }

   public void a(int $$0) {
      if ($$0 < 0) {
         throw new IllegalArgumentException("Expected packet sequence nr >= 0");
      } else {
         this.p = Math.max($$0, this.p);
      }
   }

   @Override
   public void a(aii $$0) {
      zy.a($$0, this, this.f.z());
      if ($$0.b() >= 0 && $$0.b() < cmu.g()) {
         if (this.f.gc().k != $$0.b() && this.f.fw() == bqr.a) {
            this.f.fB();
         }

         this.f.gc().k = $$0.b();
         this.f.G();
      } else {
         h.warn("{} tried to set an invalid carried item", this.f.af().getString());
      }
   }

   @Override
   public void a(ahd $$0) {
      Optional<xv> $$1 = this.a($$0.h());
      if (!$$1.isEmpty()) {
         this.a($$0.b(), () -> {
            ye $$2;
            try {
               $$2 = this.a($$0, $$1.get());
            } catch (yi.a var6) {
               this.a(var6);
               return;
            }

            CompletableFuture<arw> $$5 = this.a($$2.c());
            xo $$6 = this.d.bm().decorate(this.f, $$2.d());
            this.S.append($$5, $$2x -> {
               ye $$3 = $$2.a($$6).a($$2x.e());
               this.b($$3);
            });
         });
      }
   }

   @Override
   public void a(ahb $$0) {
      this.a($$0.b(), () -> {
         this.b($$0.b());
         this.q();
      });
   }

   private void b(String $$0) {
      ParseResults<ep> $$1 = this.c($$0);
      if (this.d.aB() && yg.a($$1)) {
         h.error("Received unsigned command packet from {}, but the command requires signable arguments: {}", this.f.gb().getName(), $$0);
         this.f.a(m);
      } else {
         this.d.aH().a($$1, $$0);
      }
   }

   @Override
   public void a(ahc $$0) {
      Optional<xv> $$1 = this.a($$0.h());
      if (!$$1.isEmpty()) {
         this.a($$0.b(), () -> {
            this.a($$0, $$1.get());
            this.q();
         });
      }
   }

   private void a(ahc $$0, xv $$1) {
      ParseResults<ep> $$2 = this.c($$0.b());

      Map<String, ye> $$3;
      try {
         $$3 = this.a($$0, yg.b($$2), $$1);
      } catch (yi.a var6) {
         this.a(var6);
         return;
      }

      en $$6 = new en.a($$3);
      $$2 = eq.a($$2, $$1x -> $$1x.a($$6, this.S));
      this.d.aH().a($$2, $$0.b());
   }

   private void a(yi.a $$0) {
      h.warn("Failed to update secure chat state for {}: '{}'", this.f.gb().getName(), $$0.a().getString());
      this.f.a($$0.a().f().a(n.m));
   }

   private <S> Map<String, ye> a(ahc $$0, yg<S> $$1, xv $$2) throws yi.a {
      List<ew.a> $$3 = $$0.g().a();
      List<yg.a<S>> $$4 = $$1.a();
      if ($$3.isEmpty()) {
         return this.b($$4);
      } else {
         Map<String, ye> $$5 = new Object2ObjectOpenHashMap();

         for (ew.a $$6 : $$3) {
            yg.a<S> $$7 = $$1.a($$6.a());
            if ($$7 == null) {
               this.P.setChainBroken();
               throw a($$0.b(), $$3, $$4);
            }

            yh $$8 = new yh($$7.c(), $$0.e(), $$0.f(), $$2);
            $$5.put($$7.a(), this.P.unpack($$6.b(), $$8));
         }

         for (yg.a<S> $$9 : $$4) {
            if (!$$5.containsKey($$9.a())) {
               throw a($$0.b(), $$3, $$4);
            }
         }

         return $$5;
      }
   }

   private <S> Map<String, ye> b(List<yg.a<S>> $$0) throws yi.a {
      Map<String, ye> $$1 = new HashMap<>();

      for (yg.a<S> $$2 : $$0) {
         yh $$3 = yh.a($$2.c());
         $$1.put($$2.a(), this.P.unpack(null, $$3));
      }

      return $$1;
   }

   private static <S> yi.a a(String $$0, List<ew.a> $$1, List<yg.a<S>> $$2) {
      String $$3 = $$1.stream().map(ew.a::a).collect(Collectors.joining(", "));
      String $$4 = $$2.stream().map(yg.a::a).collect(Collectors.joining(", "));
      h.error("Signed command mismatch between server and client ('{}'): got [{}] from client, but expected [{}]", new Object[]{$$0, $$3, $$4});
      return new yi.a(m);
   }

   private ParseResults<ep> c(String $$0) {
      CommandDispatcher<ep> $$1 = this.d.aH().a();
      return $$1.parse($$0, this.f.dg());
   }

   private void a(String $$0, Runnable $$1) {
      if (d($$0)) {
         this.b(xo.c("multiplayer.disconnect.illegal_characters"));
      } else if (this.f.D() == cmt.c) {
         this.b(new agf(xo.c("chat.disabled.options").a(n.m), false));
      } else {
         this.f.G();
         this.d.execute($$1);
      }
   }

   private Optional<xv> a(xv.b $$0) {
      synchronized (this.Q) {
         Optional<xv> $$1 = this.Q.a($$0);
         if ($$1.isEmpty()) {
            h.warn("Failed to validate message acknowledgements from {}", this.f.af().getString());
            this.b(l);
         }

         return $$1;
      }
   }

   private static boolean d(String $$0) {
      for (int $$1 = 0; $$1 < $$0.length(); $$1++) {
         if (!azt.a($$0.charAt($$1))) {
            return true;
         }
      }

      return false;
   }

   private ye a(ahd $$0, xv $$1) throws yi.a {
      yh $$2 = new yh($$0.b(), $$0.e(), $$0.f(), $$1);
      return this.P.unpack($$0.g(), $$2);
   }

   private void b(ye $$0) {
      this.d.ah().a($$0, this.f, xk.a(xk.c, this.f));
      this.q();
   }

   private void q() {
      this.q += 20;
      if (this.q > 200 && !this.d.ah().f(this.f.gb())) {
         this.b(xo.c("disconnect.spam"));
      }
   }

   @Override
   public void a(aha $$0) {
      synchronized (this.Q) {
         if (!this.Q.a($$0.b())) {
            h.warn("Failed to validate message acknowledgements from {}", this.f.af().getString());
            this.b(l);
         }
      }
   }

   @Override
   public void a(aip $$0) {
      zy.a($$0, this, this.f.z());
      this.f.G();
      this.f.a($$0.b());
   }

   @Override
   public void a(aia $$0) {
      zy.a($$0, this, this.f.z());
      this.f.G();
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
            if (this.f.fL()) {
               this.f.a(false, true);
               this.F = this.f.dn();
            }
            break;
         case f:
            if (this.f.dd() instanceof bty $$1) {
               int $$2 = $$0.f();
               if ($$1.a() && $$2 > 0) {
                  $$1.c($$2);
               }
            }
            break;
         case g:
            if (this.f.dd() instanceof bty $$3) {
               $$3.b();
            }
            break;
         case h:
            if (this.f.dc() instanceof btg $$4) {
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

   public void a(ye $$0) {
      ya $$1 = $$0.l();
      if ($$1 != null) {
         this.R.a($$0.m(), $$0.l());
         int $$2;
         synchronized (this.Q) {
            this.Q.a($$1);
            $$2 = this.Q.a();
         }

         if ($$2 > 4096) {
            this.b(xo.c("multiplayer.disconnect.too_many_pending_chats"));
         }
      }
   }

   public void a(ye $$0, xk.a $$1) {
      this.b(new aei($$0.k().c(), $$0.k().b(), $$0.l(), $$0.m().a(this.R), $$0.n(), $$0.o(), $$1));
      this.a($$0);
   }

   public void a(xo $$0, xk.a $$1) {
      this.b(new adk($$0, $$1));
   }

   public SocketAddress m() {
      return this.e.d();
   }

   public void n() {
      this.T = true;
      this.p();
      this.b(agd.a);
      this.e.a(abw.b);
   }

   @Override
   public void a(ajz $$0) {
      this.e.a(new ajw($$0.b()));
   }

   @Override
   public void a(ahq $$0) {
      zy.a($$0, this, this.f.z());
      final are $$1 = this.f.z();
      final bss $$2 = $$0.a($$1);
      this.f.G();
      this.f.g($$0.b());
      if ($$2 != null) {
         if (!$$1.C_().a($$2.dp())) {
            return;
         }

         evk $$3 = $$2.cK();
         if (this.f.a($$3, 1.0)) {
            $$0.a(new ahq.c() {
               private void a(bqr $$0, ase.a $$1x) {
                  cun $$2 = ase.this.f.b($$0);
                  if ($$2.a($$1.J())) {
                     cun $$3 = $$2.s();
                     bqs $$4 = $$1.run(ase.this.f, $$2, $$0);
                     if ($$4.a()) {
                        am.T.a(ase.this.f, $$4.c() ? $$3 : cun.l, $$2);
                        if ($$4.b()) {
                           ase.this.f.a($$0, true);
                        }
                     }
                  }
               }

               @Override
               public void a(bqr $$0) {
                  this.a($$0, cmv::a);
               }

               @Override
               public void a(bqr $$0, evp $$1x) {
                  this.a($$0, ($$1xxx, $$2xx, $$3) -> $$2xx.a($$1xxx, $$1, $$3));
               }

               @Override
               public void a() {
                  if (!($$2 instanceof cjf) && !($$2 instanceof btd) && $$2 != ase.this.f && (!($$2 instanceof cnb) || $$2.ak().a(aws.H))) {
                     cun $$0 = ase.this.f.b(bqr.a);
                     if ($$0.a($$1.J())) {
                        ase.this.f.e($$2);
                     }
                  } else {
                     ase.this.b(xo.c("multiplayer.disconnect.invalid_entity_attacked"));
                     ase.h.warn("Player {} tried to attack an invalid entity", ase.this.f.af().getString());
                  }
               }
            });
         }
      }
   }

   @Override
   public void a(ahg $$0) {
      zy.a($$0, this, this.f.z());
      this.f.G();
      ahg.a $$1 = $$0.b();
      switch ($$1) {
         case a:
            if (this.f.g) {
               this.f.g = false;
               this.f = this.d.ah().a(this.f, true);
               am.w.a(this.f, dbw.j, dbw.h);
            } else {
               if (this.f.eA() > 0.0F) {
                  return;
               }

               this.f = this.d.ah().a(this.f, false);
               if (this.d.j()) {
                  this.f.a(dbt.d);
                  this.f.dP().ab().a(dbs.r).a(false, this.d);
               }
            }
            break;
         case b:
            this.f.H().a(this.f);
      }
   }

   @Override
   public void a(ahl $$0) {
      zy.a($$0, this, this.f.z());
      this.f.s();
   }

   @Override
   public void a(ahk $$0) {
      zy.a($$0, this, this.f.z());
      this.f.G();
      if (this.f.cb.j == $$0.b()) {
         if (this.f.N_()) {
            this.f.cb.b();
         } else if (!this.f.cb.a(this.f)) {
            h.debug("Player {} interacted with invalid menu {}", this.f, this.f.cb);
         } else {
            int $$1 = $$0.e();
            if (!this.f.cb.a($$1)) {
               h.debug("Player {} clicked invalid slot index: {}, available slots: {}", new Object[]{this.f.af(), $$1, this.f.cb.i.size()});
            } else {
               boolean $$2 = $$0.j() != this.f.cb.j();
               this.f.cb.h();
               this.f.cb.a($$1, $$0.f(), $$0.i(), this.f);
               ObjectIterator var4 = Int2ObjectMaps.fastIterable($$0.h()).iterator();

               while (var4.hasNext()) {
                  Entry<cun> $$3 = (Entry<cun>)var4.next();
                  this.f.cb.b($$3.getIntKey(), (cun)$$3.getValue());
               }

               this.f.cb.a($$0.g());
               this.f.cb.i();
               if ($$2) {
                  this.f.cb.e();
               } else {
                  this.f.cb.d();
               }
            }
         }
      }
   }

   @Override
   public void a(ahx $$0) {
      zy.a($$0, this, this.f.z());
      this.f.G();
      if (!this.f.N_() && this.f.cb.j == $$0.b() && this.f.cb instanceof crf) {
         if (!this.f.cb.a(this.f)) {
            h.debug("Player {} interacted with invalid menu {}", this.f, this.f.cb);
         } else {
            this.d.aJ().a($$0.e()).ifPresent($$1 -> ((crf)this.f.cb).a($$0.f(), (cyv<?>)$$1, this.f));
         }
      }
   }

   @Override
   public void a(ahj $$0) {
      zy.a($$0, this, this.f.z());
      this.f.G();
      if (this.f.cb.j == $$0.b() && !this.f.N_()) {
         if (!this.f.cb.a(this.f)) {
            h.debug("Player {} interacted with invalid menu {}", this.f, this.f.cb);
         } else {
            boolean $$1 = this.f.cb.b(this.f, $$0.e());
            if ($$1) {
               this.f.cb.d();
            }
         }
      }
   }

   @Override
   public void a(ail $$0) {
      zy.a($$0, this, this.f.z());
      if (this.f.e.e()) {
         boolean $$1 = $$0.b() < 0;
         cun $$2 = $$0.e();
         if (!$$2.a(this.f.dP().J())) {
            return;
         }

         cxc $$3 = $$2.a(km.N, cxc.a);
         if ($$3.a("x") && $$3.a("y") && $$3.a("z")) {
            iz $$4 = dpf.b($$3.d());
            if (this.f.dP().p($$4)) {
               dpf $$5 = this.f.dP().c_($$4);
               if ($$5 != null) {
                  $$5.a($$2, this.f.dP().H_());
               }
            }
         }

         boolean $$6 = $$0.b() >= 1 && $$0.b() <= 45;
         boolean $$7 = $$2.e() || $$2.I() <= $$2.j();
         if ($$6 && $$7) {
            this.f.ca.b($$0.b()).e($$2);
            this.f.ca.d();
         } else if ($$1 && $$7 && this.r < 200) {
            this.r += 20;
            this.f.a($$2, true);
         }
      }
   }

   @Override
   public void a(aio $$0) {
      List<String> $$1 = Stream.of($$0.f()).map(n::a).collect(Collectors.toList());
      this.a($$1).thenAcceptAsync($$1x -> this.a($$0, $$1x), this.d);
   }

   private void a(aio $$0, List<arw> $$1) {
      this.f.G();
      are $$2 = this.f.z();
      iz $$3 = $$0.b();
      if ($$2.B($$3)) {
         if (!($$2.c_($$3) instanceof dqp $$5)) {
            return;
         }

         $$5.a(this.f, $$0.e(), $$1);
      }
   }

   @Override
   public void a(ahy $$0) {
      zy.a($$0, this, this.f.z());
      this.f.gd().b = $$0.b() && this.f.gd().c;
   }

   @Override
   public void a(aan $$0) {
      zy.a($$0, this, this.f.z());
      this.f.a($$0.b());
   }

   @Override
   public void a(agz $$0) {
      zy.a($$0, this, this.f.z());
      if (this.f.m(2) || this.h()) {
         this.d.a($$0.b(), false);
      }
   }

   @Override
   public void a(ahs $$0) {
      zy.a($$0, this, this.f.z());
      if (this.f.m(2) || this.h()) {
         this.d.b($$0.b());
      }
   }

   @Override
   public void a(ahe $$0) {
      zy.a($$0, this, this.f.z());
      yf.a $$1 = $$0.b();
      cmy.a $$2 = this.O != null ? this.O.d().b() : null;
      cmy.a $$3 = $$1.b();
      if (!Objects.equals($$2, $$3)) {
         if ($$2 != null && $$3.b().isBefore($$2.b())) {
            this.b(cmy.a);
         } else {
            try {
               azk $$4 = this.d.as();
               if ($$4 == null) {
                  h.warn("Ignoring chat session from {} due to missing Services public key", this.f.gb().getName());
                  return;
               }

               this.a($$1.a(this.f.gb(), $$4));
            } catch (cmy.b var6) {
               h.error("Failed to validate profile key: {}", var6.getMessage());
               this.b(var6.a());
            }
         }
      }
   }

   @Override
   public void a(ahi $$0) {
      if (!this.T) {
         throw new IllegalStateException("Client acknowledged config, but none was requested");
      } else {
         this.e.a(abw.a, new asc(this.d, this.e, this.a(this.f.B())));
      }
   }

   @Override
   public void a(ahf $$0) {
      zy.a($$0, this, this.f.z());
      this.g.a($$0.b());
   }

   @Override
   public void a(ahn $$0) {
      zy.a($$0, this, this.f.z());
      this.d.a(this.f, $$0.b());
   }

   private void a(yf $$0) {
      this.O = $$0;
      this.P = $$0.a(this.f.cz());
      this.S.append(() -> {
         this.f.a($$0);
         this.d.ah().a(new aen(EnumSet.of(aen.a.b), List.of(this.f)));
      });
   }

   @Override
   public void a(aao $$0) {
   }

   @Override
   public arf o() {
      return this.f;
   }

   @FunctionalInterface
   interface a {
      bqs run(arf var1, bss var2, bqr var3);
   }
}
