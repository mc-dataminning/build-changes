import com.mojang.serialization.Codec;

public class dss extends drt<duj> {
   public dss(Codec<duj> $$0) {
      super($$0);
   }

   @Override
   public boolean a(drv<duj> $$0) {
      duj $$1 = $$0.f();
      auu $$2 = $$0.d();
      cuj $$3 = $$0.b();
      dld $$4 = $$0.c();
      hx $$5 = $$0.e();

      for (dtn $$6 : $$1.b) {
         if ($$2.i() < $$6.c) {
            return $$6.a($$3, $$4, $$2, $$5);
         }
      }

      return $$1.c.a().a($$3, $$4, $$2, $$5);
   }
}
