import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;

public class aep implements zo<acd> {
   public static final zf<we, aep> a = zo.a(aep::a, aep::new);
   private final IntList b;

   public aep(IntList $$0) {
      this.b = new IntArrayList($$0);
   }

   public aep(int... $$0) {
      this.b = new IntArrayList($$0);
   }

   private aep(we $$0) {
      this.b = $$0.a();
   }

   private void a(we $$0) {
      $$0.a(this.b);
   }

   @Override
   public zq<aep> a() {
      return ags.ak;
   }

   public void a(acd $$0) {
      $$0.a(this);
   }

   public IntList b() {
      return this.b;
   }
}
