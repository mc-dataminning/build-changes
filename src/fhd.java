import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public record fhd(float a, boolean b, Map<String, List<fhc>> c) {
   public static class a {
      private final float a;
      private final Map<String, List<fhc>> b = Maps.newHashMap();
      private boolean c;

      public static fhd.a a(float $$0) {
         return new fhd.a($$0);
      }

      private a(float $$0) {
         this.a = $$0;
      }

      public fhd.a a() {
         this.c = true;
         return this;
      }

      public fhd.a a(String $$0, fhc $$1) {
         this.b.computeIfAbsent($$0, $$0x -> new ArrayList<>()).add($$1);
         return this;
      }

      public fhd b() {
         return new fhd(this.a, this.c, this.b);
      }
   }
}
