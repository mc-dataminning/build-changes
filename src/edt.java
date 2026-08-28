import com.mojang.serialization.Codec;

public class edt extends ecd<eeo> {
   public edt(Codec<eeo> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ecf<eeo> $$0) {
      dds $$1 = $$0.b();
      jd $$2 = $$0.e();
      $$0.f();
      if (!$$1.u($$2)) {
         return false;
      } else {
         for (ji $$3 : ji.values()) {
            if ($$3 != ji.a && dov.a($$1, $$2.a($$3), $$3)) {
               $$1.a($$2, dga.ff.o().a(dov.a($$3), Boolean.valueOf(true)), 2);
               return true;
            }
         }

         return false;
      }
   }
}
