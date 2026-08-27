import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public interface cyj extends cyo, cza, czc {
   @Override
   default <T extends dmf> Optional<T> a(ib $$0, dmh<T> $$1) {
      return cza.super.a($$0, $$1);
   }

   @Override
   default List<est> c(@Nullable bpv $$0, erv $$1) {
      return cyo.super.c($$0, $$1);
   }

   @Override
   default boolean a(@Nullable bpv $$0, est $$1) {
      return cyo.super.a($$0, $$1);
   }

   @Override
   default ib a(dur.a $$0, ib $$1) {
      return cza.super.a($$0, $$1);
   }
}
