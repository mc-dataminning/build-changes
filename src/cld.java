import java.time.LocalDate;
import java.time.temporal.ChronoField;
import javax.annotation.Nullable;

public abstract class cld extends clv implements clz {
   private static final int b = 20;
   private static final int c = 40;
   private final cdc<cld> d = new cdc<>(this, 1.0, 20, 15.0F);
   private final ccm e = new ccm(this, 1.2, false) {
      @Override
      public void e() {
         super.e();
         cld.this.w(false);
      }

      @Override
      public void d() {
         super.d();
         cld.this.w(true);
      }
   };

   protected cld(bup<? extends cld> $$0, dff $$1) {
      super($$0, $$1);
      this.y();
   }

   @Override
   protected void D() {
      this.bS.a(2, new cdf(this));
      this.bS.a(3, new cbv(this, 1.0));
      this.bS.a(3, new cbj<>(this, chy.class, 6.0F, 1.0, 1.2));
      this.bS.a(5, new cdp(this, 1.0));
      this.bS.a(6, new cck(this, cor.class, 8.0F));
      this.bS.a(6, new ccx(this));
      this.bT.a(1, new cdu(this));
      this.bT.a(2, new cdv<>(this, cor.class, true));
      this.bT.a(3, new cdv<>(this, chh.class, true));
      this.bT.a(3, new cdv<>(this, chw.class, 10, true, false, chw.bY));
   }

   public static bwl.a q() {
      return clv.gB().a(bwm.v, 0.25);
   }

   @Override
   protected void b(jh $$0, dvo $$1) {
      this.a(this.t(), 0.15F, 1.0F);
   }

   abstract awn t();

   @Override
   public void n_() {
      boolean $$0 = this.gn();
      if ($$0) {
         cwf $$1 = this.a(buq.f);
         if (!$$1.f()) {
            if ($$1.m()) {
               cwb $$2 = $$1.h();
               $$1.b($$1.o() + this.af.a(2));
               if ($$1.o() >= $$1.p()) {
                  this.a($$2, buq.f);
                  this.a(buq.f, cwf.k);
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
      if (this.dn() instanceof bvm $$0) {
         this.aX = $$0.aX;
      }
   }

   @Override
   protected void a(azv $$0, bsf $$1) {
      super.a($$0, $$1);
      this.a(buq.a, new cwf(cwj.ow));
   }

   @Nullable
   @Override
   public bvx a(dfw $$0, bsf $$1, buo $$2, @Nullable bvx $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      azv $$4 = $$0.E_();
      this.a($$4, $$1);
      this.a($$0, $$4, $$1);
      this.y();
      this.a_($$4.i() < 0.55F * $$1.d());
      if (this.a(buq.f).f()) {
         LocalDate $$5 = LocalDate.now();
         int $$6 = $$5.get(ChronoField.DAY_OF_MONTH);
         int $$7 = $$5.get(ChronoField.MONTH_OF_YEAR);
         if ($$7 == 10 && $$6 == 31 && $$4.i() < 0.25F) {
            this.a(buq.f, new cwf($$4.i() < 0.1F ? dil.ef : dil.ee));
            this.bV[buq.f.b()] = 0.0F;
         }
      }

      return $$3;
   }

   public void y() {
      if (this.dY() != null && !this.dY().C) {
         this.bS.a(this.e);
         this.bS.a(this.d);
         cwf $$0 = this.b(cpm.a(this, cwj.ow));
         if ($$0.a(cwj.ow)) {
            int $$1 = this.gv();
            if (this.dY().ak() != bse.d) {
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
   public void a(bve $$0, float $$1) {
      cwf $$2 = this.b(cpm.a(this, cwj.ow));
      cwf $$3 = this.d($$2);
      coy $$4 = this.a($$3, $$1, $$2);
      double $$5 = $$0.dD() - this.dD();
      double $$6 = $$0.e(0.3333333333333333) - $$4.dF();
      double $$7 = $$0.dJ() - this.dJ();
      double $$8 = Math.sqrt($$5 * $$5 + $$7 * $$7);
      if (this.dY() instanceof arq $$9) {
         cpk.a($$4, $$9, $$3, $$5, $$6 + $$8 * 0.2F, $$7, 1.6F, (float)(14 - $$9.ak().a() * 4));
      }

      this.a(awo.xm, 1.0F, 1.0F / (this.eb().i() * 0.4F + 0.8F));
   }

   protected coy a(cwf $$0, float $$1, @Nullable cwf $$2) {
      return cpm.a(this, $$0, $$1, $$2);
   }

   @Override
   public boolean a(cxb $$0) {
      return $$0 == cwj.ow;
   }

   @Override
   public void a(un $$0) {
      super.a($$0);
      this.y();
   }

   @Override
   public void a(buq $$0, cwf $$1) {
      super.a($$0, $$1);
      if (!this.dY().C) {
         this.y();
      }
   }

   public boolean gx() {
      return this.cy();
   }
}
