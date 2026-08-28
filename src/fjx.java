import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public record fjx(float a, boolean b, Map<String, List<fjw>> c) {
   public static class a {
      private final float a;
      private final Map<String, List<fjw>> b = Maps.newHashMap();
      private boolean c;

      public static fjx.a a(float $$0) {
         return new fjx.a($$0);
      }

      private a(float $$0) {
         this.a = $$0;
      }

      public fjx.a a() {
         this.c = true;
         return this;
      }

      public fjx.a a(String $$0, fjw $$1) {
         this.b.computeIfAbsent($$0, $$0x -> new ArrayList<>()).add($$1);
         return this;
      }

      public fjx b() {
         return new fjx(this.a, this.c, this.b);
      }
   }
}
