import javax.annotation.Nullable;

public final class fps implements AutoCloseable {
   private final ero a;
   private final elj b;

   public fps(ero $$0) {
      this.a = $$0;
      this.b = new elj(elg::new);
   }

   public ell a(eky $$0, @Nullable String $$1, String $$2) {
      return new ell(this.a, this.b, $$0, $$1, $$2);
   }

   @Override
   public void close() {
      this.b.a();
   }
}
