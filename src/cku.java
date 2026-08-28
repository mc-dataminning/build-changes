import java.time.LocalDate;
import java.time.temporal.ChronoField;
import javax.annotation.Nullable;

public abstract class cku extends clm implements clq {
   private static final int b = 20;
   private static final int c = 40;
   private final cct<cku> d = new cct<>(this, 1.0, 20, 15.0F);
   private final ccd e = new ccd(this, 1.2, false) {
      @Override
      public void e() {
         super.e();
         cku.this.w(false);
      }

      @Override
      public void d() {
         super.d();
         cku.this.w(true);
      }
   };

   protected cku(bug<? extends cku> $$0, dev $$1) {
      super($$0, $$1);
      this.y();
   }

   @Override
   protected void D() {
      this.bS.a(2, new ccw(this));
      this.bS.a(3, new cbm(this, 1.0));
      this.bS.a(3, new cba<>(this, chp.class, 6.0F, 1.0, 1.2));
      this.bS.a(5, new cdg(this, 1.0));
      this.bS.a(6, new ccb(this, coh.class, 8.0F));
      this.bS.a(6, new cco(this));
      this.bT.a(1, new cdl(this));
      this.bT.a(2, new cdm<>(this, coh.class, true));
      this.bT.a(3, new cdm<>(this, cgy.class, true));
      this.bT.a(3, new cdm<>(this, chn.class, 10, true, false, chn.bY));
   }

   public static bwc.a q() {
      return clm.gB().a(bwd.v, 0.25);
   }

   @Override
   protected void b(jg $$0, dvd $$1) {
      this.a(this.t(), 0.15F, 1.0F);
   }

   abstract awj t();

   @Override
   public void n_() {
      boolean $$0 = this.gn();
      if ($$0) {
         cvx $$1 = this.a(buh.f);
         if (!$$1.f()) {
            if ($$1.m()) {
               cvt $$2 = $$1.h();
               $$1.b($$1.o() + this.af.a(2));
               if ($$1.o() >= $$1.p()) {
                  this.a($$2, buh.f);
                  this.a(buh.f, cvx.k);
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
      if (this.dm() instanceof bvd $$0) {
         this.aU = $$0.aU;
      }
   }

   @Override
   protected void a(azr $$0, brw $$1) {
      super.a($$0, $$1);
      this.a(buh.a, new cvx(cwb.ow));
   }

   @Nullable
   @Override
   public bvo a(dfl $$0, brw $$1, buf $$2, @Nullable bvo $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      azr $$4 = $$0.E_();
      this.a($$4, $$1);
      this.a($$0, $$4, $$1);
      this.y();
      this.a_($$4.i() < 0.55F * $$1.d());
      if (this.a(buh.f).f()) {
         LocalDate $$5 = LocalDate.now();
         int $$6 = $$5.get(ChronoField.DAY_OF_MONTH);
         int $$7 = $$5.get(ChronoField.MONTH_OF_YEAR);
         if ($$7 == 10 && $$6 == 31 && $$4.i() < 0.25F) {
            this.a(buh.f, new cvx($$4.i() < 0.1F ? dia.ef : dia.ee));
            this.bV[buh.f.b()] = 0.0F;
         }
      }

      return $$3;
   }

   public void y() {
      if (this.dX() != null && !this.dX().C) {
         this.bS.a(this.e);
         this.bS.a(this.d);
         cvx $$0 = this.b(cpd.a(this, cwb.ow));
         if ($$0.a(cwb.ow)) {
            int $$1 = this.gv();
            if (this.dX().am() != brv.d) {
               $$1 = this.gw();
            }

            this.d.c($$1);
            this.bS.a(4, this.d);
         } else {
            this.bS.a(4, this.e);
         }
      }
   }

   protected int gv() {
      return 20;
   }

   protected int gw() {
      return 40;
   }

   @Override
   public void a(buv $$0, float $$1) {
      cvx $$2 = this.b(cpd.a(this, cwb.ow));
      cvx $$3 = this.d($$2);
      cop $$4 = this.a($$3, $$1, $$2);
      double $$5 = $$0.dC() - this.dC();
      double $$6 = $$0.e(0.3333333333333333) - $$4.dE();
      double $$7 = $$0.dI() - this.dI();
      double $$8 = Math.sqrt($$5 * $$5 + $$7 * $$7);
      if (this.dX() instanceof arm $$9) {
         cpb.a($$4, $$9, $$3, $$5, $$6 + $$8 * 0.2F, $$7, 1.6F, (float)(14 - $$9.am().a() * 4));
      }

      this.a(awk.xm, 1.0F, 1.0F / (this.ea().i() * 0.4F + 0.8F));
   }

   protected cop a(cvx $$0, float $$1, @Nullable cvx $$2) {
      return cpd.a(this, $$0, $$1, $$2);
   }

   @Override
   public boolean a(cwt $$0) {
      return $$0 == cwb.ow;
   }

   @Override
   public void a(uj $$0) {
      super.a($$0);
      this.y();
   }

   @Override
   public void a(buh $$0, cvx $$1) {
      super.a($$0, $$1);
      if (!this.dX().C) {
         this.y();
      }
   }

   public boolean gx() {
      return this.cx();
   }
}
