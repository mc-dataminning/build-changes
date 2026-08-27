import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public interface cys extends cyx, czj, czl {
   @Override
   default <T extends dmo> Optional<T> a(id $$0, dmq<T> $$1) {
      return czj.super.a($$0, $$1);
   }

   @Override
   default List<etc> c(@Nullable bqa $$0, ese $$1) {
      return cyx.super.c($$0, $$1);
   }

   @Override
   default boolean a(@Nullable bqa $$0, etc $$1) {
      return cyx.super.a($$0, $$1);
   }

   @Override
   default id a(dva.a $$0, id $$1) {
      return czj.super.a($$0, $$1);
   }
}
