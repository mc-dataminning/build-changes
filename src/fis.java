import it.unimi.dsi.fastutil.ints.IntSet;
import javax.annotation.Nullable;

public interface fis extends AutoCloseable {
   float a = 7.0F;

   @Override
   default void close() {
   }

   @Nullable
   default fir a(int $$0) {
      return null;
   }

   IntSet a();

   public static record a(fis a, fwp.a b) implements AutoCloseable {
      @Override
      public void close() {
         this.a.close();
      }
   }
}
