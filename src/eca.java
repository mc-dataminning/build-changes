import com.mojang.serialization.Codec;

public class eca extends eat<edp> {
   public eca(Codec<edp> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eav<edp> $$0) {
      edp $$1 = $$0.f();
      dco $$2 = $$0.b();
      iz $$3 = $$0.e();
      drx $$4 = $$1.a().a($$0.d(), $$3);
      if ($$4.a($$2, $$3)) {
         if ($$4.b() instanceof dhc) {
            if (!$$2.u($$3.c())) {
               return false;
            }

            dhc.a($$2, $$4, $$3, 2);
         } else {
            $$2.a($$3, $$4, 2);
         }

         return true;
      } else {
         return false;
      }
   }
}
