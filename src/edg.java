import com.mojang.serialization.Codec;

public class edg extends eca<eey> {
   public edg(Codec<eey> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ecc<eey> $$0) {
      dcv $$1 = $$0.b();
      ir $$2 = $$0.e();
      eey $$3 = $$0.f();

      for (ees.a $$4 : $$3.b) {
         if ($$4.b.a($$1.a_($$2), $$0.d())) {
            $$1.a($$2, $$4.c, 2);
            break;
         }
      }

      return true;
   }
}
