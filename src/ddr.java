import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public interface ddr extends ddx, dej, del {
   @Override
   default <T extends drs> Optional<T> a(je $$0, dru<T> $$1) {
      return dej.super.a($$0, $$1);
   }

   @Override
   default List<ezm> c(@Nullable bto $$0, eyn $$1) {
      return ddx.super.c($$0, $$1);
   }

   @Override
   default boolean a(@Nullable bto $$0, ezm $$1) {
      return ddx.super.a($$0, $$1);
   }

   @Override
   default je a(eak.a $$0, je $$1) {
      return dej.super.a($$0, $$1);
   }
}
