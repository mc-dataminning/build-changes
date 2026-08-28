import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public record ffq(float a, boolean b, Map<String, List<ffp>> c) {
   public static class a {
      private final float a;
      private final Map<String, List<ffp>> b = Maps.newHashMap();
      private boolean c;

      public static ffq.a a(float $$0) {
         return new ffq.a($$0);
      }

      private a(float $$0) {
         this.a = $$0;
      }

      public ffq.a a() {
         this.c = true;
         return this;
      }

      public ffq.a a(String $$0, ffp $$1) {
         this.b.computeIfAbsent($$0, $$0x -> new ArrayList<>()).add($$1);
         return this;
      }

      public ffq b() {
         return new ffq(this.a, this.c, this.b);
      }
   }
}
