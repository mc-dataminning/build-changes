import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;

public class aeb implements ze<abq> {
   public static final yv<vx, aeb> a = ze.a(aeb::a, aeb::new);
   private final IntList b;

   public aeb(IntList $$0) {
      this.b = new IntArrayList($$0);
   }

   public aeb(int... $$0) {
      this.b = new IntArrayList($$0);
   }

   private aeb(vx $$0) {
      this.b = $$0.a();
   }

   private void a(vx $$0) {
      $$0.a(this.b);
   }

   @Override
   public zg<aeb> a() {
      return agc.aj;
   }

   public void a(abq $$0) {
      $$0.a(this);
   }

   public IntList b() {
      return this.b;
   }
}
