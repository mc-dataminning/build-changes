import javax.annotation.Nullable;

public final class foq implements AutoCloseable {
   private final eqq a;
   private final ekm b;

   public foq(eqq $$0) {
      this.a = $$0;
      this.b = new ekm(ekj::new);
   }

   public eko a(ekb $$0, @Nullable String $$1, String $$2) {
      return new eko(this.a, this.b, $$0, $$1, $$2);
   }

   @Override
   public void close() {
      this.b.a();
   }
}
