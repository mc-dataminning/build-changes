import com.mojang.serialization.Codec;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public enum frk implements azv {
   a("uniform"),
   b("jp");

   public static final Codec<frk> c = azv.a(frk::values);
   private final String d;

   private frk(final String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }

   public static class a {
      private final Map<frk, Boolean> c;
      public static final Codec<frk.a> a = Codec.unboundedMap(frk.c, Codec.BOOL).xmap(frk.a::new, $$0 -> $$0.c);
      public static final frk.a b = new frk.a(Map.of());

      public a(Map<frk, Boolean> $$0) {
         this.c = $$0;
      }

      public boolean a(Set<frk> $$0) {
         for (Entry<frk, Boolean> $$1 : this.c.entrySet()) {
            if ($$0.contains($$1.getKey()) != $$1.getValue()) {
               return false;
            }
         }

         return true;
      }

      public frk.a a(frk.a $$0) {
         Map<frk, Boolean> $$1 = new HashMap<>($$0.c);
         $$1.putAll(this.c);
         return new frk.a(Map.copyOf($$1));
      }
   }
}
