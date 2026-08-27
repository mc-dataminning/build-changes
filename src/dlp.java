import com.mojang.serialization.Codec;

public class dlp extends dko<dng> {
   public dlp(Codec<dng> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dkq<dng> $$0) {
      cng $$1 = $$0.b();
      gu $$2 = $$0.e();
      dng $$3 = $$0.f();

      for (dna.a $$4 : $$3.b) {
         if ($$4.b.a($$1.a_($$2), $$0.d())) {
            $$1.a($$2, $$4.c, 2);
            break;
         }
      }

      return true;
   }
}
