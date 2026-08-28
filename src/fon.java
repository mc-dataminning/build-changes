import com.mojang.serialization.Codec;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public enum fon implements baj {
   a("uniform"),
   b("jp");

   public static final Codec<fon> c = baj.a(fon::values);
   private final String d;

   private fon(final String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }

   public static class a {
      private final Map<fon, Boolean> c;
      public static final Codec<fon.a> a = Codec.unboundedMap(fon.c, Codec.BOOL).xmap(fon.a::new, $$0 -> $$0.c);
      public static final fon.a b = new fon.a(Map.of());

      public a(Map<fon, Boolean> $$0) {
         this.c = $$0;
      }

      public boolean a(Set<fon> $$0) {
         for (Entry<fon, Boolean> $$1 : this.c.entrySet()) {
            if ($$0.contains($$1.getKey()) != $$1.getValue()) {
               return false;
            }
         }

         return true;
      }

      public fon.a a(fon.a $$0) {
         Map<fon, Boolean> $$1 = new HashMap<>($$0.c);
         $$1.putAll(this.c);
         return new fon.a(Map.copyOf($$1));
      }
   }
}
