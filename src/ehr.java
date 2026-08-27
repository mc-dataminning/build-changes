import it.unimi.dsi.fastutil.doubles.AbstractDoubleList;
import it.unimi.dsi.fastutil.doubles.DoubleList;

public class ehr extends AbstractDoubleList implements ehp {
   private final DoubleList a;
   private final DoubleList b;
   private final boolean c;

   protected ehr(DoubleList $$0, DoubleList $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public int size() {
      return this.a.size() + this.b.size();
   }

   @Override
   public boolean a(ehp.a $$0) {
      return this.c ? this.b(($$1, $$2, $$3) -> $$0.merge($$2, $$1, $$3)) : this.b($$0);
   }

   private boolean b(ehp.a $$0) {
      int $$1 = this.a.size();

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         if (!$$0.merge($$2, -1, $$2)) {
            return false;
         }
      }

      int $$3 = this.b.size() - 1;

      for (int $$4 = 0; $$4 < $$3; $$4++) {
         if (!$$0.merge($$1 - 1, $$4, $$1 + $$4)) {
            return false;
         }
      }

      return true;
   }

   public double getDouble(int $$0) {
      return $$0 < this.a.size() ? this.a.getDouble($$0) : this.b.getDouble($$0 - this.a.size());
   }

   @Override
   public DoubleList a() {
      return this;
   }
}
