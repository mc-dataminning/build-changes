import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import org.apache.commons.compress.utils.Lists;

public record evr(float a, boolean b, Map<String, List<evq>> c) {
   public static class a {
      private final float a;
      private final Map<String, List<evq>> b = Maps.newHashMap();
      private boolean c;

      public static evr.a a(float $$0) {
         return new evr.a($$0);
      }

      private a(float $$0) {
         this.a = $$0;
      }

      public evr.a a() {
         this.c = true;
         return this;
      }

      public evr.a a(String $$0, evq $$1) {
         this.b.computeIfAbsent($$0, $$0x -> Lists.newArrayList()).add($$1);
         return this;
      }

      public evr b() {
         return new evr(this.a, this.c, this.b);
      }
   }
}
