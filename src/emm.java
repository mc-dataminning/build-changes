import java.util.Objects;
import javax.annotation.Nullable;

public interface emm {
   int a();

   boolean b();

   @Nullable
   wt c();

   default vr a(wt $$0) {
      return Objects.requireNonNullElse(this.c(), $$0).a(this.a());
   }

   static vr a(@Nullable emm $$0, wt $$1) {
      return $$0 != null ? $$0.a($$1) : $$1.a(0);
   }
}
