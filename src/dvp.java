import com.mojang.serialization.Codec;

public class dvp extends dtz<dwk> {
   public dvp(Codec<dwk> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dub<dwk> $$0) {
      cwm $$1 = $$0.b();
      hz $$2 = $$0.e();
      $$0.f();
      if (!$$1.u($$2)) {
         return false;
      } else {
         for (ie $$3 : ie.values()) {
            if ($$3 != ie.a && dhm.a($$1, $$2.a($$3), $$3)) {
               $$1.a($$2, cyu.ff.o().a(dhm.a($$3), Boolean.valueOf(true)), 2);
               return true;
            }
         }

         return false;
      }
   }
}
