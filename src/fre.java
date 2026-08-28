import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public record fre(float a, boolean b, Map<String, List<frd>> c) {
   public static class a {
      private final float a;
      private final Map<String, List<frd>> b = Maps.newHashMap();
      private boolean c;

      public static fre.a a(float $$0) {
         return new fre.a($$0);
      }

      private a(float $$0) {
         this.a = $$0;
      }

      public fre.a a() {
         this.c = true;
         return this;
      }

      public fre.a a(String $$0, frd $$1) {
         this.b.computeIfAbsent($$0, $$0x -> new ArrayList<>()).add($$1);
         return this;
      }

      public fre b() {
         return new fre(this.a, this.c, this.b);
      }
   }
}
