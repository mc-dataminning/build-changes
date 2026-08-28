import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;

public class aee implements zf<abt> {
   public static final yw<vv, aee> a = zf.a(aee::a, aee::new);
   private final IntList b;

   public aee(IntList $$0) {
      this.b = new IntArrayList($$0);
   }

   public aee(int... $$0) {
      this.b = new IntArrayList($$0);
   }

   private aee(vv $$0) {
      this.b = $$0.a();
   }

   private void a(vv $$0) {
      $$0.a(this.b);
   }

   @Override
   public zh<aee> a() {
      return agf.aj;
   }

   public void a(abt $$0) {
      $$0.a(this);
   }

   public IntList b() {
      return this.b;
   }
}
