import com.mojang.serialization.Codec;

public class dzl extends dye<eba> {
   public dzl(Codec<eba> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dyg<eba> $$0) {
      eba $$1 = $$0.f();
      dab $$2 = $$0.b();
      id $$3 = $$0.e();
      dpi $$4 = $$1.a().a($$0.d(), $$3);
      if ($$4.a($$2, $$3)) {
         if ($$4.b() instanceof dep) {
            if (!$$2.u($$3.c())) {
               return false;
            }

            dep.a($$2, $$4, $$3, 2);
         } else {
            $$2.a($$3, $$4, 2);
         }

         return true;
      } else {
         return false;
      }
   }
}
