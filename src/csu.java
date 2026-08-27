import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public interface csu extends csz, ctl, ctn {
   @Override
   default <T extends dgo> Optional<T> a(hx $$0, dgq<T> $$1) {
      return ctl.super.a($$0, $$1);
   }

   @Override
   default List<emf> c(@Nullable blp $$0, elh $$1) {
      return csz.super.c($$0, $$1);
   }

   @Override
   default boolean a(@Nullable blp $$0, emf $$1) {
      return csz.super.a($$0, $$1);
   }

   @Override
   default hx a(doj.a $$0, hx $$1) {
      return ctl.super.a($$0, $$1);
   }
}
