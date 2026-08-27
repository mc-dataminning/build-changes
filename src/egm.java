import it.unimi.dsi.fastutil.ints.IntSet;
import javax.annotation.Nullable;

public interface egm extends AutoCloseable {
   @Override
   default void close() {
   }

   @Nullable
   default egl a(int $$0) {
      return null;
   }

   IntSet a();
}
