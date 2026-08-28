import java.util.Map;
import javax.annotation.Nullable;

public interface eg {
   eg a = new eg() {
      @Nullable
      @Override
      public xm a(String $$0) {
         return null;
      }
   };

   @Nullable
   xm a(String var1);

   public static record a(Map<String, xm> b) implements eg {
      @Nullable
      @Override
      public xm a(String $$0) {
         return this.b.get($$0);
      }

      public Map<String, xm> a() {
         return this.b;
      }
   }
}
