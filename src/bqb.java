import java.util.EnumSet;

public abstract class bqb {
   private final EnumSet<bqb.a> a = EnumSet.noneOf(bqb.a.class);

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

   public void a(EnumSet<bqb.a> $$0) {
      this.a.clear();
      this.a.addAll($$0);
   }

   @Override
   public String toString() {
      return this.getClass().getSimpleName();
   }

   public EnumSet<bqb.a> j() {
      return this.a;
   }

   protected int a(int $$0) {
      return this.Q_() ? $$0 : b($$0);
   }

   protected static int b(int $$0) {
      return arx.e($$0, 2);
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
