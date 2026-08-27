import com.mojang.serialization.Codec;

public class dsb extends drc<dts> {
   public dsb(Codec<dts> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dre<dts> $$0) {
      dts $$1 = $$0.f();
      auf $$2 = $$0.d();
      ctt $$3 = $$0.b();
      dkm $$4 = $$0.c();
      hv $$5 = $$0.e();

      for (dsw $$6 : $$1.b) {
         if ($$2.i() < $$6.c) {
            return $$6.a($$3, $$4, $$2, $$5);
         }
      }

      return $$1.c.a().a($$3, $$4, $$2, $$5);
   }
}
