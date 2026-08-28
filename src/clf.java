import java.time.LocalDate;
import java.time.temporal.ChronoField;
import javax.annotation.Nullable;

public abstract class clf extends clx implements cmb {
   private static final int a = 20;
   private static final int b = 40;
   private final cde<clf> c = new cde<>(this, 1.0, 20, 15.0F);
   private final cco d = new cco(this, 1.2, false) {
      @Override
      public void e() {
         super.e();
         clf.this.w(false);
      }

      @Override
      public void d() {
         super.d();
         clf.this.w(true);
      }
   };

   protected clf(bur<? extends clf> $$0, dgi $$1) {
      super($$0, $$1);
      this.t();
   }

   @Override
   protected void B() {
      this.bS.a(2, new cdh(this));
      this.bS.a(3, new cbx(this, 1.0));
      this.bS.a(3, new cbl<>(this, cia.class, 6.0F, 1.0, 1.2));
      this.bS.a(5, new cdr(this, 1.0));
      this.bS.a(6, new ccm(this, cox.class, 8.0F));
      this.bS.a(6, new ccz(this));
      this.bT.a(1, new cdw(this));
      this.bT.a(2, new cdx<>(this, cox.class, true));
      this.bT.a(3, new cdx<>(this, chj.class, true));
      this.bT.a(3, new cdx<>(this, chy.class, 10, true, false, chy.bY));
   }

   public static bwn.a m() {
      return clx.gu().a(bwo.v, 0.25);
   }

   @Override
   protected void b(ji $$0, dwx $$1) {
      this.a(this.p(), 0.15F, 1.0F);
   }

   abstract avz p();

   @Override
   public void d_() {
      boolean $$0 = this.gh();
      if ($$0) {
         cwp $$1 = this.a(bus.f);
         if (!$$1.f()) {
            if ($$1.m()) {
               cwl $$2 = $$1.h();
               $$1.b($$1.o() + this.ae.a(2));
               if ($$1.o() >= $$1.p()) {
                  this.a($$2, bus.f);
                  this.a(bus.f, cwp.j);
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
      if (this.dm() instanceof bvo $$0) {
         this.aX = $$0.aX;
      }
   }

   @Override
   protected void a(azh $$0, bsh $$1) {
      super.a($$0, $$1);
      this.a(bus.a, new cwp(cwt.pa));
   }

   @Nullable
   @Override
   public bvz a(dgz $$0, bsh $$1, buq $$2, @Nullable bvz $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      azh $$4 = $$0.H_();
      this.a($$4, $$1);
      this.a($$0, $$4, $$1);
      this.t();
      this.a_($$4.i() < 0.55F * $$1.d());
      if (this.a(bus.f).f()) {
         LocalDate $$5 = LocalDate.now();
         int $$6 = $$5.get(ChronoField.DAY_OF_MONTH);
         int $$7 = $$5.get(ChronoField.MONTH_OF_YEAR);
         if ($$7 == 10 && $$6 == 31 && $$4.i() < 0.25F) {
            this.a(bus.f, new cwp($$4.i() < 0.1F ? djo.es : djo.er));
            this.bV[bus.f.b()] = 0.0F;
         }
      }

      return $$3;
   }

   public void t() {
      if (this.dW() != null && !this.dW().C) {
         this.bS.a(this.d);
         this.bS.a(this.c);
         cwp $$0 = this.b(cps.a(this, cwt.pa));
         if ($$0.a(cwt.pa)) {
            int $$1 = this.x();
            if (this.dW().am() != bsg.d) {
               $$1 = this.gp();
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

   protected int gp() {
      return 40;
   }

   @Override
   public void a(bvg $$0, float $$1) {
      cwp $$2 = this.b(cps.a(this, cwt.pa));
      cwp $$3 = this.d($$2);
      cpe $$4 = this.a($$3, $$1, $$2);
      double $$5 = $$0.dB() - this.dB();
      double $$6 = $$0.e(0.3333333333333333) - $$4.dD();
      double $$7 = $$0.dH() - this.dH();
      double $$8 = Math.sqrt($$5 * $$5 + $$7 * $$7);
      if (this.dW() instanceof arc $$9) {
         cpq.a($$4, $$9, $$3, $$5, $$6 + $$8 * 0.2F, $$7, 1.6F, (float)(14 - $$9.am().a() * 4));
      }

      this.a(awa.xN, 1.0F, 1.0F / (this.dZ().i() * 0.4F + 0.8F));
   }

   protected cpe a(cwp $$0, float $$1, @Nullable cwp $$2) {
      return cps.a(this, $$0, $$1, $$2);
   }

   @Override
   public boolean a(cxl $$0) {
      return $$0 == cwt.pa;
   }

   @Override
   public axf<cwl> W() {
      return awy.bS;
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      this.t();
   }

   @Override
   public void a(bus $$0, cwp $$1) {
      super.a($$0, $$1);
      if (!this.dW().C) {
         this.t();
      }
   }

   public boolean gq() {
      return this.cw();
   }
}
