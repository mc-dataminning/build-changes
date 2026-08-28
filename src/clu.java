import java.util.List;
import javax.annotation.Nullable;

public class clu extends clq {
   public static final double b = 0.375;

   public clu(bvq<? extends clu> $$0, dhh $$1) {
      super($$0, $$1);
   }

   public clu(dhh $$0, jh $$1) {
      super(bvq.aw, $$0, $$1);
      this.a_((double)$$1.u(), (double)$$1.v(), (double)$$1.w());
   }

   @Override
   protected void a(alg.a $$0) {
   }

   @Override
   protected void l() {
      this.o((double)this.a.u() + 0.5, (double)this.a.v() + 0.375, (double)this.a.w() + 0.5);
      double $$0 = (double)this.aq().l() / 2.0;
      double $$1 = (double)this.aq().m();
      this.a(new fbs(this.dB() - $$0, this.dD(), this.dH() - $$0, this.dB() + $$0, this.dD() + $$1, this.dH() + $$0));
   }

   @Override
   public boolean a(double $$0) {
      return $$0 < 1024.0;
   }

   @Override
   public void a(ash $$0, @Nullable bvj $$1) {
      this.a(axf.ok, 1.0F, 1.0F);
   }

   @Override
   public void b(ux $$0) {
   }

   @Override
   public void a(ux $$0) {
   }

   @Override
   public bti a(cpw $$0, bth $$1) {
      if (this.dW().C) {
         return bti.a;
      } else {
         boolean $$2 = false;
         List<bwd> $$3 = cxy.a(this.dW(), this.p(), $$1x -> {
            bvj $$2x = $$1x.A();
            return $$2x == $$0 || $$2x == this;
         });

         for (bwd $$4 : $$3) {
            if ($$4.A() == $$0) {
               $$4.b(this, true);
               $$2 = true;
            }
         }

         boolean $$5 = false;
         if (!$$2) {
            this.at();
            if ($$0.gj().d) {
               for (bwd $$6 : $$3) {
                  if ($$6.P_() && $$6.A() == this) {
                     $$6.a(true, false);
                     $$5 = true;
                  }
               }
            }
         }

         if ($$2 || $$5) {
            this.a(ecq.b, $$0);
         }

         return bti.a;
      }
   }

   @Override
   public boolean m() {
      return this.dW().a_(this.a).a(axu.U);
   }

   public static clu a(dhh $$0, jh $$1) {
      int $$2 = $$1.u();
      int $$3 = $$1.v();
      int $$4 = $$1.w();

      for (clu $$6 : $$0.a(clu.class, new fbs((double)$$2 - 1.0, (double)$$3 - 1.0, (double)$$4 - 1.0, (double)$$2 + 1.0, (double)$$3 + 1.0, (double)$$4 + 1.0))) {
         if ($$6.p().equals($$1)) {
            return $$6;
         }
      }

      clu $$7 = new clu($$0, $$1);
      $$0.b($$7);
      return $$7;
   }

   public void s() {
      this.a(axf.ol, 1.0F, 1.0F);
   }

   @Override
   public aac<acr> a(asf $$0) {
      return new acs(this, 0, this.p());
   }

   @Override
   public fbx u(float $$0) {
      return this.o($$0).b(0.0, 0.2, 0.0);
   }

   @Override
   public cxo dJ() {
      return new cxo(cxs.vA);
   }
}
