import java.util.EnumSet;

public abstract class cdy {
   private final EnumSet<cdy.a> a = EnumSet.noneOf(cdy.a.class);

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

   public void a(EnumSet<cdy.a> $$0) {
      this.a.clear();
      this.a.addAll($$0);
   }

   @Override
   public String toString() {
      return this.getClass().getSimpleName();
   }

   public EnumSet<cdy.a> j() {
      return this.a;
   }

   protected int a(int $$0) {
      return this.Q_() ? $$0 : b($$0);
   }

   protected static int b(int $$0) {
      return azm.e($$0, 2);
   }

   protected static arq a(bwd $$0) {
      return (arq)$$0.dV();
   }

   protected static arq a(div $$0) {
      return (arq)$$0;
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
