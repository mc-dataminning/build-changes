import java.util.Objects;
import javax.annotation.Nullable;

public interface ezx {
   int a();

   boolean b();

   @Nullable
   yu c();

   default xs a(yu $$0) {
      return Objects.requireNonNullElse(this.c(), $$0).a(this.a());
   }

   static xs a(@Nullable ezx $$0, yu $$1) {
      return $$0 != null ? $$0.a($$1) : $$1.a(0);
   }
}
