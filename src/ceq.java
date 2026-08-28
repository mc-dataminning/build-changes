import java.util.EnumSet;

public abstract class ceq {
   private final EnumSet<ceq.a> a = EnumSet.noneOf(ceq.a.class);

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

   public void a(EnumSet<ceq.a> $$0) {
      this.a.clear();
      this.a.addAll($$0);
   }

   @Override
   public String toString() {
      return this.getClass().getSimpleName();
   }

   public EnumSet<ceq.a> j() {
      return this.a;
   }

   protected int a(int $$0) {
      return this.V_() ? $$0 : b($$0);
   }

   protected static int b(int $$0) {
      return azo.e($$0, 2);
   }

   protected static ars a(bwt $$0) {
      return (ars)$$0.dV();
   }

   protected static ars a(djx $$0) {
      return (ars)$$0;
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
