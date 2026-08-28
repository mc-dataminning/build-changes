import com.mojang.serialization.Codec;

public class ecg extends eaz<edv> {
   public ecg(Codec<edv> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ebb<edv> $$0) {
      edv $$1 = $$0.f();
      dcu $$2 = $$0.b();
      iz $$3 = $$0.e();
      dsd $$4 = $$1.a().a($$0.d(), $$3);
      if ($$4.a($$2, $$3)) {
         if ($$4.b() instanceof dhi) {
            if (!$$2.u($$3.c())) {
               return false;
            }

            dhi.a($$2, $$4, $$3, 2);
         } else {
            $$2.a($$3, $$4, 2);
         }

         return true;
      } else {
         return false;
      }
   }
}
