import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.Map;
import java.util.Map.Entry;

public record da(Map<cot, cc> b) {
   public static final Codec<da> a = Codec.unboundedMap(cou.a, cc.a).xmap(da::new, da::a);

   public boolean a(bqa $$0) {
      for (Entry<cot, cc> $$1 : this.b.entrySet()) {
         if (!a($$0, $$1.getValue(), $$1.getKey().a())) {
            return false;
         }
      }

      return true;
   }

   private static boolean a(bqa $$0, cc $$1, IntList $$2) {
      for (int $$3 = 0; $$3 < $$2.size(); $$3++) {
         int $$4 = $$2.getInt($$3);
         brk $$5 = $$0.a_($$4);
         if ($$1.a($$5.a())) {
            return true;
         }
      }

      return false;
   }

   public Map<cot, cc> a() {
      return this.b;
   }
}
