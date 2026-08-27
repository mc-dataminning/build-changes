import javax.annotation.Nullable;

public final class fnx implements AutoCloseable {
   private final eqn a;
   private final ekj b;

   public fnx(eqn $$0) {
      this.a = $$0;
      this.b = new ekj(ekg::new);
   }

   public ekl a(ejy $$0, @Nullable String $$1, String $$2) {
      return new ekl(this.a, this.b, $$0, $$1, $$2);
   }

   @Override
   public void close() {
      this.b.a();
   }
}
