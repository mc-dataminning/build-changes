import com.mojang.serialization.Codec;

public class dzf extends dye<eaw> {
   public dzf(Codec<eaw> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dyg<eaw> $$0) {
      dab $$1 = $$0.b();
      id $$2 = $$0.e();
      eaw $$3 = $$0.f();

      for (eaq.a $$4 : $$3.b) {
         if ($$4.b.a($$1.a_($$2), $$0.d())) {
            $$1.a($$2, $$4.c, 2);
            break;
         }
      }

      return true;
   }
}
