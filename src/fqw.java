import com.mojang.serialization.Codec;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public enum fqw implements bba {
   a("uniform"),
   b("jp");

   public static final Codec<fqw> c = bba.a(fqw::values);
   private final String d;

   private fqw(final String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }

   public static class a {
      private final Map<fqw, Boolean> c;
      public static final Codec<fqw.a> a = Codec.unboundedMap(fqw.c, Codec.BOOL).xmap(fqw.a::new, $$0 -> $$0.c);
      public static final fqw.a b = new fqw.a(Map.of());

      public a(Map<fqw, Boolean> $$0) {
         this.c = $$0;
      }

      public boolean a(Set<fqw> $$0) {
         for (Entry<fqw, Boolean> $$1 : this.c.entrySet()) {
            if ($$0.contains($$1.getKey()) != $$1.getValue()) {
               return false;
            }
         }

         return true;
      }

      public fqw.a a(fqw.a $$0) {
         Map<fqw, Boolean> $$1 = new HashMap<>($$0.c);
         $$1.putAll(this.c);
         return new fqw.a(Map.copyOf($$1));
      }
   }
}
