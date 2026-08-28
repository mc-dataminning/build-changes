import java.util.function.Predicate;

public abstract class clm extends bvd implements cle {
   protected clm(bug<? extends clm> $$0, dev $$1) {
      super($$0, $$1);
      this.bN = 5;
   }

   @Override
   public awl dn() {
      return awl.f;
   }

   @Override
   public void n_() {
      this.eZ();
      this.gA();
      super.n_();
   }

   protected void gA() {
      float $$0 = this.bz();
      if ($$0 > 0.5F) {
         this.bc += 2;
      }
   }

   @Override
   protected boolean aa() {
      return true;
   }

   @Override
   protected awj aV() {
      return awk.mX;
   }

   @Override
   protected awj aW() {
      return awk.mW;
   }

   @Override
   protected awj d(bsp $$0) {
      return awk.mU;
   }

   @Override
   protected awj o_() {
      return awk.mT;
   }

   @Override
   public buv.a eP() {
      return new buv.a(awk.mV, awk.mS);
   }

   @Override
   public float a(jg $$0, dey $$1) {
      return -$$1.w($$0);
   }

   public static boolean a(dfl $$0, jg $$1, azr $$2) {
      if ($$0.a(dfe.a, $$1) > $$2.a(32)) {
         return false;
      } else {
         dyz $$3 = $$0.D_();
         int $$4 = $$3.e();
         if ($$4 < 15 && $$0.a(dfe.b, $$1) > $$4) {
            return false;
         } else {
            int $$5 = $$0.E().ad() ? $$0.c($$1, 10) : $$0.A($$1);
            return $$5 <= $$3.d().a($$2);
         }
      }
   }

   public static boolean b(bug<? extends clm> $$0, dfl $$1, buf $$2, jg $$3, azr $$4) {
      return $$1.am() != brv.a && (buf.b($$2) || a($$1, $$3, $$4)) && a($$0, $$1, $$2, $$3, $$4);
   }

   public static boolean c(bug<? extends clm> $$0, dew $$1, buf $$2, jg $$3, azr $$4) {
      return $$1.am() != brv.a && a($$0, $$1, $$2, $$3, $$4);
   }

   public static bwc.a gB() {
      return bux.E().a(bwd.c);
   }

   @Override
   public boolean eo() {
      return true;
   }

   @Override
   protected boolean ep() {
      return true;
   }

   public boolean a(coh $$0) {
      return true;
   }

   @Override
   public cvx d(cvx $$0) {
      if ($$0.h() instanceof cwt) {
         Predicate<cvx> $$1 = ((cwt)$$0.h()).d();
         cvx $$2 = cwt.a(this, $$1);
         return $$2.f() ? new cvx(cwb.ox) : $$2;
      } else {
         return cvx.k;
      }
   }
}
