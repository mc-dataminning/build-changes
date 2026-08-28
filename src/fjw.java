import com.mojang.serialization.Codec;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public enum fjw implements azu {
   a("uniform"),
   b("jp");

   public static final Codec<fjw> c = azu.a(fjw::values);
   private final String d;

   private fjw(final String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }

   public static class a {
      private final Map<fjw, Boolean> c;
      public static final Codec<fjw.a> a = Codec.unboundedMap(fjw.c, Codec.BOOL).xmap(fjw.a::new, $$0 -> $$0.c);
      public static final fjw.a b = new fjw.a(Map.of());

      public a(Map<fjw, Boolean> $$0) {
         this.c = $$0;
      }

      public boolean a(Set<fjw> $$0) {
         for (Entry<fjw, Boolean> $$1 : this.c.entrySet()) {
            if ($$0.contains($$1.getKey()) != $$1.getValue()) {
               return false;
            }
         }

         return true;
      }

      public fjw.a a(fjw.a $$0) {
         Map<fjw, Boolean> $$1 = new HashMap<>($$0.c);
         $$1.putAll(this.c);
         return new fjw.a(Map.copyOf($$1));
      }
   }
}
