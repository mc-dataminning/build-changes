import com.mojang.serialization.Codec;

public class ebn extends dzx<eci> {
   public ebn(Codec<eci> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dzz<eci> $$0) {
      dbs $$1 = $$0.b();
      io $$2 = $$0.e();
      $$0.f();
      if (!$$1.u($$2)) {
         return false;
      } else {
         for (it $$3 : it.values()) {
            if ($$3 != it.a && dmu.a($$1, $$2.a($$3), $$3)) {
               $$1.a($$2, dea.ff.n().a(dmu.a($$3), Boolean.valueOf(true)), 2);
               return true;
            }
         }

         return false;
      }
   }
}
