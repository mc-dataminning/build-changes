import com.mojang.serialization.Codec;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public enum fju implements azu {
   a("uniform"),
   b("jp");

   public static final Codec<fju> c = azu.a(fju::values);
   private final String d;

   private fju(final String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }

   public static class a {
      private final Map<fju, Boolean> c;
      public static final Codec<fju.a> a = Codec.unboundedMap(fju.c, Codec.BOOL).xmap(fju.a::new, $$0 -> $$0.c);
      public static final fju.a b = new fju.a(Map.of());

      public a(Map<fju, Boolean> $$0) {
         this.c = $$0;
      }

      public boolean a(Set<fju> $$0) {
         for (Entry<fju, Boolean> $$1 : this.c.entrySet()) {
            if ($$0.contains($$1.getKey()) != $$1.getValue()) {
               return false;
            }
         }

         return true;
      }

      public fju.a a(fju.a $$0) {
         Map<fju, Boolean> $$1 = new HashMap<>($$0.c);
         $$1.putAll(this.c);
         return new fju.a(Map.copyOf($$1));
      }
   }
}
