import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public record fja(float a, boolean b, Map<String, List<fiz>> c) {
   public static class a {
      private final float a;
      private final Map<String, List<fiz>> b = Maps.newHashMap();
      private boolean c;

      public static fja.a a(float $$0) {
         return new fja.a($$0);
      }

      private a(float $$0) {
         this.a = $$0;
      }

      public fja.a a() {
         this.c = true;
         return this;
      }

      public fja.a a(String $$0, fiz $$1) {
         this.b.computeIfAbsent($$0, $$0x -> new ArrayList<>()).add($$1);
         return this;
      }

      public fja b() {
         return new fja(this.a, this.c, this.b);
      }
   }
}
