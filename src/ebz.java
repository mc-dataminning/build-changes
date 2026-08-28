import com.mojang.serialization.Codec;

public class ebz extends eba<edq> {
   public ebz(Codec<edq> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ebc<edq> $$0) {
      edq $$1 = $$0.f();
      azh $$2 = $$0.d();
      dcv $$3 = $$0.b();
      dub $$4 = $$0.c();
      iz $$5 = $$0.e();

      for (ecu $$6 : $$1.b) {
         if ($$2.i() < $$6.c) {
            return $$6.a($$3, $$4, $$2, $$5);
         }
      }

      return $$1.c.a().a($$3, $$4, $$2, $$5);
   }
}
