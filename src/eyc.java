import it.unimi.dsi.fastutil.ints.IntSet;
import javax.annotation.Nullable;

public interface eyc extends AutoCloseable {
   float a = 7.0F;

   @Override
   default void close() {
   }

   @Nullable
   default eyb a(int $$0) {
      return null;
   }

   IntSet a();

   public static record a(eyc a, fjv.a b) implements AutoCloseable {
      @Override
      public void close() {
         this.a.close();
      }
   }
}
