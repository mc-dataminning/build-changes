import java.time.LocalDate;
import java.time.temporal.ChronoField;
import javax.annotation.Nullable;

public abstract class ckz extends clr implements clv {
   private static final int b = 20;
   private static final int c = 40;
   private final ccy<ckz> d = new ccy<>(this, 1.0, 20, 15.0F);
   private final cci e = new cci(this, 1.2, false) {
      @Override
      public void e() {
         super.e();
         ckz.this.w(false);
      }

      @Override
      public void d() {
         super.d();
         ckz.this.w(true);
      }
   };

   protected ckz(bul<? extends ckz> $$0, dfb $$1) {
      super($$0, $$1);
      this.y();
   }

   @Override
   protected void D() {
      this.bS.a(2, new cdb(this));
      this.bS.a(3, new cbr(this, 1.0));
      this.bS.a(3, new cbf<>(this, chu.class, 6.0F, 1.0, 1.2));
      this.bS.a(5, new cdl(this, 1.0));
      this.bS.a(6, new ccg(this, com.class, 8.0F));
      this.bS.a(6, new cct(this));
      this.bT.a(1, new cdq(this));
      this.bT.a(2, new cdr<>(this, com.class, true));
      this.bT.a(3, new cdr<>(this, chd.class, true));
      this.bT.a(3, new cdr<>(this, chs.class, 10, true, false, chs.bY));
   }

   public static bwh.a q() {
      return clr.gA().a(bwi.v, 0.25);
   }

   @Override
   protected void b(jh $$0, dvj $$1) {
      this.a(this.t(), 0.15F, 1.0F);
   }

   abstract awk t();

   @Override
   public void n_() {
      boolean $$0 = this.gm();
      if ($$0) {
         cwb $$1 = this.a(bum.f);
         if (!$$1.f()) {
            if ($$1.m()) {
               cvx $$2 = $$1.h();
               $$1.b($$1.o() + this.af.a(2));
               if ($$1.o() >= $$1.p()) {
                  this.a($$2, bum.f);
                  this.a(bum.f, cwb.k);
               }
            }

            $$0 = false;
         }

         if ($$0) {
            this.d(8.0F);
         }
      }

      super.n_();
   }

   @Override
   public void u() {
      super.u();
      if (this.dm() instanceof bvi $$0) {
         this.aX = $$0.aX;
      }
   }

   @Override
   protected void a(azs $$0, bsb $$1) {
      super.a($$0, $$1);
      this.a(bum.a, new cwb(cwf.ow));
   }

   @Nullable
   @Override
   public bvt a(dfr $$0, bsb $$1, buk $$2, @Nullable bvt $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      azs $$4 = $$0.E_();
      this.a($$4, $$1);
      this.a($$0, $$4, $$1);
      this.y();
      this.a_($$4.i() < 0.55F * $$1.d());
      if (this.a(bum.f).f()) {
         LocalDate $$5 = LocalDate.now();
         int $$6 = $$5.get(ChronoField.DAY_OF_MONTH);
         int $$7 = $$5.get(ChronoField.MONTH_OF_YEAR);
         if ($$7 == 10 && $$6 == 31 && $$4.i() < 0.25F) {
            this.a(bum.f, new cwb($$4.i() < 0.1F ? dig.ef : dig.ee));
            this.bV[bum.f.b()] = 0.0F;
         }
      }

      return $$3;
   }

   public void y() {
      if (this.dX() != null && !this.dX().C) {
         this.bS.a(this.e);
         this.bS.a(this.d);
         cwb $$0 = this.b(cpi.a(this, cwf.ow));
         if ($$0.a(cwf.ow)) {
            int $$1 = this.gu();
            if (this.dX().ak() != bsa.d) {
               $$1 = this.gv();
            }

            this.d.c($$1);
            this.bS.a(4, this.d);
         } else {
            this.bS.a(4, this.e);
         }
      }
   }

   protected int gu() {
      return 20;
   }

   protected int gv() {
      return 40;
   }

   @Override
   public void a(bva $$0, float $$1) {
      cwb $$2 = this.b(cpi.a(this, cwf.ow));
      cwb $$3 = this.d($$2);
      cou $$4 = this.a($$3, $$1, $$2);
      double $$5 = $$0.dC() - this.dC();
      double $$6 = $$0.e(0.3333333333333333) - $$4.dE();
      double $$7 = $$0.dI() - this.dI();
      double $$8 = Math.sqrt($$5 * $$5 + $$7 * $$7);
      if (this.dX() instanceof arn $$9) {
         cpg.a($$4, $$9, $$3, $$5, $$6 + $$8 * 0.2F, $$7, 1.6F, (float)(14 - $$9.ak().a() * 4));
      }

      this.a(awl.xm, 1.0F, 1.0F / (this.ea().i() * 0.4F + 0.8F));
   }

   protected cou a(cwb $$0, float $$1, @Nullable cwb $$2) {
      return cpi.a(this, $$0, $$1, $$2);
   }

   @Override
   public boolean a(cwx $$0) {
      return $$0 == cwf.ow;
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
      this.y();
   }

   @Override
   public void a(bum $$0, cwb $$1) {
      super.a($$0, $$1);
      if (!this.dX().C) {
         this.y();
      }
   }

   public boolean gw() {
      return this.cx();
   }
}
