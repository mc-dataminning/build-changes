import java.util.List;
import javax.annotation.Nullable;

public class ckv extends ckr {
   public static final double b = 0.375;

   public ckv(bur<? extends ckv> $$0, dgh $$1) {
      super($$0, $$1);
   }

   public ckv(dgh $$0, ji $$1) {
      super(bur.av, $$0, $$1);
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
      this.a(new fau(this.dA() - $$0, this.dC(), this.dG() - $$0, this.dA() + $$0, this.dC() + $$1, this.dG() + $$0));
   }

   @Override
   public boolean a(double $$0) {
      return $$0 < 1024.0;
   }

   @Override
   public void a(ard $$0, @Nullable buk $$1) {
      this.a(awa.oq, 1.0F, 1.0F);
   }

   @Override
   public void b(tq $$0) {
   }

   @Override
   public void a(tq $$0) {
   }

   @Override
   public bsj a(cow $$0, bsi $$1) {
      if (this.dV().C) {
         return bsj.a;
      } else {
         boolean $$2 = false;
         List<bve> $$3 = cwy.a(this.dV(), this.p(), $$1x -> {
            buk $$2x = $$1x.D();
            return $$2x == $$0 || $$2x == this;
         });

         for (bve $$4 : $$3) {
            if ($$4.D() == $$0) {
               $$4.b(this, true);
               $$2 = true;
            }
         }

         boolean $$5 = false;
         if (!$$2) {
            this.at();
            if ($$0.gj().d) {
               for (bve $$6 : $$3) {
                  if ($$6.P_() && $$6.D() == this) {
                     $$6.A();
                     $$5 = true;
                  }
               }
            }
         }

         if ($$2 || $$5) {
            this.a(ebs.b, $$0);
         }

         return bsj.a;
      }
   }

   @Override
   public boolean m() {
      return this.dV().a_(this.a).a(awp.U);
   }

   public static ckv a(dgh $$0, ji $$1) {
      int $$2 = $$1.u();
      int $$3 = $$1.v();
      int $$4 = $$1.w();

      for (ckv $$6 : $$0.a(ckv.class, new fau((double)$$2 - 1.0, (double)$$3 - 1.0, (double)$$4 - 1.0, (double)$$2 + 1.0, (double)$$3 + 1.0, (double)$$4 + 1.0))) {
         if ($$6.p().equals($$1)) {
            return $$6;
         }
      }

      ckv $$7 = new ckv($$0, $$1);
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
   public faz u(float $$0) {
      return this.o($$0).b(0.0, 0.2, 0.0);
   }

   @Override
   public cwo dI() {
      return new cwo(cws.vK);
   }
}
