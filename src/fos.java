import javax.annotation.Nullable;

public final class fos implements AutoCloseable {
   private final eqp a;
   private final ekl b;

   public fos(eqp $$0) {
      this.a = $$0;
      this.b = new ekl(eki::new);
   }

   public ekn a(eka $$0, @Nullable String $$1, String $$2) {
      return new ekn(this.a, this.b, $$0, $$1, $$2);
   }

   @Override
   public void close() {
      this.b.a();
   }
}
