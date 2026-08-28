import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public record fou(float a, boolean b, Map<String, List<fot>> c) {
   public static class a {
      private final float a;
      private final Map<String, List<fot>> b = Maps.newHashMap();
      private boolean c;

      public static fou.a a(float $$0) {
         return new fou.a($$0);
      }

      private a(float $$0) {
         this.a = $$0;
      }

      public fou.a a() {
         this.c = true;
         return this;
      }

      public fou.a a(String $$0, fot $$1) {
         this.b.computeIfAbsent($$0, $$0x -> new ArrayList<>()).add($$1);
         return this;
      }

      public fou b() {
         return new fou(this.a, this.c, this.b);
      }
   }
}
