import java.util.EnumSet;

public abstract class bsg {
   private final EnumSet<bsg.a> a = EnumSet.noneOf(bsg.a.class);

   public abstract boolean a();

   public boolean b() {
      return this.a();
   }

   public boolean S_() {
      return true;
   }

   public void c() {
   }

   public void d() {
   }

   public boolean T_() {
      return false;
   }

   public void e() {
   }

   public void a(EnumSet<bsg.a> $$0) {
      this.a.clear();
      this.a.addAll($$0);
   }

   @Override
   public String toString() {
      return this.getClass().getSimpleName();
   }

   public EnumSet<bsg.a> j() {
      return this.a;
   }

   protected int a(int $$0) {
      return this.T_() ? $$0 : b($$0);
   }

   protected static int b(int $$0) {
      return atq.e($$0, 2);
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
