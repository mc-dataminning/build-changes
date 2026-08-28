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

public class arb extends dbt implements dco {
   public static final iz a = new iz(100, 50, 0);
   public static final bpu b = bqa.a(12000, 180000);
   public static final bpu c = bqa.a(12000, 24000);
   private static final bpu D = bqa.a(12000, 180000);
   public static final bpu d = bqa.a(3600, 15600);
   private static final Logger E = LogUtils.getLogger();
   private static final int F = 300;
   private static final int G = 65536;
   final List<arc> H = Lists.newArrayList();
   private final aqz I;
   private final MinecraftServer J;
   private final epw K;
   private int L;
   final dwd M = new dwd();
   private final dwi<bsp> N;
   private final dwr O;
   public boolean e;
   private final avc P;
   private int Q;
   private final eoo R;
   private final exa<deu> S = new exa<>(this::d, this.ah());
   private final exa<enp> T = new exa<>(this::d, this.ah());
   private final eoi U = new eoi();
   final Set<btm> V = new ObjectOpenHashSet();
   volatile boolean W;
   protected final cof f;
   private final ObjectLinkedOpenHashSet<day> X = new ObjectLinkedOpenHashSet();
   private final List<day> Y = new ArrayList<>(64);
   private boolean Z;
   private final List<dbg> aa;
   @Nullable
   private dvs ab;
   final Int2ObjectMap<chu> ac = new Int2ObjectOpenHashMap();
   private final dcm ad;
   private final eig ae;
   private final boolean af;
   private final bqw ag;

   public arb(
      MinecraftServer $$0,
      Executor $$1,
      epr.c $$2,
      epw $$3,
      ala<dbt> $$4,
      dvq $$5,
      ark $$6,
      boolean $$7,
      long $$8,
      List<dbg> $$9,
      boolean $$10,
      @Nullable bqw $$11
   ) {
      super($$3, $$4, $$0.bc(), $$5.a(), $$0::aT, false, $$7, $$8, $$0.bl());
      this.af = $$10;
      this.J = $$0;
      this.aa = $$9;
      this.K = $$3;
      dtu $$12 = $$5.b();
      boolean $$13 = $$0.aZ();
      DataFixer $$14 = $$0.aD();
      dwa<bsp> $$15 = new dvb(new dvl(new dvj($$2.f(), $$4, "entities"), $$2.a($$4).resolve("entities"), $$14, $$13, bab.s), this, $$0);
      this.N = new dwi<>(bsp.class, new arb.a(), $$15);
      this.I = new aqz(this, $$2, $$14, $$0.ba(), $$1, $$12, $$0.ah().p(), $$0.ah().q(), $$13, $$6, this.N::a, () -> $$0.I().u());
      this.I.h().b();
      this.R = new eoo(this);
      this.U();
      this.X();
      this.C_().a($$0.ax());
      this.f = this.u().a(cof.a(this), cof.a(this.ae()));
      if (!$$0.T()) {
         $$3.a($$0.u_());
      }

      long $$16 = $$0.bb().y().b();
      this.ae = new eig(this.I.m(), this.H_(), $$0.ba(), $$4, $$12, this.I.i(), this, $$12.c(), $$16, $$14);
      this.ad = new dcm(this, $$0.bb().y(), this.ae);
      if (this.af() == dbt.j && this.ae().a(dvn.c)) {
         this.ab = new dvs(this, $$16, $$0.bb().C());
      } else {
         this.ab = null;
      }

      this.P = new avc();
      this.O = new dwr(this);
      this.ag = Objects.requireNonNullElseGet($$11, () -> this.u().a(bqw.a($$16), "random_sequences"));
   }

   @Deprecated
   @VisibleForTesting
   public void a(@Nullable dvs $$0) {
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
   public ji<dcs> a(int $$0, int $$1, int $$2) {
      return this.l().g().c().getNoiseBiome($$0, $$1, $$2, this.l().i().b());
   }

   public dcm a() {
      return this.ad;
   }

   public void a(BooleanSupplier $$0) {
      bnd $$1 = this.ag();
      this.Z = true;
      bra $$2 = this.s();
      boolean $$3 = $$2.i();
      if ($$3) {
         $$1.a("world border");
         this.C_().s();
         $$1.b("weather");
         this.au();
      }

      int $$4 = this.ab().c(dbp.P);
      if (this.P.a($$4) && this.P.a($$4, this.H)) {
         if (this.ab().b(dbp.l)) {
            long $$5 = this.A.d() + 24000L;
            this.b($$5 - $$5 % 24000L);
         }

         this.as();
         if (this.ab().b(dbp.v) && this.ad()) {
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
            if (!$$2x.dK()) {
               if (this.i($$2x)) {
                  $$2x.ao();
               } else if (!$$2.a($$2x)) {
                  $$1.a("checkDespawn");
                  $$2x.dB();
                  $$1.c();
                  if (this.I.a.j().c($$2x.dr().a())) {
                     bsp $$3x = $$2x.dc();
                     if ($$3x != null) {
                        if (!$$3x.dK() && $$3x.x($$2x)) {
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
         if (this.A.o().b(dbp.l)) {
            this.b(this.A.d() + 1L);
         }
      }
   }

   public void b(long $$0) {
      this.K.b($$0);
   }

   public void a(boolean $$0, boolean $$1) {
      for (dbg $$2 : this.aa) {
         $$2.a(this, $$0, $$1);
      }
   }

   private boolean i(bsp $$0) {
      return this.J.ab() || !($$0 instanceof cfa) && !($$0 instanceof cgc) ? !this.J.ac() && $$0 instanceof cme : true;
   }

   private void as() {
      this.P.a();
      this.H.stream().filter(btk::fL).collect(Collectors.toList()).forEach($$0 -> $$0.a(false, false));
   }

   public void a(dud $$0, int $$1) {
      dba $$2 = $$0.f();
      boolean $$3 = this.ad();
      int $$4 = $$2.d();
      int $$5 = $$2.e();
      bnd $$6 = this.ag();
      $$6.a("thunder");
      if ($$3 && this.ac() && this.z.a(100000) == 0) {
         iz $$7 = this.b(this.a($$4, 0, $$5, 15));
         if (this.r($$7)) {
            bqn $$8 = this.d_($$7);
            boolean $$9 = this.ab().b(dbp.e) && this.z.j() < (double)$$8.b() * 0.01 && !this.a_($$7.d()).a(dew.ss);
            if ($$9) {
               chk $$10 = bsv.aO.a((dbt)this);
               if ($$10 != null) {
                  $$10.w(true);
                  $$10.c_(0);
                  $$10.a_((double)$$7.u(), (double)$$7.v(), (double)$$7.w());
                  this.b($$10);
               }
            }

            btj $$11 = bsv.am.a((dbt)this);
            if ($$11 != null) {
               $$11.e(evm.c($$7));
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
         due[] $$13 = $$0.d();

         for (int $$14 = 0; $$14 < $$13.length; $$14++) {
            due $$15 = $$13[$$14];
            if ($$15.d()) {
               int $$16 = $$0.g($$14);
               int $$17 = kb.c($$16);

               for (int $$18 = 0; $$18 < $$1; $$18++) {
                  iz $$19 = this.a($$4, $$17, $$5, 15);
                  $$6.a("randomTick");
                  drx $$20 = $$15.a($$19.u() - $$4, $$19.v() - $$17, $$19.w() - $$5);
                  if ($$20.v()) {
                     $$20.b(this, $$19, this.z);
                  }

                  enq $$21 = $$20.u();
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
   public void a(iz $$0) {
      iz $$1 = this.a(dxp.a.e, $$0);
      iz $$2 = $$1.d();
      dcs $$3 = this.t($$1).a();
      if ($$3.a(this, $$2)) {
         this.b($$2, dew.dO.n());
      }

      if (this.ad()) {
         int $$4 = this.ab().c(dbp.T);
         if ($$4 > 0 && $$3.b(this, $$1)) {
            drx $$5 = this.a_($$1);
            if ($$5.a(dew.dN)) {
               int $$6 = $$5.c(dmd.c);
               if ($$6 < Math.min($$4, 8)) {
                  drx $$7 = $$5.a(dmd.c, Integer.valueOf($$6 + 1));
                  deu.a($$5, $$7, this, $$1);
                  this.b($$1, $$7);
               }
            } else {
               this.b($$1, dew.dN.n());
            }
         }

         dcs.c $$8 = $$3.a($$2);
         if ($$8 != dcs.c.a) {
            drx $$9 = this.a_($$2);
            $$9.b().a($$9, this, $$2, $$8);
         }
      }
   }

   private Optional<iz> E(iz $$0) {
      Optional<iz> $$1 = this.y().e($$0x -> $$0x.a(ces.t), $$0x -> $$0x.v() == this.a(dxp.a.b, $$0x.u(), $$0x.w()) - 1, $$0, 128, ceo.b.c);
      return $$1.map($$0x -> $$0x.b(1));
   }

   protected iz b(iz $$0) {
      iz $$1 = this.a(dxp.a.e, $$0);
      Optional<iz> $$2 = this.E($$1);
      if ($$2.isPresent()) {
         return $$2.get();
      } else {
         evh $$3 = evh.a($$1, new iz($$1.h(this.am()))).g(3.0);
         List<btk> $$4 = this.a(btk.class, $$3, $$0x -> $$0x != null && $$0x.bD() && this.h($$0x.dp()));
         if (!$$4.isEmpty()) {
            return $$4.get(this.z.a($$4.size())).dp();
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
      return this.ab().c(dbp.P) <= 100;
   }

   private void at() {
      if (this.d()) {
         if (!this.o().T() || this.o().r()) {
            int $$0 = this.ab().c(dbp.P);
            xl $$1;
            if (this.P.a($$0)) {
               $$1 = xl.c("sleep.skipping_night");
            } else {
               $$1 = xl.a("sleep.players_sleeping", this.P.b(), this.P.b($$0));
            }

            for (arc $$3 : this.H) {
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

   public alt f() {
      return this.J.aK();
   }

   private void au() {
      boolean $$0 = this.ad();
      if (this.D_().g()) {
         if (this.ab().b(dbp.v)) {
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

         this.y = ayu.a(this.y, 0.0F, 1.0F);
         this.v = this.w;
         if (this.A.i()) {
            this.w += 0.01F;
         } else {
            this.w -= 0.01F;
         }

         this.w = ayu.a(this.w, 0.0F, 1.0F);
      }

      if (this.v != this.w) {
         this.J.ah().a(new adl(adl.i, this.w), this.af());
      }

      if (this.x != this.y) {
         this.J.ah().a(new adl(adl.j, this.y), this.af());
      }

      if ($$0 != this.ad()) {
         if ($$0) {
            this.J.ah().a(new adl(adl.d, 0.0F));
         } else {
            this.J.ah().a(new adl(adl.c, 0.0F));
         }

         this.J.ah().a(new adl(adl.i, this.w));
         this.J.ah().a(new adl(adl.j, this.y));
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

   private void a(iz $$0, enp $$1) {
      enq $$2 = this.b_($$0);
      if ($$2.b($$1)) {
         $$2.a((dbt)this, $$0);
      }
   }

   private void d(iz $$0, deu $$1) {
      drx $$2 = this.a_($$0);
      if ($$2.a($$1)) {
         $$2.a(this, $$0, this.z);
      }
   }

   public void a(bsp $$0) {
      $$0.bu();
      bnd $$1 = this.ag();
      $$0.ai++;
      this.ag().a(() -> lp.g.b($$0.ak()).toString());
      $$1.d("tickNonPassenger");
      $$0.l();
      this.ag().c();

      for (bsp $$2 : $$0.cS()) {
         this.a($$0, $$2);
      }
   }

   private void a(bsp $$0, bsp $$1) {
      if ($$1.dK() || $$1.dc() != $$0) {
         $$1.ac();
      } else if ($$1 instanceof cms || this.M.c($$1)) {
         $$1.bu();
         $$1.ai++;
         bnd $$2 = this.ag();
         $$2.a(() -> lp.g.b($$1.ak()).toString());
         $$2.d("tickPassenger");
         $$1.t();
         $$2.c();

         for (bsp $$3 : $$1.cS()) {
            this.a($$1, $$3);
         }
      }
   }

   @Override
   public boolean a(cms $$0, iz $$1) {
      return !this.J.a(this, $$1, $$0) && this.C_().a($$1);
   }

   public void a(@Nullable azb $$0, boolean $$1, boolean $$2) {
      aqz $$3 = this.l();
      if (!$$2) {
         if ($$0 != null) {
            $$0.a(xl.c("menu.savingLevel"));
         }

         this.av();
         if ($$0 != null) {
            $$0.c(xl.c("menu.savingChunks"));
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
         this.J.bb().a(this.ab.b());
      }

      this.l().k().a();
   }

   public <T extends bsp> List<? extends T> a(dwe<bsp, T> $$0, Predicate<? super T> $$1) {
      List<T> $$2 = Lists.newArrayList();
      this.a($$0, $$1, $$2);
      return $$2;
   }

   public <T extends bsp> void a(dwe<bsp, T> $$0, Predicate<? super T> $$1, List<? super T> $$2) {
      this.a($$0, $$1, $$2, Integer.MAX_VALUE);
   }

   public <T extends bsp> void a(dwe<bsp, T> $$0, Predicate<? super T> $$1, List<? super T> $$2, int $$3) {
      this.G().a($$0, $$3x -> {
         if ($$1.test((T)$$3x)) {
            $$2.add((T)$$3x);
            if ($$2.size() >= $$3) {
               return axh.a.b;
            }
         }

         return axh.a.a;
      });
   }

   public List<? extends chw> i() {
      return this.a(bsv.F, btk::bD);
   }

   public List<arc> a(Predicate<? super arc> $$0) {
      return this.a($$0, Integer.MAX_VALUE);
   }

   public List<arc> a(Predicate<? super arc> $$0, int $$1) {
      List<arc> $$2 = Lists.newArrayList();

      for (arc $$3 : this.H) {
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
   public arc j() {
      List<arc> $$0 = this.a(btk::bD);
      return $$0.isEmpty() ? null : $$0.get(this.z.a($$0.size()));
   }

   @Override
   public boolean b(bsp $$0) {
      return this.j($$0);
   }

   public boolean c(bsp $$0) {
      return this.j($$0);
   }

   public void d(bsp $$0) {
      this.j($$0);
   }

   public void a(arc $$0) {
      this.e($$0);
   }

   public void b(arc $$0) {
      this.e($$0);
   }

   public void c(arc $$0) {
      this.e($$0);
   }

   public void d(arc $$0) {
      this.e($$0);
   }

   private void e(arc $$0) {
      bsp $$1 = this.G().a($$0.cz());
      if ($$1 != null) {
         E.warn("Force-added player with duplicate UUID {}", $$0.cz());
         $$1.ai();
         this.a((arc)$$1, bsp.c.b);
      }

      this.N.a($$0);
   }

   private boolean j(bsp $$0) {
      if ($$0.dK()) {
         E.warn("Tried to add entity {} but it was marked as removed already", bsv.a($$0.ak()));
         return false;
      } else {
         return this.N.a($$0);
      }
   }

   public boolean e(bsp $$0) {
      if ($$0.cU().map(bsp::cz).anyMatch(this.N::a)) {
         return false;
      } else {
         this.a_($$0);
         return true;
      }
   }

   public void a(dud $$0) {
      $$0.I();
      $$0.b(this);
   }

   public void a(arc $$0, bsp.c $$1) {
      $$0.a($$1);
   }

   @Override
   public void a(int $$0, iz $$1, int $$2) {
      for (arc $$3 : this.J.ah().t()) {
         if ($$3 != null && $$3.dP() == this && $$3.al() != $$0) {
            double $$4 = (double)$$1.u() - $$3.du();
            double $$5 = (double)$$1.v() - $$3.dw();
            double $$6 = (double)$$1.w() - $$3.dA();
            if ($$4 * $$4 + $$5 * $$5 + $$6 * $$6 < 1024.0) {
               $$3.c.b(new ack($$0, $$1, $$2));
            }
         }
      }
   }

   @Override
   public void a(@Nullable cms $$0, double $$1, double $$2, double $$3, ji<avv> $$4, avx $$5, float $$6, float $$7, long $$8) {
      this.J.ah().a($$0, $$1, $$2, $$3, (double)$$4.a().a($$6), this.af(), new afz($$4, $$5, $$1, $$2, $$3, $$6, $$7, $$8));
   }

   @Override
   public void a(@Nullable cms $$0, bsp $$1, ji<avv> $$2, avx $$3, float $$4, float $$5, long $$6) {
      this.J.ah().a($$0, $$1.du(), $$1.dw(), $$1.dA(), (double)$$2.a().a($$4), this.af(), new afy($$2, $$3, $$1, $$4, $$5, $$6));
   }

   @Override
   public void b(int $$0, iz $$1, int $$2) {
      if (this.ab().b(dbp.W)) {
         this.J.ah().a(new adr($$0, $$1, $$2, true));
      } else {
         this.a(null, $$0, $$1, $$2);
      }
   }

   @Override
   public void a(@Nullable cms $$0, int $$1, iz $$2, int $$3) {
      this.J.ah().a($$0, (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), 64.0, this.af(), new adr($$1, $$2, $$3, false));
   }

   public int k() {
      return this.D_().p();
   }

   @Override
   public void a(ji<dwq> $$0, evm $$1, dwq.a $$2) {
      this.O.a($$0, $$1, $$2);
   }

   @Override
   public void a(iz $$0, drx $$1, drx $$2, int $$3) {
      if (this.W) {
         String $$4 = "recursive call to sendBlockUpdated";
         ac.a("recursive call to sendBlockUpdated", new IllegalStateException("recursive call to sendBlockUpdated"));
      }

      this.l().a($$0);
      this.U.a($$0);
      ewf $$5 = $$1.k(this, $$0);
      ewf $$6 = $$2.k(this, $$0);
      if (ewc.c($$5, $$6, evq.g)) {
         List<ccw> $$7 = new ObjectArrayList();

         for (btm $$8 : this.V) {
            ccw $$9 = $$8.K();
            if ($$9.b($$0)) {
               $$7.add($$9);
            }
         }

         try {
            this.W = true;

            for (ccw $$10 : $$7) {
               $$10.i();
            }
         } finally {
            this.W = false;
         }
      }
   }

   @Override
   public void a(iz $$0, deu $$1) {
      this.s.a($$0, $$1, null);
   }

   @Override
   public void a(iz $$0, deu $$1, je $$2) {
      this.s.a($$0, $$1, $$2);
   }

   @Override
   public void a(iz $$0, deu $$1, iz $$2) {
      this.s.a($$0, $$1, $$2);
   }

   @Override
   public void a(drx $$0, iz $$1, deu $$2, iz $$3, boolean $$4) {
      this.s.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public void a(bsp $$0, byte $$1) {
      this.l().a($$0, new adi($$0, $$1));
   }

   @Override
   public void a(bsp $$0, bri $$1) {
      this.l().a($$0, new ade($$0, $$1));
   }

   public aqz l() {
      return this.I;
   }

   @Override
   public dbl a(
      @Nullable bsp $$0,
      @Nullable bri $$1,
      @Nullable dbm $$2,
      double $$3,
      double $$4,
      double $$5,
      float $$6,
      boolean $$7,
      dbt.a $$8,
      lh $$9,
      lh $$10,
      ji<avv> $$11
   ) {
      dbl $$12 = this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, false, $$9, $$10, $$11);
      if (!$$12.d()) {
         $$12.h();
      }

      for (arc $$13 : this.H) {
         if ($$13.i($$3, $$4, $$5) < 4096.0) {
            $$13.c.b(new adj($$3, $$4, $$5, $$6, $$12.i(), $$12.e().get($$13), $$12.j(), $$12.k(), $$12.l(), $$12.m()));
         }
      }

      return $$12;
   }

   @Override
   public void a(iz $$0, deu $$1, int $$2, int $$3) {
      this.X.add(new day($$0, $$1, $$2, $$3));
   }

   private void aw() {
      this.Y.clear();

      while (!this.X.isEmpty()) {
         day $$0 = (day)this.X.removeFirst();
         if (this.n($$0.a())) {
            if (this.a($$0)) {
               this.J.ah().a(null, (double)$$0.a().u(), (double)$$0.a().v(), (double)$$0.a().w(), 64.0, this.af(), new acm($$0.a(), $$0.b(), $$0.c(), $$0.d()));
            }
         } else {
            this.Y.add($$0);
         }
      }

      this.X.addAll(this.Y);
   }

   private boolean a(day $$0) {
      drx $$1 = this.a_($$0.a());
      return $$1.a($$0.b()) ? $$1.a(this, $$0.a(), $$0.c(), $$0.d()) : false;
   }

   public exa<deu> m() {
      return this.S;
   }

   public exa<enp> n() {
      return this.T;
   }

   @Nonnull
   @Override
   public MinecraftServer o() {
      return this.J;
   }

   public eoo p() {
      return this.R;
   }

   public emg q() {
      return this.J.ba();
   }

   public <T extends lh> int a(T $$0, double $$1, double $$2, double $$3, int $$4, double $$5, double $$6, double $$7, double $$8) {
      ads $$9 = new ads($$0, false, $$1, $$2, $$3, (float)$$5, (float)$$6, (float)$$7, (float)$$8, $$4);
      int $$10 = 0;

      for (int $$11 = 0; $$11 < this.H.size(); $$11++) {
         arc $$12 = this.H.get($$11);
         if (this.a($$12, false, $$1, $$2, $$3, $$9)) {
            $$10++;
         }
      }

      return $$10;
   }

   public <T extends lh> boolean a(arc $$0, T $$1, boolean $$2, double $$3, double $$4, double $$5, int $$6, double $$7, double $$8, double $$9, double $$10) {
      zs<?> $$11 = new ads($$1, $$2, $$3, $$4, $$5, (float)$$7, (float)$$8, (float)$$9, (float)$$10, $$6);
      return this.a($$0, $$2, $$3, $$4, $$5, $$11);
   }

   private boolean a(arc $$0, boolean $$1, double $$2, double $$3, double $$4, zs<?> $$5) {
      if ($$0.dP() != this) {
         return false;
      } else {
         iz $$6 = $$0.dp();
         if ($$6.a(new evm($$2, $$3, $$4), $$1 ? 512.0 : 32.0)) {
            $$0.c.b($$5);
            return true;
         } else {
            return false;
         }
      }
   }

   @Nullable
   @Override
   public bsp a(int $$0) {
      return this.G().a($$0);
   }

   @Deprecated
   @Nullable
   public bsp b(int $$0) {
      bsp $$1 = this.G().a($$0);
      return $$1 != null ? $$1 : (bsp)this.ac.get($$0);
   }

   @Nullable
   public bsp a(UUID $$0) {
      return this.G().a($$0);
   }

   @Nullable
   public iz a(axb<eif> $$0, iz $$1, int $$2, boolean $$3) {
      if (!this.J.bb().y().c()) {
         return null;
      } else {
         Optional<jm.c<eif>> $$4 = this.H_().d(lq.aJ).b($$0);
         if ($$4.isEmpty()) {
            return null;
         } else {
            Pair<iz, ji<eif>> $$5 = this.l().g().a(this, $$4.get(), $$1, $$2, $$3);
            return $$5 != null ? (iz)$$5.getFirst() : null;
         }
      }
   }

   @Nullable
   public Pair<iz, ji<dcs>> a(Predicate<ji<dcs>> $$0, iz $$1, int $$2, int $$3, int $$4) {
      return this.l().g().c().a($$1, $$2, $$3, $$4, $$0, this.l().i().b(), this);
   }

   @Override
   public cyt r() {
      return this.J.aJ();
   }

   @Override
   public bra s() {
      return this.J.aQ();
   }

   @Override
   public boolean t() {
      return this.e;
   }

   public epl u() {
      return this.l().k();
   }

   @Nullable
   @Override
   public epf a(epd $$0) {
      return this.o().I().u().b(epf.a(), $$0.a());
   }

   @Override
   public void a(epd $$0, epf $$1) {
      this.o().I().u().a($$0.a(), $$1);
   }

   @Override
   public epd v() {
      return this.o().I().u().a(epe.a(), "idcounts").b();
   }

   public void a(iz $$0, float $$1) {
      iz $$2 = this.A.a();
      float $$3 = this.A.b();
      if (!$$2.equals($$0) || $$3 != $$1) {
         this.A.a($$0, $$1);
         this.o().ah().a(new afh($$0, $$1));
      }

      if (this.L > 1) {
         this.l().b(arg.a, new dba($$2), this.L, azx.a);
      }

      int $$4 = this.ab().c(dbp.Z) + 1;
      if ($$4 > 1) {
         this.l().a(arg.a, new dba($$0), $$4, azx.a);
      }

      this.L = $$4;
   }

   public LongSet w() {
      dbo $$0 = this.u().b(dbo.a(), "chunks");
      return (LongSet)($$0 != null ? LongSets.unmodifiable($$0.b()) : LongSets.EMPTY_SET);
   }

   public boolean a(int $$0, int $$1, boolean $$2) {
      dbo $$3 = this.u().a(dbo.a(), "chunks");
      dba $$4 = new dba($$0, $$1);
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
   public List<arc> x() {
      return this.H;
   }

   @Override
   public void a(iz $$0, drx $$1, drx $$2) {
      Optional<ji<cer>> $$3 = ces.a($$1);
      Optional<ji<cer>> $$4 = ces.a($$2);
      if (!Objects.equals($$3, $$4)) {
         iz $$5 = $$0.i();
         $$3.ifPresent($$1x -> this.o().execute(() -> {
               this.y().a($$5);
               agp.b(this, $$5);
            }));
         $$4.ifPresent($$1x -> this.o().execute(() -> {
               this.y().a($$5, $$1x);
               agp.a(this, $$5);
            }));
      }
   }

   public ceo y() {
      return this.l().l();
   }

   public boolean c(iz $$0) {
      return this.a($$0, 1);
   }

   public boolean a(kb $$0) {
      return this.c($$0.q());
   }

   public boolean a(iz $$0, int $$1) {
      return $$1 > 6 ? false : this.b(kb.a($$0)) <= $$1;
   }

   public int b(kb $$0) {
      return this.y().a($$0);
   }

   public cof z() {
      return this.f;
   }

   @Nullable
   public cod d(iz $$0) {
      return this.f.a($$0, 9216);
   }

   public boolean e(iz $$0) {
      return this.d($$0) != null;
   }

   public void a(cel $$0, bsp $$1, btz $$2) {
      $$2.a($$0, $$1);
   }

   public void a(Path $$0) throws IOException {
      aqk $$1 = this.l().a;

      try (Writer $$2 = Files.newBufferedWriter($$0.resolve("stats.txt"))) {
         $$2.write(String.format(Locale.ROOT, "spawning_chunks: %d\n", $$1.j().b()));
         dce.d $$3 = this.l().n();
         if ($$3 != null) {
            ObjectIterator $$9 = $$3.b().object2IntEntrySet().iterator();

            while ($$9.hasNext()) {
               Entry<btn> $$4 = (Entry<btn>)$$9.next();
               $$2.write(String.format(Locale.ROOT, "spawn_count.%s: %d\n", ((btn)$$4.getKey()).a(), $$4.getIntValue()));
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

   private static void a(Writer $$0, Iterable<bsp> $$1) throws IOException {
      axu $$2 = axu.a().a("x").a("y").a("z").a("uuid").a("type").a("alive").a("display_name").a("custom_name").a($$0);

      for (bsp $$3 : $$1) {
         xl $$4 = $$3.ah();
         xl $$5 = $$3.O_();
         $$2.a($$3.du(), $$3.dw(), $$3.dA(), $$3.cz(), lp.g.b($$3.ak()), $$3.bD(), $$5.getString(), $$4 != null ? $$4.getString() : null);
      }
   }

   private void a(Writer $$0) throws IOException {
      axu $$1 = axu.a().a("x").a("y").a("z").a("type").a($$0);

      for (dqu $$2 : this.r) {
         iz $$3 = $$2.c();
         $$1.a($$3.u(), $$3.v(), $$3.w(), $$2.d());
      }
   }

   @VisibleForTesting
   public void a(ehx $$0) {
      this.X.removeIf($$1 -> $$0.b($$1.a()));
   }

   @Override
   public void b(iz $$0, deu $$1) {
      if (!this.ai()) {
         this.a($$0, $$1);
      }
   }

   @Override
   public float a(je $$0, boolean $$1) {
      return 1.0F;
   }

   public Iterable<bsp> A() {
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
   public dvs D() {
      return this.ab;
   }

   @Override
   public arb E() {
      return this;
   }

   @VisibleForTesting
   public String F() {
      return String.format(
         Locale.ROOT,
         "players: %s, entities: %s [%s], block_entities: %d [%s], block_ticks: %d, fluid_ticks: %d, chunk_source: %s",
         this.H.size(),
         this.N.e(),
         a(this.N.d().a(), $$0 -> lp.g.b($$0.ak()).toString()),
         this.r.size(),
         a(this.r, dqu::d),
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

   public static void a(arb $$0) {
      iz $$1 = a;
      int $$2 = $$1.u();
      int $$3 = $$1.v() - 2;
      int $$4 = $$1.w();
      iz.b($$2 - 2, $$3 + 1, $$4 - 2, $$2 + 2, $$3 + 3, $$4 + 2).forEach($$1x -> $$0.b($$1x, dew.a.n()));
      iz.b($$2 - 2, $$3, $$4 - 2, $$2 + 2, $$3, $$4 + 2).forEach($$1x -> $$0.b($$1x, dew.co.n()));
   }

   @Override
   protected dwg<bsp> G() {
      return this.N.d();
   }

   public void a(Stream<bsp> $$0) {
      this.N.a($$0);
   }

   public void b(Stream<bsp> $$0) {
      this.N.b($$0);
   }

   public void b(dud $$0) {
      $$0.c(this.A_().c());
   }

   public void a(dtt $$0) {
      this.J.execute(() -> this.ae.a($$0.f(), $$0.g()));
   }

   public eoi H() {
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

   public boolean f(iz $$0) {
      return this.N.a($$0) && this.I.a.j().c(dba.a($$0));
   }

   public boolean g(iz $$0) {
      return this.N.a($$0);
   }

   public boolean a(dba $$0) {
      return this.N.a($$0);
   }

   @Override
   public cpg J() {
      return this.J.bb().K();
   }

   @Override
   public cwk K() {
      return this.J.bp();
   }

   public azc a(alb $$0) {
      return this.ag.a($$0);
   }

   public bqw L() {
      return this.ag;
   }

   @Override
   public p a(o $$0) {
      p $$1 = super.a($$0);
      $$1.a("Loaded entity count", () -> String.valueOf(this.N.f()));
      return $$1;
   }

   final class a implements dwf<bsp> {
      public void a(bsp $$0) {
      }

      public void b(bsp $$0) {
         arb.this.f().a($$0);
      }

      public void c(bsp $$0) {
         arb.this.M.a($$0);
      }

      public void d(bsp $$0) {
         arb.this.M.b($$0);
      }

      public void e(bsp $$0) {
         arb.this.l().b($$0);
         if ($$0 instanceof arc $$1) {
            arb.this.H.add($$1);
            arb.this.e();
         }

         if ($$0 instanceof btm $$2) {
            if (arb.this.W) {
               String $$3 = "onTrackingStart called during navigation iteration";
               ac.a("onTrackingStart called during navigation iteration", new IllegalStateException("onTrackingStart called during navigation iteration"));
            }

            arb.this.V.add($$2);
         }

         if ($$0 instanceof chw $$4) {
            for (chu $$5 : $$4.gm()) {
               arb.this.ac.put($$5.al(), $$5);
            }
         }

         $$0.a(dwn::a);
      }

      public void f(bsp $$0) {
         arb.this.l().a($$0);
         if ($$0 instanceof arc $$1) {
            arb.this.H.remove($$1);
            arb.this.e();
         }

         if ($$0 instanceof btm $$2) {
            if (arb.this.W) {
               String $$3 = "onTrackingStart called during navigation iteration";
               ac.a("onTrackingStart called during navigation iteration", new IllegalStateException("onTrackingStart called during navigation iteration"));
            }

            arb.this.V.remove($$2);
         }

         if ($$0 instanceof chw $$4) {
            for (chu $$5 : $$4.gm()) {
               arb.this.ac.remove($$5.al());
            }
         }

         $$0.a(dwn::b);
      }

      public void g(bsp $$0) {
         $$0.a(dwn::c);
      }
   }
}
