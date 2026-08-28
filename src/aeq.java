import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;

public class aeq implements zp<ace> {
   public static final zg<wf, aeq> a = zp.a(aeq::a, aeq::new);
   private final IntList b;

   public aeq(IntList $$0) {
      this.b = new IntArrayList($$0);
   }

   public aeq(int... $$0) {
      this.b = new IntArrayList($$0);
   }

   private aeq(wf $$0) {
      this.b = $$0.a();
   }

   private void a(wf $$0) {
      $$0.a(this.b);
   }

   @Override
   public zr<aeq> a() {
      return agt.ak;
   }

   public void a(ace $$0) {
      $$0.a(this);
   }

   public IntList b() {
      return this.b;
   }
}
