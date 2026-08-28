import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public record fmn(float a, boolean b, Map<String, List<fmm>> c) {
   public static class a {
      private final float a;
      private final Map<String, List<fmm>> b = Maps.newHashMap();
      private boolean c;

      public static fmn.a a(float $$0) {
         return new fmn.a($$0);
      }

      private a(float $$0) {
         this.a = $$0;
      }

      public fmn.a a() {
         this.c = true;
         return this;
      }

      public fmn.a a(String $$0, fmm $$1) {
         this.b.computeIfAbsent($$0, $$0x -> new ArrayList<>()).add($$1);
         return this;
      }

      public fmn b() {
         return new fmn(this.a, this.c, this.b);
      }
   }
}
