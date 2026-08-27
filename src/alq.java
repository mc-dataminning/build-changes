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

public class alq extends cqz implements crt {
   public static final ht a = new ht(100, 50, 0);
   public static final bhg b = bhm.a(12000, 180000);
   public static final bhg c = bhm.a(12000, 24000);
   private static final bhg D = bhm.a(12000, 180000);
   public static final bhg d = bhm.a(3600, 15600);
   private static final Logger E = LogUtils.getLogger();
   private static final int F = 300;
   private static final int G = 65536;
   final List<alr> H = Lists.newArrayList();
   private final alo I;
   private final MinecraftServer J;
   private final edd K;
   final djy L = new djy();
   private final dkd<bjt> M;
   private final dkm N;
   public boolean e;
   private final apj O;
   private int P;
   private final eca Q;
   private final ejo<cua> R = new ejo<>(this::d, this.ae());
   private final ejo<ebd> S = new ejo<>(this::d, this.ae());
   final Set<bkl> T = new ObjectOpenHashSet();
   volatile boolean U;
   protected final ceg f;
   private final ObjectLinkedOpenHashSet<cqe> V = new ObjectLinkedOpenHashSet();
   private final List<cqe> W = new ArrayList<>(64);
   private boolean X;
   private final List<cqm> Y;
   @Nullable
   private djn Z;
   final Int2ObjectMap<byi> aa = new Int2ObjectOpenHashMap();
   private final crr ab;
   private final dwb ac;
   private final boolean ad;
   private final bih ae;

   public alq(
      MinecraftServer $$0,
      Executor $$1,
      ecy.c $$2,
      edd $$3,
      afv<cqz> $$4,
      djl $$5,
      alz $$6,
      boolean $$7,
      long $$8,
      List<cqm> $$9,
      boolean $$10,
      @Nullable bih $$11
   ) {
      super($$3, $$4, $$0.aU(), $$5.a(), $$0::aM, false, $$7, $$8, $$0.bc());
      this.ad = $$10;
      this.J = $$0;
      this.Y = $$9;
      this.K = $$3;
      dhy $$12 = $$5.b();
      boolean $$13 = $$0.aR();
      DataFixer $$14 = $$0.ay();
      djv<bjt> $$15 = new dja(this, $$2.a($$4).resolve("entities"), $$14, $$13, $$0);
      this.M = new dkd<>(bjt.class, new alq.a(), $$15);
      this.I = new alo(this, $$2, $$14, $$0.aS(), $$1, $$12, $$0.ac().p(), $$0.ac().q(), $$13, $$6, this.M::a, () -> $$0.D().s());
      this.I.h().b();
      this.Q = new eca(this);
      this.Q();
      this.T();
      this.C_().a($$0.as());
      this.f = this.s().a(ceg.a(this), ceg.a(this.ab()));
      if (!$$0.O()) {
         $$3.a($$0.u_());
      }

      long $$16 = $$0.aT().A().b();
      this.ac = new dwb(this.I.m(), this.H_(), $$0.aS(), $$4, $$12, this.I.i(), this, $$12.c(), $$16, $$14);
      this.ab = new crr(this, $$0.aT().A(), this.ac);
      if (this.ac() == cqz.j && this.ab().a(dji.c)) {
         this.Z = new djn(this, $$16, $$0.aT().E());
      } else {
         this.Z = null;
      }

      this.O = new apj();
      this.N = new dkm(this);
      this.ae = Objects.requireNonNullElseGet($$11, () -> this.s().a(bih.a($$16), "random_sequences"));
   }

   @Deprecated
   @VisibleForTesting
   public void a(@Nullable djn $$0) {
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
   public ib<crx> a(int $$0, int $$1, int $$2) {
      return this.k().g().c().getNoiseBiome($$0, $$1, $$2, this.k().i().b());
   }

   public crr a() {
      return this.ab;
   }

   public void a(BooleanSupplier $$0) {
      bes $$1 = this.ad();
      this.X = true;
      $$1.a("world border");
      this.C_().s();
      $$1.b("weather");
      this.ar();
      int $$2 = this.X().c(cqv.M);
      if (this.O.a($$2) && this.O.a($$2, this.H)) {
         if (this.X().b(cqv.k)) {
            long $$3 = this.A.f() + 24000L;
            this.b($$3 - $$3 % 24000L);
         }

         this.ap();
         if (this.X().b(cqv.u) && this.Z()) {
            this.as();
         }
      }

      this.Q();
      this.b();
      $$1.b("tickPending");
      if (!this.af()) {
         long $$4 = this.V();
         $$1.a("blockTicks");
         this.R.a($$4, 65536, this::d);
         $$1.b("fluidTicks");
         this.S.a($$4, 65536, this::a);
         $$1.c();
      }

      $$1.b("raid");
      this.f.a();
      $$1.b("chunkSource");
      this.k().a($$0, true);
      $$1.b("blockEvents");
      this.au();
      this.X = false;
      $$1.c();
      boolean $$5 = !this.H.isEmpty() || !this.u().isEmpty();
      if ($$5) {
         this.g();
      }

      if ($$5 || this.P++ < 300) {
         $$1.a("entities");
         if (this.Z != null) {
            $$1.a("dragonFight");
            this.Z.c();
            $$1.c();
         }

         this.L.a($$1x -> {
            if (!$$1x.dG()) {
               if (this.i($$1x)) {
                  $$1x.ak();
               } else {
                  $$1.a("checkDespawn");
                  $$1x.dx();
                  $$1.c();
                  if (this.I.a.j().c($$1x.dn().a())) {
                     bjt $$2x = $$1x.cY();
                     if ($$2x != null) {
                        if (!$$2x.dG() && $$2x.x($$1x)) {
                           return;
                        }

                        $$1x.aa();
                     }

                     $$1.a("tick");
                     this.a(this::a, $$1x);
                     $$1.c();
                  }
               }
            }
         });
         $$1.c();
         this.P();
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
         if (this.A.q().b(cqv.k)) {
            this.b(this.A.f() + 1L);
         }
      }
   }

   public void b(long $$0) {
      this.K.b($$0);
   }

   public void a(boolean $$0, boolean $$1) {
      for (cqm $$2 : this.Y) {
         $$2.a(this, $$0, $$1);
      }
   }

   private boolean i(bjt $$0) {
      return this.J.W() || !($$0 instanceof bvu) && !($$0 instanceof bww) ? !this.J.X() && $$0 instanceof ccj : true;
   }

   private void ap() {
      this.O.a();
      this.H.stream().filter(bkj::fD).collect(Collectors.toList()).forEach($$0 -> $$0.a(false, false));
   }

   public void a(dii $$0, int $$1) {
      cqg $$2 = $$0.f();
      boolean $$3 = this.Z();
      int $$4 = $$2.d();
      int $$5 = $$2.e();
      bes $$6 = this.ad();
      $$6.a("thunder");
      if ($$3 && this.Y() && this.z.a(100000) == 0) {
         ht $$7 = this.a(this.a($$4, 0, $$5, 15));
         if (this.q($$7)) {
            bhz $$8 = this.d_($$7);
            boolean $$9 = this.X().b(cqv.e) && this.z.j() < (double)$$8.b() * 0.01 && !this.a_($$7.d()).a(cuc.rr);
            if ($$9) {
               bxz $$10 = bjx.aK.a((cqz)this);
               if ($$10 != null) {
                  $$10.w(true);
                  $$10.c_(0);
                  $$10.e((double)$$7.u(), (double)$$7.v(), (double)$$7.w());
                  this.b($$10);
               }
            }

            bki $$11 = bjx.ai.a((cqz)this);
            if ($$11 != null) {
               $$11.d(eif.c($$7));
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
         dij[] $$13 = $$0.d();

         for (int $$14 = 0; $$14 < $$13.length; $$14++) {
            dij $$15 = $$13[$$14];
            if ($$15.d()) {
               int $$16 = $$0.g($$14);
               int $$17 = iu.c($$16);

               for (int $$18 = 0; $$18 < $$1; $$18++) {
                  ht $$19 = this.a($$4, $$17, $$5, 15);
                  $$6.a("randomTick");
                  dgb $$20 = $$15.a($$19.u() - $$4, $$19.v() - $$17, $$19.w() - $$5);
                  if ($$20.v()) {
                     $$20.b(this, $$19, this.z);
                  }

                  ebe $$21 = $$20.u();
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

   private void a(boolean $$0, ht $$1) {
      ht $$2 = this.a(dlk.a.e, $$1);
      ht $$3 = $$2.d();
      crx $$4 = this.s($$2).a();
      if ($$4.a(this, $$3)) {
         this.b($$3, cuc.dO.o());
      }

      if ($$0) {
         int $$5 = this.X().c(cqv.Q);
         if ($$5 > 0 && $$4.b(this, $$2)) {
            dgb $$6 = this.a_($$2);
            if ($$6.a(cuc.dN)) {
               int $$7 = $$6.c(dbh.c);
               if ($$7 < Math.min($$5, 8)) {
                  dgb $$8 = $$6.a(dbh.c, Integer.valueOf($$7 + 1));
                  cua.a($$6, $$8, this, $$2);
                  this.b($$2, $$8);
               }
            } else {
               this.b($$2, cuc.dN.o());
            }
         }

         crx.c $$9 = $$4.a($$3);
         if ($$9 != crx.c.a) {
            dgb $$10 = this.a_($$3);
            $$10.b().a($$10, this, $$3, $$9);
         }
      }
   }

   private Optional<ht> D(ht $$0) {
      Optional<ht> $$1 = this.w().e($$0x -> $$0x.a(bvm.t), $$0x -> $$0x.v() == this.a(dlk.a.b, $$0x.u(), $$0x.w()) - 1, $$0, 128, bvi.b.c);
      return $$1.map($$0x -> $$0x.b(1));
   }

   protected ht a(ht $$0) {
      ht $$1 = this.a(dlk.a.e, $$0);
      Optional<ht> $$2 = this.D($$1);
      if ($$2.isPresent()) {
         return $$2.get();
      } else {
         eia $$3 = new eia($$1, new ht($$1.u(), this.aj(), $$1.w())).g(3.0);
         List<bkj> $$4 = this.a(bkj.class, $$3, $$0x -> $$0x != null && $$0x.bv() && this.g($$0x.dl()));
         if (!$$4.isEmpty()) {
            return $$4.get(this.z.a($$4.size())).dl();
         } else {
            if ($$1.v() == this.I_() - 1) {
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
      return this.X().c(cqv.M) <= 100;
   }

   private void aq() {
      if (this.d()) {
         if (!this.n().O() || this.n().p()) {
            int $$0 = this.X().c(cqv.M);
            ui $$1;
            if (this.O.a($$0)) {
               $$1 = ui.c("sleep.skipping_night");
            } else {
               $$1 = ui.a("sleep.players_sleeping", this.O.b(), this.O.b($$0));
            }

            for (alr $$3 : this.H) {
               $$3.a($$1, true);
            }
         }
      }
   }

   public void e() {
      if (!this.H.isEmpty() && this.O.a(this.H)) {
         this.aq();
      }
   }

   public agn f() {
      return this.J.aF();
   }

   private void ar() {
      boolean $$0 = this.Z();
      if (this.D_().g()) {
         if (this.X().b(cqv.u)) {
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

         this.y = asy.a(this.y, 0.0F, 1.0F);
         this.v = this.w;
         if (this.A.k()) {
            this.w += 0.01F;
         } else {
            this.w -= 0.01F;
         }

         this.w = asy.a(this.w, 0.0F, 1.0F);
      }

      if (this.v != this.w) {
         this.J.ac().a(new yz(yz.h, this.w), this.ac());
      }

      if (this.x != this.y) {
         this.J.ac().a(new yz(yz.i, this.y), this.ac());
      }

      if ($$0 != this.Z()) {
         if ($$0) {
            this.J.ac().a(new yz(yz.c, 0.0F));
         } else {
            this.J.ac().a(new yz(yz.b, 0.0F));
         }

         this.J.ac().a(new yz(yz.h, this.w));
         this.J.ac().a(new yz(yz.i, this.y));
      }
   }

   private void as() {
      this.K.f(0);
      this.K.b(false);
      this.K.e(0);
      this.K.a(false);
   }

   public void g() {
      this.P = 0;
   }

   private void a(ht $$0, ebd $$1) {
      ebe $$2 = this.b_($$0);
      if ($$2.b($$1)) {
         $$2.a((cqz)this, $$0);
      }
   }

   private void d(ht $$0, cua $$1) {
      dgb $$2 = this.a_($$0);
      if ($$2.a($$1)) {
         $$2.a(this, $$0, this.z);
      }
   }

   public void a(bjt $$0) {
      $$0.bn();
      bes $$1 = this.ad();
      $$0.ah++;
      this.ad().a(() -> jy.h.b($$0.ag()).toString());
      $$1.d("tickNonPassenger");
      $$0.l();
      this.ad().c();

      for (bjt $$2 : $$0.cP()) {
         this.a($$0, $$2);
      }
   }

   private void a(bjt $$0, bjt $$1) {
      if ($$1.dG() || $$1.cY() != $$0) {
         $$1.aa();
      } else if ($$1 instanceof ccx || this.L.c($$1)) {
         $$1.bn();
         $$1.ah++;
         bes $$2 = this.ad();
         $$2.a(() -> jy.h.b($$1.ag()).toString());
         $$2.d("tickPassenger");
         $$1.by();
         $$2.c();

         for (bjt $$3 : $$1.cP()) {
            this.a($$1, $$3);
         }
      }
   }

   @Override
   public boolean a(ccx $$0, ht $$1) {
      return !this.J.a(this, $$1, $$0) && this.C_().a($$1);
   }

   public void a(@Nullable atd $$0, boolean $$1, boolean $$2) {
      alo $$3 = this.k();
      if (!$$2) {
         if ($$0 != null) {
            $$0.a(ui.c("menu.savingLevel"));
         }

         this.at();
         if ($$0 != null) {
            $$0.c(ui.c("menu.savingChunks"));
         }

         $$3.a($$1);
         if ($$1) {
            this.M.c();
         } else {
            this.M.b();
         }
      }
   }

   private void at() {
      if (this.Z != null) {
         this.J.aT().a(this.Z.b());
      }

      this.k().k().a();
   }

   public <T extends bjt> List<? extends T> a(djz<bjt, T> $$0, Predicate<? super T> $$1) {
      List<T> $$2 = Lists.newArrayList();
      this.a($$0, $$1, $$2);
      return $$2;
   }

   public <T extends bjt> void a(djz<bjt, T> $$0, Predicate<? super T> $$1, List<? super T> $$2) {
      this.a($$0, $$1, $$2, Integer.MAX_VALUE);
   }

   public <T extends bjt> void a(djz<bjt, T> $$0, Predicate<? super T> $$1, List<? super T> $$2, int $$3) {
      this.E().a($$0, $$3x -> {
         if ($$1.test((T)$$3x)) {
            $$2.add((T)$$3x);
            if ($$2.size() >= $$3) {
               return arn.a.b;
            }
         }

         return arn.a.a;
      });
   }

   public List<? extends byk> h() {
      return this.a(bjx.C, bkj::bv);
   }

   public List<alr> a(Predicate<? super alr> $$0) {
      return this.a($$0, Integer.MAX_VALUE);
   }

   public List<alr> a(Predicate<? super alr> $$0, int $$1) {
      List<alr> $$2 = Lists.newArrayList();

      for (alr $$3 : this.H) {
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
   public alr i() {
      List<alr> $$0 = this.a(bkj::bv);
      return $$0.isEmpty() ? null : $$0.get(this.z.a($$0.size()));
   }

   @Override
   public boolean b(bjt $$0) {
      return this.j($$0);
   }

   public boolean c(bjt $$0) {
      return this.j($$0);
   }

   public void d(bjt $$0) {
      this.j($$0);
   }

   public void a(alr $$0) {
      this.e($$0);
   }

   public void b(alr $$0) {
      this.e($$0);
   }

   public void c(alr $$0) {
      this.e($$0);
   }

   public void d(alr $$0) {
      this.e($$0);
   }

   private void e(alr $$0) {
      bjt $$1 = this.E().a($$0.cv());
      if ($$1 != null) {
         E.warn("Force-added player with duplicate UUID {}", $$0.cv());
         $$1.ae();
         this.a((alr)$$1, bjt.c.b);
      }

      this.M.a($$0);
   }

   private boolean j(bjt $$0) {
      if ($$0.dG()) {
         E.warn("Tried to add entity {} but it was marked as removed already", bjx.a($$0.ag()));
         return false;
      } else {
         return this.M.a($$0);
      }
   }

   public boolean e(bjt $$0) {
      if ($$0.cR().map(bjt::cv).anyMatch(this.M::a)) {
         return false;
      } else {
         this.a_($$0);
         return true;
      }
   }

   public void a(dii $$0) {
      $$0.I();
      $$0.b(this);
   }

   public void a(alr $$0, bjt.c $$1) {
      $$0.a($$1);
   }

   @Override
   public void a(int $$0, ht $$1, int $$2) {
      for (alr $$3 : this.J.ac().t()) {
         if ($$3 != null && $$3.dL() == this && $$3.ah() != $$0) {
            double $$4 = (double)$$1.u() - $$3.dq();
            double $$5 = (double)$$1.v() - $$3.ds();
            double $$6 = (double)$$1.w() - $$3.dw();
            if ($$4 * $$4 + $$5 * $$5 + $$6 * $$6 < 1024.0) {
               $$3.c.b(new ya($$0, $$1, $$2));
            }
         }
      }
   }

   @Override
   public void a(@Nullable ccx $$0, double $$1, double $$2, double $$3, ib<aqc> $$4, aqe $$5, float $$6, float $$7, long $$8) {
      this.J.ac().a($$0, $$1, $$2, $$3, (double)$$4.a().a($$6), this.ac(), new abl($$4, $$5, $$1, $$2, $$3, $$6, $$7, $$8));
   }

   @Override
   public void a(@Nullable ccx $$0, bjt $$1, ib<aqc> $$2, aqe $$3, float $$4, float $$5, long $$6) {
      this.J.ac().a($$0, $$1.dq(), $$1.ds(), $$1.dw(), (double)$$2.a().a($$4), this.ac(), new abk($$2, $$3, $$1, $$4, $$5, $$6));
   }

   @Override
   public void b(int $$0, ht $$1, int $$2) {
      if (this.X().b(cqv.T)) {
         this.J.ac().a(new zf($$0, $$1, $$2, true));
      } else {
         this.a(null, $$0, $$1, $$2);
      }
   }

   @Override
   public void a(@Nullable ccx $$0, int $$1, ht $$2, int $$3) {
      this.J.ac().a($$0, (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), 64.0, this.ac(), new zf($$1, $$2, $$3, false));
   }

   public int j() {
      return this.D_().p();
   }

   @Override
   public void a(dkl $$0, eif $$1, dkl.a $$2) {
      this.N.a($$0, $$1, $$2);
   }

   @Override
   public void a(ht $$0, dgb $$1, dgb $$2, int $$3) {
      if (this.U) {
         String $$4 = "recursive call to sendBlockUpdated";
         ac.a("recursive call to sendBlockUpdated", new IllegalStateException("recursive call to sendBlockUpdated"));
      }

      this.k().a($$0);
      eiy $$5 = $$1.k(this, $$0);
      eiy $$6 = $$2.k(this, $$0);
      if (eiv.c($$5, $$6, eij.g)) {
         List<bts> $$7 = new ObjectArrayList();

         for (bkl $$8 : this.T) {
            bts $$9 = $$8.L();
            if ($$9.b($$0)) {
               $$7.add($$9);
            }
         }

         try {
            this.U = true;

            for (bts $$10 : $$7) {
               $$10.i();
            }
         } finally {
            this.U = false;
         }
      }
   }

   @Override
   public void a(ht $$0, cua $$1) {
      this.s.a($$0, $$1, null);
   }

   @Override
   public void a(ht $$0, cua $$1, hx $$2) {
      this.s.a($$0, $$1, $$2);
   }

   @Override
   public void a(ht $$0, cua $$1, ht $$2) {
      this.s.a($$0, $$1, $$2);
   }

   @Override
   public void a(dgb $$0, ht $$1, cua $$2, ht $$3, boolean $$4) {
      this.s.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public void a(bjt $$0, byte $$1) {
      this.k().a($$0, new yw($$0, $$1));
   }

   @Override
   public void a(bjt $$0, bir $$1) {
      this.k().a($$0, new yt($$0, $$1));
   }

   public alo k() {
      return this.I;
   }

   @Override
   public cqr a(@Nullable bjt $$0, @Nullable bir $$1, @Nullable cqs $$2, double $$3, double $$4, double $$5, float $$6, boolean $$7, cqz.a $$8) {
      cqr $$9 = this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, false);
      if (!$$9.b()) {
         $$9.g();
      }

      for (alr $$10 : this.H) {
         if ($$10.i($$3, $$4, $$5) < 4096.0) {
            $$10.c.b(new yx($$3, $$4, $$5, $$6, $$9.h(), $$9.d().get($$10)));
         }
      }

      return $$9;
   }

   @Override
   public void a(ht $$0, cua $$1, int $$2, int $$3) {
      this.V.add(new cqe($$0, $$1, $$2, $$3));
   }

   private void au() {
      this.W.clear();

      while (!this.V.isEmpty()) {
         cqe $$0 = (cqe)this.V.removeFirst();
         if (this.m($$0.a())) {
            if (this.a($$0)) {
               this.J.ac().a(null, (double)$$0.a().u(), (double)$$0.a().v(), (double)$$0.a().w(), 64.0, this.ac(), new yc($$0.a(), $$0.b(), $$0.c(), $$0.d()));
            }
         } else {
            this.W.add($$0);
         }
      }

      this.V.addAll(this.W);
   }

   private boolean a(cqe $$0) {
      dgb $$1 = this.a_($$0.a());
      return $$1.a($$0.b()) ? $$1.a(this, $$0.a(), $$0.c(), $$0.d()) : false;
   }

   public ejo<cua> l() {
      return this.R;
   }

   public ejo<ebd> m() {
      return this.S;
   }

   @Nonnull
   @Override
   public MinecraftServer n() {
      return this.J;
   }

   public eca o() {
      return this.Q;
   }

   public dzu p() {
      return this.J.aS();
   }

   public <T extends jq> int a(T $$0, double $$1, double $$2, double $$3, int $$4, double $$5, double $$6, double $$7, double $$8) {
      zg $$9 = new zg($$0, false, $$1, $$2, $$3, (float)$$5, (float)$$6, (float)$$7, (float)$$8, $$4);
      int $$10 = 0;

      for (int $$11 = 0; $$11 < this.H.size(); $$11++) {
         alr $$12 = this.H.get($$11);
         if (this.a($$12, false, $$1, $$2, $$3, $$9)) {
            $$10++;
         }
      }

      return $$10;
   }

   public <T extends jq> boolean a(alr $$0, T $$1, boolean $$2, double $$3, double $$4, double $$5, int $$6, double $$7, double $$8, double $$9, double $$10) {
      wb<?> $$11 = new zg($$1, $$2, $$3, $$4, $$5, (float)$$7, (float)$$8, (float)$$9, (float)$$10, $$6);
      return this.a($$0, $$2, $$3, $$4, $$5, $$11);
   }

   private boolean a(alr $$0, boolean $$1, double $$2, double $$3, double $$4, wb<?> $$5) {
      if ($$0.dL() != this) {
         return false;
      } else {
         ht $$6 = $$0.dl();
         if ($$6.a(new eif($$2, $$3, $$4), $$1 ? 512.0 : 32.0)) {
            $$0.c.b($$5);
            return true;
         } else {
            return false;
         }
      }
   }

   @Nullable
   @Override
   public bjt a(int $$0) {
      return this.E().a($$0);
   }

   @Deprecated
   @Nullable
   public bjt b(int $$0) {
      bjt $$1 = this.E().a($$0);
      return $$1 != null ? $$1 : (bjt)this.aa.get($$0);
   }

   @Nullable
   public bjt a(UUID $$0) {
      return this.E().a($$0);
   }

   @Nullable
   public ht a(arh<dwa> $$0, ht $$1, int $$2, boolean $$3) {
      if (!this.J.aT().A().c()) {
         return null;
      } else {
         Optional<ig.c<dwa>> $$4 = this.H_().d(jz.aA).b($$0);
         if ($$4.isEmpty()) {
            return null;
         } else {
            Pair<ht, ib<dwa>> $$5 = this.k().g().a(this, $$4.get(), $$1, $$2, $$3);
            return $$5 != null ? (ht)$$5.getFirst() : null;
         }
      }
   }

   @Nullable
   public Pair<ht, ib<crx>> a(Predicate<ib<crx>> $$0, ht $$1, int $$2, int $$3, int $$4) {
      return this.k().g().c().a($$1, $$2, $$3, $$4, $$0, this.k().i().b(), this);
   }

   @Override
   public cnp q() {
      return this.J.aE();
   }

   @Override
   public boolean r() {
      return this.e;
   }

   public ecu s() {
      return this.k().k();
   }

   @Nullable
   @Override
   public eco a(String $$0) {
      return this.n().D().s().b(eco.a(), $$0);
   }

   @Override
   public void a(String $$0, eco $$1) {
      this.n().D().s().a($$0, $$1);
   }

   @Override
   public int t() {
      return this.n().D().s().a(ecn.a(), "idcounts").b();
   }

   public void a(ht $$0, float $$1) {
      cqg $$2 = new cqg(new ht(this.A.a(), 0, this.A.c()));
      this.A.a($$0, $$1);
      this.k().b(alv.a, $$2, 11, atz.a);
      this.k().a(alv.a, new cqg($$0), 11, atz.a);
      this.n().ac().a(new aat($$0, $$1));
   }

   public LongSet u() {
      cqu $$0 = this.s().b(cqu.a(), "chunks");
      return (LongSet)($$0 != null ? LongSets.unmodifiable($$0.b()) : LongSets.EMPTY_SET);
   }

   public boolean a(int $$0, int $$1, boolean $$2) {
      cqu $$3 = this.s().a(cqu.a(), "chunks");
      cqg $$4 = new cqg($$0, $$1);
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
   public List<alr> v() {
      return this.H;
   }

   @Override
   public void a(ht $$0, dgb $$1, dgb $$2) {
      Optional<ib<bvl>> $$3 = bvm.a($$1);
      Optional<ib<bvl>> $$4 = bvm.a($$2);
      if (!Objects.equals($$3, $$4)) {
         ht $$5 = $$0.i();
         $$3.ifPresent($$1x -> this.n().execute(() -> {
               this.w().a($$5);
               abz.b(this, $$5);
            }));
         $$4.ifPresent($$1x -> this.n().execute(() -> {
               this.w().a($$5, $$1x);
               abz.a(this, $$5);
            }));
      }
   }

   public bvi w() {
      return this.k().l();
   }

   public boolean b(ht $$0) {
      return this.a($$0, 1);
   }

   public boolean a(iu $$0) {
      return this.b($$0.q());
   }

   public boolean a(ht $$0, int $$1) {
      return $$1 > 6 ? false : this.b(iu.a($$0)) <= $$1;
   }

   public int b(iu $$0) {
      return this.w().a($$0);
   }

   public ceg x() {
      return this.f;
   }

   @Nullable
   public cee c(ht $$0) {
      return this.f.a($$0, 9216);
   }

   public boolean d(ht $$0) {
      return this.c($$0) != null;
   }

   public void a(bvf $$0, bjt $$1, bky $$2) {
      $$2.a($$0, $$1);
   }

   public void a(Path $$0) throws IOException {
      ala $$1 = this.k().a;

      try (Writer $$2 = Files.newBufferedWriter($$0.resolve("stats.txt"))) {
         $$2.write(String.format(Locale.ROOT, "spawning_chunks: %d\n", $$1.j().b()));
         crk.d $$3 = this.k().n();
         if ($$3 != null) {
            ObjectIterator $$9 = $$3.b().object2IntEntrySet().iterator();

            while ($$9.hasNext()) {
               Entry<bkm> $$4 = (Entry<bkm>)$$9.next();
               $$2.write(String.format(Locale.ROOT, "spawn_count.%s: %d\n", ((bkm)$$4.getKey()).a(), $$4.getIntValue()));
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
         a($$12, this.E().a());
      }

      Path $$13 = $$0.resolve("block_entities.csv");

      try (Writer $$14 = Files.newBufferedWriter($$13)) {
         this.a($$14);
      }
   }

   private static void a(Writer $$0, Iterable<bjt> $$1) throws IOException {
      arz $$2 = arz.a().a("x").a("y").a("z").a("uuid").a("type").a("alive").a("display_name").a("custom_name").a($$0);

      for (bjt $$3 : $$1) {
         ui $$4 = $$3.ad();
         ui $$5 = $$3.O_();
         $$2.a($$3.dq(), $$3.ds(), $$3.dw(), $$3.cv(), jy.h.b($$3.ag()), $$3.bv(), $$5.getString(), $$4 != null ? $$4.getString() : null);
      }
   }

   private void a(Writer $$0) throws IOException {
      arz $$1 = arz.a().a("x").a("y").a("z").a("type").a($$0);

      for (dfn $$2 : this.r) {
         ht $$3 = $$2.c();
         $$1.a($$3.u(), $$3.v(), $$3.w(), $$2.d());
      }
   }

   @VisibleForTesting
   public void a(dvs $$0) {
      this.V.removeIf($$1 -> $$0.b($$1.a()));
   }

   @Override
   public void b(ht $$0, cua $$1) {
      if (!this.af()) {
         this.a($$0, $$1);
      }
   }

   @Override
   public float a(hx $$0, boolean $$1) {
      return 1.0F;
   }

   public Iterable<bjt> y() {
      return this.E().a();
   }

   @Override
   public String toString() {
      return "ServerLevel[" + this.K.g() + "]";
   }

   public boolean z() {
      return this.J.aT().B();
   }

   @Override
   public long A() {
      return this.J.aT().A().b();
   }

   @Nullable
   public djn B() {
      return this.Z;
   }

   @Override
   public alq C() {
      return this;
   }

   @VisibleForTesting
   public String D() {
      return String.format(
         Locale.ROOT,
         "players: %s, entities: %s [%s], block_entities: %d [%s], block_ticks: %d, fluid_ticks: %d, chunk_source: %s",
         this.H.size(),
         this.M.e(),
         a(this.M.d().a(), $$0 -> jy.h.b($$0.ag()).toString()),
         this.r.size(),
         a(this.r, dfn::d),
         this.l().a(),
         this.m().a(),
         this.F()
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

   public static void a(alq $$0) {
      ht $$1 = a;
      int $$2 = $$1.u();
      int $$3 = $$1.v() - 2;
      int $$4 = $$1.w();
      ht.b($$2 - 2, $$3 + 1, $$4 - 2, $$2 + 2, $$3 + 3, $$4 + 2).forEach($$1x -> $$0.b($$1x, cuc.a.o()));
      ht.b($$2 - 2, $$3, $$4 - 2, $$2 + 2, $$3, $$4 + 2).forEach($$1x -> $$0.b($$1x, cuc.co.o()));
   }

   @Override
   protected dkb<bjt> E() {
      return this.M.d();
   }

   public void a(Stream<bjt> $$0) {
      this.M.a($$0);
   }

   public void b(Stream<bjt> $$0) {
      this.M.b($$0);
   }

   public void b(dii $$0) {
      $$0.c(this.A_().e());
   }

   public void a(dhx $$0) {
      this.J.execute(() -> this.ac.a($$0.f(), $$0.g()));
   }

   @Override
   public void close() throws IOException {
      super.close();
      this.M.close();
   }

   @Override
   public String F() {
      return "Chunks[S] W: " + this.I.e() + " E: " + this.M.e();
   }

   public boolean c(long $$0) {
      return this.M.a($$0);
   }

   private boolean d(long $$0) {
      return this.c($$0) && this.I.a($$0);
   }

   public boolean e(ht $$0) {
      return this.M.a($$0) && this.I.a.j().c(cqg.a($$0));
   }

   public boolean f(ht $$0) {
      return this.M.a($$0);
   }

   public boolean a(cqg $$0) {
      return this.M.a($$0);
   }

   @Override
   public cfg G() {
      return this.J.aT().M();
   }

   public ate a(afw $$0) {
      return this.ae.a($$0);
   }

   public bih H() {
      return this.ae;
   }

   final class a implements dka<bjt> {
      public void a(bjt $$0) {
      }

      public void b(bjt $$0) {
         alq.this.f().a($$0);
      }

      public void c(bjt $$0) {
         alq.this.L.a($$0);
      }

      public void d(bjt $$0) {
         alq.this.L.b($$0);
      }

      public void e(bjt $$0) {
         alq.this.k().b($$0);
         if ($$0 instanceof alr $$1) {
            alq.this.H.add($$1);
            alq.this.e();
         }

         if ($$0 instanceof bkl $$2) {
            if (alq.this.U) {
               String $$3 = "onTrackingStart called during navigation iteration";
               ac.a("onTrackingStart called during navigation iteration", new IllegalStateException("onTrackingStart called during navigation iteration"));
            }

            alq.this.T.add($$2);
         }

         if ($$0 instanceof byk $$4) {
            for (byi $$5 : $$4.ga()) {
               alq.this.aa.put($$5.ah(), $$5);
            }
         }

         $$0.a(dki::a);
      }

      public void f(bjt $$0) {
         alq.this.k().a($$0);
         if ($$0 instanceof alr $$1) {
            alq.this.H.remove($$1);
            alq.this.e();
         }

         if ($$0 instanceof bkl $$2) {
            if (alq.this.U) {
               String $$3 = "onTrackingStart called during navigation iteration";
               ac.a("onTrackingStart called during navigation iteration", new IllegalStateException("onTrackingStart called during navigation iteration"));
            }

            alq.this.T.remove($$2);
         }

         if ($$0 instanceof byk $$4) {
            for (byi $$5 : $$4.ga()) {
               alq.this.aa.remove($$5.ah());
            }
         }

         $$0.a(dki::b);
      }

      public void g(bjt $$0) {
         $$0.a(dki::c);
      }
   }
}
