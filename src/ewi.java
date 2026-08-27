import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import org.apache.commons.compress.utils.Lists;

public record ewi(float a, boolean b, Map<String, List<ewh>> c) {
   public static class a {
      private final float a;
      private final Map<String, List<ewh>> b = Maps.newHashMap();
      private boolean c;

      public static ewi.a a(float $$0) {
         return new ewi.a($$0);
      }

      private a(float $$0) {
         this.a = $$0;
      }

      public ewi.a a() {
         this.c = true;
         return this;
      }

      public ewi.a a(String $$0, ewh $$1) {
         this.b.computeIfAbsent($$0, $$0x -> Lists.newArrayList()).add($$1);
         return this;
      }

      public ewi b() {
         return new ewi(this.a, this.c, this.b);
      }
   }
}
