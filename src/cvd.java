import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public interface cvd extends cvi, cvu, cvw {
   @Override
   default <T extends dix> Optional<T> a(hz $$0, diz<T> $$1) {
      return cvu.super.a($$0, $$1);
   }

   @Override
   default List<eos> c(@Nullable bnq $$0, enu $$1) {
      return cvi.super.c($$0, $$1);
   }

   @Override
   default boolean a(@Nullable bnq $$0, eos $$1) {
      return cvi.super.a($$0, $$1);
   }

   @Override
   default hz a(dqv.a $$0, hz $$1) {
      return cvu.super.a($$0, $$1);
   }
}
