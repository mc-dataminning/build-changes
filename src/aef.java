import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;

public class aef implements zg<abu> {
   public static final yx<vw, aef> a = zg.a(aef::a, aef::new);
   private final IntList b;

   public aef(IntList $$0) {
      this.b = new IntArrayList($$0);
   }

   public aef(int... $$0) {
      this.b = new IntArrayList($$0);
   }

   private aef(vw $$0) {
      this.b = $$0.a();
   }

   private void a(vw $$0) {
      $$0.a(this.b);
   }

   @Override
   public zi<aef> a() {
      return agg.aj;
   }

   public void a(abu $$0) {
      $$0.a(this);
   }

   public IntList b() {
      return this.b;
   }
}
