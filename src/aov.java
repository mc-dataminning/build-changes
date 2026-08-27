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

public class aov extends cvn implements cwi {
   public static final hz a = new hz(100, 50, 0);
   public static final bkz b = blf.a(12000, 180000);
   public static final bkz c = blf.a(12000, 24000);
   private static final bkz D = blf.a(12000, 180000);
   public static final bkz d = blf.a(3600, 15600);
   private static final Logger E = LogUtils.getLogger();
   private static final int F = 300;
   private static final int G = 65536;
   final List<aow> H = Lists.newArrayList();
   private final aot I;
   private final MinecraftServer J;
   private final eiq K;
   private int L;
   final dpc M = new dpc();
   private final dph<bno> N;
   private final dpq O;
   public boolean e;
   private final asq P;
   private int Q;
   private final ehl R;
   private final epg<cyo> S = new epg<>(this::d, this.ag());
   private final epg<ego> T = new epg<>(this::d, this.ag());
   final Set<boi> U = new ObjectOpenHashSet();
   volatile boolean V;
   protected final cis f;
   private final ObjectLinkedOpenHashSet<cus> W = new ObjectLinkedOpenHashSet();
   private final List<cus> X = new ArrayList<>(64);
   private boolean Y;
   private final List<cva> Z;
   @Nullable
   private dor aa;
   final Int2ObjectMap<cck> ab = new Int2ObjectOpenHashMap();
   private final cwg ac;
   private final ebf ad;
   private final boolean ae;
   private final bmb af;

   public aov(
      MinecraftServer $$0,
      Executor $$1,
      eil.c $$2,
      eiq $$3,
      aix<cvn> $$4,
      dop $$5,
      ape $$6,
      boolean $$7,
      long $$8,
      List<cva> $$9,
      boolean $$10,
      @Nullable bmb $$11
   ) {
      super($$3, $$4, $$0.aZ(), $$5.a(), $$0::aR, false, $$7, $$8, $$0.bh());
      this.ae = $$10;
      this.J = $$0;
      this.Z = $$9;
      this.K = $$3;
      dnc $$12 = $$5.b();
      boolean $$13 = $$0.aW();
      DataFixer $$14 = $$0.aA();
      doz<bno> $$15 = new doe(this, $$2.a($$4).resolve("entities"), $$14, $$13, $$0);
      this.N = new dph<>(bno.class, new aov.a(), $$15);
      this.I = new aot(this, $$2, $$14, $$0.aX(), $$1, $$12, $$0.ae().p(), $$0.ae().q(), $$13, $$6, this.N::a, () -> $$0.F().u());
      this.I.h().b();
      this.R = new ehl(this);
      this.S();
      this.V();
      this.D_().a($$0.au());
      this.f = this.u().a(cis.a(this), cis.a(this.ad()));
      if (!$$0.Q()) {
         $$3.a($$0.v_());
      }

      long $$16 = $$0.aY().y().b();
      this.ad = new ebf(this.I.m(), this.I_(), $$0.aX(), $$4, $$12, this.I.i(), this, $$12.c(), $$16, $$14);
      this.ac = new cwg(this, $$0.aY().y(), this.ad);
      if (this.ae() == cvn.j && this.ad().a(dom.c)) {
         this.aa = new dor(this, $$16, $$0.aY().C());
      } else {
         this.aa = null;
      }

      this.P = new asq();
      this.O = new dpq(this);
      this.af = Objects.requireNonNullElseGet($$11, () -> this.u().a(bmb.a($$16), "random_sequences"));
   }

   @Deprecated
   @VisibleForTesting
   public void a(@Nullable dor $$0) {
      this.aa = $$0;
   }

   public void a(int $$0, int $$1, boolean $$2, boolean $$3) {
      this.K.a($$0);
      this.K.c($$1);
      this.K.b($$1);
      this.K.b($$2);
      this.K.a($$3);
   }

   @Override
   public ij<cwm> a(int $$0, int $$1, int $$2) {
      return this.l().g().c().getNoiseBiome($$0, $$1, $$2, this.l().i().b());
   }

   public cwg a() {
      return this.ac;
   }

   public void a(BooleanSupplier $$0) {
      bil $$1 = this.af();
      this.Y = true;
      bmf $$2 = this.s();
      boolean $$3 = $$2.i();
      if ($$3) {
         $$1.a("world border");
         this.D_().s();
         $$1.b("weather");
         this.at();
      }

      int $$4 = this.Z().c(cvj.P);
      if (this.P.a($$4) && this.P.a($$4, this.H)) {
         if (this.Z().b(cvj.l)) {
            long $$5 = this.A.d() + 24000L;
            this.b($$5 - $$5 % 24000L);
         }

         this.ar();
         if (this.Z().b(cvj.v) && this.ab()) {
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
         this.S.a($$6, 65536, this::d);
         $$1.b("fluidTicks");
         this.T.a($$6, 65536, this::a);
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

      this.Y = false;
      $$1.c();
      boolean $$7 = !this.H.isEmpty() || !this.w().isEmpty();
      if ($$7) {
         this.h();
      }

      if ($$7 || this.Q++ < 300) {
         $$1.a("entities");
         if (this.aa != null && $$3) {
            $$1.a("dragonFight");
            this.aa.c();
            $$1.c();
         }

         this.M.a($$2x -> {
            if (!$$2x.dH()) {
               if (this.i($$2x)) {
                  $$2x.am();
               } else if (!$$2.a($$2x)) {
                  $$1.a("checkDespawn");
                  $$2x.dy();
                  $$1.c();
                  if (this.I.a.j().c($$2x.do().a())) {
                     bno $$3x = $$2x.cZ();
                     if ($$3x != null) {
                        if (!$$3x.dH() && $$3x.w($$2x)) {
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
      this.N.a();
      $$1.c();
   }

   @Override
   public boolean a(long $$0) {
      return this.I.a.j().d($$0);
   }

   protected void b() {
      if (this.ae) {
         long $$0 = this.A.c() + 1L;
         this.K.a($$0);
         this.K.s().a(this.J, $$0);
         if (this.A.o().b(cvj.l)) {
            this.b(this.A.d() + 1L);
         }
      }
   }

   public void b(long $$0) {
      this.K.b($$0);
   }

   public void a(boolean $$0, boolean $$1) {
      for (cva $$2 : this.Z) {
         $$2.a(this, $$0, $$1);
      }
   }

   private boolean i(bno $$0) {
      return this.J.Y() || !($$0 instanceof bzt) && !($$0 instanceof cav) ? !this.J.Z() && $$0 instanceof cgt : true;
   }

   private void ar() {
      this.P.a();
      this.H.stream().filter(bog::fD).collect(Collectors.toList()).forEach($$0 -> $$0.a(false, false));
   }

   public void a(dnm $$0, int $$1) {
      cuu $$2 = $$0.f();
      boolean $$3 = this.ab();
      int $$4 = $$2.d();
      int $$5 = $$2.e();
      bil $$6 = this.af();
      $$6.a("thunder");
      if ($$3 && this.aa() && this.z.a(100000) == 0) {
         hz $$7 = this.b(this.a($$4, 0, $$5, 15));
         if (this.r($$7)) {
            bls $$8 = this.d_($$7);
            boolean $$9 = this.Z().b(cvj.e) && this.z.j() < (double)$$8.b() * 0.01 && !this.a_($$7.d()).a(cyq.ss);
            if ($$9) {
               ccb $$10 = bnu.aM.a((cvn)this);
               if ($$10 != null) {
                  $$10.w(true);
                  $$10.c_(0);
                  $$10.a_((double)$$7.u(), (double)$$7.v(), (double)$$7.w());
                  this.b($$10);
               }
            }

            bof $$11 = bnu.ak.a((cvn)this);
            if ($$11 != null) {
               $$11.e(ens.c($$7));
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
         dnn[] $$13 = $$0.d();

         for (int $$14 = 0; $$14 < $$13.length; $$14++) {
            dnn $$15 = $$13[$$14];
            if ($$15.d()) {
               int $$16 = $$0.g($$14);
               int $$17 = jb.c($$16);

               for (int $$18 = 0; $$18 < $$1; $$18++) {
                  hz $$19 = this.a($$4, $$17, $$5, 15);
                  $$6.a("randomTick");
                  dlf $$20 = $$15.a($$19.u() - $$4, $$19.v() - $$17, $$19.w() - $$5);
                  if ($$20.v()) {
                     $$20.b(this, $$19, this.z);
                  }

                  egp $$21 = $$20.u();
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
   public void a(hz $$0) {
      hz $$1 = this.a(dqo.a.e, $$0);
      hz $$2 = $$1.d();
      cwm $$3 = this.t($$1).a();
      if ($$3.a(this, $$2)) {
         this.b($$2, cyq.dO.o());
      }

      if (this.ab()) {
         int $$4 = this.Z().c(cvj.T);
         if ($$4 > 0 && $$3.b(this, $$1)) {
            dlf $$5 = this.a_($$1);
            if ($$5.a(cyq.dN)) {
               int $$6 = $$5.c(dfw.c);
               if ($$6 < Math.min($$4, 8)) {
                  dlf $$7 = $$5.a(dfw.c, Integer.valueOf($$6 + 1));
                  cyo.a($$5, $$7, this, $$1);
                  this.b($$1, $$7);
               }
            } else {
               this.b($$1, cyq.dN.o());
            }
         }

         cwm.c $$8 = $$3.a($$2);
         if ($$8 != cwm.c.a) {
            dlf $$9 = this.a_($$2);
            $$9.b().a($$9, this, $$2, $$8);
         }
      }
   }

   private Optional<hz> E(hz $$0) {
      Optional<hz> $$1 = this.y().e($$0x -> $$0x.a(bzl.t), $$0x -> $$0x.v() == this.a(dqo.a.b, $$0x.u(), $$0x.w()) - 1, $$0, 128, bzh.b.c);
      return $$1.map($$0x -> $$0x.b(1));
   }

   protected hz b(hz $$0) {
      hz $$1 = this.a(dqo.a.e, $$0);
      Optional<hz> $$2 = this.E($$1);
      if ($$2.isPresent()) {
         return $$2.get();
      } else {
         enn $$3 = enn.a($$1, new hz($$1.h(this.al()))).g(3.0);
         List<bog> $$4 = this.a(bog.class, $$3, $$0x -> $$0x != null && $$0x.bx() && this.h($$0x.dm()));
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
      return this.Y;
   }

   public boolean d() {
      return this.Z().c(cvj.P) <= 100;
   }

   private void as() {
      if (this.d()) {
         if (!this.o().Q() || this.o().p()) {
            int $$0 = this.Z().c(cvj.P);
            vq $$1;
            if (this.P.a($$0)) {
               $$1 = vq.c("sleep.skipping_night");
            } else {
               $$1 = vq.a("sleep.players_sleeping", this.P.b(), this.P.b($$0));
            }

            for (aow $$3 : this.H) {
               $$3.a($$1, true);
            }
         }
      }
   }

   public void e() {
      if (!this.H.isEmpty() && this.P.a(this.H)) {
         this.as();
      }
   }

   public ajp f() {
      return this.J.aH();
   }

   private void at() {
      boolean $$0 = this.ab();
      if (this.E_().g()) {
         if (this.Z().b(cvj.v)) {
            int $$1 = this.K.f();
            int $$2 = this.K.h();
            int $$3 = this.K.j();
            boolean $$4 = this.A.g();
            boolean $$5 = this.A.i();
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

            this.K.b($$2);
            this.K.c($$3);
            this.K.a($$1);
            this.K.a($$4);
            this.K.b($$5);
         }

         this.x = this.y;
         if (this.A.g()) {
            this.y += 0.01F;
         } else {
            this.y -= 0.01F;
         }

         this.y = awh.a(this.y, 0.0F, 1.0F);
         this.v = this.w;
         if (this.A.i()) {
            this.w += 0.01F;
         } else {
            this.w -= 0.01F;
         }

         this.w = awh.a(this.w, 0.0F, 1.0F);
      }

      if (this.v != this.w) {
         this.J.ae().a(new abm(abm.i, this.w), this.ae());
      }

      if (this.x != this.y) {
         this.J.ae().a(new abm(abm.j, this.y), this.ae());
      }

      if ($$0 != this.ab()) {
         if ($$0) {
            this.J.ae().a(new abm(abm.d, 0.0F));
         } else {
            this.J.ae().a(new abm(abm.c, 0.0F));
         }

         this.J.ae().a(new abm(abm.i, this.w));
         this.J.ae().a(new abm(abm.j, this.y));
      }
   }

   @VisibleForTesting
   public void g() {
      this.K.c(0);
      this.K.b(false);
      this.K.b(0);
      this.K.a(false);
   }

   public void h() {
      this.Q = 0;
   }

   private void a(hz $$0, ego $$1) {
      egp $$2 = this.b_($$0);
      if ($$2.b($$1)) {
         $$2.a((cvn)this, $$0);
      }
   }

   private void d(hz $$0, cyo $$1) {
      dlf $$2 = this.a_($$0);
      if ($$2.a($$1)) {
         $$2.a(this, $$0, this.z);
      }
   }

   public void a(bno $$0) {
      $$0.bp();
      bil $$1 = this.af();
      $$0.ag++;
      this.af().a(() -> kf.g.b($$0.ai()).toString());
      $$1.d("tickNonPassenger");
      $$0.l();
      this.af().c();

      for (bno $$2 : $$0.cP()) {
         this.a($$0, $$2);
      }
   }

   private void a(bno $$0, bno $$1) {
      if ($$1.dH() || $$1.cZ() != $$0) {
         $$1.ac();
      } else if ($$1 instanceof chh || this.M.c($$1)) {
         $$1.bp();
         $$1.ag++;
         bil $$2 = this.af();
         $$2.a(() -> kf.g.b($$1.ai()).toString());
         $$2.d("tickPassenger");
         $$1.t();
         $$2.c();

         for (bno $$3 : $$1.cP()) {
            this.a($$1, $$3);
         }
      }
   }

   @Override
   public boolean a(chh $$0, hz $$1) {
      return !this.J.a(this, $$1, $$0) && this.D_().a($$1);
   }

   public void a(@Nullable awn $$0, boolean $$1, boolean $$2) {
      aot $$3 = this.l();
      if (!$$2) {
         if ($$0 != null) {
            $$0.a(vq.c("menu.savingLevel"));
         }

         this.au();
         if ($$0 != null) {
            $$0.c(vq.c("menu.savingChunks"));
         }

         $$3.a($$1);
         if ($$1) {
            this.N.c();
         } else {
            this.N.b();
         }
      }
   }

   private void au() {
      if (this.aa != null) {
         this.J.aY().a(this.aa.b());
      }

      this.l().k().a();
   }

   public <T extends bno> List<? extends T> a(dpd<bno, T> $$0, Predicate<? super T> $$1) {
      List<T> $$2 = Lists.newArrayList();
      this.a($$0, $$1, $$2);
      return $$2;
   }

   public <T extends bno> void a(dpd<bno, T> $$0, Predicate<? super T> $$1, List<? super T> $$2) {
      this.a($$0, $$1, $$2, Integer.MAX_VALUE);
   }

   public <T extends bno> void a(dpd<bno, T> $$0, Predicate<? super T> $$1, List<? super T> $$2, int $$3) {
      this.G().a($$0, $$3x -> {
         if ($$1.test((T)$$3x)) {
            $$2.add((T)$$3x);
            if ($$2.size() >= $$3) {
               return auu.a.b;
            }
         }

         return auu.a.a;
      });
   }

   public List<? extends ccm> i() {
      return this.a(bnu.E, bog::bx);
   }

   public List<aow> a(Predicate<? super aow> $$0) {
      return this.a($$0, Integer.MAX_VALUE);
   }

   public List<aow> a(Predicate<? super aow> $$0, int $$1) {
      List<aow> $$2 = Lists.newArrayList();

      for (aow $$3 : this.H) {
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
   public aow j() {
      List<aow> $$0 = this.a(bog::bx);
      return $$0.isEmpty() ? null : $$0.get(this.z.a($$0.size()));
   }

   @Override
   public boolean b(bno $$0) {
      return this.j($$0);
   }

   public boolean c(bno $$0) {
      return this.j($$0);
   }

   public void d(bno $$0) {
      this.j($$0);
   }

   public void a(aow $$0) {
      this.e($$0);
   }

   public void b(aow $$0) {
      this.e($$0);
   }

   public void c(aow $$0) {
      this.e($$0);
   }

   public void d(aow $$0) {
      this.e($$0);
   }

   private void e(aow $$0) {
      bno $$1 = this.G().a($$0.cw());
      if ($$1 != null) {
         E.warn("Force-added player with duplicate UUID {}", $$0.cw());
         $$1.ag();
         this.a((aow)$$1, bno.c.b);
      }

      this.N.a($$0);
   }

   private boolean j(bno $$0) {
      if ($$0.dH()) {
         E.warn("Tried to add entity {} but it was marked as removed already", bnu.a($$0.ai()));
         return false;
      } else {
         return this.N.a($$0);
      }
   }

   public boolean e(bno $$0) {
      if ($$0.cR().map(bno::cw).anyMatch(this.N::a)) {
         return false;
      } else {
         this.a_($$0);
         return true;
      }
   }

   public void a(dnm $$0) {
      $$0.I();
      $$0.b(this);
   }

   public void a(aow $$0, bno.c $$1) {
      $$0.a($$1);
   }

   @Override
   public void a(int $$0, hz $$1, int $$2) {
      for (aow $$3 : this.J.ae().t()) {
         if ($$3 != null && $$3.dM() == this && $$3.aj() != $$0) {
            double $$4 = (double)$$1.u() - $$3.dr();
            double $$5 = (double)$$1.v() - $$3.dt();
            double $$6 = (double)$$1.w() - $$3.dx();
            if ($$4 * $$4 + $$5 * $$5 + $$6 * $$6 < 1024.0) {
               $$3.d.b(new aam($$0, $$1, $$2));
            }
         }
      }
   }

   @Override
   public void a(@Nullable chh $$0, double $$1, double $$2, double $$3, ij<atj> $$4, atl $$5, float $$6, float $$7, long $$8) {
      this.J.ae().a($$0, $$1, $$2, $$3, (double)$$4.a().a($$6), this.ae(), new adz($$4, $$5, $$1, $$2, $$3, $$6, $$7, $$8));
   }

   @Override
   public void a(@Nullable chh $$0, bno $$1, ij<atj> $$2, atl $$3, float $$4, float $$5, long $$6) {
      this.J.ae().a($$0, $$1.dr(), $$1.dt(), $$1.dx(), (double)$$2.a().a($$4), this.ae(), new ady($$2, $$3, $$1, $$4, $$5, $$6));
   }

   @Override
   public void b(int $$0, hz $$1, int $$2) {
      if (this.Z().b(cvj.W)) {
         this.J.ae().a(new abs($$0, $$1, $$2, true));
      } else {
         this.a(null, $$0, $$1, $$2);
      }
   }

   @Override
   public void a(@Nullable chh $$0, int $$1, hz $$2, int $$3) {
      this.J.ae().a($$0, (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), 64.0, this.ae(), new abs($$1, $$2, $$3, false));
   }

   public int k() {
      return this.E_().p();
   }

   @Override
   public void a(ij<dpp> $$0, ens $$1, dpp.a $$2) {
      this.O.a($$0, $$1, $$2);
   }

   @Override
   public void a(hz $$0, dlf $$1, dlf $$2, int $$3) {
      if (this.V) {
         String $$4 = "recursive call to sendBlockUpdated";
         ac.a("recursive call to sendBlockUpdated", new IllegalStateException("recursive call to sendBlockUpdated"));
      }

      this.l().a($$0);
      eol $$5 = $$1.k(this, $$0);
      eol $$6 = $$2.k(this, $$0);
      if (eoi.c($$5, $$6, enw.g)) {
         List<bxp> $$7 = new ObjectArrayList();

         for (boi $$8 : this.U) {
            bxp $$9 = $$8.N();
            if ($$9.b($$0)) {
               $$7.add($$9);
            }
         }

         try {
            this.V = true;

            for (bxp $$10 : $$7) {
               $$10.i();
            }
         } finally {
            this.V = false;
         }
      }
   }

   @Override
   public void a(hz $$0, cyo $$1) {
      this.s.a($$0, $$1, null);
   }

   @Override
   public void a(hz $$0, cyo $$1, ie $$2) {
      this.s.a($$0, $$1, $$2);
   }

   @Override
   public void a(hz $$0, cyo $$1, hz $$2) {
      this.s.a($$0, $$1, $$2);
   }

   @Override
   public void a(dlf $$0, hz $$1, cyo $$2, hz $$3, boolean $$4) {
      this.s.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public void a(bno $$0, byte $$1) {
      this.l().a($$0, new abj($$0, $$1));
   }

   @Override
   public void a(bno $$0, bmn $$1) {
      this.l().a($$0, new abg($$0, $$1));
   }

   public aot l() {
      return this.I;
   }

   @Override
   public cvf a(
      @Nullable bno $$0,
      @Nullable bmn $$1,
      @Nullable cvg $$2,
      double $$3,
      double $$4,
      double $$5,
      float $$6,
      boolean $$7,
      cvn.a $$8,
      jx $$9,
      jx $$10,
      ij<atj> $$11
   ) {
      cvf $$12 = this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, false, $$9, $$10, $$11);
      if (!$$12.d()) {
         $$12.h();
      }

      for (aow $$13 : this.H) {
         if ($$13.i($$3, $$4, $$5) < 4096.0) {
            $$13.d.b(new abk($$3, $$4, $$5, $$6, $$12.i(), $$12.e().get($$13), $$12.j(), $$12.k(), $$12.l(), $$12.m()));
         }
      }

      return $$12;
   }

   @Override
   public void a(hz $$0, cyo $$1, int $$2, int $$3) {
      this.W.add(new cus($$0, $$1, $$2, $$3));
   }

   private void av() {
      this.X.clear();

      while (!this.W.isEmpty()) {
         cus $$0 = (cus)this.W.removeFirst();
         if (this.n($$0.a())) {
            if (this.a($$0)) {
               this.J.ae().a(null, (double)$$0.a().u(), (double)$$0.a().v(), (double)$$0.a().w(), 64.0, this.ae(), new aao($$0.a(), $$0.b(), $$0.c(), $$0.d()));
            }
         } else {
            this.X.add($$0);
         }
      }

      this.W.addAll(this.X);
   }

   private boolean a(cus $$0) {
      dlf $$1 = this.a_($$0.a());
      return $$1.a($$0.b()) ? $$1.a(this, $$0.a(), $$0.c(), $$0.d()) : false;
   }

   public epg<cyo> m() {
      return this.S;
   }

   public epg<ego> n() {
      return this.T;
   }

   @Nonnull
   @Override
   public MinecraftServer o() {
      return this.J;
   }

   public ehl p() {
      return this.R;
   }

   public eff q() {
      return this.J.aX();
   }

   public <T extends jx> int a(T $$0, double $$1, double $$2, double $$3, int $$4, double $$5, double $$6, double $$7, double $$8) {
      abt $$9 = new abt($$0, false, $$1, $$2, $$3, (float)$$5, (float)$$6, (float)$$7, (float)$$8, $$4);
      int $$10 = 0;

      for (int $$11 = 0; $$11 < this.H.size(); $$11++) {
         aow $$12 = this.H.get($$11);
         if (this.a($$12, false, $$1, $$2, $$3, $$9)) {
            $$10++;
         }
      }

      return $$10;
   }

   public <T extends jx> boolean a(aow $$0, T $$1, boolean $$2, double $$3, double $$4, double $$5, int $$6, double $$7, double $$8, double $$9, double $$10) {
      xx<?> $$11 = new abt($$1, $$2, $$3, $$4, $$5, (float)$$7, (float)$$8, (float)$$9, (float)$$10, $$6);
      return this.a($$0, $$2, $$3, $$4, $$5, $$11);
   }

   private boolean a(aow $$0, boolean $$1, double $$2, double $$3, double $$4, xx<?> $$5) {
      if ($$0.dM() != this) {
         return false;
      } else {
         hz $$6 = $$0.dm();
         if ($$6.a(new ens($$2, $$3, $$4), $$1 ? 512.0 : 32.0)) {
            $$0.d.b($$5);
            return true;
         } else {
            return false;
         }
      }
   }

   @Nullable
   @Override
   public bno a(int $$0) {
      return this.G().a($$0);
   }

   @Deprecated
   @Nullable
   public bno b(int $$0) {
      bno $$1 = this.G().a($$0);
      return $$1 != null ? $$1 : (bno)this.ab.get($$0);
   }

   @Nullable
   public bno a(UUID $$0) {
      return this.G().a($$0);
   }

   @Nullable
   public hz a(auo<ebe> $$0, hz $$1, int $$2, boolean $$3) {
      if (!this.J.aY().y().c()) {
         return null;
      } else {
         Optional<in.c<ebe>> $$4 = this.I_().d(kg.aD).b($$0);
         if ($$4.isEmpty()) {
            return null;
         } else {
            Pair<hz, ij<ebe>> $$5 = this.l().g().a(this, $$4.get(), $$1, $$2, $$3);
            return $$5 != null ? (hz)$$5.getFirst() : null;
         }
      }
   }

   @Nullable
   public Pair<hz, ij<cwm>> a(Predicate<ij<cwm>> $$0, hz $$1, int $$2, int $$3, int $$4) {
      return this.l().g().c().a($$1, $$2, $$3, $$4, $$0, this.l().i().b(), this);
   }

   @Override
   public cse r() {
      return this.J.aG();
   }

   @Override
   public bmf s() {
      return this.J.aO();
   }

   @Override
   public boolean t() {
      return this.e;
   }

   public eif u() {
      return this.l().k();
   }

   @Nullable
   @Override
   public ehz a(String $$0) {
      return this.o().F().u().b(ehz.a(), $$0);
   }

   @Override
   public void a(String $$0, ehz $$1) {
      this.o().F().u().a($$0, $$1);
   }

   @Override
   public int v() {
      return this.o().F().u().a(ehy.a(), "idcounts").b();
   }

   public void a(hz $$0, float $$1) {
      hz $$2 = this.A.a();
      float $$3 = this.A.b();
      if (!$$2.equals($$0) || $$3 != $$1) {
         this.A.a($$0, $$1);
         this.o().ae().a(new adh($$0, $$1));
      }

      if (this.L > 1) {
         this.l().b(apa.a, new cuu($$2), this.L, axk.a);
      }

      int $$4 = this.Z().c(cvj.Z) + 1;
      if ($$4 > 1) {
         this.l().a(apa.a, new cuu($$0), $$4, axk.a);
      }

      this.L = $$4;
   }

   public LongSet w() {
      cvi $$0 = this.u().b(cvi.a(), "chunks");
      return (LongSet)($$0 != null ? LongSets.unmodifiable($$0.b()) : LongSets.EMPTY_SET);
   }

   public boolean a(int $$0, int $$1, boolean $$2) {
      cvi $$3 = this.u().a(cvi.a(), "chunks");
      cuu $$4 = new cuu($$0, $$1);
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
   public List<aow> x() {
      return this.H;
   }

   @Override
   public void a(hz $$0, dlf $$1, dlf $$2) {
      Optional<ij<bzk>> $$3 = bzl.a($$1);
      Optional<ij<bzk>> $$4 = bzl.a($$2);
      if (!Objects.equals($$3, $$4)) {
         hz $$5 = $$0.i();
         $$3.ifPresent($$1x -> this.o().execute(() -> {
               this.y().a($$5);
               aep.b(this, $$5);
            }));
         $$4.ifPresent($$1x -> this.o().execute(() -> {
               this.y().a($$5, $$1x);
               aep.a(this, $$5);
            }));
      }
   }

   public bzh y() {
      return this.l().l();
   }

   public boolean c(hz $$0) {
      return this.a($$0, 1);
   }

   public boolean a(jb $$0) {
      return this.c($$0.q());
   }

   public boolean a(hz $$0, int $$1) {
      return $$1 > 6 ? false : this.b(jb.a($$0)) <= $$1;
   }

   public int b(jb $$0) {
      return this.y().a($$0);
   }

   public cis z() {
      return this.f;
   }

   @Nullable
   public ciq d(hz $$0) {
      return this.f.a($$0, 9216);
   }

   public boolean e(hz $$0) {
      return this.d($$0) != null;
   }

   public void a(bze $$0, bno $$1, bou $$2) {
      $$2.a($$0, $$1);
   }

   public void a(Path $$0) throws IOException {
      aof $$1 = this.l().a;

      try (Writer $$2 = Files.newBufferedWriter($$0.resolve("stats.txt"))) {
         $$2.write(String.format(Locale.ROOT, "spawning_chunks: %d\n", $$1.j().b()));
         cvy.d $$3 = this.l().n();
         if ($$3 != null) {
            ObjectIterator $$9 = $$3.b().object2IntEntrySet().iterator();

            while ($$9.hasNext()) {
               Entry<boj> $$4 = (Entry<boj>)$$9.next();
               $$2.write(String.format(Locale.ROOT, "spawn_count.%s: %d\n", ((boj)$$4.getKey()).a(), $$4.getIntValue()));
            }
         }

         $$2.write(String.format(Locale.ROOT, "entities: %s\n", this.N.e()));
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
         this.N.a($$10);
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

   private static void a(Writer $$0, Iterable<bno> $$1) throws IOException {
      avh $$2 = avh.a().a("x").a("y").a("z").a("uuid").a("type").a("alive").a("display_name").a("custom_name").a($$0);

      for (bno $$3 : $$1) {
         vq $$4 = $$3.af();
         vq $$5 = $$3.Q_();
         $$2.a($$3.dr(), $$3.dt(), $$3.dx(), $$3.cw(), kf.g.b($$3.ai()), $$3.bx(), $$5.getString(), $$4 != null ? $$4.getString() : null);
      }
   }

   private void a(Writer $$0) throws IOException {
      avh $$1 = avh.a().a("x").a("y").a("z").a("type").a($$0);

      for (dkk $$2 : this.r) {
         hz $$3 = $$2.c();
         $$1.a($$3.u(), $$3.v(), $$3.w(), $$2.d());
      }
   }

   @VisibleForTesting
   public void a(eaw $$0) {
      this.W.removeIf($$1 -> $$0.b($$1.a()));
   }

   @Override
   public void b(hz $$0, cyo $$1) {
      if (!this.ah()) {
         this.a($$0, $$1);
      }
   }

   @Override
   public float a(ie $$0, boolean $$1) {
      return 1.0F;
   }

   public Iterable<bno> A() {
      return this.G().a();
   }

   @Override
   public String toString() {
      return "ServerLevel[" + this.K.e() + "]";
   }

   public boolean B() {
      return this.J.aY().z();
   }

   @Override
   public long C() {
      return this.J.aY().y().b();
   }

   @Nullable
   public dor D() {
      return this.aa;
   }

   @Override
   public aov E() {
      return this;
   }

   @VisibleForTesting
   public String F() {
      return String.format(
         Locale.ROOT,
         "players: %s, entities: %s [%s], block_entities: %d [%s], block_ticks: %d, fluid_ticks: %d, chunk_source: %s",
         this.H.size(),
         this.N.e(),
         a(this.N.d().a(), $$0 -> kf.g.b($$0.ai()).toString()),
         this.r.size(),
         a(this.r, dkk::d),
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

   public static void a(aov $$0) {
      hz $$1 = a;
      int $$2 = $$1.u();
      int $$3 = $$1.v() - 2;
      int $$4 = $$1.w();
      hz.b($$2 - 2, $$3 + 1, $$4 - 2, $$2 + 2, $$3 + 3, $$4 + 2).forEach($$1x -> $$0.b($$1x, cyq.a.o()));
      hz.b($$2 - 2, $$3, $$4 - 2, $$2 + 2, $$3, $$4 + 2).forEach($$1x -> $$0.b($$1x, cyq.co.o()));
   }

   @Override
   protected dpf<bno> G() {
      return this.N.d();
   }

   public void a(Stream<bno> $$0) {
      this.N.a($$0);
   }

   public void b(Stream<bno> $$0) {
      this.N.b($$0);
   }

   public void b(dnm $$0) {
      $$0.c(this.B_().c());
   }

   public void a(dnb $$0) {
      this.J.execute(() -> this.ad.a($$0.f(), $$0.g()));
   }

   @Override
   public void close() throws IOException {
      super.close();
      this.N.close();
   }

   @Override
   public String H() {
      return "Chunks[S] W: " + this.I.e() + " E: " + this.N.e();
   }

   public boolean c(long $$0) {
      return this.N.a($$0);
   }

   private boolean d(long $$0) {
      return this.c($$0) && this.I.a($$0);
   }

   public boolean f(hz $$0) {
      return this.N.a($$0) && this.I.a.j().c(cuu.a($$0));
   }

   public boolean g(hz $$0) {
      return this.N.a($$0);
   }

   public boolean a(cuu $$0) {
      return this.N.a($$0);
   }

   @Override
   public cjs I() {
      return this.J.aY().K();
   }

   public awo a(aiy $$0) {
      return this.af.a($$0);
   }

   public bmb J() {
      return this.af;
   }

   @Override
   public p a(o $$0) {
      p $$1 = super.a($$0);
      $$1.a("Loaded entity count", () -> String.valueOf(this.N.f()));
      return $$1;
   }

   final class a implements dpe<bno> {
      public void a(bno $$0) {
      }

      public void b(bno $$0) {
         aov.this.f().a($$0);
      }

      public void c(bno $$0) {
         aov.this.M.a($$0);
      }

      public void d(bno $$0) {
         aov.this.M.b($$0);
      }

      public void e(bno $$0) {
         aov.this.l().b($$0);
         if ($$0 instanceof aow $$1) {
            aov.this.H.add($$1);
            aov.this.e();
         }

         if ($$0 instanceof boi $$2) {
            if (aov.this.V) {
               String $$3 = "onTrackingStart called during navigation iteration";
               ac.a("onTrackingStart called during navigation iteration", new IllegalStateException("onTrackingStart called during navigation iteration"));
            }

            aov.this.U.add($$2);
         }

         if ($$0 instanceof ccm $$4) {
            for (cck $$5 : $$4.gc()) {
               aov.this.ab.put($$5.aj(), $$5);
            }
         }

         $$0.a(dpm::a);
      }

      public void f(bno $$0) {
         aov.this.l().a($$0);
         if ($$0 instanceof aow $$1) {
            aov.this.H.remove($$1);
            aov.this.e();
         }

         if ($$0 instanceof boi $$2) {
            if (aov.this.V) {
               String $$3 = "onTrackingStart called during navigation iteration";
               ac.a("onTrackingStart called during navigation iteration", new IllegalStateException("onTrackingStart called during navigation iteration"));
            }

            aov.this.U.remove($$2);
         }

         if ($$0 instanceof ccm $$4) {
            for (cck $$5 : $$4.gc()) {
               aov.this.ab.remove($$5.aj());
            }
         }

         $$0.a(dpm::b);
      }

      public void g(bno $$0) {
         $$0.a(dpm::c);
      }
   }
}
