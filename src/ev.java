import java.util.Map;
import javax.annotation.Nullable;

public interface ev {
   ev a = new ev() {
      @Nullable
      @Override
      public xe a(String $$0) {
         return null;
      }
   };

   @Nullable
   xe a(String var1);

   public static record a(Map<String, xe> b) implements ev {
      @Nullable
      @Override
      public xe a(String $$0) {
         return this.b.get($$0);
      }

      public Map<String, xe> a() {
         return this.b;
      }
   }
}
