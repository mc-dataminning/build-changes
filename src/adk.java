import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;

public class adk implements yp<aba> {
   public static final yg<vi, adk> a = yp.a(adk::a, adk::new);
   private final IntList b;

   public adk(IntList $$0) {
      this.b = new IntArrayList($$0);
   }

   public adk(int... $$0) {
      this.b = new IntArrayList($$0);
   }

   private adk(vi $$0) {
      this.b = $$0.a();
   }

   private void a(vi $$0) {
      $$0.a(this.b);
   }

   @Override
   public yr<adk> a() {
      return afl.aj;
   }

   public void a(aba $$0) {
      $$0.a(this);
   }

   public IntList b() {
      return this.b;
   }
}
