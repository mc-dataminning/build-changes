import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public record fqh(float a, boolean b, Map<String, List<fqg>> c) {
   public static class a {
      private final float a;
      private final Map<String, List<fqg>> b = Maps.newHashMap();
      private boolean c;

      public static fqh.a a(float $$0) {
         return new fqh.a($$0);
      }

      private a(float $$0) {
         this.a = $$0;
      }

      public fqh.a a() {
         this.c = true;
         return this;
      }

      public fqh.a a(String $$0, fqg $$1) {
         this.b.computeIfAbsent($$0, $$0x -> new ArrayList<>()).add($$1);
         return this;
      }

      public fqh b() {
         return new fqh(this.a, this.c, this.b);
      }
   }
}
