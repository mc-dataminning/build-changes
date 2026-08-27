import javax.annotation.Nullable;

public final class ftr implements AutoCloseable {
   private final eva a;
   private final eov b;

   public ftr(eva $$0) {
      this.a = $$0;
      this.b = new eov(eos::new);
   }

   public eox a(eok $$0, @Nullable String $$1, String $$2) {
      return new eox(this.a, this.b, $$0, $$1, $$2);
   }

   @Override
   public void close() {
      this.b.a();
   }
}
