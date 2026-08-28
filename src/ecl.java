import com.mojang.serialization.Codec;

public class ecl extends ebe<eea> {
   public ecl(Codec<eea> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ebg<eea> $$0) {
      eea $$1 = $$0.f();
      dcz $$2 = $$0.b();
      ja $$3 = $$0.e();
      dsh $$4 = $$1.a().a($$0.d(), $$3);
      if ($$4.a($$2, $$3)) {
         if ($$4.b() instanceof dhn) {
            if (!$$2.u($$3.c())) {
               return false;
            }

            dhn.a($$2, $$4, $$3, 2);
         } else {
            $$2.a($$3, $$4, 2);
         }

         return true;
      } else {
         return false;
      }
   }
}
