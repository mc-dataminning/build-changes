import java.util.EnumSet;

public abstract class cfb {
   private final EnumSet<cfb.a> a = EnumSet.noneOf(cfb.a.class);

   public abstract boolean b();

   public boolean c() {
      return this.b();
   }

   public boolean V_() {
      return true;
   }

   public void d() {
   }

   public void e() {
   }

   public boolean W_() {
      return false;
   }

   public void a() {
   }

   public void a(EnumSet<cfb.a> $$0) {
      this.a.clear();
      this.a.addAll($$0);
   }

   @Override
   public String toString() {
      return this.getClass().getSimpleName();
   }

   public EnumSet<cfb.a> j() {
      return this.a;
   }

   protected int a(int $$0) {
      return this.W_() ? $$0 : b($$0);
   }

   protected static int b(int $$0) {
      return azz.e($$0, 2);
   }

   protected static asb a(bxe $$0) {
      return (asb)$$0.dV();
   }

   protected static asb a(dkj $$0) {
      return (asb)$$0;
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
