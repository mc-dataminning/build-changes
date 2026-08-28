import com.mojang.serialization.Codec;

public class ees extends edc<efn> {
   public ees(Codec<efn> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ede<efn> $$0) {
      dep $$1 = $$0.b();
      je $$2 = $$0.e();
      $$0.f();
      if (!$$1.u($$2)) {
         return false;
      } else {
         for (jj $$3 : jj.values()) {
            if ($$3 != jj.a && dps.a($$1, $$2.a($$3), $$3)) {
               $$1.a($$2, dgx.ff.o().b(dps.a($$3), Boolean.valueOf(true)), 2);
               return true;
            }
         }

         return false;
      }
   }
}
