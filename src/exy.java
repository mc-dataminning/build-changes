import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import org.apache.commons.compress.utils.Lists;

public record exy(float a, boolean b, Map<String, List<exx>> c) {
   public static class a {
      private final float a;
      private final Map<String, List<exx>> b = Maps.newHashMap();
      private boolean c;

      public static exy.a a(float $$0) {
         return new exy.a($$0);
      }

      private a(float $$0) {
         this.a = $$0;
      }

      public exy.a a() {
         this.c = true;
         return this;
      }

      public exy.a a(String $$0, exx $$1) {
         this.b.computeIfAbsent($$0, $$0x -> Lists.newArrayList()).add($$1);
         return this;
      }

      public exy b() {
         return new exy(this.a, this.c, this.b);
      }
   }
}
