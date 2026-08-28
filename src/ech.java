import com.mojang.serialization.Codec;

public class ech extends eba<edw> {
   public ech(Codec<edw> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ebc<edw> $$0) {
      edw $$1 = $$0.f();
      dcv $$2 = $$0.b();
      iz $$3 = $$0.e();
      dse $$4 = $$1.a().a($$0.d(), $$3);
      if ($$4.a($$2, $$3)) {
         if ($$4.b() instanceof dhj) {
            if (!$$2.u($$3.c())) {
               return false;
            }

            dhj.a($$2, $$4, $$3, 2);
         } else {
            $$2.a($$3, $$4, 2);
         }

         return true;
      } else {
         return false;
      }
   }
}
