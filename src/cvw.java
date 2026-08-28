import javax.annotation.Nullable;

public class cvw extends cso implements cth {
   private final avz a;

   public cvw(dfa $$0, avz $$1, cul.a $$2) {
      super($$0, $$2);
      this.a = $$1;
   }

   @Override
   public bqv a(cyd $$0) {
      bqv $$1 = super.a($$0);
      cmy $$2 = $$0.o();
      if ($$1.a() && $$2 != null && !$$2.f()) {
         bqu $$3 = $$0.p();
         $$2.a($$3, cut.qy.w());
      }

      return $$1;
   }

   @Override
   public String a() {
      return this.t();
   }

   @Override
   protected avz a(dsd $$0) {
      return this.a;
   }

   @Override
   public boolean a(@Nullable cmy $$0, dbz $$1, iz $$2, @Nullable evo $$3) {
      if ($$1.k($$2) && $$1.u($$2)) {
         if (!$$1.B) {
            $$1.a($$2, this.d().o(), 3);
         }

         $$1.a($$0, dww.z, $$2);
         $$1.a($$0, $$2, this.a, awb.e, 1.0F, 1.0F);
         return true;
      } else {
         return false;
      }
   }
}
