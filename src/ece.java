import com.mojang.serialization.Codec;

public class ece extends eax<edt> {
   public ece(Codec<edt> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eaz<edt> $$0) {
      edt $$1 = $$0.f();
      dcs $$2 = $$0.b();
      iz $$3 = $$0.e();
      dsb $$4 = $$1.a().a($$0.d(), $$3);
      if ($$4.a($$2, $$3)) {
         if ($$4.b() instanceof dhg) {
            if (!$$2.u($$3.c())) {
               return false;
            }

            dhg.a($$2, $$4, $$3, 2);
         } else {
            $$2.a($$3, $$4, 2);
         }

         return true;
      } else {
         return false;
      }
   }
}
