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

public class arn extends dhp implements arm, dio {
   public static final jj a = new jj(100, 50, 0);
   public static final bsv b = btb.a(12000, 180000);
   public static final bsv c = btb.a(12000, 24000);
   private static final bsv E = btb.a(12000, 180000);
   public static final bsv d = btb.a(3600, 15600);
   private static final Logger F = LogUtils.getLogger();
   private static final int G = 300;
   private static final int H = 65536;
   final List<aro> I = Lists.newArrayList();
   private final ark J;
   private final MinecraftServer K;
   private final exe L;
   private int M;
   final ecx N = new ecx();
   private final edc<bvs> O;
   private final edn P;
   public boolean e;
   private final avq Q;
   private int R;
   private final evr S;
   private final fej<dku> T = new fej<>(this::d);
   private final fej<eus> U = new fej<>(this::d);
   private final evl V = new evl();
   final Set<bwt> W = new ObjectOpenHashSet();
   volatile boolean X;
   protected final crx f;
   private final ObjectLinkedOpenHashSet<dgu> Y = new ObjectLinkedOpenHashSet();
   private final List<dgu> Z = new ArrayList<>(64);
   private boolean aa;
   private final List<dhc> ab;
   @Nullable
   private ecm ac;
   final Int2ObjectMap<cld> ad = new Int2ObjectOpenHashMap();
   private final dil ae;
   private final eph af;
   private final boolean ag;
   private final btv ah;

   public arn(
      MinecraftServer $$0,
      Executor $$1,
      ewz.c $$2,
      exe $$3,
      alc<dhp> $$4,
      eck $$5,
      arx $$6,
      boolean $$7,
      long $$8,
      List<dhc> $$9,
      boolean $$10,
      @Nullable btv $$11
   ) {
      super($$3, $$4, $$0.ba(), $$5.a(), false, $$7, $$8, $$0.bj());
      this.ag = $$10;
      this.K = $$0;
      this.ab = $$9;
      this.L = $$3;
      eak $$12 = $$5.b();
      boolean $$13 = $$0.aX();
      DataFixer $$14 = $$0.aC();
      ecu<bvs> $$15 = new ebu(new ecf(new ecc($$2.f(), $$4, "entities"), $$2.a($$4).resolve("entities"), $$14, $$13, bax.s), this, $$0);
      this.O = new edc<>(bvs.class, new arn.a(), $$15);
      this.J = new ark(this, $$2, $$14, $$0.aY(), $$1, $$12, $$0.ag().p(), $$0.ag().q(), $$13, $$6, this.O::a, () -> $$0.J().w());
      this.J.h().b();
      this.S = new evr(this);
      this.Z();
      this.ac();
      this.A_().a($$0.aw());
      this.f = this.w().a(crx.a(this), crx.a(this.ai()));
      if (!$$0.U()) {
         $$3.a($$0.u());
      }

      long $$16 = $$0.aZ().y().c();
      this.af = new eph(this.J.n(), this.F_(), $$0.aY(), $$4, $$12, this.J.i(), this, $$12.d(), $$16, $$14);
      this.ae = new dil(this, $$0.aZ().y(), this.af);
      if (this.aj() == dhp.k && this.ai().a(ech.c)) {
         this.ac = new ecm(this, $$16, $$0.aZ().C());
      } else {
         this.ac = null;
      }

      this.Q = new avq();
      this.P = new edn(this);
      this.ah = Objects.requireNonNullElseGet($$11, () -> this.w().a(btv.a($$16), "random_sequences"));
   }

   @Deprecated
   @VisibleForTesting
   public void a(@Nullable ecm $$0) {
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
   public js<dis> a(int $$0, int $$1, int $$2) {
      return this.m().g().d().getNoiseBiome($$0, $$1, $$2, this.m().i().b());
   }

   public dil b() {
      return this.ae;
   }

   public void a(BooleanSupplier $$0) {
      bqb $$1 = bqa.a();
      this.aa = true;
      btz $$2 = this.u();
      boolean $$3 = $$2.i();
      if ($$3) {
         $$1.a("world border");
         this.A_().s();
         $$1.b("weather");
         this.aw();
         $$1.c();
      }

      int $$4 = this.O().d(dhl.Q);
      if (this.Q.a($$4) && this.Q.a($$4, this.I)) {
         if (this.O().c(dhl.l)) {
            long $$5 = this.B.d() + 24000L;
            this.b($$5 - $$5 % 24000L);
         }

         this.au();
         if (this.O().c(dhl.w) && this.ah()) {
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
         this.f.a();
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
            if (!$$2x.dQ()) {
               if (!$$2.a($$2x)) {
                  $$1.a("checkDespawn");
                  $$2x.dH();
                  $$1.c();
                  if ($$2x instanceof aro || this.J.a.j().c($$2x.dx().a())) {
                     bvs $$3x = $$2x.dk();
                     if ($$3x != null) {
                        if (!$$3x.dQ() && $$3x.y($$2x)) {
                           return;
                        }

                        $$2x.bP();
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
         bqa.a().a("scheduledFunctions");
         this.L.s().a(this.K, $$0);
         bqa.a().c();
         if (this.L.o().c(dhl.l)) {
            this.b(this.B.d() + 1L);
         }
      }
   }

   public void b(long $$0) {
      this.L.b($$0);
   }

   public void a(boolean $$0, boolean $$1) {
      for (dhc $$2 : this.ab) {
         $$2.a(this, $$0, $$1);
      }
   }

   private void au() {
      this.Q.a();
      this.I.stream().filter(bwr::fQ).collect(Collectors.toList()).forEach($$0 -> $$0.a(false, false));
   }

   public void a(eat $$0, int $$1) {
      dgw $$2 = $$0.f();
      boolean $$3 = this.ah();
      int $$4 = $$2.d();
      int $$5 = $$2.e();
      bqb $$6 = bqa.a();
      $$6.a("thunder");
      if ($$3 && this.ag() && this.A.a(100000) == 0) {
         jj $$7 = this.b(this.a($$4, 0, $$5, 15));
         if (this.r($$7)) {
            bto $$8 = this.d_($$7);
            boolean $$9 = this.O().c(dhl.e) && this.A.j() < (double)$$8.b() * 0.01 && !this.a_($$7.e()).a(dkw.sW);
            if ($$9) {
               ckt $$10 = bwb.bf.a(this, bwa.h);
               if ($$10 != null) {
                  $$10.w(true);
                  $$10.c_(0);
                  $$10.a_((double)$$7.u(), (double)$$7.v(), (double)$$7.w());
                  this.b($$10);
               }
            }

            bwq $$11 = bwb.aw.a(this, bwa.h);
            if ($$11 != null) {
               $$11.f(fcu.c($$7));
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
         eau[] $$13 = $$0.d();

         for (int $$14 = 0; $$14 < $$13.length; $$14++) {
            eau $$15 = $$13[$$14];
            if ($$15.d()) {
               int $$16 = $$0.h($$14);
               int $$17 = kl.c($$16);

               for (int $$18 = 0; $$18 < $$1; $$18++) {
                  jj $$19 = this.a($$4, $$17, $$5, 15);
                  $$6.a("randomTick");
                  dym $$20 = $$15.a($$19.u() - $$4, $$19.v() - $$17, $$19.w() - $$5);
                  if ($$20.z()) {
                     $$20.b(this, $$19, this.A);
                  }

                  eut $$21 = $$20.y();
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
   public void a(jj $$0) {
      jj $$1 = this.a(eel.a.e, $$0);
      jj $$2 = $$1.e();
      dis $$3 = this.t($$1).a();
      if ($$3.a(this, $$2)) {
         this.b($$2, dkw.eb.m());
      }

      if (this.ah()) {
         int $$4 = this.O().d(dhl.U);
         if ($$4 > 0 && $$3.b(this, $$1)) {
            dym $$5 = this.a_($$1);
            if ($$5.a(dkw.ea)) {
               int $$6 = $$5.c(dsj.c);
               if ($$6 < Math.min($$4, 8)) {
                  dym $$7 = $$5.b(dsj.c, Integer.valueOf($$6 + 1));
                  dku.a($$5, $$7, this, $$1);
                  this.b($$1, $$7);
               }
            } else {
               this.b($$1, dkw.ea.m());
            }
         }

         dis.c $$8 = $$3.a($$2, this.P());
         if ($$8 != dis.c.a) {
            dym $$9 = this.a_($$2);
            $$9.b().a($$9, this, $$2, $$8);
         }
      }
   }

   private Optional<jj> E(jj $$0) {
      Optional<jj> $$1 = this.A().e($$0x -> $$0x.a(chx.t), $$0x -> $$0x.v() == this.a(eel.a.b, $$0x.u(), $$0x.w()) - 1, $$0, 128, cht.b.c);
      return $$1.map($$0x -> $$0x.b(1));
   }

   protected jj b(jj $$0) {
      jj $$1 = this.a(eel.a.e, $$0);
      Optional<jj> $$2 = this.E($$1);
      if ($$2.isPresent()) {
         return $$2.get();
      } else {
         fcp $$3 = fcp.a($$1, $$1.h(this.ao() + 1)).g(3.0);
         List<bwr> $$4 = this.a(bwr.class, $$3, $$0x -> $$0x != null && $$0x.bK() && this.h($$0x.dv()));
         if (!$$4.isEmpty()) {
            return $$4.get(this.A.a($$4.size())).dv();
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
      return this.O().d(dhl.Q) <= 100;
   }

   private void av() {
      if (this.e()) {
         if (!this.p().U() || this.p().r()) {
            int $$0 = this.O().d(dhl.Q);
            wv $$1;
            if (this.Q.a($$0)) {
               $$1 = wv.c("sleep.skipping_night");
            } else {
               $$1 = wv.a("sleep.players_sleeping", this.Q.b(), this.Q.b($$0));
            }

            for (aro $$3 : this.I) {
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

   public alw g() {
      return this.K.aJ();
   }

   private void aw() {
      boolean $$0 = this.ah();
      if (this.B_().g()) {
         if (this.O().c(dhl.w)) {
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

         this.z = azk.a(this.z, 0.0F, 1.0F);
         this.w = this.x;
         if (this.B.i()) {
            this.x += 0.01F;
         } else {
            this.x -= 0.01F;
         }

         this.x = azk.a(this.x, 0.0F, 1.0F);
      }

      if (this.w != this.x) {
         this.K.ag().a(new acy(acy.i, this.x), this.aj());
      }

      if (this.y != this.z) {
         this.K.ag().a(new acy(acy.j, this.z), this.aj());
      }

      if ($$0 != this.ah()) {
         if ($$0) {
            this.K.ag().a(new acy(acy.d, 0.0F));
         } else {
            this.K.ag().a(new acy(acy.c, 0.0F));
         }

         this.K.ag().a(new acy(acy.i, this.x));
         this.K.ag().a(new acy(acy.j, this.z));
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

   private void a(jj $$0, eus $$1) {
      dym $$2 = this.a_($$0);
      eut $$3 = $$2.y();
      if ($$3.b($$1)) {
         $$3.a(this, $$0, $$2);
      }
   }

   private void c(jj $$0, dku $$1) {
      dym $$2 = this.a_($$0);
      if ($$2.a($$1)) {
         $$2.a(this, $$0, this.A);
      }
   }

   public void a(bvs $$0) {
      $$0.by();
      bqb $$1 = bqa.a();
      $$0.af++;
      $$1.a(() -> md.f.b($$0.aq()).toString());
      $$1.f("tickNonPassenger");
      $$0.h();
      $$1.c();

      for (bvs $$2 : $$0.cY()) {
         this.a($$0, $$2);
      }
   }

   private void a(bvs $$0, bvs $$1) {
      if ($$1.dQ() || $$1.dk() != $$0) {
         $$1.bP();
      } else if ($$1 instanceof cqi || this.N.c($$1)) {
         $$1.by();
         $$1.af++;
         bqb $$2 = bqa.a();
         $$2.a(() -> md.f.b($$1.aq()).toString());
         $$2.f("tickPassenger");
         $$1.r();
         $$2.c();

         for (bvs $$3 : $$1.cY()) {
            this.a($$1, $$3);
         }
      }
   }

   @Override
   public boolean a(bvs $$0, jj $$1) {
      if ($$0 instanceof cqi $$2 && (this.K.a(this, $$1, $$2) || !this.A_().a($$1))) {
         return false;
      }

      return true;
   }

   public void a(@Nullable azr $$0, boolean $$1, boolean $$2) {
      ark $$3 = this.m();
      if (!$$2) {
         if ($$0 != null) {
            $$0.a(wv.c("menu.savingLevel"));
         }

         this.b($$1);
         if ($$0 != null) {
            $$0.c(wv.c("menu.savingChunks"));
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

      ewt $$1 = this.m().l();
      if ($$0) {
         $$1.b();
      } else {
         $$1.a();
      }
   }

   public <T extends bvs> List<? extends T> a(ecy<bvs, T> $$0, Predicate<? super T> $$1) {
      List<T> $$2 = Lists.newArrayList();
      this.a($$0, $$1, $$2);
      return $$2;
   }

   public <T extends bvs> void a(ecy<bvs, T> $$0, Predicate<? super T> $$1, List<? super T> $$2) {
      this.a($$0, $$1, $$2, Integer.MAX_VALUE);
   }

   public <T extends bvs> void a(ecy<bvs, T> $$0, Predicate<? super T> $$1, List<? super T> $$2, int $$3) {
      this.H().a($$0, $$3x -> {
         if ($$1.test((T)$$3x)) {
            $$2.add((T)$$3x);
            if ($$2.size() >= $$3) {
               return axv.a.b;
            }
         }

         return axv.a.a;
      });
   }

   public List<? extends clg> j() {
      return this.a(bwb.P, bwr::bK);
   }

   public List<aro> a(Predicate<? super aro> $$0) {
      return this.a($$0, Integer.MAX_VALUE);
   }

   public List<aro> a(Predicate<? super aro> $$0, int $$1) {
      List<aro> $$2 = Lists.newArrayList();

      for (aro $$3 : this.I) {
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
   public aro k() {
      List<aro> $$0 = this.a(bwr::bK);
      return $$0.isEmpty() ? null : $$0.get(this.A.a($$0.size()));
   }

   @Override
   public boolean b(bvs $$0) {
      return this.i($$0);
   }

   public boolean c(bvs $$0) {
      return this.i($$0);
   }

   public void d(bvs $$0) {
      if ($$0 instanceof aro $$1) {
         this.c($$1);
      } else {
         this.i($$0);
      }
   }

   public void a(aro $$0) {
      this.c($$0);
   }

   public void b(aro $$0) {
      this.c($$0);
   }

   private void c(aro $$0) {
      bvs $$1 = this.b($$0.cG());
      if ($$1 != null) {
         F.warn("Force-added player with duplicate UUID {}", $$0.cG());
         $$1.ao();
         this.a((aro)$$1, bvs.e.b);
      }

      this.O.a($$0);
   }

   private boolean i(bvs $$0) {
      if ($$0.dQ()) {
         F.warn("Tried to add entity {} but it was marked as removed already", bwb.a($$0.aq()));
         return false;
      } else {
         return this.O.a($$0);
      }
   }

   public boolean e(bvs $$0) {
      if ($$0.da().map(bvs::cG).anyMatch(this.O::a)) {
         return false;
      } else {
         this.a_($$0);
         return true;
      }
   }

   public void a(eat $$0) {
      $$0.J();
      $$0.c(this);
   }

   public void a(aro $$0, bvs.e $$1) {
      $$0.a($$1);
   }

   @Override
   public void a(int $$0, jj $$1, int $$2) {
      for (aro $$3 : this.K.ag().t()) {
         if ($$3 != null && $$3.dV() == this && $$3.ar() != $$0) {
            double $$4 = (double)$$1.u() - $$3.dA();
            double $$5 = (double)$$1.v() - $$3.dC();
            double $$6 = (double)$$1.w() - $$3.dG();
            if ($$4 * $$4 + $$5 * $$5 + $$6 * $$6 < 1024.0) {
               $$3.f.b(new abw($$0, $$1, $$2));
            }
         }
      }
   }

   @Override
   public void a(@Nullable bvs $$0, double $$1, double $$2, double $$3, js<awj> $$4, awl $$5, float $$6, float $$7, long $$8) {
      this.K.ag().a($$0 instanceof cqi $$9 ? $$9 : null, $$1, $$2, $$3, (double)$$4.a().a($$6), this.aj(), new afs($$4, $$5, $$1, $$2, $$3, $$6, $$7, $$8));
   }

   @Override
   public void a(@Nullable bvs $$0, bvs $$1, js<awj> $$2, awl $$3, float $$4, float $$5, long $$6) {
      this.K
         .ag()
         .a($$0 instanceof cqi $$7 ? $$7 : null, $$1.dA(), $$1.dC(), $$1.dG(), (double)$$2.a().a($$4), this.aj(), new afr($$2, $$3, $$1, $$4, $$5, $$6));
   }

   @Override
   public void b(int $$0, jj $$1, int $$2) {
      if (this.O().c(dhl.X)) {
         this.K.ag().t().forEach($$3 -> {
            fcu $$5;
            if ($$3.dV() == this) {
               fcu $$4 = fcu.b($$1);
               if ($$3.g($$4) < (double)azk.h(32)) {
                  $$5 = $$4;
               } else {
                  fcu $$6 = $$4.d($$3.dt()).d();
                  $$5 = $$3.dt().e($$6.c(32.0));
               }
            } else {
               $$5 = $$3.dt();
            }

            $$3.f.b(new ade($$0, jj.a((kc)$$5), $$2, true));
         });
      } else {
         this.a(null, $$0, $$1, $$2);
      }
   }

   @Override
   public void a(@Nullable bvs $$0, int $$1, jj $$2, int $$3) {
      this.K.ag().a($$0 instanceof cqi $$4 ? $$4 : null, (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), 64.0, this.aj(), new ade($$1, $$2, $$3, false));
   }

   public int l() {
      return this.B_().p();
   }

   @Override
   public void a(js<edm> $$0, fcu $$1, edm.a $$2) {
      this.P.a($$0, $$1, $$2);
   }

   @Override
   public void a(jj $$0, dym $$1, dym $$2, int $$3) {
      if (this.X) {
         String $$4 = "recursive call to sendBlockUpdated";
         af.a("recursive call to sendBlockUpdated", new IllegalStateException("recursive call to sendBlockUpdated"));
      }

      this.m().a($$0);
      this.V.a($$0);
      fdo $$5 = $$1.g(this, $$0);
      fdo $$6 = $$2.g(this, $$0);
      if (fdl.c($$5, $$6, fcy.g)) {
         List<cgb> $$7 = new ObjectArrayList();

         for (bwt $$8 : this.W) {
            cgb $$9 = $$8.O();
            if ($$9.b($$0)) {
               $$7.add($$9);
            }
         }

         try {
            this.X = true;

            for (cgb $$10 : $$7) {
               $$10.h();
            }
         } finally {
            this.X = false;
         }
      }
   }

   @Override
   public void a(jj $$0, dku $$1) {
      this.a($$0, $$1, evx.a(this, null, null));
   }

   @Override
   public void a(jj $$0, dku $$1, @Nullable ewb $$2) {
      this.t.a($$0, $$1, null, $$2);
   }

   @Override
   public void a(jj $$0, dku $$1, jo $$2, @Nullable ewb $$3) {
      this.t.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void b(jj $$0, dku $$1, @Nullable ewb $$2) {
      this.t.a($$0, $$1, $$2);
   }

   @Override
   public void a(dym $$0, jj $$1, dku $$2, @Nullable ewb $$3, boolean $$4) {
      this.t.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public void a(bvs $$0, byte $$1) {
      this.m().a($$0, new acu($$0, $$1));
   }

   @Override
   public void a(bvs $$0, buh $$1) {
      this.m().a($$0, new acq($$0, $$1));
   }

   public ark m() {
      return this.J;
   }

   @Override
   public void a(
      @Nullable bvs $$0,
      @Nullable buh $$1,
      @Nullable dhj $$2,
      double $$3,
      double $$4,
      double $$5,
      float $$6,
      boolean $$7,
      dhp.a $$8,
      lt $$9,
      lt $$10,
      js<awj> $$11
   ) {
      dhi.a $$12 = switch ($$8) {
         case a -> dhi.a.a;
         case b -> this.a(dhl.R);
         case c -> this.O().c(dhl.c) ? this.a(dhl.S) : dhi.a.a;
         case d -> this.a(dhl.T);
         case e -> dhi.a.d;
      };
      fcu $$13 = new fcu($$3, $$4, $$5);
      dif $$14 = new dif(this, $$0, $$1, $$2, $$13, $$6, $$7, $$12);
      $$14.i();
      lt $$15 = $$14.l() ? $$9 : $$10;

      for (aro $$16 : this.I) {
         if ($$16.g($$13) < 4096.0) {
            Optional<fcu> $$17 = Optional.ofNullable($$14.j().get($$16));
            $$16.f.b(new acw($$13, $$17, $$15, $$11));
         }
      }
   }

   private dhi.a a(dhl.e<dhl.a> $$0) {
      return this.O().c($$0) ? dhi.a.c : dhi.a.b;
   }

   @Override
   public void a(jj $$0, dku $$1, int $$2, int $$3) {
      this.Y.add(new dgu($$0, $$1, $$2, $$3));
   }

   private void ax() {
      this.Z.clear();

      while (!this.Y.isEmpty()) {
         dgu $$0 = (dgu)this.Y.removeFirst();
         if (this.n($$0.a())) {
            if (this.a($$0)) {
               this.K.ag().a(null, (double)$$0.a().u(), (double)$$0.a().v(), (double)$$0.a().w(), 64.0, this.aj(), new aby($$0.a(), $$0.b(), $$0.c(), $$0.d()));
            }
         } else {
            this.Z.add($$0);
         }
      }

      this.Y.addAll(this.Z);
   }

   private boolean a(dgu $$0) {
      dym $$1 = this.a_($$0.a());
      return $$1.a($$0.b()) ? $$1.a(this, $$0.a(), $$0.c(), $$0.d()) : false;
   }

   public fej<dku> n() {
      return this.T;
   }

   public fej<eus> o() {
      return this.U;
   }

   @Nonnull
   @Override
   public MinecraftServer p() {
      return this.K;
   }

   public evr q() {
      return this.S;
   }

   public etj r() {
      return this.K.aY();
   }

   public <T extends lt> int a(T $$0, double $$1, double $$2, double $$3, int $$4, double $$5, double $$6, double $$7, double $$8) {
      return this.a($$0, false, false, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8);
   }

   public <T extends lt> int a(T $$0, boolean $$1, boolean $$2, double $$3, double $$4, double $$5, int $$6, double $$7, double $$8, double $$9, double $$10) {
      adf $$11 = new adf($$0, $$1, $$2, $$3, $$4, $$5, (float)$$7, (float)$$8, (float)$$9, (float)$$10, $$6);
      int $$12 = 0;

      for (int $$13 = 0; $$13 < this.I.size(); $$13++) {
         aro $$14 = this.I.get($$13);
         if (this.a($$14, $$1, $$3, $$4, $$5, $$11)) {
            $$12++;
         }
      }

      return $$12;
   }

   public <T extends lt> boolean a(
      aro $$0, T $$1, boolean $$2, boolean $$3, double $$4, double $$5, double $$6, int $$7, double $$8, double $$9, double $$10, double $$11
   ) {
      zc<?> $$12 = new adf($$1, $$2, $$3, $$4, $$5, $$6, (float)$$8, (float)$$9, (float)$$10, (float)$$11, $$7);
      return this.a($$0, $$2, $$4, $$5, $$6, $$12);
   }

   private boolean a(aro $$0, boolean $$1, double $$2, double $$3, double $$4, zc<?> $$5) {
      if ($$0.dV() != this) {
         return false;
      } else {
         jj $$6 = $$0.dv();
         if ($$6.a(new fcu($$2, $$3, $$4), $$1 ? 512.0 : 32.0)) {
            $$0.f.b($$5);
            return true;
         } else {
            return false;
         }
      }
   }

   @Nullable
   @Override
   public bvs a(int $$0) {
      return this.H().a($$0);
   }

   @Deprecated
   @Nullable
   public bvs b(int $$0) {
      bvs $$1 = this.H().a($$0);
      return $$1 != null ? $$1 : (bvs)this.ad.get($$0);
   }

   @Override
   public Collection<cld> s() {
      return this.ad.values();
   }

   @Nullable
   public jj a(axp<epg> $$0, jj $$1, int $$2, boolean $$3) {
      if (!this.K.aZ().y().d()) {
         return null;
      } else {
         Optional<jw.c<epg>> $$4 = this.F_().f(me.aZ).a($$0);
         if ($$4.isEmpty()) {
            return null;
         } else {
            Pair<jj, js<epg>> $$5 = this.m().g().a(this, $$4.get(), $$1, $$2, $$3);
            return $$5 != null ? (jj)$$5.getFirst() : null;
         }
      }
   }

   @Nullable
   public Pair<jj, js<dis>> a(Predicate<js<dis>> $$0, jj $$1, int $$2, int $$3, int $$4) {
      return this.m().g().d().a($$1, $$2, $$3, $$4, $$0, this.m().i().b(), this);
   }

   public dcs t() {
      return this.K.aI();
   }

   @Override
   public btz u() {
      return this.K.aP();
   }

   @Override
   public boolean v() {
      return this.e;
   }

   public ewt w() {
      return this.m().l();
   }

   @Nullable
   @Override
   public ewn a(ewl $$0) {
      return this.p().J().w().b(ewn.a(), $$0.a());
   }

   @Override
   public void a(ewl $$0, ewn $$1) {
      this.p().J().w().a($$0.a(), $$1);
   }

   @Override
   public ewl x() {
      return this.p().J().w().a(ewm.a(), "idcounts").b();
   }

   public void a(jj $$0, float $$1) {
      jj $$2 = this.B.a();
      float $$3 = this.B.b();
      if (!$$2.equals($$0) || $$3 != $$1) {
         this.B.a($$0, $$1);
         this.p().ag().a(new aey($$0, $$1));
      }

      if (this.M > 1) {
         this.m().b(aru.b, new dgw($$2), this.M);
      }

      int $$4 = this.O().d(dhl.ab) + 1;
      if ($$4 > 1) {
         this.m().a(aru.b, new dgw($$0), $$4);
      }

      this.M = $$4;
   }

   public LongSet y() {
      return this.J.k();
   }

   public boolean a(int $$0, int $$1, boolean $$2) {
      boolean $$3 = this.J.a(new dgw($$0, $$1), $$2);
      if ($$2 && $$3) {
         this.d($$0, $$1);
      }

      return $$3;
   }

   @Override
   public List<aro> z() {
      return this.I;
   }

   @Override
   public void a(jj $$0, dym $$1, dym $$2) {
      Optional<js<chw>> $$3 = chx.a($$1);
      Optional<js<chw>> $$4 = chx.a($$2);
      if (!Objects.equals($$3, $$4)) {
         jj $$5 = $$0.j();
         $$3.ifPresent($$1x -> this.p().execute(() -> {
               this.A().a($$5);
               agj.b(this, $$5);
            }));
         $$4.ifPresent($$1x -> this.p().execute(() -> {
               this.A().a($$5, $$1x);
               agj.a(this, $$5);
            }));
      }
   }

   public cht A() {
      return this.m().m();
   }

   public boolean c(jj $$0) {
      return this.a($$0, 1);
   }

   public boolean a(kl $$0) {
      return this.c($$0.k());
   }

   public boolean a(jj $$0, int $$1) {
      return $$1 > 6 ? false : this.b(kl.a($$0)) <= $$1;
   }

   public int b(kl $$0) {
      return this.A().a($$0);
   }

   public crx B() {
      return this.f;
   }

   @Nullable
   public crv d(jj $$0) {
      return this.f.a($$0, 9216);
   }

   public boolean e(jj $$0) {
      return this.d($$0) != null;
   }

   public void a(chq $$0, bvs $$1, bxg $$2) {
      $$2.a($$0, $$1);
   }

   public void a(Path $$0) throws IOException {
      aqr $$1 = this.m().a;

      try (Writer $$2 = Files.newBufferedWriter($$0.resolve("stats.txt"))) {
         $$2.write(String.format(Locale.ROOT, "spawning_chunks: %d\n", $$1.j().a()));
         dia.d $$3 = this.m().o();
         if ($$3 != null) {
            ObjectIterator $$9 = $$3.b().object2IntEntrySet().iterator();

            while ($$9.hasNext()) {
               Entry<bwu> $$4 = (Entry<bwu>)$$9.next();
               $$2.write(String.format(Locale.ROOT, "spawn_count.%s: %d\n", ((bwu)$$4.getKey()).a(), $$4.getIntValue()));
            }
         }

         $$2.write(String.format(Locale.ROOT, "entities: %s\n", this.O.e()));
         $$2.write(String.format(Locale.ROOT, "block_entity_tickers: %d\n", this.s.size()));
         $$2.write(String.format(Locale.ROOT, "block_ticks: %d\n", this.n().a()));
         $$2.write(String.format(Locale.ROOT, "fluid_ticks: %d\n", this.o().a()));
         $$2.write("distance_manager: " + $$1.j().c() + "\n");
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

   private static void a(Writer $$0, Iterable<bvs> $$1) throws IOException {
      ayj $$2 = ayj.a().a("x").a("y").a("z").a("uuid").a("type").a("alive").a("display_name").a("custom_name").a($$0);

      for (bvs $$3 : $$1) {
         wv $$4 = $$3.an();
         wv $$5 = $$3.m_();
         $$2.a($$3.dA(), $$3.dC(), $$3.dG(), $$3.cG(), md.f.b($$3.aq()), $$3.bK(), $$5.getString(), $$4 != null ? $$4.getString() : null);
      }
   }

   private void a(Writer $$0) throws IOException {
      ayj $$1 = ayj.a().a("x").a("y").a("z").a("type").a($$0);

      for (dxj $$2 : this.s) {
         jj $$3 = $$2.c();
         $$1.a($$3.u(), $$3.v(), $$3.w(), $$2.d());
      }
   }

   @VisibleForTesting
   public void a(eoy $$0) {
      this.Y.removeIf($$1 -> $$0.b($$1.a()));
   }

   @Override
   public float a(jo $$0, boolean $$1) {
      return 1.0F;
   }

   public Iterable<bvs> C() {
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
   public ecm F() {
      return this.ac;
   }

   @Override
   public arn a() {
      return this;
   }

   @VisibleForTesting
   public String G() {
      return String.format(
         Locale.ROOT,
         "players: %s, entities: %s [%s], block_entities: %d [%s], block_ticks: %d, fluid_ticks: %d, chunk_source: %s",
         this.I.size(),
         this.O.e(),
         a(this.O.d().a(), $$0 -> md.f.b($$0.aq()).toString()),
         this.s.size(),
         a(this.s, dxj::d),
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
   protected eda<bvs> H() {
      return this.O.d();
   }

   public void a(Stream<bvs> $$0) {
      this.O.a($$0);
   }

   public void b(Stream<bvs> $$0) {
      this.O.b($$0);
   }

   public void b(eat $$0) {
      $$0.d(this.y_().c());
   }

   public void a(eaj $$0) {
      this.K.execute(() -> this.af.a($$0.f(), $$0.g()));
   }

   public evl I() {
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

   public boolean f(jj $$0) {
      return this.O.a($$0) && this.J.a.j().c(dgw.a($$0));
   }

   public boolean a(dgw $$0) {
      return this.O.a($$0);
   }

   public boolean g(jj $$0) {
      return this.O.a($$0);
   }

   public boolean b(dgw $$0) {
      return this.O.b($$0);
   }

   @Override
   public cte K() {
      return this.K.aZ().K();
   }

   @Override
   public czt L() {
      return this.K.bn();
   }

   @Override
   public dwk M() {
      return this.K.bo();
   }

   public azs a(ald $$0) {
      return this.ah.a($$0);
   }

   public btv N() {
      return this.ah;
   }

   public dhl O() {
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

   final class a implements ecz<bvs> {
      public void a(bvs $$0) {
      }

      public void b(bvs $$0) {
         arn.this.g().a($$0);
      }

      public void c(bvs $$0) {
         arn.this.N.a($$0);
      }

      public void d(bvs $$0) {
         arn.this.N.b($$0);
      }

      public void e(bvs $$0) {
         arn.this.m().b($$0);
         if ($$0 instanceof aro $$1) {
            arn.this.I.add($$1);
            arn.this.f();
         }

         if ($$0 instanceof bwt $$2) {
            if (arn.this.X) {
               String $$3 = "onTrackingStart called during navigation iteration";
               af.a("onTrackingStart called during navigation iteration", new IllegalStateException("onTrackingStart called during navigation iteration"));
            }

            arn.this.W.add($$2);
         }

         if ($$0 instanceof clg $$4) {
            for (cld $$5 : $$4.q()) {
               arn.this.ad.put($$5.ar(), $$5);
            }
         }

         $$0.a(edj::a);
      }

      public void f(bvs $$0) {
         arn.this.m().a($$0);
         if ($$0 instanceof aro $$1) {
            arn.this.I.remove($$1);
            arn.this.f();
         }

         if ($$0 instanceof bwt $$2) {
            if (arn.this.X) {
               String $$3 = "onTrackingStart called during navigation iteration";
               af.a("onTrackingStart called during navigation iteration", new IllegalStateException("onTrackingStart called during navigation iteration"));
            }

            arn.this.W.remove($$2);
         }

         if ($$0 instanceof clg $$4) {
            for (cld $$5 : $$4.q()) {
               arn.this.ad.remove($$5.ar());
            }
         }

         $$0.a(edj::b);
      }

      public void g(bvs $$0) {
         $$0.a(edj::c);
      }
   }
}
