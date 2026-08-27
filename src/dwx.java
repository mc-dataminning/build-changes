import com.mojang.serialization.Codec;

public class dwx extends dvq<dym> {
   public dwx(Codec<dym> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dvs<dym> $$0) {
      dym $$1 = $$0.f();
      cxu $$2 = $$0.b();
      ib $$3 = $$0.e();
      dmz $$4 = $$1.a().a($$0.d(), $$3);
      if ($$4.a($$2, $$3)) {
         if ($$4.b() instanceof dci) {
            if (!$$2.u($$3.c())) {
               return false;
            }

            dci.a($$2, $$4, $$3, 2);
         } else {
            $$2.a($$3, $$4, 2);
         }

         return true;
      } else {
         return false;
      }
   }
}
