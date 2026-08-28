import com.mojang.serialization.Codec;

public class eer extends edq<egi> {
   public eer(Codec<egi> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eds<egi> $$0) {
      dfd $$1 = $$0.b();
      je $$2 = $$0.e();
      egi $$3 = $$0.f();

      for (egc.a $$4 : $$3.b) {
         if ($$4.b.a($$1.a_($$2), $$0.d())) {
            $$1.a($$2, $$4.c, 2);
            break;
         }
      }

      return true;
   }
}
