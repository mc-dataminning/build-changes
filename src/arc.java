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
import java.util.Collection;
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

public class arc extends dgg implements arb, dhe {
   public static final ji a = new ji(100, 50, 0);
   public static final brn b = brt.a(12000, 180000);
   public static final brn c = brt.a(12000, 24000);
   private static final brn E = brt.a(12000, 180000);
   public static final brn d = brt.a(3600, 15600);
   private static final Logger F = LogUtils.getLogger();
   private static final int G = 300;
   private static final int H = 65536;
   final List<ard> I = Lists.newArrayList();
   private final aqz J;
   private final MinecraftServer K;
   private final evi L;
   private int M;
   final ebe N = new ebe();
   private final ebj<buj> O;
   private final ebs P;
   public boolean e;
   private final avf Q;
   private int R;
   private final etv S;
   private final fcn<djk> T = new fcn<>(this::d);
   private final fcn<esw> U = new fcn<>(this::d);
   private final etp V = new etp();
   final Set<bvh> W = new ObjectOpenHashSet();
   volatile boolean X;
   protected final cqk f;
   private final ObjectLinkedOpenHashSet<dfk> Y = new ObjectLinkedOpenHashSet();
   private final List<dfk> Z = new ArrayList<>(64);
   private boolean aa;
   private final List<dfs> ab;
   @Nullable
   private eat ac;
   final Int2ObjectMap<cjq> ad = new Int2ObjectOpenHashMap();
   private final dhc ae;
   private final enl af;
   private final boolean ag;
   private final bsn ah;

   public arc(
      MinecraftServer $$0,
      Executor $$1,
      evd.c $$2,
      evi $$3,
      akt<dgg> $$4,
      ear $$5,
      arm $$6,
      boolean $$7,
      long $$8,
      List<dfs> $$9,
      boolean $$10,
      @Nullable bsn $$11
   ) {
      super($$3, $$4, $$0.ba(), $$5.a(), false, $$7, $$8, $$0.bj());
      this.ag = $$10;
      this.K = $$0;
      this.ab = $$9;
      this.L = $$3;
      dyr $$12 = $$5.b();
      boolean $$13 = $$0.aX();
      DataFixer $$14 = $$0.aC();
      ebb<buj> $$15 = new eab(new eam(new eaj($$2.f(), $$4, "entities"), $$2.a($$4).resolve("entities"), $$14, $$13, bam.s), this, $$0);
      this.O = new ebj<>(buj.class, new arc.a(), $$15);
      this.J = new aqz(this, $$2, $$14, $$0.aY(), $$1, $$12, $$0.ag().p(), $$0.ag().q(), $$13, $$6, this.O::a, () -> $$0.J().w());
      this.J.h().b();
      this.S = new etv(this);
      this.Y();
      this.ab();
      this.F_().a($$0.aw());
      this.f = this.w().a(cqk.a(this), cqk.a(this.ah()));
      if (!$$0.U()) {
         $$3.a($$0.u());
      }

      long $$16 = $$0.aZ().y().c();
      this.af = new enl(this.J.m(), this.K_(), $$0.aY(), $$4, $$12, this.J.i(), this, $$12.d(), $$16, $$14);
      this.ae = new dhc(this, $$0.aZ().y(), this.af);
      if (this.ai() == dgg.k && this.ah().a(eao.c)) {
         this.ac = new eat(this, $$16, $$0.aZ().C());
      } else {
         this.ac = null;
      }

      this.Q = new avf();
      this.P = new ebs(this);
      this.ah = Objects.requireNonNullElseGet($$11, () -> this.w().a(bsn.a($$16), "random_sequences"));
   }

   @Deprecated
   @VisibleForTesting
   public void a(@Nullable eat $$0) {
      this.ac = $$0;
   }

   public void a(int $$0, int $$1, boolean $$2, boolean $$3) {
      this.L.a($$0);
      this.L.c($$1);
      this.L.b($$1);
      this.L.b($$2);
      this.L.a($$3);
   }

   @Override
   public jr<dhi> a(int $$0, int $$1, int $$2) {
      return this.m().g().d().getNoiseBiome($$0, $$1, $$2, this.m().i().b());
   }

   public dhc b() {
      return this.ae;
   }

   public void a(BooleanSupplier $$0) {
      bor $$1 = boq.a();
      this.aa = true;
      bsr $$2 = this.u();
      boolean $$3 = $$2.i();
      if ($$3) {
         $$1.a("world border");
         this.F_().s();
         $$1.b("weather");
         this.av();
         $$1.c();
      }

      int $$4 = this.O().c(dgc.Q);
      if (this.Q.a($$4) && this.Q.a($$4, this.I)) {
         if (this.O().b(dgc.l)) {
            long $$5 = this.B.d() + 24000L;
            this.b($$5 - $$5 % 24000L);
         }

         this.at();
         if (this.O().b(dgc.w) && this.ag()) {
            this.h();
         }
      }

      this.Y();
      if ($$3) {
         this.c();
      }

      $$1.a("tickPending");
      if (!this.aj() && $$3) {
         long $$6 = this.ad();
         $$1.a("blockTicks");
         this.T.a($$6, 65536, this::d);
         $$1.b("fluidTicks");
         this.U.a($$6, 65536, this::a);
         $$1.c();
      }

      $$1.b("raid");
      if ($$3) {
         this.f.a();
      }

      $$1.b("chunkSource");
      this.m().a($$0, true);
      $$1.b("blockEvents");
      if ($$3) {
         this.aw();
      }

      this.aa = false;
      $$1.c();
      boolean $$7 = !this.I.isEmpty() || !this.y().isEmpty();
      if ($$7) {
         this.i();
      }

      if ($$7 || this.R++ < 300) {
         $$1.a("entities");
         if (this.ac != null && $$3) {
            $$1.a("dragonFight");
            this.ac.c();
            $$1.c();
         }

         this.N.a($$2x -> {
            if (!$$2x.dR()) {
               if (!$$2.a($$2x)) {
                  $$1.a("checkDespawn");
                  $$2x.dI();
                  $$1.c();
                  if ($$2x instanceof ard || this.J.a.j().c($$2x.dy().a())) {
                     buj $$3x = $$2x.dl();
                     if ($$3x != null) {
                        if (!$$3x.dR() && $$3x.y($$2x)) {
                           return;
                        }

                        $$2x.ae();
                     }

                     $$1.a("tick");
                     this.a(this::a, $$2x);
                     $$1.c();
                  }
               }
            }
         });
         $$1.c();
         this.X();
      }

      $$1.a("entityManagement");
      this.O.a();
      $$1.c();
   }

   @Override
   public boolean a(long $$0) {
      return this.J.a.j().d($$0);
   }

   protected void c() {
      if (this.ag) {
         long $$0 = this.B.c() + 1L;
         this.L.a($$0);
         boq.a().a("scheduledFunctions");
         this.L.s().a(this.K, $$0);
         boq.a().c();
         if (this.L.o().b(dgc.l)) {
            this.b(this.B.d() + 1L);
         }
      }
   }

   public void b(long $$0) {
      this.L.b($$0);
   }

   public void a(boolean $$0, boolean $$1) {
      for (dfs $$2 : this.ab) {
         $$2.a(this, $$0, $$1);
      }
   }

   private void at() {
      this.Q.a();
      this.I.stream().filter(bvf::fR).collect(Collectors.toList()).forEach($$0 -> $$0.a(false, false));
   }

   public void a(dza $$0, int $$1) {
      dfm $$2 = $$0.f();
      boolean $$3 = this.ag();
      int $$4 = $$2.d();
      int $$5 = $$2.e();
      bor $$6 = boq.a();
      $$6.a("thunder");
      if ($$3 && this.af() && this.A.a(100000) == 0) {
         ji $$7 = this.b(this.a($$4, 0, $$5, 15));
         if (this.r($$7)) {
            bsg $$8 = this.d_($$7);
            boolean $$9 = this.O().b(dgc.e) && this.A.j() < (double)$$8.b() * 0.01 && !this.a_($$7.e()).a(djm.sU);
            if ($$9) {
               cjg $$10 = buq.bf.a(this, bup.h);
               if ($$10 != null) {
                  $$10.x(true);
                  $$10.c_(0);
                  $$10.a_((double)$$7.u(), (double)$$7.v(), (double)$$7.w());
                  this.b($$10);
               }
            }

            bve $$11 = buq.aw.a(this, bup.h);
            if ($$11 != null) {
               $$11.e(fay.c($$7));
               $$11.a($$9);
               this.b($$11);
            }
         }
      }

      $$6.b("iceandsnow");

      for (int $$12 = 0; $$12 < $$1; $$12++) {
         if (this.A.a(48) == 0) {
            this.a(this.a($$4, 0, $$5, 15));
         }
      }

      $$6.b("tickBlocks");
      if ($$1 > 0) {
         dzb[] $$13 = $$0.d();

         for (int $$14 = 0; $$14 < $$13.length; $$14++) {
            dzb $$15 = $$13[$$14];
            if ($$15.d()) {
               int $$16 = $$0.h($$14);
               int $$17 = kk.c($$16);

               for (int $$18 = 0; $$18 < $$1; $$18++) {
                  ji $$19 = this.a($$4, $$17, $$5, 15);
                  $$6.a("randomTick");
                  dwv $$20 = $$15.a($$19.u() - $$4, $$19.v() - $$17, $$19.w() - $$5);
                  if ($$20.z()) {
                     $$20.b(this, $$19, this.A);
                  }

                  esx $$21 = $$20.y();
                  if ($$21.f()) {
                     $$21.a(this, $$19, this.A);
                  }

                  $$6.c();
               }
            }
         }
      }

      $$6.c();
   }

   @VisibleForTesting
   public void a(ji $$0) {
      ji $$1 = this.a(ecq.a.e, $$0);
      ji $$2 = $$1.e();
      dhi $$3 = this.t($$1).a();
      if ($$3.a(this, $$2)) {
         this.b($$2, djm.eb.m());
      }

      if (this.ag()) {
         int $$4 = this.O().c(dgc.U);
         if ($$4 > 0 && $$3.b(this, $$1)) {
            dwv $$5 = this.a_($$1);
            if ($$5.a(djm.ea)) {
               int $$6 = $$5.c(dqy.c);
               if ($$6 < Math.min($$4, 8)) {
                  dwv $$7 = $$5.b(dqy.c, Integer.valueOf($$6 + 1));
                  djk.a($$5, $$7, this, $$1);
                  this.b($$1, $$7);
               }
            } else {
               this.b($$1, djm.ea.m());
            }
         }

         dhi.c $$8 = $$3.a($$2, this.P());
         if ($$8 != dhi.c.a) {
            dwv $$9 = this.a_($$2);
            $$9.b().a($$9, this, $$2, $$8);
         }
      }
   }

   private Optional<ji> E(ji $$0) {
      Optional<ji> $$1 = this.A().e($$0x -> $$0x.a(cgn.t), $$0x -> $$0x.v() == this.a(ecq.a.b, $$0x.u(), $$0x.w()) - 1, $$0, 128, cgj.b.c);
      return $$1.map($$0x -> $$0x.b(1));
   }

   protected ji b(ji $$0) {
      ji $$1 = this.a(ecq.a.e, $$0);
      Optional<ji> $$2 = this.E($$1);
      if ($$2.isPresent()) {
         return $$2.get();
      } else {
         fat $$3 = fat.a($$1, $$1.h(this.an() + 1)).g(3.0);
         List<bvf> $$4 = this.a(bvf.class, $$3, $$0x -> $$0x != null && $$0x.bL() && this.h($$0x.dw()));
         if (!$$4.isEmpty()) {
            return $$4.get(this.A.a($$4.size())).dw();
         } else {
            if ($$1.v() == this.L_() - 1) {
               $$1 = $$1.b(2);
            }

            return $$1;
         }
      }
   }

   public boolean d() {
      return this.aa;
   }

   public boolean e() {
      return this.O().c(dgc.Q) <= 100;
   }

   private void au() {
      if (this.e()) {
         if (!this.p().U() || this.p().r()) {
            int $$0 = this.O().c(dgc.Q);
            wo $$1;
            if (this.Q.a($$0)) {
               $$1 = wo.c("sleep.skipping_night");
            } else {
               $$1 = wo.a("sleep.players_sleeping", this.Q.b(), this.Q.b($$0));
            }

            for (ard $$3 : this.I) {
               $$3.a($$1, true);
            }
         }
      }
   }

   public void f() {
      if (!this.I.isEmpty() && this.Q.a(this.I)) {
         this.au();
      }
   }

   public aln g() {
      return this.K.aJ();
   }

   private void av() {
      boolean $$0 = this.ag();
      if (this.G_().g()) {
         if (this.O().b(dgc.w)) {
            int $$1 = this.L.f();
            int $$2 = this.L.h();
            int $$3 = this.L.j();
            boolean $$4 = this.B.g();
            boolean $$5 = this.B.i();
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
                  $$2 = d.a(this.A);
               } else {
                  $$2 = E.a(this.A);
               }

               if ($$3 > 0) {
                  if (--$$3 == 0) {
                     $$5 = !$$5;
                  }
               } else if ($$5) {
                  $$3 = c.a(this.A);
               } else {
                  $$3 = b.a(this.A);
               }
            }

            this.L.b($$2);
            this.L.c($$3);
            this.L.a($$1);
            this.L.a($$4);
            this.L.b($$5);
         }

         this.y = this.z;
         if (this.B.g()) {
            this.z += 0.01F;
         } else {
            this.z -= 0.01F;
         }

         this.z = ayy.a(this.z, 0.0F, 1.0F);
         this.w = this.x;
         if (this.B.i()) {
            this.x += 0.01F;
         } else {
            this.x -= 0.01F;
         }

         this.x = ayy.a(this.x, 0.0F, 1.0F);
      }

      if (this.w != this.x) {
         this.K.ag().a(new acs(acs.i, this.x), this.ai());
      }

      if (this.y != this.z) {
         this.K.ag().a(new acs(acs.j, this.z), this.ai());
      }

      if ($$0 != this.ag()) {
         if ($$0) {
            this.K.ag().a(new acs(acs.d, 0.0F));
         } else {
            this.K.ag().a(new acs(acs.c, 0.0F));
         }

         this.K.ag().a(new acs(acs.i, this.x));
         this.K.ag().a(new acs(acs.j, this.z));
      }
   }

   @VisibleForTesting
   public void h() {
      this.L.c(0);
      this.L.b(false);
      this.L.b(0);
      this.L.a(false);
   }

   public void i() {
      this.R = 0;
   }

   private void a(ji $$0, esw $$1) {
      dwv $$2 = this.a_($$0);
      esx $$3 = $$2.y();
      if ($$3.b($$1)) {
         $$3.a(this, $$0, $$2);
      }
   }

   private void d(ji $$0, djk $$1) {
      dwv $$2 = this.a_($$0);
      if ($$2.a($$1)) {
         $$2.a(this, $$0, this.A);
      }
   }

   public void a(buj $$0) {
      $$0.bz();
      bor $$1 = boq.a();
      $$0.af++;
      $$1.a(() -> mb.f.b($$0.aq()).toString());
      $$1.f("tickNonPassenger");
      $$0.h();
      $$1.c();

      for (buj $$2 : $$0.cZ()) {
         this.a($$0, $$2);
      }
   }

   private void a(buj $$0, buj $$1) {
      if ($$1.dR() || $$1.dl() != $$0) {
         $$1.ae();
      } else if ($$1 instanceof cov || this.N.c($$1)) {
         $$1.bz();
         $$1.af++;
         bor $$2 = boq.a();
         $$2.a(() -> mb.f.b($$1.aq()).toString());
         $$2.f("tickPassenger");
         $$1.r();
         $$2.c();

         for (buj $$3 : $$1.cZ()) {
            this.a($$1, $$3);
         }
      }
   }

   @Override
   public boolean a(cov $$0, ji $$1) {
      return !this.K.a(this, $$1, $$0) && this.F_().a($$1);
   }

   public void a(@Nullable azf $$0, boolean $$1, boolean $$2) {
      aqz $$3 = this.m();
      if (!$$2) {
         if ($$0 != null) {
            $$0.a(wo.c("menu.savingLevel"));
         }

         this.b($$1);
         if ($$0 != null) {
            $$0.c(wo.c("menu.savingChunks"));
         }

         $$3.a($$1);
         if ($$1) {
            this.O.c();
         } else {
            this.O.b();
         }
      }
   }

   private void b(boolean $$0) {
      if (this.ac != null) {
         this.K.aZ().a(this.ac.b());
      }

      eux $$1 = this.m().k();
      if ($$0) {
         $$1.b();
      } else {
         $$1.a();
      }
   }

   public <T extends buj> List<? extends T> a(ebf<buj, T> $$0, Predicate<? super T> $$1) {
      List<T> $$2 = Lists.newArrayList();
      this.a($$0, $$1, $$2);
      return $$2;
   }

   public <T extends buj> void a(ebf<buj, T> $$0, Predicate<? super T> $$1, List<? super T> $$2) {
      this.a($$0, $$1, $$2, Integer.MAX_VALUE);
   }

   public <T extends buj> void a(ebf<buj, T> $$0, Predicate<? super T> $$1, List<? super T> $$2, int $$3) {
      this.H().a($$0, $$3x -> {
         if ($$1.test((T)$$3x)) {
            $$2.add((T)$$3x);
            if ($$2.size() >= $$3) {
               return axk.a.b;
            }
         }

         return axk.a.a;
      });
   }

   public List<? extends cjt> j() {
      return this.a(buq.P, bvf::bL);
   }

   public List<ard> a(Predicate<? super ard> $$0) {
      return this.a($$0, Integer.MAX_VALUE);
   }

   public List<ard> a(Predicate<? super ard> $$0, int $$1) {
      List<ard> $$2 = Lists.newArrayList();

      for (ard $$3 : this.I) {
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
   public ard k() {
      List<ard> $$0 = this.a(bvf::bL);
      return $$0.isEmpty() ? null : $$0.get(this.A.a($$0.size()));
   }

   @Override
   public boolean b(buj $$0) {
      return this.i($$0);
   }

   public boolean c(buj $$0) {
      return this.i($$0);
   }

   public void d(buj $$0) {
      if ($$0 instanceof ard $$1) {
         this.c($$1);
      } else {
         this.i($$0);
      }
   }

   public void a(ard $$0) {
      this.c($$0);
   }

   public void b(ard $$0) {
      this.c($$0);
   }

   private void c(ard $$0) {
      buj $$1 = this.H().a($$0.cG());
      if ($$1 != null) {
         F.warn("Force-added player with duplicate UUID {}", $$0.cG());
         $$1.ao();
         this.a((ard)$$1, buj.d.b);
      }

      this.O.a($$0);
   }

   private boolean i(buj $$0) {
      if ($$0.dR()) {
         F.warn("Tried to add entity {} but it was marked as removed already", buq.a($$0.aq()));
         return false;
      } else {
         return this.O.a($$0);
      }
   }

   public boolean e(buj $$0) {
      if ($$0.db().map(buj::cG).anyMatch(this.O::a)) {
         return false;
      } else {
         this.a_($$0);
         return true;
      }
   }

   public void a(dza $$0) {
      $$0.J();
      $$0.c(this);
   }

   public void a(ard $$0, buj.d $$1) {
      $$0.a($$1);
   }

   @Override
   public void a(int $$0, ji $$1, int $$2) {
      for (ard $$3 : this.K.ag().t()) {
         if ($$3 != null && $$3.dW() == this && $$3.ar() != $$0) {
            double $$4 = (double)$$1.u() - $$3.dB();
            double $$5 = (double)$$1.v() - $$3.dD();
            double $$6 = (double)$$1.w() - $$3.dH();
            if ($$4 * $$4 + $$5 * $$5 + $$6 * $$6 < 1024.0) {
               $$3.f.b(new abq($$0, $$1, $$2));
            }
         }
      }
   }

   @Override
   public void a(@Nullable cov $$0, double $$1, double $$2, double $$3, jr<avy> $$4, awa $$5, float $$6, float $$7, long $$8) {
      this.K.ag().a($$0, $$1, $$2, $$3, (double)$$4.a().a($$6), this.ai(), new afm($$4, $$5, $$1, $$2, $$3, $$6, $$7, $$8));
   }

   @Override
   public void a(@Nullable cov $$0, buj $$1, jr<avy> $$2, awa $$3, float $$4, float $$5, long $$6) {
      this.K.ag().a($$0, $$1.dB(), $$1.dD(), $$1.dH(), (double)$$2.a().a($$4), this.ai(), new afl($$2, $$3, $$1, $$4, $$5, $$6));
   }

   @Override
   public void b(int $$0, ji $$1, int $$2) {
      if (this.O().b(dgc.X)) {
         this.K.ag().t().forEach($$3 -> {
            fay $$5;
            if ($$3.dW() == this) {
               fay $$4 = fay.b($$1);
               if ($$3.f($$4) < (double)ayy.h(32)) {
                  $$5 = $$4;
               } else {
                  fay $$6 = $$4.d($$3.du()).d();
                  $$5 = $$3.du().e($$6.c(32.0));
               }
            } else {
               $$5 = $$3.du();
            }

            $$3.f.b(new acy($$0, ji.a((kb)$$5), $$2, true));
         });
      } else {
         this.a(null, $$0, $$1, $$2);
      }
   }

   @Override
   public void a(@Nullable cov $$0, int $$1, ji $$2, int $$3) {
      this.K.ag().a($$0, (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), 64.0, this.ai(), new acy($$1, $$2, $$3, false));
   }

   public int l() {
      return this.G_().p();
   }

   @Override
   public void a(jr<ebr> $$0, fay $$1, ebr.a $$2) {
      this.P.a($$0, $$1, $$2);
   }

   @Override
   public void a(ji $$0, dwv $$1, dwv $$2, int $$3) {
      if (this.X) {
         String $$4 = "recursive call to sendBlockUpdated";
         af.a("recursive call to sendBlockUpdated", new IllegalStateException("recursive call to sendBlockUpdated"));
      }

      this.m().a($$0);
      this.V.a($$0);
      fbs $$5 = $$1.g(this, $$0);
      fbs $$6 = $$2.g(this, $$0);
      if (fbp.c($$5, $$6, fbc.g)) {
         List<cer> $$7 = new ObjectArrayList();

         for (bvh $$8 : this.W) {
            cer $$9 = $$8.L();
            if ($$9.b($$0)) {
               $$7.add($$9);
            }
         }

         try {
            this.X = true;

            for (cer $$10 : $$7) {
               $$10.h();
            }
         } finally {
            this.X = false;
         }
      }
   }

   @Override
   public void a(ji $$0, djk $$1) {
      this.a($$0, $$1, eub.a(this, null, null));
   }

   @Override
   public void a(ji $$0, djk $$1, @Nullable euf $$2) {
      this.t.a($$0, $$1, null, $$2);
   }

   @Override
   public void a(ji $$0, djk $$1, jn $$2, @Nullable euf $$3) {
      this.t.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void b(ji $$0, djk $$1, @Nullable euf $$2) {
      this.t.a($$0, $$1, $$2);
   }

   @Override
   public void a(dwv $$0, ji $$1, djk $$2, @Nullable euf $$3, boolean $$4) {
      this.t.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public void a(buj $$0, byte $$1) {
      this.m().a($$0, new aco($$0, $$1));
   }

   @Override
   public void a(buj $$0, bsz $$1) {
      this.m().a($$0, new ack($$0, $$1));
   }

   public aqz m() {
      return this.J;
   }

   @Override
   public void a(
      @Nullable buj $$0,
      @Nullable bsz $$1,
      @Nullable dfz $$2,
      double $$3,
      double $$4,
      double $$5,
      float $$6,
      boolean $$7,
      dgg.a $$8,
      lr $$9,
      lr $$10,
      jr<avy> $$11
   ) {
      dfy.a $$12 = switch ($$8) {
         case a -> dfy.a.a;
         case b -> this.a(dgc.R);
         case c -> this.O().b(dgc.c) ? this.a(dgc.S) : dfy.a.a;
         case d -> this.a(dgc.T);
         case e -> dfy.a.d;
      };
      fay $$13 = new fay($$3, $$4, $$5);
      dgw $$14 = new dgw(this, $$0, $$1, $$2, $$13, $$6, $$7, $$12);
      $$14.i();
      lr $$15 = $$14.l() ? $$9 : $$10;

      for (ard $$16 : this.I) {
         if ($$16.f($$13) < 4096.0) {
            Optional<fay> $$17 = Optional.ofNullable($$14.j().get($$16));
            $$16.f.b(new acq($$13, $$17, $$15, $$11));
         }
      }
   }

   private dfy.a a(dgc.e<dgc.a> $$0) {
      return this.O().b($$0) ? dfy.a.c : dfy.a.b;
   }

   @Override
   public void a(ji $$0, djk $$1, int $$2, int $$3) {
      this.Y.add(new dfk($$0, $$1, $$2, $$3));
   }

   private void aw() {
      this.Z.clear();

      while (!this.Y.isEmpty()) {
         dfk $$0 = (dfk)this.Y.removeFirst();
         if (this.n($$0.a())) {
            if (this.a($$0)) {
               this.K.ag().a(null, (double)$$0.a().u(), (double)$$0.a().v(), (double)$$0.a().w(), 64.0, this.ai(), new abs($$0.a(), $$0.b(), $$0.c(), $$0.d()));
            }
         } else {
            this.Z.add($$0);
         }
      }

      this.Y.addAll(this.Z);
   }

   private boolean a(dfk $$0) {
      dwv $$1 = this.a_($$0.a());
      return $$1.a($$0.b()) ? $$1.a(this, $$0.a(), $$0.c(), $$0.d()) : false;
   }

   public fcn<djk> n() {
      return this.T;
   }

   public fcn<esw> o() {
      return this.U;
   }

   @Nonnull
   @Override
   public MinecraftServer p() {
      return this.K;
   }

   public etv q() {
      return this.S;
   }

   public ern r() {
      return this.K.aY();
   }

   public <T extends lr> int a(T $$0, double $$1, double $$2, double $$3, int $$4, double $$5, double $$6, double $$7, double $$8) {
      return this.a($$0, false, false, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8);
   }

   public <T extends lr> int a(T $$0, boolean $$1, boolean $$2, double $$3, double $$4, double $$5, int $$6, double $$7, double $$8, double $$9, double $$10) {
      acz $$11 = new acz($$0, $$1, $$2, $$3, $$4, $$5, (float)$$7, (float)$$8, (float)$$9, (float)$$10, $$6);
      int $$12 = 0;

      for (int $$13 = 0; $$13 < this.I.size(); $$13++) {
         ard $$14 = this.I.get($$13);
         if (this.a($$14, $$1, $$3, $$4, $$5, $$11)) {
            $$12++;
         }
      }

      return $$12;
   }

   public <T extends lr> boolean a(
      ard $$0, T $$1, boolean $$2, boolean $$3, double $$4, double $$5, double $$6, int $$7, double $$8, double $$9, double $$10, double $$11
   ) {
      yv<?> $$12 = new acz($$1, $$2, $$3, $$4, $$5, $$6, (float)$$8, (float)$$9, (float)$$10, (float)$$11, $$7);
      return this.a($$0, $$2, $$4, $$5, $$6, $$12);
   }

   private boolean a(ard $$0, boolean $$1, double $$2, double $$3, double $$4, yv<?> $$5) {
      if ($$0.dW() != this) {
         return false;
      } else {
         ji $$6 = $$0.dw();
         if ($$6.a(new fay($$2, $$3, $$4), $$1 ? 512.0 : 32.0)) {
            $$0.f.b($$5);
            return true;
         } else {
            return false;
         }
      }
   }

   @Nullable
   @Override
   public buj a(int $$0) {
      return this.H().a($$0);
   }

   @Nullable
   public buj a(UUID $$0) {
      return this.H().a($$0);
   }

   @Deprecated
   @Nullable
   public buj b(int $$0) {
      buj $$1 = this.H().a($$0);
      return $$1 != null ? $$1 : (buj)this.ad.get($$0);
   }

   @Override
   public Collection<cjq> s() {
      return this.ad.values();
   }

   @Nullable
   public ji a(axe<enk> $$0, ji $$1, int $$2, boolean $$3) {
      if (!this.K.aZ().y().d()) {
         return null;
      } else {
         Optional<jv.c<enk>> $$4 = this.K_().e(mc.aU).a($$0);
         if ($$4.isEmpty()) {
            return null;
         } else {
            Pair<ji, jr<enk>> $$5 = this.m().g().a(this, $$4.get(), $$1, $$2, $$3);
            return $$5 != null ? (ji)$$5.getFirst() : null;
         }
      }
   }

   @Nullable
   public Pair<ji, jr<dhi>> a(Predicate<jr<dhi>> $$0, ji $$1, int $$2, int $$3, int $$4) {
      return this.m().g().d().a($$1, $$2, $$3, $$4, $$0, this.m().i().b(), this);
   }

   public dbj t() {
      return this.K.aI();
   }

   @Override
   public bsr u() {
      return this.K.aP();
   }

   @Override
   public boolean v() {
      return this.e;
   }

   public eux w() {
      return this.m().k();
   }

   @Nullable
   @Override
   public eur a(eup $$0) {
      return this.p().J().w().b(eur.a(), $$0.a());
   }

   @Override
   public void a(eup $$0, eur $$1) {
      this.p().J().w().a($$0.a(), $$1);
   }

   @Override
   public eup x() {
      return this.p().J().w().a(euq.a(), "idcounts").b();
   }

   public void a(ji $$0, float $$1) {
      ji $$2 = this.B.a();
      float $$3 = this.B.b();
      if (!$$2.equals($$0) || $$3 != $$1) {
         this.B.a($$0, $$1);
         this.p().ag().a(new aes($$0, $$1));
      }

      if (this.M > 1) {
         this.m().b(ari.a, new dfm($$2), this.M, bae.a);
      }

      int $$4 = this.O().c(dgc.ab) + 1;
      if ($$4 > 1) {
         this.m().a(ari.a, new dfm($$0), $$4, bae.a);
      }

      this.M = $$4;
   }

   public LongSet y() {
      dgb $$0 = this.w().b(dgb.a(), "chunks");
      return (LongSet)($$0 != null ? LongSets.unmodifiable($$0.b()) : LongSets.EMPTY_SET);
   }

   public boolean a(int $$0, int $$1, boolean $$2) {
      dgb $$3 = this.w().a(dgb.a(), "chunks");
      dfm $$4 = new dfm($$0, $$1);
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
         this.m().a($$4, $$2);
      }

      return $$6;
   }

   @Override
   public List<ard> z() {
      return this.I;
   }

   @Override
   public void a(ji $$0, dwv $$1, dwv $$2) {
      Optional<jr<cgm>> $$3 = cgn.a($$1);
      Optional<jr<cgm>> $$4 = cgn.a($$2);
      if (!Objects.equals($$3, $$4)) {
         ji $$5 = $$0.j();
         $$3.ifPresent($$1x -> this.p().execute(() -> {
               this.A().a($$5);
               agc.b(this, $$5);
            }));
         $$4.ifPresent($$1x -> this.p().execute(() -> {
               this.A().a($$5, $$1x);
               agc.a(this, $$5);
            }));
      }
   }

   public cgj A() {
      return this.m().l();
   }

   public boolean c(ji $$0) {
      return this.a($$0, 1);
   }

   public boolean a(kk $$0) {
      return this.c($$0.k());
   }

   public boolean a(ji $$0, int $$1) {
      return $$1 > 6 ? false : this.b(kk.a($$0)) <= $$1;
   }

   public int b(kk $$0) {
      return this.A().a($$0);
   }

   public cqk B() {
      return this.f;
   }

   @Nullable
   public cqi d(ji $$0) {
      return this.f.a($$0, 9216);
   }

   public boolean e(ji $$0) {
      return this.d($$0) != null;
   }

   public void a(cgg $$0, buj $$1, bvu $$2) {
      $$2.a($$0, $$1);
   }

   public void a(Path $$0) throws IOException {
      aqh $$1 = this.m().a;

      try (Writer $$2 = Files.newBufferedWriter($$0.resolve("stats.txt"))) {
         $$2.write(String.format(Locale.ROOT, "spawning_chunks: %d\n", $$1.j().b()));
         dgr.d $$3 = this.m().n();
         if ($$3 != null) {
            ObjectIterator $$9 = $$3.b().object2IntEntrySet().iterator();

            while ($$9.hasNext()) {
               Entry<bvi> $$4 = (Entry<bvi>)$$9.next();
               $$2.write(String.format(Locale.ROOT, "spawn_count.%s: %d\n", ((bvi)$$4.getKey()).a(), $$4.getIntValue()));
            }
         }

         $$2.write(String.format(Locale.ROOT, "entities: %s\n", this.O.e()));
         $$2.write(String.format(Locale.ROOT, "block_entity_tickers: %d\n", this.s.size()));
         $$2.write(String.format(Locale.ROOT, "block_ticks: %d\n", this.n().a()));
         $$2.write(String.format(Locale.ROOT, "fluid_ticks: %d\n", this.o().a()));
         $$2.write("distance_manager: " + $$1.j().d() + "\n");
         $$2.write(String.format(Locale.ROOT, "pending_tasks: %d\n", this.m().f()));
      }

      o $$5 = new o("Level dump", new Exception("dummy"));
      this.a($$5);

      try (Writer $$6 = Files.newBufferedWriter($$0.resolve("example_crash.txt"))) {
         $$6.write($$5.a(y.c));
      }

      Path $$7 = $$0.resolve("chunks.csv");

      try (Writer $$8 = Files.newBufferedWriter($$7)) {
         $$1.a($$8);
      }

      Path $$9 = $$0.resolve("entity_chunks.csv");

      try (Writer $$10 = Files.newBufferedWriter($$9)) {
         this.O.a($$10);
      }

      Path $$11 = $$0.resolve("entities.csv");

      try (Writer $$12 = Files.newBufferedWriter($$11)) {
         a($$12, this.H().a());
      }

      Path $$13 = $$0.resolve("block_entities.csv");

      try (Writer $$14 = Files.newBufferedWriter($$13)) {
         this.a($$14);
      }
   }

   private static void a(Writer $$0, Iterable<buj> $$1) throws IOException {
      axy $$2 = axy.a().a("x").a("y").a("z").a("uuid").a("type").a("alive").a("display_name").a("custom_name").a($$0);

      for (buj $$3 : $$1) {
         wo $$4 = $$3.an();
         wo $$5 = $$3.p_();
         $$2.a($$3.dB(), $$3.dD(), $$3.dH(), $$3.cG(), mb.f.b($$3.aq()), $$3.bL(), $$5.getString(), $$4 != null ? $$4.getString() : null);
      }
   }

   private void a(Writer $$0) throws IOException {
      axy $$1 = axy.a().a("x").a("y").a("z").a("type").a($$0);

      for (dvs $$2 : this.s) {
         ji $$3 = $$2.c();
         $$1.a($$3.u(), $$3.v(), $$3.w(), $$2.d());
      }
   }

   @VisibleForTesting
   public void a(enc $$0) {
      this.Y.removeIf($$1 -> $$0.b($$1.a()));
   }

   @Override
   public void b(ji $$0, djk $$1) {
      if (!this.aj()) {
         this.a($$0, $$1);
      }
   }

   @Override
   public float a(jn $$0, boolean $$1) {
      return 1.0F;
   }

   public Iterable<buj> C() {
      return this.H().a();
   }

   @Override
   public String toString() {
      return "ServerLevel[" + this.L.e() + "]";
   }

   public boolean D() {
      return this.K.aZ().z();
   }

   @Override
   public long E() {
      return this.K.aZ().y().c();
   }

   @Nullable
   public eat F() {
      return this.ac;
   }

   @Override
   public arc a() {
      return this;
   }

   @VisibleForTesting
   public String G() {
      return String.format(
         Locale.ROOT,
         "players: %s, entities: %s [%s], block_entities: %d [%s], block_ticks: %d, fluid_ticks: %d, chunk_source: %s",
         this.I.size(),
         this.O.e(),
         a(this.O.d().a(), $$0 -> mb.f.b($$0.aq()).toString()),
         this.s.size(),
         a(this.s, dvs::d),
         this.n().a(),
         this.o().a(),
         this.J()
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

   @Override
   protected ebh<buj> H() {
      return this.O.d();
   }

   public void a(Stream<buj> $$0) {
      this.O.a($$0);
   }

   public void b(Stream<buj> $$0) {
      this.O.b($$0);
   }

   public void b(dza $$0) {
      $$0.d(this.D_().c());
   }

   public void a(dyq $$0) {
      this.K.execute(() -> this.af.a($$0.f(), $$0.g()));
   }

   public etp I() {
      return this.V;
   }

   @Override
   public void close() throws IOException {
      super.close();
      this.O.close();
   }

   @Override
   public String J() {
      return "Chunks[S] W: " + this.J.e() + " E: " + this.O.e();
   }

   public boolean c(long $$0) {
      return this.O.a($$0);
   }

   private boolean d(long $$0) {
      return this.c($$0) && this.J.a($$0);
   }

   public boolean f(ji $$0) {
      return this.O.a($$0) && this.J.a.j().c(dfm.a($$0));
   }

   public boolean g(ji $$0) {
      return this.O.a($$0);
   }

   public boolean a(dfm $$0) {
      return this.O.a($$0);
   }

   @Override
   public crr K() {
      return this.K.aZ().K();
   }

   @Override
   public cyl L() {
      return this.K.bn();
   }

   @Override
   public duv M() {
      return this.K.bo();
   }

   public azg a(aku $$0) {
      return this.ah.a($$0);
   }

   public bsn N() {
      return this.ah;
   }

   public dgc O() {
      return this.L.o();
   }

   @Override
   public p a(o $$0) {
      p $$1 = super.a($$0);
      $$1.a("Loaded entity count", () -> String.valueOf(this.O.f()));
      return $$1;
   }

   @Override
   public int P() {
      return this.J.g().f();
   }

   final class a implements ebg<buj> {
      public void a(buj $$0) {
      }

      public void b(buj $$0) {
         arc.this.g().a($$0);
      }

      public void c(buj $$0) {
         arc.this.N.a($$0);
      }

      public void d(buj $$0) {
         arc.this.N.b($$0);
      }

      public void e(buj $$0) {
         arc.this.m().b($$0);
         if ($$0 instanceof ard $$1) {
            arc.this.I.add($$1);
            arc.this.f();
         }

         if ($$0 instanceof bvh $$2) {
            if (arc.this.X) {
               String $$3 = "onTrackingStart called during navigation iteration";
               af.a("onTrackingStart called during navigation iteration", new IllegalStateException("onTrackingStart called during navigation iteration"));
            }

            arc.this.W.add($$2);
         }

         if ($$0 instanceof cjt $$4) {
            for (cjq $$5 : $$4.x()) {
               arc.this.ad.put($$5.ar(), $$5);
            }
         }

         $$0.a(ebo::a);
      }

      public void f(buj $$0) {
         arc.this.m().a($$0);
         if ($$0 instanceof ard $$1) {
            arc.this.I.remove($$1);
            arc.this.f();
         }

         if ($$0 instanceof bvh $$2) {
            if (arc.this.X) {
               String $$3 = "onTrackingStart called during navigation iteration";
               af.a("onTrackingStart called during navigation iteration", new IllegalStateException("onTrackingStart called during navigation iteration"));
            }

            arc.this.W.remove($$2);
         }

         if ($$0 instanceof cjt $$4) {
            for (cjq $$5 : $$4.x()) {
               arc.this.ad.remove($$5.ar());
            }
         }

         $$0.a(ebo::b);
      }

      public void g(buj $$0) {
         $$0.a(ebo::c);
      }
   }
}
