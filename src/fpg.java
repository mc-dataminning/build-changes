import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public record fpg(float a, boolean b, Map<String, List<fpf>> c) {
   public static class a {
      private final float a;
      private final Map<String, List<fpf>> b = Maps.newHashMap();
      private boolean c;

      public static fpg.a a(float $$0) {
         return new fpg.a($$0);
      }

      private a(float $$0) {
         this.a = $$0;
      }

      public fpg.a a() {
         this.c = true;
         return this;
      }

      public fpg.a a(String $$0, fpf $$1) {
         this.b.computeIfAbsent($$0, $$0x -> new ArrayList<>()).add($$1);
         return this;
      }

      public fpg b() {
         return new fpg(this.a, this.c, this.b);
      }
   }
}
