import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import org.apache.commons.compress.utils.Lists;

public record evb(float a, boolean b, Map<String, List<eva>> c) {
   public static class a {
      private final float a;
      private final Map<String, List<eva>> b = Maps.newHashMap();
      private boolean c;

      public static evb.a a(float $$0) {
         return new evb.a($$0);
      }

      private a(float $$0) {
         this.a = $$0;
      }

      public evb.a a() {
         this.c = true;
         return this;
      }

      public evb.a a(String $$0, eva $$1) {
         this.b.computeIfAbsent($$0, $$0x -> Lists.newArrayList()).add($$1);
         return this;
      }

      public evb b() {
         return new evb(this.a, this.c, this.b);
      }
   }
}
