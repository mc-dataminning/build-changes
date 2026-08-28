import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;

public class aen implements zj<aby> {
   public static final za<vy, aen> a = zj.a(aen::a, aen::new);
   private final IntList b;

   public aen(IntList $$0) {
      this.b = new IntArrayList($$0);
   }

   public aen(int... $$0) {
      this.b = new IntArrayList($$0);
   }

   private aen(vy $$0) {
      this.b = $$0.a();
   }

   private void a(vy $$0) {
      $$0.a(this.b);
   }

   @Override
   public zl<aen> a() {
      return agr.an;
   }

   public void a(aby $$0) {
      $$0.a(this);
   }

   public IntList b() {
      return this.b;
   }
}
