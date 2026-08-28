import com.mojang.serialization.Codec;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public enum fqx implements bba {
   a("uniform"),
   b("jp");

   public static final Codec<fqx> c = bba.a(fqx::values);
   private final String d;

   private fqx(final String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }

   public static class a {
      private final Map<fqx, Boolean> c;
      public static final Codec<fqx.a> a = Codec.unboundedMap(fqx.c, Codec.BOOL).xmap(fqx.a::new, $$0 -> $$0.c);
      public static final fqx.a b = new fqx.a(Map.of());

      public a(Map<fqx, Boolean> $$0) {
         this.c = $$0;
      }

      public boolean a(Set<fqx> $$0) {
         for (Entry<fqx, Boolean> $$1 : this.c.entrySet()) {
            if ($$0.contains($$1.getKey()) != $$1.getValue()) {
               return false;
            }
         }

         return true;
      }

      public fqx.a a(fqx.a $$0) {
         Map<fqx, Boolean> $$1 = new HashMap<>($$0.c);
         $$1.putAll(this.c);
         return new fqx.a(Map.copyOf($$1));
      }
   }
}
