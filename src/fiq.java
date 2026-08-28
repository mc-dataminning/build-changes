import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public record fiq(float a, boolean b, Map<String, List<fip>> c) {
   public static class a {
      private final float a;
      private final Map<String, List<fip>> b = Maps.newHashMap();
      private boolean c;

      public static fiq.a a(float $$0) {
         return new fiq.a($$0);
      }

      private a(float $$0) {
         this.a = $$0;
      }

      public fiq.a a() {
         this.c = true;
         return this;
      }

      public fiq.a a(String $$0, fip $$1) {
         this.b.computeIfAbsent($$0, $$0x -> new ArrayList<>()).add($$1);
         return this;
      }

      public fiq b() {
         return new fiq(this.a, this.c, this.b);
      }
   }
}
