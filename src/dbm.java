import java.util.function.Consumer;
import javax.annotation.Nullable;

public record dbm(cvs a, @Nullable btz b, @Nullable bun c, Consumer<cvn> d) {
   public dbm(cvs $$0, btz $$1, bun $$2) {
      this($$0, $$1, $$2, $$2x -> $$2.a($$2x, $$1));
   }
}
