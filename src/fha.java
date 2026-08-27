import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public record fha(float a, boolean b, Map<String, List<fgz>> c) {
   public static class a {
      private final float a;
      private final Map<String, List<fgz>> b = Maps.newHashMap();
      private boolean c;

      public static fha.a a(float $$0) {
         return new fha.a($$0);
      }

      private a(float $$0) {
         this.a = $$0;
      }

      public fha.a a() {
         this.c = true;
         return this;
      }

      public fha.a a(String $$0, fgz $$1) {
         this.b.computeIfAbsent($$0, $$0x -> new ArrayList<>()).add($$1);
         return this;
      }

      public fha b() {
         return new fha(this.a, this.c, this.b);
      }
   }
}
