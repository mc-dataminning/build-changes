import java.time.LocalDate;
import java.time.temporal.ChronoField;
import javax.annotation.Nullable;

public abstract class ckl extends cld implements clh {
   private static final int b = 20;
   private static final int c = 40;
   private final cck<ckl> d = new cck<>(this, 1.0, 20, 15.0F);
   private final cbu e = new cbu(this, 1.2, false) {
      @Override
      public void e() {
         super.e();
         ckl.this.w(false);
      }

      @Override
      public void d() {
         super.d();
         ckl.this.w(true);
      }
   };

   protected ckl(bty<? extends ckl> $$0, dej $$1) {
      super($$0, $$1);
      this.y();
   }

   @Override
   protected void D() {
      this.bS.a(2, new ccn(this));
      this.bS.a(3, new cbd(this, 1.0));
      this.bS.a(3, new car<>(this, chg.class, 6.0F, 1.0, 1.2));
      this.bS.a(5, new ccx(this, 1.0));
      this.bS.a(6, new cbs(this, cnx.class, 8.0F));
      this.bS.a(6, new ccf(this));
      this.bT.a(1, new cdc(this));
      this.bT.a(2, new cdd<>(this, cnx.class, true));
      this.bT.a(3, new cdd<>(this, cgp.class, true));
      this.bT.a(3, new cdd<>(this, che.class, 10, true, false, che.bY));
   }

   public static bvt.a q() {
      return cld.gu().a(bvu.v, 0.25);
   }

   @Override
   protected void b(jf $$0, dus $$1) {
      this.a(this.t(), 0.15F, 1.0F);
   }

   abstract awf t();

   @Override
   public void n_() {
      boolean $$0 = this.gi();
      if ($$0) {
         cvs $$1 = this.a(btz.f);
         if (!$$1.f()) {
            if ($$1.m()) {
               cvn $$2 = $$1.h();
               $$1.b($$1.o() + this.af.a(2));
               if ($$1.o() >= $$1.p()) {
                  this.a($$2, btz.f);
                  this.a(btz.f, cvs.k);
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
      if (this.dh() instanceof buv $$0) {
         this.aT = $$0.aT;
      }
   }

   @Override
   protected void a(azn $$0, brq $$1) {
      super.a($$0, $$1);
      this.a(btz.a, new cvs(cvw.ow));
   }

   @Nullable
   @Override
   public bvf a(dez $$0, brq $$1, btx $$2, @Nullable bvf $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      azn $$4 = $$0.D_();
      this.a($$4, $$1);
      this.a($$0, $$4, $$1);
      this.y();
      this.a_($$4.i() < 0.55F * $$1.d());
      if (this.a(btz.f).f()) {
         LocalDate $$5 = LocalDate.now();
         int $$6 = $$5.get(ChronoField.DAY_OF_MONTH);
         int $$7 = $$5.get(ChronoField.MONTH_OF_YEAR);
         if ($$7 == 10 && $$6 == 31 && $$4.i() < 0.25F) {
            this.a(btz.f, new cvs($$4.i() < 0.1F ? dho.ef : dho.ee));
            this.bV[btz.f.b()] = 0.0F;
         }
      }

      return $$3;
   }

   public void y() {
      if (this.dS() != null && !this.dS().B) {
         this.bS.a(this.e);
         this.bS.a(this.d);
         cvs $$0 = this.b(cot.a(this, cvw.ow));
         if ($$0.a(cvw.ow)) {
            int $$1 = this.go();
            if (this.dS().am() != brp.d) {
               $$1 = this.gp();
            }

            this.d.c($$1);
            this.bS.a(4, this.d);
         } else {
            this.bS.a(4, this.e);
         }
      }
   }

   protected int go() {
      return 20;
   }

   protected int gp() {
      return 40;
   }

   @Override
   public void a(bun $$0, float $$1) {
      cvs $$2 = this.b(cot.a(this, cvw.ow));
      cvs $$3 = this.f($$2);
      coe $$4 = this.a($$3, $$1, $$2);
      double $$5 = $$0.dx() - this.dx();
      double $$6 = $$0.e(0.3333333333333333) - $$4.dz();
      double $$7 = $$0.dD() - this.dD();
      double $$8 = Math.sqrt($$5 * $$5 + $$7 * $$7);
      if (this.dS() instanceof arj $$9) {
         cor.a($$4, $$9, $$3, $$5, $$6 + $$8 * 0.2F, $$7, 1.6F, (float)(14 - $$9.am().a() * 4));
      }

      this.a(awg.xo, 1.0F, 1.0F / (this.dV().i() * 0.4F + 0.8F));
   }

   protected coe a(cvs $$0, float $$1, @Nullable cvs $$2) {
      return cot.a(this, $$0, $$1, $$2);
   }

   @Override
   public boolean a(cwo $$0) {
      return $$0 == cvw.ow;
   }

   @Override
   public void a(ug $$0) {
      super.a($$0);
      this.y();
   }

   @Override
   public void a(btz $$0, cvs $$1) {
      super.a($$0, $$1);
      if (!this.dS().B) {
         this.y();
      }
   }

   public boolean gq() {
      return this.ct();
   }
}
