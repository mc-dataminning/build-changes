import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public record fdv(float a, boolean b, Map<String, List<fdu>> c) {
   public static class a {
      private final float a;
      private final Map<String, List<fdu>> b = Maps.newHashMap();
      private boolean c;

      public static fdv.a a(float $$0) {
         return new fdv.a($$0);
      }

      private a(float $$0) {
         this.a = $$0;
      }

      public fdv.a a() {
         this.c = true;
         return this;
      }

      public fdv.a a(String $$0, fdu $$1) {
         this.b.computeIfAbsent($$0, $$0x -> new ArrayList<>()).add($$1);
         return this;
      }

      public fdv b() {
         return new fdv(this.a, this.c, this.b);
      }
   }
}
