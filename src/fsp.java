import java.util.Collection;
import java.util.List;

public interface fsp extends fqe, fss {
   fsp.a w();

   default boolean E() {
      return true;
   }

   default Collection<? extends fsp> L() {
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
