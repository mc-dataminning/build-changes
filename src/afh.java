import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;

public class afh implements aac<acr> {
   public static final zt<ws, afh> a = aac.a(afh::a, afh::new);
   private final IntList b;

   public afh(IntList $$0) {
      this.b = new IntArrayList($$0);
   }

   public afh(int... $$0) {
      this.b = new IntArrayList($$0);
   }

   private afh(ws $$0) {
      this.b = $$0.a();
   }

   private void a(ws $$0) {
      $$0.a(this.b);
   }

   @Override
   public aae<afh> a() {
      return ahk.an;
   }

   public void a(acr $$0) {
      $$0.a(this);
   }

   public IntList b() {
      return this.b;
   }
}
