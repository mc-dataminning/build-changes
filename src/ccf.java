import java.util.EnumSet;

public abstract class ccf {
   private final EnumSet<ccf.a> a = EnumSet.noneOf(ccf.a.class);

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

   public void a(EnumSet<ccf.a> $$0) {
      this.a.clear();
      this.a.addAll($$0);
   }

   @Override
   public String toString() {
      return this.getClass().getSimpleName();
   }

   public EnumSet<ccf.a> j() {
      return this.a;
   }

   protected int a(int $$0) {
      return this.T_() ? $$0 : b($$0);
   }

   protected static int b(int $$0) {
      return azm.e($$0, 2);
   }

   protected static arp a(bul $$0) {
      return (arp)$$0.dV();
   }

   protected static arp a(dfm $$0) {
      return (arp)$$0;
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
