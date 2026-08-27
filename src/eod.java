import it.unimi.dsi.fastutil.ints.IntSet;
import javax.annotation.Nullable;

public interface eod extends AutoCloseable {
   @Override
   default void close() {
   }

   @Nullable
   default eoc a(int $$0) {
      return null;
   }

   IntSet a();
}
