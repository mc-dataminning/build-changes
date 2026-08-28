import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public record frt(float a, boolean b, Map<String, List<frs>> c) {
   public static class a {
      private final float a;
      private final Map<String, List<frs>> b = Maps.newHashMap();
      private boolean c;

      public static frt.a a(float $$0) {
         return new frt.a($$0);
      }

      private a(float $$0) {
         this.a = $$0;
      }

      public frt.a a() {
         this.c = true;
         return this;
      }

      public frt.a a(String $$0, frs $$1) {
         this.b.computeIfAbsent($$0, $$0x -> new ArrayList<>()).add($$1);
         return this;
      }

      public frt b() {
         return new frt(this.a, this.c, this.b);
      }
   }
}
