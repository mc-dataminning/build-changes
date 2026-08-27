import java.time.LocalDate;
import java.time.temporal.ChronoField;
import javax.annotation.Nullable;

public abstract class byi extends byz implements bzd {
   private final bqs<byi> b = new bqs<>(this, 1.0, 20, 15.0F);
   private final bqc c = new bqc(this, 1.2, false) {
      @Override
      public void d() {
         super.d();
         byi.this.v(false);
      }

      @Override
      public void c() {
         super.c();
         byi.this.v(true);
      }
   };

   protected byi(bik<? extends byi> $$0, cpk $$1) {
      super($$0, $$1);
      this.t();
   }

   @Override
   protected void w() {
      this.bO.a(2, new bqv(this));
      this.bO.a(3, new bpl(this, 1.0));
      this.bO.a(3, new boz<>(this, bvl.class, 6.0F, 1.0, 1.2));
      this.bO.a(5, new brf(this, 1.0));
      this.bO.a(6, new bqa(this, cbl.class, 8.0F));
      this.bO.a(6, new bqn(this));
      this.bP.a(1, new brk(this));
      this.bP.a(2, new brl<>(this, cbl.class, true));
      this.bP.a(3, new brl<>(this, buu.class, true));
      this.bP.a(3, new brl<>(this, bvj.class, 10, true, false, bvj.bU));
   }

   public static bkc.a p() {
      return byz.gf().a(bkd.d, 0.25);
   }

   @Override
   protected void b(gv $$0, dey $$1) {
      this.a(this.q(), 0.15F, 1.0F);
   }

   abstract aot q();

   @Override
   public bjb eQ() {
      return bjb.b;
   }

   @Override
   public void b_() {
      boolean $$0 = this.fT();
      if ($$0) {
         ciw $$1 = this.c(bil.f);
         if (!$$1.b()) {
            if ($$1.i()) {
               $$1.b($$1.k() + this.ag.a(2));
               if ($$1.k() >= $$1.l()) {
                  this.d(bil.f);
                  this.a(bil.f, ciw.b);
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
      if (this.cZ() instanceof bjf $$0) {
         this.aU = $$0.aU;
      }
   }

   @Override
   protected void a(art $$0, bgm $$1) {
      super.a($$0, $$1);
      this.a(bil.a, new ciw(ciz.nG));
   }

   @Nullable
   @Override
   public bjq a(cpz $$0, bgm $$1, bja $$2, @Nullable bjq $$3, @Nullable qs $$4) {
      $$3 = super.a($$0, $$1, $$2, $$3, $$4);
      art $$5 = $$0.y_();
      this.a($$5, $$1);
      this.b($$5, $$1);
      this.t();
      this.s($$5.i() < 0.55F * $$1.d());
      if (this.c(bil.f).b()) {
         LocalDate $$6 = LocalDate.now();
         int $$7 = $$6.get(ChronoField.DAY_OF_MONTH);
         int $$8 = $$6.get(ChronoField.MONTH_OF_YEAR);
         if ($$8 == 10 && $$7 == 31 && $$5.i() < 0.25F) {
            this.a(bil.f, new ciw($$5.i() < 0.1F ? csl.eg : csl.ef));
            this.bR[bil.f.b()] = 0.0F;
         }
      }

      return $$3;
   }

   public void t() {
      if (this.dK() != null && !this.dK().B) {
         this.bO.a(this.c);
         this.bO.a(this.b);
         ciw $$0 = this.b(cce.a(this, ciz.nG));
         if ($$0.a(ciz.nG)) {
            int $$1 = 20;
            if (this.dK().ai() != bgl.d) {
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
   public void a(biw $$0, float $$1) {
      ciw $$2 = this.g(this.b(cce.a(this, ciz.nG)));
      cbr $$3 = this.b($$2, $$1);
      double $$4 = $$0.dp() - this.dp();
      double $$5 = $$0.e(0.3333333333333333) - $$3.dr();
      double $$6 = $$0.dv() - this.dv();
      double $$7 = Math.sqrt($$4 * $$4 + $$6 * $$6);
      $$3.c($$4, $$5 + $$7 * 0.2F, $$6, 1.6F, (float)(14 - this.dK().ai().a() * 4));
      this.a(aou.vA, 1.0F, 1.0F / (this.ee().i() * 0.4F + 0.8F));
      this.dK().b($$3);
   }

   protected cbr b(ciw $$0, float $$1) {
      return cce.a(this, $$0, $$1);
   }

   @Override
   public boolean a(cjm $$0) {
      return $$0 == ciz.nG;
   }

   @Override
   public void a(qs $$0) {
      super.a($$0);
      this.t();
   }

   @Override
   public void a(bil $$0, ciw $$1) {
      super.a($$0, $$1);
      if (!this.dK().B) {
         this.t();
      }
   }

   @Override
   protected float b(bji $$0, bih $$1) {
      return 1.74F;
   }

   @Override
   protected float l(big $$0) {
      return -0.7F;
   }

   public boolean fZ() {
      return this.ck();
   }
}
