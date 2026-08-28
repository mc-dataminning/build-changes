import com.mojang.serialization.Codec;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public enum fnq implements baf {
   a("uniform"),
   b("jp");

   public static final Codec<fnq> c = baf.a(fnq::values);
   private final String d;

   private fnq(final String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }

   public static class a {
      private final Map<fnq, Boolean> c;
      public static final Codec<fnq.a> a = Codec.unboundedMap(fnq.c, Codec.BOOL).xmap(fnq.a::new, $$0 -> $$0.c);
      public static final fnq.a b = new fnq.a(Map.of());

      public a(Map<fnq, Boolean> $$0) {
         this.c = $$0;
      }

      public boolean a(Set<fnq> $$0) {
         for (Entry<fnq, Boolean> $$1 : this.c.entrySet()) {
            if ($$0.contains($$1.getKey()) != $$1.getValue()) {
               return false;
            }
         }

         return true;
      }

      public fnq.a a(fnq.a $$0) {
         Map<fnq, Boolean> $$1 = new HashMap<>($$0.c);
         $$1.putAll(this.c);
         return new fnq.a(Map.copyOf($$1));
      }
   }
}
