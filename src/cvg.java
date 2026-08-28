import javax.annotation.Nullable;

public class cvg extends cry implements csr {
   private final ave a;

   public cvg(dff $$0, ave $$1, ctv.a $$2) {
      super($$0, $$2);
      this.a = $$1;
   }

   @Override
   public bqd a(cxm $$0) {
      bqd $$1 = super.a($$0);
      cmh $$2 = $$0.o();
      if ($$1.a() && $$2 != null && !$$2.f()) {
         bqc $$3 = $$0.p();
         $$2.a($$3, cud.qy.w());
      }

      return $$1;
   }

   @Override
   public String a() {
      return this.t();
   }

   @Override
   protected ave a(dsh $$0) {
      return this.a;
   }

   @Override
   public boolean a(@Nullable cmh $$0, dcd $$1, ja $$2, @Nullable evv $$3) {
      if ($$1.k($$2) && $$1.u($$2)) {
         if (!$$1.B) {
            $$1.a($$2, this.d().o(), 3);
         }

         $$1.a($$0, dxa.z, $$2);
         $$1.a($$0, $$2, this.a, avg.e, 1.0F, 1.0F);
         return true;
      } else {
         return false;
      }
   }
}
