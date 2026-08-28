import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public record fje(float a, boolean b, Map<String, List<fjd>> c) {
   public static class a {
      private final float a;
      private final Map<String, List<fjd>> b = Maps.newHashMap();
      private boolean c;

      public static fje.a a(float $$0) {
         return new fje.a($$0);
      }

      private a(float $$0) {
         this.a = $$0;
      }

      public fje.a a() {
         this.c = true;
         return this;
      }

      public fje.a a(String $$0, fjd $$1) {
         this.b.computeIfAbsent($$0, $$0x -> new ArrayList<>()).add($$1);
         return this;
      }

      public fje b() {
         return new fje(this.a, this.c, this.b);
      }
   }
}
