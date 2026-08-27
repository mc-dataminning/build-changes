import java.util.EnumSet;

public abstract class bqh {
   private final EnumSet<bqh.a> a = EnumSet.noneOf(bqh.a.class);

   public abstract boolean a();

   public boolean b() {
      return this.a();
   }

   public boolean P_() {
      return true;
   }

   public void c() {
   }

   public void d() {
   }

   public boolean Q_() {
      return false;
   }

   public void e() {
   }

   public void a(EnumSet<bqh.a> $$0) {
      this.a.clear();
      this.a.addAll($$0);
   }

   @Override
   public String toString() {
      return this.getClass().getSimpleName();
   }

   public EnumSet<bqh.a> j() {
      return this.a;
   }

   protected int a(int $$0) {
      return this.Q_() ? $$0 : b($$0);
   }

   protected static int b(int $$0) {
      return asb.e($$0, 2);
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
