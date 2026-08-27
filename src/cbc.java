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

public class cbc extends cax implements bjq, cbe {
   private static final Logger bZ = LogUtils.getLogger();
   private static final aec<cbd> ca = aef.a(cbc.class, aee.t);
   public static final int bV = 12;
   public static final Map<civ, Integer> bW = ImmutableMap.of(cjd.oJ, 4, cjd.tm, 1, cjd.tl, 1, cjd.uq, 1);
   private static final int cb = 2;
   private static final Set<civ> cc = ImmutableSet.of(cjd.oJ, cjd.tm, cjd.tl, cjd.oI, cjd.oH, cjd.uq, new civ[]{cjd.ur, cjd.uo, cjd.up});
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
   private cbp cm;
   private boolean cn;
   private int co;
   private final bry cp = new bry();
   private long cq;
   private long cr;
   private int cs;
   private long ct;
   private int cu;
   private long cv;
   private boolean cw;
   private static final ImmutableList<bsc<?>> cx = ImmutableList.of(
      bsc.b,
      bsc.c,
      bsc.d,
      bsc.e,
      bsc.g,
      bsc.h,
      bsc.i,
      bsc.j,
      bsc.k,
      bsc.l,
      bsc.K,
      bsc.aO,
      new bsc[]{bsc.m, bsc.n, bsc.q, bsc.r, bsc.t, bsc.v, bsc.w, bsc.x, bsc.y, bsc.A, bsc.f, bsc.C, bsc.D, bsc.E, bsc.G, bsc.H, bsc.I, bsc.F}
   );
   private static final ImmutableList<bth<? extends btg<? super cbc>>> cy = ImmutableList.of(bth.c, bth.d, bth.b, bth.e, bth.f, bth.g, bth.h, bth.i, bth.j);
   public static final Map<bsc<hf>, BiPredicate<cbc, hg<bud>>> bY = ImmutableMap.of(
      bsc.b,
      (BiPredicate<cbc, hg>)($$0, $$1) -> $$1.a(bue.n),
      bsc.c,
      (BiPredicate<cbc, hg>)($$0, $$1) -> $$0.gl().b().b().test($$1),
      bsc.d,
      (BiPredicate<cbc, hg>)($$0, $$1) -> cbf.a.test($$1),
      bsc.e,
      (BiPredicate<cbc, hg>)($$0, $$1) -> $$1.a(bue.o)
   );

   public cbc(bip<? extends cbc> $$0, cpq $$1) {
      this($$0, $$1, cbh.c);
   }

   public cbc(bip<? extends cbc> $$0, cpq $$1, cbh $$2) {
      super($$0, $$1);
      ((bsj)this.H()).b(true);
      this.H().a(true);
      this.s(true);
      this.a(this.gl().a($$2).a(cbf.b));
   }

   @Override
   public bkb<cbc> dM() {
      return (bkb<cbc>)super.dM();
   }

   @Override
   protected bkb.b<cbc> dN() {
      return bkb.a(cx, cy);
   }

   @Override
   protected bkb<?> a(Dynamic<?> $$0) {
      bkb<cbc> $$1 = this.dN().a($$0);
      this.a($$1);
      return $$1;
   }

   public void c(akn $$0) {
      bkb<cbc> $$1 = this.dM();
      $$1.b($$0, this);
      this.bz = $$1.i();
      this.a(this.dM());
   }

   private void a(bkb<cbc> $$0) {
      cbf $$1 = this.gl().b();
      if (this.i_()) {
         $$0.a(cdc.e);
         $$0.a(cda.d, bnx.a(0.5F));
      } else {
         $$0.a(cdc.f);
         $$0.a(cda.c, bnx.b($$1, 0.5F), ImmutableSet.of(Pair.of(bsc.c, bsd.a)));
      }

      $$0.a(cda.a, bnx.a($$1, 0.5F));
      $$0.a(cda.f, bnx.d($$1, 0.5F), ImmutableSet.of(Pair.of(bsc.e, bsd.a)));
      $$0.a(cda.e, bnx.c($$1, 0.5F));
      $$0.a(cda.b, bnx.e($$1, 0.5F));
      $$0.a(cda.g, bnx.f($$1, 0.5F));
      $$0.a(cda.i, bnx.g($$1, 0.5F));
      $$0.a(cda.h, bnx.h($$1, 0.5F));
      $$0.a(cda.j, bnx.i($$1, 0.5F));
      $$0.a(ImmutableSet.of(cda.a));
      $$0.b(cda.b);
      $$0.a(cda.b);
      $$0.a(this.dK().W(), this.dK().V());
   }

   @Override
   protected void m() {
      super.m();
      if (this.dK() instanceof akn) {
         this.c((akn)this.dK());
      }
   }

   public static bkg.a gj() {
      return bjd.x().a(bkh.d, 0.5).a(bkh.b, 48.0);
   }

   public boolean gk() {
      return this.cw;
   }

   @Override
   protected void V() {
      this.dK().ad().a("villagerBrain");
      this.dM().a((akn)this.dK(), this);
      this.dK().ad().c();
      if (this.cw) {
         this.cw = false;
      }

      if (!this.gb() && this.ck > 0) {
         this.ck--;
         if (this.ck <= 0) {
            if (this.cl) {
               this.gH();
               this.cl = false;
            }

            this.b(new bhy(bia.j, 200, 0));
         }
      }

      if (this.cm != null && this.dK() instanceof akn) {
         ((akn)this.dK()).a(btx.e, this.cm, this);
         this.dK().a(this, (byte)14);
         this.cm = null;
      }

      if (!this.fQ() && this.ag.a(100) == 0) {
         ccw $$0 = ((akn)this.dK()).c(this.dk());
         if ($$0 != null && $$0.v() && !$$0.a()) {
            this.dK().a(this, (byte)42);
         }
      }

      if (this.gl().b() == cbf.b && this.gb()) {
         this.gg();
      }

      super.V();
   }

   @Override
   public void l() {
      super.l();
      if (this.p() > 0) {
         this.s(this.p() - 1);
      }

      this.gJ();
   }

   @Override
   public bgt b(cbp $$0, bgs $$1) {
      cja $$2 = $$0.b($$1);
      if ($$2.a(cjd.sR) || !this.bv() || this.gb() || this.fB()) {
         return super.b($$0, $$1);
      } else if (this.i_()) {
         this.gw();
         return bgt.a(this.dK().B);
      } else {
         boolean $$3 = this.gc().isEmpty();
         if ($$1 == bgs.a) {
            if ($$3 && !this.dK().B) {
               this.gw();
            }

            $$0.a(apj.S);
         }

         if ($$3) {
            return bgt.a(this.dK().B);
         } else {
            if (!this.dK().B && !this.bU.isEmpty()) {
               this.h($$0);
            }

            return bgt.a(this.dK().B);
         }
      }
   }

   private void gw() {
      this.s(40);
      if (!this.dK().r_()) {
         this.a(aoz.yL, this.eU(), this.eV());
      }
   }

   private void h(cbp $$0) {
      this.i($$0);
      this.f($$0);
      this.a($$0, this.H_(), this.gl().c());
   }

   @Override
   public void f(@Nullable cbp $$0) {
      boolean $$1 = this.ga() != null && $$0 == null;
      super.f($$0);
      if ($$1) {
         this.gg();
      }
   }

   @Override
   protected void gg() {
      super.gg();
      this.gx();
   }

   private void gx() {
      for (coo $$0 : this.gc()) {
         $$0.l();
      }
   }

   @Override
   public boolean gm() {
      return true;
   }

   @Override
   public boolean gi() {
      return this.dK().B;
   }

   public void gn() {
      this.gC();

      for (coo $$0 : this.gc()) {
         $$0.h();
      }

      this.gy();
      this.ct = this.dK().V();
      this.cu++;
   }

   private void gy() {
      cop $$0 = this.gc();
      cbp $$1 = this.ga();
      if ($$1 != null && !$$0.isEmpty()) {
         $$1.a($$1.bQ.j, $$0, this.gl().c(), this.q(), this.gd(), this.gm());
      }
   }

   private boolean gz() {
      for (coo $$0 : this.gc()) {
         if ($$0.r()) {
            return true;
         }
      }

      return false;
   }

   private boolean gA() {
      return this.cu == 0 || this.cu < 2 && this.dK().V() > this.ct + 2400L;
   }

   public boolean go() {
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
         this.gK();
      }

      return this.gA() && this.gz();
   }

   private void gB() {
      int $$0 = 2 - this.cu;
      if ($$0 > 0) {
         for (coo $$1 : this.gc()) {
            $$1.h();
         }
      }

      for (int $$2 = 0; $$2 < $$0; $$2++) {
         this.gC();
      }

      this.gy();
   }

   private void gC() {
      for (coo $$0 : this.gc()) {
         $$0.e();
      }
   }

   private void i(cbp $$0) {
      int $$1 = this.g($$0);
      if ($$1 != 0) {
         for (coo $$2 : this.gc()) {
            $$2.a(-ars.d((float)$$1 * $$2.n()));
         }
      }

      if ($$0.a(bia.F)) {
         bhy $$3 = $$0.b(bia.F);
         int $$4 = $$3.e();

         for (coo $$5 : this.gc()) {
            double $$6 = 0.3 + 0.0625 * (double)$$4;
            int $$7 = (int)Math.floor($$6 * (double)$$5.a().L());
            $$5.a(-Math.max($$7, 1));
         }
      }
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(ca, new cbd(cbh.c, cbf.b, 1));
   }

   @Override
   public void b(qu $$0) {
      super.b($$0);
      cbd.c.encodeStart(rf.a, this.gl()).resultOrPartial(bZ::error).ifPresent($$1 -> $$0.a("VillagerData", $$1));
      $$0.a("FoodLevel", (byte)this.co);
      $$0.a("Gossips", this.cp.a(rf.a));
      $$0.a("Xp", this.cs);
      $$0.a("LastRestock", this.ct);
      $$0.a("LastGossipDecay", this.cr);
      $$0.a("RestocksToday", this.cu);
      if (this.cw) {
         $$0.a("AssignProfessionWhenSpawned", true);
      }
   }

   @Override
   public void a(qu $$0) {
      super.a($$0);
      if ($$0.b("VillagerData", 10)) {
         DataResult<cbd> $$1 = cbd.c.parse(new Dynamic(rf.a, $$0.c("VillagerData")));
         $$1.resultOrPartial(bZ::error).ifPresent(this::a);
      }

      if ($$0.b("Offers", 10)) {
         this.bU = new cop($$0.p("Offers"));
      }

      if ($$0.b("FoodLevel", 1)) {
         this.co = $$0.f("FoodLevel");
      }

      ra $$2 = $$0.c("Gossips", 10);
      this.cp.a(new Dynamic(rf.a, $$2));
      if ($$0.b("Xp", 3)) {
         this.cs = $$0.h("Xp");
      }

      this.ct = $$0.i("LastRestock");
      this.cr = $$0.i("LastGossipDecay");
      this.s(true);
      if (this.dK() instanceof akn) {
         this.c((akn)this.dK());
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
   protected aoy r() {
      if (this.fB()) {
         return null;
      } else {
         return this.gb() ? aoz.yM : aoz.yH;
      }
   }

   @Override
   protected aoy d(bhj $$0) {
      return aoz.yK;
   }

   @Override
   protected aoy h_() {
      return aoz.yJ;
   }

   public void gp() {
      aoy $$0 = this.gl().b().f();
      if ($$0 != null) {
         this.a($$0, this.eU(), this.eV());
      }
   }

   @Override
   public void a(cbd $$0) {
      cbd $$1 = this.gl();
      if ($$1.b() != $$0.b()) {
         this.bU = null;
      }

      this.an.b(ca, $$0);
   }

   @Override
   public cbd gl() {
      return this.an.b(ca);
   }

   @Override
   protected void b(coo $$0) {
      int $$1 = 3 + this.ag.a(4);
      this.cs = this.cs + $$0.o();
      this.cm = this.ga();
      if (this.gG()) {
         this.ck = 40;
         this.cl = true;
         $$1 += 5;
      }

      if ($$0.s()) {
         this.dK().b(new bir(this.dK(), this.dp(), this.dr() + 0.5, this.dv(), $$1));
      }
   }

   public void x(boolean $$0) {
      this.cn = $$0;
   }

   public boolean gq() {
      return this.cn;
   }

   @Override
   public void a(@Nullable bjb $$0) {
      if ($$0 != null && this.dK() instanceof akn) {
         ((akn)this.dK()).a(btx.c, $$0, this);
         if (this.bv() && $$0 instanceof cbp) {
            this.dK().a(this, (byte)13);
         }
      }

      super.a($$0);
   }

   @Override
   public void a(bhj $$0) {
      bZ.info("Villager {} died, message: '{}'", this, $$0.a(this).getString());
      bil $$1 = $$0.d();
      if ($$1 != null) {
         this.a($$1);
      }

      this.gD();
      super.a($$0);
   }

   private void gD() {
      this.a(bsc.b);
      this.a(bsc.c);
      this.a(bsc.d);
      this.a(bsc.e);
   }

   private void a(bil $$0) {
      if (this.dK() instanceof akn $$1) {
         Optional<bse> $$3 = this.bz.c(bsc.h);
         if (!$$3.isEmpty()) {
            $$3.get().b(bjq.class::isInstance).forEach($$2x -> $$1.a(btx.d, $$0, (bjq)$$2x));
         }
      }
   }

   public void a(bsc<hf> $$0) {
      if (this.dK() instanceof akn) {
         MinecraftServer $$1 = ((akn)this.dK()).n();
         this.bz.c($$0).ifPresent($$2 -> {
            akn $$3 = $$1.a($$2.a());
            if ($$3 != null) {
               bua $$4 = $$3.w();
               Optional<hg<bud>> $$5 = $$4.c($$2.b());
               BiPredicate<cbc, hg<bud>> $$6 = bY.get($$0);
               if ($$5.isPresent() && $$6.test(this, $$5.get())) {
                  $$4.b($$2.b());
                  aay.c($$3, $$2.b());
               }
            }
         });
      }
   }

   @Override
   public boolean P_() {
      return this.co + this.gI() >= 12 && !this.fB() && this.h() == 0;
   }

   private boolean gE() {
      return this.co < 12;
   }

   private void gF() {
      if (this.gE() && this.gI() != 0) {
         for (int $$0 = 0; $$0 < this.t().b(); $$0++) {
            cja $$1 = this.t().a($$0);
            if (!$$1.b()) {
               Integer $$2 = bW.get($$1.d());
               if ($$2 != null) {
                  int $$3 = $$1.L();

                  for (int $$4 = $$3; $$4 > 0; $$4--) {
                     this.co = this.co + $$2;
                     this.t().a($$0, 1);
                     if (!this.gE()) {
                        return;
                     }
                  }
               }
            }
         }
      }
   }

   public int g(cbp $$0) {
      return this.cp.a($$0.cv(), $$0x -> true);
   }

   private void v(int $$0) {
      this.co -= $$0;
   }

   public void gr() {
      this.gF();
      this.v(12);
   }

   public void b(cop $$0) {
      this.bU = $$0;
   }

   private boolean gG() {
      int $$0 = this.gl().c();
      return cbd.d($$0) && this.cs >= cbd.c($$0);
   }

   private void gH() {
      this.a(this.gl().a(this.gl().c() + 1));
      this.gh();
   }

   @Override
   protected ti cn() {
      return ti.c(this.ag().g() + "." + jd.A.b(this.gl().b()).a());
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 12) {
         this.a(ix.M);
      } else if ($$0 == 13) {
         this.a(ix.b);
      } else if ($$0 == 14) {
         this.a(ix.K);
      } else if ($$0 == 42) {
         this.a(ix.ag);
      } else {
         super.b($$0);
      }
   }

   @Nullable
   @Override
   public bju a(cqf $$0, bgr $$1, bjf $$2, @Nullable bju $$3, @Nullable qu $$4) {
      if ($$2 == bjf.e) {
         this.a(this.gl().a(cbf.b));
      }

      if ($$2 == bjf.n || $$2 == bjf.m || $$2 == bjf.c || $$2 == bjf.o) {
         this.a(this.gl().a(cbh.a($$0.s(this.dk()))));
      }

      if ($$2 == bjf.d) {
         this.cw = true;
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Nullable
   public cbc b(akn $$0, big $$1) {
      double $$2 = this.ag.j();
      cbh $$3;
      if ($$2 < 0.5) {
         $$3 = cbh.a($$0.s(this.dk()));
      } else if ($$2 < 0.75) {
         $$3 = this.gl().a();
      } else {
         $$3 = ((cbc)$$1).gl().a();
      }

      cbc $$6 = new cbc(bip.bf, $$0, $$3);
      $$6.a($$0, $$0.d_($$6.dk()), bjf.e, null, null);
      return $$6;
   }

   @Override
   public void a(akn $$0, bja $$1) {
      if ($$0.ai() != bgq.a) {
         bZ.info("Villager {} was struck by lightning {}.", this, $$1);
         bzt $$2 = bip.bj.a((cpq)$$0);
         if ($$2 != null) {
            $$2.b(this.dp(), this.dr(), this.dv(), this.dA(), this.dC());
            $$2.a($$0, $$0.d_($$2.dk()), bjf.i, null, null);
            $$2.t(this.fQ());
            if (this.ac()) {
               $$2.b(this.ad());
               $$2.n(this.cA());
            }

            $$2.fF();
            $$0.a_($$2);
            this.gD();
            this.ak();
         } else {
            super.a($$0, $$1);
         }
      } else {
         super.a($$0, $$1);
      }
   }

   @Override
   protected void b(byi $$0) {
      cba.a(this, this, $$0);
   }

   @Override
   public boolean k(cja $$0) {
      civ $$1 = $$0.d();
      return (cc.contains($$1) || this.gl().b().d().contains($$1)) && this.t().b($$0);
   }

   public boolean gs() {
      return this.gI() >= 24;
   }

   public boolean gt() {
      return this.gI() < 12;
   }

   private int gI() {
      bha $$0 = this.t();
      return bW.entrySet().stream().mapToInt($$1 -> $$0.a_($$1.getKey()) * $$1.getValue()).sum();
   }

   public boolean gu() {
      return this.t().a_($$0 -> $$0.a(apw.aU));
   }

   @Override
   protected void gh() {
      cbd $$0 = this.gl();
      Int2ObjectMap<cbg.f[]> $$2;
      if (this.dK().G().b(cdz.c)) {
         Int2ObjectMap<cbg.f[]> $$1 = cbg.c.get($$0.b());
         $$2 = $$1 != null ? $$1 : cbg.a.get($$0.b());
      } else {
         $$2 = cbg.a.get($$0.b());
      }

      if ($$2 != null && !$$2.isEmpty()) {
         cbg.f[] $$4 = (cbg.f[])$$2.get($$0.c());
         if ($$4 != null) {
            cop $$5 = this.gc();
            this.a($$5, $$4, 2);
         }
      }
   }

   public void a(akn $$0, cbc $$1, long $$2) {
      if (($$2 < this.cq || $$2 >= this.cq + 1200L) && ($$2 < $$1.cq || $$2 >= $$1.cq + 1200L)) {
         this.cp.a($$1.cp, this.ag, 10);
         this.cq = $$2;
         $$1.cq = $$2;
         this.a($$0, $$2, 5);
      }
   }

   private void gJ() {
      long $$0 = this.dK().V();
      if (this.cr == 0L) {
         this.cr = $$0;
      } else if ($$0 >= this.cr + 24000L) {
         this.cp.b();
         this.cr = $$0;
      }
   }

   public void a(akn $$0, long $$1, int $$2) {
      if (this.a($$1)) {
         ehd $$3 = this.cG().c(10.0, 10.0, 10.0);
         List<cbc> $$4 = $$0.a(cbc.class, $$3);
         List<cbc> $$5 = $$4.stream().filter($$1x -> $$1x.a($$1)).limit(5L).collect(Collectors.toList());
         if ($$5.size() >= $$2) {
            if (!asi.a(bip.ac, bjf.f, $$0, this.dk(), 10, 8, 6, asi.a.a).isEmpty()) {
               $$4.forEach(bst::b);
            }
         }
      }
   }

   public boolean a(long $$0) {
      return !this.b(this.dK().V()) ? false : !this.bz.a(bsc.F);
   }

   @Override
   public void a(btx $$0, bil $$1) {
      if ($$0 == btx.a) {
         this.cp.a($$1.cv(), brz.d, 20);
         this.cp.a($$1.cv(), brz.c, 25);
      } else if ($$0 == btx.e) {
         this.cp.a($$1.cv(), brz.e, 2);
      } else if ($$0 == btx.c) {
         this.cp.a($$1.cv(), brz.b, 25);
      } else if ($$0 == btx.d) {
         this.cp.a($$1.cv(), brz.a, 25);
      }
   }

   @Override
   public int q() {
      return this.cs;
   }

   public void u(int $$0) {
      this.cs = $$0;
   }

   private void gK() {
      this.gB();
      this.cu = 0;
   }

   public bry gv() {
      return this.cp;
   }

   public void a(rn $$0) {
      this.cp.a(new Dynamic(rf.a, $$0));
   }

   @Override
   protected void T() {
      super.T();
      aay.a(this);
   }

   @Override
   public void b(gw $$0) {
      super.b($$0);
      this.bz.a(bsc.G, this.dK().V());
      this.bz.b(bsc.m);
      this.bz.b(bsc.E);
   }

   @Override
   public void fC() {
      super.fC();
      this.bz.a(bsc.H, this.dK().V());
   }

   private boolean b(long $$0) {
      Optional<Long> $$1 = this.bz.c(bsc.G);
      return $$1.isPresent() ? $$0 - $$1.get() < 24000L : false;
   }
}
