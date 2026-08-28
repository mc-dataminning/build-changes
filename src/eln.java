import com.mojang.serialization.Codec;

public class eln extends ekm<enf> {
   public eln(Codec<enf> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eko<enf> $$0) {
      dky $$1 = $$0.b();
      iw $$2 = $$0.e();
      enf $$3 = $$0.f();

      for (emz.a $$4 : $$3.b) {
         if ($$4.b.a($$1.a_($$2), $$0.d())) {
            $$1.a($$2, $$4.c, 2);
            break;
         }
      }

      return true;
   }
}
