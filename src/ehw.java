import com.mojang.serialization.Codec;

public class ehw extends egp<ejl> {
   public ehw(Codec<ejl> $$0) {
      super($$0);
   }

   @Override
   public boolean a(egr<ejl> $$0) {
      ejl $$1 = $$0.f();
      dhx $$2 = $$0.b();
      jh $$3 = $$0.e();
      dxo $$4 = $$1.a().a($$0.d(), $$3);
      if ($$4.a($$2, $$3)) {
         if ($$4.b() instanceof dmm) {
            if (!$$2.u($$3.d())) {
               return false;
            }

            dmm.a($$2, $$4, $$3, 2);
         } else if ($$4.b() instanceof dpd) {
            dpd.a($$2, $$3, $$2.H_(), 2);
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
