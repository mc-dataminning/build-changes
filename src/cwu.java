import java.util.Optional;

public class cwu {
   public Optional<Float> a(cwt $$0, cwh $$1, ib $$2, dnb $$3, eip $$4) {
      return $$3.i() && $$4.c() ? Optional.empty() : Optional.of(Math.max($$3.b().e(), $$4.i()));
   }

   public boolean a(cwt $$0, cwh $$1, ib $$2, dnb $$3, float $$4) {
      return true;
   }

   public boolean a(cwt $$0, box $$1) {
      return true;
   }

   public float a() {
      return 1.0F;
   }

   public float b(cwt $$0, box $$1) {
      float $$2 = $$0.a() * 2.0F;
      ept $$3 = $$0.b();
      double $$4 = Math.sqrt($$1.f($$3)) / (double)$$2;
      double $$5 = (1.0 - $$4) * (double)cwt.a($$3, $$1);
      return (float)(($$5 * $$5 + $$5) / 2.0 * 7.0 * (double)$$2 + 1.0);
   }
}
