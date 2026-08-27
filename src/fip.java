import com.mojang.serialization.Codec;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public enum fip implements ayx {
   a("uniform"),
   b("jp");

   public static final Codec<fip> c = ayx.a(fip::values);
   private final String d;

   private fip(String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }

   public static class a {
      private final Map<fip, Boolean> c;
      public static final Codec<fip.a> a = Codec.unboundedMap(fip.c, Codec.BOOL).xmap(fip.a::new, $$0 -> $$0.c);
      public static final fip.a b = new fip.a(Map.of());

      public a(Map<fip, Boolean> $$0) {
         this.c = $$0;
      }

      public boolean a(Set<fip> $$0) {
         for (Entry<fip, Boolean> $$1 : this.c.entrySet()) {
            if ($$0.contains($$1.getKey()) != $$1.getValue()) {
               return false;
            }
         }

         return true;
      }

      public fip.a a(fip.a $$0) {
         Map<fip, Boolean> $$1 = new HashMap<>($$0.c);
         $$1.putAll(this.c);
         return new fip.a(Map.copyOf($$1));
      }
   }
}
