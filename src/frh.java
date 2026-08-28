import com.mojang.serialization.Codec;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public enum frh implements azu {
   a("uniform"),
   b("jp");

   public static final Codec<frh> c = azu.a(frh::values);
   private final String d;

   private frh(final String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }

   public static class a {
      private final Map<frh, Boolean> c;
      public static final Codec<frh.a> a = Codec.unboundedMap(frh.c, Codec.BOOL).xmap(frh.a::new, $$0 -> $$0.c);
      public static final frh.a b = new frh.a(Map.of());

      public a(Map<frh, Boolean> $$0) {
         this.c = $$0;
      }

      public boolean a(Set<frh> $$0) {
         for (Entry<frh, Boolean> $$1 : this.c.entrySet()) {
            if ($$0.contains($$1.getKey()) != $$1.getValue()) {
               return false;
            }
         }

         return true;
      }

      public frh.a a(frh.a $$0) {
         Map<frh, Boolean> $$1 = new HashMap<>($$0.c);
         $$1.putAll(this.c);
         return new frh.a(Map.copyOf($$1));
      }
   }
}
