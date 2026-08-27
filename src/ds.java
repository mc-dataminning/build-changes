import java.util.Map;
import javax.annotation.Nullable;

public interface ds {
   ds a = new ds() {
      @Nullable
      @Override
      public vl a(String $$0) {
         return null;
      }
   };

   @Nullable
   vl a(String var1);

   public static record a(Map<String, vl> b) implements ds {
      @Nullable
      @Override
      public vl a(String $$0) {
         return this.b.get($$0);
      }

      public Map<String, vl> a() {
         return this.b;
      }
   }
}
