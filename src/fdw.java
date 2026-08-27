import com.mojang.serialization.Codec;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public enum fdw implements axq {
   a("uniform"),
   b("jp");

   public static final Codec<fdw> c = axq.a(fdw::values);
   private final String d;

   private fdw(String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }

   public static class a {
      private final Map<fdw, Boolean> c;
      public static final Codec<fdw.a> a = Codec.unboundedMap(fdw.c, Codec.BOOL).xmap(fdw.a::new, $$0 -> $$0.c);
      public static final fdw.a b = new fdw.a(Map.of());

      public a(Map<fdw, Boolean> $$0) {
         this.c = $$0;
      }

      public boolean a(Set<fdw> $$0) {
         for (Entry<fdw, Boolean> $$1 : this.c.entrySet()) {
            if ($$0.contains($$1.getKey()) != $$1.getValue()) {
               return false;
            }
         }

         return true;
      }

      public fdw.a a(fdw.a $$0) {
         Map<fdw, Boolean> $$1 = new HashMap<>($$0.c);
         $$1.putAll(this.c);
         return new fdw.a(Map.copyOf($$1));
      }
   }
}
