import javax.annotation.Nullable;

public class cxj extends cuh implements cuw {
   private final awk a;

   public cxj(die $$0, awk $$1, cvx.a $$2) {
      super($$0, $$2);
      this.a = $$1;
   }

   @Override
   public bsd a(czu $$0) {
      bsd $$1 = super.a($$0);
      com $$2 = $$0.o();
      if ($$1.a() && $$2 != null) {
         $$2.a($$0.p(), cun.a($$0.n(), $$2));
      }

      return $$1;
   }

   @Override
   protected awk a(dvj $$0) {
      return this.a;
   }

   @Override
   public boolean a(@Nullable com $$0, dfb $$1, jh $$2, @Nullable ezj $$3) {
      if ($$1.k($$2) && $$1.u($$2)) {
         if (!$$1.C) {
            $$1.a($$2, this.d().m(), 3);
         }

         $$1.a($$0, eag.z, $$2);
         $$1.a($$0, $$2, this.a, awm.e, 1.0F, 1.0F);
         return true;
      } else {
         return false;
      }
   }
}
