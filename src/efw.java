import com.mojang.serialization.Codec;

public class efw extends eep<ehl> {
   public efw(Codec<ehl> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eer<ehl> $$0) {
      ehl $$1 = $$0.f();
      dgd $$2 = $$0.b();
      jh $$3 = $$0.e();
      dvo $$4 = $$1.a().a($$0.d(), $$3);
      if ($$4.a($$2, $$3)) {
         if ($$4.b() instanceof dkr) {
            if (!$$2.u($$3.d())) {
               return false;
            }

            dkr.a($$2, $$4, $$3, 2);
         } else {
            $$2.a($$3, $$4, 2);
         }

         return true;
      } else {
         return false;
      }
   }
}
