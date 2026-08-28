import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public record fgd(float a, boolean b, Map<String, List<fgc>> c) {
   public static class a {
      private final float a;
      private final Map<String, List<fgc>> b = Maps.newHashMap();
      private boolean c;

      public static fgd.a a(float $$0) {
         return new fgd.a($$0);
      }

      private a(float $$0) {
         this.a = $$0;
      }

      public fgd.a a() {
         this.c = true;
         return this;
      }

      public fgd.a a(String $$0, fgc $$1) {
         this.b.computeIfAbsent($$0, $$0x -> new ArrayList<>()).add($$1);
         return this;
      }

      public fgd b() {
         return new fgd(this.a, this.c, this.b);
      }
   }
}
