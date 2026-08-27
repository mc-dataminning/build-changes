import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import org.apache.commons.compress.utils.Lists;

public record erg(float a, boolean b, Map<String, List<erf>> c) {
   public static class a {
      private final float a;
      private final Map<String, List<erf>> b = Maps.newHashMap();
      private boolean c;

      public static erg.a a(float $$0) {
         return new erg.a($$0);
      }

      private a(float $$0) {
         this.a = $$0;
      }

      public erg.a a() {
         this.c = true;
         return this;
      }

      public erg.a a(String $$0, erf $$1) {
         this.b.computeIfAbsent($$0, $$0x -> Lists.newArrayList()).add($$1);
         return this;
      }

      public erg b() {
         return new erg(this.a, this.c, this.b);
      }
   }
}
