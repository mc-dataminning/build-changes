import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public record fcp(float a, boolean b, Map<String, List<fco>> c) {
   public static class a {
      private final float a;
      private final Map<String, List<fco>> b = Maps.newHashMap();
      private boolean c;

      public static fcp.a a(float $$0) {
         return new fcp.a($$0);
      }

      private a(float $$0) {
         this.a = $$0;
      }

      public fcp.a a() {
         this.c = true;
         return this;
      }

      public fcp.a a(String $$0, fco $$1) {
         this.b.computeIfAbsent($$0, $$0x -> new ArrayList<>()).add($$1);
         return this;
      }

      public fcp b() {
         return new fcp(this.a, this.c, this.b);
      }
   }
}
