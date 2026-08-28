import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.Map;
import java.util.Map.Entry;

public record dq(Map<cya, cn> b) {
   public static final Codec<dq> a = Codec.unboundedMap(cyb.a, cn.a).xmap(dq::new, dq::a);

   public boolean a(bxe $$0) {
      for (Entry<cya, cn> $$1 : this.b.entrySet()) {
         if (!a($$0, $$1.getValue(), $$1.getKey().a())) {
            return false;
         }
      }

      return true;
   }

   private static boolean a(bxe $$0, cn $$1, IntList $$2) {
      for (int $$3 = 0; $$3 < $$2.size(); $$3++) {
         int $$4 = $$2.getInt($$3);
         byw $$5 = $$0.a_($$4);
         if ($$1.a($$5.a())) {
            return true;
         }
      }

      return false;
   }

   public Map<cya, cn> a() {
      return this.b;
   }
}
