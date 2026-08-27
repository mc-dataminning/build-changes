import java.util.EnumSet;

public abstract class bpu {
   private final EnumSet<bpu.a> a = EnumSet.noneOf(bpu.a.class);

   public abstract boolean a();

   public boolean b() {
      return this.a();
   }

   public boolean J_() {
      return true;
   }

   public void c() {
   }

   public void d() {
   }

   public boolean K_() {
      return false;
   }

   public void e() {
   }

   public void a(EnumSet<bpu.a> $$0) {
      this.a.clear();
      this.a.addAll($$0);
   }

   @Override
   public String toString() {
      return this.getClass().getSimpleName();
   }

   public EnumSet<bpu.a> j() {
      return this.a;
   }

   protected int a(int $$0) {
      return this.K_() ? $$0 : b($$0);
   }

   protected static int b(int $$0) {
      return arp.e($$0, 2);
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
