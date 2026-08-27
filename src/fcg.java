import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public record fcg(float a, boolean b, Map<String, List<fcf>> c) {
   public static class a {
      private final float a;
      private final Map<String, List<fcf>> b = Maps.newHashMap();
      private boolean c;

      public static fcg.a a(float $$0) {
         return new fcg.a($$0);
      }

      private a(float $$0) {
         this.a = $$0;
      }

      public fcg.a a() {
         this.c = true;
         return this;
      }

      public fcg.a a(String $$0, fcf $$1) {
         this.b.computeIfAbsent($$0, $$0x -> new ArrayList<>()).add($$1);
         return this;
      }

      public fcg b() {
         return new fcg(this.a, this.c, this.b);
      }
   }
}
