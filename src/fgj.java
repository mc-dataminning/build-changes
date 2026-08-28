import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public record fgj(float a, boolean b, Map<String, List<fgi>> c) {
   public static class a {
      private final float a;
      private final Map<String, List<fgi>> b = Maps.newHashMap();
      private boolean c;

      public static fgj.a a(float $$0) {
         return new fgj.a($$0);
      }

      private a(float $$0) {
         this.a = $$0;
      }

      public fgj.a a() {
         this.c = true;
         return this;
      }

      public fgj.a a(String $$0, fgi $$1) {
         this.b.computeIfAbsent($$0, $$0x -> new ArrayList<>()).add($$1);
         return this;
      }

      public fgj b() {
         return new fgj(this.a, this.c, this.b);
      }
   }
}
