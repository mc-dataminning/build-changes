import javax.annotation.Nullable;

public final class frr implements AutoCloseable {
   private final eti a;
   private final end b;

   public frr(eti $$0) {
      this.a = $$0;
      this.b = new end(ena::new);
   }

   public enf a(ems $$0, @Nullable String $$1, String $$2) {
      return new enf(this.a, this.b, $$0, $$1, $$2);
   }

   @Override
   public void close() {
      this.b.a();
   }
}
