import com.mojang.serialization.Codec;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public enum fmr implements azy {
   a("uniform"),
   b("jp");

   public static final Codec<fmr> c = azy.a(fmr::values);
   private final String d;

   private fmr(final String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }

   public static class a {
      private final Map<fmr, Boolean> c;
      public static final Codec<fmr.a> a = Codec.unboundedMap(fmr.c, Codec.BOOL).xmap(fmr.a::new, $$0 -> $$0.c);
      public static final fmr.a b = new fmr.a(Map.of());

      public a(Map<fmr, Boolean> $$0) {
         this.c = $$0;
      }

      public boolean a(Set<fmr> $$0) {
         for (Entry<fmr, Boolean> $$1 : this.c.entrySet()) {
            if ($$0.contains($$1.getKey()) != $$1.getValue()) {
               return false;
            }
         }

         return true;
      }

      public fmr.a a(fmr.a $$0) {
         Map<fmr, Boolean> $$1 = new HashMap<>($$0.c);
         $$1.putAll(this.c);
         return new fmr.a(Map.copyOf($$1));
      }
   }
}
