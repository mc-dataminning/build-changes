import com.mojang.serialization.Codec;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public enum frj implements azv {
   a("uniform"),
   b("jp");

   public static final Codec<frj> c = azv.a(frj::values);
   private final String d;

   private frj(final String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }

   public static class a {
      private final Map<frj, Boolean> c;
      public static final Codec<frj.a> a = Codec.unboundedMap(frj.c, Codec.BOOL).xmap(frj.a::new, $$0 -> $$0.c);
      public static final frj.a b = new frj.a(Map.of());

      public a(Map<frj, Boolean> $$0) {
         this.c = $$0;
      }

      public boolean a(Set<frj> $$0) {
         for (Entry<frj, Boolean> $$1 : this.c.entrySet()) {
            if ($$0.contains($$1.getKey()) != $$1.getValue()) {
               return false;
            }
         }

         return true;
      }

      public frj.a a(frj.a $$0) {
         Map<frj, Boolean> $$1 = new HashMap<>($$0.c);
         $$1.putAll(this.c);
         return new frj.a(Map.copyOf($$1));
      }
   }
}
