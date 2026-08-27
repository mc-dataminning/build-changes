import java.util.Map;
import javax.annotation.Nullable;

public interface dr {
   dr a = new dr() {
      @Nullable
      @Override
      public uc a(String $$0) {
         return null;
      }
   };

   @Nullable
   uc a(String var1);

   public static record a(Map<String, uc> b) implements dr {
      @Nullable
      @Override
      public uc a(String $$0) {
         return this.b.get($$0);
      }

      public Map<String, uc> a() {
         return this.b;
      }
   }
}
