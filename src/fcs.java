import java.util.Objects;
import javax.annotation.Nullable;

public interface fcs {
   int a();

   boolean b();

   @Nullable
   za c();

   default xy a(za $$0) {
      return Objects.requireNonNullElse(this.c(), $$0).a(this.a());
   }

   static xy a(@Nullable fcs $$0, za $$1) {
      return $$0 != null ? $$0.a($$1) : $$1.a(0);
   }
}
