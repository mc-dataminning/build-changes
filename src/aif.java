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

public class aif extends cmm implements cng {
   public static final gu a = new gu(100, 50, 0);
   public static final bdc b = bdi.a(12000, 180000);
   public static final bdc c = bdi.a(12000, 24000);
   private static final bdc D = bdi.a(12000, 180000);
   public static final bdc d = bdi.a(3600, 15600);
   private static final Logger E = LogUtils.getLogger();
   private static final int F = 300;
   private static final int G = 65536;
   final List<aig> H = Lists.newArrayList();
   private final aid I;
   private final MinecraftServer J;
   private final dzd K;
   final dfy L = new dfy();
   private final dgd<bfj> M;
   private final dgm N;
   public boolean e;
   private final aln O;
   private int P;
   private final dya Q;
   private final efq<cpn> R = new efq<>(this::d, this.ae());
   private final efq<dxd> S = new efq<>(this::d, this.ae());
   final Set<bgb> T = new ObjectOpenHashSet();
   volatile boolean U;
   protected final bzx f;
   private final ObjectLinkedOpenHashSet<clr> V = new ObjectLinkedOpenHashSet();
   private final List<clr> W = new ArrayList<>(64);
   private boolean X;
   private final List<clz> Y;
   @Nullable
   private dfn Z;
   final Int2ObjectMap<btz> aa = new Int2ObjectOpenHashMap();
   private final cne ab;
   private final dsb ac;
   private final boolean ad;
   private final bed ae;

   public aif(
      MinecraftServer $$0,
      Executor $$1,
      dyy.c $$2,
      dzd $$3,
      acp<cmm> $$4,
      dfl $$5,
      aio $$6,
      boolean $$7,
      long $$8,
      List<clz> $$9,
      boolean $$10,
      @Nullable bed $$11
   ) {
      super($$3, $$4, $$0.aV(), $$5.a(), $$0::aN, false, $$7, $$8, $$0.bd());
      this.ad = $$10;
      this.J = $$0;
      this.Y = $$9;
      this.K = $$3;
      ddy $$12 = $$5.b();
      boolean $$13 = $$0.aS();
      DataFixer $$14 = $$0.ay();
      dfv<bfj> $$15 = new dfa(this, $$2.a($$4).resolve("entities"), $$14, $$13, $$0);
      this.M = new dgd<>(bfj.class, new aif.a(), $$15);
      this.I = new aid(this, $$2, $$14, $$0.aT(), $$1, $$12, $$0.ac().p(), $$0.ac().q(), $$13, $$6, this.M::a, () -> $$0.D().s());
      this.I.h().b();
      this.Q = new dya(this);
      this.Q();
      this.T();
      this.w_().a($$0.as());
      this.f = this.s().a($$0x -> bzx.a(this, $$0x), () -> new bzx(this), bzx.a(this.ab()));
      if (!$$0.O()) {
         $$3.a($$0.o_());
      }

      long $$16 = $$0.aU().A().b();
      this.ac = new dsb(this.I.m(), this.B_(), $$0.aT(), $$4, $$12, this.I.i(), this, $$12.c(), $$16, $$14);
      this.ab = new cne(this, $$0.aU().A(), this.ac);
      if (this.ac() == cmm.j && this.ab().a(dfi.c)) {
         this.Z = new dfn(this, $$16, $$0.aU().E());
      } else {
         this.Z = null;
      }

      this.O = new aln();
      this.N = new dgm(this);
      this.ae = Objects.requireNonNullElseGet($$11, () -> this.s().a($$1x -> bed.a($$16, $$1x), () -> new bed($$16), "random_sequences"));
   }

   @Deprecated
   @VisibleForTesting
   public void a(@Nullable dfn $$0) {
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
   public he<cnk> a(int $$0, int $$1, int $$2) {
      return this.k().g().c().getNoiseBiome($$0, $$1, $$2, this.k().i().b());
   }

   public cne a() {
      return this.ab;
   }

   public void a(BooleanSupplier $$0) {
      ban $$1 = this.ad();
      this.X = true;
      $$1.a("world border");
      this.w_().s();
      $$1.b("weather");
      this.ar();
      int $$2 = this.X().c(cmi.L);
      if (this.O.a($$2) && this.O.a($$2, this.H)) {
         if (this.X().b(cmi.k)) {
            long $$3 = this.A.f() + 24000L;
            this.b($$3 - $$3 % 24000L);
         }

         this.ap();
         if (this.X().b(cmi.u) && this.Z()) {
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
            if (!$$1x.dD()) {
               if (this.i($$1x)) {
                  $$1x.ai();
               } else {
                  $$1.a("checkDespawn");
                  $$1x.du();
                  $$1.c();
                  if (this.I.a.j().c($$1x.dk().a())) {
                     bfj $$2x = $$1x.cW();
                     if ($$2x != null) {
                        if (!$$2x.dD() && $$2x.u($$1x)) {
                           return;
                        }

                        $$1x.Y();
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
         if (this.A.q().b(cmi.k)) {
            this.b(this.A.f() + 1L);
         }
      }
   }

   public void b(long $$0) {
      this.K.b($$0);
   }

   public void a(boolean $$0, boolean $$1) {
      for (clz $$2 : this.Y) {
         $$2.a(this, $$0, $$1);
      }
   }

   private boolean i(bfj $$0) {
      return this.J.W() || !($$0 instanceof brl) && !($$0 instanceof bsn) ? !this.J.X() && $$0 instanceof bya : true;
   }

   private void ap() {
      this.O.a();
      this.H.stream().filter(bfz::fy).collect(Collectors.toList()).forEach($$0 -> $$0.a(false, false));
   }

   public void a(dei $$0, int $$1) {
      clt $$2 = $$0.f();
      boolean $$3 = this.Z();
      int $$4 = $$2.d();
      int $$5 = $$2.e();
      ban $$6 = this.ad();
      $$6.a("thunder");
      if ($$3 && this.Y() && this.z.a(100000) == 0) {
         gu $$7 = this.a(this.a($$4, 0, $$5, 15));
         if (this.q($$7)) {
            bdv $$8 = this.d_($$7);
            boolean $$9 = this.X().b(cmi.e) && this.z.j() < (double)$$8.b() * 0.01 && !this.a_($$7.d()).a(cpo.rr);
            if ($$9) {
               btq $$10 = bfn.aK.a((cmm)this);
               if ($$10 != null) {
                  $$10.w(true);
                  $$10.c_(0);
                  $$10.e((double)$$7.u(), (double)$$7.v(), (double)$$7.w());
                  this.b($$10);
               }
            }

            bfy $$11 = bfn.ai.a((cmm)this);
            if ($$11 != null) {
               $$11.d(eei.c($$7));
               $$11.a($$9);
               this.b($$11);
            }
         }
      }

      $$6.b("iceandsnow");
      if (this.z.a(16) == 0) {
         gu $$12 = this.a(dhk.a.e, this.a($$4, 0, $$5, 15));
         gu $$13 = $$12.d();
         cnk $$14 = this.s($$12).a();
         if ($$14.a(this, $$13)) {
            this.b($$13, cpo.dO.n());
         }

         if ($$3) {
            int $$15 = this.X().c(cmi.P);
            if ($$15 > 0 && $$14.b(this, $$12)) {
               dcb $$16 = this.a_($$12);
               if ($$16.a(cpo.dN)) {
                  int $$17 = $$16.c(cww.b);
                  if ($$17 < Math.min($$15, 8)) {
                     dcb $$18 = $$16.a(cww.b, Integer.valueOf($$17 + 1));
                     cpn.a($$16, $$18, this, $$12);
                     this.b($$12, $$18);
                  }
               } else {
                  this.b($$12, cpo.dN.n());
               }
            }

            cnk.c $$19 = $$14.a($$13);
            if ($$19 != cnk.c.a) {
               dcb $$20 = this.a_($$13);
               $$20.b().a($$20, this, $$13, $$19);
            }
         }
      }

      $$6.b("tickBlocks");
      if ($$1 > 0) {
         dej[] $$21 = $$0.d();

         for (int $$22 = 0; $$22 < $$21.length; $$22++) {
            dej $$23 = $$21[$$22];
            if ($$23.d()) {
               int $$24 = $$0.g($$22);
               int $$25 = hx.c($$24);

               for (int $$26 = 0; $$26 < $$1; $$26++) {
                  gu $$27 = this.a($$4, $$25, $$5, 15);
                  $$6.a("randomTick");
                  dcb $$28 = $$23.a($$27.u() - $$4, $$27.v() - $$25, $$27.w() - $$5);
                  if ($$28.v()) {
                     $$28.b(this, $$27, this.z);
                  }

                  dxe $$29 = $$28.u();
                  if ($$29.f()) {
                     $$29.b(this, $$27, this.z);
                  }

                  $$6.c();
               }
            }
         }
      }

      $$6.c();
   }

   private Optional<gu> D(gu $$0) {
      Optional<gu> $$1 = this.w().e($$0x -> $$0x.a(brd.t), $$0x -> $$0x.v() == this.a(dhk.a.b, $$0x.u(), $$0x.w()) - 1, $$0, 128, bqz.b.c);
      return $$1.map($$0x -> $$0x.b(1));
   }

   protected gu a(gu $$0) {
      gu $$1 = this.a(dhk.a.e, $$0);
      Optional<gu> $$2 = this.D($$1);
      if ($$2.isPresent()) {
         return $$2.get();
      } else {
         eed $$3 = new eed($$1, new gu($$1.u(), this.aj(), $$1.w())).g(3.0);
         List<bfz> $$4 = this.a(bfz.class, $$3, $$0x -> $$0x != null && $$0x.bs() && this.g($$0x.di()));
         if (!$$4.isEmpty()) {
            return $$4.get(this.z.a($$4.size())).di();
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
      return this.X().c(cmi.L) <= 100;
   }

   private void aq() {
      if (this.d()) {
         if (!this.n().O() || this.n().p()) {
            int $$0 = this.X().c(cmi.L);
            sw $$1;
            if (this.O.a($$0)) {
               $$1 = sw.c("sleep.skipping_night");
            } else {
               $$1 = sw.a("sleep.players_sleeping", this.O.b(), this.O.b($$0));
            }

            for (aig $$3 : this.H) {
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

   public adg f() {
      return this.J.aF();
   }

   private void ar() {
      boolean $$0 = this.Z();
      if (this.x_().g()) {
         if (this.X().b(cmi.u)) {
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

         this.y = apa.a(this.y, 0.0F, 1.0F);
         this.v = this.w;
         if (this.A.k()) {
            this.w += 0.01F;
         } else {
            this.w -= 0.01F;
         }

         this.w = apa.a(this.w, 0.0F, 1.0F);
      }

      if (this.v != this.w) {
         this.J.ac().a(new vx(vx.h, this.w), this.ac());
      }

      if (this.x != this.y) {
         this.J.ac().a(new vx(vx.i, this.y), this.ac());
      }

      if ($$0 != this.Z()) {
         if ($$0) {
            this.J.ac().a(new vx(vx.c, 0.0F));
         } else {
            this.J.ac().a(new vx(vx.b, 0.0F));
         }

         this.J.ac().a(new vx(vx.h, this.w));
         this.J.ac().a(new vx(vx.i, this.y));
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

   private void a(gu $$0, dxd $$1) {
      dxe $$2 = this.b_($$0);
      if ($$2.b($$1)) {
         $$2.a((cmm)this, $$0);
      }
   }

   private void d(gu $$0, cpn $$1) {
      dcb $$2 = this.a_($$0);
      if ($$2.a($$1)) {
         $$2.a(this, $$0, this.z);
      }
   }

   public void a(bfj $$0) {
      $$0.bk();
      ban $$1 = this.ad();
      $$0.ag++;
      this.ad().a(() -> jb.h.b($$0.ae()).toString());
      $$1.d("tickNonPassenger");
      $$0.l();
      this.ad().c();

      for (bfj $$2 : $$0.cN()) {
         this.a($$0, $$2);
      }
   }

   private void a(bfj $$0, bfj $$1) {
      if ($$1.dD() || $$1.cW() != $$0) {
         $$1.Y();
      } else if ($$1 instanceof byo || this.L.c($$1)) {
         $$1.bk();
         $$1.ag++;
         ban $$2 = this.ad();
         $$2.a(() -> jb.h.b($$1.ae()).toString());
         $$2.d("tickPassenger");
         $$1.bv();
         $$2.c();

         for (bfj $$3 : $$1.cN()) {
            this.a($$1, $$3);
         }
      }
   }

   @Override
   public boolean a(byo $$0, gu $$1) {
      return !this.J.a(this, $$1, $$0) && this.w_().a($$1);
   }

   public void a(@Nullable ape $$0, boolean $$1, boolean $$2) {
      aid $$3 = this.k();
      if (!$$2) {
         if ($$0 != null) {
            $$0.a(sw.c("menu.savingLevel"));
         }

         this.at();
         if ($$0 != null) {
            $$0.c(sw.c("menu.savingChunks"));
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

   public <T extends bfj> List<? extends T> a(dfz<bfj, T> $$0, Predicate<? super T> $$1) {
      List<T> $$2 = Lists.newArrayList();
      this.a($$0, $$1, $$2);
      return $$2;
   }

   public <T extends bfj> void a(dfz<bfj, T> $$0, Predicate<? super T> $$1, List<? super T> $$2) {
      this.a($$0, $$1, $$2, Integer.MAX_VALUE);
   }

   public <T extends bfj> void a(dfz<bfj, T> $$0, Predicate<? super T> $$1, List<? super T> $$2, int $$3) {
      this.E().a($$0, $$3x -> {
         if ($$1.test((T)$$3x)) {
            $$2.add((T)$$3x);
            if ($$2.size() >= $$3) {
               return anr.a.b;
            }
         }

         return anr.a.a;
      });
   }

   public List<? extends bub> h() {
      return this.a(bfn.C, bfz::bs);
   }

   public List<aig> a(Predicate<? super aig> $$0) {
      return this.a($$0, Integer.MAX_VALUE);
   }

   public List<aig> a(Predicate<? super aig> $$0, int $$1) {
      List<aig> $$2 = Lists.newArrayList();

      for (aig $$3 : this.H) {
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
   public aig i() {
      List<aig> $$0 = this.a(bfz::bs);
      return $$0.isEmpty() ? null : $$0.get(this.z.a($$0.size()));
   }

   @Override
   public boolean b(bfj $$0) {
      return this.j($$0);
   }

   public boolean c(bfj $$0) {
      return this.j($$0);
   }

   public void d(bfj $$0) {
      this.j($$0);
   }

   public void a(aig $$0) {
      this.e($$0);
   }

   public void b(aig $$0) {
      this.e($$0);
   }

   public void c(aig $$0) {
      this.e($$0);
   }

   public void d(aig $$0) {
      this.e($$0);
   }

   private void e(aig $$0) {
      bfj $$1 = this.E().a($$0.ct());
      if ($$1 != null) {
         E.warn("Force-added player with duplicate UUID {}", $$0.ct().toString());
         $$1.ac();
         this.a((aig)$$1, bfj.c.b);
      }

      this.M.a($$0);
   }

   private boolean j(bfj $$0) {
      if ($$0.dD()) {
         E.warn("Tried to add entity {} but it was marked as removed already", bfn.a($$0.ae()));
         return false;
      } else {
         return this.M.a($$0);
      }
   }

   public boolean e(bfj $$0) {
      if ($$0.cP().map(bfj::ct).anyMatch(this.M::a)) {
         return false;
      } else {
         this.a_($$0);
         return true;
      }
   }

   public void a(dei $$0) {
      $$0.I();
      $$0.b(this);
   }

   public void a(aig $$0, bfj.c $$1) {
      $$0.a($$1);
   }

   @Override
   public void a(int $$0, gu $$1, int $$2) {
      for (aig $$3 : this.J.ac().t()) {
         if ($$3 != null && $$3.dI() == this && $$3.af() != $$0) {
            double $$4 = (double)$$1.u() - $$3.dn();
            double $$5 = (double)$$1.v() - $$3.dp();
            double $$6 = (double)$$1.w() - $$3.dt();
            if ($$4 * $$4 + $$5 * $$5 + $$6 * $$6 < 1024.0) {
               $$3.c.a(new uy($$0, $$1, $$2));
            }
         }
      }
   }

   @Override
   public void a(@Nullable byo $$0, double $$1, double $$2, double $$3, he<amg> $$4, ami $$5, float $$6, float $$7, long $$8) {
      this.J.ac().a($$0, $$1, $$2, $$3, (double)$$4.a().a($$6), this.ac(), new ym($$4, $$5, $$1, $$2, $$3, $$6, $$7, $$8));
   }

   @Override
   public void a(@Nullable byo $$0, bfj $$1, he<amg> $$2, ami $$3, float $$4, float $$5, long $$6) {
      this.J.ac().a($$0, $$1.dn(), $$1.dp(), $$1.dt(), (double)$$2.a().a($$4), this.ac(), new yl($$2, $$3, $$1, $$4, $$5, $$6));
   }

   @Override
   public void b(int $$0, gu $$1, int $$2) {
      if (this.X().b(cmi.S)) {
         this.J.ac().a(new we($$0, $$1, $$2, true));
      } else {
         this.a(null, $$0, $$1, $$2);
      }
   }

   @Override
   public void a(@Nullable byo $$0, int $$1, gu $$2, int $$3) {
      this.J.ac().a($$0, (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), 64.0, this.ac(), new we($$1, $$2, $$3, false));
   }

   public int j() {
      return this.x_().p();
   }

   @Override
   public void a(dgl $$0, eei $$1, dgl.a $$2) {
      this.N.a($$0, $$1, $$2);
   }

   @Override
   public void a(gu $$0, dcb $$1, dcb $$2, int $$3) {
      if (this.U) {
         String $$4 = "recursive call to sendBlockUpdated";
         ac.a("recursive call to sendBlockUpdated", new IllegalStateException("recursive call to sendBlockUpdated"));
      }

      this.k().a($$0);
      efb $$5 = $$1.k(this, $$0);
      efb $$6 = $$2.k(this, $$0);
      if (eey.c($$5, $$6, eem.g)) {
         List<bpj> $$7 = new ObjectArrayList();

         for (bgb $$8 : this.T) {
            bpj $$9 = $$8.J();
            if ($$9.b($$0)) {
               $$7.add($$9);
            }
         }

         try {
            this.U = true;

            for (bpj $$10 : $$7) {
               $$10.i();
            }
         } finally {
            this.U = false;
         }
      }
   }

   @Override
   public void a(gu $$0, cpn $$1) {
      this.s.a($$0, $$1, null);
   }

   @Override
   public void a(gu $$0, cpn $$1, ha $$2) {
      this.s.a($$0, $$1, $$2);
   }

   @Override
   public void a(gu $$0, cpn $$1, gu $$2) {
      this.s.a($$0, $$1, $$2);
   }

   @Override
   public void a(dcb $$0, gu $$1, cpn $$2, gu $$3, boolean $$4) {
      this.s.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public void a(bfj $$0, byte $$1) {
      this.k().a($$0, new vu($$0, $$1));
   }

   @Override
   public void a(bfj $$0, ben $$1) {
      this.k().a($$0, new vq($$0, $$1));
   }

   public aid k() {
      return this.I;
   }

   @Override
   public cme a(@Nullable bfj $$0, @Nullable ben $$1, @Nullable cmf $$2, double $$3, double $$4, double $$5, float $$6, boolean $$7, cmm.a $$8) {
      cme $$9 = this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, false);
      if (!$$9.b()) {
         $$9.g();
      }

      for (aig $$10 : this.H) {
         if ($$10.i($$3, $$4, $$5) < 4096.0) {
            $$10.c.a(new vv($$3, $$4, $$5, $$6, $$9.h(), $$9.d().get($$10)));
         }
      }

      return $$9;
   }

   @Override
   public void a(gu $$0, cpn $$1, int $$2, int $$3) {
      this.V.add(new clr($$0, $$1, $$2, $$3));
   }

   private void au() {
      this.W.clear();

      while (!this.V.isEmpty()) {
         clr $$0 = (clr)this.V.removeFirst();
         if (this.m($$0.a())) {
            if (this.a($$0)) {
               this.J.ac().a(null, (double)$$0.a().u(), (double)$$0.a().v(), (double)$$0.a().w(), 64.0, this.ac(), new va($$0.a(), $$0.b(), $$0.c(), $$0.d()));
            }
         } else {
            this.W.add($$0);
         }
      }

      this.V.addAll(this.W);
   }

   private boolean a(clr $$0) {
      dcb $$1 = this.a_($$0.a());
      return $$1.a($$0.b()) ? $$1.a(this, $$0.a(), $$0.c(), $$0.d()) : false;
   }

   public efq<cpn> l() {
      return this.R;
   }

   public efq<dxd> m() {
      return this.S;
   }

   @Nonnull
   @Override
   public MinecraftServer n() {
      return this.J;
   }

   public dya o() {
      return this.Q;
   }

   public dvu p() {
      return this.J.aT();
   }

   public <T extends it> int a(T $$0, double $$1, double $$2, double $$3, int $$4, double $$5, double $$6, double $$7, double $$8) {
      wf $$9 = new wf($$0, false, $$1, $$2, $$3, (float)$$5, (float)$$6, (float)$$7, (float)$$8, $$4);
      int $$10 = 0;

      for (int $$11 = 0; $$11 < this.H.size(); $$11++) {
         aig $$12 = this.H.get($$11);
         if (this.a($$12, false, $$1, $$2, $$3, $$9)) {
            $$10++;
         }
      }

      return $$10;
   }

   public <T extends it> boolean a(aig $$0, T $$1, boolean $$2, double $$3, double $$4, double $$5, int $$6, double $$7, double $$8, double $$9, double $$10) {
      uo<?> $$11 = new wf($$1, $$2, $$3, $$4, $$5, (float)$$7, (float)$$8, (float)$$9, (float)$$10, $$6);
      return this.a($$0, $$2, $$3, $$4, $$5, $$11);
   }

   private boolean a(aig $$0, boolean $$1, double $$2, double $$3, double $$4, uo<?> $$5) {
      if ($$0.dI() != this) {
         return false;
      } else {
         gu $$6 = $$0.di();
         if ($$6.a(new eei($$2, $$3, $$4), $$1 ? 512.0 : 32.0)) {
            $$0.c.a($$5);
            return true;
         } else {
            return false;
         }
      }
   }

   @Nullable
   @Override
   public bfj a(int $$0) {
      return this.E().a($$0);
   }

   @Deprecated
   @Nullable
   public bfj b(int $$0) {
      bfj $$1 = this.E().a($$0);
      return $$1 != null ? $$1 : (bfj)this.aa.get($$0);
   }

   @Nullable
   public bfj a(UUID $$0) {
      return this.E().a($$0);
   }

   @Nullable
   public gu a(anl<dsa> $$0, gu $$1, int $$2, boolean $$3) {
      if (!this.J.aU().A().c()) {
         return null;
      } else {
         Optional<hi.c<dsa>> $$4 = this.B_().d(jc.az).b($$0);
         if ($$4.isEmpty()) {
            return null;
         } else {
            Pair<gu, he<dsa>> $$5 = this.k().g().a(this, $$4.get(), $$1, $$2, $$3);
            return $$5 != null ? (gu)$$5.getFirst() : null;
         }
      }
   }

   @Nullable
   public Pair<gu, he<cnk>> a(Predicate<he<cnk>> $$0, gu $$1, int $$2, int $$3, int $$4) {
      return this.k().g().c().a($$1, $$2, $$3, $$4, $$0, this.k().i().b(), this);
   }

   @Override
   public cjd q() {
      return this.J.aE();
   }

   @Override
   public boolean r() {
      return this.e;
   }

   public dyu s() {
      return this.k().k();
   }

   @Nullable
   @Override
   public dyo a(String $$0) {
      return this.n().D().s().a(dyo::b, $$0);
   }

   @Override
   public void a(String $$0, dyo $$1) {
      this.n().D().s().a($$0, $$1);
   }

   @Override
   public int t() {
      return this.n().D().s().a(dyn::b, dyn::new, "idcounts").a();
   }

   public void a(gu $$0, float $$1) {
      clt $$2 = new clt(new gu(this.A.a(), 0, this.A.c()));
      this.A.a($$0, $$1);
      this.k().b(aik.a, $$2, 11, apz.a);
      this.k().a(aik.a, new clt($$0), 11, apz.a);
      this.n().ac().a(new xu($$0, $$1));
   }

   public LongSet u() {
      cmh $$0 = this.s().a(cmh::b, "chunks");
      return (LongSet)($$0 != null ? LongSets.unmodifiable($$0.a()) : LongSets.EMPTY_SET);
   }

   public boolean a(int $$0, int $$1, boolean $$2) {
      cmh $$3 = this.s().a(cmh::b, cmh::new, "chunks");
      clt $$4 = new clt($$0, $$1);
      long $$5 = $$4.a();
      boolean $$6;
      if ($$2) {
         $$6 = $$3.a().add($$5);
         if ($$6) {
            this.d($$0, $$1);
         }
      } else {
         $$6 = $$3.a().remove($$5);
      }

      $$3.a($$6);
      if ($$6) {
         this.k().a($$4, $$2);
      }

      return $$6;
   }

   @Override
   public List<aig> v() {
      return this.H;
   }

   @Override
   public void a(gu $$0, dcb $$1, dcb $$2) {
      Optional<he<brc>> $$3 = brd.a($$1);
      Optional<he<brc>> $$4 = brd.a($$2);
      if (!Objects.equals($$3, $$4)) {
         gu $$5 = $$0.i();
         $$3.ifPresent($$1x -> this.n().execute(() -> {
               this.w().a($$5);
               za.b(this, $$5);
            }));
         $$4.ifPresent($$1x -> this.n().execute(() -> {
               this.w().a($$5, $$1x);
               za.a(this, $$5);
            }));
      }
   }

   public bqz w() {
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

   public bzx x() {
      return this.f;
   }

   @Nullable
   public bzv c(gu $$0) {
      return this.f.a($$0, 9216);
   }

   public boolean d(gu $$0) {
      return this.c($$0) != null;
   }

   public void a(bqw $$0, bfj $$1, bgo $$2) {
      $$2.a($$0, $$1);
   }

   public void a(Path $$0) throws IOException {
      ahr $$1 = this.k().a;

      try (Writer $$2 = Files.newBufferedWriter($$0.resolve("stats.txt"))) {
         $$2.write(String.format(Locale.ROOT, "spawning_chunks: %d\n", $$1.j().b()));
         cmx.d $$3 = this.k().n();
         if ($$3 != null) {
            ObjectIterator $$9 = $$3.b().object2IntEntrySet().iterator();

            while ($$9.hasNext()) {
               Entry<bgc> $$4 = (Entry<bgc>)$$9.next();
               $$2.write(String.format(Locale.ROOT, "spawn_count.%s: %d\n", ((bgc)$$4.getKey()).a(), $$4.getIntValue()));
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

   private static void a(Writer $$0, Iterable<bfj> $$1) throws IOException {
      aob $$2 = aob.a().a("x").a("y").a("z").a("uuid").a("type").a("alive").a("display_name").a("custom_name").a($$0);

      for (bfj $$3 : $$1) {
         sw $$4 = $$3.ab();
         sw $$5 = $$3.H_();
         $$2.a($$3.dn(), $$3.dp(), $$3.dt(), $$3.ct(), jb.h.b($$3.ae()), $$3.bs(), $$5.getString(), $$4 != null ? $$4.getString() : null);
      }
   }

   private void a(Writer $$0) throws IOException {
      aob $$1 = aob.a().a("x").a("y").a("z").a("type").a($$0);

      for (dbd $$2 : this.r) {
         gu $$3 = $$2.c();
         $$1.a($$3.u(), $$3.v(), $$3.w(), $$2.d());
      }
   }

   @VisibleForTesting
   public void a(drs $$0) {
      this.V.removeIf($$1 -> $$0.b($$1.a()));
   }

   @Override
   public void b(gu $$0, cpn $$1) {
      if (!this.af()) {
         this.a($$0, $$1);
      }
   }

   @Override
   public float a(ha $$0, boolean $$1) {
      return 1.0F;
   }

   public Iterable<bfj> y() {
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
   public dfn B() {
      return this.Z;
   }

   @Override
   public aif C() {
      return this;
   }

   @VisibleForTesting
   public String D() {
      return String.format(
         Locale.ROOT,
         "players: %s, entities: %s [%s], block_entities: %d [%s], block_ticks: %d, fluid_ticks: %d, chunk_source: %s",
         this.H.size(),
         this.M.e(),
         a(this.M.d().a(), $$0 -> jb.h.b($$0.ae()).toString()),
         this.r.size(),
         a(this.r, dbd::d),
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

   public static void a(aif $$0) {
      gu $$1 = a;
      int $$2 = $$1.u();
      int $$3 = $$1.v() - 2;
      int $$4 = $$1.w();
      gu.b($$2 - 2, $$3 + 1, $$4 - 2, $$2 + 2, $$3 + 3, $$4 + 2).forEach($$1x -> $$0.b($$1x, cpo.a.n()));
      gu.b($$2 - 2, $$3, $$4 - 2, $$2 + 2, $$3, $$4 + 2).forEach($$1x -> $$0.b($$1x, cpo.co.n()));
   }

   @Override
   protected dgb<bfj> E() {
      return this.M.d();
   }

   public void a(Stream<bfj> $$0) {
      this.M.a($$0);
   }

   public void b(Stream<bfj> $$0) {
      this.M.b($$0);
   }

   public void b(dei $$0) {
      $$0.c(this.u_().e());
   }

   public void a(ddx $$0) {
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
      return this.M.a($$0) && this.I.a.j().c(clt.a($$0));
   }

   public boolean f(gu $$0) {
      return this.M.a($$0);
   }

   public boolean a(clt $$0) {
      return this.M.a($$0);
   }

   @Override
   public caw G() {
      return this.J.aU().M();
   }

   public apf a(acq $$0) {
      return this.ae.a($$0);
   }

   public bed H() {
      return this.ae;
   }

   final class a implements dga<bfj> {
      public void a(bfj $$0) {
      }

      public void b(bfj $$0) {
         aif.this.f().a($$0);
      }

      public void c(bfj $$0) {
         aif.this.L.a($$0);
      }

      public void d(bfj $$0) {
         aif.this.L.b($$0);
      }

      public void e(bfj $$0) {
         aif.this.k().b($$0);
         if ($$0 instanceof aig $$1) {
            aif.this.H.add($$1);
            aif.this.e();
         }

         if ($$0 instanceof bgb $$2) {
            if (aif.this.U) {
               String $$3 = "onTrackingStart called during navigation iteration";
               ac.a("onTrackingStart called during navigation iteration", new IllegalStateException("onTrackingStart called during navigation iteration"));
            }

            aif.this.T.add($$2);
         }

         if ($$0 instanceof bub $$4) {
            for (btz $$5 : $$4.fV()) {
               aif.this.aa.put($$5.af(), $$5);
            }
         }

         $$0.a(dgi::a);
      }

      public void f(bfj $$0) {
         aif.this.k().a($$0);
         if ($$0 instanceof aig $$1) {
            aif.this.H.remove($$1);
            aif.this.e();
         }

         if ($$0 instanceof bgb $$2) {
            if (aif.this.U) {
               String $$3 = "onTrackingStart called during navigation iteration";
               ac.a("onTrackingStart called during navigation iteration", new IllegalStateException("onTrackingStart called during navigation iteration"));
            }

            aif.this.T.remove($$2);
         }

         if ($$0 instanceof bub $$4) {
            for (btz $$5 : $$4.fV()) {
               aif.this.aa.remove($$5.af());
            }
         }

         $$0.a(dgi::b);
      }

      public void g(bfj $$0) {
         $$0.a(dgi::c);
      }
   }
}
