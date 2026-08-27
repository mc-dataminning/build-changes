import java.util.Map;
import javax.annotation.Nullable;

public interface ds {
   ds a = new ds() {
      @Nullable
      @Override
      public wg a(String $$0) {
         return null;
      }
   };

   @Nullable
   wg a(String var1);

   public static record a(Map<String, wg> b) implements ds {
      @Nullable
      @Override
      public wg a(String $$0) {
         return this.b.get($$0);
      }

      public Map<String, wg> a() {
         return this.b;
      }
   }
}
