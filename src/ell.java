import com.mojang.serialization.Codec;

public class ell extends ekk<end> {
   public ell(Codec<end> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ekm<end> $$0) {
      dkw $$1 = $$0.b();
      iv $$2 = $$0.e();
      end $$3 = $$0.f();

      for (emx.a $$4 : $$3.b) {
         if ($$4.b.a($$1.a_($$2), $$0.d())) {
            $$1.a($$2, $$4.c, 2);
            break;
         }
      }

      return true;
   }
}
