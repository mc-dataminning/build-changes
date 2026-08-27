import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import org.apache.commons.compress.utils.Lists;

public record ere(float a, boolean b, Map<String, List<erd>> c) {
   public static class a {
      private final float a;
      private final Map<String, List<erd>> b = Maps.newHashMap();
      private boolean c;

      public static ere.a a(float $$0) {
         return new ere.a($$0);
      }

      private a(float $$0) {
         this.a = $$0;
      }

      public ere.a a() {
         this.c = true;
         return this;
      }

      public ere.a a(String $$0, erd $$1) {
         this.b.computeIfAbsent($$0, $$0x -> Lists.newArrayList()).add($$1);
         return this;
      }

      public ere b() {
         return new ere(this.a, this.c, this.b);
      }
   }
}
