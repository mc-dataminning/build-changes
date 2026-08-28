import java.util.Objects;
import javax.annotation.Nullable;

public interface fbz {
   int a();

   boolean b();

   @Nullable
   ye c();

   default xc a(ye $$0) {
      return Objects.requireNonNullElse(this.c(), $$0).a(this.a());
   }

   static xc a(@Nullable fbz $$0, ye $$1) {
      return $$0 != null ? $$0.a($$1) : $$1.a(0);
   }
}
