import java.time.LocalDate;
import java.time.temporal.ChronoField;
import javax.annotation.Nullable;

public abstract class cki extends cla implements cle {
   private static final int b = 20;
   private static final int c = 40;
   private final cch<cki> d = new cch<>(this, 1.0, 20, 15.0F);
   private final cbr e = new cbr(this, 1.2, false) {
      @Override
      public void e() {
         super.e();
         cki.this.w(false);
      }

      @Override
      public void d() {
         super.d();
         cki.this.w(true);
      }
   };

   protected cki(btv<? extends cki> $$0, deg $$1) {
      super($$0, $$1);
      this.y();
   }

   @Override
   protected void D() {
      this.bS.a(2, new cck(this));
      this.bS.a(3, new cba(this, 1.0));
      this.bS.a(3, new cao<>(this, chd.class, 6.0F, 1.0, 1.2));
      this.bS.a(5, new ccu(this, 1.0));
      this.bS.a(6, new cbp(this, cnu.class, 8.0F));
      this.bS.a(6, new ccc(this));
      this.bT.a(1, new ccz(this));
      this.bT.a(2, new cda<>(this, cnu.class, true));
      this.bT.a(3, new cda<>(this, cgm.class, true));
      this.bT.a(3, new cda<>(this, chb.class, 10, true, false, chb.bY));
   }

   public static bvq.a q() {
      return cla.gv().a(bvr.v, 0.25);
   }

   @Override
   protected void b(je $$0, duo $$1) {
      this.a(this.t(), 0.15F, 1.0F);
   }

   abstract awd t();

   @Override
   public void m_() {
      boolean $$0 = this.gj();
      if ($$0) {
         cvp $$1 = this.a(btw.f);
         if (!$$1.f()) {
            if ($$1.m()) {
               cvk $$2 = $$1.h();
               $$1.b($$1.o() + this.af.a(2));
               if ($$1.o() >= $$1.p()) {
                  this.a($$2, btw.f);
                  this.a(btw.f, cvp.k);
               }
            }

            $$0 = false;
         }

         if ($$0) {
            this.d(8.0F);
         }
      }

      super.m_();
   }

   @Override
   public void u() {
      super.u();
      if (this.dh() instanceof bus $$0) {
         this.aT = $$0.aT;
      }
   }

   @Override
   protected void a(azl $$0, brn $$1) {
      super.a($$0, $$1);
      this.a(btw.a, new cvp(cvt.ow));
   }

   @Nullable
   @Override
   public bvc a(dew $$0, brn $$1, btu $$2, @Nullable bvc $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      azl $$4 = $$0.C_();
      this.a($$4, $$1);
      this.a($$0, $$4, $$1);
      this.y();
      this.a_($$4.i() < 0.55F * $$1.d());
      if (this.a(btw.f).f()) {
         LocalDate $$5 = LocalDate.now();
         int $$6 = $$5.get(ChronoField.DAY_OF_MONTH);
         int $$7 = $$5.get(ChronoField.MONTH_OF_YEAR);
         if ($$7 == 10 && $$6 == 31 && $$4.i() < 0.25F) {
            this.a(btw.f, new cvp($$4.i() < 0.1F ? dhl.ef : dhl.ee));
            this.bV[btw.f.b()] = 0.0F;
         }
      }

      return $$3;
   }

   public void y() {
      if (this.dS() != null && !this.dS().B) {
         this.bS.a(this.e);
         this.bS.a(this.d);
         cvp $$0 = this.b(coq.a(this, cvt.ow));
         if ($$0.a(cvt.ow)) {
            int $$1 = this.gp();
            if (this.dS().am() != brm.d) {
               $$1 = this.gq();
            }

            this.d.c($$1);
            this.bS.a(4, this.d);
         } else {
            this.bS.a(4, this.e);
         }
      }
   }

   protected int gp() {
      return 20;
   }

   protected int gq() {
      return 40;
   }

   @Override
   public void a(buk $$0, float $$1) {
      cvp $$2 = this.b(coq.a(this, cvt.ow));
      cvp $$3 = this.f($$2);
      cob $$4 = this.a($$3, $$1, $$2);
      double $$5 = $$0.dx() - this.dx();
      double $$6 = $$0.e(0.3333333333333333) - $$4.dz();
      double $$7 = $$0.dD() - this.dD();
      double $$8 = Math.sqrt($$5 * $$5 + $$7 * $$7);
      if (this.dS() instanceof arh $$9) {
         coo.a($$4, $$9, $$3, $$5, $$6 + $$8 * 0.2F, $$7, 1.6F, (float)(14 - $$9.am().a() * 4));
      }

      this.a(awe.xo, 1.0F, 1.0F / (this.dV().i() * 0.4F + 0.8F));
   }

   protected cob a(cvp $$0, float $$1, @Nullable cvp $$2) {
      return coq.a(this, $$0, $$1, $$2);
   }

   @Override
   public boolean a(cwl $$0) {
      return $$0 == cvt.ow;
   }

   @Override
   public void a(uf $$0) {
      super.a($$0);
      this.y();
   }

   @Override
   public void a(btw $$0, cvp $$1) {
      super.a($$0, $$1);
      if (!this.dS().B) {
         this.y();
      }
   }

   public boolean gr() {
      return this.ct();
   }
}
