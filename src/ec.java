import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.Map;
import java.util.Map.Entry;

public record ec(Map<cur, cu> b) {
   public static final Codec<ec> a = Codec.unboundedMap(cus.a, cu.a).xmap(ec::new, ec::a);

   public boolean a(bvb $$0) {
      for (Entry<cur, cu> $$1 : this.b.entrySet()) {
         if (!a($$0, $$1.getValue(), $$1.getKey().a())) {
            return false;
         }
      }

      return true;
   }

   private static boolean a(bvb $$0, cu $$1, IntList $$2) {
      for (int $$3 = 0; $$3 < $$2.size(); $$3++) {
         int $$4 = $$2.getInt($$3);
         bwp $$5 = $$0.a_($$4);
         if ($$1.a($$5.a())) {
            return true;
         }
      }

      return false;
   }

   public Map<cur, cu> a() {
      return this.b;
   }
}
