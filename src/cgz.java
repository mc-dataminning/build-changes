import java.time.LocalDate;
import java.time.temporal.ChronoField;
import javax.annotation.Nullable;

public abstract class cgz extends chr implements chv {
   private static final int b = 20;
   private static final int c = 40;
   private final bzb<cgz> d = new bzb<>(this, 1.0, 20, 15.0F);
   private final byl e = new byl(this, 1.2, false) {
      @Override
      public void d() {
         super.d();
         cgz.this.v(false);
      }

      @Override
      public void c() {
         super.c();
         cgz.this.v(true);
      }
   };

   protected cgz(bqr<? extends cgz> $$0, czu $$1) {
      super($$0, $$1);
      this.y();
   }

   @Override
   protected void z() {
      this.bS.a(2, new bze(this));
      this.bS.a(3, new bxu(this, 1.0));
      this.bS.a(3, new bxi<>(this, cdw.class, 6.0F, 1.0, 1.2));
      this.bS.a(5, new bzo(this, 1.0));
      this.bS.a(6, new byj(this, ckl.class, 8.0F));
      this.bS.a(6, new byw(this));
      this.bT.a(1, new bzt(this));
      this.bT.a(2, new bzu<>(this, ckl.class, true));
      this.bT.a(3, new bzu<>(this, cdf.class, true));
      this.bT.a(3, new bzu<>(this, cdu.class, 10, true, false, cdu.bZ));
   }

   public static bsk.a r() {
      return chr.gv().a(bsl.r, 0.25);
   }

   @Override
   protected void b(im $$0, dpy $$1) {
      this.a(this.u(), 0.15F, 1.0F);
   }

   abstract auy u();

   @Override
   public void n_() {
      boolean $$0 = this.gj();
      if ($$0) {
         csd $$1 = this.d(bqs.f);
         if (!$$1.d()) {
            if ($$1.k()) {
               $$1.b($$1.m() + this.ah.a(2));
               if ($$1.m() >= $$1.n()) {
                  this.e(bqs.f);
                  this.a(bqs.f, csd.i);
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
      if (this.db() instanceof brm $$0) {
         this.aZ = $$0.aZ;
      }
   }

   @Override
   protected void a(ayd $$0, boo $$1) {
      super.a($$0, $$1);
      this.a(bqs.a, new csd(csg.ou));
   }

   @Nullable
   @Override
   public brw a(daj $$0, boo $$1, bri $$2, @Nullable brw $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      ayd $$4 = $$0.E_();
      this.a($$4, $$1);
      this.b($$4, $$1);
      this.y();
      this.a_($$4.i() < 0.55F * $$1.d());
      if (this.d(bqs.f).d()) {
         LocalDate $$5 = LocalDate.now();
         int $$6 = $$5.get(ChronoField.DAY_OF_MONTH);
         int $$7 = $$5.get(ChronoField.MONTH_OF_YEAR);
         if ($$7 == 10 && $$6 == 31 && $$4.i() < 0.25F) {
            this.a(bqs.f, new csd($$4.i() < 0.1F ? dcx.ef : dcx.ee));
            this.bV[bqs.f.b()] = 0.0F;
         }
      }

      return $$3;
   }

   public void y() {
      if (this.dN() != null && !this.dN().B) {
         this.bS.a(this.e);
         this.bS.a(this.d);
         csd $$0 = this.b(clf.a(this, csg.ou));
         if ($$0.a(csg.ou)) {
            int $$1 = this.gp();
            if (this.dN().ak() != bon.d) {
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
   public void a(bre $$0, float $$1) {
      csd $$2 = this.g(this.b(clf.a(this, csg.ou)));
      ckr $$3 = this.b($$2, $$1);
      double $$4 = $$0.ds() - this.ds();
      double $$5 = $$0.e(0.3333333333333333) - $$3.du();
      double $$6 = $$0.dy() - this.dy();
      double $$7 = Math.sqrt($$4 * $$4 + $$6 * $$6);
      $$3.c($$4, $$5 + $$7 * 0.2F, $$6, 1.6F, (float)(14 - this.dN().ak().a() * 4));
      this.a(auz.wY, 1.0F, 1.0F / (this.ej().i() * 0.4F + 0.8F));
      this.dN().b($$3);
   }

   protected ckr b(csd $$0, float $$1) {
      return clf.a(this, $$0, $$1);
   }

   @Override
   public boolean a(csu $$0) {
      return $$0 == csg.ou;
   }

   @Override
   public void a(ty $$0) {
      super.a($$0);
      this.y();
   }

   @Override
   public void a(bqs $$0, csd $$1) {
      super.a($$0, $$1);
      if (!this.dN().B) {
         this.y();
      }
   }

   public boolean gr() {
      return this.cm();
   }
}
