import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.Map;
import java.util.Map.Entry;

public record dq(Map<cxq, cn> b) {
   public static final Codec<dq> a = Codec.unboundedMap(cxr.a, cn.a).xmap(dq::new, dq::a);

   public boolean a(bwv $$0) {
      for (Entry<cxq, cn> $$1 : this.b.entrySet()) {
         if (!a($$0, $$1.getValue(), $$1.getKey().a())) {
            return false;
         }
      }

      return true;
   }

   private static boolean a(bwv $$0, cn $$1, IntList $$2) {
      for (int $$3 = 0; $$3 < $$2.size(); $$3++) {
         int $$4 = $$2.getInt($$3);
         byn $$5 = $$0.a_($$4);
         if ($$1.a($$5.a())) {
            return true;
         }
      }

      return false;
   }

   public Map<cxq, cn> a() {
      return this.b;
   }
}
