import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public record fkt(float a, boolean b, Map<String, List<fks>> c) {
   public static class a {
      private final float a;
      private final Map<String, List<fks>> b = Maps.newHashMap();
      private boolean c;

      public static fkt.a a(float $$0) {
         return new fkt.a($$0);
      }

      private a(float $$0) {
         this.a = $$0;
      }

      public fkt.a a() {
         this.c = true;
         return this;
      }

      public fkt.a a(String $$0, fks $$1) {
         this.b.computeIfAbsent($$0, $$0x -> new ArrayList<>()).add($$1);
         return this;
      }

      public fkt b() {
         return new fkt(this.a, this.c, this.b);
      }
   }
}
