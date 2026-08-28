import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public interface dgl extends dgr, dhc, dhe {
   @Override
   default <T extends dus> Optional<T> a(ji $$0, duu<T> $$1) {
      return dhc.super.a($$0, $$1);
   }

   @Override
   default List<fcr> c(@Nullable bva $$0, fbs $$1) {
      return dgr.super.c($$0, $$1);
   }

   @Override
   default boolean a(@Nullable bva $$0, fcr $$1) {
      return dgr.super.a($$0, $$1);
   }

   @Override
   default ji a(edo.a $$0, ji $$1) {
      return dhc.super.a($$0, $$1);
   }
}
