import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;

public class aeh implements zd<abs> {
   public static final yu<vs, aeh> a = zd.a(aeh::a, aeh::new);
   private final IntList b;

   public aeh(IntList $$0) {
      this.b = new IntArrayList($$0);
   }

   public aeh(int... $$0) {
      this.b = new IntArrayList($$0);
   }

   private aeh(vs $$0) {
      this.b = $$0.a();
   }

   private void a(vs $$0) {
      $$0.a(this.b);
   }

   @Override
   public zf<aeh> a() {
      return agl.an;
   }

   public void a(abs $$0) {
      $$0.a(this);
   }

   public IntList b() {
      return this.b;
   }
}
