import java.util.Objects;
import javax.annotation.Nullable;

public interface ewq {
   int a();

   boolean b();

   @Nullable
   ze c();

   default yc a(ze $$0) {
      return Objects.requireNonNullElse(this.c(), $$0).a(this.a());
   }

   static yc a(@Nullable ewq $$0, ze $$1) {
      return $$0 != null ? $$0.a($$1) : $$1.a(0);
   }
}
