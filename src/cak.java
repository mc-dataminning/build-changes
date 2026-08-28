import java.util.EnumSet;

public abstract class cak {
   private final EnumSet<cak.a> a = EnumSet.noneOf(cak.a.class);

   public abstract boolean b();

   public boolean c() {
      return this.b();
   }

   public boolean Q_() {
      return true;
   }

   public void d() {
   }

   public void e() {
   }

   public boolean R_() {
      return false;
   }

   public void a() {
   }

   public void a(EnumSet<cak.a> $$0) {
      this.a.clear();
      this.a.addAll($$0);
   }

   @Override
   public String toString() {
      return this.getClass().getSimpleName();
   }

   public EnumSet<cak.a> j() {
      return this.a;
   }

   protected int a(int $$0) {
      return this.R_() ? $$0 : b($$0);
   }

   protected static int b(int $$0) {
      return ayn.e($$0, 2);
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
