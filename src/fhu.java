import com.mojang.serialization.Codec;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public enum fhu implements ayt {
   a("uniform"),
   b("jp");

   public static final Codec<fhu> c = ayt.a(fhu::values);
   private final String d;

   private fhu(String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }

   public static class a {
      private final Map<fhu, Boolean> c;
      public static final Codec<fhu.a> a = Codec.unboundedMap(fhu.c, Codec.BOOL).xmap(fhu.a::new, $$0 -> $$0.c);
      public static final fhu.a b = new fhu.a(Map.of());

      public a(Map<fhu, Boolean> $$0) {
         this.c = $$0;
      }

      public boolean a(Set<fhu> $$0) {
         for (Entry<fhu, Boolean> $$1 : this.c.entrySet()) {
            if ($$0.contains($$1.getKey()) != $$1.getValue()) {
               return false;
            }
         }

         return true;
      }

      public fhu.a a(fhu.a $$0) {
         Map<fhu, Boolean> $$1 = new HashMap<>($$0.c);
         $$1.putAll(this.c);
         return new fhu.a(Map.copyOf($$1));
      }
   }
}
