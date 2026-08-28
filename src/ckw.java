import java.util.List;
import javax.annotation.Nullable;

public class ckw extends cks {
   public static final double b = 0.375;

   public ckw(bus<? extends ckw> $$0, dfm $$1) {
      super($$0, $$1);
   }

   public ckw(dfm $$0, jh $$1) {
      super(bus.au, $$0, $$1);
      this.a_((double)$$1.u(), (double)$$1.v(), (double)$$1.w());
   }

   @Override
   protected void a(akq.a $$0) {
   }

   @Override
   protected void j() {
      this.o((double)this.a.u() + 0.5, (double)this.a.v() + 0.375, (double)this.a.w() + 0.5);
      double $$0 = (double)this.aq().l() / 2.0;
      double $$1 = (double)this.aq().m();
      this.a(new ezt(this.dA() - $$0, this.dC(), this.dG() - $$0, this.dA() + $$0, this.dC() + $$1, this.dG() + $$0));
   }

   @Override
   public boolean a(double $$0) {
      return $$0 < 1024.0;
   }

   @Override
   public void a(arp $$0, @Nullable bul $$1) {
      this.a(awn.nR, 1.0F, 1.0F);
   }

   @Override
   public void b(ul $$0) {
   }

   @Override
   public void a(ul $$0) {
   }

   @Override
   public bsk a(cou $$0, bsj $$1) {
      if (this.dV().C) {
         return bsk.a;
      } else {
         boolean $$2 = false;
         List<bvf> $$3 = cww.a(this.dV(), this.n(), $$1x -> {
            bul $$2x = $$1x.A();
            return $$2x == $$0 || $$2x == this;
         });

         for (bvf $$4 : $$3) {
            if ($$4.A() == $$0) {
               $$4.b(this, true);
               $$2 = true;
            }
         }

         boolean $$5 = false;
         if (!$$2) {
            this.at();
            if ($$0.gh().d) {
               for (bvf $$6 : $$3) {
                  if ($$6.N_() && $$6.A() == this) {
                     $$6.a(true, false);
                     $$5 = true;
                  }
               }
            }
         }

         if ($$2 || $$5) {
            this.a(ear.b, $$0);
         }

         return bsk.a;
      }
   }

   @Override
   public boolean l() {
      return this.dV().a_(this.a).a(axc.T);
   }

   public static ckw a(dfm $$0, jh $$1) {
      int $$2 = $$1.u();
      int $$3 = $$1.v();
      int $$4 = $$1.w();

      for (ckw $$6 : $$0.a(ckw.class, new ezt((double)$$2 - 1.0, (double)$$3 - 1.0, (double)$$4 - 1.0, (double)$$2 + 1.0, (double)$$3 + 1.0, (double)$$4 + 1.0))) {
         if ($$6.n().equals($$1)) {
            return $$6;
         }
      }

      ckw $$7 = new ckw($$0, $$1);
      $$0.b($$7);
      return $$7;
   }

   public void q() {
      this.a(awn.nS, 1.0F, 1.0F);
   }

   @Override
   public zq<acf> a(arn $$0) {
      return new acg(this, 0, this.n());
   }

   @Override
   public ezy u(float $$0) {
      return this.o($$0).b(0.0, 0.2, 0.0);
   }

   @Override
   public cwm dI() {
      return new cwm(cwq.vc);
   }
}
