import java.time.LocalDate;
import java.time.temporal.ChronoField;
import javax.annotation.Nullable;

public abstract class caw extends cbn implements cbr {
   private final btg<caw> b = new btg<>(this, 1.0, 20, 15.0F);
   private final bsq c = new bsq(this, 1.2, false) {
      @Override
      public void d() {
         super.d();
         caw.this.v(false);
      }

      @Override
      public void c() {
         super.c();
         caw.this.v(true);
      }
   };

   protected caw(bkz<? extends caw> $$0, csf $$1) {
      super($$0, $$1);
      this.A();
   }

   @Override
   protected void B() {
      this.bO.a(2, new btj(this));
      this.bO.a(3, new brz(this, 1.0));
      this.bO.a(3, new brn<>(this, bxz.class, 6.0F, 1.0, 1.2));
      this.bO.a(5, new btt(this, 1.0));
      this.bO.a(6, new bso(this, cdz.class, 8.0F));
      this.bO.a(6, new btb(this));
      this.bP.a(1, new bty(this));
      this.bP.a(2, new btz<>(this, cdz.class, true));
      this.bP.a(3, new btz<>(this, bxi.class, true));
      this.bP.a(3, new btz<>(this, bxx.class, 10, true, false, bxx.bU));
   }

   public static bmq.a u() {
      return cbn.gl().a(bmr.m, 0.25);
   }

   @Override
   protected void b(hx $$0, dhn $$1) {
      this.a(this.w(), 0.15F, 1.0F);
   }

   abstract aqu w();

   @Override
   public blq eT() {
      return blq.b;
   }

   @Override
   public void d_() {
      boolean $$0 = this.fZ();
      if ($$0) {
         clo $$1 = this.c(bla.f);
         if (!$$1.b()) {
            if ($$1.i()) {
               $$1.b($$1.k() + this.ag.a(2));
               if ($$1.k() >= $$1.l()) {
                  this.d(bla.f);
                  this.a(bla.f, clo.b);
               }
            }

            $$0 = false;
         }

         if ($$0) {
            this.g(8);
         }
      }

      super.d_();
   }

   @Override
   public void t() {
      super.t();
      if (this.db() instanceof blu $$0) {
         this.aU = $$0.aU;
      }
   }

   @Override
   protected void a(atw $$0, biz $$1) {
      super.a($$0, $$1);
      this.a(bla.a, new clo(clr.or));
   }

   @Nullable
   @Override
   public bme a(csu $$0, biz $$1, blp $$2, @Nullable bme $$3, @Nullable sd $$4) {
      $$3 = super.a($$0, $$1, $$2, $$3, $$4);
      atw $$5 = $$0.F_();
      this.a($$5, $$1);
      this.b($$5, $$1);
      this.A();
      this.s($$5.i() < 0.55F * $$1.d());
      if (this.c(bla.f).b()) {
         LocalDate $$6 = LocalDate.now();
         int $$7 = $$6.get(ChronoField.DAY_OF_MONTH);
         int $$8 = $$6.get(ChronoField.MONTH_OF_YEAR);
         if ($$8 == 10 && $$7 == 31 && $$5.i() < 0.25F) {
            this.a(bla.f, new clo($$5.i() < 0.1F ? cvh.ef : cvh.ee));
            this.bR[bla.f.b()] = 0.0F;
         }
      }

      return $$3;
   }

   public void A() {
      if (this.dN() != null && !this.dN().B) {
         this.bO.a(this.c);
         this.bO.a(this.b);
         clo $$0 = this.b(ces.a(this, clr.or));
         if ($$0.a(clr.or)) {
            int $$1 = 20;
            if (this.dN().aj() != biy.d) {
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
   public void a(bll $$0, float $$1) {
      clo $$2 = this.g(this.b(ces.a(this, clr.or)));
      cef $$3 = this.b($$2, $$1);
      double $$4 = $$0.ds() - this.ds();
      double $$5 = $$0.e(0.3333333333333333) - $$3.du();
      double $$6 = $$0.dy() - this.dy();
      double $$7 = Math.sqrt($$4 * $$4 + $$6 * $$6);
      $$3.c($$4, $$5 + $$7 * 0.2F, $$6, 1.6F, (float)(14 - this.dN().aj().a() * 4));
      this.a(aqv.vV, 1.0F, 1.0F / (this.eh().i() * 0.4F + 0.8F));
      this.dN().b($$3);
   }

   protected cef b(clo $$0, float $$1) {
      return ces.a(this, $$0, $$1);
   }

   @Override
   public boolean a(cme $$0) {
      return $$0 == clr.or;
   }

   @Override
   public void a(sd $$0) {
      super.a($$0);
      this.A();
   }

   @Override
   public void a(bla $$0, clo $$1) {
      super.a($$0, $$1);
      if (!this.dN().B) {
         this.A();
      }
   }

   @Override
   protected float b(blx $$0, bkw $$1) {
      return 1.74F;
   }

   @Override
   protected float l(bkv $$0) {
      return -0.7F;
   }

   public boolean gf() {
      return this.cl();
   }
}
