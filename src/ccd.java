import java.util.EnumSet;

public abstract class ccd {
   private final EnumSet<ccd.a> a = EnumSet.noneOf(ccd.a.class);

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

   public void a(EnumSet<ccd.a> $$0) {
      this.a.clear();
      this.a.addAll($$0);
   }

   @Override
   public String toString() {
      return this.getClass().getSimpleName();
   }

   public EnumSet<ccd.a> j() {
      return this.a;
   }

   protected int a(int $$0) {
      return this.V_() ? $$0 : b($$0);
   }

   protected static int b(int $$0) {
      return ayy.e($$0, 2);
   }

   protected static arc a(buj $$0) {
      return (arc)$$0.dW();
   }

   protected static arc a(dgg $$0) {
      return (arc)$$0;
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
