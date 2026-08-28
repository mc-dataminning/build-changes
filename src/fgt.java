import java.util.Objects;
import javax.annotation.Nullable;

public interface fgt {
   int a();

   boolean b();

   @Nullable
   ys c();

   default xq a(ys $$0) {
      return Objects.requireNonNullElse(this.c(), $$0).a(this.a());
   }

   static xq a(@Nullable fgt $$0, ys $$1) {
      return $$0 != null ? $$0.a($$1) : $$1.a(0);
   }
}
