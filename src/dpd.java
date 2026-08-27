import com.mojang.serialization.Codec;

public class dpd extends dnw<dqs> {
   public dpd(Codec<dqs> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dny<dqs> $$0) {
      dqs $$1 = $$0.f();
      cqp $$2 = $$0.b();
      gw $$3 = $$0.e();
      dfj $$4 = $$1.a().a($$0.d(), $$3);
      if ($$4.a($$2, $$3)) {
         if ($$4.b() instanceof cuz) {
            if (!$$2.t($$3.c())) {
               return false;
            }

            cuz.a($$2, $$4, $$3, 2);
         } else {
            $$2.a($$3, $$4, 2);
         }

         return true;
      } else {
         return false;
      }
   }
}
