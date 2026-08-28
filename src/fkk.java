import com.mojang.serialization.Codec;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public enum fkk implements azc {
   a("uniform"),
   b("jp");

   public static final Codec<fkk> c = azc.a(fkk::values);
   private final String d;

   private fkk(final String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }

   public static class a {
      private final Map<fkk, Boolean> c;
      public static final Codec<fkk.a> a = Codec.unboundedMap(fkk.c, Codec.BOOL).xmap(fkk.a::new, $$0 -> $$0.c);
      public static final fkk.a b = new fkk.a(Map.of());

      public a(Map<fkk, Boolean> $$0) {
         this.c = $$0;
      }

      public boolean a(Set<fkk> $$0) {
         for (Entry<fkk, Boolean> $$1 : this.c.entrySet()) {
            if ($$0.contains($$1.getKey()) != $$1.getValue()) {
               return false;
            }
         }

         return true;
      }

      public fkk.a a(fkk.a $$0) {
         Map<fkk, Boolean> $$1 = new HashMap<>($$0.c);
         $$1.putAll(this.c);
         return new fkk.a(Map.copyOf($$1));
      }
   }
}
