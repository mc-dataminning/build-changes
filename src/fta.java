import javax.annotation.Nullable;

public final class fta implements AutoCloseable {
   private final euk a;
   private final eof b;

   public fta(euk $$0) {
      this.a = $$0;
      this.b = new eof(eoc::new);
   }

   public eoh a(enu $$0, @Nullable String $$1, String $$2) {
      return new eoh(this.a, this.b, $$0, $$1, $$2);
   }

   @Override
   public void close() {
      this.b.a();
   }
}
