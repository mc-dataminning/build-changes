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

public class amz extends cti implements cud {
   public static final hx a = new hx(100, 50, 0);
   public static final bja b = bjg.a(12000, 180000);
   public static final bja c = bjg.a(12000, 24000);
   private static final bja D = bjg.a(12000, 180000);
   public static final bja d = bjg.a(3600, 15600);
   private static final Logger E = LogUtils.getLogger();
   private static final int F = 300;
   private static final int G = 65536;
   final List<ana> H = Lists.newArrayList();
   private final amx I;
   private final MinecraftServer J;
   private final egk K;
   final dmx L = new dmx();
   private final dnc<blp> M;
   private final dnl N;
   public boolean e;
   private final aqs O;
   private int P;
   private final efg Q;
   private final ena<cwj> R = new ena<>(this::d, this.ag());
   private final ena<eej> S = new ena<>(this::d, this.ag());
   final Set<bmh> T = new ObjectOpenHashSet();
   volatile boolean U;
   protected final cgl f;
   private final ObjectLinkedOpenHashSet<csn> V = new ObjectLinkedOpenHashSet();
   private final List<csn> W = new ArrayList<>(64);
   private boolean X;
   private final List<csv> Y;
   @Nullable
   private dmm Z;
   final Int2ObjectMap<cag> aa = new Int2ObjectOpenHashMap();
   private final cub ab;
   private final dza ac;
   private final boolean ad;
   private final bkb ae;

   public amz(
      MinecraftServer $$0,
      Executor $$1,
      egf.c $$2,
      egk $$3,
      ahc<cti> $$4,
      dmk $$5,
      ani $$6,
      boolean $$7,
      long $$8,
      List<csv> $$9,
      boolean $$10,
      @Nullable bkb $$11
   ) {
      super($$3, $$4, $$0.aZ(), $$5.a(), $$0::aR, false, $$7, $$8, $$0.bh());
      this.ad = $$10;
      this.J = $$0;
      this.Y = $$9;
      this.K = $$3;
      dkx $$12 = $$5.b();
      boolean $$13 = $$0.aW();
      DataFixer $$14 = $$0.aA();
      dmu<blp> $$15 = new dlz(this, $$2.a($$4).resolve("entities"), $$14, $$13, $$0);
      this.M = new dnc<>(blp.class, new amz.a(), $$15);
      this.I = new amx(this, $$2, $$14, $$0.aX(), $$1, $$12, $$0.ae().p(), $$0.ae().q(), $$13, $$6, this.M::a, () -> $$0.F().u());
      this.I.h().b();
      this.Q = new efg(this);
      this.S();
      this.V();
      this.D_().a($$0.au());
      this.f = this.u().a(cgl.a(this), cgl.a(this.ad()));
      if (!$$0.Q()) {
         $$3.a($$0.v_());
      }

      long $$16 = $$0.aY().A().b();
      this.ac = new dza(this.I.m(), this.I_(), $$0.aX(), $$4, $$12, this.I.i(), this, $$12.c(), $$16, $$14);
      this.ab = new cub(this, $$0.aY().A(), this.ac);
      if (this.ae() == cti.j && this.ad().a(dmh.c)) {
         this.Z = new dmm(this, $$16, $$0.aY().E());
      } else {
         this.Z = null;
      }

      this.O = new aqs();
      this.N = new dnl(this);
      this.ae = Objects.requireNonNullElseGet($$11, () -> this.u().a(bkb.a($$16), "random_sequences"));
   }

   @Deprecated
   @VisibleForTesting
   public void a(@Nullable dmm $$0) {
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
   public ih<cuh> a(int $$0, int $$1, int $$2) {
      return this.l().g().c().getNoiseBiome($$0, $$1, $$2, this.l().i().b());
   }

   public cub a() {
      return this.ab;
   }

   public void a(BooleanSupplier $$0) {
      bgm $$1 = this.af();
      this.X = true;
      bkf $$2 = this.s();
      boolean $$3 = $$2.i();
      if ($$3) {
         $$1.a("world border");
         this.D_().s();
         $$1.b("weather");
         this.at();
      }

      int $$4 = this.Z().c(cte.P);
      if (this.O.a($$4) && this.O.a($$4, this.H)) {
         if (this.Z().b(cte.l)) {
            long $$5 = this.A.f() + 24000L;
            this.b($$5 - $$5 % 24000L);
         }

         this.ar();
         if (this.Z().b(cte.v) && this.ab()) {
            this.g();
         }
      }

      this.S();
      if ($$3) {
         this.b();
      }

      $$1.b("tickPending");
      if (!this.ah() && $$3) {
         long $$6 = this.X();
         $$1.a("blockTicks");
         this.R.a($$6, 65536, this::d);
         $$1.b("fluidTicks");
         this.S.a($$6, 65536, this::a);
         $$1.c();
      }

      $$1.b("raid");
      if ($$3) {
         this.f.a();
      }

      $$1.b("chunkSource");
      this.l().a($$0, true);
      $$1.b("blockEvents");
      if ($$3) {
         this.av();
      }

      this.X = false;
      $$1.c();
      boolean $$7 = !this.H.isEmpty() || !this.w().isEmpty();
      if ($$7) {
         this.h();
      }

      if ($$7 || this.P++ < 300) {
         $$1.a("entities");
         if (this.Z != null) {
            $$1.a("dragonFight");
            this.Z.c();
            $$1.c();
         }

         this.L.a($$2x -> {
            if (!$$2x.dH()) {
               if (this.i($$2x)) {
                  $$2x.am();
               } else if (!$$2.a($$2x)) {
                  $$1.a("checkDespawn");
                  $$2x.dy();
                  $$1.c();
                  if (this.I.a.j().c($$2x.do().a())) {
                     blp $$3x = $$2x.cZ();
                     if ($$3x != null) {
                        if (!$$3x.dH() && $$3x.x($$2x)) {
                           return;
                        }

                        $$2x.ac();
                     }

                     $$1.a("tick");
                     this.a(this::a, $$2x);
                     $$1.c();
                  }
               }
            }
         });
         $$1.c();
         this.R();
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
         if (this.A.q().b(cte.l)) {
            this.b(this.A.f() + 1L);
         }
      }
   }

   public void b(long $$0) {
      this.K.b($$0);
   }

   public void a(boolean $$0, boolean $$1) {
      for (csv $$2 : this.Y) {
         $$2.a(this, $$0, $$1);
      }
   }

   private boolean i(blp $$0) {
      return this.J.Y() || !($$0 instanceof bxs) && !($$0 instanceof byu) ? !this.J.Z() && $$0 instanceof cen : true;
   }

   private void ar() {
      this.O.a();
      this.H.stream().filter(bmf::fD).collect(Collectors.toList()).forEach($$0 -> $$0.a(false, false));
   }

   public void a(dlh $$0, int $$1) {
      csp $$2 = $$0.f();
      boolean $$3 = this.ab();
      int $$4 = $$2.d();
      int $$5 = $$2.e();
      bgm $$6 = this.af();
      $$6.a("thunder");
      if ($$3 && this.aa() && this.z.a(100000) == 0) {
         hx $$7 = this.b(this.a($$4, 0, $$5, 15));
         if (this.r($$7)) {
            bjt $$8 = this.d_($$7);
            boolean $$9 = this.Z().b(cte.e) && this.z.j() < (double)$$8.b() * 0.01 && !this.a_($$7.d()).a(cwl.ss);
            if ($$9) {
               bzx $$10 = blt.aL.a((cti)this);
               if ($$10 != null) {
                  $$10.w(true);
                  $$10.c_(0);
                  $$10.a_((double)$$7.u(), (double)$$7.v(), (double)$$7.w());
                  this.b($$10);
               }
            }

            bme $$11 = blt.aj.a((cti)this);
            if ($$11 != null) {
               $$11.e(elm.c($$7));
               $$11.a($$9);
               this.b($$11);
            }
         }
      }

      $$6.b("iceandsnow");

      for (int $$12 = 0; $$12 < $$1; $$12++) {
         if (this.z.a(48) == 0) {
            this.a(this.a($$4, 0, $$5, 15));
         }
      }

      $$6.b("tickBlocks");
      if ($$1 > 0) {
         dli[] $$13 = $$0.d();

         for (int $$14 = 0; $$14 < $$13.length; $$14++) {
            dli $$15 = $$13[$$14];
            if ($$15.d()) {
               int $$16 = $$0.g($$14);
               int $$17 = iz.c($$16);

               for (int $$18 = 0; $$18 < $$1; $$18++) {
                  hx $$19 = this.a($$4, $$17, $$5, 15);
                  $$6.a("randomTick");
                  dja $$20 = $$15.a($$19.u() - $$4, $$19.v() - $$17, $$19.w() - $$5);
                  if ($$20.v()) {
                     $$20.b(this, $$19, this.z);
                  }

                  eek $$21 = $$20.u();
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

   @VisibleForTesting
   public void a(hx $$0) {
      hx $$1 = this.a(doj.a.e, $$0);
      hx $$2 = $$1.d();
      cuh $$3 = this.t($$1).a();
      if ($$3.a(this, $$2)) {
         this.b($$2, cwl.dO.o());
      }

      if (this.ab()) {
         int $$4 = this.Z().c(cte.T);
         if ($$4 > 0 && $$3.b(this, $$1)) {
            dja $$5 = this.a_($$1);
            if ($$5.a(cwl.dN)) {
               int $$6 = $$5.c(ddr.c);
               if ($$6 < Math.min($$4, 8)) {
                  dja $$7 = $$5.a(ddr.c, Integer.valueOf($$6 + 1));
                  cwj.a($$5, $$7, this, $$1);
                  this.b($$1, $$7);
               }
            } else {
               this.b($$1, cwl.dN.o());
            }
         }

         cuh.c $$8 = $$3.a($$2);
         if ($$8 != cuh.c.a) {
            dja $$9 = this.a_($$2);
            $$9.b().a($$9, this, $$2, $$8);
         }
      }
   }

   private Optional<hx> E(hx $$0) {
      Optional<hx> $$1 = this.y().e($$0x -> $$0x.a(bxk.t), $$0x -> $$0x.v() == this.a(doj.a.b, $$0x.u(), $$0x.w()) - 1, $$0, 128, bxg.b.c);
      return $$1.map($$0x -> $$0x.b(1));
   }

   protected hx b(hx $$0) {
      hx $$1 = this.a(doj.a.e, $$0);
      Optional<hx> $$2 = this.E($$1);
      if ($$2.isPresent()) {
         return $$2.get();
      } else {
         elh $$3 = elh.a($$1, new hx($$1.h(this.al()))).g(3.0);
         List<bmf> $$4 = this.a(bmf.class, $$3, $$0x -> $$0x != null && $$0x.bx() && this.h($$0x.dm()));
         if (!$$4.isEmpty()) {
            return $$4.get(this.z.a($$4.size())).dm();
         } else {
            if ($$1.v() == this.J_() - 1) {
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
      return this.Z().c(cte.P) <= 100;
   }

   private void as() {
      if (this.d()) {
         if (!this.o().Q() || this.o().p()) {
            int $$0 = this.Z().c(cte.P);
            vd $$1;
            if (this.O.a($$0)) {
               $$1 = vd.c("sleep.skipping_night");
            } else {
               $$1 = vd.a("sleep.players_sleeping", this.O.b(), this.O.b($$0));
            }

            for (ana $$3 : this.H) {
               $$3.a($$1, true);
            }
         }
      }
   }

   public void e() {
      if (!this.H.isEmpty() && this.O.a(this.H)) {
         this.as();
      }
   }

   public ahu f() {
      return this.J.aH();
   }

   private void at() {
      boolean $$0 = this.ab();
      if (this.E_().g()) {
         if (this.Z().b(cte.v)) {
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

         this.y = aui.a(this.y, 0.0F, 1.0F);
         this.v = this.w;
         if (this.A.k()) {
            this.w += 0.01F;
         } else {
            this.w -= 0.01F;
         }

         this.w = aui.a(this.w, 0.0F, 1.0F);
      }

      if (this.v != this.w) {
         this.J.ae().a(new aac(aac.h, this.w), this.ae());
      }

      if (this.x != this.y) {
         this.J.ae().a(new aac(aac.i, this.y), this.ae());
      }

      if ($$0 != this.ab()) {
         if ($$0) {
            this.J.ae().a(new aac(aac.c, 0.0F));
         } else {
            this.J.ae().a(new aac(aac.b, 0.0F));
         }

         this.J.ae().a(new aac(aac.h, this.w));
         this.J.ae().a(new aac(aac.i, this.y));
      }
   }

   @VisibleForTesting
   public void g() {
      this.K.f(0);
      this.K.b(false);
      this.K.e(0);
      this.K.a(false);
   }

   public void h() {
      this.P = 0;
   }

   private void a(hx $$0, eej $$1) {
      eek $$2 = this.b_($$0);
      if ($$2.b($$1)) {
         $$2.a((cti)this, $$0);
      }
   }

   private void d(hx $$0, cwj $$1) {
      dja $$2 = this.a_($$0);
      if ($$2.a($$1)) {
         $$2.a(this, $$0, this.z);
      }
   }

   public void a(blp $$0) {
      $$0.bp();
      bgm $$1 = this.af();
      $$0.ah++;
      this.af().a(() -> kd.g.b($$0.ai()).toString());
      $$1.d("tickNonPassenger");
      $$0.l();
      this.af().c();

      for (blp $$2 : $$0.cP()) {
         this.a($$0, $$2);
      }
   }

   private void a(blp $$0, blp $$1) {
      if ($$1.dH() || $$1.cZ() != $$0) {
         $$1.ac();
      } else if ($$1 instanceof cfb || this.L.c($$1)) {
         $$1.bp();
         $$1.ah++;
         bgm $$2 = this.af();
         $$2.a(() -> kd.g.b($$1.ai()).toString());
         $$2.d("tickPassenger");
         $$1.t();
         $$2.c();

         for (blp $$3 : $$1.cP()) {
            this.a($$1, $$3);
         }
      }
   }

   @Override
   public boolean a(cfb $$0, hx $$1) {
      return !this.J.a(this, $$1, $$0) && this.D_().a($$1);
   }

   public void a(@Nullable auo $$0, boolean $$1, boolean $$2) {
      amx $$3 = this.l();
      if (!$$2) {
         if ($$0 != null) {
            $$0.a(vd.c("menu.savingLevel"));
         }

         this.au();
         if ($$0 != null) {
            $$0.c(vd.c("menu.savingChunks"));
         }

         $$3.a($$1);
         if ($$1) {
            this.M.c();
         } else {
            this.M.b();
         }
      }
   }

   private void au() {
      if (this.Z != null) {
         this.J.aY().a(this.Z.b());
      }

      this.l().k().a();
   }

   public <T extends blp> List<? extends T> a(dmy<blp, T> $$0, Predicate<? super T> $$1) {
      List<T> $$2 = Lists.newArrayList();
      this.a($$0, $$1, $$2);
      return $$2;
   }

   public <T extends blp> void a(dmy<blp, T> $$0, Predicate<? super T> $$1, List<? super T> $$2) {
      this.a($$0, $$1, $$2, Integer.MAX_VALUE);
   }

   public <T extends blp> void a(dmy<blp, T> $$0, Predicate<? super T> $$1, List<? super T> $$2, int $$3) {
      this.G().a($$0, $$3x -> {
         if ($$1.test((T)$$3x)) {
            $$2.add((T)$$3x);
            if ($$2.size() >= $$3) {
               return asw.a.b;
            }
         }

         return asw.a.a;
      });
   }

   public List<? extends cai> i() {
      return this.a(blt.D, bmf::bx);
   }

   public List<ana> a(Predicate<? super ana> $$0) {
      return this.a($$0, Integer.MAX_VALUE);
   }

   public List<ana> a(Predicate<? super ana> $$0, int $$1) {
      List<ana> $$2 = Lists.newArrayList();

      for (ana $$3 : this.H) {
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
   public ana j() {
      List<ana> $$0 = this.a(bmf::bx);
      return $$0.isEmpty() ? null : $$0.get(this.z.a($$0.size()));
   }

   @Override
   public boolean b(blp $$0) {
      return this.j($$0);
   }

   public boolean c(blp $$0) {
      return this.j($$0);
   }

   public void d(blp $$0) {
      this.j($$0);
   }

   public void a(ana $$0) {
      this.e($$0);
   }

   public void b(ana $$0) {
      this.e($$0);
   }

   public void c(ana $$0) {
      this.e($$0);
   }

   public void d(ana $$0) {
      this.e($$0);
   }

   private void e(ana $$0) {
      blp $$1 = this.G().a($$0.cw());
      if ($$1 != null) {
         E.warn("Force-added player with duplicate UUID {}", $$0.cw());
         $$1.ag();
         this.a((ana)$$1, blp.c.b);
      }

      this.M.a($$0);
   }

   private boolean j(blp $$0) {
      if ($$0.dH()) {
         E.warn("Tried to add entity {} but it was marked as removed already", blt.a($$0.ai()));
         return false;
      } else {
         return this.M.a($$0);
      }
   }

   public boolean e(blp $$0) {
      if ($$0.cR().map(blp::cw).anyMatch(this.M::a)) {
         return false;
      } else {
         this.a_($$0);
         return true;
      }
   }

   public void a(dlh $$0) {
      $$0.I();
      $$0.b(this);
   }

   public void a(ana $$0, blp.c $$1) {
      $$0.a($$1);
   }

   @Override
   public void a(int $$0, hx $$1, int $$2) {
      for (ana $$3 : this.J.ae().t()) {
         if ($$3 != null && $$3.dM() == this && $$3.aj() != $$0) {
            double $$4 = (double)$$1.u() - $$3.dr();
            double $$5 = (double)$$1.v() - $$3.dt();
            double $$6 = (double)$$1.w() - $$3.dx();
            if ($$4 * $$4 + $$5 * $$5 + $$6 * $$6 < 1024.0) {
               $$3.c.b(new zd($$0, $$1, $$2));
            }
         }
      }
   }

   @Override
   public void a(@Nullable cfb $$0, double $$1, double $$2, double $$3, ih<arl> $$4, arn $$5, float $$6, float $$7, long $$8) {
      this.J.ae().a($$0, $$1, $$2, $$3, (double)$$4.a().a($$6), this.ae(), new acp($$4, $$5, $$1, $$2, $$3, $$6, $$7, $$8));
   }

   @Override
   public void a(@Nullable cfb $$0, blp $$1, ih<arl> $$2, arn $$3, float $$4, float $$5, long $$6) {
      this.J.ae().a($$0, $$1.dr(), $$1.dt(), $$1.dx(), (double)$$2.a().a($$4), this.ae(), new aco($$2, $$3, $$1, $$4, $$5, $$6));
   }

   @Override
   public void b(int $$0, hx $$1, int $$2) {
      if (this.Z().b(cte.W)) {
         this.J.ae().a(new aai($$0, $$1, $$2, true));
      } else {
         this.a(null, $$0, $$1, $$2);
      }
   }

   @Override
   public void a(@Nullable cfb $$0, int $$1, hx $$2, int $$3) {
      this.J.ae().a($$0, (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), 64.0, this.ae(), new aai($$1, $$2, $$3, false));
   }

   public int k() {
      return this.E_().p();
   }

   @Override
   public void a(dnk $$0, elm $$1, dnk.a $$2) {
      this.N.a($$0, $$1, $$2);
   }

   @Override
   public void a(hx $$0, dja $$1, dja $$2, int $$3) {
      if (this.U) {
         String $$4 = "recursive call to sendBlockUpdated";
         ac.a("recursive call to sendBlockUpdated", new IllegalStateException("recursive call to sendBlockUpdated"));
      }

      this.l().a($$0);
      emf $$5 = $$1.k(this, $$0);
      emf $$6 = $$2.k(this, $$0);
      if (emc.c($$5, $$6, elq.g)) {
         List<bvp> $$7 = new ObjectArrayList();

         for (bmh $$8 : this.T) {
            bvp $$9 = $$8.N();
            if ($$9.b($$0)) {
               $$7.add($$9);
            }
         }

         try {
            this.U = true;

            for (bvp $$10 : $$7) {
               $$10.i();
            }
         } finally {
            this.U = false;
         }
      }
   }

   @Override
   public void a(hx $$0, cwj $$1) {
      this.s.a($$0, $$1, null);
   }

   @Override
   public void a(hx $$0, cwj $$1, ic $$2) {
      this.s.a($$0, $$1, $$2);
   }

   @Override
   public void a(hx $$0, cwj $$1, hx $$2) {
      this.s.a($$0, $$1, $$2);
   }

   @Override
   public void a(dja $$0, hx $$1, cwj $$2, hx $$3, boolean $$4) {
      this.s.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public void a(blp $$0, byte $$1) {
      this.l().a($$0, new zz($$0, $$1));
   }

   @Override
   public void a(blp $$0, bkn $$1) {
      this.l().a($$0, new zw($$0, $$1));
   }

   public amx l() {
      return this.I;
   }

   @Override
   public cta a(
      @Nullable blp $$0, @Nullable bkn $$1, @Nullable ctb $$2, double $$3, double $$4, double $$5, float $$6, boolean $$7, cti.a $$8, jv $$9, jv $$10, arl $$11
   ) {
      cta $$12 = this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, false, $$9, $$10, $$11);
      if (!$$12.d()) {
         $$12.h();
      }

      for (ana $$13 : this.H) {
         if ($$13.i($$3, $$4, $$5) < 4096.0) {
            $$13.c.b(new aaa($$3, $$4, $$5, $$6, $$12.i(), $$12.e().get($$13), $$12.j(), $$12.k(), $$12.l(), $$12.m()));
         }
      }

      return $$12;
   }

   @Override
   public void a(hx $$0, cwj $$1, int $$2, int $$3) {
      this.V.add(new csn($$0, $$1, $$2, $$3));
   }

   private void av() {
      this.W.clear();

      while (!this.V.isEmpty()) {
         csn $$0 = (csn)this.V.removeFirst();
         if (this.n($$0.a())) {
            if (this.a($$0)) {
               this.J.ae().a(null, (double)$$0.a().u(), (double)$$0.a().v(), (double)$$0.a().w(), 64.0, this.ae(), new zf($$0.a(), $$0.b(), $$0.c(), $$0.d()));
            }
         } else {
            this.W.add($$0);
         }
      }

      this.V.addAll(this.W);
   }

   private boolean a(csn $$0) {
      dja $$1 = this.a_($$0.a());
      return $$1.a($$0.b()) ? $$1.a(this, $$0.a(), $$0.c(), $$0.d()) : false;
   }

   public ena<cwj> m() {
      return this.R;
   }

   public ena<eej> n() {
      return this.S;
   }

   @Nonnull
   @Override
   public MinecraftServer o() {
      return this.J;
   }

   public efg p() {
      return this.Q;
   }

   public eda q() {
      return this.J.aX();
   }

   public <T extends jv> int a(T $$0, double $$1, double $$2, double $$3, int $$4, double $$5, double $$6, double $$7, double $$8) {
      aaj $$9 = new aaj($$0, false, $$1, $$2, $$3, (float)$$5, (float)$$6, (float)$$7, (float)$$8, $$4);
      int $$10 = 0;

      for (int $$11 = 0; $$11 < this.H.size(); $$11++) {
         ana $$12 = this.H.get($$11);
         if (this.a($$12, false, $$1, $$2, $$3, $$9)) {
            $$10++;
         }
      }

      return $$10;
   }

   public <T extends jv> boolean a(ana $$0, T $$1, boolean $$2, double $$3, double $$4, double $$5, int $$6, double $$7, double $$8, double $$9, double $$10) {
      xd<?> $$11 = new aaj($$1, $$2, $$3, $$4, $$5, (float)$$7, (float)$$8, (float)$$9, (float)$$10, $$6);
      return this.a($$0, $$2, $$3, $$4, $$5, $$11);
   }

   private boolean a(ana $$0, boolean $$1, double $$2, double $$3, double $$4, xd<?> $$5) {
      if ($$0.dM() != this) {
         return false;
      } else {
         hx $$6 = $$0.dm();
         if ($$6.a(new elm($$2, $$3, $$4), $$1 ? 512.0 : 32.0)) {
            $$0.c.b($$5);
            return true;
         } else {
            return false;
         }
      }
   }

   @Nullable
   @Override
   public blp a(int $$0) {
      return this.G().a($$0);
   }

   @Deprecated
   @Nullable
   public blp b(int $$0) {
      blp $$1 = this.G().a($$0);
      return $$1 != null ? $$1 : (blp)this.aa.get($$0);
   }

   @Nullable
   public blp a(UUID $$0) {
      return this.G().a($$0);
   }

   @Nullable
   public hx a(asq<dyz> $$0, hx $$1, int $$2, boolean $$3) {
      if (!this.J.aY().A().c()) {
         return null;
      } else {
         Optional<il.c<dyz>> $$4 = this.I_().d(ke.aD).b($$0);
         if ($$4.isEmpty()) {
            return null;
         } else {
            Pair<hx, ih<dyz>> $$5 = this.l().g().a(this, $$4.get(), $$1, $$2, $$3);
            return $$5 != null ? (hx)$$5.getFirst() : null;
         }
      }
   }

   @Nullable
   public Pair<hx, ih<cuh>> a(Predicate<ih<cuh>> $$0, hx $$1, int $$2, int $$3, int $$4) {
      return this.l().g().c().a($$1, $$2, $$3, $$4, $$0, this.l().i().b(), this);
   }

   @Override
   public cpy r() {
      return this.J.aG();
   }

   @Override
   public bkf s() {
      return this.J.aO();
   }

   @Override
   public boolean t() {
      return this.e;
   }

   public ega u() {
      return this.l().k();
   }

   @Nullable
   @Override
   public efu a(String $$0) {
      return this.o().F().u().b(efu.a(), $$0);
   }

   @Override
   public void a(String $$0, efu $$1) {
      this.o().F().u().a($$0, $$1);
   }

   @Override
   public int v() {
      return this.o().F().u().a(eft.a(), "idcounts").b();
   }

   public void a(hx $$0, float $$1) {
      csp $$2 = new csp(new hx(this.A.a(), 0, this.A.c()));
      this.A.a($$0, $$1);
      this.l().b(ane.a, $$2, 11, avm.a);
      this.l().a(ane.a, new csp($$0), 11, avm.a);
      this.o().ae().a(new abx($$0, $$1));
   }

   public LongSet w() {
      ctd $$0 = this.u().b(ctd.a(), "chunks");
      return (LongSet)($$0 != null ? LongSets.unmodifiable($$0.b()) : LongSets.EMPTY_SET);
   }

   public boolean a(int $$0, int $$1, boolean $$2) {
      ctd $$3 = this.u().a(ctd.a(), "chunks");
      csp $$4 = new csp($$0, $$1);
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
         this.l().a($$4, $$2);
      }

      return $$6;
   }

   @Override
   public List<ana> x() {
      return this.H;
   }

   @Override
   public void a(hx $$0, dja $$1, dja $$2) {
      Optional<ih<bxj>> $$3 = bxk.a($$1);
      Optional<ih<bxj>> $$4 = bxk.a($$2);
      if (!Objects.equals($$3, $$4)) {
         hx $$5 = $$0.i();
         $$3.ifPresent($$1x -> this.o().execute(() -> {
               this.y().a($$5);
               adf.b(this, $$5);
            }));
         $$4.ifPresent($$1x -> this.o().execute(() -> {
               this.y().a($$5, $$1x);
               adf.a(this, $$5);
            }));
      }
   }

   public bxg y() {
      return this.l().l();
   }

   public boolean c(hx $$0) {
      return this.a($$0, 1);
   }

   public boolean a(iz $$0) {
      return this.c($$0.q());
   }

   public boolean a(hx $$0, int $$1) {
      return $$1 > 6 ? false : this.b(iz.a($$0)) <= $$1;
   }

   public int b(iz $$0) {
      return this.y().a($$0);
   }

   public cgl z() {
      return this.f;
   }

   @Nullable
   public cgj d(hx $$0) {
      return this.f.a($$0, 9216);
   }

   public boolean e(hx $$0) {
      return this.d($$0) != null;
   }

   public void a(bxd $$0, blp $$1, bmu $$2) {
      $$2.a($$0, $$1);
   }

   public void a(Path $$0) throws IOException {
      amj $$1 = this.l().a;

      try (Writer $$2 = Files.newBufferedWriter($$0.resolve("stats.txt"))) {
         $$2.write(String.format(Locale.ROOT, "spawning_chunks: %d\n", $$1.j().b()));
         ctt.d $$3 = this.l().n();
         if ($$3 != null) {
            ObjectIterator $$9 = $$3.b().object2IntEntrySet().iterator();

            while ($$9.hasNext()) {
               Entry<bmi> $$4 = (Entry<bmi>)$$9.next();
               $$2.write(String.format(Locale.ROOT, "spawn_count.%s: %d\n", ((bmi)$$4.getKey()).a(), $$4.getIntValue()));
            }
         }

         $$2.write(String.format(Locale.ROOT, "entities: %s\n", this.M.e()));
         $$2.write(String.format(Locale.ROOT, "block_entity_tickers: %d\n", this.r.size()));
         $$2.write(String.format(Locale.ROOT, "block_ticks: %d\n", this.m().a()));
         $$2.write(String.format(Locale.ROOT, "fluid_ticks: %d\n", this.n().a()));
         $$2.write("distance_manager: " + $$1.j().c() + "\n");
         $$2.write(String.format(Locale.ROOT, "pending_tasks: %d\n", this.l().f()));
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
         a($$12, this.G().a());
      }

      Path $$13 = $$0.resolve("block_entities.csv");

      try (Writer $$14 = Files.newBufferedWriter($$13)) {
         this.a($$14);
      }
   }

   private static void a(Writer $$0, Iterable<blp> $$1) throws IOException {
      ati $$2 = ati.a().a("x").a("y").a("z").a("uuid").a("type").a("alive").a("display_name").a("custom_name").a($$0);

      for (blp $$3 : $$1) {
         vd $$4 = $$3.af();
         vd $$5 = $$3.Q_();
         $$2.a($$3.dr(), $$3.dt(), $$3.dx(), $$3.cw(), kd.g.b($$3.ai()), $$3.bx(), $$5.getString(), $$4 != null ? $$4.getString() : null);
      }
   }

   private void a(Writer $$0) throws IOException {
      ati $$1 = ati.a().a("x").a("y").a("z").a("type").a($$0);

      for (dif $$2 : this.r) {
         hx $$3 = $$2.c();
         $$1.a($$3.u(), $$3.v(), $$3.w(), $$2.d());
      }
   }

   @VisibleForTesting
   public void a(dyr $$0) {
      this.V.removeIf($$1 -> $$0.b($$1.a()));
   }

   @Override
   public void b(hx $$0, cwj $$1) {
      if (!this.ah()) {
         this.a($$0, $$1);
      }
   }

   @Override
   public float a(ic $$0, boolean $$1) {
      return 1.0F;
   }

   public Iterable<blp> A() {
      return this.G().a();
   }

   @Override
   public String toString() {
      return "ServerLevel[" + this.K.g() + "]";
   }

   public boolean B() {
      return this.J.aY().B();
   }

   @Override
   public long C() {
      return this.J.aY().A().b();
   }

   @Nullable
   public dmm D() {
      return this.Z;
   }

   @Override
   public amz E() {
      return this;
   }

   @VisibleForTesting
   public String F() {
      return String.format(
         Locale.ROOT,
         "players: %s, entities: %s [%s], block_entities: %d [%s], block_ticks: %d, fluid_ticks: %d, chunk_source: %s",
         this.H.size(),
         this.M.e(),
         a(this.M.d().a(), $$0 -> kd.g.b($$0.ai()).toString()),
         this.r.size(),
         a(this.r, dif::d),
         this.m().a(),
         this.n().a(),
         this.H()
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

   public static void a(amz $$0) {
      hx $$1 = a;
      int $$2 = $$1.u();
      int $$3 = $$1.v() - 2;
      int $$4 = $$1.w();
      hx.b($$2 - 2, $$3 + 1, $$4 - 2, $$2 + 2, $$3 + 3, $$4 + 2).forEach($$1x -> $$0.b($$1x, cwl.a.o()));
      hx.b($$2 - 2, $$3, $$4 - 2, $$2 + 2, $$3, $$4 + 2).forEach($$1x -> $$0.b($$1x, cwl.co.o()));
   }

   @Override
   protected dna<blp> G() {
      return this.M.d();
   }

   public void a(Stream<blp> $$0) {
      this.M.a($$0);
   }

   public void b(Stream<blp> $$0) {
      this.M.b($$0);
   }

   public void b(dlh $$0) {
      $$0.c(this.B_().e());
   }

   public void a(dkw $$0) {
      this.J.execute(() -> this.ac.a($$0.f(), $$0.g()));
   }

   @Override
   public void close() throws IOException {
      super.close();
      this.M.close();
   }

   @Override
   public String H() {
      return "Chunks[S] W: " + this.I.e() + " E: " + this.M.e();
   }

   public boolean c(long $$0) {
      return this.M.a($$0);
   }

   private boolean d(long $$0) {
      return this.c($$0) && this.I.a($$0);
   }

   public boolean f(hx $$0) {
      return this.M.a($$0) && this.I.a.j().c(csp.a($$0));
   }

   public boolean g(hx $$0) {
      return this.M.a($$0);
   }

   public boolean a(csp $$0) {
      return this.M.a($$0);
   }

   @Override
   public chl I() {
      return this.J.aY().M();
   }

   public aup a(ahd $$0) {
      return this.ae.a($$0);
   }

   public bkb J() {
      return this.ae;
   }

   @Override
   public p a(o $$0) {
      p $$1 = super.a($$0);
      $$1.a("Loaded entity count", () -> String.valueOf(this.M.f()));
      return $$1;
   }

   final class a implements dmz<blp> {
      public void a(blp $$0) {
      }

      public void b(blp $$0) {
         amz.this.f().a($$0);
      }

      public void c(blp $$0) {
         amz.this.L.a($$0);
      }

      public void d(blp $$0) {
         amz.this.L.b($$0);
      }

      public void e(blp $$0) {
         amz.this.l().b($$0);
         if ($$0 instanceof ana $$1) {
            amz.this.H.add($$1);
            amz.this.e();
         }

         if ($$0 instanceof bmh $$2) {
            if (amz.this.U) {
               String $$3 = "onTrackingStart called during navigation iteration";
               ac.a("onTrackingStart called during navigation iteration", new IllegalStateException("onTrackingStart called during navigation iteration"));
            }

            amz.this.T.add($$2);
         }

         if ($$0 instanceof cai $$4) {
            for (cag $$5 : $$4.ga()) {
               amz.this.aa.put($$5.aj(), $$5);
            }
         }

         $$0.a(dnh::a);
      }

      public void f(blp $$0) {
         amz.this.l().a($$0);
         if ($$0 instanceof ana $$1) {
            amz.this.H.remove($$1);
            amz.this.e();
         }

         if ($$0 instanceof bmh $$2) {
            if (amz.this.U) {
               String $$3 = "onTrackingStart called during navigation iteration";
               ac.a("onTrackingStart called during navigation iteration", new IllegalStateException("onTrackingStart called during navigation iteration"));
            }

            amz.this.T.remove($$2);
         }

         if ($$0 instanceof cai $$4) {
            for (cag $$5 : $$4.ga()) {
               amz.this.aa.remove($$5.aj());
            }
         }

         $$0.a(dnh::b);
      }

      public void g(blp $$0) {
         $$0.a(dnh::c);
      }
   }
}
