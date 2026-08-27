import com.mojang.serialization.Codec;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public enum fld implements azg {
   a("uniform"),
   b("jp");

   public static final Codec<fld> c = azg.a(fld::values);
   private final String d;

   private fld(String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }

   public static class a {
      private final Map<fld, Boolean> c;
      public static final Codec<fld.a> a = Codec.unboundedMap(fld.c, Codec.BOOL).xmap(fld.a::new, $$0 -> $$0.c);
      public static final fld.a b = new fld.a(Map.of());

      public a(Map<fld, Boolean> $$0) {
         this.c = $$0;
      }

      public boolean a(Set<fld> $$0) {
         for (Entry<fld, Boolean> $$1 : this.c.entrySet()) {
            if ($$0.contains($$1.getKey()) != $$1.getValue()) {
               return false;
            }
         }

         return true;
      }

      public fld.a a(fld.a $$0) {
         Map<fld, Boolean> $$1 = new HashMap<>($$0.c);
         $$1.putAll(this.c);
         return new fld.a(Map.copyOf($$1));
      }
   }
}
