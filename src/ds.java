import java.util.Map;
import javax.annotation.Nullable;

public interface ds {
   ds a = new ds() {
      @Nullable
      @Override
      public wi a(String $$0) {
         return null;
      }
   };

   @Nullable
   wi a(String var1);

   public static record a(Map<String, wi> b) implements ds {
      @Nullable
      @Override
      public wi a(String $$0) {
         return this.b.get($$0);
      }

      public Map<String, wi> a() {
         return this.b;
      }
   }
}
