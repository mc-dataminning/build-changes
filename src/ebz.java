import com.mojang.serialization.Codec;

public class ebz extends eay<edq> {
   public ebz(Codec<edq> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eba<edq> $$0) {
      dct $$1 = $$0.b();
      iz $$2 = $$0.e();
      edq $$3 = $$0.f();

      for (edk.a $$4 : $$3.b) {
         if ($$4.b.a($$1.a_($$2), $$0.d())) {
            $$1.a($$2, $$4.c, 2);
            break;
         }
      }

      return true;
   }
}
