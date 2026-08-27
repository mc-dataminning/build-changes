import javax.annotation.Nullable;

public class cvv extends csc implements csw {
   private final avn a;

   public cvv(dfc $$0, avn $$1, cuc.a $$2) {
      super($$0, $$2);
      this.a = $$1;
   }

   @Override
   public bqa a(cyf $$0) {
      bqa $$1 = super.a($$0);
      cly $$2 = $$0.o();
      if ($$1.a() && $$2 != null && !$$2.f()) {
         bpz $$3 = $$0.p();
         $$2.a($$3, cuk.rV.v());
      }

      return $$1;
   }

   @Override
   public String a() {
      return this.s();
   }

   @Override
   protected avn a(dtc $$0) {
      return this.a;
   }

   @Override
   public boolean a(@Nullable cly $$0, dca $$1, ir $$2, @Nullable ewq $$3) {
      if ($$1.k($$2) && $$1.u($$2)) {
         if (!$$1.C) {
            $$1.a($$2, this.d().n(), 3);
         }

         $$1.a($$0, dxv.z, $$2);
         $$1.a($$0, $$2, this.a, avq.e, 1.0F, 1.0F);
         return true;
      } else {
         return false;
      }
   }
}
