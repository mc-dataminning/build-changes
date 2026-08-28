import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public record ffv(float a, boolean b, Map<String, List<ffu>> c) {
   public static class a {
      private final float a;
      private final Map<String, List<ffu>> b = Maps.newHashMap();
      private boolean c;

      public static ffv.a a(float $$0) {
         return new ffv.a($$0);
      }

      private a(float $$0) {
         this.a = $$0;
      }

      public ffv.a a() {
         this.c = true;
         return this;
      }

      public ffv.a a(String $$0, ffu $$1) {
         this.b.computeIfAbsent($$0, $$0x -> new ArrayList<>()).add($$1);
         return this;
      }

      public ffv b() {
         return new ffv(this.a, this.c, this.b);
      }
   }
}
