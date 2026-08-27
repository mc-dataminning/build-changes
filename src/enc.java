import java.util.Objects;
import javax.annotation.Nullable;

public interface enc {
   int a();

   boolean b();

   @Nullable
   ww c();

   default vu a(ww $$0) {
      return Objects.requireNonNullElse(this.c(), $$0).a(this.a());
   }

   static vu a(@Nullable enc $$0, ww $$1) {
      return $$0 != null ? $$0.a($$1) : $$1.a(0);
   }
}
