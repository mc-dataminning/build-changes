import com.mojang.serialization.Codec;

public class ecd extends eaw<eds> {
   public ecd(Codec<eds> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eay<eds> $$0) {
      eds $$1 = $$0.f();
      dcr $$2 = $$0.b();
      iz $$3 = $$0.e();
      dsa $$4 = $$1.a().a($$0.d(), $$3);
      if ($$4.a($$2, $$3)) {
         if ($$4.b() instanceof dhf) {
            if (!$$2.u($$3.c())) {
               return false;
            }

            dhf.a($$2, $$4, $$3, 2);
         } else {
            $$2.a($$3, $$4, 2);
         }

         return true;
      } else {
         return false;
      }
   }
}
