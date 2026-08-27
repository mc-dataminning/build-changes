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

public class and extends ctp implements cuk {
   public static final hx a = new hx(100, 50, 0);
   public static final bjg b = bjm.a(12000, 180000);
   public static final bjg c = bjm.a(12000, 24000);
   private static final bjg D = bjm.a(12000, 180000);
   public static final bjg d = bjm.a(3600, 15600);
   private static final Logger E = LogUtils.getLogger();
   private static final int F = 300;
   private static final int G = 65536;
   final List<ane> H = Lists.newArrayList();
   private final anb I;
   private final MinecraftServer J;
   private final egr K;
   final dne L = new dne();
   private final dnj<blv> M;
   private final dns N;
   public boolean e;
   private final aqy O;
   private int P;
   private final efn Q;
   private final enh<cwq> R = new enh<>(this::d, this.ag());
   private final enh<eeq> S = new enh<>(this::d, this.ag());
   final Set<bmn> T = new ObjectOpenHashSet();
   volatile boolean U;
   protected final cgs f;
   private final ObjectLinkedOpenHashSet<csu> V = new ObjectLinkedOpenHashSet();
   private final List<csu> W = new ArrayList<>(64);
   private boolean X;
   private final List<ctc> Y;
   @Nullable
   private dmt Z;
   final Int2ObjectMap<cam> aa = new Int2ObjectOpenHashMap();
   private final cui ab;
   private final dzh ac;
   private final boolean ad;
   private final bkh ae;

   public and(
      MinecraftServer $$0,
      Executor $$1,
      egm.c $$2,
      egr $$3,
      ahf<ctp> $$4,
      dmr $$5,
      anm $$6,
      boolean $$7,
      long $$8,
      List<ctc> $$9,
      boolean $$10,
      @Nullable bkh $$11
   ) {
      super($$3, $$4, $$0.aZ(), $$5.a(), $$0::aR, false, $$7, $$8, $$0.bh());
      this.ad = $$10;
      this.J = $$0;
      this.Y = $$9;
      this.K = $$3;
      dle $$12 = $$5.b();
      boolean $$13 = $$0.aW();
      DataFixer $$14 = $$0.aA();
      dnb<blv> $$15 = new dmg(this, $$2.a($$4).resolve("entities"), $$14, $$13, $$0);
      this.M = new dnj<>(blv.class, new and.a(), $$15);
      this.I = new anb(this, $$2, $$14, $$0.aX(), $$1, $$12, $$0.ae().p(), $$0.ae().q(), $$13, $$6, this.M::a, () -> $$0.F().u());
      this.I.h().b();
      this.Q = new efn(this);
      this.S();
      this.V();
      this.D_().a($$0.au());
      this.f = this.u().a(cgs.a(this), cgs.a(this.ad()));
      if (!$$0.Q()) {
         $$3.a($$0.v_());
      }

      long $$16 = $$0.aY().A().b();
      this.ac = new dzh(this.I.m(), this.I_(), $$0.aX(), $$4, $$12, this.I.i(), this, $$12.c(), $$16, $$14);
      this.ab = new cui(this, $$0.aY().A(), this.ac);
      if (this.ae() == ctp.j && this.ad().a(dmo.c)) {
         this.Z = new dmt(this, $$16, $$0.aY().E());
      } else {
         this.Z = null;
      }

      this.O = new aqy();
      this.N = new dns(this);
      this.ae = Objects.requireNonNullElseGet($$11, () -> this.u().a(bkh.a($$16), "random_sequences"));
   }

   @Deprecated
   @VisibleForTesting
   public void a(@Nullable dmt $$0) {
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
   public ih<cuo> a(int $$0, int $$1, int $$2) {
      return this.l().g().c().getNoiseBiome($$0, $$1, $$2, this.l().i().b());
   }

   public cui a() {
      return this.ab;
   }

   public void a(BooleanSupplier $$0) {
      bgs $$1 = this.af();
      this.X = true;
      bkl $$2 = this.s();
      boolean $$3 = $$2.i();
      if ($$3) {
         $$1.a("world border");
         this.D_().s();
         $$1.b("weather");
         this.at();
      }

      int $$4 = this.Z().c(ctl.P);
      if (this.O.a($$4) && this.O.a($$4, this.H)) {
         if (this.Z().b(ctl.l)) {
            long $$5 = this.A.f() + 24000L;
            this.b($$5 - $$5 % 24000L);
         }

         this.ar();
         if (this.Z().b(ctl.v) && this.ab()) {
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
         if (this.Z != null && $$3) {
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
                     blv $$3x = $$2x.cZ();
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
         if (this.A.q().b(ctl.l)) {
            this.b(this.A.f() + 1L);
         }
      }
   }

   public void b(long $$0) {
      this.K.b($$0);
   }

   public void a(boolean $$0, boolean $$1) {
      for (ctc $$2 : this.Y) {
         $$2.a(this, $$0, $$1);
      }
   }

   private boolean i(blv $$0) {
      return this.J.Y() || !($$0 instanceof bxy) && !($$0 instanceof bza) ? !this.J.Z() && $$0 instanceof ceu : true;
   }

   private void ar() {
      this.O.a();
      this.H.stream().filter(bml::fD).collect(Collectors.toList()).forEach($$0 -> $$0.a(false, false));
   }

   public void a(dlo $$0, int $$1) {
      csw $$2 = $$0.f();
      boolean $$3 = this.ab();
      int $$4 = $$2.d();
      int $$5 = $$2.e();
      bgs $$6 = this.af();
      $$6.a("thunder");
      if ($$3 && this.aa() && this.z.a(100000) == 0) {
         hx $$7 = this.b(this.a($$4, 0, $$5, 15));
         if (this.r($$7)) {
            bjz $$8 = this.d_($$7);
            boolean $$9 = this.Z().b(ctl.e) && this.z.j() < (double)$$8.b() * 0.01 && !this.a_($$7.d()).a(cws.ss);
            if ($$9) {
               cad $$10 = blz.aL.a((ctp)this);
               if ($$10 != null) {
                  $$10.w(true);
                  $$10.c_(0);
                  $$10.a_((double)$$7.u(), (double)$$7.v(), (double)$$7.w());
                  this.b($$10);
               }
            }

            bmk $$11 = blz.aj.a((ctp)this);
            if ($$11 != null) {
               $$11.e(elt.c($$7));
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
         dlp[] $$13 = $$0.d();

         for (int $$14 = 0; $$14 < $$13.length; $$14++) {
            dlp $$15 = $$13[$$14];
            if ($$15.d()) {
               int $$16 = $$0.g($$14);
               int $$17 = iz.c($$16);

               for (int $$18 = 0; $$18 < $$1; $$18++) {
                  hx $$19 = this.a($$4, $$17, $$5, 15);
                  $$6.a("randomTick");
                  djh $$20 = $$15.a($$19.u() - $$4, $$19.v() - $$17, $$19.w() - $$5);
                  if ($$20.v()) {
                     $$20.b(this, $$19, this.z);
                  }

                  eer $$21 = $$20.u();
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
      hx $$1 = this.a(doq.a.e, $$0);
      hx $$2 = $$1.d();
      cuo $$3 = this.t($$1).a();
      if ($$3.a(this, $$2)) {
         this.b($$2, cws.dO.o());
      }

      if (this.ab()) {
         int $$4 = this.Z().c(ctl.T);
         if ($$4 > 0 && $$3.b(this, $$1)) {
            djh $$5 = this.a_($$1);
            if ($$5.a(cws.dN)) {
               int $$6 = $$5.c(ddy.c);
               if ($$6 < Math.min($$4, 8)) {
                  djh $$7 = $$5.a(ddy.c, Integer.valueOf($$6 + 1));
                  cwq.a($$5, $$7, this, $$1);
                  this.b($$1, $$7);
               }
            } else {
               this.b($$1, cws.dN.o());
            }
         }

         cuo.c $$8 = $$3.a($$2);
         if ($$8 != cuo.c.a) {
            djh $$9 = this.a_($$2);
            $$9.b().a($$9, this, $$2, $$8);
         }
      }
   }

   private Optional<hx> E(hx $$0) {
      Optional<hx> $$1 = this.y().e($$0x -> $$0x.a(bxq.t), $$0x -> $$0x.v() == this.a(doq.a.b, $$0x.u(), $$0x.w()) - 1, $$0, 128, bxm.b.c);
      return $$1.map($$0x -> $$0x.b(1));
   }

   protected hx b(hx $$0) {
      hx $$1 = this.a(doq.a.e, $$0);
      Optional<hx> $$2 = this.E($$1);
      if ($$2.isPresent()) {
         return $$2.get();
      } else {
         elo $$3 = elo.a($$1, new hx($$1.h(this.al()))).g(3.0);
         List<bml> $$4 = this.a(bml.class, $$3, $$0x -> $$0x != null && $$0x.bx() && this.h($$0x.dm()));
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
      return this.Z().c(ctl.P) <= 100;
   }

   private void as() {
      if (this.d()) {
         if (!this.o().Q() || this.o().p()) {
            int $$0 = this.Z().c(ctl.P);
            vf $$1;
            if (this.O.a($$0)) {
               $$1 = vf.c("sleep.skipping_night");
            } else {
               $$1 = vf.a("sleep.players_sleeping", this.O.b(), this.O.b($$0));
            }

            for (ane $$3 : this.H) {
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

   public ahx f() {
      return this.J.aH();
   }

   private void at() {
      boolean $$0 = this.ab();
      if (this.E_().g()) {
         if (this.Z().b(ctl.v)) {
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

         this.y = auo.a(this.y, 0.0F, 1.0F);
         this.v = this.w;
         if (this.A.k()) {
            this.w += 0.01F;
         } else {
            this.w -= 0.01F;
         }

         this.w = auo.a(this.w, 0.0F, 1.0F);
      }

      if (this.v != this.w) {
         this.J.ae().a(new aaf(aaf.h, this.w), this.ae());
      }

      if (this.x != this.y) {
         this.J.ae().a(new aaf(aaf.i, this.y), this.ae());
      }

      if ($$0 != this.ab()) {
         if ($$0) {
            this.J.ae().a(new aaf(aaf.c, 0.0F));
         } else {
            this.J.ae().a(new aaf(aaf.b, 0.0F));
         }

         this.J.ae().a(new aaf(aaf.h, this.w));
         this.J.ae().a(new aaf(aaf.i, this.y));
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

   private void a(hx $$0, eeq $$1) {
      eer $$2 = this.b_($$0);
      if ($$2.b($$1)) {
         $$2.a((ctp)this, $$0);
      }
   }

   private void d(hx $$0, cwq $$1) {
      djh $$2 = this.a_($$0);
      if ($$2.a($$1)) {
         $$2.a(this, $$0, this.z);
      }
   }

   public void a(blv $$0) {
      $$0.bp();
      bgs $$1 = this.af();
      $$0.ah++;
      this.af().a(() -> kd.g.b($$0.ai()).toString());
      $$1.d("tickNonPassenger");
      $$0.l();
      this.af().c();

      for (blv $$2 : $$0.cP()) {
         this.a($$0, $$2);
      }
   }

   private void a(blv $$0, blv $$1) {
      if ($$1.dH() || $$1.cZ() != $$0) {
         $$1.ac();
      } else if ($$1 instanceof cfi || this.L.c($$1)) {
         $$1.bp();
         $$1.ah++;
         bgs $$2 = this.af();
         $$2.a(() -> kd.g.b($$1.ai()).toString());
         $$2.d("tickPassenger");
         $$1.t();
         $$2.c();

         for (blv $$3 : $$1.cP()) {
            this.a($$1, $$3);
         }
      }
   }

   @Override
   public boolean a(cfi $$0, hx $$1) {
      return !this.J.a(this, $$1, $$0) && this.D_().a($$1);
   }

   public void a(@Nullable auu $$0, boolean $$1, boolean $$2) {
      anb $$3 = this.l();
      if (!$$2) {
         if ($$0 != null) {
            $$0.a(vf.c("menu.savingLevel"));
         }

         this.au();
         if ($$0 != null) {
            $$0.c(vf.c("menu.savingChunks"));
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

   public <T extends blv> List<? extends T> a(dnf<blv, T> $$0, Predicate<? super T> $$1) {
      List<T> $$2 = Lists.newArrayList();
      this.a($$0, $$1, $$2);
      return $$2;
   }

   public <T extends blv> void a(dnf<blv, T> $$0, Predicate<? super T> $$1, List<? super T> $$2) {
      this.a($$0, $$1, $$2, Integer.MAX_VALUE);
   }

   public <T extends blv> void a(dnf<blv, T> $$0, Predicate<? super T> $$1, List<? super T> $$2, int $$3) {
      this.G().a($$0, $$3x -> {
         if ($$1.test((T)$$3x)) {
            $$2.add((T)$$3x);
            if ($$2.size() >= $$3) {
               return atc.a.b;
            }
         }

         return atc.a.a;
      });
   }

   public List<? extends cao> i() {
      return this.a(blz.D, bml::bx);
   }

   public List<ane> a(Predicate<? super ane> $$0) {
      return this.a($$0, Integer.MAX_VALUE);
   }

   public List<ane> a(Predicate<? super ane> $$0, int $$1) {
      List<ane> $$2 = Lists.newArrayList();

      for (ane $$3 : this.H) {
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
   public ane j() {
      List<ane> $$0 = this.a(bml::bx);
      return $$0.isEmpty() ? null : $$0.get(this.z.a($$0.size()));
   }

   @Override
   public boolean b(blv $$0) {
      return this.j($$0);
   }

   public boolean c(blv $$0) {
      return this.j($$0);
   }

   public void d(blv $$0) {
      this.j($$0);
   }

   public void a(ane $$0) {
      this.e($$0);
   }

   public void b(ane $$0) {
      this.e($$0);
   }

   public void c(ane $$0) {
      this.e($$0);
   }

   public void d(ane $$0) {
      this.e($$0);
   }

   private void e(ane $$0) {
      blv $$1 = this.G().a($$0.cw());
      if ($$1 != null) {
         E.warn("Force-added player with duplicate UUID {}", $$0.cw());
         $$1.ag();
         this.a((ane)$$1, blv.c.b);
      }

      this.M.a($$0);
   }

   private boolean j(blv $$0) {
      if ($$0.dH()) {
         E.warn("Tried to add entity {} but it was marked as removed already", blz.a($$0.ai()));
         return false;
      } else {
         return this.M.a($$0);
      }
   }

   public boolean e(blv $$0) {
      if ($$0.cR().map(blv::cw).anyMatch(this.M::a)) {
         return false;
      } else {
         this.a_($$0);
         return true;
      }
   }

   public void a(dlo $$0) {
      $$0.I();
      $$0.b(this);
   }

   public void a(ane $$0, blv.c $$1) {
      $$0.a($$1);
   }

   @Override
   public void a(int $$0, hx $$1, int $$2) {
      for (ane $$3 : this.J.ae().t()) {
         if ($$3 != null && $$3.dM() == this && $$3.aj() != $$0) {
            double $$4 = (double)$$1.u() - $$3.dr();
            double $$5 = (double)$$1.v() - $$3.dt();
            double $$6 = (double)$$1.w() - $$3.dx();
            if ($$4 * $$4 + $$5 * $$5 + $$6 * $$6 < 1024.0) {
               $$3.c.b(new zg($$0, $$1, $$2));
            }
         }
      }
   }

   @Override
   public void a(@Nullable cfi $$0, double $$1, double $$2, double $$3, ih<arr> $$4, art $$5, float $$6, float $$7, long $$8) {
      this.J.ae().a($$0, $$1, $$2, $$3, (double)$$4.a().a($$6), this.ae(), new acs($$4, $$5, $$1, $$2, $$3, $$6, $$7, $$8));
   }

   @Override
   public void a(@Nullable cfi $$0, blv $$1, ih<arr> $$2, art $$3, float $$4, float $$5, long $$6) {
      this.J.ae().a($$0, $$1.dr(), $$1.dt(), $$1.dx(), (double)$$2.a().a($$4), this.ae(), new acr($$2, $$3, $$1, $$4, $$5, $$6));
   }

   @Override
   public void b(int $$0, hx $$1, int $$2) {
      if (this.Z().b(ctl.W)) {
         this.J.ae().a(new aal($$0, $$1, $$2, true));
      } else {
         this.a(null, $$0, $$1, $$2);
      }
   }

   @Override
   public void a(@Nullable cfi $$0, int $$1, hx $$2, int $$3) {
      this.J.ae().a($$0, (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), 64.0, this.ae(), new aal($$1, $$2, $$3, false));
   }

   public int k() {
      return this.E_().p();
   }

   @Override
   public void a(dnr $$0, elt $$1, dnr.a $$2) {
      this.N.a($$0, $$1, $$2);
   }

   @Override
   public void a(hx $$0, djh $$1, djh $$2, int $$3) {
      if (this.U) {
         String $$4 = "recursive call to sendBlockUpdated";
         ac.a("recursive call to sendBlockUpdated", new IllegalStateException("recursive call to sendBlockUpdated"));
      }

      this.l().a($$0);
      emm $$5 = $$1.k(this, $$0);
      emm $$6 = $$2.k(this, $$0);
      if (emj.c($$5, $$6, elx.g)) {
         List<bvv> $$7 = new ObjectArrayList();

         for (bmn $$8 : this.T) {
            bvv $$9 = $$8.N();
            if ($$9.b($$0)) {
               $$7.add($$9);
            }
         }

         try {
            this.U = true;

            for (bvv $$10 : $$7) {
               $$10.i();
            }
         } finally {
            this.U = false;
         }
      }
   }

   @Override
   public void a(hx $$0, cwq $$1) {
      this.s.a($$0, $$1, null);
   }

   @Override
   public void a(hx $$0, cwq $$1, ic $$2) {
      this.s.a($$0, $$1, $$2);
   }

   @Override
   public void a(hx $$0, cwq $$1, hx $$2) {
      this.s.a($$0, $$1, $$2);
   }

   @Override
   public void a(djh $$0, hx $$1, cwq $$2, hx $$3, boolean $$4) {
      this.s.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public void a(blv $$0, byte $$1) {
      this.l().a($$0, new aac($$0, $$1));
   }

   @Override
   public void a(blv $$0, bkt $$1) {
      this.l().a($$0, new zz($$0, $$1));
   }

   public anb l() {
      return this.I;
   }

   @Override
   public cth a(
      @Nullable blv $$0, @Nullable bkt $$1, @Nullable cti $$2, double $$3, double $$4, double $$5, float $$6, boolean $$7, ctp.a $$8, jv $$9, jv $$10, arr $$11
   ) {
      cth $$12 = this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, false, $$9, $$10, $$11);
      if (!$$12.d()) {
         $$12.h();
      }

      for (ane $$13 : this.H) {
         if ($$13.i($$3, $$4, $$5) < 4096.0) {
            $$13.c.b(new aad($$3, $$4, $$5, $$6, $$12.i(), $$12.e().get($$13), $$12.j(), $$12.k(), $$12.l(), $$12.m()));
         }
      }

      return $$12;
   }

   @Override
   public void a(hx $$0, cwq $$1, int $$2, int $$3) {
      this.V.add(new csu($$0, $$1, $$2, $$3));
   }

   private void av() {
      this.W.clear();

      while (!this.V.isEmpty()) {
         csu $$0 = (csu)this.V.removeFirst();
         if (this.n($$0.a())) {
            if (this.a($$0)) {
               this.J.ae().a(null, (double)$$0.a().u(), (double)$$0.a().v(), (double)$$0.a().w(), 64.0, this.ae(), new zi($$0.a(), $$0.b(), $$0.c(), $$0.d()));
            }
         } else {
            this.W.add($$0);
         }
      }

      this.V.addAll(this.W);
   }

   private boolean a(csu $$0) {
      djh $$1 = this.a_($$0.a());
      return $$1.a($$0.b()) ? $$1.a(this, $$0.a(), $$0.c(), $$0.d()) : false;
   }

   public enh<cwq> m() {
      return this.R;
   }

   public enh<eeq> n() {
      return this.S;
   }

   @Nonnull
   @Override
   public MinecraftServer o() {
      return this.J;
   }

   public efn p() {
      return this.Q;
   }

   public edh q() {
      return this.J.aX();
   }

   public <T extends jv> int a(T $$0, double $$1, double $$2, double $$3, int $$4, double $$5, double $$6, double $$7, double $$8) {
      aam $$9 = new aam($$0, false, $$1, $$2, $$3, (float)$$5, (float)$$6, (float)$$7, (float)$$8, $$4);
      int $$10 = 0;

      for (int $$11 = 0; $$11 < this.H.size(); $$11++) {
         ane $$12 = this.H.get($$11);
         if (this.a($$12, false, $$1, $$2, $$3, $$9)) {
            $$10++;
         }
      }

      return $$10;
   }

   public <T extends jv> boolean a(ane $$0, T $$1, boolean $$2, double $$3, double $$4, double $$5, int $$6, double $$7, double $$8, double $$9, double $$10) {
      xf<?> $$11 = new aam($$1, $$2, $$3, $$4, $$5, (float)$$7, (float)$$8, (float)$$9, (float)$$10, $$6);
      return this.a($$0, $$2, $$3, $$4, $$5, $$11);
   }

   private boolean a(ane $$0, boolean $$1, double $$2, double $$3, double $$4, xf<?> $$5) {
      if ($$0.dM() != this) {
         return false;
      } else {
         hx $$6 = $$0.dm();
         if ($$6.a(new elt($$2, $$3, $$4), $$1 ? 512.0 : 32.0)) {
            $$0.c.b($$5);
            return true;
         } else {
            return false;
         }
      }
   }

   @Nullable
   @Override
   public blv a(int $$0) {
      return this.G().a($$0);
   }

   @Deprecated
   @Nullable
   public blv b(int $$0) {
      blv $$1 = this.G().a($$0);
      return $$1 != null ? $$1 : (blv)this.aa.get($$0);
   }

   @Nullable
   public blv a(UUID $$0) {
      return this.G().a($$0);
   }

   @Nullable
   public hx a(asw<dzg> $$0, hx $$1, int $$2, boolean $$3) {
      if (!this.J.aY().A().c()) {
         return null;
      } else {
         Optional<il.c<dzg>> $$4 = this.I_().d(ke.aD).b($$0);
         if ($$4.isEmpty()) {
            return null;
         } else {
            Pair<hx, ih<dzg>> $$5 = this.l().g().a(this, $$4.get(), $$1, $$2, $$3);
            return $$5 != null ? (hx)$$5.getFirst() : null;
         }
      }
   }

   @Nullable
   public Pair<hx, ih<cuo>> a(Predicate<ih<cuo>> $$0, hx $$1, int $$2, int $$3, int $$4) {
      return this.l().g().c().a($$1, $$2, $$3, $$4, $$0, this.l().i().b(), this);
   }

   @Override
   public cqf r() {
      return this.J.aG();
   }

   @Override
   public bkl s() {
      return this.J.aO();
   }

   @Override
   public boolean t() {
      return this.e;
   }

   public egh u() {
      return this.l().k();
   }

   @Nullable
   @Override
   public egb a(String $$0) {
      return this.o().F().u().b(egb.a(), $$0);
   }

   @Override
   public void a(String $$0, egb $$1) {
      this.o().F().u().a($$0, $$1);
   }

   @Override
   public int v() {
      return this.o().F().u().a(ega.a(), "idcounts").b();
   }

   public void a(hx $$0, float $$1) {
      csw $$2 = new csw(new hx(this.A.a(), 0, this.A.c()));
      this.A.a($$0, $$1);
      this.l().b(ani.a, $$2, 11, avs.a);
      this.l().a(ani.a, new csw($$0), 11, avs.a);
      this.o().ae().a(new aca($$0, $$1));
   }

   public LongSet w() {
      ctk $$0 = this.u().b(ctk.a(), "chunks");
      return (LongSet)($$0 != null ? LongSets.unmodifiable($$0.b()) : LongSets.EMPTY_SET);
   }

   public boolean a(int $$0, int $$1, boolean $$2) {
      ctk $$3 = this.u().a(ctk.a(), "chunks");
      csw $$4 = new csw($$0, $$1);
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
   public List<ane> x() {
      return this.H;
   }

   @Override
   public void a(hx $$0, djh $$1, djh $$2) {
      Optional<ih<bxp>> $$3 = bxq.a($$1);
      Optional<ih<bxp>> $$4 = bxq.a($$2);
      if (!Objects.equals($$3, $$4)) {
         hx $$5 = $$0.i();
         $$3.ifPresent($$1x -> this.o().execute(() -> {
               this.y().a($$5);
               adi.b(this, $$5);
            }));
         $$4.ifPresent($$1x -> this.o().execute(() -> {
               this.y().a($$5, $$1x);
               adi.a(this, $$5);
            }));
      }
   }

   public bxm y() {
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

   public cgs z() {
      return this.f;
   }

   @Nullable
   public cgq d(hx $$0) {
      return this.f.a($$0, 9216);
   }

   public boolean e(hx $$0) {
      return this.d($$0) != null;
   }

   public void a(bxj $$0, blv $$1, bna $$2) {
      $$2.a($$0, $$1);
   }

   public void a(Path $$0) throws IOException {
      amn $$1 = this.l().a;

      try (Writer $$2 = Files.newBufferedWriter($$0.resolve("stats.txt"))) {
         $$2.write(String.format(Locale.ROOT, "spawning_chunks: %d\n", $$1.j().b()));
         cua.d $$3 = this.l().n();
         if ($$3 != null) {
            ObjectIterator $$9 = $$3.b().object2IntEntrySet().iterator();

            while ($$9.hasNext()) {
               Entry<bmo> $$4 = (Entry<bmo>)$$9.next();
               $$2.write(String.format(Locale.ROOT, "spawn_count.%s: %d\n", ((bmo)$$4.getKey()).a(), $$4.getIntValue()));
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

   private static void a(Writer $$0, Iterable<blv> $$1) throws IOException {
      ato $$2 = ato.a().a("x").a("y").a("z").a("uuid").a("type").a("alive").a("display_name").a("custom_name").a($$0);

      for (blv $$3 : $$1) {
         vf $$4 = $$3.af();
         vf $$5 = $$3.Q_();
         $$2.a($$3.dr(), $$3.dt(), $$3.dx(), $$3.cw(), kd.g.b($$3.ai()), $$3.bx(), $$5.getString(), $$4 != null ? $$4.getString() : null);
      }
   }

   private void a(Writer $$0) throws IOException {
      ato $$1 = ato.a().a("x").a("y").a("z").a("type").a($$0);

      for (dim $$2 : this.r) {
         hx $$3 = $$2.c();
         $$1.a($$3.u(), $$3.v(), $$3.w(), $$2.d());
      }
   }

   @VisibleForTesting
   public void a(dyy $$0) {
      this.V.removeIf($$1 -> $$0.b($$1.a()));
   }

   @Override
   public void b(hx $$0, cwq $$1) {
      if (!this.ah()) {
         this.a($$0, $$1);
      }
   }

   @Override
   public float a(ic $$0, boolean $$1) {
      return 1.0F;
   }

   public Iterable<blv> A() {
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
   public dmt D() {
      return this.Z;
   }

   @Override
   public and E() {
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
         a(this.r, dim::d),
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

   public static void a(and $$0) {
      hx $$1 = a;
      int $$2 = $$1.u();
      int $$3 = $$1.v() - 2;
      int $$4 = $$1.w();
      hx.b($$2 - 2, $$3 + 1, $$4 - 2, $$2 + 2, $$3 + 3, $$4 + 2).forEach($$1x -> $$0.b($$1x, cws.a.o()));
      hx.b($$2 - 2, $$3, $$4 - 2, $$2 + 2, $$3, $$4 + 2).forEach($$1x -> $$0.b($$1x, cws.co.o()));
   }

   @Override
   protected dnh<blv> G() {
      return this.M.d();
   }

   public void a(Stream<blv> $$0) {
      this.M.a($$0);
   }

   public void b(Stream<blv> $$0) {
      this.M.b($$0);
   }

   public void b(dlo $$0) {
      $$0.c(this.B_().e());
   }

   public void a(dld $$0) {
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
      return this.M.a($$0) && this.I.a.j().c(csw.a($$0));
   }

   public boolean g(hx $$0) {
      return this.M.a($$0);
   }

   public boolean a(csw $$0) {
      return this.M.a($$0);
   }

   @Override
   public chs I() {
      return this.J.aY().M();
   }

   public auv a(ahg $$0) {
      return this.ae.a($$0);
   }

   public bkh J() {
      return this.ae;
   }

   @Override
   public p a(o $$0) {
      p $$1 = super.a($$0);
      $$1.a("Loaded entity count", () -> String.valueOf(this.M.f()));
      return $$1;
   }

   final class a implements dng<blv> {
      public void a(blv $$0) {
      }

      public void b(blv $$0) {
         and.this.f().a($$0);
      }

      public void c(blv $$0) {
         and.this.L.a($$0);
      }

      public void d(blv $$0) {
         and.this.L.b($$0);
      }

      public void e(blv $$0) {
         and.this.l().b($$0);
         if ($$0 instanceof ane $$1) {
            and.this.H.add($$1);
            and.this.e();
         }

         if ($$0 instanceof bmn $$2) {
            if (and.this.U) {
               String $$3 = "onTrackingStart called during navigation iteration";
               ac.a("onTrackingStart called during navigation iteration", new IllegalStateException("onTrackingStart called during navigation iteration"));
            }

            and.this.T.add($$2);
         }

         if ($$0 instanceof cao $$4) {
            for (cam $$5 : $$4.ga()) {
               and.this.aa.put($$5.aj(), $$5);
            }
         }

         $$0.a(dno::a);
      }

      public void f(blv $$0) {
         and.this.l().a($$0);
         if ($$0 instanceof ane $$1) {
            and.this.H.remove($$1);
            and.this.e();
         }

         if ($$0 instanceof bmn $$2) {
            if (and.this.U) {
               String $$3 = "onTrackingStart called during navigation iteration";
               ac.a("onTrackingStart called during navigation iteration", new IllegalStateException("onTrackingStart called during navigation iteration"));
            }

            and.this.T.remove($$2);
         }

         if ($$0 instanceof cao $$4) {
            for (cam $$5 : $$4.ga()) {
               and.this.aa.remove($$5.aj());
            }
         }

         $$0.a(dno::b);
      }

      public void g(blv $$0) {
         $$0.a(dno::c);
      }
   }
}
