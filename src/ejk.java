import it.unimi.dsi.fastutil.ints.IntSet;
import javax.annotation.Nullable;

public interface ejk extends AutoCloseable {
   @Override
   default void close() {
   }

   @Nullable
   default ejj a(int $$0) {
      return null;
   }

   IntSet a();
}
