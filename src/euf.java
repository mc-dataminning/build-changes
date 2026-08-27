import java.util.Objects;
import javax.annotation.Nullable;

public interface euf {
   int a();

   boolean b();

   @Nullable
   yi c();

   default xg a(yi $$0) {
      return Objects.requireNonNullElse(this.c(), $$0).a(this.a());
   }

   static xg a(@Nullable euf $$0, yi $$1) {
      return $$0 != null ? $$0.a($$1) : $$1.a(0);
   }
}
