import java.util.Map;
import javax.annotation.Nullable;

public interface ei {
   ei a = new ei() {
      @Nullable
      @Override
      public xs a(String $$0) {
         return null;
      }
   };

   @Nullable
   xs a(String var1);

   public static record a(Map<String, xs> b) implements ei {
      @Nullable
      @Override
      public xs a(String $$0) {
         return this.b.get($$0);
      }

      public Map<String, xs> a() {
         return this.b;
      }
   }
}
