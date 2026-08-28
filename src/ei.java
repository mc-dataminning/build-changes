import java.util.Map;
import javax.annotation.Nullable;

public interface ei {
   ei a = new ei() {
      @Nullable
      @Override
      public xw a(String $$0) {
         return null;
      }
   };

   @Nullable
   xw a(String var1);

   public static record a(Map<String, xw> b) implements ei {
      @Nullable
      @Override
      public xw a(String $$0) {
         return this.b.get($$0);
      }

      public Map<String, xw> a() {
         return this.b;
      }
   }
}
