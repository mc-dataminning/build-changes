import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public interface dfs extends dfy, dgk, dgm {
   @Override
   default <T extends dty> Optional<T> a(ji $$0, dua<T> $$1) {
      return dgk.super.a($$0, $$1);
   }

   @Override
   default List<fbt> c(@Nullable buk $$0, fau $$1) {
      return dfy.super.c($$0, $$1);
   }

   @Override
   default boolean a(@Nullable buk $$0, fbt $$1) {
      return dfy.super.a($$0, $$1);
   }

   @Override
   default ji a(ecr.a $$0, ji $$1) {
      return dgk.super.a($$0, $$1);
   }
}
