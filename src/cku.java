import java.util.List;
import javax.annotation.Nullable;

public class cku extends ckq {
   public static final double b = 0.375;

   public cku(buq<? extends cku> $$0, dgg $$1) {
      super($$0, $$1);
   }

   public cku(dgg $$0, ji $$1) {
      super(buq.av, $$0, $$1);
      this.a_((double)$$1.u(), (double)$$1.v(), (double)$$1.w());
   }

   @Override
   protected void a(akb.a $$0) {
   }

   @Override
   protected void l() {
      this.o((double)this.a.u() + 0.5, (double)this.a.v() + 0.375, (double)this.a.w() + 0.5);
      double $$0 = (double)this.aq().l() / 2.0;
      double $$1 = (double)this.aq().m();
      this.a(new fat(this.dB() - $$0, this.dD(), this.dH() - $$0, this.dB() + $$0, this.dD() + $$1, this.dH() + $$0));
   }

   @Override
   public boolean a(double $$0) {
      return $$0 < 1024.0;
   }

   @Override
   public void a(arc $$0, @Nullable buj $$1) {
      this.a(avz.oq, 1.0F, 1.0F);
   }

   @Override
   public void b(tq $$0) {
   }

   @Override
   public void a(tq $$0) {
   }

   @Override
   public bsi a(cov $$0, bsh $$1) {
      if (this.dW().C) {
         return bsi.a;
      } else {
         boolean $$2 = false;
         List<bvd> $$3 = cwx.a(this.dW(), this.p(), $$1x -> {
            buj $$2x = $$1x.A();
            return $$2x == $$0 || $$2x == this;
         });

         for (bvd $$4 : $$3) {
            if ($$4.A() == $$0) {
               $$4.b(this, true);
               $$2 = true;
            }
         }

         boolean $$5 = false;
         if (!$$2) {
            this.at();
            if ($$0.gj().d) {
               for (bvd $$6 : $$3) {
                  if ($$6.P_() && $$6.A() == this) {
                     $$6.a(true, false);
                     $$5 = true;
                  }
               }
            }
         }

         if ($$2 || $$5) {
            this.a(ebr.b, $$0);
         }

         return bsi.a;
      }
   }

   @Override
   public boolean m() {
      return this.dW().a_(this.a).a(awo.U);
   }

   public static cku a(dgg $$0, ji $$1) {
      int $$2 = $$1.u();
      int $$3 = $$1.v();
      int $$4 = $$1.w();

      for (cku $$6 : $$0.a(cku.class, new fat((double)$$2 - 1.0, (double)$$3 - 1.0, (double)$$4 - 1.0, (double)$$2 + 1.0, (double)$$3 + 1.0, (double)$$4 + 1.0))) {
         if ($$6.p().equals($$1)) {
            return $$6;
         }
      }

      cku $$7 = new cku($$0, $$1);
      $$0.b($$7);
      return $$7;
   }

   public void s() {
      this.a(avz.or, 1.0F, 1.0F);
   }

   @Override
   public yv<abk> a(ara $$0) {
      return new abl(this, 0, this.p());
   }

   @Override
   public fay u(float $$0) {
      return this.o($$0).b(0.0, 0.2, 0.0);
   }

   @Override
   public cwn dJ() {
      return new cwn(cwr.vK);
   }
}
