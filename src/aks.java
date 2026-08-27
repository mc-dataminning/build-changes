import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Lists;
import com.mojang.datafixers.DataFixer;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.LongSet;
import it.unimi.dsi.fastutil.longs.LongSets;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenHashSet;
import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.function.BooleanSupplier;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class aks extends cpx implements cqr {
   public static final gw a = new gw(100, 50, 0);
   public static final bgf b = bgl.a(12000, 180000);
   public static final bgf c = bgl.a(12000, 24000);
   private static final bgf D = bgl.a(12000, 180000);
   public static final bgf d = bgl.a(3600, 15600);
   private static final Logger E = LogUtils.getLogger();
   private static final int F = 300;
   private static final int G = 65536;
   final List<akt> H = Lists.newArrayList();
   private final akq I;
   private final MinecraftServer J;
   private final ecn K;
   final dji L = new dji();
   private final djn<bis> M;
   private final djw N;
   public boolean e;
   private final aol O;
   private int P;
   private final ebk Q;
   private final eiy<csx> R = new eiy<>(this::d, this.ae());
   private final eiy<ean> S = new eiy<>(this::d, this.ae());
   final Set<bjk> T = new ObjectOpenHashSet();
   volatile boolean U;
   protected final cdf f;
   private final ObjectLinkedOpenHashSet<cpc> V = new ObjectLinkedOpenHashSet();
   private final List<cpc> W = new ArrayList<>(64);
   private boolean X;
   private final List<cpk> Y;
   @Nullable
   private dix Z;
   final Int2ObjectMap<bxh> aa = new Int2ObjectOpenHashMap();
   private final cqp ab;
   private final dvl ac;
   private final boolean ad;
   private final bhg ae;

   public aks(
      MinecraftServer $$0,
      Executor $$1,
      eci.c $$2,
      ecn $$3,
      aex<cpx> $$4,
      div $$5,
      alb $$6,
      boolean $$7,
      long $$8,
      List<cpk> $$9,
      boolean $$10,
      @Nullable bhg $$11
   ) {
      super($$3, $$4, $$0.aU(), $$5.a(), $$0::aM, false, $$7, $$8, $$0.bc());
      this.ad = $$10;
      this.J = $$0;
      this.Y = $$9;
      this.K = $$3;
      dhi $$12 = $$5.b();
      boolean $$13 = $$0.aR();
      DataFixer $$14 = $$0.ay();
      djf<bis> $$15 = new dik(this, $$2.a($$4).resolve("entities"), $$14, $$13, $$0);
      this.M = new djn<>(bis.class, new aks.a(), $$15);
      this.I = new akq(this, $$2, $$14, $$0.aS(), $$1, $$12, $$0.ac().p(), $$0.ac().q(), $$13, $$6, this.M::a, () -> $$0.D().s());
      this.I.h().b();
      this.Q = new ebk(this);
      this.Q();
      this.T();
      this.B_().a($$0.as());
      this.f = this.s().a(cdf.a(this), cdf.a(this.ab()));
      if (!$$0.O()) {
         $$3.a($$0.t_());
      }

      long $$16 = $$0.aT().A().b();
      this.ac = new dvl(this.I.m(), this.G_(), $$0.aS(), $$4, $$12, this.I.i(), this, $$12.c(), $$16, $$14);
      this.ab = new cqp(this, $$0.aT().A(), this.ac);
      if (this.ac() == cpx.j && this.ab().a(dis.c)) {
         this.Z = new dix(this, $$16, $$0.aT().E());
      } else {
         this.Z = null;
      }

      this.O = new aol();
      this.N = new djw(this);
      this.ae = Objects.requireNonNullElseGet($$11, () -> this.s().a(bhg.a($$16), "random_sequences"));
   }

   @Deprecated
   @VisibleForTesting
   public void a(@Nullable dix $$0) {
      this.Z = $$0;
   }

   public void a(int $$0, int $$1, boolean $$2, boolean $$3) {
      this.K.a($$0);
      this.K.f($$1);
      this.K.e($$1);
      this.K.b($$2);
      this.K.a($$3);
   }

   @Override
   public hg<cqv> a(int $$0, int $$1, int $$2) {
      return this.k().g().c().getNoiseBiome($$0, $$1, $$2, this.k().i().b());
   }

   public cqp a() {
      return this.ab;
   }

   public void a(BooleanSupplier $$0) {
      bdr $$1 = this.ad();
      this.X = true;
      $$1.a("world border");
      this.B_().s();
      $$1.b("weather");
      this.ar();
      int $$2 = this.X().c(cpt.L);
      if (this.O.a($$2) && this.O.a($$2, this.H)) {
         if (this.X().b(cpt.k)) {
            long $$3 = this.A.f() + 24000L;
            this.b($$3 - $$3 % 24000L);
         }

         this.ap();
         if (this.X().b(cpt.u) && this.Z()) {
            this.as();
         }
      }

      this.Q();
      this.b();
      $$1.b("tickPending");
      if (!this.af()) {
         long $$4 = this.V();
         $$1.a("blockTicks");
         this.R.a($$4, 65536, this::d);
         $$1.b("fluidTicks");
         this.S.a($$4, 65536, this::a);
         $$1.c();
      }

      $$1.b("raid");
      this.f.a();
      $$1.b("chunkSource");
      this.k().a($$0, true);
      $$1.b("blockEvents");
      this.au();
      this.X = false;
      $$1.c();
      boolean $$5 = !this.H.isEmpty() || !this.u().isEmpty();
      if ($$5) {
         this.g();
      }

      if ($$5 || this.P++ < 300) {
         $$1.a("entities");
         if (this.Z != null) {
            $$1.a("dragonFight");
            this.Z.c();
            $$1.c();
         }

         this.L.a($$1x -> {
            if (!$$1x.dG()) {
               if (this.i($$1x)) {
                  $$1x.ak();
               } else {
                  $$1.a("checkDespawn");
                  $$1x.dx();
                  $$1.c();
                  if (this.I.a.j().c($$1x.dn().a())) {
                     bis $$2x = $$1x.cY();
                     if ($$2x != null) {
                        if (!$$2x.dG() && $$2x.x($$1x)) {
                           return;
                        }

                        $$1x.aa();
                     }

                     $$1.a("tick");
                     this.a(this::a, $$1x);
                     $$1.c();
                  }
               }
            }
         });
         $$1.c();
         this.P();
      }

      $$1.a("entityManagement");
      this.M.a();
      $$1.c();
   }

   @Override
   public boolean a(long $$0) {
      return this.I.a.j().d($$0);
   }

   protected void b() {
      if (this.ad) {
         long $$0 = this.A.e() + 1L;
         this.K.a($$0);
         this.K.u().a(this.J, $$0);
         if (this.A.q().b(cpt.k)) {
            this.b(this.A.f() + 1L);
         }
      }
   }

   public void b(long $$0) {
      this.K.b($$0);
   }

   public void a(boolean $$0, boolean $$1) {
      for (cpk $$2 : this.Y) {
         $$2.a(this, $$0, $$1);
      }
   }

   private boolean i(bis $$0) {
      return this.J.W() || !($$0 instanceof but) && !($$0 instanceof bvv) ? !this.J.X() && $$0 instanceof cbi : true;
   }

   private void ap() {
      this.O.a();
      this.H.stream().filter(bji::fC).collect(Collectors.toList()).forEach($$0 -> $$0.a(false, false));
   }

   public void a(dhs $$0, int $$1) {
      cpe $$2 = $$0.f();
      boolean $$3 = this.Z();
      int $$4 = $$2.d();
      int $$5 = $$2.e();
      bdr $$6 = this.ad();
      $$6.a("thunder");
      if ($$3 && this.Y() && this.z.a(100000) == 0) {
         gw $$7 = this.a(this.a($$4, 0, $$5, 15));
         if (this.q($$7)) {
            bgy $$8 = this.d_($$7);
            boolean $$9 = this.X().b(cpt.e) && this.z.j() < (double)$$8.b() * 0.01 && !this.a_($$7.d()).a(csy.rr);
            if ($$9) {
               bwy $$10 = biw.aK.a((cpx)this);
               if ($$10 != null) {
                  $$10.w(true);
                  $$10.c_(0);
                  $$10.e((double)$$7.u(), (double)$$7.v(), (double)$$7.w());
                  this.b($$10);
               }
            }

            bjh $$11 = biw.ai.a((cpx)this);
            if ($$11 != null) {
               $$11.d(ehp.c($$7));
               $$11.a($$9);
               this.b($$11);
            }
         }
      }

      $$6.b("iceandsnow");

      for (int $$12 = 0; $$12 < $$1; $$12++) {
         if (this.z.a(48) == 0) {
            this.a($$3, this.a($$4, 0, $$5, 15));
         }
      }

      $$6.b("tickBlocks");
      if ($$1 > 0) {
         dht[] $$13 = $$0.d();

         for (int $$14 = 0; $$14 < $$13.length; $$14++) {
            dht $$15 = $$13[$$14];
            if ($$15.d()) {
               int $$16 = $$0.g($$14);
               int $$17 = hz.c($$16);

               for (int $$18 = 0; $$18 < $$1; $$18++) {
                  gw $$19 = this.a($$4, $$17, $$5, 15);
                  $$6.a("randomTick");
                  dfl $$20 = $$15.a($$19.u() - $$4, $$19.v() - $$17, $$19.w() - $$5);
                  if ($$20.v()) {
                     $$20.b(this, $$19, this.z);
                  }

                  eao $$21 = $$20.u();
                  if ($$21.f()) {
                     $$21.b(this, $$19, this.z);
                  }

                  $$6.c();
               }
            }
         }
      }

      $$6.c();
   }

   private void a(boolean $$0, gw $$1) {
      gw $$2 = this.a(dku.a.e, $$1);
      gw $$3 = $$2.d();
      cqv $$4 = this.s($$2).a();
      if ($$4.a(this, $$3)) {
         this.b($$3, csy.dO.n());
      }

      if ($$0) {
         int $$5 = this.X().c(cpt.P);
         if ($$5 > 0 && $$4.b(this, $$2)) {
            dfl $$6 = this.a_($$2);
            if ($$6.a(csy.dN)) {
               int $$7 = $$6.c(dag.b);
               if ($$7 < Math.min($$5, 8)) {
                  dfl $$8 = $$6.a(dag.b, Integer.valueOf($$7 + 1));
                  csx.a($$6, $$8, this, $$2);
                  this.b($$2, $$8);
               }
            } else {
               this.b($$2, csy.dN.n());
            }
         }

         cqv.c $$9 = $$4.a($$3);
         if ($$9 != cqv.c.a) {
            dfl $$10 = this.a_($$3);
            $$10.b().a($$10, this, $$3, $$9);
         }
      }
   }

   private Optional<gw> D(gw $$0) {
      Optional<gw> $$1 = this.w().e($$0x -> $$0x.a(bul.t), $$0x -> $$0x.v() == this.a(dku.a.b, $$0x.u(), $$0x.w()) - 1, $$0, 128, buh.b.c);
      return $$1.map($$0x -> $$0x.b(1));
   }

   protected gw a(gw $$0) {
      gw $$1 = this.a(dku.a.e, $$0);
      Optional<gw> $$2 = this.D($$1);
      if ($$2.isPresent()) {
         return $$2.get();
      } else {
         ehk $$3 = new ehk($$1, new gw($$1.u(), this.aj(), $$1.w())).g(3.0);
         List<bji> $$4 = this.a(bji.class, $$3, $$0x -> $$0x != null && $$0x.bv() && this.g($$0x.dl()));
         if (!$$4.isEmpty()) {
            return $$4.get(this.z.a($$4.size())).dl();
         } else {
            if ($$1.v() == this.H_() - 1) {
               $$1 = $$1.b(2);
            }

            return $$1;
         }
      }
   }

   public boolean c() {
      return this.X;
   }

   public boolean d() {
      return this.X().c(cpt.L) <= 100;
   }

   private void aq() {
      if (this.d()) {
         if (!this.n().O() || this.n().p()) {
            int $$0 = this.X().c(cpt.L);
            tn $$1;
            if (this.O.a($$0)) {
               $$1 = tn.c("sleep.skipping_night");
            } else {
               $$1 = tn.a("sleep.players_sleeping", this.O.b(), this.O.b($$0));
            }

            for (akt $$3 : this.H) {
               $$3.a($$1, true);
            }
         }
      }
   }

   public void e() {
      if (!this.H.isEmpty() && this.O.a(this.H)) {
         this.aq();
      }
   }

   public afp f() {
      return this.J.aF();
   }

   private void ar() {
      boolean $$0 = this.Z();
      if (this.C_().g()) {
         if (this.X().b(cpt.u)) {
            int $$1 = this.K.h();
            int $$2 = this.K.j();
            int $$3 = this.K.l();
            boolean $$4 = this.A.i();
            boolean $$5 = this.A.k();
            if ($$1 > 0) {
               $$1--;
               $$2 = $$4 ? 0 : 1;
               $$3 = $$5 ? 0 : 1;
               $$4 = false;
               $$5 = false;
            } else {
               if ($$2 > 0) {
                  if (--$$2 == 0) {
                     $$4 = !$$4;
                  }
               } else if ($$4) {
                  $$2 = d.a(this.z);
               } else {
                  $$2 = D.a(this.z);
               }

               if ($$3 > 0) {
                  if (--$$3 == 0) {
                     $$5 = !$$5;
                  }
               } else if ($$5) {
                  $$3 = c.a(this.z);
               } else {
                  $$3 = b.a(this.z);
               }
            }

            this.K.e($$2);
            this.K.f($$3);
            this.K.a($$1);
            this.K.a($$4);
            this.K.b($$5);
         }

         this.x = this.y;
         if (this.A.i()) {
            this.y += 0.01F;
         } else {
            this.y -= 0.01F;
         }

         this.y = ary.a(this.y, 0.0F, 1.0F);
         this.v = this.w;
         if (this.A.k()) {
            this.w += 0.01F;
         } else {
            this.w -= 0.01F;
         }

         this.w = ary.a(this.w, 0.0F, 1.0F);
      }

      if (this.v != this.w) {
         this.J.ac().a(new yd(yd.h, this.w), this.ac());
      }

      if (this.x != this.y) {
         this.J.ac().a(new yd(yd.i, this.y), this.ac());
      }

      if ($$0 != this.Z()) {
         if ($$0) {
            this.J.ac().a(new yd(yd.c, 0.0F));
         } else {
            this.J.ac().a(new yd(yd.b, 0.0F));
         }

         this.J.ac().a(new yd(yd.h, this.w));
         this.J.ac().a(new yd(yd.i, this.y));
      }
   }

   private void as() {
      this.K.f(0);
      this.K.b(false);
      this.K.e(0);
      this.K.a(false);
   }

   public void g() {
      this.P = 0;
   }

   private void a(gw $$0, ean $$1) {
      eao $$2 = this.b_($$0);
      if ($$2.b($$1)) {
         $$2.a((cpx)this, $$0);
      }
   }

   private void d(gw $$0, csx $$1) {
      dfl $$2 = this.a_($$0);
      if ($$2.a($$1)) {
         $$2.a(this, $$0, this.z);
      }
   }

   public void a(bis $$0) {
      $$0.bn();
      bdr $$1 = this.ad();
      $$0.ah++;
      this.ad().a(() -> jd.h.b($$0.ag()).toString());
      $$1.d("tickNonPassenger");
      $$0.l();
      this.ad().c();

      for (bis $$2 : $$0.cP()) {
         this.a($$0, $$2);
      }
   }

   private void a(bis $$0, bis $$1) {
      if ($$1.dG() || $$1.cY() != $$0) {
         $$1.aa();
      } else if ($$1 instanceof cbw || this.L.c($$1)) {
         $$1.bn();
         $$1.ah++;
         bdr $$2 = this.ad();
         $$2.a(() -> jd.h.b($$1.ag()).toString());
         $$2.d("tickPassenger");
         $$1.by();
         $$2.c();

         for (bis $$3 : $$1.cP()) {
            this.a($$1, $$3);
         }
      }
   }

   @Override
   public boolean a(cbw $$0, gw $$1) {
      return !this.J.a(this, $$1, $$0) && this.B_().a($$1);
   }

   public void a(@Nullable asd $$0, boolean $$1, boolean $$2) {
      akq $$3 = this.k();
      if (!$$2) {
         if ($$0 != null) {
            $$0.a(tn.c("menu.savingLevel"));
         }

         this.at();
         if ($$0 != null) {
            $$0.c(tn.c("menu.savingChunks"));
         }

         $$3.a($$1);
         if ($$1) {
            this.M.c();
         } else {
            this.M.b();
         }
      }
   }

   private void at() {
      if (this.Z != null) {
         this.J.aT().a(this.Z.b());
      }

      this.k().k().a();
   }

   public <T extends bis> List<? extends T> a(djj<bis, T> $$0, Predicate<? super T> $$1) {
      List<T> $$2 = Lists.newArrayList();
      this.a($$0, $$1, $$2);
      return $$2;
   }

   public <T extends bis> void a(djj<bis, T> $$0, Predicate<? super T> $$1, List<? super T> $$2) {
      this.a($$0, $$1, $$2, Integer.MAX_VALUE);
   }

   public <T extends bis> void a(djj<bis, T> $$0, Predicate<? super T> $$1, List<? super T> $$2, int $$3) {
      this.E().a($$0, $$3x -> {
         if ($$1.test((T)$$3x)) {
            $$2.add((T)$$3x);
            if ($$2.size() >= $$3) {
               return aqp.a.b;
            }
         }

         return aqp.a.a;
      });
   }

   public List<? extends bxj> h() {
      return this.a(biw.C, bji::bv);
   }

   public List<akt> a(Predicate<? super akt> $$0) {
      return this.a($$0, Integer.MAX_VALUE);
   }

   public List<akt> a(Predicate<? super akt> $$0, int $$1) {
      List<akt> $$2 = Lists.newArrayList();

      for (akt $$3 : this.H) {
         if ($$0.test($$3)) {
            $$2.add($$3);
            if ($$2.size() >= $$1) {
               return $$2;
            }
         }
      }

      return $$2;
   }

   @Nullable
   public akt i() {
      List<akt> $$0 = this.a(bji::bv);
      return $$0.isEmpty() ? null : $$0.get(this.z.a($$0.size()));
   }

   @Override
   public boolean b(bis $$0) {
      return this.j($$0);
   }

   public boolean c(bis $$0) {
      return this.j($$0);
   }

   public void d(bis $$0) {
      this.j($$0);
   }

   public void a(akt $$0) {
      this.e($$0);
   }

   public void b(akt $$0) {
      this.e($$0);
   }

   public void c(akt $$0) {
      this.e($$0);
   }

   public void d(akt $$0) {
      this.e($$0);
   }

   private void e(akt $$0) {
      bis $$1 = this.E().a($$0.cv());
      if ($$1 != null) {
         E.warn("Force-added player with duplicate UUID {}", $$0.cv());
         $$1.ae();
         this.a((akt)$$1, bis.c.b);
      }

      this.M.a($$0);
   }

   private boolean j(bis $$0) {
      if ($$0.dG()) {
         E.warn("Tried to add entity {} but it was marked as removed already", biw.a($$0.ag()));
         return false;
      } else {
         return this.M.a($$0);
      }
   }

   public boolean e(bis $$0) {
      if ($$0.cR().map(bis::cv).anyMatch(this.M::a)) {
         return false;
      } else {
         this.a_($$0);
         return true;
      }
   }

   public void a(dhs $$0) {
      $$0.I();
      $$0.b(this);
   }

   public void a(akt $$0, bis.c $$1) {
      $$0.a($$1);
   }

   @Override
   public void a(int $$0, gw $$1, int $$2) {
      for (akt $$3 : this.J.ac().t()) {
         if ($$3 != null && $$3.dL() == this && $$3.ah() != $$0) {
            double $$4 = (double)$$1.u() - $$3.dq();
            double $$5 = (double)$$1.v() - $$3.ds();
            double $$6 = (double)$$1.w() - $$3.dw();
            if ($$4 * $$4 + $$5 * $$5 + $$6 * $$6 < 1024.0) {
               $$3.c.b(new xe($$0, $$1, $$2));
            }
         }
      }
   }

   @Override
   public void a(@Nullable cbw $$0, double $$1, double $$2, double $$3, hg<ape> $$4, apg $$5, float $$6, float $$7, long $$8) {
      this.J.ac().a($$0, $$1, $$2, $$3, (double)$$4.a().a($$6), this.ac(), new aap($$4, $$5, $$1, $$2, $$3, $$6, $$7, $$8));
   }

   @Override
   public void a(@Nullable cbw $$0, bis $$1, hg<ape> $$2, apg $$3, float $$4, float $$5, long $$6) {
      this.J.ac().a($$0, $$1.dq(), $$1.ds(), $$1.dw(), (double)$$2.a().a($$4), this.ac(), new aao($$2, $$3, $$1, $$4, $$5, $$6));
   }

   @Override
   public void b(int $$0, gw $$1, int $$2) {
      if (this.X().b(cpt.S)) {
         this.J.ac().a(new yj($$0, $$1, $$2, true));
      } else {
         this.a(null, $$0, $$1, $$2);
      }
   }

   @Override
   public void a(@Nullable cbw $$0, int $$1, gw $$2, int $$3) {
      this.J.ac().a($$0, (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), 64.0, this.ac(), new yj($$1, $$2, $$3, false));
   }

   public int j() {
      return this.C_().p();
   }

   @Override
   public void a(djv $$0, ehp $$1, djv.a $$2) {
      this.N.a($$0, $$1, $$2);
   }

   @Override
   public void a(gw $$0, dfl $$1, dfl $$2, int $$3) {
      if (this.U) {
         String $$4 = "recursive call to sendBlockUpdated";
         ac.a("recursive call to sendBlockUpdated", new IllegalStateException("recursive call to sendBlockUpdated"));
      }

      this.k().a($$0);
      eii $$5 = $$1.k(this, $$0);
      eii $$6 = $$2.k(this, $$0);
      if (eif.c($$5, $$6, eht.g)) {
         List<bsr> $$7 = new ObjectArrayList();

         for (bjk $$8 : this.T) {
            bsr $$9 = $$8.L();
            if ($$9.b($$0)) {
               $$7.add($$9);
            }
         }

         try {
            this.U = true;

            for (bsr $$10 : $$7) {
               $$10.i();
            }
         } finally {
            this.U = false;
         }
      }
   }

   @Override
   public void a(gw $$0, csx $$1) {
      this.s.a($$0, $$1, null);
   }

   @Override
   public void a(gw $$0, csx $$1, hc $$2) {
      this.s.a($$0, $$1, $$2);
   }

   @Override
   public void a(gw $$0, csx $$1, gw $$2) {
      this.s.a($$0, $$1, $$2);
   }

   @Override
   public void a(dfl $$0, gw $$1, csx $$2, gw $$3, boolean $$4) {
      this.s.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public void a(bis $$0, byte $$1) {
      this.k().a($$0, new ya($$0, $$1));
   }

   @Override
   public void a(bis $$0, bhq $$1) {
      this.k().a($$0, new xx($$0, $$1));
   }

   public akq k() {
      return this.I;
   }

   @Override
   public cpp a(@Nullable bis $$0, @Nullable bhq $$1, @Nullable cpq $$2, double $$3, double $$4, double $$5, float $$6, boolean $$7, cpx.a $$8) {
      cpp $$9 = this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, false);
      if (!$$9.b()) {
         $$9.g();
      }

      for (akt $$10 : this.H) {
         if ($$10.i($$3, $$4, $$5) < 4096.0) {
            $$10.c.b(new yb($$3, $$4, $$5, $$6, $$9.h(), $$9.d().get($$10)));
         }
      }

      return $$9;
   }

   @Override
   public void a(gw $$0, csx $$1, int $$2, int $$3) {
      this.V.add(new cpc($$0, $$1, $$2, $$3));
   }

   private void au() {
      this.W.clear();

      while (!this.V.isEmpty()) {
         cpc $$0 = (cpc)this.V.removeFirst();
         if (this.m($$0.a())) {
            if (this.a($$0)) {
               this.J.ac().a(null, (double)$$0.a().u(), (double)$$0.a().v(), (double)$$0.a().w(), 64.0, this.ac(), new xg($$0.a(), $$0.b(), $$0.c(), $$0.d()));
            }
         } else {
            this.W.add($$0);
         }
      }

      this.V.addAll(this.W);
   }

   private boolean a(cpc $$0) {
      dfl $$1 = this.a_($$0.a());
      return $$1.a($$0.b()) ? $$1.a(this, $$0.a(), $$0.c(), $$0.d()) : false;
   }

   public eiy<csx> l() {
      return this.R;
   }

   public eiy<ean> m() {
      return this.S;
   }

   @Nonnull
   @Override
   public MinecraftServer n() {
      return this.J;
   }

   public ebk o() {
      return this.Q;
   }

   public dze p() {
      return this.J.aS();
   }

   public <T extends iv> int a(T $$0, double $$1, double $$2, double $$3, int $$4, double $$5, double $$6, double $$7, double $$8) {
      yk $$9 = new yk($$0, false, $$1, $$2, $$3, (float)$$5, (float)$$6, (float)$$7, (float)$$8, $$4);
      int $$10 = 0;

      for (int $$11 = 0; $$11 < this.H.size(); $$11++) {
         akt $$12 = this.H.get($$11);
         if (this.a($$12, false, $$1, $$2, $$3, $$9)) {
            $$10++;
         }
      }

      return $$10;
   }

   public <T extends iv> boolean a(akt $$0, T $$1, boolean $$2, double $$3, double $$4, double $$5, int $$6, double $$7, double $$8, double $$9, double $$10) {
      vf<?> $$11 = new yk($$1, $$2, $$3, $$4, $$5, (float)$$7, (float)$$8, (float)$$9, (float)$$10, $$6);
      return this.a($$0, $$2, $$3, $$4, $$5, $$11);
   }

   private boolean a(akt $$0, boolean $$1, double $$2, double $$3, double $$4, vf<?> $$5) {
      if ($$0.dL() != this) {
         return false;
      } else {
         gw $$6 = $$0.dl();
         if ($$6.a(new ehp($$2, $$3, $$4), $$1 ? 512.0 : 32.0)) {
            $$0.c.b($$5);
            return true;
         } else {
            return false;
         }
      }
   }

   @Nullable
   @Override
   public bis a(int $$0) {
      return this.E().a($$0);
   }

   @Deprecated
   @Nullable
   public bis b(int $$0) {
      bis $$1 = this.E().a($$0);
      return $$1 != null ? $$1 : (bis)this.aa.get($$0);
   }

   @Nullable
   public bis a(UUID $$0) {
      return this.E().a($$0);
   }

   @Nullable
   public gw a(aqj<dvk> $$0, gw $$1, int $$2, boolean $$3) {
      if (!this.J.aT().A().c()) {
         return null;
      } else {
         Optional<hk.c<dvk>> $$4 = this.G_().d(je.az).b($$0);
         if ($$4.isEmpty()) {
            return null;
         } else {
            Pair<gw, hg<dvk>> $$5 = this.k().g().a(this, $$4.get(), $$1, $$2, $$3);
            return $$5 != null ? (gw)$$5.getFirst() : null;
         }
      }
   }

   @Nullable
   public Pair<gw, hg<cqv>> a(Predicate<hg<cqv>> $$0, gw $$1, int $$2, int $$3, int $$4) {
      return this.k().g().c().a($$1, $$2, $$3, $$4, $$0, this.k().i().b(), this);
   }

   @Override
   public cmn q() {
      return this.J.aE();
   }

   @Override
   public boolean r() {
      return this.e;
   }

   public ece s() {
      return this.k().k();
   }

   @Nullable
   @Override
   public eby a(String $$0) {
      return this.n().D().s().b(eby.a(), $$0);
   }

   @Override
   public void a(String $$0, eby $$1) {
      this.n().D().s().a($$0, $$1);
   }

   @Override
   public int t() {
      return this.n().D().s().a(ebx.a(), "idcounts").b();
   }

   public void a(gw $$0, float $$1) {
      cpe $$2 = new cpe(new gw(this.A.a(), 0, this.A.c()));
      this.A.a($$0, $$1);
      this.k().b(akx.a, $$2, 11, asz.a);
      this.k().a(akx.a, new cpe($$0), 11, asz.a);
      this.n().ac().a(new zx($$0, $$1));
   }

   public LongSet u() {
      cps $$0 = this.s().b(cps.a(), "chunks");
      return (LongSet)($$0 != null ? LongSets.unmodifiable($$0.b()) : LongSets.EMPTY_SET);
   }

   public boolean a(int $$0, int $$1, boolean $$2) {
      cps $$3 = this.s().a(cps.a(), "chunks");
      cpe $$4 = new cpe($$0, $$1);
      long $$5 = $$4.a();
      boolean $$6;
      if ($$2) {
         $$6 = $$3.b().add($$5);
         if ($$6) {
            this.d($$0, $$1);
         }
      } else {
         $$6 = $$3.b().remove($$5);
      }

      $$3.a($$6);
      if ($$6) {
         this.k().a($$4, $$2);
      }

      return $$6;
   }

   @Override
   public List<akt> v() {
      return this.H;
   }

   @Override
   public void a(gw $$0, dfl $$1, dfl $$2) {
      Optional<hg<buk>> $$3 = bul.a($$1);
      Optional<hg<buk>> $$4 = bul.a($$2);
      if (!Objects.equals($$3, $$4)) {
         gw $$5 = $$0.i();
         $$3.ifPresent($$1x -> this.n().execute(() -> {
               this.w().a($$5);
               abd.b(this, $$5);
            }));
         $$4.ifPresent($$1x -> this.n().execute(() -> {
               this.w().a($$5, $$1x);
               abd.a(this, $$5);
            }));
      }
   }

   public buh w() {
      return this.k().l();
   }

   public boolean b(gw $$0) {
      return this.a($$0, 1);
   }

   public boolean a(hz $$0) {
      return this.b($$0.q());
   }

   public boolean a(gw $$0, int $$1) {
      return $$1 > 6 ? false : this.b(hz.a($$0)) <= $$1;
   }

   public int b(hz $$0) {
      return this.w().a($$0);
   }

   public cdf x() {
      return this.f;
   }

   @Nullable
   public cdd c(gw $$0) {
      return this.f.a($$0, 9216);
   }

   public boolean d(gw $$0) {
      return this.c($$0) != null;
   }

   public void a(bue $$0, bis $$1, bjx $$2) {
      $$2.a($$0, $$1);
   }

   public void a(Path $$0) throws IOException {
      akc $$1 = this.k().a;

      try (Writer $$2 = Files.newBufferedWriter($$0.resolve("stats.txt"))) {
         $$2.write(String.format(Locale.ROOT, "spawning_chunks: %d\n", $$1.j().b()));
         cqi.d $$3 = this.k().n();
         if ($$3 != null) {
            ObjectIterator $$9 = $$3.b().object2IntEntrySet().iterator();

            while ($$9.hasNext()) {
               Entry<bjl> $$4 = (Entry<bjl>)$$9.next();
               $$2.write(String.format(Locale.ROOT, "spawn_count.%s: %d\n", ((bjl)$$4.getKey()).a(), $$4.getIntValue()));
            }
         }

         $$2.write(String.format(Locale.ROOT, "entities: %s\n", this.M.e()));
         $$2.write(String.format(Locale.ROOT, "block_entity_tickers: %d\n", this.r.size()));
         $$2.write(String.format(Locale.ROOT, "block_ticks: %d\n", this.l().a()));
         $$2.write(String.format(Locale.ROOT, "fluid_ticks: %d\n", this.m().a()));
         $$2.write("distance_manager: " + $$1.j().c() + "\n");
         $$2.write(String.format(Locale.ROOT, "pending_tasks: %d\n", this.k().f()));
      }

      o $$5 = new o("Level dump", new Exception("dummy"));
      this.a($$5);

      try (Writer $$6 = Files.newBufferedWriter($$0.resolve("example_crash.txt"))) {
         $$6.write($$5.e());
      }

      Path $$7 = $$0.resolve("chunks.csv");

      try (Writer $$8 = Files.newBufferedWriter($$7)) {
         $$1.a($$8);
      }

      Path $$9 = $$0.resolve("entity_chunks.csv");

      try (Writer $$10 = Files.newBufferedWriter($$9)) {
         this.M.a($$10);
      }

      Path $$11 = $$0.resolve("entities.csv");

      try (Writer $$12 = Files.newBufferedWriter($$11)) {
         a($$12, this.E().a());
      }

      Path $$13 = $$0.resolve("block_entities.csv");

      try (Writer $$14 = Files.newBufferedWriter($$13)) {
         this.a($$14);
      }
   }

   private static void a(Writer $$0, Iterable<bis> $$1) throws IOException {
      ara $$2 = ara.a().a("x").a("y").a("z").a("uuid").a("type").a("alive").a("display_name").a("custom_name").a($$0);

      for (bis $$3 : $$1) {
         tn $$4 = $$3.ad();
         tn $$5 = $$3.N_();
         $$2.a($$3.dq(), $$3.ds(), $$3.dw(), $$3.cv(), jd.h.b($$3.ag()), $$3.bv(), $$5.getString(), $$4 != null ? $$4.getString() : null);
      }
   }

   private void a(Writer $$0) throws IOException {
      ara $$1 = ara.a().a("x").a("y").a("z").a("type").a($$0);

      for (den $$2 : this.r) {
         gw $$3 = $$2.c();
         $$1.a($$3.u(), $$3.v(), $$3.w(), $$2.d());
      }
   }

   @VisibleForTesting
   public void a(dvc $$0) {
      this.V.removeIf($$1 -> $$0.b($$1.a()));
   }

   @Override
   public void b(gw $$0, csx $$1) {
      if (!this.af()) {
         this.a($$0, $$1);
      }
   }

   @Override
   public float a(hc $$0, boolean $$1) {
      return 1.0F;
   }

   public Iterable<bis> y() {
      return this.E().a();
   }

   @Override
   public String toString() {
      return "ServerLevel[" + this.K.g() + "]";
   }

   public boolean z() {
      return this.J.aT().B();
   }

   @Override
   public long A() {
      return this.J.aT().A().b();
   }

   @Nullable
   public dix B() {
      return this.Z;
   }

   @Override
   public aks C() {
      return this;
   }

   @VisibleForTesting
   public String D() {
      return String.format(
         Locale.ROOT,
         "players: %s, entities: %s [%s], block_entities: %d [%s], block_ticks: %d, fluid_ticks: %d, chunk_source: %s",
         this.H.size(),
         this.M.e(),
         a(this.M.d().a(), $$0 -> jd.h.b($$0.ag()).toString()),
         this.r.size(),
         a(this.r, den::d),
         this.l().a(),
         this.m().a(),
         this.F()
      );
   }

   private static <T> String a(Iterable<T> $$0, Function<T, String> $$1) {
      try {
         Object2IntOpenHashMap<String> $$2 = new Object2IntOpenHashMap();

         for (T $$3 : $$0) {
            String $$4 = $$1.apply($$3);
            $$2.addTo($$4, 1);
         }

         return $$2.object2IntEntrySet()
            .stream()
            .sorted(Comparator.comparing(Entry::getIntValue).reversed())
            .limit(5L)
            .map($$0x -> (String)$$0x.getKey() + ":" + $$0x.getIntValue())
            .collect(Collectors.joining(","));
      } catch (Exception var6) {
         return "";
      }
   }

   public static void a(aks $$0) {
      gw $$1 = a;
      int $$2 = $$1.u();
      int $$3 = $$1.v() - 2;
      int $$4 = $$1.w();
      gw.b($$2 - 2, $$3 + 1, $$4 - 2, $$2 + 2, $$3 + 3, $$4 + 2).forEach($$1x -> $$0.b($$1x, csy.a.n()));
      gw.b($$2 - 2, $$3, $$4 - 2, $$2 + 2, $$3, $$4 + 2).forEach($$1x -> $$0.b($$1x, csy.co.n()));
   }

   @Override
   protected djl<bis> E() {
      return this.M.d();
   }

   public void a(Stream<bis> $$0) {
      this.M.a($$0);
   }

   public void b(Stream<bis> $$0) {
      this.M.b($$0);
   }

   public void b(dhs $$0) {
      $$0.c(this.z_().e());
   }

   public void a(dhh $$0) {
      this.J.execute(() -> this.ac.a($$0.f(), $$0.g()));
   }

   @Override
   public void close() throws IOException {
      super.close();
      this.M.close();
   }

   @Override
   public String F() {
      return "Chunks[S] W: " + this.I.e() + " E: " + this.M.e();
   }

   public boolean c(long $$0) {
      return this.M.a($$0);
   }

   private boolean d(long $$0) {
      return this.c($$0) && this.I.a($$0);
   }

   public boolean e(gw $$0) {
      return this.M.a($$0) && this.I.a.j().c(cpe.a($$0));
   }

   public boolean f(gw $$0) {
      return this.M.a($$0);
   }

   public boolean a(cpe $$0) {
      return this.M.a($$0);
   }

   @Override
   public cee G() {
      return this.J.aT().M();
   }

   public ase a(aey $$0) {
      return this.ae.a($$0);
   }

   public bhg H() {
      return this.ae;
   }

   final class a implements djk<bis> {
      public void a(bis $$0) {
      }

      public void b(bis $$0) {
         aks.this.f().a($$0);
      }

      public void c(bis $$0) {
         aks.this.L.a($$0);
      }

      public void d(bis $$0) {
         aks.this.L.b($$0);
      }

      public void e(bis $$0) {
         aks.this.k().b($$0);
         if ($$0 instanceof akt $$1) {
            aks.this.H.add($$1);
            aks.this.e();
         }

         if ($$0 instanceof bjk $$2) {
            if (aks.this.U) {
               String $$3 = "onTrackingStart called during navigation iteration";
               ac.a("onTrackingStart called during navigation iteration", new IllegalStateException("onTrackingStart called during navigation iteration"));
            }

            aks.this.T.add($$2);
         }

         if ($$0 instanceof bxj $$4) {
            for (bxh $$5 : $$4.fZ()) {
               aks.this.aa.put($$5.ah(), $$5);
            }
         }

         $$0.a(djs::a);
      }

      public void f(bis $$0) {
         aks.this.k().a($$0);
         if ($$0 instanceof akt $$1) {
            aks.this.H.remove($$1);
            aks.this.e();
         }

         if ($$0 instanceof bjk $$2) {
            if (aks.this.U) {
               String $$3 = "onTrackingStart called during navigation iteration";
               ac.a("onTrackingStart called during navigation iteration", new IllegalStateException("onTrackingStart called during navigation iteration"));
            }

            aks.this.T.remove($$2);
         }

         if ($$0 instanceof bxj $$4) {
            for (bxh $$5 : $$4.fZ()) {
               aks.this.aa.remove($$5.ah());
            }
         }

         $$0.a(djs::b);
      }

      public void g(bis $$0) {
         $$0.a(djs::c);
      }
   }
}
