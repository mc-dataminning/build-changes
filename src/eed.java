import com.mojang.serialization.Codec;

public class eed extends edc<efu> {
   public eed(Codec<efu> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ede<efu> $$0) {
      dep $$1 = $$0.b();
      je $$2 = $$0.e();
      efu $$3 = $$0.f();

      for (efo.a $$4 : $$3.b) {
         if ($$4.b.a($$1.a_($$2), $$0.d())) {
            $$1.a($$2, $$4.c, 2);
            break;
         }
      }

      return true;
   }
}
