import java.time.LocalDate;
import java.time.temporal.ChronoField;
import javax.annotation.Nullable;

public abstract class ciz extends cjr implements cjv {
   private static final int b = 20;
   private static final int c = 40;
   private final cba<ciz> d = new cba<>(this, 1.0, 20, 15.0F);
   private final cak e = new cak(this, 1.2, false) {
      @Override
      public void d() {
         super.d();
         ciz.this.v(false);
      }

      @Override
      public void c() {
         super.c();
         ciz.this.v(true);
      }
   };

   protected ciz(bsn<? extends ciz> $$0, dcg $$1) {
      super($$0, $$1);
      this.x();
   }

   @Override
   protected void z() {
      this.bU.a(2, new cbd(this));
      this.bU.a(3, new bzt(this, 1.0));
      this.bU.a(3, new bzh<>(this, cfv.class, 6.0F, 1.0, 1.2));
      this.bU.a(5, new cbn(this, 1.0));
      this.bU.a(6, new cai(this, cml.class, 8.0F));
      this.bU.a(6, new cav(this));
      this.bV.a(1, new cbs(this));
      this.bV.a(2, new cbt<>(this, cml.class, true));
      this.bV.a(3, new cbt<>(this, cfe.class, true));
      this.bV.a(3, new cbt<>(this, cft.class, 10, true, false, cft.ca));
   }

   public static buj.a s() {
      return cjr.gt().a(buk.v, 0.25);
   }

   @Override
   protected void b(ja $$0, dsl $$1) {
      this.a(this.t(), 0.15F, 1.0F);
   }

   abstract avg t();

   @Override
   public void m_() {
      boolean $$0 = this.gh();
      if ($$0) {
         cud $$1 = this.a(bso.f);
         if (!$$1.e()) {
            if ($$1.l()) {
               cty $$2 = $$1.g();
               $$1.b($$1.n() + this.ah.a(2));
               if ($$1.n() >= $$1.o()) {
                  this.a($$2, bso.f);
                  this.a(bso.f, cud.l);
               }
            }

            $$0 = false;
         }

         if ($$0) {
            this.d(8.0F);
         }
      }

      super.m_();
   }

   @Override
   public void u() {
      super.u();
      if (this.df() instanceof btl $$0) {
         this.aZ = $$0.aZ;
      }
   }

   @Override
   protected void a(ayo $$0, bqf $$1) {
      super.a($$0, $$1);
      this.a(bso.a, new cud(cug.ov));
   }

   @Nullable
   @Override
   public btv a(dcv $$0, bqf $$1, btg $$2, @Nullable btv $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      ayo $$4 = $$0.E_();
      this.a($$4, $$1);
      this.a($$0, $$4, $$1);
      this.x();
      this.a_($$4.i() < 0.55F * $$1.d());
      if (this.a(bso.f).e()) {
         LocalDate $$5 = LocalDate.now();
         int $$6 = $$5.get(ChronoField.DAY_OF_MONTH);
         int $$7 = $$5.get(ChronoField.MONTH_OF_YEAR);
         if ($$7 == 10 && $$6 == 31 && $$4.i() < 0.25F) {
            this.a(bso.f, new cud($$4.i() < 0.1F ? dfk.ef : dfk.ee));
            this.bX[bso.f.b()] = 0.0F;
         }
      }

      return $$3;
   }

   public void x() {
      if (this.dR() != null && !this.dR().B) {
         this.bU.a(this.e);
         this.bU.a(this.d);
         cud $$0 = this.b(cnf.a(this, cug.ov));
         if ($$0.a(cug.ov)) {
            int $$1 = this.gn();
            if (this.dR().al() != bqe.d) {
               $$1 = this.go();
            }

            this.d.c($$1);
            this.bU.a(4, this.d);
         } else {
            this.bU.a(4, this.e);
         }
      }
   }

   protected int gn() {
      return 20;
   }

   protected int go() {
      return 40;
   }

   @Override
   public void a(btc $$0, float $$1) {
      cud $$2 = this.b(cnf.a(this, cug.ov));
      cud $$3 = this.g($$2);
      cmr $$4 = this.a($$3, $$1, $$2);
      double $$5 = $$0.dw() - this.dw();
      double $$6 = $$0.e(0.3333333333333333) - $$4.dy();
      double $$7 = $$0.dC() - this.dC();
      double $$8 = Math.sqrt($$5 * $$5 + $$7 * $$7);
      $$4.c($$5, $$6 + $$8 * 0.2F, $$7, 1.6F, (float)(14 - this.dR().al().a() * 4));
      this.a(avh.xn, 1.0F, 1.0F / (this.dU().i() * 0.4F + 0.8F));
      this.dR().b($$4);
   }

   protected cmr a(cud $$0, float $$1, @Nullable cud $$2) {
      return cnf.a(this, $$0, $$1, $$2);
   }

   @Override
   public boolean a(cuw $$0) {
      return $$0 == cug.ov;
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      this.x();
   }

   @Override
   public void a(bso $$0, cud $$1) {
      super.a($$0, $$1);
      if (!this.dR().B) {
         this.x();
      }
   }

   public boolean gp() {
      return this.cq();
   }
}
