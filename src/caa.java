import java.util.EnumSet;

public abstract class caa {
   private final EnumSet<caa.a> a = EnumSet.noneOf(caa.a.class);

   public abstract boolean a();

   public boolean b() {
      return this.a();
   }

   public boolean Q_() {
      return true;
   }

   public void c() {
   }

   public void d() {
   }

   public boolean R_() {
      return false;
   }

   public void e() {
   }

   public void a(EnumSet<caa.a> $$0) {
      this.a.clear();
      this.a.addAll($$0);
   }

   @Override
   public String toString() {
      return this.getClass().getSimpleName();
   }

   public EnumSet<caa.a> j() {
      return this.a;
   }

   protected int a(int $$0) {
      return this.R_() ? $$0 : b($$0);
   }

   protected static int b(int $$0) {
      return ayg.e($$0, 2);
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
