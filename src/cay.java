import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiPredicate;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class cay extends cat implements bjl, cba {
   private static final Logger bZ = LogUtils.getLogger();
   private static final adx<caz> ca = aea.a(cay.class, adz.t);
   public static final int bV = 12;
   public static final Map<cir, Integer> bW = ImmutableMap.of(ciz.oJ, 4, ciz.tm, 1, ciz.tl, 1, ciz.uq, 1);
   private static final int cb = 2;
   private static final Set<cir> cc = ImmutableSet.of(ciz.oJ, ciz.tm, ciz.tl, ciz.oI, ciz.oH, ciz.uq, new cir[]{ciz.ur, ciz.uo, ciz.up});
   private static final int cd = 10;
   private static final int ce = 1200;
   private static final int cf = 24000;
   private static final int cg = 25;
   private static final int ch = 10;
   private static final int ci = 5;
   private static final long cj = 24000L;
   @VisibleForTesting
   public static final float bX = 0.5F;
   private int ck;
   private boolean cl;
   @Nullable
   private cbl cm;
   private boolean cn;
   private int co;
   private final bru cp = new bru();
   private long cq;
   private long cr;
   private int cs;
   private long ct;
   private int cu;
   private long cv;
   private boolean cw;
   private static final ImmutableList<bry<?>> cx = ImmutableList.of(
      bry.b,
      bry.c,
      bry.d,
      bry.e,
      bry.g,
      bry.h,
      bry.i,
      bry.j,
      bry.k,
      bry.l,
      bry.K,
      bry.aO,
      new bry[]{bry.m, bry.n, bry.q, bry.r, bry.t, bry.v, bry.w, bry.x, bry.y, bry.A, bry.f, bry.C, bry.D, bry.E, bry.G, bry.H, bry.I, bry.F}
   );
   private static final ImmutableList<btd<? extends btc<? super cay>>> cy = ImmutableList.of(btd.c, btd.d, btd.b, btd.e, btd.f, btd.g, btd.h, btd.i, btd.j);
   public static final Map<bry<he>, BiPredicate<cay, hf<btz>>> bY = ImmutableMap.of(
      bry.b,
      (BiPredicate<cay, hf>)($$0, $$1) -> $$1.a(bua.n),
      bry.c,
      (BiPredicate<cay, hf>)($$0, $$1) -> $$0.gk().b().b().test($$1),
      bry.d,
      (BiPredicate<cay, hf>)($$0, $$1) -> cbb.a.test($$1),
      bry.e,
      (BiPredicate<cay, hf>)($$0, $$1) -> $$1.a(bua.o)
   );

   public cay(bik<? extends cay> $$0, cpk $$1) {
      this($$0, $$1, cbd.c);
   }

   public cay(bik<? extends cay> $$0, cpk $$1, cbd $$2) {
      super($$0, $$1);
      ((bsf)this.H()).b(true);
      this.H().a(true);
      this.s(true);
      this.a(this.gk().a($$2).a(cbb.b));
   }

   @Override
   public bjx<cay> dM() {
      return (bjx<cay>)super.dM();
   }

   @Override
   protected bjx.b<cay> dN() {
      return bjx.a(cx, cy);
   }

   @Override
   protected bjx<?> a(Dynamic<?> $$0) {
      bjx<cay> $$1 = this.dN().a($$0);
      this.a($$1);
      return $$1;
   }

   public void c(aki $$0) {
      bjx<cay> $$1 = this.dM();
      $$1.b($$0, this);
      this.bz = $$1.i();
      this.a(this.dM());
   }

   private void a(bjx<cay> $$0) {
      cbb $$1 = this.gk().b();
      if (this.i_()) {
         $$0.a(ccy.e);
         $$0.a(ccw.d, bnt.a(0.5F));
      } else {
         $$0.a(ccy.f);
         $$0.a(ccw.c, bnt.b($$1, 0.5F), ImmutableSet.of(Pair.of(bry.c, brz.a)));
      }

      $$0.a(ccw.a, bnt.a($$1, 0.5F));
      $$0.a(ccw.f, bnt.d($$1, 0.5F), ImmutableSet.of(Pair.of(bry.e, brz.a)));
      $$0.a(ccw.e, bnt.c($$1, 0.5F));
      $$0.a(ccw.b, bnt.e($$1, 0.5F));
      $$0.a(ccw.g, bnt.f($$1, 0.5F));
      $$0.a(ccw.i, bnt.g($$1, 0.5F));
      $$0.a(ccw.h, bnt.h($$1, 0.5F));
      $$0.a(ccw.j, bnt.i($$1, 0.5F));
      $$0.a(ImmutableSet.of(ccw.a));
      $$0.b(ccw.b);
      $$0.a(ccw.b);
      $$0.a(this.dK().W(), this.dK().V());
   }

   @Override
   protected void m() {
      super.m();
      if (this.dK() instanceof aki) {
         this.c((aki)this.dK());
      }
   }

   public static bkc.a gi() {
      return biy.x().a(bkd.d, 0.5).a(bkd.b, 48.0);
   }

   public boolean gj() {
      return this.cw;
   }

   @Override
   protected void V() {
      this.dK().ad().a("villagerBrain");
      this.dM().a((aki)this.dK(), this);
      this.dK().ad().c();
      if (this.cw) {
         this.cw = false;
      }

      if (!this.ga() && this.ck > 0) {
         this.ck--;
         if (this.ck <= 0) {
            if (this.cl) {
               this.gG();
               this.cl = false;
            }

            this.b(new bht(bhv.j, 200, 0));
         }
      }

      if (this.cm != null && this.dK() instanceof aki) {
         ((aki)this.dK()).a(btt.e, this.cm, this);
         this.dK().a(this, (byte)14);
         this.cm = null;
      }

      if (!this.fQ() && this.ag.a(100) == 0) {
         ccs $$0 = ((aki)this.dK()).c(this.dk());
         if ($$0 != null && $$0.v() && !$$0.a()) {
            this.dK().a(this, (byte)42);
         }
      }

      if (this.gk().b() == cbb.b && this.ga()) {
         this.gf();
      }

      super.V();
   }

   @Override
   public void l() {
      super.l();
      if (this.p() > 0) {
         this.s(this.p() - 1);
      }

      this.gI();
   }

   @Override
   public bgo b(cbl $$0, bgn $$1) {
      ciw $$2 = $$0.b($$1);
      if ($$2.a(ciz.sR) || !this.bv() || this.ga() || this.fB()) {
         return super.b($$0, $$1);
      } else if (this.i_()) {
         this.gv();
         return bgo.a(this.dK().B);
      } else {
         boolean $$3 = this.gb().isEmpty();
         if ($$1 == bgn.a) {
            if ($$3 && !this.dK().B) {
               this.gv();
            }

            $$0.a(ape.S);
         }

         if ($$3) {
            return bgo.a(this.dK().B);
         } else {
            if (!this.dK().B && !this.bU.isEmpty()) {
               this.h($$0);
            }

            return bgo.a(this.dK().B);
         }
      }
   }

   private void gv() {
      this.s(40);
      if (!this.dK().r_()) {
         this.a(aou.yG, this.eU(), this.eV());
      }
   }

   private void h(cbl $$0) {
      this.i($$0);
      this.f($$0);
      this.a($$0, this.H_(), this.gk().c());
   }

   @Override
   public void f(@Nullable cbl $$0) {
      boolean $$1 = this.fZ() != null && $$0 == null;
      super.f($$0);
      if ($$1) {
         this.gf();
      }
   }

   @Override
   protected void gf() {
      super.gf();
      this.gw();
   }

   private void gw() {
      for (coh $$0 : this.gb()) {
         $$0.l();
      }
   }

   @Override
   public boolean gl() {
      return true;
   }

   @Override
   public boolean gh() {
      return this.dK().B;
   }

   public void gm() {
      this.gB();

      for (coh $$0 : this.gb()) {
         $$0.h();
      }

      this.gx();
      this.ct = this.dK().V();
      this.cu++;
   }

   private void gx() {
      coi $$0 = this.gb();
      cbl $$1 = this.fZ();
      if ($$1 != null && !$$0.isEmpty()) {
         $$1.a($$1.bQ.j, $$0, this.gk().c(), this.q(), this.gc(), this.gl());
      }
   }

   private boolean gy() {
      for (coh $$0 : this.gb()) {
         if ($$0.r()) {
            return true;
         }
      }

      return false;
   }

   private boolean gz() {
      return this.cu == 0 || this.cu < 2 && this.dK().V() > this.ct + 2400L;
   }

   public boolean gn() {
      long $$0 = this.ct + 12000L;
      long $$1 = this.dK().V();
      boolean $$2 = $$1 > $$0;
      long $$3 = this.dK().W();
      if (this.cv > 0L) {
         long $$4 = this.cv / 24000L;
         long $$5 = $$3 / 24000L;
         $$2 |= $$5 > $$4;
      }

      this.cv = $$3;
      if ($$2) {
         this.ct = $$1;
         this.gJ();
      }

      return this.gz() && this.gy();
   }

   private void gA() {
      int $$0 = 2 - this.cu;
      if ($$0 > 0) {
         for (coh $$1 : this.gb()) {
            $$1.h();
         }
      }

      for (int $$2 = 0; $$2 < $$0; $$2++) {
         this.gB();
      }

      this.gx();
   }

   private void gB() {
      for (coh $$0 : this.gb()) {
         $$0.e();
      }
   }

   private void i(cbl $$0) {
      int $$1 = this.g($$0);
      if ($$1 != 0) {
         for (coh $$2 : this.gb()) {
            $$2.a(-aro.d((float)$$1 * $$2.n()));
         }
      }

      if ($$0.a(bhv.F)) {
         bht $$3 = $$0.b(bhv.F);
         int $$4 = $$3.e();

         for (coh $$5 : this.gb()) {
            double $$6 = 0.3 + 0.0625 * (double)$$4;
            int $$7 = (int)Math.floor($$6 * (double)$$5.a().L());
            $$5.a(-Math.max($$7, 1));
         }
      }
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(ca, new caz(cbd.c, cbb.b, 1));
   }

   @Override
   public void b(qs $$0) {
      super.b($$0);
      caz.c.encodeStart(rd.a, this.gk()).resultOrPartial(bZ::error).ifPresent($$1 -> $$0.a("VillagerData", $$1));
      $$0.a("FoodLevel", (byte)this.co);
      $$0.a("Gossips", this.cp.a(rd.a));
      $$0.a("Xp", this.cs);
      $$0.a("LastRestock", this.ct);
      $$0.a("LastGossipDecay", this.cr);
      $$0.a("RestocksToday", this.cu);
      if (this.cw) {
         $$0.a("AssignProfessionWhenSpawned", true);
      }
   }

   @Override
   public void a(qs $$0) {
      super.a($$0);
      if ($$0.b("VillagerData", 10)) {
         DataResult<caz> $$1 = caz.c.parse(new Dynamic(rd.a, $$0.c("VillagerData")));
         $$1.resultOrPartial(bZ::error).ifPresent(this::a);
      }

      if ($$0.b("Offers", 10)) {
         this.bU = new coi($$0.p("Offers"));
      }

      if ($$0.b("FoodLevel", 1)) {
         this.co = $$0.f("FoodLevel");
      }

      qy $$2 = $$0.c("Gossips", 10);
      this.cp.a(new Dynamic(rd.a, $$2));
      if ($$0.b("Xp", 3)) {
         this.cs = $$0.h("Xp");
      }

      this.ct = $$0.i("LastRestock");
      this.cr = $$0.i("LastGossipDecay");
      this.s(true);
      if (this.dK() instanceof aki) {
         this.c((aki)this.dK());
      }

      this.cu = $$0.h("RestocksToday");
      if ($$0.e("AssignProfessionWhenSpawned")) {
         this.cw = $$0.q("AssignProfessionWhenSpawned");
      }
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Nullable
   @Override
   protected aot r() {
      if (this.fB()) {
         return null;
      } else {
         return this.ga() ? aou.yH : aou.yC;
      }
   }

   @Override
   protected aot d(bhe $$0) {
      return aou.yF;
   }

   @Override
   protected aot h_() {
      return aou.yE;
   }

   public void go() {
      aot $$0 = this.gk().b().f();
      if ($$0 != null) {
         this.a($$0, this.eU(), this.eV());
      }
   }

   @Override
   public void a(caz $$0) {
      caz $$1 = this.gk();
      if ($$1.b() != $$0.b()) {
         this.bU = null;
      }

      this.an.b(ca, $$0);
   }

   @Override
   public caz gk() {
      return this.an.b(ca);
   }

   @Override
   protected void b(coh $$0) {
      int $$1 = 3 + this.ag.a(4);
      this.cs = this.cs + $$0.o();
      this.cm = this.fZ();
      if (this.gF()) {
         this.ck = 40;
         this.cl = true;
         $$1 += 5;
      }

      if ($$0.s()) {
         this.dK().b(new bim(this.dK(), this.dp(), this.dr() + 0.5, this.dv(), $$1));
      }
   }

   public void x(boolean $$0) {
      this.cn = $$0;
   }

   public boolean gp() {
      return this.cn;
   }

   @Override
   public void a(@Nullable biw $$0) {
      if ($$0 != null && this.dK() instanceof aki) {
         ((aki)this.dK()).a(btt.c, $$0, this);
         if (this.bv() && $$0 instanceof cbl) {
            this.dK().a(this, (byte)13);
         }
      }

      super.a($$0);
   }

   @Override
   public void a(bhe $$0) {
      bZ.info("Villager {} died, message: '{}'", this, $$0.a(this).getString());
      big $$1 = $$0.d();
      if ($$1 != null) {
         this.a($$1);
      }

      this.gC();
      super.a($$0);
   }

   private void gC() {
      this.a(bry.b);
      this.a(bry.c);
      this.a(bry.d);
      this.a(bry.e);
   }

   private void a(big $$0) {
      if (this.dK() instanceof aki $$1) {
         Optional<bsa> $$3 = this.bz.c(bry.h);
         if (!$$3.isEmpty()) {
            $$3.get().b(bjl.class::isInstance).forEach($$2x -> $$1.a(btt.d, $$0, (bjl)$$2x));
         }
      }
   }

   public void a(bry<he> $$0) {
      if (this.dK() instanceof aki) {
         MinecraftServer $$1 = ((aki)this.dK()).n();
         this.bz.c($$0).ifPresent($$2 -> {
            aki $$3 = $$1.a($$2.a());
            if ($$3 != null) {
               btw $$4 = $$3.w();
               Optional<hf<btz>> $$5 = $$4.c($$2.b());
               BiPredicate<cay, hf<btz>> $$6 = bY.get($$0);
               if ($$5.isPresent() && $$6.test(this, $$5.get())) {
                  $$4.b($$2.b());
                  aau.c($$3, $$2.b());
               }
            }
         });
      }
   }

   @Override
   public boolean P_() {
      return this.co + this.gH() >= 12 && !this.fB() && this.h() == 0;
   }

   private boolean gD() {
      return this.co < 12;
   }

   private void gE() {
      if (this.gD() && this.gH() != 0) {
         for (int $$0 = 0; $$0 < this.t().b(); $$0++) {
            ciw $$1 = this.t().a($$0);
            if (!$$1.b()) {
               Integer $$2 = bW.get($$1.d());
               if ($$2 != null) {
                  int $$3 = $$1.L();

                  for (int $$4 = $$3; $$4 > 0; $$4--) {
                     this.co = this.co + $$2;
                     this.t().a($$0, 1);
                     if (!this.gD()) {
                        return;
                     }
                  }
               }
            }
         }
      }
   }

   public int g(cbl $$0) {
      return this.cp.a($$0.cv(), $$0x -> true);
   }

   private void v(int $$0) {
      this.co -= $$0;
   }

   public void gq() {
      this.gE();
      this.v(12);
   }

   public void b(coi $$0) {
      this.bU = $$0;
   }

   private boolean gF() {
      int $$0 = this.gk().c();
      return caz.d($$0) && this.cs >= caz.c($$0);
   }

   private void gG() {
      this.a(this.gk().a(this.gk().c() + 1));
      this.gg();
   }

   @Override
   protected te cn() {
      return te.c(this.ag().g() + "." + jc.A.b(this.gk().b()).a());
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 12) {
         this.a(iw.M);
      } else if ($$0 == 13) {
         this.a(iw.b);
      } else if ($$0 == 14) {
         this.a(iw.K);
      } else if ($$0 == 42) {
         this.a(iw.ag);
      } else {
         super.b($$0);
      }
   }

   @Nullable
   @Override
   public bjq a(cpz $$0, bgm $$1, bja $$2, @Nullable bjq $$3, @Nullable qs $$4) {
      if ($$2 == bja.e) {
         this.a(this.gk().a(cbb.b));
      }

      if ($$2 == bja.n || $$2 == bja.m || $$2 == bja.c || $$2 == bja.o) {
         this.a(this.gk().a(cbd.a($$0.s(this.dk()))));
      }

      if ($$2 == bja.d) {
         this.cw = true;
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Nullable
   public cay b(aki $$0, bib $$1) {
      double $$2 = this.ag.j();
      cbd $$3;
      if ($$2 < 0.5) {
         $$3 = cbd.a($$0.s(this.dk()));
      } else if ($$2 < 0.75) {
         $$3 = this.gk().a();
      } else {
         $$3 = ((cay)$$1).gk().a();
      }

      cay $$6 = new cay(bik.bf, $$0, $$3);
      $$6.a($$0, $$0.d_($$6.dk()), bja.e, null, null);
      return $$6;
   }

   @Override
   public void a(aki $$0, biv $$1) {
      if ($$0.ai() != bgl.a) {
         bZ.info("Villager {} was struck by lightning {}.", this, $$1);
         bzp $$2 = bik.bj.a((cpk)$$0);
         if ($$2 != null) {
            $$2.b(this.dp(), this.dr(), this.dv(), this.dA(), this.dC());
            $$2.a($$0, $$0.d_($$2.dk()), bja.i, null, null);
            $$2.t(this.fQ());
            if (this.ac()) {
               $$2.b(this.ad());
               $$2.n(this.cA());
            }

            $$2.fF();
            $$0.a_($$2);
            this.gC();
            this.ak();
         } else {
            super.a($$0, $$1);
         }
      } else {
         super.a($$0, $$1);
      }
   }

   @Override
   protected void b(bye $$0) {
      caw.a(this, this, $$0);
   }

   @Override
   public boolean k(ciw $$0) {
      cir $$1 = $$0.d();
      return (cc.contains($$1) || this.gk().b().d().contains($$1)) && this.t().b($$0);
   }

   public boolean gr() {
      return this.gH() >= 24;
   }

   public boolean gs() {
      return this.gH() < 12;
   }

   private int gH() {
      bgv $$0 = this.t();
      return bW.entrySet().stream().mapToInt($$1 -> $$0.a_($$1.getKey()) * $$1.getValue()).sum();
   }

   public boolean gt() {
      return this.t().a_($$0 -> $$0.a(apr.aU));
   }

   @Override
   protected void gg() {
      caz $$0 = this.gk();
      Int2ObjectMap<cbc.f[]> $$2;
      if (this.dK().G().b(cdv.c)) {
         Int2ObjectMap<cbc.f[]> $$1 = cbc.c.get($$0.b());
         $$2 = $$1 != null ? $$1 : cbc.a.get($$0.b());
      } else {
         $$2 = cbc.a.get($$0.b());
      }

      if ($$2 != null && !$$2.isEmpty()) {
         cbc.f[] $$4 = (cbc.f[])$$2.get($$0.c());
         if ($$4 != null) {
            coi $$5 = this.gb();
            this.a($$5, $$4, 2);
         }
      }
   }

   public void a(aki $$0, cay $$1, long $$2) {
      if (($$2 < this.cq || $$2 >= this.cq + 1200L) && ($$2 < $$1.cq || $$2 >= $$1.cq + 1200L)) {
         this.cp.a($$1.cp, this.ag, 10);
         this.cq = $$2;
         $$1.cq = $$2;
         this.a($$0, $$2, 5);
      }
   }

   private void gI() {
      long $$0 = this.dK().V();
      if (this.cr == 0L) {
         this.cr = $$0;
      } else if ($$0 >= this.cr + 24000L) {
         this.cp.b();
         this.cr = $$0;
      }
   }

   public void a(aki $$0, long $$1, int $$2) {
      if (this.a($$1)) {
         eha $$3 = this.cG().c(10.0, 10.0, 10.0);
         List<cay> $$4 = $$0.a(cay.class, $$3);
         List<cay> $$5 = $$4.stream().filter($$1x -> $$1x.a($$1)).limit(5L).collect(Collectors.toList());
         if ($$5.size() >= $$2) {
            if (asd.a(bik.ac, bja.f, $$0, this.dk(), 10, 8, 6, asd.a.a).isPresent()) {
               $$4.forEach(bsp::b);
            }
         }
      }
   }

   public boolean a(long $$0) {
      return !this.b(this.dK().V()) ? false : !this.bz.a(bry.F);
   }

   @Override
   public void a(btt $$0, big $$1) {
      if ($$0 == btt.a) {
         this.cp.a($$1.cv(), brv.d, 20);
         this.cp.a($$1.cv(), brv.c, 25);
      } else if ($$0 == btt.e) {
         this.cp.a($$1.cv(), brv.e, 2);
      } else if ($$0 == btt.c) {
         this.cp.a($$1.cv(), brv.b, 25);
      } else if ($$0 == btt.d) {
         this.cp.a($$1.cv(), brv.a, 25);
      }
   }

   @Override
   public int q() {
      return this.cs;
   }

   public void u(int $$0) {
      this.cs = $$0;
   }

   private void gJ() {
      this.gA();
      this.cu = 0;
   }

   public bru gu() {
      return this.cp;
   }

   public void a(rl $$0) {
      this.cp.a(new Dynamic(rd.a, $$0));
   }

   @Override
   protected void T() {
      super.T();
      aau.a(this);
   }

   @Override
   public void b(gv $$0) {
      super.b($$0);
      this.bz.a(bry.G, this.dK().V());
      this.bz.b(bry.m);
      this.bz.b(bry.E);
   }

   @Override
   public void fC() {
      super.fC();
      this.bz.a(bry.H, this.dK().V());
   }

   private boolean b(long $$0) {
      Optional<Long> $$1 = this.bz.c(bry.G);
      return $$1.isPresent() ? $$0 - $$1.get() < 24000L : false;
   }
}
