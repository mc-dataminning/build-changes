import com.mojang.serialization.Codec;

public class eca extends eaz<edr> {
   public eca(Codec<edr> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ebb<edr> $$0) {
      dcu $$1 = $$0.b();
      iz $$2 = $$0.e();
      edr $$3 = $$0.f();

      for (edl.a $$4 : $$3.b) {
         if ($$4.b.a($$1.a_($$2), $$0.d())) {
            $$1.a($$2, $$4.c, 2);
            break;
         }
      }

      return true;
   }
}
