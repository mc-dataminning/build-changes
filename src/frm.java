import javax.annotation.Nullable;

public final class frm implements AutoCloseable {
   private final etd a;
   private final emy b;

   public frm(etd $$0) {
      this.a = $$0;
      this.b = new emy(emv::new);
   }

   public ena a(emn $$0, @Nullable String $$1, String $$2) {
      return new ena(this.a, this.b, $$0, $$1, $$2);
   }

   @Override
   public void close() {
      this.b.a();
   }
}
