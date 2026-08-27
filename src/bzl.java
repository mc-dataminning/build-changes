import java.util.EnumSet;

public abstract class bzl {
   private final EnumSet<bzl.a> a = EnumSet.noneOf(bzl.a.class);

   public abstract boolean a();

   public boolean b() {
      return this.a();
   }

   public boolean R_() {
      return true;
   }

   public void c() {
   }

   public void d() {
   }

   public boolean S_() {
      return false;
   }

   public void e() {
   }

   public void a(EnumSet<bzl.a> $$0) {
      this.a.clear();
      this.a.addAll($$0);
   }

   @Override
   public String toString() {
      return this.getClass().getSimpleName();
   }

   public EnumSet<bzl.a> j() {
      return this.a;
   }

   protected int a(int $$0) {
      return this.S_() ? $$0 : b($$0);
   }

   protected static int b(int $$0) {
      return aym.e($$0, 2);
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
