import java.util.Collection;
import java.util.List;

public interface fsn extends fqc, fsq {
   fsn.a w();

   default boolean E() {
      return true;
   }

   default Collection<? extends fsn> L() {
      return List.of(this);
   }

   public static enum a {
      a,
      b,
      c;

      public boolean a() {
         return this == c;
      }
   }
}
