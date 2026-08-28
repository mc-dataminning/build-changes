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
      this.a(new ewv(this.du() - $$0, this.dw(), this.dA() - $$0, this.du() + $$0, this.dw() + $$1, this.dA() + $$0));
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
      if (this.dP().B) {
         return bqr.a;
      } else {
         boolean $$2 = false;
         double $$3 = 7.0;
         List<btp> $$4 = this.dP().a(btp.class, new ewv(this.du() - 7.0, this.dw() - 7.0, this.dA() - 7.0, this.du() + 7.0, this.dw() + 7.0, this.dA() + 7.0));

         for (btp $$5 : $$4) {
            if ($$5.A() == $$0) {
               $$5.b(this, true);
               $$2 = true;
            }
         }

         boolean $$6 = false;
         if (!$$2) {
            this.aq();
            if ($$0.ga().d) {
               for (btp $$7 : $$4) {
                  if ($$7.N_() && $$7.A() == this) {
                     $$7.a(true, false);
                     $$6 = true;
                  }
               }
            }
         }

         if ($$2 || $$6) {
            this.a(dxz.b, $$0);
         }

         return bqr.c;
      }
   }

   @Override
   public boolean s() {
      return this.dP().a_(this.b).a(awe.S);
   }

   public static cjb b(dcw $$0, jd $$1) {
      int $$2 = $$1.u();
      int $$3 = $$1.v();
      int $$4 = $$1.w();

      for (cjb $$6 : $$0.a(cjb.class, new ewv((double)$$2 - 1.0, (double)$$3 - 1.0, (double)$$4 - 1.0, (double)$$2 + 1.0, (double)$$3 + 1.0, (double)$$4 + 1.0))) {
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
   public exa s(float $$0) {
      return this.m($$0).b(0.0, 0.2, 0.0);
   }

   @Override
   public cuq dC() {
      return new cuq(cut.uK);
   }
}
