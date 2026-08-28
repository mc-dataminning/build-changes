import com.mojang.serialization.Codec;

public class ebx extends eaw<edo> {
   public ebx(Codec<edo> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eay<edo> $$0) {
      dcr $$1 = $$0.b();
      iz $$2 = $$0.e();
      edo $$3 = $$0.f();

      for (edi.a $$4 : $$3.b) {
         if ($$4.b.a($$1.a_($$2), $$0.d())) {
            $$1.a($$2, $$4.c, 2);
            break;
         }
      }

      return true;
   }
}
