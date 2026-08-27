import java.util.Objects;
import javax.annotation.Nullable;

public interface etj {
   int a();

   boolean b();

   @Nullable
   xy c();

   default ww a(xy $$0) {
      return Objects.requireNonNullElse(this.c(), $$0).a(this.a());
   }

   static ww a(@Nullable etj $$0, xy $$1) {
      return $$0 != null ? $$0.a($$1) : $$1.a(0);
   }
}
