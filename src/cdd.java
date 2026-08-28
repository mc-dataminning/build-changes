import java.util.EnumSet;

public abstract class cdd {
   private final EnumSet<cdd.a> a = EnumSet.noneOf(cdd.a.class);

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

   public void a(EnumSet<cdd.a> $$0) {
      this.a.clear();
      this.a.addAll($$0);
   }

   @Override
   public String toString() {
      return this.getClass().getSimpleName();
   }

   public EnumSet<cdd.a> j() {
      return this.a;
   }

   protected int a(int $$0) {
      return this.V_() ? $$0 : b($$0);
   }

   protected static int b(int $$0) {
      return bae.e($$0, 2);
   }

   protected static ash a(bvj $$0) {
      return (ash)$$0.dW();
   }

   protected static ash a(dhh $$0) {
      return (ash)$$0;
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
