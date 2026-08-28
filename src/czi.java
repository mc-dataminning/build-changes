import javax.annotation.Nullable;

public record czi(cua a, @Nullable bsk b, @Nullable bsy c, Runnable d) {
   public czi(cua $$0, bsk $$1, bsy $$2) {
      this($$0, $$1, $$2, () -> $$2.e($$1));
   }
}
