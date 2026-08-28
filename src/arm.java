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

public class arm extends dev implements dfs {
   public static final jg a = new jg(100, 50, 0);
   public static final brd b = brj.a(12000, 180000);
   public static final brd c = brj.a(12000, 24000);
   private static final brd E = brj.a(12000, 180000);
   public static final brd d = brj.a(3600, 15600);
   private static final Logger F = LogUtils.getLogger();
   private static final int G = 300;
   private static final int H = 65536;
   final List<arn> I = Lists.newArrayList();
   private final ark J;
   private final MinecraftServer K;
   private final etp L;
   private int M;
   final dzn N = new dzn();
   private final dzs<btz> O;
   private final eab P;
   public boolean e;
   private final avq Q;
   private int R;
   private final esd S;
   private final faw<dhy> T = new faw<>(this::d, this.ai());
   private final faw<erd> U = new faw<>(this::d, this.ai());
   private final erw V = new erw();
   final Set<bux> W = new ObjectOpenHashSet();
   volatile boolean X;
   protected final cpx f;
   private final ObjectLinkedOpenHashSet<ddz> Y = new ObjectLinkedOpenHashSet();
   private final List<ddz> Z = new ArrayList<>(64);
   private boolean aa;
   private final List<deh> ab;
   @Nullable
   private dzc ac;
   final Int2ObjectMap<cjg> ad = new Int2ObjectOpenHashMap();
   private final dfq ae;
   private final els af;
   private final boolean ag;
   private final bsd ah;

   public arm(
      MinecraftServer $$0,
      Executor $$1,
      etk.c $$2,
      etp $$3,
      alg<dev> $$4,
      dza $$5,
      arw $$6,
      boolean $$7,
      long $$8,
      List<deh> $$9,
      boolean $$10,
      @Nullable bsd $$11
   ) {
      super($$3, $$4, $$0.bb(), $$5.a(), $$0::aS, false, $$7, $$8, $$0.bk());
      this.ag = $$10;
      this.K = $$0;
      this.ab = $$9;
      this.L = $$3;
      dxa $$12 = $$5.b();
      boolean $$13 = $$0.aY();
      DataFixer $$14 = $$0.aC();
      dzk<btz> $$15 = new dyk(new dyv(new dys($$2.f(), $$4, "entities"), $$2.a($$4).resolve("entities"), $$14, $$13, bas.s), this, $$0);
      this.O = new dzs<>(btz.class, new arm.a(), $$15);
      this.J = new ark(this, $$2, $$14, $$0.aZ(), $$1, $$12, $$0.ag().p(), $$0.ag().q(), $$13, $$6, this.O::a, () -> $$0.J().u());
      this.J.h().b();
      this.S = new esd(this);
      this.V();
      this.Y();
      this.C_().a($$0.aw());
      this.f = this.u().a(cpx.a(this), cpx.a(this.af()));
      if (!$$0.U()) {
         $$3.a($$0.u_());
      }

      long $$16 = $$0.ba().y().b();
      this.af = new els(this.J.m(), this.H_(), $$0.aZ(), $$4, $$12, this.J.i(), this, $$12.d(), $$16, $$14);
      this.ae = new dfq(this, $$0.ba().y(), this.af);
      if (this.ag() == dev.k && this.af().a(dyx.c)) {
         this.ac = new dzc(this, $$16, $$0.ba().C());
      } else {
         this.ac = null;
      }

      this.Q = new avq();
      this.P = new eab(this);
      this.ah = Objects.requireNonNullElseGet($$11, () -> this.u().a(bsd.a($$16), "random_sequences"));
   }

   @Deprecated
   @VisibleForTesting
   public void a(@Nullable dzc $$0) {
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
   public jp<dfw> a(int $$0, int $$1, int $$2) {
      return this.l().g().d().getNoiseBiome($$0, $$1, $$2, this.l().i().b());
   }

   public dfq a() {
      return this.ae;
   }

   public void a(BooleanSupplier $$0) {
      bok $$1 = this.ah();
      this.aa = true;
      bsh $$2 = this.s();
      boolean $$3 = $$2.i();
      if ($$3) {
         $$1.a("world border");
         this.C_().s();
         $$1.b("weather");
         this.av();
         $$1.c();
      }

      int $$4 = this.ac().c(der.P);
      if (this.Q.a($$4) && this.Q.a($$4, this.I)) {
         if (this.ac().b(der.l)) {
            long $$5 = this.B.d() + 24000L;
            this.b($$5 - $$5 % 24000L);
         }

         this.at();
         if (this.ac().b(der.v) && this.ae()) {
            this.g();
         }
      }

      this.V();
      if ($$3) {
         this.b();
      }

      $$1.a("tickPending");
      if (!this.aj() && $$3) {
         long $$6 = this.aa();
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
      this.l().a($$0, true);
      $$1.b("blockEvents");
      if ($$3) {
         this.aw();
      }

      this.aa = false;
      $$1.c();
      boolean $$7 = !this.I.isEmpty() || !this.w().isEmpty();
      if ($$7) {
         this.h();
      }

      if ($$7 || this.R++ < 300) {
         $$1.a("entities");
         if (this.ac != null && $$3) {
            $$1.a("dragonFight");
            this.ac.c();
            $$1.c();
         }

         this.N.a($$2x -> {
            if (!$$2x.dS()) {
               if (!$$2.a($$2x)) {
                  $$1.a("checkDespawn");
                  $$2x.dJ();
                  $$1.c();
                  if ($$2x instanceof arn || this.J.a.j().c($$2x.dz().a())) {
                     btz $$3x = $$2x.dl();
                     if ($$3x != null) {
                        if (!$$3x.dS() && $$3x.y($$2x)) {
                           return;
                        }

                        $$2x.af();
                     }

                     $$1.a("tick");
                     this.a(this::a, $$2x);
                     $$1.c();
                  }
               }
            }
         });
         $$1.c();
         this.U();
      }

      $$1.a("entityManagement");
      this.O.a();
      $$1.c();
   }

   @Override
   public boolean a(long $$0) {
      return this.J.a.j().d($$0);
   }

   protected void b() {
      if (this.ag) {
         long $$0 = this.B.c() + 1L;
         this.L.a($$0);
         this.ah().a("scheduledFunctions");
         this.L.s().a(this.K, $$0);
         this.ah().c();
         if (this.B.o().b(der.l)) {
            this.b(this.B.d() + 1L);
         }
      }
   }

   public void b(long $$0) {
      this.L.b($$0);
   }

   public void a(boolean $$0, boolean $$1) {
      for (deh $$2 : this.ab) {
         $$2.a(this, $$0, $$1);
      }
   }

   private void at() {
      this.Q.a();
      this.I.stream().filter(buv::fT).collect(Collectors.toList()).forEach($$0 -> $$0.a(false, false));
   }

   public void a(dxj $$0, int $$1) {
      deb $$2 = $$0.f();
      boolean $$3 = this.ae();
      int $$4 = $$2.d();
      int $$5 = $$2.e();
      bok $$6 = this.ah();
      $$6.a("thunder");
      if ($$3 && this.ad() && this.A.a(100000) == 0) {
         jg $$7 = this.b(this.a($$4, 0, $$5, 15));
         if (this.r($$7)) {
            brw $$8 = this.d_($$7);
            boolean $$9 = this.ac().b(der.e) && this.A.j() < (double)$$8.b() * 0.01 && !this.a_($$7.e()).a(dia.ss);
            if ($$9) {
               ciw $$10 = bug.aO.a(this, buf.h);
               if ($$10 != null) {
                  $$10.x(true);
                  $$10.c_(0);
                  $$10.a_((double)$$7.u(), (double)$$7.v(), (double)$$7.w());
                  this.b($$10);
               }
            }

            buu $$11 = bug.am.a(this, buf.h);
            if ($$11 != null) {
               $$11.e(ezh.c($$7));
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
         dxk[] $$13 = $$0.d();

         for (int $$14 = 0; $$14 < $$13.length; $$14++) {
            dxk $$15 = $$13[$$14];
            if ($$15.d()) {
               int $$16 = $$0.h($$14);
               int $$17 = ki.c($$16);

               for (int $$18 = 0; $$18 < $$1; $$18++) {
                  jg $$19 = this.a($$4, $$17, $$5, 15);
                  $$6.a("randomTick");
                  dvd $$20 = $$15.a($$19.u() - $$4, $$19.v() - $$17, $$19.w() - $$5);
                  if ($$20.z()) {
                     $$20.b(this, $$19, this.A);
                  }

                  ere $$21 = $$20.y();
                  if ($$21.f()) {
                     $$21.b(this, $$19, this.A);
                  }

                  $$6.c();
               }
            }
         }
      }

      $$6.c();
   }

   @VisibleForTesting
   public void a(jg $$0) {
      jg $$1 = this.a(eaz.a.e, $$0);
      jg $$2 = $$1.e();
      dfw $$3 = this.t($$1).a();
      if ($$3.a(this, $$2)) {
         this.b($$2, dia.dO.m());
      }

      if (this.ae()) {
         int $$4 = this.ac().c(der.T);
         if ($$4 > 0 && $$3.b(this, $$1)) {
            dvd $$5 = this.a_($$1);
            if ($$5.a(dia.dN)) {
               int $$6 = $$5.c(dph.c);
               if ($$6 < Math.min($$4, 8)) {
                  dvd $$7 = $$5.b(dph.c, Integer.valueOf($$6 + 1));
                  dhy.a($$5, $$7, this, $$1);
                  this.b($$1, $$7);
               }
            } else {
               this.b($$1, dia.dN.m());
            }
         }

         dfw.c $$8 = $$3.a($$2, this.N());
         if ($$8 != dfw.c.a) {
            dvd $$9 = this.a_($$2);
            $$9.b().a($$9, this, $$2, $$8);
         }
      }
   }

   private Optional<jg> E(jg $$0) {
      Optional<jg> $$1 = this.y().e($$0x -> $$0x.a(cgd.t), $$0x -> $$0x.v() == this.a(eaz.a.b, $$0x.u(), $$0x.w()) - 1, $$0, 128, cfz.b.c);
      return $$1.map($$0x -> $$0x.b(1));
   }

   protected jg b(jg $$0) {
      jg $$1 = this.a(eaz.a.e, $$0);
      Optional<jg> $$2 = this.E($$1);
      if ($$2.isPresent()) {
         return $$2.get();
      } else {
         ezc $$3 = ezc.a($$1, $$1.h(this.an() + 1)).g(3.0);
         List<buv> $$4 = this.a(buv.class, $$3, $$0x -> $$0x != null && $$0x.bM() && this.h($$0x.dx()));
         if (!$$4.isEmpty()) {
            return $$4.get(this.A.a($$4.size())).dx();
         } else {
            if ($$1.v() == this.I_() - 1) {
               $$1 = $$1.b(2);
            }

            return $$1;
         }
      }
   }

   public boolean c() {
      return this.aa;
   }

   public boolean d() {
      return this.ac().c(der.P) <= 100;
   }

   private void au() {
      if (this.d()) {
         if (!this.o().U() || this.o().r()) {
            int $$0 = this.ac().c(der.P);
            xh $$1;
            if (this.Q.a($$0)) {
               $$1 = xh.c("sleep.skipping_night");
            } else {
               $$1 = xh.a("sleep.players_sleeping", this.Q.b(), this.Q.b($$0));
            }

            for (arn $$3 : this.I) {
               $$3.a($$1, true);
            }
         }
      }
   }

   public void e() {
      if (!this.I.isEmpty() && this.Q.a(this.I)) {
         this.au();
      }
   }

   public ama f() {
      return this.K.aJ();
   }

   private void av() {
      boolean $$0 = this.ae();
      if (this.D_().g()) {
         if (this.ac().b(der.v)) {
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

         this.z = azj.a(this.z, 0.0F, 1.0F);
         this.w = this.x;
         if (this.B.i()) {
            this.x += 0.01F;
         } else {
            this.x -= 0.01F;
         }

         this.x = azj.a(this.x, 0.0F, 1.0F);
      }

      if (this.w != this.x) {
         this.K.ag().a(new adk(adk.i, this.x), this.ag());
      }

      if (this.y != this.z) {
         this.K.ag().a(new adk(adk.j, this.z), this.ag());
      }

      if ($$0 != this.ae()) {
         if ($$0) {
            this.K.ag().a(new adk(adk.d, 0.0F));
         } else {
            this.K.ag().a(new adk(adk.c, 0.0F));
         }

         this.K.ag().a(new adk(adk.i, this.x));
         this.K.ag().a(new adk(adk.j, this.z));
      }
   }

   @VisibleForTesting
   public void g() {
      this.L.c(0);
      this.L.b(false);
      this.L.b(0);
      this.L.a(false);
   }

   public void h() {
      this.R = 0;
   }

   private void a(jg $$0, erd $$1) {
      dvd $$2 = this.a_($$0);
      ere $$3 = $$2.y();
      if ($$3.b($$1)) {
         $$3.a(this, $$0, $$2);
      }
   }

   private void d(jg $$0, dhy $$1) {
      dvd $$2 = this.a_($$0);
      if ($$2.a($$1)) {
         $$2.a(this, $$0, this.A);
      }
   }

   public void a(btz $$0) {
      $$0.bA();
      bok $$1 = this.ah();
      $$0.ag++;
      this.ah().a(() -> lx.f.b($$0.aq()).toString());
      $$1.d("tickNonPassenger");
      $$0.l();
      this.ah().c();

      for (btz $$2 : $$0.da()) {
         this.a($$0, $$2);
      }
   }

   private void a(btz $$0, btz $$1) {
      if ($$1.dS() || $$1.dl() != $$0) {
         $$1.af();
      } else if ($$1 instanceof coh || this.N.c($$1)) {
         $$1.bA();
         $$1.ag++;
         bok $$2 = this.ah();
         $$2.a(() -> lx.f.b($$1.aq()).toString());
         $$2.d("tickPassenger");
         $$1.u();
         $$2.c();

         for (btz $$3 : $$1.da()) {
            this.a($$1, $$3);
         }
      }
   }

   @Override
   public boolean a(coh $$0, jg $$1) {
      return !this.K.a(this, $$1, $$0) && this.C_().a($$1);
   }

   public void a(@Nullable azq $$0, boolean $$1, boolean $$2) {
      ark $$3 = this.l();
      if (!$$2) {
         if ($$0 != null) {
            $$0.a(xh.c("menu.savingLevel"));
         }

         this.b($$1);
         if ($$0 != null) {
            $$0.c(xh.c("menu.savingChunks"));
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
         this.K.ba().a(this.ac.b());
      }

      ete $$1 = this.l().k();
      if ($$0) {
         $$1.b();
      } else {
         $$1.a();
      }
   }

   public <T extends btz> List<? extends T> a(dzo<btz, T> $$0, Predicate<? super T> $$1) {
      List<T> $$2 = Lists.newArrayList();
      this.a($$0, $$1, $$2);
      return $$2;
   }

   public <T extends btz> void a(dzo<btz, T> $$0, Predicate<? super T> $$1, List<? super T> $$2) {
      this.a($$0, $$1, $$2, Integer.MAX_VALUE);
   }

   public <T extends btz> void a(dzo<btz, T> $$0, Predicate<? super T> $$1, List<? super T> $$2, int $$3) {
      this.G().a($$0, $$3x -> {
         if ($$1.test((T)$$3x)) {
            $$2.add((T)$$3x);
            if ($$2.size() >= $$3) {
               return axv.a.b;
            }
         }

         return axv.a.a;
      });
   }

   public List<? extends cjj> i() {
      return this.a(bug.F, buv::bM);
   }

   public List<arn> a(Predicate<? super arn> $$0) {
      return this.a($$0, Integer.MAX_VALUE);
   }

   public List<arn> a(Predicate<? super arn> $$0, int $$1) {
      List<arn> $$2 = Lists.newArrayList();

      for (arn $$3 : this.I) {
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
   public arn j() {
      List<arn> $$0 = this.a(buv::bM);
      return $$0.isEmpty() ? null : $$0.get(this.A.a($$0.size()));
   }

   @Override
   public boolean b(btz $$0) {
      return this.i($$0);
   }

   public boolean c(btz $$0) {
      return this.i($$0);
   }

   public void d(btz $$0) {
      if ($$0 instanceof arn $$1) {
         this.c($$1);
      } else {
         this.i($$0);
      }
   }

   public void a(arn $$0) {
      this.c($$0);
   }

   public void b(arn $$0) {
      this.c($$0);
   }

   private void c(arn $$0) {
      btz $$1 = this.G().a($$0.cH());
      if ($$1 != null) {
         F.warn("Force-added player with duplicate UUID {}", $$0.cH());
         $$1.ao();
         this.a((arn)$$1, btz.c.b);
      }

      this.O.a($$0);
   }

   private boolean i(btz $$0) {
      if ($$0.dS()) {
         F.warn("Tried to add entity {} but it was marked as removed already", bug.a($$0.aq()));
         return false;
      } else {
         return this.O.a($$0);
      }
   }

   public boolean e(btz $$0) {
      if ($$0.dc().map(btz::cH).anyMatch(this.O::a)) {
         return false;
      } else {
         this.a_($$0);
         return true;
      }
   }

   public void a(dxj $$0) {
      $$0.H();
      $$0.b(this);
   }

   public void a(arn $$0, btz.c $$1) {
      $$0.a($$1);
   }

   @Override
   public void a(int $$0, jg $$1, int $$2) {
      for (arn $$3 : this.K.ag().t()) {
         if ($$3 != null && $$3.dX() == this && $$3.ar() != $$0) {
            double $$4 = (double)$$1.u() - $$3.dC();
            double $$5 = (double)$$1.v() - $$3.dE();
            double $$6 = (double)$$1.w() - $$3.dI();
            if ($$4 * $$4 + $$5 * $$5 + $$6 * $$6 < 1024.0) {
               $$3.d.b(new acj($$0, $$1, $$2));
            }
         }
      }
   }

   @Override
   public void a(@Nullable coh $$0, double $$1, double $$2, double $$3, jp<awj> $$4, awl $$5, float $$6, float $$7, long $$8) {
      this.K.ag().a($$0, $$1, $$2, $$3, (double)$$4.a().a($$6), this.ag(), new agb($$4, $$5, $$1, $$2, $$3, $$6, $$7, $$8));
   }

   @Override
   public void a(@Nullable coh $$0, btz $$1, jp<awj> $$2, awl $$3, float $$4, float $$5, long $$6) {
      this.K.ag().a($$0, $$1.dC(), $$1.dE(), $$1.dI(), (double)$$2.a().a($$4), this.ag(), new aga($$2, $$3, $$1, $$4, $$5, $$6));
   }

   @Override
   public void b(int $$0, jg $$1, int $$2) {
      if (this.ac().b(der.W)) {
         this.K.ag().a(new adq($$0, $$1, $$2, true));
      } else {
         this.a(null, $$0, $$1, $$2);
      }
   }

   @Override
   public void a(@Nullable coh $$0, int $$1, jg $$2, int $$3) {
      this.K.ag().a($$0, (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), 64.0, this.ag(), new adq($$1, $$2, $$3, false));
   }

   public int k() {
      return this.D_().p();
   }

   @Override
   public void a(jp<eaa> $$0, ezh $$1, eaa.a $$2) {
      this.P.a($$0, $$1, $$2);
   }

   @Override
   public void a(jg $$0, dvd $$1, dvd $$2, int $$3) {
      if (this.X) {
         String $$4 = "recursive call to sendBlockUpdated";
         ad.a("recursive call to sendBlockUpdated", new IllegalStateException("recursive call to sendBlockUpdated"));
      }

      this.l().a($$0);
      this.V.a($$0);
      fab $$5 = $$1.g(this, $$0);
      fab $$6 = $$2.g(this, $$0);
      if (ezy.c($$5, $$6, ezl.g)) {
         List<ceh> $$7 = new ObjectArrayList();

         for (bux $$8 : this.W) {
            ceh $$9 = $$8.P();
            if ($$9.b($$0)) {
               $$7.add($$9);
            }
         }

         try {
            this.X = true;

            for (ceh $$10 : $$7) {
               $$10.j();
            }
         } finally {
            this.X = false;
         }
      }
   }

   @Override
   public void a(jg $$0, dhy $$1) {
      this.a($$0, $$1, esi.a(this, null, null));
   }

   @Override
   public void a(jg $$0, dhy $$1, @Nullable esm $$2) {
      this.t.a($$0, $$1, null, $$2);
   }

   @Override
   public void a(jg $$0, dhy $$1, jl $$2, @Nullable esm $$3) {
      this.t.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void b(jg $$0, dhy $$1, @Nullable esm $$2) {
      this.t.a($$0, $$1, $$2);
   }

   @Override
   public void a(dvd $$0, jg $$1, dhy $$2, @Nullable esm $$3, boolean $$4) {
      this.t.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public void a(btz $$0, byte $$1) {
      this.l().a($$0, new adh($$0, $$1));
   }

   @Override
   public void a(btz $$0, bsp $$1) {
      this.l().a($$0, new add($$0, $$1));
   }

   public ark l() {
      return this.J;
   }

   @Override
   public void a(
      @Nullable btz $$0,
      @Nullable bsp $$1,
      @Nullable deo $$2,
      double $$3,
      double $$4,
      double $$5,
      float $$6,
      boolean $$7,
      dev.a $$8,
      lo $$9,
      lo $$10,
      jp<awj> $$11
   ) {
      den.a $$12 = switch ($$8) {
         case a -> den.a.a;
         case b -> this.a(der.Q);
         case c -> this.ac().b(der.c) ? this.a(der.R) : den.a.a;
         case d -> this.a(der.S);
         case e -> den.a.d;
      };
      ezh $$13 = new ezh($$3, $$4, $$5);
      dfk $$14 = new dfk(this, $$0, $$1, $$2, $$13, $$6, $$7, $$12);
      $$14.h();
      lo $$15 = $$14.j() ? $$9 : $$10;

      for (arn $$16 : this.I) {
         if ($$16.f($$13) < 4096.0) {
            Optional<ezh> $$17 = Optional.ofNullable($$14.i().get($$16));
            $$16.d.b(new adi($$13, $$17, $$15, $$11));
         }
      }
   }

   private den.a a(der.e<der.a> $$0) {
      return this.ac().b($$0) ? den.a.c : den.a.b;
   }

   @Override
   public void a(jg $$0, dhy $$1, int $$2, int $$3) {
      this.Y.add(new ddz($$0, $$1, $$2, $$3));
   }

   private void aw() {
      this.Z.clear();

      while (!this.Y.isEmpty()) {
         ddz $$0 = (ddz)this.Y.removeFirst();
         if (this.n($$0.a())) {
            if (this.a($$0)) {
               this.K.ag().a(null, (double)$$0.a().u(), (double)$$0.a().v(), (double)$$0.a().w(), 64.0, this.ag(), new acl($$0.a(), $$0.b(), $$0.c(), $$0.d()));
            }
         } else {
            this.Z.add($$0);
         }
      }

      this.Y.addAll(this.Z);
   }

   private boolean a(ddz $$0) {
      dvd $$1 = this.a_($$0.a());
      return $$1.a($$0.b()) ? $$1.a(this, $$0.a(), $$0.c(), $$0.d()) : false;
   }

   public faw<dhy> m() {
      return this.T;
   }

   public faw<erd> n() {
      return this.U;
   }

   @Nonnull
   @Override
   public MinecraftServer o() {
      return this.K;
   }

   public esd p() {
      return this.S;
   }

   public epu q() {
      return this.K.aZ();
   }

   public <T extends lo> int a(T $$0, double $$1, double $$2, double $$3, int $$4, double $$5, double $$6, double $$7, double $$8) {
      adr $$9 = new adr($$0, false, $$1, $$2, $$3, (float)$$5, (float)$$6, (float)$$7, (float)$$8, $$4);
      int $$10 = 0;

      for (int $$11 = 0; $$11 < this.I.size(); $$11++) {
         arn $$12 = this.I.get($$11);
         if (this.a($$12, false, $$1, $$2, $$3, $$9)) {
            $$10++;
         }
      }

      return $$10;
   }

   public <T extends lo> boolean a(arn $$0, T $$1, boolean $$2, double $$3, double $$4, double $$5, int $$6, double $$7, double $$8, double $$9, double $$10) {
      zo<?> $$11 = new adr($$1, $$2, $$3, $$4, $$5, (float)$$7, (float)$$8, (float)$$9, (float)$$10, $$6);
      return this.a($$0, $$2, $$3, $$4, $$5, $$11);
   }

   private boolean a(arn $$0, boolean $$1, double $$2, double $$3, double $$4, zo<?> $$5) {
      if ($$0.dX() != this) {
         return false;
      } else {
         jg $$6 = $$0.dx();
         if ($$6.a(new ezh($$2, $$3, $$4), $$1 ? 512.0 : 32.0)) {
            $$0.d.b($$5);
            return true;
         } else {
            return false;
         }
      }
   }

   @Nullable
   @Override
   public btz a(int $$0) {
      return this.G().a($$0);
   }

   @Deprecated
   @Nullable
   public btz b(int $$0) {
      btz $$1 = this.G().a($$0);
      return $$1 != null ? $$1 : (btz)this.ad.get($$0);
   }

   @Nullable
   public btz a(UUID $$0) {
      return this.G().a($$0);
   }

   @Nullable
   public jg a(axp<elr> $$0, jg $$1, int $$2, boolean $$3) {
      if (!this.K.ba().y().c()) {
         return null;
      } else {
         Optional<jt.c<elr>> $$4 = this.H_().e(ly.aS).a($$0);
         if ($$4.isEmpty()) {
            return null;
         } else {
            Pair<jg, jp<elr>> $$5 = this.l().g().a(this, $$4.get(), $$1, $$2, $$3);
            return $$5 != null ? (jg)$$5.getFirst() : null;
         }
      }
   }

   @Nullable
   public Pair<jg, jp<dfw>> a(Predicate<jp<dfw>> $$0, jg $$1, int $$2, int $$3, int $$4) {
      return this.l().g().d().a($$1, $$2, $$3, $$4, $$0, this.l().i().b(), this);
   }

   @Override
   public dan r() {
      return this.K.aI();
   }

   @Override
   public bsh s() {
      return this.K.aP();
   }

   @Override
   public boolean t() {
      return this.e;
   }

   public ete u() {
      return this.l().k();
   }

   @Nullable
   @Override
   public esy a(esw $$0) {
      return this.o().J().u().b(esy.a(), $$0.a());
   }

   @Override
   public void a(esw $$0, esy $$1) {
      this.o().J().u().a($$0.a(), $$1);
   }

   @Override
   public esw v() {
      return this.o().J().u().a(esx.a(), "idcounts").b();
   }

   public void a(jg $$0, float $$1) {
      jg $$2 = this.B.a();
      float $$3 = this.B.b();
      if (!$$2.equals($$0) || $$3 != $$1) {
         this.B.a($$0, $$1);
         this.o().ag().a(new afh($$0, $$1));
      }

      if (this.M > 1) {
         this.l().b(ars.a, new deb($$2), this.M, bao.a);
      }

      int $$4 = this.ac().c(der.aa) + 1;
      if ($$4 > 1) {
         this.l().a(ars.a, new deb($$0), $$4, bao.a);
      }

      this.M = $$4;
   }

   public LongSet w() {
      deq $$0 = this.u().b(deq.a(), "chunks");
      return (LongSet)($$0 != null ? LongSets.unmodifiable($$0.b()) : LongSets.EMPTY_SET);
   }

   public boolean a(int $$0, int $$1, boolean $$2) {
      deq $$3 = this.u().a(deq.a(), "chunks");
      deb $$4 = new deb($$0, $$1);
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
   public List<arn> x() {
      return this.I;
   }

   @Override
   public void a(jg $$0, dvd $$1, dvd $$2) {
      Optional<jp<cgc>> $$3 = cgd.a($$1);
      Optional<jp<cgc>> $$4 = cgd.a($$2);
      if (!Objects.equals($$3, $$4)) {
         jg $$5 = $$0.j();
         $$3.ifPresent($$1x -> this.o().execute(() -> {
               this.y().a($$5);
               agr.b(this, $$5);
            }));
         $$4.ifPresent($$1x -> this.o().execute(() -> {
               this.y().a($$5, $$1x);
               agr.a(this, $$5);
            }));
      }
   }

   public cfz y() {
      return this.l().l();
   }

   public boolean c(jg $$0) {
      return this.a($$0, 1);
   }

   public boolean a(ki $$0) {
      return this.c($$0.k());
   }

   public boolean a(jg $$0, int $$1) {
      return $$1 > 6 ? false : this.b(ki.a($$0)) <= $$1;
   }

   public int b(ki $$0) {
      return this.y().a($$0);
   }

   public cpx z() {
      return this.f;
   }

   @Nullable
   public cpv d(jg $$0) {
      return this.f.a($$0, 9216);
   }

   public boolean e(jg $$0) {
      return this.d($$0) != null;
   }

   public void a(cfw $$0, btz $$1, bvk $$2) {
      $$2.a($$0, $$1);
   }

   public void a(Path $$0) throws IOException {
      aqs $$1 = this.l().a;

      try (Writer $$2 = Files.newBufferedWriter($$0.resolve("stats.txt"))) {
         $$2.write(String.format(Locale.ROOT, "spawning_chunks: %d\n", $$1.j().b()));
         dfg.d $$3 = this.l().n();
         if ($$3 != null) {
            ObjectIterator $$9 = $$3.b().object2IntEntrySet().iterator();

            while ($$9.hasNext()) {
               Entry<buy> $$4 = (Entry<buy>)$$9.next();
               $$2.write(String.format(Locale.ROOT, "spawn_count.%s: %d\n", ((buy)$$4.getKey()).a(), $$4.getIntValue()));
            }
         }

         $$2.write(String.format(Locale.ROOT, "entities: %s\n", this.O.e()));
         $$2.write(String.format(Locale.ROOT, "block_entity_tickers: %d\n", this.s.size()));
         $$2.write(String.format(Locale.ROOT, "block_ticks: %d\n", this.m().a()));
         $$2.write(String.format(Locale.ROOT, "fluid_ticks: %d\n", this.n().a()));
         $$2.write("distance_manager: " + $$1.j().d() + "\n");
         $$2.write(String.format(Locale.ROOT, "pending_tasks: %d\n", this.l().f()));
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
         a($$12, this.G().a());
      }

      Path $$13 = $$0.resolve("block_entities.csv");

      try (Writer $$14 = Files.newBufferedWriter($$13)) {
         this.a($$14);
      }
   }

   private static void a(Writer $$0, Iterable<btz> $$1) throws IOException {
      ayj $$2 = ayj.a().a("x").a("y").a("z").a("uuid").a("type").a("alive").a("display_name").a("custom_name").a($$0);

      for (btz $$3 : $$1) {
         xh $$4 = $$3.an();
         xh $$5 = $$3.S_();
         $$2.a($$3.dC(), $$3.dE(), $$3.dI(), $$3.cH(), lx.f.b($$3.aq()), $$3.bM(), $$5.getString(), $$4 != null ? $$4.getString() : null);
      }
   }

   private void a(Writer $$0) throws IOException {
      ayj $$1 = ayj.a().a("x").a("y").a("z").a("type").a($$0);

      for (dua $$2 : this.s) {
         jg $$3 = $$2.c();
         $$1.a($$3.u(), $$3.v(), $$3.w(), $$2.d());
      }
   }

   @VisibleForTesting
   public void a(elj $$0) {
      this.Y.removeIf($$1 -> $$0.b($$1.a()));
   }

   @Override
   public void b(jg $$0, dhy $$1) {
      if (!this.aj()) {
         this.a($$0, $$1);
      }
   }

   @Override
   public float a(jl $$0, boolean $$1) {
      return 1.0F;
   }

   public Iterable<btz> A() {
      return this.G().a();
   }

   @Override
   public String toString() {
      return "ServerLevel[" + this.L.e() + "]";
   }

   public boolean B() {
      return this.K.ba().z();
   }

   @Override
   public long C() {
      return this.K.ba().y().b();
   }

   @Nullable
   public dzc D() {
      return this.ac;
   }

   @Override
   public arm E() {
      return this;
   }

   @VisibleForTesting
   public String F() {
      return String.format(
         Locale.ROOT,
         "players: %s, entities: %s [%s], block_entities: %d [%s], block_ticks: %d, fluid_ticks: %d, chunk_source: %s",
         this.I.size(),
         this.O.e(),
         a(this.O.d().a(), $$0 -> lx.f.b($$0.aq()).toString()),
         this.s.size(),
         a(this.s, dua::d),
         this.m().a(),
         this.n().a(),
         this.I()
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
   protected dzq<btz> G() {
      return this.O.d();
   }

   public void a(Stream<btz> $$0) {
      this.O.a($$0);
   }

   public void b(Stream<btz> $$0) {
      this.O.b($$0);
   }

   public void b(dxj $$0) {
      $$0.d(this.A_().c());
   }

   public void a(dwz $$0) {
      this.K.execute(() -> this.af.a($$0.f(), $$0.g()));
   }

   public erw H() {
      return this.V;
   }

   @Override
   public void close() throws IOException {
      super.close();
      this.O.close();
   }

   @Override
   public String I() {
      return "Chunks[S] W: " + this.J.e() + " E: " + this.O.e();
   }

   public boolean c(long $$0) {
      return this.O.a($$0);
   }

   private boolean d(long $$0) {
      return this.c($$0) && this.J.a($$0);
   }

   public boolean f(jg $$0) {
      return this.O.a($$0) && this.J.a.j().c(deb.a($$0));
   }

   public boolean g(jg $$0) {
      return this.O.a($$0);
   }

   public boolean a(deb $$0) {
      return this.O.a($$0);
   }

   @Override
   public cra J() {
      return this.K.ba().K();
   }

   @Override
   public cxv K() {
      return this.K.bo();
   }

   @Override
   public dtd L() {
      return this.K.bp();
   }

   public azr a(alh $$0) {
      return this.ah.a($$0);
   }

   public bsd M() {
      return this.ah;
   }

   @Override
   public p a(o $$0) {
      p $$1 = super.a($$0);
      $$1.a("Loaded entity count", () -> String.valueOf(this.O.f()));
      return $$1;
   }

   @Override
   public int N() {
      return this.J.g().f();
   }

   final class a implements dzp<btz> {
      public void a(btz $$0) {
      }

      public void b(btz $$0) {
         arm.this.f().a($$0);
      }

      public void c(btz $$0) {
         arm.this.N.a($$0);
      }

      public void d(btz $$0) {
         arm.this.N.b($$0);
      }

      public void e(btz $$0) {
         arm.this.l().b($$0);
         if ($$0 instanceof arn $$1) {
            arm.this.I.add($$1);
            arm.this.e();
         }

         if ($$0 instanceof bux $$2) {
            if (arm.this.X) {
               String $$3 = "onTrackingStart called during navigation iteration";
               ad.a("onTrackingStart called during navigation iteration", new IllegalStateException("onTrackingStart called during navigation iteration"));
            }

            arm.this.W.add($$2);
         }

         if ($$0 instanceof cjj $$4) {
            for (cjg $$5 : $$4.gr()) {
               arm.this.ad.put($$5.ar(), $$5);
            }
         }

         $$0.a(dzx::a);
      }

      public void f(btz $$0) {
         arm.this.l().a($$0);
         if ($$0 instanceof arn $$1) {
            arm.this.I.remove($$1);
            arm.this.e();
         }

         if ($$0 instanceof bux $$2) {
            if (arm.this.X) {
               String $$3 = "onTrackingStart called during navigation iteration";
               ad.a("onTrackingStart called during navigation iteration", new IllegalStateException("onTrackingStart called during navigation iteration"));
            }

            arm.this.W.remove($$2);
         }

         if ($$0 instanceof cjj $$4) {
            for (cjg $$5 : $$4.gr()) {
               arm.this.ad.remove($$5.ar());
            }
         }

         $$0.a(dzx::b);
      }

      public void g(btz $$0) {
         $$0.a(dzx::c);
      }
   }
}
