import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public interface ctb extends ctg, cts, ctu {
   @Override
   default <T extends dgv> Optional<T> a(hx $$0, dgx<T> $$1) {
      return cts.super.a($$0, $$1);
   }

   @Override
   default List<emm> c(@Nullable blv $$0, elo $$1) {
      return ctg.super.c($$0, $$1);
   }

   @Override
   default boolean a(@Nullable blv $$0, emm $$1) {
      return ctg.super.a($$0, $$1);
   }

   @Override
   default hx a(doq.a $$0, hx $$1) {
      return cts.super.a($$0, $$1);
   }
}
