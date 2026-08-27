import it.unimi.dsi.fastutil.ints.IntSet;
import javax.annotation.Nullable;

public interface eoe extends AutoCloseable {
   @Override
   default void close() {
   }

   @Nullable
   default eod a(int $$0) {
      return null;
   }

   IntSet a();
}
