import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public record flx(float a, boolean b, Map<String, List<flw>> c) {
   public static class a {
      private final float a;
      private final Map<String, List<flw>> b = Maps.newHashMap();
      private boolean c;

      public static flx.a a(float $$0) {
         return new flx.a($$0);
      }

      private a(float $$0) {
         this.a = $$0;
      }

      public flx.a a() {
         this.c = true;
         return this;
      }

      public flx.a a(String $$0, flw $$1) {
         this.b.computeIfAbsent($$0, $$0x -> new ArrayList<>()).add($$1);
         return this;
      }

      public flx b() {
         return new flx(this.a, this.c, this.b);
      }
   }
}
