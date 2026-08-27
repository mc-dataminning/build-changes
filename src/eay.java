import com.mojang.serialization.Codec;

public class eay extends dzz<ecp> {
   public eay(Codec<ecp> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eab<ecp> $$0) {
      ecp $$1 = $$0.f();
      aym $$2 = $$0.d();
      dbu $$3 = $$0.b();
      dta $$4 = $$0.c();
      io $$5 = $$0.e();

      for (ebt $$6 : $$1.b) {
         if ($$2.i() < $$6.c) {
            return $$6.a($$3, $$4, $$2, $$5);
         }
      }

      return $$1.c.a().a($$3, $$4, $$2, $$5);
   }
}
