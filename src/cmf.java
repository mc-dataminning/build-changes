import java.time.LocalDate;
import java.time.temporal.ChronoField;
import javax.annotation.Nullable;

public abstract class cmf extends cmx implements cnb {
   private static final int a = 20;
   private static final int b = 40;
   private final cee<cmf> c = new cee<>(this, 1.0, 20, 15.0F);
   private final cdo d = new cdo(this, 1.2, false) {
      @Override
      public void e() {
         super.e();
         cmf.this.w(false);
      }

      @Override
      public void d() {
         super.d();
         cmf.this.w(true);
      }
   };

   protected cmf(bvr<? extends cmf> $$0, dhi $$1) {
      super($$0, $$1);
      this.t();
   }

   @Override
   protected void B() {
      this.bT.a(2, new ceh(this));
      this.bT.a(3, new ccx(this, 1.0));
      this.bT.a(3, new ccl<>(this, cja.class, 6.0F, 1.0, 1.2));
      this.bT.a(5, new cer(this, 1.0));
      this.bT.a(6, new cdm(this, cpx.class, 8.0F));
      this.bT.a(6, new cdz(this));
      this.bU.a(1, new cew(this));
      this.bU.a(2, new cex<>(this, cpx.class, true));
      this.bU.a(3, new cex<>(this, cij.class, true));
      this.bU.a(3, new cex<>(this, ciy.class, 10, true, false, ciy.bZ));
   }

   public static bxn.a m() {
      return cmx.gt().a(bxo.v, 0.25);
   }

   @Override
   protected void b(jh $$0, dxv $$1) {
      this.a(this.p(), 0.15F, 1.0F);
   }

   abstract axe p();

   @Override
   public void d_() {
      boolean $$0 = this.gg();
      if ($$0) {
         cxp $$1 = this.a(bvs.f);
         if (!$$1.f()) {
            if ($$1.m()) {
               cxl $$2 = $$1.h();
               $$1.b($$1.o() + this.ae.a(2));
               if ($$1.o() >= $$1.p()) {
                  this.a($$2, bvs.f);
                  this.a(bvs.f, cxp.j);
               }
            }

            $$0 = false;
         }

         if ($$0) {
            this.d(8.0F);
         }
      }

      super.d_();
   }

   @Override
   public void r() {
      super.r();
      if (this.dm() instanceof bwo $$0) {
         this.aX = $$0.aX;
      }
   }

   @Override
   protected void a(bam $$0, bth $$1) {
      super.a($$0, $$1);
      this.a(bvs.a, new cxp(cxt.oR));
   }

   @Nullable
   @Override
   public bwz a(dhz $$0, bth $$1, bvq $$2, @Nullable bwz $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      bam $$4 = $$0.H_();
      this.a($$4, $$1);
      this.a($$0, $$4, $$1);
      this.t();
      this.a_($$4.i() < 0.55F * $$1.d());
      if (this.a(bvs.f).f()) {
         LocalDate $$5 = LocalDate.now();
         int $$6 = $$5.get(ChronoField.DAY_OF_MONTH);
         int $$7 = $$5.get(ChronoField.MONTH_OF_YEAR);
         if ($$7 == 10 && $$6 == 31 && $$4.i() < 0.25F) {
            this.a(bvs.f, new cxp($$4.i() < 0.1F ? dko.es : dko.er));
            this.bW[bvs.f.b()] = 0.0F;
         }
      }

      return $$3;
   }

   public void t() {
      if (this.dW() != null && !this.dW().C) {
         this.bT.a(this.d);
         this.bT.a(this.c);
         cxp $$0 = this.b(cqs.a(this, cxt.oR));
         if ($$0.a(cxt.oR)) {
            int $$1 = this.x();
            if (this.dW().al() != btg.d) {
               $$1 = this.go();
            }

            this.c.c($$1);
            this.bT.a(4, this.c);
         } else {
            this.bT.a(4, this.d);
         }
      }
   }

   protected int x() {
      return 20;
   }

   protected int go() {
      return 40;
   }

   @Override
   public void a(bwg $$0, float $$1) {
      cxp $$2 = this.b(cqs.a(this, cxt.oR));
      cxp $$3 = this.d($$2);
      cqe $$4 = this.a($$3, $$1, $$2);
      double $$5 = $$0.dB() - this.dB();
      double $$6 = $$0.e(0.3333333333333333) - $$4.dD();
      double $$7 = $$0.dH() - this.dH();
      double $$8 = Math.sqrt($$5 * $$5 + $$7 * $$7);
      if (this.dW() instanceof ash $$9) {
         cqq.a($$4, $$9, $$3, $$5, $$6 + $$8 * 0.2F, $$7, 1.6F, (float)(14 - $$9.al().a() * 4));
      }

      this.a(axf.xH, 1.0F, 1.0F / (this.dZ().i() * 0.4F + 0.8F));
   }

   protected cqe a(cxp $$0, float $$1, @Nullable cxp $$2) {
      return cqs.a(this, $$0, $$1, $$2);
   }

   @Override
   public boolean a(cyl $$0) {
      return $$0 == cxt.oR;
   }

   @Override
   public void a(ux $$0) {
      super.a($$0);
      this.t();
   }

   @Override
   public void a(bvs $$0, cxp $$1) {
      super.a($$0, $$1);
      if (!this.dW().C) {
         this.t();
      }
   }

   public boolean gp() {
      return this.cw();
   }
}
