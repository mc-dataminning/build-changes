import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public record fly(float a, boolean b, Map<String, List<flx>> c) {
   public static class a {
      private final float a;
      private final Map<String, List<flx>> b = Maps.newHashMap();
      private boolean c;

      public static fly.a a(float $$0) {
         return new fly.a($$0);
      }

      private a(float $$0) {
         this.a = $$0;
      }

      public fly.a a() {
         this.c = true;
         return this;
      }

      public fly.a a(String $$0, flx $$1) {
         this.b.computeIfAbsent($$0, $$0x -> new ArrayList<>()).add($$1);
         return this;
      }

      public fly b() {
         return new fly(this.a, this.c, this.b);
      }
   }
}
