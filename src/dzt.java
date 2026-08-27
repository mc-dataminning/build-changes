import com.mojang.serialization.Codec;

public class dzt extends dyu<ebk> {
   public dzt(Codec<ebk> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dyw<ebk> $$0) {
      ebk $$1 = $$0.f();
      ayd $$2 = $$0.d();
      dap $$3 = $$0.b();
      drv $$4 = $$0.c();
      im $$5 = $$0.e();

      for (eao $$6 : $$1.b) {
         if ($$2.i() < $$6.c) {
            return $$6.a($$3, $$4, $$2, $$5);
         }
      }

      return $$1.c.a().a($$3, $$4, $$2, $$5);
   }
}
