import com.mojang.serialization.Codec;

public class dva extends dtz<dwr> {
   public dva(Codec<dwr> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dub<dwr> $$0) {
      cwm $$1 = $$0.b();
      hz $$2 = $$0.e();
      dwr $$3 = $$0.f();

      for (dwl.a $$4 : $$3.b) {
         if ($$4.b.a($$1.a_($$2), $$0.d())) {
            $$1.a($$2, $$4.c, 2);
            break;
         }
      }

      return true;
   }
}
