import java.util.EnumSet;

public abstract class ccv {
   private final EnumSet<ccv.a> a = EnumSet.noneOf(ccv.a.class);

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

   public void a(EnumSet<ccv.a> $$0) {
      this.a.clear();
      this.a.addAll($$0);
   }

   @Override
   public String toString() {
      return this.getClass().getSimpleName();
   }

   public EnumSet<ccv.a> j() {
      return this.a;
   }

   protected int a(int $$0) {
      return this.V_() ? $$0 : b($$0);
   }

   protected static int b(int $$0) {
      return azu.e($$0, 2);
   }

   protected static arx a(bvb $$0) {
      return (arx)$$0.dW();
   }

   protected static arx a(dgz $$0) {
      return (arx)$$0;
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
