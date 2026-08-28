import com.mojang.serialization.Codec;

public class ekj extends eit<ele> {
   public ekj(Codec<ele> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eiv<ele> $$0) {
      djo $$1 = $$0.b();
      iu $$2 = $$0.e();
      $$0.f();
      if (!$$1.v($$2)) {
         return false;
      } else {
         for (ja $$3 : ja.values()) {
            if ($$3 != ja.a && dva.a($$1, $$2.a($$3), $$3)) {
               $$1.a($$2, dlw.ft.m().b(dva.a($$3), Boolean.valueOf(true)), 2);
               return true;
            }
         }

         return false;
      }
   }
}
