import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public interface crm extends crr, csd, csf {
   @Override
   default <T extends dfd> Optional<T> a(ht $$0, dff<T> $$1) {
      return csd.super.a($$0, $$1);
   }

   @Override
   default List<ekn> c(@Nullable bkq $$0, ejp $$1) {
      return crr.super.c($$0, $$1);
   }

   @Override
   default boolean a(@Nullable bkq $$0, ekn $$1) {
      return crr.super.a($$0, $$1);
   }

   @Override
   default ht a(dmr.a $$0, ht $$1) {
      return csd.super.a($$0, $$1);
   }
}
