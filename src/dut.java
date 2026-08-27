import com.mojang.serialization.Codec;

public class dut extends dts<dwk> {
   public dut(Codec<dwk> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dtu<dwk> $$0) {
      cwi $$1 = $$0.b();
      hz $$2 = $$0.e();
      dwk $$3 = $$0.f();

      for (dwe.a $$4 : $$3.b) {
         if ($$4.b.a($$1.a_($$2), $$0.d())) {
            $$1.a($$2, $$4.c, 2);
            break;
         }
      }

      return true;
   }
}
