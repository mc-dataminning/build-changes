import com.mojang.serialization.Codec;

public class ecn extends eax<edi> {
   public ecn(Codec<edi> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eaz<edi> $$0) {
      dcs $$1 = $$0.b();
      iz $$2 = $$0.e();
      $$0.f();
      if (!$$1.u($$2)) {
         return false;
      } else {
         for (je $$3 : je.values()) {
            if ($$3 != je.a && dnu.a($$1, $$2.a($$3), $$3)) {
               $$1.a($$2, dfa.ff.o().a(dnu.a($$3), Boolean.valueOf(true)), 2);
               return true;
            }
         }

         return false;
      }
   }
}
