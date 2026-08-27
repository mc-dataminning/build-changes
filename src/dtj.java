import com.mojang.serialization.Codec;

public class dtj extends dsc<duy> {
   public dtj(Codec<duy> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dse<duy> $$0) {
      duy $$1 = $$0.f();
      cus $$2 = $$0.b();
      hx $$3 = $$0.e();
      djp $$4 = $$1.a().a($$0.d(), $$3);
      if ($$4.a($$2, $$3)) {
         if ($$4.b() instanceof czg) {
            if (!$$2.u($$3.c())) {
               return false;
            }

            czg.a($$2, $$4, $$3, 2);
         } else {
            $$2.a($$3, $$4, 2);
         }

         return true;
      } else {
         return false;
      }
   }
}
