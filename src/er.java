import java.util.Map;
import javax.annotation.Nullable;

public interface er {
   er a = new er() {
      @Nullable
      @Override
      public xp a(String $$0) {
         return null;
      }
   };

   @Nullable
   xp a(String var1);

   public static record a(Map<String, xp> b) implements er {
      @Nullable
      @Override
      public xp a(String $$0) {
         return this.b.get($$0);
      }

      public Map<String, xp> a() {
         return this.b;
      }
   }
}
