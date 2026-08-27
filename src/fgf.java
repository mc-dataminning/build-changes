import com.mojang.serialization.Codec;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public enum fgf implements aye {
   a("uniform"),
   b("jp");

   public static final Codec<fgf> c = aye.a(fgf::values);
   private final String d;

   private fgf(String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }

   public static class a {
      private final Map<fgf, Boolean> c;
      public static final Codec<fgf.a> a = Codec.unboundedMap(fgf.c, Codec.BOOL).xmap(fgf.a::new, $$0 -> $$0.c);
      public static final fgf.a b = new fgf.a(Map.of());

      public a(Map<fgf, Boolean> $$0) {
         this.c = $$0;
      }

      public boolean a(Set<fgf> $$0) {
         for (Entry<fgf, Boolean> $$1 : this.c.entrySet()) {
            if ($$0.contains($$1.getKey()) != $$1.getValue()) {
               return false;
            }
         }

         return true;
      }

      public fgf.a a(fgf.a $$0) {
         Map<fgf, Boolean> $$1 = new HashMap<>($$0.c);
         $$1.putAll(this.c);
         return new fgf.a(Map.copyOf($$1));
      }
   }
}
