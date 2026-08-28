import java.util.Objects;
import javax.annotation.Nullable;

public interface fex {
   int a();

   boolean b();

   @Nullable
   ym c();

   default xk a(ym $$0) {
      return Objects.requireNonNullElse(this.c(), $$0).a(this.a());
   }

   static xk a(@Nullable fex $$0, ym $$1) {
      return $$0 != null ? $$0.a($$1) : $$1.a(0);
   }
}
