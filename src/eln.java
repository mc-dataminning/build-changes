import it.unimi.dsi.fastutil.ints.IntSet;
import javax.annotation.Nullable;

public interface eln extends AutoCloseable {
   @Override
   default void close() {
   }

   @Nullable
   default elm a(int $$0) {
      return null;
   }

   IntSet a();
}
