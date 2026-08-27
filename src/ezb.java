import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import org.apache.commons.compress.utils.Lists;

public record ezb(float a, boolean b, Map<String, List<eza>> c) {
   public static class a {
      private final float a;
      private final Map<String, List<eza>> b = Maps.newHashMap();
      private boolean c;

      public static ezb.a a(float $$0) {
         return new ezb.a($$0);
      }

      private a(float $$0) {
         this.a = $$0;
      }

      public ezb.a a() {
         this.c = true;
         return this;
      }

      public ezb.a a(String $$0, eza $$1) {
         this.b.computeIfAbsent($$0, $$0x -> Lists.newArrayList()).add($$1);
         return this;
      }

      public ezb b() {
         return new ezb(this.a, this.c, this.b);
      }
   }
}
