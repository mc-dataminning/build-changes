import com.mojang.serialization.Codec;

public class dor extends dnq<dqi> {
   public dor(Codec<dqi> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dns<dqi> $$0) {
      cqv $$1 = $$0.b();
      gw $$2 = $$0.e();
      dqi $$3 = $$0.f();

      for (dqc.a $$4 : $$3.b) {
         if ($$4.b.a($$1.a_($$2), $$0.d())) {
            $$1.a($$2, $$4.c, 2);
            break;
         }
      }

      return true;
   }
}
