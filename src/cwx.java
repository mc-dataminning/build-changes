import javax.annotation.Nullable;

public class cwx extends ctr implements cuh {
   private final awd a;

   public cwx(dhj $$0, awd $$1, cvk.a $$2) {
      super($$0, $$2);
      this.a = $$1;
   }

   @Override
   public brp a(czm $$0) {
      brp $$1 = super.a($$0);
      cnu $$2 = $$0.o();
      if ($$1.a() && $$2 != null) {
         $$2.a($$0.p(), ctx.a($$0.n(), $$2));
      }

      return $$1;
   }

   @Override
   public String a() {
      return this.s();
   }

   @Override
   protected awd a(duo $$0) {
      return this.a;
   }

   @Override
   public boolean a(@Nullable cnu $$0, deg $$1, je $$2, @Nullable eyo $$3) {
      if ($$1.k($$2) && $$1.u($$2)) {
         if (!$$1.B) {
            $$1.a($$2, this.d().o(), 3);
         }

         $$1.a($$0, dzl.z, $$2);
         $$1.a($$0, $$2, this.a, awf.e, 1.0F, 1.0F);
         return true;
      } else {
         return false;
      }
   }
}
