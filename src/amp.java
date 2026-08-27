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

public class amp extends csy implements ctt {
   public static final hv a = new hv(100, 50, 0);
   public static final biq b = biw.a(12000, 180000);
   public static final biq c = biw.a(12000, 24000);
   private static final biq D = biw.a(12000, 180000);
   public static final biq d = biw.a(3600, 15600);
   private static final Logger E = LogUtils.getLogger();
   private static final int F = 300;
   private static final int G = 65536;
   final List<amq> H = Lists.newArrayList();
   private final amn I;
   private final MinecraftServer J;
   private final efz K;
   final dmm L = new dmm();
   private final dmr<blf> M;
   private final dna N;
   public boolean e;
   private final aqi O;
   private int P;
   private final eev Q;
   private final emk<cvz> R = new emk<>(this::d, this.af());
   private final emk<edy> S = new emk<>(this::d, this.af());
   final Set<blx> T = new ObjectOpenHashSet();
   volatile boolean U;
   protected final cgb f;
   private final ObjectLinkedOpenHashSet<csd> V = new ObjectLinkedOpenHashSet();
   private final List<csd> W = new ArrayList<>(64);
   private boolean X;
   private final List<csl> Y;
   @Nullable
   private dmb Z;
   final Int2ObjectMap<bzw> aa = new Int2ObjectOpenHashMap();
   private final ctr ab;
   private final dyp ac;
   private final boolean ad;
   private final bjr ae;

   public amp(
      MinecraftServer $$0,
      Executor $$1,
      efu.c $$2,
      efz $$3,
      ags<csy> $$4,
      dlz $$5,
      amy $$6,
      boolean $$7,
      long $$8,
      List<csl> $$9,
      boolean $$10,
      @Nullable bjr $$11
   ) {
      super($$3, $$4, $$0.aZ(), $$5.a(), $$0::aR, false, $$7, $$8, $$0.bh());
      this.ad = $$10;
      this.J = $$0;
      this.Y = $$9;
      this.K = $$3;
      dkm $$12 = $$5.b();
      boolean $$13 = $$0.aW();
      DataFixer $$14 = $$0.aA();
      dmj<blf> $$15 = new dlo(this, $$2.a($$4).resolve("entities"), $$14, $$13, $$0);
      this.M = new dmr<>(blf.class, new amp.a(), $$15);
      this.I = new amn(this, $$2, $$14, $$0.aX(), $$1, $$12, $$0.ae().p(), $$0.ae().q(), $$13, $$6, this.M::a, () -> $$0.F().t());
      this.I.h().b();
      this.Q = new eev(this);
      this.R();
      this.U();
      this.D_().a($$0.au());
      this.f = this.t().a(cgb.a(this), cgb.a(this.ac()));
      if (!$$0.Q()) {
         $$3.a($$0.v_());
      }

      long $$16 = $$0.aY().A().b();
      this.ac = new dyp(this.I.m(), this.I_(), $$0.aX(), $$4, $$12, this.I.i(), this, $$12.c(), $$16, $$14);
      this.ab = new ctr(this, $$0.aY().A(), this.ac);
      if (this.ad() == csy.j && this.ac().a(dlw.c)) {
         this.Z = new dmb(this, $$16, $$0.aY().E());
      } else {
         this.Z = null;
      }

      this.O = new aqi();
      this.N = new dna(this);
      this.ae = Objects.requireNonNullElseGet($$11, () -> this.t().a(bjr.a($$16), "random_sequences"));
   }

   @Deprecated
   @VisibleForTesting
   public void a(@Nullable dmb $$0) {
      this.Z = $$0;
   }

   public void a(int $$0, int $$1, boolean $$2, boolean $$3) {
      this.K.a($$0);
      this.K.f($$1);
      this.K.e($$1);
      this.K.b($$2);
      this.K.a($$3);
   }

   @Override
   public ie<ctx> a(int $$0, int $$1, int $$2) {
      return this.k().g().c().getNoiseBiome($$0, $$1, $$2, this.k().i().b());
   }

   public ctr a() {
      return this.ab;
   }

   public void a(BooleanSupplier $$0) {
      bgc $$1 = this.ae();
      this.X = true;
      bjv $$2 = this.r();
      boolean $$3 = $$2.i();
      if ($$3) {
         $$1.a("world border");
         this.D_().s();
         $$1.b("weather");
         this.as();
      }

      int $$4 = this.Y().c(csu.P);
      if (this.O.a($$4) && this.O.a($$4, this.H)) {
         if (this.Y().b(csu.l)) {
            long $$5 = this.A.f() + 24000L;
            this.b($$5 - $$5 % 24000L);
         }

         this.aq();
         if (this.Y().b(csu.v) && this.aa()) {
            this.at();
         }
      }

      this.R();
      if ($$3) {
         this.b();
      }

      $$1.b("tickPending");
      if (!this.ag() && $$3) {
         long $$6 = this.W();
         $$1.a("blockTicks");
         this.R.a($$6, 65536, this::d);
         $$1.b("fluidTicks");
         this.S.a($$6, 65536, this::a);
         $$1.c();
      }

      $$1.b("raid");
      if ($$3) {
         this.f.a();
      }

      $$1.b("chunkSource");
      this.k().a($$0, true);
      $$1.b("blockEvents");
      if ($$3) {
         this.av();
      }

      this.X = false;
      $$1.c();
      boolean $$7 = !this.H.isEmpty() || !this.v().isEmpty();
      if ($$7) {
         this.g();
      }

      if ($$7 || this.P++ < 300) {
         $$1.a("entities");
         if (this.Z != null) {
            $$1.a("dragonFight");
            this.Z.c();
            $$1.c();
         }

         this.L.a($$2x -> {
            if (!$$2x.dH()) {
               if (this.i($$2x)) {
                  $$2x.am();
               } else if (!$$2.a($$2x)) {
                  $$1.a("checkDespawn");
                  $$2x.dy();
                  $$1.c();
                  if (this.I.a.j().c($$2x.do().a())) {
                     blf $$3x = $$2x.cZ();
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
         this.Q();
      }

      $$1.a("entityManagement");
      this.M.a();
      $$1.c();
   }

   @Override
   public boolean a(long $$0) {
      return this.I.a.j().d($$0);
   }

   protected void b() {
      if (this.ad) {
         long $$0 = this.A.e() + 1L;
         this.K.a($$0);
         this.K.u().a(this.J, $$0);
         if (this.A.q().b(csu.l)) {
            this.b(this.A.f() + 1L);
         }
      }
   }

   public void b(long $$0) {
      this.K.b($$0);
   }

   public void a(boolean $$0, boolean $$1) {
      for (csl $$2 : this.Y) {
         $$2.a(this, $$0, $$1);
      }
   }

   private boolean i(blf $$0) {
      return this.J.Y() || !($$0 instanceof bxi) && !($$0 instanceof byk) ? !this.J.Z() && $$0 instanceof ced : true;
   }

   private void aq() {
      this.O.a();
      this.H.stream().filter(blv::fD).collect(Collectors.toList()).forEach($$0 -> $$0.a(false, false));
   }

   public void a(dkw $$0, int $$1) {
      csf $$2 = $$0.f();
      boolean $$3 = this.aa();
      int $$4 = $$2.d();
      int $$5 = $$2.e();
      bgc $$6 = this.ae();
      $$6.a("thunder");
      if ($$3 && this.Z() && this.z.a(100000) == 0) {
         hv $$7 = this.a(this.a($$4, 0, $$5, 15));
         if (this.q($$7)) {
            bjj $$8 = this.d_($$7);
            boolean $$9 = this.Y().b(csu.e) && this.z.j() < (double)$$8.b() * 0.01 && !this.a_($$7.d()).a(cwb.ss);
            if ($$9) {
               bzn $$10 = blj.aL.a((csy)this);
               if ($$10 != null) {
                  $$10.w(true);
                  $$10.c_(0);
                  $$10.a_((double)$$7.u(), (double)$$7.v(), (double)$$7.w());
                  this.b($$10);
               }
            }

            blu $$11 = blj.aj.a((csy)this);
            if ($$11 != null) {
               $$11.e(elb.c($$7));
               $$11.a($$9);
               this.b($$11);
            }
         }
      }

      $$6.b("iceandsnow");

      for (int $$12 = 0; $$12 < $$1; $$12++) {
         if (this.z.a(48) == 0) {
            this.a($$3, this.a($$4, 0, $$5, 15));
         }
      }

      $$6.b("tickBlocks");
      if ($$1 > 0) {
         dkx[] $$13 = $$0.d();

         for (int $$14 = 0; $$14 < $$13.length; $$14++) {
            dkx $$15 = $$13[$$14];
            if ($$15.d()) {
               int $$16 = $$0.g($$14);
               int $$17 = ix.c($$16);

               for (int $$18 = 0; $$18 < $$1; $$18++) {
                  hv $$19 = this.a($$4, $$17, $$5, 15);
                  $$6.a("randomTick");
                  dip $$20 = $$15.a($$19.u() - $$4, $$19.v() - $$17, $$19.w() - $$5);
                  if ($$20.v()) {
                     $$20.b(this, $$19, this.z);
                  }

                  edz $$21 = $$20.u();
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

   private void a(boolean $$0, hv $$1) {
      hv $$2 = this.a(dny.a.e, $$1);
      hv $$3 = $$2.d();
      ctx $$4 = this.s($$2).a();
      if ($$4.a(this, $$3)) {
         this.b($$3, cwb.dO.o());
      }

      if ($$0) {
         int $$5 = this.Y().c(csu.T);
         if ($$5 > 0 && $$4.b(this, $$2)) {
            dip $$6 = this.a_($$2);
            if ($$6.a(cwb.dN)) {
               int $$7 = $$6.c(ddh.c);
               if ($$7 < Math.min($$5, 8)) {
                  dip $$8 = $$6.a(ddh.c, Integer.valueOf($$7 + 1));
                  cvz.a($$6, $$8, this, $$2);
                  this.b($$2, $$8);
               }
            } else {
               this.b($$2, cwb.dN.o());
            }
         }

         ctx.c $$9 = $$4.a($$3);
         if ($$9 != ctx.c.a) {
            dip $$10 = this.a_($$3);
            $$10.b().a($$10, this, $$3, $$9);
         }
      }
   }

   private Optional<hv> D(hv $$0) {
      Optional<hv> $$1 = this.x().e($$0x -> $$0x.a(bxa.t), $$0x -> $$0x.v() == this.a(dny.a.b, $$0x.u(), $$0x.w()) - 1, $$0, 128, bww.b.c);
      return $$1.map($$0x -> $$0x.b(1));
   }

   protected hv a(hv $$0) {
      hv $$1 = this.a(dny.a.e, $$0);
      Optional<hv> $$2 = this.D($$1);
      if ($$2.isPresent()) {
         return $$2.get();
      } else {
         ekw $$3 = ekw.a($$1, new hv($$1.h(this.ak()))).g(3.0);
         List<blv> $$4 = this.a(blv.class, $$3, $$0x -> $$0x != null && $$0x.bx() && this.g($$0x.dm()));
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
      return this.X;
   }

   public boolean d() {
      return this.Y().c(csu.P) <= 100;
   }

   private void ar() {
      if (this.d()) {
         if (!this.n().Q() || this.n().p()) {
            int $$0 = this.Y().c(csu.P);
            vb $$1;
            if (this.O.a($$0)) {
               $$1 = vb.c("sleep.skipping_night");
            } else {
               $$1 = vb.a("sleep.players_sleeping", this.O.b(), this.O.b($$0));
            }

            for (amq $$3 : this.H) {
               $$3.a($$1, true);
            }
         }
      }
   }

   public void e() {
      if (!this.H.isEmpty() && this.O.a(this.H)) {
         this.ar();
      }
   }

   public ahk f() {
      return this.J.aH();
   }

   private void as() {
      boolean $$0 = this.aa();
      if (this.E_().g()) {
         if (this.Y().b(csu.v)) {
            int $$1 = this.K.h();
            int $$2 = this.K.j();
            int $$3 = this.K.l();
            boolean $$4 = this.A.i();
            boolean $$5 = this.A.k();
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

            this.K.e($$2);
            this.K.f($$3);
            this.K.a($$1);
            this.K.a($$4);
            this.K.b($$5);
         }

         this.x = this.y;
         if (this.A.i()) {
            this.y += 0.01F;
         } else {
            this.y -= 0.01F;
         }

         this.y = aty.a(this.y, 0.0F, 1.0F);
         this.v = this.w;
         if (this.A.k()) {
            this.w += 0.01F;
         } else {
            this.w -= 0.01F;
         }

         this.w = aty.a(this.w, 0.0F, 1.0F);
      }

      if (this.v != this.w) {
         this.J.ae().a(new zt(zt.h, this.w), this.ad());
      }

      if (this.x != this.y) {
         this.J.ae().a(new zt(zt.i, this.y), this.ad());
      }

      if ($$0 != this.aa()) {
         if ($$0) {
            this.J.ae().a(new zt(zt.c, 0.0F));
         } else {
            this.J.ae().a(new zt(zt.b, 0.0F));
         }

         this.J.ae().a(new zt(zt.h, this.w));
         this.J.ae().a(new zt(zt.i, this.y));
      }
   }

   private void at() {
      this.K.f(0);
      this.K.b(false);
      this.K.e(0);
      this.K.a(false);
   }

   public void g() {
      this.P = 0;
   }

   private void a(hv $$0, edy $$1) {
      edz $$2 = this.b_($$0);
      if ($$2.b($$1)) {
         $$2.a((csy)this, $$0);
      }
   }

   private void d(hv $$0, cvz $$1) {
      dip $$2 = this.a_($$0);
      if ($$2.a($$1)) {
         $$2.a(this, $$0, this.z);
      }
   }

   public void a(blf $$0) {
      $$0.bp();
      bgc $$1 = this.ae();
      $$0.ah++;
      this.ae().a(() -> kb.g.b($$0.ai()).toString());
      $$1.d("tickNonPassenger");
      $$0.l();
      this.ae().c();

      for (blf $$2 : $$0.cP()) {
         this.a($$0, $$2);
      }
   }

   private void a(blf $$0, blf $$1) {
      if ($$1.dH() || $$1.cZ() != $$0) {
         $$1.ac();
      } else if ($$1 instanceof cer || this.L.c($$1)) {
         $$1.bp();
         $$1.ah++;
         bgc $$2 = this.ae();
         $$2.a(() -> kb.g.b($$1.ai()).toString());
         $$2.d("tickPassenger");
         $$1.t();
         $$2.c();

         for (blf $$3 : $$1.cP()) {
            this.a($$1, $$3);
         }
      }
   }

   @Override
   public boolean a(cer $$0, hv $$1) {
      return !this.J.a(this, $$1, $$0) && this.D_().a($$1);
   }

   public void a(@Nullable aue $$0, boolean $$1, boolean $$2) {
      amn $$3 = this.k();
      if (!$$2) {
         if ($$0 != null) {
            $$0.a(vb.c("menu.savingLevel"));
         }

         this.au();
         if ($$0 != null) {
            $$0.c(vb.c("menu.savingChunks"));
         }

         $$3.a($$1);
         if ($$1) {
            this.M.c();
         } else {
            this.M.b();
         }
      }
   }

   private void au() {
      if (this.Z != null) {
         this.J.aY().a(this.Z.b());
      }

      this.k().k().a();
   }

   public <T extends blf> List<? extends T> a(dmn<blf, T> $$0, Predicate<? super T> $$1) {
      List<T> $$2 = Lists.newArrayList();
      this.a($$0, $$1, $$2);
      return $$2;
   }

   public <T extends blf> void a(dmn<blf, T> $$0, Predicate<? super T> $$1, List<? super T> $$2) {
      this.a($$0, $$1, $$2, Integer.MAX_VALUE);
   }

   public <T extends blf> void a(dmn<blf, T> $$0, Predicate<? super T> $$1, List<? super T> $$2, int $$3) {
      this.F().a($$0, $$3x -> {
         if ($$1.test((T)$$3x)) {
            $$2.add((T)$$3x);
            if ($$2.size() >= $$3) {
               return asm.a.b;
            }
         }

         return asm.a.a;
      });
   }

   public List<? extends bzy> h() {
      return this.a(blj.D, blv::bx);
   }

   public List<amq> a(Predicate<? super amq> $$0) {
      return this.a($$0, Integer.MAX_VALUE);
   }

   public List<amq> a(Predicate<? super amq> $$0, int $$1) {
      List<amq> $$2 = Lists.newArrayList();

      for (amq $$3 : this.H) {
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
   public amq i() {
      List<amq> $$0 = this.a(blv::bx);
      return $$0.isEmpty() ? null : $$0.get(this.z.a($$0.size()));
   }

   @Override
   public boolean b(blf $$0) {
      return this.j($$0);
   }

   public boolean c(blf $$0) {
      return this.j($$0);
   }

   public void d(blf $$0) {
      this.j($$0);
   }

   public void a(amq $$0) {
      this.e($$0);
   }

   public void b(amq $$0) {
      this.e($$0);
   }

   public void c(amq $$0) {
      this.e($$0);
   }

   public void d(amq $$0) {
      this.e($$0);
   }

   private void e(amq $$0) {
      blf $$1 = this.F().a($$0.cw());
      if ($$1 != null) {
         E.warn("Force-added player with duplicate UUID {}", $$0.cw());
         $$1.ag();
         this.a((amq)$$1, blf.c.b);
      }

      this.M.a($$0);
   }

   private boolean j(blf $$0) {
      if ($$0.dH()) {
         E.warn("Tried to add entity {} but it was marked as removed already", blj.a($$0.ai()));
         return false;
      } else {
         return this.M.a($$0);
      }
   }

   public boolean e(blf $$0) {
      if ($$0.cR().map(blf::cw).anyMatch(this.M::a)) {
         return false;
      } else {
         this.a_($$0);
         return true;
      }
   }

   public void a(dkw $$0) {
      $$0.I();
      $$0.b(this);
   }

   public void a(amq $$0, blf.c $$1) {
      $$0.a($$1);
   }

   @Override
   public void a(int $$0, hv $$1, int $$2) {
      for (amq $$3 : this.J.ae().t()) {
         if ($$3 != null && $$3.dM() == this && $$3.aj() != $$0) {
            double $$4 = (double)$$1.u() - $$3.dr();
            double $$5 = (double)$$1.v() - $$3.dt();
            double $$6 = (double)$$1.w() - $$3.dx();
            if ($$4 * $$4 + $$5 * $$5 + $$6 * $$6 < 1024.0) {
               $$3.c.b(new yu($$0, $$1, $$2));
            }
         }
      }
   }

   @Override
   public void a(@Nullable cer $$0, double $$1, double $$2, double $$3, ie<arb> $$4, ard $$5, float $$6, float $$7, long $$8) {
      this.J.ae().a($$0, $$1, $$2, $$3, (double)$$4.a().a($$6), this.ad(), new acf($$4, $$5, $$1, $$2, $$3, $$6, $$7, $$8));
   }

   @Override
   public void a(@Nullable cer $$0, blf $$1, ie<arb> $$2, ard $$3, float $$4, float $$5, long $$6) {
      this.J.ae().a($$0, $$1.dr(), $$1.dt(), $$1.dx(), (double)$$2.a().a($$4), this.ad(), new ace($$2, $$3, $$1, $$4, $$5, $$6));
   }

   @Override
   public void b(int $$0, hv $$1, int $$2) {
      if (this.Y().b(csu.W)) {
         this.J.ae().a(new zz($$0, $$1, $$2, true));
      } else {
         this.a(null, $$0, $$1, $$2);
      }
   }

   @Override
   public void a(@Nullable cer $$0, int $$1, hv $$2, int $$3) {
      this.J.ae().a($$0, (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), 64.0, this.ad(), new zz($$1, $$2, $$3, false));
   }

   public int j() {
      return this.E_().p();
   }

   @Override
   public void a(dmz $$0, elb $$1, dmz.a $$2) {
      this.N.a($$0, $$1, $$2);
   }

   @Override
   public void a(hv $$0, dip $$1, dip $$2, int $$3) {
      if (this.U) {
         String $$4 = "recursive call to sendBlockUpdated";
         ac.a("recursive call to sendBlockUpdated", new IllegalStateException("recursive call to sendBlockUpdated"));
      }

      this.k().a($$0);
      elu $$5 = $$1.k(this, $$0);
      elu $$6 = $$2.k(this, $$0);
      if (elr.c($$5, $$6, elf.g)) {
         List<bvf> $$7 = new ObjectArrayList();

         for (blx $$8 : this.T) {
            bvf $$9 = $$8.N();
            if ($$9.b($$0)) {
               $$7.add($$9);
            }
         }

         try {
            this.U = true;

            for (bvf $$10 : $$7) {
               $$10.i();
            }
         } finally {
            this.U = false;
         }
      }
   }

   @Override
   public void a(hv $$0, cvz $$1) {
      this.s.a($$0, $$1, null);
   }

   @Override
   public void a(hv $$0, cvz $$1, ia $$2) {
      this.s.a($$0, $$1, $$2);
   }

   @Override
   public void a(hv $$0, cvz $$1, hv $$2) {
      this.s.a($$0, $$1, $$2);
   }

   @Override
   public void a(dip $$0, hv $$1, cvz $$2, hv $$3, boolean $$4) {
      this.s.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public void a(blf $$0, byte $$1) {
      this.k().a($$0, new zq($$0, $$1));
   }

   @Override
   public void a(blf $$0, bkd $$1) {
      this.k().a($$0, new zn($$0, $$1));
   }

   public amn k() {
      return this.I;
   }

   @Override
   public csq a(
      @Nullable blf $$0, @Nullable bkd $$1, @Nullable csr $$2, double $$3, double $$4, double $$5, float $$6, boolean $$7, csy.a $$8, jt $$9, jt $$10, arb $$11
   ) {
      csq $$12 = this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, false, $$9, $$10, $$11);
      if (!$$12.d()) {
         $$12.h();
      }

      for (amq $$13 : this.H) {
         if ($$13.i($$3, $$4, $$5) < 4096.0) {
            $$13.c.b(new zr($$3, $$4, $$5, $$6, $$12.i(), $$12.e().get($$13), $$12.j(), $$12.k(), $$12.l(), $$12.m()));
         }
      }

      return $$12;
   }

   @Override
   public void a(hv $$0, cvz $$1, int $$2, int $$3) {
      this.V.add(new csd($$0, $$1, $$2, $$3));
   }

   private void av() {
      this.W.clear();

      while (!this.V.isEmpty()) {
         csd $$0 = (csd)this.V.removeFirst();
         if (this.m($$0.a())) {
            if (this.a($$0)) {
               this.J.ae().a(null, (double)$$0.a().u(), (double)$$0.a().v(), (double)$$0.a().w(), 64.0, this.ad(), new yw($$0.a(), $$0.b(), $$0.c(), $$0.d()));
            }
         } else {
            this.W.add($$0);
         }
      }

      this.V.addAll(this.W);
   }

   private boolean a(csd $$0) {
      dip $$1 = this.a_($$0.a());
      return $$1.a($$0.b()) ? $$1.a(this, $$0.a(), $$0.c(), $$0.d()) : false;
   }

   public emk<cvz> l() {
      return this.R;
   }

   public emk<edy> m() {
      return this.S;
   }

   @Nonnull
   @Override
   public MinecraftServer n() {
      return this.J;
   }

   public eev o() {
      return this.Q;
   }

   public ecp p() {
      return this.J.aX();
   }

   public <T extends jt> int a(T $$0, double $$1, double $$2, double $$3, int $$4, double $$5, double $$6, double $$7, double $$8) {
      aaa $$9 = new aaa($$0, false, $$1, $$2, $$3, (float)$$5, (float)$$6, (float)$$7, (float)$$8, $$4);
      int $$10 = 0;

      for (int $$11 = 0; $$11 < this.H.size(); $$11++) {
         amq $$12 = this.H.get($$11);
         if (this.a($$12, false, $$1, $$2, $$3, $$9)) {
            $$10++;
         }
      }

      return $$10;
   }

   public <T extends jt> boolean a(amq $$0, T $$1, boolean $$2, double $$3, double $$4, double $$5, int $$6, double $$7, double $$8, double $$9, double $$10) {
      wu<?> $$11 = new aaa($$1, $$2, $$3, $$4, $$5, (float)$$7, (float)$$8, (float)$$9, (float)$$10, $$6);
      return this.a($$0, $$2, $$3, $$4, $$5, $$11);
   }

   private boolean a(amq $$0, boolean $$1, double $$2, double $$3, double $$4, wu<?> $$5) {
      if ($$0.dM() != this) {
         return false;
      } else {
         hv $$6 = $$0.dm();
         if ($$6.a(new elb($$2, $$3, $$4), $$1 ? 512.0 : 32.0)) {
            $$0.c.b($$5);
            return true;
         } else {
            return false;
         }
      }
   }

   @Nullable
   @Override
   public blf a(int $$0) {
      return this.F().a($$0);
   }

   @Deprecated
   @Nullable
   public blf b(int $$0) {
      blf $$1 = this.F().a($$0);
      return $$1 != null ? $$1 : (blf)this.aa.get($$0);
   }

   @Nullable
   public blf a(UUID $$0) {
      return this.F().a($$0);
   }

   @Nullable
   public hv a(asg<dyo> $$0, hv $$1, int $$2, boolean $$3) {
      if (!this.J.aY().A().c()) {
         return null;
      } else {
         Optional<ij.c<dyo>> $$4 = this.I_().d(kc.aC).b($$0);
         if ($$4.isEmpty()) {
            return null;
         } else {
            Pair<hv, ie<dyo>> $$5 = this.k().g().a(this, $$4.get(), $$1, $$2, $$3);
            return $$5 != null ? (hv)$$5.getFirst() : null;
         }
      }
   }

   @Nullable
   public Pair<hv, ie<ctx>> a(Predicate<ie<ctx>> $$0, hv $$1, int $$2, int $$3, int $$4) {
      return this.k().g().c().a($$1, $$2, $$3, $$4, $$0, this.k().i().b(), this);
   }

   @Override
   public cpo q() {
      return this.J.aG();
   }

   @Override
   public bjv r() {
      return this.J.aO();
   }

   @Override
   public boolean s() {
      return this.e;
   }

   public efp t() {
      return this.k().k();
   }

   @Nullable
   @Override
   public efj a(String $$0) {
      return this.n().F().t().b(efj.a(), $$0);
   }

   @Override
   public void a(String $$0, efj $$1) {
      this.n().F().t().a($$0, $$1);
   }

   @Override
   public int u() {
      return this.n().F().t().a(efi.a(), "idcounts").b();
   }

   public void a(hv $$0, float $$1) {
      csf $$2 = new csf(new hv(this.A.a(), 0, this.A.c()));
      this.A.a($$0, $$1);
      this.k().b(amu.a, $$2, 11, avc.a);
      this.k().a(amu.a, new csf($$0), 11, avc.a);
      this.n().ae().a(new abn($$0, $$1));
   }

   public LongSet v() {
      cst $$0 = this.t().b(cst.a(), "chunks");
      return (LongSet)($$0 != null ? LongSets.unmodifiable($$0.b()) : LongSets.EMPTY_SET);
   }

   public boolean a(int $$0, int $$1, boolean $$2) {
      cst $$3 = this.t().a(cst.a(), "chunks");
      csf $$4 = new csf($$0, $$1);
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
         this.k().a($$4, $$2);
      }

      return $$6;
   }

   @Override
   public List<amq> w() {
      return this.H;
   }

   @Override
   public void a(hv $$0, dip $$1, dip $$2) {
      Optional<ie<bwz>> $$3 = bxa.a($$1);
      Optional<ie<bwz>> $$4 = bxa.a($$2);
      if (!Objects.equals($$3, $$4)) {
         hv $$5 = $$0.i();
         $$3.ifPresent($$1x -> this.n().execute(() -> {
               this.x().a($$5);
               acv.b(this, $$5);
            }));
         $$4.ifPresent($$1x -> this.n().execute(() -> {
               this.x().a($$5, $$1x);
               acv.a(this, $$5);
            }));
      }
   }

   public bww x() {
      return this.k().l();
   }

   public boolean b(hv $$0) {
      return this.a($$0, 1);
   }

   public boolean a(ix $$0) {
      return this.b($$0.q());
   }

   public boolean a(hv $$0, int $$1) {
      return $$1 > 6 ? false : this.b(ix.a($$0)) <= $$1;
   }

   public int b(ix $$0) {
      return this.x().a($$0);
   }

   public cgb y() {
      return this.f;
   }

   @Nullable
   public cfz c(hv $$0) {
      return this.f.a($$0, 9216);
   }

   public boolean d(hv $$0) {
      return this.c($$0) != null;
   }

   public void a(bwt $$0, blf $$1, bmk $$2) {
      $$2.a($$0, $$1);
   }

   public void a(Path $$0) throws IOException {
      alz $$1 = this.k().a;

      try (Writer $$2 = Files.newBufferedWriter($$0.resolve("stats.txt"))) {
         $$2.write(String.format(Locale.ROOT, "spawning_chunks: %d\n", $$1.j().b()));
         ctj.d $$3 = this.k().n();
         if ($$3 != null) {
            ObjectIterator $$9 = $$3.b().object2IntEntrySet().iterator();

            while ($$9.hasNext()) {
               Entry<bly> $$4 = (Entry<bly>)$$9.next();
               $$2.write(String.format(Locale.ROOT, "spawn_count.%s: %d\n", ((bly)$$4.getKey()).a(), $$4.getIntValue()));
            }
         }

         $$2.write(String.format(Locale.ROOT, "entities: %s\n", this.M.e()));
         $$2.write(String.format(Locale.ROOT, "block_entity_tickers: %d\n", this.r.size()));
         $$2.write(String.format(Locale.ROOT, "block_ticks: %d\n", this.l().a()));
         $$2.write(String.format(Locale.ROOT, "fluid_ticks: %d\n", this.m().a()));
         $$2.write("distance_manager: " + $$1.j().c() + "\n");
         $$2.write(String.format(Locale.ROOT, "pending_tasks: %d\n", this.k().f()));
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
         this.M.a($$10);
      }

      Path $$11 = $$0.resolve("entities.csv");

      try (Writer $$12 = Files.newBufferedWriter($$11)) {
         a($$12, this.F().a());
      }

      Path $$13 = $$0.resolve("block_entities.csv");

      try (Writer $$14 = Files.newBufferedWriter($$13)) {
         this.a($$14);
      }
   }

   private static void a(Writer $$0, Iterable<blf> $$1) throws IOException {
      asy $$2 = asy.a().a("x").a("y").a("z").a("uuid").a("type").a("alive").a("display_name").a("custom_name").a($$0);

      for (blf $$3 : $$1) {
         vb $$4 = $$3.af();
         vb $$5 = $$3.Q_();
         $$2.a($$3.dr(), $$3.dt(), $$3.dx(), $$3.cw(), kb.g.b($$3.ai()), $$3.bx(), $$5.getString(), $$4 != null ? $$4.getString() : null);
      }
   }

   private void a(Writer $$0) throws IOException {
      asy $$1 = asy.a().a("x").a("y").a("z").a("type").a($$0);

      for (dhu $$2 : this.r) {
         hv $$3 = $$2.c();
         $$1.a($$3.u(), $$3.v(), $$3.w(), $$2.d());
      }
   }

   @VisibleForTesting
   public void a(dyg $$0) {
      this.V.removeIf($$1 -> $$0.b($$1.a()));
   }

   @Override
   public void b(hv $$0, cvz $$1) {
      if (!this.ag()) {
         this.a($$0, $$1);
      }
   }

   @Override
   public float a(ia $$0, boolean $$1) {
      return 1.0F;
   }

   public Iterable<blf> z() {
      return this.F().a();
   }

   @Override
   public String toString() {
      return "ServerLevel[" + this.K.g() + "]";
   }

   public boolean A() {
      return this.J.aY().B();
   }

   @Override
   public long B() {
      return this.J.aY().A().b();
   }

   @Nullable
   public dmb C() {
      return this.Z;
   }

   @Override
   public amp D() {
      return this;
   }

   @VisibleForTesting
   public String E() {
      return String.format(
         Locale.ROOT,
         "players: %s, entities: %s [%s], block_entities: %d [%s], block_ticks: %d, fluid_ticks: %d, chunk_source: %s",
         this.H.size(),
         this.M.e(),
         a(this.M.d().a(), $$0 -> kb.g.b($$0.ai()).toString()),
         this.r.size(),
         a(this.r, dhu::d),
         this.l().a(),
         this.m().a(),
         this.G()
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

   public static void a(amp $$0) {
      hv $$1 = a;
      int $$2 = $$1.u();
      int $$3 = $$1.v() - 2;
      int $$4 = $$1.w();
      hv.b($$2 - 2, $$3 + 1, $$4 - 2, $$2 + 2, $$3 + 3, $$4 + 2).forEach($$1x -> $$0.b($$1x, cwb.a.o()));
      hv.b($$2 - 2, $$3, $$4 - 2, $$2 + 2, $$3, $$4 + 2).forEach($$1x -> $$0.b($$1x, cwb.co.o()));
   }

   @Override
   protected dmp<blf> F() {
      return this.M.d();
   }

   public void a(Stream<blf> $$0) {
      this.M.a($$0);
   }

   public void b(Stream<blf> $$0) {
      this.M.b($$0);
   }

   public void b(dkw $$0) {
      $$0.c(this.B_().e());
   }

   public void a(dkl $$0) {
      this.J.execute(() -> this.ac.a($$0.f(), $$0.g()));
   }

   @Override
   public void close() throws IOException {
      super.close();
      this.M.close();
   }

   @Override
   public String G() {
      return "Chunks[S] W: " + this.I.e() + " E: " + this.M.e();
   }

   public boolean c(long $$0) {
      return this.M.a($$0);
   }

   private boolean d(long $$0) {
      return this.c($$0) && this.I.a($$0);
   }

   public boolean e(hv $$0) {
      return this.M.a($$0) && this.I.a.j().c(csf.a($$0));
   }

   public boolean f(hv $$0) {
      return this.M.a($$0);
   }

   public boolean a(csf $$0) {
      return this.M.a($$0);
   }

   @Override
   public chb H() {
      return this.J.aY().M();
   }

   public auf a(agt $$0) {
      return this.ae.a($$0);
   }

   public bjr I() {
      return this.ae;
   }

   @Override
   public p a(o $$0) {
      p $$1 = super.a($$0);
      $$1.a("Loaded entity count", () -> String.valueOf(this.M.f()));
      return $$1;
   }

   final class a implements dmo<blf> {
      public void a(blf $$0) {
      }

      public void b(blf $$0) {
         amp.this.f().a($$0);
      }

      public void c(blf $$0) {
         amp.this.L.a($$0);
      }

      public void d(blf $$0) {
         amp.this.L.b($$0);
      }

      public void e(blf $$0) {
         amp.this.k().b($$0);
         if ($$0 instanceof amq $$1) {
            amp.this.H.add($$1);
            amp.this.e();
         }

         if ($$0 instanceof blx $$2) {
            if (amp.this.U) {
               String $$3 = "onTrackingStart called during navigation iteration";
               ac.a("onTrackingStart called during navigation iteration", new IllegalStateException("onTrackingStart called during navigation iteration"));
            }

            amp.this.T.add($$2);
         }

         if ($$0 instanceof bzy $$4) {
            for (bzw $$5 : $$4.ga()) {
               amp.this.aa.put($$5.aj(), $$5);
            }
         }

         $$0.a(dmw::a);
      }

      public void f(blf $$0) {
         amp.this.k().a($$0);
         if ($$0 instanceof amq $$1) {
            amp.this.H.remove($$1);
            amp.this.e();
         }

         if ($$0 instanceof blx $$2) {
            if (amp.this.U) {
               String $$3 = "onTrackingStart called during navigation iteration";
               ac.a("onTrackingStart called during navigation iteration", new IllegalStateException("onTrackingStart called during navigation iteration"));
            }

            amp.this.T.remove($$2);
         }

         if ($$0 instanceof bzy $$4) {
            for (bzw $$5 : $$4.ga()) {
               amp.this.aa.remove($$5.aj());
            }
         }

         $$0.a(dmw::b);
      }

      public void g(blf $$0) {
         $$0.a(dmw::c);
      }
   }
}
