import javax.annotation.Nullable;

public class csv extends cpq implements cqj {
   private final aun a;

   public csv(dch $$0, aun $$1, crn.a $$2) {
      super($$0, $$2);
      this.a = $$1;
   }

   @Override
   public bof a(cuz $$0) {
      bof $$1 = super.a($$0);
      cka $$2 = $$0.o();
      if ($$1.a() && $$2 != null && !$$2.f()) {
         boe $$3 = $$0.p();
         $$2.a($$3, crv.qx.x());
      }

      return $$1;
   }

   @Override
   public String a() {
      return this.u();
   }

   @Override
   protected aun a(dpi $$0) {
      return this.a;
   }

   @Override
   public boolean a(@Nullable cka $$0, czg $$1, id $$2, @Nullable esf $$3) {
      if ($$1.k($$2) && $$1.u($$2)) {
         if (!$$1.B) {
            $$1.a($$2, this.d().n(), 3);
         }

         $$1.a($$0, dub.z, $$2);
         $$1.a($$0, $$2, this.a, aup.e, 1.0F, 1.0F);
         return true;
      } else {
         return false;
      }
   }
}
