import java.util.EnumSet;

public abstract class btb {
   private final EnumSet<btb.a> a = EnumSet.noneOf(btb.a.class);

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

   public void a(EnumSet<btb.a> $$0) {
      this.a.clear();
      this.a.addAll($$0);
   }

   @Override
   public String toString() {
      return this.getClass().getSimpleName();
   }

   public EnumSet<btb.a> j() {
      return this.a;
   }

   protected int a(int $$0) {
      return this.T_() ? $$0 : b($$0);
   }

   protected static int b(int $$0) {
      return aui.e($$0, 2);
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
