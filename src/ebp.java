import com.mojang.serialization.Codec;

public class ebp extends dzz<eck> {
   public ebp(Codec<eck> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eab<eck> $$0) {
      dbu $$1 = $$0.b();
      io $$2 = $$0.e();
      $$0.f();
      if (!$$1.u($$2)) {
         return false;
      } else {
         for (it $$3 : it.values()) {
            if ($$3 != it.a && dmw.a($$1, $$2.a($$3), $$3)) {
               $$1.a($$2, dec.ff.n().a(dmw.a($$3), Boolean.valueOf(true)), 2);
               return true;
            }
         }

         return false;
      }
   }
}
