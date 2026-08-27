import java.util.Map;
import javax.annotation.Nullable;

public interface dq {
   dq a = new dq() {
      @Nullable
      @Override
      public tt a(String $$0) {
         return null;
      }
   };

   @Nullable
   tt a(String var1);

   public static record a(Map<String, tt> b) implements dq {
      @Nullable
      @Override
      public tt a(String $$0) {
         return this.b.get($$0);
      }

      public Map<String, tt> a() {
         return this.b;
      }
   }
}
