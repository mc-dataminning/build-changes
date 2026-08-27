import com.mojang.serialization.Codec;

public class dsd extends drc<dtu> {
   public dsd(Codec<dtu> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dre<dtu> $$0) {
      ctt $$1 = $$0.b();
      hv $$2 = $$0.e();
      dtu $$3 = $$0.f();

      for (dto.a $$4 : $$3.b) {
         if ($$4.b.a($$1.a_($$2), $$0.d())) {
            $$1.a($$2, $$4.c, 2);
            break;
         }
      }

      return true;
   }
}
