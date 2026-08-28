import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public interface dbk extends dbp, dcb, dcd {
   @Override
   default <T extends dph> Optional<T> a(iz $$0, dpj<T> $$1) {
      return dcb.super.a($$0, $$1);
   }

   @Override
   default List<ewk> c(@Nullable bsu $$0, evm $$1) {
      return dbp.super.c($$0, $$1);
   }

   @Override
   default boolean a(@Nullable bsu $$0, ewk $$1) {
      return dbp.super.a($$0, $$1);
   }

   @Override
   default iz a(dxu.a $$0, iz $$1) {
      return dcb.super.a($$0, $$1);
   }
}
