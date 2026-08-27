import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import org.apache.commons.compress.utils.Lists;

public record etu(float a, boolean b, Map<String, List<ett>> c) {
   public static class a {
      private final float a;
      private final Map<String, List<ett>> b = Maps.newHashMap();
      private boolean c;

      public static etu.a a(float $$0) {
         return new etu.a($$0);
      }

      private a(float $$0) {
         this.a = $$0;
      }

      public etu.a a() {
         this.c = true;
         return this;
      }

      public etu.a a(String $$0, ett $$1) {
         this.b.computeIfAbsent($$0, $$0x -> Lists.newArrayList()).add($$1);
         return this;
      }

      public etu b() {
         return new etu(this.a, this.c, this.b);
      }
   }
}
