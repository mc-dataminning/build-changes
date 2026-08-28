import com.mojang.serialization.Codec;

public class ecm extends eaw<edh> {
   public ecm(Codec<edh> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eay<edh> $$0) {
      dcr $$1 = $$0.b();
      iz $$2 = $$0.e();
      $$0.f();
      if (!$$1.u($$2)) {
         return false;
      } else {
         for (je $$3 : je.values()) {
            if ($$3 != je.a && dnt.a($$1, $$2.a($$3), $$3)) {
               $$1.a($$2, dez.ff.o().a(dnt.a($$3), Boolean.valueOf(true)), 2);
               return true;
            }
         }

         return false;
      }
   }
}
