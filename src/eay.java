import com.mojang.serialization.Codec;

public class eay extends dzx<ecp> {
   public eay(Codec<ecp> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dzz<ecp> $$0) {
      dbs $$1 = $$0.b();
      io $$2 = $$0.e();
      ecp $$3 = $$0.f();

      for (ecj.a $$4 : $$3.b) {
         if ($$4.b.a($$1.a_($$2), $$0.d())) {
            $$1.a($$2, $$4.c, 2);
            break;
         }
      }

      return true;
   }
}
