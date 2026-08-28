import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;

public class aem implements zl<aca> {
   public static final zc<wb, aem> a = zl.a(aem::a, aem::new);
   private final IntList b;

   public aem(IntList $$0) {
      this.b = new IntArrayList($$0);
   }

   public aem(int... $$0) {
      this.b = new IntArrayList($$0);
   }

   private aem(wb $$0) {
      this.b = $$0.a();
   }

   private void a(wb $$0) {
      $$0.a(this.b);
   }

   @Override
   public zn<aem> a() {
      return agp.ak;
   }

   public void a(aca $$0) {
      $$0.a(this);
   }

   public IntList b() {
      return this.b;
   }
}
