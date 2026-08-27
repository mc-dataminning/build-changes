import java.util.Objects;
import javax.annotation.Nullable;

public interface eqt {
   int a();

   boolean b();

   @Nullable
   xk c();

   default wi a(xk $$0) {
      return Objects.requireNonNullElse(this.c(), $$0).a(this.a());
   }

   static wi a(@Nullable eqt $$0, xk $$1) {
      return $$0 != null ? $$0.a($$1) : $$1.a(0);
   }
}
