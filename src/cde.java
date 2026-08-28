import java.util.EnumSet;

public abstract class cde {
   private final EnumSet<cde.a> a = EnumSet.noneOf(cde.a.class);

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

   public void a(EnumSet<cde.a> $$0) {
      this.a.clear();
      this.a.addAll($$0);
   }

   @Override
   public String toString() {
      return this.getClass().getSimpleName();
   }

   public EnumSet<cde.a> j() {
      return this.a;
   }

   protected int a(int $$0) {
      return this.V_() ? $$0 : b($$0);
   }

   protected static int b(int $$0) {
      return bae.e($$0, 2);
   }

   protected static ash a(bvk $$0) {
      return (ash)$$0.dW();
   }

   protected static ash a(dhi $$0) {
      return (ash)$$0;
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
