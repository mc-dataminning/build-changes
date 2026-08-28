import com.mojang.serialization.Codec;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public enum fny implements bag {
   a("uniform"),
   b("jp");

   public static final Codec<fny> c = bag.a(fny::values);
   private final String d;

   private fny(final String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }

   public static class a {
      private final Map<fny, Boolean> c;
      public static final Codec<fny.a> a = Codec.unboundedMap(fny.c, Codec.BOOL).xmap(fny.a::new, $$0 -> $$0.c);
      public static final fny.a b = new fny.a(Map.of());

      public a(Map<fny, Boolean> $$0) {
         this.c = $$0;
      }

      public boolean a(Set<fny> $$0) {
         for (Entry<fny, Boolean> $$1 : this.c.entrySet()) {
            if ($$0.contains($$1.getKey()) != $$1.getValue()) {
               return false;
            }
         }

         return true;
      }

      public fny.a a(fny.a $$0) {
         Map<fny, Boolean> $$1 = new HashMap<>($$0.c);
         $$1.putAll(this.c);
         return new fny.a(Map.copyOf($$1));
      }
   }
}
