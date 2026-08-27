import com.mojang.serialization.Codec;

public class dlv extends dko<dnk> {
   public dlv(Codec<dnk> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dkq<dnk> $$0) {
      dnk $$1 = $$0.f();
      cng $$2 = $$0.b();
      gu $$3 = $$0.e();
      dcb $$4 = $$1.a().a($$0.d(), $$3);
      if ($$4.a($$2, $$3)) {
         if ($$4.b() instanceof crr) {
            if (!$$2.t($$3.c())) {
               return false;
            }

            crr.a($$2, $$4, $$3, 2);
         } else {
            $$2.a($$3, $$4, 2);
         }

         return true;
      } else {
         return false;
      }
   }
}
