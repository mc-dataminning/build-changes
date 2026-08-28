import javax.annotation.Nullable;

public class cvx extends csp implements cti {
   private final avz a;

   public cvx(dfb $$0, avz $$1, cum.a $$2) {
      super($$0, $$2);
      this.a = $$1;
   }

   @Override
   public bqw a(cye $$0) {
      bqw $$1 = super.a($$0);
      cmz $$2 = $$0.o();
      if ($$1.a() && $$2 != null && !$$2.f()) {
         bqv $$3 = $$0.p();
         $$2.a($$3, cuu.qy.w());
      }

      return $$1;
   }

   @Override
   public String a() {
      return this.t();
   }

   @Override
   protected avz a(dse $$0) {
      return this.a;
   }

   @Override
   public boolean a(@Nullable cmz $$0, dca $$1, iz $$2, @Nullable evp $$3) {
      if ($$1.k($$2) && $$1.u($$2)) {
         if (!$$1.B) {
            $$1.a($$2, this.d().o(), 3);
         }

         $$1.a($$0, dwx.z, $$2);
         $$1.a($$0, $$2, this.a, awb.e, 1.0F, 1.0F);
         return true;
      } else {
         return false;
      }
   }
}
