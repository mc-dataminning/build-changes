import com.mojang.serialization.Codec;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public enum frl implements azv {
   a("uniform"),
   b("jp");

   public static final Codec<frl> c = azv.a(frl::values);
   private final String d;

   private frl(final String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }

   public static class a {
      private final Map<frl, Boolean> c;
      public static final Codec<frl.a> a = Codec.unboundedMap(frl.c, Codec.BOOL).xmap(frl.a::new, $$0 -> $$0.c);
      public static final frl.a b = new frl.a(Map.of());

      public a(Map<frl, Boolean> $$0) {
         this.c = $$0;
      }

      public boolean a(Set<frl> $$0) {
         for (Entry<frl, Boolean> $$1 : this.c.entrySet()) {
            if ($$0.contains($$1.getKey()) != $$1.getValue()) {
               return false;
            }
         }

         return true;
      }

      public frl.a a(frl.a $$0) {
         Map<frl, Boolean> $$1 = new HashMap<>($$0.c);
         $$1.putAll(this.c);
         return new frl.a(Map.copyOf($$1));
      }
   }
}
