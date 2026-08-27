import javax.annotation.Nullable;

public final class fty implements AutoCloseable {
   private final evh a;
   private final epc b;

   public fty(evh $$0) {
      this.a = $$0;
      this.b = new epc(eoz::new);
   }

   public epe a(eor $$0, @Nullable String $$1, String $$2) {
      return new epe(this.a, this.b, $$0, $$1, $$2);
   }

   @Override
   public void close() {
      this.b.a();
   }
}
