import com.google.common.collect.Lists;
import com.google.common.primitives.Floats;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.ParseResults;
import com.mojang.brigadier.StringReader;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap.Entry;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.net.SocketAddress;
import java.time.Duration;
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

public class aiy implements ajb, so, zb {
   static final Logger c = LogUtils.getLogger();
   private static final int d = 15000;
   public static final double a = apa.k(6.0);
   private static final int e = -1;
   private static final int f = 4096;
   private static final sw g = sw.c("multiplayer.disconnect.chat_validation_failed");
   private final sd h;
   private final MinecraftServer i;
   public aig b;
   private int j;
   private int k = -1;
   private long l;
   private boolean m;
   private long n;
   private int o;
   private int p;
   private double q;
   private double r;
   private double s;
   private double t;
   private double u;
   private double v;
   @Nullable
   private bfj w;
   private double x;
   private double y;
   private double z;
   private double A;
   private double B;
   private double C;
   @Nullable
   private eei D;
   private int E;
   private int F;
   private boolean G;
   private int H;
   private boolean I;
   private int J;
   private int K;
   private int L;
   private final AtomicReference<Instant> M = new AtomicReference<>(Instant.EPOCH);
   @Nullable
   private tm N;
   private tp.b O;
   private final te P = new te(20);
   private final ti Q = ti.a();
   private final aop R;

   public aiy(MinecraftServer $$0, sd $$1, aig $$2) {
      this.i = $$0;
      this.h = $$1;
      $$1.a(this);
      this.b = $$2;
      $$2.c = this;
      this.l = ac.b();
      $$2.T().a();
      this.O = $$0.aw() ? tp.b.a : tp.b.unsigned($$2.ct());
      this.R = new aop($$0);
   }

   @Override
   public void c() {
      if (this.k > -1) {
         this.a(new ux(this.k));
         this.k = -1;
      }

      this.d();
      this.b.J = this.b.dn();
      this.b.K = this.b.dp();
      this.b.L = this.b.dt();
      this.b.m();
      this.b.a(this.q, this.r, this.s, this.b.dy(), this.b.dA());
      this.j++;
      this.L = this.K;
      if (this.G && !this.b.fy() && !this.b.bM() && !this.b.es()) {
         if (++this.H > 80) {
            c.warn("{} was kicked for floating too long!", this.b.Z().getString());
            this.b(sw.c("multiplayer.disconnect.flying"));
            return;
         }
      } else {
         this.G = false;
         this.H = 0;
      }

      this.w = this.b.cT();
      if (this.w != this.b && this.w.cL() == this.b) {
         this.x = this.w.dn();
         this.y = this.w.dp();
         this.z = this.w.dt();
         this.A = this.w.dn();
         this.B = this.w.dp();
         this.C = this.w.dt();
         if (this.I && this.b.cT().cL() == this.b) {
            if (++this.J > 80) {
               c.warn("{} was kicked for floating a vehicle too long!", this.b.Z().getString());
               this.b(sw.c("multiplayer.disconnect.flying"));
               return;
            }
         } else {
            this.I = false;
            this.J = 0;
         }
      } else {
         this.w = null;
         this.I = false;
         this.J = 0;
      }

      this.i.aN().a("keepAlive");
      long $$0 = ac.b();
      if ($$0 - this.l >= 15000L) {
         if (this.m) {
            this.b(sw.c("disconnect.timeout"));
         } else {
            this.m = true;
            this.l = $$0;
            this.n = $$0;
            this.a(new wb(this.n));
         }
      }

      this.i.aN().c();
      if (this.o > 0) {
         this.o--;
      }

      if (this.p > 0) {
         this.p--;
      }

      if (this.b.I() > 0L && this.i.al() > 0 && ac.b() - this.b.I() > (long)this.i.al() * 1000L * 60L) {
         this.b(sw.c("multiplayer.disconnect.idling"));
      }
   }

   public void d() {
      this.q = this.b.dn();
      this.r = this.b.dp();
      this.s = this.b.dt();
      this.t = this.b.dn();
      this.u = this.b.dp();
      this.v = this.b.dt();
   }

   @Override
   public boolean a() {
      return this.h.h();
   }

   private boolean g() {
      return this.i.a(this.b.fM());
   }

   public void b(sw $$0) {
      this.h.a(new vs($$0), sl.a(() -> this.h.a($$0)));
      this.h.l();
      this.i.h(this.h::m);
   }

   private <T, R> CompletableFuture<R> a(T $$0, BiFunction<ajd, T, CompletableFuture<R>> $$1) {
      return $$1.apply(this.b.T(), $$0).thenApply($$0x -> {
         if (!this.a()) {
            c.debug("Ignoring packet due to disconnection");
            throw new CancellationException("disconnected");
         } else {
            return (R)$$0x;
         }
      });
   }

   private CompletableFuture<aiu> a(String $$0) {
      return this.a($$0, ajd::a);
   }

   private CompletableFuture<List<aiu>> a(List<String> $$0) {
      return this.a($$0, ajd::a);
   }

   @Override
   public void a(aaf $$0) {
      uq.a($$0, this, this.b.x());
      this.b.a($$0.a(), $$0.c(), $$0.d(), $$0.e());
   }

   private static boolean b(double $$0, double $$1, double $$2, float $$3, float $$4) {
      return Double.isNaN($$0) || Double.isNaN($$1) || Double.isNaN($$2) || !Floats.isFinite($$4) || !Floats.isFinite($$3);
   }

   private static double a(double $$0) {
      return apa.a($$0, -3.0E7, 3.0E7);
   }

   private static double b(double $$0) {
      return apa.a($$0, -2.0E7, 2.0E7);
   }

   @Override
   public void a(zy $$0) {
      uq.a($$0, this, this.b.x());
      if (b($$0.a(), $$0.c(), $$0.d(), $$0.e(), $$0.f())) {
         this.b(sw.c("multiplayer.disconnect.invalid_vehicle_movement"));
      } else {
         bfj $$1 = this.b.cT();
         if ($$1 != this.b && $$1.cL() == this.b && $$1 == this.w) {
            aif $$2 = this.b.x();
            double $$3 = $$1.dn();
            double $$4 = $$1.dp();
            double $$5 = $$1.dt();
            double $$6 = a($$0.a());
            double $$7 = b($$0.c());
            double $$8 = a($$0.d());
            float $$9 = apa.g($$0.e());
            float $$10 = apa.g($$0.f());
            double $$11 = $$6 - this.x;
            double $$12 = $$7 - this.y;
            double $$13 = $$8 - this.z;
            double $$14 = $$1.dl().g();
            double $$15 = $$11 * $$11 + $$12 * $$12 + $$13 * $$13;
            if ($$15 - $$14 > 100.0 && !this.g()) {
               c.warn("{} (vehicle of {}) moved too quickly! {},{},{}", new Object[]{$$1.Z().getString(), this.b.Z().getString(), $$11, $$12, $$13});
               this.h.a(new wm($$1));
               return;
            }

            boolean $$16 = $$2.a($$1, $$1.cE().h(0.0625));
            $$11 = $$6 - this.A;
            $$12 = $$7 - this.B - 1.0E-6;
            $$13 = $$8 - this.C;
            boolean $$17 = $$1.Q;
            if ($$1 instanceof bfz $$18 && $$18.i_()) {
               $$18.n();
            }

            $$1.a(bgf.b, new eei($$11, $$12, $$13));
            $$11 = $$6 - $$1.dn();
            $$12 = $$7 - $$1.dp();
            if ($$12 > -0.5 || $$12 < 0.5) {
               $$12 = 0.0;
            }

            $$13 = $$8 - $$1.dt();
            $$15 = $$11 * $$11 + $$12 * $$12 + $$13 * $$13;
            boolean $$20 = false;
            if ($$15 > 0.0625) {
               $$20 = true;
               c.warn("{} (vehicle of {}) moved wrongly! {}", new Object[]{$$1.Z().getString(), this.b.Z().getString(), Math.sqrt($$15)});
            }

            $$1.a($$6, $$7, $$8, $$9, $$10);
            boolean $$21 = $$2.a($$1, $$1.cE().h(0.0625));
            if ($$16 && ($$20 || !$$21)) {
               $$1.a($$3, $$4, $$5, $$9, $$10);
               this.h.a(new wm($$1));
               return;
            }

            this.b.x().k().a(this.b);
            this.b.r(this.b.dn() - $$3, this.b.dp() - $$4, this.b.dt() - $$5);
            this.I = $$12 >= -0.03125 && !$$17 && !this.i.Z() && !$$1.aR() && this.a($$1);
            this.A = $$1.dn();
            this.B = $$1.dp();
            this.C = $$1.dt();
         }
      }
   }

   private boolean a(bfj $$0) {
      return $$0.dI().a($$0.cE().g(0.0625).b(0.0, -0.55, 0.0)).allMatch(dca.a::i);
   }

   @Override
   public void a(zd $$0) {
      uq.a($$0, this, this.b.x());
      if ($$0.a() == this.E) {
         if (this.D == null) {
            this.b(sw.c("multiplayer.disconnect.invalid_player_movement"));
            return;
         }

         this.b.a(this.D.c, this.D.d, this.D.e, this.b.dy(), this.b.dA());
         this.t = this.D.c;
         this.u = this.D.d;
         this.v = this.D.e;
         if (this.b.K()) {
            this.b.L();
         }

         this.D = null;
      }
   }

   @Override
   public void a(aai $$0) {
      uq.a($$0, this, this.b.x());
      this.i.aE().a($$0.a()).ifPresent(this.b.E()::e);
   }

   @Override
   public void a(aah $$0) {
      uq.a($$0, this, this.b.x());
      this.b.E().a($$0.a(), $$0.c(), $$0.d());
   }

   @Override
   public void a(aal $$0) {
      uq.a($$0, this, this.b.x());
      if ($$0.c() == aal.a.a) {
         acq $$1 = $$0.d();
         ae $$2 = this.i.az().a($$1);
         if ($$2 != null) {
            this.b.M().a($$2);
         }
      }
   }

   @Override
   public void a(zm $$0) {
      uq.a($$0, this, this.b.x());
      StringReader $$1 = new StringReader($$0.c());
      if ($$1.canRead() && $$1.peek() == '/') {
         $$1.skip();
      }

      ParseResults<ds> $$2 = this.i.aC().a().parse($$1, this.b.da());
      this.i.aC().a().getCompletionSuggestions($$2).thenAccept($$1x -> this.h.a(new vh($$0.a(), $$1x)));
   }

   @Override
   public void a(aap $$0) {
      uq.a($$0, this, this.b.x());
      if (!this.i.o()) {
         this.b.a(sw.c("advMode.notEnabled"));
      } else if (!this.b.gk()) {
         this.b.a(sw.c("advMode.notAllowed"));
      } else {
         cln $$1 = null;
         czx $$2 = null;
         gu $$3 = $$0.a();
         czn $$4 = this.b.dI().c_($$3);
         if ($$4 instanceof czx) {
            $$2 = (czx)$$4;
            $$1 = $$2.c();
         }

         String $$5 = $$0.c();
         boolean $$6 = $$0.d();
         if ($$1 != null) {
            czx.a $$7 = $$2.v();
            dcb $$8 = this.b.dI().a_($$3);
            ha $$9 = $$8.c(cqu.a);

            dcb $$13 = (switch ($$0.g()) {
               case a -> cpo.kH.n();
               case b -> cpo.kG.n();
               default -> cpo.fN.n();
            }).a(cqu.a, $$9).a(cqu.b, Boolean.valueOf($$0.e()));
            if ($$13 != $$8) {
               this.b.dI().a($$3, $$13, 2);
               $$4.b($$13);
               this.b.dI().l($$3).a($$4);
            }

            $$1.a($$5);
            $$1.a($$6);
            if (!$$6) {
               $$1.c(null);
            }

            $$2.b($$0.f());
            if ($$7 != $$0.g()) {
               $$2.g();
            }

            $$1.f();
            if (!aps.b($$5)) {
               this.b.a(sw.a("advMode.setCommand.success", $$5));
            }
         }
      }
   }

   @Override
   public void a(aaq $$0) {
      uq.a($$0, this, this.b.x());
      if (!this.i.o()) {
         this.b.a(sw.c("advMode.notEnabled"));
      } else if (!this.b.gk()) {
         this.b.a(sw.c("advMode.notAllowed"));
      } else {
         cln $$1 = $$0.a(this.b.dI());
         if ($$1 != null) {
            $$1.a($$0.a());
            $$1.a($$0.c());
            if (!$$0.c()) {
               $$1.c(null);
            }

            $$1.f();
            this.b.a(sw.a("advMode.setCommand.success", $$0.a()));
         }
      }
   }

   @Override
   public void a(aaa $$0) {
      uq.a($$0, this, this.b.x());
      this.b.fN().c($$0.a());
      this.b.c.a(new vm(-2, 0, this.b.fN().l, this.b.fN().a(this.b.fN().l)));
      this.b.c.a(new vm(-2, 0, $$0.a(), this.b.fN().a($$0.a())));
      this.b.c.a(new xr(this.b.fN().l));
   }

   @Override
   public void a(aaj $$0) {
      uq.a($$0, this, this.b.x());
      if (this.b.bR instanceof cbh $$1) {
         if (!$$1.a(this.b)) {
            c.debug("Player {} interacted with invalid menu {}", this.b, $$1);
            return;
         }

         $$1.a($$0.a());
      }
   }

   @Override
   public void a(aan $$0) {
      uq.a($$0, this, this.b.x());
      if (this.b.bR instanceof cbi $$1) {
         if (!this.b.bR.a(this.b)) {
            c.debug("Player {} interacted with invalid menu {}", this.b, this.b.bR);
            return;
         }

         $$1.a($$0.a(), $$0.c());
      }
   }

   @Override
   public void a(aat $$0) {
      uq.a($$0, this, this.b.x());
      if (this.b.gk()) {
         gu $$1 = $$0.a();
         dcb $$2 = this.b.dI().a_($$1);
         if (this.b.dI().c_($$1) instanceof dba $$4) {
            $$4.a($$0.d());
            $$4.a($$0.e());
            $$4.a($$0.f());
            $$4.a($$0.g());
            $$4.a($$0.h());
            $$4.a($$0.i());
            $$4.b($$0.j());
            $$4.a($$0.k());
            $$4.d($$0.l());
            $$4.e($$0.m());
            $$4.a($$0.n());
            $$4.a($$0.o());
            if ($$4.g()) {
               String $$5 = $$4.d();
               if ($$0.c() == dba.a.b) {
                  if ($$4.D()) {
                     this.b.a(sw.a("structure_block.save_success", $$5), false);
                  } else {
                     this.b.a(sw.a("structure_block.save_failure", $$5), false);
                  }
               } else if ($$0.c() == dba.a.c) {
                  if (!$$4.F()) {
                     this.b.a(sw.a("structure_block.load_not_found", $$5), false);
                  } else if ($$4.a(this.b.x())) {
                     this.b.a(sw.a("structure_block.load_success", $$5), false);
                  } else {
                     this.b.a(sw.a("structure_block.load_prepare", $$5), false);
                  }
               } else if ($$0.c() == dba.a.d) {
                  if ($$4.C()) {
                     this.b.a(sw.a("structure_block.size_success", $$5), false);
                  } else {
                     this.b.a(sw.c("structure_block.size_failure"), false);
                  }
               }
            } else {
               this.b.a(sw.a("structure_block.invalid_structure_name", $$0.e()), false);
            }

            $$4.e();
            this.b.dI().a($$1, $$2, $$2, 3);
         }
      }
   }

   @Override
   public void a(aas $$0) {
      uq.a($$0, this, this.b.x());
      if (this.b.gk()) {
         gu $$1 = $$0.a();
         dcb $$2 = this.b.dI().a_($$1);
         if (this.b.dI().c_($$1) instanceof dam $$4) {
            $$4.a($$0.c());
            $$4.b($$0.d());
            $$4.a(acp.a(jc.aC, $$0.e()));
            $$4.a($$0.f());
            $$4.a($$0.g());
            $$4.e();
            this.b.dI().a($$1, $$2, $$2, 3);
         }
      }
   }

   @Override
   public void a(zu $$0) {
      uq.a($$0, this, this.b.x());
      if (this.b.gk()) {
         gu $$1 = $$0.a();
         if (this.b.dI().c_($$1) instanceof dam $$3) {
            $$3.a(this.b.x(), $$0.c(), $$0.d());
         }
      }
   }

   @Override
   public void a(aam $$0) {
      uq.a($$0, this, this.b.x());
      int $$1 = $$0.a();
      if (this.b.bR instanceof ccm $$2) {
         if (!$$2.a(this.b)) {
            c.debug("Player {} interacted with invalid menu {}", this.b, $$2);
            return;
         }

         $$2.e($$1);
         $$2.h($$1);
      }
   }

   @Override
   public void a(zr $$0) {
      int $$1 = $$0.d();
      if (byn.d($$1) || $$1 == 40) {
         List<String> $$2 = Lists.newArrayList();
         Optional<String> $$3 = $$0.c();
         $$3.ifPresent($$2::add);
         $$0.a().stream().limit(100L).forEach($$2::add);
         Consumer<List<aiu>> $$4 = $$3.isPresent() ? $$1x -> this.a((aiu)$$1x.get(0), $$1x.subList(1, $$1x.size()), $$1) : $$1x -> this.a($$1x, $$1);
         this.a($$2).thenAcceptAsync($$4, this.i);
      }
   }

   private void a(List<aiu> $$0, int $$1) {
      cfz $$2 = this.b.fN().a($$1);
      if ($$2.a(cgc.tg)) {
         this.a($$0, UnaryOperator.identity(), $$2);
      }
   }

   private void a(aiu $$0, List<aiu> $$1, int $$2) {
      cfz $$3 = this.b.fN().a($$2);
      if ($$3.a(cgc.tg)) {
         cfz $$4 = new cfz(cgc.th);
         qr $$5 = $$3.v();
         if ($$5 != null) {
            $$4.c($$5.h());
         }

         $$4.a("author", ri.a(this.b.Z().getString()));
         if (this.b.U()) {
            $$4.a("title", ri.a($$0.b()));
         } else {
            $$4.a("filtered_title", ri.a($$0.b()));
            $$4.a("title", ri.a($$0.d()));
         }

         this.a($$1, $$0x -> sw.a.a(sw.b($$0x)), $$4);
         this.b.fN().a($$2, $$4);
      }
   }

   private void a(List<aiu> $$0, UnaryOperator<String> $$1, cfz $$2) {
      qx $$3 = new qx();
      if (this.b.U()) {
         $$0.stream().map($$1x -> ri.a($$1.apply($$1x.b()))).forEach($$3::add);
      } else {
         qr $$4 = new qr();
         int $$5 = 0;

         for (int $$6 = $$0.size(); $$5 < $$6; $$5++) {
            aiu $$7 = $$0.get($$5);
            String $$8 = $$7.d();
            $$3.add(ri.a($$1.apply($$8)));
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
   public void a(zs $$0) {
      uq.a($$0, this, this.b.x());
      if (this.b.l(2)) {
         bfj $$1 = this.b.dI().a($$0.c());
         if ($$1 != null) {
            qr $$2 = $$1.f(new qr());
            this.b.c.a(new yq($$0.a(), $$2));
         }
      }
   }

   @Override
   public void a(ze $$0) {
      uq.a($$0, this, this.b.x());
      if (this.b.l(2)) {
         czn $$1 = this.b.dI().c_($$0.c());
         qr $$2 = $$1 != null ? $$1.o() : null;
         this.b.c.a(new yq($$0.a(), $$2));
      }
   }

   @Override
   public void a(zx $$0) {
      uq.a($$0, this, this.b.x());
      if (b($$0.a(0.0), $$0.b(0.0), $$0.c(0.0), $$0.a(0.0F), $$0.b(0.0F))) {
         this.b(sw.c("multiplayer.disconnect.invalid_player_movement"));
      } else {
         aif $$1 = this.b.x();
         if (!this.b.g) {
            if (this.j == 0) {
               this.d();
            }

            if (this.D != null) {
               if (this.j - this.F > 20) {
                  this.F = this.j;
                  this.a(this.D.c, this.D.d, this.D.e, this.b.dy(), this.b.dA());
               }
            } else {
               this.F = this.j;
               double $$2 = a($$0.a(this.b.dn()));
               double $$3 = b($$0.b(this.b.dp()));
               double $$4 = a($$0.c(this.b.dt()));
               float $$5 = apa.g($$0.a(this.b.dy()));
               float $$6 = apa.g($$0.b(this.b.dA()));
               if (this.b.bM()) {
                  this.b.a(this.b.dn(), this.b.dp(), this.b.dt(), $$5, $$6);
                  this.b.x().k().a(this.b);
               } else {
                  double $$7 = this.b.dn();
                  double $$8 = this.b.dp();
                  double $$9 = this.b.dt();
                  double $$10 = $$2 - this.q;
                  double $$11 = $$3 - this.r;
                  double $$12 = $$4 - this.s;
                  double $$13 = this.b.dl().g();
                  double $$14 = $$10 * $$10 + $$11 * $$11 + $$12 * $$12;
                  if (this.b.fy()) {
                     if ($$14 > 1.0) {
                        this.a(this.b.dn(), this.b.dp(), this.b.dt(), $$5, $$6);
                     }
                  } else {
                     this.K++;
                     int $$15 = this.K - this.L;
                     if ($$15 > 5) {
                        c.debug("{} is sending move packets too frequently ({} packets since last tick)", this.b.Z().getString(), $$15);
                        $$15 = 1;
                     }

                     if (!this.b.K() && (!this.b.dI().X().b(cmi.s) || !this.b.fr())) {
                        float $$16 = this.b.fr() ? 300.0F : 100.0F;
                        if ($$14 - $$13 > (double)($$16 * (float)$$15) && !this.g()) {
                           c.warn("{} moved too quickly! {},{},{}", new Object[]{this.b.Z().getString(), $$10, $$11, $$12});
                           this.a(this.b.dn(), this.b.dp(), this.b.dt(), this.b.dy(), this.b.dA());
                           return;
                        }
                     }

                     eed $$17 = this.b.cE();
                     $$10 = $$2 - this.t;
                     $$11 = $$3 - this.u;
                     $$12 = $$4 - this.v;
                     boolean $$18 = $$11 > 0.0;
                     if (this.b.ay() && !$$0.a() && $$18) {
                        this.b.eW();
                     }

                     boolean $$19 = this.b.Q;
                     this.b.a(bgf.b, new eei($$10, $$11, $$12));
                     $$10 = $$2 - this.b.dn();
                     $$11 = $$3 - this.b.dp();
                     if ($$11 > -0.5 || $$11 < 0.5) {
                        $$11 = 0.0;
                     }

                     $$12 = $$4 - this.b.dt();
                     $$14 = $$10 * $$10 + $$11 * $$11 + $$12 * $$12;
                     boolean $$21 = false;
                     if (!this.b.K() && $$14 > 0.0625 && !this.b.fy() && !this.b.e.e() && this.b.e.b() != cmj.d) {
                        $$21 = true;
                        c.warn("{} moved wrongly!", this.b.Z().getString());
                     }

                     if (this.b.ae || this.b.fy() || (!$$21 || !$$1.a(this.b, $$17)) && !this.a($$1, $$17, $$2, $$3, $$4)) {
                        this.b.a($$2, $$3, $$4, $$5, $$6);
                        this.G = $$11 >= -0.03125
                           && !$$19
                           && this.b.e.b() != cmj.d
                           && !this.i.Z()
                           && !this.b.fO().c
                           && !this.b.a(bfc.y)
                           && !this.b.fr()
                           && !this.b.fe()
                           && this.a((bfj)this.b);
                        this.b.x().k().a(this.b);
                        this.b.a(this.b.dn() - $$7, this.b.dp() - $$8, this.b.dt() - $$9, $$0.a());
                        this.b.a($$0.a(), new eei(this.b.dn() - $$7, this.b.dp() - $$8, this.b.dt() - $$9));
                        if ($$18) {
                           this.b.n();
                        }

                        this.b.r(this.b.dn() - $$7, this.b.dp() - $$8, this.b.dt() - $$9);
                        this.t = this.b.dn();
                        this.u = this.b.dp();
                        this.v = this.b.dt();
                     } else {
                        this.a($$7, $$8, $$9, $$5, $$6);
                        this.b.a(this.b.dn() - $$7, this.b.dp() - $$8, this.b.dt() - $$9, $$0.a());
                     }
                  }
               }
            }
         }
      }
   }

   private boolean a(cmp $$0, eed $$1, double $$2, double $$3, double $$4) {
      eed $$5 = this.b.cE().d($$2 - this.b.dn(), $$3 - this.b.dp(), $$4 - this.b.dt());
      Iterable<efb> $$6 = $$0.c(this.b, $$5.h(1.0E-5F));
      efb $$7 = eey.a($$1.h(1.0E-5F));

      for (efb $$8 : $$6) {
         if (!eey.c($$8, $$7, eem.i)) {
            return true;
         }
      }

      return false;
   }

   public void a(double $$0, double $$1, double $$2, float $$3, float $$4) {
      this.a($$0, $$1, $$2, $$3, $$4, Collections.emptySet());
   }

   public void a(double $$0, double $$1, double $$2, float $$3, float $$4, Set<bgn> $$5) {
      double $$6 = $$5.contains(bgn.a) ? this.b.dn() : 0.0;
      double $$7 = $$5.contains(bgn.b) ? this.b.dp() : 0.0;
      double $$8 = $$5.contains(bgn.c) ? this.b.dt() : 0.0;
      float $$9 = $$5.contains(bgn.d) ? this.b.dy() : 0.0F;
      float $$10 = $$5.contains(bgn.e) ? this.b.dA() : 0.0F;
      this.D = new eei($$0, $$1, $$2);
      if (++this.E == Integer.MAX_VALUE) {
         this.E = 0;
      }

      this.F = this.j;
      this.b.a($$0, $$1, $$2, $$3, $$4);
      this.b.c.a(new xa($$0 - $$6, $$1 - $$7, $$2 - $$8, $$3 - $$9, $$4 - $$10, $$5, this.E));
   }

   @Override
   public void a(aad $$0) {
      uq.a($$0, this, this.b.x());
      gu $$1 = $$0.a();
      this.b.C();
      aad.a $$2 = $$0.d();
      switch ($$2) {
         case g:
            if (!this.b.G_()) {
               cfz $$3 = this.b.b(bdw.b);
               this.b.a(bdw.b, this.b.b(bdw.a));
               this.b.a(bdw.a, $$3);
               this.b.fo();
            }

            return;
         case e:
            if (!this.b.G_()) {
               this.b.a(false);
            }

            return;
         case d:
            if (!this.b.G_()) {
               this.b.a(true);
            }

            return;
         case f:
            this.b.fn();
            return;
         case a:
         case b:
         case c:
            this.b.e.a($$1, $$2, $$0.c(), this.b.dI().aj(), $$0.e());
            this.b.c.a($$0.e());
            return;
         default:
            throw new IllegalArgumentException("Invalid player action");
      }
   }

   private static boolean a(aig $$0, cfz $$1) {
      if ($$1.b()) {
         return false;
      } else {
         cfu $$2 = $$1.d();
         return ($$2 instanceof cds || $$2 instanceof cea) && !$$0.gi().a($$2);
      }
   }

   @Override
   public void a(aax $$0) {
      uq.a($$0, this, this.b.x());
      this.b.c.a($$0.d());
      aif $$1 = this.b.x();
      bdw $$2 = $$0.a();
      cfz $$3 = this.b.b($$2);
      if ($$3.a($$1.G())) {
         eee $$4 = $$0.c();
         eei $$5 = $$4.e();
         gu $$6 = $$4.a();
         eei $$7 = eei.b($$6);
         if (!(this.b.bm().g($$7) > a)) {
            eei $$8 = $$5.d($$7);
            double $$9 = 1.0000001;
            if (Math.abs($$8.a()) < 1.0000001 && Math.abs($$8.b()) < 1.0000001 && Math.abs($$8.c()) < 1.0000001) {
               ha $$10 = $$4.b();
               this.b.C();
               int $$11 = this.b.dI().aj();
               if ($$6.v() < $$11) {
                  if (this.D == null && this.b.i((double)$$6.u() + 0.5, (double)$$6.v() + 0.5, (double)$$6.w() + 0.5) < 64.0 && $$1.a(this.b, $$6)) {
                     bdx $$12 = this.b.e.a(this.b, $$1, $$3, $$2, $$4);
                     if ($$10 == ha.b && !$$12.a() && $$6.v() >= $$11 - 1 && a(this.b, $$3)) {
                        sw $$13 = sw.a("build.tooHigh", $$11 - 1).a(n.m);
                        this.b.b($$13, true);
                     } else if ($$12.b()) {
                        this.b.a($$2, true);
                     }
                  }
               } else {
                  sw $$14 = sw.a("build.tooHigh", $$11 - 1).a(n.m);
                  this.b.b($$14, true);
               }

               this.b.c.a(new vb($$1, $$6));
               this.b.c.a(new vb($$1, $$6.a($$10)));
            } else {
               c.warn("Rejecting UseItemOnPacket from {}: Location {} too far away from hit block {}.", new Object[]{this.b.fM().getName(), $$5, $$6});
            }
         }
      }
   }

   @Override
   public void a(aay $$0) {
      uq.a($$0, this, this.b.x());
      this.a($$0.c());
      aif $$1 = this.b.x();
      bdw $$2 = $$0.a();
      cfz $$3 = this.b.b($$2);
      this.b.C();
      if (!$$3.b() && $$3.a($$1.G())) {
         bdx $$4 = this.b.e.a(this.b, $$1, $$3, $$2);
         if ($$4.b()) {
            this.b.a($$2, true);
         }
      }
   }

   @Override
   public void a(aaw $$0) {
      uq.a($$0, this, this.b.x());
      if (this.b.G_()) {
         for (aif $$1 : this.i.F()) {
            bfj $$2 = $$0.a($$1);
            if ($$2 != null) {
               this.b.a($$1, $$2.dn(), $$2.dp(), $$2.dt(), $$2.dy(), $$2.dA());
               return;
            }
         }
      }
   }

   @Override
   public void a(aak $$0) {
      uq.a($$0, this, this.b.x());
      if ($$0.a() == aak.a.b && this.i.T()) {
         c.info("Disconnecting {} due to resource pack rejection", this.b.Z());
         this.b(sw.c("multiplayer.requiredTexturePrompt.disconnect"));
      }
   }

   @Override
   public void a(zz $$0) {
      uq.a($$0, this, this.b.x());
      if (this.b.cX() instanceof cah $$2) {
         $$2.a($$0.a(), $$0.c());
      }
   }

   @Override
   public void a(aag $$0) {
   }

   @Override
   public void a(sw $$0) {
      this.R.close();
      c.info("{} lost connection: {}", this.b.Z().getString(), $$0.getString());
      this.i.ar();
      this.i.ac().a(sw.a("multiplayer.player.left", this.b.H_()).a(n.o), false);
      this.b.s();
      this.i.ac().c(this.b);
      this.b.T().b();
      if (this.g()) {
         c.info("Stopping singleplayer server as player logged out");
         this.i.a(false);
      }
   }

   public void a(int $$0) {
      if ($$0 < 0) {
         throw new IllegalArgumentException("Expected packet sequence nr >= 0");
      } else {
         this.k = Math.max($$0, this.k);
      }
   }

   @Override
   public void a(uo<?> $$0) {
      this.a($$0, null);
   }

   public void a(uo<?> $$0, @Nullable sl $$1) {
      try {
         this.h.a($$0, $$1);
      } catch (Throwable var6) {
         o $$3 = o.a(var6, "Sending packet");
         p $$4 = $$3.a("Packet being sent");
         $$4.a("Packet class", () -> $$0.getClass().getCanonicalName());
         throw new y($$3);
      }
   }

   @Override
   public void a(aao $$0) {
      uq.a($$0, this, this.b.x());
      if ($$0.a() >= 0 && $$0.a() < byn.g()) {
         if (this.b.fN().l != $$0.a() && this.b.fj() == bdw.a) {
            this.b.fo();
         }

         this.b.fN().l = $$0.a();
         this.b.C();
      } else {
         c.warn("{} tried to set an invalid carried item", this.b.Z().getString());
      }
   }

   @Override
   public void a(zi $$0) {
      if (c($$0.a())) {
         this.b(sw.c("multiplayer.disconnect.illegal_characters"));
      } else {
         Optional<tc> $$1 = this.a($$0.a(), $$0.c(), $$0.f());
         if ($$1.isPresent()) {
            this.i.g(() -> {
               tl $$2;
               try {
                  $$2 = this.a($$0, $$1.get());
               } catch (tp.a var6) {
                  this.a(var6);
                  return;
               }

               CompletableFuture<aiu> $$5 = this.a($$2.b());
               CompletableFuture<sw> $$6 = this.i.be().decorate(this.b, $$2.c());
               this.R.append($$3 -> CompletableFuture.allOf($$5, $$6).thenAcceptAsync($$3x -> {
                     tl $$4x = $$2.a($$6.join()).a($$5.join().e());
                     this.b($$4x);
                  }, $$3));
            });
         }
      }
   }

   @Override
   public void a(zh $$0) {
      if (c($$0.a())) {
         this.b(sw.c("multiplayer.disconnect.illegal_characters"));
      } else {
         Optional<tc> $$1 = this.a($$0.a(), $$0.c(), $$0.f());
         if ($$1.isPresent()) {
            this.i.g(() -> {
               this.a($$0, $$1.get());
               this.h();
            });
         }
      }
   }

   private void a(zh $$0, tc $$1) {
      ParseResults<ds> $$2 = this.b($$0.a());

      Map<String, tl> $$3;
      try {
         $$3 = this.a($$0, tn.a($$2), $$1);
      } catch (tp.a var6) {
         this.a(var6);
         return;
      }

      dq $$6 = new dq.a($$3);
      $$2 = dt.a($$2, $$1x -> $$1x.a($$6));
      this.i.aC().a($$2, $$0.a());
   }

   private void a(tp.a $$0) {
      if ($$0.a()) {
         this.b($$0.b());
      } else {
         this.b.a($$0.b().e().a(n.m));
      }
   }

   private Map<String, tl> a(zh $$0, tn<?> $$1, tc $$2) throws tp.a {
      Map<String, tl> $$3 = new Object2ObjectOpenHashMap();

      for (tn.a<?> $$4 : $$1.a()) {
         th $$5 = $$0.e().a($$4.a());
         to $$6 = new to($$4.c(), $$0.c(), $$0.d(), $$2);
         $$3.put($$4.a(), this.O.unpack($$5, $$6));
      }

      return $$3;
   }

   private ParseResults<ds> b(String $$0) {
      CommandDispatcher<ds> $$1 = this.i.aC().a();
      return $$1.parse($$0, this.b.da());
   }

   private Optional<tc> a(String $$0, Instant $$1, tc.b $$2) {
      if (!this.a($$1)) {
         c.warn("{} sent out-of-order chat: '{}'", this.b.Z().getString(), $$0);
         this.b(sw.c("multiplayer.disconnect.out_of_order_chat"));
         return Optional.empty();
      } else {
         Optional<tc> $$3 = this.a($$2);
         if (this.b.A() == bym.c) {
            this.a(new yo(sw.c("chat.disabled.options").a(n.m), false));
            return Optional.empty();
         } else {
            this.b.C();
            return $$3;
         }
      }
   }

   private Optional<tc> a(tc.b $$0) {
      synchronized (this.P) {
         Optional<tc> $$1 = this.P.a($$0);
         if ($$1.isEmpty()) {
            c.warn("Failed to validate message acknowledgements from {}", this.b.Z().getString());
            this.b(g);
         }

         return $$1;
      }
   }

   private boolean a(Instant $$0) {
      Instant $$1;
      do {
         $$1 = this.M.get();
         if ($$0.isBefore($$1)) {
            return false;
         }
      } while (!this.M.compareAndSet($$1, $$0));

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

   private tl a(zi $$0, tc $$1) throws tp.a {
      to $$2 = new to($$0.a(), $$0.c(), $$0.d(), $$1);
      return this.O.unpack($$0.e(), $$2);
   }

   private void b(tl $$0) {
      this.i.ac().a($$0, this.b, ss.a(ss.c, this.b));
      this.h();
   }

   private void h() {
      this.o += 20;
      if (this.o > 200 && !this.i.ac().f(this.b.fM())) {
         this.b(sw.c("disconnect.spam"));
      }
   }

   @Override
   public void a(zg $$0) {
      synchronized (this.P) {
         if (!this.P.a($$0.a())) {
            c.warn("Failed to validate message acknowledgements from {}", this.b.Z().getString());
            this.b(g);
         }
      }
   }

   @Override
   public void a(aav $$0) {
      uq.a($$0, this, this.b.x());
      this.b.C();
      this.b.a($$0.a());
   }

   @Override
   public void a(aae $$0) {
      uq.a($$0, this, this.b.x());
      this.b.C();
      switch ($$0.c()) {
         case a:
            this.b.f(true);
            break;
         case b:
            this.b.f(false);
            break;
         case d:
            this.b.g(true);
            break;
         case e:
            this.b.g(false);
            break;
         case c:
            if (this.b.fy()) {
               this.b.a(false, true);
               this.D = this.b.dg();
            }
            break;
         case f:
            if (this.b.cX() instanceof bgk $$1) {
               int $$2 = $$0.d();
               if ($$1.a() && $$2 > 0) {
                  $$1.c($$2);
               }
            }
            break;
         case g:
            if (this.b.cX() instanceof bgk $$3) {
               $$3.b();
            }
            break;
         case h:
            if (this.b.cW() instanceof bfs $$4) {
               $$4.b(this.b);
            }
            break;
         case i:
            if (!this.b.fS()) {
               this.b.fU();
            }
            break;
         default:
            throw new IllegalArgumentException("Invalid client command!");
      }
   }

   public void a(tl $$0) {
      th $$1 = $$0.k();
      if ($$1 != null) {
         this.Q.a($$0);
         int $$2;
         synchronized (this.P) {
            this.P.a($$1);
            $$2 = this.P.a();
         }

         if ($$2 > 4096) {
            this.b(sw.c("multiplayer.disconnect.too_many_pending_chats"));
         }
      }
   }

   public void a(tl $$0, ss.a $$1) {
      this.a(new wt($$0.j().c(), $$0.j().b(), $$0.k(), $$0.l().a(this.Q), $$0.m(), $$0.n(), $$1.a(this.b.dI().B_())));
      this.a($$0);
   }

   public void a(sw $$0, ss.a $$1) {
      this.a(new vt($$0, $$1.a(this.b.dI().B_())));
   }

   public SocketAddress e() {
      return this.h.c();
   }

   @Override
   public void a(zt $$0) {
      uq.a($$0, this, this.b.x());
      final aif $$1 = this.b.x();
      final bfj $$2 = $$0.a($$1);
      this.b.C();
      this.b.f($$0.a());
      if ($$2 != null) {
         if (!$$1.w_().a($$2.di())) {
            return;
         }

         eed $$3 = $$2.cE();
         if ($$3.e(this.b.bm()) < a) {
            $$0.a(new zt.c() {
               private void a(bdw $$0, aiy.a $$1x) {
                  cfz $$2 = aiy.this.b.b($$0);
                  if ($$2.a($$1.G())) {
                     cfz $$3 = $$2.p();
                     bdx $$4 = $$1.run(aiy.this.b, $$2, $$0);
                     if ($$4.a()) {
                        ai.Q.a(aiy.this.b, $$3, $$2);
                        if ($$4.b()) {
                           aiy.this.b.a($$0, true);
                        }
                     }
                  }
               }

               @Override
               public void a(bdw $$0) {
                  this.a($$0, byo::a);
               }

               @Override
               public void a(bdw $$0, eei $$1x) {
                  this.a($$0, ($$1xxx, $$2xx, $$3) -> $$2xx.a($$1xxx, $$1, $$3));
               }

               @Override
               public void a() {
                  if (!($$2 instanceof bvh) && !($$2 instanceof bfp) && !($$2 instanceof byu) && $$2 != aiy.this.b) {
                     cfz $$0 = aiy.this.b.b(bdw.a);
                     if ($$0.a($$1.G())) {
                        aiy.this.b.d($$2);
                     }
                  } else {
                     aiy.this.b(sw.c("multiplayer.disconnect.invalid_entity_attacked"));
                     aiy.c.warn("Player {} tried to attack an invalid entity", aiy.this.b.Z().getString());
                  }
               }
            });
         }
      }
   }

   @Override
   public void a(zk $$0) {
      uq.a($$0, this, this.b.x());
      this.b.C();
      zk.a $$1 = $$0.a();
      switch ($$1) {
         case a:
            if (this.b.g) {
               this.b.g = false;
               this.b = this.i.ac().a(this.b, true);
               ai.v.a(this.b, cmm.j, cmm.h);
            } else {
               if (this.b.er() > 0.0F) {
                  return;
               }

               this.b = this.i.ac().a(this.b, false);
               if (this.i.h()) {
                  this.b.a(cmj.d);
                  this.b.dI().X().a(cmi.q).a(false, this.i);
               }
            }
            break;
         case b:
            this.b.D().a(this.b);
      }
   }

   @Override
   public void a(zp $$0) {
      uq.a($$0, this, this.b.x());
      this.b.r();
   }

   @Override
   public void a(zo $$0) {
      uq.a($$0, this, this.b.x());
      this.b.C();
      if (this.b.bR.j == $$0.a()) {
         if (this.b.G_()) {
            this.b.bR.b();
         } else if (!this.b.bR.a(this.b)) {
            c.debug("Player {} interacted with invalid menu {}", this.b, this.b.bR);
         } else {
            int $$1 = $$0.c();
            if (!this.b.bR.a($$1)) {
               c.debug("Player {} clicked invalid slot index: {}, available slots: {}", new Object[]{this.b.Z(), $$1, this.b.bR.i.size()});
            } else {
               boolean $$2 = $$0.h() != this.b.bR.j();
               this.b.bR.h();
               this.b.bR.a($$1, $$0.d(), $$0.g(), this.b);
               ObjectIterator var4 = Int2ObjectMaps.fastIterable($$0.f()).iterator();

               while (var4.hasNext()) {
                  Entry<cfz> $$3 = (Entry<cfz>)var4.next();
                  this.b.bR.b($$3.getIntKey(), (cfz)$$3.getValue());
               }

               this.b.bR.a($$0.e());
               this.b.bR.i();
               if ($$2) {
                  this.b.bR.e();
               } else {
                  this.b.bR.d();
               }
            }
         }
      }
   }

   @Override
   public void a(aab $$0) {
      uq.a($$0, this, this.b.x());
      this.b.C();
      if (!this.b.G_() && this.b.bR.j == $$0.a() && this.b.bR instanceof ccp) {
         if (!this.b.bR.a(this.b)) {
            c.debug("Player {} interacted with invalid menu {}", this.b, this.b.bR);
         } else {
            this.i.aE().a($$0.c()).ifPresent($$1 -> ((ccp)this.b.bR).a($$0.d(), (cjc<?>)$$1, this.b));
         }
      }
   }

   @Override
   public void a(zn $$0) {
      uq.a($$0, this, this.b.x());
      this.b.C();
      if (this.b.bR.j == $$0.a() && !this.b.G_()) {
         if (!this.b.bR.a(this.b)) {
            c.debug("Player {} interacted with invalid menu {}", this.b, this.b.bR);
         } else {
            boolean $$1 = this.b.bR.b(this.b, $$0.c());
            if ($$1) {
               this.b.bR.d();
            }
         }
      }
   }

   @Override
   public void a(aar $$0) {
      uq.a($$0, this, this.b.x());
      if (this.b.e.e()) {
         boolean $$1 = $$0.a() < 0;
         cfz $$2 = $$0.c();
         if (!$$2.a(this.b.dI().G())) {
            return;
         }

         qr $$3 = cds.a($$2);
         if (!$$2.b() && $$3 != null && $$3.e("x") && $$3.e("y") && $$3.e("z")) {
            gu $$4 = czn.c($$3);
            if (this.b.dI().o($$4)) {
               czn $$5 = this.b.dI().c_($$4);
               if ($$5 != null) {
                  $$5.e($$2);
               }
            }
         }

         boolean $$6 = $$0.a() >= 1 && $$0.a() <= 45;
         boolean $$7 = $$2.b() || $$2.k() >= 0 && $$2.L() <= 64 && !$$2.b();
         if ($$6 && $$7) {
            this.b.bQ.b($$0.a()).d($$2);
            this.b.bQ.d();
         } else if ($$1 && $$7 && this.p < 200) {
            this.p += 20;
            this.b.a($$2, true);
         }
      }
   }

   @Override
   public void a(aau $$0) {
      List<String> $$1 = Stream.of($$0.d()).map(n::a).collect(Collectors.toList());
      this.a($$1).thenAcceptAsync($$1x -> this.a($$0, $$1x), this.i);
   }

   private void a(aau $$0, List<aiu> $$1) {
      this.b.C();
      aif $$2 = this.b.x();
      gu $$3 = $$0.a();
      if ($$2.A($$3)) {
         if (!($$2.c_($$3) instanceof dav $$5)) {
            return;
         }

         $$5.a(this.b, $$0.c(), $$1);
      }
   }

   @Override
   public void a(zv $$0) {
      if (this.m && $$0.a() == this.n) {
         int $$1 = (int)(ac.b() - this.l);
         this.b.f = (this.b.f * 3 + $$1) / 4;
         this.m = false;
      } else if (!this.g()) {
         this.b(sw.c("disconnect.timeout"));
      }
   }

   @Override
   public void a(aac $$0) {
      uq.a($$0, this, this.b.x());
      this.b.fO().b = $$0.a() && this.b.fO().c;
   }

   @Override
   public void a(zl $$0) {
      uq.a($$0, this, this.b.x());
      this.b.a($$0);
   }

   @Override
   public void a(zq $$0) {
   }

   @Override
   public void a(zf $$0) {
      uq.a($$0, this, this.b.x());
      if (this.b.l(2) || this.g()) {
         this.i.a($$0.a(), false);
      }
   }

   @Override
   public void a(zw $$0) {
      uq.a($$0, this, this.b.x());
      if (this.b.l(2) || this.g()) {
         this.i.b($$0.a());
      }
   }

   @Override
   public void a(zj $$0) {
      uq.a($$0, this, this.b.x());
      tm.a $$1 = $$0.a();
      byr.a $$2 = this.N != null ? this.N.e().b() : null;
      byr.a $$3 = $$1.b();
      if (!Objects.equals($$2, $$3)) {
         if ($$2 != null && $$3.b().isBefore($$2.b())) {
            this.b(byr.a);
         } else {
            try {
               apj $$4 = this.i.an();
               if ($$4 == null) {
                  c.warn("Ignoring chat session from {} due to missing Services public key", this.b.fM().getName());
                  return;
               }

               this.a($$1.a(this.b.fM(), $$4, Duration.ZERO));
            } catch (byr.b var6) {
               c.error("Failed to validate profile key: {}", var6.getMessage());
               this.b(var6.b());
            }
         }
      }
   }

   private void a(tm $$0) {
      this.N = $$0;
      this.O = $$0.a(this.b.ct());
      this.R.append($$1 -> {
         this.b.a($$0);
         this.i.ac().a(new wy(EnumSet.of(wy.a.b), List.of(this.b)));
         return CompletableFuture.completedFuture(null);
      });
   }

   @Override
   public aig f() {
      return this.b;
   }

   @FunctionalInterface
   interface a {
      bdx run(aig var1, bfj var2, bdw var3);
   }
}
