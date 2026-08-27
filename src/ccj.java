import java.util.function.Predicate;

public abstract class ccj extends bmo implements ccb {
   protected ccj(blt<? extends ccj> $$0, cti $$1) {
      super($$0, $$1);
      this.bJ = 5;
   }

   @Override
   public arn db() {
      return arn.f;
   }

   @Override
   public void d_() {
      this.eQ();
      this.gj();
      super.d_();
   }

   protected void gj() {
      float $$0 = this.bo();
      if ($$0 > 0.5F) {
         this.bb += 2;
      }
   }

   @Override
   protected boolean X() {
      return true;
   }

   @Override
   protected arl aN() {
      return arm.mk;
   }

   @Override
   protected arl aO() {
      return arm.mj;
   }

   @Override
   protected arl d(bkn $$0) {
      return arm.mh;
   }

   @Override
   protected arl n_() {
      return arm.mg;
   }

   @Override
   public bmf.a eG() {
      return new bmf.a(arm.mi, arm.mf);
   }

   @Override
   public float a(hx $$0, ctl $$1) {
      return -$$1.w($$0);
   }

   public static boolean a(ctx $$0, hx $$1, aup $$2) {
      if ($$0.a(ctr.a, $$1) > $$2.a(32)) {
         return false;
      } else {
         dmj $$3 = $$0.E_();
         int $$4 = $$3.e();
         if ($$4 < 15 && $$0.a(ctr.b, $$1) > $$4) {
            return false;
         } else {
            int $$5 = $$0.E().aa() ? $$0.c($$1, 10) : $$0.A($$1);
            return $$5 <= $$3.d().a($$2);
         }
      }
   }

   public static boolean b(blt<? extends ccj> $$0, ctx $$1, bmj $$2, hx $$3, aup $$4) {
      return $$1.ak() != bjs.a && (bmj.b($$2) || a($$1, $$3, $$4)) && a($$0, $$1, $$2, $$3, $$4);
   }

   public static boolean c(blt<? extends ccj> $$0, ctj $$1, bmj $$2, hx $$3, aup $$4) {
      return $$1.ak() != bjs.a && a($$0, $$1, $$2, $$3, $$4);
   }

   public static bnk.a gk() {
      return bmh.C().a(bnl.c);
   }

   @Override
   public boolean ec() {
      return true;
   }

   @Override
   protected boolean ed() {
      return true;
   }

   public boolean f(cfb $$0) {
      return true;
   }

   @Override
   public cmr g(cmr $$0) {
      if ($$0.d() instanceof cnh) {
         Predicate<cmr> $$1 = ((cnh)$$0.d()).e();
         cmr $$2 = cnh.a(this, $$1);
         return $$2.b() ? new cmr(cmu.os) : $$2;
      } else {
         return cmr.f;
      }
   }
}
