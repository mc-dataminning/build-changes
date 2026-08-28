import java.util.function.Predicate;

public abstract class ckd extends bty implements cjv {
   protected ckd(bta<? extends ckd> $$0, dby $$1) {
      super($$0, $$1);
      this.bN = 5;
   }

   @Override
   public awb de() {
      return awb.f;
   }

   @Override
   public void n_() {
      this.eV();
      this.gv();
      super.n_();
   }

   protected void gv() {
      float $$0 = this.bt();
      if ($$0 > 0.5F) {
         this.bf += 2;
      }
   }

   @Override
   protected boolean X() {
      return true;
   }

   @Override
   protected avz aP() {
      return awa.mY;
   }

   @Override
   protected avz aQ() {
      return awa.mX;
   }

   @Override
   protected avz d(brn $$0) {
      return awa.mV;
   }

   @Override
   protected avz o_() {
      return awa.mU;
   }

   @Override
   public btp.a eL() {
      return new btp.a(awa.mW, awa.mT);
   }

   @Override
   public float a(iz $$0, dcb $$1) {
      return -$$1.w($$0);
   }

   public static boolean a(dcn $$0, iz $$1, azh $$2) {
      if ($$0.a(dch.a, $$1) > $$2.a(32)) {
         return false;
      } else {
         dvu $$3 = $$0.D_();
         int $$4 = $$3.e();
         if ($$4 < 15 && $$0.a(dch.b, $$1) > $$4) {
            return false;
         } else {
            int $$5 = $$0.E().ac() ? $$0.c($$1, 10) : $$0.A($$1);
            return $$5 <= $$3.d().a($$2);
         }
      }
   }

   public static boolean b(bta<? extends ckd> $$0, dcn $$1, btt $$2, iz $$3, azh $$4) {
      return $$1.al() != bqr.a && (btt.b($$2) || a($$1, $$3, $$4)) && a($$0, $$1, $$2, $$3, $$4);
   }

   public static boolean c(bta<? extends ckd> $$0, dbz $$1, btt $$2, iz $$3, azh $$4) {
      return $$1.al() != bqr.a && a($$0, $$1, $$2, $$3, $$4);
   }

   public static buw.a gw() {
      return btr.A().a(bux.c);
   }

   @Override
   public boolean eh() {
      return true;
   }

   @Override
   protected boolean ei() {
      return true;
   }

   public boolean f(cmx $$0) {
      return true;
   }

   @Override
   public cup g(cup $$0) {
      if ($$0.g() instanceof cvi) {
         Predicate<cup> $$1 = ((cvi)$$0.g()).d();
         cup $$2 = cvi.a(this, $$1);
         return $$2.e() ? new cup(cus.ov) : $$2;
      } else {
         return cup.l;
      }
   }
}
