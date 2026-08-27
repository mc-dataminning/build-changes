import com.mojang.serialization.Codec;

public class ebg extends dzz<ecv> {
   public ebg(Codec<ecv> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eab<ecv> $$0) {
      ecv $$1 = $$0.f();
      dbu $$2 = $$0.b();
      io $$3 = $$0.e();
      drd $$4 = $$1.a().a($$0.d(), $$3);
      if ($$4.a($$2, $$3)) {
         if ($$4.b() instanceof dgi) {
            if (!$$2.u($$3.c())) {
               return false;
            }

            dgi.a($$2, $$4, $$3, 2);
         } else {
            $$2.a($$3, $$4, 2);
         }

         return true;
      } else {
         return false;
      }
   }
}
