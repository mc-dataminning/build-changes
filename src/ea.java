import java.util.Map;
import javax.annotation.Nullable;

public interface ea {
   ea a = new ea() {
      @Nullable
      @Override
      public xi a(String $$0) {
         return null;
      }
   };

   @Nullable
   xi a(String var1);

   public static record a(Map<String, xi> b) implements ea {
      @Nullable
      @Override
      public xi a(String $$0) {
         return this.b.get($$0);
      }

      public Map<String, xi> a() {
         return this.b;
      }
   }
}
