import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public record fms(float a, boolean b, Map<String, List<fmr>> c) {
   public static class a {
      private final float a;
      private final Map<String, List<fmr>> b = Maps.newHashMap();
      private boolean c;

      public static fms.a a(float $$0) {
         return new fms.a($$0);
      }

      private a(float $$0) {
         this.a = $$0;
      }

      public fms.a a() {
         this.c = true;
         return this;
      }

      public fms.a a(String $$0, fmr $$1) {
         this.b.computeIfAbsent($$0, $$0x -> new ArrayList<>()).add($$1);
         return this;
      }

      public fms b() {
         return new fms(this.a, this.c, this.b);
      }
   }
}
