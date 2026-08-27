import javax.annotation.Nullable;

public final class foy implements AutoCloseable {
   private final eqx a;
   private final ekt b;

   public foy(eqx $$0) {
      this.a = $$0;
      this.b = new ekt(ekq::new);
   }

   public ekv a(eki $$0, @Nullable String $$1, String $$2) {
      return new ekv(this.a, this.b, $$0, $$1, $$2);
   }

   @Override
   public void close() {
      this.b.a();
   }
}
