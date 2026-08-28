import com.mojang.serialization.Codec;

public class eic extends egv<ejr> {
   public eic(Codec<ejr> $$0) {
      super($$0);
   }

   @Override
   public boolean a(egx<ejr> $$0) {
      ejr $$1 = $$0.f();
      dif $$2 = $$0.b();
      jh $$3 = $$0.e();
      dxu $$4 = $$1.a().a($$0.d(), $$3);
      if ($$4.a($$2, $$3)) {
         if ($$4.b() instanceof dmv) {
            if (!$$2.u($$3.d())) {
               return false;
            }

            dmv.a($$2, $$4, $$3, 2);
         } else if ($$4.b() instanceof dpl) {
            dpl.a($$2, $$3, $$2.H_(), 2);
         } else {
            $$2.a($$3, $$4, 2);
         }

         return true;
      } else {
         return false;
      }
   }
}
