import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;

public class adw implements zb<abm> {
   public static final ys<vu, adw> a = zb.a(adw::a, adw::new);
   private final IntList b;

   public adw(IntList $$0) {
      this.b = new IntArrayList($$0);
   }

   public adw(int... $$0) {
      this.b = new IntArrayList($$0);
   }

   private adw(vu $$0) {
      this.b = $$0.a();
   }

   private void a(vu $$0) {
      $$0.a(this.b);
   }

   @Override
   public zd<adw> a() {
      return afx.aj;
   }

   public void a(abm $$0) {
      $$0.a(this);
   }

   public IntList b() {
      return this.b;
   }
}
