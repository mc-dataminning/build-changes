import java.util.Objects;
import javax.annotation.Nullable;

public interface epv {
   int a();

   boolean b();

   @Nullable
   xi c();

   default wg a(xi $$0) {
      return Objects.requireNonNullElse(this.c(), $$0).a(this.a());
   }

   static wg a(@Nullable epv $$0, xi $$1) {
      return $$0 != null ? $$0.a($$1) : $$1.a(0);
   }
}
