import java.util.Map;
import javax.annotation.Nullable;

public interface dt {
   dt a = new dt() {
      @Nullable
      @Override
      public wy a(String $$0) {
         return null;
      }
   };

   @Nullable
   wy a(String var1);

   public static record a(Map<String, wy> b) implements dt {
      @Nullable
      @Override
      public wy a(String $$0) {
         return this.b.get($$0);
      }

      public Map<String, wy> a() {
         return this.b;
      }
   }
}
