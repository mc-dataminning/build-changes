import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public interface dbj extends dbo, dca, dcc {
   @Override
   default <T extends dpg> Optional<T> a(iz $$0, dpi<T> $$1) {
      return dca.super.a($$0, $$1);
   }

   @Override
   default List<ewj> c(@Nullable bst $$0, evl $$1) {
      return dbo.super.c($$0, $$1);
   }

   @Override
   default boolean a(@Nullable bst $$0, ewj $$1) {
      return dbo.super.a($$0, $$1);
   }

   @Override
   default iz a(dxt.a $$0, iz $$1) {
      return dca.super.a($$0, $$1);
   }
}
