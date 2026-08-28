import com.mojang.serialization.Codec;

public class elc extends ejm<elx> {
   public elc(Codec<elx> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ejo<elx> $$0) {
      djz $$1 = $$0.b();
      iu $$2 = $$0.e();
      $$0.f();
      if (!$$1.v($$2)) {
         return false;
      } else {
         for (ja $$3 : ja.values()) {
            if ($$3 != ja.a && dvs.a($$1, $$2.a($$3), $$3)) {
               $$1.a($$2, dmh.fx.m().b(dvs.a($$3), Boolean.valueOf(true)), 2);
               return true;
            }
         }

         return false;
      }
   }
}
