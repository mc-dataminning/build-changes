import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.Map;
import java.util.Map.Entry;

public record dz(Map<crp, cs> b) {
   public static final Codec<dz> a = Codec.unboundedMap(crq.a, cs.a).xmap(dz::new, dz::a);

   public boolean a(bsq $$0) {
      for (Entry<crp, cs> $$1 : this.b.entrySet()) {
         if (!a($$0, $$1.getValue(), $$1.getKey().a())) {
            return false;
         }
      }

      return true;
   }

   private static boolean a(bsq $$0, cs $$1, IntList $$2) {
      for (int $$3 = 0; $$3 < $$2.size(); $$3++) {
         int $$4 = $$2.getInt($$3);
         bue $$5 = $$0.a_($$4);
         if ($$1.a($$5.a())) {
            return true;
         }
      }

      return false;
   }

   public Map<crp, cs> a() {
      return this.b;
   }
}
