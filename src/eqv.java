import com.google.common.collect.ImmutableSet;
import java.util.Set;

public interface eqv {
   default Set<etn<?>> a() {
      return ImmutableSet.of();
   }

   default void a(era $$0) {
      $$0.a(this);
   }
}
