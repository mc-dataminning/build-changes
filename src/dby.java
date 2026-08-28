import java.util.Optional;

public class dby {
   public Optional<Float> a(dbx $$0, dbl $$1, ja $$2, dsk $$3, eoh $$4) {
      return $$3.i() && $$4.c() ? Optional.empty() : Optional.of(Math.max($$3.b().e(), $$4.i()));
   }

   public boolean a(dbx $$0, dbl $$1, ja $$2, dsk $$3, float $$4) {
      return true;
   }

   public boolean a(dbx $$0, bsg $$1) {
      return true;
   }

   public float a(bsg $$0) {
      return 1.0F;
   }

   public float b(dbx $$0, bsg $$1) {
      float $$2 = $$0.a() * 2.0F;
      ewf $$3 = $$0.b();
      double $$4 = Math.sqrt($$1.f($$3)) / (double)$$2;
      double $$5 = (1.0 - $$4) * (double)dbx.a($$3, $$1);
      return (float)(($$5 * $$5 + $$5) / 2.0 * 7.0 * (double)$$2 + 1.0);
   }
}
