import it.unimi.dsi.fastutil.ints.IntSet;
import javax.annotation.Nullable;

public interface eon extends AutoCloseable {
   @Override
   default void close() {
   }

   @Nullable
   default eom a(int $$0) {
      return null;
   }

   IntSet a();
}
