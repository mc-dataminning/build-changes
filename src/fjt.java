import com.mojang.serialization.Codec;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public enum fjt implements azt {
   a("uniform"),
   b("jp");

   public static final Codec<fjt> c = azt.a(fjt::values);
   private final String d;

   private fjt(final String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }

   public static class a {
      private final Map<fjt, Boolean> c;
      public static final Codec<fjt.a> a = Codec.unboundedMap(fjt.c, Codec.BOOL).xmap(fjt.a::new, $$0 -> $$0.c);
      public static final fjt.a b = new fjt.a(Map.of());

      public a(Map<fjt, Boolean> $$0) {
         this.c = $$0;
      }

      public boolean a(Set<fjt> $$0) {
         for (Entry<fjt, Boolean> $$1 : this.c.entrySet()) {
            if ($$0.contains($$1.getKey()) != $$1.getValue()) {
               return false;
            }
         }

         return true;
      }

      public fjt.a a(fjt.a $$0) {
         Map<fjt, Boolean> $$1 = new HashMap<>($$0.c);
         $$1.putAll(this.c);
         return new fjt.a(Map.copyOf($$1));
      }
   }
}
