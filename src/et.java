import java.util.Map;
import javax.annotation.Nullable;

public interface et {
   et a = new et() {
      @Nullable
      @Override
      public xx a(String $$0) {
         return null;
      }
   };

   @Nullable
   xx a(String var1);

   public static record a(Map<String, xx> b) implements et {
      @Nullable
      @Override
      public xx a(String $$0) {
         return this.b.get($$0);
      }

      public Map<String, xx> a() {
         return this.b;
      }
   }
}
