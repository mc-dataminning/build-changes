import com.mojang.serialization.Codec;

public class ecp extends eaz<edk> {
   public ecp(Codec<edk> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ebb<edk> $$0) {
      dcu $$1 = $$0.b();
      iz $$2 = $$0.e();
      $$0.f();
      if (!$$1.u($$2)) {
         return false;
      } else {
         for (je $$3 : je.values()) {
            if ($$3 != je.a && dnw.a($$1, $$2.a($$3), $$3)) {
               $$1.a($$2, dfc.ff.o().a(dnw.a($$3), Boolean.valueOf(true)), 2);
               return true;
            }
         }

         return false;
      }
   }
}
