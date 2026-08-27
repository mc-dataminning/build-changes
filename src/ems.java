import java.util.Objects;
import javax.annotation.Nullable;

public interface ems {
   int a();

   boolean b();

   @Nullable
   wv c();

   default vt a(wv $$0) {
      return Objects.requireNonNullElse(this.c(), $$0).a(this.a());
   }

   static vt a(@Nullable ems $$0, wv $$1) {
      return $$0 != null ? $$0.a($$1) : $$1.a(0);
   }
}
