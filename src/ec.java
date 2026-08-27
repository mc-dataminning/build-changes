import java.util.Map;
import javax.annotation.Nullable;

public interface ec {
   ec a = new ec() {
      @Nullable
      @Override
      public xn a(String $$0) {
         return null;
      }
   };

   @Nullable
   xn a(String var1);

   public static record a(Map<String, xn> b) implements ec {
      @Nullable
      @Override
      public xn a(String $$0) {
         return this.b.get($$0);
      }

      public Map<String, xn> a() {
         return this.b;
      }
   }
}
