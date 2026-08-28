import java.util.List;
import javax.annotation.Nullable;

public class clm extends cli {
   public static final double b = 0.375;

   public clm(bvi<? extends clm> $$0, dgz $$1) {
      super($$0, $$1);
   }

   public clm(dgz $$0, jh $$1) {
      super(bvi.aw, $$0, $$1);
      this.a_((double)$$1.u(), (double)$$1.v(), (double)$$1.w());
   }

   @Override
   protected void a(akw.a $$0) {
   }

   @Override
   protected void l() {
      this.o((double)this.a.u() + 0.5, (double)this.a.v() + 0.375, (double)this.a.w() + 0.5);
      double $$0 = (double)this.aq().l() / 2.0;
      double $$1 = (double)this.aq().m();
      this.a(new fbm(this.dB() - $$0, this.dD(), this.dH() - $$0, this.dB() + $$0, this.dD() + $$1, this.dH() + $$0));
   }

   @Override
   public boolean a(double $$0) {
      return $$0 < 1024.0;
   }

   @Override
   public void a(arx $$0, @Nullable bvb $$1) {
      this.a(awv.oq, 1.0F, 1.0F);
   }

   @Override
   public void b(um $$0) {
   }

   @Override
   public void a(um $$0) {
   }

   @Override
   public bta a(cpo $$0, bsz $$1) {
      if (this.dW().C) {
         return bta.a;
      } else {
         boolean $$2 = false;
         List<bvv> $$3 = cxq.a(this.dW(), this.p(), $$1x -> {
            bvb $$2x = $$1x.A();
            return $$2x == $$0 || $$2x == this;
         });

         for (bvv $$4 : $$3) {
            if ($$4.A() == $$0) {
               $$4.b(this, true);
               $$2 = true;
            }
         }

         boolean $$5 = false;
         if (!$$2) {
            this.at();
            if ($$0.gj().d) {
               for (bvv $$6 : $$3) {
                  if ($$6.P_() && $$6.A() == this) {
                     $$6.a(true, false);
                     $$5 = true;
                  }
               }
            }
         }

         if ($$2 || $$5) {
            this.a(eck.b, $$0);
         }

         return bta.a;
      }
   }

   @Override
   public boolean m() {
      return this.dW().a_(this.a).a(axk.U);
   }

   public static clm a(dgz $$0, jh $$1) {
      int $$2 = $$1.u();
      int $$3 = $$1.v();
      int $$4 = $$1.w();

      for (clm $$6 : $$0.a(clm.class, new fbm((double)$$2 - 1.0, (double)$$3 - 1.0, (double)$$4 - 1.0, (double)$$2 + 1.0, (double)$$3 + 1.0, (double)$$4 + 1.0))) {
         if ($$6.p().equals($$1)) {
            return $$6;
         }
      }

      clm $$7 = new clm($$0, $$1);
      $$0.b($$7);
      return $$7;
   }

   public void s() {
      this.a(awv.or, 1.0F, 1.0F);
   }

   @Override
   public zr<acg> a(arv $$0) {
      return new ach(this, 0, this.p());
   }

   @Override
   public fbr u(float $$0) {
      return this.o($$0).b(0.0, 0.2, 0.0);
   }

   @Override
   public cxg dJ() {
      return new cxg(cxk.vK);
   }
}
