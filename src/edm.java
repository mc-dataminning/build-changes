import com.mojang.serialization.Codec;

public class edm extends eca<efc> {
   public edm(Codec<efc> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ecc<efc> $$0) {
      efc $$1 = $$0.f();
      dcv $$2 = $$0.b();
      ir $$3 = $$0.e();
      dtc $$4 = $$1.a().a($$0.d(), $$3);
      if ($$4.a(dfe.ho)) {
         $$4 = dld.a($$4, $$2.a_($$3.d()));
      }

      return $$4.a($$2, $$3) ? a($$4, $$2, $$3) : false;
   }

   public static boolean a(dtc $$0, dcv $$1, ir $$2) {
      if ($$0.b() instanceof dhl) {
         if (!$$1.u($$2.c())) {
            return false;
         }

         dhl.a($$1, $$0, $$2, 2);
      } else {
         $$1.a($$2, $$0, 2);
      }

      return true;
   }
}
