import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public interface cpn extends cps, cqe, cqg {
   @Override
   default <T extends dcz> Optional<T> a(gw $$0, ddb<T> $$1) {
      return cqe.super.a($$0, $$1);
   }

   @Override
   default List<eia> c(@Nullable biw $$0, ehc $$1) {
      return cps.super.c($$0, $$1);
   }

   @Override
   default boolean a(@Nullable biw $$0, eia $$1) {
      return cps.super.a($$0, $$1);
   }

   @Override
   default gw a(dkm.a $$0, gw $$1) {
      return cqe.super.a($$0, $$1);
   }
}
