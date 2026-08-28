import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public record flv(float a, boolean b, Map<String, List<flu>> c) {
   public static class a {
      private final float a;
      private final Map<String, List<flu>> b = Maps.newHashMap();
      private boolean c;

      public static flv.a a(float $$0) {
         return new flv.a($$0);
      }

      private a(float $$0) {
         this.a = $$0;
      }

      public flv.a a() {
         this.c = true;
         return this;
      }

      public flv.a a(String $$0, flu $$1) {
         this.b.computeIfAbsent($$0, $$0x -> new ArrayList<>()).add($$1);
         return this;
      }

      public flv b() {
         return new flv(this.a, this.c, this.b);
      }
   }
}
