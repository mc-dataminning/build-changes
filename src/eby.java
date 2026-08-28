import com.mojang.serialization.Codec;

public class eby extends eax<edp> {
   public eby(Codec<edp> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eaz<edp> $$0) {
      dcs $$1 = $$0.b();
      iz $$2 = $$0.e();
      edp $$3 = $$0.f();

      for (edj.a $$4 : $$3.b) {
         if ($$4.b.a($$1.a_($$2), $$0.d())) {
            $$1.a($$2, $$4.c, 2);
            break;
         }
      }

      return true;
   }
}
