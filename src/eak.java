import com.mojang.serialization.Codec;

public class eak extends dzd<ebz> {
   public eak(Codec<ebz> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dzf<ebz> $$0) {
      ebz $$1 = $$0.f();
      day $$2 = $$0.b();
      in $$3 = $$0.e();
      dqh $$4 = $$1.a().a($$0.d(), $$3);
      if ($$4.a($$2, $$3)) {
         if ($$4.b() instanceof dfm) {
            if (!$$2.u($$3.c())) {
               return false;
            }

            dfm.a($$2, $$4, $$3, 2);
         } else {
            $$2.a($$3, $$4, 2);
         }

         return true;
      } else {
         return false;
      }
   }
}
