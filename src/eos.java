import java.util.Objects;
import javax.annotation.Nullable;

public interface eos {
   int a();

   boolean b();

   @Nullable
   xg c();

   default we a(xg $$0) {
      return Objects.requireNonNullElse(this.c(), $$0).a(this.a());
   }

   static we a(@Nullable eos $$0, xg $$1) {
      return $$0 != null ? $$0.a($$1) : $$1.a(0);
   }
}
