import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public record fgl(float a, boolean b, Map<String, List<fgk>> c) {
   public static class a {
      private final float a;
      private final Map<String, List<fgk>> b = Maps.newHashMap();
      private boolean c;

      public static fgl.a a(float $$0) {
         return new fgl.a($$0);
      }

      private a(float $$0) {
         this.a = $$0;
      }

      public fgl.a a() {
         this.c = true;
         return this;
      }

      public fgl.a a(String $$0, fgk $$1) {
         this.b.computeIfAbsent($$0, $$0x -> new ArrayList<>()).add($$1);
         return this;
      }

      public fgl b() {
         return new fgl(this.a, this.c, this.b);
      }
   }
}
