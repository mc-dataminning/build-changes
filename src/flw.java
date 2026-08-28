import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public record flw(float a, boolean b, Map<String, List<flv>> c) {
   public static class a {
      private final float a;
      private final Map<String, List<flv>> b = Maps.newHashMap();
      private boolean c;

      public static flw.a a(float $$0) {
         return new flw.a($$0);
      }

      private a(float $$0) {
         this.a = $$0;
      }

      public flw.a a() {
         this.c = true;
         return this;
      }

      public flw.a a(String $$0, flv $$1) {
         this.b.computeIfAbsent($$0, $$0x -> new ArrayList<>()).add($$1);
         return this;
      }

      public flw b() {
         return new flw(this.a, this.c, this.b);
      }
   }
}
