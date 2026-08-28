import com.mojang.serialization.Codec;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public enum fte implements bag {
   a("uniform"),
   b("jp");

   public static final Codec<fte> c = bag.a(fte::values);
   private final String d;

   private fte(final String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }

   public static class a {
      private final Map<fte, Boolean> c;
      public static final Codec<fte.a> a = Codec.unboundedMap(fte.c, Codec.BOOL).xmap(fte.a::new, $$0 -> $$0.c);
      public static final fte.a b = new fte.a(Map.of());

      public a(Map<fte, Boolean> $$0) {
         this.c = $$0;
      }

      public boolean a(Set<fte> $$0) {
         for (Entry<fte, Boolean> $$1 : this.c.entrySet()) {
            if ($$0.contains($$1.getKey()) != $$1.getValue()) {
               return false;
            }
         }

         return true;
      }

      public fte.a a(fte.a $$0) {
         Map<fte, Boolean> $$1 = new HashMap<>($$0.c);
         $$1.putAll(this.c);
         return new fte.a(Map.copyOf($$1));
      }
   }
}
