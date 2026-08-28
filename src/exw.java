import java.util.Objects;
import javax.annotation.Nullable;

public interface exw {
   int a();

   boolean b();

   @Nullable
   yo c();

   default xm a(yo $$0) {
      return Objects.requireNonNullElse(this.c(), $$0).a(this.a());
   }

   static xm a(@Nullable exw $$0, yo $$1) {
      return $$0 != null ? $$0.a($$1) : $$1.a(0);
   }
}
