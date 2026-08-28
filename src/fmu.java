import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public record fmu(float a, boolean b, Map<String, List<fmt>> c) {
   public static class a {
      private final float a;
      private final Map<String, List<fmt>> b = Maps.newHashMap();
      private boolean c;

      public static fmu.a a(float $$0) {
         return new fmu.a($$0);
      }

      private a(float $$0) {
         this.a = $$0;
      }

      public fmu.a a() {
         this.c = true;
         return this;
      }

      public fmu.a a(String $$0, fmt $$1) {
         this.b.computeIfAbsent($$0, $$0x -> new ArrayList<>()).add($$1);
         return this;
      }

      public fmu b() {
         return new fmu(this.a, this.c, this.b);
      }
   }
}
