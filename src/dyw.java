import com.mojang.serialization.Codec;

public class dyw extends dxv<ean> {
   public dyw(Codec<ean> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dxx<ean> $$0) {
      czs $$1 = $$0.b();
      ib $$2 = $$0.e();
      ean $$3 = $$0.f();

      for (eah.a $$4 : $$3.b) {
         if ($$4.b.a($$1.a_($$2), $$0.d())) {
            $$1.a($$2, $$4.c, 2);
            break;
         }
      }

      return true;
   }
}
