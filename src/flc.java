import com.mojang.serialization.Codec;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public enum flc implements azk {
   a("uniform"),
   b("jp");

   public static final Codec<flc> c = azk.a(flc::values);
   private final String d;

   private flc(final String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }

   public static class a {
      private final Map<flc, Boolean> c;
      public static final Codec<flc.a> a = Codec.unboundedMap(flc.c, Codec.BOOL).xmap(flc.a::new, $$0 -> $$0.c);
      public static final flc.a b = new flc.a(Map.of());

      public a(Map<flc, Boolean> $$0) {
         this.c = $$0;
      }

      public boolean a(Set<flc> $$0) {
         for (Entry<flc, Boolean> $$1 : this.c.entrySet()) {
            if ($$0.contains($$1.getKey()) != $$1.getValue()) {
               return false;
            }
         }

         return true;
      }

      public flc.a a(flc.a $$0) {
         Map<flc, Boolean> $$1 = new HashMap<>($$0.c);
         $$1.putAll(this.c);
         return new flc.a(Map.copyOf($$1));
      }
   }
}
