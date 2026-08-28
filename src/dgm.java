import java.util.function.Consumer;
import javax.annotation.Nullable;

public record dgm(daa a, @Nullable bxf b, @Nullable bxw c, Consumer<czw> d) {
   public dgm(daa $$0, bxf $$1, bxw $$2) {
      this($$0, $$1, $$2, $$2x -> $$2.a($$2x, $$1));
   }
}
