import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import org.apache.commons.compress.utils.Lists;

public record etz(float a, boolean b, Map<String, List<ety>> c) {
   public static class a {
      private final float a;
      private final Map<String, List<ety>> b = Maps.newHashMap();
      private boolean c;

      public static etz.a a(float $$0) {
         return new etz.a($$0);
      }

      private a(float $$0) {
         this.a = $$0;
      }

      public etz.a a() {
         this.c = true;
         return this;
      }

      public etz.a a(String $$0, ety $$1) {
         this.b.computeIfAbsent($$0, $$0x -> Lists.newArrayList()).add($$1);
         return this;
      }

      public etz b() {
         return new etz(this.a, this.c, this.b);
      }
   }
}
