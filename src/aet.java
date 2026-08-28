import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;

public class aet implements zw<aci> {
   public static final zn<wm, aet> a = zw.a(aet::a, aet::new);
   private final IntList b;

   public aet(IntList $$0) {
      this.b = new IntArrayList($$0);
   }

   public aet(int... $$0) {
      this.b = new IntArrayList($$0);
   }

   private aet(wm $$0) {
      this.b = $$0.a();
   }

   private void a(wm $$0) {
      $$0.a(this.b);
   }

   @Override
   public zy<aet> a() {
      return agu.aj;
   }

   public void a(aci $$0) {
      $$0.a(this);
   }

   public IntList b() {
      return this.b;
   }
}
