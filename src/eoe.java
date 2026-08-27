import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import org.apache.commons.compress.utils.Lists;

public record eoe(float a, boolean b, Map<String, List<eod>> c) {
   public static class a {
      private final float a;
      private final Map<String, List<eod>> b = Maps.newHashMap();
      private boolean c;

      public static eoe.a a(float $$0) {
         return new eoe.a($$0);
      }

      private a(float $$0) {
         this.a = $$0;
      }

      public eoe.a a() {
         this.c = true;
         return this;
      }

      public eoe.a a(String $$0, eod $$1) {
         this.b.computeIfAbsent($$0, $$0x -> Lists.newArrayList()).add($$1);
         return this;
      }

      public eoe b() {
         return new eoe(this.a, this.c, this.b);
      }
   }
}
