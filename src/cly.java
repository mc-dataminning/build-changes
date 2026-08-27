import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public interface cly extends cmd, cmp, cmr {
   @Override
   default <T extends czn> Optional<T> a(gu $$0, czp<T> $$1) {
      return cmp.super.a($$0, $$1);
   }

   @Override
   default List<efb> b(@Nullable bfj $$0, eed $$1) {
      return cmd.super.b($$0, $$1);
   }

   @Override
   default boolean a(@Nullable bfj $$0, efb $$1) {
      return cmd.super.a($$0, $$1);
   }

   @Override
   default gu a(dhk.a $$0, gu $$1) {
      return cmp.super.a($$0, $$1);
   }
}
