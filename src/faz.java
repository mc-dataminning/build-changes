import java.util.Objects;
import javax.annotation.Nullable;

public interface faz {
   int a();

   boolean b();

   @Nullable
   yz c();

   default xx a(yz $$0) {
      return Objects.requireNonNullElse(this.c(), $$0).a(this.a());
   }

   static xx a(@Nullable faz $$0, yz $$1) {
      return $$0 != null ? $$0.a($$1) : $$1.a(0);
   }
}
