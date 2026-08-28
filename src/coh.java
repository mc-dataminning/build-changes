import java.util.List;
import javax.annotation.Nullable;

public class coh extends cod {
   public static final double b = 0.375;

   public coh(bxn<? extends coh> $$0, dkj $$1) {
      super($$0, $$1);
   }

   public coh(dkj $$0, iw $$1) {
      super(bxn.aw, $$0, $$1);
      this.a_((double)$$1.u(), (double)$$1.v(), (double)$$1.w());
   }

   @Override
   protected void a(aky.a $$0) {
   }

   @Override
   protected void e() {
      this.o((double)this.a.u() + 0.5, (double)this.a.v() + 0.375, (double)this.a.w() + 0.5);
      double $$0 = (double)this.an().l() / 2.0;
      double $$1 = (double)this.an().m();
      this.a(new ffx(this.dA() - $$0, this.dC(), this.dG() - $$0, this.dA() + $$0, this.dC() + $$1, this.dG() + $$0));
   }

   @Override
   public boolean a(double $$0) {
      return $$0 < 1024.0;
   }

   @Override
   public void a(asb $$0, @Nullable bxe $$1) {
      this.a(awy.oE, 1.0F, 1.0F);
   }

   @Override
   public void b(ua $$0) {
   }

   @Override
   public void a(ua $$0) {
   }

   @Override
   public bvc a(csi $$0, bvb $$1) {
      if (this.dV().C) {
         return bvc.a;
      } else {
         boolean $$2 = false;
         List<byd> $$3 = dau.a(this.dV(), this.i(), $$1x -> {
            bxe $$2x = $$1x.B();
            return $$2x == $$0 || $$2x == this;
         });

         for (byd $$4 : $$3) {
            if ($$4.B() == $$0) {
               $$4.a_(this, true);
               $$2 = true;
            }
         }

         boolean $$5 = false;
         if (!$$2) {
            this.aq();
            if ($$0.gk().d) {
               for (byd $$6 : $$3) {
                  if ($$6.Q_() && $$6.B() == this) {
                     $$6.y();
                     $$5 = true;
                  }
               }
            }
         }

         if ($$2 || $$5) {
            this.a(egq.b, $$0);
         }

         return bvc.a;
      }
   }

   @Override
   public boolean f() {
      return this.dV().a_(this.a).a(axn.U);
   }

   public static coh b(dkj $$0, iw $$1) {
      int $$2 = $$1.u();
      int $$3 = $$1.v();
      int $$4 = $$1.w();

      for (coh $$6 : $$0.a(coh.class, new ffx((double)$$2 - 1.0, (double)$$3 - 1.0, (double)$$4 - 1.0, (double)$$2 + 1.0, (double)$$3 + 1.0, (double)$$4 + 1.0))) {
         if ($$6.i().equals($$1)) {
            return $$6;
         }
      }

      coh $$7 = new coh($$0, $$1);
      $$0.b($$7);
      return $$7;
   }

   @Override
   public void l() {
      this.a(awy.oF, 1.0F, 1.0F);
   }

   @Override
   public zo<acf> a(arz $$0) {
      return new acg(this, 0, this.i());
   }

   @Override
   public fgc v(float $$0) {
      return this.p($$0).b(0.0, 0.2, 0.0);
   }

   @Override
   public dak dI() {
      return new dak(dao.vV);
   }
}
