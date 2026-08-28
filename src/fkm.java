import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public record fkm(float a, boolean b, Map<String, List<fkl>> c) {
   public static class a {
      private final float a;
      private final Map<String, List<fkl>> b = Maps.newHashMap();
      private boolean c;

      public static fkm.a a(float $$0) {
         return new fkm.a($$0);
      }

      private a(float $$0) {
         this.a = $$0;
      }

      public fkm.a a() {
         this.c = true;
         return this;
      }

      public fkm.a a(String $$0, fkl $$1) {
         this.b.computeIfAbsent($$0, $$0x -> new ArrayList<>()).add($$1);
         return this;
      }

      public fkm b() {
         return new fkm(this.a, this.c, this.b);
      }
   }
}
