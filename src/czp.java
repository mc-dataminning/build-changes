import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public interface czp extends czu, dag, dai {
   @Override
   default <T extends dnm> Optional<T> a(in $$0, dno<T> $$1) {
      return dag.super.a($$0, $$1);
   }

   @Override
   default List<eui> c(@Nullable brh $$0, etk $$1) {
      return czu.super.c($$0, $$1);
   }

   @Override
   default boolean a(@Nullable brh $$0, eui $$1) {
      return czu.super.a($$0, $$1);
   }

   @Override
   default in a(dvz.a $$0, in $$1) {
      return dag.super.a($$0, $$1);
   }
}
