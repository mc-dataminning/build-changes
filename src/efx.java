import com.mojang.serialization.Codec;

public class efx extends eew<eho> {
   public efx(Codec<eho> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eey<eho> $$0) {
      dgk $$1 = $$0.b();
      jh $$2 = $$0.e();
      eho $$3 = $$0.f();

      for (ehi.a $$4 : $$3.b) {
         if ($$4.b.a($$1.a_($$2), $$0.d())) {
            $$1.a($$2, $$4.c, 2);
            break;
         }
      }

      return true;
   }
}
