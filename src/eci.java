import com.google.common.collect.ImmutableSet;
import java.util.Set;

public interface eci {
   default Set<eep<?>> a() {
      return ImmutableSet.of();
   }

   default void a(ecq $$0) {
      $$0.a(this);
   }
}
