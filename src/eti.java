import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import org.apache.commons.compress.utils.Lists;

public record eti(float a, boolean b, Map<String, List<eth>> c) {
   public static class a {
      private final float a;
      private final Map<String, List<eth>> b = Maps.newHashMap();
      private boolean c;

      public static eti.a a(float $$0) {
         return new eti.a($$0);
      }

      private a(float $$0) {
         this.a = $$0;
      }

      public eti.a a() {
         this.c = true;
         return this;
      }

      public eti.a a(String $$0, eth $$1) {
         this.b.computeIfAbsent($$0, $$0x -> Lists.newArrayList()).add($$1);
         return this;
      }

      public eti b() {
         return new eti(this.a, this.c, this.b);
      }
   }
}
