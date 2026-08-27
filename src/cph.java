import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public interface cph extends cpm, cpy, cqa {
   @Override
   default <T extends dcv> Optional<T> a(gw $$0, dcx<T> $$1) {
      return cpy.super.a($$0, $$1);
   }

   @Override
   default List<eig> c(@Nullable biq $$0, ehi $$1) {
      return cpm.super.c($$0, $$1);
   }

   @Override
   default boolean a(@Nullable biq $$0, eig $$1) {
      return cpm.super.a($$0, $$1);
   }

   @Override
   default gw a(dks.a $$0, gw $$1) {
      return cpy.super.a($$0, $$1);
   }
}
