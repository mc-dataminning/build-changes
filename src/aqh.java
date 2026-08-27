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

public class aqh extends dad implements day {
   public static final in a = new in(100, 50, 0);
   public static final bor b = box.a(12000, 180000);
   public static final bor c = box.a(12000, 24000);
   private static final bor D = box.a(12000, 180000);
   public static final bor d = box.a(3600, 15600);
   private static final Logger E = LogUtils.getLogger();
   private static final int F = 300;
   private static final int G = 65536;
   final List<aqi> H = Lists.newArrayList();
   private final aqf I;
   private final MinecraftServer J;
   private final eog K;
   private int L;
   final dun M = new dun();
   private final dus<brh> N;
   private final dvb O;
   public boolean e;
   private final auh P;
   private int Q;
   private final emy R;
   private final evd<dde> S = new evd<>(this::d, this.ag());
   private final evd<elz> T = new evd<>(this::d, this.ag());
   private final ems U = new ems();
   final Set<bsc> V = new ObjectOpenHashSet();
   volatile boolean W;
   protected final cmu f;
   private final ObjectLinkedOpenHashSet<czi> X = new ObjectLinkedOpenHashSet();
   private final List<czi> Y = new ArrayList<>(64);
   private boolean Z;
   private final List<czq> aa;
   @Nullable
   private duc ab;
   final Int2ObjectMap<cgj> ac = new Int2ObjectOpenHashMap();
   private final daw ad;
   private final egq ae;
   private final boolean af;
   private final bpt ag;

   public aqh(
      MinecraftServer $$0,
      Executor $$1,
      eob.c $$2,
      eog $$3,
      akg<dad> $$4,
      dua $$5,
      aqq $$6,
      boolean $$7,
      long $$8,
      List<czq> $$9,
      boolean $$10,
      @Nullable bpt $$11
   ) {
      super($$3, $$4, $$0.bc(), $$5.a(), $$0::aT, false, $$7, $$8, $$0.bl());
      this.af = $$10;
      this.J = $$0;
      this.aa = $$9;
      this.K = $$3;
      dse $$12 = $$5.b();
      boolean $$13 = $$0.aZ();
      DataFixer $$14 = $$0.aD();
      duk<brh> $$15 = new dtl(new dtv(new dtt($$2.f(), $$4, "entities"), $$2.a($$4).resolve("entities"), $$14, $$13, azf.s), this, $$0);
      this.N = new dus<>(brh.class, new aqh.a(), $$15);
      this.I = new aqf(this, $$2, $$14, $$0.ba(), $$1, $$12, $$0.ah().p(), $$0.ah().q(), $$13, $$6, this.N::a, () -> $$0.I().u());
      this.I.h().b();
      this.R = new emy(this);
      this.T();
      this.W();
      this.C_().a($$0.ax());
      this.f = this.u().a(cmu.a(this), cmu.a(this.ad()));
      if (!$$0.T()) {
         $$3.a($$0.u_());
      }

      long $$16 = $$0.bb().y().b();
      this.ae = new egq(this.I.m(), this.H_(), $$0.ba(), $$4, $$12, this.I.i(), this, $$12.c(), $$16, $$14);
      this.ad = new daw(this, $$0.bb().y(), this.ae);
      if (this.ae() == dad.j && this.ad().a(dtx.c)) {
         this.ab = new duc(this, $$16, $$0.bb().C());
      } else {
         this.ab = null;
      }

      this.P = new auh();
      this.O = new dvb(this);
      this.ag = Objects.requireNonNullElseGet($$11, () -> this.u().a(bpt.a($$16), "random_sequences"));
   }

   @Deprecated
   @VisibleForTesting
   public void a(@Nullable duc $$0) {
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
   public iw<dbc> a(int $$0, int $$1, int $$2) {
      return this.l().g().c().getNoiseBiome($$0, $$1, $$2, this.l().i().b());
   }

   public daw a() {
      return this.ad;
   }

   public void a(BooleanSupplier $$0) {
      bma $$1 = this.af();
      this.Z = true;
      bpx $$2 = this.s();
      boolean $$3 = $$2.i();
      if ($$3) {
         $$1.a("world border");
         this.C_().s();
         $$1.b("weather");
         this.at();
      }

      int $$4 = this.aa().c(czz.P);
      if (this.P.a($$4) && this.P.a($$4, this.H)) {
         if (this.aa().b(czz.l)) {
            long $$5 = this.A.d() + 24000L;
            this.b($$5 - $$5 % 24000L);
         }

         this.ar();
         if (this.aa().b(czz.v) && this.ac()) {
            this.g();
         }
      }

      this.T();
      if ($$3) {
         this.b();
      }

      $$1.b("tickPending");
      if (!this.ah() && $$3) {
         long $$6 = this.Y();
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
            if (!$$2x.dI()) {
               if (this.i($$2x)) {
                  $$2x.am();
               } else if (!$$2.a($$2x)) {
                  $$1.a("checkDespawn");
                  $$2x.dz();
                  $$1.c();
                  if (this.I.a.j().c($$2x.dp().a())) {
                     brh $$3x = $$2x.da();
                     if ($$3x != null) {
                        if (!$$3x.dI() && $$3x.x($$2x)) {
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
         this.S();
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
         if (this.A.o().b(czz.l)) {
            this.b(this.A.d() + 1L);
         }
      }
   }

   public void b(long $$0) {
      this.K.b($$0);
   }

   public void a(boolean $$0, boolean $$1) {
      for (czq $$2 : this.aa) {
         $$2.a(this, $$0, $$1);
      }
   }

   private boolean i(brh $$0) {
      return this.J.ab() || !($$0 instanceof cdp) && !($$0 instanceof cer) ? !this.J.ac() && $$0 instanceof ckt : true;
   }

   private void ar() {
      this.P.a();
      this.H.stream().filter(bsa::fJ).collect(Collectors.toList()).forEach($$0 -> $$0.a(false, false));
   }

   public void a(dsn $$0, int $$1) {
      czk $$2 = $$0.f();
      boolean $$3 = this.ac();
      int $$4 = $$2.d();
      int $$5 = $$2.e();
      bma $$6 = this.af();
      $$6.a("thunder");
      if ($$3 && this.ab() && this.z.a(100000) == 0) {
         in $$7 = this.b(this.a($$4, 0, $$5, 15));
         if (this.r($$7)) {
            bpk $$8 = this.d_($$7);
            boolean $$9 = this.aa().b(czz.e) && this.z.j() < (double)$$8.b() * 0.01 && !this.a_($$7.d()).a(ddg.ss);
            if ($$9) {
               cfz $$10 = brn.aN.a((dad)this);
               if ($$10 != null) {
                  $$10.w(true);
                  $$10.c_(0);
                  $$10.a_((double)$$7.u(), (double)$$7.v(), (double)$$7.w());
                  this.b($$10);
               }
            }

            brz $$11 = brn.al.a((dad)this);
            if ($$11 != null) {
               $$11.e(etp.c($$7));
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
         dso[] $$13 = $$0.d();

         for (int $$14 = 0; $$14 < $$13.length; $$14++) {
            dso $$15 = $$13[$$14];
            if ($$15.d()) {
               int $$16 = $$0.g($$14);
               int $$17 = jp.c($$16);

               for (int $$18 = 0; $$18 < $$1; $$18++) {
                  in $$19 = this.a($$4, $$17, $$5, 15);
                  $$6.a("randomTick");
                  dqh $$20 = $$15.a($$19.u() - $$4, $$19.v() - $$17, $$19.w() - $$5);
                  if ($$20.v()) {
                     $$20.b(this, $$19, this.z);
                  }

                  ema $$21 = $$20.u();
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
   public void a(in $$0) {
      in $$1 = this.a(dvz.a.e, $$0);
      in $$2 = $$1.d();
      dbc $$3 = this.t($$1).a();
      if ($$3.a(this, $$2)) {
         this.b($$2, ddg.dO.n());
      }

      if (this.ac()) {
         int $$4 = this.aa().c(czz.T);
         if ($$4 > 0 && $$3.b(this, $$1)) {
            dqh $$5 = this.a_($$1);
            if ($$5.a(ddg.dN)) {
               int $$6 = $$5.c(dkn.c);
               if ($$6 < Math.min($$4, 8)) {
                  dqh $$7 = $$5.a(dkn.c, Integer.valueOf($$6 + 1));
                  dde.a($$5, $$7, this, $$1);
                  this.b($$1, $$7);
               }
            } else {
               this.b($$1, ddg.dN.n());
            }
         }

         dbc.c $$8 = $$3.a($$2);
         if ($$8 != dbc.c.a) {
            dqh $$9 = this.a_($$2);
            $$9.b().a($$9, this, $$2, $$8);
         }
      }
   }

   private Optional<in> E(in $$0) {
      Optional<in> $$1 = this.y().e($$0x -> $$0x.a(cdh.t), $$0x -> $$0x.v() == this.a(dvz.a.b, $$0x.u(), $$0x.w()) - 1, $$0, 128, cdd.b.c);
      return $$1.map($$0x -> $$0x.b(1));
   }

   protected in b(in $$0) {
      in $$1 = this.a(dvz.a.e, $$0);
      Optional<in> $$2 = this.E($$1);
      if ($$2.isPresent()) {
         return $$2.get();
      } else {
         etk $$3 = etk.a($$1, new in($$1.h(this.al()))).g(3.0);
         List<bsa> $$4 = this.a(bsa.class, $$3, $$0x -> $$0x != null && $$0x.bB() && this.h($$0x.dn()));
         if (!$$4.isEmpty()) {
            return $$4.get(this.z.a($$4.size())).dn();
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
      return this.aa().c(czz.P) <= 100;
   }

   private void as() {
      if (this.d()) {
         if (!this.o().T() || this.o().r()) {
            int $$0 = this.aa().c(czz.P);
            wu $$1;
            if (this.P.a($$0)) {
               $$1 = wu.c("sleep.skipping_night");
            } else {
               $$1 = wu.a("sleep.players_sleeping", this.P.b(), this.P.b($$0));
            }

            for (aqi $$3 : this.H) {
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

   public akz f() {
      return this.J.aK();
   }

   private void at() {
      boolean $$0 = this.ac();
      if (this.D_().g()) {
         if (this.aa().b(czz.v)) {
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

         this.y = axz.a(this.y, 0.0F, 1.0F);
         this.v = this.w;
         if (this.A.i()) {
            this.w += 0.01F;
         } else {
            this.w -= 0.01F;
         }

         this.w = axz.a(this.w, 0.0F, 1.0F);
      }

      if (this.v != this.w) {
         this.J.ah().a(new act(act.i, this.w), this.ae());
      }

      if (this.x != this.y) {
         this.J.ah().a(new act(act.j, this.y), this.ae());
      }

      if ($$0 != this.ac()) {
         if ($$0) {
            this.J.ah().a(new act(act.d, 0.0F));
         } else {
            this.J.ah().a(new act(act.c, 0.0F));
         }

         this.J.ah().a(new act(act.i, this.w));
         this.J.ah().a(new act(act.j, this.y));
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

   private void a(in $$0, elz $$1) {
      ema $$2 = this.b_($$0);
      if ($$2.b($$1)) {
         $$2.a((dad)this, $$0);
      }
   }

   private void d(in $$0, dde $$1) {
      dqh $$2 = this.a_($$0);
      if ($$2.a($$1)) {
         $$2.a(this, $$0, this.z);
      }
   }

   public void a(brh $$0) {
      $$0.bs();
      bma $$1 = this.af();
      $$0.ai++;
      this.af().a(() -> ld.g.b($$0.ai()).toString());
      $$1.d("tickNonPassenger");
      $$0.l();
      this.af().c();

      for (brh $$2 : $$0.cQ()) {
         this.a($$0, $$2);
      }
   }

   private void a(brh $$0, brh $$1) {
      if ($$1.dI() || $$1.da() != $$0) {
         $$1.ac();
      } else if ($$1 instanceof clh || this.M.c($$1)) {
         $$1.bs();
         $$1.ai++;
         bma $$2 = this.af();
         $$2.a(() -> ld.g.b($$1.ai()).toString());
         $$2.d("tickPassenger");
         $$1.t();
         $$2.c();

         for (brh $$3 : $$1.cQ()) {
            this.a($$1, $$3);
         }
      }
   }

   @Override
   public boolean a(clh $$0, in $$1) {
      return !this.J.a(this, $$1, $$0) && this.C_().a($$1);
   }

   public void a(@Nullable ayf $$0, boolean $$1, boolean $$2) {
      aqf $$3 = this.l();
      if (!$$2) {
         if ($$0 != null) {
            $$0.a(wu.c("menu.savingLevel"));
         }

         this.au();
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

   private void au() {
      if (this.ab != null) {
         this.J.bb().a(this.ab.b());
      }

      this.l().k().a();
   }

   public <T extends brh> List<? extends T> a(duo<brh, T> $$0, Predicate<? super T> $$1) {
      List<T> $$2 = Lists.newArrayList();
      this.a($$0, $$1, $$2);
      return $$2;
   }

   public <T extends brh> void a(duo<brh, T> $$0, Predicate<? super T> $$1, List<? super T> $$2) {
      this.a($$0, $$1, $$2, Integer.MAX_VALUE);
   }

   public <T extends brh> void a(duo<brh, T> $$0, Predicate<? super T> $$1, List<? super T> $$2, int $$3) {
      this.G().a($$0, $$3x -> {
         if ($$1.test((T)$$3x)) {
            $$2.add((T)$$3x);
            if ($$2.size() >= $$3) {
               return awm.a.b;
            }
         }

         return awm.a.a;
      });
   }

   public List<? extends cgl> i() {
      return this.a(brn.F, bsa::bB);
   }

   public List<aqi> a(Predicate<? super aqi> $$0) {
      return this.a($$0, Integer.MAX_VALUE);
   }

   public List<aqi> a(Predicate<? super aqi> $$0, int $$1) {
      List<aqi> $$2 = Lists.newArrayList();

      for (aqi $$3 : this.H) {
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
   public aqi j() {
      List<aqi> $$0 = this.a(bsa::bB);
      return $$0.isEmpty() ? null : $$0.get(this.z.a($$0.size()));
   }

   @Override
   public boolean b(brh $$0) {
      return this.j($$0);
   }

   public boolean c(brh $$0) {
      return this.j($$0);
   }

   public void d(brh $$0) {
      this.j($$0);
   }

   public void a(aqi $$0) {
      this.e($$0);
   }

   public void b(aqi $$0) {
      this.e($$0);
   }

   public void c(aqi $$0) {
      this.e($$0);
   }

   public void d(aqi $$0) {
      this.e($$0);
   }

   private void e(aqi $$0) {
      brh $$1 = this.G().a($$0.cx());
      if ($$1 != null) {
         E.warn("Force-added player with duplicate UUID {}", $$0.cx());
         $$1.ag();
         this.a((aqi)$$1, brh.c.b);
      }

      this.N.a($$0);
   }

   private boolean j(brh $$0) {
      if ($$0.dI()) {
         E.warn("Tried to add entity {} but it was marked as removed already", brn.a($$0.ai()));
         return false;
      } else {
         return this.N.a($$0);
      }
   }

   public boolean e(brh $$0) {
      if ($$0.cS().map(brh::cx).anyMatch(this.N::a)) {
         return false;
      } else {
         this.a_($$0);
         return true;
      }
   }

   public void a(dsn $$0) {
      $$0.I();
      $$0.b(this);
   }

   public void a(aqi $$0, brh.c $$1) {
      $$0.a($$1);
   }

   @Override
   public void a(int $$0, in $$1, int $$2) {
      for (aqi $$3 : this.J.ah().t()) {
         if ($$3 != null && $$3.dN() == this && $$3.aj() != $$0) {
            double $$4 = (double)$$1.u() - $$3.ds();
            double $$5 = (double)$$1.v() - $$3.du();
            double $$6 = (double)$$1.w() - $$3.dy();
            if ($$4 * $$4 + $$5 * $$5 + $$6 * $$6 < 1024.0) {
               $$3.d.b(new abs($$0, $$1, $$2));
            }
         }
      }
   }

   @Override
   public void a(@Nullable clh $$0, double $$1, double $$2, double $$3, iw<avb> $$4, avd $$5, float $$6, float $$7, long $$8) {
      this.J.ah().a($$0, $$1, $$2, $$3, (double)$$4.a().a($$6), this.ae(), new afg($$4, $$5, $$1, $$2, $$3, $$6, $$7, $$8));
   }

   @Override
   public void a(@Nullable clh $$0, brh $$1, iw<avb> $$2, avd $$3, float $$4, float $$5, long $$6) {
      this.J.ah().a($$0, $$1.ds(), $$1.du(), $$1.dy(), (double)$$2.a().a($$4), this.ae(), new aff($$2, $$3, $$1, $$4, $$5, $$6));
   }

   @Override
   public void b(int $$0, in $$1, int $$2) {
      if (this.aa().b(czz.W)) {
         this.J.ah().a(new acz($$0, $$1, $$2, true));
      } else {
         this.a(null, $$0, $$1, $$2);
      }
   }

   @Override
   public void a(@Nullable clh $$0, int $$1, in $$2, int $$3) {
      this.J.ah().a($$0, (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), 64.0, this.ae(), new acz($$1, $$2, $$3, false));
   }

   public int k() {
      return this.D_().p();
   }

   @Override
   public void a(iw<dva> $$0, etp $$1, dva.a $$2) {
      this.O.a($$0, $$1, $$2);
   }

   @Override
   public void a(in $$0, dqh $$1, dqh $$2, int $$3) {
      if (this.W) {
         String $$4 = "recursive call to sendBlockUpdated";
         ac.a("recursive call to sendBlockUpdated", new IllegalStateException("recursive call to sendBlockUpdated"));
      }

      this.l().a($$0);
      this.U.a($$0);
      eui $$5 = $$1.k(this, $$0);
      eui $$6 = $$2.k(this, $$0);
      if (euf.c($$5, $$6, ett.g)) {
         List<cbl> $$7 = new ObjectArrayList();

         for (bsc $$8 : this.V) {
            cbl $$9 = $$8.K();
            if ($$9.b($$0)) {
               $$7.add($$9);
            }
         }

         try {
            this.W = true;

            for (cbl $$10 : $$7) {
               $$10.i();
            }
         } finally {
            this.W = false;
         }
      }
   }

   @Override
   public void a(in $$0, dde $$1) {
      this.s.a($$0, $$1, null);
   }

   @Override
   public void a(in $$0, dde $$1, is $$2) {
      this.s.a($$0, $$1, $$2);
   }

   @Override
   public void a(in $$0, dde $$1, in $$2) {
      this.s.a($$0, $$1, $$2);
   }

   @Override
   public void a(dqh $$0, in $$1, dde $$2, in $$3, boolean $$4) {
      this.s.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public void a(brh $$0, byte $$1) {
      this.l().a($$0, new acq($$0, $$1));
   }

   @Override
   public void a(brh $$0, bqf $$1) {
      this.l().a($$0, new acm($$0, $$1));
   }

   public aqf l() {
      return this.I;
   }

   @Override
   public czv a(
      @Nullable brh $$0,
      @Nullable bqf $$1,
      @Nullable czw $$2,
      double $$3,
      double $$4,
      double $$5,
      float $$6,
      boolean $$7,
      dad.a $$8,
      kv $$9,
      kv $$10,
      iw<avb> $$11
   ) {
      czv $$12 = this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, false, $$9, $$10, $$11);
      if (!$$12.d()) {
         $$12.h();
      }

      for (aqi $$13 : this.H) {
         if ($$13.i($$3, $$4, $$5) < 4096.0) {
            $$13.d.b(new acr($$3, $$4, $$5, $$6, $$12.i(), $$12.e().get($$13), $$12.j(), $$12.k(), $$12.l(), $$12.m()));
         }
      }

      return $$12;
   }

   @Override
   public void a(in $$0, dde $$1, int $$2, int $$3) {
      this.X.add(new czi($$0, $$1, $$2, $$3));
   }

   private void av() {
      this.Y.clear();

      while (!this.X.isEmpty()) {
         czi $$0 = (czi)this.X.removeFirst();
         if (this.n($$0.a())) {
            if (this.a($$0)) {
               this.J.ah().a(null, (double)$$0.a().u(), (double)$$0.a().v(), (double)$$0.a().w(), 64.0, this.ae(), new abu($$0.a(), $$0.b(), $$0.c(), $$0.d()));
            }
         } else {
            this.Y.add($$0);
         }
      }

      this.X.addAll(this.Y);
   }

   private boolean a(czi $$0) {
      dqh $$1 = this.a_($$0.a());
      return $$1.a($$0.b()) ? $$1.a(this, $$0.a(), $$0.c(), $$0.d()) : false;
   }

   public evd<dde> m() {
      return this.S;
   }

   public evd<elz> n() {
      return this.T;
   }

   @Nonnull
   @Override
   public MinecraftServer o() {
      return this.J;
   }

   public emy p() {
      return this.R;
   }

   public ekq q() {
      return this.J.ba();
   }

   public <T extends kv> int a(T $$0, double $$1, double $$2, double $$3, int $$4, double $$5, double $$6, double $$7, double $$8) {
      ada $$9 = new ada($$0, false, $$1, $$2, $$3, (float)$$5, (float)$$6, (float)$$7, (float)$$8, $$4);
      int $$10 = 0;

      for (int $$11 = 0; $$11 < this.H.size(); $$11++) {
         aqi $$12 = this.H.get($$11);
         if (this.a($$12, false, $$1, $$2, $$3, $$9)) {
            $$10++;
         }
      }

      return $$10;
   }

   public <T extends kv> boolean a(aqi $$0, T $$1, boolean $$2, double $$3, double $$4, double $$5, int $$6, double $$7, double $$8, double $$9, double $$10) {
      zb<?> $$11 = new ada($$1, $$2, $$3, $$4, $$5, (float)$$7, (float)$$8, (float)$$9, (float)$$10, $$6);
      return this.a($$0, $$2, $$3, $$4, $$5, $$11);
   }

   private boolean a(aqi $$0, boolean $$1, double $$2, double $$3, double $$4, zb<?> $$5) {
      if ($$0.dN() != this) {
         return false;
      } else {
         in $$6 = $$0.dn();
         if ($$6.a(new etp($$2, $$3, $$4), $$1 ? 512.0 : 32.0)) {
            $$0.d.b($$5);
            return true;
         } else {
            return false;
         }
      }
   }

   @Nullable
   @Override
   public brh a(int $$0) {
      return this.G().a($$0);
   }

   @Deprecated
   @Nullable
   public brh b(int $$0) {
      brh $$1 = this.G().a($$0);
      return $$1 != null ? $$1 : (brh)this.ac.get($$0);
   }

   @Nullable
   public brh a(UUID $$0) {
      return this.G().a($$0);
   }

   @Nullable
   public in a(awg<egp> $$0, in $$1, int $$2, boolean $$3) {
      if (!this.J.bb().y().c()) {
         return null;
      } else {
         Optional<ja.c<egp>> $$4 = this.H_().d(le.aJ).b($$0);
         if ($$4.isEmpty()) {
            return null;
         } else {
            Pair<in, iw<egp>> $$5 = this.l().g().a(this, $$4.get(), $$1, $$2, $$3);
            return $$5 != null ? (in)$$5.getFirst() : null;
         }
      }
   }

   @Nullable
   public Pair<in, iw<dbc>> a(Predicate<iw<dbc>> $$0, in $$1, int $$2, int $$3, int $$4) {
      return this.l().g().c().a($$1, $$2, $$3, $$4, $$0, this.l().i().b(), this);
   }

   @Override
   public cxg r() {
      return this.J.aJ();
   }

   @Override
   public bpx s() {
      return this.J.aQ();
   }

   @Override
   public boolean t() {
      return this.e;
   }

   public env u() {
      return this.l().k();
   }

   @Nullable
   @Override
   public enp a(enn $$0) {
      return this.o().I().u().b(enp.a(), $$0.a());
   }

   @Override
   public void a(enn $$0, enp $$1) {
      this.o().I().u().a($$0.a(), $$1);
   }

   @Override
   public enn v() {
      return this.o().I().u().a(eno.a(), "idcounts").b();
   }

   public void a(in $$0, float $$1) {
      in $$2 = this.A.a();
      float $$3 = this.A.b();
      if (!$$2.equals($$0) || $$3 != $$1) {
         this.A.a($$0, $$1);
         this.o().ah().a(new aeo($$0, $$1));
      }

      if (this.L > 1) {
         this.l().b(aqm.a, new czk($$2), this.L, azb.a);
      }

      int $$4 = this.aa().c(czz.Z) + 1;
      if ($$4 > 1) {
         this.l().a(aqm.a, new czk($$0), $$4, azb.a);
      }

      this.L = $$4;
   }

   public LongSet w() {
      czy $$0 = this.u().b(czy.a(), "chunks");
      return (LongSet)($$0 != null ? LongSets.unmodifiable($$0.b()) : LongSets.EMPTY_SET);
   }

   public boolean a(int $$0, int $$1, boolean $$2) {
      czy $$3 = this.u().a(czy.a(), "chunks");
      czk $$4 = new czk($$0, $$1);
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
   public List<aqi> x() {
      return this.H;
   }

   @Override
   public void a(in $$0, dqh $$1, dqh $$2) {
      Optional<iw<cdg>> $$3 = cdh.a($$1);
      Optional<iw<cdg>> $$4 = cdh.a($$2);
      if (!Objects.equals($$3, $$4)) {
         in $$5 = $$0.i();
         $$3.ifPresent($$1x -> this.o().execute(() -> {
               this.y().a($$5);
               afw.b(this, $$5);
            }));
         $$4.ifPresent($$1x -> this.o().execute(() -> {
               this.y().a($$5, $$1x);
               afw.a(this, $$5);
            }));
      }
   }

   public cdd y() {
      return this.l().l();
   }

   public boolean c(in $$0) {
      return this.a($$0, 1);
   }

   public boolean a(jp $$0) {
      return this.c($$0.q());
   }

   public boolean a(in $$0, int $$1) {
      return $$1 > 6 ? false : this.b(jp.a($$0)) <= $$1;
   }

   public int b(jp $$0) {
      return this.y().a($$0);
   }

   public cmu z() {
      return this.f;
   }

   @Nullable
   public cms d(in $$0) {
      return this.f.a($$0, 9216);
   }

   public boolean e(in $$0) {
      return this.d($$0) != null;
   }

   public void a(cda $$0, brh $$1, bso $$2) {
      $$2.a($$0, $$1);
   }

   public void a(Path $$0) throws IOException {
      apq $$1 = this.l().a;

      try (Writer $$2 = Files.newBufferedWriter($$0.resolve("stats.txt"))) {
         $$2.write(String.format(Locale.ROOT, "spawning_chunks: %d\n", $$1.j().b()));
         dao.d $$3 = this.l().n();
         if ($$3 != null) {
            ObjectIterator $$9 = $$3.b().object2IntEntrySet().iterator();

            while ($$9.hasNext()) {
               Entry<bsd> $$4 = (Entry<bsd>)$$9.next();
               $$2.write(String.format(Locale.ROOT, "spawn_count.%s: %d\n", ((bsd)$$4.getKey()).a(), $$4.getIntValue()));
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

   private static void a(Writer $$0, Iterable<brh> $$1) throws IOException {
      awz $$2 = awz.a().a("x").a("y").a("z").a("uuid").a("type").a("alive").a("display_name").a("custom_name").a($$0);

      for (brh $$3 : $$1) {
         wu $$4 = $$3.af();
         wu $$5 = $$3.O_();
         $$2.a($$3.ds(), $$3.du(), $$3.dy(), $$3.cx(), ld.g.b($$3.ai()), $$3.bB(), $$5.getString(), $$4 != null ? $$4.getString() : null);
      }
   }

   private void a(Writer $$0) throws IOException {
      awz $$1 = awz.a().a("x").a("y").a("z").a("type").a($$0);

      for (dpe $$2 : this.r) {
         in $$3 = $$2.c();
         $$1.a($$3.u(), $$3.v(), $$3.w(), $$2.d());
      }
   }

   @VisibleForTesting
   public void a(egh $$0) {
      this.X.removeIf($$1 -> $$0.b($$1.a()));
   }

   @Override
   public void b(in $$0, dde $$1) {
      if (!this.ah()) {
         this.a($$0, $$1);
      }
   }

   @Override
   public float a(is $$0, boolean $$1) {
      return 1.0F;
   }

   public Iterable<brh> A() {
      return this.G().a();
   }

   @Override
   public String toString() {
      return "ServerLevel[" + this.K.e() + "]";
   }

   public boolean B() {
      return this.J.bb().z();
   }

   @Override
   public long C() {
      return this.J.bb().y().b();
   }

   @Nullable
   public duc D() {
      return this.ab;
   }

   @Override
   public aqh E() {
      return this;
   }

   @VisibleForTesting
   public String F() {
      return String.format(
         Locale.ROOT,
         "players: %s, entities: %s [%s], block_entities: %d [%s], block_ticks: %d, fluid_ticks: %d, chunk_source: %s",
         this.H.size(),
         this.N.e(),
         a(this.N.d().a(), $$0 -> ld.g.b($$0.ai()).toString()),
         this.r.size(),
         a(this.r, dpe::d),
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

   public static void a(aqh $$0) {
      in $$1 = a;
      int $$2 = $$1.u();
      int $$3 = $$1.v() - 2;
      int $$4 = $$1.w();
      in.b($$2 - 2, $$3 + 1, $$4 - 2, $$2 + 2, $$3 + 3, $$4 + 2).forEach($$1x -> $$0.b($$1x, ddg.a.n()));
      in.b($$2 - 2, $$3, $$4 - 2, $$2 + 2, $$3, $$4 + 2).forEach($$1x -> $$0.b($$1x, ddg.co.n()));
   }

   @Override
   protected duq<brh> G() {
      return this.N.d();
   }

   public void a(Stream<brh> $$0) {
      this.N.a($$0);
   }

   public void b(Stream<brh> $$0) {
      this.N.b($$0);
   }

   public void b(dsn $$0) {
      $$0.c(this.A_().c());
   }

   public void a(dsd $$0) {
      this.J.execute(() -> this.ae.a($$0.f(), $$0.g()));
   }

   public ems H() {
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

   public boolean f(in $$0) {
      return this.N.a($$0) && this.I.a.j().c(czk.a($$0));
   }

   public boolean g(in $$0) {
      return this.N.a($$0);
   }

   public boolean a(czk $$0) {
      return this.N.a($$0);
   }

   @Override
   public cnu J() {
      return this.J.bb().K();
   }

   public ayg a(akh $$0) {
      return this.ag.a($$0);
   }

   public bpt K() {
      return this.ag;
   }

   @Override
   public p a(o $$0) {
      p $$1 = super.a($$0);
      $$1.a("Loaded entity count", () -> String.valueOf(this.N.f()));
      return $$1;
   }

   final class a implements dup<brh> {
      public void a(brh $$0) {
      }

      public void b(brh $$0) {
         aqh.this.f().a($$0);
      }

      public void c(brh $$0) {
         aqh.this.M.a($$0);
      }

      public void d(brh $$0) {
         aqh.this.M.b($$0);
      }

      public void e(brh $$0) {
         aqh.this.l().b($$0);
         if ($$0 instanceof aqi $$1) {
            aqh.this.H.add($$1);
            aqh.this.e();
         }

         if ($$0 instanceof bsc $$2) {
            if (aqh.this.W) {
               String $$3 = "onTrackingStart called during navigation iteration";
               ac.a("onTrackingStart called during navigation iteration", new IllegalStateException("onTrackingStart called during navigation iteration"));
            }

            aqh.this.V.add($$2);
         }

         if ($$0 instanceof cgl $$4) {
            for (cgj $$5 : $$4.gl()) {
               aqh.this.ac.put($$5.aj(), $$5);
            }
         }

         $$0.a(dux::a);
      }

      public void f(brh $$0) {
         aqh.this.l().a($$0);
         if ($$0 instanceof aqi $$1) {
            aqh.this.H.remove($$1);
            aqh.this.e();
         }

         if ($$0 instanceof bsc $$2) {
            if (aqh.this.W) {
               String $$3 = "onTrackingStart called during navigation iteration";
               ac.a("onTrackingStart called during navigation iteration", new IllegalStateException("onTrackingStart called during navigation iteration"));
            }

            aqh.this.V.remove($$2);
         }

         if ($$0 instanceof cgl $$4) {
            for (cgj $$5 : $$4.gl()) {
               aqh.this.ac.remove($$5.aj());
            }
         }

         $$0.a(dux::b);
      }

      public void g(brh $$0) {
         $$0.a(dux::c);
      }
   }
}
