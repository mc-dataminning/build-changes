import java.util.List;
import javax.annotation.Nullable;

public class ckx extends ckt {
   public static final double b = 0.375;

   public ckx(but<? extends ckx> $$0, dgj $$1) {
      super($$0, $$1);
   }

   public ckx(dgj $$0, ji $$1) {
      super(but.av, $$0, $$1);
      this.a_((double)$$1.u(), (double)$$1.v(), (double)$$1.w());
   }

   @Override
   protected void a(akc.a $$0) {
   }

   @Override
   protected void l() {
      this.o((double)this.a.u() + 0.5, (double)this.a.v() + 0.375, (double)this.a.w() + 0.5);
      double $$0 = (double)this.aq().l() / 2.0;
      double $$1 = (double)this.aq().m();
      this.a(new faw(this.dA() - $$0, this.dC(), this.dG() - $$0, this.dA() + $$0, this.dC() + $$1, this.dG() + $$0));
   }

   @Override
   public boolean a(double $$0) {
      return $$0 < 1024.0;
   }

   @Override
   public void a(ard $$0, @Nullable bum $$1) {
      this.a(awa.oq, 1.0F, 1.0F);
   }

   @Override
   public void b(tq $$0) {
   }

   @Override
   public void a(tq $$0) {
   }

   @Override
   public bsl a(coy $$0, bsk $$1) {
      if (this.dV().C) {
         return bsl.a;
      } else {
         boolean $$2 = false;
         List<bvg> $$3 = cxa.a(this.dV(), this.p(), $$1x -> {
            bum $$2x = $$1x.D();
            return $$2x == $$0 || $$2x == this;
         });

         for (bvg $$4 : $$3) {
            if ($$4.D() == $$0) {
               $$4.b(this, true);
               $$2 = true;
            }
         }

         boolean $$5 = false;
         if (!$$2) {
            this.at();
            if ($$0.gj().d) {
               for (bvg $$6 : $$3) {
                  if ($$6.P_() && $$6.D() == this) {
                     $$6.A();
                     $$5 = true;
                  }
               }
            }
         }

         if ($$2 || $$5) {
            this.a(ebu.b, $$0);
         }

         return bsl.a;
      }
   }

   @Override
   public boolean m() {
      return this.dV().a_(this.a).a(awp.U);
   }

   public static ckx a(dgj $$0, ji $$1) {
      int $$2 = $$1.u();
      int $$3 = $$1.v();
      int $$4 = $$1.w();

      for (ckx $$6 : $$0.a(ckx.class, new faw((double)$$2 - 1.0, (double)$$3 - 1.0, (double)$$4 - 1.0, (double)$$2 + 1.0, (double)$$3 + 1.0, (double)$$4 + 1.0))) {
         if ($$6.p().equals($$1)) {
            return $$6;
         }
      }

      ckx $$7 = new ckx($$0, $$1);
      $$0.b($$7);
      return $$7;
   }

   public void s() {
      this.a(awa.or, 1.0F, 1.0F);
   }

   @Override
   public yw<abl> a(arb $$0) {
      return new abm(this, 0, this.p());
   }

   @Override
   public fbb u(float $$0) {
      return this.o($$0).b(0.0, 0.2, 0.0);
   }

   @Override
   public cwq dI() {
      return new cwq(cwu.vK);
   }
}
