import java.util.Objects;
import javax.annotation.Nullable;

public interface evk {
   int a();

   boolean b();

   @Nullable
   yn c();

   default xl a(yn $$0) {
      return Objects.requireNonNullElse(this.c(), $$0).a(this.a());
   }

   static xl a(@Nullable evk $$0, yn $$1) {
      return $$0 != null ? $$0.a($$1) : $$1.a(0);
   }
}
