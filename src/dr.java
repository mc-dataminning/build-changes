import java.util.Map;
import javax.annotation.Nullable;

public interface dr {
   dr a = new dr() {
      @Nullable
      @Override
      public ua a(String $$0) {
         return null;
      }
   };

   @Nullable
   ua a(String var1);

   public static record a(Map<String, ua> b) implements dr {
      @Nullable
      @Override
      public ua a(String $$0) {
         return this.b.get($$0);
      }

      public Map<String, ua> a() {
         return this.b;
      }
   }
}
