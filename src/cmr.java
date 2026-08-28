import java.util.List;
import javax.annotation.Nullable;

public class cmr extends cmn {
   public static final double b = 0.375;

   public cmr(bwj<? extends cmr> $$0, dip $$1) {
      super($$0, $$1);
   }

   public cmr(dip $$0, iu $$1) {
      super(bwj.av, $$0, $$1);
      this.a_((double)$$1.u(), (double)$$1.v(), (double)$$1.w());
   }

   @Override
   protected void a(akl.a $$0) {
   }

   @Override
   protected void f() {
      this.o((double)this.a.u() + 0.5, (double)this.a.v() + 0.375, (double)this.a.w() + 0.5);
      double $$0 = (double)this.aq().l() / 2.0;
      double $$1 = (double)this.aq().m();
      this.a(new fdr(this.dA() - $$0, this.dC(), this.dG() - $$0, this.dA() + $$0, this.dC() + $$1, this.dG() + $$0));
   }

   @Override
   public boolean a(double $$0) {
      return $$0 < 1024.0;
   }

   @Override
   public void a(aro $$0, @Nullable bwa $$1) {
      this.a(awl.oA, 1.0F, 1.0F);
   }

   @Override
   public void b(tx $$0) {
   }

   @Override
   public void a(tx $$0) {
   }

   @Override
   public bty a(cqs $$0, btx $$1) {
      if (this.dV().C) {
         return bty.a;
      } else {
         boolean $$2 = false;
         List<bwx> $$3 = czc.a(this.dV(), this.j(), $$1x -> {
            bwa $$2x = $$1x.C();
            return $$2x == $$0 || $$2x == this;
         });

         for (bwx $$4 : $$3) {
            if ($$4.C() == $$0) {
               $$4.a_(this, true);
               $$2 = true;
            }
         }

         boolean $$5 = false;
         if (!$$2) {
            this.at();
            if ($$0.gj().d) {
               for (bwx $$6 : $$3) {
                  if ($$6.O_() && $$6.C() == this) {
                     $$6.z();
                     $$5 = true;
                  }
               }
            }
         }

         if ($$2 || $$5) {
            this.a(eeo.b, $$0);
         }

         return bty.a;
      }
   }

   @Override
   public boolean g() {
      return this.dV().a_(this.a).a(axa.U);
   }

   public static cmr b(dip $$0, iu $$1) {
      int $$2 = $$1.u();
      int $$3 = $$1.v();
      int $$4 = $$1.w();

      for (cmr $$6 : $$0.a(cmr.class, new fdr((double)$$2 - 1.0, (double)$$3 - 1.0, (double)$$4 - 1.0, (double)$$2 + 1.0, (double)$$3 + 1.0, (double)$$4 + 1.0))) {
         if ($$6.j().equals($$1)) {
            return $$6;
         }
      }

      cmr $$7 = new cmr($$0, $$1);
      $$0.b($$7);
      return $$7;
   }

   public void m() {
      this.a(awl.oB, 1.0F, 1.0F);
   }

   @Override
   public zd<abs> a(arm $$0) {
      return new abt(this, 0, this.j());
   }

   @Override
   public fdw v(float $$0) {
      return this.p($$0).b(0.0, 0.2, 0.0);
   }

   @Override
   public cys dI() {
      return new cys(cyw.vO);
   }
}
