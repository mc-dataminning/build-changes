import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.Map;
import java.util.Map.Entry;

public record ed(Map<cuu, cv> b) {
   public static final Codec<ed> a = Codec.unboundedMap(cuv.a, cv.a).xmap(ed::new, ed::a);

   public boolean a(bva $$0) {
      for (Entry<cuu, cv> $$1 : this.b.entrySet()) {
         if (!a($$0, $$1.getValue(), $$1.getKey().a())) {
            return false;
         }
      }

      return true;
   }

   private static boolean a(bva $$0, cv $$1, IntList $$2) {
      for (int $$3 = 0; $$3 < $$2.size(); $$3++) {
         int $$4 = $$2.getInt($$3);
         bwq $$5 = $$0.a_($$4);
         if ($$1.a($$5.a())) {
            return true;
         }
      }

      return false;
   }

   public Map<cuu, cv> a() {
      return this.b;
   }
}
