import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Lists;
import com.mojang.datafixers.DataFixer;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.LongSet;
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

public class arq extends djh implements arp, dkg {
   public static final iv a = new iv(100, 50, 0);
   public static final btl b = btr.a(12000, 180000);
   public static final btl c = btr.a(12000, 24000);
   private static final btl E = btr.a(12000, 180000);
   public static final btl d = btr.a(3600, 15600);
   private static final Logger F = LogUtils.getLogger();
   private static final int G = 300;
   private static final int H = 65536;
   final List<arr> I = Lists.newArrayList();
   private final arn J;
   private final MinecraftServer K;
   private final ezh L;
   private int M;
   final eez N = new eez();
   private final efe<bwi> O;
   private final efp P;
   public boolean e;
   private final avt Q;
   private int R;
   private final ext S;
   private final fgm<dmm> T = new fgm<>(this::d);
   private final fgm<ewu> U = new fgm<>(this::d);
   private final exn V = new exn();
   final Set<bxl> W = new ObjectOpenHashSet();
   volatile boolean X;
   protected final ctb f;
   private final ObjectLinkedOpenHashSet<dim> Y = new ObjectLinkedOpenHashSet();
   private final List<dim> Z = new ArrayList<>(64);
   private boolean aa;
   private final List<diu> ab;
   @Nullable
   private eeo ac;
   final Int2ObjectMap<cme> ad = new Int2ObjectOpenHashMap();
   private final dkd ae;
   private final erj af;
   private final boolean ag;
   private final bul ah;

   public arq(
      MinecraftServer $$0,
      Executor $$1,
      ezc.c $$2,
      ezh $$3,
      alf<djh> $$4,
      eem $$5,
      asa $$6,
      boolean $$7,
      long $$8,
      List<diu> $$9,
      boolean $$10,
      @Nullable bul $$11
   ) {
      super($$3, $$4, $$0.ba(), $$5.a(), false, $$7, $$8, $$0.bj());
      this.ag = $$10;
      this.K = $$0;
      this.ab = $$9;
      this.L = $$3;
      ecm $$12 = $$5.b();
      boolean $$13 = $$0.aX();
      DataFixer $$14 = $$0.aC();
      eew<bwi> $$15 = new edw(new eeh(new eee($$2.f(), $$4, "entities"), $$2.a($$4).resolve("entities"), $$14, $$13, bbb.s), this, $$0);
      this.O = new efe<>(bwi.class, new arq.a(), $$15);
      this.J = new arn(this, $$2, $$14, $$0.aY(), $$1, $$12, $$0.ag().p(), $$0.ag().q(), $$13, $$6, this.O::a, () -> $$0.J().w());
      this.J.h().b();
      this.S = new ext(this);
      this.Z();
      this.ac();
      this.A_().a($$0.aw());
      this.f = this.w().a(ctb.a(this.ai()));
      if (!$$0.U()) {
         $$3.a($$0.u());
      }

      long $$16 = $$0.aZ().y().c();
      this.af = new erj(this.J.n(), this.F_(), $$0.aY(), $$4, $$12, this.J.i(), this, $$12.d(), $$16, $$14);
      this.ae = new dkd(this, $$0.aZ().y(), this.af);
      if (this.aj() == djh.k && this.ai().a(eej.c)) {
         this.ac = new eeo(this, $$16, $$0.aZ().C());
      } else {
         this.ac = null;
      }

      this.Q = new avt();
      this.P = new efp(this);
      this.ah = Objects.requireNonNullElseGet($$11, () -> this.w().a(bul.a));
   }

   @Deprecated
   @VisibleForTesting
   public void a(@Nullable eeo $$0) {
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
   public jf<dkk> a(int $$0, int $$1, int $$2) {
      return this.m().g().d().getNoiseBiome($$0, $$1, $$2, this.m().i().b());
   }

   public dkd b() {
      return this.ae;
   }

   public void a(BooleanSupplier $$0) {
      bqq $$1 = bqp.a();
      this.aa = true;
      bup $$2 = this.u();
      boolean $$3 = $$2.i();
      if ($$3) {
         $$1.a("world border");
         this.A_().s();
         $$1.b("weather");
         this.aw();
         $$1.c();
      }

      int $$4 = this.O().d(djd.R);
      if (this.Q.a($$4) && this.Q.a($$4, this.I)) {
         if (this.O().c(djd.m)) {
            long $$5 = this.B.d() + 24000L;
            this.b($$5 - $$5 % 24000L);
         }

         this.au();
         if (this.O().c(djd.x) && this.ah()) {
            this.h();
         }
      }

      this.Z();
      if ($$3) {
         this.c();
      }

      $$1.a("tickPending");
      if (!this.ak() && $$3) {
         long $$6 = this.ae();
         $$1.a("blockTicks");
         this.T.a($$6, 65536, this::c);
         $$1.b("fluidTicks");
         this.U.a($$6, 65536, this::a);
         $$1.c();
      }

      $$1.b("raid");
      if ($$3) {
         this.f.a(this);
      }

      $$1.b("chunkSource");
      this.m().a($$0, true);
      $$1.b("blockEvents");
      if ($$3) {
         this.ax();
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
            if (!$$2x.dP()) {
               if (!$$2.a($$2x)) {
                  $$1.a("checkDespawn");
                  $$2x.dG();
                  $$1.c();
                  if ($$2x instanceof arr || this.J.a.j().c($$2x.dw().a())) {
                     bwi $$3x = $$2x.dj();
                     if ($$3x != null) {
                        if (!$$3x.dP() && $$3x.y($$2x)) {
                           return;
                        }

                        $$2x.bN();
                     }

                     $$1.a("tick");
                     this.a(this::a, $$2x);
                     $$1.c();
                  }
               }
            }
         });
         $$1.c();
         this.Y();
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
         bqp.a().a("scheduledFunctions");
         this.L.s().a(this.K, $$0);
         bqp.a().c();
         if (this.L.o().c(djd.m)) {
            this.b(this.B.d() + 1L);
         }
      }
   }

   public void b(long $$0) {
      this.L.b($$0);
   }

   public void a(boolean $$0, boolean $$1) {
      for (diu $$2 : this.ab) {
         $$2.a(this, $$0, $$1);
      }
   }

   private void au() {
      this.Q.a();
      this.I.stream().filter(bxj::fQ).collect(Collectors.toList()).forEach($$0 -> $$0.a(false, false));
   }

   public void a(ecv $$0, int $$1) {
      dio $$2 = $$0.f();
      int $$3 = $$2.d();
      int $$4 = $$2.e();
      bqq $$5 = bqp.a();
      $$5.a("iceandsnow");

      for (int $$6 = 0; $$6 < $$1; $$6++) {
         if (this.A.a(48) == 0) {
            this.a(this.a($$3, 0, $$4, 15));
         }
      }

      $$5.b("tickBlocks");
      if ($$1 > 0) {
         ecw[] $$7 = $$0.d();

         for (int $$8 = 0; $$8 < $$7.length; $$8++) {
            ecw $$9 = $$7[$$8];
            if ($$9.d()) {
               int $$10 = $$0.h($$8);
               int $$11 = jy.c($$10);

               for (int $$12 = 0; $$12 < $$1; $$12++) {
                  iv $$13 = this.a($$3, $$11, $$4, 15);
                  $$5.a("randomTick");
                  eao $$14 = $$9.a($$13.u() - $$3, $$13.v() - $$11, $$13.w() - $$4);
                  if ($$14.z()) {
                     $$14.b(this, $$13, this.A);
                  }

                  ewv $$15 = $$14.y();
                  if ($$15.f()) {
                     $$15.a(this, $$13, this.A);
                  }

                  $$5.c();
               }
            }
         }
      }

      $$5.c();
   }

   public void a(ecv $$0) {
      dio $$1 = $$0.f();
      boolean $$2 = this.ah();
      int $$3 = $$1.d();
      int $$4 = $$1.e();
      bqq $$5 = bqp.a();
      $$5.a("thunder");
      if ($$2 && this.ag() && this.A.a(100000) == 0) {
         iv $$6 = this.b(this.a($$3, 0, $$4, 15));
         if (this.r($$6)) {
            bue $$7 = this.d_($$6);
            boolean $$8 = this.O().c(djd.f) && this.A.j() < (double)$$7.b() * 0.01 && !this.a_($$6.e()).a(dmo.ta);
            if ($$8) {
               clr $$9 = bwr.bg.a(this, bwq.h);
               if ($$9 != null) {
                  $$9.w(true);
                  $$9.c_(0);
                  $$9.a_((double)$$6.u(), (double)$$6.v(), (double)$$6.w());
                  this.b($$9);
               }
            }

            bxi $$10 = bwr.aw.a(this, bwq.h);
            if ($$10 != null) {
               $$10.f(fex.c($$6));
               $$10.a($$8);
               this.b($$10);
            }
         }
      }

      $$5.c();
   }

   @VisibleForTesting
   public void a(iv $$0) {
      iv $$1 = this.a(egn.a.e, $$0);
      iv $$2 = $$1.e();
      dkk $$3 = this.u($$1).a();
      if ($$3.a(this, $$2)) {
         this.b($$2, dmo.ee.m());
      }

      if (this.ah()) {
         int $$4 = this.O().d(djd.V);
         if ($$4 > 0 && $$3.b(this, $$1)) {
            eao $$5 = this.a_($$1);
            if ($$5.a(dmo.ed)) {
               int $$6 = $$5.c(duf.c);
               if ($$6 < Math.min($$4, 8)) {
                  eao $$7 = $$5.b(duf.c, Integer.valueOf($$6 + 1));
                  dmm.a($$5, $$7, this, $$1);
                  this.b($$1, $$7);
               }
            } else {
               this.b($$1, dmo.ed.m());
            }
         }

         dkk.c $$8 = $$3.a($$2, this.P());
         if ($$8 != dkk.c.a) {
            eao $$9 = this.a_($$2);
            $$9.b().a($$9, this, $$2, $$8);
         }
      }
   }

   private Optional<iv> F(iv $$0) {
      Optional<iv> $$1 = this.A().e($$0x -> $$0x.a(cip.t), $$0x -> $$0x.v() == this.a(egn.a.b, $$0x.u(), $$0x.w()) - 1, $$0, 128, cil.b.c);
      return $$1.map($$0x -> $$0x.b(1));
   }

   protected iv b(iv $$0) {
      iv $$1 = this.a(egn.a.e, $$0);
      Optional<iv> $$2 = this.F($$1);
      if ($$2.isPresent()) {
         return $$2.get();
      } else {
         fes $$3 = fes.a($$1, $$1.h(this.ao() + 1)).g(3.0);
         List<bxj> $$4 = this.a(bxj.class, $$3, $$0x -> $$0x != null && $$0x.bI() && this.h($$0x.du()));
         if (!$$4.isEmpty()) {
            return $$4.get(this.A.a($$4.size())).du();
         } else {
            if ($$1.v() == this.G_() - 1) {
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
      return this.O().d(djd.R) <= 100;
   }

   private void av() {
      if (this.e()) {
         if (!this.p().U() || this.p().r()) {
            int $$0 = this.O().d(djd.R);
            wy $$1;
            if (this.Q.a($$0)) {
               $$1 = wy.c("sleep.skipping_night");
            } else {
               $$1 = wy.a("sleep.players_sleeping", this.Q.b(), this.Q.b($$0));
            }

            for (arr $$3 : this.I) {
               $$3.a($$1, true);
            }
         }
      }
   }

   public void f() {
      if (!this.I.isEmpty() && this.Q.a(this.I)) {
         this.av();
      }
   }

   public alz g() {
      return this.K.aJ();
   }

   private void aw() {
      boolean $$0 = this.ah();
      if (this.B_().g()) {
         if (this.O().c(djd.x)) {
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

         this.z = azm.a(this.z, 0.0F, 1.0F);
         this.w = this.x;
         if (this.B.i()) {
            this.x += 0.01F;
         } else {
            this.x -= 0.01F;
         }

         this.x = azm.a(this.x, 0.0F, 1.0F);
      }

      if (this.w != this.x) {
         this.K.ag().a(new adb(adb.i, this.x), this.aj());
      }

      if (this.y != this.z) {
         this.K.ag().a(new adb(adb.j, this.z), this.aj());
      }

      if ($$0 != this.ah()) {
         if ($$0) {
            this.K.ag().a(new adb(adb.d, 0.0F));
         } else {
            this.K.ag().a(new adb(adb.c, 0.0F));
         }

         this.K.ag().a(new adb(adb.i, this.x));
         this.K.ag().a(new adb(adb.j, this.z));
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

   private void a(iv $$0, ewu $$1) {
      eao $$2 = this.a_($$0);
      ewv $$3 = $$2.y();
      if ($$3.b($$1)) {
         $$3.a(this, $$0, $$2);
      }
   }

   private void c(iv $$0, dmm $$1) {
      eao $$2 = this.a_($$0);
      if ($$2.a($$1)) {
         $$2.a(this, $$0, this.A);
      }
   }

   public void a(bwi $$0) {
      $$0.bw();
      bqq $$1 = bqp.a();
      $$0.af++;
      $$1.a(() -> mg.f.b($$0.an()).toString());
      $$1.f("tickNonPassenger");
      $$0.h();
      $$1.c();

      for (bwi $$2 : $$0.cX()) {
         this.a($$0, $$2);
      }
   }

   private void a(bwi $$0, bwi $$1) {
      if ($$1.dP() || $$1.dj() != $$0) {
         $$1.bN();
      } else if ($$1 instanceof crj || this.N.c($$1)) {
         $$1.bw();
         $$1.af++;
         bqq $$2 = bqp.a();
         $$2.a(() -> mg.f.b($$1.an()).toString());
         $$2.f("tickPassenger");
         $$1.r();
         $$2.c();

         for (bwi $$3 : $$1.cX()) {
            this.a($$1, $$3);
         }
      }
   }

   @Override
   public boolean a(bwi $$0, iv $$1) {
      if ($$0 instanceof crj $$2 && (this.K.a(this, $$1, $$2) || !this.A_().a($$1))) {
         return false;
      }

      return true;
   }

   public void a(@Nullable azu $$0, boolean $$1, boolean $$2) {
      arn $$3 = this.m();
      if (!$$2) {
         if ($$0 != null) {
            $$0.a(wy.c("menu.savingLevel"));
         }

         this.b($$1);
         if ($$0 != null) {
            $$0.c(wy.c("menu.savingChunks"));
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

      eyw $$1 = this.m().l();
      if ($$0) {
         $$1.b();
      } else {
         $$1.a();
      }
   }

   public <T extends bwi> List<? extends T> a(efa<bwi, T> $$0, Predicate<? super T> $$1) {
      List<T> $$2 = Lists.newArrayList();
      this.a($$0, $$1, $$2);
      return $$2;
   }

   public <T extends bwi> void a(efa<bwi, T> $$0, Predicate<? super T> $$1, List<? super T> $$2) {
      this.a($$0, $$1, $$2, Integer.MAX_VALUE);
   }

   public <T extends bwi> void a(efa<bwi, T> $$0, Predicate<? super T> $$1, List<? super T> $$2, int $$3) {
      this.H().a($$0, $$3x -> {
         if ($$1.test((T)$$3x)) {
            $$2.add((T)$$3x);
            if ($$2.size() >= $$3) {
               return axx.a.b;
            }
         }

         return axx.a.a;
      });
   }

   public List<? extends cmh> j() {
      return this.a(bwr.P, bxj::bI);
   }

   public List<arr> a(Predicate<? super arr> $$0) {
      return this.a($$0, Integer.MAX_VALUE);
   }

   public List<arr> a(Predicate<? super arr> $$0, int $$1) {
      List<arr> $$2 = Lists.newArrayList();

      for (arr $$3 : this.I) {
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
   public arr k() {
      List<arr> $$0 = this.a(bxj::bI);
      return $$0.isEmpty() ? null : $$0.get(this.A.a($$0.size()));
   }

   @Override
   public boolean b(bwi $$0) {
      return this.i($$0);
   }

   public boolean c(bwi $$0) {
      return this.i($$0);
   }

   public void d(bwi $$0) {
      if ($$0 instanceof arr $$1) {
         this.c($$1);
      } else {
         this.i($$0);
      }
   }

   public void a(arr $$0) {
      this.c($$0);
   }

   public void b(arr $$0) {
      this.c($$0);
   }

   private void c(arr $$0) {
      bwi $$1 = this.b($$0.cF());
      if ($$1 != null) {
         F.warn("Force-added player with duplicate UUID {}", $$0.cF());
         $$1.al();
         this.a((arr)$$1, bwi.d.b);
      }

      this.O.a($$0);
   }

   private boolean i(bwi $$0) {
      if ($$0.dP()) {
         F.warn("Tried to add entity {} but it was marked as removed already", bwr.a($$0.an()));
         return false;
      } else {
         return this.O.a($$0);
      }
   }

   public boolean e(bwi $$0) {
      if ($$0.cZ().map(bwi::cF).anyMatch(this.O::a)) {
         return false;
      } else {
         this.a_($$0);
         return true;
      }
   }

   public void b(ecv $$0) {
      $$0.J();
      $$0.c(this);
   }

   public void a(arr $$0, bwi.d $$1) {
      $$0.a($$1);
   }

   @Override
   public void a(int $$0, iv $$1, int $$2) {
      for (arr $$3 : this.K.ag().t()) {
         if ($$3 != null && $$3.dU() == this && $$3.ao() != $$0) {
            double $$4 = (double)$$1.u() - $$3.dz();
            double $$5 = (double)$$1.v() - $$3.dB();
            double $$6 = (double)$$1.w() - $$3.dF();
            if ($$4 * $$4 + $$5 * $$5 + $$6 * $$6 < 1024.0) {
               $$3.f.b(new abz($$0, $$1, $$2));
            }
         }
      }
   }

   @Override
   public void a(@Nullable bwi $$0, double $$1, double $$2, double $$3, jf<awm> $$4, awo $$5, float $$6, float $$7, long $$8) {
      this.K.ag().a($$0 instanceof crj $$9 ? $$9 : null, $$1, $$2, $$3, (double)$$4.a().a($$6), this.aj(), new afv($$4, $$5, $$1, $$2, $$3, $$6, $$7, $$8));
   }

   @Override
   public void a(@Nullable bwi $$0, bwi $$1, jf<awm> $$2, awo $$3, float $$4, float $$5, long $$6) {
      this.K
         .ag()
         .a($$0 instanceof crj $$7 ? $$7 : null, $$1.dz(), $$1.dB(), $$1.dF(), (double)$$2.a().a($$4), this.aj(), new afu($$2, $$3, $$1, $$4, $$5, $$6));
   }

   @Override
   public void b(int $$0, iv $$1, int $$2) {
      if (this.O().c(djd.Y)) {
         this.K.ag().t().forEach($$3 -> {
            fex $$5;
            if ($$3.dU() == this) {
               fex $$4 = fex.b($$1);
               if ($$3.g($$4) < (double)azm.h(32)) {
                  $$5 = $$4;
               } else {
                  fex $$6 = $$4.d($$3.ds()).d();
                  $$5 = $$3.ds().e($$6.c(32.0));
               }
            } else {
               $$5 = $$3.ds();
            }

            $$3.f.b(new adh($$0, iv.a((jp)$$5), $$2, true));
         });
      } else {
         this.a(null, $$0, $$1, $$2);
      }
   }

   @Override
   public void a(@Nullable bwi $$0, int $$1, iv $$2, int $$3) {
      this.K.ag().a($$0 instanceof crj $$4 ? $$4 : null, (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), 64.0, this.aj(), new adh($$1, $$2, $$3, false));
   }

   public int l() {
      return this.B_().p();
   }

   @Override
   public void a(jf<efo> $$0, fex $$1, efo.a $$2) {
      this.P.a($$0, $$1, $$2);
   }

   @Override
   public void a(iv $$0, eao $$1, eao $$2, int $$3) {
      if (this.X) {
         String $$4 = "recursive call to sendBlockUpdated";
         ag.a("recursive call to sendBlockUpdated", new IllegalStateException("recursive call to sendBlockUpdated"));
      }

      this.m().a($$0);
      this.V.a($$0);
      ffr $$5 = $$1.g(this, $$0);
      ffr $$6 = $$2.g(this, $$0);
      if (ffo.c($$5, $$6, ffb.g)) {
         List<cgt> $$7 = new ObjectArrayList();

         for (bxl $$8 : this.W) {
            cgt $$9 = $$8.O();
            if ($$9.b($$0)) {
               $$7.add($$9);
            }
         }

         try {
            this.X = true;

            for (cgt $$10 : $$7) {
               $$10.h();
            }
         } finally {
            this.X = false;
         }
      }
   }

   @Override
   public void a(iv $$0, dmm $$1) {
      this.a($$0, $$1, exz.a(this, null, null));
   }

   @Override
   public void a(iv $$0, dmm $$1, @Nullable eyd $$2) {
      this.t.a($$0, $$1, null, $$2);
   }

   @Override
   public void a(iv $$0, dmm $$1, jb $$2, @Nullable eyd $$3) {
      this.t.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void b(iv $$0, dmm $$1, @Nullable eyd $$2) {
      this.t.a($$0, $$1, $$2);
   }

   @Override
   public void a(eao $$0, iv $$1, dmm $$2, @Nullable eyd $$3, boolean $$4) {
      this.t.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public void a(bwi $$0, byte $$1) {
      this.m().a($$0, new acx($$0, $$1));
   }

   @Override
   public void a(bwi $$0, bux $$1) {
      this.m().a($$0, new act($$0, $$1));
   }

   public arn m() {
      return this.J;
   }

   @Override
   public void a(
      @Nullable bwi $$0,
      @Nullable bux $$1,
      @Nullable djb $$2,
      double $$3,
      double $$4,
      double $$5,
      float $$6,
      boolean $$7,
      djh.a $$8,
      lw $$9,
      lw $$10,
      jf<awm> $$11
   ) {
      dja.a $$12 = switch ($$8) {
         case a -> dja.a.a;
         case b -> this.a(djd.S);
         case c -> this.O().c(djd.d) ? this.a(djd.T) : dja.a.a;
         case d -> this.a(djd.U);
         case e -> dja.a.d;
      };
      fex $$13 = new fex($$3, $$4, $$5);
      djx $$14 = new djx(this, $$0, $$1, $$2, $$13, $$6, $$7, $$12);
      $$14.i();
      lw $$15 = $$14.l() ? $$9 : $$10;

      for (arr $$16 : this.I) {
         if ($$16.g($$13) < 4096.0) {
            Optional<fex> $$17 = Optional.ofNullable($$14.j().get($$16));
            $$16.f.b(new acz($$13, $$17, $$15, $$11));
         }
      }
   }

   private dja.a a(djd.e<djd.a> $$0) {
      return this.O().c($$0) ? dja.a.c : dja.a.b;
   }

   @Override
   public void a(iv $$0, dmm $$1, int $$2, int $$3) {
      this.Y.add(new dim($$0, $$1, $$2, $$3));
   }

   private void ax() {
      this.Z.clear();

      while (!this.Y.isEmpty()) {
         dim $$0 = (dim)this.Y.removeFirst();
         if (this.n($$0.a())) {
            if (this.a($$0)) {
               this.K.ag().a(null, (double)$$0.a().u(), (double)$$0.a().v(), (double)$$0.a().w(), 64.0, this.aj(), new acb($$0.a(), $$0.b(), $$0.c(), $$0.d()));
            }
         } else {
            this.Z.add($$0);
         }
      }

      this.Y.addAll(this.Z);
   }

   private boolean a(dim $$0) {
      eao $$1 = this.a_($$0.a());
      return $$1.a($$0.b()) ? $$1.a(this, $$0.a(), $$0.c(), $$0.d()) : false;
   }

   public fgm<dmm> n() {
      return this.T;
   }

   public fgm<ewu> o() {
      return this.U;
   }

   @Nonnull
   @Override
   public MinecraftServer p() {
      return this.K;
   }

   public ext q() {
      return this.S;
   }

   public evl r() {
      return this.K.aY();
   }

   public <T extends lw> int a(T $$0, double $$1, double $$2, double $$3, int $$4, double $$5, double $$6, double $$7, double $$8) {
      return this.a($$0, false, false, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8);
   }

   public <T extends lw> int a(T $$0, boolean $$1, boolean $$2, double $$3, double $$4, double $$5, int $$6, double $$7, double $$8, double $$9, double $$10) {
      adi $$11 = new adi($$0, $$1, $$2, $$3, $$4, $$5, (float)$$7, (float)$$8, (float)$$9, (float)$$10, $$6);
      int $$12 = 0;

      for (int $$13 = 0; $$13 < this.I.size(); $$13++) {
         arr $$14 = this.I.get($$13);
         if (this.a($$14, $$1, $$3, $$4, $$5, $$11)) {
            $$12++;
         }
      }

      return $$12;
   }

   public <T extends lw> boolean a(
      arr $$0, T $$1, boolean $$2, boolean $$3, double $$4, double $$5, double $$6, int $$7, double $$8, double $$9, double $$10, double $$11
   ) {
      zf<?> $$12 = new adi($$1, $$2, $$3, $$4, $$5, $$6, (float)$$8, (float)$$9, (float)$$10, (float)$$11, $$7);
      return this.a($$0, $$2, $$4, $$5, $$6, $$12);
   }

   private boolean a(arr $$0, boolean $$1, double $$2, double $$3, double $$4, zf<?> $$5) {
      if ($$0.dU() != this) {
         return false;
      } else {
         iv $$6 = $$0.du();
         if ($$6.a(new fex($$2, $$3, $$4), $$1 ? 512.0 : 32.0)) {
            $$0.f.b($$5);
            return true;
         } else {
            return false;
         }
      }
   }

   @Nullable
   @Override
   public bwi a(int $$0) {
      return this.H().a($$0);
   }

   @Deprecated
   @Nullable
   public bwi b(int $$0) {
      bwi $$1 = this.H().a($$0);
      return $$1 != null ? $$1 : (bwi)this.ad.get($$0);
   }

   @Override
   public Collection<cme> s() {
      return this.ad.values();
   }

   @Nullable
   public iv a(axr<eri> $$0, iv $$1, int $$2, boolean $$3) {
      if (!this.K.aZ().y().d()) {
         return null;
      } else {
         Optional<jj.c<eri>> $$4 = this.F_().f(mh.be).a($$0);
         if ($$4.isEmpty()) {
            return null;
         } else {
            Pair<iv, jf<eri>> $$5 = this.m().g().a(this, $$4.get(), $$1, $$2, $$3);
            return $$5 != null ? (iv)$$5.getFirst() : null;
         }
      }
   }

   @Nullable
   public Pair<iv, jf<dkk>> a(Predicate<jf<dkk>> $$0, iv $$1, int $$2, int $$3, int $$4) {
      return this.m().g().d().a($$1, $$2, $$3, $$4, $$0, this.m().i().b(), this);
   }

   public dei t() {
      return this.K.aI();
   }

   @Override
   public bup u() {
      return this.K.aP();
   }

   @Override
   public boolean v() {
      return this.e;
   }

   public eyw w() {
      return this.m().l();
   }

   @Nullable
   @Override
   public eyq a(eyo $$0) {
      return this.p().J().w().b(eyq.a($$0));
   }

   @Override
   public void a(eyo $$0, eyq $$1) {
      this.p().J().w().a(eyq.a($$0), $$1);
   }

   @Override
   public eyo x() {
      return this.p().J().w().a(eyp.b).a();
   }

   public void a(iv $$0, float $$1) {
      iv $$2 = this.B.a();
      float $$3 = this.B.b();
      if (!$$2.equals($$0) || $$3 != $$1) {
         this.B.a($$0, $$1);
         this.p().ag().a(new afb($$0, $$1));
      }

      if (this.M > 1) {
         this.m().b(arx.b, new dio($$2), this.M);
      }

      int $$4 = this.O().d(djd.ac) + 1;
      if ($$4 > 1) {
         this.m().a(arx.b, new dio($$0), $$4);
      }

      this.M = $$4;
   }

   public LongSet y() {
      return this.J.k();
   }

   public boolean a(int $$0, int $$1, boolean $$2) {
      boolean $$3 = this.J.a(new dio($$0, $$1), $$2);
      if ($$2 && $$3) {
         this.d($$0, $$1);
      }

      return $$3;
   }

   @Override
   public List<arr> z() {
      return this.I;
   }

   @Override
   public void a(iv $$0, eao $$1, eao $$2) {
      Optional<jf<cio>> $$3 = cip.a($$1);
      Optional<jf<cio>> $$4 = cip.a($$2);
      if (!Objects.equals($$3, $$4)) {
         iv $$5 = $$0.j();
         $$3.ifPresent($$1x -> this.p().execute(() -> {
               this.A().a($$5);
               agm.b(this, $$5);
            }));
         $$4.ifPresent($$1x -> this.p().execute(() -> {
               this.A().a($$5, $$1x);
               agm.a(this, $$5);
            }));
      }
   }

   public cil A() {
      return this.m().m();
   }

   public boolean c(iv $$0) {
      return this.a($$0, 1);
   }

   public boolean a(jy $$0) {
      return this.c($$0.k());
   }

   public boolean a(iv $$0, int $$1) {
      return $$1 > 6 ? false : this.b(jy.a($$0)) <= $$1;
   }

   public int b(jy $$0) {
      return this.A().a($$0);
   }

   public ctb B() {
      return this.f;
   }

   @Nullable
   public csz d(iv $$0) {
      return this.f.a($$0, 9216);
   }

   public boolean e(iv $$0) {
      return this.d($$0) != null;
   }

   public void a(cii $$0, bwi $$1, bxy $$2) {
      $$2.a($$0, $$1);
   }

   public void a(Path $$0) throws IOException {
      aqu $$1 = this.m().a;

      try (Writer $$2 = Files.newBufferedWriter($$0.resolve("stats.txt"))) {
         $$2.write(String.format(Locale.ROOT, "spawning_chunks: %d\n", $$1.j().a()));
         djs.d $$3 = this.m().o();
         if ($$3 != null) {
            ObjectIterator $$9 = $$3.b().object2IntEntrySet().iterator();

            while ($$9.hasNext()) {
               Entry<bxm> $$4 = (Entry<bxm>)$$9.next();
               $$2.write(String.format(Locale.ROOT, "spawn_count.%s: %d\n", ((bxm)$$4.getKey()).a(), $$4.getIntValue()));
            }
         }

         $$2.write(String.format(Locale.ROOT, "entities: %s\n", this.O.e()));
         $$2.write(String.format(Locale.ROOT, "block_entity_tickers: %d\n", this.s.size()));
         $$2.write(String.format(Locale.ROOT, "block_ticks: %d\n", this.n().a()));
         $$2.write(String.format(Locale.ROOT, "fluid_ticks: %d\n", this.o().a()));
         $$2.write("distance_manager: " + $$1.j().c() + "\n");
         $$2.write(String.format(Locale.ROOT, "pending_tasks: %d\n", this.m().f()));
      }

      p $$5 = new p("Level dump", new Exception("dummy"));
      this.a($$5);

      try (Writer $$6 = Files.newBufferedWriter($$0.resolve("example_crash.txt"))) {
         $$6.write($$5.a(z.c));
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

   private static void a(Writer $$0, Iterable<bwi> $$1) throws IOException {
      ayl $$2 = ayl.a().a("x").a("y").a("z").a("uuid").a("type").a("alive").a("display_name").a("custom_name").a($$0);

      for (bwi $$3 : $$1) {
         wy $$4 = $$3.ak();
         wy $$5 = $$3.m_();
         $$2.a($$3.dz(), $$3.dB(), $$3.dF(), $$3.cF(), mg.f.b($$3.an()), $$3.bI(), $$5.getString(), $$4 != null ? $$4.getString() : null);
      }
   }

   private void a(Writer $$0) throws IOException {
      ayl $$1 = ayl.a().a("x").a("y").a("z").a("type").a($$0);

      for (dzk $$2 : this.s) {
         iv $$3 = $$2.c();
         $$1.a($$3.u(), $$3.v(), $$3.w(), $$2.d());
      }
   }

   @VisibleForTesting
   public void a(era $$0) {
      this.Y.removeIf($$1 -> $$0.b($$1.a()));
   }

   @Override
   public float a(jb $$0, boolean $$1) {
      return 1.0F;
   }

   public Iterable<bwi> C() {
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
   public eeo F() {
      return this.ac;
   }

   @Override
   public arq a() {
      return this;
   }

   @VisibleForTesting
   public String G() {
      return String.format(
         Locale.ROOT,
         "players: %s, entities: %s [%s], block_entities: %d [%s], block_ticks: %d, fluid_ticks: %d, chunk_source: %s",
         this.I.size(),
         this.O.e(),
         a(this.O.d().a(), $$0 -> mg.f.b($$0.an()).toString()),
         this.s.size(),
         a(this.s, dzk::d),
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
   protected efc<bwi> H() {
      return this.O.d();
   }

   public void a(Stream<bwi> $$0) {
      this.O.a($$0);
   }

   public void b(Stream<bwi> $$0) {
      this.O.b($$0);
   }

   public void c(ecv $$0) {
      $$0.d(this.y_().c());
   }

   public void a(ecl $$0) {
      this.K.execute(() -> this.af.a($$0.f(), $$0.g()));
   }

   public exn I() {
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

   public boolean d(long $$0) {
      return this.c($$0) && this.J.a($$0);
   }

   public boolean f(iv $$0) {
      return this.O.a($$0) && this.J.a.j().c(dio.a($$0));
   }

   public boolean a(dio $$0) {
      return this.O.a($$0);
   }

   public boolean g(iv $$0) {
      return this.b(new dio($$0));
   }

   public boolean b(dio $$0) {
      return this.J.a.b($$0);
   }

   public boolean c(dio $$0) {
      return this.O.b($$0) && this.A_().a($$0);
   }

   @Override
   public cut K() {
      return this.K.aZ().K();
   }

   @Override
   public dbf L() {
      return this.K.bn();
   }

   @Override
   public dyl M() {
      return this.K.bo();
   }

   public azv a(alg $$0) {
      return this.ah.a($$0);
   }

   public bul N() {
      return this.ah;
   }

   public djd O() {
      return this.L.o();
   }

   @Override
   public q a(p $$0) {
      q $$1 = super.a($$0);
      $$1.a("Loaded entity count", () -> String.valueOf(this.O.f()));
      return $$1;
   }

   @Override
   public int P() {
      return this.J.g().f();
   }

   final class a implements efb<bwi> {
      public void a(bwi $$0) {
      }

      public void b(bwi $$0) {
         arq.this.g().a($$0);
      }

      public void c(bwi $$0) {
         arq.this.N.a($$0);
      }

      public void d(bwi $$0) {
         arq.this.N.b($$0);
      }

      public void e(bwi $$0) {
         arq.this.m().b($$0);
         if ($$0 instanceof arr $$1) {
            arq.this.I.add($$1);
            arq.this.f();
         }

         if ($$0 instanceof bxl $$2) {
            if (arq.this.X) {
               String $$3 = "onTrackingStart called during navigation iteration";
               ag.a("onTrackingStart called during navigation iteration", new IllegalStateException("onTrackingStart called during navigation iteration"));
            }

            arq.this.W.add($$2);
         }

         if ($$0 instanceof cmh $$4) {
            for (cme $$5 : $$4.q()) {
               arq.this.ad.put($$5.ao(), $$5);
            }
         }

         $$0.a(efl::a);
      }

      public void f(bwi $$0) {
         arq.this.m().a($$0);
         if ($$0 instanceof arr $$1) {
            arq.this.I.remove($$1);
            arq.this.f();
         }

         if ($$0 instanceof bxl $$2) {
            if (arq.this.X) {
               String $$3 = "onTrackingStart called during navigation iteration";
               ag.a("onTrackingStart called during navigation iteration", new IllegalStateException("onTrackingStart called during navigation iteration"));
            }

            arq.this.W.remove($$2);
         }

         if ($$0 instanceof cmh $$4) {
            for (cme $$5 : $$4.q()) {
               arq.this.ad.remove($$5.ao());
            }
         }

         $$0.a(efl::b);
      }

      public void g(bwi $$0) {
         $$0.a(efl::c);
      }
   }
}
