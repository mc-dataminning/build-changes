import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;

public class aaw implements wu<yo> {
   private final IntList a;

   public aaw(IntList $$0) {
      this.a = new IntArrayList($$0);
   }

   public aaw(int... $$0) {
      this.a = new IntArrayList($$0);
   }

   public aaw(ue $$0) {
      this.a = $$0.a();
   }

   @Override
   public void a(ue $$0) {
      $$0.a(this.a);
   }

   public void a(yo $$0) {
      $$0.a(this);
   }

   public IntList a() {
      return this.a;
   }
}
