import com.mojang.serialization.Codec;

public class eib extends egu<ejq> {
   public eib(Codec<ejq> $$0) {
      super($$0);
   }

   @Override
   public boolean a(egw<ejq> $$0) {
      ejq $$1 = $$0.f();
      dhy $$2 = $$0.b();
      ji $$3 = $$0.e();
      dxq $$4 = $$1.a().a($$0.d(), $$3);
      if ($$4.a($$2, $$3)) {
         if ($$4.b() instanceof dmn) {
            if (!$$2.u($$3.d())) {
               return false;
            }

            dmn.a($$2, $$4, $$3, 2);
         } else if ($$4.b() instanceof dpg) {
            dpg.a($$2, $$3, $$2.C_(), 2);
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
