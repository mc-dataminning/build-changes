import com.mojang.serialization.Codec;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public enum fqq implements baq {
   a("uniform"),
   b("jp");

   public static final Codec<fqq> c = baq.a(fqq::values);
   private final String d;

   private fqq(final String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }

   public static class a {
      private final Map<fqq, Boolean> c;
      public static final Codec<fqq.a> a = Codec.unboundedMap(fqq.c, Codec.BOOL).xmap(fqq.a::new, $$0 -> $$0.c);
      public static final fqq.a b = new fqq.a(Map.of());

      public a(Map<fqq, Boolean> $$0) {
         this.c = $$0;
      }

      public boolean a(Set<fqq> $$0) {
         for (Entry<fqq, Boolean> $$1 : this.c.entrySet()) {
            if ($$0.contains($$1.getKey()) != $$1.getValue()) {
               return false;
            }
         }

         return true;
      }

      public fqq.a a(fqq.a $$0) {
         Map<fqq, Boolean> $$1 = new HashMap<>($$0.c);
         $$1.putAll(this.c);
         return new fqq.a(Map.copyOf($$1));
      }
   }
}
