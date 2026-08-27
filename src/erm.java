import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import org.apache.commons.compress.utils.Lists;

public record erm(float a, boolean b, Map<String, List<erl>> c) {
   public static class a {
      private final float a;
      private final Map<String, List<erl>> b = Maps.newHashMap();
      private boolean c;

      public static erm.a a(float $$0) {
         return new erm.a($$0);
      }

      private a(float $$0) {
         this.a = $$0;
      }

      public erm.a a() {
         this.c = true;
         return this;
      }

      public erm.a a(String $$0, erl $$1) {
         this.b.computeIfAbsent($$0, $$0x -> Lists.newArrayList()).add($$1);
         return this;
      }

      public erm b() {
         return new erm(this.a, this.c, this.b);
      }
   }
}
