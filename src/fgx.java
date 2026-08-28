import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public record fgx(float a, boolean b, Map<String, List<fgw>> c) {
   public static class a {
      private final float a;
      private final Map<String, List<fgw>> b = Maps.newHashMap();
      private boolean c;

      public static fgx.a a(float $$0) {
         return new fgx.a($$0);
      }

      private a(float $$0) {
         this.a = $$0;
      }

      public fgx.a a() {
         this.c = true;
         return this;
      }

      public fgx.a a(String $$0, fgw $$1) {
         this.b.computeIfAbsent($$0, $$0x -> new ArrayList<>()).add($$1);
         return this;
      }

      public fgx b() {
         return new fgx(this.a, this.c, this.b);
      }
   }
}
