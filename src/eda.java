import com.mojang.serialization.Codec;

public class eda extends ebk<edv> {
   public eda(Codec<edv> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ebm<edv> $$0) {
      ddb $$1 = $$0.b();
      ja $$2 = $$0.e();
      $$0.f();
      if (!$$1.u($$2)) {
         return false;
      } else {
         for (jf $$3 : jf.values()) {
            if ($$3 != jf.a && dod.a($$1, $$2.a($$3), $$3)) {
               $$1.a($$2, dfj.ff.o().a(dod.a($$3), Boolean.valueOf(true)), 2);
               return true;
            }
         }

         return false;
      }
   }
}
