import com.mojang.serialization.Codec;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public enum fla implements azk {
   a("uniform"),
   b("jp");

   public static final Codec<fla> c = azk.a(fla::values);
   private final String d;

   private fla(final String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }

   public static class a {
      private final Map<fla, Boolean> c;
      public static final Codec<fla.a> a = Codec.unboundedMap(fla.c, Codec.BOOL).xmap(fla.a::new, $$0 -> $$0.c);
      public static final fla.a b = new fla.a(Map.of());

      public a(Map<fla, Boolean> $$0) {
         this.c = $$0;
      }

      public boolean a(Set<fla> $$0) {
         for (Entry<fla, Boolean> $$1 : this.c.entrySet()) {
            if ($$0.contains($$1.getKey()) != $$1.getValue()) {
               return false;
            }
         }

         return true;
      }

      public fla.a a(fla.a $$0) {
         Map<fla, Boolean> $$1 = new HashMap<>($$0.c);
         $$1.putAll(this.c);
         return new fla.a(Map.copyOf($$1));
      }
   }
}
