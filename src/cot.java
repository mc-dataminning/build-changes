import com.google.common.annotations.VisibleForTesting;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cot extends cnz {
   private static final alg a = alg.b("baby");
   private static final byg b = new byg(a, 0.5, byg.a.b);
   private static final alg c = alg.b("reinforcement_caller_charge");
   private static final byg bI = new byg(alg.b("reinforcement_callee_charge"), -0.05F, byg.a.a);
   private static final alg bJ = alg.b("leader_zombie_bonus");
   private static final alg bK = alg.b("zombie_random_spawn_bonus");
   private static final akj<Boolean> bL = akn.a(cot.class, akl.k);
   private static final akj<Integer> bM = akn.a(cot.class, akl.b);
   private static final akj<Boolean> bN = akn.a(cot.class, akl.k);
   public static final float d = 0.05F;
   public static final int bF = 50;
   public static final int bG = 40;
   public static final int bH = 7;
   private static final bwg bO = bwm.bO.n().a(0.5F).b(0.93F);
   private static final float bP = 0.1F;
   private static final Predicate<bty> bQ = $$0 -> $$0 == bty.d;
   private final cdi bR = new cdi(this, bQ);
   private boolean bS;
   private int bT;
   private int bU;

   public cot(bwm<? extends cot> $$0, div $$1) {
      super($$0, $$1);
   }

   public cot(div $$0) {
      this(bwm.bO, $$0);
   }

   @Override
   protected void D() {
      this.bC.a(4, new cot.a(this, 1.0, 3));
      this.bC.a(8, new ceg(this, cqy.class, 8.0F));
      this.bC.a(8, new cet(this));
      this.m();
   }

   protected void m() {
      this.bC.a(2, new cfn(this, 1.0, false));
      this.bC.a(6, new cek(this, 1.0, true, 4, this::gv));
      this.bC.a(7, new cfl(this, 1.0));
      this.bD.a(1, new cfq(this).a(cov.class));
      this.bD.a(2, new cfr<>(this, cqy.class, true));
      this.bD.a(3, new cfr<>(this, cqf.class, false));
      this.bD.a(3, new cfr<>(this, cjg.class, true));
      this.bD.a(5, new cfr<>(this, cjy.class, 10, true, false, cjy.bF));
   }

   public static byh.a gr() {
      return cnz.gt().a(byi.m, 35.0).a(byi.v, 0.23F).a(byi.c, 3.0).a(byi.a, 2.0).a(byi.A);
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(bL, false);
      $$0.a(bM, 0);
      $$0.a(bN, false);
   }

   public boolean gu() {
      return this.au().a(bN);
   }

   public boolean gv() {
      return this.bS;
   }

   public void x(boolean $$0) {
      if (chw.a(this)) {
         if (this.bS != $$0) {
            this.bS = $$0;
            ((cgl)this.O()).b($$0);
            if ($$0) {
               this.bC.a(1, this.bR);
            } else {
               this.bC.a(this.bR);
            }
         }
      } else if (this.bS) {
         this.bC.a(this.bR);
         this.bS = false;
      }
   }

   @Override
   public boolean n_() {
      return this.au().a(bL);
   }

   @Override
   protected int e(arq $$0) {
      if (this.n_()) {
         this.bx = (int)((double)this.bx * 2.5);
      }

      return super.e($$0);
   }

   @Override
   public void a(boolean $$0) {
      this.au().a(bL, $$0);
      if (this.dV() != null && !this.dV().C) {
         bye $$1 = this.g(byi.v);
         $$1.c(a);
         if ($$0) {
            $$1.b(b);
         }
      }
   }

   @Override
   public void a(akj<?> $$0) {
      if (bL.equals($$0)) {
         this.i_();
      }

      super.a($$0);
   }

   protected boolean x() {
      return true;
   }

   @Override
   public void h() {
      if (!this.dV().C && this.bK() && !this.gf()) {
         if (this.gu()) {
            this.bU--;
            if (this.bU < 0) {
               this.ab_();
            }
         } else if (this.x()) {
            if (this.a(axh.a)) {
               this.bT++;
               if (this.bT >= 600) {
                  this.r(300);
               }
            } else {
               this.bT = -1;
            }
         }
      }

      super.h();
   }

   @Override
   public void k_() {
      if (this.bK()) {
         boolean $$0 = this.ac_() && this.gk();
         if ($$0) {
            cyy $$1 = this.a(bwn.f);
            if (!$$1.f()) {
               if ($$1.m()) {
                  cyu $$2 = $$1.h();
                  $$1.b($$1.o() + this.ae.a(2));
                  if ($$1.o() >= $$1.p()) {
                     this.a($$2, bwn.f);
                     this.a(bwn.f, cyy.k);
                  }
               }

               $$0 = false;
            }

            if ($$0) {
               this.e(8.0F);
            }
         }
      }

      super.k_();
   }

   private void r(int $$0) {
      this.bU = $$0;
      this.au().a(bN, true);
   }

   protected void ab_() {
      this.b(bwm.K);
      if (!this.bb()) {
         this.dV().a(null, 1040, this.dv(), 0);
      }
   }

   protected void b(bwm<? extends cot> $$0) {
      this.a($$0, bvx.a(this, true, true), $$0x -> $$0x.J($$0x.dV().d_($$0x.dv()).d()));
   }

   @VisibleForTesting
   public boolean a(arq $$0, cqk $$1) {
      cou $$2 = $$1.a(bwm.bQ, bvx.a($$1, true, true), $$2x -> {
         $$2x.a($$0, $$0.d_($$2x.dv()), bwl.i, new cot.b(false, true));
         $$2x.a($$1.gy());
         $$2x.a($$1.gK().a(un.a));
         $$2x.a($$1.gr().a());
         $$2x.s($$1.t());
         if (!this.bb()) {
            $$0.a(null, 1026, this.dv(), 0);
         }
      });
      return $$2 != null;
   }

   protected boolean ac_() {
      return true;
   }

   @Override
   public boolean a(arq $$0, bus $$1, float $$2) {
      if (!super.a($$0, $$1, $$2)) {
         return false;
      } else {
         bxc $$3 = this.f();
         if ($$3 == null && $$1.d() instanceof bxc) {
            $$3 = (bxc)$$1.d();
         }

         if ($$3 != null && $$0.an() == bty.d && (double)this.ae.i() < this.h(byi.A) && $$0.O().c(dir.e)) {
            int $$4 = azm.a(this.dA());
            int $$5 = azm.a(this.dC());
            int $$6 = azm.a(this.dG());
            bwm<? extends cot> $$7 = this.aq();
            cot $$8 = $$7.a($$0, bwl.j);
            if ($$8 == null) {
               return true;
            }

            for (int $$9 = 0; $$9 < 50; $$9++) {
               int $$10 = $$4 + azm.a(this.ae, 7, 40) * azm.a(this.ae, -1, 1);
               int $$11 = $$5 + azm.a(this.ae, 7, 40) * azm.a(this.ae, -1, 1);
               int $$12 = $$6 + azm.a(this.ae, 7, 40) * azm.a(this.ae, -1, 1);
               iu $$13 = new iu($$10, $$11, $$12);
               if (bxx.a($$7, $$0, $$13) && bxx.a($$7, $$0, bwl.j, $$13, $$0.A)) {
                  $$8.a_((double)$$10, (double)$$11, (double)$$12);
                  if (!$$0.a((double)$$10, (double)$$11, (double)$$12, 7.0) && $$0.f($$8) && $$0.g($$8) && ($$8.q() || !$$0.d($$8.cR()))) {
                     $$8.g($$3);
                     $$8.a($$0, $$0.d_($$8.dv()), bwl.j, null);
                     $$0.a_($$8);
                     bye $$14 = this.g(byi.A);
                     byg $$15 = $$14.a(c);
                     double $$16 = $$15 != null ? $$15.b() : 0.0;
                     $$14.c(c);
                     $$14.d(new byg(c, $$16 - 0.05, byg.a.a));
                     $$8.g(byi.A).d(bI);
                     break;
                  }
               }
            }
         }

         return true;
      }
   }

   @Override
   public boolean c(arq $$0, bwd $$1) {
      boolean $$2 = super.c($$0, $$1);
      if ($$2) {
         float $$3 = this.dV().d_(this.dv()).b();
         if (this.fa().f() && this.bY() && this.ae.i() < $$3 * 0.3F) {
            $$1.e((float)(2 * (int)$$3));
         }
      }

      return $$2;
   }

   @Override
   protected awm u() {
      return awn.Eu;
   }

   @Override
   protected awm e(bus $$0) {
      return awn.EE;
   }

   @Override
   protected awm l_() {
      return awn.Ez;
   }

   protected awm n() {
      return awn.EK;
   }

   @Override
   protected void b(iu $$0, dzz $$1) {
      this.a(this.n(), 0.15F, 1.0F);
   }

   @Override
   public bwm<? extends cot> aq() {
      return (bwm<? extends cot>)super.aq();
   }

   protected boolean q() {
      return false;
   }

   @Override
   protected void a(azv $$0, btz $$1) {
      super.a($$0, $$1);
      if ($$0.i() < (this.dV().an() == bty.d ? 0.05F : 0.01F)) {
         int $$2 = $$0.a(3);
         if ($$2 == 0) {
            this.a(bwn.a, new cyy(czc.pM));
         } else {
            this.a(bwn.a, new cyy(czc.pN));
         }
      }
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("IsBaby", this.n_());
      $$0.a("CanBreakDoors", this.gv());
      $$0.a("InWaterTime", this.bj() ? this.bT : -1);
      $$0.a("DrownedConversionTime", this.gu() ? this.bU : -1);
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.a($$0.q("IsBaby"));
      this.x($$0.q("CanBreakDoors"));
      this.bT = $$0.h("InWaterTime");
      if ($$0.b("DrownedConversionTime", 99) && $$0.h("DrownedConversionTime") > -1) {
         this.r($$0.h("DrownedConversionTime"));
      }
   }

   @Override
   public boolean a(arq $$0, bxc $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (($$0.an() == bty.c || $$0.an() == bty.d) && $$1 instanceof cqk $$3) {
         if ($$0.an() != bty.d && this.ae.h()) {
            return $$2;
         }

         if (this.a($$0, $$3)) {
            $$2 = false;
         }
      }

      return $$2;
   }

   @Override
   public bwg e(bxo $$0) {
      return this.n_() ? bO : super.e($$0);
   }

   @Override
   public boolean h(cyy $$0) {
      return $$0.a(czc.rE) && this.n_() && this.bZ() ? false : super.h($$0);
   }

   @Override
   public boolean c(arq $$0, cyy $$1) {
      return $$1.a(czc.sj) ? false : super.c($$0, $$1);
   }

   @Nullable
   @Override
   public bxu a(djm $$0, btz $$1, bwl $$2, @Nullable bxu $$3) {
      azv $$4 = $$0.C_();
      $$3 = super.a($$0, $$1, $$2, $$3);
      float $$5 = $$1.d();
      if ($$2 != bwl.i) {
         this.a_($$4.i() < 0.55F * $$5);
      }

      if ($$3 == null) {
         $$3 = new cot.b(a($$4), true);
      }

      if ($$3 instanceof cot.b $$6) {
         if ($$6.a) {
            this.a(true);
            if ($$6.b) {
               if ((double)$$4.i() < 0.05) {
                  List<ciy> $$7 = $$0.a(ciy.class, this.cR().c(5.0, 3.0, 5.0), bwk.c);
                  if (!$$7.isEmpty()) {
                     ciy $$8 = $$7.get(0);
                     $$8.w(true);
                     this.n($$8);
                  }
               } else if ((double)$$4.i() < 0.05) {
                  ciy $$9 = bwm.z.a(this.dV(), bwl.g);
                  if ($$9 != null) {
                     $$9.b(this.dA(), this.dC(), this.dG(), this.dL(), 0.0F);
                     $$9.a($$0, $$1, bwl.g, null);
                     $$9.w(true);
                     this.n($$9);
                     $$0.b($$9);
                  }
               }
            }
         }

         this.x($$4.i() < $$5 * 0.1F);
         if ($$2 != bwl.i) {
            this.a($$4, $$1);
            this.a($$0, $$4, $$1);
         }
      }

      if (this.a(bwn.f).f()) {
         LocalDate $$10 = LocalDate.now();
         int $$11 = $$10.get(ChronoField.DAY_OF_MONTH);
         int $$12 = $$10.get(ChronoField.MONTH_OF_YEAR);
         if ($$12 == 10 && $$11 == 31 && $$4.i() < 0.25F) {
            this.a(bwn.f, new cyy($$4.i() < 0.1F ? dmc.et : dmc.es));
            this.a(bwn.f, 0.0F);
         }
      }

      this.J($$5);
      return $$3;
   }

   @VisibleForTesting
   public void b(int $$0) {
      this.bT = $$0;
   }

   @VisibleForTesting
   public void c(int $$0) {
      this.bU = $$0;
   }

   public static boolean a(azv $$0) {
      return $$0.i() < 0.05F;
   }

   protected void J(float $$0) {
      this.gw();
      this.g(byi.p).c(new byg(bv, this.ae.j() * 0.05F, byg.a.a));
      double $$1 = this.ae.j() * 1.5 * (double)$$0;
      if ($$1 > 1.0) {
         this.g(byi.m).c(new byg(bK, $$1, byg.a.c));
      }

      if (this.ae.i() < $$0 * 0.05F) {
         this.g(byi.A).c(new byg(bJ, this.ae.j() * 0.25 + 0.5, byg.a.a));
         this.g(byi.s).c(new byg(bJ, this.ae.j() * 3.0 + 1.0, byg.a.c));
         this.x(true);
      }
   }

   protected void gw() {
      this.g(byi.A).a(this.ae.j() * 0.1F);
   }

   @Override
   protected void a(arq $$0, bus $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$1.d() instanceof cnl $$4 && $$4.x()) {
         cyy $$5 = this.t();
         if (!$$5.f()) {
            $$4.gq();
            this.a($$0, $$5);
         }
      }
   }

   protected cyy t() {
      return new cyy(czc.vt);
   }

   class a extends cfa {
      a(final bxk $$0, final double $$1, final int $$2) {
         super(dmc.mI, $$0, $$1, $$2);
      }

      @Override
      public void a(diw $$0, iu $$1) {
         $$0.a(null, $$1, awn.EA, awo.f, 0.5F, 0.9F + cot.this.ae.i() * 0.2F);
      }

      @Override
      public void a(div $$0, iu $$1) {
         $$0.a(null, $$1, awn.Bj, awo.e, 0.7F, 0.9F + $$0.A.i() * 0.2F);
      }

      @Override
      public double i() {
         return 1.14;
      }
   }

   public static class b implements bxu {
      public final boolean a;
      public final boolean b;

      public b(boolean $$0, boolean $$1) {
         this.a = $$0;
         this.b = $$1;
      }
   }
}
