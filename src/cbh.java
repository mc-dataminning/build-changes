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

public class cbh extends cbc implements bjv, cbj {
   private static final Logger bZ = LogUtils.getLogger();
   private static final aee<cbi> ca = aeh.a(cbh.class, aeg.t);
   public static final int bV = 12;
   public static final Map<cja, Integer> bW = ImmutableMap.of(cji.oJ, 4, cji.tm, 1, cji.tl, 1, cji.uq, 1);
   private static final int cb = 2;
   private static final Set<cja> cc = ImmutableSet.of(cji.oJ, cji.tm, cji.tl, cji.oI, cji.oH, cji.uq, new cja[]{cji.ur, cji.uo, cji.up});
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
   private cbu cm;
   private boolean cn;
   private int co;
   private final bsd cp = new bsd();
   private long cq;
   private long cr;
   private int cs;
   private long ct;
   private int cu;
   private long cv;
   private boolean cw;
   private static final ImmutableList<bsh<?>> cx = ImmutableList.of(
      bsh.b,
      bsh.c,
      bsh.d,
      bsh.e,
      bsh.g,
      bsh.h,
      bsh.i,
      bsh.j,
      bsh.k,
      bsh.l,
      bsh.K,
      bsh.aO,
      new bsh[]{bsh.m, bsh.n, bsh.q, bsh.r, bsh.t, bsh.v, bsh.w, bsh.x, bsh.y, bsh.A, bsh.f, bsh.C, bsh.D, bsh.E, bsh.G, bsh.H, bsh.I, bsh.F}
   );
   private static final ImmutableList<btm<? extends btl<? super cbh>>> cy = ImmutableList.of(btm.c, btm.d, btm.b, btm.e, btm.f, btm.g, btm.h, btm.i, btm.j);
   public static final Map<bsh<hd>, BiPredicate<cbh, he<bui>>> bY = ImmutableMap.of(
      bsh.b,
      (BiPredicate<cbh, he>)($$0, $$1) -> $$1.a(buj.n),
      bsh.c,
      (BiPredicate<cbh, he>)($$0, $$1) -> $$0.go().b().b().test($$1),
      bsh.d,
      (BiPredicate<cbh, he>)($$0, $$1) -> cbk.a.test($$1),
      bsh.e,
      (BiPredicate<cbh, he>)($$0, $$1) -> $$1.a(buj.o)
   );

   public cbh(biu<? extends cbh> $$0, cpv $$1) {
      this($$0, $$1, cbm.c);
   }

   public cbh(biu<? extends cbh> $$0, cpv $$1, cbm $$2) {
      super($$0, $$1);
      ((bso)this.L()).b(true);
      this.L().a(true);
      this.s(true);
      this.a(this.go().a($$2).a(cbk.b));
   }

   @Override
   public bkg<cbh> dN() {
      return (bkg<cbh>)super.dN();
   }

   @Override
   protected bkg.b<cbh> dO() {
      return bkg.a(cx, cy);
   }

   @Override
   protected bkg<?> a(Dynamic<?> $$0) {
      bkg<cbh> $$1 = this.dO().a($$0);
      this.a($$1);
      return $$1;
   }

   public void c(akq $$0) {
      bkg<cbh> $$1 = this.dN();
      $$1.b($$0, this);
      this.bz = $$1.i();
      this.a(this.dN());
   }

   private void a(bkg<cbh> $$0) {
      cbk $$1 = this.go().b();
      if (this.m_()) {
         $$0.a(cdh.e);
         $$0.a(cdf.d, boc.a(0.5F));
      } else {
         $$0.a(cdh.f);
         $$0.a(cdf.c, boc.b($$1, 0.5F), ImmutableSet.of(Pair.of(bsh.c, bsi.a)));
      }

      $$0.a(cdf.a, boc.a($$1, 0.5F));
      $$0.a(cdf.f, boc.d($$1, 0.5F), ImmutableSet.of(Pair.of(bsh.e, bsi.a)));
      $$0.a(cdf.e, boc.c($$1, 0.5F));
      $$0.a(cdf.b, boc.e($$1, 0.5F));
      $$0.a(cdf.g, boc.f($$1, 0.5F));
      $$0.a(cdf.i, boc.g($$1, 0.5F));
      $$0.a(cdf.h, boc.h($$1, 0.5F));
      $$0.a(cdf.j, boc.i($$1, 0.5F));
      $$0.a(ImmutableSet.of(cdf.a));
      $$0.b(cdf.b);
      $$0.a(cdf.b);
      $$0.a(this.dL().W(), this.dL().V());
   }

   @Override
   protected void m() {
      super.m();
      if (this.dL() instanceof akq) {
         this.c((akq)this.dL());
      }
   }

   public static bkl.a gm() {
      return bji.A().a(bkm.d, 0.5).a(bkm.b, 48.0);
   }

   public boolean gn() {
      return this.cw;
   }

   @Override
   protected void X() {
      this.dL().ad().a("villagerBrain");
      this.dN().a((akq)this.dL(), this);
      this.dL().ad().c();
      if (this.cw) {
         this.cw = false;
      }

      if (!this.ge() && this.ck > 0) {
         this.ck--;
         if (this.ck <= 0) {
            if (this.cl) {
               this.gK();
               this.cl = false;
            }

            this.b(new bid(bif.j, 200, 0));
         }
      }

      if (this.cm != null && this.dL() instanceof akq) {
         ((akq)this.dL()).a(buc.e, this.cm, this);
         this.dL().a(this, (byte)14);
         this.cm = null;
      }

      if (!this.fT() && this.ag.a(100) == 0) {
         cdb $$0 = ((akq)this.dL()).c(this.dl());
         if ($$0 != null && $$0.v() && !$$0.a()) {
            this.dL().a(this, (byte)42);
         }
      }

      if (this.go().b() == cbk.b && this.ge()) {
         this.gj();
      }

      super.X();
   }

   @Override
   public void l() {
      super.l();
      if (this.s() > 0) {
         this.s(this.s() - 1);
      }

      this.gM();
   }

   @Override
   public bgy b(cbu $$0, bgx $$1) {
      cjf $$2 = $$0.b($$1);
      if ($$2.a(cji.sR) || !this.bv() || this.ge() || this.fC()) {
         return super.b($$0, $$1);
      } else if (this.m_()) {
         this.gz();
         return bgy.a(this.dL().B);
      } else {
         boolean $$3 = this.gf().isEmpty();
         if ($$1 == bgx.a) {
            if ($$3 && !this.dL().B) {
               this.gz();
            }

            $$0.a(apn.S);
         }

         if ($$3) {
            return bgy.a(this.dL().B);
         } else {
            if (!this.dL().B && !this.bU.isEmpty()) {
               this.h($$0);
            }

            return bgy.a(this.dL().B);
         }
      }
   }

   private void gz() {
      this.s(40);
      if (!this.dL().w_()) {
         this.a(apd.yL, this.eV(), this.eW());
      }
   }

   private void h(cbu $$0) {
      this.i($$0);
      this.f($$0);
      this.a($$0, this.N_(), this.go().c());
   }

   @Override
   public void f(@Nullable cbu $$0) {
      boolean $$1 = this.gd() != null && $$0 == null;
      super.f($$0);
      if ($$1) {
         this.gj();
      }
   }

   @Override
   protected void gj() {
      super.gj();
      this.gA();
   }

   private void gA() {
      for (cot $$0 : this.gf()) {
         $$0.l();
      }
   }

   @Override
   public boolean gp() {
      return true;
   }

   @Override
   public boolean gl() {
      return this.dL().B;
   }

   public void gq() {
      this.gF();

      for (cot $$0 : this.gf()) {
         $$0.h();
      }

      this.gB();
      this.ct = this.dL().V();
      this.cu++;
   }

   private void gB() {
      cou $$0 = this.gf();
      cbu $$1 = this.gd();
      if ($$1 != null && !$$0.isEmpty()) {
         $$1.a($$1.bS.j, $$0, this.go().c(), this.t(), this.gg(), this.gp());
      }
   }

   private boolean gC() {
      for (cot $$0 : this.gf()) {
         if ($$0.r()) {
            return true;
         }
      }

      return false;
   }

   private boolean gD() {
      return this.cu == 0 || this.cu < 2 && this.dL().V() > this.ct + 2400L;
   }

   public boolean gr() {
      long $$0 = this.ct + 12000L;
      long $$1 = this.dL().V();
      boolean $$2 = $$1 > $$0;
      long $$3 = this.dL().W();
      if (this.cv > 0L) {
         long $$4 = this.cv / 24000L;
         long $$5 = $$3 / 24000L;
         $$2 |= $$5 > $$4;
      }

      this.cv = $$3;
      if ($$2) {
         this.ct = $$1;
         this.gN();
      }

      return this.gD() && this.gC();
   }

   private void gE() {
      int $$0 = 2 - this.cu;
      if ($$0 > 0) {
         for (cot $$1 : this.gf()) {
            $$1.h();
         }
      }

      for (int $$2 = 0; $$2 < $$0; $$2++) {
         this.gF();
      }

      this.gB();
   }

   private void gF() {
      for (cot $$0 : this.gf()) {
         $$0.e();
      }
   }

   private void i(cbu $$0) {
      int $$1 = this.g($$0);
      if ($$1 != 0) {
         for (cot $$2 : this.gf()) {
            $$2.a(-arw.d((float)$$1 * $$2.n()));
         }
      }

      if ($$0.a(bif.F)) {
         bid $$3 = $$0.b(bif.F);
         int $$4 = $$3.e();

         for (cot $$5 : this.gf()) {
            double $$6 = 0.3 + 0.0625 * (double)$$4;
            int $$7 = (int)Math.floor($$6 * (double)$$5.a().L());
            $$5.a(-Math.max($$7, 1));
         }
      }
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(ca, new cbi(cbm.c, cbk.b, 1));
   }

   @Override
   public void b(qw $$0) {
      super.b($$0);
      cbi.c.encodeStart(ri.a, this.go()).resultOrPartial(bZ::error).ifPresent($$1 -> $$0.a("VillagerData", $$1));
      $$0.a("FoodLevel", (byte)this.co);
      $$0.a("Gossips", this.cp.a(ri.a));
      $$0.a("Xp", this.cs);
      $$0.a("LastRestock", this.ct);
      $$0.a("LastGossipDecay", this.cr);
      $$0.a("RestocksToday", this.cu);
      if (this.cw) {
         $$0.a("AssignProfessionWhenSpawned", true);
      }
   }

   @Override
   public void a(qw $$0) {
      super.a($$0);
      if ($$0.b("VillagerData", 10)) {
         DataResult<cbi> $$1 = cbi.c.parse(new Dynamic(ri.a, $$0.c("VillagerData")));
         $$1.resultOrPartial(bZ::error).ifPresent(this::a);
      }

      if ($$0.b("Offers", 10)) {
         this.bU = new cou($$0.p("Offers"));
      }

      if ($$0.b("FoodLevel", 1)) {
         this.co = $$0.f("FoodLevel");
      }

      rc $$2 = $$0.c("Gossips", 10);
      this.cp.a(new Dynamic(ri.a, $$2));
      if ($$0.b("Xp", 3)) {
         this.cs = $$0.h("Xp");
      }

      this.ct = $$0.i("LastRestock");
      this.cr = $$0.i("LastGossipDecay");
      this.s(true);
      if (this.dL() instanceof akq) {
         this.c((akq)this.dL());
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
   protected apc w() {
      if (this.fC()) {
         return null;
      } else {
         return this.ge() ? apd.yM : apd.yH;
      }
   }

   @Override
   protected apc d(bho $$0) {
      return apd.yK;
   }

   @Override
   protected apc l_() {
      return apd.yJ;
   }

   public void gs() {
      apc $$0 = this.go().b().f();
      if ($$0 != null) {
         this.a($$0, this.eV(), this.eW());
      }
   }

   @Override
   public void a(cbi $$0) {
      cbi $$1 = this.go();
      if ($$1.b() != $$0.b()) {
         this.bU = null;
      }

      this.an.b(ca, $$0);
   }

   @Override
   public cbi go() {
      return this.an.b(ca);
   }

   @Override
   protected void b(cot $$0) {
      int $$1 = 3 + this.ag.a(4);
      this.cs = this.cs + $$0.o();
      this.cm = this.gd();
      if (this.gJ()) {
         this.ck = 40;
         this.cl = true;
         $$1 += 5;
      }

      if ($$0.s()) {
         this.dL().b(new biw(this.dL(), this.dq(), this.ds() + 0.5, this.dw(), $$1));
      }
   }

   public void x(boolean $$0) {
      this.cn = $$0;
   }

   public boolean gt() {
      return this.cn;
   }

   @Override
   public void a(@Nullable bjg $$0) {
      if ($$0 != null && this.dL() instanceof akq) {
         ((akq)this.dL()).a(buc.c, $$0, this);
         if (this.bv() && $$0 instanceof cbu) {
            this.dL().a(this, (byte)13);
         }
      }

      super.a($$0);
   }

   @Override
   public void a(bho $$0) {
      bZ.info("Villager {} died, message: '{}'", this, $$0.a(this).getString());
      biq $$1 = $$0.d();
      if ($$1 != null) {
         this.a($$1);
      }

      this.gG();
      super.a($$0);
   }

   private void gG() {
      this.a(bsh.b);
      this.a(bsh.c);
      this.a(bsh.d);
      this.a(bsh.e);
   }

   private void a(biq $$0) {
      if (this.dL() instanceof akq $$1) {
         Optional<bsj> $$3 = this.bz.c(bsh.h);
         if (!$$3.isEmpty()) {
            $$3.get().b(bjv.class::isInstance).forEach($$2x -> $$1.a(buc.d, $$0, (bjv)$$2x));
         }
      }
   }

   public void a(bsh<hd> $$0) {
      if (this.dL() instanceof akq) {
         MinecraftServer $$1 = ((akq)this.dL()).n();
         this.bz.c($$0).ifPresent($$2 -> {
            akq $$3 = $$1.a($$2.a());
            if ($$3 != null) {
               buf $$4 = $$3.w();
               Optional<he<bui>> $$5 = $$4.c($$2.b());
               BiPredicate<cbh, he<bui>> $$6 = bY.get($$0);
               if ($$5.isPresent() && $$6.test(this, $$5.get())) {
                  $$4.b($$2.b());
                  abb.c($$3, $$2.b());
               }
            }
         });
      }
   }

   @Override
   public boolean V_() {
      return this.co + this.gL() >= 12 && !this.fC() && this.h() == 0;
   }

   private boolean gH() {
      return this.co < 12;
   }

   private void gI() {
      if (this.gH() && this.gL() != 0) {
         for (int $$0 = 0; $$0 < this.y().b(); $$0++) {
            cjf $$1 = this.y().a($$0);
            if (!$$1.b()) {
               Integer $$2 = bW.get($$1.d());
               if ($$2 != null) {
                  int $$3 = $$1.L();

                  for (int $$4 = $$3; $$4 > 0; $$4--) {
                     this.co = this.co + $$2;
                     this.y().a($$0, 1);
                     if (!this.gH()) {
                        return;
                     }
                  }
               }
            }
         }
      }
   }

   public int g(cbu $$0) {
      return this.cp.a($$0.cv(), $$0x -> true);
   }

   private void v(int $$0) {
      this.co -= $$0;
   }

   public void gu() {
      this.gI();
      this.v(12);
   }

   public void b(cou $$0) {
      this.bU = $$0;
   }

   private boolean gJ() {
      int $$0 = this.go().c();
      return cbi.d($$0) && this.cs >= cbi.c($$0);
   }

   private void gK() {
      this.a(this.go().a(this.go().c() + 1));
      this.gk();
   }

   @Override
   protected tl cn() {
      return tl.c(this.ag().g() + "." + jb.A.b(this.go().b()).a());
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 12) {
         this.a(iv.M);
      } else if ($$0 == 13) {
         this.a(iv.b);
      } else if ($$0 == 14) {
         this.a(iv.K);
      } else if ($$0 == 42) {
         this.a(iv.ag);
      } else {
         super.b($$0);
      }
   }

   @Nullable
   @Override
   public bjz a(cqk $$0, bgw $$1, bjk $$2, @Nullable bjz $$3, @Nullable qw $$4) {
      if ($$2 == bjk.e) {
         this.a(this.go().a(cbk.b));
      }

      if ($$2 == bjk.n || $$2 == bjk.m || $$2 == bjk.c || $$2 == bjk.o) {
         this.a(this.go().a(cbm.a($$0.s(this.dl()))));
      }

      if ($$2 == bjk.d) {
         this.cw = true;
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Nullable
   public cbh b(akq $$0, bil $$1) {
      double $$2 = this.ag.j();
      cbm $$3;
      if ($$2 < 0.5) {
         $$3 = cbm.a($$0.s(this.dl()));
      } else if ($$2 < 0.75) {
         $$3 = this.go().a();
      } else {
         $$3 = ((cbh)$$1).go().a();
      }

      cbh $$6 = new cbh(biu.bf, $$0, $$3);
      $$6.a($$0, $$0.d_($$6.dl()), bjk.e, null, null);
      return $$6;
   }

   @Override
   public void a(akq $$0, bjf $$1) {
      if ($$0.ai() != bgv.a) {
         bZ.info("Villager {} was struck by lightning {}.", this, $$1);
         bzy $$2 = biu.bj.a((cpv)$$0);
         if ($$2 != null) {
            $$2.b(this.dq(), this.ds(), this.dw(), this.dB(), this.dD());
            $$2.a($$0, $$0.d_($$2.dl()), bjk.i, null, null);
            $$2.t(this.fT());
            if (this.ac()) {
               $$2.b(this.ad());
               $$2.n(this.cA());
            }

            $$2.fI();
            $$0.a_($$2);
            this.gG();
            this.ak();
         } else {
            super.a($$0, $$1);
         }
      } else {
         super.a($$0, $$1);
      }
   }

   @Override
   protected void b(byn $$0) {
      cbf.a(this, this, $$0);
   }

   @Override
   public boolean k(cjf $$0) {
      cja $$1 = $$0.d();
      return (cc.contains($$1) || this.go().b().d().contains($$1)) && this.y().b($$0);
   }

   public boolean gv() {
      return this.gL() >= 24;
   }

   public boolean gw() {
      return this.gL() < 12;
   }

   private int gL() {
      bhf $$0 = this.y();
      return bW.entrySet().stream().mapToInt($$1 -> $$0.a_($$1.getKey()) * $$1.getValue()).sum();
   }

   public boolean gx() {
      return this.y().a_($$0 -> $$0.a(aqa.aU));
   }

   @Override
   protected void gk() {
      cbi $$0 = this.go();
      Int2ObjectMap<cbl.g[]> $$2;
      if (this.dL().G().b(cee.c)) {
         Int2ObjectMap<cbl.g[]> $$1 = cbl.c.get($$0.b());
         $$2 = $$1 != null ? $$1 : cbl.a.get($$0.b());
      } else {
         $$2 = cbl.a.get($$0.b());
      }

      if ($$2 != null && !$$2.isEmpty()) {
         cbl.g[] $$4 = (cbl.g[])$$2.get($$0.c());
         if ($$4 != null) {
            cou $$5 = this.gf();
            this.a($$5, $$4, 2);
         }
      }
   }

   public void a(akq $$0, cbh $$1, long $$2) {
      if (($$2 < this.cq || $$2 >= this.cq + 1200L) && ($$2 < $$1.cq || $$2 >= $$1.cq + 1200L)) {
         this.cp.a($$1.cp, this.ag, 10);
         this.cq = $$2;
         $$1.cq = $$2;
         this.a($$0, $$2, 5);
      }
   }

   private void gM() {
      long $$0 = this.dL().V();
      if (this.cr == 0L) {
         this.cr = $$0;
      } else if ($$0 >= this.cr + 24000L) {
         this.cp.b();
         this.cr = $$0;
      }
   }

   public void a(akq $$0, long $$1, int $$2) {
      if (this.a($$1)) {
         ehi $$3 = this.cG().c(10.0, 10.0, 10.0);
         List<cbh> $$4 = $$0.a(cbh.class, $$3);
         List<cbh> $$5 = $$4.stream().filter($$1x -> $$1x.a($$1)).limit(5L).collect(Collectors.toList());
         if ($$5.size() >= $$2) {
            if (!asn.a(biu.ac, bjk.f, $$0, this.dl(), 10, 8, 6, asn.a.a).isEmpty()) {
               $$4.forEach(bsy::b);
            }
         }
      }
   }

   public boolean a(long $$0) {
      return !this.b(this.dL().V()) ? false : !this.bz.a(bsh.F);
   }

   @Override
   public void a(buc $$0, biq $$1) {
      if ($$0 == buc.a) {
         this.cp.a($$1.cv(), bse.d, 20);
         this.cp.a($$1.cv(), bse.c, 25);
      } else if ($$0 == buc.e) {
         this.cp.a($$1.cv(), bse.e, 2);
      } else if ($$0 == buc.c) {
         this.cp.a($$1.cv(), bse.b, 25);
      } else if ($$0 == buc.d) {
         this.cp.a($$1.cv(), bse.a, 25);
      }
   }

   @Override
   public int t() {
      return this.cs;
   }

   public void u(int $$0) {
      this.cs = $$0;
   }

   private void gN() {
      this.gE();
      this.cu = 0;
   }

   public bsd gy() {
      return this.cp;
   }

   public void a(rq $$0) {
      this.cp.a(new Dynamic(ri.a, $$0));
   }

   @Override
   protected void W() {
      super.W();
      abb.a(this);
   }

   @Override
   public void b(gw $$0) {
      super.b($$0);
      this.bz.a(bsh.G, this.dL().V());
      this.bz.b(bsh.m);
      this.bz.b(bsh.E);
   }

   @Override
   public void fD() {
      super.fD();
      this.bz.a(bsh.H, this.dL().V());
   }

   private boolean b(long $$0) {
      Optional<Long> $$1 = this.bz.c(bsh.G);
      return $$1.isPresent() ? $$0 - $$1.get() < 24000L : false;
   }
}
