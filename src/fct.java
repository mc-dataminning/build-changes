import java.util.Objects;
import javax.annotation.Nullable;

public interface fct {
   int a();

   boolean b();

   @Nullable
   zl c();

   default yj a(zl $$0) {
      return Objects.requireNonNullElse(this.c(), $$0).a(this.a());
   }

   static yj a(@Nullable fct $$0, zl $$1) {
      return $$0 != null ? $$0.a($$1) : $$1.a(0);
   }
}
