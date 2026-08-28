import com.google.common.annotations.VisibleForTesting;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cnl extends cms {
   private static final aku a = aku.b("baby");
   private static final bxe b = new bxe(a, 0.5, bxe.a.b);
   private static final aku c = aku.b("reinforcement_caller_charge");
   private static final bxe bI = new bxe(aku.b("reinforcement_callee_charge"), -0.05F, bxe.a.a);
   private static final aku bJ = aku.b("leader_zombie_bonus");
   private static final aku bK = aku.b("zombie_random_spawn_bonus");
   private static final ajx<Boolean> bL = akb.a(cnl.class, ajz.k);
   private static final ajx<Integer> bM = akb.a(cnl.class, ajz.b);
   private static final ajx<Boolean> bN = akb.a(cnl.class, ajz.k);
   public static final float d = 0.05F;
   public static final int bF = 50;
   public static final int bG = 40;
   public static final int bH = 7;
   private static final bvd bO = bvi.bN.n().a(0.5F).b(0.93F);
   private static final float bP = 0.1F;
   private static final Predicate<bsv> bQ = $$0 -> $$0 == bsv.d;
   private final ccg bR = new ccg(this, bQ);
   private boolean bS;
   private int bT;
   private int bU;

   public cnl(bvi<? extends cnl> $$0, dgz $$1) {
      super($$0, $$1);
   }

   public cnl(dgz $$0) {
      this(bvi.bN, $$0);
   }

   @Override
   protected void D() {
      this.bC.a(4, new cnl.a(this, 1.0, 3));
      this.bC.a(8, new cde(this, cpr.class, 8.0F));
      this.bC.a(8, new cdr(this));
      this.m();
   }

   protected void m() {
      this.bC.a(2, new cel(this, 1.0, false));
      this.bC.a(6, new cdi(this, 1.0, true, 4, this::gx));
      this.bC.a(7, new cej(this, 1.0));
      this.bD.a(1, new ceo(this).a(cnn.class));
      this.bD.a(2, new cep<>(this, cpr.class, true));
      this.bD.a(3, new cep<>(this, coy.class, false));
      this.bD.a(3, new cep<>(this, cib.class, true));
      this.bD.a(5, new cep<>(this, cit.class, 10, true, false, cit.bF));
   }

   public static bxf.a gt() {
      return cms.gv().a(bxg.m, 35.0).a(bxg.v, 0.23F).a(bxg.c, 3.0).a(bxg.a, 2.0).a(bxg.A);
   }

   @Override
   protected void a(akb.a $$0) {
      super.a($$0);
      $$0.a(bL, false);
      $$0.a(bM, 0);
      $$0.a(bN, false);
   }

   public boolean gw() {
      return this.au().a(bN);
   }

   public boolean gx() {
      return this.bS;
   }

   public void x(boolean $$0) {
      if (cgu.a(this)) {
         if (this.bS != $$0) {
            this.bS = $$0;
            ((cfj)this.O()).b($$0);
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
   protected int e(ard $$0) {
      if (this.n_()) {
         this.bx = (int)((double)this.bx * 2.5);
      }

      return super.e($$0);
   }

   @Override
   public void a(boolean $$0) {
      this.au().a(bL, $$0);
      if (this.dU() != null && !this.dU().C) {
         bxc $$1 = this.g(bxg.v);
         $$1.c(a);
         if ($$0) {
            $$1.b(b);
         }
      }
   }

   @Override
   public void a(ajx<?> $$0) {
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
      if (!this.dU().C && this.bJ() && !this.gh()) {
         if (this.gw()) {
            this.bU--;
            if (this.bU < 0) {
               this.af_();
            }
         } else if (this.x()) {
            if (this.a(awv.a)) {
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
      if (this.bJ()) {
         boolean $$0 = this.ag_() && this.gm();
         if ($$0) {
            cxh $$1 = this.a(bvj.f);
            if (!$$1.f()) {
               if ($$1.m()) {
                  cxd $$2 = $$1.h();
                  $$1.b($$1.o() + this.ae.a(2));
                  if ($$1.o() >= $$1.p()) {
                     this.a($$2, bvj.f);
                     this.a(bvj.f, cxh.k);
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

   protected void af_() {
      this.b(bvi.K);
      if (!this.bb()) {
         this.dU().a(null, 1040, this.du(), 0);
      }
   }

   protected void b(bvi<? extends cnl> $$0) {
      this.a($$0, buu.a(this, true, true), $$0x -> $$0x.K($$0x.dU().d_($$0x.du()).d()));
   }

   @VisibleForTesting
   public boolean a(ard $$0, cpd $$1) {
      cnm $$2 = $$1.a(bvi.bP, buu.a($$1, true, true), $$2x -> {
         $$2x.a($$0, $$0.d_($$2x.du()), bvh.i, new cnl.b(false, true));
         $$2x.a($$1.gA());
         $$2x.a($$1.gL().a(ue.a));
         $$2x.a($$1.gt().a());
         $$2x.s($$1.t());
         if (!this.bb()) {
            $$0.a(null, 1026, this.du(), 0);
         }
      });
      return $$2 != null;
   }

   protected boolean ag_() {
      return true;
   }

   @Override
   public boolean a(ard $$0, btp $$1, float $$2) {
      if (!super.a($$0, $$1, $$2)) {
         return false;
      } else {
         bvy $$3 = this.f();
         if ($$3 == null && $$1.d() instanceof bvy) {
            $$3 = (bvy)$$1.d();
         }

         if ($$3 != null && $$0.an() == bsv.d && (double)this.ae.i() < this.h(bxg.A) && $$0.O().b(dgv.e)) {
            int $$4 = ayz.a(this.dz());
            int $$5 = ayz.a(this.dB());
            int $$6 = ayz.a(this.dF());
            bvi<? extends cnl> $$7 = this.aq();
            cnl $$8 = $$7.a($$0, bvh.j);
            if ($$8 == null) {
               return true;
            }

            for (int $$9 = 0; $$9 < 50; $$9++) {
               int $$10 = $$4 + ayz.a(this.ae, 7, 40) * ayz.a(this.ae, -1, 1);
               int $$11 = $$5 + ayz.a(this.ae, 7, 40) * ayz.a(this.ae, -1, 1);
               int $$12 = $$6 + ayz.a(this.ae, 7, 40) * ayz.a(this.ae, -1, 1);
               ji $$13 = new ji($$10, $$11, $$12);
               if (bwu.a($$7, $$0, $$13) && bwu.a($$7, $$0, bvh.j, $$13, $$0.A)) {
                  $$8.a_((double)$$10, (double)$$11, (double)$$12);
                  if (!$$0.a((double)$$10, (double)$$11, (double)$$12, 7.0) && $$0.f($$8) && $$0.g($$8) && ($$8.q() || !$$0.d($$8.cQ()))) {
                     $$8.h($$3);
                     $$8.a($$0, $$0.d_($$8.du()), bvh.j, null);
                     $$0.a_($$8);
                     bxc $$14 = this.g(bxg.A);
                     bxe $$15 = $$14.a(c);
                     double $$16 = $$15 != null ? $$15.c() : 0.0;
                     $$14.c(c);
                     $$14.d(new bxe(c, $$16 - 0.05, bxe.a.a));
                     $$8.g(bxg.A).d(bI);
                     break;
                  }
               }
            }
         }

         return true;
      }
   }

   @Override
   public boolean c(ard $$0, bva $$1) {
      boolean $$2 = super.c($$0, $$1);
      if ($$2) {
         float $$3 = this.dU().d_(this.du()).b();
         if (this.eZ().f() && this.bX() && this.ae.i() < $$3 * 0.3F) {
            $$1.e((float)(2 * (int)$$3));
         }
      }

      return $$2;
   }

   @Override
   protected avz u() {
      return awa.Er;
   }

   @Override
   protected avz e(btp $$0) {
      return awa.EB;
   }

   @Override
   protected avz l_() {
      return awa.Ew;
   }

   protected avz n() {
      return awa.EH;
   }

   @Override
   protected void b(ji $$0, dxq $$1) {
      this.a(this.n(), 0.15F, 1.0F);
   }

   @Override
   public bvi<? extends cnl> aq() {
      return (bvi<? extends cnl>)super.aq();
   }

   protected boolean q() {
      return false;
   }

   @Override
   protected void a(azh $$0, bsw $$1) {
      super.a($$0, $$1);
      if ($$0.i() < (this.dU().an() == bsv.d ? 0.05F : 0.01F)) {
         int $$2 = $$0.a(3);
         if ($$2 == 0) {
            this.a(bvj.a, new cxh(cxl.pI));
         } else {
            this.a(bvj.a, new cxh(cxl.pJ));
         }
      }
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      $$0.a("IsBaby", this.n_());
      $$0.a("CanBreakDoors", this.gx());
      $$0.a("InWaterTime", this.bj() ? this.bT : -1);
      $$0.a("DrownedConversionTime", this.gw() ? this.bU : -1);
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      this.a($$0.q("IsBaby"));
      this.x($$0.q("CanBreakDoors"));
      this.bT = $$0.h("InWaterTime");
      if ($$0.b("DrownedConversionTime", 99) && $$0.h("DrownedConversionTime") > -1) {
         this.r($$0.h("DrownedConversionTime"));
      }
   }

   @Override
   public boolean a(ard $$0, bvy $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (($$0.an() == bsv.c || $$0.an() == bsv.d) && $$1 instanceof cpd $$3) {
         if ($$0.an() != bsv.d && this.ae.h()) {
            return $$2;
         }

         if (this.a($$0, $$3)) {
            $$2 = false;
         }
      }

      return $$2;
   }

   @Override
   public bvd e(bwk $$0) {
      return this.n_() ? bO : super.e($$0);
   }

   @Override
   public boolean g(cxh $$0) {
      return $$0.a(cxl.rA) && this.n_() && this.bY() ? false : super.g($$0);
   }

   @Override
   public boolean c(ard $$0, cxh $$1) {
      return $$1.a(cxl.sf) ? false : super.c($$0, $$1);
   }

   @Nullable
   @Override
   public bwr a(dhq $$0, bsw $$1, bvh $$2, @Nullable bwr $$3) {
      azh $$4 = $$0.C_();
      $$3 = super.a($$0, $$1, $$2, $$3);
      float $$5 = $$1.d();
      if ($$2 != bvh.i) {
         this.a_($$4.i() < 0.55F * $$5);
      }

      if ($$3 == null) {
         $$3 = new cnl.b(a($$4), true);
      }

      if ($$3 instanceof cnl.b $$6) {
         if ($$6.a) {
            this.a(true);
            if ($$6.b) {
               if ((double)$$4.i() < 0.05) {
                  List<chu> $$7 = $$0.a(chu.class, this.cQ().c(5.0, 3.0, 5.0), bvg.c);
                  if (!$$7.isEmpty()) {
                     chu $$8 = $$7.get(0);
                     $$8.w(true);
                     this.n($$8);
                  }
               } else if ((double)$$4.i() < 0.05) {
                  chu $$9 = bvi.z.a(this.dU(), bvh.g);
                  if ($$9 != null) {
                     $$9.b(this.dz(), this.dB(), this.dF(), this.dK(), 0.0F);
                     $$9.a($$0, $$1, bvh.g, null);
                     $$9.w(true);
                     this.n($$9);
                     $$0.b($$9);
                  }
               }
            }
         }

         this.x($$4.i() < $$5 * 0.1F);
         if ($$2 != bvh.i) {
            this.a($$4, $$1);
            this.a($$0, $$4, $$1);
         }
      }

      if (this.a(bvj.f).f()) {
         LocalDate $$10 = LocalDate.now();
         int $$11 = $$10.get(ChronoField.DAY_OF_MONTH);
         int $$12 = $$10.get(ChronoField.MONTH_OF_YEAR);
         if ($$12 == 10 && $$11 == 31 && $$4.i() < 0.25F) {
            this.a(bvj.f, new cxh($$4.i() < 0.1F ? dkg.es : dkg.er));
            this.a(bvj.f, 0.0F);
         }
      }

      this.K($$5);
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

   public static boolean a(azh $$0) {
      return $$0.i() < 0.05F;
   }

   protected void K(float $$0) {
      this.gy();
      this.g(bxg.p).c(new bxe(bv, this.ae.j() * 0.05F, bxe.a.a));
      double $$1 = this.ae.j() * 1.5 * (double)$$0;
      if ($$1 > 1.0) {
         this.g(bxg.m).c(new bxe(bK, $$1, bxe.a.c));
      }

      if (this.ae.i() < $$0 * 0.05F) {
         this.g(bxg.A).c(new bxe(bJ, this.ae.j() * 0.25 + 0.5, bxe.a.a));
         this.g(bxg.s).c(new bxe(bJ, this.ae.j() * 3.0 + 1.0, bxe.a.c));
         this.x(true);
      }
   }

   protected void gy() {
      this.g(bxg.A).a(this.ae.j() * 0.1F);
   }

   @Override
   protected void a(ard $$0, btp $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$1.d() instanceof cme $$4 && $$4.x()) {
         cxh $$5 = this.t();
         if (!$$5.f()) {
            $$4.gs();
            this.a($$0, $$5);
         }
      }
   }

   protected cxh t() {
      return new cxh(cxl.vp);
   }

   class a extends cdy {
      a(final bwg $$0, final double $$1, final int $$2) {
         super(dkg.mH, $$0, $$1, $$2);
      }

      @Override
      public void a(dha $$0, ji $$1) {
         $$0.a(null, $$1, awa.Ex, awb.f, 0.5F, 0.9F + cnl.this.ae.i() * 0.2F);
      }

      @Override
      public void a(dgz $$0, ji $$1) {
         $$0.a(null, $$1, awa.Bg, awb.e, 0.7F, 0.9F + $$0.A.i() * 0.2F);
      }

      @Override
      public double i() {
         return 1.14;
      }
   }

   public static class b implements bwr {
      public final boolean a;
      public final boolean b;

      public b(boolean $$0, boolean $$1) {
         this.a = $$0;
         this.b = $$1;
      }
   }
}
