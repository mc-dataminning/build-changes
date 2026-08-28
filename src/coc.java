import com.google.common.annotations.VisibleForTesting;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class coc extends cnj {
   private static final ald a = ald.b("baby");
   private static final bxv b = new bxv(a, 0.5, bxv.a.b);
   private static final ald c = ald.b("reinforcement_caller_charge");
   private static final bxv bH = new bxv(ald.b("reinforcement_callee_charge"), -0.05F, bxv.a.a);
   private static final ald bI = ald.b("leader_zombie_bonus");
   private static final ald bJ = ald.b("zombie_random_spawn_bonus");
   private static final akg<Boolean> bK = akk.a(coc.class, aki.k);
   private static final akg<Integer> bL = akk.a(coc.class, aki.b);
   private static final akg<Boolean> bM = akk.a(coc.class, aki.k);
   public static final float d = 0.05F;
   public static final int bE = 50;
   public static final int bF = 40;
   public static final int bG = 7;
   private static final bvv bN = bwb.bN.n().a(0.5F).b(0.93F);
   private static final float bO = 0.1F;
   private static final Predicate<btn> bP = $$0 -> $$0 == btn.d;
   private final ccx bQ = new ccx(this, bP);
   private boolean bR;
   private int bS;
   private int bT;

   public coc(bwb<? extends coc> $$0, dhp $$1) {
      super($$0, $$1);
   }

   public coc(dhp $$0) {
      this(bwb.bN, $$0);
   }

   @Override
   protected void D() {
      this.bB.a(4, new coc.a(this, 1.0, 3));
      this.bB.a(8, new cdv(this, cqi.class, 8.0F));
      this.bB.a(8, new cei(this));
      this.m();
   }

   protected void m() {
      this.bB.a(2, new cfc(this, 1.0, false));
      this.bB.a(6, new cdz(this, 1.0, true, 4, this::gv));
      this.bB.a(7, new cfa(this, 1.0));
      this.bC.a(1, new cff(this).a(coe.class));
      this.bC.a(2, new cfg<>(this, cqi.class, true));
      this.bC.a(3, new cfg<>(this, cpp.class, false));
      this.bC.a(3, new cfg<>(this, cis.class, true));
      this.bC.a(5, new cfg<>(this, cjk.class, 10, true, false, cjk.bE));
   }

   public static bxw.a gr() {
      return cnj.gt().a(bxx.m, 35.0).a(bxx.v, 0.23F).a(bxx.c, 3.0).a(bxx.a, 2.0).a(bxx.A);
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(bK, false);
      $$0.a(bL, 0);
      $$0.a(bM, false);
   }

   public boolean gu() {
      return this.au().a(bM);
   }

   public boolean gv() {
      return this.bR;
   }

   public void x(boolean $$0) {
      if (chl.a(this)) {
         if (this.bR != $$0) {
            this.bR = $$0;
            ((cga)this.O()).b($$0);
            if ($$0) {
               this.bB.a(1, this.bQ);
            } else {
               this.bB.a(this.bQ);
            }
         }
      } else if (this.bR) {
         this.bB.a(this.bQ);
         this.bR = false;
      }
   }

   @Override
   public boolean n_() {
      return this.au().a(bK);
   }

   @Override
   protected int e(arn $$0) {
      if (this.n_()) {
         this.bw = (int)((double)this.bw * 2.5);
      }

      return super.e($$0);
   }

   @Override
   public void a(boolean $$0) {
      this.au().a(bK, $$0);
      if (this.dV() != null && !this.dV().C) {
         bxt $$1 = this.g(bxx.v);
         $$1.c(a);
         if ($$0) {
            $$1.b(b);
         }
      }
   }

   @Override
   public void a(akg<?> $$0) {
      if (bK.equals($$0)) {
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
            this.bT--;
            if (this.bT < 0) {
               this.ab_();
            }
         } else if (this.x()) {
            if (this.a(axf.a)) {
               this.bS++;
               if (this.bS >= 600) {
                  this.r(300);
               }
            } else {
               this.bS = -1;
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
            cxy $$1 = this.a(bwc.f);
            if (!$$1.f()) {
               if ($$1.m()) {
                  cxu $$2 = $$1.h();
                  $$1.b($$1.o() + this.ae.a(2));
                  if ($$1.o() >= $$1.p()) {
                     this.a($$2, bwc.f);
                     this.a(bwc.f, cxy.k);
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
      this.bT = $$0;
      this.au().a(bM, true);
   }

   protected void ab_() {
      this.b(bwb.K);
      if (!this.bb()) {
         this.dV().a(null, 1040, this.dv(), 0);
      }
   }

   protected void b(bwb<? extends coc> $$0) {
      this.a($$0, bvm.a(this, true, true), $$0x -> $$0x.K($$0x.dV().d_($$0x.dv()).d()));
   }

   @VisibleForTesting
   public boolean a(arn $$0, cpu $$1) {
      cod $$2 = $$1.a(bwb.bP, bvm.a($$1, true, true), $$2x -> {
         $$2x.a($$0, $$0.d_($$2x.dv()), bwa.i, new coc.b(false, true));
         $$2x.a($$1.gy());
         $$2x.a($$1.gJ().a(uk.a));
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
   public boolean a(arn $$0, buh $$1, float $$2) {
      if (!super.a($$0, $$1, $$2)) {
         return false;
      } else {
         bwr $$3 = this.f();
         if ($$3 == null && $$1.d() instanceof bwr) {
            $$3 = (bwr)$$1.d();
         }

         if ($$3 != null && $$0.an() == btn.d && (double)this.ae.i() < this.h(bxx.A) && $$0.O().c(dhl.e)) {
            int $$4 = azk.a(this.dA());
            int $$5 = azk.a(this.dC());
            int $$6 = azk.a(this.dG());
            bwb<? extends coc> $$7 = this.aq();
            coc $$8 = $$7.a($$0, bwa.j);
            if ($$8 == null) {
               return true;
            }

            for (int $$9 = 0; $$9 < 50; $$9++) {
               int $$10 = $$4 + azk.a(this.ae, 7, 40) * azk.a(this.ae, -1, 1);
               int $$11 = $$5 + azk.a(this.ae, 7, 40) * azk.a(this.ae, -1, 1);
               int $$12 = $$6 + azk.a(this.ae, 7, 40) * azk.a(this.ae, -1, 1);
               jj $$13 = new jj($$10, $$11, $$12);
               if (bxm.a($$7, $$0, $$13) && bxm.a($$7, $$0, bwa.j, $$13, $$0.A)) {
                  $$8.a_((double)$$10, (double)$$11, (double)$$12);
                  if (!$$0.a((double)$$10, (double)$$11, (double)$$12, 7.0) && $$0.f($$8) && $$0.g($$8) && ($$8.q() || !$$0.d($$8.cR()))) {
                     $$8.h($$3);
                     $$8.a($$0, $$0.d_($$8.dv()), bwa.j, null);
                     $$0.a_($$8);
                     bxt $$14 = this.g(bxx.A);
                     bxv $$15 = $$14.a(c);
                     double $$16 = $$15 != null ? $$15.c() : 0.0;
                     $$14.c(c);
                     $$14.d(new bxv(c, $$16 - 0.05, bxv.a.a));
                     $$8.g(bxx.A).d(bH);
                     break;
                  }
               }
            }
         }

         return true;
      }
   }

   @Override
   public boolean c(arn $$0, bvs $$1) {
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
   protected awj u() {
      return awk.Er;
   }

   @Override
   protected awj e(buh $$0) {
      return awk.EB;
   }

   @Override
   protected awj l_() {
      return awk.Ew;
   }

   protected awj n() {
      return awk.EH;
   }

   @Override
   protected void b(jj $$0, dym $$1) {
      this.a(this.n(), 0.15F, 1.0F);
   }

   @Override
   public bwb<? extends coc> aq() {
      return (bwb<? extends coc>)super.aq();
   }

   protected boolean q() {
      return false;
   }

   @Override
   protected void a(azs $$0, bto $$1) {
      super.a($$0, $$1);
      if ($$0.i() < (this.dV().an() == btn.d ? 0.05F : 0.01F)) {
         int $$2 = $$0.a(3);
         if ($$2 == 0) {
            this.a(bwc.a, new cxy(cyc.pK));
         } else {
            this.a(bwc.a, new cxy(cyc.pL));
         }
      }
   }

   @Override
   public void b(tw $$0) {
      super.b($$0);
      $$0.a("IsBaby", this.n_());
      $$0.a("CanBreakDoors", this.gv());
      $$0.a("InWaterTime", this.bj() ? this.bS : -1);
      $$0.a("DrownedConversionTime", this.gu() ? this.bT : -1);
   }

   @Override
   public void a(tw $$0) {
      super.a($$0);
      this.a($$0.q("IsBaby"));
      this.x($$0.q("CanBreakDoors"));
      this.bS = $$0.h("InWaterTime");
      if ($$0.b("DrownedConversionTime", 99) && $$0.h("DrownedConversionTime") > -1) {
         this.r($$0.h("DrownedConversionTime"));
      }
   }

   @Override
   public boolean a(arn $$0, bwr $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (($$0.an() == btn.c || $$0.an() == btn.d) && $$1 instanceof cpu $$3) {
         if ($$0.an() != btn.d && this.ae.h()) {
            return $$2;
         }

         if (this.a($$0, $$3)) {
            $$2 = false;
         }
      }

      return $$2;
   }

   @Override
   public bvv e(bxd $$0) {
      return this.n_() ? bN : super.e($$0);
   }

   @Override
   public boolean h(cxy $$0) {
      return $$0.a(cyc.rC) && this.n_() && this.bZ() ? false : super.h($$0);
   }

   @Override
   public boolean c(arn $$0, cxy $$1) {
      return $$1.a(cyc.sh) ? false : super.c($$0, $$1);
   }

   @Nullable
   @Override
   public bxj a(dig $$0, bto $$1, bwa $$2, @Nullable bxj $$3) {
      azs $$4 = $$0.C_();
      $$3 = super.a($$0, $$1, $$2, $$3);
      float $$5 = $$1.d();
      if ($$2 != bwa.i) {
         this.a_($$4.i() < 0.55F * $$5);
      }

      if ($$3 == null) {
         $$3 = new coc.b(a($$4), true);
      }

      if ($$3 instanceof coc.b $$6) {
         if ($$6.a) {
            this.a(true);
            if ($$6.b) {
               if ((double)$$4.i() < 0.05) {
                  List<cil> $$7 = $$0.a(cil.class, this.cR().c(5.0, 3.0, 5.0), bvz.c);
                  if (!$$7.isEmpty()) {
                     cil $$8 = $$7.get(0);
                     $$8.w(true);
                     this.n($$8);
                  }
               } else if ((double)$$4.i() < 0.05) {
                  cil $$9 = bwb.z.a(this.dV(), bwa.g);
                  if ($$9 != null) {
                     $$9.b(this.dA(), this.dC(), this.dG(), this.dL(), 0.0F);
                     $$9.a($$0, $$1, bwa.g, null);
                     $$9.w(true);
                     this.n($$9);
                     $$0.b($$9);
                  }
               }
            }
         }

         this.x($$4.i() < $$5 * 0.1F);
         if ($$2 != bwa.i) {
            this.a($$4, $$1);
            this.a($$0, $$4, $$1);
         }
      }

      if (this.a(bwc.f).f()) {
         LocalDate $$10 = LocalDate.now();
         int $$11 = $$10.get(ChronoField.DAY_OF_MONTH);
         int $$12 = $$10.get(ChronoField.MONTH_OF_YEAR);
         if ($$12 == 10 && $$11 == 31 && $$4.i() < 0.25F) {
            this.a(bwc.f, new cxy($$4.i() < 0.1F ? dkw.es : dkw.er));
            this.a(bwc.f, 0.0F);
         }
      }

      this.K($$5);
      return $$3;
   }

   @VisibleForTesting
   public void b(int $$0) {
      this.bS = $$0;
   }

   @VisibleForTesting
   public void c(int $$0) {
      this.bT = $$0;
   }

   public static boolean a(azs $$0) {
      return $$0.i() < 0.05F;
   }

   protected void K(float $$0) {
      this.gw();
      this.g(bxx.p).c(new bxv(bu, this.ae.j() * 0.05F, bxv.a.a));
      double $$1 = this.ae.j() * 1.5 * (double)$$0;
      if ($$1 > 1.0) {
         this.g(bxx.m).c(new bxv(bJ, $$1, bxv.a.c));
      }

      if (this.ae.i() < $$0 * 0.05F) {
         this.g(bxx.A).c(new bxv(bI, this.ae.j() * 0.25 + 0.5, bxv.a.a));
         this.g(bxx.s).c(new bxv(bI, this.ae.j() * 3.0 + 1.0, bxv.a.c));
         this.x(true);
      }
   }

   protected void gw() {
      this.g(bxx.A).a(this.ae.j() * 0.1F);
   }

   @Override
   protected void a(arn $$0, buh $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$1.d() instanceof cmv $$4 && $$4.x()) {
         cxy $$5 = this.t();
         if (!$$5.f()) {
            $$4.gq();
            this.a($$0, $$5);
         }
      }
   }

   protected cxy t() {
      return new cxy(cyc.vr);
   }

   class a extends cep {
      a(final bwz $$0, final double $$1, final int $$2) {
         super(dkw.mH, $$0, $$1, $$2);
      }

      @Override
      public void a(dhq $$0, jj $$1) {
         $$0.a(null, $$1, awk.Ex, awl.f, 0.5F, 0.9F + coc.this.ae.i() * 0.2F);
      }

      @Override
      public void a(dhp $$0, jj $$1) {
         $$0.a(null, $$1, awk.Bg, awl.e, 0.7F, 0.9F + $$0.A.i() * 0.2F);
      }

      @Override
      public double i() {
         return 1.14;
      }
   }

   public static class b implements bxj {
      public final boolean a;
      public final boolean b;

      public b(boolean $$0, boolean $$1) {
         this.a = $$0;
         this.b = $$1;
      }
   }
}
