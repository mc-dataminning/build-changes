import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public record fnr(float a, boolean b, Map<String, List<fnq>> c) {
   public static class a {
      private final float a;
      private final Map<String, List<fnq>> b = Maps.newHashMap();
      private boolean c;

      public static fnr.a a(float $$0) {
         return new fnr.a($$0);
      }

      private a(float $$0) {
         this.a = $$0;
      }

      public fnr.a a() {
         this.c = true;
         return this;
      }

      public fnr.a a(String $$0, fnq $$1) {
         this.b.computeIfAbsent($$0, $$0x -> new ArrayList<>()).add($$1);
         return this;
      }

      public fnr b() {
         return new fnr(this.a, this.c, this.b);
      }
   }
}
