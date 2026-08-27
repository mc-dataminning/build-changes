import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import org.apache.commons.compress.utils.Lists;

public record erc(float a, boolean b, Map<String, List<erb>> c) {
   public static class a {
      private final float a;
      private final Map<String, List<erb>> b = Maps.newHashMap();
      private boolean c;

      public static erc.a a(float $$0) {
         return new erc.a($$0);
      }

      private a(float $$0) {
         this.a = $$0;
      }

      public erc.a a() {
         this.c = true;
         return this;
      }

      public erc.a a(String $$0, erb $$1) {
         this.b.computeIfAbsent($$0, $$0x -> Lists.newArrayList()).add($$1);
         return this;
      }

      public erc b() {
         return new erc(this.a, this.c, this.b);
      }
   }
}
