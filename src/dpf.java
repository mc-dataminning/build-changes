import com.mojang.serialization.Codec;

public class dpf extends dny<dqu> {
   public dpf(Codec<dqu> $$0) {
      super($$0);
   }

   @Override
   public boolean a(doa<dqu> $$0) {
      dqu $$1 = $$0.f();
      cqr $$2 = $$0.b();
      gw $$3 = $$0.e();
      dfl $$4 = $$1.a().a($$0.d(), $$3);
      if ($$4.a($$2, $$3)) {
         if ($$4.b() instanceof cvb) {
            if (!$$2.t($$3.c())) {
               return false;
            }

            cvb.a($$2, $$4, $$3, 2);
         } else {
            $$2.a($$3, $$4, 2);
         }

         return true;
      } else {
         return false;
      }
   }
}
