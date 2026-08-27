import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import org.apache.commons.compress.utils.Lists;

public record eyf(float a, boolean b, Map<String, List<eye>> c) {
   public static class a {
      private final float a;
      private final Map<String, List<eye>> b = Maps.newHashMap();
      private boolean c;

      public static eyf.a a(float $$0) {
         return new eyf.a($$0);
      }

      private a(float $$0) {
         this.a = $$0;
      }

      public eyf.a a() {
         this.c = true;
         return this;
      }

      public eyf.a a(String $$0, eye $$1) {
         this.b.computeIfAbsent($$0, $$0x -> Lists.newArrayList()).add($$1);
         return this;
      }

      public eyf b() {
         return new eyf(this.a, this.c, this.b);
      }
   }
}
