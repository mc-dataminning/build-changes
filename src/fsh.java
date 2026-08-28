import com.mojang.serialization.Codec;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public enum fsh implements azv {
   a("uniform"),
   b("jp");

   public static final Codec<fsh> c = azv.a(fsh::values);
   private final String d;

   private fsh(final String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }

   public static class a {
      private final Map<fsh, Boolean> c;
      public static final Codec<fsh.a> a = Codec.unboundedMap(fsh.c, Codec.BOOL).xmap(fsh.a::new, $$0 -> $$0.c);
      public static final fsh.a b = new fsh.a(Map.of());

      public a(Map<fsh, Boolean> $$0) {
         this.c = $$0;
      }

      public boolean a(Set<fsh> $$0) {
         for (Entry<fsh, Boolean> $$1 : this.c.entrySet()) {
            if ($$0.contains($$1.getKey()) != $$1.getValue()) {
               return false;
            }
         }

         return true;
      }

      public fsh.a a(fsh.a $$0) {
         Map<fsh, Boolean> $$1 = new HashMap<>($$0.c);
         $$1.putAll(this.c);
         return new fsh.a(Map.copyOf($$1));
      }
   }
}
