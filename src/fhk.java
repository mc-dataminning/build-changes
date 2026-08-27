import com.mojang.serialization.Codec;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public enum fhk implements ayq {
   a("uniform"),
   b("jp");

   public static final Codec<fhk> c = ayq.a(fhk::values);
   private final String d;

   private fhk(String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }

   public static class a {
      private final Map<fhk, Boolean> c;
      public static final Codec<fhk.a> a = Codec.unboundedMap(fhk.c, Codec.BOOL).xmap(fhk.a::new, $$0 -> $$0.c);
      public static final fhk.a b = new fhk.a(Map.of());

      public a(Map<fhk, Boolean> $$0) {
         this.c = $$0;
      }

      public boolean a(Set<fhk> $$0) {
         for (Entry<fhk, Boolean> $$1 : this.c.entrySet()) {
            if ($$0.contains($$1.getKey()) != $$1.getValue()) {
               return false;
            }
         }

         return true;
      }

      public fhk.a a(fhk.a $$0) {
         Map<fhk, Boolean> $$1 = new HashMap<>($$0.c);
         $$1.putAll(this.c);
         return new fhk.a(Map.copyOf($$1));
      }
   }
}
