import java.util.Map;
import javax.annotation.Nullable;

public interface ev {
   ev a = new ev() {
      @Nullable
      @Override
      public xl a(String $$0) {
         return null;
      }
   };

   @Nullable
   xl a(String var1);

   public static record a(Map<String, xl> b) implements ev {
      @Nullable
      @Override
      public xl a(String $$0) {
         return this.b.get($$0);
      }

      public Map<String, xl> a() {
         return this.b;
      }
   }
}
