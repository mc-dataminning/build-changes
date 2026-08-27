import javax.annotation.Nullable;

public final class fol implements AutoCloseable {
   private final eql a;
   private final ekh b;

   public fol(eql $$0) {
      this.a = $$0;
      this.b = new ekh(eke::new);
   }

   public ekj a(ejw $$0, @Nullable String $$1, String $$2) {
      return new ekj(this.a, this.b, $$0, $$1, $$2);
   }

   @Override
   public void close() {
      this.b.a();
   }
}
