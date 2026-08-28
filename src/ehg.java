import com.mojang.serialization.Codec;

public class ehg extends efz<eiv> {
   public ehg(Codec<eiv> $$0) {
      super($$0);
   }

   @Override
   public boolean a(egb<eiv> $$0) {
      eiv $$1 = $$0.f();
      dhh $$2 = $$0.b();
      ji $$3 = $$0.e();
      dwy $$4 = $$1.a().a($$0.d(), $$3);
      if ($$4.a($$2, $$3)) {
         if ($$4.b() instanceof dlw) {
            if (!$$2.u($$3.d())) {
               return false;
            }

            dlw.a($$2, $$4, $$3, 2);
         } else if ($$4.b() instanceof don) {
            don.a($$2, $$3, $$2.H_(), 2);
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
