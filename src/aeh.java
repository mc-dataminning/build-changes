import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;

public class aeh implements zl<abw> {
   public static final zc<we, aeh> a = zl.a(aeh::a, aeh::new);
   private final IntList b;

   public aeh(IntList $$0) {
      this.b = new IntArrayList($$0);
   }

   public aeh(int... $$0) {
      this.b = new IntArrayList($$0);
   }

   private aeh(we $$0) {
      this.b = $$0.a();
   }

   private void a(we $$0) {
      $$0.a(this.b);
   }

   @Override
   public zn<aeh> a() {
      return agj.ak;
   }

   public void a(abw $$0) {
      $$0.a(this);
   }

   public IntList b() {
      return this.b;
   }
}
