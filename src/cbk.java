import java.util.EnumSet;

public abstract class cbk {
   private final EnumSet<cbk.a> a = EnumSet.noneOf(cbk.a.class);

   public abstract boolean b();

   public boolean c() {
      return this.b();
   }

   public boolean T_() {
      return true;
   }

   public void d() {
   }

   public void e() {
   }

   public boolean U_() {
      return false;
   }

   public void a() {
   }

   public void a(EnumSet<cbk.a> $$0) {
      this.a.clear();
      this.a.addAll($$0);
   }

   @Override
   public String toString() {
      return this.getClass().getSimpleName();
   }

   public EnumSet<cbk.a> j() {
      return this.a;
   }

   protected int a(int $$0) {
      return this.U_() ? $$0 : b($$0);
   }

   protected static int b(int $$0) {
      return azf.e($$0, 2);
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
