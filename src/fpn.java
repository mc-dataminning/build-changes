import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public record fpn(float a, boolean b, Map<String, List<fpm>> c) {
   public static class a {
      private final float a;
      private final Map<String, List<fpm>> b = Maps.newHashMap();
      private boolean c;

      public static fpn.a a(float $$0) {
         return new fpn.a($$0);
      }

      private a(float $$0) {
         this.a = $$0;
      }

      public fpn.a a() {
         this.c = true;
         return this;
      }

      public fpn.a a(String $$0, fpm $$1) {
         this.b.computeIfAbsent($$0, $$0x -> new ArrayList<>()).add($$1);
         return this;
      }

      public fpn b() {
         return new fpn(this.a, this.c, this.b);
      }
   }
}
