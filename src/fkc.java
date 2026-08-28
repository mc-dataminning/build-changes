import com.mojang.serialization.Codec;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public enum fkc implements ayz {
   a("uniform"),
   b("jp");

   public static final Codec<fkc> c = ayz.a(fkc::values);
   private final String d;

   private fkc(final String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }

   public static class a {
      private final Map<fkc, Boolean> c;
      public static final Codec<fkc.a> a = Codec.unboundedMap(fkc.c, Codec.BOOL).xmap(fkc.a::new, $$0 -> $$0.c);
      public static final fkc.a b = new fkc.a(Map.of());

      public a(Map<fkc, Boolean> $$0) {
         this.c = $$0;
      }

      public boolean a(Set<fkc> $$0) {
         for (Entry<fkc, Boolean> $$1 : this.c.entrySet()) {
            if ($$0.contains($$1.getKey()) != $$1.getValue()) {
               return false;
            }
         }

         return true;
      }

      public fkc.a a(fkc.a $$0) {
         Map<fkc, Boolean> $$1 = new HashMap<>($$0.c);
         $$1.putAll(this.c);
         return new fkc.a(Map.copyOf($$1));
      }
   }
}
