import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;

public class aac implements wb<xu> {
   private final IntList a;

   public aac(IntList $$0) {
      this.a = new IntArrayList($$0);
   }

   public aac(int... $$0) {
      this.a = new IntArrayList($$0);
   }

   public aac(tl $$0) {
      this.a = $$0.a();
   }

   @Override
   public void a(tl $$0) {
      $$0.a(this.a);
   }

   public void a(xu $$0) {
      $$0.a(this);
   }

   public IntList a() {
      return this.a;
   }
}
