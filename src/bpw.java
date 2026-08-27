import java.util.EnumSet;

public abstract class bpw {
   private final EnumSet<bpw.a> a = EnumSet.noneOf(bpw.a.class);

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

   public void a(EnumSet<bpw.a> $$0) {
      this.a.clear();
      this.a.addAll($$0);
   }

   @Override
   public String toString() {
      return this.getClass().getSimpleName();
   }

   public EnumSet<bpw.a> j() {
      return this.a;
   }

   protected int a(int $$0) {
      return this.K_() ? $$0 : b($$0);
   }

   protected static int b(int $$0) {
      return ars.e($$0, 2);
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
