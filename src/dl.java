import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.Map;
import java.util.Map.Entry;

public record dl(Map<crf, ci> b) {
   public static final Codec<dl> a = Codec.unboundedMap(crg.a, ci.a).xmap(dl::new, dl::a);

   public boolean a(brv $$0) {
      for (Entry<crf, ci> $$1 : this.b.entrySet()) {
         if (!a($$0, $$1.getValue(), $$1.getKey().a())) {
            return false;
         }
      }

      return true;
   }

   private static boolean a(brv $$0, ci $$1, IntList $$2) {
      for (int $$3 = 0; $$3 < $$2.size(); $$3++) {
         int $$4 = $$2.getInt($$3);
         btf $$5 = $$0.a_($$4);
         if ($$1.a($$5.a())) {
            return true;
         }
      }

      return false;
   }

   public Map<crf, ci> a() {
      return this.b;
   }
}
