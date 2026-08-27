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

public class arm extends arj implements agd, arp, wl {
   static final Logger g = LogUtils.getLogger();
   private static final int h = -1;
   private static final int i = 4096;
   private static final int j = 80;
   private static final wx k = wx.c("multiplayer.disconnect.chat_validation_failed");
   private static final wx l = wx.c("chat.disabled.invalid_command_signature").a(n.m);
   private static final int m = 1000;
   public aqn e;
   public final ari f;
   private int n;
   private int o = -1;
   private int p;
   private int q;
   private double r;
   private double s;
   private double t;
   private double u;
   private double v;
   private double w;
   @Nullable
   private bru x;
   private double y;
   private double z;
   private double A;
   private double B;
   private double C;
   private double D;
   @Nullable
   private euk E;
   private int F;
   private int G;
   private boolean H;
   private int I;
   private boolean J;
   private int K;
   private int L;
   private int M;
   @Nullable
   private xo N;
   private xr.b O;
   private final xg P = new xg(20);
   private final xk Q = xk.a();
   private final axs R;
   private boolean S;

   public arm(MinecraftServer $$0, vv $$1, aqn $$2, arb $$3) {
      super($$0, $$1, $$3);
      this.f = new ari($$1.e());
      this.e = $$2;
      $$2.d = this;
      $$2.X().a();
      this.O = xr.b.unsigned($$2.cz(), $$0::aB);
      this.R = new axs($$0);
   }

   @Override
   public void e() {
      if (this.o > -1) {
         this.b(new abv(this.o));
         this.o = -1;
      }

      this.m();
      this.e.L = this.e.du();
      this.e.M = this.e.dw();
      this.e.N = this.e.dA();
      this.e.m();
      this.e.a(this.r, this.s, this.t, this.e.dF(), this.e.dH());
      this.n++;
      this.M = this.L;
      if (this.H && !this.e.fL() && !this.e.bR() && !this.e.eB()) {
         if (++this.I > this.a((bru)this.e)) {
            g.warn("{} was kicked for floating too long!", this.e.af().getString());
            this.b(wx.c("multiplayer.disconnect.flying"));
            return;
         }
      } else {
         this.H = false;
         this.I = 0;
      }

      this.x = this.e.cZ();
      if (this.x != this.e && this.x.cQ() == this.e) {
         this.y = this.x.du();
         this.z = this.x.dw();
         this.A = this.x.dA();
         this.B = this.x.du();
         this.C = this.x.dw();
         this.D = this.x.dA();
         if (this.J && this.x.cQ() == this.e) {
            if (++this.K > this.a(this.x)) {
               g.warn("{} was kicked for floating a vehicle too long!", this.e.af().getString());
               this.b(wx.c("multiplayer.disconnect.flying"));
               return;
            }
         } else {
            this.J = false;
            this.K = 0;
         }
      } else {
         this.x = null;
         this.J = false;
         this.K = 0;
      }

      this.f();
      if (this.p > 0) {
         this.p--;
      }

      if (this.q > 0) {
         this.q--;
      }

      if (this.e.M() > 0L && this.c.aq() > 0 && ac.c() - this.e.M() > (long)this.c.aq() * 1000L * 60L) {
         this.b(wx.c("multiplayer.disconnect.idling"));
      }
   }

   private int a(bru $$0) {
      double $$1 = $$0.aZ();
      if ($$1 < 1.0E-5F) {
         return Integer.MAX_VALUE;
      } else {
         double $$2 = 0.08 / $$1;
         return ayd.c(80.0 * Math.max($$2, 1.0));
      }
   }

   public void m() {
      this.r = this.e.du();
      this.s = this.e.dw();
      this.t = this.e.dA();
      this.u = this.e.du();
      this.v = this.e.dw();
      this.w = this.e.dA();
   }

   @Override
   public boolean c() {
      return this.d.i() && !this.S;
   }

   @Override
   public boolean a(ze<?> $$0) {
      return super.a($$0) ? true : this.S && this.d.i() && $$0 instanceof agq;
   }

   @Override
   protected GameProfile j() {
      return this.e.gb();
   }

   private <T, R> CompletableFuture<R> a(T $$0, BiFunction<arr, T, CompletableFuture<R>> $$1) {
      return $$1.apply(this.e.X(), $$0).thenApply($$0x -> {
         if (!this.c()) {
            g.debug("Ignoring packet due to disconnection");
            throw new CancellationException("disconnected");
         } else {
            return (R)$$0x;
         }
      });
   }

   private CompletableFuture<are> a(String $$0) {
      return this.a($$0, arr::a);
   }

   private CompletableFuture<List<are>> a(List<String> $$0) {
      return this.a($$0, arr::a);
   }

   @Override
   public void a(ahj $$0) {
      zh.a($$0, this, this.e.z());
      this.e.a($$0.b(), $$0.e(), $$0.f(), $$0.g());
   }

   private static boolean b(double $$0, double $$1, double $$2, float $$3, float $$4) {
      return Double.isNaN($$0) || Double.isNaN($$1) || Double.isNaN($$2) || !Floats.isFinite($$4) || !Floats.isFinite($$3);
   }

   private static double a(double $$0) {
      return ayd.a($$0, -3.0E7, 3.0E7);
   }

   private static double b(double $$0) {
      return ayd.a($$0, -2.0E7, 2.0E7);
   }

   @Override
   public void a(ahc $$0) {
      zh.a($$0, this, this.e.z());
      if (b($$0.b(), $$0.e(), $$0.f(), $$0.g(), $$0.h())) {
         this.b(wx.c("multiplayer.disconnect.invalid_vehicle_movement"));
      } else {
         bru $$1 = this.e.cZ();
         if ($$1 != this.e && $$1.cQ() == this.e && $$1 == this.x) {
            aqm $$2 = this.e.z();
            double $$3 = $$1.du();
            double $$4 = $$1.dw();
            double $$5 = $$1.dA();
            double $$6 = a($$0.b());
            double $$7 = b($$0.e());
            double $$8 = a($$0.f());
            float $$9 = ayd.g($$0.g());
            float $$10 = ayd.g($$0.h());
            double $$11 = $$6 - this.y;
            double $$12 = $$7 - this.z;
            double $$13 = $$8 - this.A;
            double $$14 = $$1.ds().g();
            double $$15 = $$11 * $$11 + $$12 * $$12 + $$13 * $$13;
            if ($$15 - $$14 > 100.0 && !this.i()) {
               g.warn("{} (vehicle of {}) moved too quickly! {},{},{}", new Object[]{$$1.af().getString(), this.e.af().getString(), $$11, $$12, $$13});
               this.b(new adl($$1));
               return;
            }

            boolean $$16 = $$2.a($$1, $$1.cK().h(0.0625));
            $$11 = $$6 - this.B;
            $$12 = $$7 - this.C - 1.0E-6;
            $$13 = $$8 - this.D;
            boolean $$17 = $$1.S;
            if ($$1 instanceof bso $$18 && $$18.q_()) {
               $$18.n();
            }

            $$1.a(bst.b, new euk($$11, $$12, $$13));
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
               g.warn("{} (vehicle of {}) moved wrongly! {}", new Object[]{$$1.af().getString(), this.e.af().getString(), Math.sqrt($$15)});
            }

            $$1.a($$6, $$7, $$8, $$9, $$10);
            boolean $$21 = $$2.a($$1, $$1.cK().h(0.0625));
            if ($$16 && ($$20 || !$$21)) {
               $$1.a($$3, $$4, $$5, $$9, $$10);
               this.b(new adl($$1));
               return;
            }

            this.e.z().l().a(this.e);
            this.e.b(this.e.du() - $$3, this.e.dw() - $$4, this.e.dA() - $$5);
            this.J = $$12 >= -0.03125 && !$$17 && !this.c.ae() && !$$1.aX() && this.b($$1);
            this.B = $$1.du();
            this.C = $$1.dw();
            this.D = $$1.dA();
         }
      }
   }

   private boolean b(bru $$0) {
      return $$0.dP().a($$0.cK().g(0.0625).b(0.0, -0.55, 0.0)).allMatch(dra.a::i);
   }

   @Override
   public void a(agf $$0) {
      zh.a($$0, this, this.e.z());
      if ($$0.b() == this.F) {
         if (this.E == null) {
            this.b(wx.c("multiplayer.disconnect.invalid_player_movement"));
            return;
         }

         this.e.a(this.E.c, this.E.d, this.E.e, this.e.dF(), this.e.dH());
         this.u = this.E.c;
         this.v = this.E.d;
         this.w = this.E.e;
         if (this.e.O()) {
            this.e.P();
         }

         this.E = null;
      }
   }

   @Override
   public void a(ahl $$0) {
      zh.a($$0, this, this.e.z());
      this.c.aJ().a($$0.b()).ifPresent(this.e.I()::e);
   }

   @Override
   public void a(ahk $$0) {
      zh.a($$0, this, this.e.z());
      this.e.I().a($$0.b(), $$0.e(), $$0.f());
   }

   @Override
   public void a(ahn $$0) {
      zh.a($$0, this, this.e.z());
      if ($$0.e() == ahn.a.a) {
         akm $$1 = Objects.requireNonNull($$0.f());
         af $$2 = this.c.aE().a($$1);
         if ($$2 != null) {
            this.e.Q().a($$2);
         }
      }
   }

   @Override
   public void a(agp $$0) {
      zh.a($$0, this, this.e.z());
      StringReader $$1 = new StringReader($$0.e());
      if ($$1.canRead() && $$1.peek() == '/') {
         $$1.skip();
      }

      ParseResults<ee> $$2 = this.c.aH().a().parse($$1, this.e.dg());
      this.c.aH().a().getCompletionSuggestions($$2).thenAccept($$1x -> {
         Suggestions $$2x = $$1x.getList().size() <= 1000 ? $$1x : new Suggestions($$1x.getRange(), $$1x.getList().subList(0, 1000));
         this.b(new aci($$0.b(), $$2x));
      });
   }

   @Override
   public void a(ahr $$0) {
      zh.a($$0, this, this.e.z());
      if (!this.c.q()) {
         this.e.a(wx.c("advMode.notEnabled"));
      } else if (!this.e.gz()) {
         this.e.a(wx.c("advMode.notAllowed"));
      } else {
         czy $$1 = null;
         doq $$2 = null;
         io $$3 = $$0.b();
         dog $$4 = this.e.dP().c_($$3);
         if ($$4 instanceof doq) {
            $$2 = (doq)$$4;
            $$1 = $$2.b();
         }

         String $$5 = $$0.e();
         boolean $$6 = $$0.f();
         if ($$1 != null) {
            doq.a $$7 = $$2.l();
            drb $$8 = this.e.dP().a_($$3);
            it $$9 = $$8.c(dfh.b);

            drb $$13 = (switch ($$0.i()) {
               case a -> dea.kH.n();
               case b -> dea.kG.n();
               default -> dea.fN.n();
            }).a(dfh.b, $$9).a(dfh.c, Boolean.valueOf($$0.g()));
            if ($$13 != $$8) {
               this.e.dP().a($$3, $$13, 2);
               $$4.b($$13);
               this.e.dP().m($$3).a($$4);
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
            if (!ayy.b($$5)) {
               this.e.a(wx.a("advMode.setCommand.success", $$5));
            }
         }
      }
   }

   @Override
   public void a(ahs $$0) {
      zh.a($$0, this, this.e.z());
      if (!this.c.q()) {
         this.e.a(wx.c("advMode.notEnabled"));
      } else if (!this.e.gz()) {
         this.e.a(wx.c("advMode.notAllowed"));
      } else {
         czy $$1 = $$0.a(this.e.dP());
         if ($$1 != null) {
            $$1.a($$0.b());
            $$1.a($$0.e());
            if (!$$0.e()) {
               $$1.c(null);
            }

            $$1.f();
            this.e.a(wx.a("advMode.setCommand.success", $$0.b()));
         }
      }
   }

   @Override
   public void a(ahe $$0) {
      zh.a($$0, this, this.e.z());
      this.e.gc().c($$0.b());
      this.e.d.b(new acn(-2, 0, this.e.gc().k, this.e.gc().a(this.e.gc().k)));
      this.e.d.b(new acn(-2, 0, $$0.b(), this.e.gc().a($$0.b())));
      this.e.d.b(new aep(this.e.gc().k));
   }

   @Override
   public void a(ahm $$0) {
      zh.a($$0, this, this.e.z());
      if (this.e.cc instanceof cov $$1) {
         if (!$$1.a(this.e)) {
            g.debug("Player {} interacted with invalid menu {}", this.e, $$1);
            return;
         }

         $$1.a($$0.b());
      }
   }

   @Override
   public void a(ahp $$0) {
      zh.a($$0, this, this.e.z());
      if (this.e.cc instanceof cow $$1) {
         if (!this.e.cc.a(this.e)) {
            g.debug("Player {} interacted with invalid menu {}", this.e, this.e.cc);
            return;
         }

         $$1.a($$0.b(), $$0.e());
      }
   }

   @Override
   public void a(ahv $$0) {
      zh.a($$0, this, this.e.z());
      if (this.e.gz()) {
         io $$1 = $$0.b();
         drb $$2 = this.e.dP().a_($$1);
         if (this.e.dP().c_($$1) instanceof dpv $$4) {
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
               if ($$0.e() == dpv.a.b) {
                  if ($$4.A()) {
                     this.e.a(wx.a("structure_block.save_success", $$5), false);
                  } else {
                     this.e.a(wx.a("structure_block.save_failure", $$5), false);
                  }
               } else if ($$0.e() == dpv.a.c) {
                  if (!$$4.C()) {
                     this.e.a(wx.a("structure_block.load_not_found", $$5), false);
                  } else if ($$4.a(this.e.z())) {
                     this.e.a(wx.a("structure_block.load_success", $$5), false);
                  } else {
                     this.e.a(wx.a("structure_block.load_prepare", $$5), false);
                  }
               } else if ($$0.e() == dpv.a.d) {
                  if ($$4.z()) {
                     this.e.a(wx.a("structure_block.size_success", $$5), false);
                  } else {
                     this.e.a(wx.c("structure_block.size_failure"), false);
                  }
               }
            } else {
               this.e.a(wx.a("structure_block.invalid_structure_name", $$0.g()), false);
            }

            $$4.e();
            this.e.dP().a($$1, $$2, $$2, 3);
         }
      }
   }

   @Override
   public void a(ahu $$0) {
      zh.a($$0, this, this.e.z());
      if (this.e.gz()) {
         io $$1 = $$0.b();
         drb $$2 = this.e.dP().a_($$1);
         if (this.e.dP().c_($$1) instanceof dpg $$4) {
            $$4.a($$0.e());
            $$4.b($$0.f());
            $$4.a(akl.a(lf.aM, $$0.g()));
            $$4.a($$0.h());
            $$4.a($$0.i());
            $$4.a($$0.k());
            $$4.b($$0.j());
            $$4.e();
            this.e.dP().a($$1, $$2, $$2, 3);
         }
      }
   }

   @Override
   public void a(agz $$0) {
      zh.a($$0, this, this.e.z());
      if (this.e.gz()) {
         io $$1 = $$0.b();
         if (this.e.dP().c_($$1) instanceof dpg $$3) {
            $$3.a(this.e.z(), $$0.e(), $$0.f());
         }
      }
   }

   @Override
   public void a(aho $$0) {
      zh.a($$0, this, this.e.z());
      int $$1 = $$0.b();
      if (this.e.cc instanceof cqc $$2) {
         if (!$$2.a(this.e)) {
            g.debug("Player {} interacted with invalid menu {}", this.e, $$2);
            return;
         }

         $$2.e($$1);
         $$2.h($$1);
      }
   }

   @Override
   public void a(agw $$0) {
      int $$1 = $$0.b();
      if (clv.d($$1) || $$1 == 40) {
         List<String> $$2 = Lists.newArrayList();
         Optional<String> $$3 = $$0.f();
         $$3.ifPresent($$2::add);
         $$0.e().stream().limit(100L).forEach($$2::add);
         Consumer<List<are>> $$4 = $$3.isPresent() ? $$1x -> this.a((are)$$1x.get(0), $$1x.subList(1, $$1x.size()), $$1) : $$1x -> this.a($$1x, $$1);
         this.a($$2).thenAcceptAsync($$4, this.c);
      }
   }

   private void a(List<are> $$0, int $$1) {
      cto $$2 = this.e.gc().a($$1);
      if ($$2.a(ctr.tZ)) {
         List<ard<String>> $$3 = $$0.stream().map(this::a).toList();
         $$2.b(kb.H, new cww($$3));
      }
   }

   private void a(are $$0, List<are> $$1, int $$2) {
      cto $$3 = this.e.gc().a($$2);
      if ($$3.a(ctr.tZ)) {
         cto $$4 = $$3.a(ctr.ua, 1);
         $$4.c(kb.H);
         List<ard<wx>> $$5 = $$1.stream().map($$0x -> this.a($$0x).a(wx::b)).toList();
         $$4.b(kb.I, new cwx(this.a($$0), this.e.af().getString(), 0, $$5, true));
         this.e.gc().a($$2, $$4);
      }
   }

   private ard<String> a(are $$0) {
      return this.e.Y() ? ard.a($$0.b()) : ard.a($$0);
   }

   @Override
   public void a(agx $$0) {
      zh.a($$0, this, this.e.z());
      if (this.e.m(2)) {
         bru $$1 = this.e.dP().a($$0.e());
         if ($$1 != null) {
            ud $$2 = $$1.f(new ud());
            this.e.d.b(new afp($$0.b(), $$2));
         }
      }
   }

   @Override
   public void a(agu $$0) {
      zh.a($$0, this, this.e.z());
      if (!this.e.N_() && $$0.e() == this.e.cc.j) {
         if (this.e.cc instanceof cph $$1 && $$1.m() instanceof dou $$2) {
            $$2.a($$0.b(), $$0.f());
         }
      }
   }

   @Override
   public void a(agg $$0) {
      zh.a($$0, this, this.e.z());
      if (this.e.m(2)) {
         dog $$1 = this.e.dP().c_($$0.e());
         ud $$2 = $$1 != null ? $$1.d(this.e.dR()) : null;
         this.e.d.b(new afp($$0.b(), $$2));
      }
   }

   @Override
   public void a(ahb $$0) {
      zh.a($$0, this, this.e.z());
      if (b($$0.a(0.0), $$0.b(0.0), $$0.c(0.0), $$0.a(0.0F), $$0.b(0.0F))) {
         this.b(wx.c("multiplayer.disconnect.invalid_player_movement"));
      } else {
         aqm $$1 = this.e.z();
         if (!this.e.h) {
            if (this.n == 0) {
               this.m();
            }

            if (this.E != null) {
               if (this.n - this.G > 20) {
                  this.G = this.n;
                  this.a(this.E.c, this.E.d, this.E.e, this.e.dF(), this.e.dH());
               }
            } else {
               this.G = this.n;
               double $$2 = a($$0.a(this.e.du()));
               double $$3 = b($$0.b(this.e.dw()));
               double $$4 = a($$0.c(this.e.dA()));
               float $$5 = ayd.g($$0.a(this.e.dF()));
               float $$6 = ayd.g($$0.b(this.e.dH()));
               if (this.e.bR()) {
                  this.e.a(this.e.du(), this.e.dw(), this.e.dA(), $$5, $$6);
                  this.e.z().l().a(this.e);
               } else {
                  double $$7 = this.e.du();
                  double $$8 = this.e.dw();
                  double $$9 = this.e.dA();
                  double $$10 = $$2 - this.r;
                  double $$11 = $$3 - this.s;
                  double $$12 = $$4 - this.t;
                  double $$13 = this.e.ds().g();
                  double $$14 = $$10 * $$10 + $$11 * $$11 + $$12 * $$12;
                  if (this.e.fL()) {
                     if ($$14 > 1.0) {
                        this.a(this.e.du(), this.e.dw(), this.e.dA(), $$5, $$6);
                     }
                  } else {
                     boolean $$15 = this.e.fE();
                     if ($$1.s().i()) {
                        this.L++;
                        int $$16 = this.L - this.M;
                        if ($$16 > 5) {
                           g.debug("{} is sending move packets too frequently ({} packets since last tick)", this.e.af().getString(), $$16);
                           $$16 = 1;
                        }

                        if (!this.e.O() && (!this.e.dP().aa().b(dat.t) || !$$15)) {
                           float $$17 = $$15 ? 300.0F : 100.0F;
                           if ($$14 - $$13 > (double)($$17 * (float)$$16) && !this.i()) {
                              g.warn("{} moved too quickly! {},{},{}", new Object[]{this.e.af().getString(), $$10, $$11, $$12});
                              this.a(this.e.du(), this.e.dw(), this.e.dA(), this.e.dF(), this.e.dH());
                              return;
                           }
                        }
                     }

                     euf $$18 = this.e.cK();
                     $$10 = $$2 - this.u;
                     $$11 = $$3 - this.v;
                     $$12 = $$4 - this.w;
                     boolean $$19 = $$11 > 0.0;
                     if (this.e.aE() && !$$0.b() && $$19) {
                        this.e.fj();
                     }

                     boolean $$20 = this.e.S;
                     this.e.a(bst.b, new euk($$10, $$11, $$12));
                     $$10 = $$2 - this.e.du();
                     $$11 = $$3 - this.e.dw();
                     if ($$11 > -0.5 || $$11 < 0.5) {
                        $$11 = 0.0;
                     }

                     $$12 = $$4 - this.e.dA();
                     $$14 = $$10 * $$10 + $$11 * $$11 + $$12 * $$12;
                     boolean $$22 = false;
                     if (!this.e.O() && $$14 > 0.0625 && !this.e.fL() && !this.e.f.e() && this.e.f.b() != dau.d) {
                        $$22 = true;
                        g.warn("{} moved wrongly!", this.e.af().getString());
                     }

                     if (this.e.ag || this.e.fL() || (!$$22 || !$$1.a(this.e, $$18)) && !this.a($$1, $$18, $$2, $$3, $$4)) {
                        this.e.a($$2, $$3, $$4, $$5, $$6);
                        boolean $$23 = this.e.fr();
                        this.H = $$11 >= -0.03125
                           && !$$20
                           && this.e.f.b() != dau.d
                           && !this.c.ae()
                           && !this.e.gd().c
                           && !this.e.b(bre.y)
                           && !$$15
                           && !$$23
                           && this.b(this.e);
                        this.e.z().l().a(this.e);
                        this.e.a(this.e.du() - $$7, this.e.dw() - $$8, this.e.dA() - $$9, $$0.b());
                        this.e.a($$0.b(), new euk(this.e.du() - $$7, this.e.dw() - $$8, this.e.dA() - $$9));
                        if ($$19) {
                           this.e.n();
                        }

                        if ($$0.b() || this.e.bi() || this.e.q_() || this.e.N_() || $$15 || $$23) {
                           this.e.gE();
                        }

                        this.e.b(this.e.du() - $$7, this.e.dw() - $$8, this.e.dA() - $$9);
                        this.u = this.e.du();
                        this.v = this.e.dw();
                        this.w = this.e.dA();
                     } else {
                        this.a($$7, $$8, $$9, $$5, $$6);
                        this.e.a(this.e.du() - $$7, this.e.dw() - $$8, this.e.dA() - $$9, $$0.b());
                     }
                  }
               }
            }
         }
      }
   }

   private boolean a(dba $$0, euf $$1, double $$2, double $$3, double $$4) {
      euf $$5 = this.e.cK().d($$2 - this.e.du(), $$3 - this.e.dw(), $$4 - this.e.dA());
      Iterable<evd> $$6 = $$0.d(this.e, $$5.h(1.0E-5F));
      evd $$7 = eva.a($$1.h(1.0E-5F));

      for (evd $$8 : $$6) {
         if (!eva.c($$8, $$7, euo.i)) {
            return true;
         }
      }

      return false;
   }

   public void a(double $$0, double $$1, double $$2, float $$3, float $$4) {
      this.a($$0, $$1, $$2, $$3, $$4, Collections.emptySet());
   }

   public void a(double $$0, double $$1, double $$2, float $$3, float $$4, Set<btc> $$5) {
      double $$6 = $$5.contains(btc.a) ? this.e.du() : 0.0;
      double $$7 = $$5.contains(btc.b) ? this.e.dw() : 0.0;
      double $$8 = $$5.contains(btc.c) ? this.e.dA() : 0.0;
      float $$9 = $$5.contains(btc.d) ? this.e.dF() : 0.0F;
      float $$10 = $$5.contains(btc.e) ? this.e.dH() : 0.0F;
      this.E = new euk($$0, $$1, $$2);
      if (++this.F == Integer.MAX_VALUE) {
         this.F = 0;
      }

      this.G = this.n;
      this.e.gE();
      this.e.a($$0, $$1, $$2, $$3, $$4);
      this.e.d.b(new ady($$0 - $$6, $$1 - $$7, $$2 - $$8, $$3 - $$9, $$4 - $$10, $$5, this.F));
   }

   @Override
   public void a(ahh $$0) {
      zh.a($$0, this, this.e.z());
      io $$1 = $$0.b();
      this.e.G();
      ahh.a $$2 = $$0.f();
      switch ($$2) {
         case g:
            if (!this.e.N_()) {
               cto $$3 = this.e.b(bpt.b);
               this.e.a(bpt.b, this.e.b(bpt.a));
               this.e.a(bpt.a, $$3);
               this.e.fB();
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
            this.e.fA();
            return;
         case a:
         case b:
         case c:
            this.e.f.a($$1, $$2, $$0.e(), this.e.dP().al(), $$0.g());
            this.e.d.a($$0.g());
            return;
         default:
            throw new IllegalArgumentException("Invalid player action");
      }
   }

   private static boolean a(aqn $$0, cto $$1) {
      if ($$1.e()) {
         return false;
      } else {
         ctj $$2 = $$1.g();
         return ($$2 instanceof crm || $$2 instanceof cru) && !$$0.gx().a($$2);
      }
   }

   @Override
   public void a(ahz $$0) {
      zh.a($$0, this, this.e.z());
      this.e.d.a($$0.f());
      aqm $$1 = this.e.z();
      bpt $$2 = $$0.b();
      cto $$3 = this.e.b($$2);
      if ($$3.a($$1.J())) {
         eug $$4 = $$0.e();
         euk $$5 = $$4.e();
         io $$6 = $$4.a();
         if (this.e.a($$6, 1.0)) {
            euk $$7 = $$5.d(euk.b($$6));
            double $$8 = 1.0000001;
            if (Math.abs($$7.a()) < 1.0000001 && Math.abs($$7.b()) < 1.0000001 && Math.abs($$7.c()) < 1.0000001) {
               it $$9 = $$4.b();
               this.e.G();
               int $$10 = this.e.dP().al();
               if ($$6.v() < $$10) {
                  if (this.E == null && $$1.a(this.e, $$6)) {
                     bpu $$11 = this.e.f.a(this.e, $$1, $$3, $$2, $$4);
                     if ($$11.a()) {
                        am.P.a(this.e, $$4.a(), $$3.s());
                     }

                     if ($$9 == it.b && !$$11.a() && $$6.v() >= $$10 - 1 && a(this.e, $$3)) {
                        wx $$12 = wx.a("build.tooHigh", $$10 - 1).a(n.m);
                        this.e.b($$12, true);
                     } else if ($$11.b()) {
                        this.e.a($$2, true);
                     }
                  }
               } else {
                  wx $$13 = wx.a("build.tooHigh", $$10 - 1).a(n.m);
                  this.e.b($$13, true);
               }

               this.e.d.b(new abz($$1, $$6));
               this.e.d.b(new abz($$1, $$6.a($$9)));
            } else {
               g.warn("Rejecting UseItemOnPacket from {}: Location {} too far away from hit block {}.", new Object[]{this.e.gb().getName(), $$5, $$6});
            }
         }
      }
   }

   @Override
   public void a(aia $$0) {
      zh.a($$0, this, this.e.z());
      this.a($$0.e());
      aqm $$1 = this.e.z();
      bpt $$2 = $$0.b();
      cto $$3 = this.e.b($$2);
      this.e.G();
      if (!$$3.e() && $$3.a($$1.J())) {
         bpu $$4 = this.e.f.a(this.e, $$1, $$3, $$2);
         if ($$4.b()) {
            this.e.a($$2, true);
         }
      }
   }

   @Override
   public void a(ahy $$0) {
      zh.a($$0, this, this.e.z());
      if (this.e.N_()) {
         for (aqm $$1 : this.c.K()) {
            bru $$2 = $$0.a($$1);
            if ($$2 != null) {
               this.e.a($$1, $$2.du(), $$2.dw(), $$2.dA(), $$2.dF(), $$2.dH());
               return;
            }
         }
      }
   }

   @Override
   public void a(ahd $$0) {
      zh.a($$0, this, this.e.z());
      if (this.e.dd() instanceof cnt $$2) {
         $$2.a($$0.b(), $$0.e());
      }
   }

   @Override
   public void a(wx $$0) {
      g.info("{} lost connection: {}", this.e.af().getString(), $$0.getString());
      this.q();
      super.a($$0);
   }

   private void q() {
      this.R.close();
      this.c.aw();
      this.c.ah().a(wx.a("multiplayer.player.left", this.e.O_()).a(n.o), false);
      this.e.u();
      this.c.ah().c(this.e);
      this.e.X().b();
   }

   public void a(int $$0) {
      if ($$0 < 0) {
         throw new IllegalArgumentException("Expected packet sequence nr >= 0");
      } else {
         this.o = Math.max($$0, this.o);
      }
   }

   @Override
   public void a(ahq $$0) {
      zh.a($$0, this, this.e.z());
      if ($$0.b() >= 0 && $$0.b() < clv.g()) {
         if (this.e.gc().k != $$0.b() && this.e.fw() == bpt.a) {
            this.e.fB();
         }

         this.e.gc().k = $$0.b();
         this.e.G();
      } else {
         g.warn("{} tried to set an invalid carried item", this.e.af().getString());
      }
   }

   @Override
   public void a(agl $$0) {
      Optional<xe> $$1 = this.a($$0.h());
      if (!$$1.isEmpty()) {
         this.a($$0.b(), () -> {
            xn $$2;
            try {
               $$2 = this.a($$0, $$1.get());
            } catch (xr.a var6) {
               this.a(var6);
               return;
            }

            CompletableFuture<are> $$5 = this.a($$2.c());
            wx $$6 = this.c.bm().decorate(this.e, $$2.d());
            this.R.append($$5, $$2x -> {
               xn $$3 = $$2.a($$6).a($$2x.e());
               this.b($$3);
            });
         });
      }
   }

   @Override
   public void a(agj $$0) {
      this.a($$0.b(), () -> {
         this.b($$0.b());
         this.r();
      });
   }

   private void b(String $$0) {
      ParseResults<ee> $$1 = this.c($$0);
      if (this.c.aB() && xp.a($$1)) {
         g.error("Received unsigned command packet from {}, but the command requires signable arguments: {}", this.e.gb().getName(), $$0);
         this.e.a(l);
      } else {
         this.c.aH().a($$1, $$0);
      }
   }

   @Override
   public void a(agk $$0) {
      Optional<xe> $$1 = this.a($$0.h());
      if (!$$1.isEmpty()) {
         this.a($$0.b(), () -> {
            this.a($$0, $$1.get());
            this.r();
         });
      }
   }

   private void a(agk $$0, xe $$1) {
      ParseResults<ee> $$2 = this.c($$0.b());

      Map<String, xn> $$3;
      try {
         $$3 = this.a($$0, xp.b($$2), $$1);
      } catch (xr.a var6) {
         this.a(var6);
         return;
      }

      ec $$6 = new ec.a($$3);
      $$2 = ef.a($$2, $$1x -> $$1x.a($$6, this.R));
      this.c.aH().a($$2, $$0.b());
   }

   private void a(xr.a $$0) {
      g.warn("Failed to update secure chat state for {}: '{}'", this.e.gb().getName(), $$0.a().getString());
      this.e.a($$0.a().f().a(n.m));
   }

   private <S> Map<String, xn> a(agk $$0, xp<S> $$1, xe $$2) throws xr.a {
      List<el.a> $$3 = $$0.g().a();
      List<xp.a<S>> $$4 = $$1.a();
      if ($$3.isEmpty()) {
         return this.b($$4);
      } else {
         Map<String, xn> $$5 = new Object2ObjectOpenHashMap();

         for (el.a $$6 : $$3) {
            xp.a<S> $$7 = $$1.a($$6.a());
            if ($$7 == null) {
               this.O.setChainBroken();
               throw a($$0.b(), $$3, $$4);
            }

            xq $$8 = new xq($$7.c(), $$0.e(), $$0.f(), $$2);
            $$5.put($$7.a(), this.O.unpack($$6.b(), $$8));
         }

         for (xp.a<S> $$9 : $$4) {
            if (!$$5.containsKey($$9.a())) {
               throw a($$0.b(), $$3, $$4);
            }
         }

         return $$5;
      }
   }

   private <S> Map<String, xn> b(List<xp.a<S>> $$0) throws xr.a {
      Map<String, xn> $$1 = new HashMap<>();

      for (xp.a<S> $$2 : $$0) {
         xq $$3 = xq.a($$2.c());
         $$1.put($$2.a(), this.O.unpack(null, $$3));
      }

      return $$1;
   }

   private static <S> xr.a a(String $$0, List<el.a> $$1, List<xp.a<S>> $$2) {
      String $$3 = $$1.stream().map(el.a::a).collect(Collectors.joining(", "));
      String $$4 = $$2.stream().map(xp.a::a).collect(Collectors.joining(", "));
      g.error("Signed command mismatch between server and client ('{}'): got [{}] from client, but expected [{}]", new Object[]{$$0, $$3, $$4});
      return new xr.a(l);
   }

   private ParseResults<ee> c(String $$0) {
      CommandDispatcher<ee> $$1 = this.c.aH().a();
      return $$1.parse($$0, this.e.dg());
   }

   private void a(String $$0, Runnable $$1) {
      if (d($$0)) {
         this.b(wx.c("multiplayer.disconnect.illegal_characters"));
      } else if (this.e.D() == clu.c) {
         this.b(new afn(wx.c("chat.disabled.options").a(n.m), false));
      } else {
         this.e.G();
         this.c.execute($$1);
      }
   }

   private Optional<xe> a(xe.b $$0) {
      synchronized (this.P) {
         Optional<xe> $$1 = this.P.a($$0);
         if ($$1.isEmpty()) {
            g.warn("Failed to validate message acknowledgements from {}", this.e.af().getString());
            this.b(k);
         }

         return $$1;
      }
   }

   private static boolean d(String $$0) {
      for (int $$1 = 0; $$1 < $$0.length(); $$1++) {
         if (!ayy.a($$0.charAt($$1))) {
            return true;
         }
      }

      return false;
   }

   private xn a(agl $$0, xe $$1) throws xr.a {
      xq $$2 = new xq($$0.b(), $$0.e(), $$0.f(), $$1);
      return this.O.unpack($$0.g(), $$2);
   }

   private void b(xn $$0) {
      this.c.ah().a($$0, this.e, wt.a(wt.c, this.e));
      this.r();
   }

   private void r() {
      this.p += 20;
      if (this.p > 200 && !this.c.ah().f(this.e.gb())) {
         this.b(wx.c("disconnect.spam"));
      }
   }

   @Override
   public void a(agi $$0) {
      synchronized (this.P) {
         if (!this.P.a($$0.b())) {
            g.warn("Failed to validate message acknowledgements from {}", this.e.af().getString());
            this.b(k);
         }
      }
   }

   @Override
   public void a(ahx $$0) {
      zh.a($$0, this, this.e.z());
      this.e.G();
      this.e.a($$0.b());
   }

   @Override
   public void a(ahi $$0) {
      zh.a($$0, this, this.e.z());
      this.e.G();
      switch ($$0.e()) {
         case a:
            this.e.g(true);
            break;
         case b:
            this.e.g(false);
            break;
         case d:
            this.e.h(true);
            break;
         case e:
            this.e.h(false);
            break;
         case c:
            if (this.e.fL()) {
               this.e.a(false, true);
               this.E = this.e.dn();
            }
            break;
         case f:
            if (this.e.dd() instanceof bsz $$1) {
               int $$2 = $$0.f();
               if ($$1.a() && $$2 > 0) {
                  $$1.c($$2);
               }
            }
            break;
         case g:
            if (this.e.dd() instanceof bsz $$3) {
               $$3.b();
            }
            break;
         case h:
            if (this.e.dc() instanceof bsh $$4) {
               $$4.b(this.e);
            }
            break;
         case i:
            if (!this.e.gh()) {
               this.e.gj();
            }
            break;
         default:
            throw new IllegalArgumentException("Invalid client command!");
      }
   }

   public void a(xn $$0) {
      xj $$1 = $$0.l();
      if ($$1 != null) {
         this.Q.a($$0.m(), $$0.l());
         int $$2;
         synchronized (this.P) {
            this.P.a($$1);
            $$2 = this.P.a();
         }

         if ($$2 > 4096) {
            this.b(wx.c("multiplayer.disconnect.too_many_pending_chats"));
         }
      }
   }

   public void a(xn $$0, wt.a $$1) {
      this.b(new adr($$0.k().c(), $$0.k().b(), $$0.l(), $$0.m().a(this.Q), $$0.n(), $$0.o(), $$1));
      this.a($$0);
   }

   public void a(wx $$0, wt.a $$1) {
      this.b(new act($$0, $$1));
   }

   public SocketAddress n() {
      return this.d.d();
   }

   public void o() {
      this.S = true;
      this.q();
      this.b(afl.a);
      this.d.a(abf.b);
   }

   @Override
   public void a(ajh $$0) {
      this.d.a(new aje($$0.b()));
   }

   @Override
   public void a(agy $$0) {
      zh.a($$0, this, this.e.z());
      final aqm $$1 = this.e.z();
      final bru $$2 = $$0.a($$1);
      this.e.G();
      this.e.g($$0.b());
      if ($$2 != null) {
         if (!$$1.C_().a($$2.dp())) {
            return;
         }

         euf $$3 = $$2.cK();
         if (this.e.a($$3, 1.0)) {
            $$0.a(new agy.c() {
               private void a(bpt $$0, arm.a $$1x) {
                  cto $$2 = arm.this.e.b($$0);
                  if ($$2.a($$1.J())) {
                     cto $$3 = $$2.s();
                     bpu $$4 = $$1.run(arm.this.e, $$2, $$0);
                     if ($$4.a()) {
                        am.T.a(arm.this.e, $$3, $$2);
                        if ($$4.b()) {
                           arm.this.e.a($$0, true);
                        }
                     }
                  }
               }

               @Override
               public void a(bpt $$0) {
                  this.a($$0, clw::a);
               }

               @Override
               public void a(bpt $$0, euk $$1x) {
                  this.a($$0, ($$1xxx, $$2xx, $$3) -> $$2xx.a($$1xxx, $$1, $$3));
               }

               @Override
               public void a() {
                  if (!($$2 instanceof cig) && !($$2 instanceof bse) && !($$2 instanceof cmc) && $$2 != arm.this.e) {
                     cto $$0 = arm.this.e.b(bpt.a);
                     if ($$0.a($$1.J())) {
                        arm.this.e.e($$2);
                     }
                  } else {
                     arm.this.b(wx.c("multiplayer.disconnect.invalid_entity_attacked"));
                     arm.g.warn("Player {} tried to attack an invalid entity", arm.this.e.af().getString());
                  }
               }
            });
         }
      }
   }

   @Override
   public void a(ago $$0) {
      zh.a($$0, this, this.e.z());
      this.e.G();
      ago.a $$1 = $$0.b();
      switch ($$1) {
         case a:
            if (this.e.h) {
               this.e.h = false;
               this.e = this.c.ah().a(this.e, true);
               am.w.a(this.e, dax.j, dax.h);
            } else {
               if (this.e.eA() > 0.0F) {
                  return;
               }

               this.e = this.c.ah().a(this.e, false);
               if (this.c.j()) {
                  this.e.a(dau.d);
                  this.e.dP().aa().a(dat.r).a(false, this.c);
               }
            }
            break;
         case b:
            this.e.H().a(this.e);
      }
   }

   @Override
   public void a(agt $$0) {
      zh.a($$0, this, this.e.z());
      this.e.s();
   }

   @Override
   public void a(ags $$0) {
      zh.a($$0, this, this.e.z());
      this.e.G();
      if (this.e.cc.j == $$0.b()) {
         if (this.e.N_()) {
            this.e.cc.b();
         } else if (!this.e.cc.a(this.e)) {
            g.debug("Player {} interacted with invalid menu {}", this.e, this.e.cc);
         } else {
            int $$1 = $$0.e();
            if (!this.e.cc.a($$1)) {
               g.debug("Player {} clicked invalid slot index: {}, available slots: {}", new Object[]{this.e.af(), $$1, this.e.cc.i.size()});
            } else {
               boolean $$2 = $$0.j() != this.e.cc.j();
               this.e.cc.h();
               this.e.cc.a($$1, $$0.f(), $$0.i(), this.e);
               ObjectIterator var4 = Int2ObjectMaps.fastIterable($$0.h()).iterator();

               while (var4.hasNext()) {
                  Entry<cto> $$3 = (Entry<cto>)var4.next();
                  this.e.cc.b($$3.getIntKey(), (cto)$$3.getValue());
               }

               this.e.cc.a($$0.g());
               this.e.cc.i();
               if ($$2) {
                  this.e.cc.e();
               } else {
                  this.e.cc.d();
               }
            }
         }
      }
   }

   @Override
   public void a(ahf $$0) {
      zh.a($$0, this, this.e.z());
      this.e.G();
      if (!this.e.N_() && this.e.cc.j == $$0.b() && this.e.cc instanceof cqg) {
         if (!this.e.cc.a(this.e)) {
            g.debug("Player {} interacted with invalid menu {}", this.e, this.e.cc);
         } else {
            this.c.aJ().a($$0.e()).ifPresent($$1 -> ((cqg)this.e.cc).a($$0.f(), (cxw<?>)$$1, this.e));
         }
      }
   }

   @Override
   public void a(agr $$0) {
      zh.a($$0, this, this.e.z());
      this.e.G();
      if (this.e.cc.j == $$0.b() && !this.e.N_()) {
         if (!this.e.cc.a(this.e)) {
            g.debug("Player {} interacted with invalid menu {}", this.e, this.e.cc);
         } else {
            boolean $$1 = this.e.cc.b(this.e, $$0.e());
            if ($$1) {
               this.e.cc.d();
            }
         }
      }
   }

   @Override
   public void a(aht $$0) {
      zh.a($$0, this, this.e.z());
      if (this.e.f.e()) {
         boolean $$1 = $$0.b() < 0;
         cto $$2 = $$0.e();
         if (!$$2.a(this.e.dP().J())) {
            return;
         }

         cwd $$3 = $$2.a(kb.N, cwd.a);
         if ($$3.a("x") && $$3.a("y") && $$3.a("z")) {
            io $$4 = dog.b($$3.d());
            if (this.e.dP().p($$4)) {
               dog $$5 = this.e.dP().c_($$4);
               if ($$5 != null) {
                  $$5.a($$2, this.e.dP().H_());
               }
            }
         }

         boolean $$6 = $$0.b() >= 1 && $$0.b() <= 45;
         boolean $$7 = $$2.e() || $$2.n() >= 0 && $$2.I() <= $$2.j() && !$$2.e();
         if ($$6 && $$7) {
            this.e.cb.b($$0.b()).e($$2);
            this.e.cb.d();
         } else if ($$1 && $$7 && this.q < 200) {
            this.q += 20;
            this.e.a($$2, true);
         }
      }
   }

   @Override
   public void a(ahw $$0) {
      List<String> $$1 = Stream.of($$0.f()).map(n::a).collect(Collectors.toList());
      this.a($$1).thenAcceptAsync($$1x -> this.a($$0, $$1x), this.c);
   }

   private void a(ahw $$0, List<are> $$1) {
      this.e.G();
      aqm $$2 = this.e.z();
      io $$3 = $$0.b();
      if ($$2.B($$3)) {
         if (!($$2.c_($$3) instanceof dpq $$5)) {
            return;
         }

         $$5.a(this.e, $$0.e(), $$1);
      }
   }

   @Override
   public void a(ahg $$0) {
      zh.a($$0, this, this.e.z());
      this.e.gd().b = $$0.b() && this.e.gd().c;
   }

   @Override
   public void a(zw $$0) {
      zh.a($$0, this, this.e.z());
      this.e.a($$0.b());
   }

   @Override
   public void a(agh $$0) {
      zh.a($$0, this, this.e.z());
      if (this.e.m(2) || this.i()) {
         this.c.a($$0.b(), false);
      }
   }

   @Override
   public void a(aha $$0) {
      zh.a($$0, this, this.e.z());
      if (this.e.m(2) || this.i()) {
         this.c.b($$0.b());
      }
   }

   @Override
   public void a(agm $$0) {
      zh.a($$0, this, this.e.z());
      xo.a $$1 = $$0.b();
      clz.a $$2 = this.N != null ? this.N.d().b() : null;
      clz.a $$3 = $$1.b();
      if (!Objects.equals($$2, $$3)) {
         if ($$2 != null && $$3.b().isBefore($$2.b())) {
            this.b(clz.a);
         } else {
            try {
               ayp $$4 = this.c.as();
               if ($$4 == null) {
                  g.warn("Ignoring chat session from {} due to missing Services public key", this.e.gb().getName());
                  return;
               }

               this.a($$1.a(this.e.gb(), $$4));
            } catch (clz.b var6) {
               g.error("Failed to validate profile key: {}", var6.getMessage());
               this.b(var6.a());
            }
         }
      }
   }

   @Override
   public void a(agq $$0) {
      if (!this.S) {
         throw new IllegalStateException("Client acknowledged config, but none was requested");
      } else {
         this.d.a(abf.a, new ark(this.c, this.d, this.a(this.e.B())));
      }
   }

   @Override
   public void a(agn $$0) {
      zh.a($$0, this, this.e.z());
      this.f.a($$0.b());
   }

   @Override
   public void a(agv $$0) {
      zh.a($$0, this, this.e.z());
      this.c.a(this.e, $$0.b());
   }

   private void a(xo $$0) {
      this.N = $$0;
      this.O = $$0.a(this.e.cz());
      this.R.append(() -> {
         this.e.a($$0);
         this.c.ah().a(new adw(EnumSet.of(adw.a.b), List.of(this.e)));
      });
   }

   @Override
   public void a(zx $$0) {
   }

   @Override
   public aqn p() {
      return this.e;
   }

   @FunctionalInterface
   interface a {
      bpu run(aqn var1, bru var2, bpt var3);
   }
}
