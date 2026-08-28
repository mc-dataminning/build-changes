import com.mojang.serialization.Codec;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public enum fjv implements azu {
   a("uniform"),
   b("jp");

   public static final Codec<fjv> c = azu.a(fjv::values);
   private final String d;

   private fjv(final String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }

   public static class a {
      private final Map<fjv, Boolean> c;
      public static final Codec<fjv.a> a = Codec.unboundedMap(fjv.c, Codec.BOOL).xmap(fjv.a::new, $$0 -> $$0.c);
      public static final fjv.a b = new fjv.a(Map.of());

      public a(Map<fjv, Boolean> $$0) {
         this.c = $$0;
      }

      public boolean a(Set<fjv> $$0) {
         for (Entry<fjv, Boolean> $$1 : this.c.entrySet()) {
            if ($$0.contains($$1.getKey()) != $$1.getValue()) {
               return false;
            }
         }

         return true;
      }

      public fjv.a a(fjv.a $$0) {
         Map<fjv, Boolean> $$1 = new HashMap<>($$0.c);
         $$1.putAll(this.c);
         return new fjv.a(Map.copyOf($$1));
      }
   }
}
