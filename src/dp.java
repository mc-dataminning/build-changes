import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.Map;
import java.util.Map.Entry;

public record dp(Map<cxa, cm> b) {
   public static final Codec<dp> a = Codec.unboundedMap(cxb.a, cm.a).xmap(dp::new, dp::a);

   public boolean a(bwi $$0) {
      for (Entry<cxa, cm> $$1 : this.b.entrySet()) {
         if (!a($$0, $$1.getValue(), $$1.getKey().a())) {
            return false;
         }
      }

      return true;
   }

   private static boolean a(bwi $$0, cm $$1, IntList $$2) {
      for (int $$3 = 0; $$3 < $$2.size(); $$3++) {
         int $$4 = $$2.getInt($$3);
         bya $$5 = $$0.a_($$4);
         if ($$1.a($$5.a())) {
            return true;
         }
      }

      return false;
   }

   public Map<cxa, cm> a() {
      return this.b;
   }
}
