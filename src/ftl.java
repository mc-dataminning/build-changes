import java.util.Collection;
import java.util.List;

public interface ftl extends fra, fto {
   ftl.a w();

   default boolean E() {
      return true;
   }

   default Collection<? extends ftl> L() {
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
