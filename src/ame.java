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

public class ame extends csa implements csu {
   public static final ht a = new ht(100, 50, 0);
   public static final bic b = bii.a(12000, 180000);
   public static final bic c = bii.a(12000, 24000);
   private static final bic D = bii.a(12000, 180000);
   public static final bic d = bii.a(3600, 15600);
   private static final Logger E = LogUtils.getLogger();
   private static final int F = 300;
   private static final int G = 65536;
   final List<amf> H = Lists.newArrayList();
   private final amc I;
   private final MinecraftServer J;
   private final ees K;
   final dlf L = new dlf();
   private final dlk<bkq> M;
   private final dlt N;
   public boolean e;
   private final apx O;
   private int P;
   private final edo Q;
   private final eld<cva> R = new eld<>(this::d, this.af());
   private final eld<ecr> S = new eld<>(this::d, this.af());
   final Set<bli> T = new ObjectOpenHashSet();
   volatile boolean U;
   protected final cfd f;
   private final ObjectLinkedOpenHashSet<crf> V = new ObjectLinkedOpenHashSet();
   private final List<crf> W = new ArrayList<>(64);
   private boolean X;
   private final List<crn> Y;
   @Nullable
   private dku Z;
   final Int2ObjectMap<bzf> aa = new Int2ObjectOpenHashMap();
   private final css ab;
   private final dxi ac;
   private final boolean ad;
   private final bjd ae;

   public ame(
      MinecraftServer $$0,
      Executor $$1,
      een.c $$2,
      ees $$3,
      agh<csa> $$4,
      dks $$5,
      amn $$6,
      boolean $$7,
      long $$8,
      List<crn> $$9,
      boolean $$10,
      @Nullable bjd $$11
   ) {
      super($$3, $$4, $$0.aZ(), $$5.a(), $$0::aR, false, $$7, $$8, $$0.bh());
      this.ad = $$10;
      this.J = $$0;
      this.Y = $$9;
      this.K = $$3;
      djf $$12 = $$5.b();
      boolean $$13 = $$0.aW();
      DataFixer $$14 = $$0.aA();
      dlc<bkq> $$15 = new dkh(this, $$2.a($$4).resolve("entities"), $$14, $$13, $$0);
      this.M = new dlk<>(bkq.class, new ame.a(), $$15);
      this.I = new amc(this, $$2, $$14, $$0.aX(), $$1, $$12, $$0.ae().p(), $$0.ae().q(), $$13, $$6, this.M::a, () -> $$0.F().t());
      this.I.h().b();
      this.Q = new edo(this);
      this.R();
      this.U();
      this.C_().a($$0.au());
      this.f = this.t().a(cfd.a(this), cfd.a(this.ac()));
      if (!$$0.Q()) {
         $$3.a($$0.u_());
      }

      long $$16 = $$0.aY().A().b();
      this.ac = new dxi(this.I.m(), this.H_(), $$0.aX(), $$4, $$12, this.I.i(), this, $$12.c(), $$16, $$14);
      this.ab = new css(this, $$0.aY().A(), this.ac);
      if (this.ad() == csa.j && this.ac().a(dkp.c)) {
         this.Z = new dku(this, $$16, $$0.aY().E());
      } else {
         this.Z = null;
      }

      this.O = new apx();
      this.N = new dlt(this);
      this.ae = Objects.requireNonNullElseGet($$11, () -> this.t().a(bjd.a($$16), "random_sequences"));
   }

   @Deprecated
   @VisibleForTesting
   public void a(@Nullable dku $$0) {
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
   public ib<csy> a(int $$0, int $$1, int $$2) {
      return this.k().g().c().getNoiseBiome($$0, $$1, $$2, this.k().i().b());
   }

   public css a() {
      return this.ab;
   }

   public void a(BooleanSupplier $$0) {
      bfo $$1 = this.ae();
      this.X = true;
      bjg $$2 = this.r();
      boolean $$3 = $$2.i();
      if ($$3) {
         $$1.a("world border");
         this.C_().s();
         $$1.b("weather");
         this.as();
      }

      int $$4 = this.Y().c(crw.P);
      if (this.O.a($$4) && this.O.a($$4, this.H)) {
         if (this.Y().b(crw.l)) {
            long $$5 = this.A.f() + 24000L;
            this.b($$5 - $$5 % 24000L);
         }

         this.aq();
         if (this.Y().b(crw.v) && this.aa()) {
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
            if (!$$2x.dI()) {
               if (this.i($$2x)) {
                  $$2x.am();
               } else if (!$$2.a($$2x)) {
                  $$1.a("checkDespawn");
                  $$2x.dz();
                  $$1.c();
                  if (this.I.a.j().c($$2x.dp().a())) {
                     bkq $$3x = $$2x.da();
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
         if (this.A.q().b(crw.l)) {
            this.b(this.A.f() + 1L);
         }
      }
   }

   public void b(long $$0) {
      this.K.b($$0);
   }

   public void a(boolean $$0, boolean $$1) {
      for (crn $$2 : this.Y) {
         $$2.a(this, $$0, $$1);
      }
   }

   private boolean i(bkq $$0) {
      return this.J.Y() || !($$0 instanceof bwr) && !($$0 instanceof bxt) ? !this.J.Z() && $$0 instanceof cdg : true;
   }

   private void aq() {
      this.O.a();
      this.H.stream().filter(blg::fE).collect(Collectors.toList()).forEach($$0 -> $$0.a(false, false));
   }

   public void a(djp $$0, int $$1) {
      crh $$2 = $$0.f();
      boolean $$3 = this.aa();
      int $$4 = $$2.d();
      int $$5 = $$2.e();
      bfo $$6 = this.ae();
      $$6.a("thunder");
      if ($$3 && this.Z() && this.z.a(100000) == 0) {
         ht $$7 = this.a(this.a($$4, 0, $$5, 15));
         if (this.q($$7)) {
            biv $$8 = this.d_($$7);
            boolean $$9 = this.Y().b(crw.e) && this.z.j() < (double)$$8.b() * 0.01 && !this.a_($$7.d()).a(cvc.ss);
            if ($$9) {
               byw $$10 = bku.aK.a((csa)this);
               if ($$10 != null) {
                  $$10.w(true);
                  $$10.c_(0);
                  $$10.a_((double)$$7.u(), (double)$$7.v(), (double)$$7.w());
                  this.b($$10);
               }
            }

            blf $$11 = bku.ai.a((csa)this);
            if ($$11 != null) {
               $$11.e(eju.c($$7));
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
         djq[] $$13 = $$0.d();

         for (int $$14 = 0; $$14 < $$13.length; $$14++) {
            djq $$15 = $$13[$$14];
            if ($$15.d()) {
               int $$16 = $$0.g($$14);
               int $$17 = iu.c($$16);

               for (int $$18 = 0; $$18 < $$1; $$18++) {
                  ht $$19 = this.a($$4, $$17, $$5, 15);
                  $$6.a("randomTick");
                  dhi $$20 = $$15.a($$19.u() - $$4, $$19.v() - $$17, $$19.w() - $$5);
                  if ($$20.v()) {
                     $$20.b(this, $$19, this.z);
                  }

                  ecs $$21 = $$20.u();
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
      ht $$2 = this.a(dmr.a.e, $$1);
      ht $$3 = $$2.d();
      csy $$4 = this.s($$2).a();
      if ($$4.a(this, $$3)) {
         this.b($$3, cvc.dO.o());
      }

      if ($$0) {
         int $$5 = this.Y().c(crw.T);
         if ($$5 > 0 && $$4.b(this, $$2)) {
            dhi $$6 = this.a_($$2);
            if ($$6.a(cvc.dN)) {
               int $$7 = $$6.c(dci.c);
               if ($$7 < Math.min($$5, 8)) {
                  dhi $$8 = $$6.a(dci.c, Integer.valueOf($$7 + 1));
                  cva.a($$6, $$8, this, $$2);
                  this.b($$2, $$8);
               }
            } else {
               this.b($$2, cvc.dN.o());
            }
         }

         csy.c $$9 = $$4.a($$3);
         if ($$9 != csy.c.a) {
            dhi $$10 = this.a_($$3);
            $$10.b().a($$10, this, $$3, $$9);
         }
      }
   }

   private Optional<ht> D(ht $$0) {
      Optional<ht> $$1 = this.x().e($$0x -> $$0x.a(bwj.t), $$0x -> $$0x.v() == this.a(dmr.a.b, $$0x.u(), $$0x.w()) - 1, $$0, 128, bwf.b.c);
      return $$1.map($$0x -> $$0x.b(1));
   }

   protected ht a(ht $$0) {
      ht $$1 = this.a(dmr.a.e, $$0);
      Optional<ht> $$2 = this.D($$1);
      if ($$2.isPresent()) {
         return $$2.get();
      } else {
         ejp $$3 = ejp.a($$1, new ht($$1.h(this.ak()))).g(3.0);
         List<blg> $$4 = this.a(blg.class, $$3, $$0x -> $$0x != null && $$0x.bx() && this.g($$0x.dn()));
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
      return this.X;
   }

   public boolean d() {
      return this.Y().c(crw.P) <= 100;
   }

   private void ar() {
      if (this.d()) {
         if (!this.n().Q() || this.n().p()) {
            int $$0 = this.Y().c(crw.P);
            ur $$1;
            if (this.O.a($$0)) {
               $$1 = ur.c("sleep.skipping_night");
            } else {
               $$1 = ur.a("sleep.players_sleeping", this.O.b(), this.O.b($$0));
            }

            for (amf $$3 : this.H) {
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

   public agz f() {
      return this.J.aH();
   }

   private void as() {
      boolean $$0 = this.aa();
      if (this.D_().g()) {
         if (this.Y().b(crw.v)) {
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

         this.y = atm.a(this.y, 0.0F, 1.0F);
         this.v = this.w;
         if (this.A.k()) {
            this.w += 0.01F;
         } else {
            this.w -= 0.01F;
         }

         this.w = atm.a(this.w, 0.0F, 1.0F);
      }

      if (this.v != this.w) {
         this.J.ae().a(new zi(zi.h, this.w), this.ad());
      }

      if (this.x != this.y) {
         this.J.ae().a(new zi(zi.i, this.y), this.ad());
      }

      if ($$0 != this.aa()) {
         if ($$0) {
            this.J.ae().a(new zi(zi.c, 0.0F));
         } else {
            this.J.ae().a(new zi(zi.b, 0.0F));
         }

         this.J.ae().a(new zi(zi.h, this.w));
         this.J.ae().a(new zi(zi.i, this.y));
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

   private void a(ht $$0, ecr $$1) {
      ecs $$2 = this.b_($$0);
      if ($$2.b($$1)) {
         $$2.a((csa)this, $$0);
      }
   }

   private void d(ht $$0, cva $$1) {
      dhi $$2 = this.a_($$0);
      if ($$2.a($$1)) {
         $$2.a(this, $$0, this.z);
      }
   }

   public void a(bkq $$0) {
      $$0.bp();
      bfo $$1 = this.ae();
      $$0.ah++;
      this.ae().a(() -> jy.h.b($$0.ai()).toString());
      $$1.d("tickNonPassenger");
      $$0.l();
      this.ae().c();

      for (bkq $$2 : $$0.cQ()) {
         this.a($$0, $$2);
      }
   }

   private void a(bkq $$0, bkq $$1) {
      if ($$1.dI() || $$1.da() != $$0) {
         $$1.ac();
      } else if ($$1 instanceof cdu || this.L.c($$1)) {
         $$1.bp();
         $$1.ah++;
         bfo $$2 = this.ae();
         $$2.a(() -> jy.h.b($$1.ai()).toString());
         $$2.d("tickPassenger");
         $$1.t();
         $$2.c();

         for (bkq $$3 : $$1.cQ()) {
            this.a($$1, $$3);
         }
      }
   }

   @Override
   public boolean a(cdu $$0, ht $$1) {
      return !this.J.a(this, $$1, $$0) && this.C_().a($$1);
   }

   public void a(@Nullable atr $$0, boolean $$1, boolean $$2) {
      amc $$3 = this.k();
      if (!$$2) {
         if ($$0 != null) {
            $$0.a(ur.c("menu.savingLevel"));
         }

         this.au();
         if ($$0 != null) {
            $$0.c(ur.c("menu.savingChunks"));
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

   public <T extends bkq> List<? extends T> a(dlg<bkq, T> $$0, Predicate<? super T> $$1) {
      List<T> $$2 = Lists.newArrayList();
      this.a($$0, $$1, $$2);
      return $$2;
   }

   public <T extends bkq> void a(dlg<bkq, T> $$0, Predicate<? super T> $$1, List<? super T> $$2) {
      this.a($$0, $$1, $$2, Integer.MAX_VALUE);
   }

   public <T extends bkq> void a(dlg<bkq, T> $$0, Predicate<? super T> $$1, List<? super T> $$2, int $$3) {
      this.F().a($$0, $$3x -> {
         if ($$1.test((T)$$3x)) {
            $$2.add((T)$$3x);
            if ($$2.size() >= $$3) {
               return asb.a.b;
            }
         }

         return asb.a.a;
      });
   }

   public List<? extends bzh> h() {
      return this.a(bku.C, blg::bx);
   }

   public List<amf> a(Predicate<? super amf> $$0) {
      return this.a($$0, Integer.MAX_VALUE);
   }

   public List<amf> a(Predicate<? super amf> $$0, int $$1) {
      List<amf> $$2 = Lists.newArrayList();

      for (amf $$3 : this.H) {
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
   public amf i() {
      List<amf> $$0 = this.a(blg::bx);
      return $$0.isEmpty() ? null : $$0.get(this.z.a($$0.size()));
   }

   @Override
   public boolean b(bkq $$0) {
      return this.j($$0);
   }

   public boolean c(bkq $$0) {
      return this.j($$0);
   }

   public void d(bkq $$0) {
      this.j($$0);
   }

   public void a(amf $$0) {
      this.e($$0);
   }

   public void b(amf $$0) {
      this.e($$0);
   }

   public void c(amf $$0) {
      this.e($$0);
   }

   public void d(amf $$0) {
      this.e($$0);
   }

   private void e(amf $$0) {
      bkq $$1 = this.F().a($$0.cw());
      if ($$1 != null) {
         E.warn("Force-added player with duplicate UUID {}", $$0.cw());
         $$1.ag();
         this.a((amf)$$1, bkq.c.b);
      }

      this.M.a($$0);
   }

   private boolean j(bkq $$0) {
      if ($$0.dI()) {
         E.warn("Tried to add entity {} but it was marked as removed already", bku.a($$0.ai()));
         return false;
      } else {
         return this.M.a($$0);
      }
   }

   public boolean e(bkq $$0) {
      if ($$0.cS().map(bkq::cw).anyMatch(this.M::a)) {
         return false;
      } else {
         this.a_($$0);
         return true;
      }
   }

   public void a(djp $$0) {
      $$0.I();
      $$0.b(this);
   }

   public void a(amf $$0, bkq.c $$1) {
      $$0.a($$1);
   }

   @Override
   public void a(int $$0, ht $$1, int $$2) {
      for (amf $$3 : this.J.ae().t()) {
         if ($$3 != null && $$3.dN() == this && $$3.aj() != $$0) {
            double $$4 = (double)$$1.u() - $$3.ds();
            double $$5 = (double)$$1.v() - $$3.du();
            double $$6 = (double)$$1.w() - $$3.dy();
            if ($$4 * $$4 + $$5 * $$5 + $$6 * $$6 < 1024.0) {
               $$3.c.b(new yj($$0, $$1, $$2));
            }
         }
      }
   }

   @Override
   public void a(@Nullable cdu $$0, double $$1, double $$2, double $$3, ib<aqq> $$4, aqs $$5, float $$6, float $$7, long $$8) {
      this.J.ae().a($$0, $$1, $$2, $$3, (double)$$4.a().a($$6), this.ad(), new abu($$4, $$5, $$1, $$2, $$3, $$6, $$7, $$8));
   }

   @Override
   public void a(@Nullable cdu $$0, bkq $$1, ib<aqq> $$2, aqs $$3, float $$4, float $$5, long $$6) {
      this.J.ae().a($$0, $$1.ds(), $$1.du(), $$1.dy(), (double)$$2.a().a($$4), this.ad(), new abt($$2, $$3, $$1, $$4, $$5, $$6));
   }

   @Override
   public void b(int $$0, ht $$1, int $$2) {
      if (this.Y().b(crw.W)) {
         this.J.ae().a(new zo($$0, $$1, $$2, true));
      } else {
         this.a(null, $$0, $$1, $$2);
      }
   }

   @Override
   public void a(@Nullable cdu $$0, int $$1, ht $$2, int $$3) {
      this.J.ae().a($$0, (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), 64.0, this.ad(), new zo($$1, $$2, $$3, false));
   }

   public int j() {
      return this.D_().p();
   }

   @Override
   public void a(dls $$0, eju $$1, dls.a $$2) {
      this.N.a($$0, $$1, $$2);
   }

   @Override
   public void a(ht $$0, dhi $$1, dhi $$2, int $$3) {
      if (this.U) {
         String $$4 = "recursive call to sendBlockUpdated";
         ac.a("recursive call to sendBlockUpdated", new IllegalStateException("recursive call to sendBlockUpdated"));
      }

      this.k().a($$0);
      ekn $$5 = $$1.k(this, $$0);
      ekn $$6 = $$2.k(this, $$0);
      if (ekk.c($$5, $$6, ejy.g)) {
         List<bup> $$7 = new ObjectArrayList();

         for (bli $$8 : this.T) {
            bup $$9 = $$8.N();
            if ($$9.b($$0)) {
               $$7.add($$9);
            }
         }

         try {
            this.U = true;

            for (bup $$10 : $$7) {
               $$10.i();
            }
         } finally {
            this.U = false;
         }
      }
   }

   @Override
   public void a(ht $$0, cva $$1) {
      this.s.a($$0, $$1, null);
   }

   @Override
   public void a(ht $$0, cva $$1, hx $$2) {
      this.s.a($$0, $$1, $$2);
   }

   @Override
   public void a(ht $$0, cva $$1, ht $$2) {
      this.s.a($$0, $$1, $$2);
   }

   @Override
   public void a(dhi $$0, ht $$1, cva $$2, ht $$3, boolean $$4) {
      this.s.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public void a(bkq $$0, byte $$1) {
      this.k().a($$0, new zf($$0, $$1));
   }

   @Override
   public void a(bkq $$0, bjo $$1) {
      this.k().a($$0, new zc($$0, $$1));
   }

   public amc k() {
      return this.I;
   }

   @Override
   public crs a(@Nullable bkq $$0, @Nullable bjo $$1, @Nullable crt $$2, double $$3, double $$4, double $$5, float $$6, boolean $$7, csa.a $$8) {
      crs $$9 = this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, false);
      if (!$$9.b()) {
         $$9.g();
      }

      for (amf $$10 : this.H) {
         if ($$10.i($$3, $$4, $$5) < 4096.0) {
            $$10.c.b(new zg($$3, $$4, $$5, $$6, $$9.h(), $$9.d().get($$10)));
         }
      }

      return $$9;
   }

   @Override
   public void a(ht $$0, cva $$1, int $$2, int $$3) {
      this.V.add(new crf($$0, $$1, $$2, $$3));
   }

   private void av() {
      this.W.clear();

      while (!this.V.isEmpty()) {
         crf $$0 = (crf)this.V.removeFirst();
         if (this.m($$0.a())) {
            if (this.a($$0)) {
               this.J.ae().a(null, (double)$$0.a().u(), (double)$$0.a().v(), (double)$$0.a().w(), 64.0, this.ad(), new yl($$0.a(), $$0.b(), $$0.c(), $$0.d()));
            }
         } else {
            this.W.add($$0);
         }
      }

      this.V.addAll(this.W);
   }

   private boolean a(crf $$0) {
      dhi $$1 = this.a_($$0.a());
      return $$1.a($$0.b()) ? $$1.a(this, $$0.a(), $$0.c(), $$0.d()) : false;
   }

   public eld<cva> l() {
      return this.R;
   }

   public eld<ecr> m() {
      return this.S;
   }

   @Nonnull
   @Override
   public MinecraftServer n() {
      return this.J;
   }

   public edo o() {
      return this.Q;
   }

   public ebi p() {
      return this.J.aX();
   }

   public <T extends jq> int a(T $$0, double $$1, double $$2, double $$3, int $$4, double $$5, double $$6, double $$7, double $$8) {
      zp $$9 = new zp($$0, false, $$1, $$2, $$3, (float)$$5, (float)$$6, (float)$$7, (float)$$8, $$4);
      int $$10 = 0;

      for (int $$11 = 0; $$11 < this.H.size(); $$11++) {
         amf $$12 = this.H.get($$11);
         if (this.a($$12, false, $$1, $$2, $$3, $$9)) {
            $$10++;
         }
      }

      return $$10;
   }

   public <T extends jq> boolean a(amf $$0, T $$1, boolean $$2, double $$3, double $$4, double $$5, int $$6, double $$7, double $$8, double $$9, double $$10) {
      wk<?> $$11 = new zp($$1, $$2, $$3, $$4, $$5, (float)$$7, (float)$$8, (float)$$9, (float)$$10, $$6);
      return this.a($$0, $$2, $$3, $$4, $$5, $$11);
   }

   private boolean a(amf $$0, boolean $$1, double $$2, double $$3, double $$4, wk<?> $$5) {
      if ($$0.dN() != this) {
         return false;
      } else {
         ht $$6 = $$0.dn();
         if ($$6.a(new eju($$2, $$3, $$4), $$1 ? 512.0 : 32.0)) {
            $$0.c.b($$5);
            return true;
         } else {
            return false;
         }
      }
   }

   @Nullable
   @Override
   public bkq a(int $$0) {
      return this.F().a($$0);
   }

   @Deprecated
   @Nullable
   public bkq b(int $$0) {
      bkq $$1 = this.F().a($$0);
      return $$1 != null ? $$1 : (bkq)this.aa.get($$0);
   }

   @Nullable
   public bkq a(UUID $$0) {
      return this.F().a($$0);
   }

   @Nullable
   public ht a(arv<dxh> $$0, ht $$1, int $$2, boolean $$3) {
      if (!this.J.aY().A().c()) {
         return null;
      } else {
         Optional<ig.c<dxh>> $$4 = this.H_().d(jz.aB).b($$0);
         if ($$4.isEmpty()) {
            return null;
         } else {
            Pair<ht, ib<dxh>> $$5 = this.k().g().a(this, $$4.get(), $$1, $$2, $$3);
            return $$5 != null ? (ht)$$5.getFirst() : null;
         }
      }
   }

   @Nullable
   public Pair<ht, ib<csy>> a(Predicate<ib<csy>> $$0, ht $$1, int $$2, int $$3, int $$4) {
      return this.k().g().c().a($$1, $$2, $$3, $$4, $$0, this.k().i().b(), this);
   }

   @Override
   public cor q() {
      return this.J.aG();
   }

   @Override
   public bjg r() {
      return this.J.aO();
   }

   @Override
   public boolean s() {
      return this.e;
   }

   public eei t() {
      return this.k().k();
   }

   @Nullable
   @Override
   public eec a(String $$0) {
      return this.n().F().t().b(eec.a(), $$0);
   }

   @Override
   public void a(String $$0, eec $$1) {
      this.n().F().t().a($$0, $$1);
   }

   @Override
   public int u() {
      return this.n().F().t().a(eeb.a(), "idcounts").b();
   }

   public void a(ht $$0, float $$1) {
      crh $$2 = new crh(new ht(this.A.a(), 0, this.A.c()));
      this.A.a($$0, $$1);
      this.k().b(amj.a, $$2, 11, auo.a);
      this.k().a(amj.a, new crh($$0), 11, auo.a);
      this.n().ae().a(new abc($$0, $$1));
   }

   public LongSet v() {
      crv $$0 = this.t().b(crv.a(), "chunks");
      return (LongSet)($$0 != null ? LongSets.unmodifiable($$0.b()) : LongSets.EMPTY_SET);
   }

   public boolean a(int $$0, int $$1, boolean $$2) {
      crv $$3 = this.t().a(crv.a(), "chunks");
      crh $$4 = new crh($$0, $$1);
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
   public List<amf> w() {
      return this.H;
   }

   @Override
   public void a(ht $$0, dhi $$1, dhi $$2) {
      Optional<ib<bwi>> $$3 = bwj.a($$1);
      Optional<ib<bwi>> $$4 = bwj.a($$2);
      if (!Objects.equals($$3, $$4)) {
         ht $$5 = $$0.i();
         $$3.ifPresent($$1x -> this.n().execute(() -> {
               this.x().a($$5);
               ack.b(this, $$5);
            }));
         $$4.ifPresent($$1x -> this.n().execute(() -> {
               this.x().a($$5, $$1x);
               ack.a(this, $$5);
            }));
      }
   }

   public bwf x() {
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
      return this.x().a($$0);
   }

   public cfd y() {
      return this.f;
   }

   @Nullable
   public cfb c(ht $$0) {
      return this.f.a($$0, 9216);
   }

   public boolean d(ht $$0) {
      return this.c($$0) != null;
   }

   public void a(bwc $$0, bkq $$1, blv $$2) {
      $$2.a($$0, $$1);
   }

   public void a(Path $$0) throws IOException {
      alo $$1 = this.k().a;

      try (Writer $$2 = Files.newBufferedWriter($$0.resolve("stats.txt"))) {
         $$2.write(String.format(Locale.ROOT, "spawning_chunks: %d\n", $$1.j().b()));
         csl.d $$3 = this.k().n();
         if ($$3 != null) {
            ObjectIterator $$9 = $$3.b().object2IntEntrySet().iterator();

            while ($$9.hasNext()) {
               Entry<blj> $$4 = (Entry<blj>)$$9.next();
               $$2.write(String.format(Locale.ROOT, "spawn_count.%s: %d\n", ((blj)$$4.getKey()).a(), $$4.getIntValue()));
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

   private static void a(Writer $$0, Iterable<bkq> $$1) throws IOException {
      asn $$2 = asn.a().a("x").a("y").a("z").a("uuid").a("type").a("alive").a("display_name").a("custom_name").a($$0);

      for (bkq $$3 : $$1) {
         ur $$4 = $$3.af();
         ur $$5 = $$3.P_();
         $$2.a($$3.ds(), $$3.du(), $$3.dy(), $$3.cw(), jy.h.b($$3.ai()), $$3.bx(), $$5.getString(), $$4 != null ? $$4.getString() : null);
      }
   }

   private void a(Writer $$0) throws IOException {
      asn $$1 = asn.a().a("x").a("y").a("z").a("type").a($$0);

      for (dgu $$2 : this.r) {
         ht $$3 = $$2.c();
         $$1.a($$3.u(), $$3.v(), $$3.w(), $$2.d());
      }
   }

   @VisibleForTesting
   public void a(dwz $$0) {
      this.V.removeIf($$1 -> $$0.b($$1.a()));
   }

   @Override
   public void b(ht $$0, cva $$1) {
      if (!this.ag()) {
         this.a($$0, $$1);
      }
   }

   @Override
   public float a(hx $$0, boolean $$1) {
      return 1.0F;
   }

   public Iterable<bkq> z() {
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
   public dku C() {
      return this.Z;
   }

   @Override
   public ame D() {
      return this;
   }

   @VisibleForTesting
   public String E() {
      return String.format(
         Locale.ROOT,
         "players: %s, entities: %s [%s], block_entities: %d [%s], block_ticks: %d, fluid_ticks: %d, chunk_source: %s",
         this.H.size(),
         this.M.e(),
         a(this.M.d().a(), $$0 -> jy.h.b($$0.ai()).toString()),
         this.r.size(),
         a(this.r, dgu::d),
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

   public static void a(ame $$0) {
      ht $$1 = a;
      int $$2 = $$1.u();
      int $$3 = $$1.v() - 2;
      int $$4 = $$1.w();
      ht.b($$2 - 2, $$3 + 1, $$4 - 2, $$2 + 2, $$3 + 3, $$4 + 2).forEach($$1x -> $$0.b($$1x, cvc.a.o()));
      ht.b($$2 - 2, $$3, $$4 - 2, $$2 + 2, $$3, $$4 + 2).forEach($$1x -> $$0.b($$1x, cvc.co.o()));
   }

   @Override
   protected dli<bkq> F() {
      return this.M.d();
   }

   public void a(Stream<bkq> $$0) {
      this.M.a($$0);
   }

   public void b(Stream<bkq> $$0) {
      this.M.b($$0);
   }

   public void b(djp $$0) {
      $$0.c(this.A_().e());
   }

   public void a(dje $$0) {
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

   public boolean e(ht $$0) {
      return this.M.a($$0) && this.I.a.j().c(crh.a($$0));
   }

   public boolean f(ht $$0) {
      return this.M.a($$0);
   }

   public boolean a(crh $$0) {
      return this.M.a($$0);
   }

   @Override
   public cgd H() {
      return this.J.aY().M();
   }

   public ats a(agi $$0) {
      return this.ae.a($$0);
   }

   public bjd I() {
      return this.ae;
   }

   @Override
   public p a(o $$0) {
      p $$1 = super.a($$0);
      $$1.a("Loaded entity count", () -> String.valueOf(this.M.f()));
      return $$1;
   }

   final class a implements dlh<bkq> {
      public void a(bkq $$0) {
      }

      public void b(bkq $$0) {
         ame.this.f().a($$0);
      }

      public void c(bkq $$0) {
         ame.this.L.a($$0);
      }

      public void d(bkq $$0) {
         ame.this.L.b($$0);
      }

      public void e(bkq $$0) {
         ame.this.k().b($$0);
         if ($$0 instanceof amf $$1) {
            ame.this.H.add($$1);
            ame.this.e();
         }

         if ($$0 instanceof bli $$2) {
            if (ame.this.U) {
               String $$3 = "onTrackingStart called during navigation iteration";
               ac.a("onTrackingStart called during navigation iteration", new IllegalStateException("onTrackingStart called during navigation iteration"));
            }

            ame.this.T.add($$2);
         }

         if ($$0 instanceof bzh $$4) {
            for (bzf $$5 : $$4.gb()) {
               ame.this.aa.put($$5.aj(), $$5);
            }
         }

         $$0.a(dlp::a);
      }

      public void f(bkq $$0) {
         ame.this.k().a($$0);
         if ($$0 instanceof amf $$1) {
            ame.this.H.remove($$1);
            ame.this.e();
         }

         if ($$0 instanceof bli $$2) {
            if (ame.this.U) {
               String $$3 = "onTrackingStart called during navigation iteration";
               ac.a("onTrackingStart called during navigation iteration", new IllegalStateException("onTrackingStart called during navigation iteration"));
            }

            ame.this.T.remove($$2);
         }

         if ($$0 instanceof bzh $$4) {
            for (bzf $$5 : $$4.gb()) {
               ame.this.aa.remove($$5.aj());
            }
         }

         $$0.a(dlp::b);
      }

      public void g(bkq $$0) {
         $$0.a(dlp::c);
      }
   }
}
