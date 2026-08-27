import com.mojang.serialization.Codec;

public class duz extends dts<dwo> {
   public duz(Codec<dwo> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dtu<dwo> $$0) {
      dwo $$1 = $$0.f();
      cwi $$2 = $$0.b();
      hz $$3 = $$0.e();
      dlf $$4 = $$1.a().a($$0.d(), $$3);
      if ($$4.a($$2, $$3)) {
         if ($$4.b() instanceof daw) {
            if (!$$2.u($$3.c())) {
               return false;
            }

            daw.a($$2, $$4, $$3, 2);
         } else {
            $$2.a($$3, $$4, 2);
         }

         return true;
      } else {
         return false;
      }
   }
}
