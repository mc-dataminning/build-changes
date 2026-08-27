import com.mojang.serialization.Codec;

public class dwz extends dvs<dyo> {
   public dwz(Codec<dyo> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dvu<dyo> $$0) {
      dyo $$1 = $$0.f();
      cxw $$2 = $$0.b();
      ib $$3 = $$0.e();
      dnb $$4 = $$1.a().a($$0.d(), $$3);
      if ($$4.a($$2, $$3)) {
         if ($$4.b() instanceof dck) {
            if (!$$2.u($$3.c())) {
               return false;
            }

            dck.a($$2, $$4, $$3, 2);
         } else {
            $$2.a($$3, $$4, 2);
         }

         return true;
      } else {
         return false;
      }
   }
}
