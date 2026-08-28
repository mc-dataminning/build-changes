import java.util.Objects;
import javax.annotation.Nullable;

public interface eyc {
   int a();

   boolean b();

   @Nullable
   yp c();

   default xn a(yp $$0) {
      return Objects.requireNonNullElse(this.c(), $$0).a(this.a());
   }

   static xn a(@Nullable eyc $$0, yp $$1) {
      return $$0 != null ? $$0.a($$1) : $$1.a(0);
   }
}
