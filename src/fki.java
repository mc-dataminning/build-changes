import com.mojang.serialization.Codec;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public enum fki implements azc {
   a("uniform"),
   b("jp");

   public static final Codec<fki> c = azc.a(fki::values);
   private final String d;

   private fki(final String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }

   public static class a {
      private final Map<fki, Boolean> c;
      public static final Codec<fki.a> a = Codec.unboundedMap(fki.c, Codec.BOOL).xmap(fki.a::new, $$0 -> $$0.c);
      public static final fki.a b = new fki.a(Map.of());

      public a(Map<fki, Boolean> $$0) {
         this.c = $$0;
      }

      public boolean a(Set<fki> $$0) {
         for (Entry<fki, Boolean> $$1 : this.c.entrySet()) {
            if ($$0.contains($$1.getKey()) != $$1.getValue()) {
               return false;
            }
         }

         return true;
      }

      public fki.a a(fki.a $$0) {
         Map<fki, Boolean> $$1 = new HashMap<>($$0.c);
         $$1.putAll(this.c);
         return new fki.a(Map.copyOf($$1));
      }
   }
}
