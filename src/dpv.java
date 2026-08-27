import com.mojang.serialization.Codec;

public class dpv extends doo<drk> {
   public dpv(Codec<drk> $$0) {
      super($$0);
   }

   @Override
   public boolean a(doq<drk> $$0) {
      drk $$1 = $$0.f();
      crt $$2 = $$0.b();
      ht $$3 = $$0.e();
      dgb $$4 = $$1.a().a($$0.d(), $$3);
      if ($$4.a($$2, $$3)) {
         if ($$4.b() instanceof cwg) {
            if (!$$2.t($$3.c())) {
               return false;
            }

            cwg.a($$2, $$4, $$3, 2);
         } else {
            $$2.a($$3, $$4, 2);
         }

         return true;
      } else {
         return false;
      }
   }
}
