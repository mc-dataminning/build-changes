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

public class aps extends cyx implements czs {
   public static final ib a = new ib(100, 50, 0);
   public static final bnf b = bnl.a(12000, 180000);
   public static final bnf c = bnl.a(12000, 24000);
   private static final bnf D = bnl.a(12000, 180000);
   public static final bnf d = bnl.a(3600, 15600);
   private static final Logger E = LogUtils.getLogger();
   private static final int F = 300;
   private static final int G = 65536;
   final List<apt> H = Lists.newArrayList();
   private final apq I;
   private final MinecraftServer J;
   private final emw K;
   private int L;
   final dtf M = new dtf();
   private final dtk<bpv> N;
   private final dtt O;
   public boolean e;
   private final ats P;
   private int Q;
   private final elq R;
   private final eto<dby> S = new eto<>(this::d, this.ag());
   private final eto<ekr> T = new eto<>(this::d, this.ag());
   private final elk U = new elk();
   final Set<bqq> V = new ObjectOpenHashSet();
   volatile boolean W;
   protected final clg f;
   private final ObjectLinkedOpenHashSet<cyc> X = new ObjectLinkedOpenHashSet();
   private final List<cyc> Y = new ArrayList<>(64);
   private boolean Z;
   private final List<cyk> aa;
   @Nullable
   private dsu ab;
   final Int2ObjectMap<cev> ac = new Int2ObjectOpenHashMap();
   private final czq ad;
   private final efi ae;
   private final boolean af;
   private final boh ag;

   public aps(
      MinecraftServer $$0,
      Executor $$1,
      emr.c $$2,
      emw $$3,
      ajs<cyx> $$4,
      dss $$5,
      aqb $$6,
      boolean $$7,
      long $$8,
      List<cyk> $$9,
      boolean $$10,
      @Nullable boh $$11
   ) {
      super($$3, $$4, $$0.bd(), $$5.a(), $$0::aU, false, $$7, $$8, $$0.bl());
      this.af = $$10;
      this.J = $$0;
      this.aa = $$9;
      this.K = $$3;
      dqw $$12 = $$5.b();
      boolean $$13 = $$0.ba();
      DataFixer $$14 = $$0.aD();
      dtc<bpv> $$15 = new dsd(new dsn(new dsl($$2.f(), $$4, "entities"), $$2.a($$4).resolve("entities"), $$14, $$13, ayq.s), this, $$0);
      this.N = new dtk<>(bpv.class, new aps.a(), $$15);
      this.I = new apq(this, $$2, $$14, $$0.bb(), $$1, $$12, $$0.ah().p(), $$0.ah().q(), $$13, $$6, this.N::a, () -> $$0.I().u());
      this.I.h().b();
      this.R = new elq(this);
      this.T();
      this.W();
      this.C_().a($$0.ax());
      this.f = this.u().a(clg.a(this), clg.a(this.ad()));
      if (!$$0.T()) {
         $$3.a($$0.u_());
      }

      long $$16 = $$0.bc().y().b();
      this.ae = new efi(this.I.m(), this.H_(), $$0.bb(), $$4, $$12, this.I.i(), this, $$12.c(), $$16, $$14);
      this.ad = new czq(this, $$0.bc().y(), this.ae);
      if (this.ae() == cyx.j && this.ad().a(dsp.c)) {
         this.ab = new dsu(this, $$16, $$0.bc().C());
      } else {
         this.ab = null;
      }

      this.P = new ats();
      this.O = new dtt(this);
      this.ag = Objects.requireNonNullElseGet($$11, () -> this.u().a(boh.a($$16), "random_sequences"));
   }

   @Deprecated
   @VisibleForTesting
   public void a(@Nullable dsu $$0) {
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
   public il<czw> a(int $$0, int $$1, int $$2) {
      return this.l().g().c().getNoiseBiome($$0, $$1, $$2, this.l().i().b());
   }

   public czq a() {
      return this.ad;
   }

   public void a(BooleanSupplier $$0) {
      bko $$1 = this.af();
      this.Z = true;
      bol $$2 = this.s();
      boolean $$3 = $$2.i();
      if ($$3) {
         $$1.a("world border");
         this.C_().s();
         $$1.b("weather");
         this.at();
      }

      int $$4 = this.aa().c(cyt.P);
      if (this.P.a($$4) && this.P.a($$4, this.H)) {
         if (this.aa().b(cyt.l)) {
            long $$5 = this.A.d() + 24000L;
            this.b($$5 - $$5 % 24000L);
         }

         this.ar();
         if (this.aa().b(cyt.v) && this.ac()) {
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
            if (!$$2x.dH()) {
               if (this.i($$2x)) {
                  $$2x.am();
               } else if (!$$2.a($$2x)) {
                  $$1.a("checkDespawn");
                  $$2x.dy();
                  $$1.c();
                  if (this.I.a.j().c($$2x.do().a())) {
                     bpv $$3x = $$2x.cZ();
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
         if (this.A.o().b(cyt.l)) {
            this.b(this.A.d() + 1L);
         }
      }
   }

   public void b(long $$0) {
      this.K.b($$0);
   }

   public void a(boolean $$0, boolean $$1) {
      for (cyk $$2 : this.aa) {
         $$2.a(this, $$0, $$1);
      }
   }

   private boolean i(bpv $$0) {
      return this.J.ab() || !($$0 instanceof ccd) && !($$0 instanceof cdf) ? !this.J.ac() && $$0 instanceof cjf : true;
   }

   private void ar() {
      this.P.a();
      this.H.stream().filter(bqo::fI).collect(Collectors.toList()).forEach($$0 -> $$0.a(false, false));
   }

   public void a(drf $$0, int $$1) {
      cye $$2 = $$0.f();
      boolean $$3 = this.ac();
      int $$4 = $$2.d();
      int $$5 = $$2.e();
      bko $$6 = this.af();
      $$6.a("thunder");
      if ($$3 && this.ab() && this.z.a(100000) == 0) {
         ib $$7 = this.b(this.a($$4, 0, $$5, 15));
         if (this.r($$7)) {
            bny $$8 = this.d_($$7);
            boolean $$9 = this.aa().b(cyt.e) && this.z.j() < (double)$$8.b() * 0.01 && !this.a_($$7.d()).a(dca.ss);
            if ($$9) {
               cel $$10 = bqb.aN.a((cyx)this);
               if ($$10 != null) {
                  $$10.w(true);
                  $$10.c_(0);
                  $$10.a_((double)$$7.u(), (double)$$7.v(), (double)$$7.w());
                  this.b($$10);
               }
            }

            bqn $$11 = bqb.al.a((cyx)this);
            if ($$11 != null) {
               $$11.e(esa.c($$7));
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
         drg[] $$13 = $$0.d();

         for (int $$14 = 0; $$14 < $$13.length; $$14++) {
            drg $$15 = $$13[$$14];
            if ($$15.d()) {
               int $$16 = $$0.g($$14);
               int $$17 = je.c($$16);

               for (int $$18 = 0; $$18 < $$1; $$18++) {
                  ib $$19 = this.a($$4, $$17, $$5, 15);
                  $$6.a("randomTick");
                  doz $$20 = $$15.a($$19.u() - $$4, $$19.v() - $$17, $$19.w() - $$5);
                  if ($$20.v()) {
                     $$20.b(this, $$19, this.z);
                  }

                  eks $$21 = $$20.u();
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
   public void a(ib $$0) {
      ib $$1 = this.a(dur.a.e, $$0);
      ib $$2 = $$1.d();
      czw $$3 = this.t($$1).a();
      if ($$3.a(this, $$2)) {
         this.b($$2, dca.dO.n());
      }

      if (this.ac()) {
         int $$4 = this.aa().c(cyt.T);
         if ($$4 > 0 && $$3.b(this, $$1)) {
            doz $$5 = this.a_($$1);
            if ($$5.a(dca.dN)) {
               int $$6 = $$5.c(djg.c);
               if ($$6 < Math.min($$4, 8)) {
                  doz $$7 = $$5.a(djg.c, Integer.valueOf($$6 + 1));
                  dby.a($$5, $$7, this, $$1);
                  this.b($$1, $$7);
               }
            } else {
               this.b($$1, dca.dN.n());
            }
         }

         czw.c $$8 = $$3.a($$2);
         if ($$8 != czw.c.a) {
            doz $$9 = this.a_($$2);
            $$9.b().a($$9, this, $$2, $$8);
         }
      }
   }

   private Optional<ib> E(ib $$0) {
      Optional<ib> $$1 = this.y().e($$0x -> $$0x.a(cbv.t), $$0x -> $$0x.v() == this.a(dur.a.b, $$0x.u(), $$0x.w()) - 1, $$0, 128, cbr.b.c);
      return $$1.map($$0x -> $$0x.b(1));
   }

   protected ib b(ib $$0) {
      ib $$1 = this.a(dur.a.e, $$0);
      Optional<ib> $$2 = this.E($$1);
      if ($$2.isPresent()) {
         return $$2.get();
      } else {
         erv $$3 = erv.a($$1, new ib($$1.h(this.al()))).g(3.0);
         List<bqo> $$4 = this.a(bqo.class, $$3, $$0x -> $$0x != null && $$0x.bA() && this.h($$0x.dm()));
         if (!$$4.isEmpty()) {
            return $$4.get(this.z.a($$4.size())).dm();
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
      return this.aa().c(cyt.P) <= 100;
   }

   private void as() {
      if (this.d()) {
         if (!this.o().T() || this.o().r()) {
            int $$0 = this.aa().c(cyt.P);
            wg $$1;
            if (this.P.a($$0)) {
               $$1 = wg.c("sleep.skipping_night");
            } else {
               $$1 = wg.a("sleep.players_sleeping", this.P.b(), this.P.b($$0));
            }

            for (apt $$3 : this.H) {
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

   public akk f() {
      return this.J.aK();
   }

   private void at() {
      boolean $$0 = this.ac();
      if (this.D_().g()) {
         if (this.aa().b(cyt.v)) {
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

         this.y = axk.a(this.y, 0.0F, 1.0F);
         this.v = this.w;
         if (this.A.i()) {
            this.w += 0.01F;
         } else {
            this.w -= 0.01F;
         }

         this.w = axk.a(this.w, 0.0F, 1.0F);
      }

      if (this.v != this.w) {
         this.J.ah().a(new acf(acf.i, this.w), this.ae());
      }

      if (this.x != this.y) {
         this.J.ah().a(new acf(acf.j, this.y), this.ae());
      }

      if ($$0 != this.ac()) {
         if ($$0) {
            this.J.ah().a(new acf(acf.d, 0.0F));
         } else {
            this.J.ah().a(new acf(acf.c, 0.0F));
         }

         this.J.ah().a(new acf(acf.i, this.w));
         this.J.ah().a(new acf(acf.j, this.y));
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

   private void a(ib $$0, ekr $$1) {
      eks $$2 = this.b_($$0);
      if ($$2.b($$1)) {
         $$2.a((cyx)this, $$0);
      }
   }

   private void d(ib $$0, dby $$1) {
      doz $$2 = this.a_($$0);
      if ($$2.a($$1)) {
         $$2.a(this, $$0, this.z);
      }
   }

   public void a(bpv $$0) {
      $$0.bs();
      bko $$1 = this.af();
      $$0.ah++;
      this.af().a(() -> kr.g.b($$0.ai()).toString());
      $$1.d("tickNonPassenger");
      $$0.l();
      this.af().c();

      for (bpv $$2 : $$0.cP()) {
         this.a($$0, $$2);
      }
   }

   private void a(bpv $$0, bpv $$1) {
      if ($$1.dH() || $$1.cZ() != $$0) {
         $$1.ac();
      } else if ($$1 instanceof cjt || this.M.c($$1)) {
         $$1.bs();
         $$1.ah++;
         bko $$2 = this.af();
         $$2.a(() -> kr.g.b($$1.ai()).toString());
         $$2.d("tickPassenger");
         $$1.t();
         $$2.c();

         for (bpv $$3 : $$1.cP()) {
            this.a($$1, $$3);
         }
      }
   }

   @Override
   public boolean a(cjt $$0, ib $$1) {
      return !this.J.a(this, $$1, $$0) && this.C_().a($$1);
   }

   public void a(@Nullable axq $$0, boolean $$1, boolean $$2) {
      apq $$3 = this.l();
      if (!$$2) {
         if ($$0 != null) {
            $$0.a(wg.c("menu.savingLevel"));
         }

         this.au();
         if ($$0 != null) {
            $$0.c(wg.c("menu.savingChunks"));
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
         this.J.bc().a(this.ab.b());
      }

      this.l().k().a();
   }

   public <T extends bpv> List<? extends T> a(dtg<bpv, T> $$0, Predicate<? super T> $$1) {
      List<T> $$2 = Lists.newArrayList();
      this.a($$0, $$1, $$2);
      return $$2;
   }

   public <T extends bpv> void a(dtg<bpv, T> $$0, Predicate<? super T> $$1, List<? super T> $$2) {
      this.a($$0, $$1, $$2, Integer.MAX_VALUE);
   }

   public <T extends bpv> void a(dtg<bpv, T> $$0, Predicate<? super T> $$1, List<? super T> $$2, int $$3) {
      this.G().a($$0, $$3x -> {
         if ($$1.test((T)$$3x)) {
            $$2.add((T)$$3x);
            if ($$2.size() >= $$3) {
               return avx.a.b;
            }
         }

         return avx.a.a;
      });
   }

   public List<? extends cex> i() {
      return this.a(bqb.F, bqo::bA);
   }

   public List<apt> a(Predicate<? super apt> $$0) {
      return this.a($$0, Integer.MAX_VALUE);
   }

   public List<apt> a(Predicate<? super apt> $$0, int $$1) {
      List<apt> $$2 = Lists.newArrayList();

      for (apt $$3 : this.H) {
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
   public apt j() {
      List<apt> $$0 = this.a(bqo::bA);
      return $$0.isEmpty() ? null : $$0.get(this.z.a($$0.size()));
   }

   @Override
   public boolean b(bpv $$0) {
      return this.j($$0);
   }

   public boolean c(bpv $$0) {
      return this.j($$0);
   }

   public void d(bpv $$0) {
      this.j($$0);
   }

   public void a(apt $$0) {
      this.e($$0);
   }

   public void b(apt $$0) {
      this.e($$0);
   }

   public void c(apt $$0) {
      this.e($$0);
   }

   public void d(apt $$0) {
      this.e($$0);
   }

   private void e(apt $$0) {
      bpv $$1 = this.G().a($$0.cw());
      if ($$1 != null) {
         E.warn("Force-added player with duplicate UUID {}", $$0.cw());
         $$1.ag();
         this.a((apt)$$1, bpv.c.b);
      }

      this.N.a($$0);
   }

   private boolean j(bpv $$0) {
      if ($$0.dH()) {
         E.warn("Tried to add entity {} but it was marked as removed already", bqb.a($$0.ai()));
         return false;
      } else {
         return this.N.a($$0);
      }
   }

   public boolean e(bpv $$0) {
      if ($$0.cR().map(bpv::cw).anyMatch(this.N::a)) {
         return false;
      } else {
         this.a_($$0);
         return true;
      }
   }

   public void a(drf $$0) {
      $$0.I();
      $$0.b(this);
   }

   public void a(apt $$0, bpv.c $$1) {
      $$0.a($$1);
   }

   @Override
   public void a(int $$0, ib $$1, int $$2) {
      for (apt $$3 : this.J.ah().t()) {
         if ($$3 != null && $$3.dM() == this && $$3.aj() != $$0) {
            double $$4 = (double)$$1.u() - $$3.dr();
            double $$5 = (double)$$1.v() - $$3.dt();
            double $$6 = (double)$$1.w() - $$3.dx();
            if ($$4 * $$4 + $$5 * $$5 + $$6 * $$6 < 1024.0) {
               $$3.d.b(new abe($$0, $$1, $$2));
            }
         }
      }
   }

   @Override
   public void a(@Nullable cjt $$0, double $$1, double $$2, double $$3, il<aul> $$4, aun $$5, float $$6, float $$7, long $$8) {
      this.J.ah().a($$0, $$1, $$2, $$3, (double)$$4.a().a($$6), this.ae(), new aes($$4, $$5, $$1, $$2, $$3, $$6, $$7, $$8));
   }

   @Override
   public void a(@Nullable cjt $$0, bpv $$1, il<aul> $$2, aun $$3, float $$4, float $$5, long $$6) {
      this.J.ah().a($$0, $$1.dr(), $$1.dt(), $$1.dx(), (double)$$2.a().a($$4), this.ae(), new aer($$2, $$3, $$1, $$4, $$5, $$6));
   }

   @Override
   public void b(int $$0, ib $$1, int $$2) {
      if (this.aa().b(cyt.W)) {
         this.J.ah().a(new acl($$0, $$1, $$2, true));
      } else {
         this.a(null, $$0, $$1, $$2);
      }
   }

   @Override
   public void a(@Nullable cjt $$0, int $$1, ib $$2, int $$3) {
      this.J.ah().a($$0, (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), 64.0, this.ae(), new acl($$1, $$2, $$3, false));
   }

   public int k() {
      return this.D_().p();
   }

   @Override
   public void a(il<dts> $$0, esa $$1, dts.a $$2) {
      this.O.a($$0, $$1, $$2);
   }

   @Override
   public void a(ib $$0, doz $$1, doz $$2, int $$3) {
      if (this.W) {
         String $$4 = "recursive call to sendBlockUpdated";
         ac.a("recursive call to sendBlockUpdated", new IllegalStateException("recursive call to sendBlockUpdated"));
      }

      this.l().a($$0);
      this.U.a($$0);
      est $$5 = $$1.k(this, $$0);
      est $$6 = $$2.k(this, $$0);
      if (esq.c($$5, $$6, ese.g)) {
         List<bzz> $$7 = new ObjectArrayList();

         for (bqq $$8 : this.V) {
            bzz $$9 = $$8.K();
            if ($$9.b($$0)) {
               $$7.add($$9);
            }
         }

         try {
            this.W = true;

            for (bzz $$10 : $$7) {
               $$10.i();
            }
         } finally {
            this.W = false;
         }
      }
   }

   @Override
   public void a(ib $$0, dby $$1) {
      this.s.a($$0, $$1, null);
   }

   @Override
   public void a(ib $$0, dby $$1, ih $$2) {
      this.s.a($$0, $$1, $$2);
   }

   @Override
   public void a(ib $$0, dby $$1, ib $$2) {
      this.s.a($$0, $$1, $$2);
   }

   @Override
   public void a(doz $$0, ib $$1, dby $$2, ib $$3, boolean $$4) {
      this.s.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public void a(bpv $$0, byte $$1) {
      this.l().a($$0, new acc($$0, $$1));
   }

   @Override
   public void a(bpv $$0, bot $$1) {
      this.l().a($$0, new aby($$0, $$1));
   }

   public apq l() {
      return this.I;
   }

   @Override
   public cyp a(
      @Nullable bpv $$0,
      @Nullable bot $$1,
      @Nullable cyq $$2,
      double $$3,
      double $$4,
      double $$5,
      float $$6,
      boolean $$7,
      cyx.a $$8,
      kj $$9,
      kj $$10,
      il<aul> $$11
   ) {
      cyp $$12 = this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, false, $$9, $$10, $$11);
      if (!$$12.d()) {
         $$12.h();
      }

      for (apt $$13 : this.H) {
         if ($$13.i($$3, $$4, $$5) < 4096.0) {
            $$13.d.b(new acd($$3, $$4, $$5, $$6, $$12.i(), $$12.e().get($$13), $$12.j(), $$12.k(), $$12.l(), $$12.m()));
         }
      }

      return $$12;
   }

   @Override
   public void a(ib $$0, dby $$1, int $$2, int $$3) {
      this.X.add(new cyc($$0, $$1, $$2, $$3));
   }

   private void av() {
      this.Y.clear();

      while (!this.X.isEmpty()) {
         cyc $$0 = (cyc)this.X.removeFirst();
         if (this.n($$0.a())) {
            if (this.a($$0)) {
               this.J.ah().a(null, (double)$$0.a().u(), (double)$$0.a().v(), (double)$$0.a().w(), 64.0, this.ae(), new abg($$0.a(), $$0.b(), $$0.c(), $$0.d()));
            }
         } else {
            this.Y.add($$0);
         }
      }

      this.X.addAll(this.Y);
   }

   private boolean a(cyc $$0) {
      doz $$1 = this.a_($$0.a());
      return $$1.a($$0.b()) ? $$1.a(this, $$0.a(), $$0.c(), $$0.d()) : false;
   }

   public eto<dby> m() {
      return this.S;
   }

   public eto<ekr> n() {
      return this.T;
   }

   @Nonnull
   @Override
   public MinecraftServer o() {
      return this.J;
   }

   public elq p() {
      return this.R;
   }

   public eji q() {
      return this.J.bb();
   }

   public <T extends kj> int a(T $$0, double $$1, double $$2, double $$3, int $$4, double $$5, double $$6, double $$7, double $$8) {
      acm $$9 = new acm($$0, false, $$1, $$2, $$3, (float)$$5, (float)$$6, (float)$$7, (float)$$8, $$4);
      int $$10 = 0;

      for (int $$11 = 0; $$11 < this.H.size(); $$11++) {
         apt $$12 = this.H.get($$11);
         if (this.a($$12, false, $$1, $$2, $$3, $$9)) {
            $$10++;
         }
      }

      return $$10;
   }

   public <T extends kj> boolean a(apt $$0, T $$1, boolean $$2, double $$3, double $$4, double $$5, int $$6, double $$7, double $$8, double $$9, double $$10) {
      yn<?> $$11 = new acm($$1, $$2, $$3, $$4, $$5, (float)$$7, (float)$$8, (float)$$9, (float)$$10, $$6);
      return this.a($$0, $$2, $$3, $$4, $$5, $$11);
   }

   private boolean a(apt $$0, boolean $$1, double $$2, double $$3, double $$4, yn<?> $$5) {
      if ($$0.dM() != this) {
         return false;
      } else {
         ib $$6 = $$0.dm();
         if ($$6.a(new esa($$2, $$3, $$4), $$1 ? 512.0 : 32.0)) {
            $$0.d.b($$5);
            return true;
         } else {
            return false;
         }
      }
   }

   @Nullable
   @Override
   public bpv a(int $$0) {
      return this.G().a($$0);
   }

   @Deprecated
   @Nullable
   public bpv b(int $$0) {
      bpv $$1 = this.G().a($$0);
      return $$1 != null ? $$1 : (bpv)this.ac.get($$0);
   }

   @Nullable
   public bpv a(UUID $$0) {
      return this.G().a($$0);
   }

   @Nullable
   public ib a(avr<efh> $$0, ib $$1, int $$2, boolean $$3) {
      if (!this.J.bc().y().c()) {
         return null;
      } else {
         Optional<ip.c<efh>> $$4 = this.H_().d(ks.aF).b($$0);
         if ($$4.isEmpty()) {
            return null;
         } else {
            Pair<ib, il<efh>> $$5 = this.l().g().a(this, $$4.get(), $$1, $$2, $$3);
            return $$5 != null ? (ib)$$5.getFirst() : null;
         }
      }
   }

   @Nullable
   public Pair<ib, il<czw>> a(Predicate<il<czw>> $$0, ib $$1, int $$2, int $$3, int $$4) {
      return this.l().g().c().a($$1, $$2, $$3, $$4, $$0, this.l().i().b(), this);
   }

   @Override
   public cvm r() {
      return this.J.aJ();
   }

   @Override
   public bol s() {
      return this.J.aR();
   }

   @Override
   public boolean t() {
      return this.e;
   }

   public eml u() {
      return this.l().k();
   }

   @Nullable
   @Override
   public emf a(emd $$0) {
      return this.o().I().u().b(emf.a(), $$0.a());
   }

   @Override
   public void a(emd $$0, emf $$1) {
      this.o().I().u().a($$0.a(), $$1);
   }

   @Override
   public emd v() {
      return this.o().I().u().a(eme.a(), "idcounts").b();
   }

   public void a(ib $$0, float $$1) {
      ib $$2 = this.A.a();
      float $$3 = this.A.b();
      if (!$$2.equals($$0) || $$3 != $$1) {
         this.A.a($$0, $$1);
         this.o().ah().a(new aea($$0, $$1));
      }

      if (this.L > 1) {
         this.l().b(apx.a, new cye($$2), this.L, aym.a);
      }

      int $$4 = this.aa().c(cyt.Z) + 1;
      if ($$4 > 1) {
         this.l().a(apx.a, new cye($$0), $$4, aym.a);
      }

      this.L = $$4;
   }

   public LongSet w() {
      cys $$0 = this.u().b(cys.a(), "chunks");
      return (LongSet)($$0 != null ? LongSets.unmodifiable($$0.b()) : LongSets.EMPTY_SET);
   }

   public boolean a(int $$0, int $$1, boolean $$2) {
      cys $$3 = this.u().a(cys.a(), "chunks");
      cye $$4 = new cye($$0, $$1);
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
   public List<apt> x() {
      return this.H;
   }

   @Override
   public void a(ib $$0, doz $$1, doz $$2) {
      Optional<il<cbu>> $$3 = cbv.a($$1);
      Optional<il<cbu>> $$4 = cbv.a($$2);
      if (!Objects.equals($$3, $$4)) {
         ib $$5 = $$0.i();
         $$3.ifPresent($$1x -> this.o().execute(() -> {
               this.y().a($$5);
               afi.b(this, $$5);
            }));
         $$4.ifPresent($$1x -> this.o().execute(() -> {
               this.y().a($$5, $$1x);
               afi.a(this, $$5);
            }));
      }
   }

   public cbr y() {
      return this.l().l();
   }

   public boolean c(ib $$0) {
      return this.a($$0, 1);
   }

   public boolean a(je $$0) {
      return this.c($$0.q());
   }

   public boolean a(ib $$0, int $$1) {
      return $$1 > 6 ? false : this.b(je.a($$0)) <= $$1;
   }

   public int b(je $$0) {
      return this.y().a($$0);
   }

   public clg z() {
      return this.f;
   }

   @Nullable
   public cle d(ib $$0) {
      return this.f.a($$0, 9216);
   }

   public boolean e(ib $$0) {
      return this.d($$0) != null;
   }

   public void a(cbo $$0, bpv $$1, brc $$2) {
      $$2.a($$0, $$1);
   }

   public void a(Path $$0) throws IOException {
      apb $$1 = this.l().a;

      try (Writer $$2 = Files.newBufferedWriter($$0.resolve("stats.txt"))) {
         $$2.write(String.format(Locale.ROOT, "spawning_chunks: %d\n", $$1.j().b()));
         czi.d $$3 = this.l().n();
         if ($$3 != null) {
            ObjectIterator $$9 = $$3.b().object2IntEntrySet().iterator();

            while ($$9.hasNext()) {
               Entry<bqr> $$4 = (Entry<bqr>)$$9.next();
               $$2.write(String.format(Locale.ROOT, "spawn_count.%s: %d\n", ((bqr)$$4.getKey()).a(), $$4.getIntValue()));
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

   private static void a(Writer $$0, Iterable<bpv> $$1) throws IOException {
      awk $$2 = awk.a().a("x").a("y").a("z").a("uuid").a("type").a("alive").a("display_name").a("custom_name").a($$0);

      for (bpv $$3 : $$1) {
         wg $$4 = $$3.af();
         wg $$5 = $$3.O_();
         $$2.a($$3.dr(), $$3.dt(), $$3.dx(), $$3.cw(), kr.g.b($$3.ai()), $$3.bA(), $$5.getString(), $$4 != null ? $$4.getString() : null);
      }
   }

   private void a(Writer $$0) throws IOException {
      awk $$1 = awk.a().a("x").a("y").a("z").a("type").a($$0);

      for (dnx $$2 : this.r) {
         ib $$3 = $$2.c();
         $$1.a($$3.u(), $$3.v(), $$3.w(), $$2.d());
      }
   }

   @VisibleForTesting
   public void a(eez $$0) {
      this.X.removeIf($$1 -> $$0.b($$1.a()));
   }

   @Override
   public void b(ib $$0, dby $$1) {
      if (!this.ah()) {
         this.a($$0, $$1);
      }
   }

   @Override
   public float a(ih $$0, boolean $$1) {
      return 1.0F;
   }

   public Iterable<bpv> A() {
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
   public dsu D() {
      return this.ab;
   }

   @Override
   public aps E() {
      return this;
   }

   @VisibleForTesting
   public String F() {
      return String.format(
         Locale.ROOT,
         "players: %s, entities: %s [%s], block_entities: %d [%s], block_ticks: %d, fluid_ticks: %d, chunk_source: %s",
         this.H.size(),
         this.N.e(),
         a(this.N.d().a(), $$0 -> kr.g.b($$0.ai()).toString()),
         this.r.size(),
         a(this.r, dnx::d),
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

   public static void a(aps $$0) {
      ib $$1 = a;
      int $$2 = $$1.u();
      int $$3 = $$1.v() - 2;
      int $$4 = $$1.w();
      ib.b($$2 - 2, $$3 + 1, $$4 - 2, $$2 + 2, $$3 + 3, $$4 + 2).forEach($$1x -> $$0.b($$1x, dca.a.n()));
      ib.b($$2 - 2, $$3, $$4 - 2, $$2 + 2, $$3, $$4 + 2).forEach($$1x -> $$0.b($$1x, dca.co.n()));
   }

   @Override
   protected dti<bpv> G() {
      return this.N.d();
   }

   public void a(Stream<bpv> $$0) {
      this.N.a($$0);
   }

   public void b(Stream<bpv> $$0) {
      this.N.b($$0);
   }

   public void b(drf $$0) {
      $$0.c(this.A_().c());
   }

   public void a(dqv $$0) {
      this.J.execute(() -> this.ae.a($$0.f(), $$0.g()));
   }

   public elk H() {
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

   public boolean f(ib $$0) {
      return this.N.a($$0) && this.I.a.j().c(cye.a($$0));
   }

   public boolean g(ib $$0) {
      return this.N.a($$0);
   }

   public boolean a(cye $$0) {
      return this.N.a($$0);
   }

   @Override
   public cmg J() {
      return this.J.bc().K();
   }

   public axr a(ajt $$0) {
      return this.ag.a($$0);
   }

   public boh K() {
      return this.ag;
   }

   @Override
   public p a(o $$0) {
      p $$1 = super.a($$0);
      $$1.a("Loaded entity count", () -> String.valueOf(this.N.f()));
      return $$1;
   }

   final class a implements dth<bpv> {
      public void a(bpv $$0) {
      }

      public void b(bpv $$0) {
         aps.this.f().a($$0);
      }

      public void c(bpv $$0) {
         aps.this.M.a($$0);
      }

      public void d(bpv $$0) {
         aps.this.M.b($$0);
      }

      public void e(bpv $$0) {
         aps.this.l().b($$0);
         if ($$0 instanceof apt $$1) {
            aps.this.H.add($$1);
            aps.this.e();
         }

         if ($$0 instanceof bqq $$2) {
            if (aps.this.W) {
               String $$3 = "onTrackingStart called during navigation iteration";
               ac.a("onTrackingStart called during navigation iteration", new IllegalStateException("onTrackingStart called during navigation iteration"));
            }

            aps.this.V.add($$2);
         }

         if ($$0 instanceof cex $$4) {
            for (cev $$5 : $$4.gj()) {
               aps.this.ac.put($$5.aj(), $$5);
            }
         }

         $$0.a(dtp::a);
      }

      public void f(bpv $$0) {
         aps.this.l().a($$0);
         if ($$0 instanceof apt $$1) {
            aps.this.H.remove($$1);
            aps.this.e();
         }

         if ($$0 instanceof bqq $$2) {
            if (aps.this.W) {
               String $$3 = "onTrackingStart called during navigation iteration";
               ac.a("onTrackingStart called during navigation iteration", new IllegalStateException("onTrackingStart called during navigation iteration"));
            }

            aps.this.V.remove($$2);
         }

         if ($$0 instanceof cex $$4) {
            for (cev $$5 : $$4.gj()) {
               aps.this.ac.remove($$5.aj());
            }
         }

         $$0.a(dtp::b);
      }

      public void g(bpv $$0) {
         $$0.a(dtp::c);
      }
   }
}
