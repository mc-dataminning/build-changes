import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;

public class aeb implements yw<abl> {
   public static final yn<vl, aeb> a = yw.a(aeb::a, aeb::new);
   private final IntList b;

   public aeb(IntList $$0) {
      this.b = new IntArrayList($$0);
   }

   public aeb(int... $$0) {
      this.b = new IntArrayList($$0);
   }

   private aeb(vl $$0) {
      this.b = $$0.a();
   }

   private void a(vl $$0) {
      $$0.a(this.b);
   }

   @Override
   public yy<aeb> a() {
      return age.an;
   }

   public void a(abl $$0) {
      $$0.a(this);
   }

   public IntList b() {
      return this.b;
   }
}
