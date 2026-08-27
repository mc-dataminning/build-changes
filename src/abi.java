import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;

public class abi implements xf<za> {
   private final IntList a;

   public abi(IntList $$0) {
      this.a = new IntArrayList($$0);
   }

   public abi(int... $$0) {
      this.a = new IntArrayList($$0);
   }

   public abi(ui $$0) {
      this.a = $$0.a();
   }

   @Override
   public void a(ui $$0) {
      $$0.a(this.a);
   }

   public void a(za $$0) {
      $$0.a(this);
   }

   public IntList a() {
      return this.a;
   }
}
