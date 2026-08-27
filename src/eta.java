import java.util.Objects;
import javax.annotation.Nullable;

public interface eta {
   int a();

   boolean b();

   @Nullable
   xw c();

   default wu a(xw $$0) {
      return Objects.requireNonNullElse(this.c(), $$0).a(this.a());
   }

   static wu a(@Nullable eta $$0, xw $$1) {
      return $$0 != null ? $$0.a($$1) : $$1.a(0);
   }
}
