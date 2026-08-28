import com.mojang.serialization.Codec;

public class ecu extends ebe<edp> {
   public ecu(Codec<edp> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ebg<edp> $$0) {
      dcz $$1 = $$0.b();
      ja $$2 = $$0.e();
      $$0.f();
      if (!$$1.u($$2)) {
         return false;
      } else {
         for (jf $$3 : jf.values()) {
            if ($$3 != jf.a && dob.a($$1, $$2.a($$3), $$3)) {
               $$1.a($$2, dfh.ff.o().a(dob.a($$3), Boolean.valueOf(true)), 2);
               return true;
            }
         }

         return false;
      }
   }
}
