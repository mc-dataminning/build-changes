import com.mojang.serialization.Codec;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public enum fkw implements azj {
   a("uniform"),
   b("jp");

   public static final Codec<fkw> c = azj.a(fkw::values);
   private final String d;

   private fkw(final String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }

   public static class a {
      private final Map<fkw, Boolean> c;
      public static final Codec<fkw.a> a = Codec.unboundedMap(fkw.c, Codec.BOOL).xmap(fkw.a::new, $$0 -> $$0.c);
      public static final fkw.a b = new fkw.a(Map.of());

      public a(Map<fkw, Boolean> $$0) {
         this.c = $$0;
      }

      public boolean a(Set<fkw> $$0) {
         for (Entry<fkw, Boolean> $$1 : this.c.entrySet()) {
            if ($$0.contains($$1.getKey()) != $$1.getValue()) {
               return false;
            }
         }

         return true;
      }

      public fkw.a a(fkw.a $$0) {
         Map<fkw, Boolean> $$1 = new HashMap<>($$0.c);
         $$1.putAll(this.c);
         return new fkw.a(Map.copyOf($$1));
      }
   }
}
