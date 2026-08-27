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

public class aki extends cpk implements cqe {
   public static final gv a = new gv(100, 50, 0);
   public static final bft b = bfz.a(12000, 180000);
   public static final bft c = bfz.a(12000, 24000);
   private static final bft D = bfz.a(12000, 180000);
   public static final bft d = bfz.a(3600, 15600);
   private static final Logger E = LogUtils.getLogger();
   private static final int F = 300;
   private static final int G = 65536;
   final List<akj> H = Lists.newArrayList();
   private final akg I;
   private final MinecraftServer J;
   private final eca K;
   final div L = new div();
   private final dja<big> M;
   private final djj N;
   public boolean e;
   private final aoa O;
   private int P;
   private final eax Q;
   private final eio<csk> R = new eio<>(this::d, this.ae());
   private final eio<eaa> S = new eio<>(this::d, this.ae());
   final Set<biy> T = new ObjectOpenHashSet();
   volatile boolean U;
   protected final ccu f;
   private final ObjectLinkedOpenHashSet<cop> V = new ObjectLinkedOpenHashSet();
   private final List<cop> W = new ArrayList<>(64);
   private boolean X;
   private final List<cox> Y;
   @Nullable
   private dik Z;
   final Int2ObjectMap<bww> aa = new Int2ObjectOpenHashMap();
   private final cqc ab;
   private final duy ac;
   private final boolean ad;
   private final bgu ae;

   public aki(
      MinecraftServer $$0,
      Executor $$1,
      ebv.c $$2,
      eca $$3,
      aeo<cpk> $$4,
      dii $$5,
      akr $$6,
      boolean $$7,
      long $$8,
      List<cox> $$9,
      boolean $$10,
      @Nullable bgu $$11
   ) {
      super($$3, $$4, $$0.aV(), $$5.a(), $$0::aN, false, $$7, $$8, $$0.bd());
      this.ad = $$10;
      this.J = $$0;
      this.Y = $$9;
      this.K = $$3;
      dgv $$12 = $$5.b();
      boolean $$13 = $$0.aS();
      DataFixer $$14 = $$0.ay();
      dis<big> $$15 = new dhx(this, $$2.a($$4).resolve("entities"), $$14, $$13, $$0);
      this.M = new dja<>(big.class, new aki.a(), $$15);
      this.I = new akg(this, $$2, $$14, $$0.aT(), $$1, $$12, $$0.ac().p(), $$0.ac().q(), $$13, $$6, this.M::a, () -> $$0.D().s());
      this.I.h().b();
      this.Q = new eax(this);
      this.Q();
      this.T();
      this.w_().a($$0.as());
      this.f = this.s().a(ccu.a(this), ccu.a(this.ab()));
      if (!$$0.O()) {
         $$3.a($$0.o_());
      }

      long $$16 = $$0.aU().A().b();
      this.ac = new duy(this.I.m(), this.B_(), $$0.aT(), $$4, $$12, this.I.i(), this, $$12.c(), $$16, $$14);
      this.ab = new cqc(this, $$0.aU().A(), this.ac);
      if (this.ac() == cpk.j && this.ab().a(dif.c)) {
         this.Z = new dik(this, $$16, $$0.aU().E());
      } else {
         this.Z = null;
      }

      this.O = new aoa();
      this.N = new djj(this);
      this.ae = Objects.requireNonNullElseGet($$11, () -> this.s().a(bgu.a($$16), "random_sequences"));
   }

   @Deprecated
   @VisibleForTesting
   public void a(@Nullable dik $$0) {
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
   public hf<cqi> a(int $$0, int $$1, int $$2) {
      return this.k().g().c().getNoiseBiome($$0, $$1, $$2, this.k().i().b());
   }

   public cqc a() {
      return this.ab;
   }

   public void a(BooleanSupplier $$0) {
      bde $$1 = this.ad();
      this.X = true;
      $$1.a("world border");
      this.w_().s();
      $$1.b("weather");
      this.ar();
      int $$2 = this.X().c(cpg.L);
      if (this.O.a($$2) && this.O.a($$2, this.H)) {
         if (this.X().b(cpg.k)) {
            long $$3 = this.A.f() + 24000L;
            this.b($$3 - $$3 % 24000L);
         }

         this.ap();
         if (this.X().b(cpg.u) && this.Z()) {
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
            if (!$$1x.dF()) {
               if (this.i($$1x)) {
                  $$1x.ak();
               } else {
                  $$1.a("checkDespawn");
                  $$1x.dw();
                  $$1.c();
                  if (this.I.a.j().c($$1x.dm().a())) {
                     big $$2x = $$1x.cY();
                     if ($$2x != null) {
                        if (!$$2x.dF() && $$2x.x($$1x)) {
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
         if (this.A.q().b(cpg.k)) {
            this.b(this.A.f() + 1L);
         }
      }
   }

   public void b(long $$0) {
      this.K.b($$0);
   }

   public void a(boolean $$0, boolean $$1) {
      for (cox $$2 : this.Y) {
         $$2.a(this, $$0, $$1);
      }
   }

   private boolean i(big $$0) {
      return this.J.W() || !($$0 instanceof bui) && !($$0 instanceof bvk) ? !this.J.X() && $$0 instanceof cax : true;
   }

   private void ap() {
      this.O.a();
      this.H.stream().filter(biw::fB).collect(Collectors.toList()).forEach($$0 -> $$0.a(false, false));
   }

   public void a(dhf $$0, int $$1) {
      cor $$2 = $$0.f();
      boolean $$3 = this.Z();
      int $$4 = $$2.d();
      int $$5 = $$2.e();
      bde $$6 = this.ad();
      $$6.a("thunder");
      if ($$3 && this.Y() && this.z.a(100000) == 0) {
         gv $$7 = this.a(this.a($$4, 0, $$5, 15));
         if (this.q($$7)) {
            bgm $$8 = this.d_($$7);
            boolean $$9 = this.X().b(cpg.e) && this.z.j() < (double)$$8.b() * 0.01 && !this.a_($$7.d()).a(csl.rr);
            if ($$9) {
               bwn $$10 = bik.aK.a((cpk)this);
               if ($$10 != null) {
                  $$10.w(true);
                  $$10.c_(0);
                  $$10.e((double)$$7.u(), (double)$$7.v(), (double)$$7.w());
                  this.b($$10);
               }
            }

            biv $$11 = bik.ai.a((cpk)this);
            if ($$11 != null) {
               $$11.d(ehf.c($$7));
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
         dhg[] $$13 = $$0.d();

         for (int $$14 = 0; $$14 < $$13.length; $$14++) {
            dhg $$15 = $$13[$$14];
            if ($$15.d()) {
               int $$16 = $$0.g($$14);
               int $$17 = hy.c($$16);

               for (int $$18 = 0; $$18 < $$1; $$18++) {
                  gv $$19 = this.a($$4, $$17, $$5, 15);
                  $$6.a("randomTick");
                  dey $$20 = $$15.a($$19.u() - $$4, $$19.v() - $$17, $$19.w() - $$5);
                  if ($$20.v()) {
                     $$20.b(this, $$19, this.z);
                  }

                  eab $$21 = $$20.u();
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

   private void a(boolean $$0, gv $$1) {
      gv $$2 = this.a(dkh.a.e, $$1);
      gv $$3 = $$2.d();
      cqi $$4 = this.s($$2).a();
      if ($$4.a(this, $$3)) {
         this.b($$3, csl.dO.n());
      }

      if ($$0) {
         int $$5 = this.X().c(cpg.P);
         if ($$5 > 0 && $$4.b(this, $$2)) {
            dey $$6 = this.a_($$2);
            if ($$6.a(csl.dN)) {
               int $$7 = $$6.c(czt.b);
               if ($$7 < Math.min($$5, 8)) {
                  dey $$8 = $$6.a(czt.b, Integer.valueOf($$7 + 1));
                  csk.a($$6, $$8, this, $$2);
                  this.b($$2, $$8);
               }
            } else {
               this.b($$2, csl.dN.n());
            }
         }

         cqi.c $$9 = $$4.a($$3);
         if ($$9 != cqi.c.a) {
            dey $$10 = this.a_($$3);
            $$10.b().a($$10, this, $$3, $$9);
         }
      }
   }

   private Optional<gv> D(gv $$0) {
      Optional<gv> $$1 = this.w().e($$0x -> $$0x.a(bua.t), $$0x -> $$0x.v() == this.a(dkh.a.b, $$0x.u(), $$0x.w()) - 1, $$0, 128, btw.b.c);
      return $$1.map($$0x -> $$0x.b(1));
   }

   protected gv a(gv $$0) {
      gv $$1 = this.a(dkh.a.e, $$0);
      Optional<gv> $$2 = this.D($$1);
      if ($$2.isPresent()) {
         return $$2.get();
      } else {
         eha $$3 = new eha($$1, new gv($$1.u(), this.aj(), $$1.w())).g(3.0);
         List<biw> $$4 = this.a(biw.class, $$3, $$0x -> $$0x != null && $$0x.bv() && this.g($$0x.dk()));
         if (!$$4.isEmpty()) {
            return $$4.get(this.z.a($$4.size())).dk();
         } else {
            if ($$1.v() == this.C_() - 1) {
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
      return this.X().c(cpg.L) <= 100;
   }

   private void aq() {
      if (this.d()) {
         if (!this.n().O() || this.n().p()) {
            int $$0 = this.X().c(cpg.L);
            te $$1;
            if (this.O.a($$0)) {
               $$1 = te.c("sleep.skipping_night");
            } else {
               $$1 = te.a("sleep.players_sleeping", this.O.b(), this.O.b($$0));
            }

            for (akj $$3 : this.H) {
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

   public afg f() {
      return this.J.aF();
   }

   private void ar() {
      boolean $$0 = this.Z();
      if (this.x_().g()) {
         if (this.X().b(cpg.u)) {
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

         this.y = aro.a(this.y, 0.0F, 1.0F);
         this.v = this.w;
         if (this.A.k()) {
            this.w += 0.01F;
         } else {
            this.w -= 0.01F;
         }

         this.w = aro.a(this.w, 0.0F, 1.0F);
      }

      if (this.v != this.w) {
         this.J.ac().a(new xu(xu.h, this.w), this.ac());
      }

      if (this.x != this.y) {
         this.J.ac().a(new xu(xu.i, this.y), this.ac());
      }

      if ($$0 != this.Z()) {
         if ($$0) {
            this.J.ac().a(new xu(xu.c, 0.0F));
         } else {
            this.J.ac().a(new xu(xu.b, 0.0F));
         }

         this.J.ac().a(new xu(xu.h, this.w));
         this.J.ac().a(new xu(xu.i, this.y));
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

   private void a(gv $$0, eaa $$1) {
      eab $$2 = this.b_($$0);
      if ($$2.b($$1)) {
         $$2.a((cpk)this, $$0);
      }
   }

   private void d(gv $$0, csk $$1) {
      dey $$2 = this.a_($$0);
      if ($$2.a($$1)) {
         $$2.a(this, $$0, this.z);
      }
   }

   public void a(big $$0) {
      $$0.bn();
      bde $$1 = this.ad();
      $$0.ah++;
      this.ad().a(() -> jc.h.b($$0.ag()).toString());
      $$1.d("tickNonPassenger");
      $$0.l();
      this.ad().c();

      for (big $$2 : $$0.cP()) {
         this.a($$0, $$2);
      }
   }

   private void a(big $$0, big $$1) {
      if ($$1.dF() || $$1.cY() != $$0) {
         $$1.aa();
      } else if ($$1 instanceof cbl || this.L.c($$1)) {
         $$1.bn();
         $$1.ah++;
         bde $$2 = this.ad();
         $$2.a(() -> jc.h.b($$1.ag()).toString());
         $$2.d("tickPassenger");
         $$1.by();
         $$2.c();

         for (big $$3 : $$1.cP()) {
            this.a($$1, $$3);
         }
      }
   }

   @Override
   public boolean a(cbl $$0, gv $$1) {
      return !this.J.a(this, $$1, $$0) && this.w_().a($$1);
   }

   public void a(@Nullable ars $$0, boolean $$1, boolean $$2) {
      akg $$3 = this.k();
      if (!$$2) {
         if ($$0 != null) {
            $$0.a(te.c("menu.savingLevel"));
         }

         this.at();
         if ($$0 != null) {
            $$0.c(te.c("menu.savingChunks"));
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
         this.J.aU().a(this.Z.b());
      }

      this.k().k().a();
   }

   public <T extends big> List<? extends T> a(diw<big, T> $$0, Predicate<? super T> $$1) {
      List<T> $$2 = Lists.newArrayList();
      this.a($$0, $$1, $$2);
      return $$2;
   }

   public <T extends big> void a(diw<big, T> $$0, Predicate<? super T> $$1, List<? super T> $$2) {
      this.a($$0, $$1, $$2, Integer.MAX_VALUE);
   }

   public <T extends big> void a(diw<big, T> $$0, Predicate<? super T> $$1, List<? super T> $$2, int $$3) {
      this.E().a($$0, $$3x -> {
         if ($$1.test((T)$$3x)) {
            $$2.add((T)$$3x);
            if ($$2.size() >= $$3) {
               return aqe.a.b;
            }
         }

         return aqe.a.a;
      });
   }

   public List<? extends bwy> h() {
      return this.a(bik.C, biw::bv);
   }

   public List<akj> a(Predicate<? super akj> $$0) {
      return this.a($$0, Integer.MAX_VALUE);
   }

   public List<akj> a(Predicate<? super akj> $$0, int $$1) {
      List<akj> $$2 = Lists.newArrayList();

      for (akj $$3 : this.H) {
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
   public akj i() {
      List<akj> $$0 = this.a(biw::bv);
      return $$0.isEmpty() ? null : $$0.get(this.z.a($$0.size()));
   }

   @Override
   public boolean b(big $$0) {
      return this.j($$0);
   }

   public boolean c(big $$0) {
      return this.j($$0);
   }

   public void d(big $$0) {
      this.j($$0);
   }

   public void a(akj $$0) {
      this.e($$0);
   }

   public void b(akj $$0) {
      this.e($$0);
   }

   public void c(akj $$0) {
      this.e($$0);
   }

   public void d(akj $$0) {
      this.e($$0);
   }

   private void e(akj $$0) {
      big $$1 = this.E().a($$0.cv());
      if ($$1 != null) {
         E.warn("Force-added player with duplicate UUID {}", $$0.cv().toString());
         $$1.ae();
         this.a((akj)$$1, big.c.b);
      }

      this.M.a($$0);
   }

   private boolean j(big $$0) {
      if ($$0.dF()) {
         E.warn("Tried to add entity {} but it was marked as removed already", bik.a($$0.ag()));
         return false;
      } else {
         return this.M.a($$0);
      }
   }

   public boolean e(big $$0) {
      if ($$0.cR().map(big::cv).anyMatch(this.M::a)) {
         return false;
      } else {
         this.a_($$0);
         return true;
      }
   }

   public void a(dhf $$0) {
      $$0.I();
      $$0.b(this);
   }

   public void a(akj $$0, big.c $$1) {
      $$0.a($$1);
   }

   @Override
   public void a(int $$0, gv $$1, int $$2) {
      for (akj $$3 : this.J.ac().t()) {
         if ($$3 != null && $$3.dK() == this && $$3.ah() != $$0) {
            double $$4 = (double)$$1.u() - $$3.dp();
            double $$5 = (double)$$1.v() - $$3.dr();
            double $$6 = (double)$$1.w() - $$3.dv();
            if ($$4 * $$4 + $$5 * $$5 + $$6 * $$6 < 1024.0) {
               $$3.c.b(new wv($$0, $$1, $$2));
            }
         }
      }
   }

   @Override
   public void a(@Nullable cbl $$0, double $$1, double $$2, double $$3, hf<aot> $$4, aov $$5, float $$6, float $$7, long $$8) {
      this.J.ac().a($$0, $$1, $$2, $$3, (double)$$4.a().a($$6), this.ac(), new aag($$4, $$5, $$1, $$2, $$3, $$6, $$7, $$8));
   }

   @Override
   public void a(@Nullable cbl $$0, big $$1, hf<aot> $$2, aov $$3, float $$4, float $$5, long $$6) {
      this.J.ac().a($$0, $$1.dp(), $$1.dr(), $$1.dv(), (double)$$2.a().a($$4), this.ac(), new aaf($$2, $$3, $$1, $$4, $$5, $$6));
   }

   @Override
   public void b(int $$0, gv $$1, int $$2) {
      if (this.X().b(cpg.S)) {
         this.J.ac().a(new ya($$0, $$1, $$2, true));
      } else {
         this.a(null, $$0, $$1, $$2);
      }
   }

   @Override
   public void a(@Nullable cbl $$0, int $$1, gv $$2, int $$3) {
      this.J.ac().a($$0, (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), 64.0, this.ac(), new ya($$1, $$2, $$3, false));
   }

   public int j() {
      return this.x_().p();
   }

   @Override
   public void a(dji $$0, ehf $$1, dji.a $$2) {
      this.N.a($$0, $$1, $$2);
   }

   @Override
   public void a(gv $$0, dey $$1, dey $$2, int $$3) {
      if (this.U) {
         String $$4 = "recursive call to sendBlockUpdated";
         ac.a("recursive call to sendBlockUpdated", new IllegalStateException("recursive call to sendBlockUpdated"));
      }

      this.k().a($$0);
      ehy $$5 = $$1.k(this, $$0);
      ehy $$6 = $$2.k(this, $$0);
      if (ehv.c($$5, $$6, ehj.g)) {
         List<bsg> $$7 = new ObjectArrayList();

         for (biy $$8 : this.T) {
            bsg $$9 = $$8.H();
            if ($$9.b($$0)) {
               $$7.add($$9);
            }
         }

         try {
            this.U = true;

            for (bsg $$10 : $$7) {
               $$10.i();
            }
         } finally {
            this.U = false;
         }
      }
   }

   @Override
   public void a(gv $$0, csk $$1) {
      this.s.a($$0, $$1, null);
   }

   @Override
   public void a(gv $$0, csk $$1, hb $$2) {
      this.s.a($$0, $$1, $$2);
   }

   @Override
   public void a(gv $$0, csk $$1, gv $$2) {
      this.s.a($$0, $$1, $$2);
   }

   @Override
   public void a(dey $$0, gv $$1, csk $$2, gv $$3, boolean $$4) {
      this.s.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public void a(big $$0, byte $$1) {
      this.k().a($$0, new xr($$0, $$1));
   }

   @Override
   public void a(big $$0, bhe $$1) {
      this.k().a($$0, new xo($$0, $$1));
   }

   public akg k() {
      return this.I;
   }

   @Override
   public cpc a(@Nullable big $$0, @Nullable bhe $$1, @Nullable cpd $$2, double $$3, double $$4, double $$5, float $$6, boolean $$7, cpk.a $$8) {
      cpc $$9 = this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, false);
      if (!$$9.b()) {
         $$9.g();
      }

      for (akj $$10 : this.H) {
         if ($$10.i($$3, $$4, $$5) < 4096.0) {
            $$10.c.b(new xs($$3, $$4, $$5, $$6, $$9.h(), $$9.d().get($$10)));
         }
      }

      return $$9;
   }

   @Override
   public void a(gv $$0, csk $$1, int $$2, int $$3) {
      this.V.add(new cop($$0, $$1, $$2, $$3));
   }

   private void au() {
      this.W.clear();

      while (!this.V.isEmpty()) {
         cop $$0 = (cop)this.V.removeFirst();
         if (this.m($$0.a())) {
            if (this.a($$0)) {
               this.J.ac().a(null, (double)$$0.a().u(), (double)$$0.a().v(), (double)$$0.a().w(), 64.0, this.ac(), new wx($$0.a(), $$0.b(), $$0.c(), $$0.d()));
            }
         } else {
            this.W.add($$0);
         }
      }

      this.V.addAll(this.W);
   }

   private boolean a(cop $$0) {
      dey $$1 = this.a_($$0.a());
      return $$1.a($$0.b()) ? $$1.a(this, $$0.a(), $$0.c(), $$0.d()) : false;
   }

   public eio<csk> l() {
      return this.R;
   }

   public eio<eaa> m() {
      return this.S;
   }

   @Nonnull
   @Override
   public MinecraftServer n() {
      return this.J;
   }

   public eax o() {
      return this.Q;
   }

   public dyr p() {
      return this.J.aT();
   }

   public <T extends iu> int a(T $$0, double $$1, double $$2, double $$3, int $$4, double $$5, double $$6, double $$7, double $$8) {
      yb $$9 = new yb($$0, false, $$1, $$2, $$3, (float)$$5, (float)$$6, (float)$$7, (float)$$8, $$4);
      int $$10 = 0;

      for (int $$11 = 0; $$11 < this.H.size(); $$11++) {
         akj $$12 = this.H.get($$11);
         if (this.a($$12, false, $$1, $$2, $$3, $$9)) {
            $$10++;
         }
      }

      return $$10;
   }

   public <T extends iu> boolean a(akj $$0, T $$1, boolean $$2, double $$3, double $$4, double $$5, int $$6, double $$7, double $$8, double $$9, double $$10) {
      uw<?> $$11 = new yb($$1, $$2, $$3, $$4, $$5, (float)$$7, (float)$$8, (float)$$9, (float)$$10, $$6);
      return this.a($$0, $$2, $$3, $$4, $$5, $$11);
   }

   private boolean a(akj $$0, boolean $$1, double $$2, double $$3, double $$4, uw<?> $$5) {
      if ($$0.dK() != this) {
         return false;
      } else {
         gv $$6 = $$0.dk();
         if ($$6.a(new ehf($$2, $$3, $$4), $$1 ? 512.0 : 32.0)) {
            $$0.c.b($$5);
            return true;
         } else {
            return false;
         }
      }
   }

   @Nullable
   @Override
   public big a(int $$0) {
      return this.E().a($$0);
   }

   @Deprecated
   @Nullable
   public big b(int $$0) {
      big $$1 = this.E().a($$0);
      return $$1 != null ? $$1 : (big)this.aa.get($$0);
   }

   @Nullable
   public big a(UUID $$0) {
      return this.E().a($$0);
   }

   @Nullable
   public gv a(apy<dux> $$0, gv $$1, int $$2, boolean $$3) {
      if (!this.J.aU().A().c()) {
         return null;
      } else {
         Optional<hj.c<dux>> $$4 = this.B_().d(jd.az).b($$0);
         if ($$4.isEmpty()) {
            return null;
         } else {
            Pair<gv, hf<dux>> $$5 = this.k().g().a(this, $$4.get(), $$1, $$2, $$3);
            return $$5 != null ? (gv)$$5.getFirst() : null;
         }
      }
   }

   @Nullable
   public Pair<gv, hf<cqi>> a(Predicate<hf<cqi>> $$0, gv $$1, int $$2, int $$3, int $$4) {
      return this.k().g().c().a($$1, $$2, $$3, $$4, $$0, this.k().i().b(), this);
   }

   @Override
   public cma q() {
      return this.J.aE();
   }

   @Override
   public boolean r() {
      return this.e;
   }

   public ebr s() {
      return this.k().k();
   }

   @Nullable
   @Override
   public ebl a(String $$0) {
      return this.n().D().s().b(ebl.a(), $$0);
   }

   @Override
   public void a(String $$0, ebl $$1) {
      this.n().D().s().a($$0, $$1);
   }

   @Override
   public int t() {
      return this.n().D().s().a(ebk.a(), "idcounts").b();
   }

   public void a(gv $$0, float $$1) {
      cor $$2 = new cor(new gv(this.A.a(), 0, this.A.c()));
      this.A.a($$0, $$1);
      this.k().b(akn.a, $$2, 11, asn.a);
      this.k().a(akn.a, new cor($$0), 11, asn.a);
      this.n().ac().a(new zo($$0, $$1));
   }

   public LongSet u() {
      cpf $$0 = this.s().b(cpf.a(), "chunks");
      return (LongSet)($$0 != null ? LongSets.unmodifiable($$0.b()) : LongSets.EMPTY_SET);
   }

   public boolean a(int $$0, int $$1, boolean $$2) {
      cpf $$3 = this.s().a(cpf.a(), "chunks");
      cor $$4 = new cor($$0, $$1);
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
   public List<akj> v() {
      return this.H;
   }

   @Override
   public void a(gv $$0, dey $$1, dey $$2) {
      Optional<hf<btz>> $$3 = bua.a($$1);
      Optional<hf<btz>> $$4 = bua.a($$2);
      if (!Objects.equals($$3, $$4)) {
         gv $$5 = $$0.i();
         $$3.ifPresent($$1x -> this.n().execute(() -> {
               this.w().a($$5);
               aau.b(this, $$5);
            }));
         $$4.ifPresent($$1x -> this.n().execute(() -> {
               this.w().a($$5, $$1x);
               aau.a(this, $$5);
            }));
      }
   }

   public btw w() {
      return this.k().l();
   }

   public boolean b(gv $$0) {
      return this.a($$0, 1);
   }

   public boolean a(hy $$0) {
      return this.b($$0.q());
   }

   public boolean a(gv $$0, int $$1) {
      return $$1 > 6 ? false : this.b(hy.a($$0)) <= $$1;
   }

   public int b(hy $$0) {
      return this.w().a($$0);
   }

   public ccu x() {
      return this.f;
   }

   @Nullable
   public ccs c(gv $$0) {
      return this.f.a($$0, 9216);
   }

   public boolean d(gv $$0) {
      return this.c($$0) != null;
   }

   public void a(btt $$0, big $$1, bjl $$2) {
      $$2.a($$0, $$1);
   }

   public void a(Path $$0) throws IOException {
      ajt $$1 = this.k().a;

      try (Writer $$2 = Files.newBufferedWriter($$0.resolve("stats.txt"))) {
         $$2.write(String.format(Locale.ROOT, "spawning_chunks: %d\n", $$1.j().b()));
         cpv.d $$3 = this.k().n();
         if ($$3 != null) {
            ObjectIterator $$9 = $$3.b().object2IntEntrySet().iterator();

            while ($$9.hasNext()) {
               Entry<biz> $$4 = (Entry<biz>)$$9.next();
               $$2.write(String.format(Locale.ROOT, "spawn_count.%s: %d\n", ((biz)$$4.getKey()).a(), $$4.getIntValue()));
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

   private static void a(Writer $$0, Iterable<big> $$1) throws IOException {
      aqp $$2 = aqp.a().a("x").a("y").a("z").a("uuid").a("type").a("alive").a("display_name").a("custom_name").a($$0);

      for (big $$3 : $$1) {
         te $$4 = $$3.ad();
         te $$5 = $$3.H_();
         $$2.a($$3.dp(), $$3.dr(), $$3.dv(), $$3.cv(), jc.h.b($$3.ag()), $$3.bv(), $$5.getString(), $$4 != null ? $$4.getString() : null);
      }
   }

   private void a(Writer $$0) throws IOException {
      aqp $$1 = aqp.a().a("x").a("y").a("z").a("type").a($$0);

      for (dea $$2 : this.r) {
         gv $$3 = $$2.c();
         $$1.a($$3.u(), $$3.v(), $$3.w(), $$2.d());
      }
   }

   @VisibleForTesting
   public void a(dup $$0) {
      this.V.removeIf($$1 -> $$0.b($$1.a()));
   }

   @Override
   public void b(gv $$0, csk $$1) {
      if (!this.af()) {
         this.a($$0, $$1);
      }
   }

   @Override
   public float a(hb $$0, boolean $$1) {
      return 1.0F;
   }

   public Iterable<big> y() {
      return this.E().a();
   }

   @Override
   public String toString() {
      return "ServerLevel[" + this.K.g() + "]";
   }

   public boolean z() {
      return this.J.aU().B();
   }

   @Override
   public long A() {
      return this.J.aU().A().b();
   }

   @Nullable
   public dik B() {
      return this.Z;
   }

   @Override
   public aki C() {
      return this;
   }

   @VisibleForTesting
   public String D() {
      return String.format(
         Locale.ROOT,
         "players: %s, entities: %s [%s], block_entities: %d [%s], block_ticks: %d, fluid_ticks: %d, chunk_source: %s",
         this.H.size(),
         this.M.e(),
         a(this.M.d().a(), $$0 -> jc.h.b($$0.ag()).toString()),
         this.r.size(),
         a(this.r, dea::d),
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

   public static void a(aki $$0) {
      gv $$1 = a;
      int $$2 = $$1.u();
      int $$3 = $$1.v() - 2;
      int $$4 = $$1.w();
      gv.b($$2 - 2, $$3 + 1, $$4 - 2, $$2 + 2, $$3 + 3, $$4 + 2).forEach($$1x -> $$0.b($$1x, csl.a.n()));
      gv.b($$2 - 2, $$3, $$4 - 2, $$2 + 2, $$3, $$4 + 2).forEach($$1x -> $$0.b($$1x, csl.co.n()));
   }

   @Override
   protected diy<big> E() {
      return this.M.d();
   }

   public void a(Stream<big> $$0) {
      this.M.a($$0);
   }

   public void b(Stream<big> $$0) {
      this.M.b($$0);
   }

   public void b(dhf $$0) {
      $$0.c(this.u_().e());
   }

   public void a(dgu $$0) {
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

   public boolean e(gv $$0) {
      return this.M.a($$0) && this.I.a.j().c(cor.a($$0));
   }

   public boolean f(gv $$0) {
      return this.M.a($$0);
   }

   public boolean a(cor $$0) {
      return this.M.a($$0);
   }

   @Override
   public cdt G() {
      return this.J.aU().M();
   }

   public art a(aep $$0) {
      return this.ae.a($$0);
   }

   public bgu H() {
      return this.ae;
   }

   final class a implements dix<big> {
      public void a(big $$0) {
      }

      public void b(big $$0) {
         aki.this.f().a($$0);
      }

      public void c(big $$0) {
         aki.this.L.a($$0);
      }

      public void d(big $$0) {
         aki.this.L.b($$0);
      }

      public void e(big $$0) {
         aki.this.k().b($$0);
         if ($$0 instanceof akj $$1) {
            aki.this.H.add($$1);
            aki.this.e();
         }

         if ($$0 instanceof biy $$2) {
            if (aki.this.U) {
               String $$3 = "onTrackingStart called during navigation iteration";
               ac.a("onTrackingStart called during navigation iteration", new IllegalStateException("onTrackingStart called during navigation iteration"));
            }

            aki.this.T.add($$2);
         }

         if ($$0 instanceof bwy $$4) {
            for (bww $$5 : $$4.fV()) {
               aki.this.aa.put($$5.ah(), $$5);
            }
         }

         $$0.a(djf::a);
      }

      public void f(big $$0) {
         aki.this.k().a($$0);
         if ($$0 instanceof akj $$1) {
            aki.this.H.remove($$1);
            aki.this.e();
         }

         if ($$0 instanceof biy $$2) {
            if (aki.this.U) {
               String $$3 = "onTrackingStart called during navigation iteration";
               ac.a("onTrackingStart called during navigation iteration", new IllegalStateException("onTrackingStart called during navigation iteration"));
            }

            aki.this.T.remove($$2);
         }

         if ($$0 instanceof bwy $$4) {
            for (bww $$5 : $$4.fV()) {
               aki.this.aa.remove($$5.ah());
            }
         }

         $$0.a(djf::b);
      }

      public void g(big $$0) {
         $$0.a(djf::c);
      }
   }
}
