import java.time.LocalDate;
import java.time.temporal.ChronoField;
import javax.annotation.Nullable;

public abstract class caj extends cba implements cbe {
   private final bst<caj> b = new bst<>(this, 1.0, 20, 15.0F);
   private final bsd c = new bsd(this, 1.2, false) {
      @Override
      public void d() {
         super.d();
         caj.this.v(false);
      }

      @Override
      public void c() {
         super.c();
         caj.this.v(true);
      }
   };

   protected caj(bkm<? extends caj> $$0, crs $$1) {
      super($$0, $$1);
      this.y();
   }

   @Override
   protected void z() {
      this.bO.a(2, new bsw(this));
      this.bO.a(3, new brm(this, 1.0));
      this.bO.a(3, new bra<>(this, bxm.class, 6.0F, 1.0, 1.2));
      this.bO.a(5, new btg(this, 1.0));
      this.bO.a(6, new bsb(this, cdm.class, 8.0F));
      this.bO.a(6, new bso(this));
      this.bP.a(1, new btl(this));
      this.bP.a(2, new btm<>(this, cdm.class, true));
      this.bP.a(3, new btm<>(this, bwv.class, true));
      this.bP.a(3, new btm<>(this, bxk.class, 10, true, false, bxk.bU));
   }

   public static bmd.a s() {
      return cba.gk().a(bme.m, 0.25);
   }

   @Override
   protected void b(ht $$0, dgw $$1) {
      this.a(this.t(), 0.15F, 1.0F);
   }

   abstract aqm t();

   @Override
   public bld eR() {
      return bld.b;
   }

   @Override
   public void c_() {
      boolean $$0 = this.fY();
      if ($$0) {
         clb $$1 = this.c(bkn.f);
         if (!$$1.b()) {
            if ($$1.i()) {
               $$1.b($$1.k() + this.ag.a(2));
               if ($$1.k() >= $$1.l()) {
                  this.d(bkn.f);
                  this.a(bkn.f, clb.b);
               }
            }

            $$0 = false;
         }

         if ($$0) {
            this.g(8);
         }
      }

      super.c_();
   }

   @Override
   public void by() {
      super.by();
      if (this.cZ() instanceof blh $$0) {
         this.aU = $$0.aU;
      }
   }

   @Override
   protected void a(ato $$0, bio $$1) {
      super.a($$0, $$1);
      this.a(bkn.a, new clb(cle.nG));
   }

   @Nullable
   @Override
   public blr a(csh $$0, bio $$1, blc $$2, @Nullable blr $$3, @Nullable rz $$4) {
      $$3 = super.a($$0, $$1, $$2, $$3, $$4);
      ato $$5 = $$0.E_();
      this.a($$5, $$1);
      this.b($$5, $$1);
      this.y();
      this.s($$5.i() < 0.55F * $$1.d());
      if (this.c(bkn.f).b()) {
         LocalDate $$6 = LocalDate.now();
         int $$7 = $$6.get(ChronoField.DAY_OF_MONTH);
         int $$8 = $$6.get(ChronoField.MONTH_OF_YEAR);
         if ($$8 == 10 && $$7 == 31 && $$5.i() < 0.25F) {
            this.a(bkn.f, new clb($$5.i() < 0.1F ? cuv.ef : cuv.ee));
            this.bR[bkn.f.b()] = 0.0F;
         }
      }

      return $$3;
   }

   public void y() {
      if (this.dL() != null && !this.dL().B) {
         this.bO.a(this.c);
         this.bO.a(this.b);
         clb $$0 = this.b(cef.a(this, cle.nG));
         if ($$0.a(cle.nG)) {
            int $$1 = 20;
            if (this.dL().ai() != bin.d) {
               $$1 = 40;
            }

            this.b.c($$1);
            this.bO.a(4, this.b);
         } else {
            this.bO.a(4, this.c);
         }
      }
   }

   @Override
   public void a(bky $$0, float $$1) {
      clb $$2 = this.g(this.b(cef.a(this, cle.nG)));
      cds $$3 = this.b($$2, $$1);
      double $$4 = $$0.dq() - this.dq();
      double $$5 = $$0.e(0.3333333333333333) - $$3.ds();
      double $$6 = $$0.dw() - this.dw();
      double $$7 = Math.sqrt($$4 * $$4 + $$6 * $$6);
      $$3.c($$4, $$5 + $$7 * 0.2F, $$6, 1.6F, (float)(14 - this.dL().ai().a() * 4));
      this.a(aqn.vE, 1.0F, 1.0F / (this.ef().i() * 0.4F + 0.8F));
      this.dL().b($$3);
   }

   protected cds b(clb $$0, float $$1) {
      return cef.a(this, $$0, $$1);
   }

   @Override
   public boolean a(clr $$0) {
      return $$0 == cle.nG;
   }

   @Override
   public void a(rz $$0) {
      super.a($$0);
      this.y();
   }

   @Override
   public void a(bkn $$0, clb $$1) {
      super.a($$0, $$1);
      if (!this.dL().B) {
         this.y();
      }
   }

   @Override
   protected float b(blk $$0, bkj $$1) {
      return 1.74F;
   }

   @Override
   protected float l(bki $$0) {
      return -0.7F;
   }

   public boolean ge() {
      return this.ck();
   }
}
