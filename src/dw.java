import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.Map;
import java.util.Map.Entry;

public record dw(Map<cre, cp> b) {
   public static final Codec<dw> a = Codec.unboundedMap(crf.a, cp.a).xmap(dw::new, dw::a);

   public boolean a(bsg $$0) {
      for (Entry<cre, cp> $$1 : this.b.entrySet()) {
         if (!a($$0, $$1.getValue(), $$1.getKey().a())) {
            return false;
         }
      }

      return true;
   }

   private static boolean a(bsg $$0, cp $$1, IntList $$2) {
      for (int $$3 = 0; $$3 < $$2.size(); $$3++) {
         int $$4 = $$2.getInt($$3);
         btt $$5 = $$0.a_($$4);
         if ($$1.a($$5.a())) {
            return true;
         }
      }

      return false;
   }

   public Map<cre, cp> a() {
      return this.b;
   }
}
