import java.time.LocalDate;
import java.time.temporal.ChronoField;
import javax.annotation.Nullable;

public abstract class bvl extends bwc implements bwg {
   private final bnv<bvl> b = new bnv<>(this, 1.0, 20, 15.0F);
   private final bnf c = new bnf(this, 1.2, false) {
      @Override
      public void d() {
         super.d();
         bvl.this.v(false);
      }

      @Override
      public void c() {
         super.c();
         bvl.this.v(true);
      }
   };

   protected bvl(bfn<? extends bvl> $$0, cmm $$1) {
      super($$0, $$1);
      this.w();
   }

   @Override
   protected void x() {
      this.bO.a(2, new bny(this));
      this.bO.a(3, new bmo(this, 1.0));
      this.bO.a(3, new bmc<>(this, bso.class, 6.0F, 1.0, 1.2));
      this.bO.a(5, new boi(this, 1.0));
      this.bO.a(6, new bnd(this, byo.class, 8.0F));
      this.bO.a(6, new bnq(this));
      this.bP.a(1, new bon(this));
      this.bP.a(2, new boo<>(this, byo.class, true));
      this.bP.a(3, new boo<>(this, brx.class, true));
      this.bP.a(3, new boo<>(this, bsm.class, 10, true, false, bsm.bU));
   }

   public static bhf.a q() {
      return bwc.ge().a(bhg.d, 0.25);
   }

   @Override
   protected void b(gu $$0, dcb $$1) {
      this.a(this.r(), 0.15F, 1.0F);
   }

   abstract amg r();

   @Override
   public bge eN() {
      return bge.b;
   }

   @Override
   public void b_() {
      boolean $$0 = this.fT();
      if ($$0) {
         cfz $$1 = this.c(bfo.f);
         if (!$$1.b()) {
            if ($$1.i()) {
               $$1.b($$1.k() + this.af.a(2));
               if ($$1.k() >= $$1.l()) {
                  this.d(bfo.f);
                  this.a(bfo.f, cfz.b);
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
   public void bv() {
      super.bv();
      if (this.cX() instanceof bgi $$0) {
         this.aV = $$0.aV;
      }
   }

   @Override
   protected void a(apf $$0, bdv $$1) {
      super.a($$0, $$1);
      this.a(bfo.a, new cfz(cgc.nG));
   }

   @Nullable
   @Override
   public bgt a(cnb $$0, bdv $$1, bgd $$2, @Nullable bgt $$3, @Nullable qr $$4) {
      $$3 = super.a($$0, $$1, $$2, $$3, $$4);
      apf $$5 = $$0.y_();
      this.a($$5, $$1);
      this.b($$5, $$1);
      this.w();
      this.s($$5.i() < 0.55F * $$1.d());
      if (this.c(bfo.f).b()) {
         LocalDate $$6 = LocalDate.now();
         int $$7 = $$6.get(ChronoField.DAY_OF_MONTH);
         int $$8 = $$6.get(ChronoField.MONTH_OF_YEAR);
         if ($$8 == 10 && $$7 == 31 && $$5.i() < 0.25F) {
            this.a(bfo.f, new cfz($$5.i() < 0.1F ? cpo.eg : cpo.ef));
            this.bR[bfo.f.b()] = 0.0F;
         }
      }

      return $$3;
   }

   public void w() {
      if (this.dI() != null && !this.dI().B) {
         this.bO.a(this.c);
         this.bO.a(this.b);
         cfz $$0 = this.b(bzh.a(this, cgc.nG));
         if ($$0.a(cgc.nG)) {
            int $$1 = 20;
            if (this.dI().ai() != bdu.d) {
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
   public void a(bfz $$0, float $$1) {
      cfz $$2 = this.g(this.b(bzh.a(this, cgc.nG)));
      byu $$3 = this.b($$2, $$1);
      double $$4 = $$0.dn() - this.dn();
      double $$5 = $$0.e(0.3333333333333333) - $$3.dp();
      double $$6 = $$0.dt() - this.dt();
      double $$7 = Math.sqrt($$4 * $$4 + $$6 * $$6);
      $$3.c($$4, $$5 + $$7 * 0.2F, $$6, 1.6F, (float)(14 - this.dI().ai().a() * 4));
      this.a(amh.vA, 1.0F, 1.0F / (this.ec().i() * 0.4F + 0.8F));
      this.dI().b($$3);
   }

   protected byu b(cfz $$0, float $$1) {
      return bzh.a(this, $$0, $$1);
   }

   @Override
   public boolean a(cgp $$0) {
      return $$0 == cgc.nG;
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      this.w();
   }

   @Override
   public void a(bfo $$0, cfz $$1) {
      super.a($$0, $$1);
      if (!this.dI().B) {
         this.w();
      }
   }

   @Override
   protected float b(bgl $$0, bfk $$1) {
      return 1.74F;
   }

   @Override
   public double bw() {
      return -0.6;
   }

   public boolean fY() {
      return this.ci();
   }
}
