import java.util.Objects;
import javax.annotation.Nullable;

public interface ews {
   int a();

   boolean b();

   @Nullable
   zf c();

   default yd a(zf $$0) {
      return Objects.requireNonNullElse(this.c(), $$0).a(this.a());
   }

   static yd a(@Nullable ews $$0, zf $$1) {
      return $$0 != null ? $$0.a($$1) : $$1.a(0);
   }
}
