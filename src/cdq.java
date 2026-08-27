import java.util.List;
import javax.annotation.Nullable;

public class cdq extends cdo {
   public static final double e = 0.375;

   public cdq(bnw<? extends cdq> $$0, cvr $$1) {
      super($$0, $$1);
   }

   public cdq(cvr $$0, hz $$1) {
      super(bnw.aj, $$0, $$1);
      this.a_((double)$$1.u(), (double)$$1.v(), (double)$$1.w());
   }

   @Override
   protected void z() {
      this.p((double)this.c.u() + 0.5, (double)this.c.v() + 0.375, (double)this.c.w() + 0.5);
      double $$0 = (double)this.ai().k() / 2.0;
      double $$1 = (double)this.ai().l();
      this.a(new enu(this.dr() - $$0, this.dt(), this.dx() - $$0, this.dr() + $$0, this.dt() + $$1, this.dx() + $$0));
   }

   @Override
   public void a(ie $$0) {
   }

   @Override
   public int B() {
      return 9;
   }

   @Override
   public int C() {
      return 9;
   }

   @Override
   public boolean a(double $$0) {
      return $$0 < 1024.0;
   }

   @Override
   public void a(@Nullable bnq $$0) {
      this.a(atl.nu, 1.0F, 1.0F);
   }

   @Override
   public void b(sw $$0) {
   }

   @Override
   public void a(sw $$0) {
   }

   @Override
   public blw a(chl $$0, blv $$1) {
      if (this.dM().B) {
         return blw.a;
      } else {
         boolean $$2 = false;
         double $$3 = 7.0;
         List<bok> $$4 = this.dM().a(bok.class, new enu(this.dr() - 7.0, this.dt() - 7.0, this.dx() - 7.0, this.dr() + 7.0, this.dt() + 7.0, this.dx() + 7.0));

         for (bok $$5 : $$4) {
            if ($$5.fV() == $$0) {
               $$5.b(this, true);
               $$2 = true;
            }
         }

         boolean $$6 = false;
         if (!$$2) {
            this.am();
            if ($$0.fU().d) {
               for (bok $$7 : $$4) {
                  if ($$7.fU() && $$7.fV() == this) {
                     $$7.a(true, false);
                     $$6 = true;
                  }
               }
            }
         }

         if ($$2 || $$6) {
            this.a(dpw.b, $$0);
         }

         return blw.b;
      }
   }

   @Override
   public boolean A() {
      return this.dM().a_(this.c).a(aua.S);
   }

   public static cdq b(cvr $$0, hz $$1) {
      int $$2 = $$1.u();
      int $$3 = $$1.v();
      int $$4 = $$1.w();

      for (cdq $$6 : $$0.a(cdq.class, new enu((double)$$2 - 1.0, (double)$$3 - 1.0, (double)$$4 - 1.0, (double)$$2 + 1.0, (double)$$3 + 1.0, (double)$$4 + 1.0))) {
         if ($$6.E().equals($$1)) {
            return $$6;
         }
      }

      cdq $$7 = new cdq($$0, $$1);
      $$0.b($$7);
      return $$7;
   }

   @Override
   public void D() {
      this.a(atl.nv, 1.0F, 1.0F);
   }

   @Override
   public xx<aag> di() {
      return new aah(this, 0, this.E());
   }

   @Override
   public enz q(float $$0) {
      return this.l($$0).b(0.0, 0.2, 0.0);
   }

   @Override
   public cpd dz() {
      return new cpd(cpg.uG);
   }
}
