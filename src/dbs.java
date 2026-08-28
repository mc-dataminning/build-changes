import java.util.Optional;

public class dbs {
   public Optional<Float> a(dbr $$0, dbf $$1, iz $$2, dsd $$3, enw $$4) {
      return $$3.i() && $$4.c() ? Optional.empty() : Optional.of(Math.max($$3.b().e(), $$4.i()));
   }

   public boolean a(dbr $$0, dbf $$1, iz $$2, dsd $$3, float $$4) {
      return true;
   }

   public boolean a(dbr $$0, bsv $$1) {
      return true;
   }

   public float a(bsv $$0) {
      return 1.0F;
   }

   public float b(dbr $$0, bsv $$1) {
      float $$2 = $$0.a() * 2.0F;
      evs $$3 = $$0.b();
      double $$4 = Math.sqrt($$1.f($$3)) / (double)$$2;
      double $$5 = (1.0 - $$4) * (double)dbr.a($$3, $$1);
      return (float)(($$5 * $$5 + $$5) / 2.0 * 7.0 * (double)$$2 + 1.0);
   }
}
