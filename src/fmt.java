import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public record fmt(float a, boolean b, Map<String, List<fms>> c) {
   public static class a {
      private final float a;
      private final Map<String, List<fms>> b = Maps.newHashMap();
      private boolean c;

      public static fmt.a a(float $$0) {
         return new fmt.a($$0);
      }

      private a(float $$0) {
         this.a = $$0;
      }

      public fmt.a a() {
         this.c = true;
         return this;
      }

      public fmt.a a(String $$0, fms $$1) {
         this.b.computeIfAbsent($$0, $$0x -> new ArrayList<>()).add($$1);
         return this;
      }

      public fmt b() {
         return new fmt(this.a, this.c, this.b);
      }
   }
}
