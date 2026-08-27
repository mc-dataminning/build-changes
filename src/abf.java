import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;

public class abf implements xd<yx> {
   private final IntList a;

   public abf(IntList $$0) {
      this.a = new IntArrayList($$0);
   }

   public abf(int... $$0) {
      this.a = new IntArrayList($$0);
   }

   public abf(ug $$0) {
      this.a = $$0.a();
   }

   @Override
   public void a(ug $$0) {
      $$0.a(this.a);
   }

   public void a(yx $$0) {
      $$0.a(this);
   }

   public IntList a() {
      return this.a;
   }
}
