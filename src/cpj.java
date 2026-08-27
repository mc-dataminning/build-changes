import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public interface cpj extends cpo, cqa, cqc {
   @Override
   default <T extends dcx> Optional<T> a(gw $$0, dcz<T> $$1) {
      return cqa.super.a($$0, $$1);
   }

   @Override
   default List<eii> c(@Nullable bis $$0, ehk $$1) {
      return cpo.super.c($$0, $$1);
   }

   @Override
   default boolean a(@Nullable bis $$0, eii $$1) {
      return cpo.super.a($$0, $$1);
   }

   @Override
   default gw a(dku.a $$0, gw $$1) {
      return cqa.super.a($$0, $$1);
   }
}
