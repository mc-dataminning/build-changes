import com.mojang.serialization.Codec;

public class edh extends eca<eew> {
   public edh(Codec<eew> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ecc<eew> $$0) {
      eew $$1 = $$0.f();
      ddq $$2 = $$0.b();
      jd $$3 = $$0.e();
      dta $$4 = $$1.a().a($$0.d(), $$3);
      if ($$4.a($$2, $$3)) {
         if ($$4.b() instanceof die) {
            if (!$$2.u($$3.c())) {
               return false;
            }

            die.a($$2, $$4, $$3, 2);
         } else {
            $$2.a($$3, $$4, 2);
         }

         return true;
      } else {
         return false;
      }
   }
}
