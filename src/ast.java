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

public class ast extends asq implements agy, asw, wz {
   static final Logger h = LogUtils.getLogger();
   private static final int i = -1;
   private static final int j = 4096;
   private static final int k = 80;
   private static final xl l = xl.c("multiplayer.disconnect.chat_validation_failed");
   private static final xl m = xl.c("chat.disabled.invalid_command_signature").a(n.m);
   private static final int n = 1000;
   public arr f;
   public final aso g;
   private int o;
   private int p = -1;
   private final ban q = new ban(20, 200);
   private final ban r = new ban(20, 1480);
   private double s;
   private double t;
   private double u;
   private double v;
   private double w;
   private double x;
   @Nullable
   private bui y;
   private double z;
   private double A;
   private double B;
   private double C;
   private double D;
   private double E;
   @Nullable
   private ezr F;
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
   private yc P;
   private yf.b Q;
   private final xu R = new xu(20);
   private final xy S = xy.a();
   private final azb T;
   private boolean U;

   public ast(MinecraftServer $$0, wf $$1, arr $$2, asg $$3) {
      super($$0, $$1, $$3);
      this.g = new aso($$1.e());
      this.f = $$2;
      $$2.g = this;
      $$2.aa().a();
      this.Q = yf.b.unsigned($$2.cI(), $$0::aA);
      this.T = new azb($$0);
   }

   @Override
   public void d() {
      if (this.p > -1) {
         this.b(new acm(this.p));
         this.p = -1;
      }

      this.l();
      this.f.L = this.f.dD();
      this.f.M = this.f.dF();
      this.f.N = this.f.dJ();
      this.f.m();
      this.f.a(this.s, this.t, this.u, this.f.dO(), this.f.dQ());
      this.o++;
      this.N = this.M;
      if (this.I && !this.f.fU() && !this.f.cb() && !this.f.eI()) {
         if (++this.J > this.a((bui)this.f)) {
            h.warn("{} was kicked for floating too long!", this.f.am().getString());
            this.a(xl.c("multiplayer.disconnect.flying"));
            return;
         }
      } else {
         this.I = false;
         this.J = 0;
      }

      this.y = this.f.di();
      if (this.y != this.f && this.y.cZ() == this.f) {
         this.z = this.y.dD();
         this.A = this.y.dF();
         this.B = this.y.dJ();
         this.C = this.y.dD();
         this.D = this.y.dF();
         this.E = this.y.dJ();
         if (this.K && this.y.cZ() == this.f) {
            if (++this.L > this.a(this.y)) {
               h.warn("{} was kicked for floating a vehicle too long!", this.f.am().getString());
               this.a(xl.c("multiplayer.disconnect.flying"));
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
      if (this.f.O() > 0L && this.d.ap() > 0 && ae.c() - this.f.O() > (long)this.d.ap() * 1000L * 60L) {
         this.a(xl.c("multiplayer.disconnect.idling"));
      }
   }

   private int a(bui $$0) {
      double $$1 = $$0.bg();
      if ($$1 < 1.0E-5F) {
         return Integer.MAX_VALUE;
      } else {
         double $$2 = 0.08 / $$1;
         return azn.c(80.0 * Math.max($$2, 1.0));
      }
   }

   @Override
   public void l() {
      this.s = this.f.dD();
      this.t = this.f.dF();
      this.u = this.f.dJ();
      this.v = this.f.dD();
      this.w = this.f.dF();
      this.x = this.f.dJ();
   }

   @Override
   public boolean c() {
      return this.e.i() && !this.U;
   }

   @Override
   public boolean a(zs<?> $$0) {
      return super.a($$0) ? true : this.U && this.e.i() && $$0 instanceof ahm;
   }

   @Override
   protected GameProfile i() {
      return this.f.gk();
   }

   private <T, R> CompletableFuture<R> a(T $$0, BiFunction<asz, T, CompletableFuture<R>> $$1) {
      return $$1.apply(this.f.aa(), $$0).thenApply($$0x -> {
         if (!this.c()) {
            h.debug("Ignoring packet due to disconnection");
            throw new CancellationException("disconnected");
         } else {
            return (R)$$0x;
         }
      });
   }

   private CompletableFuture<asj> a(String $$0) {
      return this.a($$0, asz::a);
   }

   private CompletableFuture<List<asj>> a(List<String> $$0) {
      return this.a($$0, asz::a);
   }

   @Override
   public void a(aif $$0) {
      zv.a($$0, this, this.f.B());
      this.f.a($$0.b());
   }

   private static boolean b(double $$0, double $$1, double $$2, float $$3, float $$4) {
      return Double.isNaN($$0) || Double.isNaN($$1) || Double.isNaN($$2) || !Floats.isFinite($$4) || !Floats.isFinite($$3);
   }

   private static double a(double $$0) {
      return azn.a($$0, -3.0E7, 3.0E7);
   }

   private static double b(double $$0) {
      return azn.a($$0, -2.0E7, 2.0E7);
   }

   @Override
   public void a(ahy $$0) {
      zv.a($$0, this, this.f.B());
      if (b($$0.b(), $$0.e(), $$0.f(), $$0.g(), $$0.h())) {
         this.a(xl.c("multiplayer.disconnect.invalid_vehicle_movement"));
      } else if (!this.p()) {
         bui $$1 = this.f.di();
         if ($$1 != this.f && $$1.cZ() == this.f && $$1 == this.y) {
            arq $$2 = this.f.B();
            double $$3 = $$1.dD();
            double $$4 = $$1.dF();
            double $$5 = $$1.dJ();
            double $$6 = a($$0.b());
            double $$7 = b($$0.e());
            double $$8 = a($$0.f());
            float $$9 = azn.h($$0.g());
            float $$10 = azn.h($$0.h());
            double $$11 = $$6 - this.z;
            double $$12 = $$7 - this.A;
            double $$13 = $$8 - this.B;
            double $$14 = $$1.dB().h();
            double $$15 = $$11 * $$11 + $$12 * $$12 + $$13 * $$13;
            if ($$15 - $$14 > 100.0 && !this.h()) {
               h.warn("{} (vehicle of {}) moved too quickly! {},{},{}", new Object[]{$$1.am().getString(), this.f.am().getString(), $$11, $$12, $$13});
               this.b(new aed($$1));
               return;
            }

            boolean $$16 = $$2.a($$1, $$1.cT().h(0.0625));
            $$11 = $$6 - this.C;
            $$12 = $$7 - this.D - 1.0E-6;
            $$13 = $$8 - this.E;
            boolean $$17 = $$1.S;
            if ($$1 instanceof bve $$18 && $$18.q_()) {
               $$18.n();
            }

            $$1.a(bvi.b, new ezr($$11, $$12, $$13));
            $$11 = $$6 - $$1.dD();
            $$12 = $$7 - $$1.dF();
            if ($$12 > -0.5 || $$12 < 0.5) {
               $$12 = 0.0;
            }

            $$13 = $$8 - $$1.dJ();
            $$15 = $$11 * $$11 + $$12 * $$12 + $$13 * $$13;
            boolean $$20 = false;
            if ($$15 > 0.0625) {
               $$20 = true;
               h.warn("{} (vehicle of {}) moved wrongly! {}", new Object[]{$$1.am().getString(), this.f.am().getString(), Math.sqrt($$15)});
            }

            $$1.a($$6, $$7, $$8, $$9, $$10);
            boolean $$21 = $$2.a($$1, $$1.cT().h(0.0625));
            if ($$16 && ($$20 || !$$21)) {
               $$1.a($$3, $$4, $$5, $$9, $$10);
               this.b(new aed($$1));
               return;
            }

            this.f.B().l().a(this.f);
            ezr $$22 = new ezr($$1.dD() - $$3, $$1.dF() - $$4, $$1.dJ() - $$5);
            this.a($$22);
            this.f.b($$22.d, $$22.e, $$22.f);
            this.K = $$12 >= -0.03125 && !$$17 && !this.d.ad() && !$$1.be() && this.b($$1);
            this.C = $$1.dD();
            this.D = $$1.dF();
            this.E = $$1.dJ();
         }
      }
   }

   private boolean b(bui $$0) {
      return $$0.dY().a($$0.cT().g(0.0625).b(0.0, -0.55, 0.0)).allMatch(dvn.a::l);
   }

   @Override
   public void a(aha $$0) {
      zv.a($$0, this, this.f.B());
      if ($$0.b() == this.G) {
         if (this.F == null) {
            this.a(xl.c("multiplayer.disconnect.invalid_player_movement"));
            return;
         }

         this.f.a(this.F.d, this.F.e, this.F.f, this.f.dO(), this.f.dQ());
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
   public void a(aih $$0) {
      zv.a($$0, this, this.f.B());
      this.d.aI().a($$0.b()).ifPresent(this.f.K()::e);
   }

   @Override
   public void a(aik $$0) {
      this.f.cd.a($$0.b(), $$0.e());
   }

   @Override
   public void a(aig $$0) {
      zv.a($$0, this, this.f.B());
      this.f.K().a($$0.b(), $$0.e(), $$0.f());
   }

   @Override
   public void a(aij $$0) {
      zv.a($$0, this, this.f.B());
      if ($$0.e() == aij.a.a) {
         all $$1 = Objects.requireNonNull($$0.f());
         ah $$2 = this.d.aD().a($$1);
         if ($$2 != null) {
            this.f.T().a($$2);
         }
      }
   }

   @Override
   public void a(ahl $$0) {
      zv.a($$0, this, this.f.B());
      StringReader $$1 = new StringReader($$0.e());
      if ($$1.canRead() && $$1.peek() == '/') {
         $$1.skip();
      }

      ParseResults<ew> $$2 = this.d.aG().a().parse($$1, this.f.dq());
      this.d.aG().a().getCompletionSuggestions($$2).thenAccept($$1x -> {
         Suggestions $$2x = $$1x.getList().size() <= 1000 ? $$1x : new Suggestions($$1x.getRange(), $$1x.getList().subList(0, 1000));
         this.b(new acz($$0.b(), $$2x));
      });
   }

   @Override
   public void a(aio $$0) {
      zv.a($$0, this, this.f.B());
      if (!this.d.q()) {
         this.f.a(xl.c("advMode.notEnabled"));
      } else if (!this.f.gJ()) {
         this.f.a(xl.c("advMode.notAllowed"));
      } else {
         def $$1 = null;
         dtb $$2 = null;
         jh $$3 = $$0.b();
         dsr $$4 = this.f.dY().c_($$3);
         if ($$4 instanceof dtb) {
            $$2 = (dtb)$$4;
            $$1 = $$2.b();
         }

         String $$5 = $$0.e();
         boolean $$6 = $$0.f();
         if ($$1 != null) {
            dtb.a $$7 = $$2.t();
            dvo $$8 = this.f.dY().a_($$3);
            jm $$9 = $$8.c(djs.b);

            dvo $$10 = switch ($$0.i()) {
               case a -> dil.kH.m();
               case b -> dil.kG.m();
               default -> dil.fN.m();
            };
            dvo $$11 = $$10.b(djs.b, $$9).b(djs.c, Boolean.valueOf($$0.g()));
            if ($$11 != $$8) {
               this.f.dY().a($$3, $$11, 2);
               $$4.c($$11);
               this.f.dY().m($$3).a($$4);
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
            if (!bak.b($$5)) {
               this.f.a(xl.a("advMode.setCommand.success", $$5));
            }
         }
      }
   }

   @Override
   public void a(aip $$0) {
      zv.a($$0, this, this.f.B());
      if (!this.d.q()) {
         this.f.a(xl.c("advMode.notEnabled"));
      } else if (!this.f.gJ()) {
         this.f.a(xl.c("advMode.notAllowed"));
      } else {
         def $$1 = $$0.a(this.f.dY());
         if ($$1 != null) {
            $$1.a($$0.b());
            $$1.a($$0.e());
            if (!$$0.e()) {
               $$1.c(null);
            }

            $$1.f();
            this.f.a(xl.a("advMode.setCommand.success", $$0.b()));
         }
      }
   }

   @Override
   public void a(aia $$0) {
      zv.a($$0, this, this.f.B());
      this.f.gl().c($$0.b());
      int $$1 = this.f.gl().j;
      this.f.g.b(this.f.gl().f($$1));
      this.f.g.b(this.f.gl().f($$0.b()));
      this.f.g.b(new aft($$1));
   }

   @Override
   public void a(aii $$0) {
      zv.a($$0, this, this.f.B());
      if (this.f.cd instanceof crv $$1) {
         if (!$$1.b(this.f)) {
            h.debug("Player {} interacted with invalid menu {}", this.f, $$1);
            return;
         }

         $$1.a($$0.b());
      }
   }

   @Override
   public void a(aim $$0) {
      zv.a($$0, this, this.f.B());
      if (this.f.cd instanceof crx $$1) {
         if (!this.f.cd.b(this.f)) {
            h.debug("Player {} interacted with invalid menu {}", this.f, this.f.cd);
            return;
         }

         $$1.a($$0.b(), $$0.e());
      }
   }

   @Override
   public void a(ais $$0) {
      zv.a($$0, this, this.f.B());
      if (this.f.gJ()) {
         jh $$1 = $$0.b();
         dvo $$2 = this.f.dY().a_($$1);
         if (this.f.dY().c_($$1) instanceof dui $$4) {
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
               if ($$0.e() == dui.a.b) {
                  if ($$4.A()) {
                     this.f.a(xl.a("structure_block.save_success", $$5), false);
                  } else {
                     this.f.a(xl.a("structure_block.save_failure", $$5), false);
                  }
               } else if ($$0.e() == dui.a.c) {
                  if (!$$4.C()) {
                     this.f.a(xl.a("structure_block.load_not_found", $$5), false);
                  } else if ($$4.a(this.f.B())) {
                     this.f.a(xl.a("structure_block.load_success", $$5), false);
                  } else {
                     this.f.a(xl.a("structure_block.load_prepare", $$5), false);
                  }
               } else if ($$0.e() == dui.a.d) {
                  if ($$4.z()) {
                     this.f.a(xl.a("structure_block.size_success", $$5), false);
                  } else {
                     this.f.a(xl.c("structure_block.size_failure"), false);
                  }
               }
            } else {
               this.f.a(xl.a("structure_block.invalid_structure_name", $$0.g()), false);
            }

            $$4.e();
            this.f.dY().a($$1, $$2, $$2, 3);
         }
      }
   }

   @Override
   public void a(air $$0) {
      zv.a($$0, this, this.f.B());
      if (this.f.gJ()) {
         jh $$1 = $$0.b();
         dvo $$2 = this.f.dY().a_($$1);
         if (this.f.dY().c_($$1) instanceof dtt $$4) {
            $$4.a($$0.e());
            $$4.b($$0.f());
            $$4.a(alk.a(ma.aV, $$0.g()));
            $$4.a($$0.h());
            $$4.a($$0.i());
            $$4.a($$0.k());
            $$4.b($$0.j());
            $$4.e();
            this.f.dY().a($$1, $$2, $$2, 3);
         }
      }
   }

   @Override
   public void a(ahv $$0) {
      zv.a($$0, this, this.f.B());
      if (this.f.gJ()) {
         jh $$1 = $$0.b();
         if (this.f.dY().c_($$1) instanceof dtt $$3) {
            $$3.a(this.f.B(), $$0.e(), $$0.f());
         }
      }
   }

   @Override
   public void a(ail $$0) {
      zv.a($$0, this, this.f.B());
      int $$1 = $$0.b();
      if (this.f.cd instanceof ctd $$2) {
         if (!$$2.b(this.f)) {
            h.debug("Player {} interacted with invalid menu {}", this.f, $$2);
            return;
         }

         $$2.e($$1);
         $$2.h($$1);
      }
   }

   @Override
   public void a(ahs $$0) {
      int $$1 = $$0.b();
      if (coq.d($$1) || $$1 == 40) {
         List<String> $$2 = Lists.newArrayList();
         Optional<String> $$3 = $$0.f();
         $$3.ifPresent($$2::add);
         $$2.addAll($$0.e());
         Consumer<List<asj>> $$4 = $$3.isPresent() ? $$1x -> this.a((asj)$$1x.get(0), $$1x.subList(1, $$1x.size()), $$1) : $$1x -> this.a($$1x, $$1);
         this.a($$2).thenAcceptAsync($$4, this.d);
      }
   }

   private void a(List<asj> $$0, int $$1) {
      cwf $$2 = this.f.gl().a($$1);
      if ($$2.b(ku.S)) {
         List<asi<String>> $$3 = $$0.stream().map(this::a).toList();
         $$2.b(ku.S, new czm($$3));
      }
   }

   private void a(asj $$0, List<asj> $$1, int $$2) {
      cwf $$3 = this.f.gl().a($$2);
      if ($$3.b(ku.S)) {
         cwf $$4 = $$3.a((dfe)cwj.ur);
         $$4.c(ku.S);
         List<asi<xl>> $$5 = $$1.stream().map($$0x -> this.a($$0x).a(xl::b)).toList();
         $$4.b(ku.T, new czn(this.a($$0), this.f.am().getString(), 0, $$5, true));
         this.f.gl().a($$2, $$4);
      }
   }

   private asi<String> a(asj $$0) {
      return this.f.ab() ? asi.a($$0.b()) : asi.a($$0);
   }

   @Override
   public void a(aht $$0) {
      zv.a($$0, this, this.f.B());
      if (this.f.l(2)) {
         bui $$1 = this.f.dY().a($$0.e());
         if ($$1 != null) {
            un $$2 = $$1.f(new un());
            this.f.g.b(new agk($$0.b(), $$2));
         }
      }
   }

   @Override
   public void a(ahq $$0) {
      zv.a($$0, this, this.f.B());
      if (!this.f.R_() && $$0.e() == this.f.cd.l) {
         if (this.f.cd instanceof csi $$1 && $$1.m() instanceof dtf $$2) {
            $$2.a($$0.b(), $$0.f());
         }
      }
   }

   @Override
   public void a(ahb $$0) {
      zv.a($$0, this, this.f.B());
      if (this.f.l(2)) {
         dsr $$1 = this.f.dY().c_($$0.e());
         un $$2 = $$1 != null ? $$1.d(this.f.ea()) : null;
         this.f.g.b(new agk($$0.b(), $$2));
      }
   }

   @Override
   public void a(ahx $$0) {
      zv.a($$0, this, this.f.B());
      if (b($$0.a(0.0), $$0.b(0.0), $$0.c(0.0), $$0.a(0.0F), $$0.b(0.0F))) {
         this.a(xl.c("multiplayer.disconnect.invalid_player_movement"));
      } else {
         arq $$1 = this.f.B();
         if (!this.f.l) {
            if (this.o == 0) {
               this.l();
            }

            if (!this.p()) {
               double $$2 = a($$0.a(this.f.dD()));
               double $$3 = b($$0.b(this.f.dF()));
               double $$4 = a($$0.c(this.f.dJ()));
               float $$5 = azn.h($$0.a(this.f.dO()));
               float $$6 = azn.h($$0.b(this.f.dQ()));
               if (this.f.cb()) {
                  this.f.a(this.f.dD(), this.f.dF(), this.f.dJ(), $$5, $$6);
                  this.f.B().l().a(this.f);
               } else {
                  double $$7 = this.f.dD();
                  double $$8 = this.f.dF();
                  double $$9 = this.f.dJ();
                  double $$10 = $$2 - this.s;
                  double $$11 = $$3 - this.t;
                  double $$12 = $$4 - this.u;
                  double $$13 = this.f.dB().h();
                  double $$14 = $$10 * $$10 + $$11 * $$11 + $$12 * $$12;
                  if (this.f.fU()) {
                     if ($$14 > 1.0) {
                        this.a(this.f.dD(), this.f.dF(), this.f.dJ(), $$5, $$6);
                     }
                  } else {
                     boolean $$15 = this.f.fM();
                     if ($$1.s().i()) {
                        this.M++;
                        int $$16 = this.M - this.N;
                        if ($$16 > 5) {
                           h.debug("{} is sending move packets too frequently ({} packets since last tick)", this.f.am().getString(), $$16);
                           $$16 = 1;
                        }

                        if (!this.f.R() && (!this.f.dY().ac().b(dfb.t) || !$$15)) {
                           float $$17 = $$15 ? 300.0F : 100.0F;
                           if ($$14 - $$13 > (double)($$17 * (float)$$16) && !this.h()) {
                              h.warn("{} moved too quickly! {},{},{}", new Object[]{this.f.am().getString(), $$10, $$11, $$12});
                              this.a(this.f.dD(), this.f.dF(), this.f.dJ(), this.f.dO(), this.f.dQ());
                              return;
                           }
                        }
                     }

                     ezm $$18 = this.f.cT();
                     $$10 = $$2 - this.v;
                     $$11 = $$3 - this.w;
                     $$12 = $$4 - this.x;
                     boolean $$19 = $$11 > 0.0;
                     if (this.f.aL() && !$$0.b() && $$19) {
                        this.f.v();
                     }

                     boolean $$20 = this.f.S;
                     this.f.a(bvi.b, new ezr($$10, $$11, $$12));
                     $$10 = $$2 - this.f.dD();
                     $$11 = $$3 - this.f.dF();
                     if ($$11 > -0.5 || $$11 < 0.5) {
                        $$11 = 0.0;
                     }

                     $$12 = $$4 - this.f.dJ();
                     $$14 = $$10 * $$10 + $$11 * $$11 + $$12 * $$12;
                     boolean $$22 = false;
                     if (!this.f.R() && $$14 > 0.0625 && !this.f.fU() && !this.f.i.e() && this.f.i.b() != dfc.d) {
                        $$22 = true;
                        h.warn("{} moved wrongly!", this.f.am().getString());
                     }

                     if (this.f.ae || this.f.fU() || (!$$22 || !$$1.a(this.f, $$18)) && !this.a($$1, $$18, $$2, $$3, $$4)) {
                        this.f.a($$2, $$3, $$4, $$5, $$6);
                        boolean $$23 = this.f.fy();
                        this.I = $$11 >= -0.03125
                           && !$$20
                           && this.f.i.b() != dfc.d
                           && !this.d.ad()
                           && !this.f.gm().c
                           && !this.f.b(btp.y)
                           && !$$15
                           && !$$23
                           && this.b(this.f);
                        this.f.B().l().a(this.f);
                        ezr $$24 = new ezr(this.f.dD() - $$7, this.f.dF() - $$8, this.f.dJ() - $$9);
                        this.f.a($$0.b(), $$0.e(), $$24);
                        this.f.a(this.f.dD() - $$7, this.f.dF() - $$8, this.f.dJ() - $$9, $$0.b());
                        this.f.b(new ezr($$7, $$8, $$9), this.f.dw());
                        this.a($$24);
                        if ($$19) {
                           this.f.n();
                        }

                        if ($$0.b() || this.f.ei() || this.f.q_() || this.f.R_() || $$15 || $$23) {
                           this.f.gP();
                        }

                        this.f.b(this.f.dD() - $$7, this.f.dF() - $$8, this.f.dJ() - $$9);
                        this.v = this.f.dD();
                        this.w = this.f.dF();
                        this.x = this.f.dJ();
                     } else {
                        this.a($$7, $$8, $$9, $$5, $$6);
                        this.f.a(this.f.dD() - $$7, this.f.dF() - $$8, this.f.dJ() - $$9, $$0.b());
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
            this.a(this.F.d, this.F.e, this.F.f, this.f.dO(), this.f.dQ());
         }

         return true;
      } else {
         this.H = this.o;
         return false;
      }
   }

   private boolean a(dfi $$0, ezm $$1, double $$2, double $$3, double $$4) {
      ezm $$5 = this.f.cT().d($$2 - this.f.dD(), $$3 - this.f.dF(), $$4 - this.f.dJ());
      Iterable<fal> $$6 = $$0.d(this.f, $$5.h(1.0E-5F));
      fal $$7 = fai.a($$1.h(1.0E-5F));

      for (fal $$8 : $$6) {
         if (!fai.c($$8, $$7, ezv.i)) {
            return true;
         }
      }

      return false;
   }

   public void a(double $$0, double $$1, double $$2, float $$3, float $$4) {
      this.a(new bvr(new ezr($$0, $$1, $$2), ezr.c, $$3, $$4), Collections.emptySet());
   }

   public void a(bvr $$0, Set<bvs> $$1) {
      this.H = this.o;
      if (++this.G == Integer.MAX_VALUE) {
         this.G = 0;
      }

      bvr $$2 = bvr.a(this.f);
      bvr $$3 = bvr.a($$2, $$0, $$1);
      this.F = $$3.a();
      this.f.h($$3.b());
      this.f.a($$3.a().d, $$3.a().e, $$3.a().f, $$3.c(), $$3.d());
      this.f.g.b(aeq.a(this.G, $$0, $$1));
   }

   @Override
   public void a(aid $$0) {
      zv.a($$0, this, this.f.B());
      jh $$1 = $$0.b();
      this.f.I();
      aid.a $$2 = $$0.f();
      switch ($$2) {
         case g:
            if (!this.f.R_()) {
               cwf $$3 = this.f.b(bsg.b);
               this.f.a(bsg.b, this.f.b(bsg.a));
               this.f.a(bsg.a, $$3);
               this.f.fI();
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
            this.f.fH();
            return;
         case a:
         case b:
         case c:
            this.f.i.a($$1, $$2, $$0.e(), this.f.dY().al(), $$0.g());
            this.f.g.a($$0.g());
            return;
         default:
            throw new IllegalArgumentException("Invalid player action");
      }
   }

   private static boolean a(arr $$0, cwf $$1) {
      if ($$1.f()) {
         return false;
      } else {
         cwb $$2 = $$1.h();
         return ($$2 instanceof cul || $$2 instanceof cur) && !$$0.gH().a($$1);
      }
   }

   @Override
   public void a(aiw $$0) {
      zv.a($$0, this, this.f.B());
      this.f.g.a($$0.f());
      arq $$1 = this.f.B();
      bsg $$2 = $$0.b();
      cwf $$3 = this.f.b($$2);
      if ($$3.a($$1.J())) {
         ezn $$4 = $$0.e();
         ezr $$5 = $$4.g();
         jh $$6 = $$4.b();
         if (this.f.a($$6, 1.0)) {
            ezr $$7 = $$5.d(ezr.b($$6));
            double $$8 = 1.0000001;
            if (Math.abs($$7.a()) < 1.0000001 && Math.abs($$7.b()) < 1.0000001 && Math.abs($$7.c()) < 1.0000001) {
               jm $$9 = $$4.c();
               this.f.I();
               int $$10 = this.f.dY().al();
               if ($$6.v() <= $$10) {
                  if (this.F == null && $$1.a(this.f, $$6)) {
                     bsh $$11 = this.f.i.a(this.f, $$1, $$3, $$2, $$4);
                     if ($$11.a()) {
                        ao.P.a(this.f, $$4.b(), $$3.v());
                     }

                     if ($$9 == jm.b && !$$11.a() && $$6.v() >= $$10 && a(this.f, $$3)) {
                        xl $$12 = xl.a("build.tooHigh", $$10).a(n.m);
                        this.f.b($$12, true);
                     } else if ($$11 instanceof bsh.d $$13 && $$13.e() == bsh.e.c) {
                        this.f.a($$2, true);
                     }
                  }
               } else {
                  xl $$14 = xl.a("build.tooHigh", $$10).a(n.m);
                  this.f.b($$14, true);
               }

               this.f.g.b(new acq($$1, $$6));
               this.f.g.b(new acq($$1, $$6.a($$9)));
            } else {
               h.warn("Rejecting UseItemOnPacket from {}: Location {} too far away from hit block {}.", new Object[]{this.f.gk().getName(), $$5, $$6});
            }
         }
      }
   }

   @Override
   public void a(aix $$0) {
      zv.a($$0, this, this.f.B());
      this.a($$0.e());
      arq $$1 = this.f.B();
      bsg $$2 = $$0.b();
      cwf $$3 = this.f.b($$2);
      this.f.I();
      if (!$$3.f() && $$3.a($$1.J())) {
         float $$4 = azn.h($$0.f());
         float $$5 = azn.h($$0.g());
         if ($$5 != this.f.dQ() || $$4 != this.f.dO()) {
            this.f.b($$4, $$5);
         }

         if (this.f.i.a(this.f, $$1, $$3, $$2) instanceof bsh.d $$7 && $$7.e() == bsh.e.c) {
            this.f.a($$2, true);
         }
      }
   }

   @Override
   public void a(aiv $$0) {
      zv.a($$0, this, this.f.B());
      if (this.f.R_()) {
         for (arq $$1 : this.d.L()) {
            bui $$2 = $$0.a($$1);
            if ($$2 != null) {
               this.f.a($$1, $$2.dD(), $$2.dF(), $$2.dJ(), Set.of(), $$2.dO(), $$2.dQ(), true);
               return;
            }
         }
      }
   }

   @Override
   public void a(ahz $$0) {
      zv.a($$0, this, this.f.B());
      if (this.f.dn() instanceof cqq $$2) {
         $$2.b($$0.b(), $$0.e());
      }
   }

   @Override
   public void a(wh $$0) {
      h.info("{} lost connection: {}", this.f.am().getString(), $$0.a().getString());
      this.q();
      super.a($$0);
   }

   private void q() {
      this.T.close();
      this.d.av();
      this.d.ag().a(xl.a("multiplayer.player.left", this.f.S_()).a(n.o), false);
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
   public void a(ain $$0) {
      zv.a($$0, this, this.f.B());
      if ($$0.b() >= 0 && $$0.b() < coq.g()) {
         if (this.f.gl().j != $$0.b() && this.f.fD() == bsg.a) {
            this.f.fI();
         }

         this.f.gl().j = $$0.b();
         this.f.I();
      } else {
         h.warn("{} tried to set an invalid carried item", this.f.am().getString());
      }
   }

   @Override
   public void a(ahg $$0) {
      Optional<xs> $$1 = this.a($$0.h());
      if (!$$1.isEmpty()) {
         this.a($$0.b(), () -> {
            yb $$2;
            try {
               $$2 = this.a($$0, $$1.get());
            } catch (yf.a var6) {
               this.a(var6);
               return;
            }

            CompletableFuture<asj> $$5 = this.a($$2.c());
            xl $$6 = this.d.bk().decorate(this.f, $$2.d());
            this.T.append($$5, $$2x -> {
               yb $$3 = $$2.a($$6).a($$2x.e());
               this.b($$3);
            });
         });
      }
   }

   @Override
   public void a(ahe $$0) {
      this.a($$0.b(), () -> {
         this.b($$0.b());
         this.r();
      });
   }

   private void b(String $$0) {
      ParseResults<ew> $$1 = this.c($$0);
      if (this.d.aA() && yd.a($$1)) {
         h.error("Received unsigned command packet from {}, but the command requires signable arguments: {}", this.f.gk().getName(), $$0);
         this.f.a(m);
      } else {
         this.d.aG().a($$1, $$0);
      }
   }

   @Override
   public void a(ahf $$0) {
      Optional<xs> $$1 = this.a($$0.h());
      if (!$$1.isEmpty()) {
         this.a($$0.b(), () -> {
            this.a($$0, $$1.get());
            this.r();
         });
      }
   }

   private void a(ahf $$0, xs $$1) {
      ParseResults<ew> $$2 = this.c($$0.b());

      Map<String, yb> $$3;
      try {
         $$3 = this.a($$0, yd.b($$2), $$1);
      } catch (yf.a var6) {
         this.a(var6);
         return;
      }

      eu $$6 = new eu.a($$3);
      $$2 = ex.a($$2, $$1x -> $$1x.a($$6, this.T));
      this.d.aG().a($$2, $$0.b());
   }

   private void a(yf.a $$0) {
      h.warn("Failed to update secure chat state for {}: '{}'", this.f.gk().getName(), $$0.a().getString());
      this.f.a($$0.a().f().a(n.m));
   }

   private <S> Map<String, yb> a(ahf $$0, yd<S> $$1, xs $$2) throws yf.a {
      List<fd.a> $$3 = $$0.g().a();
      List<yd.a<S>> $$4 = $$1.a();
      if ($$3.isEmpty()) {
         return this.b($$4);
      } else {
         Map<String, yb> $$5 = new Object2ObjectOpenHashMap();

         for (fd.a $$6 : $$3) {
            yd.a<S> $$7 = $$1.a($$6.a());
            if ($$7 == null) {
               this.Q.setChainBroken();
               throw a($$0.b(), $$3, $$4);
            }

            ye $$8 = new ye($$7.c(), $$0.e(), $$0.f(), $$2);
            $$5.put($$7.a(), this.Q.unpack($$6.b(), $$8));
         }

         for (yd.a<S> $$9 : $$4) {
            if (!$$5.containsKey($$9.a())) {
               throw a($$0.b(), $$3, $$4);
            }
         }

         return $$5;
      }
   }

   private <S> Map<String, yb> b(List<yd.a<S>> $$0) throws yf.a {
      Map<String, yb> $$1 = new HashMap<>();

      for (yd.a<S> $$2 : $$0) {
         ye $$3 = ye.a($$2.c());
         $$1.put($$2.a(), this.Q.unpack(null, $$3));
      }

      return $$1;
   }

   private static <S> yf.a a(String $$0, List<fd.a> $$1, List<yd.a<S>> $$2) {
      String $$3 = $$1.stream().map(fd.a::a).collect(Collectors.joining(", "));
      String $$4 = $$2.stream().map(yd.a::a).collect(Collectors.joining(", "));
      h.error("Signed command mismatch between server and client ('{}'): got [{}] from client, but expected [{}]", new Object[]{$$0, $$3, $$4});
      return new yf.a(m);
   }

   private ParseResults<ew> c(String $$0) {
      CommandDispatcher<ew> $$1 = this.d.aG().a();
      return $$1.parse($$0, this.f.dq());
   }

   private void a(String $$0, Runnable $$1) {
      if (d($$0)) {
         this.a(xl.c("multiplayer.disconnect.illegal_characters"));
      } else if (this.f.F() == coo.c) {
         this.b(new agi(xl.c("chat.disabled.options").a(n.m), false));
      } else {
         this.f.I();
         this.d.execute($$1);
      }
   }

   private Optional<xs> a(xs.b $$0) {
      synchronized (this.R) {
         Optional<xs> $$1 = this.R.a($$0);
         if ($$1.isEmpty()) {
            h.warn("Failed to validate message acknowledgements from {}", this.f.am().getString());
            this.a(l);
         }

         return $$1;
      }
   }

   private static boolean d(String $$0) {
      for (int $$1 = 0; $$1 < $$0.length(); $$1++) {
         if (!bak.a($$0.charAt($$1))) {
            return true;
         }
      }

      return false;
   }

   private yb a(ahg $$0, xs $$1) throws yf.a {
      ye $$2 = new ye($$0.b(), $$0.e(), $$0.f(), $$1);
      return this.Q.unpack($$0.g(), $$2);
   }

   private void b(yb $$0) {
      this.d.ag().a($$0, this.f, xh.a(xh.e, this.f));
      this.r();
   }

   private void r() {
      this.q.a();
      if (!this.q.c() && !this.d.ag().f(this.f.gk()) && !this.d.a(this.f.gk())) {
         this.a(xl.c("disconnect.spam"));
      }
   }

   @Override
   public void a(ahd $$0) {
      synchronized (this.R) {
         if (!this.R.a($$0.b())) {
            h.warn("Failed to validate message acknowledgements from {}", this.f.am().getString());
            this.a(l);
         }
      }
   }

   @Override
   public void a(aiu $$0) {
      zv.a($$0, this, this.f.B());
      this.f.I();
      this.f.a($$0.b());
   }

   @Override
   public void a(aie $$0) {
      zv.a($$0, this, this.f.B());
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
            if (this.f.fU()) {
               this.f.a(false, true);
               this.F = this.f.dw();
            }
            break;
         case f:
            if (this.f.dn() instanceof bvo $$1) {
               int $$2 = $$0.f();
               if ($$1.a() && $$2 > 0) {
                  $$1.c($$2);
               }
            }
            break;
         case g:
            if (this.f.dn() instanceof bvo $$3) {
               $$3.b();
            }
            break;
         case h:
            if (this.f.dm() instanceof bux $$4) {
               $$4.b(this.f);
            }
            break;
         case i:
            if (!this.f.gr()) {
               this.f.gt();
            }
            break;
         default:
            throw new IllegalArgumentException("Invalid client command!");
      }
   }

   public void a(yb $$0) {
      xx $$1 = $$0.l();
      if ($$1 != null) {
         this.S.a($$0.m(), $$0.l());
         int $$2;
         synchronized (this.R) {
            this.R.a($$1);
            $$2 = this.R.a();
         }

         if ($$2 > 4096) {
            this.a(xl.c("multiplayer.disconnect.too_many_pending_chats"));
         }
      }
   }

   public void a(yb $$0, xh.a $$1) {
      this.b(new aej($$0.k().c(), $$0.k().b(), $$0.l(), $$0.m().a(this.S), $$0.n(), $$0.o(), $$1));
      this.a($$0);
   }

   public void a(xl $$0, xh.a $$1) {
      this.b(new adk($$0, $$1));
   }

   public SocketAddress m() {
      return this.e.d();
   }

   public void n() {
      this.U = true;
      this.q();
      this.b(agg.a);
      this.e.a(abw.d);
   }

   @Override
   public void a(ake $$0) {
      this.e.a(new akb($$0.b()));
   }

   @Override
   public void a(ahu $$0) {
      zv.a($$0, this, this.f.B());
      final arq $$1 = this.f.B();
      final bui $$2 = $$0.a($$1);
      this.f.I();
      this.f.g($$0.b());
      if ($$2 != null) {
         if (!$$1.C_().a($$2.dy())) {
            return;
         }

         ezm $$3 = $$2.cT();
         if (this.f.a($$3, 3.0)) {
            $$0.a(new ahu.c() {
               private void a(bsg $$0, ast.a $$1x) {
                  cwf $$2 = ast.this.f.b($$0);
                  if ($$2.a($$1.J())) {
                     cwf $$3 = $$2.v();
                     if ($$1.run(ast.this.f, $$2, $$0) instanceof bsh.d $$5) {
                        cwf $$6 = $$5.c() ? $$3 : cwf.k;
                        ao.T.a(ast.this.f, $$6, $$2);
                        if ($$5.e() == bsh.e.c) {
                           ast.this.f.a($$0, true);
                        }
                     }
                  }
               }

               @Override
               public void a(bsg $$0) {
                  this.a($$0, cor::a);
               }

               @Override
               public void a(bsg $$0, ezr $$1x) {
                  this.a($$0, ($$1xxx, $$2xx, $$3) -> $$2xx.a($$1xxx, $$1, $$3));
               }

               @Override
               public void a() {
                  label23:
                  if (!($$2 instanceof ckz) && !($$2 instanceof buu) && $$2 != ast.this.f) {
                     if ($$2 instanceof coy $$0 && !$$0.cD()) {
                        break label23;
                     }

                     cwf $$1 = ast.this.f.b(bsg.a);
                     if (!$$1.a($$1.J())) {
                        return;
                     }

                     ast.this.f.e($$2);
                     return;
                  }

                  ast.this.a(xl.c("multiplayer.disconnect.invalid_entity_attacked"));
                  ast.h.warn("Player {} tried to attack an invalid entity", ast.this.f.am().getString());
               }
            });
         }
      }
   }

   @Override
   public void a(ahj $$0) {
      zv.a($$0, this, this.f.B());
      this.f.I();
      ahj.a $$1 = $$0.b();
      switch ($$1) {
         case a:
            if (this.f.l) {
               this.f.l = false;
               this.f = this.d.ag().a(this.f, true, bui.c.e);
               ao.w.a(this.f, dff.k, dff.i);
            } else {
               if (this.f.eH() > 0.0F) {
                  return;
               }

               this.f = this.d.ag().a(this.f, false, bui.c.a);
               if (this.d.u_()) {
                  this.f.a(dfc.d);
                  this.f.dY().ac().a(dfb.r).a(false, this.d);
               }
            }
            break;
         case b:
            this.f.J().a(this.f);
      }
   }

   @Override
   public void a(ahp $$0) {
      zv.a($$0, this, this.f.B());
      this.f.t();
   }

   @Override
   public void a(aho $$0) {
      zv.a($$0, this, this.f.B());
      this.f.I();
      if (this.f.cd.l == $$0.b()) {
         if (this.f.R_()) {
            this.f.cd.b();
         } else if (!this.f.cd.b(this.f)) {
            h.debug("Player {} interacted with invalid menu {}", this.f, this.f.cd);
         } else {
            int $$1 = $$0.e();
            if (!this.f.cd.a($$1)) {
               h.debug("Player {} clicked invalid slot index: {}, available slots: {}", new Object[]{this.f.am(), $$1, this.f.cd.k.size()});
            } else {
               boolean $$2 = $$0.j() != this.f.cd.j();
               this.f.cd.h();
               this.f.cd.a($$1, $$0.f(), $$0.i(), this.f);
               ObjectIterator var4 = Int2ObjectMaps.fastIterable($$0.h()).iterator();

               while (var4.hasNext()) {
                  Entry<cwf> $$3 = (Entry<cwf>)var4.next();
                  this.f.cd.b($$3.getIntKey(), (cwf)$$3.getValue());
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
   public void a(aib $$0) {
      zv.a($$0, this, this.f.B());
      this.f.I();
      if (!this.f.R_() && this.f.cd.l == $$0.b()) {
         if (!this.f.cd.b(this.f)) {
            h.debug("Player {} interacted with invalid menu {}", this.f, this.f.cd);
         } else if (this.f.K().b($$0.e())) {
            if (this.f.cd instanceof cth $$1) {
               this.d.aI().a($$0.e()).ifPresent($$2 -> {
                  if ($$2.b().a().c()) {
                     h.debug("Player {} tried to place impossible recipe {}", this.f, $$2.a());
                  } else {
                     cth.a $$3 = $$1.a($$0.f(), this.f.f(), (dav<?>)$$2, this.f.gl());
                     if ($$3 == cth.a.b) {
                        this.f.g.b(new aeh(this.f.cd.l, (dav<?>)$$2));
                     }
                  }
               });
            }
         }
      }
   }

   @Override
   public void a(ahn $$0) {
      zv.a($$0, this, this.f.B());
      this.f.I();
      if (this.f.cd.l == $$0.b() && !this.f.R_()) {
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
   public void a(aiq $$0) {
      zv.a($$0, this, this.f.B());
      if (this.f.i.e()) {
         boolean $$1 = $$0.b() < 0;
         cwf $$2 = $$0.e();
         if (!$$2.a(this.f.dY().J())) {
            return;
         }

         cyo $$3 = $$2.a(ku.Y, cyo.a);
         if ($$3.a("x") && $$3.a("y") && $$3.a("z")) {
            jh $$4 = dsr.b($$3.d());
            if (this.f.dY().p($$4)) {
               dsr $$5 = this.f.dY().c_($$4);
               if ($$5 != null) {
                  $$5.a($$2, this.f.dY().H_());
               }
            }
         }

         boolean $$6 = $$0.b() >= 1 && $$0.b() <= 45;
         boolean $$7 = $$2.f() || $$2.L() <= $$2.k();
         if ($$6 && $$7) {
            this.f.cc.b($$0.b()).e($$2);
            this.f.cc.a($$0.b(), $$2);
            this.f.cc.d();
         } else if ($$1 && $$7) {
            if (this.r.c()) {
               this.r.a();
               this.f.a($$2, true);
            } else {
               h.warn("Player {} was dropping items too fast in creative mode, ignoring.", this.f.am().getString());
            }
         }
      }
   }

   @Override
   public void a(ait $$0) {
      List<String> $$1 = Stream.of($$0.f()).map(n::a).collect(Collectors.toList());
      this.a($$1).thenAcceptAsync($$1x -> this.a($$0, $$1x), this.d);
   }

   private void a(ait $$0, List<asj> $$1) {
      this.f.I();
      arq $$2 = this.f.B();
      jh $$3 = $$0.b();
      if ($$2.B($$3)) {
         if (!($$2.c_($$3) instanceof dud $$5)) {
            return;
         }

         $$5.a(this.f, $$0.e(), $$1);
      }
   }

   @Override
   public void a(aic $$0) {
      zv.a($$0, this, this.f.B());
      this.f.gm().b = $$0.b() && this.f.gm().c;
   }

   @Override
   public void a(aam $$0) {
      zv.a($$0, this, this.f.B());
      this.f.a($$0.b());
   }

   @Override
   public void a(ahc $$0) {
      zv.a($$0, this, this.f.B());
      if (this.f.l(2) || this.h()) {
         this.d.a($$0.b(), false);
      }
   }

   @Override
   public void a(ahw $$0) {
      zv.a($$0, this, this.f.B());
      if (this.f.l(2) || this.h()) {
         this.d.b($$0.b());
      }
   }

   @Override
   public void a(ahh $$0) {
      zv.a($$0, this, this.f.B());
      yc.a $$1 = $$0.b();
      cou.a $$2 = this.P != null ? this.P.d().b() : null;
      cou.a $$3 = $$1.b();
      if (!Objects.equals($$2, $$3)) {
         if ($$2 != null && $$3.b().isBefore($$2.b())) {
            this.a(cou.a);
         } else {
            try {
               baa $$4 = this.d.ar();
               if ($$4 == null) {
                  h.warn("Ignoring chat session from {} due to missing Services public key", this.f.gk().getName());
                  return;
               }

               this.a($$1.a(this.f.gk(), $$4));
            } catch (cou.b var6) {
               h.error("Failed to validate profile key: {}", var6.getMessage());
               this.a(var6.a());
            }
         }
      }
   }

   @Override
   public void a(ahm $$0) {
      if (!this.U) {
         throw new IllegalStateException("Client acknowledged config, but none was requested");
      } else {
         this.e.a(abw.b, new asr(this.d, this.e, this.a(this.f.D())));
      }
   }

   @Override
   public void a(ahi $$0) {
      zv.a($$0, this, this.f.B());
      this.g.a($$0.b());
   }

   @Override
   public void a(ahr $$0) {
      zv.a($$0, this, this.f.B());
      this.d.a(this.f, $$0.b());
   }

   private void a(yc $$0) {
      this.P = $$0;
      this.Q = $$0.a(this.f.cI());
      this.T.append(() -> {
         this.f.a($$0);
         this.d.ag().a(new aeo(EnumSet.of(aeo.a.b), List.of(this.f)));
      });
   }

   @Override
   public void a(aan $$0) {
   }

   @Override
   public void a(ahk $$0) {
      zv.a($$0, this, this.f.B());
      if (!this.O) {
         this.f.a(ezr.c);
      }

      this.O = false;
   }

   private void a(ezr $$0) {
      this.f.a($$0);
      this.f.I();
      this.O = true;
   }

   @Override
   public arr o() {
      return this.f;
   }

   @FunctionalInterface
   interface a {
      bsh run(arr var1, bui var2, bsg var3);
   }
}
