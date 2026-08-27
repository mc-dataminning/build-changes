import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import org.apache.commons.compress.utils.Lists;

public record evx(float a, boolean b, Map<String, List<evw>> c) {
   public static class a {
      private final float a;
      private final Map<String, List<evw>> b = Maps.newHashMap();
      private boolean c;

      public static evx.a a(float $$0) {
         return new evx.a($$0);
      }

      private a(float $$0) {
         this.a = $$0;
      }

      public evx.a a() {
         this.c = true;
         return this;
      }

      public evx.a a(String $$0, evw $$1) {
         this.b.computeIfAbsent($$0, $$0x -> Lists.newArrayList()).add($$1);
         return this;
      }

      public evx b() {
         return new evx(this.a, this.c, this.b);
      }
   }
}
