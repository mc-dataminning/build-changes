import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import org.apache.commons.compress.utils.Lists;

public record ero(float a, boolean b, Map<String, List<ern>> c) {
   public static class a {
      private final float a;
      private final Map<String, List<ern>> b = Maps.newHashMap();
      private boolean c;

      public static ero.a a(float $$0) {
         return new ero.a($$0);
      }

      private a(float $$0) {
         this.a = $$0;
      }

      public ero.a a() {
         this.c = true;
         return this;
      }

      public ero.a a(String $$0, ern $$1) {
         this.b.computeIfAbsent($$0, $$0x -> Lists.newArrayList()).add($$1);
         return this;
      }

      public ero b() {
         return new ero(this.a, this.c, this.b);
      }
   }
}
