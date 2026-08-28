import java.util.Objects;
import javax.annotation.Nullable;

public interface ezt {
   int a();

   boolean b();

   @Nullable
   yt c();

   default xr a(yt $$0) {
      return Objects.requireNonNullElse(this.c(), $$0).a(this.a());
   }

   static xr a(@Nullable ezt $$0, yt $$1) {
      return $$0 != null ? $$0.a($$1) : $$1.a(0);
   }
}
