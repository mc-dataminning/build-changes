import java.util.List;
import javax.annotation.Nullable;

public class ckp extends ckl {
   public static final double c = 0.375;

   public ckp(bul<? extends ckp> $$0, dfb $$1) {
      super($$0, $$1);
   }

   public ckp(dfb $$0, jh $$1) {
      super(bul.al, $$0, $$1);
      this.a_((double)$$1.u(), (double)$$1.v(), (double)$$1.w());
   }

   @Override
   protected void a(akp.a $$0) {
   }

   @Override
   protected void m() {
      this.o((double)this.b.u() + 0.5, (double)this.b.v() + 0.375, (double)this.b.w() + 0.5);
      double $$0 = (double)this.ar().l() / 2.0;
      double $$1 = (double)this.ar().m();
      this.a(new ezi(this.dC() - $$0, this.dE(), this.dI() - $$0, this.dC() + $$0, this.dE() + $$1, this.dI() + $$0));
   }

   @Override
   public boolean a(double $$0) {
      return $$0 < 1024.0;
   }

   @Override
   public void b(@Nullable bue $$0) {
      this.a(awl.nR, 1.0F, 1.0F);
   }

   @Override
   public void b(uk $$0) {
   }

   @Override
   public void a(uk $$0) {
   }

   @Override
   public bsd a(com $$0, bsc $$1) {
      if (this.dX().C) {
         return bsd.a;
      } else {
         boolean $$2 = false;
         List<buy> $$3 = cwl.a(this.dX(), this.q(), $$1x -> {
            bue $$2x = $$1x.C();
            return $$2x == $$0 || $$2x == this;
         });

         for (buy $$4 : $$3) {
            if ($$4.C() == $$0) {
               $$4.b(this, true);
               $$2 = true;
            }
         }

         boolean $$5 = false;
         if (!$$2) {
            this.av();
            if ($$0.gl().d) {
               for (buy $$6 : $$3) {
                  if ($$6.M_() && $$6.C() == this) {
                     $$6.a(true, false);
                     $$5 = true;
                  }
               }
            }
         }

         if ($$2 || $$5) {
            this.a(eag.b, $$0);
         }

         return bsd.a;
      }
   }

   @Override
   public boolean o() {
      return this.dX().a_(this.b).a(axa.T);
   }

   public static ckp b(dfb $$0, jh $$1) {
      int $$2 = $$1.u();
      int $$3 = $$1.v();
      int $$4 = $$1.w();

      for (ckp $$6 : $$0.a(ckp.class, new ezi((double)$$2 - 1.0, (double)$$3 - 1.0, (double)$$4 - 1.0, (double)$$2 + 1.0, (double)$$3 + 1.0, (double)$$4 + 1.0))) {
         if ($$6.q().equals($$1)) {
            return $$6;
         }
      }

      ckp $$7 = new ckp($$0, $$1);
      $$0.b($$7);
      return $$7;
   }

   public void t() {
      this.a(awl.nS, 1.0F, 1.0F);
   }

   @Override
   public zp<ace> a(arm $$0) {
      return new acf(this, 0, this.q());
   }

   @Override
   public ezn u(float $$0) {
      return this.o($$0).b(0.0, 0.2, 0.0);
   }

   @Override
   public cwb dK() {
      return new cwb(cwf.uM);
   }
}
