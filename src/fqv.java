import com.mojang.serialization.Codec;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public enum fqv implements bba {
   a("uniform"),
   b("jp");

   public static final Codec<fqv> c = bba.a(fqv::values);
   private final String d;

   private fqv(final String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }

   public static class a {
      private final Map<fqv, Boolean> c;
      public static final Codec<fqv.a> a = Codec.unboundedMap(fqv.c, Codec.BOOL).xmap(fqv.a::new, $$0 -> $$0.c);
      public static final fqv.a b = new fqv.a(Map.of());

      public a(Map<fqv, Boolean> $$0) {
         this.c = $$0;
      }

      public boolean a(Set<fqv> $$0) {
         for (Entry<fqv, Boolean> $$1 : this.c.entrySet()) {
            if ($$0.contains($$1.getKey()) != $$1.getValue()) {
               return false;
            }
         }

         return true;
      }

      public fqv.a a(fqv.a $$0) {
         Map<fqv, Boolean> $$1 = new HashMap<>($$0.c);
         $$1.putAll(this.c);
         return new fqv.a(Map.copyOf($$1));
      }
   }
}
