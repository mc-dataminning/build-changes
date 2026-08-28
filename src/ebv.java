import com.mojang.serialization.Codec;

public class ebv extends eaw<edm> {
   public ebv(Codec<edm> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eay<edm> $$0) {
      edm $$1 = $$0.f();
      azf $$2 = $$0.d();
      dcr $$3 = $$0.b();
      dtx $$4 = $$0.c();
      iz $$5 = $$0.e();

      for (ecq $$6 : $$1.b) {
         if ($$2.i() < $$6.c) {
            return $$6.a($$3, $$4, $$2, $$5);
         }
      }

      return $$1.c.a().a($$3, $$4, $$2, $$5);
   }
}
