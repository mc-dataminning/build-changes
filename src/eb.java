import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.Map;
import java.util.Map.Entry;

public record eb(Map<cth, ct> b) {
   public static final Codec<eb> a = Codec.unboundedMap(cti.a, ct.a).xmap(eb::new, eb::a);

   public boolean a(btz $$0) {
      for (Entry<cth, ct> $$1 : this.b.entrySet()) {
         if (!a($$0, $$1.getValue(), $$1.getKey().a())) {
            return false;
         }
      }

      return true;
   }

   private static boolean a(btz $$0, ct $$1, IntList $$2) {
      for (int $$3 = 0; $$3 < $$2.size(); $$3++) {
         int $$4 = $$2.getInt($$3);
         bvn $$5 = $$0.a_($$4);
         if ($$1.a($$5.a())) {
            return true;
         }
      }

      return false;
   }

   public Map<cth, ct> a() {
      return this.b;
   }
}
