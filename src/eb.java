import java.util.Map;
import javax.annotation.Nullable;

public interface eb {
   eb a = new eb() {
      @Nullable
      @Override
      public xk a(String $$0) {
         return null;
      }
   };

   @Nullable
   xk a(String var1);

   public static record a(Map<String, xk> b) implements eb {
      @Nullable
      @Override
      public xk a(String $$0) {
         return this.b.get($$0);
      }

      public Map<String, xk> a() {
         return this.b;
      }
   }
}
