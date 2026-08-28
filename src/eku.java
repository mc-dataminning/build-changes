import com.mojang.serialization.Codec;

public class eku extends ejt<eml> {
   public eku(Codec<eml> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ejv<eml> $$0) {
      dkg $$1 = $$0.b();
      iv $$2 = $$0.e();
      eml $$3 = $$0.f();

      for (emf.a $$4 : $$3.b) {
         if ($$4.b.a($$1.a_($$2), $$0.d())) {
            $$1.a($$2, $$4.c, 2);
            break;
         }
      }

      return true;
   }
}
