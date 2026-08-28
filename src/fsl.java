import java.util.Collection;
import java.util.List;

public interface fsl extends fqa, fso {
   fsl.a w();

   default boolean E() {
      return true;
   }

   default Collection<? extends fsl> L() {
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
