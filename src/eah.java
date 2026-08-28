import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import java.util.Locale;

public final class eah {
   private final ImmutableList<eaj> a;
   private final int[] b;

   public eah(ImmutableList<eaj> $$0) {
      this.a = $$0;
      int $$1 = $$0.isEmpty() ? 0 : ((eaj)$$0.getFirst()).b() + 1;
      this.b = new int[$$1];

      for (int $$2 = 0; $$2 < $$0.size(); $$2++) {
         eaj $$3 = (eaj)$$0.get($$2);
         int $$4 = $$3.b();

         for (int $$5 = 0; $$5 <= $$4; $$5++) {
            this.b[$$5] = $$2;
         }
      }
   }

   @VisibleForTesting
   public ImmutableList<eaj> a() {
      return this.a;
   }

   public int b() {
      return this.a.size();
   }

   public int a(eaj $$0) {
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

   public eaj a(int $$0) {
      return (eaj)this.a.get($$0);
   }

   @Override
   public String toString() {
      return this.a.toString();
   }
}
