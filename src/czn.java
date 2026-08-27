import java.util.Optional;

public class czn {
   public Optional<Float> a(czm $$0, cza $$1, im $$2, dpy $$3, elr $$4) {
      return $$3.i() && $$4.c() ? Optional.empty() : Optional.of(Math.max($$3.b().e(), $$4.i()));
   }

   public boolean a(czm $$0, cza $$1, im $$2, dpy $$3, float $$4) {
      return true;
   }

   public boolean a(czm $$0, bql $$1) {
      return true;
   }

   public float a() {
      return 1.0F;
   }

   public float b(czm $$0, bql $$1) {
      float $$2 = $$0.a() * 2.0F;
      etf $$3 = $$0.b();
      double $$4 = Math.sqrt($$1.f($$3)) / (double)$$2;
      double $$5 = (1.0 - $$4) * (double)czm.a($$3, $$1);
      return (float)(($$5 * $$5 + $$5) / 2.0 * 7.0 * (double)$$2 + 1.0);
   }
}
