import java.util.Map;
import javax.annotation.Nullable;

public interface dp {
   dp a = new dp() {
      @Nullable
      @Override
      public tu a(String $$0) {
         return null;
      }
   };

   @Nullable
   tu a(String var1);

   public static record a(Map<String, tu> b) implements dp {
      @Nullable
      @Override
      public tu a(String $$0) {
         return this.b.get($$0);
      }

      public Map<String, tu> a() {
         return this.b;
      }
   }
}
