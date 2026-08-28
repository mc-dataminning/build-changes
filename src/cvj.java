import javax.annotation.Nullable;

public class cvj extends csc implements csu {
   private final avg a;

   public cvj(dfi $$0, avg $$1, cty.a $$2) {
      super($$0, $$2);
      this.a = $$1;
   }

   @Override
   public bqh a(cxp $$0) {
      bqh $$1 = super.a($$0);
      cml $$2 = $$0.o();
      if ($$1.a() && $$2 != null) {
         $$2.a($$0.p(), csj.a($$0.n(), $$2));
      }

      return $$1;
   }

   @Override
   public String a() {
      return this.t();
   }

   @Override
   protected avg a(dsl $$0) {
      return this.a;
   }

   @Override
   public boolean a(@Nullable cml $$0, dcg $$1, ja $$2, @Nullable ewd $$3) {
      if ($$1.k($$2) && $$1.u($$2)) {
         if (!$$1.B) {
            $$1.a($$2, this.d().o(), 3);
         }

         $$1.a($$0, dxh.z, $$2);
         $$1.a($$0, $$2, this.a, avi.e, 1.0F, 1.0F);
         return true;
      } else {
         return false;
      }
   }
}
