import com.mojang.serialization.Codec;

public class ecf extends eay<edu> {
   public ecf(Codec<edu> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eba<edu> $$0) {
      edu $$1 = $$0.f();
      dct $$2 = $$0.b();
      iz $$3 = $$0.e();
      dsc $$4 = $$1.a().a($$0.d(), $$3);
      if ($$4.a($$2, $$3)) {
         if ($$4.b() instanceof dhh) {
            if (!$$2.u($$3.c())) {
               return false;
            }

            dhh.a($$2, $$4, $$3, 2);
         } else {
            $$2.a($$3, $$4, 2);
         }

         return true;
      } else {
         return false;
      }
   }
}
