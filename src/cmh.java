import java.util.List;
import javax.annotation.Nullable;

public class cmh extends cmd {
   public static final double b = 0.375;

   public cmh(bwb<? extends cmh> $$0, dhp $$1) {
      super($$0, $$1);
   }

   public cmh(dhp $$0, jj $$1) {
      super(bwb.av, $$0, $$1);
      this.a_((double)$$1.u(), (double)$$1.v(), (double)$$1.w());
   }

   @Override
   protected void a(akk.a $$0) {
   }

   @Override
   protected void f() {
      this.o((double)this.a.u() + 0.5, (double)this.a.v() + 0.375, (double)this.a.w() + 0.5);
      double $$0 = (double)this.aq().l() / 2.0;
      double $$1 = (double)this.aq().m();
      this.a(new fcp(this.dA() - $$0, this.dC(), this.dG() - $$0, this.dA() + $$0, this.dC() + $$1, this.dG() + $$0));
   }

   @Override
   public boolean a(double $$0) {
      return $$0 < 1024.0;
   }

   @Override
   public void a(arn $$0, @Nullable bvs $$1) {
      this.a(awk.oA, 1.0F, 1.0F);
   }

   @Override
   public void b(tw $$0) {
   }

   @Override
   public void a(tw $$0) {
   }

   @Override
   public btq a(cqi $$0, btp $$1) {
      if (this.dV().C) {
         return btq.a;
      } else {
         boolean $$2 = false;
         List<bwp> $$3 = cyi.a(this.dV(), this.j(), $$1x -> {
            bvs $$2x = $$1x.C();
            return $$2x == $$0 || $$2x == this;
         });

         for (bwp $$4 : $$3) {
            if ($$4.C() == $$0) {
               $$4.b(this, true);
               $$2 = true;
            }
         }

         boolean $$5 = false;
         if (!$$2) {
            this.at();
            if ($$0.gj().d) {
               for (bwp $$6 : $$3) {
                  if ($$6.O_() && $$6.C() == this) {
                     $$6.z();
                     $$5 = true;
                  }
               }
            }
         }

         if ($$2 || $$5) {
            this.a(edm.b, $$0);
         }

         return btq.a;
      }
   }

   @Override
   public boolean g() {
      return this.dV().a_(this.a).a(awz.U);
   }

   public static cmh a(dhp $$0, jj $$1) {
      int $$2 = $$1.u();
      int $$3 = $$1.v();
      int $$4 = $$1.w();

      for (cmh $$6 : $$0.a(cmh.class, new fcp((double)$$2 - 1.0, (double)$$3 - 1.0, (double)$$4 - 1.0, (double)$$2 + 1.0, (double)$$3 + 1.0, (double)$$4 + 1.0))) {
         if ($$6.j().equals($$1)) {
            return $$6;
         }
      }

      cmh $$7 = new cmh($$0, $$1);
      $$0.b($$7);
      return $$7;
   }

   public void m() {
      this.a(awk.oB, 1.0F, 1.0F);
   }

   @Override
   public zc<abr> a(arl $$0) {
      return new abs(this, 0, this.j());
   }

   @Override
   public fcu v(float $$0) {
      return this.p($$0).b(0.0, 0.2, 0.0);
   }

   @Override
   public cxy dI() {
      return new cxy(cyc.vO);
   }
}
