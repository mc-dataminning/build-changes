import java.util.Map;
import javax.annotation.Nullable;

public interface ds {
   ds a = new ds() {
      @Nullable
      @Override
      public ww a(String $$0) {
         return null;
      }
   };

   @Nullable
   ww a(String var1);

   public static record a(Map<String, ww> b) implements ds {
      @Nullable
      @Override
      public ww a(String $$0) {
         return this.b.get($$0);
      }

      public Map<String, ww> a() {
         return this.b;
      }
   }
}
