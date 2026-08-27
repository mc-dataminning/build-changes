import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import org.apache.commons.compress.utils.Lists;

public record evy(float a, boolean b, Map<String, List<evx>> c) {
   public static class a {
      private final float a;
      private final Map<String, List<evx>> b = Maps.newHashMap();
      private boolean c;

      public static evy.a a(float $$0) {
         return new evy.a($$0);
      }

      private a(float $$0) {
         this.a = $$0;
      }

      public evy.a a() {
         this.c = true;
         return this;
      }

      public evy.a a(String $$0, evx $$1) {
         this.b.computeIfAbsent($$0, $$0x -> Lists.newArrayList()).add($$1);
         return this;
      }

      public evy b() {
         return new evy(this.a, this.c, this.b);
      }
   }
}
