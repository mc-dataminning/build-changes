import java.time.LocalDate;
import java.time.temporal.ChronoField;
import javax.annotation.Nullable;

public abstract class car extends cbi implements cbm {
   private final btb<car> b = new btb<>(this, 1.0, 20, 15.0F);
   private final bsl c = new bsl(this, 1.2, false) {
      @Override
      public void d() {
         super.d();
         car.this.v(false);
      }

      @Override
      public void c() {
         super.c();
         car.this.v(true);
      }
   };

   protected car(bku<? extends car> $$0, csa $$1) {
      super($$0, $$1);
      this.A();
   }

   @Override
   protected void B() {
      this.bO.a(2, new bte(this));
      this.bO.a(3, new bru(this, 1.0));
      this.bO.a(3, new bri<>(this, bxu.class, 6.0F, 1.0, 1.2));
      this.bO.a(5, new bto(this, 1.0));
      this.bO.a(6, new bsj(this, cdu.class, 8.0F));
      this.bO.a(6, new bsw(this));
      this.bP.a(1, new btt(this));
      this.bP.a(2, new btu<>(this, cdu.class, true));
      this.bP.a(3, new btu<>(this, bxd.class, true));
      this.bP.a(3, new btu<>(this, bxs.class, 10, true, false, bxs.bU));
   }

   public static bml.a u() {
      return cbi.gl().a(bmm.m, 0.25);
   }

   @Override
   protected void b(ht $$0, dhi $$1) {
      this.a(this.w(), 0.15F, 1.0F);
   }

   abstract aqq w();

   @Override
   public bll eT() {
      return bll.b;
   }

   @Override
   public void c_() {
      boolean $$0 = this.fZ();
      if ($$0) {
         clj $$1 = this.c(bkv.f);
         if (!$$1.b()) {
            if ($$1.i()) {
               $$1.b($$1.k() + this.ag.a(2));
               if ($$1.k() >= $$1.l()) {
                  this.d(bkv.f);
                  this.a(bkv.f, clj.b);
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
   public void t() {
      super.t();
      if (this.db() instanceof blp $$0) {
         this.aU = $$0.aU;
      }
   }

   @Override
   protected void a(ats $$0, biv $$1) {
      super.a($$0, $$1);
      this.a(bkv.a, new clj(clm.or));
   }

   @Nullable
   @Override
   public blz a(csp $$0, biv $$1, blk $$2, @Nullable blz $$3, @Nullable rz $$4) {
      $$3 = super.a($$0, $$1, $$2, $$3, $$4);
      ats $$5 = $$0.E_();
      this.a($$5, $$1);
      this.b($$5, $$1);
      this.A();
      this.s($$5.i() < 0.55F * $$1.d());
      if (this.c(bkv.f).b()) {
         LocalDate $$6 = LocalDate.now();
         int $$7 = $$6.get(ChronoField.DAY_OF_MONTH);
         int $$8 = $$6.get(ChronoField.MONTH_OF_YEAR);
         if ($$8 == 10 && $$7 == 31 && $$5.i() < 0.25F) {
            this.a(bkv.f, new clj($$5.i() < 0.1F ? cvc.ef : cvc.ee));
            this.bR[bkv.f.b()] = 0.0F;
         }
      }

      return $$3;
   }

   public void A() {
      if (this.dN() != null && !this.dN().B) {
         this.bO.a(this.c);
         this.bO.a(this.b);
         clj $$0 = this.b(cen.a(this, clm.or));
         if ($$0.a(clm.or)) {
            int $$1 = 20;
            if (this.dN().aj() != biu.d) {
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
   public void a(blg $$0, float $$1) {
      clj $$2 = this.g(this.b(cen.a(this, clm.or)));
      cea $$3 = this.b($$2, $$1);
      double $$4 = $$0.ds() - this.ds();
      double $$5 = $$0.e(0.3333333333333333) - $$3.du();
      double $$6 = $$0.dy() - this.dy();
      double $$7 = Math.sqrt($$4 * $$4 + $$6 * $$6);
      $$3.c($$4, $$5 + $$7 * 0.2F, $$6, 1.6F, (float)(14 - this.dN().aj().a() * 4));
      this.a(aqr.vV, 1.0F, 1.0F / (this.eh().i() * 0.4F + 0.8F));
      this.dN().b($$3);
   }

   protected cea b(clj $$0, float $$1) {
      return cen.a(this, $$0, $$1);
   }

   @Override
   public boolean a(clz $$0) {
      return $$0 == clm.or;
   }

   @Override
   public void a(rz $$0) {
      super.a($$0);
      this.A();
   }

   @Override
   public void a(bkv $$0, clj $$1) {
      super.a($$0, $$1);
      if (!this.dN().B) {
         this.A();
      }
   }

   @Override
   protected float b(bls $$0, bkr $$1) {
      return 1.74F;
   }

   @Override
   protected float l(bkq $$0) {
      return -0.7F;
   }

   public boolean gf() {
      return this.cl();
   }
}
