import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import java.util.Locale;

public final class dyp {
   private final ImmutableList<dyr> a;
   private final int[] b;

   public dyp(ImmutableList<dyr> $$0) {
      this.a = $$0;
      int $$1 = $$0.isEmpty() ? 0 : ((dyr)$$0.getFirst()).b() + 1;
      this.b = new int[$$1];

      for (int $$2 = 0; $$2 < $$0.size(); $$2++) {
         dyr $$3 = (dyr)$$0.get($$2);
         int $$4 = $$3.b();

         for (int $$5 = 0; $$5 <= $$4; $$5++) {
            this.b[$$5] = $$2;
         }
      }
   }

   @VisibleForTesting
   public ImmutableList<dyr> a() {
      return this.a;
   }

   public int b() {
      return this.a.size();
   }

   public int a(dyr $$0) {
      int $$1 = $$0.b();
      if ($$1 >= this.b.length) {
         throw new IllegalArgumentException(String.format(Locale.ROOT, "Requesting a ChunkStatus(%s) outside of dependency range(%s)", $$0, this.a));
      } else {
         return this.b[$$1];
      }
   }

   public int c() {
      return Math.max(0, this.a.size() - 1);
   }

   public dyr a(int $$0) {
      return (dyr)this.a.get($$0);
   }

   @Override
   public String toString() {
      return this.a.toString();
   }
}
