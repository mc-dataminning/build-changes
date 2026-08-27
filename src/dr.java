import java.util.Map;
import javax.annotation.Nullable;

public interface dr {
   dr a = new dr() {
      @Nullable
      @Override
      public ub a(String $$0) {
         return null;
      }
   };

   @Nullable
   ub a(String var1);

   public static record a(Map<String, ub> b) implements dr {
      @Nullable
      @Override
      public ub a(String $$0) {
         return this.b.get($$0);
      }

      public Map<String, ub> a() {
         return this.b;
      }
   }
}
