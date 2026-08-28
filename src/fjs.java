import com.mojang.serialization.Codec;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public enum fjs implements azs {
   a("uniform"),
   b("jp");

   public static final Codec<fjs> c = azs.a(fjs::values);
   private final String d;

   private fjs(final String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }

   public static class a {
      private final Map<fjs, Boolean> c;
      public static final Codec<fjs.a> a = Codec.unboundedMap(fjs.c, Codec.BOOL).xmap(fjs.a::new, $$0 -> $$0.c);
      public static final fjs.a b = new fjs.a(Map.of());

      public a(Map<fjs, Boolean> $$0) {
         this.c = $$0;
      }

      public boolean a(Set<fjs> $$0) {
         for (Entry<fjs, Boolean> $$1 : this.c.entrySet()) {
            if ($$0.contains($$1.getKey()) != $$1.getValue()) {
               return false;
            }
         }

         return true;
      }

      public fjs.a a(fjs.a $$0) {
         Map<fjs, Boolean> $$1 = new HashMap<>($$0.c);
         $$1.putAll(this.c);
         return new fjs.a(Map.copyOf($$1));
      }
   }
}
