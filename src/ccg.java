import java.util.EnumSet;

public abstract class ccg {
   private final EnumSet<ccg.a> a = EnumSet.noneOf(ccg.a.class);

   public abstract boolean b();

   public boolean c() {
      return this.b();
   }

   public boolean U_() {
      return true;
   }

   public void d() {
   }

   public void e() {
   }

   public boolean V_() {
      return false;
   }

   public void a() {
   }

   public void a(EnumSet<ccg.a> $$0) {
      this.a.clear();
      this.a.addAll($$0);
   }

   @Override
   public String toString() {
      return this.getClass().getSimpleName();
   }

   public EnumSet<ccg.a> j() {
      return this.a;
   }

   protected int a(int $$0) {
      return this.V_() ? $$0 : b($$0);
   }

   protected static int b(int $$0) {
      return ayz.e($$0, 2);
   }

   protected static ard a(bum $$0) {
      return (ard)$$0.dV();
   }

   protected static ard a(dgj $$0) {
      return (ard)$$0;
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
