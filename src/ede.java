import com.mojang.serialization.Codec;

public class ede extends eca<eew> {
   public ede(Codec<eew> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ecc<eew> $$0) {
      eew $$1 = $$0.f();
      ayt $$2 = $$0.d();
      dcv $$3 = $$0.b();
      duz $$4 = $$0.c();
      ir $$5 = $$0.e();

      for (eea $$6 : $$1.b) {
         if ($$2.i() < $$6.c) {
            return $$6.a($$3, $$4, $$2, $$5);
         }
      }

      return $$1.c.a().a($$3, $$4, $$2, $$5);
   }
}
