import com.mojang.serialization.Codec;

public class edd extends ece<eeu> {
   public edd(Codec<eeu> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ecg<eeu> $$0) {
      eeu $$1 = $$0.f();
      ayw $$2 = $$0.d();
      dds $$3 = $$0.b();
      duz $$4 = $$0.c();
      jd $$5 = $$0.e();

      for (edy $$6 : $$1.b) {
         if ($$2.i() < $$6.c) {
            return $$6.a($$3, $$4, $$2, $$5);
         }
      }

      return $$1.c.a().a($$3, $$4, $$2, $$5);
   }
}
