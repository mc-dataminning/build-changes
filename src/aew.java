import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;

public class aew implements zr<acg> {
   public static final zi<wh, aew> a = zr.a(aew::a, aew::new);
   private final IntList b;

   public aew(IntList $$0) {
      this.b = new IntArrayList($$0);
   }

   public aew(int... $$0) {
      this.b = new IntArrayList($$0);
   }

   private aew(wh $$0) {
      this.b = $$0.a();
   }

   private void a(wh $$0) {
      $$0.a(this.b);
   }

   @Override
   public zt<aew> a() {
      return agz.an;
   }

   public void a(acg $$0) {
      $$0.a(this);
   }

   public IntList b() {
      return this.b;
   }
}
