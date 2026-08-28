import java.util.function.Consumer;
import javax.annotation.Nullable;

public record dcy(cwp a, @Nullable bus b, @Nullable bvg c, Consumer<cwl> d) {
   public dcy(cwp $$0, bus $$1, bvg $$2) {
      this($$0, $$1, $$2, $$2x -> $$2.a($$2x, $$1));
   }
}
