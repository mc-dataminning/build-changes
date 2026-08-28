import java.util.EnumSet;

public abstract class cbt {
   private final EnumSet<cbt.a> a = EnumSet.noneOf(cbt.a.class);

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

   public void a(EnumSet<cbt.a> $$0) {
      this.a.clear();
      this.a.addAll($$0);
   }

   @Override
   public String toString() {
      return this.getClass().getSimpleName();
   }

   public EnumSet<cbt.a> j() {
      return this.a;
   }

   protected int a(int $$0) {
      return this.V_() ? $$0 : b($$0);
   }

   protected static int b(int $$0) {
      return azj.e($$0, 2);
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
