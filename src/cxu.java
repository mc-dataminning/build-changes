import javax.annotation.Nullable;

public class cxu extends cus implements cvh {
   private final awm a;

   public cxu(diq $$0, awm $$1, cwi.a $$2) {
      super($$0, $$2);
      this.a = $$1;
   }

   @Override
   public bsk a(daf $$0) {
      bsk $$1 = super.a($$0);
      cou $$2 = $$0.o();
      if ($$1.a() && $$2 != null) {
         $$2.a($$0.p(), cuy.a($$0.n(), $$2));
      }

      return $$1;
   }

   @Override
   protected awm a(dvv $$0) {
      return this.a;
   }

   @Override
   public boolean a(@Nullable cou $$0, dfm $$1, jh $$2, @Nullable ezu $$3) {
      if ($$1.k($$2) && $$1.u($$2)) {
         if (!$$1.C) {
            $$1.a($$2, this.d().m(), 3);
         }

         $$1.a($$0, ear.z, $$2);
         $$1.a($$0, $$2, this.a, awo.e, 1.0F, 1.0F);
         return true;
      } else {
         return false;
      }
   }
}
