import com.mojang.serialization.Codec;

public class dwr extends dvq<dyi> {
   public dwr(Codec<dyi> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dvs<dyi> $$0) {
      cxu $$1 = $$0.b();
      ib $$2 = $$0.e();
      dyi $$3 = $$0.f();

      for (dyc.a $$4 : $$3.b) {
         if ($$4.b.a($$1.a_($$2), $$0.d())) {
            $$1.a($$2, $$4.c, 2);
            break;
         }
      }

      return true;
   }
}
