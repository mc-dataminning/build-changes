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

public class aqm extends dcg implements ddc {
   public static final ja a = new ja(100, 50, 0);
   public static final bpm b = bps.a(12000, 180000);
   public static final bpm c = bps.a(12000, 24000);
   private static final bpm D = bps.a(12000, 180000);
   public static final bpm d = bps.a(3600, 15600);
   private static final Logger E = LogUtils.getLogger();
   private static final int F = 300;
   private static final int G = 65536;
   final List<aqn> H = Lists.newArrayList();
   private final aqk I;
   private final MinecraftServer J;
   private final eqp K;
   private int L;
   final dwu M = new dwu();
   private final dwz<bsh> N;
   private final dxi O;
   public boolean e;
   private final aum P;
   private int Q;
   private final epi R;
   private final exv<dfi> S = new exv<>(this::d, this.ah());
   private final exv<eoi> T = new exv<>(this::d, this.ah());
   private final epb U = new epb();
   final Set<bte> V = new ObjectOpenHashSet();
   volatile boolean W;
   protected final cny f;
   private final ObjectLinkedOpenHashSet<dbl> X = new ObjectLinkedOpenHashSet();
   private final List<dbl> Y = new ArrayList<>(64);
   private boolean Z;
   private final List<dbt> aa;
   @Nullable
   private dwj ab;
   final Int2ObjectMap<chm> ac = new Int2ObjectOpenHashMap();
   private final dda ad;
   private final eiy ae;
   private final boolean af;
   private final bqo ag;

   public aqm(
      MinecraftServer $$0,
      Executor $$1,
      eqk.c $$2,
      eqp $$3,
      akj<dcg> $$4,
      dwh $$5,
      aqv $$6,
      boolean $$7,
      long $$8,
      List<dbt> $$9,
      boolean $$10,
      @Nullable bqo $$11
   ) {
      super($$3, $$4, $$0.bd(), $$5.a(), $$0::aU, false, $$7, $$8, $$0.bm());
      this.af = $$10;
      this.J = $$0;
      this.aa = $$9;
      this.K = $$3;
      dui $$12 = $$5.b();
      boolean $$13 = $$0.ba();
      DataFixer $$14 = $$0.aE();
      dwr<bsh> $$15 = new dvs(new dwc(new dwa($$2.f(), $$4, "entities"), $$2.a($$4).resolve("entities"), $$14, $$13, azo.s), this, $$0);
      this.N = new dwz<>(bsh.class, new aqm.a(), $$15);
      this.I = new aqk(this, $$2, $$14, $$0.bb(), $$1, $$12, $$0.ai().p(), $$0.ai().q(), $$13, $$6, this.N::a, () -> $$0.J().u());
      this.I.h().b();
      this.R = new epi(this);
      this.U();
      this.X();
      this.C_().a($$0.ay());
      this.f = this.u().a(cny.a(this), cny.a(this.ae()));
      if (!$$0.U()) {
         $$3.a($$0.u_());
      }

      long $$16 = $$0.bc().y().b();
      this.ae = new eiy(this.I.m(), this.H_(), $$0.bb(), $$4, $$12, this.I.i(), this, $$12.d(), $$16, $$14);
      this.ad = new dda(this, $$0.bc().y(), this.ae);
      if (this.af() == dcg.j && this.ae().a(dwe.c)) {
         this.ab = new dwj(this, $$16, $$0.bc().C());
      } else {
         this.ab = null;
      }

      this.P = new aum();
      this.O = new dxi(this);
      this.ag = Objects.requireNonNullElseGet($$11, () -> this.u().a(bqo.a($$16), "random_sequences"));
   }

   @Deprecated
   @VisibleForTesting
   public void a(@Nullable dwj $$0) {
      this.ab = $$0;
   }

   public void a(int $$0, int $$1, boolean $$2, boolean $$3) {
      this.K.a($$0);
      this.K.c($$1);
      this.K.b($$1);
      this.K.b($$2);
      this.K.a($$3);
   }

   @Override
   public jj<ddg> a(int $$0, int $$1, int $$2) {
      return this.l().g().d().getNoiseBiome($$0, $$1, $$2, this.l().i().b());
   }

   public dda a() {
      return this.ad;
   }

   public void a(BooleanSupplier $$0) {
      bmv $$1 = this.ag();
      this.Z = true;
      bqs $$2 = this.s();
      boolean $$3 = $$2.i();
      if ($$3) {
         $$1.a("world border");
         this.C_().s();
         $$1.b("weather");
         this.au();
      }

      int $$4 = this.ab().c(dcc.P);
      if (this.P.a($$4) && this.P.a($$4, this.H)) {
         if (this.ab().b(dcc.l)) {
            long $$5 = this.A.d() + 24000L;
            this.b($$5 - $$5 % 24000L);
         }

         this.as();
         if (this.ab().b(dcc.v) && this.ad()) {
            this.g();
         }
      }

      this.U();
      if ($$3) {
         this.b();
      }

      $$1.b("tickPending");
      if (!this.ai() && $$3) {
         long $$6 = this.Z();
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
         this.aw();
      }

      this.Z = false;
      $$1.c();
      boolean $$7 = !this.H.isEmpty() || !this.w().isEmpty();
      if ($$7) {
         this.h();
      }

      if ($$7 || this.Q++ < 300) {
         $$1.a("entities");
         if (this.ab != null && $$3) {
            $$1.a("dragonFight");
            this.ab.c();
            $$1.c();
         }

         this.M.a($$2x -> {
            if (!$$2x.dM()) {
               if (this.i($$2x)) {
                  $$2x.aq();
               } else if (!$$2.a($$2x)) {
                  $$1.a("checkDespawn");
                  $$2x.dD();
                  $$1.c();
                  if (this.I.a.j().c($$2x.dt().a())) {
                     bsh $$3x = $$2x.de();
                     if ($$3x != null) {
                        if (!$$3x.dM() && $$3x.x($$2x)) {
                           return;
                        }

                        $$2x.ad();
                     }

                     $$1.a("tick");
                     this.a(this::a, $$2x);
                     $$1.c();
                  }
               }
            }
         });
         $$1.c();
         this.T();
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
      if (this.af) {
         long $$0 = this.A.c() + 1L;
         this.K.a($$0);
         this.K.s().a(this.J, $$0);
         if (this.A.o().b(dcc.l)) {
            this.b(this.A.d() + 1L);
         }
      }
   }

   public void b(long $$0) {
      this.K.b($$0);
   }

   public void a(boolean $$0, boolean $$1) {
      for (dbt $$2 : this.aa) {
         $$2.a(this, $$0, $$1);
      }
   }

   private boolean i(bsh $$0) {
      return this.J.ac() || !($$0 instanceof ces) && !($$0 instanceof cfu) ? !this.J.ad() && $$0 instanceof clx : true;
   }

   private void as() {
      this.P.a();
      this.H.stream().filter(btc::fJ).collect(Collectors.toList()).forEach($$0 -> $$0.a(false, false));
   }

   public void a(dur $$0, int $$1) {
      dbn $$2 = $$0.f();
      boolean $$3 = this.ad();
      int $$4 = $$2.d();
      int $$5 = $$2.e();
      bmv $$6 = this.ag();
      $$6.a("thunder");
      if ($$3 && this.ac() && this.z.a(100000) == 0) {
         ja $$7 = this.b(this.a($$4, 0, $$5, 15));
         if (this.r($$7)) {
            bqf $$8 = this.d_($$7);
            boolean $$9 = this.ab().b(dcc.e) && this.z.j() < (double)$$8.b() * 0.01 && !this.a_($$7.d()).a(dfk.ss);
            if ($$9) {
               chc $$10 = bsn.aO.a((dcg)this);
               if ($$10 != null) {
                  $$10.w(true);
                  $$10.c_(0);
                  $$10.a_((double)$$7.u(), (double)$$7.v(), (double)$$7.w());
                  this.b($$10);
               }
            }

            btb $$11 = bsn.am.a((dcg)this);
            if ($$11 != null) {
               $$11.f(ewh.c($$7));
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
         dus[] $$13 = $$0.d();

         for (int $$14 = 0; $$14 < $$13.length; $$14++) {
            dus $$15 = $$13[$$14];
            if ($$15.d()) {
               int $$16 = $$0.g($$14);
               int $$17 = kc.c($$16);

               for (int $$18 = 0; $$18 < $$1; $$18++) {
                  ja $$19 = this.a($$4, $$17, $$5, 15);
                  $$6.a("randomTick");
                  dsl $$20 = $$15.a($$19.u() - $$4, $$19.v() - $$17, $$19.w() - $$5);
                  if ($$20.v()) {
                     $$20.b(this, $$19, this.z);
                  }

                  eoj $$21 = $$20.u();
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
   public void a(ja $$0) {
      ja $$1 = this.a(dyg.a.e, $$0);
      ja $$2 = $$1.d();
      ddg $$3 = this.t($$1).a();
      if ($$3.a(this, $$2)) {
         this.b($$2, dfk.dO.o());
      }

      if (this.ad()) {
         int $$4 = this.ab().c(dcc.T);
         if ($$4 > 0 && $$3.b(this, $$1)) {
            dsl $$5 = this.a_($$1);
            if ($$5.a(dfk.dN)) {
               int $$6 = $$5.c(dmr.c);
               if ($$6 < Math.min($$4, 8)) {
                  dsl $$7 = $$5.a(dmr.c, Integer.valueOf($$6 + 1));
                  dfi.a($$5, $$7, this, $$1);
                  this.b($$1, $$7);
               }
            } else {
               this.b($$1, dfk.dN.o());
            }
         }

         ddg.c $$8 = $$3.a($$2);
         if ($$8 != ddg.c.a) {
            dsl $$9 = this.a_($$2);
            $$9.b().a($$9, this, $$2, $$8);
         }
      }
   }

   private Optional<ja> E(ja $$0) {
      Optional<ja> $$1 = this.y().e($$0x -> $$0x.a(cek.t), $$0x -> $$0x.v() == this.a(dyg.a.b, $$0x.u(), $$0x.w()) - 1, $$0, 128, ceg.b.c);
      return $$1.map($$0x -> $$0x.b(1));
   }

   protected ja b(ja $$0) {
      ja $$1 = this.a(dyg.a.e, $$0);
      Optional<ja> $$2 = this.E($$1);
      if ($$2.isPresent()) {
         return $$2.get();
      } else {
         ewc $$3 = ewc.a($$1, new ja($$1.h(this.am()))).g(3.0);
         List<btc> $$4 = this.a(btc.class, $$3, $$0x -> $$0x != null && $$0x.bF() && this.h($$0x.dr()));
         if (!$$4.isEmpty()) {
            return $$4.get(this.z.a($$4.size())).dr();
         } else {
            if ($$1.v() == this.I_() - 1) {
               $$1 = $$1.b(2);
            }

            return $$1;
         }
      }
   }

   public boolean c() {
      return this.Z;
   }

   public boolean d() {
      return this.ab().c(dcc.P) <= 100;
   }

   private void at() {
      if (this.d()) {
         if (!this.o().U() || this.o().r()) {
            int $$0 = this.ab().c(dcc.P);
            wu $$1;
            if (this.P.a($$0)) {
               $$1 = wu.c("sleep.skipping_night");
            } else {
               $$1 = wu.a("sleep.players_sleeping", this.P.b(), this.P.b($$0));
            }

            for (aqn $$3 : this.H) {
               $$3.a($$1, true);
            }
         }
      }
   }

   public void e() {
      if (!this.H.isEmpty() && this.P.a(this.H)) {
         this.at();
      }
   }

   public alc f() {
      return this.J.aL();
   }

   private void au() {
      boolean $$0 = this.ad();
      if (this.D_().g()) {
         if (this.ab().b(dcc.v)) {
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

         this.y = ayg.a(this.y, 0.0F, 1.0F);
         this.v = this.w;
         if (this.A.i()) {
            this.w += 0.01F;
         } else {
            this.w -= 0.01F;
         }

         this.w = ayg.a(this.w, 0.0F, 1.0F);
      }

      if (this.v != this.w) {
         this.J.ai().a(new acu(acu.i, this.w), this.af());
      }

      if (this.x != this.y) {
         this.J.ai().a(new acu(acu.j, this.y), this.af());
      }

      if ($$0 != this.ad()) {
         if ($$0) {
            this.J.ai().a(new acu(acu.d, 0.0F));
         } else {
            this.J.ai().a(new acu(acu.c, 0.0F));
         }

         this.J.ai().a(new acu(acu.i, this.w));
         this.J.ai().a(new acu(acu.j, this.y));
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

   private void a(ja $$0, eoi $$1) {
      eoj $$2 = this.b_($$0);
      if ($$2.b($$1)) {
         $$2.a((dcg)this, $$0);
      }
   }

   private void d(ja $$0, dfi $$1) {
      dsl $$2 = this.a_($$0);
      if ($$2.a($$1)) {
         $$2.a(this, $$0, this.z);
      }
   }

   public void a(bsh $$0) {
      $$0.bw();
      bmv $$1 = this.ag();
      $$0.ai++;
      this.ag().a(() -> lq.f.b($$0.am()).toString());
      $$1.d("tickNonPassenger");
      $$0.l();
      this.ag().c();

      for (bsh $$2 : $$0.cU()) {
         this.a($$0, $$2);
      }
   }

   private void a(bsh $$0, bsh $$1) {
      if ($$1.dM() || $$1.de() != $$0) {
         $$1.ad();
      } else if ($$1 instanceof cml || this.M.c($$1)) {
         $$1.bw();
         $$1.ai++;
         bmv $$2 = this.ag();
         $$2.a(() -> lq.f.b($$1.am()).toString());
         $$2.d("tickPassenger");
         $$1.u();
         $$2.c();

         for (bsh $$3 : $$1.cU()) {
            this.a($$1, $$3);
         }
      }
   }

   @Override
   public boolean a(cml $$0, ja $$1) {
      return !this.J.a(this, $$1, $$0) && this.C_().a($$1);
   }

   public void a(@Nullable ayn $$0, boolean $$1, boolean $$2) {
      aqk $$3 = this.l();
      if (!$$2) {
         if ($$0 != null) {
            $$0.a(wu.c("menu.savingLevel"));
         }

         this.av();
         if ($$0 != null) {
            $$0.c(wu.c("menu.savingChunks"));
         }

         $$3.a($$1);
         if ($$1) {
            this.N.c();
         } else {
            this.N.b();
         }
      }
   }

   private void av() {
      if (this.ab != null) {
         this.J.bc().a(this.ab.b());
      }

      this.l().k().a();
   }

   public <T extends bsh> List<? extends T> a(dwv<bsh, T> $$0, Predicate<? super T> $$1) {
      List<T> $$2 = Lists.newArrayList();
      this.a($$0, $$1, $$2);
      return $$2;
   }

   public <T extends bsh> void a(dwv<bsh, T> $$0, Predicate<? super T> $$1, List<? super T> $$2) {
      this.a($$0, $$1, $$2, Integer.MAX_VALUE);
   }

   public <T extends bsh> void a(dwv<bsh, T> $$0, Predicate<? super T> $$1, List<? super T> $$2, int $$3) {
      this.G().a($$0, $$3x -> {
         if ($$1.test((T)$$3x)) {
            $$2.add((T)$$3x);
            if ($$2.size() >= $$3) {
               return aws.a.b;
            }
         }

         return aws.a.a;
      });
   }

   public List<? extends cho> i() {
      return this.a(bsn.F, btc::bF);
   }

   public List<aqn> a(Predicate<? super aqn> $$0) {
      return this.a($$0, Integer.MAX_VALUE);
   }

   public List<aqn> a(Predicate<? super aqn> $$0, int $$1) {
      List<aqn> $$2 = Lists.newArrayList();

      for (aqn $$3 : this.H) {
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
   public aqn j() {
      List<aqn> $$0 = this.a(btc::bF);
      return $$0.isEmpty() ? null : $$0.get(this.z.a($$0.size()));
   }

   @Override
   public boolean b(bsh $$0) {
      return this.j($$0);
   }

   public boolean c(bsh $$0) {
      return this.j($$0);
   }

   public void d(bsh $$0) {
      if ($$0 instanceof aqn $$1) {
         this.c($$1);
      } else {
         this.j($$0);
      }
   }

   public void a(aqn $$0) {
      this.c($$0);
   }

   public void b(aqn $$0) {
      this.c($$0);
   }

   private void c(aqn $$0) {
      bsh $$1 = this.G().a($$0.cB());
      if ($$1 != null) {
         E.warn("Force-added player with duplicate UUID {}", $$0.cB());
         $$1.ak();
         this.a((aqn)$$1, bsh.d.b);
      }

      this.N.a($$0);
   }

   private boolean j(bsh $$0) {
      if ($$0.dM()) {
         E.warn("Tried to add entity {} but it was marked as removed already", bsn.a($$0.am()));
         return false;
      } else {
         return this.N.a($$0);
      }
   }

   public boolean e(bsh $$0) {
      if ($$0.cW().map(bsh::cB).anyMatch(this.N::a)) {
         return false;
      } else {
         this.a_($$0);
         return true;
      }
   }

   public void a(dur $$0) {
      $$0.I();
      $$0.b(this);
   }

   public void a(aqn $$0, bsh.d $$1) {
      $$0.a($$1);
   }

   @Override
   public void a(int $$0, ja $$1, int $$2) {
      for (aqn $$3 : this.J.ai().t()) {
         if ($$3 != null && $$3.dR() == this && $$3.an() != $$0) {
            double $$4 = (double)$$1.u() - $$3.dw();
            double $$5 = (double)$$1.v() - $$3.dy();
            double $$6 = (double)$$1.w() - $$3.dC();
            if ($$4 * $$4 + $$5 * $$5 + $$6 * $$6 < 1024.0) {
               $$3.c.b(new abt($$0, $$1, $$2));
            }
         }
      }
   }

   @Override
   public void a(@Nullable cml $$0, double $$1, double $$2, double $$3, jj<avg> $$4, avi $$5, float $$6, float $$7, long $$8) {
      this.J.ai().a($$0, $$1, $$2, $$3, (double)$$4.a().a($$6), this.af(), new afi($$4, $$5, $$1, $$2, $$3, $$6, $$7, $$8));
   }

   @Override
   public void a(@Nullable cml $$0, bsh $$1, jj<avg> $$2, avi $$3, float $$4, float $$5, long $$6) {
      this.J.ai().a($$0, $$1.dw(), $$1.dy(), $$1.dC(), (double)$$2.a().a($$4), this.af(), new afh($$2, $$3, $$1, $$4, $$5, $$6));
   }

   @Override
   public void b(int $$0, ja $$1, int $$2) {
      if (this.ab().b(dcc.W)) {
         this.J.ai().a(new ada($$0, $$1, $$2, true));
      } else {
         this.a(null, $$0, $$1, $$2);
      }
   }

   @Override
   public void a(@Nullable cml $$0, int $$1, ja $$2, int $$3) {
      this.J.ai().a($$0, (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), 64.0, this.af(), new ada($$1, $$2, $$3, false));
   }

   public int k() {
      return this.D_().p();
   }

   @Override
   public void a(jj<dxh> $$0, ewh $$1, dxh.a $$2) {
      this.O.a($$0, $$1, $$2);
   }

   @Override
   public void a(ja $$0, dsl $$1, dsl $$2, int $$3) {
      if (this.W) {
         String $$4 = "recursive call to sendBlockUpdated";
         ac.a("recursive call to sendBlockUpdated", new IllegalStateException("recursive call to sendBlockUpdated"));
      }

      this.l().a($$0);
      this.U.a($$0);
      exa $$5 = $$1.k(this, $$0);
      exa $$6 = $$2.k(this, $$0);
      if (ewx.c($$5, $$6, ewl.g)) {
         List<cco> $$7 = new ObjectArrayList();

         for (bte $$8 : this.V) {
            cco $$9 = $$8.J();
            if ($$9.b($$0)) {
               $$7.add($$9);
            }
         }

         try {
            this.W = true;

            for (cco $$10 : $$7) {
               $$10.i();
            }
         } finally {
            this.W = false;
         }
      }
   }

   @Override
   public void a(ja $$0, dfi $$1) {
      this.s.a($$0, $$1, null);
   }

   @Override
   public void a(ja $$0, dfi $$1, jf $$2) {
      this.s.a($$0, $$1, $$2);
   }

   @Override
   public void a(ja $$0, dfi $$1, ja $$2) {
      this.s.a($$0, $$1, $$2);
   }

   @Override
   public void a(dsl $$0, ja $$1, dfi $$2, ja $$3, boolean $$4) {
      this.s.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public void a(bsh $$0, byte $$1) {
      this.l().a($$0, new acr($$0, $$1));
   }

   @Override
   public void a(bsh $$0, bra $$1) {
      this.l().a($$0, new acn($$0, $$1));
   }

   public aqk l() {
      return this.I;
   }

   @Override
   public dby a(
      @Nullable bsh $$0,
      @Nullable bra $$1,
      @Nullable dbz $$2,
      double $$3,
      double $$4,
      double $$5,
      float $$6,
      boolean $$7,
      dcg.a $$8,
      lh $$9,
      lh $$10,
      jj<avg> $$11
   ) {
      dby $$12 = this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, false, $$9, $$10, $$11);
      if (!$$12.d()) {
         $$12.h();
      }

      for (aqn $$13 : this.H) {
         if ($$13.i($$3, $$4, $$5) < 4096.0) {
            $$13.c.b(new acs($$3, $$4, $$5, $$6, $$12.i(), $$12.e().get($$13), $$12.j(), $$12.k(), $$12.l(), $$12.m()));
         }
      }

      return $$12;
   }

   @Override
   public void a(ja $$0, dfi $$1, int $$2, int $$3) {
      this.X.add(new dbl($$0, $$1, $$2, $$3));
   }

   private void aw() {
      this.Y.clear();

      while (!this.X.isEmpty()) {
         dbl $$0 = (dbl)this.X.removeFirst();
         if (this.n($$0.a())) {
            if (this.a($$0)) {
               this.J.ai().a(null, (double)$$0.a().u(), (double)$$0.a().v(), (double)$$0.a().w(), 64.0, this.af(), new abv($$0.a(), $$0.b(), $$0.c(), $$0.d()));
            }
         } else {
            this.Y.add($$0);
         }
      }

      this.X.addAll(this.Y);
   }

   private boolean a(dbl $$0) {
      dsl $$1 = this.a_($$0.a());
      return $$1.a($$0.b()) ? $$1.a(this, $$0.a(), $$0.c(), $$0.d()) : false;
   }

   public exv<dfi> m() {
      return this.S;
   }

   public exv<eoi> n() {
      return this.T;
   }

   @Nonnull
   @Override
   public MinecraftServer o() {
      return this.J;
   }

   public epi p() {
      return this.R;
   }

   public emz q() {
      return this.J.bb();
   }

   public <T extends lh> int a(T $$0, double $$1, double $$2, double $$3, int $$4, double $$5, double $$6, double $$7, double $$8) {
      adb $$9 = new adb($$0, false, $$1, $$2, $$3, (float)$$5, (float)$$6, (float)$$7, (float)$$8, $$4);
      int $$10 = 0;

      for (int $$11 = 0; $$11 < this.H.size(); $$11++) {
         aqn $$12 = this.H.get($$11);
         if (this.a($$12, false, $$1, $$2, $$3, $$9)) {
            $$10++;
         }
      }

      return $$10;
   }

   public <T extends lh> boolean a(aqn $$0, T $$1, boolean $$2, double $$3, double $$4, double $$5, int $$6, double $$7, double $$8, double $$9, double $$10) {
      zb<?> $$11 = new adb($$1, $$2, $$3, $$4, $$5, (float)$$7, (float)$$8, (float)$$9, (float)$$10, $$6);
      return this.a($$0, $$2, $$3, $$4, $$5, $$11);
   }

   private boolean a(aqn $$0, boolean $$1, double $$2, double $$3, double $$4, zb<?> $$5) {
      if ($$0.dR() != this) {
         return false;
      } else {
         ja $$6 = $$0.dr();
         if ($$6.a(new ewh($$2, $$3, $$4), $$1 ? 512.0 : 32.0)) {
            $$0.c.b($$5);
            return true;
         } else {
            return false;
         }
      }
   }

   @Nullable
   @Override
   public bsh a(int $$0) {
      return this.G().a($$0);
   }

   @Deprecated
   @Nullable
   public bsh b(int $$0) {
      bsh $$1 = this.G().a($$0);
      return $$1 != null ? $$1 : (bsh)this.ac.get($$0);
   }

   @Nullable
   public bsh a(UUID $$0) {
      return this.G().a($$0);
   }

   @Nullable
   public ja a(awm<eix> $$0, ja $$1, int $$2, boolean $$3) {
      if (!this.J.bc().y().c()) {
         return null;
      } else {
         Optional<jn.c<eix>> $$4 = this.H_().d(lr.aQ).b($$0);
         if ($$4.isEmpty()) {
            return null;
         } else {
            Pair<ja, jj<eix>> $$5 = this.l().g().a(this, $$4.get(), $$1, $$2, $$3);
            return $$5 != null ? (ja)$$5.getFirst() : null;
         }
      }
   }

   @Nullable
   public Pair<ja, jj<ddg>> a(Predicate<jj<ddg>> $$0, ja $$1, int $$2, int $$3, int $$4) {
      return this.l().g().d().a($$1, $$2, $$3, $$4, $$0, this.l().i().b(), this);
   }

   @Override
   public cyn r() {
      return this.J.aK();
   }

   @Override
   public bqs s() {
      return this.J.aR();
   }

   @Override
   public boolean t() {
      return this.e;
   }

   public eqe u() {
      return this.l().k();
   }

   @Nullable
   @Override
   public epy a(epw $$0) {
      return this.o().J().u().b(epy.a(), $$0.a());
   }

   @Override
   public void a(epw $$0, epy $$1) {
      this.o().J().u().a($$0.a(), $$1);
   }

   @Override
   public epw v() {
      return this.o().J().u().a(epx.a(), "idcounts").b();
   }

   public void a(ja $$0, float $$1) {
      ja $$2 = this.A.a();
      float $$3 = this.A.b();
      if (!$$2.equals($$0) || $$3 != $$1) {
         this.A.a($$0, $$1);
         this.o().ai().a(new aeq($$0, $$1));
      }

      if (this.L > 1) {
         this.l().b(aqr.a, new dbn($$2), this.L, azk.a);
      }

      int $$4 = this.ab().c(dcc.Z) + 1;
      if ($$4 > 1) {
         this.l().a(aqr.a, new dbn($$0), $$4, azk.a);
      }

      this.L = $$4;
   }

   public LongSet w() {
      dcb $$0 = this.u().b(dcb.a(), "chunks");
      return (LongSet)($$0 != null ? LongSets.unmodifiable($$0.b()) : LongSets.EMPTY_SET);
   }

   public boolean a(int $$0, int $$1, boolean $$2) {
      dcb $$3 = this.u().a(dcb.a(), "chunks");
      dbn $$4 = new dbn($$0, $$1);
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
   public List<aqn> x() {
      return this.H;
   }

   @Override
   public void a(ja $$0, dsl $$1, dsl $$2) {
      Optional<jj<cej>> $$3 = cek.a($$1);
      Optional<jj<cej>> $$4 = cek.a($$2);
      if (!Objects.equals($$3, $$4)) {
         ja $$5 = $$0.i();
         $$3.ifPresent($$1x -> this.o().execute(() -> {
               this.y().a($$5);
               afy.b(this, $$5);
            }));
         $$4.ifPresent($$1x -> this.o().execute(() -> {
               this.y().a($$5, $$1x);
               afy.a(this, $$5);
            }));
      }
   }

   public ceg y() {
      return this.l().l();
   }

   public boolean c(ja $$0) {
      return this.a($$0, 1);
   }

   public boolean a(kc $$0) {
      return this.c($$0.q());
   }

   public boolean a(ja $$0, int $$1) {
      return $$1 > 6 ? false : this.b(kc.a($$0)) <= $$1;
   }

   public int b(kc $$0) {
      return this.y().a($$0);
   }

   public cny z() {
      return this.f;
   }

   @Nullable
   public cnw d(ja $$0) {
      return this.f.a($$0, 9216);
   }

   public boolean e(ja $$0) {
      return this.d($$0) != null;
   }

   public void a(ced $$0, bsh $$1, btr $$2) {
      $$2.a($$0, $$1);
   }

   public void a(Path $$0) throws IOException {
      apt $$1 = this.l().a;

      try (Writer $$2 = Files.newBufferedWriter($$0.resolve("stats.txt"))) {
         $$2.write(String.format(Locale.ROOT, "spawning_chunks: %d\n", $$1.j().b()));
         dcr.d $$3 = this.l().n();
         if ($$3 != null) {
            ObjectIterator $$9 = $$3.b().object2IntEntrySet().iterator();

            while ($$9.hasNext()) {
               Entry<btf> $$4 = (Entry<btf>)$$9.next();
               $$2.write(String.format(Locale.ROOT, "spawn_count.%s: %d\n", ((btf)$$4.getKey()).a(), $$4.getIntValue()));
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

   private static void a(Writer $$0, Iterable<bsh> $$1) throws IOException {
      axf $$2 = axf.a().a("x").a("y").a("z").a("uuid").a("type").a("alive").a("display_name").a("custom_name").a($$0);

      for (bsh $$3 : $$1) {
         wu $$4 = $$3.aj();
         wu $$5 = $$3.O_();
         $$2.a($$3.dw(), $$3.dy(), $$3.dC(), $$3.cB(), lq.f.b($$3.am()), $$3.bF(), $$5.getString(), $$4 != null ? $$4.getString() : null);
      }
   }

   private void a(Writer $$0) throws IOException {
      axf $$1 = axf.a().a("x").a("y").a("z").a("type").a($$0);

      for (drj $$2 : this.r) {
         ja $$3 = $$2.c();
         $$1.a($$3.u(), $$3.v(), $$3.w(), $$2.d());
      }
   }

   @VisibleForTesting
   public void a(eip $$0) {
      this.X.removeIf($$1 -> $$0.b($$1.a()));
   }

   @Override
   public void b(ja $$0, dfi $$1) {
      if (!this.ai()) {
         this.a($$0, $$1);
      }
   }

   @Override
   public float a(jf $$0, boolean $$1) {
      return 1.0F;
   }

   public Iterable<bsh> A() {
      return this.G().a();
   }

   @Override
   public String toString() {
      return "ServerLevel[" + this.K.e() + "]";
   }

   public boolean B() {
      return this.J.bc().z();
   }

   @Override
   public long C() {
      return this.J.bc().y().b();
   }

   @Nullable
   public dwj D() {
      return this.ab;
   }

   @Override
   public aqm E() {
      return this;
   }

   @VisibleForTesting
   public String F() {
      return String.format(
         Locale.ROOT,
         "players: %s, entities: %s [%s], block_entities: %d [%s], block_ticks: %d, fluid_ticks: %d, chunk_source: %s",
         this.H.size(),
         this.N.e(),
         a(this.N.d().a(), $$0 -> lq.f.b($$0.am()).toString()),
         this.r.size(),
         a(this.r, drj::d),
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

   public static void a(aqm $$0) {
      ja $$1 = a;
      int $$2 = $$1.u();
      int $$3 = $$1.v() - 2;
      int $$4 = $$1.w();
      ja.b($$2 - 2, $$3 + 1, $$4 - 2, $$2 + 2, $$3 + 3, $$4 + 2).forEach($$1x -> $$0.b($$1x, dfk.a.o()));
      ja.b($$2 - 2, $$3, $$4 - 2, $$2 + 2, $$3, $$4 + 2).forEach($$1x -> $$0.b($$1x, dfk.co.o()));
   }

   @Override
   protected dwx<bsh> G() {
      return this.N.d();
   }

   public void a(Stream<bsh> $$0) {
      this.N.a($$0);
   }

   public void b(Stream<bsh> $$0) {
      this.N.b($$0);
   }

   public void b(dur $$0) {
      $$0.c(this.A_().c());
   }

   public void a(duh $$0) {
      this.J.execute(() -> this.ae.a($$0.f(), $$0.g()));
   }

   public epb H() {
      return this.U;
   }

   @Override
   public void close() throws IOException {
      super.close();
      this.N.close();
   }

   @Override
   public String I() {
      return "Chunks[S] W: " + this.I.e() + " E: " + this.N.e();
   }

   public boolean c(long $$0) {
      return this.N.a($$0);
   }

   private boolean d(long $$0) {
      return this.c($$0) && this.I.a($$0);
   }

   public boolean f(ja $$0) {
      return this.N.a($$0) && this.I.a.j().c(dbn.a($$0));
   }

   public boolean g(ja $$0) {
      return this.N.a($$0);
   }

   public boolean a(dbn $$0) {
      return this.N.a($$0);
   }

   @Override
   public coz J() {
      return this.J.bc().K();
   }

   @Override
   public cwd K() {
      return this.J.bq();
   }

   public ayo a(akk $$0) {
      return this.ag.a($$0);
   }

   public bqo L() {
      return this.ag;
   }

   @Override
   public p a(o $$0) {
      p $$1 = super.a($$0);
      $$1.a("Loaded entity count", () -> String.valueOf(this.N.f()));
      return $$1;
   }

   final class a implements dww<bsh> {
      public void a(bsh $$0) {
      }

      public void b(bsh $$0) {
         aqm.this.f().a($$0);
      }

      public void c(bsh $$0) {
         aqm.this.M.a($$0);
      }

      public void d(bsh $$0) {
         aqm.this.M.b($$0);
      }

      public void e(bsh $$0) {
         aqm.this.l().b($$0);
         if ($$0 instanceof aqn $$1) {
            aqm.this.H.add($$1);
            aqm.this.e();
         }

         if ($$0 instanceof bte $$2) {
            if (aqm.this.W) {
               String $$3 = "onTrackingStart called during navigation iteration";
               ac.a("onTrackingStart called during navigation iteration", new IllegalStateException("onTrackingStart called during navigation iteration"));
            }

            aqm.this.V.add($$2);
         }

         if ($$0 instanceof cho $$4) {
            for (chm $$5 : $$4.gj()) {
               aqm.this.ac.put($$5.an(), $$5);
            }
         }

         $$0.a(dxe::a);
      }

      public void f(bsh $$0) {
         aqm.this.l().a($$0);
         if ($$0 instanceof aqn $$1) {
            aqm.this.H.remove($$1);
            aqm.this.e();
         }

         if ($$0 instanceof bte $$2) {
            if (aqm.this.W) {
               String $$3 = "onTrackingStart called during navigation iteration";
               ac.a("onTrackingStart called during navigation iteration", new IllegalStateException("onTrackingStart called during navigation iteration"));
            }

            aqm.this.V.remove($$2);
         }

         if ($$0 instanceof cho $$4) {
            for (chm $$5 : $$4.gj()) {
               aqm.this.ac.remove($$5.an());
            }
         }

         $$0.a(dxe::b);
      }

      public void g(bsh $$0) {
         $$0.a(dxe::c);
      }
   }
}
