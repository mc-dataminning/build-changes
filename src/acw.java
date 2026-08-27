import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;

public class acw implements yb<aam> {
   public static final xs<uu, acw> a = yb.a(acw::a, acw::new);
   private final IntList b;

   public acw(IntList $$0) {
      this.b = new IntArrayList($$0);
   }

   public acw(int... $$0) {
      this.b = new IntArrayList($$0);
   }

   private acw(uu $$0) {
      this.b = $$0.a();
   }

   private void a(uu $$0) {
      $$0.a(this.b);
   }

   @Override
   public yd<acw> a() {
      return aex.aj;
   }

   public void a(aam $$0) {
      $$0.a(this);
   }

   public IntList b() {
      return this.b;
   }
}
