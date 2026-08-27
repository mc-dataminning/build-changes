import javax.annotation.Nullable;

public class csm extends cph implements cqa {
   private final aul a;

   public csm(dby $$0, aul $$1, cre.a $$2) {
      super($$0, $$2);
      this.a = $$1;
   }

   @Override
   public boa a(cuq $$0) {
      boa $$1 = super.a($$0);
      cjt $$2 = $$0.o();
      if ($$1.a() && $$2 != null && !$$2.f()) {
         bnz $$3 = $$0.p();
         $$2.a($$3, crm.qx.x());
      }

      return $$1;
   }

   @Override
   public String a() {
      return this.u();
   }

   @Override
   protected aul a(doz $$0) {
      return this.a;
   }

   @Override
   public boolean a(@Nullable cjt $$0, cyx $$1, ib $$2, @Nullable erw $$3) {
      if ($$1.k($$2) && $$1.u($$2)) {
         if (!$$1.B) {
            $$1.a($$2, this.d().n(), 3);
         }

         $$1.a($$0, dts.z, $$2);
         $$1.a($$0, $$2, this.a, aun.e, 1.0F, 1.0F);
         return true;
      } else {
         return false;
      }
   }
}
