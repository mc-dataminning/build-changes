import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiPredicate;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class cpi extends cpd implements bwu, cpk {
   private static final Logger cf = LogUtils.getLogger();
   private static final alc<cpj> cg = alg.a(cpi.class, ale.u);
   public static final int cb = 12;
   public static final Map<cxk, Integer> cc = ImmutableMap.of(cxs.pT, 4, cxs.uW, 1, cxs.uV, 1, cxs.wa, 1);
   private static final int ch = 2;
   private static final int ci = 10;
   private static final int cj = 1200;
   private static final int ck = 24000;
   private static final int cl = 10;
   private static final int cm = 5;
   private static final long cn = 24000L;
   @VisibleForTesting
   public static final float cd = 0.5F;
   private int co;
   private boolean cp;
   @Nullable
   private cpw cq;
   private boolean cr;
   private int cs;
   private final cff ct = new cff();
   private long cu;
   private long cv;
   private int cw;
   private long cx;
   private int cy;
   private long cz;
   private boolean cC;
   private static final ImmutableList<cfj<?>> cD = ImmutableList.of(
      cfj.b,
      cfj.c,
      cfj.d,
      cfj.e,
      cfj.g,
      cfj.h,
      cfj.i,
      cfj.j,
      cfj.k,
      cfj.l,
      cfj.L,
      cfj.aP,
      new cfj[]{cfj.m, cfj.n, cfj.q, cfj.r, cfj.t, cfj.v, cfj.w, cfj.x, cfj.y, cfj.A, cfj.f, cfj.C, cfj.D, cfj.E, cfj.H, cfj.I, cfj.J, cfj.F}
   );
   private static final ImmutableList<cgq<? extends cgp<? super cpi>>> cE = ImmutableList.of(cgq.c, cgq.d, cgq.b, cgq.e, cgq.f, cgq.g, cgq.h, cgq.i, cgq.j);
   public static final Map<cfj<jp>, BiPredicate<cpi, jq<chm>>> ce = ImmutableMap.of(
      cfj.b,
      (BiPredicate<cpi, jq>)($$0, $$1) -> $$1.a(chn.n),
      cfj.c,
      (BiPredicate<cpi, jq>)($$0, $$1) -> $$0.gy().b().b().test($$1),
      cfj.d,
      (BiPredicate<cpi, jq>)($$0, $$1) -> cpl.a.test($$1),
      cfj.e,
      (BiPredicate<cpi, jq>)($$0, $$1) -> $$1.a(chn.o)
   );

   public cpi(bvq<? extends cpi> $$0, dhh $$1) {
      this($$0, $$1, cpn.c);
   }

   public cpi(bvq<? extends cpi> $$0, dhh $$1, cpn $$2) {
      super($$0, $$1);
      ((cfq)this.L()).b(true);
      this.L().a(true);
      this.L().a(48.0F);
      this.a_(true);
      this.a(this.gy().a($$2).a(cpl.b));
   }

   @Override
   public bxh<cpi> ec() {
      return (bxh<cpi>)super.ec();
   }

   @Override
   protected bxh.b<cpi> ed() {
      return bxh.a(cD, cE);
   }

   @Override
   protected bxh<?> a(Dynamic<?> $$0) {
      bxh<cpi> $$1 = this.ed().a($$0);
      this.a($$1);
      return $$1;
   }

   public void g(ash $$0) {
      bxh<cpi> $$1 = this.ec();
      $$1.b($$0, this);
      this.bF = $$1.i();
      this.a(this.ec());
   }

   private void a(bxh<cpi> $$0) {
      cpl $$1 = this.gy().b();
      if (this.e_()) {
         $$0.a(crp.e);
         $$0.a(crn.d, cbe.a(0.5F));
      } else {
         $$0.a(crp.f);
         $$0.a(crn.c, cbe.b($$1, 0.5F), ImmutableSet.of(Pair.of(cfj.c, cfk.a)));
      }

      $$0.a(crn.a, cbe.a($$1, 0.5F));
      $$0.a(crn.f, cbe.d($$1, 0.5F), ImmutableSet.of(Pair.of(cfj.e, cfk.a)));
      $$0.a(crn.e, cbe.c($$1, 0.5F));
      $$0.a(crn.b, cbe.e($$1, 0.5F));
      $$0.a(crn.g, cbe.f($$1, 0.5F));
      $$0.a(crn.i, cbe.g($$1, 0.5F));
      $$0.a(crn.h, cbe.h($$1, 0.5F));
      $$0.a(crn.j, cbe.i($$1, 0.5F));
      $$0.a(ImmutableSet.of(crn.a));
      $$0.b(crn.b);
      $$0.a(crn.b);
      $$0.a(this.dW().ad(), this.dW().ac());
   }

   @Override
   protected void i() {
      super.i();
      if (this.dW() instanceof ash) {
         this.g((ash)this.dW());
      }
   }

   public static bxm.a gx() {
      return bwh.C().a(bxn.v, 0.5);
   }

   public boolean gz() {
      return this.cC;
   }

   @Override
   protected void a(ash $$0) {
      bps $$1 = bpr.a();
      $$1.a("villagerBrain");
      this.ec().a($$0, this);
      $$1.c();
      if (this.cC) {
         this.cC = false;
      }

      if (!this.gp() && this.co > 0) {
         this.co--;
         if (this.co <= 0) {
            if (this.cp) {
               this.gU();
               this.cp = false;
            }

            this.a(new buo(buq.j, 200, 0));
         }
      }

      if (this.cq != null) {
         $$0.a(chg.e, this.cq, this);
         $$0.a(this, (byte)14);
         this.cq = null;
      }

      if (!this.gb() && this.ae.a(100) == 0) {
         crj $$2 = $$0.d(this.dw());
         if ($$2 != null && $$2.u() && !$$2.a()) {
            $$0.a(this, (byte)42);
         }
      }

      if (this.gy().b() == cpl.b && this.gp()) {
         this.gu();
      }

      super.a($$0);
   }

   @Override
   public void h() {
      super.h();
      if (this.p() > 0) {
         this.r(this.p() - 1);
      }

      this.gW();
   }

   @Override
   public bti b(cpw $$0, bth $$1) {
      cxo $$2 = $$0.b($$1);
      if ($$2.a(cxs.ux) || !this.bL() || this.gp() || this.fR()) {
         return super.b($$0, $$1);
      } else if (this.e_()) {
         this.gJ();
         return bti.a;
      } else {
         if (!this.dW().C) {
            boolean $$3 = this.gq().isEmpty();
            if ($$1 == bth.a) {
               if ($$3) {
                  this.gJ();
               }

               $$0.a(axp.S);
            }

            if ($$3) {
               return bti.c;
            }

            this.g($$0);
         }

         return bti.a;
      }
   }

   private void gJ() {
      this.r(40);
      if (!this.dW().B_()) {
         this.b(axf.Bv);
      }
   }

   private void g(cpw $$0) {
      this.h($$0);
      this.a($$0);
      this.a($$0, this.p_(), this.gy().c());
   }

   @Override
   public void a(@Nullable cpw $$0) {
      boolean $$1 = this.go() != null && $$0 == null;
      super.a($$0);
      if ($$1) {
         this.gu();
      }
   }

   @Override
   protected void gu() {
      super.gu();
      this.gK();
   }

   private void gK() {
      if (!this.dW().B_()) {
         for (dge $$0 : this.gq()) {
            $$0.n();
         }
      }
   }

   @Override
   public boolean gA() {
      return true;
   }

   public void gB() {
      this.gP();

      for (dge $$0 : this.gq()) {
         $$0.j();
      }

      this.gL();
      this.cx = this.dW().ac();
      this.cy++;
   }

   private void gL() {
      dgf $$0 = this.gq();
      cpw $$1 = this.go();
      if ($$1 != null && !$$0.isEmpty()) {
         $$1.a($$1.cd.l, $$0, this.gy().c(), this.x(), this.gr(), this.gA());
      }
   }

   private boolean gM() {
      for (dge $$0 : this.gq()) {
         if ($$0.t()) {
            return true;
         }
      }

      return false;
   }

   private boolean gN() {
      return this.cy == 0 || this.cy < 2 && this.dW().ac() > this.cx + 2400L;
   }

   public boolean gC() {
      long $$0 = this.cx + 12000L;
      long $$1 = this.dW().ac();
      boolean $$2 = $$1 > $$0;
      long $$3 = this.dW().ad();
      if (this.cz > 0L) {
         long $$4 = this.cz / 24000L;
         long $$5 = $$3 / 24000L;
         $$2 |= $$5 > $$4;
      }

      this.cz = $$3;
      if ($$2) {
         this.cx = $$1;
         this.gX();
      }

      return this.gN() && this.gM();
   }

   private void gO() {
      int $$0 = 2 - this.cy;
      if ($$0 > 0) {
         for (dge $$1 : this.gq()) {
            $$1.j();
         }
      }

      for (int $$2 = 0; $$2 < $$0; $$2++) {
         this.gP();
      }

      this.gL();
   }

   private void gP() {
      for (dge $$0 : this.gq()) {
         $$0.g();
      }
   }

   private void h(cpw $$0) {
      int $$1 = this.f($$0);
      if ($$1 != 0) {
         for (dge $$2 : this.gq()) {
            $$2.a(-bae.d((float)$$1 * $$2.p()));
         }
      }

      if ($$0.b(buq.F)) {
         buo $$3 = $$0.c(buq.F);
         int $$4 = $$3.e();

         for (dge $$5 : this.gq()) {
            double $$6 = 0.3 + 0.0625 * (double)$$4;
            int $$7 = (int)Math.floor($$6 * (double)$$5.a().L());
            $$5.a(-Math.max($$7, 1));
         }
      }
   }

   @Override
   protected void a(alg.a $$0) {
      super.a($$0);
      $$0.a(cg, new cpj(cpn.c, cpl.b, 1));
   }

   @Override
   public void b(ux $$0) {
      super.b($$0);
      cpj.c.encodeStart(vl.a, this.gy()).resultOrPartial(cf::error).ifPresent($$1 -> $$0.a("VillagerData", $$1));
      $$0.a("FoodLevel", (byte)this.cs);
      $$0.a("Gossips", this.ct.a(vl.a));
      $$0.a("Xp", this.cw);
      $$0.a("LastRestock", this.cx);
      $$0.a("LastGossipDecay", this.cv);
      $$0.a("RestocksToday", this.cy);
      if (this.cC) {
         $$0.a("AssignProfessionWhenSpawned", true);
      }
   }

   @Override
   public void a(ux $$0) {
      super.a($$0);
      if ($$0.b("VillagerData", 10)) {
         cpj.c.parse(vl.a, $$0.c("VillagerData")).resultOrPartial(cf::error).ifPresent($$0x -> this.al.a(cg, $$0x));
      }

      if ($$0.b("FoodLevel", 1)) {
         this.cs = $$0.f("FoodLevel");
      }

      vd $$1 = $$0.c("Gossips", 10);
      this.ct.a(new Dynamic(vl.a, $$1));
      if ($$0.b("Xp", 3)) {
         this.cw = $$0.h("Xp");
      }

      this.cx = $$0.i("LastRestock");
      this.cv = $$0.i("LastGossipDecay");
      if (this.dW() instanceof ash) {
         this.g((ash)this.dW());
      }

      this.cy = $$0.h("RestocksToday");
      if ($$0.e("AssignProfessionWhenSpawned")) {
         this.cC = $$0.q("AssignProfessionWhenSpawned");
      }
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Nullable
   @Override
   protected axe u() {
      if (this.fR()) {
         return null;
      } else {
         return this.gp() ? axf.Bw : axf.Br;
      }
   }

   @Override
   protected axe e(btz $$0) {
      return axf.Bu;
   }

   @Override
   protected axe o_() {
      return axf.Bt;
   }

   public void gD() {
      this.b(this.gy().b().f());
   }

   @Override
   public void a(cpj $$0) {
      cpj $$1 = this.gy();
      if ($$1.b() != $$0.b()) {
         this.ca = null;
      }

      this.al.a(cg, $$0);
   }

   @Override
   public cpj gy() {
      return this.al.a(cg);
   }

   @Override
   protected void b(dge $$0) {
      int $$1 = 3 + this.ae.a(4);
      this.cw = this.cw + $$0.q();
      this.cq = this.go();
      if (this.gT()) {
         this.co = 40;
         this.cp = true;
         $$1 += 5;
      }

      if ($$0.u()) {
         this.dW().b(new bvv(this.dW(), this.dB(), this.dD() + 0.5, this.dH(), $$1));
      }
   }

   @Override
   public void a(@Nullable bwf $$0) {
      if ($$0 != null && this.dW() instanceof ash) {
         ((ash)this.dW()).a(chg.c, $$0, this);
         if (this.bL() && $$0 instanceof cpw) {
            this.dW().a(this, (byte)13);
         }
      }

      super.a($$0);
   }

   @Override
   public void a(btz $$0) {
      cf.info("Villager {} died, message: '{}'", this, $$0.a(this).getString());
      bvj $$1 = $$0.d();
      if ($$1 != null) {
         this.b($$1);
      }

      this.gQ();
      super.a($$0);
   }

   private void gQ() {
      this.a(cfj.b);
      this.a(cfj.c);
      this.a(cfj.d);
      this.a(cfj.e);
   }

   private void b(bvj $$0) {
      if (this.dW() instanceof ash $$1) {
         Optional<cfl> $$3 = this.bF.c(cfj.h);
         if (!$$3.isEmpty()) {
            $$3.get().b(bwu.class::isInstance).forEach($$2x -> $$1.a(chg.d, $$0, (bwu)$$2x));
         }
      }
   }

   public void a(cfj<jp> $$0) {
      if (this.dW() instanceof ash) {
         MinecraftServer $$1 = ((ash)this.dW()).p();
         this.bF.c($$0).ifPresent($$2 -> {
            ash $$3 = $$1.a($$2.a());
            if ($$3 != null) {
               chj $$4 = $$3.z();
               Optional<jq<chm>> $$5 = $$4.c($$2.b());
               BiPredicate<cpi, jq<chm>> $$6 = ce.get($$0);
               if ($$5.isPresent() && $$6.test(this, $$5.get())) {
                  $$4.b($$2.b());
                  ahj.c($$3, $$2.b());
               }
            }
         });
      }
   }

   @Override
   public boolean Y_() {
      return this.cs + this.gV() >= 12 && !this.fR() && this.Z_() == 0;
   }

   private boolean gR() {
      return this.cs < 12;
   }

   private void gS() {
      if (this.gR() && this.gV() != 0) {
         for (int $$0 = 0; $$0 < this.t().b(); $$0++) {
            cxo $$1 = this.t().a($$0);
            if (!$$1.f()) {
               Integer $$2 = cc.get($$1.h());
               if ($$2 != null) {
                  int $$3 = $$1.L();

                  for (int $$4 = $$3; $$4 > 0; $$4--) {
                     this.cs = this.cs + $$2;
                     this.t().a($$0, 1);
                     if (!this.gR()) {
                        return;
                     }
                  }
               }
            }
         }
      }
   }

   public int f(cpw $$0) {
      return this.ct.a($$0.cG(), $$0x -> true);
   }

   private void u(int $$0) {
      this.cs -= $$0;
   }

   public void gE() {
      this.gS();
      this.u(12);
   }

   @Override
   public void b(dgf $$0) {
      this.ca = $$0;
   }

   private boolean gT() {
      int $$0 = this.gy().c();
      return cpj.d($$0) && this.cw >= cpj.c($$0);
   }

   private void gU() {
      this.a(this.gy().a(this.gy().c() + 1));
      this.gv();
   }

   @Override
   protected xv cz() {
      return xv.c(this.aq().g() + "." + ma.x.b(this.gy().b()).a());
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 12) {
         this.a(ls.Q);
      } else if ($$0 == 13) {
         this.a(ls.a);
      } else if ($$0 == 14) {
         this.a(ls.O);
      } else if ($$0 == 42) {
         this.a(ls.an);
      } else {
         super.b($$0);
      }
   }

   @Nullable
   @Override
   public bwy a(dhy $$0, btg $$1, bvp $$2, @Nullable bwy $$3) {
      if ($$2 == bvp.e) {
         this.a(this.gy().a(cpl.b));
      }

      if ($$2 == bvp.n || $$2 == bvp.m || bvp.a($$2) || $$2 == bvp.o) {
         this.a(this.gy().a(cpn.a($$0.t(this.dw()))));
      }

      if ($$2 == bvp.d) {
         this.cC = true;
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Nullable
   public cpi b(ash $$0, bva $$1) {
      double $$2 = this.ae.j();
      cpn $$3;
      if ($$2 < 0.5) {
         $$3 = cpn.a($$0.t(this.dw()));
      } else if ($$2 < 0.75) {
         $$3 = this.gy().a();
      } else {
         $$3 = ((cpi)$$1).gy().a();
      }

      cpi $$6 = new cpi(bvq.bD, $$0, $$3);
      $$6.a($$0, $$0.d_($$6.dw()), bvp.e, null);
      return $$6;
   }

   @Override
   public void a(ash $$0, bwe $$1) {
      if ($$0.al() != btf.a) {
         cf.info("Villager {} was struck by lightning {}.", this, $$1);
         cnm $$2 = this.a(bvq.bI, bve.a(this, false, false), $$1x -> {
            $$1x.a($$0, $$0.d_($$1x.dw()), bvp.i, null);
            $$1x.ai();
            this.gQ();
         });
         if ($$2 == null) {
            super.a($$0, $$1);
         }
      } else {
         super.a($$0, $$1);
      }
   }

   @Override
   protected void a(ash $$0, cma $$1) {
      cpg.a($$0, this, this, $$1);
   }

   @Override
   public boolean c(ash $$0, cxo $$1) {
      cxk $$2 = $$1.h();
      return ($$1.a(ayd.bQ) || this.gy().b().d().contains($$2)) && this.t().c($$1);
   }

   public boolean gF() {
      return this.gV() >= 24;
   }

   public boolean gG() {
      return this.gV() < 12;
   }

   private int gV() {
      btp $$0 = this.t();
      return cc.entrySet().stream().mapToInt($$1 -> $$0.a_($$1.getKey()) * $$1.getValue()).sum();
   }

   public boolean gH() {
      return this.t().a_($$0 -> $$0.a(ayd.bP));
   }

   @Override
   protected void gv() {
      cpj $$0 = this.gy();
      Int2ObjectMap<cpm.g[]> $$2;
      if (this.dW().J().b(csu.c)) {
         Int2ObjectMap<cpm.g[]> $$1 = cpm.c.get($$0.b());
         $$2 = $$1 != null ? $$1 : cpm.a.get($$0.b());
      } else {
         $$2 = cpm.a.get($$0.b());
      }

      if ($$2 != null && !$$2.isEmpty()) {
         cpm.g[] $$4 = (cpm.g[])$$2.get($$0.c());
         if ($$4 != null) {
            dgf $$5 = this.gq();
            this.a($$5, $$4, 2);
         }
      }
   }

   public void a(ash $$0, cpi $$1, long $$2) {
      if (($$2 < this.cu || $$2 >= this.cu + 1200L) && ($$2 < $$1.cu || $$2 >= $$1.cu + 1200L)) {
         this.ct.a($$1.ct, this.ae, 10);
         this.cu = $$2;
         $$1.cu = $$2;
         this.a($$0, $$2, 5);
      }
   }

   private void gW() {
      long $$0 = this.dW().ac();
      if (this.cv == 0L) {
         this.cv = $$0;
      } else if ($$0 >= this.cv + 24000L) {
         this.ct.b();
         this.cv = $$0;
      }
   }

   public void a(ash $$0, long $$1, int $$2) {
      if (this.a($$1)) {
         fbs $$3 = this.cR().c(10.0, 10.0, 10.0);
         List<cpi> $$4 = $$0.a(cpi.class, $$3);
         List<cpi> $$5 = $$4.stream().filter($$1x -> $$1x.a($$1)).limit(5L).toList();
         if ($$5.size() >= $$2) {
            if (!bax.a(bvq.aq, bvp.f, $$0, this.dw(), 10, 8, 6, bax.a.a).isEmpty()) {
               $$4.forEach(cgb::b);
            }
         }
      }
   }

   public boolean a(long $$0) {
      return !this.b(this.dW().ac()) ? false : !this.bF.a(cfj.F);
   }

   @Override
   public void a(chg $$0, bvj $$1) {
      if ($$0 == chg.a) {
         this.ct.a($$1.cG(), cfg.d, 20);
         this.ct.a($$1.cG(), cfg.c, 25);
      } else if ($$0 == chg.e) {
         this.ct.a($$1.cG(), cfg.e, 2);
      } else if ($$0 == chg.c) {
         this.ct.a($$1.cG(), cfg.b, 25);
      } else if ($$0 == chg.d) {
         this.ct.a($$1.cG(), cfg.a, 25);
      }
   }

   @Override
   public int x() {
      return this.cw;
   }

   public void t(int $$0) {
      this.cw = $$0;
   }

   private void gX() {
      this.gO();
      this.cy = 0;
   }

   public cff gI() {
      return this.ct;
   }

   public void a(vu $$0) {
      this.ct.a(new Dynamic(vl.a, $$0));
   }

   @Override
   protected void Y() {
      super.Y();
      ahj.a(this);
   }

   @Override
   public void b(jh $$0) {
      super.b($$0);
      this.bF.a(cfj.H, this.dW().ac());
      this.bF.b(cfj.m);
      this.bF.b(cfj.E);
   }

   @Override
   public void fS() {
      super.fS();
      this.bF.a(cfj.I, this.dW().ac());
   }

   private boolean b(long $$0) {
      Optional<Long> $$1 = this.bF.c(cfj.H);
      return $$1.filter($$1x -> $$0 - $$1x < 24000L).isPresent();
   }
}
