import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public interface cpc extends cph, cpt, cpv {
   @Override
   default <T extends dcq> Optional<T> a(gw $$0, dcs<T> $$1) {
      return cpt.super.a($$0, $$1);
   }

   @Override
   default List<eib> c(@Nullable bil $$0, ehd $$1) {
      return cph.super.c($$0, $$1);
   }

   @Override
   default boolean a(@Nullable bil $$0, eib $$1) {
      return cph.super.a($$0, $$1);
   }

   @Override
   default gw a(dkn.a $$0, gw $$1) {
      return cpt.super.a($$0, $$1);
   }
}
