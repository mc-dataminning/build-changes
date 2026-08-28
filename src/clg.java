import java.time.LocalDate;
import java.time.temporal.ChronoField;
import javax.annotation.Nullable;

public abstract class clg extends cly implements cmc {
   private static final int a = 20;
   private static final int b = 40;
   private final cdf<clg> c = new cdf<>(this, 1.0, 20, 15.0F);
   private final ccp d = new ccp(this, 1.2, false) {
      @Override
      public void e() {
         super.e();
         clg.this.w(false);
      }

      @Override
      public void d() {
         super.d();
         clg.this.w(true);
      }
   };

   protected clg(bus<? extends clg> $$0, dgi $$1) {
      super($$0, $$1);
      this.t();
   }

   @Override
   protected void E() {
      this.bS.a(2, new cdi(this));
      this.bS.a(3, new cby(this, 1.0));
      this.bS.a(3, new cbm<>(this, cib.class, 6.0F, 1.0, 1.2));
      this.bS.a(5, new cds(this, 1.0));
      this.bS.a(6, new ccn(this, cox.class, 8.0F));
      this.bS.a(6, new cda(this));
      this.bT.a(1, new cdx(this));
      this.bT.a(2, new cdy<>(this, cox.class, true));
      this.bT.a(3, new cdy<>(this, chk.class, true));
      this.bT.a(3, new cdy<>(this, chz.class, 10, true, false, chz.bY));
   }

   public static bwo.a m() {
      return cly.gx().a(bwp.v, 0.25);
   }

   @Override
   protected void b(ji $$0, dwx $$1) {
      this.a(this.p(), 0.15F, 1.0F);
   }

   abstract avz p();

   @Override
   public void d_() {
      boolean $$0 = this.gk();
      if ($$0) {
         cwp $$1 = this.a(but.f);
         if (!$$1.f()) {
            if ($$1.m()) {
               cwl $$2 = $$1.h();
               $$1.b($$1.o() + this.ae.a(2));
               if ($$1.o() >= $$1.p()) {
                  this.a($$2, but.f);
                  this.a(but.f, cwp.j);
               }
            }

            $$0 = false;
         }

         if ($$0) {
            this.d(8.0F);
         }
      }

      super.d_();
   }

   @Override
   public void r() {
      super.r();
      if (this.dl() instanceof bvp $$0) {
         this.aX = $$0.aX;
      }
   }

   @Override
   protected void a(azh $$0, bsi $$1) {
      super.a($$0, $$1);
      this.a(but.a, new cwp(cwt.pa));
   }

   @Nullable
   @Override
   public bwa a(dgz $$0, bsi $$1, bur $$2, @Nullable bwa $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      azh $$4 = $$0.H_();
      this.a($$4, $$1);
      this.a($$0, $$4, $$1);
      this.t();
      this.a_($$4.i() < 0.55F * $$1.d());
      if (this.a(but.f).f()) {
         LocalDate $$5 = LocalDate.now();
         int $$6 = $$5.get(ChronoField.DAY_OF_MONTH);
         int $$7 = $$5.get(ChronoField.MONTH_OF_YEAR);
         if ($$7 == 10 && $$6 == 31 && $$4.i() < 0.25F) {
            this.a(but.f, new cwp($$4.i() < 0.1F ? djo.es : djo.er));
            this.bV[but.f.b()] = 0.0F;
         }
      }

      return $$3;
   }

   public void t() {
      if (this.dV() != null && !this.dV().C) {
         this.bS.a(this.d);
         this.bS.a(this.c);
         cwp $$0 = this.b(cps.a(this, cwt.pa));
         if ($$0.a(cwt.pa)) {
            int $$1 = this.x();
            if (this.dV().am() != bsh.d) {
               $$1 = this.gs();
            }

            this.c.c($$1);
            this.bS.a(4, this.c);
         } else {
            this.bS.a(4, this.d);
         }
      }
   }

   protected int x() {
      return 20;
   }

   protected int gs() {
      return 40;
   }

   @Override
   public void a(bvh $$0, float $$1) {
      cwp $$2 = this.b(cps.a(this, cwt.pa));
      cwp $$3 = this.d($$2);
      cpe $$4 = this.a($$3, $$1, $$2);
      double $$5 = $$0.dA() - this.dA();
      double $$6 = $$0.e(0.3333333333333333) - $$4.dC();
      double $$7 = $$0.dG() - this.dG();
      double $$8 = Math.sqrt($$5 * $$5 + $$7 * $$7);
      if (this.dV() instanceof ard $$9) {
         cpq.a($$4, $$9, $$3, $$5, $$6 + $$8 * 0.2F, $$7, 1.6F, (float)(14 - $$9.am().a() * 4));
      }

      this.a(awa.xN, 1.0F, 1.0F / (this.dY().i() * 0.4F + 0.8F));
   }

   protected cpe a(cwp $$0, float $$1, @Nullable cwp $$2) {
      return cps.a(this, $$0, $$1, $$2);
   }

   @Override
   public boolean a(cxl $$0) {
      return $$0 == cwt.pa;
   }

   @Override
   public axf<cwl> Z() {
      return awy.bR;
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      this.t();
   }

   @Override
   public void a(but $$0, cwp $$1) {
      super.a($$0, $$1);
      if (!this.dV().C) {
         this.t();
      }
   }

   public boolean gt() {
      return this.cw();
   }
}
