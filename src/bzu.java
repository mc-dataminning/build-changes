import java.time.LocalDate;
import java.time.temporal.ChronoField;
import javax.annotation.Nullable;

public abstract class bzu extends cal implements cap {
   private final bse<bzu> b = new bse<>(this, 1.0, 20, 15.0F);
   private final bro c = new bro(this, 1.2, false) {
      @Override
      public void d() {
         super.d();
         bzu.this.v(false);
      }

      @Override
      public void c() {
         super.c();
         bzu.this.v(true);
      }
   };

   protected bzu(bjx<? extends bzu> $$0, cqz $$1) {
      super($$0, $$1);
      this.y();
   }

   @Override
   protected void z() {
      this.bO.a(2, new bsh(this));
      this.bO.a(3, new bqx(this, 1.0));
      this.bO.a(3, new bql<>(this, bwx.class, 6.0F, 1.0, 1.2));
      this.bO.a(5, new bsr(this, 1.0));
      this.bO.a(6, new brm(this, ccx.class, 8.0F));
      this.bO.a(6, new brz(this));
      this.bP.a(1, new bsw(this));
      this.bP.a(2, new bsx<>(this, ccx.class, true));
      this.bP.a(3, new bsx<>(this, bwg.class, true));
      this.bP.a(3, new bsx<>(this, bwv.class, 10, true, false, bwv.bU));
   }

   public static blo.a s() {
      return cal.gk().a(blp.m, 0.25);
   }

   @Override
   protected void b(ht $$0, dgb $$1) {
      this.a(this.t(), 0.15F, 1.0F);
   }

   abstract aqc t();

   @Override
   public bko eR() {
      return bko.b;
   }

   @Override
   public void c_() {
      boolean $$0 = this.fY();
      if ($$0) {
         ckj $$1 = this.c(bjy.f);
         if (!$$1.b()) {
            if ($$1.i()) {
               $$1.b($$1.k() + this.ag.a(2));
               if ($$1.k() >= $$1.l()) {
                  this.d(bjy.f);
                  this.a(bjy.f, ckj.b);
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
      if (this.cZ() instanceof bks $$0) {
         this.aU = $$0.aU;
      }
   }

   @Override
   protected void a(ate $$0, bhz $$1) {
      super.a($$0, $$1);
      this.a(bjy.a, new ckj(ckm.nG));
   }

   @Nullable
   @Override
   public blc a(cro $$0, bhz $$1, bkn $$2, @Nullable blc $$3, @Nullable rt $$4) {
      $$3 = super.a($$0, $$1, $$2, $$3, $$4);
      ate $$5 = $$0.E_();
      this.a($$5, $$1);
      this.b($$5, $$1);
      this.y();
      this.s($$5.i() < 0.55F * $$1.d());
      if (this.c(bjy.f).b()) {
         LocalDate $$6 = LocalDate.now();
         int $$7 = $$6.get(ChronoField.DAY_OF_MONTH);
         int $$8 = $$6.get(ChronoField.MONTH_OF_YEAR);
         if ($$8 == 10 && $$7 == 31 && $$5.i() < 0.25F) {
            this.a(bjy.f, new ckj($$5.i() < 0.1F ? cuc.ef : cuc.ee));
            this.bR[bjy.f.b()] = 0.0F;
         }
      }

      return $$3;
   }

   public void y() {
      if (this.dL() != null && !this.dL().B) {
         this.bO.a(this.c);
         this.bO.a(this.b);
         ckj $$0 = this.b(cdq.a(this, ckm.nG));
         if ($$0.a(ckm.nG)) {
            int $$1 = 20;
            if (this.dL().ai() != bhy.d) {
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
   public void a(bkj $$0, float $$1) {
      ckj $$2 = this.g(this.b(cdq.a(this, ckm.nG)));
      cdd $$3 = this.b($$2, $$1);
      double $$4 = $$0.dq() - this.dq();
      double $$5 = $$0.e(0.3333333333333333) - $$3.ds();
      double $$6 = $$0.dw() - this.dw();
      double $$7 = Math.sqrt($$4 * $$4 + $$6 * $$6);
      $$3.c($$4, $$5 + $$7 * 0.2F, $$6, 1.6F, (float)(14 - this.dL().ai().a() * 4));
      this.a(aqd.vC, 1.0F, 1.0F / (this.ef().i() * 0.4F + 0.8F));
      this.dL().b($$3);
   }

   protected cdd b(ckj $$0, float $$1) {
      return cdq.a(this, $$0, $$1);
   }

   @Override
   public boolean a(ckz $$0) {
      return $$0 == ckm.nG;
   }

   @Override
   public void a(rt $$0) {
      super.a($$0);
      this.y();
   }

   @Override
   public void a(bjy $$0, ckj $$1) {
      super.a($$0, $$1);
      if (!this.dL().B) {
         this.y();
      }
   }

   @Override
   protected float b(bkv $$0, bju $$1) {
      return 1.74F;
   }

   @Override
   protected float l(bjt $$0) {
      return -0.7F;
   }

   public boolean ge() {
      return this.ck();
   }
}
