import java.util.Objects;
import javax.annotation.Nullable;

public interface fao {
   int a();

   boolean b();

   @Nullable
   yy c();

   default xw a(yy $$0) {
      return Objects.requireNonNullElse(this.c(), $$0).a(this.a());
   }

   static xw a(@Nullable fao $$0, yy $$1) {
      return $$0 != null ? $$0.a($$1) : $$1.a(0);
   }
}
