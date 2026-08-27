import java.time.LocalDate;
import java.time.temporal.ChronoField;
import javax.annotation.Nullable;

public abstract class cby extends ccp implements cct {
   private final buh<cby> b = new buh<>(this, 1.0, 20, 15.0F);
   private final btr c = new btr(this, 1.2, false) {
      @Override
      public void d() {
         super.d();
         cby.this.v(false);
      }

      @Override
      public void c() {
         super.c();
         cby.this.v(true);
      }
   };

   protected cby(blz<? extends cby> $$0, ctp $$1) {
      super($$0, $$1);
      this.A();
   }

   @Override
   protected void B() {
      this.bO.a(2, new buk(this));
      this.bO.a(3, new bta(this, 1.0));
      this.bO.a(3, new bso<>(this, bzb.class, 6.0F, 1.0, 1.2));
      this.bO.a(5, new buu(this, 1.0));
      this.bO.a(6, new btp(this, cfi.class, 8.0F));
      this.bO.a(6, new buc(this));
      this.bP.a(1, new buz(this));
      this.bP.a(2, new bva<>(this, cfi.class, true));
      this.bP.a(3, new bva<>(this, byk.class, true));
      this.bP.a(3, new bva<>(this, byz.class, 10, true, false, byz.bU));
   }

   public static bnq.a u() {
      return ccp.gk().a(bnr.m, 0.25);
   }

   @Override
   protected void b(hx $$0, djh $$1) {
      this.a(this.w(), 0.15F, 1.0F);
   }

   abstract arr w();

   @Override
   public bmq eS() {
      return bmq.b;
   }

   @Override
   public void d_() {
      boolean $$0 = this.fY();
      if ($$0) {
         cmy $$1 = this.c(bma.f);
         if (!$$1.b()) {
            if ($$1.i()) {
               $$1.b($$1.k() + this.ag.a(2));
               if ($$1.k() >= $$1.l()) {
                  this.d(bma.f);
                  this.a(bma.f, cmy.f);
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
      if (this.da() instanceof bmu $$0) {
         this.aU = $$0.aU;
      }
   }

   @Override
   protected void a(auv $$0, bjz $$1) {
      super.a($$0, $$1);
      this.a(bma.a, new cmy(cnb.or));
   }

   @Nullable
   @Override
   public bne a(cue $$0, bjz $$1, bmp $$2, @Nullable bne $$3, @Nullable sn $$4) {
      $$3 = super.a($$0, $$1, $$2, $$3, $$4);
      auv $$5 = $$0.F_();
      this.a($$5, $$1);
      this.b($$5, $$1);
      this.A();
      this.s($$5.i() < 0.55F * $$1.d());
      if (this.c(bma.f).b()) {
         LocalDate $$6 = LocalDate.now();
         int $$7 = $$6.get(ChronoField.DAY_OF_MONTH);
         int $$8 = $$6.get(ChronoField.MONTH_OF_YEAR);
         if ($$8 == 10 && $$7 == 31 && $$5.i() < 0.25F) {
            this.a(bma.f, new cmy($$5.i() < 0.1F ? cws.ef : cws.ee));
            this.bR[bma.f.b()] = 0.0F;
         }
      }

      return $$3;
   }

   public void A() {
      if (this.dM() != null && !this.dM().B) {
         this.bO.a(this.c);
         this.bO.a(this.b);
         cmy $$0 = this.b(cgb.a(this, cnb.or));
         if ($$0.a(cnb.or)) {
            int $$1 = 20;
            if (this.dM().ak() != bjy.d) {
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
   public void a(bml $$0, float $$1) {
      cmy $$2 = this.g(this.b(cgb.a(this, cnb.or)));
      cfo $$3 = this.b($$2, $$1);
      double $$4 = $$0.dr() - this.dr();
      double $$5 = $$0.e(0.3333333333333333) - $$3.dt();
      double $$6 = $$0.dx() - this.dx();
      double $$7 = Math.sqrt($$4 * $$4 + $$6 * $$6);
      $$3.c($$4, $$5 + $$7 * 0.2F, $$6, 1.6F, (float)(14 - this.dM().ak().a() * 4));
      this.a(ars.wq, 1.0F, 1.0F / (this.eg().i() * 0.4F + 0.8F));
      this.dM().b($$3);
   }

   protected cfo b(cmy $$0, float $$1) {
      return cgb.a(this, $$0, $$1);
   }

   @Override
   public boolean a(cno $$0) {
      return $$0 == cnb.or;
   }

   @Override
   public void a(sn $$0) {
      super.a($$0);
      this.A();
   }

   @Override
   public void a(bma $$0, cmy $$1) {
      super.a($$0, $$1);
      if (!this.dM().B) {
         this.A();
      }
   }

   @Override
   protected float b(bmx $$0, blw $$1) {
      return 1.74F;
   }

   @Override
   protected float l(blv $$0) {
      return -0.7F;
   }

   public boolean ge() {
      return this.cl();
   }
}
