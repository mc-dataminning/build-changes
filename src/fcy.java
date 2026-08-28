import java.util.Objects;
import javax.annotation.Nullable;

public interface fcy {
   int a();

   boolean b();

   @Nullable
   yf c();

   default xd a(yf $$0) {
      return Objects.requireNonNullElse(this.c(), $$0).a(this.a());
   }

   static xd a(@Nullable fcy $$0, yf $$1) {
      return $$0 != null ? $$0.a($$1) : $$1.a(0);
   }
}
