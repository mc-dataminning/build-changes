import com.mojang.serialization.Codec;

public class ehd extends efw<eis> {
   public ehd(Codec<eis> $$0) {
      super($$0);
   }

   @Override
   public boolean a(efy<eis> $$0) {
      eis $$1 = $$0.f();
      dhe $$2 = $$0.b();
      ji $$3 = $$0.e();
      dwv $$4 = $$1.a().a($$0.d(), $$3);
      if ($$4.a($$2, $$3)) {
         if ($$4.b() instanceof dlt) {
            if (!$$2.u($$3.d())) {
               return false;
            }

            dlt.a($$2, $$4, $$3, 2);
         } else if ($$4.b() instanceof dok) {
            dok.a($$2, $$3, $$2.H_(), 2);
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
