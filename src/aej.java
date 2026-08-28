import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;

public class aej implements zf<abu> {
   public static final yw<vu, aej> a = zf.a(aej::a, aej::new);
   private final IntList b;

   public aej(IntList $$0) {
      this.b = new IntArrayList($$0);
   }

   public aej(int... $$0) {
      this.b = new IntArrayList($$0);
   }

   private aej(vu $$0) {
      this.b = $$0.a();
   }

   private void a(vu $$0) {
      $$0.a(this.b);
   }

   @Override
   public zh<aej> a() {
      return agn.an;
   }

   public void a(abu $$0) {
      $$0.a(this);
   }

   public IntList b() {
      return this.b;
   }
}
