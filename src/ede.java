import com.mojang.serialization.Codec;

public class ede extends ecd<eev> {
   public ede(Codec<eev> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ecf<eev> $$0) {
      dds $$1 = $$0.b();
      jd $$2 = $$0.e();
      eev $$3 = $$0.f();

      for (eep.a $$4 : $$3.b) {
         if ($$4.b.a($$1.a_($$2), $$0.d())) {
            $$1.a($$2, $$4.c, 2);
            break;
         }
      }

      return true;
   }
}
