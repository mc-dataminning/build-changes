import com.mojang.serialization.Codec;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public enum fnb implements azz {
   a("uniform"),
   b("jp");

   public static final Codec<fnb> c = azz.a(fnb::values);
   private final String d;

   private fnb(final String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }

   public static class a {
      private final Map<fnb, Boolean> c;
      public static final Codec<fnb.a> a = Codec.unboundedMap(fnb.c, Codec.BOOL).xmap(fnb.a::new, $$0 -> $$0.c);
      public static final fnb.a b = new fnb.a(Map.of());

      public a(Map<fnb, Boolean> $$0) {
         this.c = $$0;
      }

      public boolean a(Set<fnb> $$0) {
         for (Entry<fnb, Boolean> $$1 : this.c.entrySet()) {
            if ($$0.contains($$1.getKey()) != $$1.getValue()) {
               return false;
            }
         }

         return true;
      }

      public fnb.a a(fnb.a $$0) {
         Map<fnb, Boolean> $$1 = new HashMap<>($$0.c);
         $$1.putAll(this.c);
         return new fnb.a(Map.copyOf($$1));
      }
   }
}
