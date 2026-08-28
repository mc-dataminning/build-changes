import com.mojang.serialization.Codec;

public class ekt extends ejm<emi> {
   public ekt(Codec<emi> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ejo<emi> $$0) {
      emi $$1 = $$0.f();
      djz $$2 = $$0.b();
      iu $$3 = $$0.e();
      eah $$4 = $$1.a().a($$0.d(), $$3);
      if ($$4.a($$2, $$3)) {
         if ($$4.b() instanceof doo) {
            if (!$$2.v($$3.d())) {
               return false;
            }

            doo.a($$2, $$4, $$3, 2);
         } else if ($$4.b() instanceof drj) {
            drj.a($$2, $$3, $$2.C_(), 2);
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
