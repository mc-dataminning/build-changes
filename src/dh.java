import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.Map;
import java.util.Map.Entry;

public record dh(Map<cpe, cg> b) {
   public static final Codec<dh> a = Codec.unboundedMap(cpf.a, cg.a).xmap(dh::new, dh::a);

   public boolean a(bql $$0) {
      for (Entry<cpe, cg> $$1 : this.b.entrySet()) {
         if (!a($$0, $$1.getValue(), $$1.getKey().a())) {
            return false;
         }
      }

      return true;
   }

   private static boolean a(bql $$0, cg $$1, IntList $$2) {
      for (int $$3 = 0; $$3 < $$2.size(); $$3++) {
         int $$4 = $$2.getInt($$3);
         brv $$5 = $$0.a_($$4);
         if ($$1.a($$5.a())) {
            return true;
         }
      }

      return false;
   }

   public Map<cpe, cg> a() {
      return this.b;
   }
}
