import java.util.function.Consumer;
import javax.annotation.Nullable;

public record dav(cvl a, @Nullable btr b, @Nullable buf c, Consumer<cvg> d) {
   public dav(cvl $$0, btr $$1, buf $$2) {
      this($$0, $$1, $$2, $$2x -> $$2.a($$2x, $$1));
   }
}
