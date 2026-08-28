import com.google.common.annotations.VisibleForTesting;
import it.unimi.dsi.fastutil.ints.IntArraySet;
import it.unimi.dsi.fastutil.ints.IntCollection;
import it.unimi.dsi.fastutil.ints.IntSet;
import java.util.BitSet;

public class dvj {
   private final BitSet a = new BitSet();

   public void a(int $$0, int $$1) {
      this.a.set($$0, $$0 + $$1);
   }

   public void b(int $$0, int $$1) {
      this.a.clear($$0, $$0 + $$1);
   }

   public int a(int $$0) {
      int $$1 = 0;

      while (true) {
         int $$2 = this.a.nextClearBit($$1);
         int $$3 = this.a.nextSetBit($$2);
         if ($$3 == -1 || $$3 - $$2 >= $$0) {
            this.a($$2, $$0);
            return $$2;
         }

         $$1 = $$3;
      }
   }

   @VisibleForTesting
   public IntSet a() {
      return this.a.stream().collect(IntArraySet::new, IntCollection::add, IntCollection::addAll);
   }
}
