import com.google.common.annotations.VisibleForTesting;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class com extends cnt {
   private static final ale a = ale.b("baby");
   private static final byd b = new byd(a, 0.5, byd.a.b);
   private static final ale c = ale.b("reinforcement_caller_charge");
   private static final byd bI = new byd(ale.b("reinforcement_callee_charge"), -0.05F, byd.a.a);
   private static final ale bJ = ale.b("leader_zombie_bonus");
   private static final ale bK = ale.b("zombie_random_spawn_bonus");
   private static final akh<Boolean> bL = akl.a(com.class, akj.k);
   private static final akh<Integer> bM = akl.a(com.class, akj.b);
   private static final akh<Boolean> bN = akl.a(com.class, akj.k);
   public static final float d = 0.05F;
   public static final int bF = 50;
   public static final int bG = 40;
   public static final int bH = 7;
   private static final bwd bO = bwj.bO.n().a(0.5F).b(0.93F);
   private static final float bP = 0.1F;
   private static final Predicate<btv> bQ = $$0 -> $$0 == btv.d;
   private final cdf bR = new cdf(this, bQ);
   private boolean bS;
   private int bT;
   private int bU;

   public com(bwj<? extends com> $$0, dip $$1) {
      super($$0, $$1);
   }

   public com(dip $$0) {
      this(bwj.bO, $$0);
   }

   @Override
   protected void D() {
      this.bC.a(4, new com.a(this, 1.0, 3));
      this.bC.a(8, new ced(this, cqs.class, 8.0F));
      this.bC.a(8, new ceq(this));
      this.m();
   }

   protected void m() {
      this.bC.a(2, new cfk(this, 1.0, false));
      this.bC.a(6, new ceh(this, 1.0, true, 4, this::gv));
      this.bC.a(7, new cfi(this, 1.0));
      this.bD.a(1, new cfn(this).a(cop.class));
      this.bD.a(2, new cfo<>(this, cqs.class, true));
      this.bD.a(3, new cfo<>(this, cpz.class, false));
      this.bD.a(3, new cfo<>(this, cja.class, true));
      this.bD.a(5, new cfo<>(this, cjs.class, 10, true, false, cjs.bF));
   }

   public static bye.a gr() {
      return cnt.gt().a(byf.m, 35.0).a(byf.v, 0.23F).a(byf.c, 3.0).a(byf.a, 2.0).a(byf.A);
   }

   @Override
   protected void a(akl.a $$0) {
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
      if (cht.a(this)) {
         if (this.bS != $$0) {
            this.bS = $$0;
            ((cgi)this.O()).b($$0);
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
   protected int e(aro $$0) {
      if (this.n_()) {
         this.bx = (int)((double)this.bx * 2.5);
      }

      return super.e($$0);
   }

   @Override
   public void a(boolean $$0) {
      this.au().a(bL, $$0);
      if (this.dV() != null && !this.dV().C) {
         byb $$1 = this.g(byf.v);
         $$1.c(a);
         if ($$0) {
            $$1.b(b);
         }
      }
   }

   @Override
   public void a(akh<?> $$0) {
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
            if (this.a(axf.a)) {
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
            cys $$1 = this.a(bwk.f);
            if (!$$1.f()) {
               if ($$1.m()) {
                  cyo $$2 = $$1.h();
                  $$1.b($$1.o() + this.ae.a(2));
                  if ($$1.o() >= $$1.p()) {
                     this.a($$2, bwk.f);
                     this.a(bwk.f, cys.k);
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
      this.b(bwj.K);
      if (!this.bb()) {
         this.dV().a(null, 1040, this.dv(), 0);
      }
   }

   protected void b(bwj<? extends com> $$0) {
      this.a($$0, bvu.a(this, true, true), $$0x -> $$0x.J($$0x.dV().d_($$0x.dv()).d()));
   }

   @VisibleForTesting
   public boolean a(aro $$0, cqe $$1) {
      coo $$2 = $$1.a(bwj.bQ, bvu.a($$1, true, true), $$2x -> {
         $$2x.a($$0, $$0.d_($$2x.dv()), bwi.i, new com.b(false, true));
         $$2x.a($$1.gy());
         $$2x.a($$1.gJ().a(ul.a));
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
   public boolean a(aro $$0, bup $$1, float $$2) {
      if (!super.a($$0, $$1, $$2)) {
         return false;
      } else {
         bwz $$3 = this.f();
         if ($$3 == null && $$1.d() instanceof bwz) {
            $$3 = (bwz)$$1.d();
         }

         if ($$3 != null && $$0.an() == btv.d && (double)this.ae.i() < this.h(byf.A) && $$0.O().c(dil.e)) {
            int $$4 = azk.a(this.dA());
            int $$5 = azk.a(this.dC());
            int $$6 = azk.a(this.dG());
            bwj<? extends com> $$7 = this.aq();
            com $$8 = $$7.a($$0, bwi.j);
            if ($$8 == null) {
               return true;
            }

            for (int $$9 = 0; $$9 < 50; $$9++) {
               int $$10 = $$4 + azk.a(this.ae, 7, 40) * azk.a(this.ae, -1, 1);
               int $$11 = $$5 + azk.a(this.ae, 7, 40) * azk.a(this.ae, -1, 1);
               int $$12 = $$6 + azk.a(this.ae, 7, 40) * azk.a(this.ae, -1, 1);
               iu $$13 = new iu($$10, $$11, $$12);
               if (bxu.a($$7, $$0, $$13) && bxu.a($$7, $$0, bwi.j, $$13, $$0.A)) {
                  $$8.a_((double)$$10, (double)$$11, (double)$$12);
                  if (!$$0.a((double)$$10, (double)$$11, (double)$$12, 7.0) && $$0.f($$8) && $$0.g($$8) && ($$8.q() || !$$0.d($$8.cR()))) {
                     $$8.g($$3);
                     $$8.a($$0, $$0.d_($$8.dv()), bwi.j, null);
                     $$0.a_($$8);
                     byb $$14 = this.g(byf.A);
                     byd $$15 = $$14.a(c);
                     double $$16 = $$15 != null ? $$15.c() : 0.0;
                     $$14.c(c);
                     $$14.d(new byd(c, $$16 - 0.05, byd.a.a));
                     $$8.g(byf.A).d(bI);
                     break;
                  }
               }
            }
         }

         return true;
      }
   }

   @Override
   public boolean c(aro $$0, bwa $$1) {
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
   protected awk u() {
      return awl.Er;
   }

   @Override
   protected awk e(bup $$0) {
      return awl.EB;
   }

   @Override
   protected awk l_() {
      return awl.Ew;
   }

   protected awk n() {
      return awl.EH;
   }

   @Override
   protected void b(iu $$0, dzo $$1) {
      this.a(this.n(), 0.15F, 1.0F);
   }

   @Override
   public bwj<? extends com> aq() {
      return (bwj<? extends com>)super.aq();
   }

   protected boolean q() {
      return false;
   }

   @Override
   protected void a(azt $$0, btw $$1) {
      super.a($$0, $$1);
      if ($$0.i() < (this.dV().an() == btv.d ? 0.05F : 0.01F)) {
         int $$2 = $$0.a(3);
         if ($$2 == 0) {
            this.a(bwk.a, new cys(cyw.pK));
         } else {
            this.a(bwk.a, new cys(cyw.pL));
         }
      }
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("IsBaby", this.n_());
      $$0.a("CanBreakDoors", this.gv());
      $$0.a("InWaterTime", this.bj() ? this.bT : -1);
      $$0.a("DrownedConversionTime", this.gu() ? this.bU : -1);
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      this.a($$0.q("IsBaby"));
      this.x($$0.q("CanBreakDoors"));
      this.bT = $$0.h("InWaterTime");
      if ($$0.b("DrownedConversionTime", 99) && $$0.h("DrownedConversionTime") > -1) {
         this.r($$0.h("DrownedConversionTime"));
      }
   }

   @Override
   public boolean a(aro $$0, bwz $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (($$0.an() == btv.c || $$0.an() == btv.d) && $$1 instanceof cqe $$3) {
         if ($$0.an() != btv.d && this.ae.h()) {
            return $$2;
         }

         if (this.a($$0, $$3)) {
            $$2 = false;
         }
      }

      return $$2;
   }

   @Override
   public bwd e(bxl $$0) {
      return this.n_() ? bO : super.e($$0);
   }

   @Override
   public boolean h(cys $$0) {
      return $$0.a(cyw.rC) && this.n_() && this.bZ() ? false : super.h($$0);
   }

   @Override
   public boolean c(aro $$0, cys $$1) {
      return $$1.a(cyw.sh) ? false : super.c($$0, $$1);
   }

   @Nullable
   @Override
   public bxr a(djg $$0, btw $$1, bwi $$2, @Nullable bxr $$3) {
      azt $$4 = $$0.C_();
      $$3 = super.a($$0, $$1, $$2, $$3);
      float $$5 = $$1.d();
      if ($$2 != bwi.i) {
         this.a_($$4.i() < 0.55F * $$5);
      }

      if ($$3 == null) {
         $$3 = new com.b(a($$4), true);
      }

      if ($$3 instanceof com.b $$6) {
         if ($$6.a) {
            this.a(true);
            if ($$6.b) {
               if ((double)$$4.i() < 0.05) {
                  List<ciu> $$7 = $$0.a(ciu.class, this.cR().c(5.0, 3.0, 5.0), bwh.c);
                  if (!$$7.isEmpty()) {
                     ciu $$8 = $$7.get(0);
                     $$8.w(true);
                     this.n($$8);
                  }
               } else if ((double)$$4.i() < 0.05) {
                  ciu $$9 = bwj.z.a(this.dV(), bwi.g);
                  if ($$9 != null) {
                     $$9.b(this.dA(), this.dC(), this.dG(), this.dL(), 0.0F);
                     $$9.a($$0, $$1, bwi.g, null);
                     $$9.w(true);
                     this.n($$9);
                     $$0.b($$9);
                  }
               }
            }
         }

         this.x($$4.i() < $$5 * 0.1F);
         if ($$2 != bwi.i) {
            this.a($$4, $$1);
            this.a($$0, $$4, $$1);
         }
      }

      if (this.a(bwk.f).f()) {
         LocalDate $$10 = LocalDate.now();
         int $$11 = $$10.get(ChronoField.DAY_OF_MONTH);
         int $$12 = $$10.get(ChronoField.MONTH_OF_YEAR);
         if ($$12 == 10 && $$11 == 31 && $$4.i() < 0.25F) {
            this.a(bwk.f, new cys($$4.i() < 0.1F ? dlw.es : dlw.er));
            this.a(bwk.f, 0.0F);
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

   public static boolean a(azt $$0) {
      return $$0.i() < 0.05F;
   }

   protected void J(float $$0) {
      this.gw();
      this.g(byf.p).c(new byd(bv, this.ae.j() * 0.05F, byd.a.a));
      double $$1 = this.ae.j() * 1.5 * (double)$$0;
      if ($$1 > 1.0) {
         this.g(byf.m).c(new byd(bK, $$1, byd.a.c));
      }

      if (this.ae.i() < $$0 * 0.05F) {
         this.g(byf.A).c(new byd(bJ, this.ae.j() * 0.25 + 0.5, byd.a.a));
         this.g(byf.s).c(new byd(bJ, this.ae.j() * 3.0 + 1.0, byd.a.c));
         this.x(true);
      }
   }

   protected void gw() {
      this.g(byf.A).a(this.ae.j() * 0.1F);
   }

   @Override
   protected void a(aro $$0, bup $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$1.d() instanceof cnf $$4 && $$4.x()) {
         cys $$5 = this.t();
         if (!$$5.f()) {
            $$4.gq();
            this.a($$0, $$5);
         }
      }
   }

   protected cys t() {
      return new cys(cyw.vr);
   }

   class a extends cex {
      a(final bxh $$0, final double $$1, final int $$2) {
         super(dlw.mH, $$0, $$1, $$2);
      }

      @Override
      public void a(diq $$0, iu $$1) {
         $$0.a(null, $$1, awl.Ex, awm.f, 0.5F, 0.9F + com.this.ae.i() * 0.2F);
      }

      @Override
      public void a(dip $$0, iu $$1) {
         $$0.a(null, $$1, awl.Bg, awm.e, 0.7F, 0.9F + $$0.A.i() * 0.2F);
      }

      @Override
      public double i() {
         return 1.14;
      }
   }

   public static class b implements bxr {
      public final boolean a;
      public final boolean b;

      public b(boolean $$0, boolean $$1) {
         this.a = $$0;
         this.b = $$1;
      }
   }
}
