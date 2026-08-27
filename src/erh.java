import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import org.apache.commons.compress.utils.Lists;

public record erh(float a, boolean b, Map<String, List<erg>> c) {
   public static class a {
      private final float a;
      private final Map<String, List<erg>> b = Maps.newHashMap();
      private boolean c;

      public static erh.a a(float $$0) {
         return new erh.a($$0);
      }

      private a(float $$0) {
         this.a = $$0;
      }

      public erh.a a() {
         this.c = true;
         return this;
      }

      public erh.a a(String $$0, erg $$1) {
         this.b.computeIfAbsent($$0, $$0x -> Lists.newArrayList()).add($$1);
         return this;
      }

      public erh b() {
         return new erh(this.a, this.c, this.b);
      }
   }
}
