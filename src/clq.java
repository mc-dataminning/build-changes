import java.util.List;
import javax.annotation.Nullable;

public class clq extends clm {
   public static final double b = 0.375;

   public clq(bvi<? extends clq> $$0, dgz $$1) {
      super($$0, $$1);
   }

   public clq(dgz $$0, ji $$1) {
      super(bvi.av, $$0, $$1);
      this.a_((double)$$1.u(), (double)$$1.v(), (double)$$1.w());
   }

   @Override
   protected void a(akb.a $$0) {
   }

   @Override
   protected void f() {
      this.o((double)this.a.u() + 0.5, (double)this.a.v() + 0.375, (double)this.a.w() + 0.5);
      double $$0 = (double)this.aq().l() / 2.0;
      double $$1 = (double)this.aq().m();
      this.a(new fbs(this.dz() - $$0, this.dB(), this.dF() - $$0, this.dz() + $$0, this.dB() + $$1, this.dF() + $$0));
   }

   @Override
   public boolean a(double $$0) {
      return $$0 < 1024.0;
   }

   @Override
   public void a(ard $$0, @Nullable bva $$1) {
      this.a(awa.oA, 1.0F, 1.0F);
   }

   @Override
   public void b(tq $$0) {
   }

   @Override
   public void a(tq $$0) {
   }

   @Override
   public bsy a(cpr $$0, bsx $$1) {
      if (this.dU().C) {
         return bsy.a;
      } else {
         boolean $$2 = false;
         List<bvw> $$3 = cxr.a(this.dU(), this.j(), $$1x -> {
            bva $$2x = $$1x.C();
            return $$2x == $$0 || $$2x == this;
         });

         for (bvw $$4 : $$3) {
            if ($$4.C() == $$0) {
               $$4.b(this, true);
               $$2 = true;
            }
         }

         boolean $$5 = false;
         if (!$$2) {
            this.at();
            if ($$0.gm().d) {
               for (bvw $$6 : $$3) {
                  if ($$6.O_() && $$6.C() == this) {
                     $$6.z();
                     $$5 = true;
                  }
               }
            }
         }

         if ($$2 || $$5) {
            this.a(ecp.b, $$0);
         }

         return bsy.a;
      }
   }

   @Override
   public boolean g() {
      return this.dU().a_(this.a).a(awp.U);
   }

   public static clq a(dgz $$0, ji $$1) {
      int $$2 = $$1.u();
      int $$3 = $$1.v();
      int $$4 = $$1.w();

      for (clq $$6 : $$0.a(clq.class, new fbs((double)$$2 - 1.0, (double)$$3 - 1.0, (double)$$4 - 1.0, (double)$$2 + 1.0, (double)$$3 + 1.0, (double)$$4 + 1.0))) {
         if ($$6.j().equals($$1)) {
            return $$6;
         }
      }

      clq $$7 = new clq($$0, $$1);
      $$0.b($$7);
      return $$7;
   }

   public void m() {
      this.a(awa.oB, 1.0F, 1.0F);
   }

   @Override
   public yw<abl> a(arb $$0) {
      return new abm(this, 0, this.j());
   }

   @Override
   public fbx v(float $$0) {
      return this.p($$0).b(0.0, 0.2, 0.0);
   }

   @Override
   public cxh dH() {
      return new cxh(cxl.vM);
   }
}
