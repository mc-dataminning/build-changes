import com.mojang.serialization.Codec;

public class ecj extends eat<ede> {
   public ecj(Codec<ede> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eav<ede> $$0) {
      dco $$1 = $$0.b();
      iz $$2 = $$0.e();
      $$0.f();
      if (!$$1.u($$2)) {
         return false;
      } else {
         for (je $$3 : je.values()) {
            if ($$3 != je.a && dnq.a($$1, $$2.a($$3), $$3)) {
               $$1.a($$2, dew.ff.n().a(dnq.a($$3), Boolean.valueOf(true)), 2);
               return true;
            }
         }

         return false;
      }
   }
}
