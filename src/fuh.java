import com.mojang.serialization.Codec;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public enum fuh implements bai {
   a("uniform"),
   b("jp");

   public static final Codec<fuh> c = bai.a(fuh::values);
   private final String d;

   private fuh(final String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }

   public static class a {
      private final Map<fuh, Boolean> c;
      public static final Codec<fuh.a> a = Codec.unboundedMap(fuh.c, Codec.BOOL).xmap(fuh.a::new, $$0 -> $$0.c);
      public static final fuh.a b = new fuh.a(Map.of());

      public a(Map<fuh, Boolean> $$0) {
         this.c = $$0;
      }

      public boolean a(Set<fuh> $$0) {
         for (Entry<fuh, Boolean> $$1 : this.c.entrySet()) {
            if ($$0.contains($$1.getKey()) != $$1.getValue()) {
               return false;
            }
         }

         return true;
      }

      public fuh.a a(fuh.a $$0) {
         Map<fuh, Boolean> $$1 = new HashMap<>($$0.c);
         $$1.putAll(this.c);
         return new fuh.a(Map.copyOf($$1));
      }
   }
}
