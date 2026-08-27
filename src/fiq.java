import com.mojang.serialization.Codec;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public enum fiq implements ayz {
   a("uniform"),
   b("jp");

   public static final Codec<fiq> c = ayz.a(fiq::values);
   private final String d;

   private fiq(String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }

   public static class a {
      private final Map<fiq, Boolean> c;
      public static final Codec<fiq.a> a = Codec.unboundedMap(fiq.c, Codec.BOOL).xmap(fiq.a::new, $$0 -> $$0.c);
      public static final fiq.a b = new fiq.a(Map.of());

      public a(Map<fiq, Boolean> $$0) {
         this.c = $$0;
      }

      public boolean a(Set<fiq> $$0) {
         for (Entry<fiq, Boolean> $$1 : this.c.entrySet()) {
            if ($$0.contains($$1.getKey()) != $$1.getValue()) {
               return false;
            }
         }

         return true;
      }

      public fiq.a a(fiq.a $$0) {
         Map<fiq, Boolean> $$1 = new HashMap<>($$0.c);
         $$1.putAll(this.c);
         return new fiq.a(Map.copyOf($$1));
      }
   }
}
