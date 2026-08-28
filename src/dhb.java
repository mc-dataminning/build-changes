import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public interface dhb extends dhh, dhs, dhu {
   @Override
   default <T extends dvl> Optional<T> a(jj $$0, dvn<T> $$1) {
      return dhs.super.a($$0, $$1);
   }

   @Override
   default List<fdo> c(@Nullable bvs $$0, fcp $$1) {
      return dhh.super.c($$0, $$1);
   }

   @Override
   default boolean a(@Nullable bvs $$0, fdo $$1) {
      return dhh.super.a($$0, $$1);
   }

   @Override
   default jj a(eel.a $$0, jj $$1) {
      return dhs.super.a($$0, $$1);
   }
}
