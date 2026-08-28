import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public interface dim extends dis, djd, djf {
   @Override
   default <T extends dxf> Optional<T> a(iu $$0, dxh<T> $$1) {
      return djd.super.a($$0, $$1);
   }

   @Override
   default List<ffk> c(@Nullable bwf $$0, fel $$1) {
      return dis.super.c($$0, $$1);
   }

   @Override
   default boolean a(@Nullable bwf $$0, ffk $$1) {
      return dis.super.a($$0, $$1);
   }

   @Override
   default iu a(egg.a $$0, iu $$1) {
      return djd.super.a($$0, $$1);
   }
}
