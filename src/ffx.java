import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public record ffx(float a, boolean b, Map<String, List<ffw>> c) {
   public static class a {
      private final float a;
      private final Map<String, List<ffw>> b = Maps.newHashMap();
      private boolean c;

      public static ffx.a a(float $$0) {
         return new ffx.a($$0);
      }

      private a(float $$0) {
         this.a = $$0;
      }

      public ffx.a a() {
         this.c = true;
         return this;
      }

      public ffx.a a(String $$0, ffw $$1) {
         this.b.computeIfAbsent($$0, $$0x -> new ArrayList<>()).add($$1);
         return this;
      }

      public ffx b() {
         return new ffx(this.a, this.c, this.b);
      }
   }
}
