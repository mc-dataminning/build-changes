import java.util.EnumSet;

public abstract class cbc {
   private final EnumSet<cbc.a> a = EnumSet.noneOf(cbc.a.class);

   public abstract boolean b();

   public boolean c() {
      return this.b();
   }

   public boolean S_() {
      return true;
   }

   public void d() {
   }

   public void e() {
   }

   public boolean T_() {
      return false;
   }

   public void a() {
   }

   public void a(EnumSet<cbc.a> $$0) {
      this.a.clear();
      this.a.addAll($$0);
   }

   @Override
   public String toString() {
      return this.getClass().getSimpleName();
   }

   public EnumSet<cbc.a> j() {
      return this.a;
   }

   protected int a(int $$0) {
      return this.T_() ? $$0 : b($$0);
   }

   protected static int b(int $$0) {
      return azc.e($$0, 2);
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
