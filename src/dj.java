import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.Map;
import java.util.Map.Entry;

public record dj(Map<cqr, ch> b) {
   public static final Codec<dj> a = Codec.unboundedMap(cqs.a, ch.a).xmap(dj::new, dj::a);

   public boolean a(brw $$0) {
      for (Entry<cqr, ch> $$1 : this.b.entrySet()) {
         if (!a($$0, $$1.getValue(), $$1.getKey().a())) {
            return false;
         }
      }

      return true;
   }

   private static boolean a(brw $$0, ch $$1, IntList $$2) {
      for (int $$3 = 0; $$3 < $$2.size(); $$3++) {
         int $$4 = $$2.getInt($$3);
         bti $$5 = $$0.a_($$4);
         if ($$1.a($$5.a())) {
            return true;
         }
      }

      return false;
   }

   public Map<cqr, ch> a() {
      return this.b;
   }
}
