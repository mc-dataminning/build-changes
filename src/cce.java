import java.util.EnumSet;

public abstract class cce {
   private final EnumSet<cce.a> a = EnumSet.noneOf(cce.a.class);

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

   public void a(EnumSet<cce.a> $$0) {
      this.a.clear();
      this.a.addAll($$0);
   }

   @Override
   public String toString() {
      return this.getClass().getSimpleName();
   }

   public EnumSet<cce.a> j() {
      return this.a;
   }

   protected int a(int $$0) {
      return this.V_() ? $$0 : b($$0);
   }

   protected static int b(int $$0) {
      return ayz.e($$0, 2);
   }

   protected static arc a(buk $$0) {
      return (arc)$$0.dW();
   }

   protected static arc a(dgi $$0) {
      return (arc)$$0;
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
