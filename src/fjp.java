import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public record fjp(float a, boolean b, Map<String, List<fjo>> c) {
   public static class a {
      private final float a;
      private final Map<String, List<fjo>> b = Maps.newHashMap();
      private boolean c;

      public static fjp.a a(float $$0) {
         return new fjp.a($$0);
      }

      private a(float $$0) {
         this.a = $$0;
      }

      public fjp.a a() {
         this.c = true;
         return this;
      }

      public fjp.a a(String $$0, fjo $$1) {
         this.b.computeIfAbsent($$0, $$0x -> new ArrayList<>()).add($$1);
         return this;
      }

      public fjp b() {
         return new fjp(this.a, this.c, this.b);
      }
   }
}
