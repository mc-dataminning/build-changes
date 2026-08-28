import java.util.Objects;
import javax.annotation.Nullable;

public interface ewm {
   int a();

   boolean b();

   @Nullable
   zb c();

   default xz a(zb $$0) {
      return Objects.requireNonNullElse(this.c(), $$0).a(this.a());
   }

   static xz a(@Nullable ewm $$0, zb $$1) {
      return $$0 != null ? $$0.a($$1) : $$1.a(0);
   }
}
