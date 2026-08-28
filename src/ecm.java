import com.mojang.serialization.Codec;

public class ecm extends ebl<eed> {
   public ecm(Codec<eed> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ebn<eed> $$0) {
      ddc $$1 = $$0.b();
      ja $$2 = $$0.e();
      eed $$3 = $$0.f();

      for (edx.a $$4 : $$3.b) {
         if ($$4.b.a($$1.a_($$2), $$0.d())) {
            $$1.a($$2, $$4.c, 2);
            break;
         }
      }

      return true;
   }
}
