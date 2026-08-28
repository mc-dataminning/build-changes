import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public record fhb(float a, boolean b, Map<String, List<fha>> c) {
   public static class a {
      private final float a;
      private final Map<String, List<fha>> b = Maps.newHashMap();
      private boolean c;

      public static fhb.a a(float $$0) {
         return new fhb.a($$0);
      }

      private a(float $$0) {
         this.a = $$0;
      }

      public fhb.a a() {
         this.c = true;
         return this;
      }

      public fhb.a a(String $$0, fha $$1) {
         this.b.computeIfAbsent($$0, $$0x -> new ArrayList<>()).add($$1);
         return this;
      }

      public fhb b() {
         return new fhb(this.a, this.c, this.b);
      }
   }
}
