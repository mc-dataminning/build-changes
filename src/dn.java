import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.Map;
import java.util.Map.Entry;

public record dn(Map<cwt, cl> b) {
   public static final Codec<dn> a = Codec.unboundedMap(cwu.a, cl.a).xmap(dn::new, dn::a);

   public boolean a(bwf $$0) {
      for (Entry<cwt, cl> $$1 : this.b.entrySet()) {
         if (!a($$0, $$1.getValue(), $$1.getKey().a())) {
            return false;
         }
      }

      return true;
   }

   private static boolean a(bwf $$0, cl $$1, IntList $$2) {
      for (int $$3 = 0; $$3 < $$2.size(); $$3++) {
         int $$4 = $$2.getInt($$3);
         bxv $$5 = $$0.a_($$4);
         if ($$1.a($$5.a())) {
            return true;
         }
      }

      return false;
   }

   public Map<cwt, cl> a() {
      return this.b;
   }
}
