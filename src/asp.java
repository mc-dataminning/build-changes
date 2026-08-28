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

public class asp extends asm implements agu, ass, wv {
   static final Logger h = LogUtils.getLogger();
   private static final int i = -1;
   private static final int j = 4096;
   private static final int k = 80;
   private static final xh l = xh.c("multiplayer.disconnect.chat_validation_failed");
   private static final xh m = xh.c("chat.disabled.invalid_command_signature").a(n.m);
   private static final int n = 1000;
   public arn f;
   public final ask g;
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
   private btz y;
   private double z;
   private double A;
   private double B;
   private double C;
   private double D;
   private double E;
   @Nullable
   private ezh F;
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
   private xy P;
   private yb.b Q;
   private final xq R = new xq(20);
   private final xu S = xu.a();
   private final ayx T;
   private boolean U;

   public asp(MinecraftServer $$0, wb $$1, arn $$2, asc $$3) {
      super($$0, $$1, $$3);
      this.g = new ask($$1.e());
      this.f = $$2;
      $$2.d = this;
      $$2.aa().a();
      this.Q = yb.b.unsigned($$2.cH(), $$0::aA);
      this.T = new ayx($$0);
   }

   @Override
   public void d() {
      if (this.p > -1) {
         this.b(new aci(this.p));
         this.p = -1;
      }

      this.l();
      this.f.L = this.f.dC();
      this.f.M = this.f.dE();
      this.f.N = this.f.dI();
      this.f.m();
      this.f.a(this.s, this.t, this.u, this.f.dN(), this.f.dP());
      this.o++;
      this.N = this.M;
      if (this.I && !this.f.fT() && !this.f.ca() && !this.f.eH()) {
         if (++this.J > this.a((btz)this.f)) {
            h.warn("{} was kicked for floating too long!", this.f.al().getString());
            this.a(xh.c("multiplayer.disconnect.flying"));
            return;
         }
      } else {
         this.I = false;
         this.J = 0;
      }

      this.y = this.f.dh();
      if (this.y != this.f && this.y.cY() == this.f) {
         this.z = this.y.dC();
         this.A = this.y.dE();
         this.B = this.y.dI();
         this.C = this.y.dC();
         this.D = this.y.dE();
         this.E = this.y.dI();
         if (this.K && this.y.cY() == this.f) {
            if (++this.L > this.a(this.y)) {
               h.warn("{} was kicked for floating a vehicle too long!", this.f.al().getString());
               this.a(xh.c("multiplayer.disconnect.flying"));
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
         this.a(xh.c("multiplayer.disconnect.idling"));
      }
   }

   private int a(btz $$0) {
      double $$1 = $$0.bf();
      if ($$1 < 1.0E-5F) {
         return Integer.MAX_VALUE;
      } else {
         double $$2 = 0.08 / $$1;
         return azj.c(80.0 * Math.max($$2, 1.0));
      }
   }

   @Override
   public void l() {
      this.s = this.f.dC();
      this.t = this.f.dE();
      this.u = this.f.dI();
      this.v = this.f.dC();
      this.w = this.f.dE();
      this.x = this.f.dI();
   }

   @Override
   public boolean c() {
      return this.e.i() && !this.U;
   }

   @Override
   public boolean a(zo<?> $$0) {
      return super.a($$0) ? true : this.U && this.e.i() && $$0 instanceof ahi;
   }

   @Override
   protected GameProfile i() {
      return this.f.gj();
   }

   private <T, R> CompletableFuture<R> a(T $$0, BiFunction<asv, T, CompletableFuture<R>> $$1) {
      return $$1.apply(this.f.aa(), $$0).thenApply($$0x -> {
         if (!this.c()) {
            h.debug("Ignoring packet due to disconnection");
            throw new CancellationException("disconnected");
         } else {
            return (R)$$0x;
         }
      });
   }

   private CompletableFuture<asf> a(String $$0) {
      return this.a($$0, asv::a);
   }

   private CompletableFuture<List<asf>> a(List<String> $$0) {
      return this.a($$0, asv::a);
   }

   @Override
   public void a(aib $$0) {
      zr.a($$0, this, this.f.B());
      this.f.a($$0.b());
   }

   private static boolean b(double $$0, double $$1, double $$2, float $$3, float $$4) {
      return Double.isNaN($$0) || Double.isNaN($$1) || Double.isNaN($$2) || !Floats.isFinite($$4) || !Floats.isFinite($$3);
   }

   private static double a(double $$0) {
      return azj.a($$0, -3.0E7, 3.0E7);
   }

   private static double b(double $$0) {
      return azj.a($$0, -2.0E7, 2.0E7);
   }

   @Override
   public void a(ahu $$0) {
      zr.a($$0, this, this.f.B());
      if (b($$0.b(), $$0.e(), $$0.f(), $$0.g(), $$0.h())) {
         this.a(xh.c("multiplayer.disconnect.invalid_vehicle_movement"));
      } else if (!this.p()) {
         btz $$1 = this.f.dh();
         if ($$1 != this.f && $$1.cY() == this.f && $$1 == this.y) {
            arm $$2 = this.f.B();
            double $$3 = $$1.dC();
            double $$4 = $$1.dE();
            double $$5 = $$1.dI();
            double $$6 = a($$0.b());
            double $$7 = b($$0.e());
            double $$8 = a($$0.f());
            float $$9 = azj.h($$0.g());
            float $$10 = azj.h($$0.h());
            double $$11 = $$6 - this.z;
            double $$12 = $$7 - this.A;
            double $$13 = $$8 - this.B;
            double $$14 = $$1.dA().h();
            double $$15 = $$11 * $$11 + $$12 * $$12 + $$13 * $$13;
            if ($$15 - $$14 > 100.0 && !this.h()) {
               h.warn("{} (vehicle of {}) moved too quickly! {},{},{}", new Object[]{$$1.al().getString(), this.f.al().getString(), $$11, $$12, $$13});
               this.b(new adz($$1));
               return;
            }

            boolean $$16 = $$2.a($$1, $$1.cS().h(0.0625));
            $$11 = $$6 - this.C;
            $$12 = $$7 - this.D - 1.0E-6;
            $$13 = $$8 - this.E;
            boolean $$17 = $$1.S;
            if ($$1 instanceof buv $$18 && $$18.q_()) {
               $$18.n();
            }

            $$1.a(buz.b, new ezh($$11, $$12, $$13));
            $$11 = $$6 - $$1.dC();
            $$12 = $$7 - $$1.dE();
            if ($$12 > -0.5 || $$12 < 0.5) {
               $$12 = 0.0;
            }

            $$13 = $$8 - $$1.dI();
            $$15 = $$11 * $$11 + $$12 * $$12 + $$13 * $$13;
            boolean $$20 = false;
            if ($$15 > 0.0625) {
               $$20 = true;
               h.warn("{} (vehicle of {}) moved wrongly! {}", new Object[]{$$1.al().getString(), this.f.al().getString(), Math.sqrt($$15)});
            }

            $$1.a($$6, $$7, $$8, $$9, $$10);
            boolean $$21 = $$2.a($$1, $$1.cS().h(0.0625));
            if ($$16 && ($$20 || !$$21)) {
               $$1.a($$3, $$4, $$5, $$9, $$10);
               this.b(new adz($$1));
               return;
            }

            this.f.B().l().a(this.f);
            ezh $$22 = new ezh($$1.dC() - $$3, $$1.dE() - $$4, $$1.dI() - $$5);
            this.a($$22);
            this.f.b($$22.d, $$22.e, $$22.f);
            this.K = $$12 >= -0.03125 && !$$17 && !this.d.ad() && !$$1.bd() && this.b($$1);
            this.C = $$1.dC();
            this.D = $$1.dE();
            this.E = $$1.dI();
         }
      }
   }

   private boolean b(btz $$0) {
      return $$0.dX().a($$0.cS().g(0.0625).b(0.0, -0.55, 0.0)).allMatch(dvc.a::l);
   }

   @Override
   public void a(agw $$0) {
      zr.a($$0, this, this.f.B());
      if ($$0.b() == this.G) {
         if (this.F == null) {
            this.a(xh.c("multiplayer.disconnect.invalid_player_movement"));
            return;
         }

         this.f.a(this.F.d, this.F.e, this.F.f, this.f.dN(), this.f.dP());
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
   public void a(aid $$0) {
      zr.a($$0, this, this.f.B());
      this.d.aI().a($$0.b()).ifPresent(this.f.K()::e);
   }

   @Override
   public void a(aig $$0) {
      this.f.ca.a($$0.b(), $$0.e());
   }

   @Override
   public void a(aic $$0) {
      zr.a($$0, this, this.f.B());
      this.f.K().a($$0.b(), $$0.e(), $$0.f());
   }

   @Override
   public void a(aif $$0) {
      zr.a($$0, this, this.f.B());
      if ($$0.e() == aif.a.a) {
         alh $$1 = Objects.requireNonNull($$0.f());
         ag $$2 = this.d.aD().a($$1);
         if ($$2 != null) {
            this.f.T().a($$2);
         }
      }
   }

   @Override
   public void a(ahh $$0) {
      zr.a($$0, this, this.f.B());
      StringReader $$1 = new StringReader($$0.e());
      if ($$1.canRead() && $$1.peek() == '/') {
         $$1.skip();
      }

      ParseResults<ev> $$2 = this.d.aG().a().parse($$1, this.f.dp());
      this.d.aG().a().getCompletionSuggestions($$2).thenAccept($$1x -> {
         Suggestions $$2x = $$1x.getList().size() <= 1000 ? $$1x : new Suggestions($$1x.getRange(), $$1x.getList().subList(0, 1000));
         this.b(new acv($$0.b(), $$2x));
      });
   }

   @Override
   public void a(aik $$0) {
      zr.a($$0, this, this.f.B());
      if (!this.d.q()) {
         this.f.a(xh.c("advMode.notEnabled"));
      } else if (!this.f.gH()) {
         this.f.a(xh.c("advMode.notAllowed"));
      } else {
         ddv $$1 = null;
         dsq $$2 = null;
         jg $$3 = $$0.b();
         dsg $$4 = this.f.dX().c_($$3);
         if ($$4 instanceof dsq) {
            $$2 = (dsq)$$4;
            $$1 = $$2.b();
         }

         String $$5 = $$0.e();
         boolean $$6 = $$0.f();
         if ($$1 != null) {
            dsq.a $$7 = $$2.t();
            dvd $$8 = this.f.dX().a_($$3);
            jl $$9 = $$8.c(djh.b);

            dvd $$10 = switch ($$0.i()) {
               case a -> dia.kH.m();
               case b -> dia.kG.m();
               default -> dia.fN.m();
            };
            dvd $$11 = $$10.b(djh.b, $$9).b(djh.c, Boolean.valueOf($$0.g()));
            if ($$11 != $$8) {
               this.f.dX().a($$3, $$11, 2);
               $$4.c($$11);
               this.f.dX().m($$3).a($$4);
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
            if (!bag.b($$5)) {
               this.f.a(xh.a("advMode.setCommand.success", $$5));
            }
         }
      }
   }

   @Override
   public void a(ail $$0) {
      zr.a($$0, this, this.f.B());
      if (!this.d.q()) {
         this.f.a(xh.c("advMode.notEnabled"));
      } else if (!this.f.gH()) {
         this.f.a(xh.c("advMode.notAllowed"));
      } else {
         ddv $$1 = $$0.a(this.f.dX());
         if ($$1 != null) {
            $$1.a($$0.b());
            $$1.a($$0.e());
            if (!$$0.e()) {
               $$1.c(null);
            }

            $$1.f();
            this.f.a(xh.a("advMode.setCommand.success", $$0.b()));
         }
      }
   }

   @Override
   public void a(ahw $$0) {
      zr.a($$0, this, this.f.B());
      this.f.gk().c($$0.b());
      int $$1 = this.f.gk().j;
      this.f.d.b(this.f.gk().f($$1));
      this.f.d.b(this.f.gk().f($$0.b()));
      this.f.d.b(new afp($$1));
   }

   @Override
   public void a(aie $$0) {
      zr.a($$0, this, this.f.B());
      if (this.f.ca instanceof crm $$1) {
         if (!$$1.b(this.f)) {
            h.debug("Player {} interacted with invalid menu {}", this.f, $$1);
            return;
         }

         $$1.a($$0.b());
      }
   }

   @Override
   public void a(aii $$0) {
      zr.a($$0, this, this.f.B());
      if (this.f.ca instanceof cro $$1) {
         if (!this.f.ca.b(this.f)) {
            h.debug("Player {} interacted with invalid menu {}", this.f, this.f.ca);
            return;
         }

         $$1.a($$0.b(), $$0.e());
      }
   }

   @Override
   public void a(aio $$0) {
      zr.a($$0, this, this.f.B());
      if (this.f.gH()) {
         jg $$1 = $$0.b();
         dvd $$2 = this.f.dX().a_($$1);
         if (this.f.dX().c_($$1) instanceof dtx $$4) {
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
               if ($$0.e() == dtx.a.b) {
                  if ($$4.A()) {
                     this.f.a(xh.a("structure_block.save_success", $$5), false);
                  } else {
                     this.f.a(xh.a("structure_block.save_failure", $$5), false);
                  }
               } else if ($$0.e() == dtx.a.c) {
                  if (!$$4.C()) {
                     this.f.a(xh.a("structure_block.load_not_found", $$5), false);
                  } else if ($$4.a(this.f.B())) {
                     this.f.a(xh.a("structure_block.load_success", $$5), false);
                  } else {
                     this.f.a(xh.a("structure_block.load_prepare", $$5), false);
                  }
               } else if ($$0.e() == dtx.a.d) {
                  if ($$4.z()) {
                     this.f.a(xh.a("structure_block.size_success", $$5), false);
                  } else {
                     this.f.a(xh.c("structure_block.size_failure"), false);
                  }
               }
            } else {
               this.f.a(xh.a("structure_block.invalid_structure_name", $$0.g()), false);
            }

            $$4.e();
            this.f.dX().a($$1, $$2, $$2, 3);
         }
      }
   }

   @Override
   public void a(ain $$0) {
      zr.a($$0, this, this.f.B());
      if (this.f.gH()) {
         jg $$1 = $$0.b();
         dvd $$2 = this.f.dX().a_($$1);
         if (this.f.dX().c_($$1) instanceof dti $$4) {
            $$4.a($$0.e());
            $$4.b($$0.f());
            $$4.a(alg.a(ly.aV, $$0.g()));
            $$4.a($$0.h());
            $$4.a($$0.i());
            $$4.a($$0.k());
            $$4.b($$0.j());
            $$4.e();
            this.f.dX().a($$1, $$2, $$2, 3);
         }
      }
   }

   @Override
   public void a(ahr $$0) {
      zr.a($$0, this, this.f.B());
      if (this.f.gH()) {
         jg $$1 = $$0.b();
         if (this.f.dX().c_($$1) instanceof dti $$3) {
            $$3.a(this.f.B(), $$0.e(), $$0.f());
         }
      }
   }

   @Override
   public void a(aih $$0) {
      zr.a($$0, this, this.f.B());
      int $$1 = $$0.b();
      if (this.f.ca instanceof csu $$2) {
         if (!$$2.b(this.f)) {
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
      if (cog.d($$1) || $$1 == 40) {
         List<String> $$2 = Lists.newArrayList();
         Optional<String> $$3 = $$0.f();
         $$3.ifPresent($$2::add);
         $$2.addAll($$0.e());
         Consumer<List<asf>> $$4 = $$3.isPresent() ? $$1x -> this.a((asf)$$1x.get(0), $$1x.subList(1, $$1x.size()), $$1) : $$1x -> this.a($$1x, $$1);
         this.a($$2).thenAcceptAsync($$4, this.d);
      }
   }

   private void a(List<asf> $$0, int $$1) {
      cvx $$2 = this.f.gk().a($$1);
      if ($$2.a(cwb.ua)) {
         List<ase<String>> $$3 = $$0.stream().map(this::a).toList();
         $$2.b(kt.R, new czc($$3));
      }
   }

   private void a(asf $$0, List<asf> $$1, int $$2) {
      cvx $$3 = this.f.gk().a($$2);
      if ($$3.a(cwb.ua)) {
         cvx $$4 = $$3.a((deu)cwb.ub);
         $$4.c(kt.R);
         List<ase<xh>> $$5 = $$1.stream().map($$0x -> this.a($$0x).a(xh::b)).toList();
         $$4.b(kt.S, new czd(this.a($$0), this.f.al().getString(), 0, $$5, true));
         this.f.gk().a($$2, $$4);
      }
   }

   private ase<String> a(asf $$0) {
      return this.f.ab() ? ase.a($$0.b()) : ase.a($$0);
   }

   @Override
   public void a(ahp $$0) {
      zr.a($$0, this, this.f.B());
      if (this.f.l(2)) {
         btz $$1 = this.f.dX().a($$0.e());
         if ($$1 != null) {
            uj $$2 = $$1.f(new uj());
            this.f.d.b(new agg($$0.b(), $$2));
         }
      }
   }

   @Override
   public void a(ahm $$0) {
      zr.a($$0, this, this.f.B());
      if (!this.f.R_() && $$0.e() == this.f.ca.l) {
         if (this.f.ca instanceof crz $$1 && $$1.m() instanceof dsu $$2) {
            $$2.a($$0.b(), $$0.f());
         }
      }
   }

   @Override
   public void a(agx $$0) {
      zr.a($$0, this, this.f.B());
      if (this.f.l(2)) {
         dsg $$1 = this.f.dX().c_($$0.e());
         uj $$2 = $$1 != null ? $$1.d(this.f.dZ()) : null;
         this.f.d.b(new agg($$0.b(), $$2));
      }
   }

   @Override
   public void a(aht $$0) {
      zr.a($$0, this, this.f.B());
      if (b($$0.a(0.0), $$0.b(0.0), $$0.c(0.0), $$0.a(0.0F), $$0.b(0.0F))) {
         this.a(xh.c("multiplayer.disconnect.invalid_player_movement"));
      } else {
         arm $$1 = this.f.B();
         if (!this.f.i) {
            if (this.o == 0) {
               this.l();
            }

            if (!this.p()) {
               double $$2 = a($$0.a(this.f.dC()));
               double $$3 = b($$0.b(this.f.dE()));
               double $$4 = a($$0.c(this.f.dI()));
               float $$5 = azj.h($$0.a(this.f.dN()));
               float $$6 = azj.h($$0.b(this.f.dP()));
               if (this.f.ca()) {
                  this.f.a(this.f.dC(), this.f.dE(), this.f.dI(), $$5, $$6);
                  this.f.B().l().a(this.f);
               } else {
                  double $$7 = this.f.dC();
                  double $$8 = this.f.dE();
                  double $$9 = this.f.dI();
                  double $$10 = $$2 - this.s;
                  double $$11 = $$3 - this.t;
                  double $$12 = $$4 - this.u;
                  double $$13 = this.f.dA().h();
                  double $$14 = $$10 * $$10 + $$11 * $$11 + $$12 * $$12;
                  if (this.f.fT()) {
                     if ($$14 > 1.0) {
                        this.a(this.f.dC(), this.f.dE(), this.f.dI(), $$5, $$6);
                     }
                  } else {
                     boolean $$15 = this.f.fL();
                     if ($$1.s().i()) {
                        this.M++;
                        int $$16 = this.M - this.N;
                        if ($$16 > 5) {
                           h.debug("{} is sending move packets too frequently ({} packets since last tick)", this.f.al().getString(), $$16);
                           $$16 = 1;
                        }

                        if (!this.f.R() && (!this.f.dX().ac().b(der.t) || !$$15)) {
                           float $$17 = $$15 ? 300.0F : 100.0F;
                           if ($$14 - $$13 > (double)($$17 * (float)$$16) && !this.h()) {
                              h.warn("{} moved too quickly! {},{},{}", new Object[]{this.f.al().getString(), $$10, $$11, $$12});
                              this.a(this.f.dC(), this.f.dE(), this.f.dI(), this.f.dN(), this.f.dP());
                              return;
                           }
                        }
                     }

                     ezc $$18 = this.f.cS();
                     $$10 = $$2 - this.v;
                     $$11 = $$3 - this.w;
                     $$12 = $$4 - this.x;
                     boolean $$19 = $$11 > 0.0;
                     if (this.f.aJ() && !$$0.b() && $$19) {
                        this.f.v();
                     }

                     boolean $$20 = this.f.S;
                     this.f.a(buz.b, new ezh($$10, $$11, $$12));
                     $$10 = $$2 - this.f.dC();
                     $$11 = $$3 - this.f.dE();
                     if ($$11 > -0.5 || $$11 < 0.5) {
                        $$11 = 0.0;
                     }

                     $$12 = $$4 - this.f.dI();
                     $$14 = $$10 * $$10 + $$11 * $$11 + $$12 * $$12;
                     boolean $$22 = false;
                     if (!this.f.R() && $$14 > 0.0625 && !this.f.fT() && !this.f.f.e() && this.f.f.b() != des.d) {
                        $$22 = true;
                        h.warn("{} moved wrongly!", this.f.al().getString());
                     }

                     if (this.f.ae || this.f.fT() || (!$$22 || !$$1.a(this.f, $$18)) && !this.a($$1, $$18, $$2, $$3, $$4)) {
                        this.f.a($$2, $$3, $$4, $$5, $$6);
                        boolean $$23 = this.f.fx();
                        this.I = $$11 >= -0.03125
                           && !$$20
                           && this.f.f.b() != des.d
                           && !this.d.ad()
                           && !this.f.gl().c
                           && !this.f.b(btg.y)
                           && !$$15
                           && !$$23
                           && this.b(this.f);
                        this.f.B().l().a(this.f);
                        ezh $$24 = new ezh(this.f.dC() - $$7, this.f.dE() - $$8, this.f.dI() - $$9);
                        this.f.a($$0.b(), $$0.e(), $$24);
                        this.f.a(this.f.dC() - $$7, this.f.dE() - $$8, this.f.dI() - $$9, $$0.b());
                        this.a($$24);
                        if ($$19) {
                           this.f.n();
                        }

                        if ($$0.b() || this.f.eh() || this.f.q_() || this.f.R_() || $$15 || $$23) {
                           this.f.gN();
                        }

                        this.f.b(this.f.dC() - $$7, this.f.dE() - $$8, this.f.dI() - $$9);
                        this.v = this.f.dC();
                        this.w = this.f.dE();
                        this.x = this.f.dI();
                     } else {
                        this.a($$7, $$8, $$9, $$5, $$6);
                        this.f.a(this.f.dC() - $$7, this.f.dE() - $$8, this.f.dI() - $$9, $$0.b());
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
            this.a(this.F.d, this.F.e, this.F.f, this.f.dN(), this.f.dP());
         }

         return true;
      } else {
         this.H = this.o;
         return false;
      }
   }

   private boolean a(dey $$0, ezc $$1, double $$2, double $$3, double $$4) {
      ezc $$5 = this.f.cS().d($$2 - this.f.dC(), $$3 - this.f.dE(), $$4 - this.f.dI());
      Iterable<fab> $$6 = $$0.d(this.f, $$5.h(1.0E-5F));
      fab $$7 = ezy.a($$1.h(1.0E-5F));

      for (fab $$8 : $$6) {
         if (!ezy.c($$8, $$7, ezl.i)) {
            return true;
         }
      }

      return false;
   }

   public void a(double $$0, double $$1, double $$2, float $$3, float $$4) {
      this.a(new bvi(new ezh($$0, $$1, $$2), ezh.c, $$3, $$4), Collections.emptySet());
   }

   public void a(bvi $$0, Set<bvj> $$1) {
      this.H = this.o;
      if (++this.G == Integer.MAX_VALUE) {
         this.G = 0;
      }

      bvi $$2 = bvi.a(this.f);
      bvi $$3 = bvi.a($$2, $$0, $$1);
      this.F = $$3.a();
      this.f.h($$3.b());
      this.f.a($$3.a().d, $$3.a().e, $$3.a().f, $$3.c(), $$3.d());
      this.f.d.b(aem.a(this.G, $$0, $$1));
   }

   @Override
   public void a(ahz $$0) {
      zr.a($$0, this, this.f.B());
      jg $$1 = $$0.b();
      this.f.I();
      ahz.a $$2 = $$0.f();
      switch ($$2) {
         case g:
            if (!this.f.R_()) {
               cvx $$3 = this.f.b(brx.b);
               this.f.a(brx.b, this.f.b(brx.a));
               this.f.a(brx.a, $$3);
               this.f.fH();
            }

            return;
         case e:
            if (!this.f.R_()) {
               this.f.a(false);
            }

            return;
         case d:
            if (!this.f.R_()) {
               this.f.a(true);
            }

            return;
         case f:
            this.f.fG();
            return;
         case a:
         case b:
         case c:
            this.f.f.a($$1, $$2, $$0.e(), this.f.dX().an(), $$0.g());
            this.f.d.a($$0.g());
            return;
         default:
            throw new IllegalArgumentException("Invalid player action");
      }
   }

   private static boolean a(arn $$0, cvx $$1) {
      if ($$1.f()) {
         return false;
      } else {
         cvt $$2 = $$1.h();
         return ($$2 instanceof cuc || $$2 instanceof cui) && !$$0.gF().a($$1);
      }
   }

   @Override
   public void a(ais $$0) {
      zr.a($$0, this, this.f.B());
      this.f.d.a($$0.f());
      arm $$1 = this.f.B();
      brx $$2 = $$0.b();
      cvx $$3 = this.f.b($$2);
      if ($$3.a($$1.J())) {
         ezd $$4 = $$0.e();
         ezh $$5 = $$4.g();
         jg $$6 = $$4.b();
         if (this.f.a($$6, 1.0)) {
            ezh $$7 = $$5.d(ezh.b($$6));
            double $$8 = 1.0000001;
            if (Math.abs($$7.a()) < 1.0000001 && Math.abs($$7.b()) < 1.0000001 && Math.abs($$7.c()) < 1.0000001) {
               jl $$9 = $$4.c();
               this.f.I();
               int $$10 = this.f.dX().an();
               if ($$6.v() <= $$10) {
                  if (this.F == null && $$1.a(this.f, $$6)) {
                     bry $$11 = this.f.f.a(this.f, $$1, $$3, $$2, $$4);
                     if ($$11.a()) {
                        an.P.a(this.f, $$4.b(), $$3.v());
                     }

                     if ($$9 == jl.b && !$$11.a() && $$6.v() >= $$10 && a(this.f, $$3)) {
                        xh $$12 = xh.a("build.tooHigh", $$10).a(n.m);
                        this.f.b($$12, true);
                     } else if ($$11 instanceof bry.d $$13 && $$13.e() == bry.e.c) {
                        this.f.a($$2, true);
                     }
                  }
               } else {
                  xh $$14 = xh.a("build.tooHigh", $$10).a(n.m);
                  this.f.b($$14, true);
               }

               this.f.d.b(new acm($$1, $$6));
               this.f.d.b(new acm($$1, $$6.a($$9)));
            } else {
               h.warn("Rejecting UseItemOnPacket from {}: Location {} too far away from hit block {}.", new Object[]{this.f.gj().getName(), $$5, $$6});
            }
         }
      }
   }

   @Override
   public void a(ait $$0) {
      zr.a($$0, this, this.f.B());
      this.a($$0.e());
      arm $$1 = this.f.B();
      brx $$2 = $$0.b();
      cvx $$3 = this.f.b($$2);
      this.f.I();
      if (!$$3.f() && $$3.a($$1.J())) {
         float $$4 = azj.h($$0.f());
         float $$5 = azj.h($$0.g());
         if ($$5 != this.f.dP() || $$4 != this.f.dN()) {
            this.f.b($$4, $$5);
         }

         if (this.f.f.a(this.f, $$1, $$3, $$2) instanceof bry.d $$7 && $$7.e() == bry.e.c) {
            this.f.a($$2, true);
         }
      }
   }

   @Override
   public void a(air $$0) {
      zr.a($$0, this, this.f.B());
      if (this.f.R_()) {
         for (arm $$1 : this.d.L()) {
            btz $$2 = $$0.a($$1);
            if ($$2 != null) {
               this.f.a($$1, $$2.dC(), $$2.dE(), $$2.dI(), Set.of(), $$2.dN(), $$2.dP(), true);
               return;
            }
         }
      }
   }

   @Override
   public void a(ahv $$0) {
      zr.a($$0, this, this.f.B());
      if (this.f.dm() instanceof cqh $$2) {
         $$2.b($$0.b(), $$0.e());
      }
   }

   @Override
   public void a(wd $$0) {
      h.info("{} lost connection: {}", this.f.al().getString(), $$0.a().getString());
      this.q();
      super.a($$0);
   }

   private void q() {
      this.T.close();
      this.d.av();
      this.d.ag().a(xh.a("multiplayer.player.left", this.f.S_()).a(n.o), false);
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
   public void a(aij $$0) {
      zr.a($$0, this, this.f.B());
      if ($$0.b() >= 0 && $$0.b() < cog.g()) {
         if (this.f.gk().j != $$0.b() && this.f.fC() == brx.a) {
            this.f.fH();
         }

         this.f.gk().j = $$0.b();
         this.f.I();
      } else {
         h.warn("{} tried to set an invalid carried item", this.f.al().getString());
      }
   }

   @Override
   public void a(ahc $$0) {
      Optional<xo> $$1 = this.a($$0.h());
      if (!$$1.isEmpty()) {
         this.a($$0.b(), () -> {
            xx $$2;
            try {
               $$2 = this.a($$0, $$1.get());
            } catch (yb.a var6) {
               this.a(var6);
               return;
            }

            CompletableFuture<asf> $$5 = this.a($$2.c());
            xh $$6 = this.d.bl().decorate(this.f, $$2.d());
            this.T.append($$5, $$2x -> {
               xx $$3 = $$2.a($$6).a($$2x.e());
               this.b($$3);
            });
         });
      }
   }

   @Override
   public void a(aha $$0) {
      this.a($$0.b(), () -> {
         this.b($$0.b());
         this.r();
      });
   }

   private void b(String $$0) {
      ParseResults<ev> $$1 = this.c($$0);
      if (this.d.aA() && xz.a($$1)) {
         h.error("Received unsigned command packet from {}, but the command requires signable arguments: {}", this.f.gj().getName(), $$0);
         this.f.a(m);
      } else {
         this.d.aG().a($$1, $$0);
      }
   }

   @Override
   public void a(ahb $$0) {
      Optional<xo> $$1 = this.a($$0.h());
      if (!$$1.isEmpty()) {
         this.a($$0.b(), () -> {
            this.a($$0, $$1.get());
            this.r();
         });
      }
   }

   private void a(ahb $$0, xo $$1) {
      ParseResults<ev> $$2 = this.c($$0.b());

      Map<String, xx> $$3;
      try {
         $$3 = this.a($$0, xz.b($$2), $$1);
      } catch (yb.a var6) {
         this.a(var6);
         return;
      }

      et $$6 = new et.a($$3);
      $$2 = ew.a($$2, $$1x -> $$1x.a($$6, this.T));
      this.d.aG().a($$2, $$0.b());
   }

   private void a(yb.a $$0) {
      h.warn("Failed to update secure chat state for {}: '{}'", this.f.gj().getName(), $$0.a().getString());
      this.f.a($$0.a().f().a(n.m));
   }

   private <S> Map<String, xx> a(ahb $$0, xz<S> $$1, xo $$2) throws yb.a {
      List<fc.a> $$3 = $$0.g().a();
      List<xz.a<S>> $$4 = $$1.a();
      if ($$3.isEmpty()) {
         return this.b($$4);
      } else {
         Map<String, xx> $$5 = new Object2ObjectOpenHashMap();

         for (fc.a $$6 : $$3) {
            xz.a<S> $$7 = $$1.a($$6.a());
            if ($$7 == null) {
               this.Q.setChainBroken();
               throw a($$0.b(), $$3, $$4);
            }

            ya $$8 = new ya($$7.c(), $$0.e(), $$0.f(), $$2);
            $$5.put($$7.a(), this.Q.unpack($$6.b(), $$8));
         }

         for (xz.a<S> $$9 : $$4) {
            if (!$$5.containsKey($$9.a())) {
               throw a($$0.b(), $$3, $$4);
            }
         }

         return $$5;
      }
   }

   private <S> Map<String, xx> b(List<xz.a<S>> $$0) throws yb.a {
      Map<String, xx> $$1 = new HashMap<>();

      for (xz.a<S> $$2 : $$0) {
         ya $$3 = ya.a($$2.c());
         $$1.put($$2.a(), this.Q.unpack(null, $$3));
      }

      return $$1;
   }

   private static <S> yb.a a(String $$0, List<fc.a> $$1, List<xz.a<S>> $$2) {
      String $$3 = $$1.stream().map(fc.a::a).collect(Collectors.joining(", "));
      String $$4 = $$2.stream().map(xz.a::a).collect(Collectors.joining(", "));
      h.error("Signed command mismatch between server and client ('{}'): got [{}] from client, but expected [{}]", new Object[]{$$0, $$3, $$4});
      return new yb.a(m);
   }

   private ParseResults<ev> c(String $$0) {
      CommandDispatcher<ev> $$1 = this.d.aG().a();
      return $$1.parse($$0, this.f.dp());
   }

   private void a(String $$0, Runnable $$1) {
      if (d($$0)) {
         this.a(xh.c("multiplayer.disconnect.illegal_characters"));
      } else if (this.f.F() == coe.c) {
         this.b(new age(xh.c("chat.disabled.options").a(n.m), false));
      } else {
         this.f.I();
         this.d.execute($$1);
      }
   }

   private Optional<xo> a(xo.b $$0) {
      synchronized (this.R) {
         Optional<xo> $$1 = this.R.a($$0);
         if ($$1.isEmpty()) {
            h.warn("Failed to validate message acknowledgements from {}", this.f.al().getString());
            this.a(l);
         }

         return $$1;
      }
   }

   private static boolean d(String $$0) {
      for (int $$1 = 0; $$1 < $$0.length(); $$1++) {
         if (!bag.a($$0.charAt($$1))) {
            return true;
         }
      }

      return false;
   }

   private xx a(ahc $$0, xo $$1) throws yb.a {
      ya $$2 = new ya($$0.b(), $$0.e(), $$0.f(), $$1);
      return this.Q.unpack($$0.g(), $$2);
   }

   private void b(xx $$0) {
      this.d.ag().a($$0, this.f, xd.a(xd.e, this.f));
      this.r();
   }

   private void r() {
      this.q += 20;
      if (this.q > 200 && !this.d.ag().f(this.f.gj()) && !this.d.a(this.f.gj())) {
         this.a(xh.c("disconnect.spam"));
      }
   }

   @Override
   public void a(agz $$0) {
      synchronized (this.R) {
         if (!this.R.a($$0.b())) {
            h.warn("Failed to validate message acknowledgements from {}", this.f.al().getString());
            this.a(l);
         }
      }
   }

   @Override
   public void a(aiq $$0) {
      zr.a($$0, this, this.f.B());
      this.f.I();
      this.f.a($$0.b());
   }

   @Override
   public void a(aia $$0) {
      zr.a($$0, this, this.f.B());
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
            if (this.f.fT()) {
               this.f.a(false, true);
               this.F = this.f.dv();
            }
            break;
         case f:
            if (this.f.dm() instanceof bvf $$1) {
               int $$2 = $$0.f();
               if ($$1.a() && $$2 > 0) {
                  $$1.c($$2);
               }
            }
            break;
         case g:
            if (this.f.dm() instanceof bvf $$3) {
               $$3.b();
            }
            break;
         case h:
            if (this.f.dl() instanceof buo $$4) {
               $$4.b(this.f);
            }
            break;
         case i:
            if (!this.f.gp()) {
               this.f.gr();
            }
            break;
         default:
            throw new IllegalArgumentException("Invalid client command!");
      }
   }

   public void a(xx $$0) {
      xt $$1 = $$0.l();
      if ($$1 != null) {
         this.S.a($$0.m(), $$0.l());
         int $$2;
         synchronized (this.R) {
            this.R.a($$1);
            $$2 = this.R.a();
         }

         if ($$2 > 4096) {
            this.a(xh.c("multiplayer.disconnect.too_many_pending_chats"));
         }
      }
   }

   public void a(xx $$0, xd.a $$1) {
      this.b(new aef($$0.k().c(), $$0.k().b(), $$0.l(), $$0.m().a(this.S), $$0.n(), $$0.o(), $$1));
      this.a($$0);
   }

   public void a(xh $$0, xd.a $$1) {
      this.b(new adg($$0, $$1));
   }

   public SocketAddress m() {
      return this.e.d();
   }

   public void n() {
      this.U = true;
      this.q();
      this.b(agc.a);
      this.e.a(abs.d);
   }

   @Override
   public void a(aka $$0) {
      this.e.a(new ajx($$0.b()));
   }

   @Override
   public void a(ahq $$0) {
      zr.a($$0, this, this.f.B());
      final arm $$1 = this.f.B();
      final btz $$2 = $$0.a($$1);
      this.f.I();
      this.f.g($$0.b());
      if ($$2 != null) {
         if (!$$1.C_().a($$2.dx())) {
            return;
         }

         ezc $$3 = $$2.cS();
         if (this.f.a($$3, 3.0)) {
            $$0.a(new ahq.c() {
               private void a(brx $$0, asp.a $$1x) {
                  cvx $$2 = asp.this.f.b($$0);
                  if ($$2.a($$1.J())) {
                     cvx $$3 = $$2.v();
                     if ($$1.run(asp.this.f, $$2, $$0) instanceof bry.d $$5) {
                        cvx $$6 = $$5.c() ? $$3 : cvx.k;
                        an.T.a(asp.this.f, $$6, $$2);
                        if ($$5.e() == bry.e.c) {
                           asp.this.f.a($$0, true);
                        }
                     }
                  }
               }

               @Override
               public void a(brx $$0) {
                  this.a($$0, coh::a);
               }

               @Override
               public void a(brx $$0, ezh $$1x) {
                  this.a($$0, ($$1xxx, $$2xx, $$3) -> $$2xx.a($$1xxx, $$1, $$3));
               }

               @Override
               public void a() {
                  label23:
                  if (!($$2 instanceof ckq) && !($$2 instanceof bul) && $$2 != asp.this.f) {
                     if ($$2 instanceof cop $$0 && !$$0.cC()) {
                        break label23;
                     }

                     cvx $$1 = asp.this.f.b(brx.a);
                     if (!$$1.a($$1.J())) {
                        return;
                     }

                     asp.this.f.e($$2);
                     return;
                  }

                  asp.this.a(xh.c("multiplayer.disconnect.invalid_entity_attacked"));
                  asp.h.warn("Player {} tried to attack an invalid entity", asp.this.f.al().getString());
               }
            });
         }
      }
   }

   @Override
   public void a(ahf $$0) {
      zr.a($$0, this, this.f.B());
      this.f.I();
      ahf.a $$1 = $$0.b();
      switch ($$1) {
         case a:
            if (this.f.i) {
               this.f.i = false;
               this.f = this.d.ag().a(this.f, true, btz.c.e);
               an.w.a(this.f, dev.k, dev.i);
            } else {
               if (this.f.eG() > 0.0F) {
                  return;
               }

               this.f = this.d.ag().a(this.f, false, btz.c.a);
               if (this.d.j()) {
                  this.f.a(des.d);
                  this.f.dX().ac().a(der.r).a(false, this.d);
               }
            }
            break;
         case b:
            this.f.J().a(this.f);
      }
   }

   @Override
   public void a(ahl $$0) {
      zr.a($$0, this, this.f.B());
      this.f.t();
   }

   @Override
   public void a(ahk $$0) {
      zr.a($$0, this, this.f.B());
      this.f.I();
      if (this.f.ca.l == $$0.b()) {
         if (this.f.R_()) {
            this.f.ca.b();
         } else if (!this.f.ca.b(this.f)) {
            h.debug("Player {} interacted with invalid menu {}", this.f, this.f.ca);
         } else {
            int $$1 = $$0.e();
            if (!this.f.ca.a($$1)) {
               h.debug("Player {} clicked invalid slot index: {}, available slots: {}", new Object[]{this.f.al(), $$1, this.f.ca.k.size()});
            } else {
               boolean $$2 = $$0.j() != this.f.ca.j();
               this.f.ca.h();
               this.f.ca.a($$1, $$0.f(), $$0.i(), this.f);
               ObjectIterator var4 = Int2ObjectMaps.fastIterable($$0.h()).iterator();

               while (var4.hasNext()) {
                  Entry<cvx> $$3 = (Entry<cvx>)var4.next();
                  this.f.ca.b($$3.getIntKey(), (cvx)$$3.getValue());
               }

               this.f.ca.a($$0.g());
               this.f.ca.i();
               if ($$2) {
                  this.f.ca.e();
               } else {
                  this.f.ca.d();
               }
            }
         }
      }
   }

   @Override
   public void a(ahx $$0) {
      zr.a($$0, this, this.f.B());
      this.f.I();
      if (!this.f.R_() && this.f.ca.l == $$0.b()) {
         if (!this.f.ca.b(this.f)) {
            h.debug("Player {} interacted with invalid menu {}", this.f, this.f.ca);
         } else if (this.f.K().b($$0.e())) {
            if (this.f.ca instanceof csy $$1) {
               this.d.aI().a($$0.e()).ifPresent($$2 -> {
                  if ($$2.b().a().c()) {
                     h.debug("Player {} tried to place impossible recipe {}", this.f, $$2.a());
                  } else {
                     csy.a $$3 = $$1.a($$0.f(), this.f.f(), (dal<?>)$$2, this.f.gk());
                     if ($$3 == csy.a.b) {
                        this.f.d.b(new aed(this.f.ca.l, (dal<?>)$$2));
                     }
                  }
               });
            }
         }
      }
   }

   @Override
   public void a(ahj $$0) {
      zr.a($$0, this, this.f.B());
      this.f.I();
      if (this.f.ca.l == $$0.b() && !this.f.R_()) {
         if (!this.f.ca.b(this.f)) {
            h.debug("Player {} interacted with invalid menu {}", this.f, this.f.ca);
         } else {
            boolean $$1 = this.f.ca.a(this.f, $$0.e());
            if ($$1) {
               this.f.ca.d();
            }
         }
      }
   }

   @Override
   public void a(aim $$0) {
      zr.a($$0, this, this.f.B());
      if (this.f.f.e()) {
         boolean $$1 = $$0.b() < 0;
         cvx $$2 = $$0.e();
         if (!$$2.a(this.f.dX().J())) {
            return;
         }

         cyg $$3 = $$2.a(kt.X, cyg.a);
         if ($$3.a("x") && $$3.a("y") && $$3.a("z")) {
            jg $$4 = dsg.b($$3.d());
            if (this.f.dX().p($$4)) {
               dsg $$5 = this.f.dX().c_($$4);
               if ($$5 != null) {
                  $$5.a($$2, this.f.dX().H_());
               }
            }
         }

         boolean $$6 = $$0.b() >= 1 && $$0.b() <= 45;
         boolean $$7 = $$2.f() || $$2.L() <= $$2.k();
         if ($$6 && $$7) {
            this.f.bZ.b($$0.b()).e($$2);
            this.f.bZ.a($$0.b(), $$2);
            this.f.bZ.d();
         } else if ($$1 && $$7 && this.r < 200) {
            this.r += 20;
            this.f.a($$2, true);
         }
      }
   }

   @Override
   public void a(aip $$0) {
      List<String> $$1 = Stream.of($$0.f()).map(n::a).collect(Collectors.toList());
      this.a($$1).thenAcceptAsync($$1x -> this.a($$0, $$1x), this.d);
   }

   private void a(aip $$0, List<asf> $$1) {
      this.f.I();
      arm $$2 = this.f.B();
      jg $$3 = $$0.b();
      if ($$2.B($$3)) {
         if (!($$2.c_($$3) instanceof dts $$5)) {
            return;
         }

         $$5.a(this.f, $$0.e(), $$1);
      }
   }

   @Override
   public void a(ahy $$0) {
      zr.a($$0, this, this.f.B());
      this.f.gl().b = $$0.b() && this.f.gl().c;
   }

   @Override
   public void a(aai $$0) {
      zr.a($$0, this, this.f.B());
      this.f.a($$0.b());
   }

   @Override
   public void a(agy $$0) {
      zr.a($$0, this, this.f.B());
      if (this.f.l(2) || this.h()) {
         this.d.a($$0.b(), false);
      }
   }

   @Override
   public void a(ahs $$0) {
      zr.a($$0, this, this.f.B());
      if (this.f.l(2) || this.h()) {
         this.d.b($$0.b());
      }
   }

   @Override
   public void a(ahd $$0) {
      zr.a($$0, this, this.f.B());
      xy.a $$1 = $$0.b();
      cok.a $$2 = this.P != null ? this.P.d().b() : null;
      cok.a $$3 = $$1.b();
      if (!Objects.equals($$2, $$3)) {
         if ($$2 != null && $$3.b().isBefore($$2.b())) {
            this.a(cok.a);
         } else {
            try {
               azw $$4 = this.d.ar();
               if ($$4 == null) {
                  h.warn("Ignoring chat session from {} due to missing Services public key", this.f.gj().getName());
                  return;
               }

               this.a($$1.a(this.f.gj(), $$4));
            } catch (cok.b var6) {
               h.error("Failed to validate profile key: {}", var6.getMessage());
               this.a(var6.a());
            }
         }
      }
   }

   @Override
   public void a(ahi $$0) {
      if (!this.U) {
         throw new IllegalStateException("Client acknowledged config, but none was requested");
      } else {
         this.e.a(abs.b, new asn(this.d, this.e, this.a(this.f.D())));
      }
   }

   @Override
   public void a(ahe $$0) {
      zr.a($$0, this, this.f.B());
      this.g.a($$0.b());
   }

   @Override
   public void a(ahn $$0) {
      zr.a($$0, this, this.f.B());
      this.d.a(this.f, $$0.b());
   }

   private void a(xy $$0) {
      this.P = $$0;
      this.Q = $$0.a(this.f.cH());
      this.T.append(() -> {
         this.f.a($$0);
         this.d.ag().a(new aek(EnumSet.of(aek.a.b), List.of(this.f)));
      });
   }

   @Override
   public void a(aaj $$0) {
   }

   @Override
   public void a(ahg $$0) {
      zr.a($$0, this, this.f.B());
      if (!this.O) {
         this.f.a(ezh.c);
      }

      this.O = false;
   }

   private void a(ezh $$0) {
      this.f.a($$0);
      this.f.I();
      this.O = true;
   }

   @Override
   public arn o() {
      return this.f;
   }

   @FunctionalInterface
   interface a {
      bry run(arn var1, btz var2, brx var3);
   }
}
