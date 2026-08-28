import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public record ffw(float a, boolean b, Map<String, List<ffv>> c) {
   public static class a {
      private final float a;
      private final Map<String, List<ffv>> b = Maps.newHashMap();
      private boolean c;

      public static ffw.a a(float $$0) {
         return new ffw.a($$0);
      }

      private a(float $$0) {
         this.a = $$0;
      }

      public ffw.a a() {
         this.c = true;
         return this;
      }

      public ffw.a a(String $$0, ffv $$1) {
         this.b.computeIfAbsent($$0, $$0x -> new ArrayList<>()).add($$1);
         return this;
      }

      public ffw b() {
         return new ffw(this.a, this.c, this.b);
      }
   }
}
