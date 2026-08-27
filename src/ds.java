import java.util.Map;
import javax.annotation.Nullable;

public interface ds {
   ds a = new ds() {
      @Nullable
      @Override
      public vh a(String $$0) {
         return null;
      }
   };

   @Nullable
   vh a(String var1);

   public static record a(Map<String, vh> b) implements ds {
      @Nullable
      @Override
      public vh a(String $$0) {
         return this.b.get($$0);
      }

      public Map<String, vh> a() {
         return this.b;
      }
   }
}
