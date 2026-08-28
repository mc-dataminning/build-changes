import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;

public class ady implements zb<abn> {
   public static final ys<vr, ady> a = zb.a(ady::a, ady::new);
   private final IntList b;

   public ady(IntList $$0) {
      this.b = new IntArrayList($$0);
   }

   public ady(int... $$0) {
      this.b = new IntArrayList($$0);
   }

   private ady(vr $$0) {
      this.b = $$0.a();
   }

   private void a(vr $$0) {
      $$0.a(this.b);
   }

   @Override
   public zd<ady> a() {
      return afz.aj;
   }

   public void a(abn $$0) {
      $$0.a(this);
   }

   public IntList b() {
      return this.b;
   }
}
