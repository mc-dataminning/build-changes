import java.time.LocalDate;
import java.time.temporal.ChronoField;
import javax.annotation.Nullable;

public abstract class cik extends cjc implements cjg {
   private static final int b = 20;
   private static final int c = 40;
   private final cam<cik> d = new cam<>(this, 1.0, 20, 15.0F);
   private final bzw e = new bzw(this, 1.2, false) {
      @Override
      public void d() {
         super.d();
         cik.this.v(false);
      }

      @Override
      public void c() {
         super.c();
         cik.this.v(true);
      }
   };

   protected cik(bsa<? extends cik> $$0, dax $$1) {
      super($$0, $$1);
      this.y();
   }

   @Override
   protected void z() {
      this.bS.a(2, new cap(this));
      this.bS.a(3, new bzf(this, 1.0));
      this.bS.a(3, new byt<>(this, cfh.class, 6.0F, 1.0, 1.2));
      this.bS.a(5, new caz(this, 1.0));
      this.bS.a(6, new bzu(this, clw.class, 8.0F));
      this.bS.a(6, new cah(this));
      this.bT.a(1, new cbe(this));
      this.bT.a(2, new cbf<>(this, clw.class, true));
      this.bT.a(3, new cbf<>(this, ceq.class, true));
      this.bT.a(3, new cbf<>(this, cff.class, 10, true, false, cff.bY));
   }

   public static btv.a s() {
      return cjc.gv().a(btw.r, 0.25);
   }

   @Override
   protected void b(io $$0, drb $$1) {
      this.a(this.u(), 0.15F, 1.0F);
   }

   abstract avg u();

   @Override
   public void n_() {
      boolean $$0 = this.gj();
      if ($$0) {
         cto $$1 = this.a(bsb.f);
         if (!$$1.e()) {
            if ($$1.l()) {
               $$1.b($$1.n() + this.ah.a(2));
               if ($$1.n() >= $$1.o()) {
                  this.e(bsb.f);
                  this.a(bsb.f, cto.i);
               }
            }

            $$0 = false;
         }

         if ($$0) {
            this.g(8);
         }
      }

      super.n_();
   }

   @Override
   public void t() {
      super.t();
      if (this.dd() instanceof bsx $$0) {
         this.aZ = $$0.aZ;
      }
   }

   @Override
   protected void a(ayk $$0, bps $$1) {
      super.a($$0, $$1);
      this.a(bsb.a, new cto(ctr.ou));
   }

   @Nullable
   @Override
   public bth a(dbm $$0, bps $$1, bss $$2, @Nullable bth $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      ayk $$4 = $$0.E_();
      this.a($$4, $$1);
      this.b($$4, $$1);
      this.y();
      this.a_($$4.i() < 0.55F * $$1.d());
      if (this.a(bsb.f).e()) {
         LocalDate $$5 = LocalDate.now();
         int $$6 = $$5.get(ChronoField.DAY_OF_MONTH);
         int $$7 = $$5.get(ChronoField.MONTH_OF_YEAR);
         if ($$7 == 10 && $$6 == 31 && $$4.i() < 0.25F) {
            this.a(bsb.f, new cto($$4.i() < 0.1F ? dea.ef : dea.ee));
            this.bV[bsb.f.b()] = 0.0F;
         }
      }

      return $$3;
   }

   public void y() {
      if (this.dP() != null && !this.dP().B) {
         this.bS.a(this.e);
         this.bS.a(this.d);
         cto $$0 = this.b(cmq.a(this, ctr.ou));
         if ($$0.a(ctr.ou)) {
            int $$1 = this.gp();
            if (this.dP().ak() != bpr.d) {
               $$1 = this.gq();
            }

            this.d.c($$1);
            this.bS.a(4, this.d);
         } else {
            this.bS.a(4, this.e);
         }
      }
   }

   protected int gp() {
      return 20;
   }

   protected int gq() {
      return 40;
   }

   @Override
   public void a(bso $$0, float $$1) {
      cto $$2 = this.g(this.b(cmq.a(this, ctr.ou)));
      cmc $$3 = this.b($$2, $$1);
      double $$4 = $$0.du() - this.du();
      double $$5 = $$0.e(0.3333333333333333) - $$3.dw();
      double $$6 = $$0.dA() - this.dA();
      double $$7 = Math.sqrt($$4 * $$4 + $$6 * $$6);
      $$3.c($$4, $$5 + $$7 * 0.2F, $$6, 1.6F, (float)(14 - this.dP().ak().a() * 4));
      this.a(avh.xk, 1.0F, 1.0F / (this.el().i() * 0.4F + 0.8F));
      this.dP().b($$3);
   }

   protected cmc b(cto $$0, float $$1) {
      return cmq.a(this, $$0, $$1);
   }

   @Override
   public boolean a(cuh $$0) {
      return $$0 == ctr.ou;
   }

   @Override
   public void a(ud $$0) {
      super.a($$0);
      this.y();
   }

   @Override
   public void a(bsb $$0, cto $$1) {
      super.a($$0, $$1);
      if (!this.dP().B) {
         this.y();
      }
   }

   public boolean gr() {
      return this.co();
   }
}
