import java.util.List;
import javax.annotation.Nullable;

public class cah extends caf {
   public static final double e = 0.375;

   public cah(bku<? extends cah> $$0, csa $$1) {
      super($$0, $$1);
   }

   public cah(csa $$0, ht $$1) {
      super(bku.ah, $$0, $$1);
      this.a_((double)$$1.u(), (double)$$1.v(), (double)$$1.w());
   }

   @Override
   protected void z() {
      this.p((double)this.c.u() + 0.5, (double)this.c.v() + 0.375, (double)this.c.w() + 0.5);
      double $$0 = (double)this.ai().k() / 2.0;
      double $$1 = (double)this.ai().l();
      this.a(new ejp(this.ds() - $$0, this.du(), this.dy() - $$0, this.ds() + $$0, this.du() + $$1, this.dy() + $$0));
   }

   @Override
   public void a(hx $$0) {
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
   protected float a(bls $$0, bkr $$1) {
      return 0.0625F;
   }

   @Override
   public boolean a(double $$0) {
      return $$0 < 1024.0;
   }

   @Override
   public void a(@Nullable bkq $$0) {
      this.a(aqr.mK, 1.0F, 1.0F);
   }

   @Override
   public void b(rz $$0) {
   }

   @Override
   public void a(rz $$0) {
   }

   @Override
   public bix a(cdu $$0, biw $$1) {
      if (this.dN().B) {
         return bix.a;
      } else {
         boolean $$2 = false;
         double $$3 = 7.0;
         List<bli> $$4 = this.dN().a(bli.class, new ejp(this.ds() - 7.0, this.du() - 7.0, this.dy() - 7.0, this.ds() + 7.0, this.du() + 7.0, this.dy() + 7.0));

         for (bli $$5 : $$4) {
            if ($$5.fU() == $$0) {
               $$5.b(this, true);
               $$2 = true;
            }
         }

         boolean $$6 = false;
         if (!$$2) {
            this.am();
            if ($$0.fU().d) {
               for (bli $$7 : $$4) {
                  if ($$7.fT() && $$7.fU() == this) {
                     $$7.a(true, false);
                     $$6 = true;
                  }
               }
            }
         }

         if ($$2 || $$6) {
            this.a(dls.b, $$0);
         }

         return bix.b;
      }
   }

   @Override
   public boolean A() {
      return this.dN().a_(this.c).a(arg.S);
   }

   public static cah b(csa $$0, ht $$1) {
      int $$2 = $$1.u();
      int $$3 = $$1.v();
      int $$4 = $$1.w();

      for (cah $$6 : $$0.a(cah.class, new ejp((double)$$2 - 1.0, (double)$$3 - 1.0, (double)$$4 - 1.0, (double)$$2 + 1.0, (double)$$3 + 1.0, (double)$$4 + 1.0))) {
         if ($$6.E().equals($$1)) {
            return $$6;
         }
      }

      cah $$7 = new cah($$0, $$1);
      $$0.b($$7);
      return $$7;
   }

   @Override
   public void D() {
      this.a(aqr.mL, 1.0F, 1.0F);
   }

   @Override
   public wk<yd> dk() {
      return new ye(this, 0, this.E());
   }

   @Override
   public eju q(float $$0) {
      return this.l($$0).b(0.0, 0.2, 0.0);
   }

   @Override
   public clj dA() {
      return new clj(clm.uC);
   }
}
