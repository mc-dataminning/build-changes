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

public class akq extends cpv implements cqp {
   public static final gw a = new gw(100, 50, 0);
   public static final bgd b = bgj.a(12000, 180000);
   public static final bgd c = bgj.a(12000, 24000);
   private static final bgd D = bgj.a(12000, 180000);
   public static final bgd d = bgj.a(3600, 15600);
   private static final Logger E = LogUtils.getLogger();
   private static final int F = 300;
   private static final int G = 65536;
   final List<akr> H = Lists.newArrayList();
   private final ako I;
   private final MinecraftServer J;
   private final ecl K;
   final djg L = new djg();
   private final djl<biq> M;
   private final dju N;
   public boolean e;
   private final aoj O;
   private int P;
   private final ebi Q;
   private final eiw<csv> R = new eiw<>(this::d, this.ae());
   private final eiw<eal> S = new eiw<>(this::d, this.ae());
   final Set<bji> T = new ObjectOpenHashSet();
   volatile boolean U;
   protected final cdd f;
   private final ObjectLinkedOpenHashSet<cpa> V = new ObjectLinkedOpenHashSet();
   private final List<cpa> W = new ArrayList<>(64);
   private boolean X;
   private final List<cpi> Y;
   @Nullable
   private div Z;
   final Int2ObjectMap<bxf> aa = new Int2ObjectOpenHashMap();
   private final cqn ab;
   private final dvj ac;
   private final boolean ad;
   private final bhe ae;

   public akq(
      MinecraftServer $$0,
      Executor $$1,
      ecg.c $$2,
      ecl $$3,
      aev<cpv> $$4,
      dit $$5,
      akz $$6,
      boolean $$7,
      long $$8,
      List<cpi> $$9,
      boolean $$10,
      @Nullable bhe $$11
   ) {
      super($$3, $$4, $$0.aU(), $$5.a(), $$0::aM, false, $$7, $$8, $$0.bc());
      this.ad = $$10;
      this.J = $$0;
      this.Y = $$9;
      this.K = $$3;
      dhg $$12 = $$5.b();
      boolean $$13 = $$0.aR();
      DataFixer $$14 = $$0.ay();
      djd<biq> $$15 = new dii(this, $$2.a($$4).resolve("entities"), $$14, $$13, $$0);
      this.M = new djl<>(biq.class, new akq.a(), $$15);
      this.I = new ako(this, $$2, $$14, $$0.aS(), $$1, $$12, $$0.ac().p(), $$0.ac().q(), $$13, $$6, this.M::a, () -> $$0.D().s());
      this.I.h().b();
      this.Q = new ebi(this);
      this.Q();
      this.T();
      this.B_().a($$0.as());
      this.f = this.s().a(cdd.a(this), cdd.a(this.ab()));
      if (!$$0.O()) {
         $$3.a($$0.t_());
      }

      long $$16 = $$0.aT().A().b();
      this.ac = new dvj(this.I.m(), this.G_(), $$0.aS(), $$4, $$12, this.I.i(), this, $$12.c(), $$16, $$14);
      this.ab = new cqn(this, $$0.aT().A(), this.ac);
      if (this.ac() == cpv.j && this.ab().a(diq.c)) {
         this.Z = new div(this, $$16, $$0.aT().E());
      } else {
         this.Z = null;
      }

      this.O = new aoj();
      this.N = new dju(this);
      this.ae = Objects.requireNonNullElseGet($$11, () -> this.s().a(bhe.a($$16), "random_sequences"));
   }

   @Deprecated
   @VisibleForTesting
   public void a(@Nullable div $$0) {
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
   public he<cqt> a(int $$0, int $$1, int $$2) {
      return this.k().g().c().getNoiseBiome($$0, $$1, $$2, this.k().i().b());
   }

   public cqn a() {
      return this.ab;
   }

   public void a(BooleanSupplier $$0) {
      bdp $$1 = this.ad();
      this.X = true;
      $$1.a("world border");
      this.B_().s();
      $$1.b("weather");
      this.ar();
      int $$2 = this.X().c(cpr.L);
      if (this.O.a($$2) && this.O.a($$2, this.H)) {
         if (this.X().b(cpr.k)) {
            long $$3 = this.A.f() + 24000L;
            this.b($$3 - $$3 % 24000L);
         }

         this.ap();
         if (this.X().b(cpr.u) && this.Z()) {
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
                     biq $$2x = $$1x.cY();
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
         if (this.A.q().b(cpr.k)) {
            this.b(this.A.f() + 1L);
         }
      }
   }

   public void b(long $$0) {
      this.K.b($$0);
   }

   public void a(boolean $$0, boolean $$1) {
      for (cpi $$2 : this.Y) {
         $$2.a(this, $$0, $$1);
      }
   }

   private boolean i(biq $$0) {
      return this.J.W() || !($$0 instanceof bur) && !($$0 instanceof bvt) ? !this.J.X() && $$0 instanceof cbg : true;
   }

   private void ap() {
      this.O.a();
      this.H.stream().filter(bjg::fC).collect(Collectors.toList()).forEach($$0 -> $$0.a(false, false));
   }

   public void a(dhq $$0, int $$1) {
      cpc $$2 = $$0.f();
      boolean $$3 = this.Z();
      int $$4 = $$2.d();
      int $$5 = $$2.e();
      bdp $$6 = this.ad();
      $$6.a("thunder");
      if ($$3 && this.Y() && this.z.a(100000) == 0) {
         gw $$7 = this.a(this.a($$4, 0, $$5, 15));
         if (this.q($$7)) {
            bgw $$8 = this.d_($$7);
            boolean $$9 = this.X().b(cpr.e) && this.z.j() < (double)$$8.b() * 0.01 && !this.a_($$7.d()).a(csw.rr);
            if ($$9) {
               bww $$10 = biu.aK.a((cpv)this);
               if ($$10 != null) {
                  $$10.w(true);
                  $$10.c_(0);
                  $$10.e((double)$$7.u(), (double)$$7.v(), (double)$$7.w());
                  this.b($$10);
               }
            }

            bjf $$11 = biu.ai.a((cpv)this);
            if ($$11 != null) {
               $$11.d(ehn.c($$7));
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
         dhr[] $$13 = $$0.d();

         for (int $$14 = 0; $$14 < $$13.length; $$14++) {
            dhr $$15 = $$13[$$14];
            if ($$15.d()) {
               int $$16 = $$0.g($$14);
               int $$17 = hw.c($$16);

               for (int $$18 = 0; $$18 < $$1; $$18++) {
                  gw $$19 = this.a($$4, $$17, $$5, 15);
                  $$6.a("randomTick");
                  dfj $$20 = $$15.a($$19.u() - $$4, $$19.v() - $$17, $$19.w() - $$5);
                  if ($$20.v()) {
                     $$20.b(this, $$19, this.z);
                  }

                  eam $$21 = $$20.u();
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
      gw $$2 = this.a(dks.a.e, $$1);
      gw $$3 = $$2.d();
      cqt $$4 = this.s($$2).a();
      if ($$4.a(this, $$3)) {
         this.b($$3, csw.dO.n());
      }

      if ($$0) {
         int $$5 = this.X().c(cpr.P);
         if ($$5 > 0 && $$4.b(this, $$2)) {
            dfj $$6 = this.a_($$2);
            if ($$6.a(csw.dN)) {
               int $$7 = $$6.c(dae.b);
               if ($$7 < Math.min($$5, 8)) {
                  dfj $$8 = $$6.a(dae.b, Integer.valueOf($$7 + 1));
                  csv.a($$6, $$8, this, $$2);
                  this.b($$2, $$8);
               }
            } else {
               this.b($$2, csw.dN.n());
            }
         }

         cqt.c $$9 = $$4.a($$3);
         if ($$9 != cqt.c.a) {
            dfj $$10 = this.a_($$3);
            $$10.b().a($$10, this, $$3, $$9);
         }
      }
   }

   private Optional<gw> D(gw $$0) {
      Optional<gw> $$1 = this.w().e($$0x -> $$0x.a(buj.t), $$0x -> $$0x.v() == this.a(dks.a.b, $$0x.u(), $$0x.w()) - 1, $$0, 128, buf.b.c);
      return $$1.map($$0x -> $$0x.b(1));
   }

   protected gw a(gw $$0) {
      gw $$1 = this.a(dks.a.e, $$0);
      Optional<gw> $$2 = this.D($$1);
      if ($$2.isPresent()) {
         return $$2.get();
      } else {
         ehi $$3 = new ehi($$1, new gw($$1.u(), this.aj(), $$1.w())).g(3.0);
         List<bjg> $$4 = this.a(bjg.class, $$3, $$0x -> $$0x != null && $$0x.bv() && this.g($$0x.dl()));
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
      return this.X().c(cpr.L) <= 100;
   }

   private void aq() {
      if (this.d()) {
         if (!this.n().O() || this.n().p()) {
            int $$0 = this.X().c(cpr.L);
            tl $$1;
            if (this.O.a($$0)) {
               $$1 = tl.c("sleep.skipping_night");
            } else {
               $$1 = tl.a("sleep.players_sleeping", this.O.b(), this.O.b($$0));
            }

            for (akr $$3 : this.H) {
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

   public afn f() {
      return this.J.aF();
   }

   private void ar() {
      boolean $$0 = this.Z();
      if (this.C_().g()) {
         if (this.X().b(cpr.u)) {
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

         this.y = arw.a(this.y, 0.0F, 1.0F);
         this.v = this.w;
         if (this.A.k()) {
            this.w += 0.01F;
         } else {
            this.w -= 0.01F;
         }

         this.w = arw.a(this.w, 0.0F, 1.0F);
      }

      if (this.v != this.w) {
         this.J.ac().a(new yb(yb.h, this.w), this.ac());
      }

      if (this.x != this.y) {
         this.J.ac().a(new yb(yb.i, this.y), this.ac());
      }

      if ($$0 != this.Z()) {
         if ($$0) {
            this.J.ac().a(new yb(yb.c, 0.0F));
         } else {
            this.J.ac().a(new yb(yb.b, 0.0F));
         }

         this.J.ac().a(new yb(yb.h, this.w));
         this.J.ac().a(new yb(yb.i, this.y));
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

   private void a(gw $$0, eal $$1) {
      eam $$2 = this.b_($$0);
      if ($$2.b($$1)) {
         $$2.a((cpv)this, $$0);
      }
   }

   private void d(gw $$0, csv $$1) {
      dfj $$2 = this.a_($$0);
      if ($$2.a($$1)) {
         $$2.a(this, $$0, this.z);
      }
   }

   public void a(biq $$0) {
      $$0.bn();
      bdp $$1 = this.ad();
      $$0.ah++;
      this.ad().a(() -> jb.h.b($$0.ag()).toString());
      $$1.d("tickNonPassenger");
      $$0.l();
      this.ad().c();

      for (biq $$2 : $$0.cP()) {
         this.a($$0, $$2);
      }
   }

   private void a(biq $$0, biq $$1) {
      if ($$1.dG() || $$1.cY() != $$0) {
         $$1.aa();
      } else if ($$1 instanceof cbu || this.L.c($$1)) {
         $$1.bn();
         $$1.ah++;
         bdp $$2 = this.ad();
         $$2.a(() -> jb.h.b($$1.ag()).toString());
         $$2.d("tickPassenger");
         $$1.by();
         $$2.c();

         for (biq $$3 : $$1.cP()) {
            this.a($$1, $$3);
         }
      }
   }

   @Override
   public boolean a(cbu $$0, gw $$1) {
      return !this.J.a(this, $$1, $$0) && this.B_().a($$1);
   }

   public void a(@Nullable asb $$0, boolean $$1, boolean $$2) {
      ako $$3 = this.k();
      if (!$$2) {
         if ($$0 != null) {
            $$0.a(tl.c("menu.savingLevel"));
         }

         this.at();
         if ($$0 != null) {
            $$0.c(tl.c("menu.savingChunks"));
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

   public <T extends biq> List<? extends T> a(djh<biq, T> $$0, Predicate<? super T> $$1) {
      List<T> $$2 = Lists.newArrayList();
      this.a($$0, $$1, $$2);
      return $$2;
   }

   public <T extends biq> void a(djh<biq, T> $$0, Predicate<? super T> $$1, List<? super T> $$2) {
      this.a($$0, $$1, $$2, Integer.MAX_VALUE);
   }

   public <T extends biq> void a(djh<biq, T> $$0, Predicate<? super T> $$1, List<? super T> $$2, int $$3) {
      this.E().a($$0, $$3x -> {
         if ($$1.test((T)$$3x)) {
            $$2.add((T)$$3x);
            if ($$2.size() >= $$3) {
               return aqn.a.b;
            }
         }

         return aqn.a.a;
      });
   }

   public List<? extends bxh> h() {
      return this.a(biu.C, bjg::bv);
   }

   public List<akr> a(Predicate<? super akr> $$0) {
      return this.a($$0, Integer.MAX_VALUE);
   }

   public List<akr> a(Predicate<? super akr> $$0, int $$1) {
      List<akr> $$2 = Lists.newArrayList();

      for (akr $$3 : this.H) {
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
   public akr i() {
      List<akr> $$0 = this.a(bjg::bv);
      return $$0.isEmpty() ? null : $$0.get(this.z.a($$0.size()));
   }

   @Override
   public boolean b(biq $$0) {
      return this.j($$0);
   }

   public boolean c(biq $$0) {
      return this.j($$0);
   }

   public void d(biq $$0) {
      this.j($$0);
   }

   public void a(akr $$0) {
      this.e($$0);
   }

   public void b(akr $$0) {
      this.e($$0);
   }

   public void c(akr $$0) {
      this.e($$0);
   }

   public void d(akr $$0) {
      this.e($$0);
   }

   private void e(akr $$0) {
      biq $$1 = this.E().a($$0.cv());
      if ($$1 != null) {
         E.warn("Force-added player with duplicate UUID {}", $$0.cv());
         $$1.ae();
         this.a((akr)$$1, biq.c.b);
      }

      this.M.a($$0);
   }

   private boolean j(biq $$0) {
      if ($$0.dG()) {
         E.warn("Tried to add entity {} but it was marked as removed already", biu.a($$0.ag()));
         return false;
      } else {
         return this.M.a($$0);
      }
   }

   public boolean e(biq $$0) {
      if ($$0.cR().map(biq::cv).anyMatch(this.M::a)) {
         return false;
      } else {
         this.a_($$0);
         return true;
      }
   }

   public void a(dhq $$0) {
      $$0.I();
      $$0.b(this);
   }

   public void a(akr $$0, biq.c $$1) {
      $$0.a($$1);
   }

   @Override
   public void a(int $$0, gw $$1, int $$2) {
      for (akr $$3 : this.J.ac().t()) {
         if ($$3 != null && $$3.dL() == this && $$3.ah() != $$0) {
            double $$4 = (double)$$1.u() - $$3.dq();
            double $$5 = (double)$$1.v() - $$3.ds();
            double $$6 = (double)$$1.w() - $$3.dw();
            if ($$4 * $$4 + $$5 * $$5 + $$6 * $$6 < 1024.0) {
               $$3.c.b(new xc($$0, $$1, $$2));
            }
         }
      }
   }

   @Override
   public void a(@Nullable cbu $$0, double $$1, double $$2, double $$3, he<apc> $$4, ape $$5, float $$6, float $$7, long $$8) {
      this.J.ac().a($$0, $$1, $$2, $$3, (double)$$4.a().a($$6), this.ac(), new aan($$4, $$5, $$1, $$2, $$3, $$6, $$7, $$8));
   }

   @Override
   public void a(@Nullable cbu $$0, biq $$1, he<apc> $$2, ape $$3, float $$4, float $$5, long $$6) {
      this.J.ac().a($$0, $$1.dq(), $$1.ds(), $$1.dw(), (double)$$2.a().a($$4), this.ac(), new aam($$2, $$3, $$1, $$4, $$5, $$6));
   }

   @Override
   public void b(int $$0, gw $$1, int $$2) {
      if (this.X().b(cpr.S)) {
         this.J.ac().a(new yh($$0, $$1, $$2, true));
      } else {
         this.a(null, $$0, $$1, $$2);
      }
   }

   @Override
   public void a(@Nullable cbu $$0, int $$1, gw $$2, int $$3) {
      this.J.ac().a($$0, (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), 64.0, this.ac(), new yh($$1, $$2, $$3, false));
   }

   public int j() {
      return this.C_().p();
   }

   @Override
   public void a(djt $$0, ehn $$1, djt.a $$2) {
      this.N.a($$0, $$1, $$2);
   }

   @Override
   public void a(gw $$0, dfj $$1, dfj $$2, int $$3) {
      if (this.U) {
         String $$4 = "recursive call to sendBlockUpdated";
         ac.a("recursive call to sendBlockUpdated", new IllegalStateException("recursive call to sendBlockUpdated"));
      }

      this.k().a($$0);
      eig $$5 = $$1.k(this, $$0);
      eig $$6 = $$2.k(this, $$0);
      if (eid.c($$5, $$6, ehr.g)) {
         List<bsp> $$7 = new ObjectArrayList();

         for (bji $$8 : this.T) {
            bsp $$9 = $$8.L();
            if ($$9.b($$0)) {
               $$7.add($$9);
            }
         }

         try {
            this.U = true;

            for (bsp $$10 : $$7) {
               $$10.i();
            }
         } finally {
            this.U = false;
         }
      }
   }

   @Override
   public void a(gw $$0, csv $$1) {
      this.s.a($$0, $$1, null);
   }

   @Override
   public void a(gw $$0, csv $$1, ha $$2) {
      this.s.a($$0, $$1, $$2);
   }

   @Override
   public void a(gw $$0, csv $$1, gw $$2) {
      this.s.a($$0, $$1, $$2);
   }

   @Override
   public void a(dfj $$0, gw $$1, csv $$2, gw $$3, boolean $$4) {
      this.s.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public void a(biq $$0, byte $$1) {
      this.k().a($$0, new xy($$0, $$1));
   }

   @Override
   public void a(biq $$0, bho $$1) {
      this.k().a($$0, new xv($$0, $$1));
   }

   public ako k() {
      return this.I;
   }

   @Override
   public cpn a(@Nullable biq $$0, @Nullable bho $$1, @Nullable cpo $$2, double $$3, double $$4, double $$5, float $$6, boolean $$7, cpv.a $$8) {
      cpn $$9 = this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, false);
      if (!$$9.b()) {
         $$9.g();
      }

      for (akr $$10 : this.H) {
         if ($$10.i($$3, $$4, $$5) < 4096.0) {
            $$10.c.b(new xz($$3, $$4, $$5, $$6, $$9.h(), $$9.d().get($$10)));
         }
      }

      return $$9;
   }

   @Override
   public void a(gw $$0, csv $$1, int $$2, int $$3) {
      this.V.add(new cpa($$0, $$1, $$2, $$3));
   }

   private void au() {
      this.W.clear();

      while (!this.V.isEmpty()) {
         cpa $$0 = (cpa)this.V.removeFirst();
         if (this.m($$0.a())) {
            if (this.a($$0)) {
               this.J.ac().a(null, (double)$$0.a().u(), (double)$$0.a().v(), (double)$$0.a().w(), 64.0, this.ac(), new xe($$0.a(), $$0.b(), $$0.c(), $$0.d()));
            }
         } else {
            this.W.add($$0);
         }
      }

      this.V.addAll(this.W);
   }

   private boolean a(cpa $$0) {
      dfj $$1 = this.a_($$0.a());
      return $$1.a($$0.b()) ? $$1.a(this, $$0.a(), $$0.c(), $$0.d()) : false;
   }

   public eiw<csv> l() {
      return this.R;
   }

   public eiw<eal> m() {
      return this.S;
   }

   @Nonnull
   @Override
   public MinecraftServer n() {
      return this.J;
   }

   public ebi o() {
      return this.Q;
   }

   public dzc p() {
      return this.J.aS();
   }

   public <T extends it> int a(T $$0, double $$1, double $$2, double $$3, int $$4, double $$5, double $$6, double $$7, double $$8) {
      yi $$9 = new yi($$0, false, $$1, $$2, $$3, (float)$$5, (float)$$6, (float)$$7, (float)$$8, $$4);
      int $$10 = 0;

      for (int $$11 = 0; $$11 < this.H.size(); $$11++) {
         akr $$12 = this.H.get($$11);
         if (this.a($$12, false, $$1, $$2, $$3, $$9)) {
            $$10++;
         }
      }

      return $$10;
   }

   public <T extends it> boolean a(akr $$0, T $$1, boolean $$2, double $$3, double $$4, double $$5, int $$6, double $$7, double $$8, double $$9, double $$10) {
      vd<?> $$11 = new yi($$1, $$2, $$3, $$4, $$5, (float)$$7, (float)$$8, (float)$$9, (float)$$10, $$6);
      return this.a($$0, $$2, $$3, $$4, $$5, $$11);
   }

   private boolean a(akr $$0, boolean $$1, double $$2, double $$3, double $$4, vd<?> $$5) {
      if ($$0.dL() != this) {
         return false;
      } else {
         gw $$6 = $$0.dl();
         if ($$6.a(new ehn($$2, $$3, $$4), $$1 ? 512.0 : 32.0)) {
            $$0.c.b($$5);
            return true;
         } else {
            return false;
         }
      }
   }

   @Nullable
   @Override
   public biq a(int $$0) {
      return this.E().a($$0);
   }

   @Deprecated
   @Nullable
   public biq b(int $$0) {
      biq $$1 = this.E().a($$0);
      return $$1 != null ? $$1 : (biq)this.aa.get($$0);
   }

   @Nullable
   public biq a(UUID $$0) {
      return this.E().a($$0);
   }

   @Nullable
   public gw a(aqh<dvi> $$0, gw $$1, int $$2, boolean $$3) {
      if (!this.J.aT().A().c()) {
         return null;
      } else {
         Optional<hi.c<dvi>> $$4 = this.G_().d(jc.az).b($$0);
         if ($$4.isEmpty()) {
            return null;
         } else {
            Pair<gw, he<dvi>> $$5 = this.k().g().a(this, $$4.get(), $$1, $$2, $$3);
            return $$5 != null ? (gw)$$5.getFirst() : null;
         }
      }
   }

   @Nullable
   public Pair<gw, he<cqt>> a(Predicate<he<cqt>> $$0, gw $$1, int $$2, int $$3, int $$4) {
      return this.k().g().c().a($$1, $$2, $$3, $$4, $$0, this.k().i().b(), this);
   }

   @Override
   public cml q() {
      return this.J.aE();
   }

   @Override
   public boolean r() {
      return this.e;
   }

   public ecc s() {
      return this.k().k();
   }

   @Nullable
   @Override
   public ebw a(String $$0) {
      return this.n().D().s().b(ebw.a(), $$0);
   }

   @Override
   public void a(String $$0, ebw $$1) {
      this.n().D().s().a($$0, $$1);
   }

   @Override
   public int t() {
      return this.n().D().s().a(ebv.a(), "idcounts").b();
   }

   public void a(gw $$0, float $$1) {
      cpc $$2 = new cpc(new gw(this.A.a(), 0, this.A.c()));
      this.A.a($$0, $$1);
      this.k().b(akv.a, $$2, 11, asx.a);
      this.k().a(akv.a, new cpc($$0), 11, asx.a);
      this.n().ac().a(new zv($$0, $$1));
   }

   public LongSet u() {
      cpq $$0 = this.s().b(cpq.a(), "chunks");
      return (LongSet)($$0 != null ? LongSets.unmodifiable($$0.b()) : LongSets.EMPTY_SET);
   }

   public boolean a(int $$0, int $$1, boolean $$2) {
      cpq $$3 = this.s().a(cpq.a(), "chunks");
      cpc $$4 = new cpc($$0, $$1);
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
   public List<akr> v() {
      return this.H;
   }

   @Override
   public void a(gw $$0, dfj $$1, dfj $$2) {
      Optional<he<bui>> $$3 = buj.a($$1);
      Optional<he<bui>> $$4 = buj.a($$2);
      if (!Objects.equals($$3, $$4)) {
         gw $$5 = $$0.i();
         $$3.ifPresent($$1x -> this.n().execute(() -> {
               this.w().a($$5);
               abb.b(this, $$5);
            }));
         $$4.ifPresent($$1x -> this.n().execute(() -> {
               this.w().a($$5, $$1x);
               abb.a(this, $$5);
            }));
      }
   }

   public buf w() {
      return this.k().l();
   }

   public boolean b(gw $$0) {
      return this.a($$0, 1);
   }

   public boolean a(hw $$0) {
      return this.b($$0.q());
   }

   public boolean a(gw $$0, int $$1) {
      return $$1 > 6 ? false : this.b(hw.a($$0)) <= $$1;
   }

   public int b(hw $$0) {
      return this.w().a($$0);
   }

   public cdd x() {
      return this.f;
   }

   @Nullable
   public cdb c(gw $$0) {
      return this.f.a($$0, 9216);
   }

   public boolean d(gw $$0) {
      return this.c($$0) != null;
   }

   public void a(buc $$0, biq $$1, bjv $$2) {
      $$2.a($$0, $$1);
   }

   public void a(Path $$0) throws IOException {
      aka $$1 = this.k().a;

      try (Writer $$2 = Files.newBufferedWriter($$0.resolve("stats.txt"))) {
         $$2.write(String.format(Locale.ROOT, "spawning_chunks: %d\n", $$1.j().b()));
         cqg.d $$3 = this.k().n();
         if ($$3 != null) {
            ObjectIterator $$9 = $$3.b().object2IntEntrySet().iterator();

            while ($$9.hasNext()) {
               Entry<bjj> $$4 = (Entry<bjj>)$$9.next();
               $$2.write(String.format(Locale.ROOT, "spawn_count.%s: %d\n", ((bjj)$$4.getKey()).a(), $$4.getIntValue()));
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

   private static void a(Writer $$0, Iterable<biq> $$1) throws IOException {
      aqy $$2 = aqy.a().a("x").a("y").a("z").a("uuid").a("type").a("alive").a("display_name").a("custom_name").a($$0);

      for (biq $$3 : $$1) {
         tl $$4 = $$3.ad();
         tl $$5 = $$3.N_();
         $$2.a($$3.dq(), $$3.ds(), $$3.dw(), $$3.cv(), jb.h.b($$3.ag()), $$3.bv(), $$5.getString(), $$4 != null ? $$4.getString() : null);
      }
   }

   private void a(Writer $$0) throws IOException {
      aqy $$1 = aqy.a().a("x").a("y").a("z").a("type").a($$0);

      for (del $$2 : this.r) {
         gw $$3 = $$2.c();
         $$1.a($$3.u(), $$3.v(), $$3.w(), $$2.d());
      }
   }

   @VisibleForTesting
   public void a(dva $$0) {
      this.V.removeIf($$1 -> $$0.b($$1.a()));
   }

   @Override
   public void b(gw $$0, csv $$1) {
      if (!this.af()) {
         this.a($$0, $$1);
      }
   }

   @Override
   public float a(ha $$0, boolean $$1) {
      return 1.0F;
   }

   public Iterable<biq> y() {
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
   public div B() {
      return this.Z;
   }

   @Override
   public akq C() {
      return this;
   }

   @VisibleForTesting
   public String D() {
      return String.format(
         Locale.ROOT,
         "players: %s, entities: %s [%s], block_entities: %d [%s], block_ticks: %d, fluid_ticks: %d, chunk_source: %s",
         this.H.size(),
         this.M.e(),
         a(this.M.d().a(), $$0 -> jb.h.b($$0.ag()).toString()),
         this.r.size(),
         a(this.r, del::d),
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

   public static void a(akq $$0) {
      gw $$1 = a;
      int $$2 = $$1.u();
      int $$3 = $$1.v() - 2;
      int $$4 = $$1.w();
      gw.b($$2 - 2, $$3 + 1, $$4 - 2, $$2 + 2, $$3 + 3, $$4 + 2).forEach($$1x -> $$0.b($$1x, csw.a.n()));
      gw.b($$2 - 2, $$3, $$4 - 2, $$2 + 2, $$3, $$4 + 2).forEach($$1x -> $$0.b($$1x, csw.co.n()));
   }

   @Override
   protected djj<biq> E() {
      return this.M.d();
   }

   public void a(Stream<biq> $$0) {
      this.M.a($$0);
   }

   public void b(Stream<biq> $$0) {
      this.M.b($$0);
   }

   public void b(dhq $$0) {
      $$0.c(this.z_().e());
   }

   public void a(dhf $$0) {
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
      return this.M.a($$0) && this.I.a.j().c(cpc.a($$0));
   }

   public boolean f(gw $$0) {
      return this.M.a($$0);
   }

   public boolean a(cpc $$0) {
      return this.M.a($$0);
   }

   @Override
   public cec G() {
      return this.J.aT().M();
   }

   public asc a(aew $$0) {
      return this.ae.a($$0);
   }

   public bhe H() {
      return this.ae;
   }

   final class a implements dji<biq> {
      public void a(biq $$0) {
      }

      public void b(biq $$0) {
         akq.this.f().a($$0);
      }

      public void c(biq $$0) {
         akq.this.L.a($$0);
      }

      public void d(biq $$0) {
         akq.this.L.b($$0);
      }

      public void e(biq $$0) {
         akq.this.k().b($$0);
         if ($$0 instanceof akr $$1) {
            akq.this.H.add($$1);
            akq.this.e();
         }

         if ($$0 instanceof bji $$2) {
            if (akq.this.U) {
               String $$3 = "onTrackingStart called during navigation iteration";
               ac.a("onTrackingStart called during navigation iteration", new IllegalStateException("onTrackingStart called during navigation iteration"));
            }

            akq.this.T.add($$2);
         }

         if ($$0 instanceof bxh $$4) {
            for (bxf $$5 : $$4.fZ()) {
               akq.this.aa.put($$5.ah(), $$5);
            }
         }

         $$0.a(djq::a);
      }

      public void f(biq $$0) {
         akq.this.k().a($$0);
         if ($$0 instanceof akr $$1) {
            akq.this.H.remove($$1);
            akq.this.e();
         }

         if ($$0 instanceof bji $$2) {
            if (akq.this.U) {
               String $$3 = "onTrackingStart called during navigation iteration";
               ac.a("onTrackingStart called during navigation iteration", new IllegalStateException("onTrackingStart called during navigation iteration"));
            }

            akq.this.T.remove($$2);
         }

         if ($$0 instanceof bxh $$4) {
            for (bxf $$5 : $$4.fZ()) {
               akq.this.aa.remove($$5.ah());
            }
         }

         $$0.a(djq::b);
      }

      public void g(biq $$0) {
         $$0.a(djq::c);
      }
   }
}
