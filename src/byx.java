import java.time.LocalDate;
import java.time.temporal.ChronoField;
import javax.annotation.Nullable;

public abstract class byx extends bzo implements bzs {
   private final brh<byx> b = new brh<>(this, 1.0, 20, 15.0F);
   private final bqr c = new bqr(this, 1.2, false) {
      @Override
      public void d() {
         super.d();
         byx.this.v(false);
      }

      @Override
      public void c() {
         super.c();
         byx.this.v(true);
      }
   };

   protected byx(bja<? extends byx> $$0, cqb $$1) {
      super($$0, $$1);
      this.y();
   }

   @Override
   protected void z() {
      this.bO.a(2, new brk(this));
      this.bO.a(3, new bqa(this, 1.0));
      this.bO.a(3, new bpo<>(this, bwa.class, 6.0F, 1.0, 1.2));
      this.bO.a(5, new bru(this, 1.0));
      this.bO.a(6, new bqp(this, cca.class, 8.0F));
      this.bO.a(6, new brc(this));
      this.bP.a(1, new brz(this));
      this.bP.a(2, new bsa<>(this, cca.class, true));
      this.bP.a(3, new bsa<>(this, bvj.class, true));
      this.bP.a(3, new bsa<>(this, bvy.class, 10, true, false, bvy.bU));
   }

   public static bkr.a s() {
      return bzo.gk().a(bks.m, 0.25);
   }

   @Override
   protected void b(gw $$0, dfd $$1) {
      this.a(this.t(), 0.15F, 1.0F);
   }

   abstract apf t();

   @Override
   public bjr eR() {
      return bjr.b;
   }

   @Override
   public void b_() {
      boolean $$0 = this.fY();
      if ($$0) {
         cjl $$1 = this.c(bjb.f);
         if (!$$1.b()) {
            if ($$1.i()) {
               $$1.b($$1.k() + this.ag.a(2));
               if ($$1.k() >= $$1.l()) {
                  this.d(bjb.f);
                  this.a(bjb.f, cjl.b);
               }
            }

            $$0 = false;
         }

         if ($$0) {
            this.g(8);
         }
      }

      super.b_();
   }

   @Override
   public void by() {
      super.by();
      if (this.cZ() instanceof bjv $$0) {
         this.aU = $$0.aU;
      }
   }

   @Override
   protected void a(ash $$0, bhc $$1) {
      super.a($$0, $$1);
      this.a(bjb.a, new cjl(cjo.nG));
   }

   @Nullable
   @Override
   public bkf a(cqq $$0, bhc $$1, bjq $$2, @Nullable bkf $$3, @Nullable qw $$4) {
      $$3 = super.a($$0, $$1, $$2, $$3, $$4);
      ash $$5 = $$0.D_();
      this.a($$5, $$1);
      this.b($$5, $$1);
      this.y();
      this.s($$5.i() < 0.55F * $$1.d());
      if (this.c(bjb.f).b()) {
         LocalDate $$6 = LocalDate.now();
         int $$7 = $$6.get(ChronoField.DAY_OF_MONTH);
         int $$8 = $$6.get(ChronoField.MONTH_OF_YEAR);
         if ($$8 == 10 && $$7 == 31 && $$5.i() < 0.25F) {
            this.a(bjb.f, new cjl($$5.i() < 0.1F ? cte.ef : cte.ee));
            this.bR[bjb.f.b()] = 0.0F;
         }
      }

      return $$3;
   }

   public void y() {
      if (this.dL() != null && !this.dL().B) {
         this.bO.a(this.c);
         this.bO.a(this.b);
         cjl $$0 = this.b(cct.a(this, cjo.nG));
         if ($$0.a(cjo.nG)) {
            int $$1 = 20;
            if (this.dL().ai() != bhb.d) {
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
   public void a(bjm $$0, float $$1) {
      cjl $$2 = this.g(this.b(cct.a(this, cjo.nG)));
      ccg $$3 = this.b($$2, $$1);
      double $$4 = $$0.dq() - this.dq();
      double $$5 = $$0.e(0.3333333333333333) - $$3.ds();
      double $$6 = $$0.dw() - this.dw();
      double $$7 = Math.sqrt($$4 * $$4 + $$6 * $$6);
      $$3.c($$4, $$5 + $$7 * 0.2F, $$6, 1.6F, (float)(14 - this.dL().ai().a() * 4));
      this.a(apg.vA, 1.0F, 1.0F / (this.ef().i() * 0.4F + 0.8F));
      this.dL().b($$3);
   }

   protected ccg b(cjl $$0, float $$1) {
      return cct.a(this, $$0, $$1);
   }

   @Override
   public boolean a(ckb $$0) {
      return $$0 == cjo.nG;
   }

   @Override
   public void a(qw $$0) {
      super.a($$0);
      this.y();
   }

   @Override
   public void a(bjb $$0, cjl $$1) {
      super.a($$0, $$1);
      if (!this.dL().B) {
         this.y();
      }
   }

   @Override
   protected float b(bjy $$0, bix $$1) {
      return 1.74F;
   }

   @Override
   protected float l(biw $$0) {
      return -0.7F;
   }

   public boolean ge() {
      return this.ck();
   }
}
