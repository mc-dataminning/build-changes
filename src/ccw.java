import java.util.EnumSet;

public abstract class ccw {
   private final EnumSet<ccw.a> a = EnumSet.noneOf(ccw.a.class);

   public abstract boolean b();

   public boolean c() {
      return this.b();
   }

   public boolean P_() {
      return true;
   }

   public void d() {
   }

   public void e() {
   }

   public boolean Q_() {
      return false;
   }

   public void a() {
   }

   public void a(EnumSet<ccw.a> $$0) {
      this.a.clear();
      this.a.addAll($$0);
   }

   @Override
   public String toString() {
      return this.getClass().getSimpleName();
   }

   public EnumSet<ccw.a> j() {
      return this.a;
   }

   protected int a(int $$0) {
      return this.Q_() ? $$0 : b($$0);
   }

   protected static int b(int $$0) {
      return ayz.e($$0, 2);
   }

   protected static ard a(bva $$0) {
      return (ard)$$0.dU();
   }

   protected static ard a(dgz $$0) {
      return (ard)$$0;
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
