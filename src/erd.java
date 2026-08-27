import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import org.apache.commons.compress.utils.Lists;

public record erd(float a, boolean b, Map<String, List<erc>> c) {
   public static class a {
      private final float a;
      private final Map<String, List<erc>> b = Maps.newHashMap();
      private boolean c;

      public static erd.a a(float $$0) {
         return new erd.a($$0);
      }

      private a(float $$0) {
         this.a = $$0;
      }

      public erd.a a() {
         this.c = true;
         return this;
      }

      public erd.a a(String $$0, erc $$1) {
         this.b.computeIfAbsent($$0, $$0x -> Lists.newArrayList()).add($$1);
         return this;
      }

      public erd b() {
         return new erd(this.a, this.c, this.b);
      }
   }
}
