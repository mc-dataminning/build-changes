import java.time.LocalDate;
import java.time.temporal.ChronoField;
import javax.annotation.Nullable;

public abstract class bym extends bzd implements bzh {
   private final bqw<bym> b = new bqw<>(this, 1.0, 20, 15.0F);
   private final bqg c = new bqg(this, 1.2, false) {
      @Override
      public void d() {
         super.d();
         bym.this.v(false);
      }

      @Override
      public void c() {
         super.c();
         bym.this.v(true);
      }
   };

   protected bym(bip<? extends bym> $$0, cpq $$1) {
      super($$0, $$1);
      this.t();
   }

   @Override
   protected void w() {
      this.bO.a(2, new bqz(this));
      this.bO.a(3, new bpp(this, 1.0));
      this.bO.a(3, new bpd<>(this, bvp.class, 6.0F, 1.0, 1.2));
      this.bO.a(5, new brj(this, 1.0));
      this.bO.a(6, new bqe(this, cbp.class, 8.0F));
      this.bO.a(6, new bqr(this));
      this.bP.a(1, new bro(this));
      this.bP.a(2, new brp<>(this, cbp.class, true));
      this.bP.a(3, new brp<>(this, buy.class, true));
      this.bP.a(3, new brp<>(this, bvn.class, 10, true, false, bvn.bU));
   }

   public static bkg.a p() {
      return bzd.gg().a(bkh.d, 0.25);
   }

   @Override
   protected void b(gw $$0, dfe $$1) {
      this.a(this.q(), 0.15F, 1.0F);
   }

   abstract aoy q();

   @Override
   public bjg eQ() {
      return bjg.b;
   }

   @Override
   public void b_() {
      boolean $$0 = this.fU();
      if ($$0) {
         cja $$1 = this.c(biq.f);
         if (!$$1.b()) {
            if ($$1.i()) {
               $$1.b($$1.k() + this.ag.a(2));
               if ($$1.k() >= $$1.l()) {
                  this.d(biq.f);
                  this.a(biq.f, cja.b);
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
      if (this.cZ() instanceof bjk $$0) {
         this.aU = $$0.aU;
      }
   }

   @Override
   protected void a(arx $$0, bgr $$1) {
      super.a($$0, $$1);
      this.a(biq.a, new cja(cjd.nG));
   }

   @Nullable
   @Override
   public bju a(cqf $$0, bgr $$1, bjf $$2, @Nullable bju $$3, @Nullable qu $$4) {
      $$3 = super.a($$0, $$1, $$2, $$3, $$4);
      arx $$5 = $$0.y_();
      this.a($$5, $$1);
      this.b($$5, $$1);
      this.t();
      this.s($$5.i() < 0.55F * $$1.d());
      if (this.c(biq.f).b()) {
         LocalDate $$6 = LocalDate.now();
         int $$7 = $$6.get(ChronoField.DAY_OF_MONTH);
         int $$8 = $$6.get(ChronoField.MONTH_OF_YEAR);
         if ($$8 == 10 && $$7 == 31 && $$5.i() < 0.25F) {
            this.a(biq.f, new cja($$5.i() < 0.1F ? csr.eg : csr.ef));
            this.bR[biq.f.b()] = 0.0F;
         }
      }

      return $$3;
   }

   public void t() {
      if (this.dK() != null && !this.dK().B) {
         this.bO.a(this.c);
         this.bO.a(this.b);
         cja $$0 = this.b(cci.a(this, cjd.nG));
         if ($$0.a(cjd.nG)) {
            int $$1 = 20;
            if (this.dK().ai() != bgq.d) {
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
   public void a(bjb $$0, float $$1) {
      cja $$2 = this.g(this.b(cci.a(this, cjd.nG)));
      cbv $$3 = this.b($$2, $$1);
      double $$4 = $$0.dp() - this.dp();
      double $$5 = $$0.e(0.3333333333333333) - $$3.dr();
      double $$6 = $$0.dv() - this.dv();
      double $$7 = Math.sqrt($$4 * $$4 + $$6 * $$6);
      $$3.c($$4, $$5 + $$7 * 0.2F, $$6, 1.6F, (float)(14 - this.dK().ai().a() * 4));
      this.a(aoz.vA, 1.0F, 1.0F / (this.ee().i() * 0.4F + 0.8F));
      this.dK().b($$3);
   }

   protected cbv b(cja $$0, float $$1) {
      return cci.a(this, $$0, $$1);
   }

   @Override
   public boolean a(cjq $$0) {
      return $$0 == cjd.nG;
   }

   @Override
   public void a(qu $$0) {
      super.a($$0);
      this.t();
   }

   @Override
   public void a(biq $$0, cja $$1) {
      super.a($$0, $$1);
      if (!this.dK().B) {
         this.t();
      }
   }

   @Override
   protected float b(bjn $$0, bim $$1) {
      return 1.74F;
   }

   @Override
   protected float l(bil $$0) {
      return -0.7F;
   }

   public boolean ga() {
      return this.ck();
   }
}
