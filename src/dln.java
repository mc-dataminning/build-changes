import com.mojang.serialization.Codec;

public class dln extends dko<dne> {
   public dln(Codec<dne> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dkq<dne> $$0) {
      dne $$1 = $$0.f();
      apf $$2 = $$0.d();
      cng $$3 = $$0.b();
      ddy $$4 = $$0.c();
      gu $$5 = $$0.e();

      for (dmi $$6 : $$1.b) {
         if ($$2.i() < $$6.c) {
            return $$6.a($$3, $$4, $$2, $$5);
         }
      }

      return $$1.c.a().a($$3, $$4, $$2, $$5);
   }
}
