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

public class akk extends cpl implements cqf {
   public static final gu a = new gu(100, 50, 0);
   public static final bfv b = bgb.a(12000, 180000);
   public static final bfv c = bgb.a(12000, 24000);
   private static final bfv D = bgb.a(12000, 180000);
   public static final bfv d = bgb.a(3600, 15600);
   private static final Logger E = LogUtils.getLogger();
   private static final int F = 300;
   private static final int G = 65536;
   final List<akl> H = Lists.newArrayList();
   private final aki I;
   private final MinecraftServer J;
   private final ecb K;
   final diw L = new diw();
   private final djb<bii> M;
   private final djk N;
   public boolean e;
   private final aoc O;
   private int P;
   private final eay Q;
   private final eim<csl> R = new eim<>(this::d, this.ae());
   private final eim<eab> S = new eim<>(this::d, this.ae());
   final Set<bja> T = new ObjectOpenHashSet();
   volatile boolean U;
   protected final ccv f;
   private final ObjectLinkedOpenHashSet<coq> V = new ObjectLinkedOpenHashSet();
   private final List<coq> W = new ArrayList<>(64);
   private boolean X;
   private final List<coy> Y;
   @Nullable
   private dil Z;
   final Int2ObjectMap<bwx> aa = new Int2ObjectOpenHashMap();
   private final cqd ab;
   private final duz ac;
   private final boolean ad;
   private final bgw ae;

   public akk(
      MinecraftServer $$0,
      Executor $$1,
      ebw.c $$2,
      ecb $$3,
      aeq<cpl> $$4,
      dij $$5,
      akt $$6,
      boolean $$7,
      long $$8,
      List<coy> $$9,
      boolean $$10,
      @Nullable bgw $$11
   ) {
      super($$3, $$4, $$0.aU(), $$5.a(), $$0::aM, false, $$7, $$8, $$0.bc());
      this.ad = $$10;
      this.J = $$0;
      this.Y = $$9;
      this.K = $$3;
      dgw $$12 = $$5.b();
      boolean $$13 = $$0.aR();
      DataFixer $$14 = $$0.ay();
      dit<bii> $$15 = new dhy(this, $$2.a($$4).resolve("entities"), $$14, $$13, $$0);
      this.M = new djb<>(bii.class, new akk.a(), $$15);
      this.I = new aki(this, $$2, $$14, $$0.aS(), $$1, $$12, $$0.ac().p(), $$0.ac().q(), $$13, $$6, this.M::a, () -> $$0.D().s());
      this.I.h().b();
      this.Q = new eay(this);
      this.Q();
      this.T();
      this.w_().a($$0.as());
      this.f = this.s().a(ccv.a(this), ccv.a(this.ab()));
      if (!$$0.O()) {
         $$3.a($$0.o_());
      }

      long $$16 = $$0.aT().A().b();
      this.ac = new duz(this.I.m(), this.B_(), $$0.aS(), $$4, $$12, this.I.i(), this, $$12.c(), $$16, $$14);
      this.ab = new cqd(this, $$0.aT().A(), this.ac);
      if (this.ac() == cpl.j && this.ab().a(dig.c)) {
         this.Z = new dil(this, $$16, $$0.aT().E());
      } else {
         this.Z = null;
      }

      this.O = new aoc();
      this.N = new djk(this);
      this.ae = Objects.requireNonNullElseGet($$11, () -> this.s().a(bgw.a($$16), "random_sequences"));
   }

   @Deprecated
   @VisibleForTesting
   public void a(@Nullable dil $$0) {
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
   public he<cqj> a(int $$0, int $$1, int $$2) {
      return this.k().g().c().getNoiseBiome($$0, $$1, $$2, this.k().i().b());
   }

   public cqd a() {
      return this.ab;
   }

   public void a(BooleanSupplier $$0) {
      bdh $$1 = this.ad();
      this.X = true;
      $$1.a("world border");
      this.w_().s();
      $$1.b("weather");
      this.ar();
      int $$2 = this.X().c(cph.L);
      if (this.O.a($$2) && this.O.a($$2, this.H)) {
         if (this.X().b(cph.k)) {
            long $$3 = this.A.f() + 24000L;
            this.b($$3 - $$3 % 24000L);
         }

         this.ap();
         if (this.X().b(cph.u) && this.Z()) {
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
                     bii $$2x = $$1x.cY();
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
         if (this.A.q().b(cph.k)) {
            this.b(this.A.f() + 1L);
         }
      }
   }

   public void b(long $$0) {
      this.K.b($$0);
   }

   public void a(boolean $$0, boolean $$1) {
      for (coy $$2 : this.Y) {
         $$2.a(this, $$0, $$1);
      }
   }

   private boolean i(bii $$0) {
      return this.J.W() || !($$0 instanceof buj) && !($$0 instanceof bvl) ? !this.J.X() && $$0 instanceof cay : true;
   }

   private void ap() {
      this.O.a();
      this.H.stream().filter(biy::fB).collect(Collectors.toList()).forEach($$0 -> $$0.a(false, false));
   }

   public void a(dhg $$0, int $$1) {
      cos $$2 = $$0.f();
      boolean $$3 = this.Z();
      int $$4 = $$2.d();
      int $$5 = $$2.e();
      bdh $$6 = this.ad();
      $$6.a("thunder");
      if ($$3 && this.Y() && this.z.a(100000) == 0) {
         gu $$7 = this.a(this.a($$4, 0, $$5, 15));
         if (this.q($$7)) {
            bgo $$8 = this.d_($$7);
            boolean $$9 = this.X().b(cph.e) && this.z.j() < (double)$$8.b() * 0.01 && !this.a_($$7.d()).a(csm.rr);
            if ($$9) {
               bwo $$10 = bim.aK.a((cpl)this);
               if ($$10 != null) {
                  $$10.w(true);
                  $$10.c_(0);
                  $$10.e((double)$$7.u(), (double)$$7.v(), (double)$$7.w());
                  this.b($$10);
               }
            }

            bix $$11 = bim.ai.a((cpl)this);
            if ($$11 != null) {
               $$11.d(ehd.c($$7));
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
         dhh[] $$13 = $$0.d();

         for (int $$14 = 0; $$14 < $$13.length; $$14++) {
            dhh $$15 = $$13[$$14];
            if ($$15.d()) {
               int $$16 = $$0.g($$14);
               int $$17 = hx.c($$16);

               for (int $$18 = 0; $$18 < $$1; $$18++) {
                  gu $$19 = this.a($$4, $$17, $$5, 15);
                  $$6.a("randomTick");
                  dez $$20 = $$15.a($$19.u() - $$4, $$19.v() - $$17, $$19.w() - $$5);
                  if ($$20.v()) {
                     $$20.b(this, $$19, this.z);
                  }

                  eac $$21 = $$20.u();
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

   private void a(boolean $$0, gu $$1) {
      gu $$2 = this.a(dki.a.e, $$1);
      gu $$3 = $$2.d();
      cqj $$4 = this.s($$2).a();
      if ($$4.a(this, $$3)) {
         this.b($$3, csm.dO.n());
      }

      if ($$0) {
         int $$5 = this.X().c(cph.P);
         if ($$5 > 0 && $$4.b(this, $$2)) {
            dez $$6 = this.a_($$2);
            if ($$6.a(csm.dN)) {
               int $$7 = $$6.c(czu.b);
               if ($$7 < Math.min($$5, 8)) {
                  dez $$8 = $$6.a(czu.b, Integer.valueOf($$7 + 1));
                  csl.a($$6, $$8, this, $$2);
                  this.b($$2, $$8);
               }
            } else {
               this.b($$2, csm.dN.n());
            }
         }

         cqj.c $$9 = $$4.a($$3);
         if ($$9 != cqj.c.a) {
            dez $$10 = this.a_($$3);
            $$10.b().a($$10, this, $$3, $$9);
         }
      }
   }

   private Optional<gu> D(gu $$0) {
      Optional<gu> $$1 = this.w().e($$0x -> $$0x.a(bub.t), $$0x -> $$0x.v() == this.a(dki.a.b, $$0x.u(), $$0x.w()) - 1, $$0, 128, btx.b.c);
      return $$1.map($$0x -> $$0x.b(1));
   }

   protected gu a(gu $$0) {
      gu $$1 = this.a(dki.a.e, $$0);
      Optional<gu> $$2 = this.D($$1);
      if ($$2.isPresent()) {
         return $$2.get();
      } else {
         egy $$3 = new egy($$1, new gu($$1.u(), this.aj(), $$1.w())).g(3.0);
         List<biy> $$4 = this.a(biy.class, $$3, $$0x -> $$0x != null && $$0x.bv() && this.g($$0x.dk()));
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
      return this.X().c(cph.L) <= 100;
   }

   private void aq() {
      if (this.d()) {
         if (!this.n().O() || this.n().p()) {
            int $$0 = this.X().c(cph.L);
            tf $$1;
            if (this.O.a($$0)) {
               $$1 = tf.c("sleep.skipping_night");
            } else {
               $$1 = tf.a("sleep.players_sleeping", this.O.b(), this.O.b($$0));
            }

            for (akl $$3 : this.H) {
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

   public afi f() {
      return this.J.aF();
   }

   private void ar() {
      boolean $$0 = this.Z();
      if (this.x_().g()) {
         if (this.X().b(cph.u)) {
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

         this.y = arp.a(this.y, 0.0F, 1.0F);
         this.v = this.w;
         if (this.A.k()) {
            this.w += 0.01F;
         } else {
            this.w -= 0.01F;
         }

         this.w = arp.a(this.w, 0.0F, 1.0F);
      }

      if (this.v != this.w) {
         this.J.ac().a(new xv(xv.h, this.w), this.ac());
      }

      if (this.x != this.y) {
         this.J.ac().a(new xv(xv.i, this.y), this.ac());
      }

      if ($$0 != this.Z()) {
         if ($$0) {
            this.J.ac().a(new xv(xv.c, 0.0F));
         } else {
            this.J.ac().a(new xv(xv.b, 0.0F));
         }

         this.J.ac().a(new xv(xv.h, this.w));
         this.J.ac().a(new xv(xv.i, this.y));
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

   private void a(gu $$0, eab $$1) {
      eac $$2 = this.b_($$0);
      if ($$2.b($$1)) {
         $$2.a((cpl)this, $$0);
      }
   }

   private void d(gu $$0, csl $$1) {
      dez $$2 = this.a_($$0);
      if ($$2.a($$1)) {
         $$2.a(this, $$0, this.z);
      }
   }

   public void a(bii $$0) {
      $$0.bn();
      bdh $$1 = this.ad();
      $$0.ah++;
      this.ad().a(() -> jb.h.b($$0.ag()).toString());
      $$1.d("tickNonPassenger");
      $$0.l();
      this.ad().c();

      for (bii $$2 : $$0.cP()) {
         this.a($$0, $$2);
      }
   }

   private void a(bii $$0, bii $$1) {
      if ($$1.dF() || $$1.cY() != $$0) {
         $$1.aa();
      } else if ($$1 instanceof cbm || this.L.c($$1)) {
         $$1.bn();
         $$1.ah++;
         bdh $$2 = this.ad();
         $$2.a(() -> jb.h.b($$1.ag()).toString());
         $$2.d("tickPassenger");
         $$1.by();
         $$2.c();

         for (bii $$3 : $$1.cP()) {
            this.a($$1, $$3);
         }
      }
   }

   @Override
   public boolean a(cbm $$0, gu $$1) {
      return !this.J.a(this, $$1, $$0) && this.w_().a($$1);
   }

   public void a(@Nullable art $$0, boolean $$1, boolean $$2) {
      aki $$3 = this.k();
      if (!$$2) {
         if ($$0 != null) {
            $$0.a(tf.c("menu.savingLevel"));
         }

         this.at();
         if ($$0 != null) {
            $$0.c(tf.c("menu.savingChunks"));
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

   public <T extends bii> List<? extends T> a(dix<bii, T> $$0, Predicate<? super T> $$1) {
      List<T> $$2 = Lists.newArrayList();
      this.a($$0, $$1, $$2);
      return $$2;
   }

   public <T extends bii> void a(dix<bii, T> $$0, Predicate<? super T> $$1, List<? super T> $$2) {
      this.a($$0, $$1, $$2, Integer.MAX_VALUE);
   }

   public <T extends bii> void a(dix<bii, T> $$0, Predicate<? super T> $$1, List<? super T> $$2, int $$3) {
      this.E().a($$0, $$3x -> {
         if ($$1.test((T)$$3x)) {
            $$2.add((T)$$3x);
            if ($$2.size() >= $$3) {
               return aqg.a.b;
            }
         }

         return aqg.a.a;
      });
   }

   public List<? extends bwz> h() {
      return this.a(bim.C, biy::bv);
   }

   public List<akl> a(Predicate<? super akl> $$0) {
      return this.a($$0, Integer.MAX_VALUE);
   }

   public List<akl> a(Predicate<? super akl> $$0, int $$1) {
      List<akl> $$2 = Lists.newArrayList();

      for (akl $$3 : this.H) {
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
   public akl i() {
      List<akl> $$0 = this.a(biy::bv);
      return $$0.isEmpty() ? null : $$0.get(this.z.a($$0.size()));
   }

   @Override
   public boolean b(bii $$0) {
      return this.j($$0);
   }

   public boolean c(bii $$0) {
      return this.j($$0);
   }

   public void d(bii $$0) {
      this.j($$0);
   }

   public void a(akl $$0) {
      this.e($$0);
   }

   public void b(akl $$0) {
      this.e($$0);
   }

   public void c(akl $$0) {
      this.e($$0);
   }

   public void d(akl $$0) {
      this.e($$0);
   }

   private void e(akl $$0) {
      bii $$1 = this.E().a($$0.cv());
      if ($$1 != null) {
         E.warn("Force-added player with duplicate UUID {}", $$0.cv());
         $$1.ae();
         this.a((akl)$$1, bii.c.b);
      }

      this.M.a($$0);
   }

   private boolean j(bii $$0) {
      if ($$0.dF()) {
         E.warn("Tried to add entity {} but it was marked as removed already", bim.a($$0.ag()));
         return false;
      } else {
         return this.M.a($$0);
      }
   }

   public boolean e(bii $$0) {
      if ($$0.cR().map(bii::cv).anyMatch(this.M::a)) {
         return false;
      } else {
         this.a_($$0);
         return true;
      }
   }

   public void a(dhg $$0) {
      $$0.I();
      $$0.b(this);
   }

   public void a(akl $$0, bii.c $$1) {
      $$0.a($$1);
   }

   @Override
   public void a(int $$0, gu $$1, int $$2) {
      for (akl $$3 : this.J.ac().t()) {
         if ($$3 != null && $$3.dK() == this && $$3.ah() != $$0) {
            double $$4 = (double)$$1.u() - $$3.dp();
            double $$5 = (double)$$1.v() - $$3.dr();
            double $$6 = (double)$$1.w() - $$3.dv();
            if ($$4 * $$4 + $$5 * $$5 + $$6 * $$6 < 1024.0) {
               $$3.c.b(new ww($$0, $$1, $$2));
            }
         }
      }
   }

   @Override
   public void a(@Nullable cbm $$0, double $$1, double $$2, double $$3, he<aov> $$4, aox $$5, float $$6, float $$7, long $$8) {
      this.J.ac().a($$0, $$1, $$2, $$3, (double)$$4.a().a($$6), this.ac(), new aah($$4, $$5, $$1, $$2, $$3, $$6, $$7, $$8));
   }

   @Override
   public void a(@Nullable cbm $$0, bii $$1, he<aov> $$2, aox $$3, float $$4, float $$5, long $$6) {
      this.J.ac().a($$0, $$1.dp(), $$1.dr(), $$1.dv(), (double)$$2.a().a($$4), this.ac(), new aag($$2, $$3, $$1, $$4, $$5, $$6));
   }

   @Override
   public void b(int $$0, gu $$1, int $$2) {
      if (this.X().b(cph.S)) {
         this.J.ac().a(new yb($$0, $$1, $$2, true));
      } else {
         this.a(null, $$0, $$1, $$2);
      }
   }

   @Override
   public void a(@Nullable cbm $$0, int $$1, gu $$2, int $$3) {
      this.J.ac().a($$0, (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), 64.0, this.ac(), new yb($$1, $$2, $$3, false));
   }

   public int j() {
      return this.x_().p();
   }

   @Override
   public void a(djj $$0, ehd $$1, djj.a $$2) {
      this.N.a($$0, $$1, $$2);
   }

   @Override
   public void a(gu $$0, dez $$1, dez $$2, int $$3) {
      if (this.U) {
         String $$4 = "recursive call to sendBlockUpdated";
         ac.a("recursive call to sendBlockUpdated", new IllegalStateException("recursive call to sendBlockUpdated"));
      }

      this.k().a($$0);
      ehw $$5 = $$1.k(this, $$0);
      ehw $$6 = $$2.k(this, $$0);
      if (eht.c($$5, $$6, ehh.g)) {
         List<bsh> $$7 = new ObjectArrayList();

         for (bja $$8 : this.T) {
            bsh $$9 = $$8.H();
            if ($$9.b($$0)) {
               $$7.add($$9);
            }
         }

         try {
            this.U = true;

            for (bsh $$10 : $$7) {
               $$10.i();
            }
         } finally {
            this.U = false;
         }
      }
   }

   @Override
   public void a(gu $$0, csl $$1) {
      this.s.a($$0, $$1, null);
   }

   @Override
   public void a(gu $$0, csl $$1, ha $$2) {
      this.s.a($$0, $$1, $$2);
   }

   @Override
   public void a(gu $$0, csl $$1, gu $$2) {
      this.s.a($$0, $$1, $$2);
   }

   @Override
   public void a(dez $$0, gu $$1, csl $$2, gu $$3, boolean $$4) {
      this.s.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public void a(bii $$0, byte $$1) {
      this.k().a($$0, new xs($$0, $$1));
   }

   @Override
   public void a(bii $$0, bhg $$1) {
      this.k().a($$0, new xp($$0, $$1));
   }

   public aki k() {
      return this.I;
   }

   @Override
   public cpd a(@Nullable bii $$0, @Nullable bhg $$1, @Nullable cpe $$2, double $$3, double $$4, double $$5, float $$6, boolean $$7, cpl.a $$8) {
      cpd $$9 = this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, false);
      if (!$$9.b()) {
         $$9.g();
      }

      for (akl $$10 : this.H) {
         if ($$10.i($$3, $$4, $$5) < 4096.0) {
            $$10.c.b(new xt($$3, $$4, $$5, $$6, $$9.h(), $$9.d().get($$10)));
         }
      }

      return $$9;
   }

   @Override
   public void a(gu $$0, csl $$1, int $$2, int $$3) {
      this.V.add(new coq($$0, $$1, $$2, $$3));
   }

   private void au() {
      this.W.clear();

      while (!this.V.isEmpty()) {
         coq $$0 = (coq)this.V.removeFirst();
         if (this.m($$0.a())) {
            if (this.a($$0)) {
               this.J.ac().a(null, (double)$$0.a().u(), (double)$$0.a().v(), (double)$$0.a().w(), 64.0, this.ac(), new wy($$0.a(), $$0.b(), $$0.c(), $$0.d()));
            }
         } else {
            this.W.add($$0);
         }
      }

      this.V.addAll(this.W);
   }

   private boolean a(coq $$0) {
      dez $$1 = this.a_($$0.a());
      return $$1.a($$0.b()) ? $$1.a(this, $$0.a(), $$0.c(), $$0.d()) : false;
   }

   public eim<csl> l() {
      return this.R;
   }

   public eim<eab> m() {
      return this.S;
   }

   @Nonnull
   @Override
   public MinecraftServer n() {
      return this.J;
   }

   public eay o() {
      return this.Q;
   }

   public dys p() {
      return this.J.aS();
   }

   public <T extends it> int a(T $$0, double $$1, double $$2, double $$3, int $$4, double $$5, double $$6, double $$7, double $$8) {
      yc $$9 = new yc($$0, false, $$1, $$2, $$3, (float)$$5, (float)$$6, (float)$$7, (float)$$8, $$4);
      int $$10 = 0;

      for (int $$11 = 0; $$11 < this.H.size(); $$11++) {
         akl $$12 = this.H.get($$11);
         if (this.a($$12, false, $$1, $$2, $$3, $$9)) {
            $$10++;
         }
      }

      return $$10;
   }

   public <T extends it> boolean a(akl $$0, T $$1, boolean $$2, double $$3, double $$4, double $$5, int $$6, double $$7, double $$8, double $$9, double $$10) {
      ux<?> $$11 = new yc($$1, $$2, $$3, $$4, $$5, (float)$$7, (float)$$8, (float)$$9, (float)$$10, $$6);
      return this.a($$0, $$2, $$3, $$4, $$5, $$11);
   }

   private boolean a(akl $$0, boolean $$1, double $$2, double $$3, double $$4, ux<?> $$5) {
      if ($$0.dK() != this) {
         return false;
      } else {
         gu $$6 = $$0.dk();
         if ($$6.a(new ehd($$2, $$3, $$4), $$1 ? 512.0 : 32.0)) {
            $$0.c.b($$5);
            return true;
         } else {
            return false;
         }
      }
   }

   @Nullable
   @Override
   public bii a(int $$0) {
      return this.E().a($$0);
   }

   @Deprecated
   @Nullable
   public bii b(int $$0) {
      bii $$1 = this.E().a($$0);
      return $$1 != null ? $$1 : (bii)this.aa.get($$0);
   }

   @Nullable
   public bii a(UUID $$0) {
      return this.E().a($$0);
   }

   @Nullable
   public gu a(aqa<duy> $$0, gu $$1, int $$2, boolean $$3) {
      if (!this.J.aT().A().c()) {
         return null;
      } else {
         Optional<hi.c<duy>> $$4 = this.B_().d(jc.az).b($$0);
         if ($$4.isEmpty()) {
            return null;
         } else {
            Pair<gu, he<duy>> $$5 = this.k().g().a(this, $$4.get(), $$1, $$2, $$3);
            return $$5 != null ? (gu)$$5.getFirst() : null;
         }
      }
   }

   @Nullable
   public Pair<gu, he<cqj>> a(Predicate<he<cqj>> $$0, gu $$1, int $$2, int $$3, int $$4) {
      return this.k().g().c().a($$1, $$2, $$3, $$4, $$0, this.k().i().b(), this);
   }

   @Override
   public cmb q() {
      return this.J.aE();
   }

   @Override
   public boolean r() {
      return this.e;
   }

   public ebs s() {
      return this.k().k();
   }

   @Nullable
   @Override
   public ebm a(String $$0) {
      return this.n().D().s().b(ebm.a(), $$0);
   }

   @Override
   public void a(String $$0, ebm $$1) {
      this.n().D().s().a($$0, $$1);
   }

   @Override
   public int t() {
      return this.n().D().s().a(ebl.a(), "idcounts").b();
   }

   public void a(gu $$0, float $$1) {
      cos $$2 = new cos(new gu(this.A.a(), 0, this.A.c()));
      this.A.a($$0, $$1);
      this.k().b(akp.a, $$2, 11, asp.a);
      this.k().a(akp.a, new cos($$0), 11, asp.a);
      this.n().ac().a(new zp($$0, $$1));
   }

   public LongSet u() {
      cpg $$0 = this.s().b(cpg.a(), "chunks");
      return (LongSet)($$0 != null ? LongSets.unmodifiable($$0.b()) : LongSets.EMPTY_SET);
   }

   public boolean a(int $$0, int $$1, boolean $$2) {
      cpg $$3 = this.s().a(cpg.a(), "chunks");
      cos $$4 = new cos($$0, $$1);
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
   public List<akl> v() {
      return this.H;
   }

   @Override
   public void a(gu $$0, dez $$1, dez $$2) {
      Optional<he<bua>> $$3 = bub.a($$1);
      Optional<he<bua>> $$4 = bub.a($$2);
      if (!Objects.equals($$3, $$4)) {
         gu $$5 = $$0.i();
         $$3.ifPresent($$1x -> this.n().execute(() -> {
               this.w().a($$5);
               aav.b(this, $$5);
            }));
         $$4.ifPresent($$1x -> this.n().execute(() -> {
               this.w().a($$5, $$1x);
               aav.a(this, $$5);
            }));
      }
   }

   public btx w() {
      return this.k().l();
   }

   public boolean b(gu $$0) {
      return this.a($$0, 1);
   }

   public boolean a(hx $$0) {
      return this.b($$0.q());
   }

   public boolean a(gu $$0, int $$1) {
      return $$1 > 6 ? false : this.b(hx.a($$0)) <= $$1;
   }

   public int b(hx $$0) {
      return this.w().a($$0);
   }

   public ccv x() {
      return this.f;
   }

   @Nullable
   public cct c(gu $$0) {
      return this.f.a($$0, 9216);
   }

   public boolean d(gu $$0) {
      return this.c($$0) != null;
   }

   public void a(btu $$0, bii $$1, bjn $$2) {
      $$2.a($$0, $$1);
   }

   public void a(Path $$0) throws IOException {
      ajv $$1 = this.k().a;

      try (Writer $$2 = Files.newBufferedWriter($$0.resolve("stats.txt"))) {
         $$2.write(String.format(Locale.ROOT, "spawning_chunks: %d\n", $$1.j().b()));
         cpw.d $$3 = this.k().n();
         if ($$3 != null) {
            ObjectIterator $$9 = $$3.b().object2IntEntrySet().iterator();

            while ($$9.hasNext()) {
               Entry<bjb> $$4 = (Entry<bjb>)$$9.next();
               $$2.write(String.format(Locale.ROOT, "spawn_count.%s: %d\n", ((bjb)$$4.getKey()).a(), $$4.getIntValue()));
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

   private static void a(Writer $$0, Iterable<bii> $$1) throws IOException {
      aqr $$2 = aqr.a().a("x").a("y").a("z").a("uuid").a("type").a("alive").a("display_name").a("custom_name").a($$0);

      for (bii $$3 : $$1) {
         tf $$4 = $$3.ad();
         tf $$5 = $$3.H_();
         $$2.a($$3.dp(), $$3.dr(), $$3.dv(), $$3.cv(), jb.h.b($$3.ag()), $$3.bv(), $$5.getString(), $$4 != null ? $$4.getString() : null);
      }
   }

   private void a(Writer $$0) throws IOException {
      aqr $$1 = aqr.a().a("x").a("y").a("z").a("type").a($$0);

      for (deb $$2 : this.r) {
         gu $$3 = $$2.c();
         $$1.a($$3.u(), $$3.v(), $$3.w(), $$2.d());
      }
   }

   @VisibleForTesting
   public void a(duq $$0) {
      this.V.removeIf($$1 -> $$0.b($$1.a()));
   }

   @Override
   public void b(gu $$0, csl $$1) {
      if (!this.af()) {
         this.a($$0, $$1);
      }
   }

   @Override
   public float a(ha $$0, boolean $$1) {
      return 1.0F;
   }

   public Iterable<bii> y() {
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
   public dil B() {
      return this.Z;
   }

   @Override
   public akk C() {
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
         a(this.r, deb::d),
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

   public static void a(akk $$0) {
      gu $$1 = a;
      int $$2 = $$1.u();
      int $$3 = $$1.v() - 2;
      int $$4 = $$1.w();
      gu.b($$2 - 2, $$3 + 1, $$4 - 2, $$2 + 2, $$3 + 3, $$4 + 2).forEach($$1x -> $$0.b($$1x, csm.a.n()));
      gu.b($$2 - 2, $$3, $$4 - 2, $$2 + 2, $$3, $$4 + 2).forEach($$1x -> $$0.b($$1x, csm.co.n()));
   }

   @Override
   protected diz<bii> E() {
      return this.M.d();
   }

   public void a(Stream<bii> $$0) {
      this.M.a($$0);
   }

   public void b(Stream<bii> $$0) {
      this.M.b($$0);
   }

   public void b(dhg $$0) {
      $$0.c(this.u_().e());
   }

   public void a(dgv $$0) {
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

   public boolean e(gu $$0) {
      return this.M.a($$0) && this.I.a.j().c(cos.a($$0));
   }

   public boolean f(gu $$0) {
      return this.M.a($$0);
   }

   public boolean a(cos $$0) {
      return this.M.a($$0);
   }

   @Override
   public cdu G() {
      return this.J.aT().M();
   }

   public aru a(aer $$0) {
      return this.ae.a($$0);
   }

   public bgw H() {
      return this.ae;
   }

   final class a implements diy<bii> {
      public void a(bii $$0) {
      }

      public void b(bii $$0) {
         akk.this.f().a($$0);
      }

      public void c(bii $$0) {
         akk.this.L.a($$0);
      }

      public void d(bii $$0) {
         akk.this.L.b($$0);
      }

      public void e(bii $$0) {
         akk.this.k().b($$0);
         if ($$0 instanceof akl $$1) {
            akk.this.H.add($$1);
            akk.this.e();
         }

         if ($$0 instanceof bja $$2) {
            if (akk.this.U) {
               String $$3 = "onTrackingStart called during navigation iteration";
               ac.a("onTrackingStart called during navigation iteration", new IllegalStateException("onTrackingStart called during navigation iteration"));
            }

            akk.this.T.add($$2);
         }

         if ($$0 instanceof bwz $$4) {
            for (bwx $$5 : $$4.fW()) {
               akk.this.aa.put($$5.ah(), $$5);
            }
         }

         $$0.a(djg::a);
      }

      public void f(bii $$0) {
         akk.this.k().a($$0);
         if ($$0 instanceof akl $$1) {
            akk.this.H.remove($$1);
            akk.this.e();
         }

         if ($$0 instanceof bja $$2) {
            if (akk.this.U) {
               String $$3 = "onTrackingStart called during navigation iteration";
               ac.a("onTrackingStart called during navigation iteration", new IllegalStateException("onTrackingStart called during navigation iteration"));
            }

            akk.this.T.remove($$2);
         }

         if ($$0 instanceof bwz $$4) {
            for (bwx $$5 : $$4.fW()) {
               akk.this.aa.remove($$5.ah());
            }
         }

         $$0.a(djg::b);
      }

      public void g(bii $$0) {
         $$0.a(djg::c);
      }
   }
}
