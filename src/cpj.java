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

public class cpj extends cpe implements bwv, cpl {
   private static final Logger cf = LogUtils.getLogger();
   private static final alc<cpk> cg = alg.a(cpj.class, ale.u);
   public static final int cb = 12;
   public static final Map<cxl, Integer> cc = ImmutableMap.of(cxt.pT, 4, cxt.uW, 1, cxt.uV, 1, cxt.wa, 1);
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
   private cpx cq;
   private boolean cr;
   private int cs;
   private final cfg ct = new cfg();
   private long cu;
   private long cv;
   private int cw;
   private long cx;
   private int cy;
   private long cz;
   private boolean cC;
   private static final ImmutableList<cfk<?>> cD = ImmutableList.of(
      cfk.b,
      cfk.c,
      cfk.d,
      cfk.e,
      cfk.g,
      cfk.h,
      cfk.i,
      cfk.j,
      cfk.k,
      cfk.l,
      cfk.L,
      cfk.aP,
      new cfk[]{cfk.m, cfk.n, cfk.q, cfk.r, cfk.t, cfk.v, cfk.w, cfk.x, cfk.y, cfk.A, cfk.f, cfk.C, cfk.D, cfk.E, cfk.H, cfk.I, cfk.J, cfk.F}
   );
   private static final ImmutableList<cgr<? extends cgq<? super cpj>>> cE = ImmutableList.of(cgr.c, cgr.d, cgr.b, cgr.e, cgr.f, cgr.g, cgr.h, cgr.i, cgr.j);
   public static final Map<cfk<jp>, BiPredicate<cpj, jq<chn>>> ce = ImmutableMap.of(
      cfk.b,
      (BiPredicate<cpj, jq>)($$0, $$1) -> $$1.a(cho.n),
      cfk.c,
      (BiPredicate<cpj, jq>)($$0, $$1) -> $$0.gy().b().b().test($$1),
      cfk.d,
      (BiPredicate<cpj, jq>)($$0, $$1) -> cpm.a.test($$1),
      cfk.e,
      (BiPredicate<cpj, jq>)($$0, $$1) -> $$1.a(cho.o)
   );

   public cpj(bvr<? extends cpj> $$0, dhi $$1) {
      this($$0, $$1, cpo.c);
   }

   public cpj(bvr<? extends cpj> $$0, dhi $$1, cpo $$2) {
      super($$0, $$1);
      ((cfr)this.L()).b(true);
      this.L().a(true);
      this.L().a(48.0F);
      this.a_(true);
      this.a(this.gy().a($$2).a(cpm.b));
   }

   @Override
   public bxi<cpj> ec() {
      return (bxi<cpj>)super.ec();
   }

   @Override
   protected bxi.b<cpj> ed() {
      return bxi.a(cD, cE);
   }

   @Override
   protected bxi<?> a(Dynamic<?> $$0) {
      bxi<cpj> $$1 = this.ed().a($$0);
      this.a($$1);
      return $$1;
   }

   public void g(ash $$0) {
      bxi<cpj> $$1 = this.ec();
      $$1.b($$0, this);
      this.bF = $$1.i();
      this.a(this.ec());
   }

   private void a(bxi<cpj> $$0) {
      cpm $$1 = this.gy().b();
      if (this.e_()) {
         $$0.a(crq.e);
         $$0.a(cro.d, cbf.a(0.5F));
      } else {
         $$0.a(crq.f);
         $$0.a(cro.c, cbf.b($$1, 0.5F), ImmutableSet.of(Pair.of(cfk.c, cfl.a)));
      }

      $$0.a(cro.a, cbf.a($$1, 0.5F));
      $$0.a(cro.f, cbf.d($$1, 0.5F), ImmutableSet.of(Pair.of(cfk.e, cfl.a)));
      $$0.a(cro.e, cbf.c($$1, 0.5F));
      $$0.a(cro.b, cbf.e($$1, 0.5F));
      $$0.a(cro.g, cbf.f($$1, 0.5F));
      $$0.a(cro.i, cbf.g($$1, 0.5F));
      $$0.a(cro.h, cbf.h($$1, 0.5F));
      $$0.a(cro.j, cbf.i($$1, 0.5F));
      $$0.a(ImmutableSet.of(cro.a));
      $$0.b(cro.b);
      $$0.a(cro.b);
      $$0.a(this.dW().ad(), this.dW().ac());
   }

   @Override
   protected void i() {
      super.i();
      if (this.dW() instanceof ash) {
         this.g((ash)this.dW());
      }
   }

   public static bxn.a gx() {
      return bwi.C().a(bxo.v, 0.5);
   }

   public boolean gz() {
      return this.cC;
   }

   @Override
   protected void a(ash $$0) {
      bpt $$1 = bps.a();
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

            this.a(new bup(bur.j, 200, 0));
         }
      }

      if (this.cq != null) {
         $$0.a(chh.e, this.cq, this);
         $$0.a(this, (byte)14);
         this.cq = null;
      }

      if (!this.gb() && this.ae.a(100) == 0) {
         crk $$2 = $$0.d(this.dw());
         if ($$2 != null && $$2.u() && !$$2.a()) {
            $$0.a(this, (byte)42);
         }
      }

      if (this.gy().b() == cpm.b && this.gp()) {
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
   public btj b(cpx $$0, bti $$1) {
      cxp $$2 = $$0.b($$1);
      if ($$2.a(cxt.ux) || !this.bL() || this.gp() || this.fR()) {
         return super.b($$0, $$1);
      } else if (this.e_()) {
         this.gJ();
         return btj.a;
      } else {
         if (!this.dW().C) {
            boolean $$3 = this.gq().isEmpty();
            if ($$1 == bti.a) {
               if ($$3) {
                  this.gJ();
               }

               $$0.a(axp.S);
            }

            if ($$3) {
               return btj.c;
            }

            this.g($$0);
         }

         return btj.a;
      }
   }

   private void gJ() {
      this.r(40);
      if (!this.dW().B_()) {
         this.b(axf.Bv);
      }
   }

   private void g(cpx $$0) {
      this.h($$0);
      this.a($$0);
      this.a($$0, this.p_(), this.gy().c());
   }

   @Override
   public void a(@Nullable cpx $$0) {
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
         for (dgf $$0 : this.gq()) {
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

      for (dgf $$0 : this.gq()) {
         $$0.j();
      }

      this.gL();
      this.cx = this.dW().ac();
      this.cy++;
   }

   private void gL() {
      dgg $$0 = this.gq();
      cpx $$1 = this.go();
      if ($$1 != null && !$$0.isEmpty()) {
         $$1.a($$1.cd.l, $$0, this.gy().c(), this.x(), this.gr(), this.gA());
      }
   }

   private boolean gM() {
      for (dgf $$0 : this.gq()) {
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
         for (dgf $$1 : this.gq()) {
            $$1.j();
         }
      }

      for (int $$2 = 0; $$2 < $$0; $$2++) {
         this.gP();
      }

      this.gL();
   }

   private void gP() {
      for (dgf $$0 : this.gq()) {
         $$0.g();
      }
   }

   private void h(cpx $$0) {
      int $$1 = this.f($$0);
      if ($$1 != 0) {
         for (dgf $$2 : this.gq()) {
            $$2.a(-bae.d((float)$$1 * $$2.p()));
         }
      }

      if ($$0.b(bur.F)) {
         bup $$3 = $$0.c(bur.F);
         int $$4 = $$3.e();

         for (dgf $$5 : this.gq()) {
            double $$6 = 0.3 + 0.0625 * (double)$$4;
            int $$7 = (int)Math.floor($$6 * (double)$$5.a().L());
            $$5.a(-Math.max($$7, 1));
         }
      }
   }

   @Override
   protected void a(alg.a $$0) {
      super.a($$0);
      $$0.a(cg, new cpk(cpo.c, cpm.b, 1));
   }

   @Override
   public void b(ux $$0) {
      super.b($$0);
      cpk.c.encodeStart(vl.a, this.gy()).resultOrPartial(cf::error).ifPresent($$1 -> $$0.a("VillagerData", $$1));
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
         cpk.c.parse(vl.a, $$0.c("VillagerData")).resultOrPartial(cf::error).ifPresent($$0x -> this.al.a(cg, $$0x));
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
   protected axe e(bua $$0) {
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
   public void a(cpk $$0) {
      cpk $$1 = this.gy();
      if ($$1.b() != $$0.b()) {
         this.ca = null;
      }

      this.al.a(cg, $$0);
   }

   @Override
   public cpk gy() {
      return this.al.a(cg);
   }

   @Override
   protected void b(dgf $$0) {
      int $$1 = 3 + this.ae.a(4);
      this.cw = this.cw + $$0.q();
      this.cq = this.go();
      if (this.gT()) {
         this.co = 40;
         this.cp = true;
         $$1 += 5;
      }

      if ($$0.u()) {
         this.dW().b(new bvw(this.dW(), this.dB(), this.dD() + 0.5, this.dH(), $$1));
      }
   }

   @Override
   public void a(@Nullable bwg $$0) {
      if ($$0 != null && this.dW() instanceof ash) {
         ((ash)this.dW()).a(chh.c, $$0, this);
         if (this.bL() && $$0 instanceof cpx) {
            this.dW().a(this, (byte)13);
         }
      }

      super.a($$0);
   }

   @Override
   public void a(bua $$0) {
      cf.info("Villager {} died, message: '{}'", this, $$0.a(this).getString());
      bvk $$1 = $$0.d();
      if ($$1 != null) {
         this.b($$1);
      }

      this.gQ();
      super.a($$0);
   }

   private void gQ() {
      this.a(cfk.b);
      this.a(cfk.c);
      this.a(cfk.d);
      this.a(cfk.e);
   }

   private void b(bvk $$0) {
      if (this.dW() instanceof ash $$1) {
         Optional<cfm> $$3 = this.bF.c(cfk.h);
         if (!$$3.isEmpty()) {
            $$3.get().b(bwv.class::isInstance).forEach($$2x -> $$1.a(chh.d, $$0, (bwv)$$2x));
         }
      }
   }

   public void a(cfk<jp> $$0) {
      if (this.dW() instanceof ash) {
         MinecraftServer $$1 = ((ash)this.dW()).p();
         this.bF.c($$0).ifPresent($$2 -> {
            ash $$3 = $$1.a($$2.a());
            if ($$3 != null) {
               chk $$4 = $$3.z();
               Optional<jq<chn>> $$5 = $$4.c($$2.b());
               BiPredicate<cpj, jq<chn>> $$6 = ce.get($$0);
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
            cxp $$1 = this.t().a($$0);
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

   public int f(cpx $$0) {
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
   public void b(dgg $$0) {
      this.ca = $$0;
   }

   private boolean gT() {
      int $$0 = this.gy().c();
      return cpk.d($$0) && this.cw >= cpk.c($$0);
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
   public bwz a(dhz $$0, bth $$1, bvq $$2, @Nullable bwz $$3) {
      if ($$2 == bvq.e) {
         this.a(this.gy().a(cpm.b));
      }

      if ($$2 == bvq.n || $$2 == bvq.m || bvq.a($$2) || $$2 == bvq.o) {
         this.a(this.gy().a(cpo.a($$0.t(this.dw()))));
      }

      if ($$2 == bvq.d) {
         this.cC = true;
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Nullable
   public cpj b(ash $$0, bvb $$1) {
      double $$2 = this.ae.j();
      cpo $$3;
      if ($$2 < 0.5) {
         $$3 = cpo.a($$0.t(this.dw()));
      } else if ($$2 < 0.75) {
         $$3 = this.gy().a();
      } else {
         $$3 = ((cpj)$$1).gy().a();
      }

      cpj $$6 = new cpj(bvr.bD, $$0, $$3);
      $$6.a($$0, $$0.d_($$6.dw()), bvq.e, null);
      return $$6;
   }

   @Override
   public void a(ash $$0, bwf $$1) {
      if ($$0.al() != btg.a) {
         cf.info("Villager {} was struck by lightning {}.", this, $$1);
         cnn $$2 = this.a(bvr.bI, bvf.a(this, false, false), $$1x -> {
            $$1x.a($$0, $$0.d_($$1x.dw()), bvq.i, null);
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
   protected void a(ash $$0, cmb $$1) {
      cph.a($$0, this, this, $$1);
   }

   @Override
   public boolean c(ash $$0, cxp $$1) {
      cxl $$2 = $$1.h();
      return ($$1.a(ayd.bQ) || this.gy().b().d().contains($$2)) && this.t().c($$1);
   }

   public boolean gF() {
      return this.gV() >= 24;
   }

   public boolean gG() {
      return this.gV() < 12;
   }

   private int gV() {
      btq $$0 = this.t();
      return cc.entrySet().stream().mapToInt($$1 -> $$0.a_($$1.getKey()) * $$1.getValue()).sum();
   }

   public boolean gH() {
      return this.t().a_($$0 -> $$0.a(ayd.bP));
   }

   @Override
   protected void gv() {
      cpk $$0 = this.gy();
      Int2ObjectMap<cpn.g[]> $$2;
      if (this.dW().J().b(csv.c)) {
         Int2ObjectMap<cpn.g[]> $$1 = cpn.c.get($$0.b());
         $$2 = $$1 != null ? $$1 : cpn.a.get($$0.b());
      } else {
         $$2 = cpn.a.get($$0.b());
      }

      if ($$2 != null && !$$2.isEmpty()) {
         cpn.g[] $$4 = (cpn.g[])$$2.get($$0.c());
         if ($$4 != null) {
            dgg $$5 = this.gq();
            this.a($$5, $$4, 2);
         }
      }
   }

   public void a(ash $$0, cpj $$1, long $$2) {
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
         fbt $$3 = this.cR().c(10.0, 10.0, 10.0);
         List<cpj> $$4 = $$0.a(cpj.class, $$3);
         List<cpj> $$5 = $$4.stream().filter($$1x -> $$1x.a($$1)).limit(5L).toList();
         if ($$5.size() >= $$2) {
            if (!bax.a(bvr.aq, bvq.f, $$0, this.dw(), 10, 8, 6, bax.a.a).isEmpty()) {
               $$4.forEach(cgc::b);
            }
         }
      }
   }

   public boolean a(long $$0) {
      return !this.b(this.dW().ac()) ? false : !this.bF.a(cfk.F);
   }

   @Override
   public void a(chh $$0, bvk $$1) {
      if ($$0 == chh.a) {
         this.ct.a($$1.cG(), cfh.d, 20);
         this.ct.a($$1.cG(), cfh.c, 25);
      } else if ($$0 == chh.e) {
         this.ct.a($$1.cG(), cfh.e, 2);
      } else if ($$0 == chh.c) {
         this.ct.a($$1.cG(), cfh.b, 25);
      } else if ($$0 == chh.d) {
         this.ct.a($$1.cG(), cfh.a, 25);
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

   public cfg gI() {
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
      this.bF.a(cfk.H, this.dW().ac());
      this.bF.b(cfk.m);
      this.bF.b(cfk.E);
   }

   @Override
   public void fS() {
      super.fS();
      this.bF.a(cfk.I, this.dW().ac());
   }

   private boolean b(long $$0) {
      Optional<Long> $$1 = this.bF.c(cfk.H);
      return $$1.filter($$1x -> $$0 - $$1x < 24000L).isPresent();
   }
}
