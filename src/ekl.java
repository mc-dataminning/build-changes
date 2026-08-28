import com.mojang.serialization.Codec;

public class ekl extends eje<ema> {
   public ekl(Codec<ema> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ejg<ema> $$0) {
      ema $$1 = $$0.f();
      dju $$2 = $$0.b();
      iu $$3 = $$0.e();
      dzz $$4 = $$1.a().a($$0.d(), $$3);
      if ($$4.a($$2, $$3)) {
         if ($$4.b() instanceof doj) {
            if (!$$2.v($$3.d())) {
               return false;
            }

            doj.a($$2, $$4, $$3, 2);
         } else if ($$4.b() instanceof drd) {
            drd.a($$2, $$3, $$2.C_(), 2);
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
