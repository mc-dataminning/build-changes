import java.util.List;
import javax.annotation.Nullable;

public class cbi extends cbg {
   public static final double e = 0.375;

   public cbi(blt<? extends cbi> $$0, cti $$1) {
      super($$0, $$1);
   }

   public cbi(cti $$0, hx $$1) {
      super(blt.ai, $$0, $$1);
      this.a_((double)$$1.u(), (double)$$1.v(), (double)$$1.w());
   }

   @Override
   protected void z() {
      this.p((double)this.c.u() + 0.5, (double)this.c.v() + 0.375, (double)this.c.w() + 0.5);
      double $$0 = (double)this.ai().k() / 2.0;
      double $$1 = (double)this.ai().l();
      this.a(new elh(this.dr() - $$0, this.dt(), this.dx() - $$0, this.dr() + $$0, this.dt() + $$1, this.dx() + $$0));
   }

   @Override
   public void a(ic $$0) {
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
   protected float a(bmr $$0, blq $$1) {
      return 0.0625F;
   }

   @Override
   public boolean a(double $$0) {
      return $$0 < 1024.0;
   }

   @Override
   public void a(@Nullable blp $$0) {
      this.a(arm.ne, 1.0F, 1.0F);
   }

   @Override
   public void b(sl $$0) {
   }

   @Override
   public void a(sl $$0) {
   }

   @Override
   public bjv a(cfb $$0, bju $$1) {
      if (this.dM().B) {
         return bjv.a;
      } else {
         boolean $$2 = false;
         double $$3 = 7.0;
         List<bmh> $$4 = this.dM().a(bmh.class, new elh(this.dr() - 7.0, this.dt() - 7.0, this.dx() - 7.0, this.dr() + 7.0, this.dt() + 7.0, this.dx() + 7.0));

         for (bmh $$5 : $$4) {
            if ($$5.fT() == $$0) {
               $$5.b(this, true);
               $$2 = true;
            }
         }

         boolean $$6 = false;
         if (!$$2) {
            this.am();
            if ($$0.fT().d) {
               for (bmh $$7 : $$4) {
                  if ($$7.fS() && $$7.fT() == this) {
                     $$7.a(true, false);
                     $$6 = true;
                  }
               }
            }
         }

         if ($$2 || $$6) {
            this.a(dnk.b, $$0);
         }

         return bjv.b;
      }
   }

   @Override
   public boolean A() {
      return this.dM().a_(this.c).a(asb.S);
   }

   public static cbi b(cti $$0, hx $$1) {
      int $$2 = $$1.u();
      int $$3 = $$1.v();
      int $$4 = $$1.w();

      for (cbi $$6 : $$0.a(cbi.class, new elh((double)$$2 - 1.0, (double)$$3 - 1.0, (double)$$4 - 1.0, (double)$$2 + 1.0, (double)$$3 + 1.0, (double)$$4 + 1.0))) {
         if ($$6.E().equals($$1)) {
            return $$6;
         }
      }

      cbi $$7 = new cbi($$0, $$1);
      $$0.b($$7);
      return $$7;
   }

   @Override
   public void D() {
      this.a(arm.nf, 1.0F, 1.0F);
   }

   @Override
   public xd<yx> dj() {
      return new yy(this, 0, this.E());
   }

   @Override
   public elm q(float $$0) {
      return this.l($$0).b(0.0, 0.2, 0.0);
   }

   @Override
   public cmr dz() {
      return new cmr(cmu.uD);
   }
}
