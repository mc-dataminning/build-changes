import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public record fdl(float a, boolean b, Map<String, List<fdk>> c) {
   public static class a {
      private final float a;
      private final Map<String, List<fdk>> b = Maps.newHashMap();
      private boolean c;

      public static fdl.a a(float $$0) {
         return new fdl.a($$0);
      }

      private a(float $$0) {
         this.a = $$0;
      }

      public fdl.a a() {
         this.c = true;
         return this;
      }

      public fdl.a a(String $$0, fdk $$1) {
         this.b.computeIfAbsent($$0, $$0x -> new ArrayList<>()).add($$1);
         return this;
      }

      public fdl b() {
         return new fdl(this.a, this.c, this.b);
      }
   }
}
