import java.util.Map;
import javax.annotation.Nullable;

public interface ds {
   ds a = new ds() {
      @Nullable
      @Override
      public uy a(String $$0) {
         return null;
      }
   };

   @Nullable
   uy a(String var1);

   public static record a(Map<String, uy> b) implements ds {
      @Nullable
      @Override
      public uy a(String $$0) {
         return this.b.get($$0);
      }

      public Map<String, uy> a() {
         return this.b;
      }
   }
}
