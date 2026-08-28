import javax.annotation.Nullable;

public class cvx extends csm implements cte {
   private final avn a;

   public cvx(dfw $$0, avn $$1, cuj.a $$2) {
      super($$0, $$2);
      this.a = $$1;
   }

   @Override
   public bqq a(cyd $$0) {
      bqq $$1 = super.a($$0);
      cmv $$2 = $$0.o();
      if ($$1.a() && $$2 != null) {
         $$2.a($$0.p(), cst.a($$0.n(), $$2));
      }

      return $$1;
   }

   @Override
   public String a() {
      return this.t();
   }

   @Override
   protected avn a(dta $$0) {
      return this.a;
   }

   @Override
   public boolean a(@Nullable cmv $$0, dcu $$1, jd $$2, @Nullable ews $$3) {
      if ($$1.k($$2) && $$1.u($$2)) {
         if (!$$1.B) {
            $$1.a($$2, this.d().o(), 3);
         }

         $$1.a($$0, dxw.z, $$2);
         $$1.a($$0, $$2, this.a, avp.e, 1.0F, 1.0F);
         return true;
      } else {
         return false;
      }
   }
}
