import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public record fqc(float a, boolean b, Map<String, List<fqb>> c) {
   public static class a {
      private final float a;
      private final Map<String, List<fqb>> b = Maps.newHashMap();
      private boolean c;

      public static fqc.a a(float $$0) {
         return new fqc.a($$0);
      }

      private a(float $$0) {
         this.a = $$0;
      }

      public fqc.a a() {
         this.c = true;
         return this;
      }

      public fqc.a a(String $$0, fqb $$1) {
         this.b.computeIfAbsent($$0, $$0x -> new ArrayList<>()).add($$1);
         return this;
      }

      public fqc b() {
         return new fqc(this.a, this.c, this.b);
      }
   }
}
