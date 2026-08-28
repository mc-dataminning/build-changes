import com.mojang.serialization.Codec;

public class ecf extends ebe<edw> {
   public ecf(Codec<edw> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ebg<edw> $$0) {
      dcz $$1 = $$0.b();
      ja $$2 = $$0.e();
      edw $$3 = $$0.f();

      for (edq.a $$4 : $$3.b) {
         if ($$4.b.a($$1.a_($$2), $$0.d())) {
            $$1.a($$2, $$4.c, 2);
            break;
         }
      }

      return true;
   }
}
