import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public interface cre extends crj, crv, crx {
   @Override
   default <T extends der> Optional<T> a(ht $$0, det<T> $$1) {
      return crv.super.a($$0, $$1);
   }

   @Override
   default List<ekb> c(@Nullable bki $$0, ejd $$1) {
      return crj.super.c($$0, $$1);
   }

   @Override
   default boolean a(@Nullable bki $$0, ekb $$1) {
      return crj.super.a($$0, $$1);
   }

   @Override
   default ht a(dmf.a $$0, ht $$1) {
      return crv.super.a($$0, $$1);
   }
}
