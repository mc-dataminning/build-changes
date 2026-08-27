import it.unimi.dsi.fastutil.ints.IntSet;
import javax.annotation.Nullable;

public interface ejm extends AutoCloseable {
   @Override
   default void close() {
   }

   @Nullable
   default ejl a(int $$0) {
      return null;
   }

   IntSet a();
}
