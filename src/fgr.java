import java.util.Objects;
import javax.annotation.Nullable;

public interface fgr {
   int a();

   boolean b();

   @Nullable
   yq c();

   default xo a(yq $$0) {
      return Objects.requireNonNullElse(this.c(), $$0).a(this.a());
   }

   static xo a(@Nullable fgr $$0, yq $$1) {
      return $$0 != null ? $$0.a($$1) : $$1.a(0);
   }
}
