import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.Map;
import java.util.Map.Entry;

public record di(Map<cqa, ch> b) {
   public static final Codec<di> a = Codec.unboundedMap(cqb.a, ch.a).xmap(di::new, di::a);

   public boolean a(brh $$0) {
      for (Entry<cqa, ch> $$1 : this.b.entrySet()) {
         if (!a($$0, $$1.getValue(), $$1.getKey().a())) {
            return false;
         }
      }

      return true;
   }

   private static boolean a(brh $$0, ch $$1, IntList $$2) {
      for (int $$3 = 0; $$3 < $$2.size(); $$3++) {
         int $$4 = $$2.getInt($$3);
         bsr $$5 = $$0.a_($$4);
         if ($$1.a($$5.a())) {
            return true;
         }
      }

      return false;
   }

   public Map<cqa, ch> a() {
      return this.b;
   }
}
