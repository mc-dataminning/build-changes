import com.mojang.serialization.Codec;

public class ecb extends eba<eds> {
   public ecb(Codec<eds> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ebc<eds> $$0) {
      dcv $$1 = $$0.b();
      iz $$2 = $$0.e();
      eds $$3 = $$0.f();

      for (edm.a $$4 : $$3.b) {
         if ($$4.b.a($$1.a_($$2), $$0.d())) {
            $$1.a($$2, $$4.c, 2);
            break;
         }
      }

      return true;
   }
}
