import java.util.List;
import javax.annotation.Nullable;

public class cjb extends cix {
   public static final double c = 0.375;

   public cjb(bsx<? extends cjb> $$0, dcw $$1) {
      super($$0, $$1);
   }

   public cjb(dcw $$0, jd $$1) {
      super(bsx.al, $$0, $$1);
      this.a_((double)$$1.u(), (double)$$1.v(), (double)$$1.w());
   }

   @Override
   protected void a(aka.a $$0) {
   }

   @Override
   protected void p() {
      this.o((double)this.b.u() + 0.5, (double)this.b.v() + 0.375, (double)this.b.w() + 0.5);
      double $$0 = (double)this.am().l() / 2.0;
      double $$1 = (double)this.am().m();
      this.a(new ewx(this.dt() - $$0, this.dv(), this.dz() - $$0, this.dt() + $$0, this.dv() + $$1, this.dz() + $$0));
   }

   @Override
   public boolean a(double $$0) {
      return $$0 < 1024.0;
   }

   @Override
   public void b(@Nullable bsr $$0) {
      this.a(avp.nS, 1.0F, 1.0F);
   }

   @Override
   public void b(ub $$0) {
   }

   @Override
   public void a(ub $$0) {
   }

   @Override
   public bqr a(cmx $$0, bqq $$1) {
      if (this.dO().B) {
         return bqr.a;
      } else {
         boolean $$2 = false;
         List<btk> $$3 = cuz.a(this.dO(), this.t(), $$1x -> {
            bsr $$2x = $$1x.A();
            return $$2x == $$0 || $$2x == this;
         });

         for (btk $$4 : $$3) {
            if ($$4.A() == $$0) {
               $$4.b(this, true);
               $$2 = true;
            }
         }

         boolean $$5 = false;
         if (!$$2) {
            this.aq();
            if ($$0.fZ().d) {
               for (btk $$6 : $$3) {
                  if ($$6.N_() && $$6.A() == this) {
                     $$6.a(true, false);
                     $$5 = true;
                  }
               }
            }
         }

         if ($$2 || $$5) {
            this.a(dxz.b, $$0);
         }

         return bqr.c;
      }
   }

   @Override
   public boolean s() {
      return this.dO().a_(this.b).a(awe.T);
   }

   public static cjb b(dcw $$0, jd $$1) {
      int $$2 = $$1.u();
      int $$3 = $$1.v();
      int $$4 = $$1.w();

      for (cjb $$6 : $$0.a(cjb.class, new ewx((double)$$2 - 1.0, (double)$$3 - 1.0, (double)$$4 - 1.0, (double)$$2 + 1.0, (double)$$3 + 1.0, (double)$$4 + 1.0))) {
         if ($$6.t().equals($$1)) {
            return $$6;
         }
      }

      cjb $$7 = new cjb($$0, $$1);
      $$0.b($$7);
      return $$7;
   }

   @Override
   public void v() {
      this.a(avp.nT, 1.0F, 1.0F);
   }

   @Override
   public zg<abu> a(aqt $$0) {
      return new abv(this, 0, this.t());
   }

   @Override
   public exc s(float $$0) {
      return this.m($$0).b(0.0, 0.2, 0.0);
   }

   @Override
   public cuq dB() {
      return new cuq(cut.uK);
   }
}
