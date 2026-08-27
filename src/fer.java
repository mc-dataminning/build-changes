import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public record fer(float a, boolean b, Map<String, List<feq>> c) {
   public static class a {
      private final float a;
      private final Map<String, List<feq>> b = Maps.newHashMap();
      private boolean c;

      public static fer.a a(float $$0) {
         return new fer.a($$0);
      }

      private a(float $$0) {
         this.a = $$0;
      }

      public fer.a a() {
         this.c = true;
         return this;
      }

      public fer.a a(String $$0, feq $$1) {
         this.b.computeIfAbsent($$0, $$0x -> new ArrayList<>()).add($$1);
         return this;
      }

      public fer b() {
         return new fer(this.a, this.c, this.b);
      }
   }
}
