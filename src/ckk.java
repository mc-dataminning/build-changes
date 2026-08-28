import java.util.List;
import javax.annotation.Nullable;

public class ckk extends ckg {
   public static final double c = 0.375;

   public ckk(bug<? extends ckk> $$0, dev $$1) {
      super($$0, $$1);
   }

   public ckk(dev $$0, jg $$1) {
      super(bug.al, $$0, $$1);
      this.a_((double)$$1.u(), (double)$$1.v(), (double)$$1.w());
   }

   @Override
   protected void a(ako.a $$0) {
   }

   @Override
   protected void m() {
      this.o((double)this.b.u() + 0.5, (double)this.b.v() + 0.375, (double)this.b.w() + 0.5);
      double $$0 = (double)this.aq().l() / 2.0;
      double $$1 = (double)this.aq().m();
      this.a(new ezc(this.dC() - $$0, this.dE(), this.dI() - $$0, this.dC() + $$0, this.dE() + $$1, this.dI() + $$0));
   }

   @Override
   public boolean a(double $$0) {
      return $$0 < 1024.0;
   }

   @Override
   public void b(@Nullable btz $$0) {
      this.a(awk.nR, 1.0F, 1.0F);
   }

   @Override
   public void b(uj $$0) {
   }

   @Override
   public void a(uj $$0) {
   }

   @Override
   public bry a(coh $$0, brx $$1) {
      if (this.dX().C) {
         return bry.a;
      } else {
         boolean $$2 = false;
         List<but> $$3 = cwh.a(this.dX(), this.q(), $$1x -> {
            btz $$2x = $$1x.C();
            return $$2x == $$0 || $$2x == this;
         });

         for (but $$4 : $$3) {
            if ($$4.C() == $$0) {
               $$4.b(this, true);
               $$2 = true;
            }
         }

         boolean $$5 = false;
         if (!$$2) {
            this.au();
            if ($$0.gl().d) {
               for (but $$6 : $$3) {
                  if ($$6.M_() && $$6.C() == this) {
                     $$6.a(true, false);
                     $$5 = true;
                  }
               }
            }
         }

         if ($$2 || $$5) {
            this.a(eaa.b, $$0);
         }

         return bry.a;
      }
   }

   @Override
   public boolean o() {
      return this.dX().a_(this.b).a(awz.T);
   }

   public static ckk b(dev $$0, jg $$1) {
      int $$2 = $$1.u();
      int $$3 = $$1.v();
      int $$4 = $$1.w();

      for (ckk $$6 : $$0.a(ckk.class, new ezc((double)$$2 - 1.0, (double)$$3 - 1.0, (double)$$4 - 1.0, (double)$$2 + 1.0, (double)$$3 + 1.0, (double)$$4 + 1.0))) {
         if ($$6.q().equals($$1)) {
            return $$6;
         }
      }

      ckk $$7 = new ckk($$0, $$1);
      $$0.b($$7);
      return $$7;
   }

   public void t() {
      this.a(awk.nS, 1.0F, 1.0F);
   }

   @Override
   public zo<acd> a(arl $$0) {
      return new ace(this, 0, this.q());
   }

   @Override
   public ezh u(float $$0) {
      return this.o($$0).b(0.0, 0.2, 0.0);
   }

   @Override
   public cvx dK() {
      return new cvx(cwb.uM);
   }
}
