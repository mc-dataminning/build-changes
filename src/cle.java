import java.time.LocalDate;
import java.time.temporal.ChronoField;
import javax.annotation.Nullable;

public abstract class cle extends clw implements cma {
   private static final int a = 20;
   private static final int b = 40;
   private final cdd<cle> c = new cdd<>(this, 1.0, 20, 15.0F);
   private final ccn d = new ccn(this, 1.2, false) {
      @Override
      public void e() {
         super.e();
         cle.this.w(false);
      }

      @Override
      public void d() {
         super.d();
         cle.this.w(true);
      }
   };

   protected cle(buq<? extends cle> $$0, dgg $$1) {
      super($$0, $$1);
      this.t();
   }

   @Override
   protected void B() {
      this.bS.a(2, new cdg(this));
      this.bS.a(3, new cbw(this, 1.0));
      this.bS.a(3, new cbk<>(this, chz.class, 6.0F, 1.0, 1.2));
      this.bS.a(5, new cdq(this, 1.0));
      this.bS.a(6, new ccl(this, cov.class, 8.0F));
      this.bS.a(6, new ccy(this));
      this.bT.a(1, new cdv(this));
      this.bT.a(2, new cdw<>(this, cov.class, true));
      this.bT.a(3, new cdw<>(this, chi.class, true));
      this.bT.a(3, new cdw<>(this, chx.class, 10, true, false, chx.bY));
   }

   public static bwm.a m() {
      return clw.gu().a(bwn.v, 0.25);
   }

   @Override
   protected void b(ji $$0, dwv $$1) {
      this.a(this.p(), 0.15F, 1.0F);
   }

   abstract avy p();

   @Override
   public void d_() {
      boolean $$0 = this.gh();
      if ($$0) {
         cwn $$1 = this.a(bur.f);
         if (!$$1.f()) {
            if ($$1.m()) {
               cwj $$2 = $$1.h();
               $$1.b($$1.o() + this.ae.a(2));
               if ($$1.o() >= $$1.p()) {
                  this.a($$2, bur.f);
                  this.a(bur.f, cwn.j);
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
      if (this.dm() instanceof bvn $$0) {
         this.aX = $$0.aX;
      }
   }

   @Override
   protected void a(azg $$0, bsg $$1) {
      super.a($$0, $$1);
      this.a(bur.a, new cwn(cwr.pa));
   }

   @Nullable
   @Override
   public bvy a(dgx $$0, bsg $$1, bup $$2, @Nullable bvy $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      azg $$4 = $$0.H_();
      this.a($$4, $$1);
      this.a($$0, $$4, $$1);
      this.t();
      this.a_($$4.i() < 0.55F * $$1.d());
      if (this.a(bur.f).f()) {
         LocalDate $$5 = LocalDate.now();
         int $$6 = $$5.get(ChronoField.DAY_OF_MONTH);
         int $$7 = $$5.get(ChronoField.MONTH_OF_YEAR);
         if ($$7 == 10 && $$6 == 31 && $$4.i() < 0.25F) {
            this.a(bur.f, new cwn($$4.i() < 0.1F ? djm.es : djm.er));
            this.bV[bur.f.b()] = 0.0F;
         }
      }

      return $$3;
   }

   public void t() {
      if (this.dW() != null && !this.dW().C) {
         this.bS.a(this.d);
         this.bS.a(this.c);
         cwn $$0 = this.b(cpq.a(this, cwr.pa));
         if ($$0.a(cwr.pa)) {
            int $$1 = this.x();
            if (this.dW().am() != bsf.d) {
               $$1 = this.gp();
            }

            this.c.c($$1);
            this.bS.a(4, this.c);
         } else {
            this.bS.a(4, this.d);
         }
      }
   }

   protected int x() {
      return 20;
   }

   protected int gp() {
      return 40;
   }

   @Override
   public void a(bvf $$0, float $$1) {
      cwn $$2 = this.b(cpq.a(this, cwr.pa));
      cwn $$3 = this.d($$2);
      cpc $$4 = this.a($$3, $$1, $$2);
      double $$5 = $$0.dB() - this.dB();
      double $$6 = $$0.e(0.3333333333333333) - $$4.dD();
      double $$7 = $$0.dH() - this.dH();
      double $$8 = Math.sqrt($$5 * $$5 + $$7 * $$7);
      if (this.dW() instanceof arc $$9) {
         cpo.a($$4, $$9, $$3, $$5, $$6 + $$8 * 0.2F, $$7, 1.6F, (float)(14 - $$9.am().a() * 4));
      }

      this.a(avz.xN, 1.0F, 1.0F / (this.dZ().i() * 0.4F + 0.8F));
   }

   protected cpc a(cwn $$0, float $$1, @Nullable cwn $$2) {
      return cpq.a(this, $$0, $$1, $$2);
   }

   @Override
   public boolean a(cxj $$0) {
      return $$0 == cwr.pa;
   }

   @Override
   public axe<cwj> W() {
      return awx.bR;
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      this.t();
   }

   @Override
   public void a(bur $$0, cwn $$1) {
      super.a($$0, $$1);
      if (!this.dW().C) {
         this.t();
      }
   }

   public boolean gq() {
      return this.cw();
   }
}
