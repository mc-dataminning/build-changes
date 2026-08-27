import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public interface cwl extends cwq, cxc, cxe {
   @Override
   default <T extends dkg> Optional<T> a(ib $$0, dki<T> $$1) {
      return cxc.super.a($$0, $$1);
   }

   @Override
   default List<eqk> c(@Nullable bow $$0, epm $$1) {
      return cwq.super.c($$0, $$1);
   }

   @Override
   default boolean a(@Nullable bow $$0, eqk $$1) {
      return cwq.super.a($$0, $$1);
   }

   @Override
   default ib a(dsm.a $$0, ib $$1) {
      return cxc.super.a($$0, $$1);
   }
}
