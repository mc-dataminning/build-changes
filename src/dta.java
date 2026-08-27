import com.mojang.serialization.Codec;

public class dta extends drt<dup> {
   public dta(Codec<dup> $$0) {
      super($$0);
   }

   @Override
   public boolean a(drv<dup> $$0) {
      dup $$1 = $$0.f();
      cuj $$2 = $$0.b();
      hx $$3 = $$0.e();
      djg $$4 = $$1.a().a($$0.d(), $$3);
      if ($$4.a($$2, $$3)) {
         if ($$4.b() instanceof cyx) {
            if (!$$2.u($$3.c())) {
               return false;
            }

            cyx.a($$2, $$4, $$3, 2);
         } else {
            $$2.a($$3, $$4, 2);
         }

         return true;
      } else {
         return false;
      }
   }
}
