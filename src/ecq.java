import com.mojang.serialization.Codec;

public class ecq extends eba<edl> {
   public ecq(Codec<edl> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ebc<edl> $$0) {
      dcv $$1 = $$0.b();
      iz $$2 = $$0.e();
      $$0.f();
      if (!$$1.u($$2)) {
         return false;
      } else {
         for (je $$3 : je.values()) {
            if ($$3 != je.a && dnx.a($$1, $$2.a($$3), $$3)) {
               $$1.a($$2, dfd.ff.o().a(dnx.a($$3), Boolean.valueOf(true)), 2);
               return true;
            }
         }

         return false;
      }
   }
}
