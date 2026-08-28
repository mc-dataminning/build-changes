import java.util.Optional;

public class dbr {
   public Optional<Float> a(dbq $$0, dbe $$1, iz $$2, dsc $$3, env $$4) {
      return $$3.i() && $$4.c() ? Optional.empty() : Optional.of(Math.max($$3.b().e(), $$4.i()));
   }

   public boolean a(dbq $$0, dbe $$1, iz $$2, dsc $$3, float $$4) {
      return true;
   }

   public boolean a(dbq $$0, bsu $$1) {
      return true;
   }

   public float a(bsu $$0) {
      return 1.0F;
   }

   public float b(dbq $$0, bsu $$1) {
      float $$2 = $$0.a() * 2.0F;
      evr $$3 = $$0.b();
      double $$4 = Math.sqrt($$1.f($$3)) / (double)$$2;
      double $$5 = (1.0 - $$4) * (double)dbq.a($$3, $$1);
      return (float)(($$5 * $$5 + $$5) / 2.0 * 7.0 * (double)$$2 + 1.0);
   }
}
