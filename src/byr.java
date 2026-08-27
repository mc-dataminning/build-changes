import java.time.LocalDate;
import java.time.temporal.ChronoField;
import javax.annotation.Nullable;

public abstract class byr extends bzi implements bzm {
   private final brb<byr> b = new brb<>(this, 1.0, 20, 15.0F);
   private final bql c = new bql(this, 1.2, false) {
      @Override
      public void d() {
         super.d();
         byr.this.v(false);
      }

      @Override
      public void c() {
         super.c();
         byr.this.v(true);
      }
   };

   protected byr(biu<? extends byr> $$0, cpv $$1) {
      super($$0, $$1);
      this.y();
   }

   @Override
   protected void z() {
      this.bO.a(2, new bre(this));
      this.bO.a(3, new bpu(this, 1.0));
      this.bO.a(3, new bpi<>(this, bvu.class, 6.0F, 1.0, 1.2));
      this.bO.a(5, new bro(this, 1.0));
      this.bO.a(6, new bqj(this, cbu.class, 8.0F));
      this.bO.a(6, new bqw(this));
      this.bP.a(1, new brt(this));
      this.bP.a(2, new bru<>(this, cbu.class, true));
      this.bP.a(3, new bru<>(this, bvd.class, true));
      this.bP.a(3, new bru<>(this, bvs.class, 10, true, false, bvs.bU));
   }

   public static bkl.a s() {
      return bzi.gj().a(bkm.d, 0.25);
   }

   @Override
   protected void b(gw $$0, dfj $$1) {
      this.a(this.t(), 0.15F, 1.0F);
   }

   abstract apc t();

   @Override
   public bjl eR() {
      return bjl.b;
   }

   @Override
   public void b_() {
      boolean $$0 = this.fX();
      if ($$0) {
         cjf $$1 = this.c(biv.f);
         if (!$$1.b()) {
            if ($$1.i()) {
               $$1.b($$1.k() + this.ag.a(2));
               if ($$1.k() >= $$1.l()) {
                  this.d(biv.f);
                  this.a(biv.f, cjf.b);
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
      if (this.cZ() instanceof bjp $$0) {
         this.aU = $$0.aU;
      }
   }

   @Override
   protected void a(asc $$0, bgw $$1) {
      super.a($$0, $$1);
      this.a(biv.a, new cjf(cji.nG));
   }

   @Nullable
   @Override
   public bjz a(cqk $$0, bgw $$1, bjk $$2, @Nullable bjz $$3, @Nullable qw $$4) {
      $$3 = super.a($$0, $$1, $$2, $$3, $$4);
      asc $$5 = $$0.D_();
      this.a($$5, $$1);
      this.b($$5, $$1);
      this.y();
      this.s($$5.i() < 0.55F * $$1.d());
      if (this.c(biv.f).b()) {
         LocalDate $$6 = LocalDate.now();
         int $$7 = $$6.get(ChronoField.DAY_OF_MONTH);
         int $$8 = $$6.get(ChronoField.MONTH_OF_YEAR);
         if ($$8 == 10 && $$7 == 31 && $$5.i() < 0.25F) {
            this.a(biv.f, new cjf($$5.i() < 0.1F ? csw.eg : csw.ef));
            this.bR[biv.f.b()] = 0.0F;
         }
      }

      return $$3;
   }

   public void y() {
      if (this.dL() != null && !this.dL().B) {
         this.bO.a(this.c);
         this.bO.a(this.b);
         cjf $$0 = this.b(ccn.a(this, cji.nG));
         if ($$0.a(cji.nG)) {
            int $$1 = 20;
            if (this.dL().ai() != bgv.d) {
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
   public void a(bjg $$0, float $$1) {
      cjf $$2 = this.g(this.b(ccn.a(this, cji.nG)));
      cca $$3 = this.b($$2, $$1);
      double $$4 = $$0.dq() - this.dq();
      double $$5 = $$0.e(0.3333333333333333) - $$3.ds();
      double $$6 = $$0.dw() - this.dw();
      double $$7 = Math.sqrt($$4 * $$4 + $$6 * $$6);
      $$3.c($$4, $$5 + $$7 * 0.2F, $$6, 1.6F, (float)(14 - this.dL().ai().a() * 4));
      this.a(apd.vA, 1.0F, 1.0F / (this.ef().i() * 0.4F + 0.8F));
      this.dL().b($$3);
   }

   protected cca b(cjf $$0, float $$1) {
      return ccn.a(this, $$0, $$1);
   }

   @Override
   public boolean a(cjv $$0) {
      return $$0 == cji.nG;
   }

   @Override
   public void a(qw $$0) {
      super.a($$0);
      this.y();
   }

   @Override
   public void a(biv $$0, cjf $$1) {
      super.a($$0, $$1);
      if (!this.dL().B) {
         this.y();
      }
   }

   @Override
   protected float b(bjs $$0, bir $$1) {
      return 1.74F;
   }

   @Override
   protected float l(biq $$0) {
      return -0.7F;
   }

   public boolean gd() {
      return this.ck();
   }
}
