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

public class arq extends dff implements dgd {
   public static final jh a = new jh(100, 50, 0);
   public static final brm b = brs.a(12000, 180000);
   public static final brm c = brs.a(12000, 24000);
   private static final brm E = brs.a(12000, 180000);
   public static final brm d = brs.a(3600, 15600);
   private static final Logger F = LogUtils.getLogger();
   private static final int G = 300;
   private static final int H = 65536;
   final List<arr> I = Lists.newArrayList();
   private final aro J;
   private final MinecraftServer K;
   private final etz L;
   private int M;
   final dzx N = new dzx();
   private final eac<bui> O;
   private final eal P;
   public boolean e;
   private final avu Q;
   private int R;
   private final esn S;
   private final fbg<dij> T = new fbg<>(this::d);
   private final fbg<ern> U = new fbg<>(this::d);
   private final esg V = new esg();
   final Set<bvg> W = new ObjectOpenHashSet();
   volatile boolean X;
   protected final cqg f;
   private final ObjectLinkedOpenHashSet<dej> Y = new ObjectLinkedOpenHashSet();
   private final List<dej> Z = new ArrayList<>(64);
   private boolean aa;
   private final List<der> ab;
   @Nullable
   private dzm ac;
   final Int2ObjectMap<cjp> ad = new Int2ObjectOpenHashMap();
   private final dgb ae;
   private final emc af;
   private final boolean ag;
   private final bsm ah;

   public arq(
      MinecraftServer $$0,
      Executor $$1,
      etu.c $$2,
      etz $$3,
      alk<dff> $$4,
      dzk $$5,
      asa $$6,
      boolean $$7,
      long $$8,
      List<der> $$9,
      boolean $$10,
      @Nullable bsm $$11
   ) {
      super($$3, $$4, $$0.ba(), $$5.a(), false, $$7, $$8, $$0.bj());
      this.ag = $$10;
      this.K = $$0;
      this.ab = $$9;
      this.L = $$3;
      dxk $$12 = $$5.b();
      boolean $$13 = $$0.aX();
      DataFixer $$14 = $$0.aC();
      dzu<bui> $$15 = new dyu(new dzf(new dzc($$2.f(), $$4, "entities"), $$2.a($$4).resolve("entities"), $$14, $$13, bax.s), this, $$0);
      this.O = new eac<>(bui.class, new arq.a(), $$15);
      this.J = new aro(this, $$2, $$14, $$0.aY(), $$1, $$12, $$0.ag().p(), $$0.ag().q(), $$13, $$6, this.O::a, () -> $$0.J().u());
      this.J.h().b();
      this.S = new esn(this);
      this.V();
      this.Y();
      this.C_().a($$0.aw());
      this.f = this.u().a(cqg.a(this), cqg.a(this.af()));
      if (!$$0.U()) {
         $$3.a($$0.u());
      }

      long $$16 = $$0.aZ().y().c();
      this.af = new emc(this.J.m(), this.H_(), $$0.aY(), $$4, $$12, this.J.i(), this, $$12.d(), $$16, $$14);
      this.ae = new dgb(this, $$0.aZ().y(), this.af);
      if (this.ag() == dff.k && this.af().a(dzh.c)) {
         this.ac = new dzm(this, $$16, $$0.aZ().C());
      } else {
         this.ac = null;
      }

      this.Q = new avu();
      this.P = new eal(this);
      this.ah = Objects.requireNonNullElseGet($$11, () -> this.u().a(bsm.a($$16), "random_sequences"));
   }

   @Deprecated
   @VisibleForTesting
   public void a(@Nullable dzm $$0) {
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
   public jq<dgh> a(int $$0, int $$1, int $$2) {
      return this.l().g().d().getNoiseBiome($$0, $$1, $$2, this.l().i().b());
   }

   public dgb a() {
      return this.ae;
   }

   public void a(BooleanSupplier $$0) {
      bor $$1 = boq.a();
      this.aa = true;
      bsq $$2 = this.s();
      boolean $$3 = $$2.i();
      if ($$3) {
         $$1.a("world border");
         this.C_().s();
         $$1.b("weather");
         this.at();
         $$1.c();
      }

      int $$4 = this.ac().c(dfb.P);
      if (this.Q.a($$4) && this.Q.a($$4, this.I)) {
         if (this.ac().b(dfb.l)) {
            long $$5 = this.B.d() + 24000L;
            this.b($$5 - $$5 % 24000L);
         }

         this.ar();
         if (this.ac().b(dfb.v) && this.ae()) {
            this.g();
         }
      }

      this.V();
      if ($$3) {
         this.b();
      }

      $$1.a("tickPending");
      if (!this.ah() && $$3) {
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
         this.au();
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
            if (!$$2x.dT()) {
               if (!$$2.a($$2x)) {
                  $$1.a("checkDespawn");
                  $$2x.dK();
                  $$1.c();
                  if ($$2x instanceof arr || this.J.a.j().c($$2x.dA().a())) {
                     bui $$3x = $$2x.dm();
                     if ($$3x != null) {
                        if (!$$3x.dT() && $$3x.y($$2x)) {
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
         boq.a().a("scheduledFunctions");
         this.L.s().a(this.K, $$0);
         boq.a().c();
         if (this.B.o().b(dfb.l)) {
            this.b(this.B.d() + 1L);
         }
      }
   }

   public void b(long $$0) {
      this.L.b($$0);
   }

   public void a(boolean $$0, boolean $$1) {
      for (der $$2 : this.ab) {
         $$2.a(this, $$0, $$1);
      }
   }

   private void ar() {
      this.Q.a();
      this.I.stream().filter(bve::fU).collect(Collectors.toList()).forEach($$0 -> $$0.a(false, false));
   }

   public void a(dxt $$0, int $$1) {
      del $$2 = $$0.f();
      boolean $$3 = this.ae();
      int $$4 = $$2.d();
      int $$5 = $$2.e();
      bor $$6 = boq.a();
      $$6.a("thunder");
      if ($$3 && this.ad() && this.A.a(100000) == 0) {
         jh $$7 = this.b(this.a($$4, 0, $$5, 15));
         if (this.r($$7)) {
            bsf $$8 = this.d_($$7);
            boolean $$9 = this.ac().b(dfb.e) && this.A.j() < (double)$$8.b() * 0.01 && !this.a_($$7.e()).a(dil.ss);
            if ($$9) {
               cjf $$10 = bup.aO.a(this, buo.h);
               if ($$10 != null) {
                  $$10.x(true);
                  $$10.c_(0);
                  $$10.a_((double)$$7.u(), (double)$$7.v(), (double)$$7.w());
                  this.b($$10);
               }
            }

            bvd $$11 = bup.am.a(this, buo.h);
            if ($$11 != null) {
               $$11.e(ezr.c($$7));
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
         dxu[] $$13 = $$0.d();

         for (int $$14 = 0; $$14 < $$13.length; $$14++) {
            dxu $$15 = $$13[$$14];
            if ($$15.d()) {
               int $$16 = $$0.h($$14);
               int $$17 = kj.c($$16);

               for (int $$18 = 0; $$18 < $$1; $$18++) {
                  jh $$19 = this.a($$4, $$17, $$5, 15);
                  $$6.a("randomTick");
                  dvo $$20 = $$15.a($$19.u() - $$4, $$19.v() - $$17, $$19.w() - $$5);
                  if ($$20.z()) {
                     $$20.b(this, $$19, this.A);
                  }

                  ero $$21 = $$20.y();
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
   public void a(jh $$0) {
      jh $$1 = this.a(ebj.a.e, $$0);
      jh $$2 = $$1.e();
      dgh $$3 = this.t($$1).a();
      if ($$3.a(this, $$2)) {
         this.b($$2, dil.dO.m());
      }

      if (this.ae()) {
         int $$4 = this.ac().c(dfb.T);
         if ($$4 > 0 && $$3.b(this, $$1)) {
            dvo $$5 = this.a_($$1);
            if ($$5.a(dil.dN)) {
               int $$6 = $$5.c(dps.c);
               if ($$6 < Math.min($$4, 8)) {
                  dvo $$7 = $$5.b(dps.c, Integer.valueOf($$6 + 1));
                  dij.a($$5, $$7, this, $$1);
                  this.b($$1, $$7);
               }
            } else {
               this.b($$1, dil.dN.m());
            }
         }

         dgh.c $$8 = $$3.a($$2, this.N());
         if ($$8 != dgh.c.a) {
            dvo $$9 = this.a_($$2);
            $$9.b().a($$9, this, $$2, $$8);
         }
      }
   }

   private Optional<jh> E(jh $$0) {
      Optional<jh> $$1 = this.y().e($$0x -> $$0x.a(cgm.t), $$0x -> $$0x.v() == this.a(ebj.a.b, $$0x.u(), $$0x.w()) - 1, $$0, 128, cgi.b.c);
      return $$1.map($$0x -> $$0x.b(1));
   }

   protected jh b(jh $$0) {
      jh $$1 = this.a(ebj.a.e, $$0);
      Optional<jh> $$2 = this.E($$1);
      if ($$2.isPresent()) {
         return $$2.get();
      } else {
         ezm $$3 = ezm.a($$1, $$1.h(this.al() + 1)).g(3.0);
         List<bve> $$4 = this.a(bve.class, $$3, $$0x -> $$0x != null && $$0x.bN() && this.h($$0x.dy()));
         if (!$$4.isEmpty()) {
            return $$4.get(this.A.a($$4.size())).dy();
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
      return this.ac().c(dfb.P) <= 100;
   }

   private void as() {
      if (this.d()) {
         if (!this.o().U() || this.o().r()) {
            int $$0 = this.ac().c(dfb.P);
            xl $$1;
            if (this.Q.a($$0)) {
               $$1 = xl.c("sleep.skipping_night");
            } else {
               $$1 = xl.a("sleep.players_sleeping", this.Q.b(), this.Q.b($$0));
            }

            for (arr $$3 : this.I) {
               $$3.a($$1, true);
            }
         }
      }
   }

   public void e() {
      if (!this.I.isEmpty() && this.Q.a(this.I)) {
         this.as();
      }
   }

   public ame f() {
      return this.K.aJ();
   }

   private void at() {
      boolean $$0 = this.ae();
      if (this.D_().g()) {
         if (this.ac().b(dfb.v)) {
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

         this.z = azn.a(this.z, 0.0F, 1.0F);
         this.w = this.x;
         if (this.B.i()) {
            this.x += 0.01F;
         } else {
            this.x -= 0.01F;
         }

         this.x = azn.a(this.x, 0.0F, 1.0F);
      }

      if (this.w != this.x) {
         this.K.ag().a(new ado(ado.i, this.x), this.ag());
      }

      if (this.y != this.z) {
         this.K.ag().a(new ado(ado.j, this.z), this.ag());
      }

      if ($$0 != this.ae()) {
         if ($$0) {
            this.K.ag().a(new ado(ado.d, 0.0F));
         } else {
            this.K.ag().a(new ado(ado.c, 0.0F));
         }

         this.K.ag().a(new ado(ado.i, this.x));
         this.K.ag().a(new ado(ado.j, this.z));
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

   private void a(jh $$0, ern $$1) {
      dvo $$2 = this.a_($$0);
      ero $$3 = $$2.y();
      if ($$3.b($$1)) {
         $$3.a(this, $$0, $$2);
      }
   }

   private void d(jh $$0, dij $$1) {
      dvo $$2 = this.a_($$0);
      if ($$2.a($$1)) {
         $$2.a(this, $$0, this.A);
      }
   }

   public void a(bui $$0) {
      $$0.bB();
      bor $$1 = boq.a();
      $$0.ag++;
      $$1.a(() -> lz.f.b($$0.ar()).toString());
      $$1.f("tickNonPassenger");
      $$0.l();
      $$1.c();

      for (bui $$2 : $$0.db()) {
         this.a($$0, $$2);
      }
   }

   private void a(bui $$0, bui $$1) {
      if ($$1.dT() || $$1.dm() != $$0) {
         $$1.af();
      } else if ($$1 instanceof cor || this.N.c($$1)) {
         $$1.bB();
         $$1.ag++;
         bor $$2 = boq.a();
         $$2.a(() -> lz.f.b($$1.ar()).toString());
         $$2.f("tickPassenger");
         $$1.u();
         $$2.c();

         for (bui $$3 : $$1.db()) {
            this.a($$1, $$3);
         }
      }
   }

   @Override
   public boolean a(cor $$0, jh $$1) {
      return !this.K.a(this, $$1, $$0) && this.C_().a($$1);
   }

   public void a(@Nullable azu $$0, boolean $$1, boolean $$2) {
      aro $$3 = this.l();
      if (!$$2) {
         if ($$0 != null) {
            $$0.a(xl.c("menu.savingLevel"));
         }

         this.b($$1);
         if ($$0 != null) {
            $$0.c(xl.c("menu.savingChunks"));
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

      eto $$1 = this.l().k();
      if ($$0) {
         $$1.b();
      } else {
         $$1.a();
      }
   }

   public <T extends bui> List<? extends T> a(dzy<bui, T> $$0, Predicate<? super T> $$1) {
      List<T> $$2 = Lists.newArrayList();
      this.a($$0, $$1, $$2);
      return $$2;
   }

   public <T extends bui> void a(dzy<bui, T> $$0, Predicate<? super T> $$1, List<? super T> $$2) {
      this.a($$0, $$1, $$2, Integer.MAX_VALUE);
   }

   public <T extends bui> void a(dzy<bui, T> $$0, Predicate<? super T> $$1, List<? super T> $$2, int $$3) {
      this.G().a($$0, $$3x -> {
         if ($$1.test((T)$$3x)) {
            $$2.add((T)$$3x);
            if ($$2.size() >= $$3) {
               return axz.a.b;
            }
         }

         return axz.a.a;
      });
   }

   public List<? extends cjs> i() {
      return this.a(bup.F, bve::bN);
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
   public arr j() {
      List<arr> $$0 = this.a(bve::bN);
      return $$0.isEmpty() ? null : $$0.get(this.A.a($$0.size()));
   }

   @Override
   public boolean b(bui $$0) {
      return this.i($$0);
   }

   public boolean c(bui $$0) {
      return this.i($$0);
   }

   public void d(bui $$0) {
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
      bui $$1 = this.G().a($$0.cI());
      if ($$1 != null) {
         F.warn("Force-added player with duplicate UUID {}", $$0.cI());
         $$1.ap();
         this.a((arr)$$1, bui.c.b);
      }

      this.O.a($$0);
   }

   private boolean i(bui $$0) {
      if ($$0.dT()) {
         F.warn("Tried to add entity {} but it was marked as removed already", bup.a($$0.ar()));
         return false;
      } else {
         return this.O.a($$0);
      }
   }

   public boolean e(bui $$0) {
      if ($$0.dd().map(bui::cI).anyMatch(this.O::a)) {
         return false;
      } else {
         this.a_($$0);
         return true;
      }
   }

   public void a(dxt $$0) {
      $$0.H();
      $$0.b(this);
   }

   public void a(arr $$0, bui.c $$1) {
      $$0.a($$1);
   }

   @Override
   public void a(int $$0, jh $$1, int $$2) {
      for (arr $$3 : this.K.ag().t()) {
         if ($$3 != null && $$3.dY() == this && $$3.as() != $$0) {
            double $$4 = (double)$$1.u() - $$3.dD();
            double $$5 = (double)$$1.v() - $$3.dF();
            double $$6 = (double)$$1.w() - $$3.dJ();
            if ($$4 * $$4 + $$5 * $$5 + $$6 * $$6 < 1024.0) {
               $$3.g.b(new acn($$0, $$1, $$2));
            }
         }
      }
   }

   @Override
   public void a(@Nullable cor $$0, double $$1, double $$2, double $$3, jq<awn> $$4, awp $$5, float $$6, float $$7, long $$8) {
      this.K.ag().a($$0, $$1, $$2, $$3, (double)$$4.a().a($$6), this.ag(), new agf($$4, $$5, $$1, $$2, $$3, $$6, $$7, $$8));
   }

   @Override
   public void a(@Nullable cor $$0, bui $$1, jq<awn> $$2, awp $$3, float $$4, float $$5, long $$6) {
      this.K.ag().a($$0, $$1.dD(), $$1.dF(), $$1.dJ(), (double)$$2.a().a($$4), this.ag(), new age($$2, $$3, $$1, $$4, $$5, $$6));
   }

   @Override
   public void b(int $$0, jh $$1, int $$2) {
      if (this.ac().b(dfb.W)) {
         this.K.ag().a(new adu($$0, $$1, $$2, true));
      } else {
         this.a(null, $$0, $$1, $$2);
      }
   }

   @Override
   public void a(@Nullable cor $$0, int $$1, jh $$2, int $$3) {
      this.K.ag().a($$0, (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), 64.0, this.ag(), new adu($$1, $$2, $$3, false));
   }

   public int k() {
      return this.D_().p();
   }

   @Override
   public void a(jq<eak> $$0, ezr $$1, eak.a $$2) {
      this.P.a($$0, $$1, $$2);
   }

   @Override
   public void a(jh $$0, dvo $$1, dvo $$2, int $$3) {
      if (this.X) {
         String $$4 = "recursive call to sendBlockUpdated";
         ae.a("recursive call to sendBlockUpdated", new IllegalStateException("recursive call to sendBlockUpdated"));
      }

      this.l().a($$0);
      this.V.a($$0);
      fal $$5 = $$1.g(this, $$0);
      fal $$6 = $$2.g(this, $$0);
      if (fai.c($$5, $$6, ezv.g)) {
         List<ceq> $$7 = new ObjectArrayList();

         for (bvg $$8 : this.W) {
            ceq $$9 = $$8.P();
            if ($$9.b($$0)) {
               $$7.add($$9);
            }
         }

         try {
            this.X = true;

            for (ceq $$10 : $$7) {
               $$10.j();
            }
         } finally {
            this.X = false;
         }
      }
   }

   @Override
   public void a(jh $$0, dij $$1) {
      this.a($$0, $$1, ess.a(this, null, null));
   }

   @Override
   public void a(jh $$0, dij $$1, @Nullable esw $$2) {
      this.t.a($$0, $$1, null, $$2);
   }

   @Override
   public void a(jh $$0, dij $$1, jm $$2, @Nullable esw $$3) {
      this.t.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void b(jh $$0, dij $$1, @Nullable esw $$2) {
      this.t.a($$0, $$1, $$2);
   }

   @Override
   public void a(dvo $$0, jh $$1, dij $$2, @Nullable esw $$3, boolean $$4) {
      this.t.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public void a(bui $$0, byte $$1) {
      this.l().a($$0, new adl($$0, $$1));
   }

   @Override
   public void a(bui $$0, bsy $$1) {
      this.l().a($$0, new adh($$0, $$1));
   }

   public aro l() {
      return this.J;
   }

   @Override
   public void a(
      @Nullable bui $$0,
      @Nullable bsy $$1,
      @Nullable dey $$2,
      double $$3,
      double $$4,
      double $$5,
      float $$6,
      boolean $$7,
      dff.a $$8,
      lq $$9,
      lq $$10,
      jq<awn> $$11
   ) {
      dex.a $$12 = switch ($$8) {
         case a -> dex.a.a;
         case b -> this.a(dfb.Q);
         case c -> this.ac().b(dfb.c) ? this.a(dfb.R) : dex.a.a;
         case d -> this.a(dfb.S);
         case e -> dex.a.d;
      };
      ezr $$13 = new ezr($$3, $$4, $$5);
      dfv $$14 = new dfv(this, $$0, $$1, $$2, $$13, $$6, $$7, $$12);
      $$14.h();
      lq $$15 = $$14.j() ? $$9 : $$10;

      for (arr $$16 : this.I) {
         if ($$16.f($$13) < 4096.0) {
            Optional<ezr> $$17 = Optional.ofNullable($$14.i().get($$16));
            $$16.g.b(new adm($$13, $$17, $$15, $$11));
         }
      }
   }

   private dex.a a(dfb.e<dfb.a> $$0) {
      return this.ac().b($$0) ? dex.a.c : dex.a.b;
   }

   @Override
   public void a(jh $$0, dij $$1, int $$2, int $$3) {
      this.Y.add(new dej($$0, $$1, $$2, $$3));
   }

   private void au() {
      this.Z.clear();

      while (!this.Y.isEmpty()) {
         dej $$0 = (dej)this.Y.removeFirst();
         if (this.n($$0.a())) {
            if (this.a($$0)) {
               this.K.ag().a(null, (double)$$0.a().u(), (double)$$0.a().v(), (double)$$0.a().w(), 64.0, this.ag(), new acp($$0.a(), $$0.b(), $$0.c(), $$0.d()));
            }
         } else {
            this.Z.add($$0);
         }
      }

      this.Y.addAll(this.Z);
   }

   private boolean a(dej $$0) {
      dvo $$1 = this.a_($$0.a());
      return $$1.a($$0.b()) ? $$1.a(this, $$0.a(), $$0.c(), $$0.d()) : false;
   }

   public fbg<dij> m() {
      return this.T;
   }

   public fbg<ern> n() {
      return this.U;
   }

   @Nonnull
   @Override
   public MinecraftServer o() {
      return this.K;
   }

   public esn p() {
      return this.S;
   }

   public eqe q() {
      return this.K.aY();
   }

   public <T extends lq> int a(T $$0, double $$1, double $$2, double $$3, int $$4, double $$5, double $$6, double $$7, double $$8) {
      adv $$9 = new adv($$0, false, $$1, $$2, $$3, (float)$$5, (float)$$6, (float)$$7, (float)$$8, $$4);
      int $$10 = 0;

      for (int $$11 = 0; $$11 < this.I.size(); $$11++) {
         arr $$12 = this.I.get($$11);
         if (this.a($$12, false, $$1, $$2, $$3, $$9)) {
            $$10++;
         }
      }

      return $$10;
   }

   public <T extends lq> boolean a(arr $$0, T $$1, boolean $$2, double $$3, double $$4, double $$5, int $$6, double $$7, double $$8, double $$9, double $$10) {
      zs<?> $$11 = new adv($$1, $$2, $$3, $$4, $$5, (float)$$7, (float)$$8, (float)$$9, (float)$$10, $$6);
      return this.a($$0, $$2, $$3, $$4, $$5, $$11);
   }

   private boolean a(arr $$0, boolean $$1, double $$2, double $$3, double $$4, zs<?> $$5) {
      if ($$0.dY() != this) {
         return false;
      } else {
         jh $$6 = $$0.dy();
         if ($$6.a(new ezr($$2, $$3, $$4), $$1 ? 512.0 : 32.0)) {
            $$0.g.b($$5);
            return true;
         } else {
            return false;
         }
      }
   }

   @Nullable
   @Override
   public bui a(int $$0) {
      return this.G().a($$0);
   }

   @Deprecated
   @Nullable
   public bui b(int $$0) {
      bui $$1 = this.G().a($$0);
      return $$1 != null ? $$1 : (bui)this.ad.get($$0);
   }

   @Nullable
   public bui a(UUID $$0) {
      return this.G().a($$0);
   }

   @Nullable
   public jh a(axt<emb> $$0, jh $$1, int $$2, boolean $$3) {
      if (!this.K.aZ().y().d()) {
         return null;
      } else {
         Optional<ju.c<emb>> $$4 = this.H_().e(ma.aS).a($$0);
         if ($$4.isEmpty()) {
            return null;
         } else {
            Pair<jh, jq<emb>> $$5 = this.l().g().a(this, $$4.get(), $$1, $$2, $$3);
            return $$5 != null ? (jh)$$5.getFirst() : null;
         }
      }
   }

   @Nullable
   public Pair<jh, jq<dgh>> a(Predicate<jq<dgh>> $$0, jh $$1, int $$2, int $$3, int $$4) {
      return this.l().g().d().a($$1, $$2, $$3, $$4, $$0, this.l().i().b(), this);
   }

   @Override
   public dax r() {
      return this.K.aI();
   }

   @Override
   public bsq s() {
      return this.K.aP();
   }

   @Override
   public boolean t() {
      return this.e;
   }

   public eto u() {
      return this.l().k();
   }

   @Nullable
   @Override
   public eti a(etg $$0) {
      return this.o().J().u().b(eti.a(), $$0.a());
   }

   @Override
   public void a(etg $$0, eti $$1) {
      this.o().J().u().a($$0.a(), $$1);
   }

   @Override
   public etg v() {
      return this.o().J().u().a(eth.a(), "idcounts").b();
   }

   public void a(jh $$0, float $$1) {
      jh $$2 = this.B.a();
      float $$3 = this.B.b();
      if (!$$2.equals($$0) || $$3 != $$1) {
         this.B.a($$0, $$1);
         this.o().ag().a(new afl($$0, $$1));
      }

      if (this.M > 1) {
         this.l().b(arw.a, new del($$2), this.M, bat.a);
      }

      int $$4 = this.ac().c(dfb.aa) + 1;
      if ($$4 > 1) {
         this.l().a(arw.a, new del($$0), $$4, bat.a);
      }

      this.M = $$4;
   }

   public LongSet w() {
      dfa $$0 = this.u().b(dfa.a(), "chunks");
      return (LongSet)($$0 != null ? LongSets.unmodifiable($$0.b()) : LongSets.EMPTY_SET);
   }

   public boolean a(int $$0, int $$1, boolean $$2) {
      dfa $$3 = this.u().a(dfa.a(), "chunks");
      del $$4 = new del($$0, $$1);
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
   public List<arr> x() {
      return this.I;
   }

   @Override
   public void a(jh $$0, dvo $$1, dvo $$2) {
      Optional<jq<cgl>> $$3 = cgm.a($$1);
      Optional<jq<cgl>> $$4 = cgm.a($$2);
      if (!Objects.equals($$3, $$4)) {
         jh $$5 = $$0.j();
         $$3.ifPresent($$1x -> this.o().execute(() -> {
               this.y().a($$5);
               agv.b(this, $$5);
            }));
         $$4.ifPresent($$1x -> this.o().execute(() -> {
               this.y().a($$5, $$1x);
               agv.a(this, $$5);
            }));
      }
   }

   public cgi y() {
      return this.l().l();
   }

   public boolean c(jh $$0) {
      return this.a($$0, 1);
   }

   public boolean a(kj $$0) {
      return this.c($$0.k());
   }

   public boolean a(jh $$0, int $$1) {
      return $$1 > 6 ? false : this.b(kj.a($$0)) <= $$1;
   }

   public int b(kj $$0) {
      return this.y().a($$0);
   }

   public cqg z() {
      return this.f;
   }

   @Nullable
   public cqe d(jh $$0) {
      return this.f.a($$0, 9216);
   }

   public boolean e(jh $$0) {
      return this.d($$0) != null;
   }

   public void a(cgf $$0, bui $$1, bvt $$2) {
      $$2.a($$0, $$1);
   }

   public void a(Path $$0) throws IOException {
      aqw $$1 = this.l().a;

      try (Writer $$2 = Files.newBufferedWriter($$0.resolve("stats.txt"))) {
         $$2.write(String.format(Locale.ROOT, "spawning_chunks: %d\n", $$1.j().b()));
         dfq.d $$3 = this.l().n();
         if ($$3 != null) {
            ObjectIterator $$9 = $$3.b().object2IntEntrySet().iterator();

            while ($$9.hasNext()) {
               Entry<bvh> $$4 = (Entry<bvh>)$$9.next();
               $$2.write(String.format(Locale.ROOT, "spawn_count.%s: %d\n", ((bvh)$$4.getKey()).a(), $$4.getIntValue()));
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

   private static void a(Writer $$0, Iterable<bui> $$1) throws IOException {
      ayn $$2 = ayn.a().a("x").a("y").a("z").a("uuid").a("type").a("alive").a("display_name").a("custom_name").a($$0);

      for (bui $$3 : $$1) {
         xl $$4 = $$3.ao();
         xl $$5 = $$3.S_();
         $$2.a($$3.dD(), $$3.dF(), $$3.dJ(), $$3.cI(), lz.f.b($$3.ar()), $$3.bN(), $$5.getString(), $$4 != null ? $$4.getString() : null);
      }
   }

   private void a(Writer $$0) throws IOException {
      ayn $$1 = ayn.a().a("x").a("y").a("z").a("type").a($$0);

      for (dul $$2 : this.s) {
         jh $$3 = $$2.c();
         $$1.a($$3.u(), $$3.v(), $$3.w(), $$2.d());
      }
   }

   @VisibleForTesting
   public void a(elt $$0) {
      this.Y.removeIf($$1 -> $$0.b($$1.a()));
   }

   @Override
   public void b(jh $$0, dij $$1) {
      if (!this.ah()) {
         this.a($$0, $$1);
      }
   }

   @Override
   public float a(jm $$0, boolean $$1) {
      return 1.0F;
   }

   public Iterable<bui> A() {
      return this.G().a();
   }

   @Override
   public String toString() {
      return "ServerLevel[" + this.L.e() + "]";
   }

   public boolean B() {
      return this.K.aZ().z();
   }

   @Override
   public long C() {
      return this.K.aZ().y().c();
   }

   @Nullable
   public dzm D() {
      return this.ac;
   }

   @Override
   public arq E() {
      return this;
   }

   @VisibleForTesting
   public String F() {
      return String.format(
         Locale.ROOT,
         "players: %s, entities: %s [%s], block_entities: %d [%s], block_ticks: %d, fluid_ticks: %d, chunk_source: %s",
         this.I.size(),
         this.O.e(),
         a(this.O.d().a(), $$0 -> lz.f.b($$0.ar()).toString()),
         this.s.size(),
         a(this.s, dul::d),
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
   protected eaa<bui> G() {
      return this.O.d();
   }

   public void a(Stream<bui> $$0) {
      this.O.a($$0);
   }

   public void b(Stream<bui> $$0) {
      this.O.b($$0);
   }

   public void b(dxt $$0) {
      $$0.d(this.A_().c());
   }

   public void a(dxj $$0) {
      this.K.execute(() -> this.af.a($$0.f(), $$0.g()));
   }

   public esg H() {
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

   public boolean f(jh $$0) {
      return this.O.a($$0) && this.J.a.j().c(del.a($$0));
   }

   public boolean g(jh $$0) {
      return this.O.a($$0);
   }

   public boolean a(del $$0) {
      return this.O.a($$0);
   }

   @Override
   public crj J() {
      return this.K.aZ().K();
   }

   @Override
   public cyd K() {
      return this.K.bn();
   }

   @Override
   public dto L() {
      return this.K.bo();
   }

   public azv a(all $$0) {
      return this.ah.a($$0);
   }

   public bsm M() {
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

   final class a implements dzz<bui> {
      public void a(bui $$0) {
      }

      public void b(bui $$0) {
         arq.this.f().a($$0);
      }

      public void c(bui $$0) {
         arq.this.N.a($$0);
      }

      public void d(bui $$0) {
         arq.this.N.b($$0);
      }

      public void e(bui $$0) {
         arq.this.l().b($$0);
         if ($$0 instanceof arr $$1) {
            arq.this.I.add($$1);
            arq.this.e();
         }

         if ($$0 instanceof bvg $$2) {
            if (arq.this.X) {
               String $$3 = "onTrackingStart called during navigation iteration";
               ae.a("onTrackingStart called during navigation iteration", new IllegalStateException("onTrackingStart called during navigation iteration"));
            }

            arq.this.W.add($$2);
         }

         if ($$0 instanceof cjs $$4) {
            for (cjp $$5 : $$4.gr()) {
               arq.this.ad.put($$5.as(), $$5);
            }
         }

         $$0.a(eah::a);
      }

      public void f(bui $$0) {
         arq.this.l().a($$0);
         if ($$0 instanceof arr $$1) {
            arq.this.I.remove($$1);
            arq.this.e();
         }

         if ($$0 instanceof bvg $$2) {
            if (arq.this.X) {
               String $$3 = "onTrackingStart called during navigation iteration";
               ae.a("onTrackingStart called during navigation iteration", new IllegalStateException("onTrackingStart called during navigation iteration"));
            }

            arq.this.W.remove($$2);
         }

         if ($$0 instanceof cjs $$4) {
            for (cjp $$5 : $$4.gr()) {
               arq.this.ad.remove($$5.as());
            }
         }

         $$0.a(eah::b);
      }

      public void g(bui $$0) {
         $$0.a(eah::c);
      }
   }
}
