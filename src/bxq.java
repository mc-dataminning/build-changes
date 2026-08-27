import java.util.EnumSet;

public abstract class bxq {
   private final EnumSet<bxq.a> a = EnumSet.noneOf(bxq.a.class);

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

   public void a(EnumSet<bxq.a> $$0) {
      this.a.clear();
      this.a.addAll($$0);
   }

   @Override
   public String toString() {
      return this.getClass().getSimpleName();
   }

   public EnumSet<bxq.a> j() {
      return this.a;
   }

   protected int a(int $$0) {
      return this.R_() ? $$0 : b($$0);
   }

   protected static int b(int $$0) {
      return axm.e($$0, 2);
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
