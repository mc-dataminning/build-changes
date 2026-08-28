import com.mojang.serialization.Codec;

public class eid extends egw<ejs> {
   public eid(Codec<ejs> $$0) {
      super($$0);
   }

   @Override
   public boolean a(egy<ejs> $$0) {
      ejs $$1 = $$0.f();
      dig $$2 = $$0.b();
      jh $$3 = $$0.e();
      dxv $$4 = $$1.a().a($$0.d(), $$3);
      if ($$4.a($$2, $$3)) {
         if ($$4.b() instanceof dmw) {
            if (!$$2.u($$3.d())) {
               return false;
            }

            dmw.a($$2, $$4, $$3, 2);
         } else if ($$4.b() instanceof dpm) {
            dpm.a($$2, $$3, $$2.H_(), 2);
         } else {
            $$2.a($$3, $$4, 2);
         }

         return true;
      } else {
         return false;
      }
   }
}
