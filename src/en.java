import java.util.Map;
import javax.annotation.Nullable;

public interface en {
   en a = new en() {
      @Nullable
      @Override
      public yf a(String $$0) {
         return null;
      }
   };

   @Nullable
   yf a(String var1);

   public static record a(Map<String, yf> b) implements en {
      @Nullable
      @Override
      public yf a(String $$0) {
         return this.b.get($$0);
      }

      public Map<String, yf> a() {
         return this.b;
      }
   }
}
