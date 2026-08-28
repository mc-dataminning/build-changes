import java.time.LocalDate;
import java.time.temporal.ChronoField;
import javax.annotation.Nullable;

public abstract class ckd extends ckv implements ckz {
   private static final int b = 20;
   private static final int c = 40;
   private final ccc<ckd> d = new ccc<>(this, 1.0, 20, 15.0F);
   private final cbm e = new cbm(this, 1.2, false) {
      @Override
      public void e() {
         super.e();
         ckd.this.w(false);
      }

      @Override
      public void d() {
         super.d();
         ckd.this.w(true);
      }
   };

   protected ckd(btq<? extends ckd> $$0, dds $$1) {
      super($$0, $$1);
      this.y();
   }

   @Override
   protected void D() {
      this.bT.a(2, new ccf(this));
      this.bT.a(3, new cav(this, 1.0));
      this.bT.a(3, new caj<>(this, cgy.class, 6.0F, 1.0, 1.2));
      this.bT.a(5, new ccp(this, 1.0));
      this.bT.a(6, new cbk(this, cnp.class, 8.0F));
      this.bT.a(6, new cbx(this));
      this.bU.a(1, new ccu(this));
      this.bU.a(2, new ccv<>(this, cnp.class, true));
      this.bU.a(3, new ccv<>(this, cgh.class, true));
      this.bU.a(3, new ccv<>(this, cgw.class, 10, true, false, cgw.bZ));
   }

   public static bvl.a q() {
      return ckv.gu().a(bvm.v, 0.25);
   }

   @Override
   protected void b(je $$0, dua $$1) {
      this.a(this.t(), 0.15F, 1.0F);
   }

   abstract awc t();

   @Override
   public void m_() {
      boolean $$0 = this.gi();
      if ($$0) {
         cvl $$1 = this.a(btr.f);
         if (!$$1.f()) {
            if ($$1.m()) {
               cvg $$2 = $$1.h();
               $$1.b($$1.o() + this.af.a(2));
               if ($$1.o() >= $$1.p()) {
                  this.a($$2, btr.f);
                  this.a(btr.f, cvl.k);
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
      if (this.dh() instanceof bun $$0) {
         this.aU = $$0.aU;
      }
   }

   @Override
   protected void a(azk $$0, bri $$1) {
      super.a($$0, $$1);
      this.a(btr.a, new cvl(cvo.ow));
   }

   @Nullable
   @Override
   public bux a(dei $$0, bri $$1, btp $$2, @Nullable bux $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      azk $$4 = $$0.C_();
      this.a($$4, $$1);
      this.a($$0, $$4, $$1);
      this.y();
      this.a_($$4.i() < 0.55F * $$1.d());
      if (this.a(btr.f).f()) {
         LocalDate $$5 = LocalDate.now();
         int $$6 = $$5.get(ChronoField.DAY_OF_MONTH);
         int $$7 = $$5.get(ChronoField.MONTH_OF_YEAR);
         if ($$7 == 10 && $$6 == 31 && $$4.i() < 0.25F) {
            this.a(btr.f, new cvl($$4.i() < 0.1F ? dgx.ef : dgx.ee));
            this.bW[btr.f.b()] = 0.0F;
         }
      }

      return $$3;
   }

   public void y() {
      if (this.dS() != null && !this.dS().B) {
         this.bT.a(this.e);
         this.bT.a(this.d);
         cvl $$0 = this.b(cok.a(this, cvo.ow));
         if ($$0.a(cvo.ow)) {
            int $$1 = this.go();
            if (this.dS().am() != brh.d) {
               $$1 = this.gp();
            }

            this.d.c($$1);
            this.bT.a(4, this.d);
         } else {
            this.bT.a(4, this.e);
         }
      }
   }

   protected int go() {
      return 20;
   }

   protected int gp() {
      return 40;
   }

   @Override
   public void a(buf $$0, float $$1) {
      cvl $$2 = this.b(cok.a(this, cvo.ow));
      cvl $$3 = this.h($$2);
      cnw $$4 = this.a($$3, $$1, $$2);
      double $$5 = $$0.dx() - this.dx();
      double $$6 = $$0.e(0.3333333333333333) - $$4.dz();
      double $$7 = $$0.dD() - this.dD();
      double $$8 = Math.sqrt($$5 * $$5 + $$7 * $$7);
      if (this.dS() instanceof arg $$9) {
         coi.a($$4, $$9, $$3, $$5, $$6 + $$8 * 0.2F, $$7, 1.6F, (float)(14 - $$9.am().a() * 4));
      }

      this.a(awd.xo, 1.0F, 1.0F / (this.dV().i() * 0.4F + 0.8F));
   }

   protected cnw a(cvl $$0, float $$1, @Nullable cvl $$2) {
      return cok.a(this, $$0, $$1, $$2);
   }

   @Override
   public boolean a(cwi $$0) {
      return $$0 == cvo.ow;
   }

   @Override
   public void a(uf $$0) {
      super.a($$0);
      this.y();
   }

   @Override
   public void a(btr $$0, cvl $$1) {
      super.a($$0, $$1);
      if (!this.dS().B) {
         this.y();
      }
   }

   public boolean gq() {
      return this.ct();
   }
}
