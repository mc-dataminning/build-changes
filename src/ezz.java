import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import org.apache.commons.compress.utils.Lists;

public record ezz(float a, boolean b, Map<String, List<ezy>> c) {
   public static class a {
      private final float a;
      private final Map<String, List<ezy>> b = Maps.newHashMap();
      private boolean c;

      public static ezz.a a(float $$0) {
         return new ezz.a($$0);
      }

      private a(float $$0) {
         this.a = $$0;
      }

      public ezz.a a() {
         this.c = true;
         return this;
      }

      public ezz.a a(String $$0, ezy $$1) {
         this.b.computeIfAbsent($$0, $$0x -> Lists.newArrayList()).add($$1);
         return this;
      }

      public ezz b() {
         return new ezz(this.a, this.c, this.b);
      }
   }
}
