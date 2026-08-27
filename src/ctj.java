import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public interface ctj extends cto, cua, cuc {
   @Override
   default <T extends dhd> Optional<T> a(hx $$0, dhf<T> $$1) {
      return cua.super.a($$0, $$1);
   }

   @Override
   default List<emv> c(@Nullable blw $$0, elx $$1) {
      return cto.super.c($$0, $$1);
   }

   @Override
   default boolean a(@Nullable blw $$0, emv $$1) {
      return cto.super.a($$0, $$1);
   }

   @Override
   default hx a(doy.a $$0, hx $$1) {
      return cua.super.a($$0, $$1);
   }
}
