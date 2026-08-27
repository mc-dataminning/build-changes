import com.mojang.serialization.Codec;

public class eae extends dzd<ebv> {
   public eae(Codec<ebv> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dzf<ebv> $$0) {
      day $$1 = $$0.b();
      in $$2 = $$0.e();
      ebv $$3 = $$0.f();

      for (ebp.a $$4 : $$3.b) {
         if ($$4.b.a($$1.a_($$2), $$0.d())) {
            $$1.a($$2, $$4.c, 2);
            break;
         }
      }

      return true;
   }
}
