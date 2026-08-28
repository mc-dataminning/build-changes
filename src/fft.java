import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public record fft(float a, boolean b, Map<String, List<ffs>> c) {
   public static class a {
      private final float a;
      private final Map<String, List<ffs>> b = Maps.newHashMap();
      private boolean c;

      public static fft.a a(float $$0) {
         return new fft.a($$0);
      }

      private a(float $$0) {
         this.a = $$0;
      }

      public fft.a a() {
         this.c = true;
         return this;
      }

      public fft.a a(String $$0, ffs $$1) {
         this.b.computeIfAbsent($$0, $$0x -> new ArrayList<>()).add($$1);
         return this;
      }

      public fft b() {
         return new fft(this.a, this.c, this.b);
      }
   }
}
