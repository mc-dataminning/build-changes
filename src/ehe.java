import com.mojang.serialization.Codec;

public class ehe extends efx<eit> {
   public ehe(Codec<eit> $$0) {
      super($$0);
   }

   @Override
   public boolean a(efz<eit> $$0) {
      eit $$1 = $$0.f();
      dhf $$2 = $$0.b();
      ji $$3 = $$0.e();
      dww $$4 = $$1.a().a($$0.d(), $$3);
      if ($$4.a($$2, $$3)) {
         if ($$4.b() instanceof dlu) {
            if (!$$2.u($$3.d())) {
               return false;
            }

            dlu.a($$2, $$4, $$3, 2);
         } else if ($$4.b() instanceof dol) {
            dol.a($$2, $$3, $$2.H_(), 2);
         } else {
            $$2.a($$3, $$4, 2);
         }

         if ($$1.b()) {
            $$2.a($$3, $$2.a_($$3).b(), 1);
         }

         return true;
      } else {
         return false;
      }
   }
}
