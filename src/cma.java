import java.time.LocalDate;
import java.time.temporal.ChronoField;
import javax.annotation.Nullable;

public abstract class cma extends cms implements cmw {
   private static final int a = 20;
   private static final int b = 40;
   private final cdw<cma> c = new cdw<>(this, 1.0, 20, 15.0F);
   private final cdg d = new cdg(this, 1.2, false) {
      @Override
      public void e() {
         super.e();
         cma.this.v(false);
      }

      @Override
      public void d() {
         super.d();
         cma.this.v(true);
      }
   };

   protected cma(bvi<? extends cma> $$0, dgz $$1) {
      super($$0, $$1);
      this.n();
   }

   @Override
   protected void D() {
      this.bC.a(2, new cdz(this));
      this.bC.a(3, new ccp(this, 1.0));
      this.bC.a(3, new ccd<>(this, civ.class, 6.0F, 1.0, 1.2));
      this.bC.a(5, new cej(this, 1.0));
      this.bC.a(6, new cde(this, cpr.class, 8.0F));
      this.bC.a(6, new cdr(this));
      this.bD.a(1, new ceo(this));
      this.bD.a(2, new cep<>(this, cpr.class, true));
      this.bD.a(3, new cep<>(this, cib.class, true));
      this.bD.a(3, new cep<>(this, cit.class, 10, true, false, cit.bF));
   }

   public static bxf.a j() {
      return cms.gv().a(bxg.v, 0.25);
   }

   @Override
   protected void b(ji $$0, dxq $$1) {
      this.a(this.m(), 0.15F, 1.0F);
   }

   abstract avz m();

   @Override
   public void k_() {
      boolean $$0 = this.gm();
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

      super.k_();
   }

   @Override
   public void r() {
      super.r();
      if (this.dk() instanceof bwg $$0) {
         this.aV = $$0.aV;
      }
   }

   @Override
   protected void a(azh $$0, bsw $$1) {
      super.a($$0, $$1);
      this.a(bvj.a, new cxh(cxl.pc));
   }

   @Nullable
   @Override
   public bwr a(dhq $$0, bsw $$1, bvh $$2, @Nullable bwr $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      azh $$4 = $$0.C_();
      this.a($$4, $$1);
      this.a($$0, $$4, $$1);
      this.n();
      this.a_($$4.i() < 0.55F * $$1.d());
      if (this.a(bvj.f).f()) {
         LocalDate $$5 = LocalDate.now();
         int $$6 = $$5.get(ChronoField.DAY_OF_MONTH);
         int $$7 = $$5.get(ChronoField.MONTH_OF_YEAR);
         if ($$7 == 10 && $$6 == 31 && $$4.i() < 0.25F) {
            this.a(bvj.f, new cxh($$4.i() < 0.1F ? dkg.es : dkg.er));
            this.a(bvj.f, 0.0F);
         }
      }

      return $$3;
   }

   public void n() {
      if (this.dU() != null && !this.dU().C) {
         this.bC.a(this.d);
         this.bC.a(this.c);
         cxh $$0 = this.b(cqm.a(this, cxl.pc));
         if ($$0.a(cxl.pc)) {
            int $$1 = this.q();
            if (this.dU().an() != bsv.d) {
               $$1 = this.t();
            }

            this.c.c($$1);
            this.bC.a(4, this.c);
         } else {
            this.bC.a(4, this.d);
         }
      }
   }

   protected int q() {
      return 20;
   }

   protected int t() {
      return 40;
   }

   @Override
   public void a(bvy $$0, float $$1) {
      cxh $$2 = this.b(cqm.a(this, cxl.pc));
      cxh $$3 = this.d($$2);
      cpy $$4 = this.a($$3, $$1, $$2);
      double $$5 = $$0.dz() - this.dz();
      double $$6 = $$0.e(0.3333333333333333) - $$4.dB();
      double $$7 = $$0.dF() - this.dF();
      double $$8 = Math.sqrt($$5 * $$5 + $$7 * $$7);
      if (this.dU() instanceof ard $$9) {
         cqk.a($$4, $$9, $$3, $$5, $$6 + $$8 * 0.2F, $$7, 1.6F, (float)(14 - $$9.an().a() * 4));
      }

      this.a(awa.xX, 1.0F, 1.0F / (this.dX().i() * 0.4F + 0.8F));
   }

   protected cpy a(cxh $$0, float $$1, @Nullable cxh $$2) {
      return cqm.a(this, $$0, $$1, $$2);
   }

   @Override
   public boolean a(cyc $$0) {
      return $$0 == cxl.pc;
   }

   @Override
   public axf<cxd> Y() {
      return awy.bS;
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      this.n();
   }

   @Override
   public void a(bvj $$0, cxh $$1) {
      super.a($$0, $$1);
      if (!this.dU().C) {
         this.n();
      }
   }

   public boolean x() {
      return this.cv();
   }
}
