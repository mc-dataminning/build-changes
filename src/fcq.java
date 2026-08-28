import it.unimi.dsi.fastutil.ints.IntSet;
import javax.annotation.Nullable;

public interface fcq extends AutoCloseable {
   float a = 7.0F;

   @Override
   default void close() {
   }

   @Nullable
   default fcp a(int $$0) {
      return null;
   }

   IntSet a();

   public static record a(fcq a, fov.a b) implements AutoCloseable {
      @Override
      public void close() {
         this.a.close();
      }
   }
}
