import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public interface crr extends crw, csi, csk {
   @Override
   default <T extends dfi> Optional<T> a(hx $$0, dfk<T> $$1) {
      return csi.super.a($$0, $$1);
   }

   @Override
   default List<eks> c(@Nullable bkv $$0, eju $$1) {
      return crw.super.c($$0, $$1);
   }

   @Override
   default boolean a(@Nullable bkv $$0, eks $$1) {
      return crw.super.a($$0, $$1);
   }

   @Override
   default hx a(dmw.a $$0, hx $$1) {
      return csi.super.a($$0, $$1);
   }
}
