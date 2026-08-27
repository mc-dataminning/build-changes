import java.util.Optional;

public class dbt {
   public Optional<Float> a(dbs $$0, dbg $$1, ir $$2, dtc $$3, epe $$4) {
      return $$3.i() && $$4.c() ? Optional.empty() : Optional.of(Math.max($$3.b().e(), $$4.i()));
   }

   public boolean a(dbs $$0, dbg $$1, ir $$2, dtc $$3, float $$4) {
      return true;
   }

   public boolean a(dbs $$0, brv $$1) {
      return true;
   }

   public float a() {
      return 1.0F;
   }

   public float b(dbs $$0, brv $$1) {
      float $$2 = $$0.a() * 2.0F;
      ewu $$3 = $$0.b();
      double $$4 = Math.sqrt($$1.f($$3)) / (double)$$2;
      double $$5 = (1.0 - $$4) * (double)dbs.a($$3, $$1);
      return (float)(($$5 * $$5 + $$5) / 2.0 * 7.0 * (double)$$2 + 1.0);
   }
}
