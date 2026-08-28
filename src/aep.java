import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;

public class aep implements zs<ace> {
   public static final zj<wl, aep> a = zs.a(aep::a, aep::new);
   private final IntList b;

   public aep(IntList $$0) {
      this.b = new IntArrayList($$0);
   }

   public aep(int... $$0) {
      this.b = new IntArrayList($$0);
   }

   private aep(wl $$0) {
      this.b = $$0.a();
   }

   private void a(wl $$0) {
      $$0.a(this.b);
   }

   @Override
   public zu<aep> a() {
      return agq.aj;
   }

   public void a(ace $$0) {
      $$0.a(this);
   }

   public IntList b() {
      return this.b;
   }
}
