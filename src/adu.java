import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;

public class adu implements yz<abk> {
   public static final yq<vs, adu> a = yz.a(adu::a, adu::new);
   private final IntList b;

   public adu(IntList $$0) {
      this.b = new IntArrayList($$0);
   }

   public adu(int... $$0) {
      this.b = new IntArrayList($$0);
   }

   private adu(vs $$0) {
      this.b = $$0.a();
   }

   private void a(vs $$0) {
      $$0.a(this.b);
   }

   @Override
   public zb<adu> a() {
      return afv.aj;
   }

   public void a(abk $$0) {
      $$0.a(this);
   }

   public IntList b() {
      return this.b;
   }
}
