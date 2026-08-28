import com.mojang.serialization.Codec;

public class ecs extends ebl<eeh> {
   public ecs(Codec<eeh> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ebn<eeh> $$0) {
      eeh $$1 = $$0.f();
      ddc $$2 = $$0.b();
      ja $$3 = $$0.e();
      dsl $$4 = $$1.a().a($$0.d(), $$3);
      if ($$4.a($$2, $$3)) {
         if ($$4.b() instanceof dhq) {
            if (!$$2.u($$3.c())) {
               return false;
            }

            dhq.a($$2, $$4, $$3, 2);
         } else {
            $$2.a($$3, $$4, 2);
         }

         return true;
      } else {
         return false;
      }
   }
}
