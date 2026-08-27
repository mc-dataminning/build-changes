import it.unimi.dsi.fastutil.ints.IntSet;
import javax.annotation.Nullable;

public interface eoc extends AutoCloseable {
   @Override
   default void close() {
   }

   @Nullable
   default eob a(int $$0) {
      return null;
   }

   IntSet a();
}
