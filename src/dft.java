import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public interface dft extends dfz, dgl, dgn {
   @Override
   default <T extends dtz> Optional<T> a(ji $$0, dub<T> $$1) {
      return dgl.super.a($$0, $$1);
   }

   @Override
   default List<fbu> c(@Nullable bul $$0, fav $$1) {
      return dfz.super.c($$0, $$1);
   }

   @Override
   default boolean a(@Nullable bul $$0, fbu $$1) {
      return dfz.super.a($$0, $$1);
   }

   @Override
   default ji a(ecs.a $$0, ji $$1) {
      return dgl.super.a($$0, $$1);
   }
}
