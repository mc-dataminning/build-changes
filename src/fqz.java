import javax.annotation.Nullable;

public final class fqz implements AutoCloseable {
   private final esr a;
   private final emm b;

   public fqz(esr $$0) {
      this.a = $$0;
      this.b = new emm(emj::new);
   }

   public emo a(emb $$0, @Nullable String $$1, String $$2) {
      return new emo(this.a, this.b, $$0, $$1, $$2);
   }

   @Override
   public void close() {
      this.b.a();
   }
}
