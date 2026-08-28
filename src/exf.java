import java.util.Objects;
import javax.annotation.Nullable;

public interface exf {
   int a();

   boolean b();

   @Nullable
   yk c();

   default xi a(yk $$0) {
      return Objects.requireNonNullElse(this.c(), $$0).a(this.a());
   }

   static xi a(@Nullable exf $$0, yk $$1) {
      return $$0 != null ? $$0.a($$1) : $$1.a(0);
   }
}
