import java.time.LocalDate;
import java.time.temporal.ChronoField;
import javax.annotation.Nullable;

public abstract class clh extends clz implements cmd {
   private static final int a = 20;
   private static final int b = 40;
   private final cdg<clh> c = new cdg<>(this, 1.0, 20, 15.0F);
   private final ccq d = new ccq(this, 1.2, false) {
      @Override
      public void e() {
         super.e();
         clh.this.w(false);
      }

      @Override
      public void d() {
         super.d();
         clh.this.w(true);
      }
   };

   protected clh(but<? extends clh> $$0, dgj $$1) {
      super($$0, $$1);
      this.t();
   }

   @Override
   protected void E() {
      this.bS.a(2, new cdj(this));
      this.bS.a(3, new cbz(this, 1.0));
      this.bS.a(3, new cbn<>(this, cic.class, 6.0F, 1.0, 1.2));
      this.bS.a(5, new cdt(this, 1.0));
      this.bS.a(6, new cco(this, coy.class, 8.0F));
      this.bS.a(6, new cdb(this));
      this.bT.a(1, new cdy(this));
      this.bT.a(2, new cdz<>(this, coy.class, true));
      this.bT.a(3, new cdz<>(this, chl.class, true));
      this.bT.a(3, new cdz<>(this, cia.class, 10, true, false, cia.bY));
   }

   public static bwp.a m() {
      return clz.gx().a(bwq.v, 0.25);
   }

   @Override
   protected void b(ji $$0, dwy $$1) {
      this.a(this.p(), 0.15F, 1.0F);
   }

   abstract avz p();

   @Override
   public void d_() {
      boolean $$0 = this.gk();
      if ($$0) {
         cwq $$1 = this.a(buu.f);
         if (!$$1.f()) {
            if ($$1.m()) {
               cwm $$2 = $$1.h();
               $$1.b($$1.o() + this.ae.a(2));
               if ($$1.o() >= $$1.p()) {
                  this.a($$2, buu.f);
                  this.a(buu.f, cwq.j);
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
      if (this.dl() instanceof bvq $$0) {
         this.aX = $$0.aX;
      }
   }

   @Override
   protected void a(azh $$0, bsj $$1) {
      super.a($$0, $$1);
      this.a(buu.a, new cwq(cwu.pa));
   }

   @Nullable
   @Override
   public bwb a(dha $$0, bsj $$1, bus $$2, @Nullable bwb $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      azh $$4 = $$0.H_();
      this.a($$4, $$1);
      this.a($$0, $$4, $$1);
      this.t();
      this.a_($$4.i() < 0.55F * $$1.d());
      if (this.a(buu.f).f()) {
         LocalDate $$5 = LocalDate.now();
         int $$6 = $$5.get(ChronoField.DAY_OF_MONTH);
         int $$7 = $$5.get(ChronoField.MONTH_OF_YEAR);
         if ($$7 == 10 && $$6 == 31 && $$4.i() < 0.25F) {
            this.a(buu.f, new cwq($$4.i() < 0.1F ? djp.es : djp.er));
            this.bV[buu.f.b()] = 0.0F;
         }
      }

      return $$3;
   }

   public void t() {
      if (this.dV() != null && !this.dV().C) {
         this.bS.a(this.d);
         this.bS.a(this.c);
         cwq $$0 = this.b(cpt.a(this, cwu.pa));
         if ($$0.a(cwu.pa)) {
            int $$1 = this.x();
            if (this.dV().am() != bsi.d) {
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
   public void a(bvi $$0, float $$1) {
      cwq $$2 = this.b(cpt.a(this, cwu.pa));
      cwq $$3 = this.d($$2);
      cpf $$4 = this.a($$3, $$1, $$2);
      double $$5 = $$0.dA() - this.dA();
      double $$6 = $$0.e(0.3333333333333333) - $$4.dC();
      double $$7 = $$0.dG() - this.dG();
      double $$8 = Math.sqrt($$5 * $$5 + $$7 * $$7);
      if (this.dV() instanceof ard $$9) {
         cpr.a($$4, $$9, $$3, $$5, $$6 + $$8 * 0.2F, $$7, 1.6F, (float)(14 - $$9.am().a() * 4));
      }

      this.a(awa.xN, 1.0F, 1.0F / (this.dY().i() * 0.4F + 0.8F));
   }

   protected cpf a(cwq $$0, float $$1, @Nullable cwq $$2) {
      return cpt.a(this, $$0, $$1, $$2);
   }

   @Override
   public boolean a(cxm $$0) {
      return $$0 == cwu.pa;
   }

   @Override
   public axf<cwm> Z() {
      return awy.bR;
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      this.t();
   }

   @Override
   public void a(buu $$0, cwq $$1) {
      super.a($$0, $$1);
      if (!this.dV().C) {
         this.t();
      }
   }

   public boolean gt() {
      return this.cw();
   }
}
