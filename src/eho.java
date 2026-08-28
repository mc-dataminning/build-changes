import com.mojang.serialization.Codec;

public class eho extends efy<eij> {
   public eho(Codec<eij> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ega<eij> $$0) {
      dhg $$1 = $$0.b();
      ji $$2 = $$0.e();
      $$0.f();
      if (!$$1.u($$2)) {
         return false;
      } else {
         for (jn $$3 : jn.values()) {
            if ($$3 != jn.a && dsn.a($$1, $$2.a($$3), $$3)) {
               $$1.a($$2, djo.ft.m().b(dsn.a($$3), Boolean.valueOf(true)), 2);
               return true;
            }
         }

         return false;
      }
   }
}
