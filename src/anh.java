import com.google.common.collect.Lists;
import com.google.common.primitives.Floats;
import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.ParseResults;
import com.mojang.brigadier.StringReader;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap.Entry;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.net.SocketAddress;
import java.time.Instant;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class anh extends ane implements acp, ank, uk {
   static final Logger g = LogUtils.getLogger();
   public static final double d = atq.k(6.0);
   private static final int h = -1;
   private static final int i = 4096;
   private static final uv j = uv.c("multiplayer.disconnect.chat_validation_failed");
   public amj e;
   public final and f;
   private int k;
   private int l = -1;
   private int m;
   private int n;
   private double o;
   private double p;
   private double q;
   private double r;
   private double s;
   private double t;
   @Nullable
   private bkv u;
   private double v;
   private double w;
   private double x;
   private double y;
   private double z;
   private double A;
   @Nullable
   private ejz B;
   private int C;
   private int D;
   private boolean E;
   private int F;
   private boolean G;
   private int H;
   private int I;
   private int J;
   private final AtomicReference<Instant> K = new AtomicReference<>(Instant.EPOCH);
   @Nullable
   private vm L;
   private vp.b M;
   private final ve N = new ve(20);
   private final vi O = vi.a();
   private final ate P;
   private boolean Q;

   public anh(MinecraftServer $$0, tw $$1, amj $$2, amx $$3) {
      super($$0, $$1, $$3);
      this.f = new and($$1.g());
      $$1.a(this);
      this.e = $$2;
      $$2.c = this;
      $$2.X().a();
      this.M = $$0.ay() ? vp.b.a : vp.b.unsigned($$2.cw());
      this.P = new ate($$0);
   }

   @Override
   public void e() {
      if (this.l > -1) {
         this.b(new ym(this.l));
         this.l = -1;
      }

      this.m();
      this.e.K = this.e.ds();
      this.e.L = this.e.du();
      this.e.M = this.e.dy();
      this.e.m();
      this.e.a(this.o, this.p, this.q, this.e.dD(), this.e.dF());
      this.k++;
      this.J = this.I;
      if (this.E && !this.e.fE() && !this.e.bO() && !this.e.ex()) {
         if (++this.F > 80) {
            g.warn("{} was kicked for floating too long!", this.e.ad().getString());
            this.b(uv.c("multiplayer.disconnect.flying"));
            return;
         }
      } else {
         this.E = false;
         this.F = 0;
      }

      this.u = this.e.cX();
      if (this.u != this.e && this.u.cO() == this.e) {
         this.v = this.u.ds();
         this.w = this.u.du();
         this.x = this.u.dy();
         this.y = this.u.ds();
         this.z = this.u.du();
         this.A = this.u.dy();
         if (this.G && this.e.cX().cO() == this.e) {
            if (++this.H > 80) {
               g.warn("{} was kicked for floating a vehicle too long!", this.e.ad().getString());
               this.b(uv.c("multiplayer.disconnect.flying"));
               return;
            }
         } else {
            this.G = false;
            this.H = 0;
         }
      } else {
         this.u = null;
         this.G = false;
         this.H = 0;
      }

      this.f();
      if (this.m > 0) {
         this.m--;
      }

      if (this.n > 0) {
         this.n--;
      }

      if (this.e.M() > 0L && this.b.an() > 0 && ac.b() - this.e.M() > (long)this.b.an() * 1000L * 60L) {
         this.b(uv.c("multiplayer.disconnect.idling"));
      }
   }

   public void m() {
      this.o = this.e.ds();
      this.p = this.e.du();
      this.q = this.e.dy();
      this.r = this.e.ds();
      this.s = this.e.du();
      this.t = this.e.dy();
   }

   @Override
   public boolean c() {
      return this.c.k() && !this.Q;
   }

   @Override
   public boolean a(wo<?> $$0) {
      return super.a($$0) ? true : this.Q && this.c.k() && $$0 instanceof adc;
   }

   @Override
   protected GameProfile j() {
      return this.e.fS();
   }

   private <T, R> CompletableFuture<R> a(T $$0, BiFunction<anm, T, CompletableFuture<R>> $$1) {
      return $$1.apply(this.e.X(), $$0).thenApply($$0x -> {
         if (!this.c()) {
            g.debug("Ignoring packet due to disconnection");
            throw new CancellationException("disconnected");
         } else {
            return (R)$$0x;
         }
      });
   }

   private CompletableFuture<amz> a(String $$0) {
      return this.a($$0, anm::a);
   }

   private CompletableFuture<List<amz>> a(List<String> $$0) {
      return this.a($$0, anm::a);
   }

   @Override
   public void a(adu $$0) {
      wq.a($$0, this, this.e.z());
      this.e.a($$0.a(), $$0.d(), $$0.e(), $$0.f());
   }

   private static boolean b(double $$0, double $$1, double $$2, float $$3, float $$4) {
      return Double.isNaN($$0) || Double.isNaN($$1) || Double.isNaN($$2) || !Floats.isFinite($$4) || !Floats.isFinite($$3);
   }

   private static double a(double $$0) {
      return atq.a($$0, -3.0E7, 3.0E7);
   }

   private static double b(double $$0) {
      return atq.a($$0, -2.0E7, 2.0E7);
   }

   @Override
   public void a(adn $$0) {
      wq.a($$0, this, this.e.z());
      if (b($$0.a(), $$0.d(), $$0.e(), $$0.f(), $$0.g())) {
         this.b(uv.c("multiplayer.disconnect.invalid_vehicle_movement"));
      } else {
         bkv $$1 = this.e.cX();
         if ($$1 != this.e && $$1.cO() == this.e && $$1 == this.u) {
            ami $$2 = this.e.z();
            double $$3 = $$1.ds();
            double $$4 = $$1.du();
            double $$5 = $$1.dy();
            double $$6 = a($$0.a());
            double $$7 = b($$0.d());
            double $$8 = a($$0.e());
            float $$9 = atq.g($$0.f());
            float $$10 = atq.g($$0.g());
            double $$11 = $$6 - this.v;
            double $$12 = $$7 - this.w;
            double $$13 = $$8 - this.x;
            double $$14 = $$1.dq().g();
            double $$15 = $$11 * $$11 + $$12 * $$12 + $$13 * $$13;
            if ($$15 - $$14 > 100.0 && !this.i()) {
               g.warn("{} (vehicle of {}) moved too quickly! {},{},{}", new Object[]{$$1.ad().getString(), this.e.ad().getString(), $$11, $$12, $$13});
               this.b(new aaa($$1));
               return;
            }

            boolean $$16 = $$2.a($$1, $$1.cH().h(0.0625));
            $$11 = $$6 - this.y;
            $$12 = $$7 - this.z - 1.0E-6;
            $$13 = $$8 - this.A;
            boolean $$17 = $$1.R;
            if ($$1 instanceof bll $$18 && $$18.e_()) {
               $$18.n();
            }

            $$1.a(blr.b, new ejz($$11, $$12, $$13));
            $$11 = $$6 - $$1.ds();
            $$12 = $$7 - $$1.du();
            if ($$12 > -0.5 || $$12 < 0.5) {
               $$12 = 0.0;
            }

            $$13 = $$8 - $$1.dy();
            $$15 = $$11 * $$11 + $$12 * $$12 + $$13 * $$13;
            boolean $$20 = false;
            if ($$15 > 0.0625) {
               $$20 = true;
               g.warn("{} (vehicle of {}) moved wrongly! {}", new Object[]{$$1.ad().getString(), this.e.ad().getString(), Math.sqrt($$15)});
            }

            $$1.a($$6, $$7, $$8, $$9, $$10);
            boolean $$21 = $$2.a($$1, $$1.cH().h(0.0625));
            if ($$16 && ($$20 || !$$21)) {
               $$1.a($$3, $$4, $$5, $$9, $$10);
               this.b(new aaa($$1));
               return;
            }

            this.e.z().k().a(this.e);
            this.e.b(this.e.ds() - $$3, this.e.du() - $$4, this.e.dy() - $$5);
            this.G = $$12 >= -0.03125 && !$$17 && !this.b.ab() && !$$1.aV() && this.a($$1);
            this.y = $$1.ds();
            this.z = $$1.du();
            this.A = $$1.dy();
         }
      }
   }

   private boolean a(bkv $$0) {
      return $$0.dN().a($$0.cH().g(0.0625).b(0.0, -0.55, 0.0)).allMatch(dhm.a::i);
   }

   @Override
   public void a(acs $$0) {
      wq.a($$0, this, this.e.z());
      if ($$0.a() == this.C) {
         if (this.B == null) {
            this.b(uv.c("multiplayer.disconnect.invalid_player_movement"));
            return;
         }

         this.e.a(this.B.c, this.B.d, this.B.e, this.e.dD(), this.e.dF());
         this.r = this.B.c;
         this.s = this.B.d;
         this.t = this.B.e;
         if (this.e.O()) {
            this.e.P();
         }

         this.B = null;
      }
   }

   @Override
   public void a(adw $$0) {
      wq.a($$0, this, this.e.z());
      this.b.aG().a($$0.a()).ifPresent(this.e.I()::e);
   }

   @Override
   public void a(adv $$0) {
      wq.a($$0, this, this.e.z());
      this.e.I().a($$0.a(), $$0.d(), $$0.e());
   }

   @Override
   public void a(ady $$0) {
      wq.a($$0, this, this.e.z());
      if ($$0.d() == ady.a.a) {
         agm $$1 = Objects.requireNonNull($$0.e());
         af $$2 = this.b.aB().a($$1);
         if ($$2 != null) {
            this.e.Q().a($$2);
         }
      }
   }

   @Override
   public void a(adb $$0) {
      wq.a($$0, this, this.e.z());
      StringReader $$1 = new StringReader($$0.d());
      if ($$1.canRead() && $$1.peek() == '/') {
         $$1.skip();
      }

      ParseResults<du> $$2 = this.b.aE().a().parse($$1, this.e.de());
      this.b.aE().a().getCompletionSuggestions($$2).thenAccept($$1x -> this.b(new yy($$0.a(), $$1x)));
   }

   @Override
   public void a(aec $$0) {
      wq.a($$0, this, this.e.z());
      if (!this.b.o()) {
         this.e.a(uv.c("advMode.notEnabled"));
      } else if (!this.e.gq()) {
         this.e.a(uv.c("advMode.notAllowed"));
      } else {
         crg $$1 = null;
         dfs $$2 = null;
         hx $$3 = $$0.a();
         dfi $$4 = this.e.dN().c_($$3);
         if ($$4 instanceof dfs) {
            $$2 = (dfs)$$4;
            $$1 = $$2.c();
         }

         String $$5 = $$0.d();
         boolean $$6 = $$0.e();
         if ($$1 != null) {
            dfs.a $$7 = $$2.m();
            dhn $$8 = this.e.dN().a_($$3);
            ib $$9 = $$8.c(cwo.b);

            dhn $$13 = (switch ($$0.h()) {
               case a -> cvh.kH.o();
               case b -> cvh.kG.o();
               default -> cvh.fN.o();
            }).a(cwo.b, $$9).a(cwo.c, Boolean.valueOf($$0.f()));
            if ($$13 != $$8) {
               this.e.dN().a($$3, $$13, 2);
               $$4.b($$13);
               this.e.dN().l($$3).a($$4);
            }

            $$1.a($$5);
            $$1.a($$6);
            if (!$$6) {
               $$1.c(null);
            }

            $$2.b($$0.g());
            if ($$7 != $$0.h()) {
               $$2.g();
            }

            $$1.f();
            if (!aul.b($$5)) {
               this.e.a(uv.a("advMode.setCommand.success", $$5));
            }
         }
      }
   }

   @Override
   public void a(aed $$0) {
      wq.a($$0, this, this.e.z());
      if (!this.b.o()) {
         this.e.a(uv.c("advMode.notEnabled"));
      } else if (!this.e.gq()) {
         this.e.a(uv.c("advMode.notAllowed"));
      } else {
         crg $$1 = $$0.a(this.e.dN());
         if ($$1 != null) {
            $$1.a($$0.a());
            $$1.a($$0.d());
            if (!$$0.d()) {
               $$1.c(null);
            }

            $$1.f();
            this.e.a(uv.a("advMode.setCommand.success", $$0.a()));
         }
      }
   }

   @Override
   public void a(adp $$0) {
      wq.a($$0, this, this.e.z());
      this.e.fT().c($$0.a());
      this.e.c.b(new zd(-2, 0, this.e.fT().l, this.e.fT().a(this.e.fT().l)));
      this.e.c.b(new zd(-2, 0, $$0.a(), this.e.fT().a($$0.a())));
      this.e.c.b(new abd(this.e.fT().l));
   }

   @Override
   public void a(adx $$0) {
      wq.a($$0, this, this.e.z());
      if (this.e.bS instanceof cgt $$1) {
         if (!$$1.a(this.e)) {
            g.debug("Player {} interacted with invalid menu {}", this.e, $$1);
            return;
         }

         $$1.a($$0.a());
      }
   }

   @Override
   public void a(aea $$0) {
      wq.a($$0, this, this.e.z());
      if (this.e.bS instanceof cgu $$1) {
         if (!this.e.bS.a(this.e)) {
            g.debug("Player {} interacted with invalid menu {}", this.e, this.e.bS);
            return;
         }

         $$1.a($$0.a(), $$0.d());
      }
   }

   @Override
   public void a(aeg $$0) {
      wq.a($$0, this, this.e.z());
      if (this.e.gq()) {
         hx $$1 = $$0.a();
         dhn $$2 = this.e.dN().a_($$1);
         if (this.e.dN().c_($$1) instanceof dgw $$4) {
            $$4.a($$0.e());
            $$4.a($$0.f());
            $$4.a($$0.g());
            $$4.a($$0.h());
            $$4.a($$0.i());
            $$4.a($$0.j());
            $$4.b($$0.k());
            $$4.a($$0.l());
            $$4.d($$0.m());
            $$4.e($$0.n());
            $$4.a($$0.o());
            $$4.a($$0.p());
            if ($$4.g()) {
               String $$5 = $$4.d();
               if ($$0.d() == dgw.a.b) {
                  if ($$4.D()) {
                     this.e.a(uv.a("structure_block.save_success", $$5), false);
                  } else {
                     this.e.a(uv.a("structure_block.save_failure", $$5), false);
                  }
               } else if ($$0.d() == dgw.a.c) {
                  if (!$$4.F()) {
                     this.e.a(uv.a("structure_block.load_not_found", $$5), false);
                  } else if ($$4.a(this.e.z())) {
                     this.e.a(uv.a("structure_block.load_success", $$5), false);
                  } else {
                     this.e.a(uv.a("structure_block.load_prepare", $$5), false);
                  }
               } else if ($$0.d() == dgw.a.d) {
                  if ($$4.C()) {
                     this.e.a(uv.a("structure_block.size_success", $$5), false);
                  } else {
                     this.e.a(uv.c("structure_block.size_failure"), false);
                  }
               }
            } else {
               this.e.a(uv.a("structure_block.invalid_structure_name", $$0.f()), false);
            }

            $$4.e();
            this.e.dN().a($$1, $$2, $$2, 3);
         }
      }
   }

   @Override
   public void a(aef $$0) {
      wq.a($$0, this, this.e.z());
      if (this.e.gq()) {
         hx $$1 = $$0.a();
         dhn $$2 = this.e.dN().a_($$1);
         if (this.e.dN().c_($$1) instanceof dgi $$4) {
            $$4.a($$0.d());
            $$4.b($$0.e());
            $$4.a(agl.a(kd.aE, $$0.f()));
            $$4.a($$0.g());
            $$4.a($$0.h());
            $$4.a($$0.j());
            $$4.b($$0.i());
            $$4.e();
            this.e.dN().a($$1, $$2, $$2, 3);
         }
      }
   }

   @Override
   public void a(adk $$0) {
      wq.a($$0, this, this.e.z());
      if (this.e.gq()) {
         hx $$1 = $$0.a();
         if (this.e.dN().c_($$1) instanceof dgi $$3) {
            $$3.a(this.e.z(), $$0.d(), $$0.e());
         }
      }
   }

   @Override
   public void a(adz $$0) {
      wq.a($$0, this, this.e.z());
      int $$1 = $$0.a();
      if (this.e.bS instanceof cia $$2) {
         if (!$$2.a(this.e)) {
            g.debug("Player {} interacted with invalid menu {}", this.e, $$2);
            return;
         }

         $$2.e($$1);
         $$2.h($$1);
      }
   }

   @Override
   public void a(adh $$0) {
      int $$1 = $$0.e();
      if (cdy.d($$1) || $$1 == 40) {
         List<String> $$2 = Lists.newArrayList();
         Optional<String> $$3 = $$0.d();
         $$3.ifPresent($$2::add);
         $$0.a().stream().limit(100L).forEach($$2::add);
         Consumer<List<amz>> $$4 = $$3.isPresent() ? $$1x -> this.a((amz)$$1x.get(0), $$1x.subList(1, $$1x.size()), $$1) : $$1x -> this.a($$1x, $$1);
         this.a($$2).thenAcceptAsync($$4, this.b);
      }
   }

   private void a(List<amz> $$0, int $$1) {
      clo $$2 = this.e.fT().a($$1);
      if ($$2.a(clr.tS)) {
         this.a($$0, UnaryOperator.identity(), $$2);
      }
   }

   private void a(amz $$0, List<amz> $$1, int $$2) {
      clo $$3 = this.e.fT().a($$2);
      if ($$3.a(clr.tS)) {
         clo $$4 = new clo(clr.tT);
         sd $$5 = $$3.v();
         if ($$5 != null) {
            $$4.c($$5.h());
         }

         $$4.a("author", sy.a(this.e.ad().getString()));
         if (this.e.Y()) {
            $$4.a("title", sy.a($$0.b()));
         } else {
            $$4.a("filtered_title", sy.a($$0.b()));
            $$4.a("title", sy.a($$0.d()));
         }

         this.a($$1, $$0x -> uv.a.a(uv.b($$0x)), $$4);
         this.e.fT().a($$2, $$4);
      }
   }

   private void a(List<amz> $$0, UnaryOperator<String> $$1, clo $$2) {
      sj $$3 = new sj();
      if (this.e.Y()) {
         $$0.stream().map($$1x -> sy.a($$1.apply($$1x.b()))).forEach($$3::add);
      } else {
         sd $$4 = new sd();
         int $$5 = 0;

         for (int $$6 = $$0.size(); $$5 < $$6; $$5++) {
            amz $$7 = $$0.get($$5);
            String $$8 = $$7.d();
            $$3.add(sy.a($$1.apply($$8)));
            if ($$7.c()) {
               $$4.a(String.valueOf($$5), $$1.apply($$7.b()));
            }
         }

         if (!$$4.g()) {
            $$2.a("filtered_pages", $$4);
         }
      }

      $$2.a("pages", $$3);
   }

   @Override
   public void a(adi $$0) {
      wq.a($$0, this, this.e.z());
      if (this.e.l(2)) {
         bkv $$1 = this.e.dN().a($$0.d());
         if ($$1 != null) {
            sd $$2 = $$1.f(new sd());
            this.e.c.b(new acd($$0.a(), $$2));
         }
      }
   }

   @Override
   public void a(adg $$0) {
      wq.a($$0, this, this.e.z());
      if (!this.e.P_() && $$0.d() == this.e.bS.j) {
         if (this.e.bS instanceof chf $$1 && $$1.m() instanceof dfw $$2) {
            $$2.a($$0.a(), $$0.e());
         }
      }
   }

   @Override
   public void a(act $$0) {
      wq.a($$0, this, this.e.z());
      if (this.e.l(2)) {
         dfi $$1 = this.e.dN().c_($$0.d());
         sd $$2 = $$1 != null ? $$1.q() : null;
         this.e.c.b(new acd($$0.a(), $$2));
      }
   }

   @Override
   public void a(adm $$0) {
      wq.a($$0, this, this.e.z());
      if (b($$0.a(0.0), $$0.b(0.0), $$0.c(0.0), $$0.a(0.0F), $$0.b(0.0F))) {
         this.b(uv.c("multiplayer.disconnect.invalid_player_movement"));
      } else {
         ami $$1 = this.e.z();
         if (!this.e.f) {
            if (this.k == 0) {
               this.m();
            }

            if (this.B != null) {
               if (this.k - this.D > 20) {
                  this.D = this.k;
                  this.a(this.B.c, this.B.d, this.B.e, this.e.dD(), this.e.dF());
               }
            } else {
               this.D = this.k;
               double $$2 = a($$0.a(this.e.ds()));
               double $$3 = b($$0.b(this.e.du()));
               double $$4 = a($$0.c(this.e.dy()));
               float $$5 = atq.g($$0.a(this.e.dD()));
               float $$6 = atq.g($$0.b(this.e.dF()));
               if (this.e.bO()) {
                  this.e.a(this.e.ds(), this.e.du(), this.e.dy(), $$5, $$6);
                  this.e.z().k().a(this.e);
               } else {
                  double $$7 = this.e.ds();
                  double $$8 = this.e.du();
                  double $$9 = this.e.dy();
                  double $$10 = $$2 - this.o;
                  double $$11 = $$3 - this.p;
                  double $$12 = $$4 - this.q;
                  double $$13 = this.e.dq().g();
                  double $$14 = $$10 * $$10 + $$11 * $$11 + $$12 * $$12;
                  if (this.e.fE()) {
                     if ($$14 > 1.0) {
                        this.a(this.e.ds(), this.e.du(), this.e.dy(), $$5, $$6);
                     }
                  } else {
                     if ($$1.r().i()) {
                        this.I++;
                        int $$15 = this.I - this.J;
                        if ($$15 > 5) {
                           g.debug("{} is sending move packets too frequently ({} packets since last tick)", this.e.ad().getString(), $$15);
                           $$15 = 1;
                        }

                        if (!this.e.O() && (!this.e.dN().Y().b(csb.t) || !this.e.fx())) {
                           float $$16 = this.e.fx() ? 300.0F : 100.0F;
                           if ($$14 - $$13 > (double)($$16 * (float)$$15) && !this.i()) {
                              g.warn("{} moved too quickly! {},{},{}", new Object[]{this.e.ad().getString(), $$10, $$11, $$12});
                              this.a(this.e.ds(), this.e.du(), this.e.dy(), this.e.dD(), this.e.dF());
                              return;
                           }
                        }
                     }

                     eju $$17 = this.e.cH();
                     $$10 = $$2 - this.r;
                     $$11 = $$3 - this.s;
                     $$12 = $$4 - this.t;
                     boolean $$18 = $$11 > 0.0;
                     if (this.e.aC() && !$$0.a() && $$18) {
                        this.e.fc();
                     }

                     boolean $$19 = this.e.R;
                     this.e.a(blr.b, new ejz($$10, $$11, $$12));
                     $$10 = $$2 - this.e.ds();
                     $$11 = $$3 - this.e.du();
                     if ($$11 > -0.5 || $$11 < 0.5) {
                        $$11 = 0.0;
                     }

                     $$12 = $$4 - this.e.dy();
                     $$14 = $$10 * $$10 + $$11 * $$11 + $$12 * $$12;
                     boolean $$21 = false;
                     if (!this.e.O() && $$14 > 0.0625 && !this.e.fE() && !this.e.e.e() && this.e.e.b() != csc.d) {
                        $$21 = true;
                        g.warn("{} moved wrongly!", this.e.ad().getString());
                     }

                     if (this.e.af || this.e.fE() || (!$$21 || !$$1.a(this.e, $$17)) && !this.a($$1, $$17, $$2, $$3, $$4)) {
                        this.e.a($$2, $$3, $$4, $$5, $$6);
                        this.E = $$11 >= -0.03125
                           && !$$19
                           && this.e.e.b() != csc.d
                           && !this.b.ab()
                           && !this.e.fU().c
                           && !this.e.a(bkk.y)
                           && !this.e.fx()
                           && !this.e.fk()
                           && this.a((bkv)this.e);
                        this.e.z().k().a(this.e);
                        this.e.a(this.e.ds() - $$7, this.e.du() - $$8, this.e.dy() - $$9, $$0.a());
                        this.e.a($$0.a(), new ejz(this.e.ds() - $$7, this.e.du() - $$8, this.e.dy() - $$9));
                        if ($$18) {
                           this.e.n();
                        }

                        this.e.b(this.e.ds() - $$7, this.e.du() - $$8, this.e.dy() - $$9);
                        this.r = this.e.ds();
                        this.s = this.e.du();
                        this.t = this.e.dy();
                     } else {
                        this.a($$7, $$8, $$9, $$5, $$6);
                        this.e.a(this.e.ds() - $$7, this.e.du() - $$8, this.e.dy() - $$9, $$0.a());
                     }
                  }
               }
            }
         }
      }
   }

   private boolean a(csi $$0, eju $$1, double $$2, double $$3, double $$4) {
      eju $$5 = this.e.cH().d($$2 - this.e.ds(), $$3 - this.e.du(), $$4 - this.e.dy());
      Iterable<eks> $$6 = $$0.d(this.e, $$5.h(1.0E-5F));
      eks $$7 = ekp.a($$1.h(1.0E-5F));

      for (eks $$8 : $$6) {
         if (!ekp.c($$8, $$7, ekd.i)) {
            return true;
         }
      }

      return false;
   }

   public void a(double $$0, double $$1, double $$2, float $$3, float $$4) {
      this.a($$0, $$1, $$2, $$3, $$4, Collections.emptySet());
   }

   public void a(double $$0, double $$1, double $$2, float $$3, float $$4, Set<blz> $$5) {
      double $$6 = $$5.contains(blz.a) ? this.e.ds() : 0.0;
      double $$7 = $$5.contains(blz.b) ? this.e.du() : 0.0;
      double $$8 = $$5.contains(blz.c) ? this.e.dy() : 0.0;
      float $$9 = $$5.contains(blz.d) ? this.e.dD() : 0.0F;
      float $$10 = $$5.contains(blz.e) ? this.e.dF() : 0.0F;
      this.B = new ejz($$0, $$1, $$2);
      if (++this.C == Integer.MAX_VALUE) {
         this.C = 0;
      }

      this.D = this.k;
      this.e.a($$0, $$1, $$2, $$3, $$4);
      this.e.c.b(new aan($$0 - $$6, $$1 - $$7, $$2 - $$8, $$3 - $$9, $$4 - $$10, $$5, this.C));
   }

   @Override
   public void a(ads $$0) {
      wq.a($$0, this, this.e.z());
      hx $$1 = $$0.a();
      this.e.G();
      ads.a $$2 = $$0.e();
      switch ($$2) {
         case g:
            if (!this.e.P_()) {
               clo $$3 = this.e.b(bja.b);
               this.e.a(bja.b, this.e.b(bja.a));
               this.e.a(bja.a, $$3);
               this.e.fu();
            }

            return;
         case e:
            if (!this.e.P_()) {
               this.e.a(false);
            }

            return;
         case d:
            if (!this.e.P_()) {
               this.e.a(true);
            }

            return;
         case f:
            this.e.ft();
            return;
         case a:
         case b:
         case c:
            this.e.e.a($$1, $$2, $$0.d(), this.e.dN().ak(), $$0.f());
            this.e.c.a($$0.f());
            return;
         default:
            throw new IllegalArgumentException("Invalid player action");
      }
   }

   private static boolean a(amj $$0, clo $$1) {
      if ($$1.b()) {
         return false;
      } else {
         clj $$2 = $$1.d();
         return ($$2 instanceof cjh || $$2 instanceof cjp) && !$$0.go().a($$2);
      }
   }

   @Override
   public void a(aek $$0) {
      wq.a($$0, this, this.e.z());
      this.e.c.a($$0.e());
      ami $$1 = this.e.z();
      bja $$2 = $$0.a();
      clo $$3 = this.e.b($$2);
      if ($$3.a($$1.H())) {
         ejv $$4 = $$0.d();
         ejz $$5 = $$4.e();
         hx $$6 = $$4.a();
         ejz $$7 = ejz.b($$6);
         if (!(this.e.br().g($$7) > d)) {
            ejz $$8 = $$5.d($$7);
            double $$9 = 1.0000001;
            if (Math.abs($$8.a()) < 1.0000001 && Math.abs($$8.b()) < 1.0000001 && Math.abs($$8.c()) < 1.0000001) {
               ib $$10 = $$4.b();
               this.e.G();
               int $$11 = this.e.dN().ak();
               if ($$6.v() < $$11) {
                  if (this.B == null && this.e.i((double)$$6.u() + 0.5, (double)$$6.v() + 0.5, (double)$$6.w() + 0.5) < 64.0 && $$1.a(this.e, $$6)) {
                     bjb $$12 = this.e.e.a(this.e, $$1, $$3, $$2, $$4);
                     if ($$10 == ib.b && !$$12.a() && $$6.v() >= $$11 - 1 && a(this.e, $$3)) {
                        uv $$13 = uv.a("build.tooHigh", $$11 - 1).a(n.m);
                        this.e.b($$13, true);
                     } else if ($$12.b()) {
                        this.e.a($$2, true);
                     }
                  }
               } else {
                  uv $$14 = uv.a("build.tooHigh", $$11 - 1).a(n.m);
                  this.e.b($$14, true);
               }

               this.e.c.b(new yq($$1, $$6));
               this.e.c.b(new yq($$1, $$6.a($$10)));
            } else {
               g.warn("Rejecting UseItemOnPacket from {}: Location {} too far away from hit block {}.", new Object[]{this.e.fS().getName(), $$5, $$6});
            }
         }
      }
   }

   @Override
   public void a(ael $$0) {
      wq.a($$0, this, this.e.z());
      this.a($$0.d());
      ami $$1 = this.e.z();
      bja $$2 = $$0.a();
      clo $$3 = this.e.b($$2);
      this.e.G();
      if (!$$3.b() && $$3.a($$1.H())) {
         bjb $$4 = this.e.e.a(this.e, $$1, $$3, $$2);
         if ($$4.b()) {
            this.e.a($$2, true);
         }
      }
   }

   @Override
   public void a(aej $$0) {
      wq.a($$0, this, this.e.z());
      if (this.e.P_()) {
         for (ami $$1 : this.b.H()) {
            bkv $$2 = $$0.a($$1);
            if ($$2 != null) {
               this.e.a($$1, $$2.ds(), $$2.du(), $$2.dy(), $$2.dD(), $$2.dF());
               return;
            }
         }
      }
   }

   @Override
   public void a(ado $$0) {
      wq.a($$0, this, this.e.z());
      if (this.e.db() instanceof cfs $$2) {
         $$2.a($$0.a(), $$0.d());
      }
   }

   @Override
   public void a(uv $$0) {
      g.info("{} lost connection: {}", this.e.ad().getString(), $$0.getString());
      this.q();
      super.a($$0);
   }

   private void q() {
      this.P.close();
      this.b.at();
      this.b.ae().a(uv.a("multiplayer.player.left", this.e.Q_()).a(n.o), false);
      this.e.u();
      this.b.ae().c(this.e);
      this.e.X().b();
   }

   public void a(int $$0) {
      if ($$0 < 0) {
         throw new IllegalArgumentException("Expected packet sequence nr >= 0");
      } else {
         this.l = Math.max($$0, this.l);
      }
   }

   @Override
   public void a(aeb $$0) {
      wq.a($$0, this, this.e.z());
      if ($$0.a() >= 0 && $$0.a() < cdy.g()) {
         if (this.e.fT().l != $$0.a() && this.e.fp() == bja.a) {
            this.e.fu();
         }

         this.e.fT().l = $$0.a();
         this.e.G();
      } else {
         g.warn("{} tried to set an invalid carried item", this.e.ad().getString());
      }
   }

   @Override
   public void a(acx $$0) {
      if (c($$0.a())) {
         this.b(uv.c("multiplayer.disconnect.illegal_characters"));
      } else {
         Optional<vc> $$1 = this.a($$0.a(), $$0.d(), $$0.g());
         if ($$1.isPresent()) {
            this.b.g(() -> {
               vl $$2;
               try {
                  $$2 = this.a($$0, $$1.get());
               } catch (vp.a var6) {
                  this.a(var6);
                  return;
               }

               CompletableFuture<amz> $$5 = this.a($$2.b());
               uv $$6 = this.b.bi().decorate(this.e, $$2.c());
               this.P.append($$5, $$2x -> {
                  vl $$3 = $$2.a($$6).a($$2x.e());
                  this.b($$3);
               });
            });
         }
      }
   }

   @Override
   public void a(acw $$0) {
      if (c($$0.a())) {
         this.b(uv.c("multiplayer.disconnect.illegal_characters"));
      } else {
         Optional<vc> $$1 = this.a($$0.a(), $$0.d(), $$0.g());
         if ($$1.isPresent()) {
            this.b.g(() -> {
               this.a($$0, $$1.get());
               this.r();
            });
         }
      }
   }

   private void a(acw $$0, vc $$1) {
      ParseResults<du> $$2 = this.b($$0.a());

      Map<String, vl> $$3;
      try {
         $$3 = this.a($$0, vn.a($$2), $$1);
      } catch (vp.a var6) {
         this.a(var6);
         return;
      }

      ds $$6 = new ds.a($$3);
      $$2 = dv.a($$2, $$1x -> $$1x.a($$6, this.P));
      this.b.aE().a($$2, $$0.a());
   }

   private void a(vp.a $$0) {
      if ($$0.a()) {
         this.b($$0.b());
      } else {
         this.e.a($$0.b().f().a(n.m));
      }
   }

   private Map<String, vl> a(acw $$0, vn<?> $$1, vc $$2) throws vp.a {
      Map<String, vl> $$3 = new Object2ObjectOpenHashMap();

      for (vn.a<?> $$4 : $$1.a()) {
         vh $$5 = $$0.f().a($$4.a());
         vo $$6 = new vo($$4.c(), $$0.d(), $$0.e(), $$2);
         $$3.put($$4.a(), this.M.unpack($$5, $$6));
      }

      return $$3;
   }

   private ParseResults<du> b(String $$0) {
      CommandDispatcher<du> $$1 = this.b.aE().a();
      return $$1.parse($$0, this.e.de());
   }

   private Optional<vc> a(String $$0, Instant $$1, vc.b $$2) {
      if (!this.a($$1)) {
         g.warn("{} sent out-of-order chat: '{}'", this.e.ad().getString(), $$0);
         this.b(uv.c("multiplayer.disconnect.out_of_order_chat"));
         return Optional.empty();
      } else {
         Optional<vc> $$3 = this.a($$2);
         if (this.e.D() == cdx.c) {
            this.b(new acb(uv.c("chat.disabled.options").a(n.m), false));
            return Optional.empty();
         } else {
            this.e.G();
            return $$3;
         }
      }
   }

   private Optional<vc> a(vc.b $$0) {
      synchronized (this.N) {
         Optional<vc> $$1 = this.N.a($$0);
         if ($$1.isEmpty()) {
            g.warn("Failed to validate message acknowledgements from {}", this.e.ad().getString());
            this.b(j);
         }

         return $$1;
      }
   }

   private boolean a(Instant $$0) {
      Instant $$1;
      do {
         $$1 = this.K.get();
         if ($$0.isBefore($$1)) {
            return false;
         }
      } while (!this.K.compareAndSet($$1, $$0));

      return true;
   }

   private static boolean c(String $$0) {
      for (int $$1 = 0; $$1 < $$0.length(); $$1++) {
         if (!aa.a($$0.charAt($$1))) {
            return true;
         }
      }

      return false;
   }

   private vl a(acx $$0, vc $$1) throws vp.a {
      vo $$2 = new vo($$0.a(), $$0.d(), $$0.e(), $$1);
      return this.M.unpack($$0.f(), $$2);
   }

   private void b(vl $$0) {
      this.b.ae().a($$0, this.e, ur.a(ur.c, this.e));
      this.r();
   }

   private void r() {
      this.m += 20;
      if (this.m > 200 && !this.b.ae().f(this.e.fS())) {
         this.b(uv.c("disconnect.spam"));
      }
   }

   @Override
   public void a(acv $$0) {
      synchronized (this.N) {
         if (!this.N.a($$0.a())) {
            g.warn("Failed to validate message acknowledgements from {}", this.e.ad().getString());
            this.b(j);
         }
      }
   }

   @Override
   public void a(aei $$0) {
      wq.a($$0, this, this.e.z());
      this.e.G();
      this.e.a($$0.a());
   }

   @Override
   public void a(adt $$0) {
      wq.a($$0, this, this.e.z());
      this.e.G();
      switch ($$0.d()) {
         case a:
            this.e.f(true);
            break;
         case b:
            this.e.f(false);
            break;
         case d:
            this.e.g(true);
            break;
         case e:
            this.e.g(false);
            break;
         case c:
            if (this.e.fE()) {
               this.e.a(false, true);
               this.B = this.e.dl();
            }
            break;
         case f:
            if (this.e.db() instanceof blw $$1) {
               int $$2 = $$0.e();
               if ($$1.a() && $$2 > 0) {
                  $$1.c($$2);
               }
            }
            break;
         case g:
            if (this.e.db() instanceof blw $$3) {
               $$3.b();
            }
            break;
         case h:
            if (this.e.da() instanceof ble $$4) {
               $$4.b(this.e);
            }
            break;
         case i:
            if (!this.e.fY()) {
               this.e.ga();
            }
            break;
         default:
            throw new IllegalArgumentException("Invalid client command!");
      }
   }

   public void a(vl $$0) {
      vh $$1 = $$0.k();
      if ($$1 != null) {
         this.O.a($$0);
         int $$2;
         synchronized (this.N) {
            this.N.a($$1);
            $$2 = this.N.a();
         }

         if ($$2 > 4096) {
            this.b(uv.c("multiplayer.disconnect.too_many_pending_chats"));
         }
      }
   }

   public void a(vl $$0, ur.a $$1) {
      this.b(new aag($$0.j().c(), $$0.j().b(), $$0.k(), $$0.l().a(this.O), $$0.m(), $$0.n(), $$1.a(this.e.dN().I_())));
      this.a($$0);
   }

   public void a(uv $$0, ur.a $$1) {
      this.b(new zi($$0, $$1.a(this.e.dN().I_())));
   }

   public SocketAddress n() {
      return this.c.f();
   }

   public void o() {
      this.Q = true;
      this.q();
      this.b(new abz());
   }

   @Override
   public void a(afp $$0) {
      this.c.a(new afl($$0.a()));
   }

   @Override
   public void a(adj $$0) {
      wq.a($$0, this, this.e.z());
      final ami $$1 = this.e.z();
      final bkv $$2 = $$0.a($$1);
      this.e.G();
      this.e.f($$0.a());
      if ($$2 != null) {
         if (!$$1.D_().a($$2.dn())) {
            return;
         }

         eju $$3 = $$2.cH();
         if ($$3.e(this.e.br()) < d) {
            $$0.a(new adj.c() {
               private void a(bja $$0, anh.a $$1x) {
                  clo $$2 = anh.this.e.b($$0);
                  if ($$2.a($$1.H())) {
                     clo $$3 = $$2.p();
                     bjb $$4 = $$1.run(anh.this.e, $$2, $$0);
                     if ($$4.a()) {
                        al.Q.a(anh.this.e, $$3, $$2);
                        if ($$4.b()) {
                           anh.this.e.a($$0, true);
                        }
                     }
                  }
               }

               @Override
               public void a(bja $$0) {
                  this.a($$0, cdz::a);
               }

               @Override
               public void a(bja $$0, ejz $$1x) {
                  this.a($$0, ($$1xxx, $$2xx, $$3) -> $$2xx.a($$1xxx, $$1, $$3));
               }

               @Override
               public void a() {
                  if (!($$2 instanceof cas) && !($$2 instanceof blb) && !($$2 instanceof cef) && $$2 != anh.this.e) {
                     clo $$0 = anh.this.e.b(bja.a);
                     if ($$0.a($$1.H())) {
                        anh.this.e.d($$2);
                     }
                  } else {
                     anh.this.b(uv.c("multiplayer.disconnect.invalid_entity_attacked"));
                     anh.g.warn("Player {} tried to attack an invalid entity", anh.this.e.ad().getString());
                  }
               }
            });
         }
      }
   }

   @Override
   public void a(ada $$0) {
      wq.a($$0, this, this.e.z());
      this.e.G();
      ada.a $$1 = $$0.a();
      switch ($$1) {
         case a:
            if (this.e.f) {
               this.e.f = false;
               this.e = this.b.ae().a(this.e, true);
               al.v.a(this.e, csf.j, csf.h);
            } else {
               if (this.e.ew() > 0.0F) {
                  return;
               }

               this.e = this.b.ae().a(this.e, false);
               if (this.b.h()) {
                  this.e.a(csc.d);
                  this.e.dN().Y().a(csb.r).a(false, this.b);
               }
            }
            break;
         case b:
            this.e.H().a(this.e);
      }
   }

   @Override
   public void a(adf $$0) {
      wq.a($$0, this, this.e.z());
      this.e.s();
   }

   @Override
   public void a(ade $$0) {
      wq.a($$0, this, this.e.z());
      this.e.G();
      if (this.e.bS.j == $$0.a()) {
         if (this.e.P_()) {
            this.e.bS.b();
         } else if (!this.e.bS.a(this.e)) {
            g.debug("Player {} interacted with invalid menu {}", this.e, this.e.bS);
         } else {
            int $$1 = $$0.d();
            if (!this.e.bS.a($$1)) {
               g.debug("Player {} clicked invalid slot index: {}, available slots: {}", new Object[]{this.e.ad(), $$1, this.e.bS.i.size()});
            } else {
               boolean $$2 = $$0.i() != this.e.bS.j();
               this.e.bS.h();
               this.e.bS.a($$1, $$0.e(), $$0.h(), this.e);
               ObjectIterator var4 = Int2ObjectMaps.fastIterable($$0.g()).iterator();

               while (var4.hasNext()) {
                  Entry<clo> $$3 = (Entry<clo>)var4.next();
                  this.e.bS.b($$3.getIntKey(), (clo)$$3.getValue());
               }

               this.e.bS.a($$0.f());
               this.e.bS.i();
               if ($$2) {
                  this.e.bS.e();
               } else {
                  this.e.bS.d();
               }
            }
         }
      }
   }

   @Override
   public void a(adq $$0) {
      wq.a($$0, this, this.e.z());
      this.e.G();
      if (!this.e.P_() && this.e.bS.j == $$0.a() && this.e.bS instanceof cie) {
         if (!this.e.bS.a(this.e)) {
            g.debug("Player {} interacted with invalid menu {}", this.e, this.e.bS);
         } else {
            this.b.aG().a($$0.d()).ifPresent($$1 -> ((cie)this.e.bS).a($$0.e(), (cov<?>)$$1, this.e));
         }
      }
   }

   @Override
   public void a(add $$0) {
      wq.a($$0, this, this.e.z());
      this.e.G();
      if (this.e.bS.j == $$0.a() && !this.e.P_()) {
         if (!this.e.bS.a(this.e)) {
            g.debug("Player {} interacted with invalid menu {}", this.e, this.e.bS);
         } else {
            boolean $$1 = this.e.bS.b(this.e, $$0.d());
            if ($$1) {
               this.e.bS.d();
            }
         }
      }
   }

   @Override
   public void a(aee $$0) {
      wq.a($$0, this, this.e.z());
      if (this.e.e.e()) {
         boolean $$1 = $$0.a() < 0;
         clo $$2 = $$0.d();
         if (!$$2.a(this.e.dN().H())) {
            return;
         }

         sd $$3 = cjh.a($$2);
         if (!$$2.b() && $$3 != null && $$3.e("x") && $$3.e("y") && $$3.e("z")) {
            hx $$4 = dfi.c($$3);
            if (this.e.dN().o($$4)) {
               dfi $$5 = this.e.dN().c_($$4);
               if ($$5 != null) {
                  $$5.e($$2);
               }
            }
         }

         boolean $$6 = $$0.a() >= 1 && $$0.a() <= 45;
         boolean $$7 = $$2.b() || $$2.k() >= 0 && $$2.L() <= 64 && !$$2.b();
         if ($$6 && $$7) {
            this.e.bR.b($$0.a()).e($$2);
            this.e.bR.d();
         } else if ($$1 && $$7 && this.n < 200) {
            this.n += 20;
            this.e.a($$2, true);
         }
      }
   }

   @Override
   public void a(aeh $$0) {
      List<String> $$1 = Stream.of($$0.e()).map(n::a).collect(Collectors.toList());
      this.a($$1).thenAcceptAsync($$1x -> this.a($$0, $$1x), this.b);
   }

   private void a(aeh $$0, List<amz> $$1) {
      this.e.G();
      ami $$2 = this.e.z();
      hx $$3 = $$0.a();
      if ($$2.A($$3)) {
         if (!($$2.c_($$3) instanceof dgr $$5)) {
            return;
         }

         $$5.a(this.e, $$0.d(), $$1);
      }
   }

   @Override
   public void a(adr $$0) {
      wq.a($$0, this, this.e.z());
      this.e.fU().b = $$0.a() && this.e.fU().c;
   }

   @Override
   public void a(wz $$0) {
      wq.a($$0, this, this.e.z());
      this.e.a($$0.a());
   }

   @Override
   public void a(acu $$0) {
      wq.a($$0, this, this.e.z());
      if (this.e.l(2) || this.i()) {
         this.b.a($$0.a(), false);
      }
   }

   @Override
   public void a(adl $$0) {
      wq.a($$0, this, this.e.z());
      if (this.e.l(2) || this.i()) {
         this.b.b($$0.a());
      }
   }

   @Override
   public void a(acy $$0) {
      wq.a($$0, this, this.e.z());
      vm.a $$1 = $$0.a();
      cec.a $$2 = this.L != null ? this.L.d().b() : null;
      cec.a $$3 = $$1.b();
      if (!Objects.equals($$2, $$3)) {
         if ($$2 != null && $$3.b().isBefore($$2.b())) {
            this.b(cec.a);
         } else {
            try {
               auc $$4 = this.b.ap();
               if ($$4 == null) {
                  g.warn("Ignoring chat session from {} due to missing Services public key", this.e.fS().getName());
                  return;
               }

               this.a($$1.a(this.e.fS(), $$4));
            } catch (cec.b var6) {
               g.error("Failed to validate profile key: {}", var6.getMessage());
               this.b(var6.b());
            }
         }
      }
   }

   @Override
   public void a(adc $$0) {
      if (!this.Q) {
         throw new IllegalStateException("Client acknowledged config, but none was requested");
      } else {
         this.c.a(new anf(this.b, this.c, this.a(this.e.B())));
      }
   }

   @Override
   public void a(acz $$0) {
      wq.a($$0, this, this.e.z());
      this.f.a($$0.a());
   }

   private void a(vm $$0) {
      this.L = $$0;
      this.M = $$0.a(this.e.cw());
      this.P.append(() -> {
         this.e.a($$0);
         this.b.ae().a(new aal(EnumSet.of(aal.a.b), List.of(this.e)));
      });
   }

   @Override
   public amj p() {
      return this.e;
   }

   @FunctionalInterface
   interface a {
      bjb run(amj var1, bkv var2, bja var3);
   }
}
