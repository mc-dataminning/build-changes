import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public record frr(float a, boolean b, Map<String, List<frq>> c) {
   public static class a {
      private final float a;
      private final Map<String, List<frq>> b = Maps.newHashMap();
      private boolean c;

      public static frr.a a(float $$0) {
         return new frr.a($$0);
      }

      private a(float $$0) {
         this.a = $$0;
      }

      public frr.a a() {
         this.c = true;
         return this;
      }

      public frr.a a(String $$0, frq $$1) {
         this.b.computeIfAbsent($$0, $$0x -> new ArrayList<>()).add($$1);
         return this;
      }

      public frr b() {
         return new frr(this.a, this.c, this.b);
      }
   }
}
