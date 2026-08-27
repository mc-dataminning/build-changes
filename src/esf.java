import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import org.apache.commons.compress.utils.Lists;

public record esf(float a, boolean b, Map<String, List<ese>> c) {
   public static class a {
      private final float a;
      private final Map<String, List<ese>> b = Maps.newHashMap();
      private boolean c;

      public static esf.a a(float $$0) {
         return new esf.a($$0);
      }

      private a(float $$0) {
         this.a = $$0;
      }

      public esf.a a() {
         this.c = true;
         return this;
      }

      public esf.a a(String $$0, ese $$1) {
         this.b.computeIfAbsent($$0, $$0x -> Lists.newArrayList()).add($$1);
         return this;
      }

      public esf b() {
         return new esf(this.a, this.c, this.b);
      }
   }
}
