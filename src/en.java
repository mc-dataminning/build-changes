import java.util.Map;
import javax.annotation.Nullable;

public interface en {
   en a = new en() {
      @Nullable
      @Override
      public ye a(String $$0) {
         return null;
      }
   };

   @Nullable
   ye a(String var1);

   public static record a(Map<String, ye> b) implements en {
      @Nullable
      @Override
      public ye a(String $$0) {
         return this.b.get($$0);
      }

      public Map<String, ye> a() {
         return this.b;
      }
   }
}
