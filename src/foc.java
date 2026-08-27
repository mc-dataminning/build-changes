import javax.annotation.Nullable;

public final class foc implements AutoCloseable {
   private final eqm a;
   private final eki b;

   public foc(eqm $$0) {
      this.a = $$0;
      this.b = new eki(ekf::new);
   }

   public ekk a(ejx $$0, @Nullable String $$1, String $$2) {
      return new ekk(this.a, this.b, $$0, $$1, $$2);
   }

   @Override
   public void close() {
      this.b.a();
   }
}
