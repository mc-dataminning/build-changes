import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;

public class abj implements xg<zb> {
   private final IntList a;

   public abj(IntList $$0) {
      this.a = new IntArrayList($$0);
   }

   public abj(int... $$0) {
      this.a = new IntArrayList($$0);
   }

   public abj(uj $$0) {
      this.a = $$0.a();
   }

   @Override
   public void a(uj $$0) {
      $$0.a(this.a);
   }

   public void a(zb $$0) {
      $$0.a(this);
   }

   public IntList a() {
      return this.a;
   }
}
