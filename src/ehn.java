import com.mojang.serialization.Codec;

public class ehn extends efx<eii> {
   public ehn(Codec<eii> $$0) {
      super($$0);
   }

   @Override
   public boolean a(efz<eii> $$0) {
      dhf $$1 = $$0.b();
      ji $$2 = $$0.e();
      $$0.f();
      if (!$$1.u($$2)) {
         return false;
      } else {
         for (jn $$3 : jn.values()) {
            if ($$3 != jn.a && dsm.a($$1, $$2.a($$3), $$3)) {
               $$1.a($$2, djn.ft.m().b(dsm.a($$3), Boolean.valueOf(true)), 2);
               return true;
            }
         }

         return false;
      }
   }
}
