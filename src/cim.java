import java.time.LocalDate;
import java.time.temporal.ChronoField;
import javax.annotation.Nullable;

public abstract class cim extends cje implements cji {
   private static final int b = 20;
   private static final int c = 40;
   private final cao<cim> d = new cao<>(this, 1.0, 20, 15.0F);
   private final bzy e = new bzy(this, 1.2, false) {
      @Override
      public void d() {
         super.d();
         cim.this.v(false);
      }

      @Override
      public void c() {
         super.c();
         cim.this.v(true);
      }
   };

   protected cim(bsc<? extends cim> $$0, daz $$1) {
      super($$0, $$1);
      this.y();
   }

   @Override
   protected void z() {
      this.bS.a(2, new car(this));
      this.bS.a(3, new bzh(this, 1.0));
      this.bS.a(3, new byv<>(this, cfj.class, 6.0F, 1.0, 1.2));
      this.bS.a(5, new cbb(this, 1.0));
      this.bS.a(6, new bzw(this, cly.class, 8.0F));
      this.bS.a(6, new caj(this));
      this.bT.a(1, new cbg(this));
      this.bT.a(2, new cbh<>(this, cly.class, true));
      this.bT.a(3, new cbh<>(this, ces.class, true));
      this.bT.a(3, new cbh<>(this, cfh.class, 10, true, false, cfh.bY));
   }

   public static btx.a s() {
      return cje.gv().a(bty.r, 0.25);
   }

   @Override
   protected void b(io $$0, drd $$1) {
      this.a(this.u(), 0.15F, 1.0F);
   }

   abstract avh u();

   @Override
   public void n_() {
      boolean $$0 = this.gj();
      if ($$0) {
         ctq $$1 = this.a(bsd.f);
         if (!$$1.e()) {
            if ($$1.l()) {
               $$1.b($$1.n() + this.ah.a(2));
               if ($$1.n() >= $$1.o()) {
                  this.e(bsd.f);
                  this.a(bsd.f, ctq.i);
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
      if (this.dd() instanceof bsz $$0) {
         this.aY = $$0.aY;
      }
   }

   @Override
   protected void a(aym $$0, bpu $$1) {
      super.a($$0, $$1);
      this.a(bsd.a, new ctq(ctt.ou));
   }

   @Nullable
   @Override
   public btj a(dbo $$0, bpu $$1, bsu $$2, @Nullable btj $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      aym $$4 = $$0.E_();
      this.a($$4, $$1);
      this.b($$4, $$1);
      this.y();
      this.a_($$4.i() < 0.55F * $$1.d());
      if (this.a(bsd.f).e()) {
         LocalDate $$5 = LocalDate.now();
         int $$6 = $$5.get(ChronoField.DAY_OF_MONTH);
         int $$7 = $$5.get(ChronoField.MONTH_OF_YEAR);
         if ($$7 == 10 && $$6 == 31 && $$4.i() < 0.25F) {
            this.a(bsd.f, new ctq($$4.i() < 0.1F ? dec.ef : dec.ee));
            this.bV[bsd.f.b()] = 0.0F;
         }
      }

      return $$3;
   }

   public void y() {
      if (this.dP() != null && !this.dP().B) {
         this.bS.a(this.e);
         this.bS.a(this.d);
         ctq $$0 = this.b(cms.a(this, ctt.ou));
         if ($$0.a(ctt.ou)) {
            int $$1 = this.gp();
            if (this.dP().ak() != bpt.d) {
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
   public void a(bsq $$0, float $$1) {
      ctq $$2 = this.g(this.b(cms.a(this, ctt.ou)));
      cme $$3 = this.b($$2, $$1);
      double $$4 = $$0.du() - this.du();
      double $$5 = $$0.e(0.3333333333333333) - $$3.dw();
      double $$6 = $$0.dA() - this.dA();
      double $$7 = Math.sqrt($$4 * $$4 + $$6 * $$6);
      $$3.c($$4, $$5 + $$7 * 0.2F, $$6, 1.6F, (float)(14 - this.dP().ak().a() * 4));
      this.a(avi.xk, 1.0F, 1.0F / (this.el().i() * 0.4F + 0.8F));
      this.dP().b($$3);
   }

   protected cme b(ctq $$0, float $$1) {
      return cms.a(this, $$0, $$1);
   }

   @Override
   public boolean a(cuj $$0) {
      return $$0 == ctt.ou;
   }

   @Override
   public void a(ud $$0) {
      super.a($$0);
      this.y();
   }

   @Override
   public void a(bsd $$0, ctq $$1) {
      super.a($$0, $$1);
      if (!this.dP().B) {
         this.y();
      }
   }

   public boolean gr() {
      return this.co();
   }
}
