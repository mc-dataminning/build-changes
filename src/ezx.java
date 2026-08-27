import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import org.apache.commons.compress.utils.Lists;

public record ezx(float a, boolean b, Map<String, List<ezw>> c) {
   public static class a {
      private final float a;
      private final Map<String, List<ezw>> b = Maps.newHashMap();
      private boolean c;

      public static ezx.a a(float $$0) {
         return new ezx.a($$0);
      }

      private a(float $$0) {
         this.a = $$0;
      }

      public ezx.a a() {
         this.c = true;
         return this;
      }

      public ezx.a a(String $$0, ezw $$1) {
         this.b.computeIfAbsent($$0, $$0x -> Lists.newArrayList()).add($$1);
         return this;
      }

      public ezx b() {
         return new ezx(this.a, this.c, this.b);
      }
   }
}
