import javax.annotation.Nullable;

public final class fow implements AutoCloseable {
   private final eqv a;
   private final ekr b;

   public fow(eqv $$0) {
      this.a = $$0;
      this.b = new ekr(eko::new);
   }

   public ekt a(ekg $$0, @Nullable String $$1, String $$2) {
      return new ekt(this.a, this.b, $$0, $$1, $$2);
   }

   @Override
   public void close() {
      this.b.a();
   }
}
