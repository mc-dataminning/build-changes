import java.util.Objects;
import javax.annotation.Nullable;

public interface fhd {
   int a();

   boolean b();

   @Nullable
   yw c();

   default xu a(yw $$0) {
      return Objects.requireNonNullElse(this.c(), $$0).a(this.a());
   }

   static xu a(@Nullable fhd $$0, yw $$1) {
      return $$0 != null ? $$0.a($$1) : $$1.a(0);
   }
}
