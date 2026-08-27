import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public record feq(float a, boolean b, Map<String, List<fep>> c) {
   public static class a {
      private final float a;
      private final Map<String, List<fep>> b = Maps.newHashMap();
      private boolean c;

      public static feq.a a(float $$0) {
         return new feq.a($$0);
      }

      private a(float $$0) {
         this.a = $$0;
      }

      public feq.a a() {
         this.c = true;
         return this;
      }

      public feq.a a(String $$0, fep $$1) {
         this.b.computeIfAbsent($$0, $$0x -> new ArrayList<>()).add($$1);
         return this;
      }

      public feq b() {
         return new feq(this.a, this.c, this.b);
      }
   }
}
