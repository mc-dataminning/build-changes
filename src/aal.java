import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;

public class aal implements wk<yd> {
   private final IntList a;

   public aal(IntList $$0) {
      this.a = new IntArrayList($$0);
   }

   public aal(int... $$0) {
      this.a = new IntArrayList($$0);
   }

   public aal(tu $$0) {
      this.a = $$0.a();
   }

   @Override
   public void a(tu $$0) {
      $$0.a(this.a);
   }

   public void a(yd $$0) {
      $$0.a(this);
   }

   public IntList a() {
      return this.a;
   }
}
