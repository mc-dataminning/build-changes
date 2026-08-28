import java.util.EnumSet;

public abstract class cdv {
   private final EnumSet<cdv.a> a = EnumSet.noneOf(cdv.a.class);

   public abstract boolean b();

   public boolean c() {
      return this.b();
   }

   public boolean P_() {
      return true;
   }

   public void d() {
   }

   public void e() {
   }

   public boolean Q_() {
      return false;
   }

   public void a() {
   }

   public void a(EnumSet<cdv.a> $$0) {
      this.a.clear();
      this.a.addAll($$0);
   }

   @Override
   public String toString() {
      return this.getClass().getSimpleName();
   }

   public EnumSet<cdv.a> j() {
      return this.a;
   }

   protected int a(int $$0) {
      return this.Q_() ? $$0 : b($$0);
   }

   protected static int b(int $$0) {
      return azk.e($$0, 2);
   }

   protected static aro a(bwa $$0) {
      return (aro)$$0.dV();
   }

   protected static aro a(dip $$0) {
      return (aro)$$0;
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
