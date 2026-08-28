import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;

public class aet implements zs<ach> {
   public static final zj<wi, aet> a = zs.a(aet::a, aet::new);
   private final IntList b;

   public aet(IntList $$0) {
      this.b = new IntArrayList($$0);
   }

   public aet(int... $$0) {
      this.b = new IntArrayList($$0);
   }

   private aet(wi $$0) {
      this.b = $$0.a();
   }

   private void a(wi $$0) {
      $$0.a(this.b);
   }

   @Override
   public zu<aet> a() {
      return agw.ak;
   }

   public void a(ach $$0) {
      $$0.a(this);
   }

   public IntList b() {
      return this.b;
   }
}
