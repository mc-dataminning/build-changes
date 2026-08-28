import javax.annotation.Nullable;

public class cze extends cwf implements cwt {
   private final awj a;

   public cze(dku $$0, awj $$1, cxu.a $$2) {
      super($$0, $$2);
      this.a = $$1;
   }

   @Override
   public btq a(dbp $$0) {
      btq $$1 = super.a($$0);
      cqi $$2 = $$0.o();
      if ($$1.a() && $$2 != null) {
         $$2.a($$0.p(), cwl.b($$0.n(), $$2));
      }

      return $$1;
   }

   @Override
   protected awj a(dym $$0) {
      return this.a;
   }

   @Override
   public boolean a(@Nullable bwr $$0, dhp $$1, jj $$2, @Nullable fcq $$3) {
      if ($$1.k($$2) && $$1.u($$2)) {
         if (!$$1.C) {
            $$1.a($$2, this.d().m(), 3);
         }

         $$1.a($$0, edm.z, $$2);
         $$1.a($$0, $$2, this.a, awl.e, 1.0F, 1.0F);
         return true;
      } else {
         return false;
      }
   }
}
