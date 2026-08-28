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

public class arm extends arj implements agb, arp, wi {
   static final Logger h = LogUtils.getLogger();
   private static final int i = -1;
   private static final int j = 4096;
   private static final int k = 80;
   private static final wu l = wu.c("multiplayer.disconnect.chat_validation_failed");
   private static final wu m = wu.c("chat.disabled.invalid_command_signature").a(n.m);
   private static final int n = 1000;
   public aqn f;
   public final ari g;
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
   private bsh y;
   private double z;
   private double A;
   private double B;
   private double C;
   private double D;
   private double E;
   @Nullable
   private ewh F;
   private int G;
   private int H;
   private boolean I;
   private int J;
   private boolean K;
   private int L;
   private int M;
   private int N;
   @Nullable
   private xl O;
   private xo.b P;
   private final xd Q = new xd(20);
   private final xh R = xh.a();
   private final axu S;
   private boolean T;

   public arm(MinecraftServer $$0, vp $$1, aqn $$2, arb $$3) {
      super($$0, $$1, $$3);
      this.g = new ari($$1.e());
      this.f = $$2;
      $$2.c = this;
      $$2.Y().a();
      this.P = xo.b.unsigned($$2.cB(), $$0::aC);
      this.S = new axu($$0);
   }

   @Override
   public void d() {
      if (this.p > -1) {
         this.b(new abs(this.p));
         this.p = -1;
      }

      this.l();
      this.f.L = this.f.dw();
      this.f.M = this.f.dy();
      this.f.N = this.f.dC();
      this.f.m();
      this.f.a(this.s, this.t, this.u, this.f.dH(), this.f.dJ());
      this.o++;
      this.N = this.M;
      if (this.I && !this.f.fJ() && !this.f.bT() && !this.f.ez()) {
         if (++this.J > this.a((bsh)this.f)) {
            h.warn("{} was kicked for floating too long!", this.f.ah().getString());
            this.b(wu.c("multiplayer.disconnect.flying"));
            return;
         }
      } else {
         this.I = false;
         this.J = 0;
      }

      this.y = this.f.db();
      if (this.y != this.f && this.y.cS() == this.f) {
         this.z = this.y.dw();
         this.A = this.y.dy();
         this.B = this.y.dC();
         this.C = this.y.dw();
         this.D = this.y.dy();
         this.E = this.y.dC();
         if (this.K && this.y.cS() == this.f) {
            if (++this.L > this.a(this.y)) {
               h.warn("{} was kicked for floating a vehicle too long!", this.f.ah().getString());
               this.b(wu.c("multiplayer.disconnect.flying"));
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

      if (this.f.N() > 0L && this.d.ar() > 0 && ac.c() - this.f.N() > (long)this.d.ar() * 1000L * 60L) {
         this.b(wu.c("multiplayer.disconnect.idling"));
      }
   }

   private int a(bsh $$0) {
      double $$1 = $$0.bb();
      if ($$1 < 1.0E-5F) {
         return Integer.MAX_VALUE;
      } else {
         double $$2 = 0.08 / $$1;
         return ayg.c(80.0 * Math.max($$2, 1.0));
      }
   }

   @Override
   public void l() {
      this.s = this.f.dw();
      this.t = this.f.dy();
      this.u = this.f.dC();
      this.v = this.f.dw();
      this.w = this.f.dy();
      this.x = this.f.dC();
   }

   @Override
   public boolean c() {
      return this.e.i() && !this.T;
   }

   @Override
   public boolean a(zb<?> $$0) {
      return super.a($$0) ? true : this.T && this.e.i() && $$0 instanceof ago;
   }

   @Override
   protected GameProfile i() {
      return this.f.fZ();
   }

   private <T, R> CompletableFuture<R> a(T $$0, BiFunction<arr, T, CompletableFuture<R>> $$1) {
      return $$1.apply(this.f.Y(), $$0).thenApply($$0x -> {
         if (!this.c()) {
            h.debug("Ignoring packet due to disconnection");
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
   public void a(ahh $$0) {
      ze.a($$0, this, this.f.A());
      this.f.a($$0.b(), $$0.e(), $$0.f(), $$0.g());
   }

   private static boolean b(double $$0, double $$1, double $$2, float $$3, float $$4) {
      return Double.isNaN($$0) || Double.isNaN($$1) || Double.isNaN($$2) || !Floats.isFinite($$4) || !Floats.isFinite($$3);
   }

   private static double a(double $$0) {
      return ayg.a($$0, -3.0E7, 3.0E7);
   }

   private static double b(double $$0) {
      return ayg.a($$0, -2.0E7, 2.0E7);
   }

   @Override
   public void a(aha $$0) {
      ze.a($$0, this, this.f.A());
      if (b($$0.b(), $$0.e(), $$0.f(), $$0.g(), $$0.h())) {
         this.b(wu.c("multiplayer.disconnect.invalid_vehicle_movement"));
      } else {
         bsh $$1 = this.f.db();
         if ($$1 != this.f && $$1.cS() == this.f && $$1 == this.y) {
            aqm $$2 = this.f.A();
            double $$3 = $$1.dw();
            double $$4 = $$1.dy();
            double $$5 = $$1.dC();
            double $$6 = a($$0.b());
            double $$7 = b($$0.e());
            double $$8 = a($$0.f());
            float $$9 = ayg.g($$0.g());
            float $$10 = ayg.g($$0.h());
            double $$11 = $$6 - this.z;
            double $$12 = $$7 - this.A;
            double $$13 = $$8 - this.B;
            double $$14 = $$1.du().g();
            double $$15 = $$11 * $$11 + $$12 * $$12 + $$13 * $$13;
            if ($$15 - $$14 > 100.0 && !this.h()) {
               h.warn("{} (vehicle of {}) moved too quickly! {},{},{}", new Object[]{$$1.ah().getString(), this.f.ah().getString(), $$11, $$12, $$13});
               this.b(new adi($$1));
               return;
            }

            boolean $$16 = $$2.a($$1, $$1.cM().h(0.0625));
            $$11 = $$6 - this.C;
            $$12 = $$7 - this.D - 1.0E-6;
            $$13 = $$8 - this.E;
            boolean $$17 = $$1.S;
            if ($$1 instanceof btc $$18 && $$18.p_()) {
               $$18.n();
            }

            $$1.a(bth.b, new ewh($$11, $$12, $$13));
            $$11 = $$6 - $$1.dw();
            $$12 = $$7 - $$1.dy();
            if ($$12 > -0.5 || $$12 < 0.5) {
               $$12 = 0.0;
            }

            $$13 = $$8 - $$1.dC();
            $$15 = $$11 * $$11 + $$12 * $$12 + $$13 * $$13;
            boolean $$20 = false;
            if ($$15 > 0.0625) {
               $$20 = true;
               h.warn("{} (vehicle of {}) moved wrongly! {}", new Object[]{$$1.ah().getString(), this.f.ah().getString(), Math.sqrt($$15)});
            }

            $$1.a($$6, $$7, $$8, $$9, $$10);
            boolean $$21 = $$2.a($$1, $$1.cM().h(0.0625));
            if ($$16 && ($$20 || !$$21)) {
               $$1.a($$3, $$4, $$5, $$9, $$10);
               this.b(new adi($$1));
               return;
            }

            this.f.A().l().a(this.f);
            this.f.b(this.f.dw() - $$3, this.f.dy() - $$4, this.f.dC() - $$5);
            this.K = $$12 >= -0.03125 && !$$17 && !this.d.af() && !$$1.aZ() && this.b($$1);
            this.C = $$1.dw();
            this.D = $$1.dy();
            this.E = $$1.dC();
         }
      }
   }

   private boolean b(bsh $$0) {
      return $$0.dR().a($$0.cM().g(0.0625).b(0.0, -0.55, 0.0)).allMatch(dsk.a::i);
   }

   @Override
   public void a(agd $$0) {
      ze.a($$0, this, this.f.A());
      if ($$0.b() == this.G) {
         if (this.F == null) {
            this.b(wu.c("multiplayer.disconnect.invalid_player_movement"));
            return;
         }

         this.f.a(this.F.c, this.F.d, this.F.e, this.f.dH(), this.f.dJ());
         this.v = this.F.c;
         this.w = this.F.d;
         this.x = this.F.e;
         if (this.f.P()) {
            this.f.Q();
         }

         this.F = null;
      }
   }

   @Override
   public void a(ahj $$0) {
      ze.a($$0, this, this.f.A());
      this.d.aK().a($$0.b()).ifPresent(this.f.J()::e);
   }

   @Override
   public void a(ahi $$0) {
      ze.a($$0, this, this.f.A());
      this.f.J().a($$0.b(), $$0.e(), $$0.f());
   }

   @Override
   public void a(ahl $$0) {
      ze.a($$0, this, this.f.A());
      if ($$0.e() == ahl.a.a) {
         akk $$1 = Objects.requireNonNull($$0.f());
         af $$2 = this.d.aF().a($$1);
         if ($$2 != null) {
            this.f.R().a($$2);
         }
      }
   }

   @Override
   public void a(agn $$0) {
      ze.a($$0, this, this.f.A());
      StringReader $$1 = new StringReader($$0.e());
      if ($$1.canRead() && $$1.peek() == '/') {
         $$1.skip();
      }

      ParseResults<eq> $$2 = this.d.aI().a().parse($$1, this.f.di());
      this.d.aI().a().getCompletionSuggestions($$2).thenAccept($$1x -> {
         Suggestions $$2x = $$1x.getList().size() <= 1000 ? $$1x : new Suggestions($$1x.getRange(), $$1x.getList().subList(0, 1000));
         this.b(new acf($$0.b(), $$2x));
      });
   }

   @Override
   public void a(ahp $$0) {
      ze.a($$0, this, this.f.A());
      if (!this.d.q()) {
         this.f.a(wu.c("advMode.notEnabled"));
      } else if (!this.f.gx()) {
         this.f.a(wu.c("advMode.notAllowed"));
      } else {
         dbh $$1 = null;
         dqa $$2 = null;
         ja $$3 = $$0.b();
         dpq $$4 = this.f.dR().c_($$3);
         if ($$4 instanceof dqa) {
            $$2 = (dqa)$$4;
            $$1 = $$2.b();
         }

         String $$5 = $$0.e();
         boolean $$6 = $$0.f();
         if ($$1 != null) {
            dqa.a $$7 = $$2.l();
            dsl $$8 = this.f.dR().a_($$3);
            jf $$9 = $$8.c(dgr.b);

            dsl $$10 = switch ($$0.i()) {
               case a -> dfk.kH.o();
               case b -> dfk.kG.o();
               default -> dfk.fN.o();
            };
            dsl $$11 = $$10.a(dgr.b, $$9).a(dgr.c, Boolean.valueOf($$0.g()));
            if ($$11 != $$8) {
               this.f.dR().a($$3, $$11, 2);
               $$4.b($$11);
               this.f.dR().m($$3).a($$4);
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
            if (!azd.b($$5)) {
               this.f.a(wu.a("advMode.setCommand.success", $$5));
            }
         }
      }
   }

   @Override
   public void a(ahq $$0) {
      ze.a($$0, this, this.f.A());
      if (!this.d.q()) {
         this.f.a(wu.c("advMode.notEnabled"));
      } else if (!this.f.gx()) {
         this.f.a(wu.c("advMode.notAllowed"));
      } else {
         dbh $$1 = $$0.a(this.f.dR());
         if ($$1 != null) {
            $$1.a($$0.b());
            $$1.a($$0.e());
            if (!$$0.e()) {
               $$1.c(null);
            }

            $$1.f();
            this.f.a(wu.a("advMode.setCommand.success", $$0.b()));
         }
      }
   }

   @Override
   public void a(ahc $$0) {
      ze.a($$0, this, this.f.A());
      this.f.ga().c($$0.b());
      this.f.c.b(new ack(-2, 0, this.f.ga().k, this.f.ga().a(this.f.ga().k)));
      this.f.c.b(new ack(-2, 0, $$0.b(), this.f.ga().a($$0.b())));
      this.f.c.b(new aen(this.f.ga().k));
   }

   @Override
   public void a(ahk $$0) {
      ze.a($$0, this, this.f.A());
      if (this.f.ce instanceof cpk $$1) {
         if (!$$1.b(this.f)) {
            h.debug("Player {} interacted with invalid menu {}", this.f, $$1);
            return;
         }

         $$1.a($$0.b());
      }
   }

   @Override
   public void a(ahn $$0) {
      ze.a($$0, this, this.f.A());
      if (this.f.ce instanceof cpm $$1) {
         if (!this.f.ce.b(this.f)) {
            h.debug("Player {} interacted with invalid menu {}", this.f, this.f.ce);
            return;
         }

         $$1.a($$0.b(), $$0.e());
      }
   }

   @Override
   public void a(aht $$0) {
      ze.a($$0, this, this.f.A());
      if (this.f.gx()) {
         ja $$1 = $$0.b();
         dsl $$2 = this.f.dR().a_($$1);
         if (this.f.dR().c_($$1) instanceof drg $$4) {
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
               if ($$0.e() == drg.a.b) {
                  if ($$4.A()) {
                     this.f.a(wu.a("structure_block.save_success", $$5), false);
                  } else {
                     this.f.a(wu.a("structure_block.save_failure", $$5), false);
                  }
               } else if ($$0.e() == drg.a.c) {
                  if (!$$4.C()) {
                     this.f.a(wu.a("structure_block.load_not_found", $$5), false);
                  } else if ($$4.a(this.f.A())) {
                     this.f.a(wu.a("structure_block.load_success", $$5), false);
                  } else {
                     this.f.a(wu.a("structure_block.load_prepare", $$5), false);
                  }
               } else if ($$0.e() == drg.a.d) {
                  if ($$4.z()) {
                     this.f.a(wu.a("structure_block.size_success", $$5), false);
                  } else {
                     this.f.a(wu.c("structure_block.size_failure"), false);
                  }
               }
            } else {
               this.f.a(wu.a("structure_block.invalid_structure_name", $$0.g()), false);
            }

            $$4.e();
            this.f.dR().a($$1, $$2, $$2, 3);
         }
      }
   }

   @Override
   public void a(ahs $$0) {
      ze.a($$0, this, this.f.A());
      if (this.f.gx()) {
         ja $$1 = $$0.b();
         dsl $$2 = this.f.dR().a_($$1);
         if (this.f.dR().c_($$1) instanceof dqr $$4) {
            $$4.a($$0.e());
            $$4.b($$0.f());
            $$4.a(akj.a(lr.aT, $$0.g()));
            $$4.a($$0.h());
            $$4.a($$0.i());
            $$4.a($$0.k());
            $$4.b($$0.j());
            $$4.e();
            this.f.dR().a($$1, $$2, $$2, 3);
         }
      }
   }

   @Override
   public void a(agx $$0) {
      ze.a($$0, this, this.f.A());
      if (this.f.gx()) {
         ja $$1 = $$0.b();
         if (this.f.dR().c_($$1) instanceof dqr $$3) {
            $$3.a(this.f.A(), $$0.e(), $$0.f());
         }
      }
   }

   @Override
   public void a(ahm $$0) {
      ze.a($$0, this, this.f.A());
      int $$1 = $$0.b();
      if (this.f.ce instanceof cqs $$2) {
         if (!$$2.b(this.f)) {
            h.debug("Player {} interacted with invalid menu {}", this.f, $$2);
            return;
         }

         $$2.e($$1);
         $$2.h($$1);
      }
   }

   @Override
   public void a(agu $$0) {
      int $$1 = $$0.b();
      if (cmk.d($$1) || $$1 == 40) {
         List<String> $$2 = Lists.newArrayList();
         Optional<String> $$3 = $$0.f();
         $$3.ifPresent($$2::add);
         $$0.e().stream().limit(100L).forEach($$2::add);
         Consumer<List<are>> $$4 = $$3.isPresent() ? $$1x -> this.a((are)$$1x.get(0), $$1x.subList(1, $$1x.size()), $$1) : $$1x -> this.a($$1x, $$1);
         this.a($$2).thenAcceptAsync($$4, this.d);
      }
   }

   private void a(List<are> $$0, int $$1) {
      cud $$2 = this.f.ga().a($$1);
      if ($$2.a(cug.tZ)) {
         List<ard<String>> $$3 = $$0.stream().map(this::a).toList();
         $$2.b(kn.I, new cxk($$3));
      }
   }

   private void a(are $$0, List<are> $$1, int $$2) {
      cud $$3 = this.f.ga().a($$2);
      if ($$3.a(cug.tZ)) {
         cud $$4 = $$3.a((dcf)cug.ua);
         $$4.c(kn.I);
         List<ard<wu>> $$5 = $$1.stream().map($$0x -> this.a($$0x).a(wu::b)).toList();
         $$4.b(kn.J, new cxl(this.a($$0), this.f.ah().getString(), 0, $$5, true));
         this.f.ga().a($$2, $$4);
      }
   }

   private ard<String> a(are $$0) {
      return this.f.Z() ? ard.a($$0.b()) : ard.a($$0);
   }

   @Override
   public void a(agv $$0) {
      ze.a($$0, this, this.f.A());
      if (this.f.l(2)) {
         bsh $$1 = this.f.dR().a($$0.e());
         if ($$1 != null) {
            tx $$2 = $$1.f(new tx());
            this.f.c.b(new afn($$0.b(), $$2));
         }
      }
   }

   @Override
   public void a(ags $$0) {
      ze.a($$0, this, this.f.A());
      if (!this.f.N_() && $$0.e() == this.f.ce.j) {
         if (this.f.ce instanceof cpx $$1 && $$1.m() instanceof dqe $$2) {
            $$2.a($$0.b(), $$0.f());
         }
      }
   }

   @Override
   public void a(age $$0) {
      ze.a($$0, this, this.f.A());
      if (this.f.l(2)) {
         dpq $$1 = this.f.dR().c_($$0.e());
         tx $$2 = $$1 != null ? $$1.d(this.f.dT()) : null;
         this.f.c.b(new afn($$0.b(), $$2));
      }
   }

   @Override
   public void a(agz $$0) {
      ze.a($$0, this, this.f.A());
      if (b($$0.a(0.0), $$0.b(0.0), $$0.c(0.0), $$0.a(0.0F), $$0.b(0.0F))) {
         this.b(wu.c("multiplayer.disconnect.invalid_player_movement"));
      } else {
         aqm $$1 = this.f.A();
         if (!this.f.h) {
            if (this.o == 0) {
               this.l();
            }

            if (this.F != null) {
               if (this.o - this.H > 20) {
                  this.H = this.o;
                  this.a(this.F.c, this.F.d, this.F.e, this.f.dH(), this.f.dJ());
               }
            } else {
               this.H = this.o;
               double $$2 = a($$0.a(this.f.dw()));
               double $$3 = b($$0.b(this.f.dy()));
               double $$4 = a($$0.c(this.f.dC()));
               float $$5 = ayg.g($$0.a(this.f.dH()));
               float $$6 = ayg.g($$0.b(this.f.dJ()));
               if (this.f.bT()) {
                  this.f.a(this.f.dw(), this.f.dy(), this.f.dC(), $$5, $$6);
                  this.f.A().l().a(this.f);
               } else {
                  double $$7 = this.f.dw();
                  double $$8 = this.f.dy();
                  double $$9 = this.f.dC();
                  double $$10 = $$2 - this.s;
                  double $$11 = $$3 - this.t;
                  double $$12 = $$4 - this.u;
                  double $$13 = this.f.du().g();
                  double $$14 = $$10 * $$10 + $$11 * $$11 + $$12 * $$12;
                  if (this.f.fJ()) {
                     if ($$14 > 1.0) {
                        this.a(this.f.dw(), this.f.dy(), this.f.dC(), $$5, $$6);
                     }
                  } else {
                     boolean $$15 = this.f.fC();
                     if ($$1.s().i()) {
                        this.M++;
                        int $$16 = this.M - this.N;
                        if ($$16 > 5) {
                           h.debug("{} is sending move packets too frequently ({} packets since last tick)", this.f.ah().getString(), $$16);
                           $$16 = 1;
                        }

                        if (!this.f.P() && (!this.f.dR().ab().b(dcc.t) || !$$15)) {
                           float $$17 = $$15 ? 300.0F : 100.0F;
                           if ($$14 - $$13 > (double)($$17 * (float)$$16) && !this.h()) {
                              h.warn("{} moved too quickly! {},{},{}", new Object[]{this.f.ah().getString(), $$10, $$11, $$12});
                              this.a(this.f.dw(), this.f.dy(), this.f.dC(), this.f.dH(), this.f.dJ());
                              return;
                           }
                        }
                     }

                     ewc $$18 = this.f.cM();
                     $$10 = $$2 - this.v;
                     $$11 = $$3 - this.w;
                     $$12 = $$4 - this.x;
                     boolean $$19 = $$11 > 0.0;
                     if (this.f.aG() && !$$0.b() && $$19) {
                        this.f.fh();
                     }

                     boolean $$20 = this.f.S;
                     this.f.a(bth.b, new ewh($$10, $$11, $$12));
                     $$10 = $$2 - this.f.dw();
                     $$11 = $$3 - this.f.dy();
                     if ($$11 > -0.5 || $$11 < 0.5) {
                        $$11 = 0.0;
                     }

                     $$12 = $$4 - this.f.dC();
                     $$14 = $$10 * $$10 + $$11 * $$11 + $$12 * $$12;
                     boolean $$22 = false;
                     if (!this.f.P() && $$14 > 0.0625 && !this.f.fJ() && !this.f.e.e() && this.f.e.b() != dcd.d) {
                        $$22 = true;
                        h.warn("{} moved wrongly!", this.f.ah().getString());
                     }

                     if (this.f.ag || this.f.fJ() || (!$$22 || !$$1.a(this.f, $$18)) && !this.a($$1, $$18, $$2, $$3, $$4)) {
                        this.f.a($$2, $$3, $$4, $$5, $$6);
                        boolean $$23 = this.f.fp();
                        this.I = $$11 >= -0.03125
                           && !$$20
                           && this.f.e.b() != dcd.d
                           && !this.d.af()
                           && !this.f.gb().c
                           && !this.f.b(brr.y)
                           && !$$15
                           && !$$23
                           && this.b(this.f);
                        this.f.A().l().a(this.f);
                        this.f.a(this.f.dw() - $$7, this.f.dy() - $$8, this.f.dC() - $$9, $$0.b());
                        ewh $$24 = new ewh(this.f.dw() - $$7, this.f.dy() - $$8, this.f.dC() - $$9);
                        this.f.a($$0.b(), $$24);
                        this.f.b($$24);
                        if ($$19) {
                           this.f.n();
                        }

                        if ($$0.b() || this.f.dZ() || this.f.p_() || this.f.N_() || $$15 || $$23) {
                           this.f.gC();
                        }

                        this.f.b(this.f.dw() - $$7, this.f.dy() - $$8, this.f.dC() - $$9);
                        this.v = this.f.dw();
                        this.w = this.f.dy();
                        this.x = this.f.dC();
                     } else {
                        this.a($$7, $$8, $$9, $$5, $$6);
                        this.f.a(this.f.dw() - $$7, this.f.dy() - $$8, this.f.dC() - $$9, $$0.b());
                     }
                  }
               }
            }
         }
      }
   }

   private boolean a(dcj $$0, ewc $$1, double $$2, double $$3, double $$4) {
      ewc $$5 = this.f.cM().d($$2 - this.f.dw(), $$3 - this.f.dy(), $$4 - this.f.dC());
      Iterable<exa> $$6 = $$0.d(this.f, $$5.h(1.0E-5F));
      exa $$7 = ewx.a($$1.h(1.0E-5F));

      for (exa $$8 : $$6) {
         if (!ewx.c($$8, $$7, ewl.i)) {
            return true;
         }
      }

      return false;
   }

   public void a(double $$0, double $$1, double $$2, float $$3, float $$4) {
      this.a($$0, $$1, $$2, $$3, $$4, Collections.emptySet());
   }

   public void a(double $$0, double $$1, double $$2, float $$3, float $$4, Set<btq> $$5) {
      double $$6 = $$5.contains(btq.a) ? this.f.dw() : 0.0;
      double $$7 = $$5.contains(btq.b) ? this.f.dy() : 0.0;
      double $$8 = $$5.contains(btq.c) ? this.f.dC() : 0.0;
      float $$9 = $$5.contains(btq.d) ? this.f.dH() : 0.0F;
      float $$10 = $$5.contains(btq.e) ? this.f.dJ() : 0.0F;
      this.F = new ewh($$0, $$1, $$2);
      if (++this.G == Integer.MAX_VALUE) {
         this.G = 0;
      }

      this.H = this.o;
      this.f.gC();
      this.f.a($$0, $$1, $$2, $$3, $$4);
      this.f.c.b(new adv($$0 - $$6, $$1 - $$7, $$2 - $$8, $$3 - $$9, $$4 - $$10, $$5, this.G));
   }

   @Override
   public void a(ahf $$0) {
      ze.a($$0, this, this.f.A());
      ja $$1 = $$0.b();
      this.f.H();
      ahf.a $$2 = $$0.f();
      switch ($$2) {
         case g:
            if (!this.f.N_()) {
               cud $$3 = this.f.b(bqg.b);
               this.f.a(bqg.b, this.f.b(bqg.a));
               this.f.a(bqg.a, $$3);
               this.f.fz();
            }

            return;
         case e:
            if (!this.f.N_()) {
               this.f.b(false);
            }

            return;
         case d:
            if (!this.f.N_()) {
               this.f.b(true);
            }

            return;
         case f:
            this.f.fy();
            return;
         case a:
         case b:
         case c:
            this.f.e.a($$1, $$2, $$0.e(), this.f.dR().am(), $$0.g());
            this.f.c.a($$0.g());
            return;
         default:
            throw new IllegalArgumentException("Invalid player action");
      }
   }

   private static boolean a(aqn $$0, cud $$1) {
      if ($$1.e()) {
         return false;
      } else {
         cty $$2 = $$1.g();
         return ($$2 instanceof csc || $$2 instanceof csj) && !$$0.gv().a($$2);
      }
   }

   @Override
   public void a(ahx $$0) {
      ze.a($$0, this, this.f.A());
      this.f.c.a($$0.f());
      aqm $$1 = this.f.A();
      bqg $$2 = $$0.b();
      cud $$3 = this.f.b($$2);
      if ($$3.a($$1.J())) {
         ewd $$4 = $$0.e();
         ewh $$5 = $$4.e();
         ja $$6 = $$4.a();
         if (this.f.a($$6, 1.0)) {
            ewh $$7 = $$5.d(ewh.b($$6));
            double $$8 = 1.0000001;
            if (Math.abs($$7.a()) < 1.0000001 && Math.abs($$7.b()) < 1.0000001 && Math.abs($$7.c()) < 1.0000001) {
               jf $$9 = $$4.b();
               this.f.H();
               int $$10 = this.f.dR().am();
               if ($$6.v() < $$10) {
                  if (this.F == null && $$1.a(this.f, $$6)) {
                     bqh $$11 = this.f.e.a(this.f, $$1, $$3, $$2, $$4);
                     if ($$11.a()) {
                        am.P.a(this.f, $$4.a(), $$3.s());
                     }

                     if ($$9 == jf.b && !$$11.a() && $$6.v() >= $$10 - 1 && a(this.f, $$3)) {
                        wu $$12 = wu.a("build.tooHigh", $$10 - 1).a(n.m);
                        this.f.b($$12, true);
                     } else if ($$11.b()) {
                        this.f.a($$2, true);
                     }
                  }
               } else {
                  wu $$13 = wu.a("build.tooHigh", $$10 - 1).a(n.m);
                  this.f.b($$13, true);
               }

               this.f.c.b(new abw($$1, $$6));
               this.f.c.b(new abw($$1, $$6.a($$9)));
            } else {
               h.warn("Rejecting UseItemOnPacket from {}: Location {} too far away from hit block {}.", new Object[]{this.f.fZ().getName(), $$5, $$6});
            }
         }
      }
   }

   @Override
   public void a(ahy $$0) {
      ze.a($$0, this, this.f.A());
      this.a($$0.e());
      aqm $$1 = this.f.A();
      bqg $$2 = $$0.b();
      cud $$3 = this.f.b($$2);
      this.f.H();
      if (!$$3.e() && $$3.a($$1.J())) {
         float $$4 = ayg.g($$0.f());
         float $$5 = ayg.g($$0.g());
         if ($$5 != this.f.dJ() || $$4 != this.f.dH()) {
            this.f.b($$4, $$5);
         }

         bqh $$6 = this.f.e.a(this.f, $$1, $$3, $$2);
         if ($$6.b()) {
            this.f.a($$2, true);
         }
      }
   }

   @Override
   public void a(ahw $$0) {
      ze.a($$0, this, this.f.A());
      if (this.f.N_()) {
         for (aqm $$1 : this.d.L()) {
            bsh $$2 = $$0.a($$1);
            if ($$2 != null) {
               this.f.a($$1, $$2.dw(), $$2.dy(), $$2.dC(), $$2.dH(), $$2.dJ());
               return;
            }
         }
      }
   }

   @Override
   public void a(ahb $$0) {
      ze.a($$0, this, this.f.A());
      if (this.f.df() instanceof coi $$2) {
         $$2.a($$0.b(), $$0.e());
      }
   }

   @Override
   public void a(wu $$0) {
      h.info("{} lost connection: {}", this.f.ah().getString(), $$0.getString());
      this.p();
      super.a($$0);
   }

   private void p() {
      this.S.close();
      this.d.ax();
      this.d.ai().a(wu.a("multiplayer.player.left", this.f.O_()).a(n.o), false);
      this.f.v();
      this.d.ai().c(this.f);
      this.f.Y().b();
   }

   public void a(int $$0) {
      if ($$0 < 0) {
         throw new IllegalArgumentException("Expected packet sequence nr >= 0");
      } else {
         this.p = Math.max($$0, this.p);
      }
   }

   @Override
   public void a(aho $$0) {
      ze.a($$0, this, this.f.A());
      if ($$0.b() >= 0 && $$0.b() < cmk.g()) {
         if (this.f.ga().k != $$0.b() && this.f.fu() == bqg.a) {
            this.f.fz();
         }

         this.f.ga().k = $$0.b();
         this.f.H();
      } else {
         h.warn("{} tried to set an invalid carried item", this.f.ah().getString());
      }
   }

   @Override
   public void a(agj $$0) {
      Optional<xb> $$1 = this.a($$0.h());
      if (!$$1.isEmpty()) {
         this.a($$0.b(), () -> {
            xk $$2;
            try {
               $$2 = this.a($$0, $$1.get());
            } catch (xo.a var6) {
               this.a(var6);
               return;
            }

            CompletableFuture<are> $$5 = this.a($$2.c());
            wu $$6 = this.d.bn().decorate(this.f, $$2.d());
            this.S.append($$5, $$2x -> {
               xk $$3 = $$2.a($$6).a($$2x.e());
               this.b($$3);
            });
         });
      }
   }

   @Override
   public void a(agh $$0) {
      this.a($$0.b(), () -> {
         this.b($$0.b());
         this.q();
      });
   }

   private void b(String $$0) {
      ParseResults<eq> $$1 = this.c($$0);
      if (this.d.aC() && xm.a($$1)) {
         h.error("Received unsigned command packet from {}, but the command requires signable arguments: {}", this.f.fZ().getName(), $$0);
         this.f.a(m);
      } else {
         this.d.aI().a($$1, $$0);
      }
   }

   @Override
   public void a(agi $$0) {
      Optional<xb> $$1 = this.a($$0.h());
      if (!$$1.isEmpty()) {
         this.a($$0.b(), () -> {
            this.a($$0, $$1.get());
            this.q();
         });
      }
   }

   private void a(agi $$0, xb $$1) {
      ParseResults<eq> $$2 = this.c($$0.b());

      Map<String, xk> $$3;
      try {
         $$3 = this.a($$0, xm.b($$2), $$1);
      } catch (xo.a var6) {
         this.a(var6);
         return;
      }

      eo $$6 = new eo.a($$3);
      $$2 = er.a($$2, $$1x -> $$1x.a($$6, this.S));
      this.d.aI().a($$2, $$0.b());
   }

   private void a(xo.a $$0) {
      h.warn("Failed to update secure chat state for {}: '{}'", this.f.fZ().getName(), $$0.a().getString());
      this.f.a($$0.a().f().a(n.m));
   }

   private <S> Map<String, xk> a(agi $$0, xm<S> $$1, xb $$2) throws xo.a {
      List<ex.a> $$3 = $$0.g().a();
      List<xm.a<S>> $$4 = $$1.a();
      if ($$3.isEmpty()) {
         return this.b($$4);
      } else {
         Map<String, xk> $$5 = new Object2ObjectOpenHashMap();

         for (ex.a $$6 : $$3) {
            xm.a<S> $$7 = $$1.a($$6.a());
            if ($$7 == null) {
               this.P.setChainBroken();
               throw a($$0.b(), $$3, $$4);
            }

            xn $$8 = new xn($$7.c(), $$0.e(), $$0.f(), $$2);
            $$5.put($$7.a(), this.P.unpack($$6.b(), $$8));
         }

         for (xm.a<S> $$9 : $$4) {
            if (!$$5.containsKey($$9.a())) {
               throw a($$0.b(), $$3, $$4);
            }
         }

         return $$5;
      }
   }

   private <S> Map<String, xk> b(List<xm.a<S>> $$0) throws xo.a {
      Map<String, xk> $$1 = new HashMap<>();

      for (xm.a<S> $$2 : $$0) {
         xn $$3 = xn.a($$2.c());
         $$1.put($$2.a(), this.P.unpack(null, $$3));
      }

      return $$1;
   }

   private static <S> xo.a a(String $$0, List<ex.a> $$1, List<xm.a<S>> $$2) {
      String $$3 = $$1.stream().map(ex.a::a).collect(Collectors.joining(", "));
      String $$4 = $$2.stream().map(xm.a::a).collect(Collectors.joining(", "));
      h.error("Signed command mismatch between server and client ('{}'): got [{}] from client, but expected [{}]", new Object[]{$$0, $$3, $$4});
      return new xo.a(m);
   }

   private ParseResults<eq> c(String $$0) {
      CommandDispatcher<eq> $$1 = this.d.aI().a();
      return $$1.parse($$0, this.f.di());
   }

   private void a(String $$0, Runnable $$1) {
      if (d($$0)) {
         this.b(wu.c("multiplayer.disconnect.illegal_characters"));
      } else if (this.f.E() == cmj.c) {
         this.b(new afl(wu.c("chat.disabled.options").a(n.m), false));
      } else {
         this.f.H();
         this.d.execute($$1);
      }
   }

   private Optional<xb> a(xb.b $$0) {
      synchronized (this.Q) {
         Optional<xb> $$1 = this.Q.a($$0);
         if ($$1.isEmpty()) {
            h.warn("Failed to validate message acknowledgements from {}", this.f.ah().getString());
            this.b(l);
         }

         return $$1;
      }
   }

   private static boolean d(String $$0) {
      for (int $$1 = 0; $$1 < $$0.length(); $$1++) {
         if (!azd.a($$0.charAt($$1))) {
            return true;
         }
      }

      return false;
   }

   private xk a(agj $$0, xb $$1) throws xo.a {
      xn $$2 = new xn($$0.b(), $$0.e(), $$0.f(), $$1);
      return this.P.unpack($$0.g(), $$2);
   }

   private void b(xk $$0) {
      this.d.ai().a($$0, this.f, wq.a(wq.e, this.f));
      this.q();
   }

   private void q() {
      this.q += 20;
      if (this.q > 200 && !this.d.ai().f(this.f.fZ()) && !this.d.a(this.f.fZ())) {
         this.b(wu.c("disconnect.spam"));
      }
   }

   @Override
   public void a(agg $$0) {
      synchronized (this.Q) {
         if (!this.Q.a($$0.b())) {
            h.warn("Failed to validate message acknowledgements from {}", this.f.ah().getString());
            this.b(l);
         }
      }
   }

   @Override
   public void a(ahv $$0) {
      ze.a($$0, this, this.f.A());
      this.f.H();
      this.f.a($$0.b());
   }

   @Override
   public void a(ahg $$0) {
      ze.a($$0, this, this.f.A());
      this.f.H();
      switch ($$0.e()) {
         case a:
            this.f.h(true);
            break;
         case b:
            this.f.h(false);
            break;
         case d:
            this.f.i(true);
            break;
         case e:
            this.f.i(false);
            break;
         case c:
            if (this.f.fJ()) {
               this.f.a(false, true);
               this.F = this.f.dp();
            }
            break;
         case f:
            if (this.f.df() instanceof btn $$1) {
               int $$2 = $$0.f();
               if ($$1.a() && $$2 > 0) {
                  $$1.c($$2);
               }
            }
            break;
         case g:
            if (this.f.df() instanceof btn $$3) {
               $$3.b();
            }
            break;
         case h:
            if (this.f.de() instanceof bsv $$4) {
               $$4.b(this.f);
            }
            break;
         case i:
            if (!this.f.gf()) {
               this.f.gh();
            }
            break;
         default:
            throw new IllegalArgumentException("Invalid client command!");
      }
   }

   public void a(xk $$0) {
      xg $$1 = $$0.l();
      if ($$1 != null) {
         this.R.a($$0.m(), $$0.l());
         int $$2;
         synchronized (this.Q) {
            this.Q.a($$1);
            $$2 = this.Q.a();
         }

         if ($$2 > 4096) {
            this.b(wu.c("multiplayer.disconnect.too_many_pending_chats"));
         }
      }
   }

   public void a(xk $$0, wq.a $$1) {
      this.b(new ado($$0.k().c(), $$0.k().b(), $$0.l(), $$0.m().a(this.R), $$0.n(), $$0.o(), $$1));
      this.a($$0);
   }

   public void a(wu $$0, wq.a $$1) {
      this.b(new acq($$0, $$1));
   }

   public SocketAddress m() {
      return this.e.d();
   }

   public void n() {
      this.T = true;
      this.p();
      this.b(afj.a);
      this.e.a(abc.b);
   }

   @Override
   public void a(ajf $$0) {
      this.e.a(new ajc($$0.b()));
   }

   @Override
   public void a(agw $$0) {
      ze.a($$0, this, this.f.A());
      final aqm $$1 = this.f.A();
      final bsh $$2 = $$0.a($$1);
      this.f.H();
      this.f.h($$0.b());
      if ($$2 != null) {
         if (!$$1.C_().a($$2.dr())) {
            return;
         }

         ewc $$3 = $$2.cM();
         if (this.f.a($$3, 1.0)) {
            $$0.a(new agw.c() {
               private void a(bqg $$0, arm.a $$1x) {
                  cud $$2 = arm.this.f.b($$0);
                  if ($$2.a($$1.J())) {
                     cud $$3 = $$2.s();
                     bqh $$4 = $$1.run(arm.this.f, $$2, $$0);
                     if ($$4.a()) {
                        am.T.a(arm.this.f, $$4.c() ? $$3 : cud.l, $$2);
                        if ($$4.b()) {
                           arm.this.f.a($$0, true);
                        }
                     }
                  }
               }

               @Override
               public void a(bqg $$0) {
                  this.a($$0, cml::a);
               }

               @Override
               public void a(bqg $$0, ewh $$1x) {
                  this.a($$0, ($$1xxx, $$2xx, $$3) -> $$2xx.a($$1xxx, $$1, $$3));
               }

               @Override
               public void a() {
                  label23:
                  if (!($$2 instanceof civ) && !($$2 instanceof bss) && $$2 != arm.this.f) {
                     if ($$2 instanceof cmr $$0 && !$$0.cv()) {
                        break label23;
                     }

                     cud $$1 = arm.this.f.b(bqg.a);
                     if (!$$1.a($$1.J())) {
                        return;
                     }

                     arm.this.f.e($$2);
                     return;
                  }

                  arm.this.b(wu.c("multiplayer.disconnect.invalid_entity_attacked"));
                  arm.h.warn("Player {} tried to attack an invalid entity", arm.this.f.ah().getString());
               }
            });
         }
      }
   }

   @Override
   public void a(agm $$0) {
      ze.a($$0, this, this.f.A());
      this.f.H();
      agm.a $$1 = $$0.b();
      switch ($$1) {
         case a:
            if (this.f.h) {
               this.f.h = false;
               this.f = this.d.ai().a(this.f, true, bsh.d.e);
               am.w.a(this.f, dcg.j, dcg.h);
            } else {
               if (this.f.ey() > 0.0F) {
                  return;
               }

               this.f = this.d.ai().a(this.f, false, bsh.d.a);
               if (this.d.j()) {
                  this.f.a(dcd.d);
                  this.f.dR().ab().a(dcc.r).a(false, this.d);
               }
            }
            break;
         case b:
            this.f.I().a(this.f);
      }
   }

   @Override
   public void a(agr $$0) {
      ze.a($$0, this, this.f.A());
      this.f.t();
   }

   @Override
   public void a(agq $$0) {
      ze.a($$0, this, this.f.A());
      this.f.H();
      if (this.f.ce.j == $$0.b()) {
         if (this.f.N_()) {
            this.f.ce.b();
         } else if (!this.f.ce.b(this.f)) {
            h.debug("Player {} interacted with invalid menu {}", this.f, this.f.ce);
         } else {
            int $$1 = $$0.e();
            if (!this.f.ce.a($$1)) {
               h.debug("Player {} clicked invalid slot index: {}, available slots: {}", new Object[]{this.f.ah(), $$1, this.f.ce.i.size()});
            } else {
               boolean $$2 = $$0.j() != this.f.ce.j();
               this.f.ce.h();
               this.f.ce.a($$1, $$0.f(), $$0.i(), this.f);
               ObjectIterator var4 = Int2ObjectMaps.fastIterable($$0.h()).iterator();

               while (var4.hasNext()) {
                  Entry<cud> $$3 = (Entry<cud>)var4.next();
                  this.f.ce.b($$3.getIntKey(), (cud)$$3.getValue());
               }

               this.f.ce.a($$0.g());
               this.f.ce.i();
               if ($$2) {
                  this.f.ce.e();
               } else {
                  this.f.ce.d();
               }
            }
         }
      }
   }

   @Override
   public void a(ahd $$0) {
      ze.a($$0, this, this.f.A());
      this.f.H();
      if (!this.f.N_() && this.f.ce.j == $$0.b() && this.f.ce instanceof cqw) {
         if (!this.f.ce.b(this.f)) {
            h.debug("Player {} interacted with invalid menu {}", this.f, this.f.ce);
         } else {
            this.d.aK().a($$0.e()).ifPresent($$1 -> ((cqw)this.f.ce).a($$0.f(), (cyl<?>)$$1, this.f));
         }
      }
   }

   @Override
   public void a(agp $$0) {
      ze.a($$0, this, this.f.A());
      this.f.H();
      if (this.f.ce.j == $$0.b() && !this.f.N_()) {
         if (!this.f.ce.b(this.f)) {
            h.debug("Player {} interacted with invalid menu {}", this.f, this.f.ce);
         } else {
            boolean $$1 = this.f.ce.a(this.f, $$0.e());
            if ($$1) {
               this.f.ce.d();
            }
         }
      }
   }

   @Override
   public void a(ahr $$0) {
      ze.a($$0, this, this.f.A());
      if (this.f.e.e()) {
         boolean $$1 = $$0.b() < 0;
         cud $$2 = $$0.e();
         if (!$$2.a(this.f.dR().J())) {
            return;
         }

         cwr $$3 = $$2.a(kn.O, cwr.a);
         if ($$3.a("x") && $$3.a("y") && $$3.a("z")) {
            ja $$4 = dpq.b($$3.d());
            if (this.f.dR().p($$4)) {
               dpq $$5 = this.f.dR().c_($$4);
               if ($$5 != null) {
                  $$5.a($$2, this.f.dR().H_());
               }
            }
         }

         boolean $$6 = $$0.b() >= 1 && $$0.b() <= 45;
         boolean $$7 = $$2.e() || $$2.H() <= $$2.j();
         if ($$6 && $$7) {
            this.f.cd.b($$0.b()).e($$2);
            this.f.cd.d();
         } else if ($$1 && $$7 && this.r < 200) {
            this.r += 20;
            this.f.a($$2, true);
         }
      }
   }

   @Override
   public void a(ahu $$0) {
      List<String> $$1 = Stream.of($$0.f()).map(n::a).collect(Collectors.toList());
      this.a($$1).thenAcceptAsync($$1x -> this.a($$0, $$1x), this.d);
   }

   private void a(ahu $$0, List<are> $$1) {
      this.f.H();
      aqm $$2 = this.f.A();
      ja $$3 = $$0.b();
      if ($$2.B($$3)) {
         if (!($$2.c_($$3) instanceof drb $$5)) {
            return;
         }

         $$5.a(this.f, $$0.e(), $$1);
      }
   }

   @Override
   public void a(ahe $$0) {
      ze.a($$0, this, this.f.A());
      this.f.gb().b = $$0.b() && this.f.gb().c;
   }

   @Override
   public void a(zt $$0) {
      ze.a($$0, this, this.f.A());
      this.f.a($$0.b());
   }

   @Override
   public void a(agf $$0) {
      ze.a($$0, this, this.f.A());
      if (this.f.l(2) || this.h()) {
         this.d.a($$0.b(), false);
      }
   }

   @Override
   public void a(agy $$0) {
      ze.a($$0, this, this.f.A());
      if (this.f.l(2) || this.h()) {
         this.d.b($$0.b());
      }
   }

   @Override
   public void a(agk $$0) {
      ze.a($$0, this, this.f.A());
      xl.a $$1 = $$0.b();
      cmo.a $$2 = this.O != null ? this.O.d().b() : null;
      cmo.a $$3 = $$1.b();
      if (!Objects.equals($$2, $$3)) {
         if ($$2 != null && $$3.b().isBefore($$2.b())) {
            this.b(cmo.a);
         } else {
            try {
               ayt $$4 = this.d.at();
               if ($$4 == null) {
                  h.warn("Ignoring chat session from {} due to missing Services public key", this.f.fZ().getName());
                  return;
               }

               this.a($$1.a(this.f.fZ(), $$4));
            } catch (cmo.b var6) {
               h.error("Failed to validate profile key: {}", var6.getMessage());
               this.b(var6.a());
            }
         }
      }
   }

   @Override
   public void a(ago $$0) {
      if (!this.T) {
         throw new IllegalStateException("Client acknowledged config, but none was requested");
      } else {
         this.e.a(abc.a, new ark(this.d, this.e, this.a(this.f.C())));
      }
   }

   @Override
   public void a(agl $$0) {
      ze.a($$0, this, this.f.A());
      this.g.a($$0.b());
   }

   @Override
   public void a(agt $$0) {
      ze.a($$0, this, this.f.A());
      this.d.a(this.f, $$0.b());
   }

   private void a(xl $$0) {
      this.O = $$0;
      this.P = $$0.a(this.f.cB());
      this.S.append(() -> {
         this.f.a($$0);
         this.d.ai().a(new adt(EnumSet.of(adt.a.b), List.of(this.f)));
      });
   }

   @Override
   public void a(zu $$0) {
   }

   @Override
   public aqn o() {
      return this.f;
   }

   @FunctionalInterface
   interface a {
      bqh run(aqn var1, bsh var2, bqg var3);
   }
}
