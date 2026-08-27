import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import org.apache.commons.compress.utils.Lists;

public record evz(float a, boolean b, Map<String, List<evy>> c) {
   public static class a {
      private final float a;
      private final Map<String, List<evy>> b = Maps.newHashMap();
      private boolean c;

      public static evz.a a(float $$0) {
         return new evz.a($$0);
      }

      private a(float $$0) {
         this.a = $$0;
      }

      public evz.a a() {
         this.c = true;
         return this;
      }

      public evz.a a(String $$0, evy $$1) {
         this.b.computeIfAbsent($$0, $$0x -> Lists.newArrayList()).add($$1);
         return this;
      }

      public evz b() {
         return new evz(this.a, this.c, this.b);
      }
   }
}
