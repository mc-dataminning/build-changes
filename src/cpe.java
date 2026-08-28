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

public class cpe extends coz implements bwq, cpg {
   private static final Logger cf = LogUtils.getLogger();
   private static final alc<cpf> cg = alg.a(cpe.class, ale.u);
   public static final int cb = 12;
   public static final Map<cxg, Integer> cc = ImmutableMap.of(cxo.pT, 4, cxo.uW, 1, cxo.uV, 1, cxo.wa, 1);
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
   private cps cq;
   private boolean cr;
   private int cs;
   private final cfb ct = new cfb();
   private long cu;
   private long cv;
   private int cw;
   private long cx;
   private int cy;
   private long cz;
   private boolean cC;
   private static final ImmutableList<cff<?>> cD = ImmutableList.of(
      cff.b,
      cff.c,
      cff.d,
      cff.e,
      cff.g,
      cff.h,
      cff.i,
      cff.j,
      cff.k,
      cff.l,
      cff.L,
      cff.aP,
      new cff[]{cff.m, cff.n, cff.q, cff.r, cff.t, cff.v, cff.w, cff.x, cff.y, cff.A, cff.f, cff.C, cff.D, cff.E, cff.H, cff.I, cff.J, cff.F}
   );
   private static final ImmutableList<cgm<? extends cgl<? super cpe>>> cE = ImmutableList.of(cgm.c, cgm.d, cgm.b, cgm.e, cgm.f, cgm.g, cgm.h, cgm.i, cgm.j);
   public static final Map<cff<jp>, BiPredicate<cpe, jq<chi>>> ce = ImmutableMap.of(
      cff.b,
      (BiPredicate<cpe, jq>)($$0, $$1) -> $$1.a(chj.n),
      cff.c,
      (BiPredicate<cpe, jq>)($$0, $$1) -> $$0.gw().b().b().test($$1),
      cff.d,
      (BiPredicate<cpe, jq>)($$0, $$1) -> cph.a.test($$1),
      cff.e,
      (BiPredicate<cpe, jq>)($$0, $$1) -> $$1.a(chj.o)
   );

   public cpe(bvm<? extends cpe> $$0, dha $$1) {
      this($$0, $$1, cpj.c);
   }

   public cpe(bvm<? extends cpe> $$0, dha $$1, cpj $$2) {
      super($$0, $$1);
      ((cfm)this.L()).b(true);
      this.L().a(true);
      this.L().a(48.0F);
      this.a_(true);
      this.a(this.gw().a($$2).a(cph.b));
   }

   @Override
   public bxd<cpe> eb() {
      return (bxd<cpe>)super.eb();
   }

   @Override
   protected bxd.b<cpe> ec() {
      return bxd.a(cD, cE);
   }

   @Override
   protected bxd<?> a(Dynamic<?> $$0) {
      bxd<cpe> $$1 = this.ec().a($$0);
      this.a($$1);
      return $$1;
   }

   public void g(ash $$0) {
      bxd<cpe> $$1 = this.eb();
      $$1.b($$0, this);
      this.bF = $$1.i();
      this.a(this.eb());
   }

   private void a(bxd<cpe> $$0) {
      cph $$1 = this.gw().b();
      if (this.e_()) {
         $$0.a(crl.e);
         $$0.a(crj.d, cba.a(0.5F));
      } else {
         $$0.a(crl.f);
         $$0.a(crj.c, cba.b($$1, 0.5F), ImmutableSet.of(Pair.of(cff.c, cfg.a)));
      }

      $$0.a(crj.a, cba.a($$1, 0.5F));
      $$0.a(crj.f, cba.d($$1, 0.5F), ImmutableSet.of(Pair.of(cff.e, cfg.a)));
      $$0.a(crj.e, cba.c($$1, 0.5F));
      $$0.a(crj.b, cba.e($$1, 0.5F));
      $$0.a(crj.g, cba.f($$1, 0.5F));
      $$0.a(crj.i, cba.g($$1, 0.5F));
      $$0.a(crj.h, cba.h($$1, 0.5F));
      $$0.a(crj.j, cba.i($$1, 0.5F));
      $$0.a(ImmutableSet.of(crj.a));
      $$0.b(crj.b);
      $$0.a(crj.b);
      $$0.a(this.dV().ad(), this.dV().ac());
   }

   @Override
   protected void i() {
      super.i();
      if (this.dV() instanceof ash) {
         this.g((ash)this.dV());
      }
   }

   public static bxi.a gv() {
      return bwd.C().a(bxj.v, 0.5);
   }

   public boolean gx() {
      return this.cC;
   }

   @Override
   protected void a(ash $$0) {
      bpo $$1 = bpn.a();
      $$1.a("villagerBrain");
      this.eb().a($$0, this);
      $$1.c();
      if (this.cC) {
         this.cC = false;
      }

      if (!this.gn() && this.co > 0) {
         this.co--;
         if (this.co <= 0) {
            if (this.cp) {
               this.gS();
               this.cp = false;
            }

            this.a(new buk(bum.j, 200, 0));
         }
      }

      if (this.cq != null) {
         $$0.a(chc.e, this.cq, this);
         $$0.a(this, (byte)14);
         this.cq = null;
      }

      if (!this.fZ() && this.ae.a(100) == 0) {
         crf $$2 = $$0.d(this.dv());
         if ($$2 != null && $$2.u() && !$$2.a()) {
            $$0.a(this, (byte)42);
         }
      }

      if (this.gw().b() == cph.b && this.gn()) {
         this.gs();
      }

      super.a($$0);
   }

   @Override
   public void h() {
      super.h();
      if (this.p() > 0) {
         this.r(this.p() - 1);
      }

      this.gU();
   }

   @Override
   public bte b(cps $$0, btd $$1) {
      cxk $$2 = $$0.b($$1);
      if ($$2.a(cxo.ux) || !this.bL() || this.gn() || this.fP()) {
         return super.b($$0, $$1);
      } else if (this.e_()) {
         this.gH();
         return bte.a;
      } else {
         if (!this.dV().C) {
            boolean $$3 = this.go().isEmpty();
            if ($$1 == btd.a) {
               if ($$3) {
                  this.gH();
               }

               $$0.a(axp.S);
            }

            if ($$3) {
               return bte.c;
            }

            this.g($$0);
         }

         return bte.a;
      }
   }

   private void gH() {
      this.r(40);
      if (!this.dV().B_()) {
         this.b(axf.Bu);
      }
   }

   private void g(cps $$0) {
      this.h($$0);
      this.a($$0);
      this.a($$0, this.p_(), this.gw().c());
   }

   @Override
   public void a(@Nullable cps $$0) {
      boolean $$1 = this.gm() != null && $$0 == null;
      super.a($$0);
      if ($$1) {
         this.gs();
      }
   }

   @Override
   protected void gs() {
      super.gs();
      this.gI();
   }

   private void gI() {
      if (!this.dV().B_()) {
         for (dfx $$0 : this.go()) {
            $$0.n();
         }
      }
   }

   @Override
   public boolean gy() {
      return true;
   }

   public void gz() {
      this.gN();

      for (dfx $$0 : this.go()) {
         $$0.j();
      }

      this.gJ();
      this.cx = this.dV().ac();
      this.cy++;
   }

   private void gJ() {
      dfy $$0 = this.go();
      cps $$1 = this.gm();
      if ($$1 != null && !$$0.isEmpty()) {
         $$1.a($$1.cd.l, $$0, this.gw().c(), this.x(), this.gp(), this.gy());
      }
   }

   private boolean gK() {
      for (dfx $$0 : this.go()) {
         if ($$0.t()) {
            return true;
         }
      }

      return false;
   }

   private boolean gL() {
      return this.cy == 0 || this.cy < 2 && this.dV().ac() > this.cx + 2400L;
   }

   public boolean gA() {
      long $$0 = this.cx + 12000L;
      long $$1 = this.dV().ac();
      boolean $$2 = $$1 > $$0;
      long $$3 = this.dV().ad();
      if (this.cz > 0L) {
         long $$4 = this.cz / 24000L;
         long $$5 = $$3 / 24000L;
         $$2 |= $$5 > $$4;
      }

      this.cz = $$3;
      if ($$2) {
         this.cx = $$1;
         this.gV();
      }

      return this.gL() && this.gK();
   }

   private void gM() {
      int $$0 = 2 - this.cy;
      if ($$0 > 0) {
         for (dfx $$1 : this.go()) {
            $$1.j();
         }
      }

      for (int $$2 = 0; $$2 < $$0; $$2++) {
         this.gN();
      }

      this.gJ();
   }

   private void gN() {
      for (dfx $$0 : this.go()) {
         $$0.g();
      }
   }

   private void h(cps $$0) {
      int $$1 = this.f($$0);
      if ($$1 != 0) {
         for (dfx $$2 : this.go()) {
            $$2.a(-bae.d((float)$$1 * $$2.p()));
         }
      }

      if ($$0.b(bum.F)) {
         buk $$3 = $$0.c(bum.F);
         int $$4 = $$3.e();

         for (dfx $$5 : this.go()) {
            double $$6 = 0.3 + 0.0625 * (double)$$4;
            int $$7 = (int)Math.floor($$6 * (double)$$5.a().L());
            $$5.a(-Math.max($$7, 1));
         }
      }
   }

   @Override
   protected void a(alg.a $$0) {
      super.a($$0);
      $$0.a(cg, new cpf(cpj.c, cph.b, 1));
   }

   @Override
   public void b(ux $$0) {
      super.b($$0);
      cpf.c.encodeStart(vl.a, this.gw()).resultOrPartial(cf::error).ifPresent($$1 -> $$0.a("VillagerData", $$1));
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
         cpf.c.parse(vl.a, $$0.c("VillagerData")).resultOrPartial(cf::error).ifPresent($$0x -> this.al.a(cg, $$0x));
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
      if (this.dV() instanceof ash) {
         this.g((ash)this.dV());
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
      if (this.fP()) {
         return null;
      } else {
         return this.gn() ? axf.Bv : axf.Bq;
      }
   }

   @Override
   protected axe e(btv $$0) {
      return axf.Bt;
   }

   @Override
   protected axe o_() {
      return axf.Bs;
   }

   public void gB() {
      this.b(this.gw().b().f());
   }

   @Override
   public void a(cpf $$0) {
      cpf $$1 = this.gw();
      if ($$1.b() != $$0.b()) {
         this.ca = null;
      }

      this.al.a(cg, $$0);
   }

   @Override
   public cpf gw() {
      return this.al.a(cg);
   }

   @Override
   protected void b(dfx $$0) {
      int $$1 = 3 + this.ae.a(4);
      this.cw = this.cw + $$0.q();
      this.cq = this.gm();
      if (this.gR()) {
         this.co = 40;
         this.cp = true;
         $$1 += 5;
      }

      if ($$0.u()) {
         this.dV().b(new bvr(this.dV(), this.dA(), this.dC() + 0.5, this.dG(), $$1));
      }
   }

   @Override
   public void a(@Nullable bwb $$0) {
      if ($$0 != null && this.dV() instanceof ash) {
         ((ash)this.dV()).a(chc.c, $$0, this);
         if (this.bL() && $$0 instanceof cps) {
            this.dV().a(this, (byte)13);
         }
      }

      super.a($$0);
   }

   @Override
   public void a(btv $$0) {
      cf.info("Villager {} died, message: '{}'", this, $$0.a(this).getString());
      bvf $$1 = $$0.d();
      if ($$1 != null) {
         this.b($$1);
      }

      this.gO();
      super.a($$0);
   }

   private void gO() {
      this.a(cff.b);
      this.a(cff.c);
      this.a(cff.d);
      this.a(cff.e);
   }

   private void b(bvf $$0) {
      if (this.dV() instanceof ash $$1) {
         Optional<cfh> $$3 = this.bF.c(cff.h);
         if (!$$3.isEmpty()) {
            $$3.get().b(bwq.class::isInstance).forEach($$2x -> $$1.a(chc.d, $$0, (bwq)$$2x));
         }
      }
   }

   public void a(cff<jp> $$0) {
      if (this.dV() instanceof ash) {
         MinecraftServer $$1 = ((ash)this.dV()).p();
         this.bF.c($$0).ifPresent($$2 -> {
            ash $$3 = $$1.a($$2.a());
            if ($$3 != null) {
               chf $$4 = $$3.z();
               Optional<jq<chi>> $$5 = $$4.c($$2.b());
               BiPredicate<cpe, jq<chi>> $$6 = ce.get($$0);
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
      return this.cs + this.gT() >= 12 && !this.fP() && this.Z_() == 0;
   }

   private boolean gP() {
      return this.cs < 12;
   }

   private void gQ() {
      if (this.gP() && this.gT() != 0) {
         for (int $$0 = 0; $$0 < this.t().b(); $$0++) {
            cxk $$1 = this.t().a($$0);
            if (!$$1.f()) {
               Integer $$2 = cc.get($$1.h());
               if ($$2 != null) {
                  int $$3 = $$1.L();

                  for (int $$4 = $$3; $$4 > 0; $$4--) {
                     this.cs = this.cs + $$2;
                     this.t().a($$0, 1);
                     if (!this.gP()) {
                        return;
                     }
                  }
               }
            }
         }
      }
   }

   public int f(cps $$0) {
      return this.ct.a($$0.cG(), $$0x -> true);
   }

   private void u(int $$0) {
      this.cs -= $$0;
   }

   public void gC() {
      this.gQ();
      this.u(12);
   }

   @Override
   public void b(dfy $$0) {
      this.ca = $$0;
   }

   private boolean gR() {
      int $$0 = this.gw().c();
      return cpf.d($$0) && this.cw >= cpf.c($$0);
   }

   private void gS() {
      this.a(this.gw().a(this.gw().c() + 1));
      this.gt();
   }

   @Override
   protected xv cz() {
      return xv.c(this.aq().g() + "." + ma.x.b(this.gw().b()).a());
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
   public bwu a(dhr $$0, btc $$1, bvl $$2, @Nullable bwu $$3) {
      if ($$2 == bvl.e) {
         this.a(this.gw().a(cph.b));
      }

      if ($$2 == bvl.n || $$2 == bvl.m || bvl.a($$2) || $$2 == bvl.o) {
         this.a(this.gw().a(cpj.a($$0.t(this.dv()))));
      }

      if ($$2 == bvl.d) {
         this.cC = true;
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Nullable
   public cpe b(ash $$0, buw $$1) {
      double $$2 = this.ae.j();
      cpj $$3;
      if ($$2 < 0.5) {
         $$3 = cpj.a($$0.t(this.dv()));
      } else if ($$2 < 0.75) {
         $$3 = this.gw().a();
      } else {
         $$3 = ((cpe)$$1).gw().a();
      }

      cpe $$6 = new cpe(bvm.bD, $$0, $$3);
      $$6.a($$0, $$0.d_($$6.dv()), bvl.e, null);
      return $$6;
   }

   @Override
   public void a(ash $$0, bwa $$1) {
      if ($$0.al() != btb.a) {
         cf.info("Villager {} was struck by lightning {}.", this, $$1);
         cni $$2 = this.a(bvm.bI, bva.a(this, false, false), $$1x -> {
            $$1x.a($$0, $$0.d_($$1x.dv()), bvl.i, null);
            $$1x.ai();
            this.gO();
         });
         if ($$2 == null) {
            super.a($$0, $$1);
         }
      } else {
         super.a($$0, $$1);
      }
   }

   @Override
   protected void a(ash $$0, clw $$1) {
      cpc.a($$0, this, this, $$1);
   }

   @Override
   public boolean c(ash $$0, cxk $$1) {
      cxg $$2 = $$1.h();
      return ($$1.a(ayd.bQ) || this.gw().b().d().contains($$2)) && this.t().c($$1);
   }

   public boolean gD() {
      return this.gT() >= 24;
   }

   public boolean gE() {
      return this.gT() < 12;
   }

   private int gT() {
      btl $$0 = this.t();
      return cc.entrySet().stream().mapToInt($$1 -> $$0.a_($$1.getKey()) * $$1.getValue()).sum();
   }

   public boolean gF() {
      return this.t().a_($$0 -> $$0.a(ayd.bP));
   }

   @Override
   protected void gt() {
      cpf $$0 = this.gw();
      Int2ObjectMap<cpi.g[]> $$2;
      if (this.dV().J().b(csq.c)) {
         Int2ObjectMap<cpi.g[]> $$1 = cpi.c.get($$0.b());
         $$2 = $$1 != null ? $$1 : cpi.a.get($$0.b());
      } else {
         $$2 = cpi.a.get($$0.b());
      }

      if ($$2 != null && !$$2.isEmpty()) {
         cpi.g[] $$4 = (cpi.g[])$$2.get($$0.c());
         if ($$4 != null) {
            dfy $$5 = this.go();
            this.a($$5, $$4, 2);
         }
      }
   }

   public void a(ash $$0, cpe $$1, long $$2) {
      if (($$2 < this.cu || $$2 >= this.cu + 1200L) && ($$2 < $$1.cu || $$2 >= $$1.cu + 1200L)) {
         this.ct.a($$1.ct, this.ae, 10);
         this.cu = $$2;
         $$1.cu = $$2;
         this.a($$0, $$2, 5);
      }
   }

   private void gU() {
      long $$0 = this.dV().ac();
      if (this.cv == 0L) {
         this.cv = $$0;
      } else if ($$0 >= this.cv + 24000L) {
         this.ct.b();
         this.cv = $$0;
      }
   }

   public void a(ash $$0, long $$1, int $$2) {
      if (this.a($$1)) {
         fbn $$3 = this.cR().c(10.0, 10.0, 10.0);
         List<cpe> $$4 = $$0.a(cpe.class, $$3);
         List<cpe> $$5 = $$4.stream().filter($$1x -> $$1x.a($$1)).limit(5L).toList();
         if ($$5.size() >= $$2) {
            if (!bax.a(bvm.aq, bvl.f, $$0, this.dv(), 10, 8, 6, bax.a.a).isEmpty()) {
               $$4.forEach(cfx::b);
            }
         }
      }
   }

   public boolean a(long $$0) {
      return !this.b(this.dV().ac()) ? false : !this.bF.a(cff.F);
   }

   @Override
   public void a(chc $$0, bvf $$1) {
      if ($$0 == chc.a) {
         this.ct.a($$1.cG(), cfc.d, 20);
         this.ct.a($$1.cG(), cfc.c, 25);
      } else if ($$0 == chc.e) {
         this.ct.a($$1.cG(), cfc.e, 2);
      } else if ($$0 == chc.c) {
         this.ct.a($$1.cG(), cfc.b, 25);
      } else if ($$0 == chc.d) {
         this.ct.a($$1.cG(), cfc.a, 25);
      }
   }

   @Override
   public int x() {
      return this.cw;
   }

   public void t(int $$0) {
      this.cw = $$0;
   }

   private void gV() {
      this.gM();
      this.cy = 0;
   }

   public cfb gG() {
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
      this.bF.a(cff.H, this.dV().ac());
      this.bF.b(cff.m);
      this.bF.b(cff.E);
   }

   @Override
   public void fQ() {
      super.fQ();
      this.bF.a(cff.I, this.dV().ac());
   }

   private boolean b(long $$0) {
      Optional<Long> $$1 = this.bF.c(cff.H);
      return $$1.filter($$1x -> $$0 - $$1x < 24000L).isPresent();
   }
}
