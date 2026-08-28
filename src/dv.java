import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.Map;
import java.util.Map.Entry;

public record dv(Map<crq, cp> b) {
   public static final Codec<dv> a = Codec.unboundedMap(crr.a, cp.a).xmap(dv::new, dv::a);

   public boolean a(bsu $$0) {
      for (Entry<crq, cp> $$1 : this.b.entrySet()) {
         if (!a($$0, $$1.getValue(), $$1.getKey().a())) {
            return false;
         }
      }

      return true;
   }

   private static boolean a(bsu $$0, cp $$1, IntList $$2) {
      for (int $$3 = 0; $$3 < $$2.size(); $$3++) {
         int $$4 = $$2.getInt($$3);
         buh $$5 = $$0.a_($$4);
         if ($$1.a($$5.a())) {
            return true;
         }
      }

      return false;
   }

   public Map<crq, cp> a() {
      return this.b;
   }
}
