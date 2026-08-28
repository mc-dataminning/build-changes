import it.unimi.dsi.fastutil.doubles.DoubleList;

public class fdf implements fdg {
   private final DoubleList a;

   public fdf(DoubleList $$0) {
      this.a = $$0;
   }

   @Override
   public boolean a(fdg.a $$0) {
      int $$1 = this.a.size() - 1;

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         if (!$$0.merge($$2, $$2, $$2)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public int size() {
      return this.a.size();
   }

   @Override
   public DoubleList a() {
      return this.a;
   }
}
