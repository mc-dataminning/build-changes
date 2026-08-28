import com.mojang.serialization.Codec;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public enum fnf implements bab {
   a("uniform"),
   b("jp");

   public static final Codec<fnf> c = bab.a(fnf::values);
   private final String d;

   private fnf(final String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }

   public static class a {
      private final Map<fnf, Boolean> c;
      public static final Codec<fnf.a> a = Codec.unboundedMap(fnf.c, Codec.BOOL).xmap(fnf.a::new, $$0 -> $$0.c);
      public static final fnf.a b = new fnf.a(Map.of());

      public a(Map<fnf, Boolean> $$0) {
         this.c = $$0;
      }

      public boolean a(Set<fnf> $$0) {
         for (Entry<fnf, Boolean> $$1 : this.c.entrySet()) {
            if ($$0.contains($$1.getKey()) != $$1.getValue()) {
               return false;
            }
         }

         return true;
      }

      public fnf.a a(fnf.a $$0) {
         Map<fnf, Boolean> $$1 = new HashMap<>($$0.c);
         $$1.putAll(this.c);
         return new fnf.a(Map.copyOf($$1));
      }
   }
}
