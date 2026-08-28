import com.mojang.serialization.Codec;

public class eej extends edc<efy> {
   public eej(Codec<efy> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ede<efy> $$0) {
      efy $$1 = $$0.f();
      dep $$2 = $$0.b();
      je $$3 = $$0.e();
      dua $$4 = $$1.a().a($$0.d(), $$3);
      if ($$4.a($$2, $$3)) {
         if ($$4.b() instanceof djd) {
            if (!$$2.u($$3.d())) {
               return false;
            }

            djd.a($$2, $$4, $$3, 2);
         } else {
            $$2.a($$3, $$4, 2);
         }

         return true;
      } else {
         return false;
      }
   }
}
