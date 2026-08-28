import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public interface dih extends din, diy, dja {
   @Override
   default <T extends dwx> Optional<T> a(iu $$0, dwz<T> $$1) {
      return diy.super.a($$0, $$1);
   }

   @Override
   default List<ffc> c(@Nullable bwd $$0, fed $$1) {
      return din.super.c($$0, $$1);
   }

   @Override
   default boolean a(@Nullable bwd $$0, ffc $$1) {
      return din.super.a($$0, $$1);
   }

   @Override
   default iu a(efy.a $$0, iu $$1) {
      return diy.super.a($$0, $$1);
   }
}
