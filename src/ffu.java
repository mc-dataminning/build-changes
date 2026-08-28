import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public record ffu(float a, boolean b, Map<String, List<fft>> c) {
   public static class a {
      private final float a;
      private final Map<String, List<fft>> b = Maps.newHashMap();
      private boolean c;

      public static ffu.a a(float $$0) {
         return new ffu.a($$0);
      }

      private a(float $$0) {
         this.a = $$0;
      }

      public ffu.a a() {
         this.c = true;
         return this;
      }

      public ffu.a a(String $$0, fft $$1) {
         this.b.computeIfAbsent($$0, $$0x -> new ArrayList<>()).add($$1);
         return this;
      }

      public ffu b() {
         return new ffu(this.a, this.c, this.b);
      }
   }
}
