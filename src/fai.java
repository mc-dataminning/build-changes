import java.util.Objects;
import javax.annotation.Nullable;

public interface fai {
   int a();

   boolean b();

   @Nullable
   yx c();

   default xv a(yx $$0) {
      return Objects.requireNonNullElse(this.c(), $$0).a(this.a());
   }

   static xv a(@Nullable fai $$0, yx $$1) {
      return $$0 != null ? $$0.a($$1) : $$1.a(0);
   }
}
