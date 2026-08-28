import com.mojang.serialization.Codec;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public enum fjp implements azp {
   a("uniform"),
   b("jp");

   public static final Codec<fjp> c = azp.a(fjp::values);
   private final String d;

   private fjp(final String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }

   public static class a {
      private final Map<fjp, Boolean> c;
      public static final Codec<fjp.a> a = Codec.unboundedMap(fjp.c, Codec.BOOL).xmap(fjp.a::new, $$0 -> $$0.c);
      public static final fjp.a b = new fjp.a(Map.of());

      public a(Map<fjp, Boolean> $$0) {
         this.c = $$0;
      }

      public boolean a(Set<fjp> $$0) {
         for (Entry<fjp, Boolean> $$1 : this.c.entrySet()) {
            if ($$0.contains($$1.getKey()) != $$1.getValue()) {
               return false;
            }
         }

         return true;
      }

      public fjp.a a(fjp.a $$0) {
         Map<fjp, Boolean> $$1 = new HashMap<>($$0.c);
         $$1.putAll(this.c);
         return new fjp.a(Map.copyOf($$1));
      }
   }
}
