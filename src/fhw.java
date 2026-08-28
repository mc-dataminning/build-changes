import it.unimi.dsi.fastutil.ints.IntSet;
import javax.annotation.Nullable;

public interface fhw extends AutoCloseable {
   float a = 7.0F;

   @Override
   default void close() {
   }

   @Nullable
   default fhv a(int $$0) {
      return null;
   }

   IntSet a();

   public static record a(fhw a, fvr.a b) implements AutoCloseable {
      @Override
      public void close() {
         this.a.close();
      }
   }
}
