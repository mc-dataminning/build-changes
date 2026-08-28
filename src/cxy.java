import javax.annotation.Nullable;

public class cxy extends cuw implements cvl {
   private final avz a;

   public cxy(djn $$0, avz $$1, cwm.a $$2) {
      super($$0, $$2);
      this.a = $$1;
   }

   @Override
   public bsl a(daj $$0) {
      bsl $$1 = super.a($$0);
      coy $$2 = $$0.o();
      if ($$1.a() && $$2 != null) {
         $$2.a($$0.p(), cvc.b($$0.n(), $$2));
      }

      return $$1;
   }

   @Override
   protected avz a(dwy $$0) {
      return this.a;
   }

   @Override
   public boolean a(@Nullable coy $$0, dgj $$1, ji $$2, @Nullable fax $$3) {
      if ($$1.k($$2) && $$1.u($$2)) {
         if (!$$1.C) {
            $$1.a($$2, this.d().m(), 3);
         }

         $$1.a($$0, ebu.z, $$2);
         $$1.a($$0, $$2, this.a, awb.e, 1.0F, 1.0F);
         return true;
      } else {
         return false;
      }
   }
}
