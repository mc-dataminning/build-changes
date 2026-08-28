import java.util.Map;
import javax.annotation.Nullable;

public interface es {
   es a = new es() {
      @Nullable
      @Override
      public xu a(String $$0) {
         return null;
      }
   };

   @Nullable
   xu a(String var1);

   public static record a(Map<String, xu> b) implements es {
      @Nullable
      @Override
      public xu a(String $$0) {
         return this.b.get($$0);
      }

      public Map<String, xu> a() {
         return this.b;
      }
   }
}
