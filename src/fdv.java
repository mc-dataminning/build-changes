import java.util.Objects;
import javax.annotation.Nullable;

public interface fdv {
   int a();

   boolean b();

   @Nullable
   yl c();

   default xj a(yl $$0) {
      return Objects.requireNonNullElse(this.c(), $$0).a(this.a());
   }

   static xj a(@Nullable fdv $$0, yl $$1) {
      return $$0 != null ? $$0.a($$1) : $$1.a(0);
   }
}
