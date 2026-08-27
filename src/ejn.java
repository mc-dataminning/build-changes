import it.unimi.dsi.fastutil.ints.IntSet;
import javax.annotation.Nullable;

public interface ejn extends AutoCloseable {
   @Override
   default void close() {
   }

   @Nullable
   default ejm a(int $$0) {
      return null;
   }

   IntSet a();
}
