import com.mojang.serialization.Codec;

public class ecl extends ebk<eec> {
   public ecl(Codec<eec> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ebm<eec> $$0) {
      ddb $$1 = $$0.b();
      ja $$2 = $$0.e();
      eec $$3 = $$0.f();

      for (edw.a $$4 : $$3.b) {
         if ($$4.b.a($$1.a_($$2), $$0.d())) {
            $$1.a($$2, $$4.c, 2);
            break;
         }
      }

      return true;
   }
}
