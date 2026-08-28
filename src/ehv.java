import com.mojang.serialization.Codec;

public class ehv extends ego<ejk> {
   public ehv(Codec<ejk> $$0) {
      super($$0);
   }

   @Override
   public boolean a(egq<ejk> $$0) {
      ejk $$1 = $$0.f();
      dhy $$2 = $$0.b();
      jh $$3 = $$0.e();
      dxn $$4 = $$1.a().a($$0.d(), $$3);
      if ($$4.a($$2, $$3)) {
         if ($$4.b() instanceof dmo) {
            if (!$$2.u($$3.d())) {
               return false;
            }

            dmo.a($$2, $$4, $$3, 2);
         } else if ($$4.b() instanceof dpe) {
            dpe.a($$2, $$3, $$2.H_(), 2);
         } else {
            $$2.a($$3, $$4, 2);
         }

         return true;
      } else {
         return false;
      }
   }
}
