import it.unimi.dsi.fastutil.ints.IntSet;
import javax.annotation.Nullable;

public interface eme extends AutoCloseable {
   @Override
   default void close() {
   }

   @Nullable
   default emd a(int $$0) {
      return null;
   }

   IntSet a();
}
