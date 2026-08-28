import com.mojang.serialization.Codec;

public class eco extends eay<edj> {
   public eco(Codec<edj> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eba<edj> $$0) {
      dct $$1 = $$0.b();
      iz $$2 = $$0.e();
      $$0.f();
      if (!$$1.u($$2)) {
         return false;
      } else {
         for (je $$3 : je.values()) {
            if ($$3 != je.a && dnv.a($$1, $$2.a($$3), $$3)) {
               $$1.a($$2, dfb.ff.o().a(dnv.a($$3), Boolean.valueOf(true)), 2);
               return true;
            }
         }

         return false;
      }
   }
}
