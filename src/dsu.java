import com.mojang.serialization.Codec;

public class dsu extends drt<dul> {
   public dsu(Codec<dul> $$0) {
      super($$0);
   }

   @Override
   public boolean a(drv<dul> $$0) {
      cuj $$1 = $$0.b();
      hx $$2 = $$0.e();
      dul $$3 = $$0.f();

      for (duf.a $$4 : $$3.b) {
         if ($$4.b.a($$1.a_($$2), $$0.d())) {
            $$1.a($$2, $$4.c, 2);
            break;
         }
      }

      return true;
   }
}
