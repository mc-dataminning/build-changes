import javax.annotation.Nullable;

public final class ftx implements AutoCloseable {
   private final evg a;
   private final epb b;

   public ftx(evg $$0) {
      this.a = $$0;
      this.b = new epb(eoy::new);
   }

   public epd a(eoq $$0, @Nullable String $$1, String $$2) {
      return new epd(this.a, this.b, $$0, $$1, $$2);
   }

   @Override
   public void close() {
      this.b.a();
   }
}
