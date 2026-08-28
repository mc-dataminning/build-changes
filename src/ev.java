import java.util.Map;
import javax.annotation.Nullable;

public interface ev {
   ev a = new ev() {
      @Nullable
      @Override
      public xf a(String $$0) {
         return null;
      }
   };

   @Nullable
   xf a(String var1);

   public static record a(Map<String, xf> b) implements ev {
      @Nullable
      @Override
      public xf a(String $$0) {
         return this.b.get($$0);
      }

      public Map<String, xf> a() {
         return this.b;
      }
   }
}
