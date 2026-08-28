import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public interface dgs extends dgy, dhk, dhm {
   @Override
   default <T extends duw> Optional<T> a(jh $$0, duy<T> $$1) {
      return dhk.super.a($$0, $$1);
   }

   @Override
   default List<fcr> c(@Nullable bvj $$0, fbs $$1) {
      return dgy.super.c($$0, $$1);
   }

   @Override
   default boolean a(@Nullable bvj $$0, fcr $$1) {
      return dgy.super.a($$0, $$1);
   }

   @Override
   default jh a(edp.a $$0, jh $$1) {
      return dhk.super.a($$0, $$1);
   }
}
