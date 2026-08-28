import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.Map;
import java.util.Map.Entry;

public record ed(Map<cub, cv> b) {
   public static final Codec<ed> a = Codec.unboundedMap(cuc.a, cv.a).xmap(ed::new, ed::a);

   public boolean a(bum $$0) {
      for (Entry<cub, cv> $$1 : this.b.entrySet()) {
         if (!a($$0, $$1.getValue(), $$1.getKey().a())) {
            return false;
         }
      }

      return true;
   }

   private static boolean a(bum $$0, cv $$1, IntList $$2) {
      for (int $$3 = 0; $$3 < $$2.size(); $$3++) {
         int $$4 = $$2.getInt($$3);
         bwa $$5 = $$0.a_($$4);
         if ($$1.a($$5.a())) {
            return true;
         }
      }

      return false;
   }

   public Map<cub, cv> a() {
      return this.b;
   }
}
