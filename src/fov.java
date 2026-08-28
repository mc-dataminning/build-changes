import com.mojang.serialization.Codec;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public enum fov implements bai {
   a("uniform"),
   b("jp");

   public static final Codec<fov> c = bai.a(fov::values);
   private final String d;

   private fov(final String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }

   public static class a {
      private final Map<fov, Boolean> c;
      public static final Codec<fov.a> a = Codec.unboundedMap(fov.c, Codec.BOOL).xmap(fov.a::new, $$0 -> $$0.c);
      public static final fov.a b = new fov.a(Map.of());

      public a(Map<fov, Boolean> $$0) {
         this.c = $$0;
      }

      public boolean a(Set<fov> $$0) {
         for (Entry<fov, Boolean> $$1 : this.c.entrySet()) {
            if ($$0.contains($$1.getKey()) != $$1.getValue()) {
               return false;
            }
         }

         return true;
      }

      public fov.a a(fov.a $$0) {
         Map<fov, Boolean> $$1 = new HashMap<>($$0.c);
         $$1.putAll(this.c);
         return new fov.a(Map.copyOf($$1));
      }
   }
}
