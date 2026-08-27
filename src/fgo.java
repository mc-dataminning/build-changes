import com.mojang.serialization.Codec;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public enum fgo implements ayg {
   a("uniform"),
   b("jp");

   public static final Codec<fgo> c = ayg.a(fgo::values);
   private final String d;

   private fgo(String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }

   public static class a {
      private final Map<fgo, Boolean> c;
      public static final Codec<fgo.a> a = Codec.unboundedMap(fgo.c, Codec.BOOL).xmap(fgo.a::new, $$0 -> $$0.c);
      public static final fgo.a b = new fgo.a(Map.of());

      public a(Map<fgo, Boolean> $$0) {
         this.c = $$0;
      }

      public boolean a(Set<fgo> $$0) {
         for (Entry<fgo, Boolean> $$1 : this.c.entrySet()) {
            if ($$0.contains($$1.getKey()) != $$1.getValue()) {
               return false;
            }
         }

         return true;
      }

      public fgo.a a(fgo.a $$0) {
         Map<fgo, Boolean> $$1 = new HashMap<>($$0.c);
         $$1.putAll(this.c);
         return new fgo.a(Map.copyOf($$1));
      }
   }
}
