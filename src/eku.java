import com.mojang.serialization.Codec;

public class eku extends eje<elp> {
   public eku(Codec<elp> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ejg<elp> $$0) {
      dju $$1 = $$0.b();
      iu $$2 = $$0.e();
      $$0.f();
      if (!$$1.v($$2)) {
         return false;
      } else {
         for (ja $$3 : ja.values()) {
            if ($$3 != ja.a && dvk.a($$1, $$2.a($$3), $$3)) {
               $$1.a($$2, dmc.fu.m().b(dvk.a($$3), Boolean.valueOf(true)), 2);
               return true;
            }
         }

         return false;
      }
   }
}
